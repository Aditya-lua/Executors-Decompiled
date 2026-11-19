; FUN_0080edb4 @ 0080edb4
0080edb4	sub sp,sp,#0x60
0080edb8	stp x29,x30,[sp, #0x10]
0080edbc	stp x26,x25,[sp, #0x20]
0080edc0	stp x24,x23,[sp, #0x30]
0080edc4	stp x22,x21,[sp, #0x40]
0080edc8	stp x20,x19,[sp, #0x50]
0080edcc	add x29,sp,#0x10
0080edd0	mrs x26,tpidr_el0
0080edd4	mov w1,wzr
0080edd8	mov w2,wzr
0080eddc	ldr x8,[x26, #0x28]
0080ede0	mov x19,x0
0080ede4	str x8,[sp, #0x8]
0080ede8	bl 0x008ad0b0
0080edec	adrp x8,0xd1b000
0080edf0	add x8,x8,#0xa58
0080edf4	adrp x20,0xd1b000
0080edf8	add x20,x20,#0xa48
0080edfc	ldarb w8,[x8]
0080ee00	tbz w8,#0x0,0x00810718
0080ee04	adrp x8,0xd1b000
0080ee08	ldrb w8,[x8, #0xa55]
0080ee0c	cmp w8,#0x1
0080ee10	b.ne 0x0080ee58
0080ee14	ldr s0,[x20, #0x8]
0080ee18	adrp x8,0x29b000
0080ee1c	mov w9,#0x93
0080ee20	ldr d1,[x8, #0xb0]
0080ee24	adrp x8,0x29b000
0080ee28	strb wzr,[x20, #0xd]
0080ee2c	uxtl v0.8H,v0.8B
0080ee30	ldr d2,[x8, #0x368]
0080ee34	ldrb w8,[x20, #0xc]
0080ee38	eor w8,w8,w9
0080ee3c	eor v0.8B,v0.8B,v1.8B
0080ee40	ldr d1,[x20]
0080ee44	strb w8,[x20, #0xc]
0080ee48	eor v1.8B,v1.8B,v2.8B
0080ee4c	uzp1 v0.8B,v0.8B,v0.8B
0080ee50	str d1,[x20]
0080ee54	str s0,[x20, #0x8]
0080ee58	nop
0080ee5c	adr x20,0x811478
0080ee60	adrp x21,0xd1b000
0080ee64	add x21,x21,#0xa48
0080ee68	mov x0,x19
0080ee6c	mov x1,x20
0080ee70	mov x2,x21
0080ee74	mov w3,wzr
0080ee78	mov x4,xzr
0080ee7c	bl 0x008ac76c
0080ee80	mov x0,x19
0080ee84	mov w1,#0xffffffff
0080ee88	bl 0x008aa2e4
0080ee8c	ldr x8,[x0]
0080ee90	adrp x0,0xd1b000
0080ee94	add x0,x0,#0x9f8
0080ee98	mov x1,sp
0080ee9c	mov x2,sp
0080eea0	str x8,[sp]
0080eea4	bl 0x00807f14
0080eea8	adrp x0,0xcca000
0080eeac	add x0,x0,#0x848
0080eeb0	mov x1,sp
0080eeb4	mov x2,sp
0080eeb8	str x20,[sp]
0080eebc	bl 0x0080837c
0080eec0	mov x0,x19
0080eec4	mov w1,#0xfffffffe
0080eec8	mov x2,x21
0080eecc	bl 0x008ad800
0080eed0	adrp x8,0xd1b000
0080eed4	add x8,x8,#0xa70
0080eed8	adrp x21,0xd1b000
0080eedc	add x21,x21,#0xa60
0080eee0	ldarb w8,[x8]
0080eee4	tbz w8,#0x0,0x00810770
0080eee8	adrp x8,0xd1b000
0080eeec	ldrb w8,[x8, #0xa6d]
0080eef0	cmp w8,#0x1
0080eef4	b.ne 0x0080ef3c
0080eef8	ldr s0,[x21, #0x8]
0080eefc	adrp x8,0x29a000
0080ef00	mov w9,#0x5f
0080ef04	ldr d1,[x8, #0x190]
0080ef08	adrp x8,0x29a000
0080ef0c	strb wzr,[x21, #0xd]
0080ef10	uxtl v0.8H,v0.8B
0080ef14	ldr d2,[x8, #0xc88]
0080ef18	ldrb w8,[x21, #0xc]
0080ef1c	eor w8,w8,w9
0080ef20	eor v0.8B,v0.8B,v1.8B
0080ef24	ldr d1,[x21]
0080ef28	strb w8,[x21, #0xc]
0080ef2c	eor v1.8B,v1.8B,v2.8B
0080ef30	uzp1 v0.8B,v0.8B,v0.8B
0080ef34	str d1,[x21]
0080ef38	str s0,[x21, #0x8]
0080ef3c	nop
0080ef40	adr x21,0x811550
0080ef44	adrp x22,0xd1b000
0080ef48	add x22,x22,#0xa60
0080ef4c	mov x0,x19
0080ef50	mov x1,x21
0080ef54	mov x2,x22
0080ef58	mov w3,wzr
0080ef5c	mov x4,xzr
0080ef60	bl 0x008ac76c
0080ef64	mov x0,x19
0080ef68	mov w1,#0xffffffff
0080ef6c	bl 0x008aa2e4
0080ef70	ldr x8,[x0]
0080ef74	adrp x0,0xd1b000
0080ef78	add x0,x0,#0x9f8
0080ef7c	mov x1,sp
0080ef80	mov x2,sp
0080ef84	str x8,[sp]
0080ef88	bl 0x00807f14
0080ef8c	adrp x0,0xcca000
0080ef90	add x0,x0,#0x848
0080ef94	mov x1,sp
0080ef98	mov x2,sp
0080ef9c	str x21,[sp]
0080efa0	bl 0x0080837c
0080efa4	mov x0,x19
0080efa8	mov w1,#0xfffffffe
0080efac	mov x2,x22
0080efb0	bl 0x008ad800
0080efb4	adrp x8,0xd1b000
0080efb8	add x8,x8,#0xa88
0080efbc	adrp x22,0xd1b000
0080efc0	add x22,x22,#0xa78
0080efc4	ldarb w8,[x8]
0080efc8	tbz w8,#0x0,0x008107c8
0080efcc	adrp x8,0xd1b000
0080efd0	ldrb w8,[x8, #0xa86]
0080efd4	cmp w8,#0x1
0080efd8	b.ne 0x0080f030
0080efdc	ldr s0,[x22, #0x8]
0080efe0	adrp x8,0x29b000
0080efe4	ldr d2,[x22]
0080efe8	ldr d1,[x8, #0x180]
0080efec	adrp x8,0x29b000
0080eff0	mov w9,#0x7d
0080eff4	uxtl v0.8H,v0.8B
0080eff8	ldrb w10,[x22, #0xd]
0080effc	strb wzr,[x22, #0xe]
0080f000	eor v0.8B,v0.8B,v1.8B
0080f004	ldr d1,[x8, #0x4a8]
0080f008	ldrb w8,[x22, #0xc]
0080f00c	eor v1.8B,v2.8B,v1.8B
0080f010	eor w8,w8,w9
0080f014	mov w9,#0x63
0080f018	uzp1 v0.8B,v0.8B,v0.8B
0080f01c	eor w9,w10,w9
0080f020	strb w8,[x22, #0xc]
0080f024	strb w9,[x22, #0xd]
0080f028	str d1,[x22]
0080f02c	str s0,[x22, #0x8]
0080f030	mov x0,x19
0080f034	mov x1,x20
0080f038	mov x2,x22
0080f03c	mov w3,wzr
0080f040	mov x4,xzr
0080f044	bl 0x008ac76c
0080f048	mov x0,x19
0080f04c	mov w1,#0xffffffff
0080f050	bl 0x008aa2e4
0080f054	ldr x8,[x0]
0080f058	adrp x0,0xd1b000
0080f05c	add x0,x0,#0x9f8
0080f060	mov x1,sp
0080f064	mov x2,sp
0080f068	str x8,[sp]
0080f06c	bl 0x00807f14
0080f070	adrp x0,0xcca000
0080f074	add x0,x0,#0x848
0080f078	mov x1,sp
0080f07c	mov x2,sp
0080f080	str x20,[sp]
0080f084	bl 0x0080837c
0080f088	mov x0,x19
0080f08c	mov w1,#0xfffffffe
0080f090	mov x2,x22
0080f094	bl 0x008ad800
0080f098	adrp x8,0xd1b000
0080f09c	add x8,x8,#0xaa0
0080f0a0	adrp x22,0xd1b000
0080f0a4	add x22,x22,#0xa90
0080f0a8	ldarb w8,[x8]
0080f0ac	tbz w8,#0x0,0x00810828
0080f0b0	adrp x8,0xd1b000
0080f0b4	ldrb w8,[x8, #0xa9e]
0080f0b8	cmp w8,#0x1
0080f0bc	b.ne 0x0080f114
0080f0c0	ldr s0,[x22, #0x8]
0080f0c4	adrp x8,0x29a000
0080f0c8	ldr d2,[x22]
0080f0cc	ldr d1,[x8, #0x198]
0080f0d0	adrp x8,0x29b000
0080f0d4	mov w9,#0x3b
0080f0d8	uxtl v0.8H,v0.8B
0080f0dc	ldrb w10,[x22, #0xd]
0080f0e0	strb wzr,[x22, #0xe]
0080f0e4	eor v0.8B,v0.8B,v1.8B
0080f0e8	ldr d1,[x8, #0xa80]
0080f0ec	ldrb w8,[x22, #0xc]
0080f0f0	eor v1.8B,v2.8B,v1.8B
0080f0f4	eor w8,w8,w9
0080f0f8	mov w9,#0xe9
0080f0fc	uzp1 v0.8B,v0.8B,v0.8B
0080f100	eor w9,w10,w9
0080f104	strb w8,[x22, #0xc]
0080f108	strb w9,[x22, #0xd]
0080f10c	str d1,[x22]
0080f110	str s0,[x22, #0x8]
0080f114	mov x0,x19
0080f118	mov x1,x21
0080f11c	mov x2,x22
0080f120	mov w3,wzr
0080f124	mov x4,xzr
0080f128	bl 0x008ac76c
0080f12c	mov x0,x19
0080f130	mov w1,#0xffffffff
0080f134	bl 0x008aa2e4
0080f138	ldr x8,[x0]
0080f13c	adrp x0,0xd1b000
0080f140	add x0,x0,#0x9f8
0080f144	mov x1,sp
0080f148	mov x2,sp
0080f14c	str x8,[sp]
0080f150	bl 0x00807f14
0080f154	adrp x0,0xcca000
0080f158	add x0,x0,#0x848
0080f15c	mov x1,sp
0080f160	mov x2,sp
0080f164	str x21,[sp]
0080f168	bl 0x0080837c
0080f16c	mov x0,x19
0080f170	mov w1,#0xfffffffe
0080f174	mov x2,x22
0080f178	bl 0x008ad800
0080f17c	adrp x8,0xd1b000
0080f180	add x8,x8,#0xab8
0080f184	adrp x22,0xd1b000
0080f188	add x22,x22,#0xaa8
0080f18c	ldarb w8,[x8]
0080f190	tbz w8,#0x0,0x00810888
0080f194	adrp x8,0xd1b000
0080f198	ldrb w8,[x8, #0xab2]
0080f19c	cmp w8,#0x1
0080f1a0	b.ne 0x0080f1dc
0080f1a4	adrp x8,0x29b000
0080f1a8	ldr d0,[x22]
0080f1ac	ldrb w9,[x22, #0x8]
0080f1b0	ldr d1,[x8, #0x560]
0080f1b4	ldrb w10,[x22, #0x9]
0080f1b8	mov w8,#0xd5
0080f1bc	mov w11,#0x75
0080f1c0	eor w8,w9,w8
0080f1c4	strb wzr,[x22, #0xa]
0080f1c8	eor v0.8B,v0.8B,v1.8B
0080f1cc	eor w9,w10,w11
0080f1d0	strb w8,[x22, #0x8]
0080f1d4	strb w9,[x22, #0x9]
0080f1d8	str d0,[x22]
0080f1dc	nop
0080f1e0	adr x23,0x811610
0080f1e4	mov x0,x19
0080f1e8	mov x1,x23
0080f1ec	mov x2,x22
0080f1f0	mov w3,wzr
0080f1f4	mov x4,xzr
0080f1f8	bl 0x008ac76c
0080f1fc	mov x0,x19
0080f200	mov w1,#0xffffffff
0080f204	bl 0x008aa2e4
0080f208	ldr x8,[x0]
0080f20c	adrp x0,0xd1b000
0080f210	add x0,x0,#0x9f8
0080f214	mov x1,sp
0080f218	mov x2,sp
0080f21c	str x8,[sp]
0080f220	bl 0x00807f14
0080f224	adrp x0,0xcca000
0080f228	add x0,x0,#0x848
0080f22c	mov x1,sp
0080f230	mov x2,sp
0080f234	str x23,[sp]
0080f238	bl 0x0080837c
0080f23c	mov x0,x19
0080f240	mov w1,#0xfffffffe
0080f244	mov x2,x22
0080f248	bl 0x008ad800
0080f24c	adrp x8,0xd1b000
0080f250	add x8,x8,#0xad0
0080f254	adrp x22,0xd1b000
0080f258	add x22,x22,#0xac0
0080f25c	ldarb w8,[x8]
0080f260	tbz w8,#0x0,0x008108dc
0080f264	adrp x8,0xd1b000
0080f268	ldrb w8,[x8, #0xaca]
0080f26c	cmp w8,#0x1
0080f270	b.ne 0x0080f2ac
0080f274	adrp x8,0x29b000
0080f278	ldr d0,[x22]
0080f27c	ldrb w9,[x22, #0x8]
0080f280	ldr d1,[x8, #0x808]
0080f284	ldrb w10,[x22, #0x9]
0080f288	mov w8,#0x5f
0080f28c	mov w11,#0x5b
0080f290	eor w8,w9,w8
0080f294	strb wzr,[x22, #0xa]
0080f298	eor v0.8B,v0.8B,v1.8B
0080f29c	eor w9,w10,w11
0080f2a0	strb w8,[x22, #0x8]
0080f2a4	strb w9,[x22, #0x9]
0080f2a8	str d0,[x22]
0080f2ac	nop
0080f2b0	adr x22,0x81176c
0080f2b4	adrp x24,0xd1b000
0080f2b8	add x24,x24,#0xac0
0080f2bc	mov x0,x19
0080f2c0	mov x1,x22
0080f2c4	mov x2,x24
0080f2c8	mov w3,wzr
0080f2cc	mov x4,xzr
0080f2d0	bl 0x008ac76c
0080f2d4	mov x0,x19
0080f2d8	mov w1,#0xffffffff
0080f2dc	bl 0x008aa2e4
0080f2e0	ldr x8,[x0]
0080f2e4	adrp x0,0xd1b000
0080f2e8	add x0,x0,#0x9f8
0080f2ec	mov x1,sp
0080f2f0	mov x2,sp
0080f2f4	str x8,[sp]
0080f2f8	bl 0x00807f14
0080f2fc	adrp x0,0xcca000
0080f300	add x0,x0,#0x848
0080f304	mov x1,sp
0080f308	mov x2,sp
0080f30c	str x22,[sp]
0080f310	bl 0x0080837c
0080f314	mov x0,x19
0080f318	mov w1,#0xfffffffe
0080f31c	mov x2,x24
0080f320	bl 0x008ad800
0080f324	adrp x8,0xd1b000
0080f328	add x8,x8,#0xae8
0080f32c	ldarb w9,[x8]
0080f330	adrp x8,0xd1b000
0080f334	add x8,x8,#0xad8
0080f338	tbz w9,#0x0,0x00810930
0080f33c	adrp x9,0xd1b000
0080f340	ldrb w9,[x9, #0xae3]
0080f344	cmp w9,#0x1
0080f348	b.ne 0x0080f394
0080f34c	adrp x9,0x29b000
0080f350	ldr d0,[x8]
0080f354	ldrb w10,[x8, #0x8]
0080f358	ldrb w11,[x8, #0x9]
0080f35c	ldr d1,[x9, #0x648]
0080f360	mov w12,#0x1b
0080f364	mov w9,#0x31
0080f368	eor w10,w10,w12
0080f36c	strb wzr,[x8, #0xb]
0080f370	eor w9,w11,w9
0080f374	ldrb w11,[x8, #0xa]
0080f378	eor v0.8B,v0.8B,v1.8B
0080f37c	strb w10,[x8, #0x8]
0080f380	mov w10,#0xcb
0080f384	eor w10,w11,w10
0080f388	strb w9,[x8, #0x9]
0080f38c	strb w10,[x8, #0xa]
0080f390	str d0,[x8]
0080f394	adrp x24,0xd1b000
0080f398	add x24,x24,#0xad8
0080f39c	mov x0,x19
0080f3a0	mov x1,x23
0080f3a4	mov x2,x24
0080f3a8	mov w3,wzr
0080f3ac	mov x4,xzr
0080f3b0	bl 0x008ac76c
0080f3b4	mov x0,x19
0080f3b8	mov w1,#0xffffffff
0080f3bc	bl 0x008aa2e4
0080f3c0	ldr x8,[x0]
0080f3c4	adrp x0,0xd1b000
0080f3c8	add x0,x0,#0x9f8
0080f3cc	mov x1,sp
0080f3d0	mov x2,sp
0080f3d4	str x8,[sp]
0080f3d8	bl 0x00807f14
0080f3dc	adrp x0,0xcca000
0080f3e0	add x0,x0,#0x848
0080f3e4	mov x1,sp
0080f3e8	mov x2,sp
0080f3ec	str x23,[sp]
0080f3f0	bl 0x0080837c
0080f3f4	mov x0,x19
0080f3f8	mov w1,#0xfffffffe
0080f3fc	mov x2,x24
0080f400	bl 0x008ad800
0080f404	adrp x8,0xd1b000
0080f408	add x8,x8,#0xb00
0080f40c	ldarb w9,[x8]
0080f410	adrp x8,0xd1b000
0080f414	add x8,x8,#0xaf0
0080f418	tbz w9,#0x0,0x00810994
0080f41c	adrp x9,0xd1b000
0080f420	ldrb w9,[x9, #0xafb]
0080f424	cmp w9,#0x1
0080f428	b.ne 0x0080f470
0080f42c	adrp x10,0x29a000
0080f430	ldrb w9,[x8, #0x8]
0080f434	ldr d0,[x8]
0080f438	ldr d1,[x10, #0xb0]
0080f43c	mov w11,#0x89
0080f440	ldrb w10,[x8, #0x9]
0080f444	eor w9,w9,w11
0080f448	ldrb w11,[x8, #0xa]
0080f44c	strb wzr,[x8, #0xb]
0080f450	eor v0.8B,v0.8B,v1.8B
0080f454	strb w9,[x8, #0x8]
0080f458	mov w9,#0xb1
0080f45c	eor w10,w10,#0xfffffff1
0080f460	eor w9,w11,w9
0080f464	strb w10,[x8, #0x9]
0080f468	strb w9,[x8, #0xa]
0080f46c	str d0,[x8]
0080f470	adrp x24,0xd1b000
0080f474	add x24,x24,#0xaf0
0080f478	mov x0,x19
0080f47c	mov x1,x22
0080f480	mov x2,x24
0080f484	mov w3,wzr
0080f488	mov x4,xzr
0080f48c	bl 0x008ac76c
0080f490	mov x0,x19
0080f494	mov w1,#0xffffffff
0080f498	bl 0x008aa2e4
0080f49c	ldr x8,[x0]
0080f4a0	adrp x0,0xd1b000
0080f4a4	add x0,x0,#0x9f8
0080f4a8	mov x1,sp
0080f4ac	mov x2,sp
0080f4b0	str x8,[sp]
0080f4b4	bl 0x00807f14
0080f4b8	adrp x0,0xcca000
0080f4bc	add x0,x0,#0x848
0080f4c0	mov x1,sp
0080f4c4	mov x2,sp
0080f4c8	str x22,[sp]
0080f4cc	bl 0x0080837c
0080f4d0	mov x0,x19
0080f4d4	mov w1,#0xfffffffe
0080f4d8	mov x2,x24
0080f4dc	bl 0x008ad800
0080f4e0	adrp x8,0xd1c000
0080f4e4	add x8,x8,#0x28
0080f4e8	ldarb w9,[x8]
0080f4ec	adrp x8,0xd1c000
0080f4f0	add x8,x8,#0x18
0080f4f4	tbz w9,#0x0,0x008109f8
0080f4f8	adrp x9,0xd1c000
0080f4fc	ldrb w9,[x9, #0x20]
0080f500	cmp w9,#0x1
0080f504	b.ne 0x0080f520
0080f508	adrp x9,0x29a000
0080f50c	ldr d0,[x8]
0080f510	strb wzr,[x8, #0x8]
0080f514	ldr d1,[x9, #0x8b0]
0080f518	eor v0.8B,v0.8B,v1.8B
0080f51c	str d0,[x8]
0080f520	nop
0080f524	adr x24,0x8119f8
0080f528	adrp x25,0xd1c000
0080f52c	add x25,x25,#0x18
0080f530	mov x0,x19
0080f534	mov x1,x24
0080f538	mov x2,x25
0080f53c	mov w3,wzr
0080f540	mov x4,xzr
0080f544	bl 0x008ac76c
0080f548	mov x0,x19
0080f54c	mov w1,#0xffffffff
0080f550	bl 0x008aa2e4
0080f554	ldr x8,[x0]
0080f558	adrp x0,0xd1b000
0080f55c	add x0,x0,#0x9f8
0080f560	mov x1,sp
0080f564	mov x2,sp
0080f568	str x8,[sp]
0080f56c	bl 0x00807f14
0080f570	adrp x0,0xcca000
0080f574	add x0,x0,#0x848
0080f578	mov x1,sp
0080f57c	mov x2,sp
0080f580	str x24,[sp]
0080f584	bl 0x0080837c
0080f588	mov x0,x19
0080f58c	mov w1,#0xfffffffe
0080f590	mov x2,x25
0080f594	bl 0x008ad800
0080f598	adrp x8,0xd1c000
0080f59c	add x8,x8,#0x50
0080f5a0	ldarb w9,[x8]
0080f5a4	adrp x8,0xd1c000
0080f5a8	add x8,x8,#0x40
0080f5ac	tbz w9,#0x0,0x00810a58
0080f5b0	adrp x9,0xd1c000
0080f5b4	ldrb w9,[x9, #0x48]
0080f5b8	cmp w9,#0x1
0080f5bc	b.ne 0x0080f5d8
0080f5c0	adrp x9,0x29b000
0080f5c4	ldr d0,[x8]
0080f5c8	strb wzr,[x8, #0x8]
0080f5cc	ldr d1,[x9, #0x568]
0080f5d0	eor v0.8B,v0.8B,v1.8B
0080f5d4	str d0,[x8]
0080f5d8	nop
0080f5dc	adr x24,0x8120fc
0080f5e0	adrp x25,0xd1c000
0080f5e4	add x25,x25,#0x40
0080f5e8	mov x0,x19
0080f5ec	mov x1,x24
0080f5f0	mov x2,x25
0080f5f4	mov w3,wzr
0080f5f8	mov x4,xzr
0080f5fc	bl 0x008ac76c
0080f600	mov x0,x19
0080f604	mov w1,#0xffffffff
0080f608	bl 0x008aa2e4
0080f60c	ldr x8,[x0]
0080f610	adrp x0,0xd1b000
0080f614	add x0,x0,#0x9f8
0080f618	mov x1,sp
0080f61c	mov x2,sp
0080f620	str x8,[sp]
0080f624	bl 0x00807f14
0080f628	adrp x0,0xcca000
0080f62c	add x0,x0,#0x848
0080f630	mov x1,sp
0080f634	mov x2,sp
0080f638	str x24,[sp]
0080f63c	bl 0x0080837c
0080f640	mov x0,x19
0080f644	mov w1,#0xfffffffe
0080f648	mov x2,x25
0080f64c	bl 0x008ad800
0080f650	adrp x8,0xd1c000
0080f654	add x8,x8,#0x68
0080f658	ldarb w9,[x8]
0080f65c	adrp x8,0xd1c000
0080f660	add x8,x8,#0x58
0080f664	tbz w9,#0x0,0x00810ab8
0080f668	adrp x9,0xd1c000
0080f66c	ldrb w9,[x9, #0x66]
0080f670	cmp w9,#0x1
0080f674	b.ne 0x0080f6cc
0080f678	ldr s0,[x8, #0x8]
0080f67c	adrp x9,0x29b000
0080f680	ldr d2,[x8]
0080f684	ldr d1,[x9, #0x260]
0080f688	adrp x9,0x29b000
0080f68c	mov w10,#0xe5
0080f690	uxtl v0.8H,v0.8B
0080f694	ldrb w11,[x8, #0xd]
0080f698	strb wzr,[x8, #0xe]
0080f69c	eor v0.8B,v0.8B,v1.8B
0080f6a0	ldr d1,[x9, #0xc0]
0080f6a4	ldrb w9,[x8, #0xc]
0080f6a8	eor v1.8B,v2.8B,v1.8B
0080f6ac	eor w9,w9,w10
0080f6b0	mov w10,#0x43
0080f6b4	uzp1 v0.8B,v0.8B,v0.8B
0080f6b8	eor w10,w11,w10
0080f6bc	strb w9,[x8, #0xc]
0080f6c0	strb w10,[x8, #0xd]
0080f6c4	str d1,[x8]
0080f6c8	str s0,[x8, #0x8]
0080f6cc	nop
0080f6d0	adr x24,0x812740
0080f6d4	adrp x25,0xd1c000
0080f6d8	add x25,x25,#0x58
0080f6dc	mov x0,x19
0080f6e0	mov x1,x24
0080f6e4	mov x2,x25
0080f6e8	mov w3,wzr
0080f6ec	mov x4,xzr
0080f6f0	bl 0x008ac76c
0080f6f4	mov x0,x19
0080f6f8	mov w1,#0xffffffff
0080f6fc	bl 0x008aa2e4
0080f700	ldr x8,[x0]
0080f704	adrp x0,0xd1b000
0080f708	add x0,x0,#0x9f8
0080f70c	mov x1,sp
0080f710	mov x2,sp
0080f714	str x8,[sp]
0080f718	bl 0x00807f14
0080f71c	adrp x0,0xcca000
0080f720	add x0,x0,#0x848
0080f724	mov x1,sp
0080f728	mov x2,sp
0080f72c	str x24,[sp]
0080f730	bl 0x0080837c
0080f734	mov x0,x19
0080f738	mov w1,#0xfffffffe
0080f73c	mov x2,x25
0080f740	bl 0x008ad800
0080f744	adrp x8,0xd1c000
0080f748	add x8,x8,#0x80
0080f74c	ldarb w9,[x8]
0080f750	adrp x8,0xd1c000
0080f754	add x8,x8,#0x70
0080f758	tbz w9,#0x0,0x00810b2c
0080f75c	adrp x9,0xd1c000
0080f760	ldrb w9,[x9, #0x7c]
0080f764	cmp w9,#0x1
0080f768	b.ne 0x0080f7a0
0080f76c	ldr s0,[x8, #0x8]
0080f770	adrp x9,0x29a000
0080f774	strb wzr,[x8, #0xc]
0080f778	ldr d1,[x9, #0xc90]
0080f77c	adrp x9,0x29a000
0080f780	uxtl v0.8H,v0.8B
0080f784	ldr d2,[x9, #0x6c0]
0080f788	eor v0.8B,v0.8B,v1.8B
0080f78c	ldr d1,[x8]
0080f790	eor v1.8B,v1.8B,v2.8B
0080f794	uzp1 v0.8B,v0.8B,v0.8B
0080f798	str d1,[x8]
0080f79c	str s0,[x8, #0x8]
0080f7a0	nop
0080f7a4	adr x24,0x812864
0080f7a8	adrp x25,0xd1c000
0080f7ac	add x25,x25,#0x70
0080f7b0	mov x0,x19
0080f7b4	mov x1,x24
0080f7b8	mov x2,x25
0080f7bc	mov w3,wzr
0080f7c0	mov x4,xzr
0080f7c4	bl 0x008ac76c
0080f7c8	mov x0,x19
0080f7cc	mov w1,#0xffffffff
0080f7d0	bl 0x008aa2e4
0080f7d4	ldr x8,[x0]
0080f7d8	adrp x0,0xd1b000
0080f7dc	add x0,x0,#0x9f8
0080f7e0	mov x1,sp
0080f7e4	mov x2,sp
0080f7e8	str x8,[sp]
0080f7ec	bl 0x00807f14
0080f7f0	adrp x0,0xcca000
0080f7f4	add x0,x0,#0x848
0080f7f8	mov x1,sp
0080f7fc	mov x2,sp
0080f800	str x24,[sp]
0080f804	bl 0x0080837c
0080f808	mov x0,x19
0080f80c	mov w1,#0xfffffffe
0080f810	mov x2,x25
0080f814	bl 0x008ad800
0080f818	adrp x8,0xd1c000
0080f81c	add x8,x8,#0x90
0080f820	ldarb w9,[x8]
0080f824	adrp x8,0xd1c000
0080f828	add x8,x8,#0x88
0080f82c	tbz w9,#0x0,0x00810b98
0080f830	adrp x9,0xd1c000
0080f834	ldrb w9,[x9, #0x8f]
0080f838	cmp w9,#0x1
0080f83c	b.ne 0x0080f88c
0080f840	ldr s0,[x8]
0080f844	adrp x9,0x29b000
0080f848	mov w10,#0x4f
0080f84c	ldr d1,[x9, #0x4b0]
0080f850	ldrb w9,[x8, #0x4]
0080f854	ldrb w11,[x8, #0x5]
0080f858	uxtl v0.8H,v0.8B
0080f85c	mov w12,#0xe9
0080f860	strb wzr,[x8, #0x7]
0080f864	eor w9,w9,w10
0080f868	ldrb w10,[x8, #0x6]
0080f86c	eor w11,w11,w12
0080f870	strb w9,[x8, #0x4]
0080f874	eor v0.8B,v0.8B,v1.8B
0080f878	eor w9,w10,#0xffffffcf
0080f87c	strb w11,[x8, #0x5]
0080f880	strb w9,[x8, #0x6]
0080f884	uzp1 v0.8B,v0.8B,v0.8B
0080f888	str s0,[x8]
0080f88c	nop
0080f890	adr x24,0x812974
0080f894	adrp x25,0xd1c000
0080f898	add x25,x25,#0x88
0080f89c	mov x0,x19
0080f8a0	mov x1,x24
0080f8a4	mov x2,x25
0080f8a8	mov w3,wzr
0080f8ac	mov x4,xzr
0080f8b0	bl 0x008ac76c
0080f8b4	mov x0,x19
0080f8b8	mov w1,#0xffffffff
0080f8bc	bl 0x008aa2e4
0080f8c0	ldr x8,[x0]
0080f8c4	adrp x0,0xd1b000
0080f8c8	add x0,x0,#0x9f8
0080f8cc	mov x1,sp
0080f8d0	mov x2,sp
0080f8d4	str x8,[sp]
0080f8d8	bl 0x00807f14
0080f8dc	adrp x0,0xcca000
0080f8e0	add x0,x0,#0x848
0080f8e4	mov x1,sp
0080f8e8	mov x2,sp
0080f8ec	str x24,[sp]
0080f8f0	bl 0x0080837c
0080f8f4	mov x0,x19
0080f8f8	mov w1,#0xfffffffe
0080f8fc	mov x2,x25
0080f900	bl 0x008ad800
0080f904	adrp x8,0xd1c000
0080f908	add x8,x8,#0x170
0080f90c	ldarb w9,[x8]
0080f910	adrp x8,0xd1c000
0080f914	add x8,x8,#0x168
0080f918	tbz w9,#0x0,0x00810bf0
0080f91c	adrp x9,0xd1c000
0080f920	ldrb w9,[x9, #0x16d]
0080f924	cmp w9,#0x1
0080f928	b.ne 0x0080f958
0080f92c	ldr s0,[x8]
0080f930	adrp x9,0x29b000
0080f934	strb wzr,[x8, #0x5]
0080f938	ldr d1,[x9, #0x578]
0080f93c	ldrb w9,[x8, #0x4]
0080f940	uxtl v0.8H,v0.8B
0080f944	eor w9,w9,#0x1
0080f948	strb w9,[x8, #0x4]
0080f94c	eor v0.8B,v0.8B,v1.8B
0080f950	uzp1 v0.8B,v0.8B,v0.8B
0080f954	str s0,[x8]
0080f958	nop
0080f95c	adr x24,0x812a3c
0080f960	adrp x25,0xd1c000
0080f964	add x25,x25,#0x168
0080f968	mov x0,x19
0080f96c	mov x1,x24
0080f970	mov x2,x25
0080f974	mov w3,wzr
0080f978	mov x4,xzr
0080f97c	bl 0x008ac76c
0080f980	mov x0,x19
0080f984	mov w1,#0xffffffff
0080f988	bl 0x008aa2e4
0080f98c	ldr x8,[x0]
0080f990	adrp x0,0xd1b000
0080f994	add x0,x0,#0x9f8
0080f998	mov x1,sp
0080f99c	mov x2,sp
0080f9a0	str x8,[sp]
0080f9a4	bl 0x00807f14
0080f9a8	adrp x0,0xcca000
0080f9ac	add x0,x0,#0x848
0080f9b0	mov x1,sp
0080f9b4	mov x2,sp
0080f9b8	str x24,[sp]
0080f9bc	bl 0x0080837c
0080f9c0	mov x0,x19
0080f9c4	mov w1,#0xfffffffe
0080f9c8	mov x2,x25
0080f9cc	bl 0x008ad800
0080f9d0	adrp x8,0xd1c000
0080f9d4	add x8,x8,#0x190
0080f9d8	ldarb w9,[x8]
0080f9dc	adrp x8,0xd1c000
0080f9e0	add x8,x8,#0x188
0080f9e4	tbz w9,#0x0,0x00810c50
0080f9e8	adrp x9,0xd1c000
0080f9ec	ldrb w9,[x9, #0x18d]
0080f9f0	cmp w9,#0x1
0080f9f4	b.ne 0x0080fa28
0080f9f8	ldr s0,[x8]
0080f9fc	adrp x9,0x29a000
0080fa00	mov w10,#0xe5
0080fa04	ldr d1,[x9, #0x440]
0080fa08	ldrb w9,[x8, #0x4]
0080fa0c	strb wzr,[x8, #0x5]
0080fa10	uxtl v0.8H,v0.8B
0080fa14	eor w9,w9,w10
0080fa18	strb w9,[x8, #0x4]
0080fa1c	eor v0.8B,v0.8B,v1.8B
0080fa20	uzp1 v0.8B,v0.8B,v0.8B
0080fa24	str s0,[x8]
0080fa28	nop
0080fa2c	adr x24,0x813460
0080fa30	adrp x25,0xd1c000
0080fa34	add x25,x25,#0x188
0080fa38	mov x0,x19
0080fa3c	mov x1,x24
0080fa40	mov x2,x25
0080fa44	mov w3,wzr
0080fa48	mov x4,xzr
0080fa4c	bl 0x008ac76c
0080fa50	mov x0,x19
0080fa54	mov w1,#0xffffffff
0080fa58	bl 0x008aa2e4
0080fa5c	ldr x8,[x0]
0080fa60	adrp x0,0xd1b000
0080fa64	add x0,x0,#0x9f8
0080fa68	mov x1,sp
0080fa6c	mov x2,sp
0080fa70	str x8,[sp]
0080fa74	bl 0x00807f14
0080fa78	adrp x0,0xcca000
0080fa7c	add x0,x0,#0x848
0080fa80	mov x1,sp
0080fa84	mov x2,sp
0080fa88	str x24,[sp]
0080fa8c	bl 0x0080837c
0080fa90	mov x0,x19
0080fa94	mov w1,#0xfffffffe
0080fa98	mov x2,x25
0080fa9c	bl 0x008ad800
0080faa0	mov x0,x19
0080faa4	mov w1,wzr
0080faa8	mov w2,wzr
0080faac	bl 0x008ad0b0
0080fab0	adrp x8,0xd1c000
0080fab4	add x8,x8,#0x1a0
0080fab8	ldarb w9,[x8]
0080fabc	adrp x8,0xd1c000
0080fac0	add x8,x8,#0x198
0080fac4	tbz w9,#0x0,0x00810cb0
0080fac8	adrp x9,0xd1c000
0080facc	ldrb w9,[x9, #0x19f]
0080fad0	cmp w9,#0x1
0080fad4	b.ne 0x0080fb24
0080fad8	ldr s0,[x8]
0080fadc	adrp x9,0x29a000
0080fae0	ldrb w10,[x8, #0x5]
0080fae4	ldr d1,[x9, #0xea0]
0080fae8	ldrb w9,[x8, #0x4]
0080faec	mov w11,#0x91
0080faf0	uxtl v0.8H,v0.8B
0080faf4	ldrb w12,[x8, #0x6]
0080faf8	eor w10,w10,w11
0080fafc	eor w9,w9,#0xffffff8f
0080fb00	strb w10,[x8, #0x5]
0080fb04	strb w9,[x8, #0x4]
0080fb08	mov w9,#0x3b
0080fb0c	eor v0.8B,v0.8B,v1.8B
0080fb10	eor w9,w12,w9
0080fb14	strb wzr,[x8, #0x7]
0080fb18	strb w9,[x8, #0x6]
0080fb1c	uzp1 v0.8B,v0.8B,v0.8B
0080fb20	str s0,[x8]
0080fb24	adrp x24,0xd1c000
0080fb28	add x24,x24,#0x198
0080fb2c	mov x0,x19
0080fb30	mov x1,x20
0080fb34	mov x2,x24
0080fb38	mov w3,wzr
0080fb3c	mov x4,xzr
0080fb40	bl 0x008ac76c
0080fb44	mov x0,x19
0080fb48	mov w1,#0xffffffff
0080fb4c	bl 0x008aa2e4
0080fb50	ldr x8,[x0]
0080fb54	adrp x0,0xd1b000
0080fb58	add x0,x0,#0x9f8
0080fb5c	mov x1,sp
0080fb60	mov x2,sp
0080fb64	str x8,[sp]
0080fb68	bl 0x00807f14
0080fb6c	adrp x0,0xcca000
0080fb70	add x0,x0,#0x848
0080fb74	mov x1,sp
0080fb78	mov x2,sp
0080fb7c	str x20,[sp]
0080fb80	bl 0x0080837c
0080fb84	mov x0,x19
0080fb88	mov w1,#0xfffffffe
0080fb8c	mov x2,x24
0080fb90	bl 0x008ad800
0080fb94	adrp x8,0xd1c000
0080fb98	add x8,x8,#0x1b0
0080fb9c	ldarb w9,[x8]
0080fba0	adrp x8,0xd1c000
0080fba4	add x8,x8,#0x1a8
0080fba8	tbz w9,#0x0,0x00810d08
0080fbac	adrp x9,0xd1c000
0080fbb0	ldrb w9,[x9, #0x1af]
0080fbb4	cmp w9,#0x1
0080fbb8	b.ne 0x0080fc08
0080fbbc	ldr s0,[x8]
0080fbc0	adrp x9,0x29a000
0080fbc4	mov w10,#0x75
0080fbc8	ldr d1,[x9, #0xd70]
0080fbcc	ldrb w9,[x8, #0x4]
0080fbd0	ldrb w11,[x8, #0x5]
0080fbd4	uxtl v0.8H,v0.8B
0080fbd8	strb wzr,[x8, #0x7]
0080fbdc	eor w9,w9,w10
0080fbe0	ldrb w10,[x8, #0x6]
0080fbe4	eor w11,w11,#0x3f
0080fbe8	strb w9,[x8, #0x4]
0080fbec	mov w9,#0xbd
0080fbf0	eor v0.8B,v0.8B,v1.8B
0080fbf4	eor w9,w10,w9
0080fbf8	strb w11,[x8, #0x5]
0080fbfc	strb w9,[x8, #0x6]
0080fc00	uzp1 v0.8B,v0.8B,v0.8B
0080fc04	str s0,[x8]
0080fc08	adrp x24,0xd1c000
0080fc0c	add x24,x24,#0x1a8
0080fc10	mov x0,x19
0080fc14	mov x1,x21
0080fc18	mov x2,x24
0080fc1c	mov w3,wzr
0080fc20	mov x4,xzr
0080fc24	bl 0x008ac76c
0080fc28	mov x0,x19
0080fc2c	mov w1,#0xffffffff
0080fc30	bl 0x008aa2e4
0080fc34	ldr x8,[x0]
0080fc38	adrp x0,0xd1b000
0080fc3c	add x0,x0,#0x9f8
0080fc40	mov x1,sp
0080fc44	mov x2,sp
0080fc48	str x8,[sp]
0080fc4c	bl 0x00807f14
0080fc50	adrp x0,0xcca000
0080fc54	add x0,x0,#0x848
0080fc58	mov x1,sp
0080fc5c	mov x2,sp
0080fc60	str x21,[sp]
0080fc64	bl 0x0080837c
0080fc68	mov x0,x19
0080fc6c	mov w1,#0xfffffffe
0080fc70	mov x2,x24
0080fc74	bl 0x008ad800
0080fc78	adrp x8,0xd1c000
0080fc7c	add x8,x8,#0x1c0
0080fc80	ldarb w9,[x8]
0080fc84	adrp x8,0xd1c000
0080fc88	add x8,x8,#0x1b8
0080fc8c	tbz w9,#0x0,0x00810d60
0080fc90	adrp x9,0xd1c000
0080fc94	ldrb w9,[x9, #0x1bf]
0080fc98	cmp w9,#0x1
0080fc9c	b.ne 0x0080fcf0
0080fca0	ldr s0,[x8]
0080fca4	adrp x9,0x29b000
0080fca8	mov w10,#0x2b
0080fcac	ldr d1,[x9, #0xa88]
0080fcb0	ldrb w9,[x8, #0x4]
0080fcb4	ldrb w11,[x8, #0x5]
0080fcb8	uxtl v0.8H,v0.8B
0080fcbc	mov w12,#0x95
0080fcc0	strb wzr,[x8, #0x7]
0080fcc4	eor w9,w9,w10
0080fcc8	ldrb w10,[x8, #0x6]
0080fccc	eor w11,w11,w12
0080fcd0	strb w9,[x8, #0x4]
0080fcd4	mov w9,#0x6d
0080fcd8	eor v0.8B,v0.8B,v1.8B
0080fcdc	eor w9,w10,w9
0080fce0	strb w11,[x8, #0x5]
0080fce4	strb w9,[x8, #0x6]
0080fce8	uzp1 v0.8B,v0.8B,v0.8B
0080fcec	str s0,[x8]
0080fcf0	adrp x2,0xd1c000
0080fcf4	add x2,x2,#0x1b8
0080fcf8	mov x0,x19
0080fcfc	mov w1,#0xfffffffe
0080fd00	bl 0x008ad800
0080fd04	mov x0,x19
0080fd08	mov w1,wzr
0080fd0c	mov w2,wzr
0080fd10	bl 0x008ad0b0
0080fd14	adrp x8,0xd1c000
0080fd18	add x8,x8,#0x1d0
0080fd1c	ldarb w9,[x8]
0080fd20	adrp x8,0xd1c000
0080fd24	add x8,x8,#0x1c8
0080fd28	tbz w9,#0x0,0x00810db8
0080fd2c	adrp x9,0xd1c000
0080fd30	ldrb w9,[x9, #0x1cf]
0080fd34	cmp w9,#0x1
0080fd38	b.ne 0x0080fd84
0080fd3c	ldr s0,[x8]
0080fd40	adrp x9,0x29a000
0080fd44	mov w10,#0x91
0080fd48	ldr d1,[x9, #0x448]
0080fd4c	ldrb w9,[x8, #0x4]
0080fd50	ldrb w11,[x8, #0x5]
0080fd54	uxtl v0.8H,v0.8B
0080fd58	strb wzr,[x8, #0x7]
0080fd5c	eor w9,w9,w10
0080fd60	ldrb w10,[x8, #0x6]
0080fd64	strb w9,[x8, #0x4]
0080fd68	eor w9,w11,#0xffffffdf
0080fd6c	eor v0.8B,v0.8B,v1.8B
0080fd70	eor w10,w10,#0x3f
0080fd74	strb w9,[x8, #0x5]
0080fd78	strb w10,[x8, #0x6]
0080fd7c	uzp1 v0.8B,v0.8B,v0.8B
0080fd80	str s0,[x8]
0080fd84	adrp x24,0xd1c000
0080fd88	add x24,x24,#0x1c8
0080fd8c	mov x0,x19
0080fd90	mov x1,x23
0080fd94	mov x2,x24
0080fd98	mov w3,wzr
0080fd9c	mov x4,xzr
0080fda0	bl 0x008ac76c
0080fda4	mov x0,x19
0080fda8	mov w1,#0xffffffff
0080fdac	bl 0x008aa2e4
0080fdb0	ldr x8,[x0]
0080fdb4	adrp x0,0xd1b000
0080fdb8	add x0,x0,#0x9f8
0080fdbc	mov x1,sp
0080fdc0	mov x2,sp
0080fdc4	str x8,[sp]
0080fdc8	bl 0x00807f14
0080fdcc	adrp x0,0xcca000
0080fdd0	add x0,x0,#0x848
0080fdd4	mov x1,sp
0080fdd8	mov x2,sp
0080fddc	str x23,[sp]
0080fde0	bl 0x0080837c
0080fde4	mov x0,x19
0080fde8	mov w1,#0xfffffffe
0080fdec	mov x2,x24
0080fdf0	bl 0x008ad800
0080fdf4	adrp x8,0xd1c000
0080fdf8	add x8,x8,#0x1e0
0080fdfc	ldarb w9,[x8]
0080fe00	adrp x8,0xd1c000
0080fe04	add x8,x8,#0x1d8
0080fe08	tbz w9,#0x0,0x00810e10
0080fe0c	adrp x9,0xd1c000
0080fe10	ldrb w9,[x9, #0x1df]
0080fe14	cmp w9,#0x1
0080fe18	b.ne 0x0080fe6c
0080fe1c	ldr s0,[x8]
0080fe20	adrp x9,0x29a000
0080fe24	mov w10,#0x17
0080fe28	ldr d1,[x9, #0x6c8]
0080fe2c	ldrb w9,[x8, #0x4]
0080fe30	ldrb w11,[x8, #0x5]
0080fe34	uxtl v0.8H,v0.8B
0080fe38	mov w12,#0x4d
0080fe3c	strb wzr,[x8, #0x7]
0080fe40	eor w9,w9,w10
0080fe44	ldrb w10,[x8, #0x6]
0080fe48	eor w11,w11,w12
0080fe4c	strb w9,[x8, #0x4]
0080fe50	mov w9,#0xd7
0080fe54	eor v0.8B,v0.8B,v1.8B
0080fe58	eor w9,w10,w9
0080fe5c	strb w11,[x8, #0x5]
0080fe60	strb w9,[x8, #0x6]
0080fe64	uzp1 v0.8B,v0.8B,v0.8B
0080fe68	str s0,[x8]
0080fe6c	adrp x24,0xd1c000
0080fe70	add x24,x24,#0x1d8
0080fe74	mov x0,x19
0080fe78	mov x1,x22
0080fe7c	mov x2,x24
0080fe80	mov w3,wzr
0080fe84	mov x4,xzr
0080fe88	bl 0x008ac76c
0080fe8c	mov x0,x19
0080fe90	mov w1,#0xffffffff
0080fe94	bl 0x008aa2e4
0080fe98	ldr x8,[x0]
0080fe9c	adrp x0,0xd1b000
0080fea0	add x0,x0,#0x9f8
0080fea4	mov x1,sp
0080fea8	mov x2,sp
0080feac	str x8,[sp]
0080feb0	bl 0x00807f14
0080feb4	adrp x0,0xcca000
0080feb8	add x0,x0,#0x848
0080febc	mov x1,sp
0080fec0	mov x2,sp
0080fec4	str x22,[sp]
0080fec8	bl 0x0080837c
0080fecc	mov x0,x19
0080fed0	mov w1,#0xfffffffe
0080fed4	mov x2,x24
0080fed8	bl 0x008ad800
0080fedc	adrp x8,0xd1c000
0080fee0	add x8,x8,#0x1f0
0080fee4	ldarb w9,[x8]
0080fee8	adrp x8,0xd1c000
0080feec	add x8,x8,#0x1e8
0080fef0	tbz w9,#0x0,0x00810e68
0080fef4	adrp x9,0xd1c000
0080fef8	ldrb w9,[x9, #0x1ec]
0080fefc	cmp w9,#0x1
0080ff00	b.ne 0x0080ff24
0080ff04	ldr s0,[x8]
0080ff08	adrp x9,0x29a000
0080ff0c	strb wzr,[x8, #0x4]
0080ff10	ldr d1,[x9, #0xae0]
0080ff14	uxtl v0.8H,v0.8B
0080ff18	eor v0.8B,v0.8B,v1.8B
0080ff1c	uzp1 v0.8B,v0.8B,v0.8B
0080ff20	str s0,[x8]
0080ff24	adrp x2,0xd1c000
0080ff28	add x2,x2,#0x1e8
0080ff2c	mov x0,x19
0080ff30	mov w1,#0xfffffffe
0080ff34	bl 0x008ad800
0080ff38	adrp x8,0xd1c000
0080ff3c	add x8,x8,#0x200
0080ff40	ldarb w9,[x8]
0080ff44	adrp x8,0xd1c000
0080ff48	add x8,x8,#0x1f8
0080ff4c	tbz w9,#0x0,0x00810ec8
0080ff50	adrp x9,0xd1c000
0080ff54	ldrb w9,[x9, #0x1fe]
0080ff58	cmp w9,#0x1
0080ff5c	b.ne 0x0080ff9c
0080ff60	ldr s0,[x8]
0080ff64	adrp x9,0x29a000
0080ff68	ldrb w11,[x8, #0x5]
0080ff6c	ldr d1,[x9, #0x1a0]
0080ff70	ldrb w9,[x8, #0x4]
0080ff74	mov w10,#0xa3
0080ff78	uxtl v0.8H,v0.8B
0080ff7c	strb wzr,[x8, #0x6]
0080ff80	eor w9,w9,w10
0080ff84	eor w10,w11,#0xfffffff1
0080ff88	strb w9,[x8, #0x4]
0080ff8c	eor v0.8B,v0.8B,v1.8B
0080ff90	strb w10,[x8, #0x5]
0080ff94	uzp1 v0.8B,v0.8B,v0.8B
0080ff98	str s0,[x8]
0080ff9c	adrp x1,0xd1c000
0080ffa0	add x1,x1,#0x1f8
0080ffa4	mov x0,x19
0080ffa8	bl 0x00807e7c
0080ffac	mov x0,x19
0080ffb0	mov w1,wzr
0080ffb4	mov w2,wzr
0080ffb8	bl 0x008ad0b0
0080ffbc	adrp x8,0xd1c000
0080ffc0	add x8,x8,#0x210
0080ffc4	ldarb w9,[x8]
0080ffc8	adrp x8,0xd1c000
0080ffcc	add x8,x8,#0x208
0080ffd0	tbz w9,#0x0,0x00810f30
0080ffd4	adrp x9,0xd1c000
0080ffd8	ldrb w9,[x9, #0x20f]
0080ffdc	cmp w9,#0x1
0080ffe0	b.ne 0x00810034
0080ffe4	ldr s0,[x8]
0080ffe8	adrp x9,0x29a000
0080ffec	mov w10,#0xed
0080fff0	ldr d1,[x9, #0x8c0]
0080fff4	ldrb w9,[x8, #0x4]
0080fff8	ldrb w11,[x8, #0x5]
0080fffc	uxtl v0.8H,v0.8B
00810000	mov w12,#0xad
00810004	strb wzr,[x8, #0x7]
00810008	eor w9,w9,w10
0081000c	ldrb w10,[x8, #0x6]
00810010	eor w11,w11,w12
00810014	strb w9,[x8, #0x4]
00810018	mov w9,#0x45
0081001c	eor v0.8B,v0.8B,v1.8B
00810020	eor w9,w10,w9
00810024	strb w11,[x8, #0x5]
00810028	strb w9,[x8, #0x6]
0081002c	uzp1 v0.8B,v0.8B,v0.8B
00810030	str s0,[x8]
00810034	adrp x24,0xd1c000
00810038	add x24,x24,#0x208
0081003c	mov x0,x19
00810040	mov x1,x20
00810044	mov x2,x24
00810048	mov w3,wzr
0081004c	mov x4,xzr
00810050	bl 0x008ac76c
00810054	mov x0,x19
00810058	mov w1,#0xffffffff
0081005c	bl 0x008aa2e4
00810060	ldr x8,[x0]
00810064	adrp x0,0xd1b000
00810068	add x0,x0,#0x9f8
0081006c	mov x1,sp
00810070	mov x2,sp
00810074	str x8,[sp]
00810078	bl 0x00807f14
0081007c	adrp x0,0xcca000
00810080	add x0,x0,#0x848
00810084	mov x1,sp
00810088	mov x2,sp
0081008c	str x20,[sp]
00810090	bl 0x0080837c
00810094	mov x0,x19
00810098	mov w1,#0xfffffffe
0081009c	mov x2,x24
008100a0	bl 0x008ad800
008100a4	adrp x8,0xd1c000
008100a8	add x8,x8,#0x220
008100ac	adrp x20,0xd1c000
008100b0	add x20,x20,#0x218
008100b4	ldarb w8,[x8]
008100b8	tbz w8,#0x0,0x00810f88
008100bc	adrp x8,0xd1c000
008100c0	ldrb w8,[x8, #0x21f]
008100c4	cmp w8,#0x1
008100c8	b.ne 0x00810118
008100cc	ldr s0,[x20]
008100d0	adrp x8,0x29a000
008100d4	mov w9,#0x6d
008100d8	ldr d1,[x8, #0x7c0]
008100dc	ldrb w8,[x20, #0x4]
008100e0	ldrb w10,[x20, #0x5]
008100e4	uxtl v0.8H,v0.8B
008100e8	mov w11,#0x39
008100ec	strb wzr,[x20, #0x7]
008100f0	eor w8,w8,w9
008100f4	ldrb w9,[x20, #0x6]
008100f8	eor w10,w10,w11
008100fc	strb w8,[x20, #0x4]
00810100	eor v0.8B,v0.8B,v1.8B
00810104	eor w8,w9,#0x3f
00810108	strb w10,[x20, #0x5]
0081010c	strb w8,[x20, #0x6]
00810110	uzp1 v0.8B,v0.8B,v0.8B
00810114	str s0,[x20]
00810118	mov x0,x19
0081011c	mov x1,x21
00810120	mov x2,x20
00810124	mov w3,wzr
00810128	mov x4,xzr
0081012c	bl 0x008ac76c
00810130	mov x0,x19
00810134	mov w1,#0xffffffff
00810138	bl 0x008aa2e4
0081013c	ldr x8,[x0]
00810140	adrp x0,0xd1b000
00810144	add x0,x0,#0x9f8
00810148	mov x1,sp
0081014c	mov x2,sp
00810150	str x8,[sp]
00810154	bl 0x00807f14
00810158	adrp x0,0xcca000
0081015c	add x0,x0,#0x848
00810160	mov x1,sp
00810164	mov x2,sp
00810168	str x21,[sp]
0081016c	bl 0x0080837c
00810170	mov x0,x19
00810174	mov w1,#0xfffffffe
00810178	mov x2,x20
0081017c	bl 0x008ad800
00810180	adrp x8,0xd1c000
00810184	add x8,x8,#0x230
00810188	adrp x20,0xd1c000
0081018c	add x20,x20,#0x228
00810190	ldarb w8,[x8]
00810194	tbz w8,#0x0,0x00810fcc
00810198	adrp x8,0xd1c000
0081019c	ldrb w8,[x8, #0x22f]
008101a0	cmp w8,#0x1
008101a4	b.ne 0x008101f4
008101a8	ldr s0,[x20]
008101ac	adrp x8,0x29b000
008101b0	ldrb w9,[x20, #0x5]
008101b4	ldr d1,[x8, #0x9b8]
008101b8	ldrb w8,[x20, #0x4]
008101bc	mov w10,#0x51
008101c0	uxtl v0.8H,v0.8B
008101c4	ldrb w11,[x20, #0x6]
008101c8	eor w9,w9,w10
008101cc	eor w8,w8,#0xffffff87
008101d0	strb w9,[x20, #0x5]
008101d4	strb w8,[x20, #0x4]
008101d8	mov w8,#0x13
008101dc	eor v0.8B,v0.8B,v1.8B
008101e0	eor w8,w11,w8
008101e4	strb wzr,[x20, #0x7]
008101e8	strb w8,[x20, #0x6]
008101ec	uzp1 v0.8B,v0.8B,v0.8B
008101f0	str s0,[x20]
008101f4	adrp x1,0xd1c000
008101f8	add x1,x1,#0x228
008101fc	mov x0,x19
00810200	bl 0x00807e7c
00810204	mov x0,x19
00810208	mov w1,wzr
0081020c	mov w2,wzr
00810210	bl 0x008ad0b0
00810214	adrp x8,0xd1c000
00810218	add x8,x8,#0x240
0081021c	adrp x20,0xd1c000
00810220	add x20,x20,#0x238
00810224	ldarb w8,[x8]
00810228	tbz w8,#0x0,0x00811010
0081022c	adrp x8,0xd1c000
00810230	ldrb w8,[x8, #0x23f]
00810234	cmp w8,#0x1
00810238	b.ne 0x0081028c
0081023c	ldr s0,[x20]
00810240	adrp x8,0x29b000
00810244	mov w9,#0xc9
00810248	ldr d1,[x8, #0x248]
0081024c	ldrb w8,[x20, #0x4]
00810250	ldrb w10,[x20, #0x5]
00810254	uxtl v0.8H,v0.8B
00810258	mov w11,#0x93
0081025c	strb wzr,[x20, #0x7]
00810260	eor w8,w8,w9
00810264	ldrb w9,[x20, #0x6]
00810268	eor w10,w10,w11
0081026c	strb w8,[x20, #0x4]
00810270	mov w8,#0x41
00810274	eor v0.8B,v0.8B,v1.8B
00810278	eor w8,w9,w8
0081027c	strb w10,[x20, #0x5]
00810280	strb w8,[x20, #0x6]
00810284	uzp1 v0.8B,v0.8B,v0.8B
00810288	str s0,[x20]
0081028c	mov x0,x19
00810290	mov x1,x23
00810294	mov x2,x20
00810298	mov w3,wzr
0081029c	mov x4,xzr
008102a0	bl 0x008ac76c
008102a4	mov x0,x19
008102a8	mov w1,#0xffffffff
008102ac	bl 0x008aa2e4
008102b0	ldr x8,[x0]
008102b4	adrp x0,0xd1b000
008102b8	add x0,x0,#0x9f8
008102bc	mov x1,sp
008102c0	mov x2,sp
008102c4	str x8,[sp]
008102c8	bl 0x00807f14
008102cc	adrp x0,0xcca000
008102d0	add x0,x0,#0x848
008102d4	mov x1,sp
008102d8	mov x2,sp
008102dc	str x23,[sp]
008102e0	bl 0x0080837c
008102e4	mov x0,x19
008102e8	mov w1,#0xfffffffe
008102ec	mov x2,x20
008102f0	bl 0x008ad800
008102f4	adrp x8,0xd1c000
008102f8	add x8,x8,#0x250
008102fc	adrp x20,0xd1c000
00810300	add x20,x20,#0x248
00810304	ldarb w8,[x8]
00810308	tbz w8,#0x0,0x00811054
0081030c	adrp x8,0xd1c000
00810310	ldrb w8,[x8, #0x24f]
00810314	cmp w8,#0x1
00810318	b.ne 0x00810364
0081031c	ldr s0,[x20]
00810320	adrp x8,0x29b000
00810324	ldrb w9,[x20, #0x5]
00810328	ldr d1,[x8, #0xbd0]
0081032c	ldrb w8,[x20, #0x4]
00810330	mov w10,#0x25
00810334	uxtl v0.8H,v0.8B
00810338	ldrb w11,[x20, #0x6]
0081033c	eor w9,w9,w10
00810340	eor w8,w8,#0x55555555
00810344	strb w9,[x20, #0x5]
00810348	strb w8,[x20, #0x4]
0081034c	eor w8,w11,#0xfffffffd
00810350	eor v0.8B,v0.8B,v1.8B
00810354	strb w8,[x20, #0x6]
00810358	strb wzr,[x20, #0x7]
0081035c	uzp1 v0.8B,v0.8B,v0.8B
00810360	str s0,[x20]
00810364	mov x0,x19
00810368	mov x1,x22
0081036c	mov x2,x20
00810370	mov w3,wzr
00810374	mov x4,xzr
00810378	bl 0x008ac76c
0081037c	mov x0,x19
00810380	mov w1,#0xffffffff
00810384	bl 0x008aa2e4
00810388	ldr x8,[x0]
0081038c	adrp x0,0xd1b000
00810390	add x0,x0,#0x9f8
00810394	mov x1,sp
00810398	mov x2,sp
0081039c	str x8,[sp]
008103a0	bl 0x00807f14
008103a4	adrp x0,0xcca000
008103a8	add x0,x0,#0x848
008103ac	mov x1,sp
008103b0	mov x2,sp
008103b4	str x22,[sp]
008103b8	bl 0x0080837c
008103bc	mov x0,x19
008103c0	mov w1,#0xfffffffe
008103c4	mov x2,x20
008103c8	bl 0x008ad800
008103cc	adrp x8,0xd1c000
008103d0	add x8,x8,#0x260
008103d4	adrp x20,0xd1c000
008103d8	add x20,x20,#0x258
008103dc	ldarb w8,[x8]
008103e0	tbz w8,#0x0,0x00811098
008103e4	adrp x8,0xd1c000
008103e8	ldrb w8,[x8, #0x25c]
008103ec	cmp w8,#0x1
008103f0	b.ne 0x00810414
008103f4	ldr s0,[x20]
008103f8	adrp x8,0x29b000
008103fc	strb wzr,[x20, #0x4]
00810400	ldr d1,[x8, #0xc08]
00810404	uxtl v0.8H,v0.8B
00810408	eor v0.8B,v0.8B,v1.8B
0081040c	uzp1 v0.8B,v0.8B,v0.8B
00810410	str s0,[x20]
00810414	adrp x1,0xd1c000
00810418	add x1,x1,#0x258
0081041c	mov x0,x19
00810420	bl 0x00807e7c
00810424	adrp x8,0xd1c000
00810428	add x8,x8,#0x278
0081042c	adrp x20,0xd1c000
00810430	add x20,x20,#0x268
00810434	ldarb w8,[x8]
00810438	tbz w8,#0x0,0x008110e4
0081043c	adrp x8,0xd1c000
00810440	ldrb w8,[x8, #0x274]
00810444	cmp w8,#0x1
00810448	b.ne 0x00810480
0081044c	ldr s0,[x20, #0x8]
00810450	adrp x8,0x29a000
00810454	strb wzr,[x20, #0xc]
00810458	ldr d1,[x8, #0x420]
0081045c	adrp x8,0x29b000
00810460	uxtl v0.8H,v0.8B
00810464	ldr d2,[x8, #0x9a0]
00810468	eor v0.8B,v0.8B,v1.8B
0081046c	ldr d1,[x20]
00810470	eor v1.8B,v1.8B,v2.8B
00810474	uzp1 v0.8B,v0.8B,v0.8B
00810478	str d1,[x20]
0081047c	str s0,[x20, #0x8]
00810480	nop
00810484	adr x20,0x813a00
00810488	adrp x21,0xd1c000
0081048c	add x21,x21,#0x268
00810490	mov x0,x19
00810494	mov x1,x20
00810498	mov x2,x21
0081049c	mov w3,wzr
008104a0	mov x4,xzr
008104a4	bl 0x008ac76c
008104a8	mov x0,x19
008104ac	mov w1,#0xffffffff
008104b0	bl 0x008aa2e4
008104b4	ldr x8,[x0]
008104b8	adrp x0,0xd1b000
008104bc	add x0,x0,#0x9f8
008104c0	mov x1,sp
008104c4	mov x2,sp
008104c8	str x8,[sp]
008104cc	bl 0x00807f14
008104d0	adrp x0,0xcca000
008104d4	add x0,x0,#0x848
008104d8	mov x1,sp
008104dc	mov x2,sp
008104e0	str x20,[sp]
008104e4	bl 0x0080837c
008104e8	mov x0,x19
008104ec	mov w1,#0xffffd8ee
008104f0	mov x2,x21
008104f4	bl 0x008ad800
008104f8	adrp x8,0xd1c000
008104fc	add x8,x8,#0x290
00810500	adrp x20,0xd1c000
00810504	add x20,x20,#0x280
00810508	ldarb w8,[x8]
0081050c	tbz w8,#0x0,0x0081113c
00810510	adrp x8,0xd1c000
00810514	ldrb w8,[x8, #0x28e]
00810518	cmp w8,#0x1
0081051c	b.ne 0x00810574
00810520	ldr s0,[x20, #0x8]
00810524	adrp x8,0x29a000
00810528	ldr d2,[x20]
0081052c	ldr d1,[x8, #0xad0]
00810530	adrp x8,0x29b000
00810534	mov w9,#0x95
00810538	uxtl v0.8H,v0.8B
0081053c	ldrb w10,[x20, #0xd]
00810540	strb wzr,[x20, #0xe]
00810544	eor v0.8B,v0.8B,v1.8B
00810548	ldr d1,[x8, #0xeb0]
0081054c	ldrb w8,[x20, #0xc]
00810550	eor v1.8B,v2.8B,v1.8B
00810554	eor w8,w8,w9
00810558	mov w9,#0x5f
0081055c	uzp1 v0.8B,v0.8B,v0.8B
00810560	eor w9,w10,w9
00810564	strb w8,[x20, #0xc]
00810568	strb w9,[x20, #0xd]
0081056c	str d1,[x20]
00810570	str s0,[x20, #0x8]
00810574	nop
00810578	adr x20,0x813bf0
0081057c	adrp x21,0xd1c000
00810580	add x21,x21,#0x280
00810584	mov x0,x19
00810588	mov x1,x20
0081058c	mov x2,x21
00810590	mov w3,wzr
00810594	mov x4,xzr
00810598	bl 0x008ac76c
0081059c	mov x0,x19
008105a0	mov w1,#0xffffffff
008105a4	bl 0x008aa2e4
008105a8	ldr x8,[x0]
008105ac	adrp x0,0xd1b000
008105b0	add x0,x0,#0x9f8
008105b4	mov x1,sp
008105b8	mov x2,sp
008105bc	str x8,[sp]
008105c0	bl 0x00807f14
008105c4	adrp x0,0xcca000
008105c8	add x0,x0,#0x848
008105cc	mov x1,sp
008105d0	mov x2,sp
008105d4	str x20,[sp]
008105d8	bl 0x0080837c
008105dc	mov x0,x19
008105e0	mov w1,#0xffffd8ee
008105e4	mov x2,x21
008105e8	bl 0x008ad800
008105ec	adrp x8,0xd1c000
008105f0	add x8,x8,#0x2a8
008105f4	ldarb w8,[x8]
008105f8	tbz w8,#0x0,0x0081119c
008105fc	adrp x8,0xd1c000
00810600	add x8,x8,#0x2c0
00810604	ldarb w8,[x8]
00810608	tbz w8,#0x0,0x008111f8
0081060c	nop
00810610	adr x1,0x811478
00810614	adrp x2,0xd1c000
00810618	add x2,x2,#0x298
0081061c	adrp x3,0xd1c000
00810620	add x3,x3,#0x2b0
00810624	mov x0,x19
00810628	bl 0x00813d80
0081062c	adrp x8,0xd1c000
00810630	add x8,x8,#0x2d8
00810634	ldarb w8,[x8]
00810638	tbz w8,#0x0,0x0081125c
0081063c	adrp x8,0xd1c000
00810640	add x8,x8,#0x2f0
00810644	ldarb w8,[x8]
00810648	tbz w8,#0x0,0x008112b8
0081064c	nop
00810650	adr x1,0x811550
00810654	adrp x2,0xd1c000
00810658	add x2,x2,#0x2c8
0081065c	adrp x3,0xd1c000
00810660	add x3,x3,#0x2e0
00810664	mov x0,x19
00810668	bl 0x00813f60
0081066c	adrp x8,0xd1c000
00810670	add x8,x8,#0x308
00810674	ldarb w8,[x8]
00810678	tbz w8,#0x0,0x0081131c
0081067c	adrp x8,0xd1c000
00810680	add x8,x8,#0x320
00810684	ldarb w8,[x8]
00810688	tbz w8,#0x0,0x00811374
0081068c	nop
00810690	adr x1,0x811610
00810694	adrp x2,0xd1c000
00810698	add x2,x2,#0x2f8
0081069c	adrp x3,0xd1c000
008106a0	add x3,x3,#0x310
008106a4	mov x0,x19
008106a8	bl 0x00814140
008106ac	adrp x8,0xd1c000
008106b0	add x8,x8,#0x338
008106b4	ldarb w8,[x8]
008106b8	tbz w8,#0x0,0x008113c8
008106bc	adrp x8,0xd1c000
008106c0	add x8,x8,#0x350
008106c4	ldarb w8,[x8]
008106c8	tbz w8,#0x0,0x00811420
008106cc	nop
008106d0	adr x1,0x81176c
008106d4	adrp x2,0xd1c000
008106d8	add x2,x2,#0x328
008106dc	adrp x3,0xd1c000
008106e0	add x3,x3,#0x340
008106e4	mov x0,x19
008106e8	bl 0x00814304
008106ec	ldr x8,[x26, #0x28]
008106f0	ldr x9,[sp, #0x8]
008106f4	cmp x8,x9
008106f8	b.ne 0x00811474
008106fc	ldp x20,x19,[sp, #0x50]
00810700	ldp x22,x21,[sp, #0x40]
00810704	ldp x24,x23,[sp, #0x30]
00810708	ldp x26,x25,[sp, #0x20]
0081070c	ldp x29,x30,[sp, #0x10]
00810710	add sp,sp,#0x60
00810714	ret
00810718	adrp x0,0xd1b000
0081071c	add x0,x0,#0xa58
00810720	bl 0x00c2fe90
00810724	cbz w0,0x0080ee04
00810728	adrp x8,0x29a000
0081072c	adrp x9,0x29a000
00810730	nop
00810734	adr x0,0x814718
00810738	ldr d0,[x8, #0x230]
0081073c	ldr d1,[x9, #0x238]
00810740	mov w8,#0x193
00810744	adrp x2,0xc48000
00810748	add x2,x2,#0x880
0081074c	mov x1,x20
00810750	str d0,[x20]
00810754	str s1,[x20, #0x8]
00810758	strh w8,[x20, #0xc]
0081075c	bl 0x00c2fe70
00810760	adrp x0,0xd1b000
00810764	add x0,x0,#0xa58
00810768	bl 0x00c2fea0
0081076c	b 0x0080ee04
00810770	adrp x0,0xd1b000
00810774	add x0,x0,#0xa70
00810778	bl 0x00c2fe90
0081077c	cbz w0,0x0080eee8
00810780	adrp x8,0x29a000
00810784	adrp x9,0x29a000
00810788	nop
0081078c	adr x0,0x8148f4
00810790	ldr d0,[x8, #0x430]
00810794	ldr d1,[x9, #0xc80]
00810798	mov w8,#0x15f
0081079c	adrp x2,0xc48000
008107a0	add x2,x2,#0x880
008107a4	mov x1,x21
008107a8	str d0,[x21]
008107ac	str s1,[x21, #0x8]
008107b0	strh w8,[x21, #0xc]
008107b4	bl 0x00c2fe70
008107b8	adrp x0,0xd1b000
008107bc	add x0,x0,#0xa70
008107c0	bl 0x00c2fea0
008107c4	b 0x0080eee8
008107c8	adrp x0,0xd1b000
008107cc	add x0,x0,#0xa88
008107d0	bl 0x00c2fe90
008107d4	cbz w0,0x0080efcc
008107d8	adrp x8,0x29a000
008107dc	adrp x10,0x29b000
008107e0	mov w9,#0x1
008107e4	ldr d0,[x8, #0x9f8]
008107e8	ldr d1,[x10, #0xda8]
008107ec	mov w8,#0x6318
008107f0	nop
008107f4	adr x0,0x814900
008107f8	adrp x2,0xc48000
008107fc	add x2,x2,#0x880
00810800	mov x1,x22
00810804	strb w9,[x22, #0xe]
00810808	str d0,[x22]
0081080c	str s1,[x22, #0x8]
00810810	strh w8,[x22, #0xc]
00810814	bl 0x00c2fe70
00810818	adrp x0,0xd1b000
0081081c	add x0,x0,#0xa88
00810820	bl 0x00c2fea0
00810824	b 0x0080efcc
00810828	adrp x0,0xd1b000
0081082c	add x0,x0,#0xaa0
00810830	bl 0x00c2fe90
00810834	cbz w0,0x0080f0b0
00810838	adrp x8,0x29b000
0081083c	adrp x10,0x29a000
00810840	mov w9,#0x1
00810844	ldr d0,[x8, #0xa78]
00810848	ldr d1,[x10, #0x240]
0081084c	mov w8,#0xe95e
00810850	nop
00810854	adr x0,0x81490c
00810858	adrp x2,0xc48000
0081085c	add x2,x2,#0x880
00810860	mov x1,x22
00810864	strb w9,[x22, #0xe]
00810868	str d0,[x22]
0081086c	str s1,[x22, #0x8]
00810870	strh w8,[x22, #0xc]
00810874	bl 0x00c2fe70
00810878	adrp x0,0xd1b000
0081087c	add x0,x0,#0xaa0
00810880	bl 0x00c2fea0
00810884	b 0x0080f0b0
00810888	adrp x0,0xd1b000
0081088c	add x0,x0,#0xab8
00810890	bl 0x00c2fe90
00810894	cbz w0,0x0080f194
00810898	adrp x8,0x29a000
0081089c	mov w9,#0x1
008108a0	nop
008108a4	adr x0,0x814918
008108a8	ldr d0,[x8, #0x438]
008108ac	mov w8,#0x75b0
008108b0	adrp x2,0xc48000
008108b4	add x2,x2,#0x880
008108b8	mov x1,x22
008108bc	strb w9,[x22, #0xa]
008108c0	str d0,[x22]
008108c4	strh w8,[x22, #0x8]
008108c8	bl 0x00c2fe70
008108cc	adrp x0,0xd1b000
008108d0	add x0,x0,#0xab8
008108d4	bl 0x00c2fea0
008108d8	b 0x0080f194
008108dc	adrp x0,0xd1b000
008108e0	add x0,x0,#0xad0
008108e4	bl 0x00c2fe90
008108e8	cbz w0,0x0080f264
008108ec	adrp x8,0x29b000
008108f0	mov w9,#0x1
008108f4	nop
008108f8	adr x0,0x814924
008108fc	ldr d0,[x8, #0x258]
00810900	mov w8,#0x5b3a
00810904	adrp x2,0xc48000
00810908	add x2,x2,#0x880
0081090c	mov x1,x22
00810910	strb w9,[x22, #0xa]
00810914	str d0,[x22]
00810918	strh w8,[x22, #0x8]
0081091c	bl 0x00c2fe70
00810920	adrp x0,0xd1b000
00810924	add x0,x0,#0xad0
00810928	bl 0x00c2fea0
0081092c	b 0x0080f264
00810930	adrp x0,0xd1b000
00810934	add x0,x0,#0xae8
00810938	bl 0x00c2fe90
0081093c	adrp x8,0xd1b000
00810940	add x8,x8,#0xad8
00810944	cbz w0,0x0080f33c
00810948	adrp x9,0x29b000
0081094c	adrp x10,0x29a000
00810950	nop
00810954	adr x0,0x814930
00810958	ldr d0,[x9, #0xb8]
0081095c	ldr d1,[x10, #0x8a8]
00810960	adrp x2,0xc48000
00810964	add x2,x2,#0x880
00810968	adrp x1,0xd1b000
0081096c	add x1,x1,#0xad8
00810970	str d0,[x8]
00810974	str s1,[x8, #0x8]
00810978	bl 0x00c2fe70
0081097c	adrp x0,0xd1b000
00810980	add x0,x0,#0xae8
00810984	bl 0x00c2fea0
00810988	adrp x8,0xd1b000
0081098c	add x8,x8,#0xad8
00810990	b 0x0080f33c
00810994	adrp x0,0xd1b000
00810998	add x0,x0,#0xb00
0081099c	bl 0x00c2fe90
008109a0	adrp x8,0xd1b000
008109a4	add x8,x8,#0xaf0
008109a8	cbz w0,0x0080f41c
008109ac	adrp x9,0x29a000
008109b0	adrp x10,0x29b000
008109b4	nop
008109b8	adr x0,0x81493c
008109bc	ldr d0,[x9, #0xe98]
008109c0	ldr d1,[x10, #0xdb0]
008109c4	adrp x2,0xc48000
008109c8	add x2,x2,#0x880
008109cc	adrp x1,0xd1b000
008109d0	add x1,x1,#0xaf0
008109d4	str d0,[x8]
008109d8	str s1,[x8, #0x8]
008109dc	bl 0x00c2fe70
008109e0	adrp x0,0xd1b000
008109e4	add x0,x0,#0xb00
008109e8	bl 0x00c2fea0
008109ec	adrp x8,0xd1b000
008109f0	add x8,x8,#0xaf0
008109f4	b 0x0080f41c
008109f8	adrp x0,0xd1c000
008109fc	add x0,x0,#0x28
00810a00	bl 0x00c2fe90
00810a04	adrp x8,0xd1c000
00810a08	add x8,x8,#0x18
00810a0c	cbz w0,0x0080f4f8
00810a10	adrp x9,0x29b000
00810a14	mov w10,#0x1
00810a18	nop
00810a1c	adr x0,0x814fc0
00810a20	ldr d0,[x9, #0xc00]
00810a24	adrp x2,0xc48000
00810a28	add x2,x2,#0x880
00810a2c	adrp x1,0xd1c000
00810a30	add x1,x1,#0x18
00810a34	strb w10,[x8, #0x8]
00810a38	str d0,[x8]
00810a3c	bl 0x00c2fe70
00810a40	adrp x0,0xd1c000
00810a44	add x0,x0,#0x28
00810a48	bl 0x00c2fea0
00810a4c	adrp x8,0xd1c000
00810a50	add x8,x8,#0x18
00810a54	b 0x0080f4f8
00810a58	adrp x0,0xd1c000
00810a5c	add x0,x0,#0x50
00810a60	bl 0x00c2fe90
00810a64	adrp x8,0xd1c000
00810a68	add x8,x8,#0x40
00810a6c	cbz w0,0x0080f5b0
00810a70	adrp x9,0x29b000
00810a74	mov w10,#0x1
00810a78	nop
00810a7c	adr x0,0x814fd0
00810a80	ldr d0,[x9, #0x9b0]
00810a84	adrp x2,0xc48000
00810a88	add x2,x2,#0x880
00810a8c	adrp x1,0xd1c000
00810a90	add x1,x1,#0x40
00810a94	strb w10,[x8, #0x8]
00810a98	str d0,[x8]
00810a9c	bl 0x00c2fe70
00810aa0	adrp x0,0xd1c000
00810aa4	add x0,x0,#0x50
00810aa8	bl 0x00c2fea0
00810aac	adrp x8,0xd1c000
00810ab0	add x8,x8,#0x40
00810ab4	b 0x0080f5b0
00810ab8	adrp x0,0xd1c000
00810abc	add x0,x0,#0x68
00810ac0	bl 0x00c2fe90
00810ac4	adrp x8,0xd1c000
00810ac8	add x8,x8,#0x58
00810acc	cbz w0,0x0080f668
00810ad0	adrp x9,0x29a000
00810ad4	adrp x11,0x29a000
00810ad8	mov w10,#0x1
00810adc	ldr d0,[x9, #0xad8]
00810ae0	ldr d1,[x11, #0xd68]
00810ae4	mov w9,#0x4396
00810ae8	nop
00810aec	adr x0,0x814fd8
00810af0	adrp x2,0xc48000
00810af4	add x2,x2,#0x880
00810af8	adrp x1,0xd1c000
00810afc	add x1,x1,#0x58
00810b00	strb w10,[x8, #0xe]
00810b04	str d0,[x8]
00810b08	str s1,[x8, #0x8]
00810b0c	strh w9,[x8, #0xc]
00810b10	bl 0x00c2fe70
00810b14	adrp x0,0xd1c000
00810b18	add x0,x0,#0x68
00810b1c	bl 0x00c2fea0
00810b20	adrp x8,0xd1c000
00810b24	add x8,x8,#0x58
00810b28	b 0x0080f668
00810b2c	adrp x0,0xd1c000
00810b30	add x0,x0,#0x80
00810b34	bl 0x00c2fe90
00810b38	adrp x8,0xd1c000
00810b3c	add x8,x8,#0x70
00810b40	cbz w0,0x0080f75c
00810b44	adrp x9,0x29a000
00810b48	adrp x11,0x29a000
00810b4c	mov w10,#0x1
00810b50	ldr d0,[x9, #0x578]
00810b54	ldr d1,[x11, #0x8b8]
00810b58	nop
00810b5c	adr x0,0x814fe4
00810b60	adrp x2,0xc48000
00810b64	add x2,x2,#0x880
00810b68	adrp x1,0xd1c000
00810b6c	add x1,x1,#0x70
00810b70	strb w10,[x8, #0xc]
00810b74	str d0,[x8]
00810b78	str s1,[x8, #0x8]
00810b7c	bl 0x00c2fe70
00810b80	adrp x0,0xd1c000
00810b84	add x0,x0,#0x80
00810b88	bl 0x00c2fea0
00810b8c	adrp x8,0xd1c000
00810b90	add x8,x8,#0x70
00810b94	b 0x0080f75c
00810b98	adrp x0,0xd1c000
00810b9c	add x0,x0,#0x90
00810ba0	bl 0x00c2fe90
00810ba4	adrp x8,0xd1c000
00810ba8	add x8,x8,#0x88
00810bac	cbz w0,0x0080f830
00810bb0	adrp x9,0x29b000
00810bb4	nop
00810bb8	adr x0,0x814ff0
00810bbc	ldr d0,[x9, #0x570]
00810bc0	adrp x2,0xc48000
00810bc4	add x2,x2,#0x880
00810bc8	adrp x1,0xd1c000
00810bcc	add x1,x1,#0x88
00810bd0	str d0,[x8]
00810bd4	bl 0x00c2fe70
00810bd8	adrp x0,0xd1c000
00810bdc	add x0,x0,#0x90
00810be0	bl 0x00c2fea0
00810be4	adrp x8,0xd1c000
00810be8	add x8,x8,#0x88
00810bec	b 0x0080f830
00810bf0	adrp x0,0xd1c000
00810bf4	add x0,x0,#0x170
00810bf8	bl 0x00c2fe90
00810bfc	adrp x8,0xd1c000
00810c00	add x8,x8,#0x168
00810c04	cbz w0,0x0080f91c
00810c08	adrp x9,0x29b000
00810c0c	nop
00810c10	adr x0,0x815778
00810c14	ldr d0,[x9, #0x268]
00810c18	mov w9,#0x101
00810c1c	adrp x2,0xc48000
00810c20	add x2,x2,#0x880
00810c24	adrp x1,0xd1c000
00810c28	add x1,x1,#0x168
00810c2c	str s0,[x8]
00810c30	strh w9,[x8, #0x4]
00810c34	bl 0x00c2fe70
00810c38	adrp x0,0xd1c000
00810c3c	add x0,x0,#0x170
00810c40	bl 0x00c2fea0
00810c44	adrp x8,0xd1c000
00810c48	add x8,x8,#0x168
00810c4c	b 0x0080f91c
00810c50	adrp x0,0xd1c000
00810c54	add x0,x0,#0x190
00810c58	bl 0x00c2fe90
00810c5c	adrp x8,0xd1c000
00810c60	add x8,x8,#0x188
00810c64	cbz w0,0x0080f9e8
00810c68	adrp x9,0x29b000
00810c6c	nop
00810c70	adr x0,0x815790
00810c74	ldr d0,[x9, #0x370]
00810c78	mov w9,#0x1e5
00810c7c	adrp x2,0xc48000
00810c80	add x2,x2,#0x880
00810c84	adrp x1,0xd1c000
00810c88	add x1,x1,#0x188
00810c8c	str s0,[x8]
00810c90	strh w9,[x8, #0x4]
00810c94	bl 0x00c2fe70
00810c98	adrp x0,0xd1c000
00810c9c	add x0,x0,#0x190
00810ca0	bl 0x00c2fea0
00810ca4	adrp x8,0xd1c000
00810ca8	add x8,x8,#0x188
00810cac	b 0x0080f9e8
00810cb0	adrp x0,0xd1c000
00810cb4	add x0,x0,#0x1a0
00810cb8	bl 0x00c2fe90
00810cbc	adrp x8,0xd1c000
00810cc0	add x8,x8,#0x198
00810cc4	cbz w0,0x0080fac8
00810cc8	adrp x9,0x29a000
00810ccc	nop
00810cd0	adr x0,0x81579c
00810cd4	ldr d0,[x9, #0x248]
00810cd8	adrp x2,0xc48000
00810cdc	add x2,x2,#0x880
00810ce0	adrp x1,0xd1c000
00810ce4	add x1,x1,#0x198
00810ce8	str d0,[x8]
00810cec	bl 0x00c2fe70
00810cf0	adrp x0,0xd1c000
00810cf4	add x0,x0,#0x1a0
00810cf8	bl 0x00c2fea0
00810cfc	adrp x8,0xd1c000
00810d00	add x8,x8,#0x198
00810d04	b 0x0080fac8
00810d08	adrp x0,0xd1c000
00810d0c	add x0,x0,#0x1b0
00810d10	bl 0x00c2fe90
00810d14	adrp x8,0xd1c000
00810d18	add x8,x8,#0x1a8
00810d1c	cbz w0,0x0080fbac
00810d20	adrp x9,0x29b000
00810d24	nop
00810d28	adr x0,0x8157a8
00810d2c	ldr d0,[x9, #0x378]
00810d30	adrp x2,0xc48000
00810d34	add x2,x2,#0x880
00810d38	adrp x1,0xd1c000
00810d3c	add x1,x1,#0x1a8
00810d40	str d0,[x8]
00810d44	bl 0x00c2fe70
00810d48	adrp x0,0xd1c000
00810d4c	add x0,x0,#0x1b0
00810d50	bl 0x00c2fea0
00810d54	adrp x8,0xd1c000
00810d58	add x8,x8,#0x1a8
00810d5c	b 0x0080fbac
00810d60	adrp x0,0xd1c000
00810d64	add x0,x0,#0x1c0
00810d68	bl 0x00c2fe90
00810d6c	adrp x8,0xd1c000
00810d70	add x8,x8,#0x1b8
00810d74	cbz w0,0x0080fc90
00810d78	adrp x9,0x29a000
00810d7c	nop
00810d80	adr x0,0x8157b4
00810d84	ldr d0,[x9, #0x580]
00810d88	adrp x2,0xc48000
00810d8c	add x2,x2,#0x880
00810d90	adrp x1,0xd1c000
00810d94	add x1,x1,#0x1b8
00810d98	str d0,[x8]
00810d9c	bl 0x00c2fe70
00810da0	adrp x0,0xd1c000
00810da4	add x0,x0,#0x1c0
00810da8	bl 0x00c2fea0
00810dac	adrp x8,0xd1c000
00810db0	add x8,x8,#0x1b8
00810db4	b 0x0080fc90
00810db8	adrp x0,0xd1c000
00810dbc	add x0,x0,#0x1d0
00810dc0	bl 0x00c2fe90
00810dc4	adrp x8,0xd1c000
00810dc8	add x8,x8,#0x1c8
00810dcc	cbz w0,0x0080fd2c
00810dd0	adrp x9,0x29b000
00810dd4	nop
00810dd8	adr x0,0x8157c0
00810ddc	ldr d0,[x9, #0xcb8]
00810de0	adrp x2,0xc48000
00810de4	add x2,x2,#0x880
00810de8	adrp x1,0xd1c000
00810dec	add x1,x1,#0x1c8
00810df0	str d0,[x8]
00810df4	bl 0x00c2fe70
00810df8	adrp x0,0xd1c000
00810dfc	add x0,x0,#0x1d0
00810e00	bl 0x00c2fea0
00810e04	adrp x8,0xd1c000
00810e08	add x8,x8,#0x1c8
00810e0c	b 0x0080fd2c
00810e10	adrp x0,0xd1c000
00810e14	add x0,x0,#0x1e0
00810e18	bl 0x00c2fe90
00810e1c	adrp x8,0xd1c000
00810e20	add x8,x8,#0x1d8
00810e24	cbz w0,0x0080fe0c
00810e28	adrp x9,0x29a000
00810e2c	nop
00810e30	adr x0,0x8157cc
00810e34	ldr d0,[x9, #0xea8]
00810e38	adrp x2,0xc48000
00810e3c	add x2,x2,#0x880
00810e40	adrp x1,0xd1c000
00810e44	add x1,x1,#0x1d8
00810e48	str d0,[x8]
00810e4c	bl 0x00c2fe70
00810e50	adrp x0,0xd1c000
00810e54	add x0,x0,#0x1e0
00810e58	bl 0x00c2fea0
00810e5c	adrp x8,0xd1c000
00810e60	add x8,x8,#0x1d8
00810e64	b 0x0080fe0c
00810e68	adrp x0,0xd1c000
00810e6c	add x0,x0,#0x1f0
00810e70	bl 0x00c2fe90
00810e74	adrp x8,0xd1c000
00810e78	add x8,x8,#0x1e8
00810e7c	cbz w0,0x0080fef4
00810e80	adrp x9,0x29a000
00810e84	mov w10,#0x1
00810e88	nop
00810e8c	adr x0,0x8157d8
00810e90	ldr d0,[x9, #0xd78]
00810e94	adrp x2,0xc48000
00810e98	add x2,x2,#0x880
00810e9c	adrp x1,0xd1c000
00810ea0	add x1,x1,#0x1e8
00810ea4	strb w10,[x8, #0x4]
00810ea8	str s0,[x8]
00810eac	bl 0x00c2fe70
00810eb0	adrp x0,0xd1c000
00810eb4	add x0,x0,#0x1f0
00810eb8	bl 0x00c2fea0
00810ebc	adrp x8,0xd1c000
00810ec0	add x8,x8,#0x1e8
00810ec4	b 0x0080fef4
00810ec8	adrp x0,0xd1c000
00810ecc	add x0,x0,#0x200
00810ed0	bl 0x00c2fe90
00810ed4	adrp x8,0xd1c000
00810ed8	add x8,x8,#0x1f8
00810edc	cbz w0,0x0080ff50
00810ee0	adrp x9,0x29b000
00810ee4	mov w10,#0x1
00810ee8	nop
00810eec	adr x0,0x8157e0
00810ef0	ldr d0,[x9, #0x8e0]
00810ef4	mov w9,#0xf1d7
00810ef8	adrp x2,0xc48000
00810efc	add x2,x2,#0x880
00810f00	adrp x1,0xd1c000
00810f04	add x1,x1,#0x1f8
00810f08	strb w10,[x8, #0x6]
00810f0c	str s0,[x8]
00810f10	strh w9,[x8, #0x4]
00810f14	bl 0x00c2fe70
00810f18	adrp x0,0xd1c000
00810f1c	add x0,x0,#0x200
00810f20	bl 0x00c2fea0
00810f24	adrp x8,0xd1c000
00810f28	add x8,x8,#0x1f8
00810f2c	b 0x0080ff50
00810f30	adrp x0,0xd1c000
00810f34	add x0,x0,#0x210
00810f38	bl 0x00c2fe90
00810f3c	adrp x8,0xd1c000
00810f40	add x8,x8,#0x208
00810f44	cbz w0,0x0080ffd4
00810f48	adrp x9,0x29b000
00810f4c	nop
00810f50	adr x0,0x8157ec
00810f54	ldr d0,[x9, #0xa90]
00810f58	adrp x2,0xc48000
00810f5c	add x2,x2,#0x880
00810f60	adrp x1,0xd1c000
00810f64	add x1,x1,#0x208
00810f68	str d0,[x8]
00810f6c	bl 0x00c2fe70
00810f70	adrp x0,0xd1c000
00810f74	add x0,x0,#0x210
00810f78	bl 0x00c2fea0
00810f7c	adrp x8,0xd1c000
00810f80	add x8,x8,#0x208
00810f84	b 0x0080ffd4
00810f88	adrp x0,0xd1c000
00810f8c	add x0,x0,#0x220
00810f90	bl 0x00c2fe90
00810f94	cbz w0,0x008100bc
00810f98	adrp x8,0x29a000
00810f9c	nop
00810fa0	adr x0,0x8157f8
00810fa4	ldr d0,[x8, #0xba0]
00810fa8	adrp x2,0xc48000
00810fac	add x2,x2,#0x880
00810fb0	mov x1,x20
00810fb4	str d0,[x20]
00810fb8	bl 0x00c2fe70
00810fbc	adrp x0,0xd1c000
00810fc0	add x0,x0,#0x220
00810fc4	bl 0x00c2fea0
00810fc8	b 0x008100bc
00810fcc	adrp x0,0xd1c000
00810fd0	add x0,x0,#0x230
00810fd4	bl 0x00c2fe90
00810fd8	cbz w0,0x00810198
00810fdc	adrp x8,0x29a000
00810fe0	nop
00810fe4	adr x0,0x815804
00810fe8	ldr d0,[x8, #0x450]
00810fec	adrp x2,0xc48000
00810ff0	add x2,x2,#0x880
00810ff4	mov x1,x20
00810ff8	str d0,[x20]
00810ffc	bl 0x00c2fe70
00811000	adrp x0,0xd1c000
00811004	add x0,x0,#0x230
00811008	bl 0x00c2fea0
0081100c	b 0x00810198
00811010	adrp x0,0xd1c000
00811014	add x0,x0,#0x240
00811018	bl 0x00c2fe90
0081101c	cbz w0,0x0081022c
00811020	adrp x8,0x29b000
00811024	nop
00811028	adr x0,0x815810
0081102c	ldr d0,[x8, #0x8e8]
00811030	adrp x2,0xc48000
00811034	add x2,x2,#0x880
00811038	mov x1,x20
0081103c	str d0,[x20]
00811040	bl 0x00c2fe70
00811044	adrp x0,0xd1c000
00811048	add x0,x0,#0x240
0081104c	bl 0x00c2fea0
00811050	b 0x0081022c
00811054	adrp x0,0xd1c000
00811058	add x0,x0,#0x250
0081105c	bl 0x00c2fe90
00811060	cbz w0,0x0081030c
00811064	adrp x8,0x29b000
00811068	nop
0081106c	adr x0,0x81581c
00811070	ldr d0,[x8, #0xa98]
00811074	adrp x2,0xc48000
00811078	add x2,x2,#0x880
0081107c	mov x1,x20
00811080	str d0,[x20]
00811084	bl 0x00c2fe70
00811088	adrp x0,0xd1c000
0081108c	add x0,x0,#0x250
00811090	bl 0x00c2fea0
00811094	b 0x0081030c
00811098	adrp x0,0xd1c000
0081109c	add x0,x0,#0x260
008110a0	bl 0x00c2fe90
008110a4	cbz w0,0x008103e4
008110a8	adrp x8,0x29a000
008110ac	mov w9,#0x1
008110b0	nop
008110b4	adr x0,0x815828
008110b8	ldr d0,[x8, #0xae8]
008110bc	adrp x2,0xc48000
008110c0	add x2,x2,#0x880
008110c4	mov x1,x20
008110c8	strb w9,[x20, #0x4]
008110cc	str s0,[x20]
008110d0	bl 0x00c2fe70
008110d4	adrp x0,0xd1c000
008110d8	add x0,x0,#0x260
008110dc	bl 0x00c2fea0
008110e0	b 0x008103e4
008110e4	adrp x0,0xd1c000
008110e8	add x0,x0,#0x278
008110ec	bl 0x00c2fe90
008110f0	cbz w0,0x0081043c
008110f4	adrp x8,0x29a000
008110f8	adrp x10,0x29a000
008110fc	mov w9,#0x1
00811100	ldr d0,[x8, #0xeb0]
00811104	ldr d1,[x10, #0xeb8]
00811108	nop
0081110c	adr x0,0x815844
00811110	adrp x2,0xc48000
00811114	add x2,x2,#0x880
00811118	mov x1,x20
0081111c	strb w9,[x20, #0xc]
00811120	str d0,[x20]
00811124	str s1,[x20, #0x8]
00811128	bl 0x00c2fe70
0081112c	adrp x0,0xd1c000
00811130	add x0,x0,#0x278
00811134	bl 0x00c2fea0
00811138	b 0x0081043c
0081113c	adrp x0,0xd1c000
00811140	add x0,x0,#0x290
00811144	bl 0x00c2fe90
00811148	cbz w0,0x00810510
0081114c	adrp x8,0x29a000
00811150	adrp x10,0x29a000
00811154	mov w9,#0x1
00811158	ldr d0,[x8, #0x458]
0081115c	ldr d1,[x10, #0x460]
00811160	mov w8,#0x5fe6
00811164	nop
00811168	adr x0,0x815850
0081116c	adrp x2,0xc48000
00811170	add x2,x2,#0x880
00811174	mov x1,x20
00811178	strb w9,[x20, #0xe]
0081117c	str d0,[x20]
00811180	str s1,[x20, #0x8]
00811184	strh w8,[x20, #0xc]
00811188	bl 0x00c2fe70
0081118c	adrp x0,0xd1c000
00811190	add x0,x0,#0x290
00811194	bl 0x00c2fea0
00811198	b 0x00810510
0081119c	adrp x0,0xd1c000
008111a0	add x0,x0,#0x2a8
008111a4	bl 0x00c2fe90
008111a8	cbz w0,0x008105fc
008111ac	adrp x8,0x29a000
008111b0	adrp x9,0x29b000
008111b4	adrp x1,0xd1c000
008111b8	add x1,x1,#0x298
008111bc	ldr d0,[x8, #0xfb8]
008111c0	ldr d1,[x9, #0x650]
008111c4	mov w8,#0x19b
008111c8	nop
008111cc	adr x0,0x81585c
008111d0	adrp x2,0xc48000
008111d4	add x2,x2,#0x880
008111d8	str d0,[x1]
008111dc	str s1,[x1, #0x8]
008111e0	strh w8,[x1, #0xc]
008111e4	bl 0x00c2fe70
008111e8	adrp x0,0xd1c000
008111ec	add x0,x0,#0x2a8
008111f0	bl 0x00c2fea0
008111f4	b 0x008105fc
008111f8	adrp x0,0xd1c000
008111fc	add x0,x0,#0x2c0
00811200	bl 0x00c2fe90
00811204	cbz w0,0x0081060c
00811208	adrp x8,0x29a000
0081120c	adrp x10,0x29a000
00811210	adrp x1,0xd1c000
00811214	add x1,x1,#0x2b0
00811218	ldr d0,[x8, #0x468]
0081121c	ldr d1,[x10, #0x470]
00811220	mov w9,#0x1
00811224	mov w8,#0xa1fe
00811228	nop
0081122c	adr x0,0x815868
00811230	adrp x2,0xc48000
00811234	add x2,x2,#0x880
00811238	strb w9,[x1, #0xe]
0081123c	str d0,[x1]
00811240	str s1,[x1, #0x8]
00811244	strh w8,[x1, #0xc]
00811248	bl 0x00c2fe70
0081124c	adrp x0,0xd1c000
00811250	add x0,x0,#0x2c0
00811254	bl 0x00c2fea0
00811258	b 0x0081060c
0081125c	adrp x0,0xd1c000
00811260	add x0,x0,#0x2d8
00811264	bl 0x00c2fe90
00811268	cbz w0,0x0081063c
0081126c	adrp x8,0x29b000
00811270	adrp x9,0x29a000
00811274	adrp x1,0xd1c000
00811278	add x1,x1,#0x2c8
0081127c	ldr d0,[x8, #0xaa0]
00811280	ldr d1,[x9, #0xec0]
00811284	mov w8,#0x1a3
00811288	nop
0081128c	adr x0,0x815874
00811290	adrp x2,0xc48000
00811294	add x2,x2,#0x880
00811298	str d0,[x1]
0081129c	str s1,[x1, #0x8]
008112a0	strh w8,[x1, #0xc]
008112a4	bl 0x00c2fe70
008112a8	adrp x0,0xd1c000
008112ac	add x0,x0,#0x2d8
008112b0	bl 0x00c2fea0
008112b4	b 0x0081063c
008112b8	adrp x0,0xd1c000
008112bc	add x0,x0,#0x2f0
008112c0	bl 0x00c2fe90
008112c4	cbz w0,0x0081064c
008112c8	adrp x8,0x29a000
008112cc	adrp x10,0x29a000
008112d0	adrp x1,0xd1c000
008112d4	add x1,x1,#0x2e0
008112d8	ldr d0,[x8, #0xfc0]
008112dc	ldr d1,[x10, #0xa00]
008112e0	mov w9,#0x1
008112e4	mov w8,#0x19c6
008112e8	nop
008112ec	adr x0,0x815880
008112f0	adrp x2,0xc48000
008112f4	add x2,x2,#0x880
008112f8	strb w9,[x1, #0xe]
008112fc	str d0,[x1]
00811300	str s1,[x1, #0x8]
00811304	strh w8,[x1, #0xc]
00811308	bl 0x00c2fe70
0081130c	adrp x0,0xd1c000
00811310	add x0,x0,#0x2f0
00811314	bl 0x00c2fea0
00811318	b 0x0081064c
0081131c	adrp x0,0xd1c000
00811320	add x0,x0,#0x308
00811324	bl 0x00c2fe90
00811328	cbz w0,0x0081067c
0081132c	adrp x8,0x29b000
00811330	mov w9,#0x1
00811334	adrp x1,0xd1c000
00811338	add x1,x1,#0x2f8
0081133c	ldr d0,[x8, #0x9c0]
00811340	mov w8,#0xf44
00811344	nop
00811348	adr x0,0x81588c
0081134c	adrp x2,0xc48000
00811350	add x2,x2,#0x880
00811354	strb w9,[x1, #0xa]
00811358	str d0,[x1]
0081135c	strh w8,[x1, #0x8]
00811360	bl 0x00c2fe70
00811364	adrp x0,0xd1c000
00811368	add x0,x0,#0x308
0081136c	bl 0x00c2fea0
00811370	b 0x0081067c
00811374	adrp x0,0xd1c000
00811378	add x0,x0,#0x320
0081137c	bl 0x00c2fe90
00811380	cbz w0,0x0081068c
00811384	adrp x8,0x29b000
00811388	adrp x9,0x29b000
0081138c	adrp x1,0xd1c000
00811390	add x1,x1,#0x310
00811394	ldr d0,[x8, #0x8f0]
00811398	ldr d1,[x9, #0x380]
0081139c	nop
008113a0	adr x0,0x815898
008113a4	adrp x2,0xc48000
008113a8	add x2,x2,#0x880
008113ac	str d0,[x1]
008113b0	str s1,[x1, #0x8]
008113b4	bl 0x00c2fe70
008113b8	adrp x0,0xd1c000
008113bc	add x0,x0,#0x320
008113c0	bl 0x00c2fea0
008113c4	b 0x0081068c
008113c8	adrp x0,0xd1c000
008113cc	add x0,x0,#0x338
008113d0	bl 0x00c2fe90
008113d4	cbz w0,0x008106bc
008113d8	adrp x8,0x29a000
008113dc	mov w9,#0x1
008113e0	adrp x1,0xd1c000
008113e4	add x1,x1,#0x328
008113e8	ldr d0,[x8, #0x478]
008113ec	mov w8,#0x3d38
008113f0	nop
008113f4	adr x0,0x8158a4
008113f8	adrp x2,0xc48000
008113fc	add x2,x2,#0x880
00811400	strb w9,[x1, #0xa]
00811404	str d0,[x1]
00811408	strh w8,[x1, #0x8]
0081140c	bl 0x00c2fe70
00811410	adrp x0,0xd1c000
00811414	add x0,x0,#0x338
00811418	bl 0x00c2fea0
0081141c	b 0x008106bc
00811420	adrp x0,0xd1c000
00811424	add x0,x0,#0x350
00811428	bl 0x00c2fe90
0081142c	cbz w0,0x008106cc
00811430	adrp x8,0x29b000
00811434	adrp x9,0x29a000
00811438	adrp x1,0xd1c000
0081143c	add x1,x1,#0x340
00811440	ldr d0,[x8, #0x658]
00811444	ldr d1,[x9, #0x8c8]
00811448	nop
0081144c	adr x0,0x8158b0
00811450	adrp x2,0xc48000
00811454	add x2,x2,#0x880
00811458	str d0,[x1]
0081145c	str s1,[x1, #0x8]
00811460	bl 0x00c2fe70
00811464	adrp x0,0xd1c000
00811468	add x0,x0,#0x350
0081146c	bl 0x00c2fea0
00811470	b 0x008106cc
00811474	bl 0x00c2fec0
