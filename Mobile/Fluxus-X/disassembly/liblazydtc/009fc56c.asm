; BIO_puts @ 009fc56c
009fc56c	sub sp,sp,#0x30
009fc570	stp x20,x19,[sp, #0x10]
009fc574	stp x29,x30,[sp, #0x20]
009fc578	add x29,sp,#0x20
009fc57c	str xzr,[sp, #0x8]
009fc580	cbz x0,0x009fc5fc
009fc584	ldr x8,[x0, #0x8]
009fc588	mov x20,x0
009fc58c	cbz x8,0x009fc5c8
009fc590	ldr x8,[x8, #0x30]
009fc594	cbz x8,0x009fc5c8
009fc598	ldp x9,x8,[x20, #0x10]
009fc59c	mov x19,x1
009fc5a0	cbz x9,0x009fc644
009fc5a4	cbnz x8,0x009fc648
009fc5a8	mov w1,#0x4
009fc5ac	mov w5,#0x1
009fc5b0	mov x0,x20
009fc5b4	mov x2,x19
009fc5b8	mov w3,wzr
009fc5bc	mov x4,xzr
009fc5c0	blr x9
009fc5c4	b 0x009fc66c
009fc5c8	bl 0x00c342a0
009fc5cc	adrp x0,0x2b2000
009fc5d0	adrp x2,0x2af000
009fc5d4	add x0,x0,#0x42
009fc5d8	add x2,x2,#0xd1d
009fc5dc	mov w1,#0x19b
009fc5e0	bl 0x00c342b0
009fc5e4	mov w0,#0x20
009fc5e8	mov w1,#0x79
009fc5ec	mov x2,xzr
009fc5f0	bl 0x00c342c0
009fc5f4	orr w6,wzr,#0xfffffffe
009fc5f8	b 0x009fc630
009fc5fc	bl 0x00c342a0
009fc600	adrp x0,0x2b2000
009fc604	adrp x2,0x2af000
009fc608	add x0,x0,#0x42
009fc60c	add x2,x2,#0xd1d
009fc610	mov w1,#0x197
009fc614	bl 0x00c342b0
009fc618	mov w1,#0x102
009fc61c	mov w0,#0x20
009fc620	movk w1,#0xc, LSL #16
009fc624	mov x2,xzr
009fc628	bl 0x00c342c0
009fc62c	mov w6,#0xffffffff
009fc630	ldp x29,x30,[sp, #0x20]
009fc634	ldp x20,x19,[sp, #0x10]
009fc638	mov w0,w6
009fc63c	add sp,sp,#0x30
009fc640	ret
009fc644	cbz x8,0x009fc678
009fc648	mov w1,#0x4
009fc64c	mov w6,#0x1
009fc650	mov x0,x20
009fc654	mov x2,x19
009fc658	mov x3,xzr
009fc65c	mov w4,wzr
009fc660	mov x5,xzr
009fc664	mov x7,xzr
009fc668	blr x8
009fc66c	mov x6,x0
009fc670	cmp w6,#0x1
009fc674	b.lt 0x009fc630
009fc678	ldr w8,[x20, #0x28]
009fc67c	cbz w8,0x009fc708
009fc680	ldr x8,[x20, #0x8]
009fc684	mov x0,x20
009fc688	mov x1,x19
009fc68c	ldr x8,[x8, #0x30]
009fc690	blr x8
009fc694	mov w6,w0
009fc698	cmp w0,#0x1
009fc69c	b.lt 0x009fc730
009fc6a0	ldr x9,[x20, #0x68]
009fc6a4	sxtw x8,w6
009fc6a8	mov w6,#0x1
009fc6ac	add x9,x9,x8
009fc6b0	str x9,[x20, #0x68]
009fc6b4	str x8,[sp, #0x8]
009fc6b8	ldp x10,x9,[x20, #0x10]
009fc6bc	cbz x10,0x009fc73c
009fc6c0	cbnz x9,0x009fc740
009fc6c4	sxtw x9,w6
009fc6c8	cmp w6,#0x0
009fc6cc	csel x5,x8,x9,gt
009fc6d0	mov w1,#0x84
009fc6d4	mov x0,x20
009fc6d8	mov x2,x19
009fc6dc	mov w3,wzr
009fc6e0	mov x4,xzr
009fc6e4	blr x10
009fc6e8	mov x6,x0
009fc6ec	cmp x0,#0x1
009fc6f0	b.lt 0x009fc764
009fc6f4	str x6,[sp, #0x8]
009fc6f8	mov w6,#0x1
009fc6fc	cmp w6,#0x1
009fc700	b.ge 0x009fc76c
009fc704	b 0x009fc630
009fc708	bl 0x00c342a0
009fc70c	adrp x0,0x2b2000
009fc710	adrp x2,0x2af000
009fc714	add x0,x0,#0x42
009fc718	add x2,x2,#0xd1d
009fc71c	mov w1,#0x1a6
009fc720	bl 0x00c342b0
009fc724	mov w0,#0x20
009fc728	orr w1,wzr,#0x78
009fc72c	b 0x009fc624
009fc730	mov x8,xzr
009fc734	ldp x10,x9,[x20, #0x10]
009fc738	cbnz x10,0x009fc6c0
009fc73c	cbz x9,0x009fc764
009fc740	mov w1,#0x84
009fc744	add x7,sp,#0x8
009fc748	mov x0,x20
009fc74c	mov x2,x19
009fc750	mov x3,xzr
009fc754	mov w4,wzr
009fc758	mov x5,xzr
009fc75c	blr x9
009fc760	mov x6,x0
009fc764	cmp w6,#0x1
009fc768	b.lt 0x009fc630
009fc76c	ldr x6,[sp, #0x8]
009fc770	lsr x8,x6,#0x1f
009fc774	cbz x8,0x009fc630
009fc778	bl 0x00c342a0
009fc77c	adrp x0,0x2b2000
009fc780	adrp x2,0x2af000
009fc784	add x0,x0,#0x42
009fc788	add x2,x2,#0xd1d
009fc78c	mov w1,#0x1b8
009fc790	bl 0x00c342b0
009fc794	mov w0,#0x20
009fc798	mov w1,#0x66
009fc79c	b 0x009fc624
