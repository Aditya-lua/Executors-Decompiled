; OPENSSL_gmtime_adj @ 00a9bd90
00a9bd90	mov x8,#0x2957
00a9bd94	movk x8,#0xce51, LSL #16
00a9bd98	movk x8,#0xc8a0, LSL #32
00a9bd9c	movk x8,#0x1845, LSL #48
00a9bda0	ldp w14,w9,[x0, #0x4]
00a9bda4	smulh x8,x2,x8
00a9bda8	mov w11,#0xae80
00a9bdac	asr x13,x8,#0xd
00a9bdb0	movk w11,#0xfffe, LSL #16
00a9bdb4	add x8,x13,x8, LSR #0x3f
00a9bdb8	ldr w13,[x0]
00a9bdbc	mov w12,#0xe10
00a9bdc0	madd w15,w8,w11,w2
00a9bdc4	madd w9,w9,w12,w15
00a9bdc8	orr w12,wzr,#0x3c
00a9bdcc	mov w10,#0x517f
00a9bdd0	madd w9,w14,w12,w9
00a9bdd4	movk w10,#0x1, LSL #16
00a9bdd8	add w9,w9,w13
00a9bddc	cmp w9,w10
00a9bde0	add x8,x8,w1, SXTW 
00a9bde4	b.le 0x00a9bdf4
00a9bde8	add x8,x8,#0x1
00a9bdec	add w9,w9,w11
00a9bdf0	b 0x00a9be04
00a9bdf4	tbz w9,#0x1f,0x00a9be04
00a9bdf8	add w9,w9,w10
00a9bdfc	sub x8,x8,#0x1
00a9be00	add w9,w9,#0x1
00a9be04	ldp w12,w10,[x0, #0x10]
00a9be08	mov w13,#0xaaab
00a9be0c	movk w13,#0x2aaa, LSL #16
00a9be10	mov w14,#0x5b5
00a9be14	sub w16,w12,#0xd
00a9be18	smull x16,w16,w13
00a9be1c	lsr x17,x16,#0x3f
00a9be20	asr x16,x16,#0x21
00a9be24	add w16,w16,w17
00a9be28	mov w17,#0xfffffff4
00a9be2c	madd w12,w16,w17,w12
00a9be30	add w10,w10,w16
00a9be34	mov w16,#0x16f
00a9be38	mul w12,w12,w16
00a9be3c	mov w16,#0x1a90
00a9be40	mul w14,w10,w14
00a9be44	add w10,w10,w16
00a9be48	mov w16,#0x851f
00a9be4c	mov w15,#0x5d1c
00a9be50	movk w16,#0x51eb, LSL #16
00a9be54	ldr w11,[x0, #0xc]
00a9be58	movk w15,#0x95, LSL #16
00a9be5c	mov w17,#0x5d1f
00a9be60	sub w12,w12,#0x16f
00a9be64	smull x10,w10,w16
00a9be68	movk w17,#0x95, LSL #16
00a9be6c	add w15,w14,w15
00a9be70	smull x12,w12,w13
00a9be74	lsr x13,x10,#0x3f
00a9be78	asr x10,x10,#0x25
00a9be7c	add w14,w14,w17
00a9be80	cmp w15,#0x0
00a9be84	add w10,w10,w13
00a9be88	csel w14,w14,w15,lt
00a9be8c	lsr x15,x12,#0x3f
00a9be90	asr x12,x12,#0x21
00a9be94	add w10,w10,w10, LSL #0x1
00a9be98	add w12,w12,w15
00a9be9c	add w11,w11,w14, ASR #0x2
00a9bea0	add w13,w10,#0x3
00a9bea4	cmp w10,#0x0
00a9bea8	add w11,w11,w12
00a9beac	csel w10,w13,w10,lt
00a9beb0	sub w10,w11,w10, ASR #0x2
00a9beb4	mov w11,#0xffff82b5
00a9beb8	add w10,w10,w11
00a9bebc	adds x8,x8,w10, SXTW 
00a9bec0	b.mi 0x00a9c05c
00a9bec4	mov w10,#0xbd9
00a9bec8	mov x11,#0x62ed
00a9becc	movk w10,#0x1, LSL #16
00a9bed0	movk x11,#0xc8f8, LSL #16
00a9bed4	movk x11,#0x6bc, LSL #32
00a9bed8	add x8,x8,x10
00a9bedc	movk x11,#0x396b, LSL #48
00a9bee0	lsl x10,x8,#0x2
00a9bee4	smulh x10,x10,x11
00a9bee8	mov w12,#0x3ab1
00a9beec	asr x11,x10,#0xf
00a9bef0	movk w12,#0x2, LSL #16
00a9bef4	add x10,x11,x10, LSR #0x3f
00a9bef8	mul x11,x10,x12
00a9befc	add x12,x11,#0x3
00a9bf00	add x11,x11,#0x6
00a9bf04	cmp x12,#0x0
00a9bf08	mov x14,#0xc28d
00a9bf0c	csel x11,x11,x12,lt
00a9bf10	mov w13,#0xfa0
00a9bf14	movk x14,#0x896e, LSL #16
00a9bf18	sub x8,x8,x11, ASR #0x2
00a9bf1c	movk x14,#0x7c5b, LSL #32
00a9bf20	mul x13,x8,x13
00a9bf24	movk x14,#0x16f7, LSL #48
00a9bf28	add x13,x13,#0xfa0
00a9bf2c	smulh x13,x13,x14
00a9bf30	asr x14,x13,#0x11
00a9bf34	mov w12,#0x5b5
00a9bf38	add x13,x14,x13, LSR #0x3f
00a9bf3c	mov w14,#0x64
00a9bf40	mul x12,x13,x12
00a9bf44	madd w14,w10,w14,w13
00a9bf48	add x10,x12,#0x3
00a9bf4c	cmp x12,#0x0
00a9bf50	csel x10,x10,x12,lt
00a9bf54	mov x11,#0xc5c9
00a9bf58	sub x8,x8,x10, ASR #0x2
00a9bf5c	movk x11,#0xc274, LSL #16
00a9bf60	add x10,x8,#0x1f
00a9bf64	movk x11,#0x5afa, LSL #32
00a9bf68	add x8,x10,x10, LSL #0x2
00a9bf6c	movk x11,#0x137a, LSL #48
00a9bf70	lsl x13,x8,#0x4
00a9bf74	smulh x8,x13,x11
00a9bf78	asr x11,x8,#0xb
00a9bf7c	add x12,x11,x8, LSR #0x3f
00a9bf80	add w8,w14,w12
00a9bf84	mov w11,#0xffffe570
00a9bf88	add w11,w8,w11
00a9bf8c	lsr w8,w11,#0x2
00a9bf90	cmp w8,#0x7e8
00a9bf94	mov w8,wzr
00a9bf98	b.hi 0x00a9c054
00a9bf9c	mov x8,#0x7fa3
00a9bfa0	movk x8,#0x5b04, LSL #16
00a9bfa4	movk x8,#0xe8c6, LSL #32
00a9bfa8	movk x8,#0xd641, LSL #48
00a9bfac	smulh x8,x13,x8
00a9bfb0	add x8,x8,x13
00a9bfb4	mov w16,#0xb3c5
00a9bfb8	asr x13,x8,#0xb
00a9bfbc	movk w16,#0x91a2, LSL #16
00a9bfc0	add x8,x13,x8, LSR #0x3f
00a9bfc4	mov w13,#0x8889
00a9bfc8	mov w14,#0xfffffff4
00a9bfcc	movk w13,#0x8888, LSL #16
00a9bfd0	smull x16,w9,w16
00a9bfd4	madd w12,w12,w14,w8
00a9bfd8	smull x14,w9,w13
00a9bfdc	lsr x16,x16,#0x20
00a9bfe0	mov w15,#0x98f
00a9bfe4	lsr x14,x14,#0x20
00a9bfe8	add w16,w16,w9
00a9bfec	add w14,w14,w9
00a9bff0	mul x8,x8,x15
00a9bff4	asr w15,w16,#0xb
00a9bff8	add w15,w15,w16, LSR #0x1f
00a9bffc	asr w16,w14,#0x5
00a9c000	add w14,w16,w14, LSR #0x1f
00a9c004	orr x16,xzr,#0x6666666666666666
00a9c008	movk x16,#0x6667
00a9c00c	add w12,w12,#0x1
00a9c010	smulh x8,x8,x16
00a9c014	stp w12,w11,[x0, #0x10]
00a9c018	smull x12,w14,w13
00a9c01c	lsr x11,x8,#0x3f
00a9c020	lsr x8,x8,#0x5
00a9c024	lsr x12,x12,#0x20
00a9c028	add w8,w8,w11
00a9c02c	add w12,w12,w14
00a9c030	sub w8,w10,w8
00a9c034	asr w10,w12,#0x5
00a9c038	orr w11,wzr,#0x3c
00a9c03c	stp w15,w8,[x0, #0x8]
00a9c040	add w8,w10,w12, LSR #0x1f
00a9c044	msub w9,w14,w11,w9
00a9c048	msub w8,w8,w11,w14
00a9c04c	stp w9,w8,[x0]
00a9c050	mov w8,#0x1
00a9c054	mov w0,w8
00a9c058	ret
00a9c05c	mov w0,wzr
00a9c060	ret
