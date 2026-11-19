; mbedtls_camellia_setkey_dec @ 00b72180
00b72180	sub sp,sp,#0x160
00b72184	stp x28,x23,[sp, #0x120]
00b72188	stp x22,x21,[sp, #0x130]
00b7218c	stp x20,x19,[sp, #0x140]
00b72190	stp x29,x30,[sp, #0x150]
00b72194	add x29,sp,#0x150
00b72198	mrs x22,tpidr_el0
00b7219c	ldr x8,[x22, #0x28]
00b721a0	mov w19,w2
00b721a4	mov x21,x1
00b721a8	mov x20,x0
00b721ac	mov x0,sp
00b721b0	mov w2,#0x114
00b721b4	mov w1,wzr
00b721b8	stur x8,[x29, #-0x38]
00b721bc	mov x23,sp
00b721c0	bl 0x00c301c0
00b721c4	mov x0,sp
00b721c8	mov x1,x21
00b721cc	mov w2,w19
00b721d0	bl 0x00c41fc0
00b721d4	mov w19,w0
00b721d8	cbnz w0,0x00b72300
00b721dc	ldr w10,[sp]
00b721e0	mov w9,#0x16
00b721e4	add x8,x20,#0x14
00b721e8	mov w15,#0xbc
00b721ec	cmp w10,#0x4
00b721f0	cset w16,eq
00b721f4	str w10,[x20]
00b721f8	add x10,x23,x16, LSL #0x6
00b721fc	bfm w9,w16,#0x1d,#0x0
00b72200	lsl w18,w16,#0x6
00b72204	ldur q0,[x10, #0xc4]
00b72208	add x12,x10,#0xbc
00b7220c	add x10,x18,#0xc4
00b72210	lsl w14,w9,#0x3
00b72214	add w17,w18,#0xc4
00b72218	sub x10,x10,x14
00b7221c	orr x0,x14,#0xc
00b72220	add x11,x23,x17
00b72224	cmp x11,x8
00b72228	add x13,x14,#0x14
00b7222c	add x11,x23,x10
00b72230	add x10,x20,x0
00b72234	orr x15,x18,x15
00b72238	stur q0,[x20, #0x4]
00b7223c	b.ls 0x00b72254
00b72240	sub x17,x17,x14
00b72244	add x18,x20,x13
00b72248	add x17,x23,x17
00b7224c	cmp x17,x18
00b72250	b.cc 0x00b722d0
00b72254	lsl x18,x16,#0x4
00b72258	sub x16,x9,#0x6
00b7225c	lsl w9,w9,#0x1
00b72260	orr w0,wzr,#0xc
00b72264	mov x1,sp
00b72268	sub x0,x0,x9
00b7226c	add x8,x8,w9, UXTW  #0x2
00b72270	add x9,x1,x18, LSL #0x2
00b72274	add x17,x20,#0x34
00b72278	add x12,x12,x0, LSL #0x2
00b7227c	sub x8,x8,#0x30
00b72280	add x18,x9,#0xa4
00b72284	orr w9,wzr,#0x6
00b72288	sub x0,x18,#0x20
00b7228c	ld2 {v0.4S,v1.4S},[x18]
00b72290	ld2 {v2.4S,v3.4S},[x0]
00b72294	sub x0,x17,#0x20
00b72298	subs x16,x16,#0x8
00b7229c	rev64 v4.4S,v0.4S
00b722a0	rev64 v0.4S,v1.4S
00b722a4	ext v4.16B,v4.16B,v4.16B,0x8
00b722a8	rev64 v1.4S,v2.4S
00b722ac	rev64 v2.4S,v3.4S
00b722b0	ext v5.16B,v0.16B,v0.16B,0x8
00b722b4	ext v0.16B,v1.16B,v1.16B,0x8
00b722b8	ext v1.16B,v2.16B,v2.16B,0x8
00b722bc	st2 {v4.4S,v5.4S},[x0]
00b722c0	st2 {v0.4S,v1.4S},[x17]
00b722c4	add x17,x17,#0x40
00b722c8	sub x18,x18,#0x40
00b722cc	b.ne 0x00b72288
00b722d0	sub x14,x15,x14
00b722d4	ldr x15,[x12], #-0x8
00b722d8	subs x9,x9,#0x1
00b722dc	str x15,[x8], #0x8
00b722e0	b.ne 0x00b722d4
00b722e4	ldur x8,[x11, #-0x10]
00b722e8	str x8,[x20, x13#0x0]
00b722ec	mov x8,sp
00b722f0	ldr w8,[x8, x14#0x0]
00b722f4	str w8,[x10, #0x10]
00b722f8	ldur w8,[x11, #-0x4]
00b722fc	str w8,[x10, #0x14]
00b72300	mov x0,sp
00b72304	mov w1,#0x114
00b72308	bl 0x00c42220
00b7230c	ldr x8,[x22, #0x28]
00b72310	ldur x9,[x29, #-0x38]
00b72314	cmp x8,x9
00b72318	b.ne 0x00b72338
00b7231c	mov w0,w19
00b72320	ldp x29,x30,[sp, #0x150]
00b72324	ldp x20,x19,[sp, #0x140]
00b72328	ldp x22,x21,[sp, #0x130]
00b7232c	ldp x28,x23,[sp, #0x120]
00b72330	add sp,sp,#0x160
00b72334	ret
00b72338	bl 0x00c2fec0
