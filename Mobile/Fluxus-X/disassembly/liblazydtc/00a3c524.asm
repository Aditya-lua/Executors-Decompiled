; ossl_ec_GFp_simple_get_Jprojective_coordinates_GFp @ 00a3c524
00a3c524	str x25,[sp, #-0x50]!
00a3c528	stp x24,x23,[sp, #0x10]
00a3c52c	stp x22,x21,[sp, #0x20]
00a3c530	stp x20,x19,[sp, #0x30]
00a3c534	stp x29,x30,[sp, #0x40]
00a3c538	ldr x8,[x0]
00a3c53c	mov x20,x4
00a3c540	mov x22,x3
00a3c544	mov x25,x2
00a3c548	ldr x8,[x8, #0x120]
00a3c54c	mov x21,x1
00a3c550	add x29,sp,#0x40
00a3c554	cbz x8,0x00a3c5ec
00a3c558	mov x23,x5
00a3c55c	mov x24,x0
00a3c560	mov x19,xzr
00a3c564	cbnz x5,0x00a3c57c
00a3c568	ldr x0,[x24, #0xa8]
00a3c56c	bl 0x00c38a60
00a3c570	mov x23,x0
00a3c574	mov x19,x0
00a3c578	cbz x0,0x00a3c660
00a3c57c	cbz x25,0x00a3c5a0
00a3c580	ldr x8,[x24]
00a3c584	ldr x2,[x21, #0x10]
00a3c588	mov x0,x24
00a3c58c	mov x1,x25
00a3c590	ldr x8,[x8, #0x120]
00a3c594	mov x3,x23
00a3c598	blr x8
00a3c59c	cbz w0,0x00a3c638
00a3c5a0	cbz x22,0x00a3c5c4
00a3c5a4	ldr x8,[x24]
00a3c5a8	ldr x2,[x21, #0x18]
00a3c5ac	mov x0,x24
00a3c5b0	mov x1,x22
00a3c5b4	ldr x8,[x8, #0x120]
00a3c5b8	mov x3,x23
00a3c5bc	blr x8
00a3c5c0	cbz w0,0x00a3c638
00a3c5c4	cbz x20,0x00a3c62c
00a3c5c8	ldr x8,[x24]
00a3c5cc	ldr x2,[x21, #0x20]
00a3c5d0	mov x0,x24
00a3c5d4	mov x1,x20
00a3c5d8	ldr x8,[x8, #0x120]
00a3c5dc	mov x3,x23
00a3c5e0	blr x8
00a3c5e4	cbnz w0,0x00a3c62c
00a3c5e8	b 0x00a3c638
00a3c5ec	cbz x25,0x00a3c600
00a3c5f0	ldr x1,[x21, #0x10]
00a3c5f4	mov x0,x25
00a3c5f8	bl 0x00c36990
00a3c5fc	cbz x0,0x00a3c634
00a3c600	cbz x22,0x00a3c614
00a3c604	ldr x1,[x21, #0x18]
00a3c608	mov x0,x22
00a3c60c	bl 0x00c36990
00a3c610	cbz x0,0x00a3c634
00a3c614	cbz x20,0x00a3c628
00a3c618	ldr x1,[x21, #0x20]
00a3c61c	mov x0,x20
00a3c620	bl 0x00c36990
00a3c624	cbz x0,0x00a3c634
00a3c628	mov x19,xzr
00a3c62c	mov w20,#0x1
00a3c630	b 0x00a3c63c
00a3c634	mov x19,xzr
00a3c638	mov w20,wzr
00a3c63c	mov x0,x19
00a3c640	bl 0x00c38a30
00a3c644	mov w0,w20
00a3c648	ldp x29,x30,[sp, #0x40]
00a3c64c	ldp x20,x19,[sp, #0x30]
00a3c650	ldp x22,x21,[sp, #0x20]
00a3c654	ldp x24,x23,[sp, #0x10]
00a3c658	ldr x25,[sp], #0x50
00a3c65c	ret
00a3c660	mov w20,wzr
00a3c664	b 0x00a3c644
