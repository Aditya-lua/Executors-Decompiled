; ix::SocketTLSOptions::isPeerVerifyDisabled @ 009a5c28
009a5c28	stp x20,x19,[sp, #-0x20]!
009a5c2c	stp x29,x30,[sp, #0x10]
009a5c30	add x29,sp,#0x10
009a5c34	adrp x8,0xcb5000
009a5c38	ldr x8,[x8, #0x10]
009a5c3c	mov x20,x0
009a5c40	ldr x19,[x8]
009a5c44	mov x0,x19
009a5c48	bl 0x00c2ff50
009a5c4c	mov x2,x0
009a5c50	mov x0,x20
009a5c54	ldrb w9,[x0, #0x30]!
009a5c58	ldr x8,[x0, #0x8]
009a5c5c	lsr w10,w9,#0x1
009a5c60	tst w9,#0x1
009a5c64	csel x8,x10,x8,eq
009a5c68	cmp x2,x8
009a5c6c	mov w8,wzr
009a5c70	b.ne 0x009a5ca4
009a5c74	cbz x2,0x009a5c98
009a5c78	cmn x2,#0x1
009a5c7c	b.eq 0x009a5cb4
009a5c80	ldr x8,[x20, #0x40]
009a5c84	tst w9,#0x1
009a5c88	mov x1,x19
009a5c8c	csinc x0,x8,x0,ne
009a5c90	bl 0x00c300b0
009a5c94	cbnz w0,0x009a5c9c
009a5c98	mov w0,wzr
009a5c9c	cmp w0,#0x0
009a5ca0	cset w8,eq
009a5ca4	ldp x29,x30,[sp, #0x10]
009a5ca8	mov w0,w8
009a5cac	ldp x20,x19,[sp], #0x20
009a5cb0	ret
009a5cb4	bl 0x00c31420
009a5cb8	bl 0x007fe114
