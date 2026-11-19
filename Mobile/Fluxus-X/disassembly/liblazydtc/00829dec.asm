; FUN_00829dec @ 00829dec
00829dec	sub sp,sp,#0x50
00829df0	stp x29,x30,[sp, #0x20]
00829df4	stp x22,x21,[sp, #0x30]
00829df8	stp x20,x19,[sp, #0x40]
00829dfc	add x29,sp,#0x20
00829e00	mrs x22,tpidr_el0
00829e04	mov x19,x0
00829e08	ldr x8,[x22, #0x28]
00829e0c	stur x8,[x29, #-0x8]
00829e10	adrp x8,0xd1d000
00829e14	add x8,x8,#0x240
00829e18	ldarb w9,[x8]
00829e1c	adrp x8,0xd1d000
00829e20	add x8,x8,#0x230
00829e24	tbz w9,#0x0,0x0082a76c
00829e28	adrp x9,0xd1d000
00829e2c	ldrb w9,[x9, #0x239]
00829e30	cmp w9,#0x1
00829e34	b.ne 0x00829e5c
00829e38	adrp x9,0x29b000
00829e3c	ldr d0,[x8]
00829e40	strb wzr,[x8, #0x9]
00829e44	ldr d1,[x9, #0x778]
00829e48	ldrb w9,[x8, #0x8]
00829e4c	eor v0.8B,v0.8B,v1.8B
00829e50	eor w9,w9,#0x7
00829e54	strb w9,[x8, #0x8]
00829e58	str d0,[x8]
00829e5c	adrp x2,0xd1d000
00829e60	add x2,x2,#0x230
00829e64	mov x0,x19
00829e68	mov w1,#0xffffd8ee
00829e6c	bl 0x008acba4
00829e70	adrp x8,0xd1d000
00829e74	add x8,x8,#0x250
00829e78	ldarb w9,[x8]
00829e7c	adrp x8,0xd1d000
00829e80	add x8,x8,#0x248
00829e84	tbz w9,#0x0,0x0082a7cc
00829e88	adrp x9,0xd1d000
00829e8c	ldrb w9,[x9, #0x24c]
00829e90	cmp w9,#0x1
00829e94	b.ne 0x00829eb8
00829e98	ldr s0,[x8]
00829e9c	adrp x9,0x29a000
00829ea0	strb wzr,[x8, #0x4]
00829ea4	ldr d1,[x9, #0xe00]
00829ea8	uxtl v0.8H,v0.8B
00829eac	eor v0.8B,v0.8B,v1.8B
00829eb0	uzp1 v0.8B,v0.8B,v0.8B
00829eb4	str s0,[x8]
00829eb8	adrp x2,0xd1d000
00829ebc	add x2,x2,#0x248
00829ec0	mov x0,x19
00829ec4	mov w1,#0xffffffff
00829ec8	bl 0x008acba4
00829ecc	adrp x8,0x35e000
00829ed0	add x8,x8,#0x5b7
00829ed4	ldr q0,[x8]
00829ed8	mov w8,#0x5cf6
00829edc	movk w8,#0x39d3, LSL #16
00829ee0	str q0,[sp]
00829ee4	str w8,[sp, #0x10]
00829ee8	adrp x8,0xd1d000
00829eec	add x8,x8,#0x270
00829ef0	ldarb w8,[x8]
00829ef4	tbz w8,#0x0,0x0082a82c
00829ef8	adrp x20,0xd1d000
00829efc	add x20,x20,#0x258
00829f00	mov x0,x20
00829f04	bl 0x0082c2ac
00829f08	mov x0,x19
00829f0c	mov x1,x20
00829f10	bl 0x008ac4a8
00829f14	mov x0,x19
00829f18	mov w1,#0x1
00829f1c	mov w2,#0x1
00829f20	mov w3,wzr
00829f24	bl 0x008adea0
00829f28	cbz w0,0x00829f4c
00829f2c	mov x0,x19
00829f30	mov w1,#0xffffffff
00829f34	mov x2,xzr
00829f38	bl 0x008ab8a4
00829f3c	mov x0,x19
00829f40	mov w1,#0xfffffffd
00829f44	bl 0x008aa994
00829f48	b 0x0082a748
00829f4c	mov x0,x19
00829f50	mov w1,#0xfffffffe
00829f54	bl 0x008aab40
00829f58	mov x0,x19
00829f5c	mov w1,#0xffffffff
00829f60	bl 0x008ae664
00829f64	adrp x8,0xd1d000
00829f68	mov w1,#0xfffffffe
00829f6c	str w0,[x8, #0x150]
00829f70	mov x0,x19
00829f74	bl 0x008aa994
00829f78	adrp x8,0xd1d000
00829f7c	add x8,x8,#0x288
00829f80	ldarb w9,[x8]
00829f84	adrp x8,0xd1d000
00829f88	add x8,x8,#0x278
00829f8c	tbz w9,#0x0,0x0082a878
00829f90	adrp x9,0xd1d000
00829f94	ldrb w9,[x9, #0x284]
00829f98	cmp w9,#0x1
00829f9c	b.ne 0x00829fd4
00829fa0	ldr s0,[x8, #0x8]
00829fa4	adrp x9,0x29a000
00829fa8	strb wzr,[x8, #0xc]
00829fac	ldr d1,[x9, #0xf8]
00829fb0	adrp x9,0x29a000
00829fb4	uxtl v0.8H,v0.8B
00829fb8	ldr d2,[x9, #0xdf0]
00829fbc	eor v0.8B,v0.8B,v1.8B
00829fc0	ldr d1,[x8]
00829fc4	eor v1.8B,v1.8B,v2.8B
00829fc8	uzp1 v0.8B,v0.8B,v0.8B
00829fcc	str d1,[x8]
00829fd0	str s0,[x8, #0x8]
00829fd4	nop
00829fd8	adr x20,0x82ac80
00829fdc	adrp x21,0xd1d000
00829fe0	add x21,x21,#0x278
00829fe4	mov x0,x19
00829fe8	mov x1,x20
00829fec	mov x2,x21
00829ff0	mov w3,wzr
00829ff4	mov x4,xzr
00829ff8	bl 0x008ac76c
00829ffc	mov x0,x19
0082a000	mov w1,#0xffffffff
0082a004	bl 0x008aa2e4
0082a008	ldr x8,[x0]
0082a00c	adrp x0,0xd1d000
0082a010	add x0,x0,#0x128
0082a014	mov x1,sp
0082a018	mov x2,sp
0082a01c	str x8,[sp]
0082a020	bl 0x00807f14
0082a024	adrp x0,0xcca000
0082a028	add x0,x0,#0x848
0082a02c	mov x1,sp
0082a030	mov x2,sp
0082a034	str x20,[sp]
0082a038	bl 0x0080837c
0082a03c	mov x0,x19
0082a040	mov w1,#0xffffd8ee
0082a044	mov x2,x21
0082a048	bl 0x008ad800
0082a04c	adrp x8,0xd1d000
0082a050	add x8,x8,#0x2a0
0082a054	ldarb w9,[x8]
0082a058	adrp x8,0xd1d000
0082a05c	add x8,x8,#0x290
0082a060	tbz w9,#0x0,0x0082a8e4
0082a064	adrp x9,0xd1d000
0082a068	ldrb w9,[x9, #0x29e]
0082a06c	cmp w9,#0x1
0082a070	b.ne 0x0082a0c8
0082a074	ldr s0,[x8, #0x8]
0082a078	adrp x9,0x29a000
0082a07c	ldr d2,[x8]
0082a080	ldr d1,[x9, #0x938]
0082a084	adrp x9,0x29b000
0082a088	mov w10,#0xeb
0082a08c	uxtl v0.8H,v0.8B
0082a090	ldrb w11,[x8, #0xd]
0082a094	strb wzr,[x8, #0xe]
0082a098	eor v0.8B,v0.8B,v1.8B
0082a09c	ldr d1,[x9, #0xcf8]
0082a0a0	ldrb w9,[x8, #0xc]
0082a0a4	eor v1.8B,v2.8B,v1.8B
0082a0a8	eor w9,w9,w10
0082a0ac	mov w10,#0x25
0082a0b0	uzp1 v0.8B,v0.8B,v0.8B
0082a0b4	eor w10,w11,w10
0082a0b8	strb w9,[x8, #0xc]
0082a0bc	strb w10,[x8, #0xd]
0082a0c0	str d1,[x8]
0082a0c4	str s0,[x8, #0x8]
0082a0c8	nop
0082a0cc	adr x20,0x82ace0
0082a0d0	adrp x21,0xd1d000
0082a0d4	add x21,x21,#0x290
0082a0d8	mov x0,x19
0082a0dc	mov x1,x20
0082a0e0	mov x2,x21
0082a0e4	mov w3,wzr
0082a0e8	mov x4,xzr
0082a0ec	bl 0x008ac76c
0082a0f0	mov x0,x19
0082a0f4	mov w1,#0xffffffff
0082a0f8	bl 0x008aa2e4
0082a0fc	ldr x8,[x0]
0082a100	adrp x0,0xd1d000
0082a104	add x0,x0,#0x128
0082a108	mov x1,sp
0082a10c	mov x2,sp
0082a110	str x8,[sp]
0082a114	bl 0x00807f14
0082a118	adrp x0,0xcca000
0082a11c	add x0,x0,#0x848
0082a120	mov x1,sp
0082a124	mov x2,sp
0082a128	str x20,[sp]
0082a12c	bl 0x0080837c
0082a130	mov x0,x19
0082a134	mov w1,#0xffffd8ee
0082a138	mov x2,x21
0082a13c	bl 0x008ad800
0082a140	adrp x8,0xd1d000
0082a144	add x8,x8,#0x2b8
0082a148	ldarb w9,[x8]
0082a14c	adrp x8,0xd1d000
0082a150	add x8,x8,#0x2a8
0082a154	tbz w9,#0x0,0x0082a958
0082a158	adrp x9,0xd1d000
0082a15c	ldrb w9,[x9, #0x2b4]
0082a160	cmp w9,#0x1
0082a164	b.ne 0x0082a19c
0082a168	ldr s0,[x8, #0x8]
0082a16c	adrp x9,0x29b000
0082a170	strb wzr,[x8, #0xc]
0082a174	ldr d1,[x9, #0x4e0]
0082a178	adrp x9,0x29b000
0082a17c	uxtl v0.8H,v0.8B
0082a180	ldr d2,[x9, #0xf10]
0082a184	eor v0.8B,v0.8B,v1.8B
0082a188	ldr d1,[x8]
0082a18c	eor v1.8B,v1.8B,v2.8B
0082a190	uzp1 v0.8B,v0.8B,v0.8B
0082a194	str d1,[x8]
0082a198	str s0,[x8, #0x8]
0082a19c	nop
0082a1a0	adr x20,0x82ad40
0082a1a4	adrp x21,0xd1d000
0082a1a8	add x21,x21,#0x2a8
0082a1ac	mov x0,x19
0082a1b0	mov x1,x20
0082a1b4	mov x2,x21
0082a1b8	mov w3,wzr
0082a1bc	mov x4,xzr
0082a1c0	bl 0x008ac76c
0082a1c4	mov x0,x19
0082a1c8	mov w1,#0xffffffff
0082a1cc	bl 0x008aa2e4
0082a1d0	ldr x8,[x0]
0082a1d4	adrp x0,0xd1d000
0082a1d8	add x0,x0,#0x128
0082a1dc	mov x1,sp
0082a1e0	mov x2,sp
0082a1e4	str x8,[sp]
0082a1e8	bl 0x00807f14
0082a1ec	adrp x0,0xcca000
0082a1f0	add x0,x0,#0x848
0082a1f4	mov x1,sp
0082a1f8	mov x2,sp
0082a1fc	str x20,[sp]
0082a200	bl 0x0080837c
0082a204	mov x0,x19
0082a208	mov w1,#0xffffd8ee
0082a20c	mov x2,x21
0082a210	bl 0x008ad800
0082a214	adrp x8,0xd1d000
0082a218	add x8,x8,#0x2d0
0082a21c	ldarb w9,[x8]
0082a220	adrp x8,0xd1d000
0082a224	add x8,x8,#0x2c0
0082a228	tbz w9,#0x0,0x0082a9c4
0082a22c	adrp x9,0xd1d000
0082a230	ldrb w9,[x9, #0x2ce]
0082a234	cmp w9,#0x1
0082a238	b.ne 0x0082a28c
0082a23c	ldr s0,[x8, #0x8]
0082a240	adrp x9,0x29a000
0082a244	ldr d2,[x8]
0082a248	ldr d1,[x9, #0xe10]
0082a24c	adrp x9,0x29a000
0082a250	ldrb w10,[x8, #0xd]
0082a254	uxtl v0.8H,v0.8B
0082a258	mov w11,#0xc9
0082a25c	strb wzr,[x8, #0xe]
0082a260	eor w10,w10,w11
0082a264	strb w10,[x8, #0xd]
0082a268	eor v0.8B,v0.8B,v1.8B
0082a26c	ldr d1,[x9, #0xbf0]
0082a270	ldrb w9,[x8, #0xc]
0082a274	eor v1.8B,v2.8B,v1.8B
0082a278	eor w9,w9,#0xffffff8f
0082a27c	uzp1 v0.8B,v0.8B,v0.8B
0082a280	strb w9,[x8, #0xc]
0082a284	str d1,[x8]
0082a288	str s0,[x8, #0x8]
0082a28c	nop
0082a290	adr x20,0x82ada0
0082a294	adrp x21,0xd1d000
0082a298	add x21,x21,#0x2c0
0082a29c	mov x0,x19
0082a2a0	mov x1,x20
0082a2a4	mov x2,x21
0082a2a8	mov w3,wzr
0082a2ac	mov x4,xzr
0082a2b0	bl 0x008ac76c
0082a2b4	mov x0,x19
0082a2b8	mov w1,#0xffffffff
0082a2bc	bl 0x008aa2e4
0082a2c0	ldr x8,[x0]
0082a2c4	adrp x0,0xd1d000
0082a2c8	add x0,x0,#0x128
0082a2cc	mov x1,sp
0082a2d0	mov x2,sp
0082a2d4	str x8,[sp]
0082a2d8	bl 0x00807f14
0082a2dc	adrp x0,0xcca000
0082a2e0	add x0,x0,#0x848
0082a2e4	mov x1,sp
0082a2e8	mov x2,sp
0082a2ec	str x20,[sp]
0082a2f0	bl 0x0080837c
0082a2f4	mov x0,x19
0082a2f8	mov w1,#0xffffd8ee
0082a2fc	mov x2,x21
0082a300	bl 0x008ad800
0082a304	adrp x8,0xd1d000
0082a308	add x8,x8,#0x320
0082a30c	ldarb w9,[x8]
0082a310	adrp x8,0xd1d000
0082a314	add x8,x8,#0x310
0082a318	tbz w9,#0x0,0x0082aa38
0082a31c	adrp x9,0xd1d000
0082a320	ldrb w9,[x9, #0x31c]
0082a324	cmp w9,#0x1
0082a328	b.ne 0x0082a360
0082a32c	ldr s0,[x8, #0x8]
0082a330	adrp x9,0x29b000
0082a334	strb wzr,[x8, #0xc]
0082a338	ldr d1,[x9, #0x588]
0082a33c	adrp x9,0x29a000
0082a340	uxtl v0.8H,v0.8B
0082a344	ldr d2,[x9, #0xcc0]
0082a348	eor v0.8B,v0.8B,v1.8B
0082a34c	ldr d1,[x8]
0082a350	eor v1.8B,v1.8B,v2.8B
0082a354	uzp1 v0.8B,v0.8B,v0.8B
0082a358	str d1,[x8]
0082a35c	str s0,[x8, #0x8]
0082a360	nop
0082a364	adr x20,0x82ae00
0082a368	adrp x21,0xd1d000
0082a36c	add x21,x21,#0x310
0082a370	mov x0,x19
0082a374	mov x1,x20
0082a378	mov x2,x21
0082a37c	mov w3,wzr
0082a380	mov x4,xzr
0082a384	bl 0x008ac76c
0082a388	mov x0,x19
0082a38c	mov w1,#0xffffffff
0082a390	bl 0x008aa2e4
0082a394	ldr x8,[x0]
0082a398	adrp x0,0xd1d000
0082a39c	add x0,x0,#0x128
0082a3a0	mov x1,sp
0082a3a4	mov x2,sp
0082a3a8	str x8,[sp]
0082a3ac	bl 0x00807f14
0082a3b0	adrp x0,0xcca000
0082a3b4	add x0,x0,#0x848
0082a3b8	mov x1,sp
0082a3bc	mov x2,sp
0082a3c0	str x20,[sp]
0082a3c4	bl 0x0080837c
0082a3c8	mov x0,x19
0082a3cc	mov w1,#0xffffd8ee
0082a3d0	mov x2,x21
0082a3d4	bl 0x008ad800
0082a3d8	adrp x8,0xd1d000
0082a3dc	add x8,x8,#0x338
0082a3e0	ldarb w9,[x8]
0082a3e4	adrp x8,0xd1d000
0082a3e8	add x8,x8,#0x328
0082a3ec	tbz w9,#0x0,0x0082aaa4
0082a3f0	adrp x9,0xd1d000
0082a3f4	ldrb w9,[x9, #0x334]
0082a3f8	cmp w9,#0x1
0082a3fc	b.ne 0x0082a434
0082a400	ldr s0,[x8, #0x8]
0082a404	adrp x9,0x29a000
0082a408	strb wzr,[x8, #0xc]
0082a40c	ldr d1,[x9, #0xca8]
0082a410	adrp x9,0x29a000
0082a414	uxtl v0.8H,v0.8B
0082a418	ldr d2,[x9, #0x828]
0082a41c	eor v0.8B,v0.8B,v1.8B
0082a420	ldr d1,[x8]
0082a424	eor v1.8B,v1.8B,v2.8B
0082a428	uzp1 v0.8B,v0.8B,v0.8B
0082a42c	str d1,[x8]
0082a430	str s0,[x8, #0x8]
0082a434	nop
0082a438	adr x20,0x82aecc
0082a43c	adrp x21,0xd1d000
0082a440	add x21,x21,#0x328
0082a444	mov x0,x19
0082a448	mov x1,x20
0082a44c	mov x2,x21
0082a450	mov w3,wzr
0082a454	mov x4,xzr
0082a458	bl 0x008ac76c
0082a45c	mov x0,x19
0082a460	mov w1,#0xffffffff
0082a464	bl 0x008aa2e4
0082a468	ldr x8,[x0]
0082a46c	adrp x0,0xd1d000
0082a470	add x0,x0,#0x128
0082a474	mov x1,sp
0082a478	mov x2,sp
0082a47c	str x8,[sp]
0082a480	bl 0x00807f14
0082a484	adrp x0,0xcca000
0082a488	add x0,x0,#0x848
0082a48c	mov x1,sp
0082a490	mov x2,sp
0082a494	str x20,[sp]
0082a498	bl 0x0080837c
0082a49c	mov x0,x19
0082a4a0	mov w1,#0xffffd8ee
0082a4a4	mov x2,x21
0082a4a8	bl 0x008ad800
0082a4ac	adrp x8,0xd1d000
0082a4b0	add x8,x8,#0x380
0082a4b4	ldarb w9,[x8]
0082a4b8	adrp x8,0xd1d000
0082a4bc	add x8,x8,#0x370
0082a4c0	tbz w9,#0x0,0x0082ab10
0082a4c4	adrp x9,0xd1d000
0082a4c8	ldrb w9,[x9, #0x37c]
0082a4cc	cmp w9,#0x1
0082a4d0	b.ne 0x0082a508
0082a4d4	ldr s0,[x8, #0x8]
0082a4d8	adrp x9,0x29b000
0082a4dc	strb wzr,[x8, #0xc]
0082a4e0	ldr d1,[x9, #0xf08]
0082a4e4	adrp x9,0x29a000
0082a4e8	uxtl v0.8H,v0.8B
0082a4ec	ldr d2,[x9, #0x940]
0082a4f0	eor v0.8B,v0.8B,v1.8B
0082a4f4	ldr d1,[x8]
0082a4f8	eor v1.8B,v1.8B,v2.8B
0082a4fc	uzp1 v0.8B,v0.8B,v0.8B
0082a500	str d1,[x8]
0082a504	str s0,[x8, #0x8]
0082a508	nop
0082a50c	adr x20,0x82af44
0082a510	adrp x21,0xd1d000
0082a514	add x21,x21,#0x370
0082a518	mov x0,x19
0082a51c	mov x1,x20
0082a520	mov x2,x21
0082a524	mov w3,wzr
0082a528	mov x4,xzr
0082a52c	bl 0x008ac76c
0082a530	mov x0,x19
0082a534	mov w1,#0xffffffff
0082a538	bl 0x008aa2e4
0082a53c	ldr x8,[x0]
0082a540	adrp x0,0xd1d000
0082a544	add x0,x0,#0x128
0082a548	mov x1,sp
0082a54c	mov x2,sp
0082a550	str x8,[sp]
0082a554	bl 0x00807f14
0082a558	adrp x0,0xcca000
0082a55c	add x0,x0,#0x848
0082a560	mov x1,sp
0082a564	mov x2,sp
0082a568	str x20,[sp]
0082a56c	bl 0x0080837c
0082a570	mov x0,x19
0082a574	mov w1,#0xffffd8ee
0082a578	mov x2,x21
0082a57c	bl 0x008ad800
0082a580	adrp x8,0xd1d000
0082a584	add x8,x8,#0x398
0082a588	ldarb w9,[x8]
0082a58c	adrp x8,0xd1d000
0082a590	add x8,x8,#0x388
0082a594	tbz w9,#0x0,0x0082ab7c
0082a598	adrp x9,0xd1d000
0082a59c	ldrb w9,[x9, #0x395]
0082a5a0	cmp w9,#0x1
0082a5a4	b.ne 0x0082a5ec
0082a5a8	ldr s0,[x8, #0x8]
0082a5ac	adrp x9,0x29b000
0082a5b0	mov w10,#0x6d
0082a5b4	ldr d1,[x9, #0x5a0]
0082a5b8	adrp x9,0x29b000
0082a5bc	strb wzr,[x8, #0xd]
0082a5c0	uxtl v0.8H,v0.8B
0082a5c4	ldr d2,[x9, #0x2d8]
0082a5c8	ldrb w9,[x8, #0xc]
0082a5cc	eor w9,w9,w10
0082a5d0	eor v0.8B,v0.8B,v1.8B
0082a5d4	ldr d1,[x8]
0082a5d8	strb w9,[x8, #0xc]
0082a5dc	eor v1.8B,v1.8B,v2.8B
0082a5e0	uzp1 v0.8B,v0.8B,v0.8B
0082a5e4	str d1,[x8]
0082a5e8	str s0,[x8, #0x8]
0082a5ec	nop
0082a5f0	adr x20,0x82b1b4
0082a5f4	adrp x21,0xd1d000
0082a5f8	add x21,x21,#0x388
0082a5fc	mov x0,x19
0082a600	mov x1,x20
0082a604	mov x2,x21
0082a608	mov w3,wzr
0082a60c	mov x4,xzr
0082a610	bl 0x008ac76c
0082a614	mov x0,x19
0082a618	mov w1,#0xffffffff
0082a61c	bl 0x008aa2e4
0082a620	ldr x8,[x0]
0082a624	adrp x0,0xd1d000
0082a628	add x0,x0,#0x128
0082a62c	mov x1,sp
0082a630	mov x2,sp
0082a634	str x8,[sp]
0082a638	bl 0x00807f14
0082a63c	adrp x0,0xcca000
0082a640	add x0,x0,#0x848
0082a644	mov x1,sp
0082a648	mov x2,sp
0082a64c	str x20,[sp]
0082a650	bl 0x0080837c
0082a654	mov x0,x19
0082a658	mov w1,#0xffffd8ee
0082a65c	mov x2,x21
0082a660	bl 0x008ad800
0082a664	adrp x8,0xd1d000
0082a668	add x8,x8,#0x448
0082a66c	ldarb w9,[x8]
0082a670	adrp x8,0xd1d000
0082a674	add x8,x8,#0x438
0082a678	tbz w9,#0x0,0x0082abe8
0082a67c	adrp x9,0xd1d000
0082a680	ldrb w9,[x9, #0x445]
0082a684	cmp w9,#0x1
0082a688	b.ne 0x0082a6d0
0082a68c	ldr s0,[x8, #0x8]
0082a690	adrp x9,0x29a000
0082a694	mov w10,#0xd9
0082a698	ldr d1,[x9, #0x5e8]
0082a69c	adrp x9,0x29b000
0082a6a0	strb wzr,[x8, #0xd]
0082a6a4	uxtl v0.8H,v0.8B
0082a6a8	ldr d2,[x9, #0x1c0]
0082a6ac	ldrb w9,[x8, #0xc]
0082a6b0	eor w9,w9,w10
0082a6b4	eor v0.8B,v0.8B,v1.8B
0082a6b8	ldr d1,[x8]
0082a6bc	strb w9,[x8, #0xc]
0082a6c0	eor v1.8B,v1.8B,v2.8B
0082a6c4	uzp1 v0.8B,v0.8B,v0.8B
0082a6c8	str d1,[x8]
0082a6cc	str s0,[x8, #0x8]
0082a6d0	nop
0082a6d4	adr x20,0x82b20c
0082a6d8	adrp x21,0xd1d000
0082a6dc	add x21,x21,#0x438
0082a6e0	mov x0,x19
0082a6e4	mov x1,x20
0082a6e8	mov x2,x21
0082a6ec	mov w3,wzr
0082a6f0	mov x4,xzr
0082a6f4	bl 0x008ac76c
0082a6f8	mov x0,x19
0082a6fc	mov w1,#0xffffffff
0082a700	bl 0x008aa2e4
0082a704	ldr x8,[x0]
0082a708	adrp x0,0xd1d000
0082a70c	add x0,x0,#0x128
0082a710	mov x1,sp
0082a714	mov x2,sp
0082a718	str x8,[sp]
0082a71c	bl 0x00807f14
0082a720	adrp x0,0xcca000
0082a724	add x0,x0,#0x848
0082a728	mov x1,sp
0082a72c	mov x2,sp
0082a730	str x20,[sp]
0082a734	bl 0x0080837c
0082a738	mov x0,x19
0082a73c	mov w1,#0xffffd8ee
0082a740	mov x2,x21
0082a744	bl 0x008ad800
0082a748	ldr x8,[x22, #0x28]
0082a74c	ldur x9,[x29, #-0x8]
0082a750	cmp x8,x9
0082a754	b.ne 0x0082ac7c
0082a758	ldp x20,x19,[sp, #0x40]
0082a75c	ldp x22,x21,[sp, #0x30]
0082a760	ldp x29,x30,[sp, #0x20]
0082a764	add sp,sp,#0x50
0082a768	ret
0082a76c	adrp x0,0xd1d000
0082a770	add x0,x0,#0x240
0082a774	bl 0x00c2fe90
0082a778	adrp x8,0xd1d000
0082a77c	add x8,x8,#0x230
0082a780	cbz w0,0x00829e28
0082a784	adrp x9,0x29a000
0082a788	nop
0082a78c	adr x0,0x82bad4
0082a790	ldr d0,[x9, #0x5d8]
0082a794	mov w9,#0x107
0082a798	adrp x2,0xc48000
0082a79c	add x2,x2,#0x880
0082a7a0	adrp x1,0xd1d000
0082a7a4	add x1,x1,#0x230
0082a7a8	str d0,[x8]
0082a7ac	strh w9,[x8, #0x8]
0082a7b0	bl 0x00c2fe70
0082a7b4	adrp x0,0xd1d000
0082a7b8	add x0,x0,#0x240
0082a7bc	bl 0x00c2fea0
0082a7c0	adrp x8,0xd1d000
0082a7c4	add x8,x8,#0x230
0082a7c8	b 0x00829e28
0082a7cc	adrp x0,0xd1d000
0082a7d0	add x0,x0,#0x250
0082a7d4	bl 0x00c2fe90
0082a7d8	adrp x8,0xd1d000
0082a7dc	add x8,x8,#0x248
0082a7e0	cbz w0,0x00829e88
0082a7e4	adrp x9,0x29a000
0082a7e8	mov w10,#0x1
0082a7ec	nop
0082a7f0	adr x0,0x82bae0
0082a7f4	ldr d0,[x9, #0x388]
0082a7f8	adrp x2,0xc48000
0082a7fc	add x2,x2,#0x880
0082a800	adrp x1,0xd1d000
0082a804	add x1,x1,#0x248
0082a808	strb w10,[x8, #0x4]
0082a80c	str s0,[x8]
0082a810	bl 0x00c2fe70
0082a814	adrp x0,0xd1d000
0082a818	add x0,x0,#0x250
0082a81c	bl 0x00c2fea0
0082a820	adrp x8,0xd1d000
0082a824	add x8,x8,#0x248
0082a828	b 0x00829e88
0082a82c	adrp x0,0xd1d000
0082a830	add x0,x0,#0x270
0082a834	bl 0x00c2fe90
0082a838	cbz w0,0x00829ef8
0082a83c	adrp x0,0xd1d000
0082a840	add x0,x0,#0x258
0082a844	mov x1,sp
0082a848	bl 0x0082bae8
0082a84c	nop
0082a850	adr x0,0x82bb94
0082a854	adrp x1,0xd1d000
0082a858	add x1,x1,#0x258
0082a85c	adrp x2,0xc48000
0082a860	add x2,x2,#0x880
0082a864	bl 0x00c2fe70
0082a868	adrp x0,0xd1d000
0082a86c	add x0,x0,#0x270
0082a870	bl 0x00c2fea0
0082a874	b 0x00829ef8
0082a878	adrp x0,0xd1d000
0082a87c	add x0,x0,#0x288
0082a880	bl 0x00c2fe90
0082a884	adrp x8,0xd1d000
0082a888	add x8,x8,#0x278
0082a88c	cbz w0,0x00829f90
0082a890	adrp x9,0x29b000
0082a894	adrp x11,0x29b000
0082a898	mov w10,#0x1
0082a89c	ldr d0,[x9, #0x6b0]
0082a8a0	ldr d1,[x11, #0x3f0]
0082a8a4	nop
0082a8a8	adr x0,0x82bba0
0082a8ac	adrp x2,0xc48000
0082a8b0	add x2,x2,#0x880
0082a8b4	adrp x1,0xd1d000
0082a8b8	add x1,x1,#0x278
0082a8bc	strb w10,[x8, #0xc]
0082a8c0	str d0,[x8]
0082a8c4	str s1,[x8, #0x8]
0082a8c8	bl 0x00c2fe70
0082a8cc	adrp x0,0xd1d000
0082a8d0	add x0,x0,#0x288
0082a8d4	bl 0x00c2fea0
0082a8d8	adrp x8,0xd1d000
0082a8dc	add x8,x8,#0x278
0082a8e0	b 0x00829f90
0082a8e4	adrp x0,0xd1d000
0082a8e8	add x0,x0,#0x2a0
0082a8ec	bl 0x00c2fe90
0082a8f0	adrp x8,0xd1d000
0082a8f4	add x8,x8,#0x290
0082a8f8	cbz w0,0x0082a064
0082a8fc	adrp x9,0x29b000
0082a900	adrp x11,0x29a000
0082a904	mov w10,#0x1
0082a908	ldr d0,[x9, #0x9f8]
0082a90c	ldr d1,[x11, #0xbe8]
0082a910	mov w9,#0x258e
0082a914	nop
0082a918	adr x0,0x82bbac
0082a91c	adrp x2,0xc48000
0082a920	add x2,x2,#0x880
0082a924	adrp x1,0xd1d000
0082a928	add x1,x1,#0x290
0082a92c	strb w10,[x8, #0xe]
0082a930	str d0,[x8]
0082a934	str s1,[x8, #0x8]
0082a938	strh w9,[x8, #0xc]
0082a93c	bl 0x00c2fe70
0082a940	adrp x0,0xd1d000
0082a944	add x0,x0,#0x2a0
0082a948	bl 0x00c2fea0
0082a94c	adrp x8,0xd1d000
0082a950	add x8,x8,#0x290
0082a954	b 0x0082a064
0082a958	adrp x0,0xd1d000
0082a95c	add x0,x0,#0x2b8
0082a960	bl 0x00c2fe90
0082a964	adrp x8,0xd1d000
0082a968	add x8,x8,#0x2a8
0082a96c	cbz w0,0x0082a158
0082a970	adrp x9,0x29a000
0082a974	adrp x11,0x29a000
0082a978	mov w10,#0x1
0082a97c	ldr d0,[x9, #0x5e0]
0082a980	ldr d1,[x11, #0xe08]
0082a984	nop
0082a988	adr x0,0x82bbb8
0082a98c	adrp x2,0xc48000
0082a990	add x2,x2,#0x880
0082a994	adrp x1,0xd1d000
0082a998	add x1,x1,#0x2a8
0082a99c	strb w10,[x8, #0xc]
0082a9a0	str d0,[x8]
0082a9a4	str s1,[x8, #0x8]
0082a9a8	bl 0x00c2fe70
0082a9ac	adrp x0,0xd1d000
0082a9b0	add x0,x0,#0x2b8
0082a9b4	bl 0x00c2fea0
0082a9b8	adrp x8,0xd1d000
0082a9bc	add x8,x8,#0x2a8
0082a9c0	b 0x0082a158
0082a9c4	adrp x0,0xd1d000
0082a9c8	add x0,x0,#0x2d0
0082a9cc	bl 0x00c2fe90
0082a9d0	adrp x8,0xd1d000
0082a9d4	add x8,x8,#0x2c0
0082a9d8	cbz w0,0x0082a22c
0082a9dc	adrp x9,0x29a000
0082a9e0	adrp x11,0x29a000
0082a9e4	mov w10,#0x1
0082a9e8	ldr d0,[x9, #0x4d0]
0082a9ec	ldr d1,[x11, #0x390]
0082a9f0	mov w9,#0xc9ea
0082a9f4	nop
0082a9f8	adr x0,0x82bbc4
0082a9fc	adrp x2,0xc48000
0082aa00	add x2,x2,#0x880
0082aa04	adrp x1,0xd1d000
0082aa08	add x1,x1,#0x2c0
0082aa0c	strb w10,[x8, #0xe]
0082aa10	str d0,[x8]
0082aa14	str s1,[x8, #0x8]
0082aa18	strh w9,[x8, #0xc]
0082aa1c	bl 0x00c2fe70
0082aa20	adrp x0,0xd1d000
0082aa24	add x0,x0,#0x2d0
0082aa28	bl 0x00c2fea0
0082aa2c	adrp x8,0xd1d000
0082aa30	add x8,x8,#0x2c0
0082aa34	b 0x0082a22c
0082aa38	adrp x0,0xd1d000
0082aa3c	add x0,x0,#0x320
0082aa40	bl 0x00c2fe90
0082aa44	adrp x8,0xd1d000
0082aa48	add x8,x8,#0x310
0082aa4c	cbz w0,0x0082a31c
0082aa50	adrp x9,0x29a000
0082aa54	adrp x11,0x29a000
0082aa58	mov w10,#0x1
0082aa5c	ldr d0,[x9, #0x298]
0082aa60	ldr d1,[x11, #0xf18]
0082aa64	nop
0082aa68	adr x0,0x82bf78
0082aa6c	adrp x2,0xc48000
0082aa70	add x2,x2,#0x880
0082aa74	adrp x1,0xd1d000
0082aa78	add x1,x1,#0x310
0082aa7c	strb w10,[x8, #0xc]
0082aa80	str d0,[x8]
0082aa84	str s1,[x8, #0x8]
0082aa88	bl 0x00c2fe70
0082aa8c	adrp x0,0xd1d000
0082aa90	add x0,x0,#0x320
0082aa94	bl 0x00c2fea0
0082aa98	adrp x8,0xd1d000
0082aa9c	add x8,x8,#0x310
0082aaa0	b 0x0082a31c
0082aaa4	adrp x0,0xd1d000
0082aaa8	add x0,x0,#0x338
0082aaac	bl 0x00c2fe90
0082aab0	adrp x8,0xd1d000
0082aab4	add x8,x8,#0x328
0082aab8	cbz w0,0x0082a3f0
0082aabc	adrp x9,0x29a000
0082aac0	adrp x11,0x29a000
0082aac4	mov w10,#0x1
0082aac8	ldr d0,[x9, #0x820]
0082aacc	ldr d1,[x11, #0xe18]
0082aad0	nop
0082aad4	adr x0,0x82bf84
0082aad8	adrp x2,0xc48000
0082aadc	add x2,x2,#0x880
0082aae0	adrp x1,0xd1d000
0082aae4	add x1,x1,#0x328
0082aae8	strb w10,[x8, #0xc]
0082aaec	str d0,[x8]
0082aaf0	str s1,[x8, #0x8]
0082aaf4	bl 0x00c2fe70
0082aaf8	adrp x0,0xd1d000
0082aafc	add x0,x0,#0x338
0082ab00	bl 0x00c2fea0
0082ab04	adrp x8,0xd1d000
0082ab08	add x8,x8,#0x328
0082ab0c	b 0x0082a3f0
0082ab10	adrp x0,0xd1d000
0082ab14	add x0,x0,#0x380
0082ab18	bl 0x00c2fe90
0082ab1c	adrp x8,0xd1d000
0082ab20	add x8,x8,#0x370
0082ab24	cbz w0,0x0082a4c4
0082ab28	adrp x9,0x29a000
0082ab2c	adrp x11,0x29a000
0082ab30	mov w10,#0x1
0082ab34	ldr d0,[x9, #0xe20]
0082ab38	ldr d1,[x11, #0xcc8]
0082ab3c	nop
0082ab40	adr x0,0x82c098
0082ab44	adrp x2,0xc48000
0082ab48	add x2,x2,#0x880
0082ab4c	adrp x1,0xd1d000
0082ab50	add x1,x1,#0x370
0082ab54	strb w10,[x8, #0xc]
0082ab58	str d0,[x8]
0082ab5c	str s1,[x8, #0x8]
0082ab60	bl 0x00c2fe70
0082ab64	adrp x0,0xd1d000
0082ab68	add x0,x0,#0x380
0082ab6c	bl 0x00c2fea0
0082ab70	adrp x8,0xd1d000
0082ab74	add x8,x8,#0x370
0082ab78	b 0x0082a4c4
0082ab7c	adrp x0,0xd1d000
0082ab80	add x0,x0,#0x398
0082ab84	bl 0x00c2fe90
0082ab88	adrp x8,0xd1d000
0082ab8c	add x8,x8,#0x388
0082ab90	cbz w0,0x0082a598
0082ab94	adrp x9,0x29b000
0082ab98	adrp x10,0x29b000
0082ab9c	nop
0082aba0	adr x0,0x82c0a4
0082aba4	ldr d0,[x9, #0xd00]
0082aba8	ldr d1,[x10, #0xa00]
0082abac	mov w9,#0x16d
0082abb0	adrp x2,0xc48000
0082abb4	add x2,x2,#0x880
0082abb8	adrp x1,0xd1d000
0082abbc	add x1,x1,#0x388
0082abc0	str d0,[x8]
0082abc4	str s1,[x8, #0x8]
0082abc8	strh w9,[x8, #0xc]
0082abcc	bl 0x00c2fe70
0082abd0	adrp x0,0xd1d000
0082abd4	add x0,x0,#0x398
0082abd8	bl 0x00c2fea0
0082abdc	adrp x8,0xd1d000
0082abe0	add x8,x8,#0x388
0082abe4	b 0x0082a598
0082abe8	adrp x0,0xd1d000
0082abec	add x0,x0,#0x448
0082abf0	bl 0x00c2fe90
0082abf4	adrp x8,0xd1d000
0082abf8	add x8,x8,#0x438
0082abfc	cbz w0,0x0082a67c
0082ac00	adrp x9,0x29a000
0082ac04	adrp x10,0x29b000
0082ac08	nop
0082ac0c	adr x0,0x82c1f4
0082ac10	ldr d0,[x9, #0x4d8]
0082ac14	ldr d1,[x10, #0x118]
0082ac18	mov w9,#0x1d9
0082ac1c	adrp x2,0xc48000
0082ac20	add x2,x2,#0x880
0082ac24	adrp x1,0xd1d000
0082ac28	add x1,x1,#0x438
0082ac2c	str d0,[x8]
0082ac30	str s1,[x8, #0x8]
0082ac34	strh w9,[x8, #0xc]
0082ac38	bl 0x00c2fe70
0082ac3c	adrp x0,0xd1d000
0082ac40	add x0,x0,#0x448
0082ac44	bl 0x00c2fea0
0082ac48	adrp x8,0xd1d000
0082ac4c	add x8,x8,#0x438
0082ac50	b 0x0082a67c
0082ac7c	bl 0x00c2fec0
