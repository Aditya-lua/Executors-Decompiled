; bn_mul_low_recursive @ 00a0a4a4
00a0a4a4	str x25,[sp, #-0x50]!
00a0a4a8	cmp w3,#0x0
00a0a4ac	stp x20,x19,[sp, #0x30]
00a0a4b0	cinc w20,w3,lt
00a0a4b4	mov x19,x4
00a0a4b8	asr w25,w20,#0x1
00a0a4bc	stp x24,x23,[sp, #0x10]
00a0a4c0	mov w24,w3
00a0a4c4	mov w3,w25
00a0a4c8	mov w4,wzr
00a0a4cc	mov w5,wzr
00a0a4d0	mov x6,x19
00a0a4d4	stp x22,x21,[sp, #0x20]
00a0a4d8	stp x29,x30,[sp, #0x40]
00a0a4dc	add x29,sp,#0x40
00a0a4e0	mov x21,x2
00a0a4e4	mov x22,x1
00a0a4e8	mov x23,x0
00a0a4ec	bl 0x00a09a04
00a0a4f0	sbfx x20,x20,#0x1,#0x1f
00a0a4f4	cmp w24,#0x40
00a0a4f8	add x2,x21,w25, SXTW  #0x3
00a0a4fc	b.lt 0x00a0a55c
00a0a500	add x24,x19,w24, SXTW  #0x3
00a0a504	mov x0,x19
00a0a508	mov x1,x22
00a0a50c	mov w3,w20
00a0a510	mov x4,x24
00a0a514	bl 0x00a0a4a4
00a0a518	lsl x25,x20,#0x3
00a0a51c	add x23,x23,x25
00a0a520	mov x0,x23
00a0a524	mov x1,x23
00a0a528	mov x2,x19
00a0a52c	mov w3,w20
00a0a530	bl 0x00c388b0
00a0a534	add x1,x22,x25
00a0a538	mov x0,x19
00a0a53c	mov x2,x21
00a0a540	mov w3,w20
00a0a544	mov x4,x24
00a0a548	bl 0x00a0a4a4
00a0a54c	mov x0,x23
00a0a550	mov x1,x23
00a0a554	mov x2,x19
00a0a558	b 0x00a0a5ac
00a0a55c	mov x0,x19
00a0a560	mov x1,x22
00a0a564	mov w3,w20
00a0a568	bl 0x00a0a5c8
00a0a56c	lsl x25,x20,#0x3
00a0a570	add x24,x19,x25
00a0a574	add x1,x22,x25
00a0a578	mov x0,x24
00a0a57c	mov x2,x21
00a0a580	mov w3,w20
00a0a584	bl 0x00a0a5c8
00a0a588	add x21,x23,x25
00a0a58c	mov x0,x21
00a0a590	mov x1,x21
00a0a594	mov x2,x19
00a0a598	mov w3,w20
00a0a59c	bl 0x00c388b0
00a0a5a0	mov x0,x21
00a0a5a4	mov x1,x21
00a0a5a8	mov x2,x24
00a0a5ac	mov w3,w20
00a0a5b0	ldp x29,x30,[sp, #0x40]
00a0a5b4	ldp x20,x19,[sp, #0x30]
00a0a5b8	ldp x22,x21,[sp, #0x20]
00a0a5bc	ldp x24,x23,[sp, #0x10]
00a0a5c0	ldr x25,[sp], #0x50
00a0a5c4	b 0x00c388b0
