; PKCS5_v2_PBE_keyivgen_ex @ 00a6b504
00a6b504	sub sp,sp,#0xc0
00a6b508	str x27,[sp, #0x60]
00a6b50c	stp x26,x25,[sp, #0x70]
00a6b510	stp x24,x23,[sp, #0x80]
00a6b514	stp x22,x21,[sp, #0x90]
00a6b518	stp x20,x19,[sp, #0xa0]
00a6b51c	stp x29,x30,[sp, #0xb0]
00a6b520	add x29,sp,#0xb0
00a6b524	mov x20,x7
00a6b528	mov w21,w6
00a6b52c	mov x19,x3
00a6b530	mov w22,w2
00a6b534	mov x23,x1
00a6b538	mov x24,x0
00a6b53c	bl 0x00c37e30
00a6b540	mov x1,x19
00a6b544	bl 0x00c37a80
00a6b548	mov x19,x0
00a6b54c	cbz x0,0x00a6b644
00a6b550	ldr x8,[x19]
00a6b554	ldr x0,[x8]
00a6b558	bl 0x00c37750
00a6b55c	mov w1,w0
00a6b560	mov w0,#0x2
00a6b564	sub x5,x29,#0x48
00a6b568	mov x2,xzr
00a6b56c	mov x3,xzr
00a6b570	mov x4,xzr
00a6b574	bl 0x00c3d090
00a6b578	cbz w0,0x00a6b66c
00a6b57c	ldr x8,[x19, #0x8]
00a6b580	add x0,sp,#0x10
00a6b584	mov w1,#0x50
00a6b588	mov w3,wzr
00a6b58c	ldr x2,[x8]
00a6b590	bl 0x00c32500
00a6b594	cmp w0,#0x0
00a6b598	b.le 0x00a6b694
00a6b59c	ldr x26,[x29, #0x10]
00a6b5a0	bl 0x00c35250
00a6b5a4	add x1,sp,#0x10
00a6b5a8	mov x0,x20
00a6b5ac	mov x2,x26
00a6b5b0	bl 0x00c35260
00a6b5b4	mov x25,x0
00a6b5b8	mov x27,x0
00a6b5bc	cbnz x0,0x00a6b5d0
00a6b5c0	add x0,sp,#0x10
00a6b5c4	bl 0x00c35300
00a6b5c8	mov x27,x0
00a6b5cc	cbz x0,0x00a6b6e0
00a6b5d0	bl 0x00c35240
00a6b5d4	mov x0,x24
00a6b5d8	mov x1,x27
00a6b5dc	mov x2,xzr
00a6b5e0	mov x3,xzr
00a6b5e4	mov x4,xzr
00a6b5e8	mov w5,w21
00a6b5ec	bl 0x00c34be0
00a6b5f0	cbz w0,0x00a6b714
00a6b5f4	ldr x8,[x19, #0x8]
00a6b5f8	mov x0,x24
00a6b5fc	ldr x1,[x8, #0x8]
00a6b600	bl 0x00c3cee0
00a6b604	cmp w0,#0x0
00a6b608	b.le 0x00a6b6b0
00a6b60c	ldr x8,[x19]
00a6b610	ldur x9,[x29, #-0x48]
00a6b614	mov x0,x24
00a6b618	mov x1,x23
00a6b61c	ldr x3,[x8, #0x8]
00a6b620	mov w2,w22
00a6b624	mov x4,xzr
00a6b628	mov x5,xzr
00a6b62c	mov w6,w21
00a6b630	mov x7,x20
00a6b634	str x26,[sp]
00a6b638	blr x9
00a6b63c	mov w20,w0
00a6b640	b 0x00a6b718
00a6b644	bl 0x00c342a0
00a6b648	adrp x0,0x2aa000
00a6b64c	adrp x2,0x2bf000
00a6b650	add x0,x0,#0x1d8
00a6b654	add x2,x2,#0xd38
00a6b658	orr w1,wzr,#0x7f
00a6b65c	bl 0x00c342b0
00a6b660	orr w0,wzr,#0x6
00a6b664	mov w1,#0x72
00a6b668	b 0x00a6b708
00a6b66c	bl 0x00c342a0
00a6b670	adrp x0,0x2aa000
00a6b674	adrp x2,0x2bf000
00a6b678	add x0,x0,#0x1d8
00a6b67c	add x2,x2,#0xd38
00a6b680	mov w1,#0x86
00a6b684	bl 0x00c342b0
00a6b688	orr w0,wzr,#0x6
00a6b68c	orr w1,wzr,#0x7c
00a6b690	b 0x00a6b708
00a6b694	bl 0x00c342a0
00a6b698	adrp x0,0x2aa000
00a6b69c	adrp x2,0x2bf000
00a6b6a0	add x0,x0,#0x1d8
00a6b6a4	add x2,x2,#0xd38
00a6b6a8	mov w1,#0x8e
00a6b6ac	b 0x00a6b6fc
00a6b6b0	bl 0x00c342a0
00a6b6b4	adrp x0,0x2aa000
00a6b6b8	adrp x2,0x2bf000
00a6b6bc	add x0,x0,#0x1d8
00a6b6c0	add x2,x2,#0xd38
00a6b6c4	mov w1,#0xa3
00a6b6c8	bl 0x00c342b0
00a6b6cc	orr w0,wzr,#0x6
00a6b6d0	mov w1,#0x7a
00a6b6d4	mov x2,xzr
00a6b6d8	bl 0x00c342c0
00a6b6dc	b 0x00a6b714
00a6b6e0	bl 0x00c35ed0
00a6b6e4	bl 0x00c342a0
00a6b6e8	adrp x0,0x2aa000
00a6b6ec	adrp x2,0x2bf000
00a6b6f0	add x0,x0,#0x1d8
00a6b6f4	add x2,x2,#0xd38
00a6b6f8	mov w1,#0x9a
00a6b6fc	bl 0x00c342b0
00a6b700	orr w0,wzr,#0x6
00a6b704	mov w1,#0x6b
00a6b708	mov x2,xzr
00a6b70c	bl 0x00c342c0
00a6b710	mov x25,xzr
00a6b714	mov w20,wzr
00a6b718	mov x0,x25
00a6b71c	bl 0x00c357d0
00a6b720	mov x0,x19
00a6b724	bl 0x00c37e20
00a6b728	mov w0,w20
00a6b72c	ldp x29,x30,[sp, #0xb0]
00a6b730	ldp x20,x19,[sp, #0xa0]
00a6b734	ldp x22,x21,[sp, #0x90]
00a6b738	ldp x24,x23,[sp, #0x80]
00a6b73c	ldp x26,x25,[sp, #0x70]
00a6b740	ldr x27,[sp, #0x60]
00a6b744	add sp,sp,#0xc0
00a6b748	ret
