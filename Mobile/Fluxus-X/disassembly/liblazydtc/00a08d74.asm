; BN_mod_add @ 00a08d74
00a08d74	str x21,[sp, #-0x30]!
00a08d78	stp x20,x19,[sp, #0x10]
00a08d7c	stp x29,x30,[sp, #0x20]
00a08d80	add x29,sp,#0x20
00a08d84	mov x21,x4
00a08d88	mov x19,x3
00a08d8c	mov x20,x0
00a08d90	bl 0x00c38870
00a08d94	cbz w0,0x00a08e38
00a08d98	cmp x20,x19
00a08d9c	b.eq 0x00a08dfc
00a08da0	mov x0,xzr
00a08da4	mov x1,x20
00a08da8	mov x2,x20
00a08dac	mov x3,x19
00a08db0	mov x4,x21
00a08db4	bl 0x00c38ab0
00a08db8	cbz w0,0x00a08e38
00a08dbc	ldr w8,[x20, #0x10]
00a08dc0	cbz w8,0x00a08e34
00a08dc4	ldr w8,[x19, #0x10]
00a08dc8	adrp x9,0xcb5000
00a08dcc	adrp x10,0xcb5000
00a08dd0	ldr x9,[x9, #0x3d0]
00a08dd4	ldr x10,[x10, #0x3c8]
00a08dd8	mov x0,x20
00a08ddc	mov x1,x20
00a08de0	mov x2,x19
00a08de4	ldp x29,x30,[sp, #0x20]
00a08de8	ldp x20,x19,[sp, #0x10]
00a08dec	cmp w8,#0x0
00a08df0	csel x3,x10,x9,eq
00a08df4	ldr x21,[sp], #0x30
00a08df8	br x3
00a08dfc	bl 0x00c342a0
00a08e00	adrp x0,0x2b4000
00a08e04	adrp x2,0x2d1000
00a08e08	add x0,x0,#0x47
00a08e0c	add x2,x2,#0x736
00a08e10	mov w1,#0x15
00a08e14	bl 0x00c342b0
00a08e18	mov w1,#0x106
00a08e1c	orr w0,wzr,#0x3
00a08e20	movk w1,#0x8, LSL #16
00a08e24	mov x2,xzr
00a08e28	bl 0x00c342c0
00a08e2c	mov w0,wzr
00a08e30	b 0x00a08e38
00a08e34	mov w0,#0x1
00a08e38	ldp x29,x30,[sp, #0x20]
00a08e3c	ldp x20,x19,[sp, #0x10]
00a08e40	ldr x21,[sp], #0x30
00a08e44	ret
