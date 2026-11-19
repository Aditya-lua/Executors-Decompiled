; OBJ_add_sigid @ 00aaf4c0
00aaf4c0	stp x24,x23,[sp, #-0x40]!
00aaf4c4	adrp x23,0xd22000
00aaf4c8	ldr x8,[x23, #0x190]
00aaf4cc	stp x22,x21,[sp, #0x10]
00aaf4d0	stp x20,x19,[sp, #0x20]
00aaf4d4	mov w19,w2
00aaf4d8	mov w20,w1
00aaf4dc	mov w21,w0
00aaf4e0	stp x29,x30,[sp, #0x30]
00aaf4e4	add x29,sp,#0x30
00aaf4e8	cbnz x8,0x00aaf500
00aaf4ec	adrp x0,0xaaf000
00aaf4f0	add x0,x0,#0x5dc
00aaf4f4	bl 0x00c35340
00aaf4f8	str x0,[x23, #0x190]
00aaf4fc	cbz x0,0x00aaf5c8
00aaf500	adrp x24,0xd22000
00aaf504	ldr x8,[x24, #0x198]
00aaf508	cbnz x8,0x00aaf520
00aaf50c	adrp x0,0xaaf000
00aaf510	add x0,x0,#0x5f4
00aaf514	bl 0x00c35340
00aaf518	str x0,[x24, #0x198]
00aaf51c	cbz x0,0x00aaf5c8
00aaf520	adrp x1,0x2bc000
00aaf524	add x1,x1,#0x294
00aaf528	orr w0,wzr,#0xc
00aaf52c	mov w2,#0x6a
00aaf530	bl 0x00c32320
00aaf534	cbz x0,0x00aaf57c
00aaf538	stp w21,w20,[x0]
00aaf53c	str w19,[x0, #0x8]
00aaf540	mov x22,x0
00aaf544	ldr x0,[x23, #0x190]
00aaf548	mov x1,x22
00aaf54c	bl 0x00c347a0
00aaf550	cbz w0,0x00aaf5b0
00aaf554	ldr x0,[x24, #0x198]
00aaf558	mov x1,x22
00aaf55c	bl 0x00c347a0
00aaf560	cbz w0,0x00aaf5c8
00aaf564	ldr x0,[x23, #0x190]
00aaf568	bl 0x00c35350
00aaf56c	ldr x0,[x24, #0x198]
00aaf570	bl 0x00c35350
00aaf574	mov w0,#0x1
00aaf578	b 0x00aaf5c8
00aaf57c	bl 0x00c342a0
00aaf580	adrp x0,0x2bc000
00aaf584	adrp x2,0x2a2000
00aaf588	add x0,x0,#0x294
00aaf58c	add x2,x2,#0xaaa
00aaf590	mov w1,#0x6b
00aaf594	bl 0x00c342b0
00aaf598	mov w1,#0x100
00aaf59c	mov w0,#0x8
00aaf5a0	movk w1,#0xc, LSL #16
00aaf5a4	mov x2,xzr
00aaf5a8	bl 0x00c342c0
00aaf5ac	b 0x00aaf5c4
00aaf5b0	adrp x1,0x2bc000
00aaf5b4	add x1,x1,#0x294
00aaf5b8	mov w2,#0x73
00aaf5bc	mov x0,x22
00aaf5c0	bl 0x00c32310
00aaf5c4	mov w0,wzr
00aaf5c8	ldp x29,x30,[sp, #0x30]
00aaf5cc	ldp x20,x19,[sp, #0x20]
00aaf5d0	ldp x22,x21,[sp, #0x10]
00aaf5d4	ldp x24,x23,[sp], #0x40
00aaf5d8	ret
