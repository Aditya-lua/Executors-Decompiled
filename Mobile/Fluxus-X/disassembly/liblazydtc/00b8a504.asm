; psa_verify_hash_start @ 00b8a504
00b8a504	sub sp,sp,#0x60
00b8a508	stp x26,x25,[sp, #0x10]
00b8a50c	stp x24,x23,[sp, #0x20]
00b8a510	stp x22,x21,[sp, #0x30]
00b8a514	stp x20,x19,[sp, #0x40]
00b8a518	stp x29,x30,[sp, #0x50]
00b8a51c	add x29,sp,#0x50
00b8a520	mrs x26,tpidr_el0
00b8a524	ldr x8,[x26, #0x28]
00b8a528	mov x22,x6
00b8a52c	mov x23,x5
00b8a530	mov x24,x4
00b8a534	str x8,[sp, #0x8]
00b8a538	ldr w8,[x0]
00b8a53c	mov x25,x3
00b8a540	mov w3,w2
00b8a544	mov x19,x0
00b8a548	mov w0,w1
00b8a54c	cbnz w8,0x00b8a584
00b8a550	ldrb w8,[x19, #0x8]
00b8a554	tbnz w8,#0x0,0x00b8a584
00b8a558	mov w10,#0x8ff
00b8a55c	and w9,w3,#0xffffff00
00b8a560	movk w10,#0x600, LSL #16
00b8a564	cmp w9,w10
00b8a568	b.gt 0x00b8a5b8
00b8a56c	mov w10,#0x200
00b8a570	movk w10,#0x600, LSL #16
00b8a574	cmp w9,w10
00b8a578	b.eq 0x00b8a5ec
00b8a57c	mov w10,#0x300
00b8a580	b 0x00b8a5cc
00b8a584	mov w21,#0xffffff77
00b8a588	ldr x8,[x26, #0x28]
00b8a58c	ldr x9,[sp, #0x8]
00b8a590	cmp x8,x9
00b8a594	b.ne 0x00b8a704
00b8a598	mov w0,w21
00b8a59c	ldp x29,x30,[sp, #0x50]
00b8a5a0	ldp x20,x19,[sp, #0x40]
00b8a5a4	ldp x22,x21,[sp, #0x30]
00b8a5a8	ldp x24,x23,[sp, #0x20]
00b8a5ac	ldp x26,x25,[sp, #0x10]
00b8a5b0	add sp,sp,#0x60
00b8a5b4	ret
00b8a5b8	mov w10,#0x900
00b8a5bc	movk w10,#0x600, LSL #16
00b8a5c0	cmp w9,w10
00b8a5c4	b.eq 0x00b8a5ec
00b8a5c8	mov w10,#0x1300
00b8a5cc	movk w10,#0x600, LSL #16
00b8a5d0	cmp w9,w10
00b8a5d4	b.eq 0x00b8a5ec
00b8a5d8	lsr w9,w3,#0x9
00b8a5dc	orr w9,w9,#0x1
00b8a5e0	orr w10,wzr,#0x30003
00b8a5e4	cmp w9,w10
00b8a5e8	b.ne 0x00b8a6f4
00b8a5ec	mov x1,sp
00b8a5f0	mov w2,#0x2000
00b8a5f4	bl 0x00b86e5c
00b8a5f8	mov w21,w0
00b8a5fc	cbz w0,0x00b8a610
00b8a600	ldrb w8,[x19, #0x8]
00b8a604	orr w8,w8,#0x1
00b8a608	strb w8,[x19, #0x8]
00b8a60c	b 0x00b8a588
00b8a610	cbz x24,0x00b8a664
00b8a614	mov w1,#0x1
00b8a618	mov x0,x24
00b8a61c	bl 0x00c30a30
00b8a620	mov x20,x0
00b8a624	cbz x0,0x00b8a6a8
00b8a628	mov x0,x20
00b8a62c	mov x1,x25
00b8a630	mov x2,x24
00b8a634	bl 0x00c2ffd0
00b8a638	cbz x22,0x00b8a66c
00b8a63c	mov w1,#0x1
00b8a640	mov x0,x22
00b8a644	bl 0x00c30a30
00b8a648	mov x24,x0
00b8a64c	cbz x0,0x00b8a6ac
00b8a650	mov x0,x24
00b8a654	mov x1,x23
00b8a658	mov x2,x22
00b8a65c	bl 0x00c2ffd0
00b8a660	b 0x00b8a670
00b8a664	mov x20,xzr
00b8a668	cbnz x22,0x00b8a63c
00b8a66c	mov x24,xzr
00b8a670	str wzr,[x19, #0xc]
00b8a674	ldr x8,[sp]
00b8a678	ldr w8,[x8, #0x4]
00b8a67c	cmp w8,#0xff
00b8a680	b.hi 0x00b8a6a0
00b8a684	ldrb w8,[x19, #0x8]
00b8a688	mov w9,#0x1
00b8a68c	str w9,[x19]
00b8a690	mov w21,#0xffffff7a
00b8a694	orr w8,w8,#0x1
00b8a698	strb w8,[x19, #0x8]
00b8a69c	b 0x00b8a6c4
00b8a6a0	mov w21,#0xffffff79
00b8a6a4	b 0x00b8a6b0
00b8a6a8	mov x24,xzr
00b8a6ac	mov w21,#0xffffff73
00b8a6b0	ldrb w8,[x19, #0x8]
00b8a6b4	ldr w9,[x19]
00b8a6b8	orr w8,w8,#0x1
00b8a6bc	strb w8,[x19, #0x8]
00b8a6c0	cbz w9,0x00b8a6c8
00b8a6c4	str wzr,[x19]
00b8a6c8	ldr x0,[sp]
00b8a6cc	bl 0x00c431e0
00b8a6d0	cbz w0,0x00b8a6e0
00b8a6d4	ldrb w8,[x19, #0x8]
00b8a6d8	orr w8,w8,#0x1
00b8a6dc	strb w8,[x19, #0x8]
00b8a6e0	mov x0,x20
00b8a6e4	bl 0x00c30960
00b8a6e8	mov x0,x24
00b8a6ec	bl 0x00c30960
00b8a6f0	b 0x00b8a588
00b8a6f4	orr w8,w8,#0x1
00b8a6f8	strb w8,[x19, #0x8]
00b8a6fc	mov w21,#0xffffff79
00b8a700	b 0x00b8a588
00b8a704	bl 0x00c2fec0
