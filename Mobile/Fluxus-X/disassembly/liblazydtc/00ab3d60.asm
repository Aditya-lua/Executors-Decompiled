; PEM_X509_INFO_read_ex @ 00ab3d60
00ab3d60	str x25,[sp, #-0x50]!
00ab3d64	stp x24,x23,[sp, #0x10]
00ab3d68	stp x22,x21,[sp, #0x20]
00ab3d6c	stp x20,x19,[sp, #0x30]
00ab3d70	stp x29,x30,[sp, #0x40]
00ab3d74	add x29,sp,#0x40
00ab3d78	mov x19,x5
00ab3d7c	mov x20,x4
00ab3d80	mov x21,x3
00ab3d84	mov x22,x2
00ab3d88	mov x23,x1
00ab3d8c	mov x25,x0
00ab3d90	bl 0x00c32270
00ab3d94	bl 0x00c32240
00ab3d98	cbz x0,0x00ab3de0
00ab3d9c	mov w1,#0x6a
00ab3da0	mov x2,xzr
00ab3da4	mov x3,x25
00ab3da8	mov x24,x0
00ab3dac	bl 0x00c321a0
00ab3db0	mov x0,x24
00ab3db4	mov x1,x23
00ab3db8	mov x2,x22
00ab3dbc	mov x3,x21
00ab3dc0	mov x4,x20
00ab3dc4	mov x5,x19
00ab3dc8	bl 0x00ab3e2c
00ab3dcc	mov x19,x0
00ab3dd0	mov x0,x24
00ab3dd4	bl 0x00c31a40
00ab3dd8	mov x0,x19
00ab3ddc	b 0x00ab3e14
00ab3de0	bl 0x00c342a0
00ab3de4	adrp x0,0x2c6000
00ab3de8	adrp x2,0x2d4000
00ab3dec	add x0,x0,#0xa6
00ab3df0	add x2,x2,#0x2ae
00ab3df4	mov w1,#0x24
00ab3df8	bl 0x00c342b0
00ab3dfc	mov w1,#0x7
00ab3e00	mov w0,#0x9
00ab3e04	movk w1,#0x8, LSL #16
00ab3e08	mov x2,xzr
00ab3e0c	bl 0x00c342c0
00ab3e10	mov x0,xzr
00ab3e14	ldp x29,x30,[sp, #0x40]
00ab3e18	ldp x20,x19,[sp, #0x30]
00ab3e1c	ldp x22,x21,[sp, #0x20]
00ab3e20	ldp x24,x23,[sp, #0x10]
00ab3e24	ldr x25,[sp], #0x50
00ab3e28	ret
