; FUN_0089be2c @ 0089be2c
0089be2c	stp x29,x30,[sp, #-0x20]!
0089be30	str x19,[sp, #0x10]
0089be34	mov x29,sp
0089be38	mov x19,x0
0089be3c	ldr x0,[x0, #0x10]
0089be40	adrp x8,0xc4b000
0089be44	add x8,x8,#0xbd8
0089be48	str x8,[x19]
0089be4c	cbz x0,0x0089be7c
0089be50	bl 0x00c301d0
0089be54	ldr x0,[x19, #0x28]
0089be58	str xzr,[x19, #0x10]
0089be5c	bl 0x00c301d0
0089be60	mov x0,xzr
0089be64	stp xzr,xzr,[x19, #0x18]
0089be68	str xzr,[x19, #0x28]
0089be6c	bl 0x00c301d0
0089be70	mov w8,#0x40
0089be74	str xzr,[x19, #0x30]
0089be78	strb w8,[x19, #0x40]
0089be7c	ldr x0,[x19, #0x28]
0089be80	ldr x19,[sp, #0x10]
0089be84	ldp x29,x30,[sp], #0x20
0089be88	b 0x00c301d0
