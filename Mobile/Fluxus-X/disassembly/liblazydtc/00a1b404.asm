; BN_exp @ 00a1b404
00a1b404	str x25,[sp, #-0x50]!
00a1b408	stp x24,x23,[sp, #0x10]
00a1b40c	stp x20,x19,[sp, #0x30]
00a1b410	mov x24,x1
00a1b414	mov x20,x0
00a1b418	mov w1,#0x4
00a1b41c	mov x0,x2
00a1b420	stp x22,x21,[sp, #0x20]
00a1b424	stp x29,x30,[sp, #0x40]
00a1b428	add x29,sp,#0x40
00a1b42c	mov x19,x3
00a1b430	mov x21,x2
00a1b434	bl 0x00c38ce0
00a1b438	cbnz w0,0x00a1b44c
00a1b43c	mov w1,#0x4
00a1b440	mov x0,x24
00a1b444	bl 0x00c38ce0
00a1b448	cbz w0,0x00a1b49c
00a1b44c	bl 0x00c342a0
00a1b450	adrp x0,0x2c9000
00a1b454	adrp x2,0x2b2000
00a1b458	add x0,x0,#0x65b
00a1b45c	add x2,x2,#0xca
00a1b460	mov w1,#0x39
00a1b464	bl 0x00c342b0
00a1b468	mov w1,#0x101
00a1b46c	orr w0,wzr,#0x3
00a1b470	movk w1,#0xc, LSL #16
00a1b474	mov x2,xzr
00a1b478	bl 0x00c342c0
00a1b47c	mov w25,wzr
00a1b480	ldp x29,x30,[sp, #0x40]
00a1b484	ldp x20,x19,[sp, #0x30]
00a1b488	ldp x22,x21,[sp, #0x20]
00a1b48c	ldp x24,x23,[sp, #0x10]
00a1b490	mov w0,w25
00a1b494	ldr x25,[sp], #0x50
00a1b498	ret
00a1b49c	mov x0,x19
00a1b4a0	bl 0x00c38a90
00a1b4a4	cmp x20,x24
00a1b4a8	b.eq 0x00a1b4b8
00a1b4ac	cmp x20,x21
00a1b4b0	mov x22,x20
00a1b4b4	b.ne 0x00a1b4c4
00a1b4b8	mov x0,x19
00a1b4bc	bl 0x00c38a40
00a1b4c0	mov x22,x0
00a1b4c4	mov x0,x19
00a1b4c8	bl 0x00c38a40
00a1b4cc	cbz x22,0x00a1b59c
00a1b4d0	mov x23,x0
00a1b4d4	mov w25,wzr
00a1b4d8	cbz x0,0x00a1b5a0
00a1b4dc	mov x0,x23
00a1b4e0	mov x1,x24
00a1b4e4	bl 0x00c36990
00a1b4e8	cbz x0,0x00a1b59c
00a1b4ec	mov x0,x21
00a1b4f0	bl 0x00c322f0
00a1b4f4	mov w25,w0
00a1b4f8	mov x0,x21
00a1b4fc	bl 0x00c38d10
00a1b500	cbz w0,0x00a1b518
00a1b504	mov x0,x22
00a1b508	mov x1,x24
00a1b50c	bl 0x00c36990
00a1b510	cbnz x0,0x00a1b528
00a1b514	b 0x00a1b59c
00a1b518	mov w1,#0x1
00a1b51c	mov x0,x22
00a1b520	bl 0x00c37720
00a1b524	cbz w0,0x00a1b59c
00a1b528	cmp w25,#0x2
00a1b52c	b.lt 0x00a1b57c
00a1b530	mov w24,#0x1
00a1b534	mov x0,x23
00a1b538	mov x1,x23
00a1b53c	mov x2,x19
00a1b540	bl 0x00c39090
00a1b544	cbz w0,0x00a1b59c
00a1b548	mov x0,x21
00a1b54c	mov w1,w24
00a1b550	bl 0x00c38d00
00a1b554	cbz w0,0x00a1b570
00a1b558	mov x0,x22
00a1b55c	mov x1,x22
00a1b560	mov x2,x23
00a1b564	mov x3,x19
00a1b568	bl 0x00c39060
00a1b56c	cbz w0,0x00a1b59c
00a1b570	add w24,w24,#0x1
00a1b574	cmp w24,w25
00a1b578	b.lt 0x00a1b534
00a1b57c	cmp x22,x20
00a1b580	b.eq 0x00a1b594
00a1b584	mov x0,x20
00a1b588	mov x1,x22
00a1b58c	bl 0x00c36990
00a1b590	cbz x0,0x00a1b59c
00a1b594	mov w25,#0x1
00a1b598	b 0x00a1b5a0
00a1b59c	mov w25,wzr
00a1b5a0	mov x0,x19
00a1b5a4	bl 0x00c38a20
00a1b5a8	b 0x00a1b480
