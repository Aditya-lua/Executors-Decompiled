; FUN_00af94bc @ 00af94bc
00af94bc	stp x26,x25,[sp, #-0x50]!
00af94c0	stp x24,x23,[sp, #0x10]
00af94c4	stp x22,x21,[sp, #0x20]
00af94c8	stp x20,x19,[sp, #0x30]
00af94cc	stp x29,x30,[sp, #0x40]
00af94d0	add x29,sp,#0x40
00af94d4	cbz x0,0x00af9630
00af94d8	ldr w8,[x0]
00af94dc	mov x21,x0
00af94e0	cbz w8,0x00af9630
00af94e4	cmp w8,#0x1
00af94e8	b.ne 0x00af9638
00af94ec	ldr x0,[x21, #0x8]
00af94f0	bl 0x00c325e0
00af94f4	cbz w0,0x00af9638
00af94f8	mov x19,xzr
00af94fc	mov x20,xzr
00af9500	mov w22,#0x1
00af9504	ldr x0,[x21, #0x8]
00af9508	sub w23,w22,#0x1
00af950c	bl 0x00c325e0
00af9510	mov w8,w0
00af9514	ldr x0,[x21, #0x8]
00af9518	sub w8,w8,#0x1
00af951c	cmp w23,w8
00af9520	b.ge 0x00af965c
00af9524	mov w1,w23
00af9528	bl 0x00c32610
00af952c	ldr x8,[x21, #0x8]
00af9530	mov x23,x0
00af9534	mov w1,w22
00af9538	mov x0,x8
00af953c	bl 0x00c32610
00af9540	cbz x23,0x00af96c8
00af9544	ldr w8,[x23]
00af9548	cmp w8,#0x1
00af954c	b.eq 0x00af9564
00af9550	cbnz w8,0x00af96c8
00af9554	ldr x25,[x23, #0x8]
00af9558	mov x24,x25
00af955c	cbnz x0,0x00af9570
00af9560	b 0x00af96c8
00af9564	ldr x8,[x23, #0x8]
00af9568	ldp x25,x24,[x8]
00af956c	cbz x0,0x00af96c8
00af9570	ldr w8,[x0]
00af9574	cmp w8,#0x1
00af9578	b.eq 0x00af958c
00af957c	cbnz w8,0x00af96c8
00af9580	ldr x23,[x0, #0x8]
00af9584	mov x26,x23
00af9588	b 0x00af9594
00af958c	ldr x8,[x0, #0x8]
00af9590	ldp x23,x26,[x8]
00af9594	mov x0,x25
00af9598	mov x1,x23
00af959c	bl 0x00c37560
00af95a0	tbz w0,#0x1f,0x00af96c8
00af95a4	mov x0,x25
00af95a8	mov x1,x24
00af95ac	bl 0x00c37560
00af95b0	cmp w0,#0x0
00af95b4	b.gt 0x00af96c8
00af95b8	mov x0,x23
00af95bc	mov x1,x26
00af95c0	bl 0x00c37560
00af95c4	cmp w0,#0x0
00af95c8	b.gt 0x00af96c8
00af95cc	cbnz x19,0x00af95dc
00af95d0	bl 0x00c37710
00af95d4	mov x19,x0
00af95d8	cbz x0,0x00af9640
00af95dc	mov x0,x24
00af95e0	mov x1,x19
00af95e4	bl 0x00c375e0
00af95e8	cbz x0,0x00af9640
00af95ec	mov w1,#0x1
00af95f0	mov x0,x19
00af95f4	bl 0x00c376e0
00af95f8	cbz w0,0x00af9640
00af95fc	mov x0,x19
00af9600	mov x1,x20
00af9604	bl 0x00c375f0
00af9608	cbz x0,0x00af9698
00af960c	mov x1,x23
00af9610	mov x24,x0
00af9614	bl 0x00c37560
00af9618	add w22,w22,#0x1
00af961c	mov x20,x24
00af9620	tbnz w0,#0x1f,0x00af9504
00af9624	mov w21,wzr
00af9628	mov x20,x24
00af962c	b 0x00af96cc
00af9630	mov w21,#0x1
00af9634	b 0x00af96dc
00af9638	mov w21,wzr
00af963c	b 0x00af96dc
00af9640	bl 0x00c342a0
00af9644	adrp x0,0x2c2000
00af9648	adrp x2,0x2c0000
00af964c	add x0,x0,#0x4d4
00af9650	add x2,x2,#0x604
00af9654	mov w1,#0x139
00af9658	b 0x00af96b0
00af965c	bl 0x00c325e0
00af9660	ldr x8,[x21, #0x8]
00af9664	sub w1,w0,#0x1
00af9668	mov x0,x8
00af966c	bl 0x00c32610
00af9670	cbz x0,0x00af96f8
00af9674	ldr w8,[x0]
00af9678	cmp w8,#0x1
00af967c	b.ne 0x00af96f8
00af9680	ldr x8,[x0, #0x8]
00af9684	ldp x0,x1,[x8]
00af9688	bl 0x00c37560
00af968c	cmp w0,#0x1
00af9690	cset w21,lt
00af9694	b 0x00af96cc
00af9698	bl 0x00c342a0
00af969c	adrp x0,0x2c2000
00af96a0	adrp x2,0x2c0000
00af96a4	add x0,x0,#0x4d4
00af96a8	add x2,x2,#0x604
00af96ac	mov w1,#0x140
00af96b0	bl 0x00c342b0
00af96b4	mov w1,#0x100
00af96b8	mov w0,#0x22
00af96bc	movk w1,#0xc, LSL #16
00af96c0	mov x2,xzr
00af96c4	bl 0x00c342c0
00af96c8	mov w21,wzr
00af96cc	mov x0,x20
00af96d0	bl 0x00c37c30
00af96d4	mov x0,x19
00af96d8	bl 0x00c36290
00af96dc	mov w0,w21
00af96e0	ldp x29,x30,[sp, #0x40]
00af96e4	ldp x20,x19,[sp, #0x30]
00af96e8	ldp x22,x21,[sp, #0x20]
00af96ec	ldp x24,x23,[sp, #0x10]
00af96f0	ldp x26,x25,[sp], #0x50
00af96f4	ret
00af96f8	mov w21,#0x1
00af96fc	b 0x00af96cc
