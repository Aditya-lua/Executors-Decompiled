; FUN_00b7b534 @ 00b7b534
00b7b534	ldp w8,w9,[x0, #0x20]
00b7b538	ldp w10,w11,[x0, #0x28]
00b7b53c	ldr w4,[x0, #0x30]
00b7b540	cbz x1,0x00b7b640
00b7b544	str x19,[sp, #-0x10]!
00b7b548	ldp w13,w12,[x0, #0x8]
00b7b54c	ldp w15,w14,[x0]
00b7b550	add x2,x2,#0x8
00b7b554	add w16,w12,w12, LSR #0x2
00b7b558	add w17,w13,w13, LSR #0x2
00b7b55c	add w18,w14,w14, LSR #0x2
00b7b560	ldp w5,w6,[x2, #-0x8]
00b7b564	ldp w7,w19,[x2], #0x10
00b7b568	add w4,w4,w3
00b7b56c	subs x1,x1,#0x1
00b7b570	add x8,x5,w8, UXTW 
00b7b574	add x9,x6,w9, UXTW 
00b7b578	add x10,x7,w10, UXTW 
00b7b57c	add x9,x9,x8, LSR #0x20
00b7b580	and x8,x8,#0xffffffff
00b7b584	add x11,x19,w11, UXTW 
00b7b588	add x10,x10,x9, LSR #0x20
00b7b58c	mul x5,x8,x15
00b7b590	and x9,x9,#0xffffffff
00b7b594	mul x6,x8,x14
00b7b598	mul x7,x8,x13
00b7b59c	mul x8,x8,x12
00b7b5a0	add x11,x11,x10, LSR #0x20
00b7b5a4	madd x5,x9,x16,x5
00b7b5a8	and x10,x10,#0xffffffff
00b7b5ac	madd x6,x9,x15,x6
00b7b5b0	madd x7,x9,x14,x7
00b7b5b4	madd x8,x9,x13,x8
00b7b5b8	lsr x9,x11,#0x20
00b7b5bc	madd x5,x10,x17,x5
00b7b5c0	and x11,x11,#0xffffffff
00b7b5c4	madd x6,x10,x16,x6
00b7b5c8	madd x7,x10,x15,x7
00b7b5cc	madd x8,x10,x14,x8
00b7b5d0	add w9,w4,w9
00b7b5d4	madd x10,x11,x18,x5
00b7b5d8	madd x4,x11,x17,x6
00b7b5dc	madd x5,x11,x16,x7
00b7b5e0	add x4,x4,x10, LSR #0x20
00b7b5e4	madd x8,x11,x15,x8
00b7b5e8	madd x11,x9,x17,x5
00b7b5ec	madd x4,x9,x18,x4
00b7b5f0	madd x8,x9,x16,x8
00b7b5f4	add x11,x11,x4, LSR #0x20
00b7b5f8	add x5,x8,x11, LSR #0x20
00b7b5fc	lsr x8,x5,#0x20
00b7b600	madd w8,w9,w15,w8
00b7b604	lsr w9,w8,#0x2
00b7b608	and w6,w8,#0xfffffffc
00b7b60c	and w7,w8,#0x3
00b7b610	add x8,x9,w10, UXTW 
00b7b614	add x8,x8,x6
00b7b618	lsr x9,x8,#0x20
00b7b61c	add x9,x9,w4, UXTW 
00b7b620	lsr x10,x9,#0x20
00b7b624	add x10,x10,w11, UXTW 
00b7b628	lsr x11,x10,#0x20
00b7b62c	add x11,x11,w5, UXTW 
00b7b630	lsr x4,x11,#0x20
00b7b634	add w4,w7,w4
00b7b638	b.ne 0x00b7b560
00b7b63c	ldr x19,[sp], #0x10
00b7b640	stp w8,w9,[x0, #0x20]
00b7b644	stp w10,w11,[x0, #0x28]
00b7b648	str w4,[x0, #0x30]
00b7b64c	ret
