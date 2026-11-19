; SSL_set_wfd @ 009b3d40
009b3d40	str x21,[sp, #-0x30]!
009b3d44	stp x20,x19,[sp, #0x10]
009b3d48	stp x29,x30,[sp, #0x20]
009b3d4c	ldr x20,[x0, #0x10]
009b3d50	mov x19,x0
009b3d54	mov w21,w1
009b3d58	add x29,sp,#0x20
009b3d5c	cbz x20,0x009b3da0
009b3d60	mov x0,x20
009b3d64	bl 0x00c35610
009b3d68	cmp w0,#0x505
009b3d6c	b.ne 0x009b3da0
009b3d70	mov w1,#0x69
009b3d74	mov x0,x20
009b3d78	mov x2,xzr
009b3d7c	mov x3,xzr
009b3d80	bl 0x00c321a0
009b3d84	cmp w0,w21
009b3d88	b.ne 0x009b3da0
009b3d8c	mov x0,x20
009b3d90	bl 0x00c322d0
009b3d94	ldp x0,x8,[x19, #0x18]
009b3d98	cbnz x8,0x009b3dc8
009b3d9c	b 0x009b3dd0
009b3da0	bl 0x00c35650
009b3da4	bl 0x00c32240
009b3da8	cbz x0,0x009b3df4
009b3dac	mov w1,#0x68
009b3db0	mov x2,xzr
009b3db4	mov w3,w21
009b3db8	mov x20,x0
009b3dbc	bl 0x00c35600
009b3dc0	ldp x0,x8,[x19, #0x18]
009b3dc4	cbz x8,0x009b3dd0
009b3dc8	bl 0x00c35630
009b3dcc	str x0,[x19, #0x18]
009b3dd0	bl 0x00c355e0
009b3dd4	ldr x0,[x19, #0x20]
009b3dd8	str x20,[x19, #0x18]
009b3ddc	cbz x0,0x009b3dec
009b3de0	mov x1,x20
009b3de4	bl 0x00c35640
009b3de8	str x0,[x19, #0x18]
009b3dec	mov w0,#0x1
009b3df0	b 0x009b3e28
009b3df4	bl 0x00c342a0
009b3df8	adrp x0,0x2c5000
009b3dfc	adrp x2,0x2d1000
009b3e00	add x0,x0,#0x652
009b3e04	add x2,x2,#0x555
009b3e08	mov w1,#0x598
009b3e0c	bl 0x00c342b0
009b3e10	mov w1,#0x7
009b3e14	mov w0,#0x14
009b3e18	movk w1,#0x8, LSL #16
009b3e1c	mov x2,xzr
009b3e20	bl 0x00c342c0
009b3e24	mov w0,wzr
009b3e28	ldp x29,x30,[sp, #0x20]
009b3e2c	ldp x20,x19,[sp, #0x10]
009b3e30	ldr x21,[sp], #0x30
009b3e34	ret
