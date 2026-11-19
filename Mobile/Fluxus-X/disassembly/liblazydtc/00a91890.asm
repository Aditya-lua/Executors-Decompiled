; CAST_ecb_encrypt @ 00a91890
00a91890	str x19,[sp, #-0x20]!
00a91894	stp x29,x30,[sp, #0x10]
00a91898	ldr w8,[x0]
00a9189c	mov x19,x1
00a918a0	mov x1,x2
00a918a4	add x29,sp,#0x10
00a918a8	rev w8,w8
00a918ac	str w8,[sp, #0x8]
00a918b0	ldr w8,[x0, #0x4]
00a918b4	add x0,sp,#0x8
00a918b8	rev w8,w8
00a918bc	str w8,[sp, #0xc]
00a918c0	cbz w3,0x00a918cc
00a918c4	bl 0x00c392b0
00a918c8	b 0x00a918d0
00a918cc	bl 0x00c392a0
00a918d0	ldr w8,[sp, #0x8]
00a918d4	lsr w9,w8,#0x18
00a918d8	strb w9,[x19]
00a918dc	lsr w9,w8,#0x10
00a918e0	strb w8,[x19, #0x3]
00a918e4	lsr w8,w8,#0x8
00a918e8	strb w9,[x19, #0x1]
00a918ec	strb w8,[x19, #0x2]
00a918f0	ldr w8,[sp, #0xc]
00a918f4	lsr w9,w8,#0x18
00a918f8	strb w9,[x19, #0x4]
00a918fc	lsr w9,w8,#0x10
00a91900	strb w9,[x19, #0x5]
00a91904	lsr w9,w8,#0x8
00a91908	strb w9,[x19, #0x6]
00a9190c	strb w8,[x19, #0x7]
00a91910	ldp x29,x30,[sp, #0x10]
00a91914	ldr x19,[sp], #0x20
00a91918	ret
