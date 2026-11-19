; FUN_008bc474 @ 008bc474
008bc474	sub sp,sp,#0x70
008bc478	stp x29,x30,[sp, #0x10]
008bc47c	stp x28,x27,[sp, #0x20]
008bc480	stp x26,x25,[sp, #0x30]
008bc484	stp x24,x23,[sp, #0x40]
008bc488	stp x22,x21,[sp, #0x50]
008bc48c	stp x20,x19,[sp, #0x60]
008bc490	add x29,sp,#0x10
008bc494	fmov x8,d0
008bc498	mov w10,#0xe995
008bc49c	mov w27,#0x3700
008bc4a0	movk w10,#0x5bd1, LSL #16
008bc4a4	mov x19,x2
008bc4a8	mov x20,x1
008bc4ac	mov x21,x0
008bc4b0	mov w24,#0xffffffff
008bc4b4	adrp x22,0xd1f000
008bc4b8	add x22,x22,#0xc90
008bc4bc	ubfx x9,x8,#0x20,#0x1f
008bc4c0	adrp x25,0xcca000
008bc4c4	adrp x26,0xd1f000
008bc4c8	movk w27,#0x7f, LSL #16
008bc4cc	mov w28,#0x1
008bc4d0	eor w8,w8,w9, LSR #0x12
008bc4d4	mul w8,w8,w10
008bc4d8	eor w9,w9,w8, LSR #0x16
008bc4dc	mul w9,w9,w10
008bc4e0	eor w8,w8,w9, LSR #0x11
008bc4e4	mul w8,w8,w10
008bc4e8	eor w8,w9,w8, LSR #0x13
008bc4ec	mul w23,w8,w10
008bc4f0	ldrb w8,[x20, #0x5]
008bc4f4	ldr x9,[x20, #0x28]
008bc4f8	lsl w8,w24,w8
008bc4fc	bic w8,w23,w8
008bc500	add x1,x9,x8, LSL #0x5
008bc504	ldr w8,[x1, #0xc]
008bc508	cbnz w8,0x008bc524
008bc50c	ldarb w8,[x22]
008bc510	tbz w8,#0x0,0x008bc5f0
008bc514	ldr x8,[x26, #0xc88]
008bc518	add x8,x8,x27
008bc51c	cmp x1,x8
008bc520	b.ne 0x008bc62c
008bc524	ldr w8,[x20, #0xc]
008bc528	cmp w8,#0x1
008bc52c	b.lt 0x008bc554
008bc530	sub x8,x8,#0x1
008bc534	ldr x9,[x20, #0x28]
008bc538	mov w10,w8
008bc53c	str w8,[x20, #0xc]
008bc540	add x2,x9,x10, LSL #0x5
008bc544	ldrb w9,[x2, #0x1c]
008bc548	tst w9,#0xf
008bc54c	b.ne 0x008bc528
008bc550	b 0x008bc620
008bc554	ldrb w8,[x20, #0x5]
008bc558	ldr x9,[x20, #0x28]
008bc55c	mov w11,wzr
008bc560	lsl w10,w28,w8
008bc564	sxtw x10,w10
008bc568	cbz x8,0x008bc5b8
008bc56c	add x14,x9,x10, LSL #0x5
008bc570	and x13,x10,#-0x2
008bc574	mov w12,wzr
008bc578	and x8,x10,#0x1
008bc57c	mov x15,x13
008bc580	sub x14,x14,#0x14
008bc584	ldr w16,[x14]
008bc588	ldur w17,[x14, #-0x20]
008bc58c	sub x15,x15,#0x2
008bc590	sub x14,x14,#0x40
008bc594	cmp w16,#0x0
008bc598	cinc w11,w11,ne
008bc59c	cmp w17,#0x0
008bc5a0	cinc w12,w12,ne
008bc5a4	cbnz x15,0x008bc584
008bc5a8	cmp x13,x10
008bc5ac	add w11,w12,w11
008bc5b0	b.ne 0x008bc5bc
008bc5b4	b 0x008bc5d8
008bc5b8	mov x8,x10
008bc5bc	add x9,x9,x8, LSL #0x5
008bc5c0	sub x9,x9,#0x14
008bc5c4	ldr w10,[x9], #-0x20
008bc5c8	sub x8,x8,#0x1
008bc5cc	cmp w10,#0x0
008bc5d0	cinc w11,w11,ne
008bc5d4	cbnz x8,0x008bc5c4
008bc5d8	ldr w2,[x20, #0x8]
008bc5dc	add w3,w11,#0x1
008bc5e0	mov x0,x21
008bc5e4	mov x1,x20
008bc5e8	bl 0x008ba968
008bc5ec	b 0x008bc4f0
008bc5f0	mov x0,x22
008bc5f4	str x1,[sp, #0x8]
008bc5f8	bl 0x00c2fe90
008bc5fc	ldr x1,[sp, #0x8]
008bc600	cbz w0,0x008bc514
008bc604	ldr x0,[x25, #0x8c8]
008bc608	bl 0x007fe1ec
008bc60c	str x0,[x26, #0xc88]
008bc610	mov x0,x22
008bc614	bl 0x00c2fea0
008bc618	ldr x1,[sp, #0x8]
008bc61c	b 0x008bc514
008bc620	mov x0,x20
008bc624	bl 0x008bda50
008bc628	mov x1,x0
008bc62c	ldr x8,[x19]
008bc630	ldr w9,[x1, #0x1c]
008bc634	mov x0,x1
008bc638	str x8,[x1, #0x10]
008bc63c	ldr w8,[x19, #0x8]
008bc640	str w8,[x1, #0x18]
008bc644	ldr w8,[x19, #0xc]
008bc648	bfxil w9,w8,#0x0,#0x4
008bc64c	str w9,[x1, #0x1c]
008bc650	ldp x20,x19,[sp, #0x60]
008bc654	ldp x22,x21,[sp, #0x50]
008bc658	ldp x24,x23,[sp, #0x40]
008bc65c	ldp x26,x25,[sp, #0x30]
008bc660	ldp x28,x27,[sp, #0x20]
008bc664	ldp x29,x30,[sp, #0x10]
008bc668	add sp,sp,#0x70
008bc66c	ret
