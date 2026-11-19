; FUN_00a54484 @ 00a54484
00a54484	sub sp,sp,#0x70
00a54488	stp x28,x27,[sp, #0x10]
00a5448c	stp x26,x25,[sp, #0x20]
00a54490	stp x24,x23,[sp, #0x30]
00a54494	stp x22,x21,[sp, #0x40]
00a54498	stp x20,x19,[sp, #0x50]
00a5449c	stp x29,x30,[sp, #0x60]
00a544a0	add x29,sp,#0x60
00a544a4	mov x19,x5
00a544a8	mov x20,x4
00a544ac	mov x22,x3
00a544b0	mov x23,x2
00a544b4	mov x24,x1
00a544b8	mov w25,w0
00a544bc	bl 0x00a54260
00a544c0	cbz x0,0x00a54650
00a544c4	ldr w10,[x0, #0x384]
00a544c8	ldr w8,[x0, #0x380]
00a544cc	mov x21,x0
00a544d0	mov x0,xzr
00a544d4	cmp w10,w8
00a544d8	b.eq 0x00a54650
00a544dc	adrp x26,0x2d3000
00a544e0	mov w27,#0xffffffff
00a544e4	add x26,x26,#0xaa2
00a544e8	orr w28,wzr,#0xf
00a544ec	str x19,[sp, #0x8]
00a544f0	sbfiz x9,x8,#0x2,#0x20
00a544f4	ldrb w11,[x21, x9]
00a544f8	sxtw x9,w8
00a544fc	tbnz w11,#0x1,0x00a54550
00a54500	add w8,w10,#0x1
00a54504	add w11,w10,#0x10
00a54508	cmp w8,#0x0
00a5450c	csinc w10,w11,w10,lt
00a54510	and w10,w10,#0xfffffff0
00a54514	sub w10,w8,w10
00a54518	sbfiz x8,x10,#0x2,#0x20
00a5451c	ldrb w11,[x21, x8]
00a54520	sxtw x8,w10
00a54524	tbz w11,#0x1,0x00a54670
00a54528	str w10,[x21, #0x384]
00a5452c	add x9,x21,x8, LSL #0x2
00a54530	ldrb w10,[x9, #0x200]
00a54534	add x11,x21,x8, LSL #0x3
00a54538	add x12,x11,#0x100
00a5453c	tbnz w10,#0x0,0x00a545e4
00a54540	mov w10,wzr
00a54544	str xzr,[x12]
00a54548	str xzr,[x11, #0x180]
00a5454c	b 0x00a545f4
00a54550	add x8,x21,x9, LSL #0x2
00a54554	ldrb w10,[x8, #0x200]
00a54558	add x11,x21,x9, LSL #0x3
00a5455c	add x12,x11,#0x100
00a54560	tbnz w10,#0x0,0x00a54574
00a54564	mov w10,wzr
00a54568	str xzr,[x12]
00a5456c	str xzr,[x11, #0x180]
00a54570	b 0x00a54584
00a54574	ldr x10,[x12]
00a54578	cbz x10,0x00a5458c
00a5457c	strb wzr,[x10]
00a54580	mov w10,#0x1
00a54584	add x8,x8,#0x200
00a54588	str w10,[x8]
00a5458c	add x8,x21,x9, LSL #0x2
00a54590	add x19,x21,x9, LSL #0x3
00a54594	str wzr,[x8, #0x40]
00a54598	str wzr,[x8]
00a5459c	str xzr,[x19, #0x80]
00a545a0	str w27,[x8, #0x2c0]
00a545a4	ldr x0,[x19, #0x240]
00a545a8	mov w2,#0x56
00a545ac	mov x1,x26
00a545b0	bl 0x00c32310
00a545b4	ldr x0,[x19, #0x300]
00a545b8	mov w2,#0x58
00a545bc	mov x1,x26
00a545c0	str xzr,[x19, #0x240]
00a545c4	bl 0x00c32310
00a545c8	str xzr,[x19, #0x300]
00a545cc	ldr w8,[x21, #0x380]
00a545d0	sub w9,w8,#0x1
00a545d4	cmp w8,#0x0
00a545d8	csel w8,w9,w28,gt
00a545dc	str w8,[x21, #0x380]
00a545e0	b 0x00a54640
00a545e4	ldr x10,[x12]
00a545e8	cbz x10,0x00a545fc
00a545ec	strb wzr,[x10]
00a545f0	mov w10,#0x1
00a545f4	add x9,x9,#0x200
00a545f8	str w10,[x9]
00a545fc	add x9,x21,x8, LSL #0x2
00a54600	add x19,x21,x8, LSL #0x3
00a54604	str wzr,[x9, #0x40]
00a54608	str wzr,[x9]
00a5460c	str xzr,[x19, #0x80]
00a54610	str w27,[x9, #0x2c0]
00a54614	ldr x0,[x19, #0x240]
00a54618	mov w2,#0x56
00a5461c	mov x1,x26
00a54620	bl 0x00c32310
00a54624	ldr x0,[x19, #0x300]
00a54628	mov w2,#0x58
00a5462c	mov x1,x26
00a54630	str xzr,[x19, #0x240]
00a54634	bl 0x00c32310
00a54638	str xzr,[x19, #0x300]
00a5463c	ldr w8,[x21, #0x380]
00a54640	ldr w10,[x21, #0x384]
00a54644	cmp w10,w8
00a54648	b.ne 0x00a544f0
00a5464c	mov x0,xzr
00a54650	ldp x29,x30,[sp, #0x60]
00a54654	ldp x20,x19,[sp, #0x50]
00a54658	ldp x22,x21,[sp, #0x40]
00a5465c	ldp x24,x23,[sp, #0x30]
00a54660	ldp x26,x25,[sp, #0x20]
00a54664	ldp x28,x27,[sp, #0x10]
00a54668	add sp,sp,#0x70
00a5466c	ret
00a54670	cmp w25,#0x2
00a54674	b.ne 0x00a54718
00a54678	add x8,x21,x9, LSL #0x3
00a5467c	ldr x0,[x8, #0x80]
00a54680	mov w10,wzr
00a54684	mov x8,x9
00a54688	ldr x12,[sp, #0x8]
00a5468c	cbz x24,0x00a546ac
00a54690	add x9,x21,x8, LSL #0x3
00a54694	ldr x9,[x9, #0x240]
00a54698	adrp x11,0x2ab000
00a5469c	add x11,x11,#0x32c
00a546a0	cmp x9,#0x0
00a546a4	csel x9,x11,x9,eq
00a546a8	str x9,[x24]
00a546ac	cbz x23,0x00a546bc
00a546b0	add x9,x21,x8, LSL #0x2
00a546b4	ldr w9,[x9, #0x2c0]
00a546b8	str w9,[x23]
00a546bc	cbz x22,0x00a546dc
00a546c0	add x9,x21,x8, LSL #0x3
00a546c4	ldr x9,[x9, #0x300]
00a546c8	adrp x11,0x2ab000
00a546cc	add x11,x11,#0x32c
00a546d0	cmp x9,#0x0
00a546d4	csel x9,x11,x9,eq
00a546d8	str x9,[x22]
00a546dc	cbz x12,0x00a546ec
00a546e0	add x9,x21,x8, LSL #0x2
00a546e4	ldr w9,[x9, #0x200]
00a546e8	str w9,[x12]
00a546ec	cbz x20,0x00a54734
00a546f0	add x8,x21,x8, LSL #0x3
00a546f4	ldr x8,[x8, #0x100]
00a546f8	str x8,[x20]
00a546fc	cbnz x8,0x00a54650
00a54700	adrp x8,0x2ab000
00a54704	add x8,x8,#0x32c
00a54708	str x8,[x20]
00a5470c	cbz x12,0x00a54650
00a54710	str wzr,[x12]
00a54714	b 0x00a54650
00a54718	add x9,x21,x8, LSL #0x3
00a5471c	ldr x0,[x9, #0x80]!
00a54720	cbz w25,0x00a54760
00a54724	mov w10,wzr
00a54728	ldr x12,[sp, #0x8]
00a5472c	cbnz x24,0x00a54690
00a54730	b 0x00a546ac
00a54734	cbz w10,0x00a54650
00a54738	add x9,x21,x8, LSL #0x2
00a5473c	ldrb w11,[x9, #0x200]
00a54740	add x8,x21,x8, LSL #0x3
00a54744	add x9,x9,#0x200
00a54748	add x10,x8,#0x100
00a5474c	tbnz w11,#0x0,0x00a54778
00a54750	str xzr,[x10]
00a54754	str xzr,[x8, #0x180]
00a54758	str wzr,[x9]
00a5475c	b 0x00a54650
00a54760	str w10,[x21, #0x384]
00a54764	mov w10,#0x1
00a54768	str xzr,[x9]
00a5476c	ldr x12,[sp, #0x8]
00a54770	cbnz x24,0x00a54690
00a54774	b 0x00a546ac
00a54778	ldr x8,[x10]
00a5477c	cbz x8,0x00a54650
00a54780	strb wzr,[x8]
00a54784	mov w8,#0x1
00a54788	str w8,[x9]
00a5478c	b 0x00a54650
