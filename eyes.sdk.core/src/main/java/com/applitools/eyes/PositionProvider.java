package com.applitools.eyes;

/**
 * Encapsulates page/element positioning.
 */
public interface PositionProvider {
    /**
     *
     * @return The current position, or {@code null} if position is not
     * available.
     */
    Location getCurrentPosition();

    /**
     * Go to the specified location.
     * @param location The position to set.
     */
    void setPosition(Location location);

    /**
     *
     * @return The entire size of the container which the position is relative
     * to.
     */
    RectangleSize getEntireSize();

    /**
     * Get the current state of the position provider. This is different from
     * {@link #getCurrentPosition()} in that the state of the position provider
     * might include other data than just the coordinates. For example a CSS
     * translation based position provider (in WebDriver based SDKs), might
     * save the entire "transform" style value as its state.
     *
     * @return The current state of the position provider, which can later be
     * restored by  passing it as a parameter to {@link #restoreState}.
     */
    PositionMemento getState();

    /**
     * Restores the state of the position provider to the state provided as a
     * parameter.
     *
     * @param state The state to restore to.
     */
    void restoreState(PositionMemento state);
}
