; ASN1_bn_print @ 00a1892c
00a1892c	stp x26,x25,[sp, #-0x50]!
00a18930	stp x24,x23,[sp, #0x10]
00a18934	stp x22,x21,[sp, #0x20]
00a18938	stp x20,x19,[sp, #0x30]
00a1893c	stp x29,x30,[sp, #0x40]
00a18940	add x29,sp,#0x40
00a18944	cbz x2,0x00a189b0
00a18948	mov x19,x0
00a1894c	mov x0,x2
00a18950	mov w20,w4
00a18954	mov x22,x2
00a18958	mov x21,x1
00a1895c	bl 0x00c37f40
00a18960	adrp x8,0x2cc000
00a18964	adrp x26,0x2ab000
00a18968	add x8,x8,#0xc8b
00a1896c	add x26,x26,#0x32c
00a18970	cmp w0,#0x0
00a18974	mov w2,#0x80
00a18978	mov x0,x19
00a1897c	mov w1,w20
00a18980	csel x23,x26,x8,eq
00a18984	bl 0x00c38640
00a18988	cbz w0,0x00a189b8
00a1898c	mov x0,x22
00a18990	bl 0x00c369b0
00a18994	cbz w0,0x00a189c0
00a18998	adrp x1,0x2c5000
00a1899c	add x1,x1,#0x852
00a189a0	mov x0,x19
00a189a4	mov x2,x21
00a189a8	bl 0x00c32250
00a189ac	b 0x00a18a08
00a189b0	mov w19,#0x1
00a189b4	b 0x00a18a10
00a189b8	mov w19,wzr
00a189bc	b 0x00a18a10
00a189c0	mov x0,x22
00a189c4	bl 0x00c322f0
00a189c8	cmp w0,#0x40
00a189cc	b.gt 0x00a18a2c
00a189d0	mov x0,x22
00a189d4	bl 0x00c38bf0
00a189d8	ldr x20,[x0]
00a189dc	mov x0,x22
00a189e0	bl 0x00c38bf0
00a189e4	ldr x6,[x0]
00a189e8	adrp x1,0x2a5000
00a189ec	add x1,x1,#0xcf0
00a189f0	mov x0,x19
00a189f4	mov x2,x21
00a189f8	mov x3,x23
00a189fc	mov x4,x20
00a18a00	mov x5,x23
00a18a04	bl 0x00c32250
00a18a08	cmp w0,#0x0
00a18a0c	cset w19,gt
00a18a10	mov w0,w19
00a18a14	ldp x29,x30,[sp, #0x40]
00a18a18	ldp x20,x19,[sp, #0x30]
00a18a1c	ldp x22,x21,[sp, #0x20]
00a18a20	ldp x24,x23,[sp, #0x10]
00a18a24	ldp x26,x25,[sp], #0x50
00a18a28	ret
00a18a2c	mov x0,x22
00a18a30	bl 0x00c322f0
00a18a34	add w8,w0,#0x7
00a18a38	add w9,w0,#0xe
00a18a3c	cmp w8,#0x0
00a18a40	csel w8,w9,w8,lt
00a18a44	asr w8,w8,#0x3
00a18a48	add w8,w8,#0x1
00a18a4c	sxtw x24,w8
00a18a50	adrp x1,0x2af000
00a18a54	add x1,x1,#0xda3
00a18a58	mov w2,#0x49
00a18a5c	mov x0,x24
00a18a60	bl 0x00c32320
00a18a64	mov x25,x0
00a18a68	cbz x0,0x00a18adc
00a18a6c	ldrb w8,[x23]
00a18a70	adrp x9,0x2c5000
00a18a74	add x9,x9,#0x858
00a18a78	adrp x1,0x2bd000
00a18a7c	cmp w8,#0x2d
00a18a80	csel x3,x9,x26,eq
00a18a84	add x1,x1,#0x881
00a18a88	mov x0,x19
00a18a8c	mov x2,x21
00a18a90	strb wzr,[x25]
00a18a94	bl 0x00c32250
00a18a98	cmp w0,#0x1
00a18a9c	b.lt 0x00a18adc
00a18aa0	add x1,x25,#0x1
00a18aa4	mov x0,x22
00a18aa8	bl 0x00c36980
00a18aac	ldrb w8,[x25, #0x1]
00a18ab0	add w3,w20,#0x4
00a18ab4	sxtb w9,w8
00a18ab8	add w8,w0,w8, LSR #0x7
00a18abc	cmp w9,#0x0
00a18ac0	sxtw x2,w8
00a18ac4	cinc x1,x25,ge
00a18ac8	mov x0,x19
00a18acc	bl 0x00a18810
00a18ad0	cmp w0,#0x0
00a18ad4	cset w19,ne
00a18ad8	b 0x00a18ae0
00a18adc	mov w19,wzr
00a18ae0	adrp x2,0x2af000
00a18ae4	add x2,x2,#0xda3
00a18ae8	mov w3,#0x5b
00a18aec	mov x0,x25
00a18af0	mov x1,x24
00a18af4	bl 0x00c345e0
00a18af8	b 0x00a18a10
