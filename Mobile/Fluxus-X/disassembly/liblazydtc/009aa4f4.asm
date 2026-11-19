; ssl_decapsulate @ 009aa4f4
009aa4f4	sub sp,sp,#0x50
009aa4f8	stp x20,x19,[sp, #0x30]
009aa4fc	mov x20,x0
009aa500	stp x24,x23,[sp, #0x10]
009aa504	stp x22,x21,[sp, #0x20]
009aa508	stp x29,x30,[sp, #0x40]
009aa50c	add x29,sp,#0x40
009aa510	str xzr,[sp, #0x8]
009aa514	cbz x1,0x009aa600
009aa518	ldr x8,[x20, #0x9a8]
009aa51c	mov x24,x2
009aa520	mov w22,w4
009aa524	mov x23,x3
009aa528	ldr x0,[x8]
009aa52c	ldr x2,[x8, #0x440]
009aa530	bl 0x00c34640
009aa534	mov x1,xzr
009aa538	mov x19,x0
009aa53c	bl 0x00c34680
009aa540	cmp w0,#0x1
009aa544	b.lt 0x009aa5c0
009aa548	add x2,sp,#0x8
009aa54c	mov x0,x19
009aa550	mov x1,xzr
009aa554	mov x3,x24
009aa558	mov x4,x23
009aa55c	bl 0x00c34670
009aa560	cmp w0,#0x0
009aa564	b.le 0x009aa5c0
009aa568	ldr x0,[sp, #0x8]
009aa56c	adrp x1,0x2a3000
009aa570	add x1,x1,#0xa43
009aa574	mov w2,#0x1303
009aa578	bl 0x00c32320
009aa57c	mov x21,x0
009aa580	cbz x0,0x009aa63c
009aa584	add x2,sp,#0x8
009aa588	mov x0,x19
009aa58c	mov x1,x21
009aa590	mov x3,x24
009aa594	mov x4,x23
009aa598	bl 0x00c34670
009aa59c	cmp w0,#0x0
009aa5a0	b.le 0x009aa66c
009aa5a4	cbz w22,0x009aa6e0
009aa5a8	ldr x2,[sp, #0x8]
009aa5ac	mov x0,x20
009aa5b0	mov x1,x21
009aa5b4	bl 0x009aa1fc
009aa5b8	mov w20,w0
009aa5bc	b 0x009aa6a4
009aa5c0	bl 0x00c342a0
009aa5c4	adrp x0,0x2a3000
009aa5c8	adrp x2,0x2c5000
009aa5cc	add x0,x0,#0xa43
009aa5d0	add x2,x2,#0x407
009aa5d4	mov w1,#0x12ff
009aa5d8	bl 0x00c342b0
009aa5dc	mov w2,#0x103
009aa5e0	mov w1,#0x50
009aa5e4	movk w2,#0xc, LSL #16
009aa5e8	mov x0,x20
009aa5ec	mov x3,xzr
009aa5f0	bl 0x00c34410
009aa5f4	mov w20,wzr
009aa5f8	mov x21,xzr
009aa5fc	b 0x009aa6a4
009aa600	bl 0x00c342a0
009aa604	adrp x0,0x2a3000
009aa608	adrp x2,0x2c5000
009aa60c	add x0,x0,#0xa43
009aa610	add x2,x2,#0x407
009aa614	mov w1,#0x12f7
009aa618	bl 0x00c342b0
009aa61c	mov w2,#0x103
009aa620	mov w1,#0x50
009aa624	movk w2,#0xc, LSL #16
009aa628	mov x0,x20
009aa62c	mov x3,xzr
009aa630	bl 0x00c34410
009aa634	mov w20,wzr
009aa638	b 0x009aa6c4
009aa63c	bl 0x00c342a0
009aa640	adrp x0,0x2a3000
009aa644	adrp x2,0x2c5000
009aa648	add x0,x0,#0xa43
009aa64c	add x2,x2,#0x407
009aa650	mov w1,#0x1305
009aa654	bl 0x00c342b0
009aa658	mov w8,#0x103
009aa65c	movk w8,#0xc, LSL #16
009aa660	sub w2,w8,#0x3
009aa664	mov w1,#0x50
009aa668	b 0x009aa694
009aa66c	bl 0x00c342a0
009aa670	adrp x0,0x2a3000
009aa674	adrp x2,0x2c5000
009aa678	add x0,x0,#0xa43
009aa67c	add x2,x2,#0x407
009aa680	mov w1,#0x130a
009aa684	bl 0x00c342b0
009aa688	mov w2,#0x103
009aa68c	mov w1,#0x50
009aa690	movk w2,#0xc, LSL #16
009aa694	mov x0,x20
009aa698	mov x3,xzr
009aa69c	bl 0x00c34410
009aa6a0	mov w20,wzr
009aa6a4	ldr x1,[sp, #0x8]
009aa6a8	adrp x2,0x2a3000
009aa6ac	add x2,x2,#0xa43
009aa6b0	mov w3,#0x131a
009aa6b4	mov x0,x21
009aa6b8	bl 0x00c345e0
009aa6bc	mov x0,x19
009aa6c0	bl 0x00c34620
009aa6c4	mov w0,w20
009aa6c8	ldp x29,x30,[sp, #0x40]
009aa6cc	ldp x20,x19,[sp, #0x30]
009aa6d0	ldp x22,x21,[sp, #0x20]
009aa6d4	ldp x24,x23,[sp, #0x10]
009aa6d8	add sp,sp,#0x50
009aa6dc	ret
009aa6e0	str x21,[x20, #0x360]
009aa6e4	ldr x8,[sp, #0x8]
009aa6e8	str x8,[x20, #0x368]
009aa6ec	mov w20,#0x1
009aa6f0	b 0x009aa5f8
