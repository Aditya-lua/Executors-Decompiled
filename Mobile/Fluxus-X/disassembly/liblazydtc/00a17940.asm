; DES_set_key_checked @ 00a17940
00a17940	str x23,[sp, #-0x40]!
00a17944	stp x22,x21,[sp, #0x10]
00a17948	stp x20,x19,[sp, #0x20]
00a1794c	stp x29,x30,[sp, #0x30]
00a17950	ldrb w8,[x0]
00a17954	ldrb w9,[x0, #0x1]
00a17958	ldrb w10,[x0, #0x2]
00a1795c	ldrb w11,[x0, #0x3]
00a17960	ldrb w12,[x0, #0x4]
00a17964	ldrb w13,[x0, #0x5]
00a17968	eor w8,w8,w8, LSR #0x4
00a1796c	eor w9,w9,w9, LSR #0x4
00a17970	ldrb w14,[x0, #0x6]
00a17974	eor w10,w10,w10, LSR #0x4
00a17978	eor w8,w8,w8, LSR #0x2
00a1797c	eor w9,w9,w9, LSR #0x2
00a17980	ldrb w15,[x0, #0x7]
00a17984	eor w11,w11,w11, LSR #0x4
00a17988	eor w10,w10,w10, LSR #0x2
00a1798c	eor w8,w8,w8, LSR #0x1
00a17990	eor w9,w9,w9, LSR #0x1
00a17994	eor w12,w12,w12, LSR #0x4
00a17998	eor w11,w11,w11, LSR #0x2
00a1799c	eor w10,w10,w10, LSR #0x1
00a179a0	and w8,w8,w9
00a179a4	eor w13,w13,w13, LSR #0x4
00a179a8	eor w12,w12,w12, LSR #0x2
00a179ac	eor w11,w11,w11, LSR #0x1
00a179b0	and w8,w8,w10
00a179b4	eor w14,w14,w14, LSR #0x4
00a179b8	eor w13,w13,w13, LSR #0x2
00a179bc	eor w12,w12,w12, LSR #0x1
00a179c0	and w8,w8,w11
00a179c4	eor w15,w15,w15, LSR #0x4
00a179c8	eor w14,w14,w14, LSR #0x2
00a179cc	eor w13,w13,w13, LSR #0x1
00a179d0	and w8,w8,w12
00a179d4	eor w15,w15,w15, LSR #0x2
00a179d8	eor w14,w14,w14, LSR #0x1
00a179dc	and w8,w8,w13
00a179e0	eor w15,w15,w15, LSR #0x1
00a179e4	and w8,w8,w14
00a179e8	and w8,w8,w15
00a179ec	add x29,sp,#0x30
00a179f0	tbz w8,#0x0,0x00a17a4c
00a179f4	adrp x23,0x753000
00a179f8	mov x19,x0
00a179fc	mov x20,x1
00a17a00	mov x22,xzr
00a17a04	mov w21,wzr
00a17a08	add x23,x23,#0x40
00a17a0c	add x0,x23,x22
00a17a10	mov w2,#0x8
00a17a14	mov x1,x19
00a17a18	bl 0x00c362f0
00a17a1c	sub w8,w0,#0x1
00a17a20	add x22,x22,#0x8
00a17a24	bic w8,w8,w0
00a17a28	cmp x22,#0x80
00a17a2c	orr w21,w21,w8, ASR #0x1f
00a17a30	b.ne 0x00a17a0c
00a17a34	tbnz w21,#0x0,0x00a17a54
00a17a38	mov x0,x19
00a17a3c	mov x1,x20
00a17a40	bl 0x00a177ac
00a17a44	mov w0,wzr
00a17a48	b 0x00a17a58
00a17a4c	mov w0,#0xffffffff
00a17a50	b 0x00a17a58
00a17a54	orr w0,wzr,#0xfffffffe
00a17a58	ldp x29,x30,[sp, #0x30]
00a17a5c	ldp x20,x19,[sp, #0x20]
00a17a60	ldp x22,x21,[sp, #0x10]
00a17a64	ldr x23,[sp], #0x40
00a17a68	ret
