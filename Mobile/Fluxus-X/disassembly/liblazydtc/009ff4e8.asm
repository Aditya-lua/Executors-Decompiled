; BIO_accept @ 009ff4e8
009ff4e8	sub sp,sp,#0xb0
009ff4ec	stp x22,x21,[sp, #0x80]
009ff4f0	mov x22,x1
009ff4f4	mov x1,sp
009ff4f8	mov w2,wzr
009ff4fc	str x23,[sp, #0x70]
009ff500	stp x20,x19,[sp, #0x90]
009ff504	stp x29,x30,[sp, #0xa0]
009ff508	add x29,sp,#0xa0
009ff50c	bl 0x00c38740
009ff510	cmn w0,#0x1
009ff514	b.eq 0x009ff5a8
009ff518	mov w19,w0
009ff51c	cbz x22,0x009ff688
009ff520	mov x0,sp
009ff524	mov w1,#0x1
009ff528	bl 0x00c38520
009ff52c	mov x20,x0
009ff530	mov x0,sp
009ff534	mov w1,#0x1
009ff538	bl 0x00c38550
009ff53c	mov x21,x0
009ff540	cbz x20,0x009ff5b8
009ff544	cbz x21,0x009ff5b8
009ff548	mov x0,x20
009ff54c	bl 0x00c2ff50
009ff550	mov x23,x0
009ff554	mov x0,x21
009ff558	bl 0x00c2ff50
009ff55c	add x8,x23,x0
009ff560	adrp x1,0x2c3000
009ff564	add x0,x8,#0x2
009ff568	add x1,x1,#0x72e
009ff56c	mov w2,#0x10f
009ff570	bl 0x00c34250
009ff574	str x0,[x22]
009ff578	cbz x0,0x009ff5bc
009ff57c	mov x1,x20
009ff580	bl 0x00c31b90
009ff584	ldr x23,[x22]
009ff588	mov x0,x23
009ff58c	bl 0x00c2ff50
009ff590	mov w8,#0x3a
009ff594	strh w8,[x23, x0#0x0]
009ff598	ldr x0,[x22]
009ff59c	mov x1,x21
009ff5a0	bl 0x00c309a0
009ff5a4	b 0x009ff5f8
009ff5a8	bl 0x00c38770
009ff5ac	cbz w0,0x009ff624
009ff5b0	orr w19,wzr,#0xfffffffe
009ff5b4	b 0x009ff688
009ff5b8	str xzr,[x22]
009ff5bc	bl 0x00c342a0
009ff5c0	adrp x0,0x2c3000
009ff5c4	adrp x2,0x29d000
009ff5c8	add x0,x0,#0x72e
009ff5cc	add x2,x2,#0xf78
009ff5d0	mov w1,#0x114
009ff5d4	bl 0x00c342b0
009ff5d8	mov w1,#0x100
009ff5dc	mov w0,#0x20
009ff5e0	movk w1,#0xc, LSL #16
009ff5e4	mov x2,xzr
009ff5e8	bl 0x00c342c0
009ff5ec	mov w0,w19
009ff5f0	bl 0x00c38750
009ff5f4	mov w19,#0xffffffff
009ff5f8	adrp x22,0x2c3000
009ff5fc	add x22,x22,#0x72e
009ff600	mov w2,#0x11c
009ff604	mov x0,x20
009ff608	mov x1,x22
009ff60c	bl 0x00c32310
009ff610	mov w2,#0x11d
009ff614	mov x0,x21
009ff618	mov x1,x22
009ff61c	bl 0x00c32310
009ff620	b 0x009ff688
009ff624	bl 0x00c342a0
009ff628	adrp x19,0x2c3000
009ff62c	adrp x20,0x29d000
009ff630	add x19,x19,#0x72e
009ff634	add x20,x20,#0xf78
009ff638	mov w1,#0x105
009ff63c	mov x0,x19
009ff640	mov x2,x20
009ff644	bl 0x00c342b0
009ff648	bl 0x00c30710
009ff64c	ldr w1,[x0]
009ff650	adrp x2,0x2d3000
009ff654	add x2,x2,#0x905
009ff658	mov w0,#0x2
009ff65c	bl 0x00c342c0
009ff660	bl 0x00c342a0
009ff664	mov w1,#0x107
009ff668	mov x0,x19
009ff66c	mov x2,x20
009ff670	bl 0x00c342b0
009ff674	mov w0,#0x20
009ff678	mov w1,#0x64
009ff67c	mov x2,xzr
009ff680	bl 0x00c342c0
009ff684	mov w19,#0xffffffff
009ff688	mov w0,w19
009ff68c	ldp x29,x30,[sp, #0xa0]
009ff690	ldp x20,x19,[sp, #0x90]
009ff694	ldp x22,x21,[sp, #0x80]
009ff698	ldr x23,[sp, #0x70]
009ff69c	add sp,sp,#0xb0
009ff6a0	ret
