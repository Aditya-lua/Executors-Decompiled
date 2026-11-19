; OSSL_STORE_open_ex @ 00ae9410
00ae9410	stp x28,x27,[sp, #-0x60]!
00ae9414	stp x26,x25,[sp, #0x10]
00ae9418	stp x24,x23,[sp, #0x20]
00ae941c	stp x22,x21,[sp, #0x30]
00ae9420	stp x20,x19,[sp, #0x40]
00ae9424	stp x29,x30,[sp, #0x50]
00ae9428	add x29,sp,#0x50
00ae942c	sub sp,sp,#0x1f0
00ae9430	mov x28,x0
00ae9434	adrp x8,0x2d7000
00ae9438	mov x25,x2
00ae943c	mov x27,x1
00ae9440	add x8,x8,#0x4d1
00ae9444	add x0,sp,#0xb8
00ae9448	mov w2,#0x100
00ae944c	mov x1,x28
00ae9450	mov x20,x7
00ae9454	mov x21,x6
00ae9458	stp x5,x4,[sp, #0x18]
00ae945c	str x3,[sp, #0x28]
00ae9460	str x8,[sp, #0xa8]
00ae9464	bl 0x00c387f0
00ae9468	add x0,sp,#0xb8
00ae946c	mov w1,#0x3a
00ae9470	bl 0x00c30890
00ae9474	stp x21,x20,[sp]
00ae9478	cbz x0,0x00ae94cc
00ae947c	adrp x1,0x2d7000
00ae9480	mov x19,x0
00ae9484	strb wzr,[x0]
00ae9488	add x1,x1,#0x4d1
00ae948c	add x0,sp,#0xb8
00ae9490	add x20,sp,#0xb8
00ae9494	bl 0x00c35ee0
00ae9498	cbz w0,0x00ae94cc
00ae949c	adrp x1,0x2d7000
00ae94a0	add x0,x19,#0x1
00ae94a4	add x1,x1,#0x606
00ae94a8	mov w2,#0x2
00ae94ac	bl 0x00c31bb0
00ae94b0	cmp w0,#0x0
00ae94b4	mov w8,#0x1
00ae94b8	cset w9,ne
00ae94bc	cinc x21,x8,ne
00ae94c0	add x8,sp,#0xa8
00ae94c4	str x20,[x8, w9, UXTW #0x3]
00ae94c8	b 0x00ae94d0
00ae94cc	mov w21,#0x1
00ae94d0	bl 0x00c35250
00ae94d4	add x8,sp,#0x30
00ae94d8	mov x26,xzr
00ae94dc	mov x20,xzr
00ae94e0	mov w23,#0x1
00ae94e4	add x22,sp,#0xa8
00ae94e8	add x8,x8,#0x28
00ae94ec	str x8,[sp, #0x10]
00ae94f0	ldr x24,[x22, x26, LSL #0x3]
00ae94f4	mov x0,x24
00ae94f8	bl 0x00c40330
00ae94fc	cbz x0,0x00ae9528
00ae9500	ldr x8,[x0, #0x58]
00ae9504	mov x19,x0
00ae9508	cbz x8,0x00ae9600
00ae950c	ldp x5,x4,[sp, #0x20]
00ae9510	mov x0,x19
00ae9514	mov x1,x28
00ae9518	mov x2,x27
00ae951c	mov x3,x25
00ae9520	blr x8
00ae9524	b 0x00ae9614
00ae9528	mov x0,x27
00ae952c	mov x1,x24
00ae9530	mov x2,x25
00ae9534	bl 0x00c402c0
00ae9538	mov x20,x0
00ae953c	cbz x0,0x00ae9630
00ae9540	mov x0,x20
00ae9544	bl 0x00c402e0
00ae9548	bl 0x00c3b430
00ae954c	ldr x8,[x20, #0x90]
00ae9550	mov x1,x28
00ae9554	blr x8
00ae9558	mov x24,x0
00ae955c	cbz x0,0x00ae964c
00ae9560	ldr x19,[sp, #0x18]
00ae9564	cbz x19,0x00ae957c
00ae9568	ldr x8,[x20, #0xa8]
00ae956c	mov x0,x24
00ae9570	mov x1,x19
00ae9574	blr x8
00ae9578	cbz w0,0x00ae9640
00ae957c	cbz x25,0x00ae95f0
00ae9580	mov x0,x19
00ae9584	adrp x19,0x2d3000
00ae9588	add x19,x19,#0x7c2
00ae958c	mov x1,x19
00ae9590	bl 0x00c36530
00ae9594	cbnz x0,0x00ae95f0
00ae9598	sub x8,x29,#0x88
00ae959c	mov x0,x19
00ae95a0	mov x1,x25
00ae95a4	mov x2,xzr
00ae95a8	bl 0x00c36280
00ae95ac	ldur x8,[x29, #-0x68]
00ae95b0	sub x19,x29,#0x88
00ae95b4	ldp q1,q0,[x19]
00ae95b8	str x8,[sp, #0x50]
00ae95bc	sub x8,x29,#0x88
00ae95c0	stp q1,q0,[sp, #0x30]
00ae95c4	bl 0x00c34c40
00ae95c8	ldur x8,[x29, #-0x68]
00ae95cc	ldp q1,q0,[x19]
00ae95d0	ldr x9,[sp, #0x10]
00ae95d4	add x1,sp,#0x30
00ae95d8	mov x0,x24
00ae95dc	str x8,[x9, #0x20]
00ae95e0	stp q1,q0,[x9]
00ae95e4	ldr x8,[x20, #0xa8]
00ae95e8	blr x8
00ae95ec	cbz w0,0x00ae9640
00ae95f0	mov w23,wzr
00ae95f4	mov x19,x20
00ae95f8	cbz x24,0x00ae9620
00ae95fc	b 0x00ae9664
00ae9600	ldr x8,[x19, #0x10]
00ae9604	ldp x3,x2,[sp, #0x20]
00ae9608	mov x0,x19
00ae960c	mov x1,x28
00ae9610	blr x8
00ae9614	mov x24,x0
00ae9618	mov w23,wzr
00ae961c	cbnz x24,0x00ae9664
00ae9620	add x26,x26,#0x1
00ae9624	cmp x26,x21
00ae9628	b.cc 0x00ae94f0
00ae962c	b 0x00ae9664
00ae9630	mov x24,xzr
00ae9634	mov x19,xzr
00ae9638	cbz x24,0x00ae9620
00ae963c	b 0x00ae9664
00ae9640	ldr x8,[x20, #0xc0]
00ae9644	mov x0,x24
00ae9648	blr x8
00ae964c	mov x0,x20
00ae9650	bl 0x00c402d0
00ae9654	mov x20,xzr
00ae9658	mov w23,wzr
00ae965c	mov x19,xzr
00ae9660	cbz x24,0x00ae9620
00ae9664	cbz x24,0x00ae9698
00ae9668	mov x26,xzr
00ae966c	mov x21,xzr
00ae9670	cbnz w23,0x00ae96a0
00ae9674	cbz x25,0x00ae96ac
00ae9678	adrp x1,0x2c2000
00ae967c	add x1,x1,#0x3bd
00ae9680	mov w2,#0xa6
00ae9684	mov x0,x25
00ae9688	bl 0x00c34600
00ae968c	mov x21,x0
00ae9690	cbnz x0,0x00ae96b0
00ae9694	b 0x00ae9714
00ae9698	mov x26,xzr
00ae969c	mov x21,xzr
00ae96a0	bl 0x00c35ed0
00ae96a4	cbnz x24,0x00ae978c
00ae96a8	b 0x00ae9810
00ae96ac	mov x21,xzr
00ae96b0	adrp x1,0x2c2000
00ae96b4	add x1,x1,#0x3bd
00ae96b8	orr w0,wzr,#0x78
00ae96bc	mov w2,#0xa7
00ae96c0	bl 0x00c34250
00ae96c4	cbz x0,0x00ae9714
00ae96c8	ldr x1,[sp, #0x28]
00ae96cc	mov x26,x0
00ae96d0	cbz x1,0x00ae96f4
00ae96d4	ldr x2,[sp, #0x20]
00ae96d8	add x25,x26,#0x48
00ae96dc	mov x0,x25
00ae96e0	bl 0x00c3b7a0
00ae96e4	cbz w0,0x00ae9754
00ae96e8	mov x0,x25
00ae96ec	bl 0x00c3b4b0
00ae96f0	cbz w0,0x00ae9754
00ae96f4	stp x19,x20,[x26]
00ae96f8	ldr x8,[sp]
00ae96fc	str x21,[x26, #0x30]
00ae9700	stp x24,x8,[x26, #0x10]
00ae9704	ldr x8,[sp, #0x8]
00ae9708	str x8,[x26, #0x20]
00ae970c	bl 0x00c35240
00ae9710	b 0x00ae9844
00ae9714	bl 0x00c342a0
00ae9718	adrp x0,0x2c2000
00ae971c	adrp x2,0x2d2000
00ae9720	add x0,x0,#0x3bd
00ae9724	add x2,x2,#0x320
00ae9728	mov w1,#0xa8
00ae972c	bl 0x00c342b0
00ae9730	mov w1,#0x100
00ae9734	mov w0,#0x2c
00ae9738	movk w1,#0xc, LSL #16
00ae973c	mov x2,xzr
00ae9740	bl 0x00c342c0
00ae9744	mov x26,xzr
00ae9748	bl 0x00c35ed0
00ae974c	cbnz x24,0x00ae978c
00ae9750	b 0x00ae9810
00ae9754	bl 0x00c342a0
00ae9758	adrp x0,0x2c2000
00ae975c	adrp x2,0x2d2000
00ae9760	add x0,x0,#0x3bd
00ae9764	add x2,x2,#0x320
00ae9768	mov w1,#0xaf
00ae976c	bl 0x00c342b0
00ae9770	mov w1,#0xf
00ae9774	mov w0,#0x2c
00ae9778	movk w1,#0x8, LSL #16
00ae977c	mov x2,xzr
00ae9780	bl 0x00c342c0
00ae9784	bl 0x00c35ed0
00ae9788	cbz x24,0x00ae9810
00ae978c	add x8,sp,#0x30
00ae9790	add x0,x8,#0x18
00ae9794	orr w2,wzr,#0x60
00ae9798	mov w1,wzr
00ae979c	bl 0x00c301c0
00ae97a0	stp x19,x20,[sp, #0x30]
00ae97a4	str x24,[sp, #0x40]
00ae97a8	cbz x20,0x00ae97c8
00ae97ac	ldr x8,[x19, #0xc0]
00ae97b0	mov x0,x24
00ae97b4	blr x8
00ae97b8	ldr x19,[sp, #0x38]
00ae97bc	cbnz x19,0x00ae97d8
00ae97c0	ldr x19,[sp, #0x30]
00ae97c4	ldr x24,[sp, #0x40]
00ae97c8	ldr x8,[x19, #0x50]
00ae97cc	mov x0,x24
00ae97d0	blr x8
00ae97d4	ldr x19,[sp, #0x38]
00ae97d8	adrp x1,0xcb5000
00ae97dc	ldr x0,[sp, #0x70]
00ae97e0	ldr x1,[x1, #0x168]
00ae97e4	bl 0x00c32600
00ae97e8	mov x0,x19
00ae97ec	bl 0x00c402d0
00ae97f0	ldr x0,[sp, #0x60]
00ae97f4	adrp x1,0x2c2000
00ae97f8	add x1,x1,#0x3bd
00ae97fc	mov w2,#0x20a
00ae9800	bl 0x00c32310
00ae9804	add x8,sp,#0x30
00ae9808	add x0,x8,#0x48
00ae980c	bl 0x00c3b6b0
00ae9810	mov x0,x20
00ae9814	bl 0x00c402d0
00ae9818	adrp x19,0x2c2000
00ae981c	add x19,x19,#0x3bd
00ae9820	mov w2,#0xd7
00ae9824	mov x0,x21
00ae9828	mov x1,x19
00ae982c	bl 0x00c32310
00ae9830	mov w2,#0xd8
00ae9834	mov x0,x26
00ae9838	mov x1,x19
00ae983c	bl 0x00c32310
00ae9840	mov x26,xzr
00ae9844	mov x0,x26
00ae9848	add sp,sp,#0x1f0
00ae984c	ldp x29,x30,[sp, #0x50]
00ae9850	ldp x20,x19,[sp, #0x40]
00ae9854	ldp x22,x21,[sp, #0x30]
00ae9858	ldp x24,x23,[sp, #0x20]
00ae985c	ldp x26,x25,[sp, #0x10]
00ae9860	ldp x28,x27,[sp], #0x60
00ae9864	ret
