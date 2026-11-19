; FUN_009d19b0 @ 009d19b0
009d19b0	stp x20,x19,[sp, #-0x20]!
009d19b4	stp x29,x30,[sp, #0x10]
009d19b8	mov x19,x0
009d19bc	ldr x0,[x0, #0x488]
009d19c0	adrp x1,0x2c1000
009d19c4	add x1,x1,#0x800
009d19c8	mov w2,#0x455
009d19cc	add x29,sp,#0x10
009d19d0	add x20,x19,#0x488
009d19d4	bl 0x00c32310
009d19d8	movi v0.2D,#0x0
009d19dc	str q0,[x20]
009d19e0	ldr w8,[x19, #0x38]
009d19e4	cbz w8,0x009d1a08
009d19e8	ldr x0,[x19, #0x498]
009d19ec	adrp x1,0x2c1000
009d19f0	add x1,x1,#0x800
009d19f4	mov w2,#0x459
009d19f8	add x19,x19,#0x498
009d19fc	bl 0x00c32310
009d1a00	movi v0.2D,#0x0
009d1a04	str q0,[x19]
009d1a08	ldp x29,x30,[sp, #0x10]
009d1a0c	mov w0,#0x1
009d1a10	ldp x20,x19,[sp], #0x20
009d1a14	ret
