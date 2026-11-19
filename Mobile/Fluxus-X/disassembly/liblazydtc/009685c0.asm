; FUN_009685c0 @ 009685c0
009685c0	ldr x8,[x0]
009685c4	ldr x9,[x0, #0x18]
009685c8	mov w11,#0xa
009685cc	ldr w8,[x8, #0x8]
009685d0	add x10,x9,#0x320
009685d4	add x9,x9,#0x2a0
009685d8	bics wzr,w11,w8
009685dc	csel x0,x10,x9,eq
009685e0	ret
