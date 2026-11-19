; ossl_rsa_pss_params_30_todata @ 00acf49c
00acf49c	str x27,[sp, #-0x60]!
00acf4a0	stp x26,x25,[sp, #0x10]
00acf4a4	stp x24,x23,[sp, #0x20]
00acf4a8	stp x22,x21,[sp, #0x30]
00acf4ac	stp x20,x19,[sp, #0x40]
00acf4b0	stp x29,x30,[sp, #0x50]
00acf4b4	add x29,sp,#0x50
00acf4b8	mov x19,x2
00acf4bc	mov x20,x1
00acf4c0	mov x21,x0
00acf4c4	bl 0x00c3fb80
00acf4c8	cbz w0,0x00acf4d4
00acf4cc	mov w0,#0x1
00acf4d0	b 0x00acf5f0
00acf4d4	mov x0,x21
00acf4d8	bl 0x00c3fb70
00acf4dc	mov w25,w0
00acf4e0	mov x0,x21
00acf4e4	bl 0x00c3fd10
00acf4e8	mov w23,w0
00acf4ec	mov x0,x21
00acf4f0	bl 0x00c3fb90
00acf4f4	mov w22,w0
00acf4f8	mov x0,x21
00acf4fc	bl 0x00c3fba0
00acf500	mov w21,w0
00acf504	mov x0,xzr
00acf508	bl 0x00c3fb70
00acf50c	mov w24,w0
00acf510	mov x0,xzr
00acf514	bl 0x00c3fd10
00acf518	mov w27,w0
00acf51c	mov x0,xzr
00acf520	bl 0x00c3fb90
00acf524	mov w26,w0
00acf528	cmp w25,w24
00acf52c	mov x24,xzr
00acf530	b.eq 0x00acf540
00acf534	mov w0,w25
00acf538	bl 0x00c3fd00
00acf53c	mov x24,x0
00acf540	cmp w23,w27
00acf544	mov x25,xzr
00acf548	b.eq 0x00acf558
00acf54c	mov w0,w23
00acf550	bl 0x00c3fd00
00acf554	mov x25,x0
00acf558	cmp w22,w26
00acf55c	mov x23,xzr
00acf560	b.eq 0x00acf570
00acf564	mov w0,w22
00acf568	bl 0x00c3fd00
00acf56c	mov x23,x0
00acf570	cbz x24,0x00acf590
00acf574	adrp x2,0x29d000
00acf578	add x2,x2,#0xe2e
00acf57c	mov x0,x20
00acf580	mov x1,x19
00acf584	mov x3,x24
00acf588	bl 0x00c3add0
00acf58c	cbz w0,0x00acf5f0
00acf590	cbz x25,0x00acf5b0
00acf594	adrp x2,0x2ae000
00acf598	add x2,x2,#0x5ea
00acf59c	mov x0,x20
00acf5a0	mov x1,x19
00acf5a4	mov x3,x25
00acf5a8	bl 0x00c3add0
00acf5ac	cbz w0,0x00acf5f0
00acf5b0	cbz x23,0x00acf5d0
00acf5b4	adrp x2,0x29e000
00acf5b8	add x2,x2,#0x202
00acf5bc	mov x0,x20
00acf5c0	mov x1,x19
00acf5c4	mov x3,x23
00acf5c8	bl 0x00c3add0
00acf5cc	cbz w0,0x00acf5f0
00acf5d0	adrp x2,0x2a2000
00acf5d4	add x2,x2,#0x40c
00acf5d8	mov x0,x20
00acf5dc	mov x1,x19
00acf5e0	mov w3,w21
00acf5e4	bl 0x00c3adb0
00acf5e8	cmp w0,#0x0
00acf5ec	cset w0,ne
00acf5f0	ldp x29,x30,[sp, #0x50]
00acf5f4	ldp x20,x19,[sp, #0x40]
00acf5f8	ldp x22,x21,[sp, #0x30]
00acf5fc	ldp x24,x23,[sp, #0x20]
00acf600	ldp x26,x25,[sp, #0x10]
00acf604	ldr x27,[sp], #0x60
00acf608	ret
