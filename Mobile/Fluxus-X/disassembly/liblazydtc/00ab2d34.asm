; FUN_00ab2d34 @ 00ab2d34
00ab2d34	str x25,[sp, #-0x50]!
00ab2d38	stp x24,x23,[sp, #0x10]
00ab2d3c	stp x22,x21,[sp, #0x20]
00ab2d40	stp x20,x19,[sp, #0x30]
00ab2d44	stp x29,x30,[sp, #0x40]
00ab2d48	add x29,sp,#0x40
00ab2d4c	mov x20,x5
00ab2d50	mov x23,x4
00ab2d54	mov x24,x3
00ab2d58	mov x25,x2
00ab2d5c	mov w22,w1
00ab2d60	mov x21,x0
00ab2d64	bl 0x00c3f0b0
00ab2d68	mov x19,x0
00ab2d6c	cbz x0,0x00ab2e0c
00ab2d70	mov x0,x19
00ab2d74	mov x1,x25
00ab2d78	mov x2,x21
00ab2d7c	mov x3,x23
00ab2d80	bl 0x00c34fc0
00ab2d84	cbz w0,0x00ab2e38
00ab2d88	mov x0,x19
00ab2d8c	bl 0x00c34f90
00ab2d90	cbz x0,0x00ab2e68
00ab2d94	mov x23,x0
00ab2d98	tbz w24,#0xc,0x00ab2da8
00ab2d9c	mov w1,#0x80000
00ab2da0	mov x0,x23
00ab2da4	bl 0x00c3f0f0
00ab2da8	cbz w22,0x00ab2dcc
00ab2dac	mov w1,#0x171
00ab2db0	mov w2,#0xffffffff
00ab2db4	mov x0,x21
00ab2db8	bl 0x00c39970
00ab2dbc	tbnz w0,#0x1f,0x00ab2dcc
00ab2dc0	mov w1,#0x4
00ab2dc4	mov x0,x23
00ab2dc8	bl 0x00c3f0e0
00ab2dcc	mov w1,#0x8
00ab2dd0	mov x0,x19
00ab2dd4	bl 0x00c3f0c0
00ab2dd8	orr w1,wzr,#0x7
00ab2ddc	mov x0,x19
00ab2de0	bl 0x00c3f0d0
00ab2de4	mov x0,x19
00ab2de8	bl 0x00c350c0
00ab2dec	mov w21,w0
00ab2df0	cmp w0,#0x0
00ab2df4	b.le 0x00ab2e90
00ab2df8	cbz x20,0x00ab2e6c
00ab2dfc	mov x0,x19
00ab2e00	bl 0x00c34fa0
00ab2e04	str x0,[x20]
00ab2e08	b 0x00ab2e6c
00ab2e0c	bl 0x00c342a0
00ab2e10	adrp x0,0x2d2000
00ab2e14	adrp x2,0x2c8000
00ab2e18	add x0,x0,#0x1db
00ab2e1c	add x2,x2,#0x58
00ab2e20	mov w1,#0x27
00ab2e24	bl 0x00c342b0
00ab2e28	mov w1,#0x100
00ab2e2c	mov w0,#0x27
00ab2e30	movk w1,#0xc, LSL #16
00ab2e34	b 0x00ab2e60
00ab2e38	bl 0x00c342a0
00ab2e3c	adrp x0,0x2d2000
00ab2e40	adrp x2,0x2c8000
00ab2e44	add x0,x0,#0x1db
00ab2e48	add x2,x2,#0x58
00ab2e4c	mov w1,#0x2b
00ab2e50	bl 0x00c342b0
00ab2e54	mov w1,#0xb
00ab2e58	mov w0,#0x27
00ab2e5c	movk w1,#0x8, LSL #16
00ab2e60	mov x2,xzr
00ab2e64	bl 0x00c342c0
00ab2e68	mov w21,#0xffffffff
00ab2e6c	mov x0,x19
00ab2e70	bl 0x00c34f70
00ab2e74	mov w0,w21
00ab2e78	ldp x29,x30,[sp, #0x40]
00ab2e7c	ldp x20,x19,[sp, #0x30]
00ab2e80	ldp x22,x21,[sp, #0x20]
00ab2e84	ldp x24,x23,[sp, #0x10]
00ab2e88	ldr x25,[sp], #0x50
00ab2e8c	ret
00ab2e90	mov x0,x19
00ab2e94	bl 0x00c34fb0
00ab2e98	mov w20,w0
00ab2e9c	bl 0x00c342a0
00ab2ea0	adrp x0,0x2d2000
00ab2ea4	adrp x2,0x2c8000
00ab2ea8	add x0,x0,#0x1db
00ab2eac	add x2,x2,#0x58
00ab2eb0	mov w1,#0x40
00ab2eb4	bl 0x00c342b0
00ab2eb8	sxtw x0,w20
00ab2ebc	bl 0x00c32d50
00ab2ec0	adrp x2,0x2d4000
00ab2ec4	mov x3,x0
00ab2ec8	add x2,x2,#0x279
00ab2ecc	mov w0,#0x27
00ab2ed0	mov w1,#0x65
00ab2ed4	bl 0x00c342c0
00ab2ed8	b 0x00ab2e6c
