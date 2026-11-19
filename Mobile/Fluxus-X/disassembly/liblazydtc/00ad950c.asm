; RSA_sign @ 00ad950c
00ad950c	sub sp,sp,#0x60
00ad9510	stp x25,xzr,[sp, #0x10]
00ad9514	stp x24,x23,[sp, #0x20]
00ad9518	stp x22,x21,[sp, #0x30]
00ad951c	stp x20,x19,[sp, #0x40]
00ad9520	stp x29,x30,[sp, #0x50]
00ad9524	str xzr,[sp, #0x8]
00ad9528	ldr x8,[x5, #0x18]
00ad952c	mov x22,x5
00ad9530	mov x21,x4
00ad9534	mov x23,x3
00ad9538	ldr x9,[x8, #0x58]
00ad953c	mov x24,x1
00ad9540	mov w8,w0
00ad9544	add x29,sp,#0x50
00ad9548	cbz x9,0x00ad9570
00ad954c	mov w0,w8
00ad9550	mov x1,x24
00ad9554	mov x3,x23
00ad9558	mov x4,x21
00ad955c	mov x5,x22
00ad9560	blr x9
00ad9564	cmp w0,#0x0
00ad9568	cset w21,gt
00ad956c	b 0x00ad9678
00ad9570	cmp w8,#0x72
00ad9574	b.ne 0x00ad9590
00ad9578	cmp w2,#0x24
00ad957c	b.ne 0x00ad9648
00ad9580	mov x19,xzr
00ad9584	mov w20,#0x24
00ad9588	str x20,[sp, #0x18]
00ad958c	b 0x00ad95b8
00ad9590	mov w4,w2
00ad9594	add x0,sp,#0x8
00ad9598	add x1,sp,#0x18
00ad959c	mov w2,w8
00ad95a0	mov x3,x24
00ad95a4	bl 0x00ad9698
00ad95a8	ldr x19,[sp, #0x8]
00ad95ac	ldr x20,[sp, #0x18]
00ad95b0	cbz w0,0x00ad9628
00ad95b4	mov x24,x19
00ad95b8	mov x0,x22
00ad95bc	add x25,x20,#0xb
00ad95c0	bl 0x00c3fab0
00ad95c4	cmp x25,w0, SXTW 
00ad95c8	b.ls 0x00ad95fc
00ad95cc	bl 0x00c342a0
00ad95d0	adrp x0,0x29e000
00ad95d4	adrp x2,0x2ce000
00ad95d8	add x0,x0,#0xa12
00ad95dc	add x2,x2,#0x35c
00ad95e0	mov w1,#0x132
00ad95e4	bl 0x00c342b0
00ad95e8	mov w0,#0x4
00ad95ec	orr w1,wzr,#0x70
00ad95f0	mov x2,xzr
00ad95f4	bl 0x00c342c0
00ad95f8	b 0x00ad9628
00ad95fc	mov w4,#0x1
00ad9600	mov w0,w20
00ad9604	mov x1,x24
00ad9608	mov x2,x23
00ad960c	mov x3,x22
00ad9610	bl 0x00c3fde0
00ad9614	cmp w0,#0x1
00ad9618	b.lt 0x00ad9628
00ad961c	str w0,[x21]
00ad9620	mov w21,#0x1
00ad9624	b 0x00ad962c
00ad9628	mov w21,wzr
00ad962c	adrp x2,0x29e000
00ad9630	add x2,x2,#0xa12
00ad9634	mov w3,#0x13e
00ad9638	mov x0,x19
00ad963c	mov x1,x20
00ad9640	bl 0x00c345e0
00ad9644	b 0x00ad9678
00ad9648	bl 0x00c342a0
00ad964c	adrp x0,0x29e000
00ad9650	adrp x2,0x2ce000
00ad9654	add x0,x0,#0xa12
00ad9658	add x2,x2,#0x35c
00ad965c	mov w1,#0x126
00ad9660	bl 0x00c342b0
00ad9664	mov w0,#0x4
00ad9668	mov w1,#0x83
00ad966c	mov x2,xzr
00ad9670	bl 0x00c342c0
00ad9674	mov w21,wzr
00ad9678	mov w0,w21
00ad967c	ldp x29,x30,[sp, #0x50]
00ad9680	ldp x20,x19,[sp, #0x40]
00ad9684	ldp x22,x21,[sp, #0x30]
00ad9688	ldp x24,x23,[sp, #0x20]
00ad968c	ldr x25,[sp, #0x10]
00ad9690	add sp,sp,#0x60
00ad9694	ret
