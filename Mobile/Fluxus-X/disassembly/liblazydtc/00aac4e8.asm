; CRYPTO_ofb128_encrypt @ 00aac4e8
00aac4e8	sub sp,sp,#0x80
00aac4ec	stp x28,x27,[sp, #0x20]
00aac4f0	stp x26,x25,[sp, #0x30]
00aac4f4	stp x24,x23,[sp, #0x40]
00aac4f8	stp x22,x21,[sp, #0x50]
00aac4fc	stp x20,x19,[sp, #0x60]
00aac500	stp x29,x30,[sp, #0x70]
00aac504	ldr w26,[x5]
00aac508	mov x22,x5
00aac50c	add x29,sp,#0x70
00aac510	tbnz w26,#0x1f,0x00aac5e4
00aac514	mov x23,x6
00aac518	mov x20,x4
00aac51c	mov x24,x3
00aac520	mov x21,x2
00aac524	mov x25,x1
00aac528	mov x19,x0
00aac52c	cbz x2,0x00aac558
00aac530	cbz w26,0x00aac558
00aac534	ldrb w8,[x19], #0x1
00aac538	ldrb w9,[x20, w26, UXTW ]
00aac53c	add w10,w26,#0x1
00aac540	subs x21,x21,#0x1
00aac544	and w26,w10,#0xf
00aac548	eor w8,w9,w8
00aac54c	strb w8,[x25], #0x1
00aac550	b.eq 0x00aac558
00aac554	cbnz w26,0x00aac534
00aac558	subs x28,x21,#0x10
00aac55c	b.cc 0x00aac5ec
00aac560	and x8,x28,#-0x10
00aac564	str x8,[sp, #0x8]
00aac568	add x8,x8,#0x10
00aac56c	stp x8,x22,[sp, #0x10]
00aac570	add x27,x25,x8
00aac574	mov x22,x19
00aac578	mov x0,x20
00aac57c	mov x1,x20
00aac580	mov x2,x24
00aac584	blr x23
00aac588	cmp w26,#0xf
00aac58c	b.hi 0x00aac5b0
00aac590	mov w8,w26
00aac594	ldr x9,[x22, x8#0x0]
00aac598	ldr x10,[x20, x8#0x0]
00aac59c	eor x9,x10,x9
00aac5a0	str x9,[x25, x8#0x0]
00aac5a4	add x8,x8,#0x8
00aac5a8	cmp x8,#0x10
00aac5ac	b.cc 0x00aac594
00aac5b0	sub x21,x21,#0x10
00aac5b4	mov w26,wzr
00aac5b8	add x25,x25,#0x10
00aac5bc	cmp x21,#0xf
00aac5c0	add x22,x22,#0x10
00aac5c4	b.hi 0x00aac578
00aac5c8	ldr x8,[sp, #0x8]
00aac5cc	mov w26,wzr
00aac5d0	sub x21,x28,x8
00aac5d4	ldp x8,x22,[sp, #0x10]
00aac5d8	add x19,x19,x8
00aac5dc	cbnz x21,0x00aac5f4
00aac5e0	b 0x00aac6ec
00aac5e4	mov w26,#0xffffffff
00aac5e8	b 0x00aac6ec
00aac5ec	mov x27,x25
00aac5f0	cbz x21,0x00aac6ec
00aac5f4	mov x0,x20
00aac5f8	mov x1,x20
00aac5fc	mov x2,x24
00aac600	blr x23
00aac604	cmp x21,#0x20
00aac608	b.cc 0x00aac6c0
00aac60c	sub x8,x21,#0x1
00aac610	cmn w26,w8
00aac614	b.cs 0x00aac6c0
00aac618	lsr x8,x8,#0x20
00aac61c	cbnz x8,0x00aac6c0
00aac620	mov w8,w26
00aac624	add x10,x21,x8
00aac628	add x9,x27,x8
00aac62c	add x11,x19,x8
00aac630	add x12,x20,x8
00aac634	add x8,x19,x10
00aac638	add x13,x27,x10
00aac63c	cmp x9,x8
00aac640	add x10,x20,x10
00aac644	cset w8,cc
00aac648	cmp x11,x13
00aac64c	cset w11,cc
00aac650	cmp x9,x10
00aac654	and w10,w8,w11
00aac658	cset w8,cc
00aac65c	cmp x12,x13
00aac660	cset w9,cc
00aac664	tbnz w10,#0x0,0x00aac6c0
00aac668	and w8,w8,w9
00aac66c	tbnz w8,#0x0,0x00aac6c0
00aac670	and x10,x21,#-0x20
00aac674	add w8,w26,w10
00aac678	sub x9,x21,x10
00aac67c	mov x11,x10
00aac680	mov w12,w26
00aac684	mov w13,w12
00aac688	add x14,x19,x13
00aac68c	add x15,x20,x13
00aac690	ldp q0,q1,[x14]
00aac694	ldp q2,q3,[x15]
00aac698	subs x11,x11,#0x20
00aac69c	add x13,x27,x13
00aac6a0	add w12,w12,#0x20
00aac6a4	eor v0.16B,v2.16B,v0.16B
00aac6a8	eor v1.16B,v3.16B,v1.16B
00aac6ac	stp q0,q1,[x13]
00aac6b0	b.ne 0x00aac684
00aac6b4	cmp x21,x10
00aac6b8	b.ne 0x00aac6c8
00aac6bc	b 0x00aac6e8
00aac6c0	mov w8,w26
00aac6c4	mov x9,x21
00aac6c8	mov w10,w8
00aac6cc	ldrb w11,[x19, x10]
00aac6d0	ldrb w12,[x20, x10]
00aac6d4	subs x9,x9,#0x1
00aac6d8	add w8,w8,#0x1
00aac6dc	eor w11,w12,w11
00aac6e0	strb w11,[x27, x10]
00aac6e4	b.ne 0x00aac6c8
00aac6e8	add w26,w26,w21
00aac6ec	str w26,[x22]
00aac6f0	ldp x29,x30,[sp, #0x70]
00aac6f4	ldp x20,x19,[sp, #0x60]
00aac6f8	ldp x22,x21,[sp, #0x50]
00aac6fc	ldp x24,x23,[sp, #0x40]
00aac700	ldp x26,x25,[sp, #0x30]
00aac704	ldp x28,x27,[sp, #0x20]
00aac708	add sp,sp,#0x80
00aac70c	ret
