; FUN_008b9568 @ 008b9568
008b9568	stp x29,x30,[sp, #-0x30]!
008b956c	stp x28,x21,[sp, #0x10]
008b9570	stp x20,x19,[sp, #0x20]
008b9574	mov x29,sp
008b9578	sub sp,sp,#0x300
008b957c	stp x2,x3,[sp, #0x80]
008b9580	add x10,sp,#0x80
008b9584	mov x11,sp
008b9588	stp x4,x5,[sp, #0x90]
008b958c	mov x8,x1
008b9590	mov x19,x0
008b9594	stp x6,x7,[sp, #0xa0]
008b9598	add x0,sp,#0xf8
008b959c	add x3,sp,#0xd0
008b95a0	stp q0,q1,[sp]
008b95a4	mov w1,#0x200
008b95a8	mov x2,x8
008b95ac	stp q2,q3,[sp, #0x20]
008b95b0	stp q4,q5,[sp, #0x40]
008b95b4	stp q6,q7,[sp, #0x60]
008b95b8	mrs x20,tpidr_el0
008b95bc	ldr x9,[x20, #0x28]
008b95c0	stur x9,[x29, #-0x8]
008b95c4	add x9,x10,#0x30
008b95c8	add x10,x29,#0x30
008b95cc	stp x10,x9,[sp, #0xb0]
008b95d0	mov x9,#-0x30
008b95d4	add x10,x11,#0x80
008b95d8	movk x9,#0xff80, LSL #32
008b95dc	stp x10,x9,[sp, #0xc0]
008b95e0	ldp q0,q1,[sp, #0xb0]
008b95e4	stp q0,q1,[sp, #0xd0]
008b95e8	bl 0x00c30740
008b95ec	ldr x21,[x19, #0x68]
008b95f0	add x0,sp,#0xf8
008b95f4	mov w1,#0x200
008b95f8	bl 0x00c30370
008b95fc	mov x2,x0
008b9600	add x1,sp,#0xf8
008b9604	mov x0,x19
008b9608	bl 0x008b9ff8
008b960c	str x0,[x21]
008b9610	mov w9,#0x5
008b9614	ldr x10,[x19, #0x48]
008b9618	ldr x8,[x19, #0x68]
008b961c	str w9,[x21, #0xc]
008b9620	sub x10,x10,x8
008b9624	cmp x10,#0x10
008b9628	b.gt 0x008b963c
008b962c	mov x0,x19
008b9630	mov w1,#0x1
008b9634	bl 0x008b41e4
008b9638	ldr x8,[x19, #0x68]
008b963c	add x9,x8,#0x10
008b9640	str x9,[x19, #0x68]
008b9644	ldr x8,[x8]
008b9648	ldr x9,[x20, #0x28]
008b964c	ldur x10,[x29, #-0x8]
008b9650	cmp x9,x10
008b9654	b.ne 0x008b9670
008b9658	add x0,x8,#0x18
008b965c	add sp,sp,#0x300
008b9660	ldp x20,x19,[sp, #0x20]
008b9664	ldp x28,x21,[sp, #0x10]
008b9668	ldp x29,x30,[sp], #0x30
008b966c	ret
008b9670	bl 0x00c2fec0
