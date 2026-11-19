; EVP_EncryptFinal_ex @ 00a5b528
00a5b528	str x23,[sp, #-0x40]!
00a5b52c	stp x22,x21,[sp, #0x10]
00a5b530	stp x20,x19,[sp, #0x20]
00a5b534	stp x29,x30,[sp, #0x30]
00a5b538	add x29,sp,#0x30
00a5b53c	cbz x2,0x00a5b5d0
00a5b540	str wzr,[x2]
00a5b544	ldr w8,[x0, #0x10]
00a5b548	mov x19,x2
00a5b54c	mov x21,x0
00a5b550	cbz w8,0x00a5b5fc
00a5b554	ldr x23,[x21]
00a5b558	cbz x23,0x00a5b624
00a5b55c	ldr x8,[x23, #0x78]
00a5b560	mov x20,x1
00a5b564	cbz x8,0x00a5b690
00a5b568	mov x0,x21
00a5b56c	bl 0x00c36d40
00a5b570	cmp w0,#0x1
00a5b574	b.lt 0x00a5b64c
00a5b578	ldr x8,[x21]
00a5b57c	ldr x9,[x8, #0xb0]
00a5b580	cbz x9,0x00a5b64c
00a5b584	ldr x8,[x21, #0xa8]
00a5b588	sxtw x10,w0
00a5b58c	cmp w0,#0x1
00a5b590	csel x3,xzr,x10,eq
00a5b594	add x2,sp,#0x8
00a5b598	mov x0,x8
00a5b59c	mov x1,x20
00a5b5a0	blr x9
00a5b5a4	cbz w0,0x00a5b67c
00a5b5a8	ldr x8,[sp, #0x8]
00a5b5ac	lsr x9,x8,#0x1f
00a5b5b0	cbz x9,0x00a5b730
00a5b5b4	bl 0x00c342a0
00a5b5b8	adrp x0,0x2a5000
00a5b5bc	adrp x2,0x2a4000
00a5b5c0	add x0,x0,#0xf9d
00a5b5c4	add x2,x2,#0x49
00a5b5c8	mov w1,#0x2ee
00a5b5cc	b 0x00a5b664
00a5b5d0	bl 0x00c342a0
00a5b5d4	adrp x0,0x2a5000
00a5b5d8	adrp x2,0x2a4000
00a5b5dc	add x0,x0,#0xf9d
00a5b5e0	add x2,x2,#0x49
00a5b5e4	mov w1,#0x2d1
00a5b5e8	bl 0x00c342b0
00a5b5ec	mov w1,#0x102
00a5b5f0	orr w0,wzr,#0x6
00a5b5f4	movk w1,#0xc, LSL #16
00a5b5f8	b 0x00a5b670
00a5b5fc	bl 0x00c342a0
00a5b600	adrp x0,0x2a5000
00a5b604	adrp x2,0x2a4000
00a5b608	add x0,x0,#0xf9d
00a5b60c	add x2,x2,#0x49
00a5b610	mov w1,#0x2d7
00a5b614	bl 0x00c342b0
00a5b618	orr w0,wzr,#0x6
00a5b61c	mov w1,#0x94
00a5b620	b 0x00a5b670
00a5b624	bl 0x00c342a0
00a5b628	adrp x0,0x2a5000
00a5b62c	adrp x2,0x2a4000
00a5b630	add x0,x0,#0xf9d
00a5b634	add x2,x2,#0x49
00a5b638	mov w1,#0x2dc
00a5b63c	bl 0x00c342b0
00a5b640	orr w0,wzr,#0x6
00a5b644	mov w1,#0x83
00a5b648	b 0x00a5b670
00a5b64c	bl 0x00c342a0
00a5b650	adrp x0,0x2a5000
00a5b654	adrp x2,0x2a4000
00a5b658	add x0,x0,#0xf9d
00a5b65c	add x2,x2,#0x49
00a5b660	mov w1,#0x2e5
00a5b664	bl 0x00c342b0
00a5b668	orr w0,wzr,#0x6
00a5b66c	mov w1,#0xbc
00a5b670	mov x2,xzr
00a5b674	bl 0x00c342c0
00a5b678	mov w0,wzr
00a5b67c	ldp x29,x30,[sp, #0x30]
00a5b680	ldp x20,x19,[sp, #0x20]
00a5b684	ldp x22,x21,[sp, #0x10]
00a5b688	ldr x23,[sp], #0x40
00a5b68c	ret
00a5b690	ldrb w8,[x23, #0x12]
00a5b694	tbnz w8,#0x4,0x00a5b6b8
00a5b698	ldr w22,[x23, #0x4]
00a5b69c	cmp w22,#0x21
00a5b6a0	b.cs 0x00a5b764
00a5b6a4	subs w8,w22,#0x1
00a5b6a8	b.ne 0x00a5b6e0
00a5b6ac	str wzr,[x19]
00a5b6b0	mov w0,#0x1
00a5b6b4	b 0x00a5b67c
00a5b6b8	ldr x8,[x23, #0x28]
00a5b6bc	mov x0,x21
00a5b6c0	mov x1,x20
00a5b6c4	mov x2,xzr
00a5b6c8	mov x3,xzr
00a5b6cc	blr x8
00a5b6d0	tbnz w0,#0x1f,0x00a5b678
00a5b6d4	str w0,[x19]
00a5b6d8	mov w0,#0x1
00a5b6dc	b 0x00a5b67c
00a5b6e0	ldrb w10,[x21, #0x71]
00a5b6e4	ldr w9,[x21, #0x14]
00a5b6e8	tbnz w10,#0x0,0x00a5b738
00a5b6ec	cmp w22,w9
00a5b6f0	b.ls 0x00a5b70c
00a5b6f4	add x10,x21,x9
00a5b6f8	sub w8,w8,w9
00a5b6fc	sub w1,w22,w9
00a5b700	add x0,x10,#0x38
00a5b704	add x2,x8,#0x1
00a5b708	bl 0x00c301c0
00a5b70c	ldr x8,[x23, #0x28]
00a5b710	add x2,x21,#0x38
00a5b714	mov x0,x21
00a5b718	mov x1,x20
00a5b71c	mov x3,x22
00a5b720	blr x8
00a5b724	cbz w0,0x00a5b67c
00a5b728	str w22,[x19]
00a5b72c	b 0x00a5b67c
00a5b730	str w8,[x19]
00a5b734	b 0x00a5b67c
00a5b738	cbz w9,0x00a5b6ac
00a5b73c	bl 0x00c342a0
00a5b740	adrp x0,0x2a5000
00a5b744	adrp x2,0x2a4000
00a5b748	add x0,x0,#0xf9d
00a5b74c	add x2,x2,#0x49
00a5b750	mov w1,#0x30b
00a5b754	bl 0x00c342b0
00a5b758	orr w0,wzr,#0x6
00a5b75c	mov w1,#0x8a
00a5b760	b 0x00a5b670
00a5b764	adrp x0,0x2cb000
00a5b768	adrp x1,0x2a5000
00a5b76c	add x0,x0,#0x91f
00a5b770	add x1,x1,#0xf9d
00a5b774	mov w2,#0x303
00a5b778	bl 0x00c3c240
