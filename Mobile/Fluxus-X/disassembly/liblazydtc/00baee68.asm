; FUN_00baee68 @ 00baee68
00baee68	sub sp,sp,#0xa0
00baee6c	stp x28,x27,[sp, #0x40]
00baee70	stp x26,x25,[sp, #0x50]
00baee74	stp x24,x23,[sp, #0x60]
00baee78	stp x22,x21,[sp, #0x70]
00baee7c	stp x20,x19,[sp, #0x80]
00baee80	stp x29,x30,[sp, #0x90]
00baee84	str xzr,[sp, #0x38]
00baee88	ldr x2,[x0]
00baee8c	ldp x6,x15,[x0, #0x70]
00baee90	ldp x14,x3,[x0, #0x50]
00baee94	ldp x5,x4,[x0, #0xa0]
00baee98	ldp x18,x16,[x0, #0x80]
00baee9c	ldp x17,x19,[x0, #0x60]
00baeea0	ldp x1,x23,[x0, #0xb0]
00baeea4	ldp x13,x7,[x0, #0x40]
00baeea8	ldp x21,x26,[x0, #0x90]
00baeeac	ldr x24,[x0, #0xc0]
00baeeb0	adrp x30,0x788000
00baeeb4	add x8,x0,#0x18
00baeeb8	add x30,x30,#0xcf8
00baeebc	str x8,[sp, #0x8]
00baeec0	ldp x28,x12,[x0, #0x18]
00baeec4	ldr x9,[x0, #0x48]
00baeec8	ldp x25,x8,[x0, #0x28]
00baeecc	ldp x10,x27,[x0, #0x8]
00baeed0	ldr x11,[x0, #0x38]
00baeed4	str x9,[sp, #0x30]
00baeed8	eor x9,x13,x28
00baeedc	eor x9,x9,x19
00baeee0	eor x7,x7,x12
00baeee4	eor x9,x9,x21
00baeee8	eor x22,x8,x10
00baeeec	eor x6,x7,x6
00baeef0	eor x21,x25,x2
00baeef4	eor x9,x9,x23
00baeef8	eor x23,x11,x27
00baeefc	eor x22,x22,x3
00baef00	eor x6,x6,x26
00baef04	eor x21,x21,x14
00baef08	eor x23,x23,x17
00baef0c	eor x22,x22,x18
00baef10	eor x21,x21,x15
00baef14	eor x23,x23,x16
00baef18	eor x22,x22,x4
00baef1c	eor x6,x6,x24
00baef20	eor x21,x21,x5
00baef24	eor x23,x23,x1
00baef28	eor x24,x6,x22, ROR #0x3f
00baef2c	mov x26,x8
00baef30	eor x6,x23,x6, ROR #0x3f
00baef34	eor x23,x21,x23, ROR #0x3f
00baef38	eor x22,x22,x9, ROR #0x3f
00baef3c	eor x9,x9,x21, ROR #0x3f
00baef40	eor x21,x25,x24
00baef44	eor x25,x14,x24
00baef48	mov x14,x17
00baef4c	ldp x7,x19,[x0, #0x68]
00baef50	eor x2,x24,x2
00baef54	eor x29,x15,x24
00baef58	eor x5,x5,x24
00baef5c	ldp x24,x8,[x0, #0x90]
00baef60	eor x17,x23,x10
00baef64	eor x26,x26,x23
00baef68	eor x15,x3,x23
00baef6c	eor x18,x18,x23
00baef70	eor x4,x4,x23
00baef74	eor x23,x22,x27
00baef78	eor x11,x11,x22
00baef7c	eor x14,x14,x22
00baef80	eor x16,x16,x22
00baef84	eor x1,x1,x22
00baef88	ldp x22,x27,[x0, #0xb8]
00baef8c	eor x28,x6,x28
00baef90	eor x13,x13,x6
00baef94	eor x7,x7,x6
00baef98	eor x24,x24,x6
00baef9c	eor x6,x22,x6
00baefa0	ldr x10,[sp, #0x30]
00baefa4	stp x2,x17,[x0]
00baefa8	stp x21,x26,[x0, #0x28]
00baefac	stp x25,x15,[x0, #0x50]
00baefb0	stp x29,x18,[x0, #0x78]
00baefb4	stp x5,x4,[x0, #0xa0]
00baefb8	stp x23,x28,[x0, #0x10]
00baefbc	stp x11,x13,[x0, #0x38]
00baefc0	stp x14,x7,[x0, #0x60]
00baefc4	stp x16,x24,[x0, #0x88]
00baefc8	stp x1,x6,[x0, #0xb0]
00baefcc	ldr x11,[sp, #0x8]
00baefd0	mov x20,xzr
00baefd4	eor x22,x9,x12
00baefd8	eor x12,x10,x9
00baefdc	eor x19,x19,x9
00baefe0	eor x8,x8,x9
00baefe4	eor x9,x27,x9
00baefe8	str x22,[x0, #0x20]
00baefec	str x12,[x0, #0x48]
00baeff0	str x19,[x0, #0x70]
00baeff4	str x8,[x0, #0x98]
00baeff8	str x9,[x0, #0xc0]
00baeffc	b 0x00baf00c
00baf000	ldr x17,[x11, #0x10]
00baf004	add x20,x20,#0x4
00baf008	add x11,x11,#0x20
00baf00c	asr w8,w20,#0x2
00baf010	ldr w8,[x30, w8, SXTW #0x2]
00baf014	ldp x9,x12,[x11, #-0x8]
00baf018	ldr x13,[x11, #0x8]
00baf01c	add x14,x20,#0x5
00baf020	ubfx w15,w8,#0x10,#0x8
00baf024	cmp x14,#0x18
00baf028	ubfx x14,x8,#0x18,#0x8
00baf02c	ror x9,x9,x15
00baf030	ubfx w15,w8,#0x8,#0x8
00baf034	and x8,x8,#0xff
00baf038	ror x14,x17,x14
00baf03c	ror x12,x12,x15
00baf040	ror x8,x13,x8
00baf044	stp x14,x9,[x11, #-0x10]
00baf048	stp x12,x8,[x11]
00baf04c	b.ls 0x00baf000
00baf050	ldp x14,x8,[x0, #0x50]
00baf054	ldp x7,x19,[x0]
00baf058	ldp x25,x4,[x0, #0x30]
00baf05c	ldr x21,[x0, #0xb0]
00baf060	str x8,[sp, #0x20]
00baf064	ldp x8,x15,[x0, #0x10]
00baf068	ldp x16,x1,[x0, #0x80]
00baf06c	ldr x10,[sp, #0x38]
00baf070	str x8,[sp, #0x30]
00baf074	ldp x8,x5,[x0, #0x20]
00baf078	str x8,[sp, #0x28]
00baf07c	ldp x8,x23,[x0, #0x70]
00baf080	ldp x18,x2,[x0, #0xa0]
00baf084	ldp x20,x27,[x0, #0xb8]
00baf088	str x8,[sp, #0x18]
00baf08c	ldp x13,x6,[x0, #0x90]
00baf090	ldp x12,x26,[x0, #0x60]
00baf094	ldp x24,x28,[x0, #0x40]
00baf098	adrp x8,0x788000
00baf09c	bic x11,x27,x13
00baf0a0	bic x9,x12,x25
00baf0a4	eor x11,x12,x11
00baf0a8	bic x12,x13,x12
00baf0ac	eor x22,x25,x12
00baf0b0	bic x25,x25,x7
00baf0b4	eor x9,x7,x9
00baf0b8	bic x7,x7,x27
00baf0bc	eor x25,x25,x27
00baf0c0	bic x27,x21,x16
00baf0c4	eor x12,x7,x13
00baf0c8	bic x7,x14,x28
00baf0cc	eor x27,x27,x14
00baf0d0	bic x14,x16,x14
00baf0d4	add x8,x8,#0xd10
00baf0d8	eor x29,x28,x14
00baf0dc	bic x14,x28,x15
00baf0e0	eor x28,x7,x15
00baf0e4	bic x15,x15,x21
00baf0e8	ldrb w8,[x8, x10]
00baf0ec	str x1,[x0, #0x90]
00baf0f0	str x24,[x0, #0xa8]
00baf0f4	str x23,[x0, #0xb8]
00baf0f8	eor x13,x15,x16
00baf0fc	bic x15,x6,x26
00baf100	str x11,[sp, #0x10]
00baf104	bic x7,x26,x4
00baf108	eor x11,x14,x21
00baf10c	eor x3,x15,x4
00baf110	bic x21,x4,x19
00baf114	ldp x15,x4,[sp, #0x20]
00baf118	bic x14,x18,x6
00baf11c	bic x16,x19,x18
00baf120	eor x17,x14,x26
00baf124	eor x14,x7,x19
00baf128	eor x19,x16,x6
00baf12c	bic x7,x15,x5
00baf130	eor x6,x18,x21
00baf134	bic x16,x20,x1
00baf138	bic x18,x1,x15
00baf13c	bic x26,x5,x4
00baf140	eor x16,x16,x15
00baf144	eor x18,x5,x18
00baf148	eor x15,x4,x7
00baf14c	bic x5,x4,x20
00baf150	ldr x4,[sp, #0x18]
00baf154	eor x26,x20,x26
00baf158	ldr x20,[sp, #0x30]
00baf15c	eor x21,x5,x1
00baf160	bic x1,x2,x23
00baf164	bic x5,x4,x24
00baf168	eor x1,x4,x1
00baf16c	bic x4,x23,x4
00baf170	bic x7,x24,x20
00baf174	eor x4,x4,x24
00baf178	eor x5,x5,x20
00baf17c	bic x20,x20,x2
00baf180	str x2,[x0, #0xc0]
00baf184	eor x24,x7,x2
00baf188	mov x2,x8
00baf18c	bfm x2,x8,#0x26,#0x7
00baf190	stp x9,x22,[x0]
00baf194	bfm x2,x8,#0x7,#0x6
00baf198	mov x7,x11
00baf19c	ldr x11,[sp, #0x10]
00baf1a0	bfm x2,x8,#0x35,#0x7
00baf1a4	mov x8,#-0x7fffffff80000000
00baf1a8	movk x8,#0x808f
00baf1ac	add x10,x10,#0x1
00baf1b0	and x8,x2,x8
00baf1b4	eor x23,x20,x23
00baf1b8	eor x2,x8,x9
00baf1bc	cmp x10,#0x18
00baf1c0	stp x11,x12,[x0, #0x10]
00baf1c4	stp x25,x28,[x0, #0x20]
00baf1c8	stp x29,x27,[x0, #0x30]
00baf1cc	stp x13,x7,[x0, #0x40]
00baf1d0	stp x14,x3,[x0, #0x50]
00baf1d4	stp x17,x19,[x0, #0x60]
00baf1d8	stp x6,x15,[x0, #0x70]
00baf1dc	stp x18,x16,[x0, #0x80]
00baf1e0	stp x21,x26,[x0, #0x90]
00baf1e4	stp x5,x4,[x0, #0xa0]
00baf1e8	stp x1,x23,[x0, #0xb0]
00baf1ec	str x24,[x0, #0xc0]
00baf1f0	str x10,[sp, #0x38]
00baf1f4	str x2,[x0]
00baf1f8	b.ne 0x00baeec0
00baf1fc	ldp x29,x30,[sp, #0x90]
00baf200	ldp x20,x19,[sp, #0x80]
00baf204	ldp x22,x21,[sp, #0x70]
00baf208	ldp x24,x23,[sp, #0x60]
00baf20c	ldp x26,x25,[sp, #0x50]
00baf210	ldp x28,x27,[sp, #0x40]
00baf214	add sp,sp,#0xa0
00baf218	ret
