; FUN_00851e28 @ 00851e28
00851e28	adrp x8,0xd1e000
00851e2c	movi v0.2D,#0x0
00851e30	stp xzr,xzr,[x0, #0x8]
00851e34	ldr w8,[x8, #0x990]
00851e38	stp xzr,xzr,[x0, #0x28]
00851e3c	str w8,[x0]
00851e40	mov x8,#-0x1
00851e44	stp x8,x8,[x0, #0x18]
00851e48	str x8,[x0, #0x38]
00851e4c	stp q0,q0,[x0, #0x40]
00851e50	stp x8,x8,[x0, #0x60]
00851e54	ret
