; gf_deserialize @ 00a4aab0
00a4aab0	stp x20,x19,[sp, #-0x20]!
00a4aab4	adrp x14,0x760000
00a4aab8	mov x8,xzr
00a4aabc	mov w9,wzr
00a4aac0	mov w10,wzr
00a4aac4	mov x19,xzr
00a4aac8	mov x15,xzr
00a4aacc	mov x20,xzr
00a4aad0	mov x11,xzr
00a4aad4	mvn w12,w3
00a4aad8	mov w13,#0x40
00a4aadc	add x14,x14,#0xa40
00a4aae0	stp x29,x30,[sp, #0x10]
00a4aae4	add x29,sp,#0x10
00a4aae8	cmp w10,#0x37
00a4aaec	b.hi 0x00a4ab5c
00a4aaf0	cmp w9,#0x37
00a4aaf4	b.hi 0x00a4ab5c
00a4aaf8	mov w9,w9
00a4aafc	ldrb w16,[x1, x9]
00a4ab00	cmp x9,#0x37
00a4ab04	csinv w18,w12,wzr,eq
00a4ab08	mov w17,w10
00a4ab0c	and w16,w16,w18
00a4ab10	sub x3,x13,x17
00a4ab14	and x16,x16,#0xff
00a4ab18	cmp x17,#0x0
00a4ab1c	sub x4,x17,#0x40
00a4ab20	lsr x18,x16,x3
00a4ab24	lsl x3,x16,x4
00a4ab28	lsl x16,x16,x17
00a4ab2c	csel x17,xzr,x18,eq
00a4ab30	cmp x4,#0x0
00a4ab34	add w10,w10,#0x8
00a4ab38	csel x17,x3,x17,ge
00a4ab3c	csel x16,xzr,x16,ge
00a4ab40	cmp w10,#0x37
00a4ab44	orr x11,x17,x11
00a4ab48	orr x20,x16,x20
00a4ab4c	add x9,x9,#0x1
00a4ab50	b.hi 0x00a4ab5c
00a4ab54	cmp x9,#0x38
00a4ab58	b.cc 0x00a4aafc
00a4ab5c	and x16,x20,#0xffffffffffffff
00a4ab60	cmp x8,#0x7
00a4ab64	lsl x17,x8,#0x3
00a4ab68	csel x16,x16,x20,cc
00a4ab6c	str x16,[x0, x17#0x0]
00a4ab70	ldr x17,[x14, x17#0x0]
00a4ab74	adds x16,x16,x19
00a4ab78	adcs x15,x15,xzr
00a4ab7c	add x8,x8,#0x1
00a4ab80	cmp x16,x17
00a4ab84	sbcs x19,x15,xzr
00a4ab88	sub w10,w10,#0x38
00a4ab8c	extr x20,x11,x20,#0x38
00a4ab90	lsr x11,x11,#0x38
00a4ab94	cmp x8,#0x8
00a4ab98	asr x15,x19,#0x3f
00a4ab9c	b.ne 0x00a4aae8
00a4aba0	cbz w2,0x00a4abac
00a4aba4	mov x8,#-0x1
00a4aba8	b 0x00a4abb4
00a4abac	bl 0x00a4a84c
00a4abb0	mvn x8,x0
00a4abb4	sub x9,x20,#0x1
00a4abb8	sub x10,x19,#0x1
00a4abbc	bic x9,x9,x20
00a4abc0	ldp x29,x30,[sp, #0x10]
00a4abc4	asr x9,x9,#0x3f
00a4abc8	bic x10,x10,x19
00a4abcc	bic x9,x9,x10, ASR #0x3f
00a4abd0	and x0,x9,x8
00a4abd4	ldp x20,x19,[sp], #0x20
00a4abd8	ret
