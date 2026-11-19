; FUN_00b5c548 @ 00b5c548
00b5c548	stp x22,x21,[sp, #-0x30]!
00b5c54c	stp x20,x19,[sp, #0x10]
00b5c550	stp x29,x30,[sp, #0x20]
00b5c554	add x29,sp,#0x20
00b5c558	mov x20,x0
00b5c55c	bl 0x00c41000
00b5c560	cbz w0,0x00b5c65c
00b5c564	adrp x1,0x2ce000
00b5c568	add x1,x1,#0x95b
00b5c56c	mov w0,#0x178
00b5c570	mov w2,#0x198
00b5c574	bl 0x00c34250
00b5c578	mov x19,x0
00b5c57c	cbz x0,0x00b5c660
00b5c580	mov w2,#0x178
00b5c584	mov x0,x19
00b5c588	mov x1,x20
00b5c58c	bl 0x00c2ffd0
00b5c590	mov x22,x19
00b5c594	str xzr,[x22, #0x8]!
00b5c598	str xzr,[x22, #0x8]
00b5c59c	stp xzr,xzr,[x22, #0x158]
00b5c5a0	ldr x0,[x20, #0x10]
00b5c5a4	add x21,x22,#0x158
00b5c5a8	cbz x0,0x00b5c5b8
00b5c5ac	bl 0x00c3a2f0
00b5c5b0	cbz w0,0x00b5c614
00b5c5b4	ldr x0,[x20, #0x10]
00b5c5b8	str x0,[x19, #0x10]
00b5c5bc	ldr x0,[x20, #0x160]
00b5c5c0	cbz x0,0x00b5c5d0
00b5c5c4	bl 0x00c35820
00b5c5c8	cbz w0,0x00b5c614
00b5c5cc	ldr x0,[x20, #0x160]
00b5c5d0	str x0,[x21]
00b5c5d4	ldr x8,[x20, #0x168]
00b5c5d8	cbz x8,0x00b5c5f4
00b5c5dc	bl 0x00c31fa0
00b5c5e0	str x0,[x19, #0x168]
00b5c5e4	cbz x0,0x00b5c614
00b5c5e8	ldr x1,[x20, #0x168]
00b5c5ec	bl 0x00c34bf0
00b5c5f0	cbz w0,0x00b5c614
00b5c5f4	ldr x0,[x20, #0x8]
00b5c5f8	cbz x0,0x00b5c660
00b5c5fc	adrp x1,0x2ce000
00b5c600	add x1,x1,#0x95b
00b5c604	mov w2,#0x1b1
00b5c608	bl 0x00c34600
00b5c60c	str x0,[x22]
00b5c610	cbnz x0,0x00b5c660
00b5c614	ldr x0,[x19, #0x8]
00b5c618	adrp x20,0x2ce000
00b5c61c	add x20,x20,#0x95b
00b5c620	mov w2,#0x186
00b5c624	mov x1,x20
00b5c628	bl 0x00c32310
00b5c62c	ldr x0,[x19, #0x168]
00b5c630	bl 0x00c31f90
00b5c634	ldr x0,[x19, #0x160]
00b5c638	bl 0x00c35800
00b5c63c	str xzr,[x19, #0x8]
00b5c640	stp xzr,xzr,[x21]
00b5c644	ldr x0,[x19, #0x10]
00b5c648	bl 0x00c3a0a0
00b5c64c	mov w2,#0x18d
00b5c650	mov x0,x19
00b5c654	mov x1,x20
00b5c658	bl 0x00c32310
00b5c65c	mov x19,xzr
00b5c660	mov x0,x19
00b5c664	ldp x29,x30,[sp, #0x20]
00b5c668	ldp x20,x19,[sp, #0x10]
00b5c66c	ldp x22,x21,[sp], #0x30
00b5c670	ret
