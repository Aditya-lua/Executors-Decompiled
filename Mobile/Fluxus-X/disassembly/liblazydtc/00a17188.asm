; DES_ede3_cbc_encrypt @ 00a17188
00a17188	sub sp,sp,#0xa0
00a1718c	stp x28,x27,[sp, #0x40]
00a17190	stp x26,x25,[sp, #0x50]
00a17194	stp x24,x23,[sp, #0x60]
00a17198	stp x22,x21,[sp, #0x70]
00a1719c	stp x20,x19,[sp, #0x80]
00a171a0	stp x29,x30,[sp, #0x90]
00a171a4	ldp w26,w27,[x6]
00a171a8	mov x19,x6
00a171ac	mov x21,x5
00a171b0	mov x22,x4
00a171b4	mov x23,x3
00a171b8	mov x25,x2
00a171bc	mov x20,x1
00a171c0	mov x24,x0
00a171c4	subs x8,x2,#0x8
00a171c8	add x29,sp,#0x90
00a171cc	cbz w7,0x00a17358
00a171d0	b.lt 0x00a1728c
00a171d4	str x8,[sp, #0x20]
00a171d8	mvn x8,x25
00a171dc	orr x9,xzr,#-0x10
00a171e0	cmn x8,#0x10
00a171e4	csinv x8,x9,x25,le
00a171e8	add x8,x8,x25
00a171ec	add x8,x8,#0x8
00a171f0	and x28,x8,#-0x8
00a171f4	add x8,x28,#0x8
00a171f8	str x8,[sp, #0x18]
00a171fc	add x8,x24,x8
00a17200	add x25,x25,#0x8
00a17204	stp x8,x20,[sp, #0x28]
00a17208	ldp w8,w9,[x24], #0x8
00a1720c	add x0,sp,#0x38
00a17210	mov x1,x23
00a17214	mov x2,x22
00a17218	eor w8,w8,w26
00a1721c	eor w9,w9,w27
00a17220	mov x3,x21
00a17224	stp w8,w9,[sp, #0x38]
00a17228	bl 0x00a16bfc
00a1722c	ldp w26,w27,[sp, #0x38]
00a17230	sub x25,x25,#0x8
00a17234	cmp x25,#0xf
00a17238	lsr w8,w26,#0x8
00a1723c	strb w8,[x20, #0x1]
00a17240	lsr w8,w26,#0x10
00a17244	strb w8,[x20, #0x2]
00a17248	lsr w8,w26,#0x18
00a1724c	strb w8,[x20, #0x3]
00a17250	lsr w8,w27,#0x8
00a17254	strb w8,[x20, #0x5]
00a17258	lsr w8,w27,#0x10
00a1725c	strb w8,[x20, #0x6]
00a17260	lsr w8,w27,#0x18
00a17264	strb w26,[x20]
00a17268	strb w27,[x20, #0x4]
00a1726c	strb w8,[x20, #0x7]
00a17270	add x20,x20,#0x8
00a17274	b.gt 0x00a17208
00a17278	ldp x8,x24,[sp, #0x20]
00a1727c	ldr x20,[sp, #0x30]
00a17280	sub x25,x8,x28
00a17284	ldr x8,[sp, #0x18]
00a17288	add x20,x20,x8
00a1728c	cbz x25,0x00a174ac
00a17290	sub x9,x25,#0x1
00a17294	cmp x9,#0x6
00a17298	mov w8,wzr
00a1729c	b.hi 0x00a1750c
00a172a0	adrp x10,0x752000
00a172a4	add x10,x10,#0x708
00a172a8	ldrsw x9,[x10, x9, LSL #0x2]
00a172ac	add x11,x9,x10
00a172b0	add x9,x24,x25
00a172b4	mov w10,w8
00a172b8	br x11
00a172bc	ldrb w8,[x9, #-0x1]!
00a172c0	lsl w8,w8,#0x10
00a172c4	ldrb w10,[x9, #-0x1]!
00a172c8	orr w8,w8,w10, LSL #0x8
00a172cc	ldrb w10,[x9, #-0x1]!
00a172d0	orr w8,w8,w10
00a172d4	ldrb w11,[x9, #-0x1]!
00a172d8	mov w10,w8
00a172dc	lsl w8,w11,#0x18
00a172e0	ldrb w11,[x9, #-0x1]!
00a172e4	orr w8,w8,w11, LSL #0x10
00a172e8	ldrb w11,[x9, #-0x1]!
00a172ec	orr w8,w8,w11, LSL #0x8
00a172f0	ldurb w9,[x9, #-0x1]
00a172f4	orr w8,w8,w9
00a172f8	eor w8,w8,w26
00a172fc	eor w9,w10,w27
00a17300	add x0,sp,#0x38
00a17304	mov x1,x23
00a17308	mov x2,x22
00a1730c	mov x3,x21
00a17310	stp w8,w9,[sp, #0x38]
00a17314	bl 0x00a16bfc
00a17318	ldp w28,w24,[sp, #0x38]
00a1731c	lsr w8,w28,#0x8
00a17320	strb w8,[x20, #0x1]
00a17324	lsr w8,w28,#0x10
00a17328	strb w8,[x20, #0x2]
00a1732c	lsr w8,w28,#0x18
00a17330	strb w8,[x20, #0x3]
00a17334	lsr w8,w24,#0x8
00a17338	strb w8,[x20, #0x5]
00a1733c	lsr w8,w24,#0x10
00a17340	strb w8,[x20, #0x6]
00a17344	lsr w8,w24,#0x18
00a17348	strb w28,[x20]
00a1734c	strb w24,[x20, #0x4]
00a17350	strb w8,[x20, #0x7]
00a17354	b 0x00a174b4
00a17358	b.lt 0x00a17428
00a1735c	str x8,[sp, #0x18]
00a17360	mvn x8,x25
00a17364	orr x9,xzr,#-0x10
00a17368	cmn x8,#0x10
00a1736c	csinv x8,x9,x25,le
00a17370	add x8,x8,x25
00a17374	add x8,x8,#0x8
00a17378	and x8,x8,#-0x8
00a1737c	str x8,[sp, #0x10]
00a17380	add x8,x8,#0x8
00a17384	str x8,[sp, #0x8]
00a17388	add x8,x24,x8
00a1738c	add x25,x25,#0x8
00a17390	stp x8,x19,[sp, #0x20]
00a17394	str x20,[sp, #0x30]
00a17398	mov w28,w26
00a1739c	mov w19,w27
00a173a0	ldp w26,w27,[x24], #0x8
00a173a4	add x0,sp,#0x38
00a173a8	mov x1,x23
00a173ac	mov x2,x22
00a173b0	mov x3,x21
00a173b4	stp w26,w27,[sp, #0x38]
00a173b8	bl 0x00a16d00
00a173bc	ldp w8,w9,[sp, #0x38]
00a173c0	sub x25,x25,#0x8
00a173c4	cmp x25,#0xf
00a173c8	eor w8,w8,w28
00a173cc	eor w9,w9,w19
00a173d0	lsr w10,w8,#0x8
00a173d4	lsr w11,w8,#0x10
00a173d8	strb w8,[x20]
00a173dc	lsr w8,w8,#0x18
00a173e0	strb w9,[x20, #0x4]
00a173e4	strb w10,[x20, #0x1]
00a173e8	lsr w10,w9,#0x8
00a173ec	strb w11,[x20, #0x2]
00a173f0	lsr w11,w9,#0x10
00a173f4	lsr w9,w9,#0x18
00a173f8	strb w8,[x20, #0x3]
00a173fc	strb w10,[x20, #0x5]
00a17400	strb w11,[x20, #0x6]
00a17404	strb w9,[x20, #0x7]
00a17408	add x20,x20,#0x8
00a1740c	b.gt 0x00a17398
00a17410	ldp x9,x8,[sp, #0x10]
00a17414	ldp x19,x20,[sp, #0x28]
00a17418	ldr x24,[sp, #0x20]
00a1741c	sub x25,x8,x9
00a17420	ldr x8,[sp, #0x8]
00a17424	add x20,x20,x8
00a17428	cbz x25,0x00a174ac
00a1742c	ldp w28,w24,[x24]
00a17430	add x0,sp,#0x38
00a17434	mov x1,x23
00a17438	mov x2,x22
00a1743c	mov x3,x21
00a17440	stp w28,w24,[sp, #0x38]
00a17444	bl 0x00a16d00
00a17448	sub x8,x25,#0x1
00a1744c	cmp x8,#0x6
00a17450	b.hi 0x00a174b4
00a17454	adrp x11,0x752000
00a17458	add x11,x11,#0x724
00a1745c	ldrsw x12,[x11, x8, LSL #0x2]
00a17460	ldp w9,w10,[sp, #0x38]
00a17464	add x11,x12,x11
00a17468	eor w8,w9,w26
00a1746c	eor w10,w10,w27
00a17470	add x9,x20,x25
00a17474	br x11
00a17478	lsr w11,w10,#0x10
00a1747c	strb w11,[x9, #-0x1]!
00a17480	lsr w11,w10,#0x8
00a17484	strb w11,[x9, #-0x1]!
00a17488	strb w10,[x9, #-0x1]!
00a1748c	lsr w10,w8,#0x18
00a17490	strb w10,[x9, #-0x1]!
00a17494	lsr w10,w8,#0x10
00a17498	strb w10,[x9, #-0x1]!
00a1749c	lsr w10,w8,#0x8
00a174a0	strb w10,[x9, #-0x1]!
00a174a4	sturb w8,[x9, #-0x1]
00a174a8	b 0x00a174b4
00a174ac	mov w28,w26
00a174b0	mov w24,w27
00a174b4	lsr w8,w28,#0x8
00a174b8	lsr w9,w28,#0x10
00a174bc	lsr w10,w28,#0x18
00a174c0	lsr w11,w24,#0x8
00a174c4	lsr w12,w24,#0x10
00a174c8	lsr w13,w24,#0x18
00a174cc	strb w28,[x19]
00a174d0	strb w24,[x19, #0x4]
00a174d4	strb w8,[x19, #0x1]
00a174d8	strb w9,[x19, #0x2]
00a174dc	strb w10,[x19, #0x3]
00a174e0	strb w11,[x19, #0x5]
00a174e4	strb w12,[x19, #0x6]
00a174e8	strb w13,[x19, #0x7]
00a174ec	ldp x29,x30,[sp, #0x90]
00a174f0	ldp x20,x19,[sp, #0x80]
00a174f4	ldp x22,x21,[sp, #0x70]
00a174f8	ldp x24,x23,[sp, #0x60]
00a174fc	ldp x26,x25,[sp, #0x50]
00a17500	ldp x28,x27,[sp, #0x40]
00a17504	add sp,sp,#0xa0
00a17508	ret
00a1750c	mov w10,w8
00a17510	b 0x00a172f8
