package racingcar.domain

import racingcar.domain.move.MovingStrategy
import racingcar.vo.Position

class Car(position: Position = Position()) {
    var position: Position = position
        private set

    fun move(movingStrategy: MovingStrategy) {
        position = if (movingStrategy.canMove()) position.move() else position
    }
}
