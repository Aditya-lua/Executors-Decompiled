; FUN_00b81c6c @ 00b81c6c
00b81c6c	sub sp,sp,#0xe0
00b81c70	stp x28,x27,[sp, #0x80]
00b81c74	stp x26,x25,[sp, #0x90]
00b81c78	stp x24,x23,[sp, #0xa0]
00b81c7c	stp x22,x21,[sp, #0xb0]
00b81c80	stp x20,x19,[sp, #0xc0]
00b81c84	stp x29,x30,[sp, #0xd0]
00b81c88	add x29,sp,#0xd0
00b81c8c	mrs x26,tpidr_el0
00b81c90	ldr x8,[x26, #0x28]
00b81c94	mov x22,x0
00b81c98	mov x19,x3
00b81c9c	mov x20,x2
00b81ca0	stur x8,[x29, #-0x58]
00b81ca4	mov w8,#0x1
00b81ca8	str w8,[sp, #0x58]
00b81cac	str w8,[sp, #0x48]
00b81cb0	str w8,[sp, #0x38]
00b81cb4	str w8,[sp, #0x28]
00b81cb8	str w8,[sp, #0x18]
00b81cbc	stur x8,[x29, #-0x60]
00b81cc0	orr w8,wzr,#0x10001
00b81cc4	mov x21,x1
00b81cc8	str w8,[sp, #0x68]
00b81ccc	sub x8,x29,#0x60
00b81cd0	add x0,sp,#0x50
00b81cd4	add x2,sp,#0x60
00b81cd8	mov w3,#0xffffffff
00b81cdc	mov x1,x22
00b81ce0	str xzr,[sp, #0x50]
00b81ce4	str xzr,[sp, #0x40]
00b81ce8	str xzr,[sp, #0x30]
00b81cec	str xzr,[sp, #0x20]
00b81cf0	str xzr,[sp, #0x10]
00b81cf4	str x8,[sp, #0x60]
00b81cf8	bl 0x00b7f304
00b81cfc	mov w24,w0
00b81d00	cbnz w0,0x00b81d58
00b81d04	ldrh w8,[sp, #0x5a]
00b81d08	cbz x8,0x00b81d30
00b81d0c	ldr x10,[sp, #0x50]
00b81d10	mov x9,xzr
00b81d14	mov x11,xzr
00b81d18	ldr x12,[x10, x11, LSL #0x3]
00b81d1c	cbnz x12,0x00b81d38
00b81d20	add x11,x11,#0x1
00b81d24	cmp x11,x8
00b81d28	add x9,x9,#0x40
00b81d2c	b.cc 0x00b81d18
00b81d30	mov x23,xzr
00b81d34	b 0x00b81d44
00b81d38	rbit x8,x12
00b81d3c	clz x8,x8
00b81d40	add x23,x8,x9
00b81d44	add x0,sp,#0x40
00b81d48	add x1,sp,#0x50
00b81d4c	bl 0x00c41b60
00b81d50	mov w24,w0
00b81d54	cbz w0,0x00b81e18
00b81d58	ldr x0,[sp, #0x50]
00b81d5c	cbz x0,0x00b81d6c
00b81d60	ldrh w8,[sp, #0x5a]
00b81d64	lsl x1,x8,#0x3
00b81d68	bl 0x00c42230
00b81d6c	ldr x0,[sp, #0x40]
00b81d70	mov w19,#0x1
00b81d74	str w19,[sp, #0x58]
00b81d78	str xzr,[sp, #0x50]
00b81d7c	cbz x0,0x00b81d8c
00b81d80	ldrh w8,[sp, #0x4a]
00b81d84	lsl x1,x8,#0x3
00b81d88	bl 0x00c42230
00b81d8c	ldr x0,[sp, #0x30]
00b81d90	str w19,[sp, #0x48]
00b81d94	str xzr,[sp, #0x40]
00b81d98	cbz x0,0x00b81da8
00b81d9c	ldrh w8,[sp, #0x3a]
00b81da0	lsl x1,x8,#0x3
00b81da4	bl 0x00c42230
00b81da8	ldr x0,[sp, #0x20]
00b81dac	mov w19,#0x1
00b81db0	str w19,[sp, #0x38]
00b81db4	str xzr,[sp, #0x30]
00b81db8	cbz x0,0x00b81dc8
00b81dbc	ldrh w8,[sp, #0x2a]
00b81dc0	lsl x1,x8,#0x3
00b81dc4	bl 0x00c42230
00b81dc8	ldr x0,[sp, #0x10]
00b81dcc	str w19,[sp, #0x28]
00b81dd0	str xzr,[sp, #0x20]
00b81dd4	cbz x0,0x00b81de4
00b81dd8	ldrh w8,[sp, #0x1a]
00b81ddc	lsl x1,x8,#0x3
00b81de0	bl 0x00c42230
00b81de4	ldr x8,[x26, #0x28]
00b81de8	ldur x9,[x29, #-0x58]
00b81dec	cmp x8,x9
00b81df0	b.ne 0x00b82518
00b81df4	mov w0,w24
00b81df8	ldp x29,x30,[sp, #0xd0]
00b81dfc	ldp x20,x19,[sp, #0xc0]
00b81e00	ldp x22,x21,[sp, #0xb0]
00b81e04	ldp x24,x23,[sp, #0xa0]
00b81e08	ldp x26,x25,[sp, #0x90]
00b81e0c	ldp x28,x27,[sp, #0x80]
00b81e10	add sp,sp,#0xe0
00b81e14	ret
00b81e18	ldrh w1,[sp, #0x4a]
00b81e1c	cbz x1,0x00b81e2c
00b81e20	ldr x0,[sp, #0x40]
00b81e24	mov x2,x23
00b81e28	bl 0x00c41ef0
00b81e2c	cbz x21,0x00b824e8
00b81e30	mov w28,#0x1
00b81e34	str xzr,[sp, #0x8]
00b81e38	mov w27,wzr
00b81e3c	b 0x00b81ec8
00b81e40	ldrsh w12,[sp, #0x28]
00b81e44	ldrsh w13,[sp, #0x58]
00b81e48	cmp w12,#0x1
00b81e4c	b.lt 0x00b81e8c
00b81e50	tbnz w13,#0x1f,0x00b81ec8
00b81e54	b 0x00b81e98
00b81e58	tbnz w10,#0x1f,0x00b81ec8
00b81e5c	mov x9,xzr
00b81e60	cmn x9,#0x8
00b81e64	b.eq 0x00b81ec8
00b81e68	ldr x11,[x8, x9#0x0]
00b81e6c	cmp x11,#0x2
00b81e70	b.cs 0x00b8208c
00b81e74	sub x9,x9,#0x8
00b81e78	cbnz x11,0x00b81e60
00b81e7c	neg w10,w10
00b81e80	cmp w10,#0x1
00b81e84	b.lt 0x00b81ec8
00b81e88	b 0x00b82094
00b81e8c	cbz w12,0x00b81e98
00b81e90	cmp w13,#0x0
00b81e94	b.gt 0x00b82068
00b81e98	cbz x10,0x00b81ec8
00b81e9c	lsl x13,x10,#0x3
00b81ea0	add x14,x8,x13
00b81ea4	add x13,x11,x13
00b81ea8	ldur x14,[x14, #-0x8]
00b81eac	ldur x13,[x13, #-0x8]
00b81eb0	sub x10,x10,#0x1
00b81eb4	cmp x14,x13
00b81eb8	b.hi 0x00b82064
00b81ebc	b.cs 0x00b81e98
00b81ec0	neg w12,w12
00b81ec4	tbnz w12,#0x1f,0x00b82068
00b81ec8	ldrh w25,[x22, #0xa]
00b81ecc	cbz x25,0x00b81ef8
00b81ed0	ldrh w8,[sp, #0x2a]
00b81ed4	lsl x24,x25,#0x3
00b81ed8	cmp w8,w25
00b81edc	b.ne 0x00b81f18
00b81ee0	ldr x0,[sp, #0x20]
00b81ee4	mov w1,wzr
00b81ee8	mov x2,x24
00b81eec	bl 0x00c301c0
00b81ef0	strh w28,[sp, #0x28]
00b81ef4	b 0x00b81f54
00b81ef8	ldr x0,[sp, #0x20]
00b81efc	cbz x0,0x00b81f0c
00b81f00	ldrh w8,[sp, #0x2a]
00b81f04	lsl x1,x8,#0x3
00b81f08	bl 0x00c42230
00b81f0c	str w28,[sp, #0x28]
00b81f10	str xzr,[sp, #0x20]
00b81f14	b 0x00b81f74
00b81f18	ldr x0,[sp, #0x20]
00b81f1c	cbz x0,0x00b81f28
00b81f20	lsl x1,x8,#0x3
00b81f24	bl 0x00c42230
00b81f28	mov w8,#0x2710
00b81f2c	cmp w25,w8
00b81f30	str w28,[sp, #0x28]
00b81f34	str xzr,[sp, #0x20]
00b81f38	b.hi 0x00b82508
00b81f3c	mov w1,#0x8
00b81f40	mov x0,x25
00b81f44	bl 0x00c30a30
00b81f48	cbz x0,0x00b82508
00b81f4c	strh w25,[sp, #0x2a]
00b81f50	str x0,[sp, #0x20]
00b81f54	ldr x0,[sp, #0x20]
00b81f58	ldrh w1,[sp, #0x2a]
00b81f5c	mov x2,x24
00b81f60	mov x3,x20
00b81f64	mov x4,x19
00b81f68	bl 0x00c41e30
00b81f6c	mov w24,w0
00b81f70	cbnz w0,0x00b81d58
00b81f74	ldr x0,[sp, #0x20]
00b81f78	ldrh w1,[sp, #0x2a]
00b81f7c	bl 0x00c41dc0
00b81f80	ldr x8,[sp, #0x50]
00b81f84	ldrh w1,[sp, #0x5a]
00b81f88	mov x24,x0
00b81f8c	mov x0,x8
00b81f90	bl 0x00c41dc0
00b81f94	cmp x24,x0
00b81f98	b.ls 0x00b81fc8
00b81f9c	ldrh w8,[sp, #0x2a]
00b81fa0	ldr x9,[sp, #0x20]
00b81fa4	sub x10,x0,#0x1
00b81fa8	sub x8,x8,#0x1
00b81fac	lsl x11,x8,#0x3
00b81fb0	ldr x12,[x9, x11#0x0]
00b81fb4	sub x8,x10,x8, LSL #0x6
00b81fb8	lsl x8,x28,x8
00b81fbc	sub x8,x8,#0x1
00b81fc0	and x8,x8,x12
00b81fc4	str x8,[x9, x11#0x0]
00b81fc8	cmp w27,#0x1e
00b81fcc	b.hi 0x00b824f8
00b81fd0	ldrh w9,[sp, #0x2a]
00b81fd4	ldr x8,[sp, #0x20]
00b81fd8	add w27,w27,#0x1
00b81fdc	sub x9,x9,#0x1
00b81fe0	mov x10,x9
00b81fe4	cmn x10,#0x1
00b81fe8	b.eq 0x00b82000
00b81fec	ldr x11,[x8, x10, LSL #0x3]
00b81ff0	sub x10,x10,#0x1
00b81ff4	cbz x11,0x00b81fe4
00b81ff8	add x10,x10,#0x2
00b81ffc	b 0x00b82004
00b82000	mov x10,xzr
00b82004	ldrh w12,[sp, #0x5a]
00b82008	ldr x11,[sp, #0x50]
00b8200c	sub x12,x12,#0x1
00b82010	cmn x12,#0x1
00b82014	b.eq 0x00b82044
00b82018	ldr x13,[x11, x12, LSL #0x3]
00b8201c	sub x12,x12,#0x1
00b82020	cbz x13,0x00b82010
00b82024	add x12,x12,#0x2
00b82028	orr x13,x12,x10
00b8202c	cbz x13,0x00b81ec8
00b82030	cmp x10,x12
00b82034	b.ls 0x00b82054
00b82038	ldrsh w12,[sp, #0x28]
00b8203c	tbz w12,#0x1f,0x00b81ec8
00b82040	b 0x00b82068
00b82044	mov x12,xzr
00b82048	orr x13,x12,x10
00b8204c	cbz x13,0x00b81ec8
00b82050	b 0x00b82030
00b82054	cmp x12,x10
00b82058	b.ls 0x00b81e40
00b8205c	ldrsh w10,[sp, #0x58]
00b82060	neg w12,w10
00b82064	tbz w12,#0x1f,0x00b81ec8
00b82068	cmn x9,#0x1
00b8206c	b.eq 0x00b81ec8
00b82070	ldr x10,[x8, x9, LSL #0x3]
00b82074	sub x9,x9,#0x1
00b82078	cbz x10,0x00b82068
00b8207c	ldrsh w10,[sp, #0x28]
00b82080	add x9,x9,#0x2
00b82084	cmp x9,#0x2
00b82088	b.cc 0x00b81e58
00b8208c	cmp w10,#0x1
00b82090	b.lt 0x00b81ec8
00b82094	add x0,sp,#0x20
00b82098	add x1,sp,#0x20
00b8209c	add x2,sp,#0x40
00b820a0	add x5,sp,#0x10
00b820a4	mov w3,wzr
00b820a8	mov x4,x22
00b820ac	bl 0x00b80638
00b820b0	mov w24,w0
00b820b4	cbnz w0,0x00b81d58
00b820b8	ldrh w9,[sp, #0x2a]
00b820bc	ldr x8,[sp, #0x20]
00b820c0	sub x10,x9,#0x1
00b820c4	mov x11,x10
00b820c8	cmn x11,#0x1
00b820cc	b.eq 0x00b820e4
00b820d0	ldr x12,[x8, x11, LSL #0x3]
00b820d4	sub x11,x11,#0x1
00b820d8	cbz x12,0x00b820c8
00b820dc	add x11,x11,#0x2
00b820e0	b 0x00b820e8
00b820e4	mov x11,xzr
00b820e8	ldrh w13,[sp, #0x5a]
00b820ec	ldr x12,[sp, #0x50]
00b820f0	sub x13,x13,#0x1
00b820f4	cmn x13,#0x1
00b820f8	b.eq 0x00b82118
00b820fc	ldr x14,[x12, x13, LSL #0x3]
00b82100	sub x13,x13,#0x1
00b82104	cbz x14,0x00b820f4
00b82108	add x13,x13,#0x2
00b8210c	orr x14,x13,x11
00b82110	cbnz x14,0x00b82124
00b82114	b 0x00b824cc
00b82118	mov x13,xzr
00b8211c	orr x14,x13,x11
00b82120	cbz x14,0x00b824cc
00b82124	cmp x11,x13
00b82128	b.ls 0x00b82138
00b8212c	ldrsh w13,[sp, #0x28]
00b82130	cbnz w13,0x00b8214c
00b82134	b 0x00b824cc
00b82138	cmp x13,x11
00b8213c	b.ls 0x00b82178
00b82140	ldrsh w11,[sp, #0x58]
00b82144	neg w13,w11
00b82148	cbz w13,0x00b824cc
00b8214c	cmn x10,#0x1
00b82150	b.eq 0x00b821ec
00b82154	ldr x11,[x8, x10, LSL #0x3]
00b82158	sub x10,x10,#0x1
00b8215c	cbz x11,0x00b8214c
00b82160	ldrsh w11,[sp, #0x28]
00b82164	add x10,x10,#0x2
00b82168	cmp x10,#0x2
00b8216c	b.cc 0x00b821c0
00b82170	cbnz w11,0x00b821ec
00b82174	b 0x00b824cc
00b82178	ldrsh w13,[sp, #0x28]
00b8217c	ldrsh w14,[sp, #0x58]
00b82180	cmp w13,#0x1
00b82184	b.lt 0x00b82410
00b82188	tbnz w14,#0x1f,0x00b8214c
00b8218c	cbz x11,0x00b824cc
00b82190	lsl x14,x11,#0x3
00b82194	add x15,x8,x14
00b82198	add x14,x12,x14
00b8219c	ldur x15,[x15, #-0x8]
00b821a0	ldur x14,[x14, #-0x8]
00b821a4	sub x11,x11,#0x1
00b821a8	cmp x15,x14
00b821ac	b.hi 0x00b82148
00b821b0	b.cs 0x00b8218c
00b821b4	neg w13,w13
00b821b8	cbnz w13,0x00b8214c
00b821bc	b 0x00b824cc
00b821c0	tbnz w11,#0x1f,0x00b821ec
00b821c4	mov x10,xzr
00b821c8	cmn x10,#0x8
00b821cc	b.eq 0x00b824cc
00b821d0	ldr x12,[x8, x10#0x0]
00b821d4	cmp x12,#0x2
00b821d8	b.cs 0x00b82170
00b821dc	sub x10,x10,#0x8
00b821e0	cbnz x12,0x00b821c8
00b821e4	neg w11,w11
00b821e8	cbz w11,0x00b824cc
00b821ec	cmp x23,#0x2
00b821f0	b.cc 0x00b82380
00b821f4	mov w25,#0x1
00b821f8	b 0x00b8220c
00b821fc	cbz w12,0x00b82314
00b82200	cmp w13,#0x0
00b82204	b.gt 0x00b82298
00b82208	b 0x00b82314
00b8220c	and x9,x9,#0xffff
00b82210	sub x10,x9,#0x1
00b82214	cmn x10,#0x1
00b82218	b.eq 0x00b82230
00b8221c	ldr x11,[x8, x10, LSL #0x3]
00b82220	sub x10,x10,#0x1
00b82224	cbz x11,0x00b82214
00b82228	add x10,x10,#0x2
00b8222c	b 0x00b82234
00b82230	mov x10,xzr
00b82234	ldrh w12,[sp, #0x5a]
00b82238	ldr x11,[sp, #0x50]
00b8223c	sub x12,x12,#0x1
00b82240	cmn x12,#0x1
00b82244	b.eq 0x00b82264
00b82248	ldr x13,[x11, x12, LSL #0x3]
00b8224c	sub x12,x12,#0x1
00b82250	cbz x13,0x00b82240
00b82254	add x12,x12,#0x2
00b82258	orr x13,x12,x10
00b8225c	cbnz x13,0x00b82270
00b82260	b 0x00b82380
00b82264	mov x12,xzr
00b82268	orr x13,x12,x10
00b8226c	cbz x13,0x00b82380
00b82270	cmp x10,x12
00b82274	b.ls 0x00b82284
00b82278	ldrsh w12,[sp, #0x28]
00b8227c	cbnz w12,0x00b82298
00b82280	b 0x00b82380
00b82284	cmp x12,x10
00b82288	b.ls 0x00b82300
00b8228c	ldrsh w10,[sp, #0x58]
00b82290	neg w12,w10
00b82294	cbz w12,0x00b82380
00b82298	add x0,sp,#0x30
00b8229c	add x1,sp,#0x20
00b822a0	add x2,sp,#0x20
00b822a4	bl 0x00c41c80
00b822a8	mov w24,w0
00b822ac	cbnz w0,0x00b81d58
00b822b0	add x0,sp,#0x20
00b822b4	add x1,sp,#0x30
00b822b8	mov x2,x22
00b822bc	bl 0x00c41c60
00b822c0	mov w24,w0
00b822c4	cbnz w0,0x00b81d58
00b822c8	ldrh w9,[sp, #0x2a]
00b822cc	ldr x8,[sp, #0x20]
00b822d0	sub x11,x9,#0x1
00b822d4	cmn x11,#0x1
00b822d8	b.eq 0x00b82374
00b822dc	ldr x10,[x8, x11, LSL #0x3]
00b822e0	sub x11,x11,#0x1
00b822e4	cbz x10,0x00b822d4
00b822e8	ldrsh w10,[sp, #0x28]
00b822ec	add x11,x11,#0x2
00b822f0	cmp x11,#0x2
00b822f4	b.cc 0x00b82348
00b822f8	cbnz w10,0x00b82374
00b822fc	b 0x00b82380
00b82300	ldrsh w12,[sp, #0x28]
00b82304	ldrsh w13,[sp, #0x58]
00b82308	cmp w12,#0x1
00b8230c	b.lt 0x00b821fc
00b82310	tbnz w13,#0x1f,0x00b82298
00b82314	cbz x10,0x00b82380
00b82318	lsl x13,x10,#0x3
00b8231c	add x14,x8,x13
00b82320	add x13,x11,x13
00b82324	ldur x14,[x14, #-0x8]
00b82328	ldur x13,[x13, #-0x8]
00b8232c	sub x10,x10,#0x1
00b82330	cmp x14,x13
00b82334	b.hi 0x00b82294
00b82338	b.cs 0x00b82314
00b8233c	neg w12,w12
00b82340	cbnz w12,0x00b82298
00b82344	b 0x00b82380
00b82348	tbnz w10,#0x1f,0x00b82374
00b8234c	mov x11,xzr
00b82350	cmn x11,#0x8
00b82354	b.eq 0x00b82380
00b82358	ldr x12,[x8, x11#0x0]
00b8235c	cmp x12,#0x2
00b82360	b.cs 0x00b822f8
00b82364	sub x11,x11,#0x8
00b82368	cbnz x12,0x00b82350
00b8236c	neg w10,w10
00b82370	cbz w10,0x00b82380
00b82374	add x25,x25,#0x1
00b82378	cmp x25,x23
00b8237c	b.cc 0x00b8220c
00b82380	sub x9,x9,#0x1
00b82384	mov x10,x9
00b82388	cmn x10,#0x1
00b8238c	b.eq 0x00b823a4
00b82390	ldr x11,[x8, x10, LSL #0x3]
00b82394	sub x10,x10,#0x1
00b82398	cbz x11,0x00b82388
00b8239c	add x10,x10,#0x2
00b823a0	b 0x00b823a8
00b823a4	mov x10,xzr
00b823a8	ldrh w12,[sp, #0x5a]
00b823ac	ldr x11,[sp, #0x50]
00b823b0	sub x12,x12,#0x1
00b823b4	cmn x12,#0x1
00b823b8	b.eq 0x00b823d8
00b823bc	ldr x13,[x11, x12, LSL #0x3]
00b823c0	sub x12,x12,#0x1
00b823c4	cbz x13,0x00b823b4
00b823c8	add x12,x12,#0x2
00b823cc	orr x13,x12,x10
00b823d0	cbnz x13,0x00b823e4
00b823d4	b 0x00b82474
00b823d8	mov x12,xzr
00b823dc	orr x13,x12,x10
00b823e0	cbz x13,0x00b82474
00b823e4	cmp x10,x12
00b823e8	b.ls 0x00b823f8
00b823ec	ldrsh w12,[sp, #0x28]
00b823f0	cbz w12,0x00b82474
00b823f4	b 0x00b824f8
00b823f8	cmp x12,x10
00b823fc	b.ls 0x00b82420
00b82400	ldrsh w10,[sp, #0x58]
00b82404	neg w12,w10
00b82408	cbz w12,0x00b82474
00b8240c	b 0x00b824f8
00b82410	cbz w13,0x00b8218c
00b82414	cmp w14,#0x0
00b82418	b.gt 0x00b8214c
00b8241c	b 0x00b8218c
00b82420	ldrsh w12,[sp, #0x28]
00b82424	ldrsh w13,[sp, #0x58]
00b82428	cmp w12,#0x1
00b8242c	b.lt 0x00b82438
00b82430	tbz w13,#0x1f,0x00b82444
00b82434	b 0x00b824f8
00b82438	cbz w12,0x00b82444
00b8243c	cmp w13,#0x0
00b82440	b.gt 0x00b824f8
00b82444	cbz x10,0x00b82474
00b82448	lsl x13,x10,#0x3
00b8244c	add x14,x8,x13
00b82450	add x13,x11,x13
00b82454	ldur x14,[x14, #-0x8]
00b82458	ldur x13,[x13, #-0x8]
00b8245c	sub x10,x10,#0x1
00b82460	cmp x14,x13
00b82464	b.hi 0x00b82470
00b82468	b.cs 0x00b82444
00b8246c	neg w12,w12
00b82470	cbnz w12,0x00b824f8
00b82474	cmn x9,#0x1
00b82478	b.eq 0x00b824cc
00b8247c	ldr x10,[x8, x9, LSL #0x3]
00b82480	sub x9,x9,#0x1
00b82484	cbz x10,0x00b82474
00b82488	ldrsh w10,[sp, #0x28]
00b8248c	add x9,x9,#0x2
00b82490	cmp x9,#0x2
00b82494	b.cc 0x00b824a0
00b82498	cbnz w10,0x00b824cc
00b8249c	b 0x00b824f8
00b824a0	tbnz w10,#0x1f,0x00b824cc
00b824a4	mov x9,xzr
00b824a8	cmn x9,#0x8
00b824ac	b.eq 0x00b824f8
00b824b0	ldr x11,[x8, x9#0x0]
00b824b4	cmp x11,#0x2
00b824b8	b.cs 0x00b82498
00b824bc	sub x9,x9,#0x8
00b824c0	cbnz x11,0x00b824a8
00b824c4	neg w10,w10
00b824c8	cbz w10,0x00b824f8
00b824cc	ldr x8,[sp, #0x8]
00b824d0	mov w24,wzr
00b824d4	add x8,x8,#0x1
00b824d8	cmp x8,x21
00b824dc	str x8,[sp, #0x8]
00b824e0	b.cc 0x00b81e38
00b824e4	b 0x00b81d58
00b824e8	mov w24,wzr
00b824ec	ldr x0,[sp, #0x50]
00b824f0	cbnz x0,0x00b81d60
00b824f4	b 0x00b81d6c
00b824f8	mov w24,#0xfffffff2
00b824fc	ldr x0,[sp, #0x50]
00b82500	cbnz x0,0x00b81d60
00b82504	b 0x00b81d6c
00b82508	orr w24,wzr,#0xfffffff0
00b8250c	ldr x0,[sp, #0x50]
00b82510	cbnz x0,0x00b81d60
00b82514	b 0x00b81d6c
00b82518	bl 0x00c2fec0
