; FUN_008e430c @ 008e430c
008e430c	str x30,[sp, #-0x20]!
008e4310	stp x20,x19,[sp, #0x10]
008e4314	ldr x8,[x0]
008e4318	mov x19,x0
008e431c	mov w20,w1
008e4320	ldr x8,[x8, #0x20]
008e4324	blr x8
008e4328	ldr x8,[x19]
008e432c	add w1,w0,#0x4
008e4330	bl 0x008e43ac
008e4334	bl 0x008e439c
008e4338	str w20,[x0]
008e433c	ldr x8,[x19, #0x10]
008e4340	add x8,x8,#0x4
008e4344	str x8,[x19, #0x10]
008e4348	ldp x20,x19,[sp, #0x10]
008e434c	ldr x30,[sp], #0x20
008e4350	ret
