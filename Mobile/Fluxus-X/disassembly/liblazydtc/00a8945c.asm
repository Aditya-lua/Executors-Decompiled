; AES_set_decrypt_key @ 00a8945c
00a8945c	str x19,[sp, #-0x20]!
00a89460	stp x29,x30,[sp, #0x10]
00a89464	add x29,sp,#0x10
00a89468	mov x19,x2
00a8946c	bl 0x00a8910c
00a89470	tbnz w0,#0x1f,0x00a8968c
00a89474	ldr w9,[x19, #0xf0]
00a89478	cmp w9,#0x1
00a8947c	b.lt 0x00a89688
00a89480	lsl w9,w9,#0x2
00a89484	sxtw x10,w9
00a89488	add x9,x19,w9, SXTW  #0x2
00a8948c	mov x8,xzr
00a89490	sub x11,x10,#0x4
00a89494	add x9,x9,#0x8
00a89498	add x10,x19,#0x8
00a8949c	ldur w12,[x9, #-0x8]
00a894a0	ldur w13,[x10, #-0x8]
00a894a4	add x8,x8,#0x4
00a894a8	cmp x8,x11
00a894ac	stur w12,[x10, #-0x8]
00a894b0	stur w13,[x9, #-0x8]
00a894b4	ldur w12,[x9, #-0x4]
00a894b8	ldur w13,[x10, #-0x4]
00a894bc	sub x11,x11,#0x4
00a894c0	stur w12,[x10, #-0x4]
00a894c4	stur w13,[x9, #-0x4]
00a894c8	ldr w12,[x9]
00a894cc	ldr w13,[x10]
00a894d0	str w12,[x10]
00a894d4	str w13,[x9]
00a894d8	ldr w12,[x9, #0x4]
00a894dc	ldr w13,[x10, #0x4]
00a894e0	str w12,[x10, #0x4]
00a894e4	str w13,[x9, #0x4]
00a894e8	sub x9,x9,#0x10
00a894ec	add x10,x10,#0x10
00a894f0	b.lt 0x00a8949c
00a894f4	ldr w8,[x19, #0xf0]
00a894f8	mov w0,wzr
00a894fc	cmp w8,#0x2
00a89500	b.lt 0x00a8968c
00a89504	adrp x10,0x767000
00a89508	adrp x11,0x768000
00a8950c	adrp x12,0x768000
00a89510	adrp x13,0x768000
00a89514	adrp x14,0x768000
00a89518	add x8,x19,#0x1c
00a8951c	mov w9,#0x1
00a89520	add x10,x10,#0xe78
00a89524	add x11,x11,#0x2a0
00a89528	add x12,x12,#0x6a0
00a8952c	add x13,x13,#0xaa0
00a89530	add x14,x14,#0xea0
00a89534	ldp w15,w16,[x8, #-0xc]
00a89538	ldp w17,w18,[x8, #-0x4]
00a8953c	add w9,w9,#0x1
00a89540	ubfx x0,x15,#0x18,#0x8
00a89544	ubfx w1,w15,#0x10,#0x8
00a89548	lsl x0,x0,#0x2
00a8954c	lsl x1,x1,#0x2
00a89550	ldrb w0,[x10, x0]
00a89554	ldrb w1,[x10, x1]
00a89558	ubfx x3,x16,#0x18,#0x8
00a8955c	ubfx w4,w16,#0x10,#0x8
00a89560	ldr w0,[x11, x0, LSL #0x2]
00a89564	ldr w1,[x12, x1, LSL #0x2]
00a89568	ubfx x5,x17,#0x18,#0x8
00a8956c	ubfx w6,w17,#0x10,#0x8
00a89570	ubfx x7,x18,#0x18,#0x8
00a89574	eor w0,w1,w0
00a89578	ubfx w1,w18,#0x10,#0x8
00a8957c	lsl x3,x3,#0x2
00a89580	lsl x4,x4,#0x2
00a89584	lsl x5,x5,#0x2
00a89588	lsl x6,x6,#0x2
00a8958c	lsl x7,x7,#0x2
00a89590	lsl x1,x1,#0x2
00a89594	ldrb w3,[x10, x3]
00a89598	ldrb w4,[x10, x4]
00a8959c	ldrb w5,[x10, x5]
00a895a0	ldrb w6,[x10, x6]
00a895a4	ldrb w7,[x10, x7]
00a895a8	ldrb w1,[x10, x1]
00a895ac	ldr w3,[x11, x3, LSL #0x2]
00a895b0	ldr w4,[x12, x4, LSL #0x2]
00a895b4	ldr w5,[x11, x5, LSL #0x2]
00a895b8	ldr w6,[x12, x6, LSL #0x2]
00a895bc	ldr w7,[x11, x7, LSL #0x2]
00a895c0	ldr w1,[x12, x1, LSL #0x2]
00a895c4	ubfx w2,w15,#0x8,#0x8
00a895c8	eor w3,w4,w3
00a895cc	ubfx w4,w16,#0x8,#0x8
00a895d0	eor w5,w6,w5
00a895d4	ubfx w6,w17,#0x8,#0x8
00a895d8	eor w1,w1,w7
00a895dc	ubfx w7,w18,#0x8,#0x8
00a895e0	lsl x2,x2,#0x2
00a895e4	lsl x4,x4,#0x2
00a895e8	lsl x6,x6,#0x2
00a895ec	lsl x7,x7,#0x2
00a895f0	and x15,x15,#0xff
00a895f4	and x16,x16,#0xff
00a895f8	and x17,x17,#0xff
00a895fc	and x18,x18,#0xff
00a89600	ldrb w2,[x10, x2]
00a89604	ldrb w4,[x10, x4]
00a89608	ldrb w6,[x10, x6]
00a8960c	ldrb w7,[x10, x7]
00a89610	lsl x15,x15,#0x2
00a89614	lsl x16,x16,#0x2
00a89618	lsl x17,x17,#0x2
00a8961c	lsl x18,x18,#0x2
00a89620	ldrb w15,[x10, x15]
00a89624	ldrb w16,[x10, x16]
00a89628	ldrb w17,[x10, x17]
00a8962c	ldrb w18,[x10, x18]
00a89630	ldr w2,[x13, x2, LSL #0x2]
00a89634	ldr w4,[x13, x4, LSL #0x2]
00a89638	ldr w6,[x13, x6, LSL #0x2]
00a8963c	ldr w7,[x13, x7, LSL #0x2]
00a89640	ldr w15,[x14, x15, LSL #0x2]
00a89644	ldr w16,[x14, x16, LSL #0x2]
00a89648	ldr w17,[x14, x17, LSL #0x2]
00a8964c	ldr w18,[x14, x18, LSL #0x2]
00a89650	eor w0,w0,w2
00a89654	eor w2,w3,w4
00a89658	eor w3,w5,w6
00a8965c	eor w1,w1,w7
00a89660	eor w15,w0,w15
00a89664	eor w16,w2,w16
00a89668	eor w17,w3,w17
00a8966c	eor w18,w1,w18
00a89670	stp w15,w16,[x8, #-0xc]
00a89674	stp w17,w18,[x8, #-0x4]
00a89678	ldr w15,[x19, #0xf0]
00a8967c	add x8,x8,#0x10
00a89680	cmp w9,w15
00a89684	b.lt 0x00a89534
00a89688	mov w0,wzr
00a8968c	ldp x29,x30,[sp, #0x10]
00a89690	ldr x19,[sp], #0x20
00a89694	ret
