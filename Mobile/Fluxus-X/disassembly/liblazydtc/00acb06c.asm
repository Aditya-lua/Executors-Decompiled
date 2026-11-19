; RC2_encrypt @ 00acb06c
00acb06c	ldp x10,x11,[x0]
00acb070	mov w8,#0x5
00acb074	orr w9,wzr,#0x3
00acb078	mov x15,x1
00acb07c	and w14,w10,#0xffff
00acb080	lsr x12,x10,#0x10
00acb084	and w10,w11,#0xffff
00acb088	lsr x11,x11,#0x10
00acb08c	mov w13,#0x5
00acb090	b 0x00acb0d0
00acb094	and w13,w11,#0x3f
00acb098	ldr w13,[x1, w13, UXTW #0x2]
00acb09c	cmp w9,#0x2
00acb0a0	add w14,w13,w14
00acb0a4	and w13,w14,#0x3f
00acb0a8	ldr w13,[x1, w13, UXTW #0x2]
00acb0ac	add w12,w13,w12
00acb0b0	and w13,w12,#0x3f
00acb0b4	ldr w13,[x1, w13, UXTW #0x2]
00acb0b8	add w10,w13,w10
00acb0bc	and w13,w10,#0x3f
00acb0c0	ldr w15,[x1, w13, UXTW #0x2]
00acb0c4	cinc w13,w8,eq
00acb0c8	add w11,w15,w11
00acb0cc	mov x15,x16
00acb0d0	and w17,w11,w10
00acb0d4	add w14,w17,w14
00acb0d8	ldp w18,w17,[x15]
00acb0dc	bic w16,w12,w11
00acb0e0	add w14,w14,w16
00acb0e4	add x16,x15,#0x10
00acb0e8	add w14,w14,w18
00acb0ec	ldp w18,w2,[x15, #0x8]
00acb0f0	add w12,w17,w12
00acb0f4	subs w13,w13,#0x1
00acb0f8	add w15,w18,w10
00acb0fc	and w18,w14,#0xffff
00acb100	ubfx w14,w14,#0xf,#0x1
00acb104	bfm w14,w18,#0x1f,#0xf
00acb108	and w18,w14,w11
00acb10c	bic w10,w10,w14
00acb110	add w12,w12,w18
00acb114	add w10,w12,w10
00acb118	and w18,w10,#0xffff
00acb11c	ubfx w12,w10,#0xe,#0x2
00acb120	bfm w12,w18,#0x1e,#0xf
00acb124	add w17,w2,w11
00acb128	bic w10,w11,w12
00acb12c	and w11,w12,w14
00acb130	add w11,w15,w11
00acb134	add w10,w11,w10
00acb138	and w11,w10,#0xffff
00acb13c	ubfx w10,w10,#0xd,#0x3
00acb140	bfm w10,w11,#0x1d,#0xf
00acb144	and w15,w10,w12
00acb148	bic w11,w14,w10
00acb14c	add w15,w17,w15
00acb150	add w11,w15,w11
00acb154	and w15,w11,#0xffff
00acb158	ubfx w11,w11,#0xb,#0x5
00acb15c	bfm w11,w15,#0x1b,#0xf
00acb160	mov x15,x16
00acb164	b.ne 0x00acb0d0
00acb168	subs w9,w9,#0x1
00acb16c	b.ne 0x00acb094
00acb170	bfm w14,w12,#0x10,#0xf
00acb174	bfm w10,w11,#0x10,#0xf
00acb178	stp x14,x10,[x0]
00acb17c	ret
