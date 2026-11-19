; ossl_err_string_int @ 00a5494c
00a5494c	sub sp,sp,#0x1a0
00a54950	str x28,[sp, #0x140]
00a54954	stp x26,x25,[sp, #0x150]
00a54958	stp x24,x23,[sp, #0x160]
00a5495c	stp x22,x21,[sp, #0x170]
00a54960	stp x20,x19,[sp, #0x180]
00a54964	stp x29,x30,[sp, #0x190]
00a54968	add x29,sp,#0x190
00a5496c	cbz x3,0x00a54abc
00a54970	mov x23,x1
00a54974	mov x20,x0
00a54978	ubfx x8,x0,#0x17,#0x8
00a5497c	adrp x0,0xd21000
00a54980	adrp x1,0xa53000
00a54984	cmp w20,#0x0
00a54988	mov w9,#0x2
00a5498c	add x0,x0,#0xa30
00a54990	add x1,x1,#0xf8c
00a54994	mov x19,x3
00a54998	mov x21,x2
00a5499c	csel x22,x9,x8,lt
00a549a0	bl 0x00c34d60
00a549a4	cbz w0,0x00a54a04
00a549a8	adrp x8,0xd21000
00a549ac	ldr w8,[x8, #0xa34]
00a549b0	cbz w8,0x00a54a04
00a549b4	adrp x24,0xd21000
00a549b8	ldr x0,[x24, #0xa20]
00a549bc	and x8,x20,#0x7f800000
00a549c0	cmp w20,#0x0
00a549c4	mov w9,#0x1000000
00a549c8	csel x8,x9,x8,lt
00a549cc	str x8,[sp]
00a549d0	bl 0x00c35680
00a549d4	cbz w0,0x00a54a04
00a549d8	adrp x8,0xd21000
00a549dc	ldr x0,[x8, #0xa28]
00a549e0	mov x1,sp
00a549e4	bl 0x00c34de0
00a549e8	ldr x8,[x24, #0xa20]
00a549ec	mov x24,x0
00a549f0	mov x0,x8
00a549f4	bl 0x00c35690
00a549f8	cbz x24,0x00a54a04
00a549fc	ldr x25,[x24, #0x8]
00a54a00	cbnz x25,0x00a54a20
00a54a04	adrp x2,0x2cb000
00a54a08	add x2,x2,#0x8d2
00a54a0c	sub x0,x29,#0x90
00a54a10	mov w1,#0x40
00a54a14	mov x3,x22
00a54a18	sub x25,x29,#0x90
00a54a1c	bl 0x00c34d30
00a54a20	asr w8,w20,#0x1f
00a54a24	and w8,w8,#0x7f800000
00a54a28	orr w8,w8,#0x7fffff
00a54a2c	and w24,w8,w20
00a54a30	tbnz w20,#0x1f,0x00a54adc
00a54a34	mov x0,x20
00a54a38	bl 0x00a54b9c
00a54a3c	mov x26,x0
00a54a40	cbnz x0,0x00a54a60
00a54a44	adrp x2,0x2d1000
00a54a48	add x2,x2,#0x9a5
00a54a4c	mov x0,sp
00a54a50	mov w1,#0x100
00a54a54	mov x3,x24
00a54a58	mov x26,sp
00a54a5c	bl 0x00c34d30
00a54a60	adrp x2,0x2bb000
00a54a64	add x2,x2,#0xbd1
00a54a68	mov x0,x21
00a54a6c	mov x1,x19
00a54a70	mov x3,x20
00a54a74	mov x4,x25
00a54a78	mov x5,x23
00a54a7c	mov x6,x26
00a54a80	bl 0x00c34d30
00a54a84	mov x0,x21
00a54a88	bl 0x00c2ff50
00a54a8c	sub x8,x19,#0x1
00a54a90	cmp x0,x8
00a54a94	b.ne 0x00a54abc
00a54a98	adrp x2,0x2bf000
00a54a9c	add x2,x2,#0xc37
00a54aa0	mov x0,x21
00a54aa4	mov x1,x19
00a54aa8	mov x3,x20
00a54aac	mov x4,x22
00a54ab0	mov x5,xzr
00a54ab4	mov x6,x24
00a54ab8	bl 0x00c34d30
00a54abc	ldp x29,x30,[sp, #0x190]
00a54ac0	ldp x20,x19,[sp, #0x180]
00a54ac4	ldp x22,x21,[sp, #0x170]
00a54ac8	ldp x24,x23,[sp, #0x160]
00a54acc	ldp x26,x25,[sp, #0x150]
00a54ad0	ldr x28,[sp, #0x140]
00a54ad4	add sp,sp,#0x1a0
00a54ad8	ret
00a54adc	mov x1,sp
00a54ae0	mov w2,#0x100
00a54ae4	mov w0,w24
00a54ae8	mov x26,sp
00a54aec	bl 0x00c3be70
00a54af0	cbnz w0,0x00a54a60
00a54af4	b 0x00a54a44
