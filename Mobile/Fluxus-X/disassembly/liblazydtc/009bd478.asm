; FUN_009bd478 @ 009bd478
009bd478	str x23,[sp, #-0x40]!
009bd47c	stp x22,x21,[sp, #0x10]
009bd480	mov w21,w1
009bd484	adrp x1,0x2db000
009bd488	stp x20,x19,[sp, #0x20]
009bd48c	mov x20,x0
009bd490	add x1,x1,#0xb17
009bd494	mov w0,#0x3a0
009bd498	mov w2,#0xa3
009bd49c	stp x29,x30,[sp, #0x30]
009bd4a0	add x29,sp,#0x30
009bd4a4	bl 0x00c32320
009bd4a8	mov x19,x0
009bd4ac	cbz x0,0x009bd5f8
009bd4b0	mov w2,#0x3a0
009bd4b4	mov x0,x19
009bd4b8	mov x1,x20
009bd4bc	bl 0x00c2ffd0
009bd4c0	add x23,x19,#0x2b8
009bd4c4	add x8,x19,#0x2d0
009bd4c8	movi v0.2D,#0x0
009bd4cc	mov w9,#0x1
009bd4d0	str xzr,[x19, #0x358]
009bd4d4	str xzr,[x19, #0x390]
009bd4d8	str q0,[x19, #0x2a0]
009bd4dc	str q0,[x23]
009bd4e0	stp q0,q0,[x19, #0x320]
009bd4e4	str q0,[x19, #0x310]
009bd4e8	str q0,[x19, #0x370]
009bd4ec	stlr w9,[x8]
009bd4f0	bl 0x00c34d50
009bd4f4	str x0,[x19, #0x398]
009bd4f8	cbz x0,0x009bd5e0
009bd4fc	add x22,x19,#0x310
009bd500	mov w0,#0x2
009bd504	mov x1,x19
009bd508	mov x2,x22
009bd50c	bl 0x00c356e0
009bd510	cbz w0,0x009bd5f8
009bd514	ldr x0,[x20, #0x2b8]
009bd518	cbz x0,0x009bd52c
009bd51c	bl 0x00c350b0
009bd520	cbz w0,0x009bd5f8
009bd524	ldr x8,[x20, #0x2b8]
009bd528	str x8,[x23]
009bd52c	ldr x0,[x20, #0x2c0]
009bd530	cbz x0,0x009bd540
009bd534	bl 0x00c35070
009bd538	str x0,[x19, #0x2c0]
009bd53c	cbz x0,0x009bd5f8
009bd540	ldr x0,[x20, #0x2a0]
009bd544	cbz x0,0x009bd560
009bd548	adrp x1,0x2db000
009bd54c	add x1,x1,#0xb17
009bd550	mov w2,#0xda
009bd554	bl 0x00c34600
009bd558	str x0,[x19, #0x2a0]
009bd55c	cbz x0,0x009bd5f8
009bd560	ldr x0,[x20, #0x2a8]
009bd564	cbz x0,0x009bd580
009bd568	adrp x1,0x2db000
009bd56c	add x1,x1,#0xb17
009bd570	orr w2,wzr,#0xe0
009bd574	bl 0x00c34600
009bd578	str x0,[x19, #0x2a8]
009bd57c	cbz x0,0x009bd5f8
009bd580	add x2,x20,#0x310
009bd584	mov w0,#0x2
009bd588	mov x1,x22
009bd58c	bl 0x00c356b0
009bd590	cbz w0,0x009bd5f8
009bd594	ldr x0,[x20, #0x330]
009bd598	cbz x0,0x009bd5b4
009bd59c	adrp x1,0x2db000
009bd5a0	add x1,x1,#0xb17
009bd5a4	mov w2,#0xed
009bd5a8	bl 0x00c34600
009bd5ac	str x0,[x19, #0x330]
009bd5b0	cbz x0,0x009bd5f8
009bd5b4	cbz w21,0x009bd64c
009bd5b8	ldr x0,[x20, #0x338]
009bd5bc	cbz x0,0x009bd64c
009bd5c0	ldr x1,[x20, #0x340]
009bd5c4	adrp x2,0x2db000
009bd5c8	add x2,x2,#0xb17
009bd5cc	mov w3,#0xf5
009bd5d0	bl 0x00c345f0
009bd5d4	str x0,[x19, #0x338]
009bd5d8	cbnz x0,0x009bd654
009bd5dc	b 0x009bd5f8
009bd5e0	adrp x1,0x2db000
009bd5e4	add x1,x1,#0xb17
009bd5e8	mov w2,#0xc5
009bd5ec	mov x0,x19
009bd5f0	bl 0x00c32310
009bd5f4	mov x19,xzr
009bd5f8	bl 0x00c342a0
009bd5fc	adrp x0,0x2db000
009bd600	adrp x2,0x2c7000
009bd604	add x0,x0,#0xb17
009bd608	add x2,x2,#0x667
009bd60c	mov w1,#0x116
009bd610	bl 0x00c342b0
009bd614	mov w1,#0x100
009bd618	mov w0,#0x14
009bd61c	movk w1,#0xc, LSL #16
009bd620	mov x2,xzr
009bd624	bl 0x00c342c0
009bd628	mov x0,x19
009bd62c	bl 0x009bdb1c
009bd630	mov x19,xzr
009bd634	mov x0,x19
009bd638	ldp x29,x30,[sp, #0x30]
009bd63c	ldp x20,x19,[sp, #0x20]
009bd640	ldp x22,x21,[sp, #0x10]
009bd644	ldr x23,[sp], #0x40
009bd648	ret
009bd64c	movi v0.2D,#0x0
009bd650	str q0,[x19, #0x340]
009bd654	ldr x0,[x20, #0x358]
009bd658	cbz x0,0x009bd678
009bd65c	ldr x1,[x20, #0x360]
009bd660	adrp x2,0x2db000
009bd664	add x2,x2,#0xb17
009bd668	orr w3,wzr,#0xff
009bd66c	bl 0x00c345f0
009bd670	str x0,[x19, #0x358]
009bd674	cbz x0,0x009bd5f8
009bd678	ldr x0,[x20, #0x370]
009bd67c	cbz x0,0x009bd698
009bd680	adrp x1,0x2db000
009bd684	add x1,x1,#0xb17
009bd688	mov w2,#0x106
009bd68c	bl 0x00c34600
009bd690	str x0,[x19, #0x370]
009bd694	cbz x0,0x009bd5f8
009bd698	ldr x0,[x20, #0x378]
009bd69c	cbz x0,0x009bd634
009bd6a0	ldr x1,[x20, #0x380]
009bd6a4	adrp x2,0x2db000
009bd6a8	add x2,x2,#0xb17
009bd6ac	mov w3,#0x10f
009bd6b0	bl 0x00c345f0
009bd6b4	str x0,[x19, #0x378]
009bd6b8	cbnz x0,0x009bd634
009bd6bc	b 0x009bd5f8
