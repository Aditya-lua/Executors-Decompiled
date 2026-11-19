; BN_GF2m_mod_sqr @ 00a2c8f8
00a2c8f8	stp x26,x25,[sp, #-0x50]!
00a2c8fc	stp x24,x23,[sp, #0x10]
00a2c900	mov x23,x0
00a2c904	mov x0,x2
00a2c908	stp x22,x21,[sp, #0x20]
00a2c90c	stp x20,x19,[sp, #0x30]
00a2c910	stp x29,x30,[sp, #0x40]
00a2c914	add x29,sp,#0x40
00a2c918	mov x21,x3
00a2c91c	mov x25,x2
00a2c920	mov x22,x1
00a2c924	bl 0x00c322f0
00a2c928	add w26,w0,#0x1
00a2c92c	adrp x1,0x2d9000
00a2c930	mov w24,w0
00a2c934	sbfiz x0,x26,#0x2,#0x20
00a2c938	add x1,x1,#0xb49
00a2c93c	mov w2,#0x21a
00a2c940	bl 0x00c32320
00a2c944	cbz x0,0x00a2c9a0
00a2c948	mov x19,x0
00a2c94c	mov x0,x25
00a2c950	bl 0x00c369b0
00a2c954	mov w20,wzr
00a2c958	cbz w0,0x00a2c9f0
00a2c95c	bl 0x00c342a0
00a2c960	adrp x0,0x2d9000
00a2c964	adrp x2,0x2c7000
00a2c968	add x0,x0,#0xb49
00a2c96c	add x2,x2,#0x860
00a2c970	mov w1,#0x221
00a2c974	bl 0x00c342b0
00a2c978	orr w0,wzr,#0x3
00a2c97c	mov w1,#0x6a
00a2c980	mov x2,xzr
00a2c984	bl 0x00c342c0
00a2c988	adrp x1,0x2d9000
00a2c98c	add x1,x1,#0xb49
00a2c990	mov w2,#0x227
00a2c994	mov x0,x19
00a2c998	bl 0x00c32310
00a2c99c	b 0x00a2c9d4
00a2c9a0	bl 0x00c342a0
00a2c9a4	adrp x0,0x2d9000
00a2c9a8	adrp x2,0x2c7000
00a2c9ac	add x0,x0,#0xb49
00a2c9b0	add x2,x2,#0x860
00a2c9b4	mov w1,#0x21c
00a2c9b8	bl 0x00c342b0
00a2c9bc	mov w1,#0x100
00a2c9c0	orr w0,wzr,#0x3
00a2c9c4	movk w1,#0xc, LSL #16
00a2c9c8	mov x2,xzr
00a2c9cc	bl 0x00c342c0
00a2c9d0	mov w20,wzr
00a2c9d4	mov w0,w20
00a2c9d8	ldp x29,x30,[sp, #0x40]
00a2c9dc	ldp x20,x19,[sp, #0x30]
00a2c9e0	ldp x22,x21,[sp, #0x20]
00a2c9e4	ldp x24,x23,[sp, #0x10]
00a2c9e8	ldp x26,x25,[sp], #0x50
00a2c9ec	ret
00a2c9f0	ldrsw x8,[x25, #0x8]
00a2c9f4	cmp w8,#0x1
00a2c9f8	b.lt 0x00a2ca94
00a2c9fc	ldr x9,[x25]
00a2ca00	mov w20,wzr
00a2ca04	lsl w10,w8,#0x6
00a2ca08	sub x11,x8,#0x1
00a2ca0c	ldr x12,[x9, x11, LSL #0x3]
00a2ca10	cbz x12,0x00a2ca48
00a2ca14	orr x13,xzr,#-0x8000000000000000
00a2ca18	mov w14,#0xffffffff
00a2ca1c	tst x13,x12
00a2ca20	b.eq 0x00a2ca38
00a2ca24	cmp w20,w24
00a2ca28	b.gt 0x00a2ca34
00a2ca2c	add w15,w10,w14
00a2ca30	str w15,[x19, w20, SXTW #0x2]
00a2ca34	add w20,w20,#0x1
00a2ca38	sub w14,w14,#0x1
00a2ca3c	cmn w14,#0x41
00a2ca40	lsr x13,x13,#0x1
00a2ca44	b.ne 0x00a2ca1c
00a2ca48	cmp x8,#0x1
00a2ca4c	sub w10,w10,#0x40
00a2ca50	mov x8,x11
00a2ca54	b.gt 0x00a2ca08
00a2ca58	cmp w20,w24
00a2ca5c	b.gt 0x00a2ca6c
00a2ca60	mov w8,#0xffffffff
00a2ca64	str w8,[x19, w20, SXTW #0x2]
00a2ca68	add w20,w20,#0x1
00a2ca6c	cbz w20,0x00a2c95c
00a2ca70	cmp w20,w26
00a2ca74	b.gt 0x00a2c95c
00a2ca78	mov x0,x23
00a2ca7c	mov x1,x22
00a2ca80	mov x2,x19
00a2ca84	mov x3,x21
00a2ca88	bl 0x00a2bec0
00a2ca8c	mov w20,w0
00a2ca90	b 0x00a2c988
00a2ca94	mov w20,wzr
00a2ca98	cmp w20,w24
00a2ca9c	b.le 0x00a2ca60
00a2caa0	b 0x00a2ca6c
