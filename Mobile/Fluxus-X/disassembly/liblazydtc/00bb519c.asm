; FUN_00bb519c @ 00bb519c
00bb519c	cbz x3,0x00bb5218
00bb51a0	subs x14,x3,#0x8
00bb51a4	b.cc 0x00bb5220
00bb51a8	add x8,x2,x3
00bb51ac	ldurb w9,[x8, #-0x1]
00bb51b0	cbz w9,0x00bb53f8
00bb51b4	cmn x3,#0x78
00bb51b8	b.hi 0x00bb5678
00bb51bc	mov x8,x4
00bb51c0	clz w9,w9
00bb51c4	bic x15,x1,x1, ASR #0x3f
00bb51c8	ldr w13,[x8], #0x4
00bb51cc	ldr x11,[x2, x14#0x0]
00bb51d0	eor w10,w9,#0x1f
00bb51d4	mov w12,#0x8
00bb51d8	cmp x1,#0x7
00bb51dc	lsr w9,w13,#0x10
00bb51e0	sub w12,w12,w10
00bb51e4	add x10,x0,x15
00bb51e8	b.gt 0x00bb52c8
00bb51ec	cmp x3,#0x10
00bb51f0	add x13,x2,x14
00bb51f4	b.ge 0x00bb5518
00bb51f8	cbz x14,0x00bb5528
00bb51fc	lsr w11,w12,#0x3
00bb5200	sub x15,x13,x11
00bb5204	cmp x15,x2
00bb5208	csel w11,w14,w11,cc
00bb520c	sub x13,x13,x11
00bb5210	sub w12,w12,w11, LSL #0x3
00bb5214	b 0x00bb5524
00bb5218	mov x0,#-0x48
00bb521c	ret
00bb5220	ldrb w11,[x2]
00bb5224	cmp x3,#0x4
00bb5228	b.gt 0x00bb5248
00bb522c	cmp x3,#0x2
00bb5230	b.eq 0x00bb5288
00bb5234	cmp x3,#0x3
00bb5238	b.eq 0x00bb5280
00bb523c	cmp x3,#0x4
00bb5240	b.eq 0x00bb5278
00bb5244	b 0x00bb5290
00bb5248	cmp x3,#0x5
00bb524c	b.eq 0x00bb5270
00bb5250	cmp x3,#0x6
00bb5254	b.eq 0x00bb5268
00bb5258	cmp x3,#0x7
00bb525c	b.ne 0x00bb5290
00bb5260	ldrb w8,[x2, #0x6]
00bb5264	orr x11,x11,x8, LSL #0x30
00bb5268	ldrb w8,[x2, #0x5]
00bb526c	add x11,x11,x8, LSL #0x28
00bb5270	ldrb w8,[x2, #0x4]
00bb5274	add x11,x11,x8, LSL #0x20
00bb5278	ldrb w8,[x2, #0x3]
00bb527c	add x11,x11,x8, LSL #0x18
00bb5280	ldrb w8,[x2, #0x2]
00bb5284	add x11,x11,x8, LSL #0x10
00bb5288	ldrb w8,[x2, #0x1]
00bb528c	add x11,x11,x8, LSL #0x8
00bb5290	add x8,x2,x3
00bb5294	ldurb w9,[x8, #-0x1]
00bb5298	cbz w9,0x00bb5400
00bb529c	mov x8,x4
00bb52a0	clz w9,w9
00bb52a4	bic x14,x1,x1, ASR #0x3f
00bb52a8	ldr w13,[x8], #0x4
00bb52ac	sub w10,w9,w3, LSL #0x3
00bb52b0	cmp x1,#0x8
00bb52b4	lsr w9,w13,#0x10
00bb52b8	add w12,w10,#0x29
00bb52bc	add x10,x0,x14
00bb52c0	b.lt 0x00bb5408
00bb52c4	mov x14,xzr
00bb52c8	and w13,w13,#0xfc0000
00bb52cc	neg w15,w9
00bb52d0	add x16,x4,#0x4
00bb52d4	cmp w13,#0xc0, LSL #12
00bb52d8	and w15,w15,#0x3f
00bb52dc	b.cs 0x00bb5410
00bb52e0	sub x3,x10,#0x9
00bb52e4	adrp x17,0x789000
00bb52e8	add x17,x17,#0x2b0
00bb52ec	cmp x14,#0x8
00bb52f0	b.ge 0x00bb5318
00bb52f4	add x13,x2,x14
00bb52f8	cbz x14,0x00bb5528
00bb52fc	lsr w11,w12,#0x3
00bb5300	sub x13,x13,x11
00bb5304	cmp x13,x2
00bb5308	csel w11,w11,w14,cs
00bb530c	cset w13,cs
00bb5310	sub w12,w12,w11, LSL #0x3
00bb5314	b 0x00bb5324
00bb5318	lsr w11,w12,#0x3
00bb531c	and w12,w12,#0x7
00bb5320	mov w13,#0x1
00bb5324	sub x14,x14,w11, UXTW 
00bb5328	cmp x0,x3
00bb532c	ldr x11,[x2, x14#0x0]
00bb5330	b.cs 0x00bb5508
00bb5334	cbz w13,0x00bb5508
00bb5338	lsl x13,x11,x12
00bb533c	lsr x13,x13,x15
00bb5340	add x13,x16,x13, LSL #0x2
00bb5344	ldrh w4,[x13]
00bb5348	strh w4,[x0]
00bb534c	ldrb w4,[x13, #0x2]
00bb5350	ldrb w13,[x13, #0x3]
00bb5354	add w12,w12,w4
00bb5358	add x13,x0,x13
00bb535c	lsl x4,x11,x12
00bb5360	lsr x4,x4,x15
00bb5364	add x4,x16,x4, LSL #0x2
00bb5368	ldrh w5,[x4]
00bb536c	strh w5,[x13]
00bb5370	ldrb w0,[x4, #0x2]
00bb5374	ldrb w4,[x4, #0x3]
00bb5378	add w12,w12,w0
00bb537c	add x13,x13,x4
00bb5380	lsl x0,x11,x12
00bb5384	lsr x0,x0,x15
00bb5388	add x0,x16,x0, LSL #0x2
00bb538c	ldrh w5,[x0]
00bb5390	strh w5,[x13]
00bb5394	ldrb w4,[x0, #0x2]
00bb5398	ldrb w0,[x0, #0x3]
00bb539c	add w12,w12,w4
00bb53a0	add x13,x13,x0
00bb53a4	lsl x4,x11,x12
00bb53a8	lsr x4,x4,x15
00bb53ac	add x4,x16,x4, LSL #0x2
00bb53b0	ldrh w5,[x4]
00bb53b4	strh w5,[x13]
00bb53b8	ldrb w0,[x4, #0x2]
00bb53bc	ldrb w4,[x4, #0x3]
00bb53c0	add w12,w12,w0
00bb53c4	add x13,x13,x4
00bb53c8	lsl x0,x11,x12
00bb53cc	lsr x0,x0,x15
00bb53d0	add x0,x16,x0, LSL #0x2
00bb53d4	ldrh w5,[x0]
00bb53d8	strh w5,[x13]
00bb53dc	ldrb w4,[x0, #0x2]
00bb53e0	ldrb w0,[x0, #0x3]
00bb53e4	add w12,w12,w4
00bb53e8	add x0,x13,x0
00bb53ec	cmp w12,#0x40
00bb53f0	b.ls 0x00bb52ec
00bb53f4	b 0x00bb5500
00bb53f8	mov x0,#-0x1
00bb53fc	ret
00bb5400	mov x0,#-0x14
00bb5404	ret
00bb5408	mov x13,x2
00bb540c	b 0x00bb5528
00bb5410	sub x3,x10,#0x7
00bb5414	adrp x17,0x789000
00bb5418	add x17,x17,#0x2b0
00bb541c	cmp x14,#0x8
00bb5420	b.ge 0x00bb5448
00bb5424	add x13,x2,x14
00bb5428	cbz x14,0x00bb5528
00bb542c	lsr w11,w12,#0x3
00bb5430	sub x13,x13,x11
00bb5434	cmp x13,x2
00bb5438	csel w11,w11,w14,cs
00bb543c	cset w13,cs
00bb5440	sub w12,w12,w11, LSL #0x3
00bb5444	b 0x00bb5454
00bb5448	lsr w11,w12,#0x3
00bb544c	and w12,w12,#0x7
00bb5450	mov w13,#0x1
00bb5454	sub x14,x14,w11, UXTW 
00bb5458	cmp x0,x3
00bb545c	ldr x11,[x2, x14#0x0]
00bb5460	b.cs 0x00bb5510
00bb5464	cbz w13,0x00bb5510
00bb5468	lsl x13,x11,x12
00bb546c	lsr x13,x13,x15
00bb5470	add x13,x16,x13, LSL #0x2
00bb5474	ldrh w4,[x13]
00bb5478	strh w4,[x0]
00bb547c	ldrb w4,[x13, #0x2]
00bb5480	ldrb w13,[x13, #0x3]
00bb5484	add w12,w12,w4
00bb5488	add x13,x0,x13
00bb548c	lsl x4,x11,x12
00bb5490	lsr x4,x4,x15
00bb5494	add x4,x16,x4, LSL #0x2
00bb5498	ldrh w5,[x4]
00bb549c	strh w5,[x13]
00bb54a0	ldrb w0,[x4, #0x2]
00bb54a4	ldrb w4,[x4, #0x3]
00bb54a8	add w12,w12,w0
00bb54ac	add x13,x13,x4
00bb54b0	lsl x0,x11,x12
00bb54b4	lsr x0,x0,x15
00bb54b8	add x0,x16,x0, LSL #0x2
00bb54bc	ldrh w5,[x0]
00bb54c0	strh w5,[x13]
00bb54c4	ldrb w4,[x0, #0x2]
00bb54c8	ldrb w0,[x0, #0x3]
00bb54cc	add w12,w12,w4
00bb54d0	add x13,x13,x0
00bb54d4	lsl x4,x11,x12
00bb54d8	lsr x4,x4,x15
00bb54dc	add x4,x16,x4, LSL #0x2
00bb54e0	ldrh w5,[x4]
00bb54e4	strh w5,[x13]
00bb54e8	ldrb w0,[x4, #0x2]
00bb54ec	add w12,w12,w0
00bb54f0	ldrb w0,[x4, #0x3]
00bb54f4	cmp w12,#0x40
00bb54f8	add x0,x13,x0
00bb54fc	b.ls 0x00bb541c
00bb5500	mov x13,x17
00bb5504	b 0x00bb5528
00bb5508	add x13,x2,x14
00bb550c	b 0x00bb5528
00bb5510	add x13,x2,x14
00bb5514	b 0x00bb5528
00bb5518	lsr w11,w12,#0x3
00bb551c	and w12,w12,#0x7
00bb5520	sub x13,x13,x11
00bb5524	ldr x11,[x13]
00bb5528	sub x14,x10,x0
00bb552c	cmp x14,#0x2
00bb5530	b.cc 0x00bb5614
00bb5534	neg w15,w9
00bb5538	cmp w12,#0x40
00bb553c	sub x14,x10,#0x2
00bb5540	and w15,w15,#0x3f
00bb5544	b.hi 0x00bb5680
00bb5548	add x17,x2,#0x8
00bb554c	adrp x16,0x789000
00bb5550	add x16,x16,#0x2b0
00bb5554	cmp x13,x17
00bb5558	b.cs 0x00bb5584
00bb555c	cmp x13,x2
00bb5560	b.eq 0x00bb55e0
00bb5564	lsr w11,w12,#0x3
00bb5568	sub w4,w13,w2
00bb556c	sub x3,x13,x11
00bb5570	cmp x3,x2
00bb5574	csel w11,w11,w4,cs
00bb5578	cset w3,cs
00bb557c	sub w12,w12,w11, LSL #0x3
00bb5580	b 0x00bb5590
00bb5584	lsr w11,w12,#0x3
00bb5588	and w12,w12,#0x7
00bb558c	mov w3,#0x1
00bb5590	sub x13,x13,w11, UXTW 
00bb5594	cmp x0,x14
00bb5598	ldr x11,[x13]
00bb559c	b.hi 0x00bb55e0
00bb55a0	tbz w3,#0x0,0x00bb55e0
00bb55a4	lsl x3,x11,x12
00bb55a8	lsr x3,x3,x15
00bb55ac	add x3,x8,x3, LSL #0x2
00bb55b0	ldrh w4,[x3]
00bb55b4	strh w4,[x0]
00bb55b8	ldrb w4,[x3, #0x2]
00bb55bc	ldrb w3,[x3, #0x3]
00bb55c0	add w12,w12,w4
00bb55c4	add x0,x0,x3
00bb55c8	cmp w12,#0x40
00bb55cc	b.ls 0x00bb5554
00bb55d0	mov x13,x16
00bb55d4	cmp x0,x14
00bb55d8	b.ls 0x00bb55e8
00bb55dc	b 0x00bb5614
00bb55e0	cmp x0,x14
00bb55e4	b.hi 0x00bb5614
00bb55e8	lsl x16,x11,x12
00bb55ec	lsr x16,x16,x15
00bb55f0	add x16,x8,x16, LSL #0x2
00bb55f4	ldrh w17,[x16]
00bb55f8	strh w17,[x0]
00bb55fc	ldrb w17,[x16, #0x3]
00bb5600	ldrb w16,[x16, #0x2]
00bb5604	add x0,x0,x17
00bb5608	add w12,w12,w16
00bb560c	cmp x0,x14
00bb5610	b.ls 0x00bb55e8
00bb5614	cmp x0,x10
00bb5618	b.cs 0x00bb5668
00bb561c	lsl x10,x11,x12
00bb5620	neg w9,w9
00bb5624	lsr x9,x10,x9
00bb5628	add x8,x8,x9, LSL #0x2
00bb562c	ldrb w9,[x8]
00bb5630	strb w9,[x0]
00bb5634	ldrb w9,[x8, #0x3]
00bb5638	cmp w9,#0x1
00bb563c	b.ne 0x00bb564c
00bb5640	ldrb w8,[x8, #0x2]
00bb5644	add w12,w12,w8
00bb5648	b 0x00bb5668
00bb564c	cmp w12,#0x3f
00bb5650	b.hi 0x00bb5668
00bb5654	ldrb w8,[x8, #0x2]
00bb5658	mov w9,#0x40
00bb565c	add w8,w12,w8
00bb5660	cmp w8,#0x40
00bb5664	csel w12,w8,w9,cc
00bb5668	cmp w12,#0x40
00bb566c	mov x8,#-0x14
00bb5670	ccmp x13,x2,#0x0,eq
00bb5674	csel x3,x1,x8,eq
00bb5678	mov x0,x3
00bb567c	ret
00bb5680	adrp x13,0x789000
00bb5684	add x13,x13,#0x2b0
00bb5688	cmp x0,x14
00bb568c	b.ls 0x00bb55e8
00bb5690	b 0x00bb5614
