; FUN_00b34d84 @ 00b34d84
00b34d84	sub sp,sp,#0x40
00b34d88	stp x20,x19,[sp, #0x20]
00b34d8c	stp x29,x30,[sp, #0x30]
00b34d90	ldr x8,[x0]
00b34d94	str x21,[sp, #0x10]
00b34d98	mov x19,x3
00b34d9c	mov x21,x2
00b34da0	add x0,sp,#0x18
00b34da4	add x2,sp,#0x8
00b34da8	add x3,sp,#0xc
00b34dac	mov x4,x21
00b34db0	mov x5,x19
00b34db4	add x29,sp,#0x30
00b34db8	mov w20,w1
00b34dbc	str x8,[sp, #0x18]
00b34dc0	bl 0x00b34a28
00b34dc4	cmp w0,#0x0
00b34dc8	b.le 0x00b34e24
00b34dcc	ldr w1,[sp, #0xc]
00b34dd0	ldr w8,[x21]
00b34dd4	ldr w2,[x19]
00b34dd8	sub w9,w20,#0x10
00b34ddc	add w10,w1,#0x7
00b34de0	lsr w10,w10,#0x3
00b34de4	cbz w8,0x00b34e4c
00b34de8	cbz w2,0x00b34e80
00b34dec	add w10,w10,w10, LSL #0x1
00b34df0	add w10,w10,#0x2c
00b34df4	cmp w9,w10
00b34df8	b.cs 0x00b34e6c
00b34dfc	bl 0x00c342a0
00b34e00	adrp x0,0x29e000
00b34e04	adrp x2,0x29e000
00b34e08	add x0,x0,#0xe1c
00b34e0c	add x2,x2,#0xe30
00b34e10	mov w1,#0x127
00b34e14	bl 0x00c342b0
00b34e18	mov w0,#0x9
00b34e1c	mov w1,#0x7b
00b34e20	b 0x00b34ec4
00b34e24	bl 0x00c342a0
00b34e28	adrp x0,0x29e000
00b34e2c	adrp x2,0x29e000
00b34e30	add x0,x0,#0xe1c
00b34e34	add x2,x2,#0xe30
00b34e38	mov w1,#0x122
00b34e3c	bl 0x00c342b0
00b34e40	mov w0,#0x9
00b34e44	mov w1,#0x7a
00b34e48	b 0x00b34ec4
00b34e4c	cbnz w2,0x00b34e60
00b34e50	add w11,w1,#0xf
00b34e54	lsr w11,w11,#0x4
00b34e58	add w11,w11,w11, LSL #0x2
00b34e5c	add w10,w11,w10, LSL #0x1
00b34e60	add w10,w10,#0x4
00b34e64	cmp w9,w10
00b34e68	b.cc 0x00b34dfc
00b34e6c	cbz w8,0x00b34e94
00b34e70	add x0,sp,#0x18
00b34e74	bl 0x00b35554
00b34e78	cbnz x0,0x00b34ed0
00b34e7c	b 0x00b34ea0
00b34e80	lsl w10,w10,#0x1
00b34e84	add w10,w10,#0x40
00b34e88	cmp w9,w10
00b34e8c	b.cc 0x00b34dfc
00b34e90	b 0x00b34e6c
00b34e94	add x0,sp,#0x18
00b34e98	bl 0x00b35270
00b34e9c	cbnz x0,0x00b34ed0
00b34ea0	bl 0x00c342a0
00b34ea4	adrp x0,0x29e000
00b34ea8	adrp x2,0x29e000
00b34eac	add x0,x0,#0xe1c
00b34eb0	add x2,x2,#0xe30
00b34eb4	mov w1,#0x132
00b34eb8	bl 0x00c342b0
00b34ebc	mov w0,#0x9
00b34ec0	mov w1,#0x6e
00b34ec4	mov x2,xzr
00b34ec8	bl 0x00c342c0
00b34ecc	mov x0,xzr
00b34ed0	ldp x29,x30,[sp, #0x30]
00b34ed4	ldp x20,x19,[sp, #0x20]
00b34ed8	ldr x21,[sp, #0x10]
00b34edc	add sp,sp,#0x40
00b34ee0	ret
