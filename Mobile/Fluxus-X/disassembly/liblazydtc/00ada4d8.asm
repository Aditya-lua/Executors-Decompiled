; ossl_rsa_sp800_56b_check_public @ 00ada4d8
00ada4d8	str x23,[sp, #-0x40]!
00ada4dc	stp x22,x21,[sp, #0x10]
00ada4e0	stp x20,x19,[sp, #0x20]
00ada4e4	stp x29,x30,[sp, #0x30]
00ada4e8	mov x22,x0
00ada4ec	ldr x0,[x0, #0x28]
00ada4f0	add x29,sp,#0x30
00ada4f4	cbz x0,0x00ada654
00ada4f8	ldr x8,[x22, #0x30]
00ada4fc	cbz x8,0x00ada654
00ada500	bl 0x00c322f0
00ada504	cmp w0,#0x4, LSL #12
00ada508	b.le 0x00ada534
00ada50c	bl 0x00c342a0
00ada510	adrp x0,0x2c0000
00ada514	adrp x2,0x2aa000
00ada518	add x0,x0,#0x537
00ada51c	add x2,x2,#0x954
00ada520	mov w1,#0x125
00ada524	bl 0x00c342b0
00ada528	mov w0,#0x4
00ada52c	mov w1,#0x69
00ada530	b 0x00ada64c
00ada534	mov w21,w0
00ada538	ldr x0,[x22, #0x28]
00ada53c	bl 0x00c38d10
00ada540	cbz w0,0x00ada628
00ada544	ldr x19,[x22, #0x30]
00ada548	mov x0,x19
00ada54c	bl 0x00c38d10
00ada550	cbz w0,0x00ada600
00ada554	bl 0x00c38de0
00ada558	mov x1,x0
00ada55c	mov x0,x19
00ada560	bl 0x00c38cc0
00ada564	cmp w0,#0x0
00ada568	b.le 0x00ada600
00ada56c	ldr x0,[x22, #0x8]
00ada570	bl 0x00c38a60
00ada574	mov x19,x0
00ada578	bl 0x00c37710
00ada57c	mov x20,x0
00ada580	cbz x19,0x00ada6b8
00ada584	mov w23,wzr
00ada588	cbz x20,0x00ada6bc
00ada58c	ldr x23,[x22, #0x28]
00ada590	bl 0x00c39130
00ada594	mov x2,x0
00ada598	mov x0,x20
00ada59c	mov x1,x23
00ada5a0	mov x3,x19
00ada5a4	bl 0x00c38b10
00ada5a8	cbz w0,0x00ada670
00ada5ac	mov x0,x20
00ada5b0	bl 0x00c38d20
00ada5b4	cbz w0,0x00ada670
00ada5b8	ldr x0,[x22, #0x28]
00ada5bc	mov w1,#0x5
00ada5c0	mov w4,#0x1
00ada5c4	add x5,sp,#0xc
00ada5c8	mov x2,x19
00ada5cc	mov x3,xzr
00ada5d0	bl 0x00c39140
00ada5d4	cmp w0,#0x1
00ada5d8	b.ne 0x00ada68c
00ada5dc	ldr w8,[sp, #0xc]
00ada5e0	cmp w8,#0x2
00ada5e4	b.eq 0x00ada5f8
00ada5e8	cmp w21,#0x1ff
00ada5ec	b.gt 0x00ada68c
00ada5f0	cmp w8,#0x1
00ada5f4	b.ne 0x00ada68c
00ada5f8	mov w23,#0x1
00ada5fc	b 0x00ada6bc
00ada600	bl 0x00c342a0
00ada604	adrp x0,0x2c0000
00ada608	adrp x2,0x2aa000
00ada60c	add x0,x0,#0x537
00ada610	add x2,x2,#0x954
00ada614	mov w1,#0x139
00ada618	bl 0x00c342b0
00ada61c	mov w0,#0x4
00ada620	mov w1,#0xb2
00ada624	b 0x00ada64c
00ada628	bl 0x00c342a0
00ada62c	adrp x0,0x2c0000
00ada630	adrp x2,0x2aa000
00ada634	add x0,x0,#0x537
00ada638	add x2,x2,#0x954
00ada63c	mov w1,#0x134
00ada640	bl 0x00c342b0
00ada644	mov w0,#0x4
00ada648	mov w1,#0xae
00ada64c	mov x2,xzr
00ada650	bl 0x00c342c0
00ada654	mov w23,wzr
00ada658	ldp x29,x30,[sp, #0x30]
00ada65c	ldp x20,x19,[sp, #0x20]
00ada660	ldp x22,x21,[sp, #0x10]
00ada664	mov w0,w23
00ada668	ldr x23,[sp], #0x40
00ada66c	ret
00ada670	bl 0x00c342a0
00ada674	adrp x0,0x2c0000
00ada678	adrp x2,0x2aa000
00ada67c	add x0,x0,#0x537
00ada680	add x2,x2,#0x954
00ada684	mov w1,#0x148
00ada688	b 0x00ada6a4
00ada68c	bl 0x00c342a0
00ada690	adrp x0,0x2c0000
00ada694	adrp x2,0x2aa000
00ada698	add x0,x0,#0x537
00ada69c	add x2,x2,#0x954
00ada6a0	mov w1,#0x155
00ada6a4	bl 0x00c342b0
00ada6a8	mov w0,#0x4
00ada6ac	mov w1,#0xae
00ada6b0	mov x2,xzr
00ada6b4	bl 0x00c342c0
00ada6b8	mov w23,wzr
00ada6bc	mov x0,x20
00ada6c0	bl 0x00c36290
00ada6c4	mov x0,x19
00ada6c8	bl 0x00c38a30
00ada6cc	b 0x00ada658
