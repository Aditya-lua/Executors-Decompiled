; ZSTD_initStaticDDict @ 00bb3cf4
00bb3cf4	tst x0,#0x7
00bb3cf8	b.ne 0x00bb3d14
00bb3cfc	mov w8,#0x6ad8
00bb3d00	cmp w4,#0x1
00bb3d04	add x9,x3,x8
00bb3d08	csel x8,x8,x9,eq
00bb3d0c	cmp x1,x8
00bb3d10	b.cs 0x00bb3d1c
00bb3d14	mov x0,xzr
00bb3d18	ret
00bb3d1c	stp x29,x30,[sp, #-0x40]!
00bb3d20	str x23,[sp, #0x10]
00bb3d24	stp x22,x21,[sp, #0x20]
00bb3d28	stp x20,x19,[sp, #0x30]
00bb3d2c	mov x29,sp
00bb3d30	add x20,x0,#0x6, LSL #12
00bb3d34	cbnz w4,0x00bb3d68
00bb3d38	add x19,x20,#0xad8
00bb3d3c	mov x21,x0
00bb3d40	mov x1,x2
00bb3d44	mov x0,x19
00bb3d48	mov x2,x3
00bb3d4c	mov x22,x3
00bb3d50	mov w23,w5
00bb3d54	bl 0x00c2ffd0
00bb3d58	mov w5,w23
00bb3d5c	mov x3,x22
00bb3d60	mov x0,x21
00bb3d64	mov x2,x19
00bb3d68	movi v0.2D,#0x0
00bb3d6c	mov w8,#0xc
00bb3d70	cmp x2,#0x0
00bb3d74	movk w8,#0xc00, LSL #16
00bb3d78	csel x9,xzr,x3,eq
00bb3d7c	cmp w5,#0x1
00bb3d80	str w8,[x0, #0x2830]
00bb3d84	add x8,x20,#0xab4
00bb3d88	stp xzr,x2,[x0]
00bb3d8c	str x9,[x0, #0x10]
00bb3d90	str d0,[x8]
00bb3d94	b.eq 0x00bb3df4
00bb3d98	cmp x9,#0x7
00bb3d9c	b.ls 0x00bb3de8
00bb3da0	ldr w9,[x2]
00bb3da4	mov w10,#0xa437
00bb3da8	movk w10,#0xec30, LSL #16
00bb3dac	cmp w9,w10
00bb3db0	b.ne 0x00bb3de8
00bb3db4	ldr w9,[x2, #0x4]
00bb3db8	mov x19,x0
00bb3dbc	add x0,x0,#0x18
00bb3dc0	mov x1,x2
00bb3dc4	mov x2,x3
00bb3dc8	str w9,[x8]
00bb3dcc	bl 0x00c436d0
00bb3dd0	cmn x0,#0x78
00bb3dd4	b.hi 0x00bb3df0
00bb3dd8	mov w8,#0x1
00bb3ddc	mov x0,x19
00bb3de0	str w8,[x20, #0xab8]
00bb3de4	b 0x00bb3df4
00bb3de8	cmp w5,#0x2
00bb3dec	b.ne 0x00bb3df4
00bb3df0	mov x0,xzr
00bb3df4	ldp x20,x19,[sp, #0x30]
00bb3df8	ldr x23,[sp, #0x10]
00bb3dfc	ldp x22,x21,[sp, #0x20]
00bb3e00	ldp x29,x30,[sp], #0x40
00bb3e04	ret
