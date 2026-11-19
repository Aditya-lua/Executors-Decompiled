; tls_parse_extension @ 009d0938
009d0938	mov w9,#0x28
009d093c	mov w8,w1
009d0940	umaddl x1,w1,w9,x3
009d0944	ldr w9,[x1, #0x10]
009d0948	cbz w9,0x009d0960
009d094c	mov w9,w8
009d0950	mov w10,#0x28
009d0954	madd x10,x9,x10,x3
009d0958	ldr w11,[x10, #0x14]!
009d095c	cbz w11,0x009d0968
009d0960	mov w0,#0x1
009d0964	ret
009d0968	mov x6,x5
009d096c	mov x5,x4
009d0970	mov w11,#0x1
009d0974	cmp w8,#0x19
009d0978	str w11,[x10]
009d097c	b.hi 0x009d0a80
009d0980	ldr x12,[x0, #0x8]
009d0984	ldr x10,[x12, #0xc0]
009d0988	ldr w11,[x10, #0x60]
009d098c	tbnz w2,#0xb,0x009d09b8
009d0990	mov w10,wzr
009d0994	tbnz w11,#0x3,0x009d09bc
009d0998	ldr w11,[x12]
009d099c	mov w10,wzr
009d09a0	cmp w11,#0x304
009d09a4	b.lt 0x009d09d4
009d09a8	cmp w11,#0x10, LSL #12
009d09ac	cset w10,ne
009d09b0	cbnz w8,0x009d09d8
009d09b4	b 0x009d09e4
009d09b8	mov w10,#0x1
009d09bc	mov w12,#0x7fff
009d09c0	movk w12,#0x123, LSL #16
009d09c4	add x12,x12,#0xbe8, LSL #12
009d09c8	lsr x12,x12,x9
009d09cc	tbnz w12,#0x0,0x009d09d4
009d09d0	tbnz w11,#0x3,0x009d0960
009d09d4	cbz w8,0x009d09e4
009d09d8	ldr w8,[x0]
009d09dc	cmp w8,#0x300
009d09e0	b.eq 0x009d0960
009d09e4	mov w8,#0xd6a6
009d09e8	movk w8,#0x3df, LSL #16
009d09ec	lsr x8,x8,x9
009d09f0	tbnz w8,#0x0,0x009d09f8
009d09f4	cbnz w10,0x009d0960
009d09f8	mov w8,#0x7fff
009d09fc	movk w8,#0x123, LSL #16
009d0a00	lsr x11,x8,x9
009d0a04	tbnz w2,#0x7,0x009d0a10
009d0a08	tbnz w11,#0x0,0x009d0a10
009d0a0c	cbz w10,0x009d0960
009d0a10	ldr w8,[x0, #0x38]
009d0a14	tbnz w11,#0x0,0x009d0a20
009d0a18	cbnz w10,0x009d0a20
009d0a1c	cbnz w8,0x009d0960
009d0a20	adrp x10,0xc58000
009d0a24	orr w11,wzr,#0x38
009d0a28	add x10,x10,#0x1e8
009d0a2c	ldr w12,[x0, #0x4d0]
009d0a30	nop
009d0a34	madd x11,x9,x11,x10
009d0a38	ldr w11,[x11, #0x4]
009d0a3c	mov w13,#0x1
009d0a40	cmp w12,#0x0
009d0a44	cset w12,eq
009d0a48	bic w11,w13,w11, LSR #0x6
009d0a4c	orr w11,w11,w12
009d0a50	cbz w11,0x009d0960
009d0a54	orr w11,wzr,#0x38
009d0a58	madd x10,x9,x11,x10
009d0a5c	add x11,x10,#0x10
009d0a60	add x10,x10,#0x18
009d0a64	cmp w8,#0x0
009d0a68	csel x8,x10,x11,eq
009d0a6c	ldr x7,[x8]
009d0a70	cbz x7,0x009d0a80
009d0a74	mov x3,x5
009d0a78	mov x4,x6
009d0a7c	br x7
009d0a80	mov w10,#0x28
009d0a84	madd x10,x9,x10,x3
009d0a88	ldr x8,[x1]
009d0a8c	ldr w9,[x10, #0x18]
009d0a90	ldr x4,[x10, #0x8]
009d0a94	mov w1,w2
009d0a98	mov x3,x8
009d0a9c	mov w2,w9
009d0aa0	b 0x00c36ee0
