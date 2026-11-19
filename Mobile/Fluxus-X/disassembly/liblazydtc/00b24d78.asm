; FUN_00b24d78 @ 00b24d78
00b24d78	stp x20,x19,[sp, #-0x20]!
00b24d7c	stp x29,x30,[sp, #0x10]
00b24d80	add x29,sp,#0x10
00b24d84	mov x20,x0
00b24d88	bl 0x00c41000
00b24d8c	cbz w0,0x00b24de8
00b24d90	adrp x1,0x2b6000
00b24d94	add x1,x1,#0x842
00b24d98	mov w0,#0x3b0
00b24d9c	mov w2,#0x156
00b24da0	bl 0x00c32320
00b24da4	mov x19,x0
00b24da8	cbz x0,0x00b24df0
00b24dac	mov w2,#0x3b0
00b24db0	mov x0,x19
00b24db4	mov x1,x20
00b24db8	bl 0x00c2ffd0
00b24dbc	add x0,x19,#0x2b0
00b24dc0	add x1,x20,#0x2b0
00b24dc4	add x2,x19,#0xc0
00b24dc8	add x3,x19,#0x1b8
00b24dcc	bl 0x00c3e3e0
00b24dd0	cbnz w0,0x00b24e20
00b24dd4	adrp x1,0x2b6000
00b24dd8	add x1,x1,#0x842
00b24ddc	mov w2,#0x15d
00b24de0	mov x0,x19
00b24de4	bl 0x00c32310
00b24de8	mov x19,xzr
00b24dec	b 0x00b24e20
00b24df0	bl 0x00c342a0
00b24df4	adrp x0,0x2b6000
00b24df8	adrp x2,0x2b2000
00b24dfc	add x0,x0,#0x842
00b24e00	add x2,x2,#0xefb
00b24e04	mov w1,#0x158
00b24e08	bl 0x00c342b0
00b24e0c	mov w1,#0x100
00b24e10	mov w0,#0x39
00b24e14	movk w1,#0xc, LSL #16
00b24e18	mov x2,xzr
00b24e1c	bl 0x00c342c0
00b24e20	ldp x29,x30,[sp, #0x10]
00b24e24	mov x0,x19
00b24e28	ldp x20,x19,[sp], #0x20
00b24e2c	ret
