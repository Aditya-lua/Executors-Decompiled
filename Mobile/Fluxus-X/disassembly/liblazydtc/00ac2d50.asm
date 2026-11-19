; PKCS7_add_crl @ 00ac2d50
00ac2d50	stp x20,x19,[sp, #-0x20]!
00ac2d54	stp x29,x30,[sp, #0x10]
00ac2d58	mov x20,x0
00ac2d5c	ldr x0,[x0, #0x18]
00ac2d60	add x29,sp,#0x10
00ac2d64	mov x19,x1
00ac2d68	bl 0x00c37750
00ac2d6c	cmp w0,#0x18
00ac2d70	b.eq 0x00ac2d7c
00ac2d74	cmp w0,#0x16
00ac2d78	b.ne 0x00ac2db8
00ac2d7c	ldr x8,[x20, #0x20]
00ac2d80	add x20,x8,#0x18
00ac2d84	ldr x8,[x20]
00ac2d88	cbnz x8,0x00ac2d98
00ac2d8c	bl 0x00c34780
00ac2d90	str x0,[x20]
00ac2d94	cbz x0,0x00ac2dec
00ac2d98	mov x0,x19
00ac2d9c	bl 0x00c3f810
00ac2da0	ldr x0,[x20]
00ac2da4	mov x1,x19
00ac2da8	bl 0x00c347a0
00ac2dac	cbz w0,0x00ac2de0
00ac2db0	mov w0,#0x1
00ac2db4	b 0x00ac2e20
00ac2db8	bl 0x00c342a0
00ac2dbc	adrp x0,0x2ce000
00ac2dc0	adrp x2,0x2dc000
00ac2dc4	add x0,x0,#0x1ca
00ac2dc8	add x2,x2,#0x87b
00ac2dcc	mov w1,#0x11e
00ac2dd0	bl 0x00c342b0
00ac2dd4	mov w0,#0x21
00ac2dd8	mov w1,#0x71
00ac2ddc	b 0x00ac2e14
00ac2de0	mov x0,x19
00ac2de4	bl 0x00c382b0
00ac2de8	b 0x00ac2e1c
00ac2dec	bl 0x00c342a0
00ac2df0	adrp x0,0x2ce000
00ac2df4	adrp x2,0x2dc000
00ac2df8	add x0,x0,#0x1ca
00ac2dfc	add x2,x2,#0x87b
00ac2e00	mov w1,#0x125
00ac2e04	bl 0x00c342b0
00ac2e08	mov w1,#0x100
00ac2e0c	mov w0,#0x21
00ac2e10	movk w1,#0xc, LSL #16
00ac2e14	mov x2,xzr
00ac2e18	bl 0x00c342c0
00ac2e1c	mov w0,wzr
00ac2e20	ldp x29,x30,[sp, #0x10]
00ac2e24	ldp x20,x19,[sp], #0x20
00ac2e28	ret
