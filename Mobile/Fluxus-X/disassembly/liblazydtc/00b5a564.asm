; FUN_00b5a564 @ 00b5a564
00b5a564	sub sp,sp,#0x80
00b5a568	stp x28,x27,[sp, #0x20]
00b5a56c	stp x26,x25,[sp, #0x30]
00b5a570	stp x24,x23,[sp, #0x40]
00b5a574	stp x22,x21,[sp, #0x50]
00b5a578	stp x20,x19,[sp, #0x60]
00b5a57c	stp x29,x30,[sp, #0x70]
00b5a580	ldr x19,[x0, #0xf8]
00b5a584	ldr x21,[x0, #0xe8]
00b5a588	mvn w8,w2
00b5a58c	tst w8,#0xff
00b5a590	ldr x27,[x19, #0x18]
00b5a594	lsr x8,x21,#0x15
00b5a598	strb w8,[sp, #0x19]
00b5a59c	lsr x8,x21,#0xd
00b5a5a0	strb w8,[sp, #0x1a]
00b5a5a4	lsr x8,x21,#0x5
00b5a5a8	mov x22,x7
00b5a5ac	mov x24,x5
00b5a5b0	mov x25,x4
00b5a5b4	mov x26,x3
00b5a5b8	mov x20,x1
00b5a5bc	mov w9,#0x1
00b5a5c0	strb w8,[sp, #0x1b]
00b5a5c4	lsl w8,w21,#0x3
00b5a5c8	add x29,sp,#0x70
00b5a5cc	str x6,[sp, #0x10]
00b5a5d0	strb w9,[sp, #0x18]
00b5a5d4	strb w8,[sp, #0x1c]
00b5a5d8	b.eq 0x00b5a5e8
00b5a5dc	orr w28,wzr,#0x6
00b5a5e0	strb w2,[sp, #0x1d]
00b5a5e4	b 0x00b5a5ec
00b5a5e8	mov w28,#0x5
00b5a5ec	mov x0,x19
00b5a5f0	bl 0x00c41160
00b5a5f4	mov x1,x0
00b5a5f8	mov x0,x27
00b5a5fc	mov x2,xzr
00b5a600	bl 0x00c31f70
00b5a604	cbz w0,0x00b5a700
00b5a608	ldr x23,[x29, #0x10]
00b5a60c	add x8,x19,#0x106
00b5a610	str x8,[sp, #0x8]
00b5a614	add x1,sp,#0x18
00b5a618	mov x0,x27
00b5a61c	mov x2,x28
00b5a620	bl 0x00c31f80
00b5a624	cbz w0,0x00b5a700
00b5a628	mov x0,x27
00b5a62c	mov x1,x26
00b5a630	mov x2,x25
00b5a634	bl 0x00c31f80
00b5a638	cbz w0,0x00b5a700
00b5a63c	cbz x24,0x00b5a654
00b5a640	ldr x2,[sp, #0x10]
00b5a644	mov x0,x27
00b5a648	mov x1,x24
00b5a64c	bl 0x00c31f80
00b5a650	cbz w0,0x00b5a700
00b5a654	cbz x22,0x00b5a66c
00b5a658	mov x0,x27
00b5a65c	mov x1,x22
00b5a660	mov x2,x23
00b5a664	bl 0x00c31f80
00b5a668	cbz w0,0x00b5a700
00b5a66c	ldr x8,[x19, #0x20]
00b5a670	cmp x21,x8
00b5a674	b.cc 0x00b5a6c8
00b5a678	mov x0,x27
00b5a67c	mov x1,x20
00b5a680	mov x2,xzr
00b5a684	bl 0x00c3c150
00b5a688	cbz w0,0x00b5a700
00b5a68c	ldr x8,[x19, #0x20]
00b5a690	subs x21,x21,x8
00b5a694	b.eq 0x00b5a6fc
00b5a698	ldrb w9,[sp, #0x18]
00b5a69c	mov x0,x19
00b5a6a0	add x20,x20,x8
00b5a6a4	add w9,w9,#0x1
00b5a6a8	strb w9,[sp, #0x18]
00b5a6ac	bl 0x00c41160
00b5a6b0	mov x1,x0
00b5a6b4	mov x0,x27
00b5a6b8	mov x2,xzr
00b5a6bc	bl 0x00c31f70
00b5a6c0	cbnz w0,0x00b5a614
00b5a6c4	b 0x00b5a700
00b5a6c8	ldr x22,[sp, #0x8]
00b5a6cc	mov x0,x27
00b5a6d0	mov x2,xzr
00b5a6d4	mov x1,x22
00b5a6d8	bl 0x00c3c150
00b5a6dc	cbz w0,0x00b5a700
00b5a6e0	mov x0,x20
00b5a6e4	mov x1,x22
00b5a6e8	mov x2,x21
00b5a6ec	bl 0x00c2ffd0
00b5a6f0	ldr x1,[x19, #0x20]
00b5a6f4	mov x0,x22
00b5a6f8	bl 0x00c34750
00b5a6fc	mov w0,#0x1
00b5a700	ldp x29,x30,[sp, #0x70]
00b5a704	ldp x20,x19,[sp, #0x60]
00b5a708	ldp x22,x21,[sp, #0x50]
00b5a70c	ldp x24,x23,[sp, #0x40]
00b5a710	ldp x26,x25,[sp, #0x30]
00b5a714	ldp x28,x27,[sp, #0x20]
00b5a718	add sp,sp,#0x80
00b5a71c	ret
