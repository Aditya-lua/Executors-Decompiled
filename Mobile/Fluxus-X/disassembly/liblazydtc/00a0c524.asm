; CONF_modules_load_file_ex @ 00a0c524
00a0c524	stp x24,x23,[sp, #-0x40]!
00a0c528	stp x22,x21,[sp, #0x10]
00a0c52c	stp x20,x19,[sp, #0x20]
00a0c530	stp x29,x30,[sp, #0x30]
00a0c534	add x29,sp,#0x30
00a0c538	mov x19,x3
00a0c53c	mov x23,x2
00a0c540	mov x22,x1
00a0c544	mov x21,x0
00a0c548	bl 0x00c35250
00a0c54c	mov x20,x22
00a0c550	cbz x22,0x00a0c5b8
00a0c554	mov x0,x21
00a0c558	mov x1,xzr
00a0c55c	bl 0x00c394f0
00a0c560	mov x21,x0
00a0c564	cbz x0,0x00a0c5e0
00a0c568	mov x0,x21
00a0c56c	mov x1,x20
00a0c570	mov x2,xzr
00a0c574	bl 0x00c394d0
00a0c578	cmp w0,#0x0
00a0c57c	b.le 0x00a0c5dc
00a0c580	mov x0,x21
00a0c584	mov x1,x23
00a0c588	mov x2,x19
00a0c58c	bl 0x00a0bf84
00a0c590	adrp x2,0x2c1000
00a0c594	mov w23,w0
00a0c598	add x2,x2,#0xa3e
00a0c59c	mov x0,x21
00a0c5a0	mov x1,xzr
00a0c5a4	bl 0x00c39500
00a0c5a8	cmp x0,#0x0
00a0c5ac	cset w24,ne
00a0c5b0	cbnz x22,0x00a0c638
00a0c5b4	b 0x00a0c624
00a0c5b8	bl 0x00a0c67c
00a0c5bc	mov x20,x0
00a0c5c0	cbz x0,0x00a0c5f0
00a0c5c4	ldrb w8,[x20]
00a0c5c8	cbnz w8,0x00a0c554
00a0c5cc	mov w24,wzr
00a0c5d0	mov x21,xzr
00a0c5d4	mov w23,#0x1
00a0c5d8	b 0x00a0c624
00a0c5dc	tbnz w19,#0x4,0x00a0c600
00a0c5e0	mov w23,wzr
00a0c5e4	mov w24,wzr
00a0c5e8	cbnz x22,0x00a0c638
00a0c5ec	b 0x00a0c624
00a0c5f0	mov w24,wzr
00a0c5f4	mov w23,wzr
00a0c5f8	mov x21,xzr
00a0c5fc	b 0x00a0c624
00a0c600	bl 0x00c32420
00a0c604	asr w8,w0,#0x1f
00a0c608	and w8,w8,#0x7f800000
00a0c60c	orr w8,w8,#0x7fffff
00a0c610	and w8,w8,w0
00a0c614	cmp w8,#0x72
00a0c618	mov w24,wzr
00a0c61c	cset w23,eq
00a0c620	cbnz x22,0x00a0c638
00a0c624	adrp x1,0x2c9000
00a0c628	add x1,x1,#0x604
00a0c62c	mov w2,#0xdb
00a0c630	mov x0,x20
00a0c634	bl 0x00c32310
00a0c638	mov x0,x21
00a0c63c	bl 0x00c39480
00a0c640	and x8,x19,#0x2
00a0c644	cmp w24,#0x0
00a0c648	ccmp x8,#0x0,#0x4,eq
00a0c64c	csinc w19,w23,wzr,eq
00a0c650	cmp w19,#0x1
00a0c654	b.lt 0x00a0c660
00a0c658	bl 0x00c35240
00a0c65c	b 0x00a0c664
00a0c660	bl 0x00c35ed0
00a0c664	mov w0,w19
00a0c668	ldp x29,x30,[sp, #0x30]
00a0c66c	ldp x20,x19,[sp, #0x20]
00a0c670	ldp x22,x21,[sp, #0x10]
00a0c674	ldp x24,x23,[sp], #0x40
00a0c678	ret
