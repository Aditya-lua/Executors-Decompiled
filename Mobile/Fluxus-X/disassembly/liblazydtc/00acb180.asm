; RC2_decrypt @ 00acb180
00acb180	ldp x12,x14,[x0]
00acb184	add x8,x1,#0xfc
00acb188	mov w9,#0x5
00acb18c	orr w10,wzr,#0x3
00acb190	and w11,w12,#0xffff
00acb194	lsr x15,x12,#0x10
00acb198	and w13,w14,#0xffff
00acb19c	lsr x14,x14,#0x10
00acb1a0	mov w12,#0x5
00acb1a4	b 0x00acb1b0
00acb1a8	and w15,w15,#0xffff
00acb1ac	sub x8,x8,#0x10
00acb1b0	lsl w16,w14,#0xb
00acb1b4	eor w17,w13,#0xffff
00acb1b8	lsl w3,w13,#0xd
00acb1bc	orr w14,w16,w14, LSR #0x5
00acb1c0	lsl w16,w15,#0xe
00acb1c4	and w18,w13,w15
00acb1c8	orr w13,w3,w13, LSR #0x3
00acb1cc	orr w3,w16,w15, LSR #0x2
00acb1d0	and w16,w17,w11
00acb1d4	ldp w17,w2,[x8, #-0x4]
00acb1d8	add w16,w16,w18
00acb1dc	eor w4,w15,#0xffff
00acb1e0	and w15,w15,w11
00acb1e4	sub w14,w14,w16
00acb1e8	sub w13,w13,w15
00acb1ec	sub w16,w14,w2
00acb1f0	ldp w14,w2,[x8, #-0xc]
00acb1f4	sub w13,w13,w17
00acb1f8	lsl w17,w11,#0xf
00acb1fc	eor w15,w11,#0xffff
00acb200	orr w17,w17,w11, LSR #0x1
00acb204	and w18,w16,w4
00acb208	and w11,w16,w11
00acb20c	sub w18,w13,w18
00acb210	sub w11,w3,w11
00acb214	sub w17,w17,w14
00acb218	and w14,w16,#0xffff
00acb21c	and w15,w18,w15
00acb220	sub w11,w11,w2
00acb224	eor w3,w14,#0xffff
00acb228	and w2,w18,w16
00acb22c	sub w15,w11,w15
00acb230	sub w11,w17,w2
00acb234	and w17,w15,w3
00acb238	sub w17,w11,w17
00acb23c	and w13,w18,#0xffff
00acb240	subs w12,w12,#0x1
00acb244	and w11,w17,#0xffff
00acb248	b.ne 0x00acb1a8
00acb24c	subs w10,w10,#0x1
00acb250	b.eq 0x00acb29c
00acb254	and w11,w18,#0x3f
00acb258	ldr w11,[x1, w11, UXTW #0x2]
00acb25c	and w12,w15,#0x3f
00acb260	ldr w13,[x1, w12, UXTW #0x2]
00acb264	and w14,w17,#0x3f
00acb268	sub w11,w16,w11
00acb26c	ldr w16,[x1, w14, UXTW #0x2]
00acb270	and w14,w11,#0x3f
00acb274	sub w13,w18,w13
00acb278	ldr w18,[x1, w14, UXTW #0x2]
00acb27c	cmp w10,#0x2
00acb280	and w14,w11,#0xffff
00acb284	cinc w12,w9,eq
00acb288	sub w11,w17,w18
00acb28c	and w13,w13,#0xffff
00acb290	sub w15,w15,w16
00acb294	and w11,w11,#0xffff
00acb298	b 0x00acb1a8
00acb29c	bfm w11,w15,#0x10,#0xf
00acb2a0	bfm w13,w16,#0x10,#0xf
00acb2a4	stp x11,x13,[x0]
00acb2a8	ret
