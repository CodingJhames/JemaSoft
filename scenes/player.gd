extends CharacterBody2D

var speed:int = 250
var direction = null
var direction_y = null

func _physics_process(delta):
	direction = Input.get_axis("ui_left","ui_right")
	direction_y = Input.get_axis("ui_up", "ui_down")
	velocity.x = direction * speed
	velocity.y = direction_y * speed
	velocity.normalized()
	move_and_slide()
