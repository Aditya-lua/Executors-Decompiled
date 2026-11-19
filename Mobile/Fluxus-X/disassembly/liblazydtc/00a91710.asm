; CAST_cfb64_encrypt @ 00a91710
00a91710	str x25,[sp, #-0x50]!
00a91714	stp x24,x23,[sp, #0x10]
00a91718	stp x22,x21,[sp, #0x20]
00a9171c	stp x20,x19,[sp, #0x30]
00a91720	stp x29,x30,[sp, #0x40]
00a91724	ldr w25,[x5]
00a91728	mov x19,x5
00a9172c	mov x20,x4
00a91730	mov x21,x3
00a91734	mov x22,x2
00a91738	mov x23,x1
00a9173c	mov x24,x0
00a91740	add x29,sp,#0x40
00a91744	cbz w6,0x00a917e0
00a91748	cbz x22,0x00a91874
00a9174c	cbnz w25,0x00a917b4
00a91750	ldr w8,[x20]
00a91754	add x0,sp,#0x8
00a91758	mov x1,x21
00a9175c	rev w8,w8
00a91760	str w8,[sp, #0x8]
00a91764	ldr w8,[x20, #0x4]
00a91768	rev w8,w8
00a9176c	str w8,[sp, #0xc]
00a91770	bl 0x00c392b0
00a91774	ldr w8,[sp, #0x8]
00a91778	lsr w9,w8,#0x18
00a9177c	strb w9,[x20]
00a91780	lsr w9,w8,#0x10
00a91784	strb w8,[x20, #0x3]
00a91788	lsr w8,w8,#0x8
00a9178c	strb w9,[x20, #0x1]
00a91790	strb w8,[x20, #0x2]
00a91794	ldr w8,[sp, #0xc]
00a91798	lsr w9,w8,#0x18
00a9179c	strb w9,[x20, #0x4]
00a917a0	lsr w9,w8,#0x10
00a917a4	strb w9,[x20, #0x5]
00a917a8	lsr w9,w8,#0x8
00a917ac	strb w9,[x20, #0x6]
00a917b0	strb w8,[x20, #0x7]
00a917b4	sxtw x9,w25
00a917b8	ldrb w8,[x24], #0x1
00a917bc	ldrb w10,[x20, x9]
00a917c0	add w11,w25,#0x1
00a917c4	subs x22,x22,#0x1
00a917c8	and w25,w11,#0x7
00a917cc	eor w8,w10,w8
00a917d0	strb w8,[x23], #0x1
00a917d4	strb w8,[x20, x9]
00a917d8	b.ne 0x00a9174c
00a917dc	b 0x00a91874
00a917e0	cbz x22,0x00a91874
00a917e4	cbnz w25,0x00a9184c
00a917e8	ldr w8,[x20]
00a917ec	add x0,sp,#0x8
00a917f0	mov x1,x21
00a917f4	rev w8,w8
00a917f8	str w8,[sp, #0x8]
00a917fc	ldr w8,[x20, #0x4]
00a91800	rev w8,w8
00a91804	str w8,[sp, #0xc]
00a91808	bl 0x00c392b0
00a9180c	ldr w8,[sp, #0x8]
00a91810	lsr w9,w8,#0x18
00a91814	strb w9,[x20]
00a91818	lsr w9,w8,#0x10
00a9181c	strb w8,[x20, #0x3]
00a91820	lsr w8,w8,#0x8
00a91824	strb w9,[x20, #0x1]
00a91828	strb w8,[x20, #0x2]
00a9182c	ldr w8,[sp, #0xc]
00a91830	lsr w9,w8,#0x18
00a91834	strb w9,[x20, #0x4]
00a91838	lsr w9,w8,#0x10
00a9183c	strb w9,[x20, #0x5]
00a91840	lsr w9,w8,#0x8
00a91844	strb w9,[x20, #0x6]
00a91848	strb w8,[x20, #0x7]
00a9184c	sxtw x9,w25
00a91850	ldrb w8,[x24], #0x1
00a91854	ldrb w10,[x20, x9]
00a91858	add w11,w25,#0x1
00a9185c	subs x22,x22,#0x1
00a91860	strb w8,[x20, x9]
00a91864	eor w8,w10,w8
00a91868	strb w8,[x23], #0x1
00a9186c	and w25,w11,#0x7
00a91870	b.ne 0x00a917e4
00a91874	str w25,[x19]
00a91878	ldp x29,x30,[sp, #0x40]
00a9187c	ldp x20,x19,[sp, #0x30]
00a91880	ldp x22,x21,[sp, #0x20]
00a91884	ldp x24,x23,[sp, #0x10]
00a91888	ldr x25,[sp], #0x50
00a9188c	ret
