; pqueue_new @ 009a7d54
009a7d54	str x19,[sp, #-0x20]!
009a7d58	adrp x1,0x2b1000
009a7d5c	add x1,x1,#0xbdc
009a7d60	mov w0,#0x10
009a7d64	mov w2,#0x28
009a7d68	stp x29,x30,[sp, #0x10]
009a7d6c	add x29,sp,#0x10
009a7d70	bl 0x00c34250
009a7d74	mov x19,x0
009a7d78	cbnz x0,0x009a7dac
009a7d7c	bl 0x00c342a0
009a7d80	adrp x0,0x2b1000
009a7d84	adrp x2,0x29f000
009a7d88	add x0,x0,#0xbdc
009a7d8c	add x2,x2,#0xa83
009a7d90	mov w1,#0x2b
009a7d94	bl 0x00c342b0
009a7d98	mov w1,#0x100
009a7d9c	mov w0,#0x14
009a7da0	movk w1,#0xc, LSL #16
009a7da4	mov x2,xzr
009a7da8	bl 0x00c342c0
009a7dac	ldp x29,x30,[sp, #0x10]
009a7db0	mov x0,x19
009a7db4	ldr x19,[sp], #0x20
009a7db8	ret
