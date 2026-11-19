; std::__ndk1::operator+ @ 0098c6b8
0098c6b8	stp x24,x23,[sp, #-0x40]!
0098c6bc	stp x22,x21,[sp, #0x10]
0098c6c0	stp x20,x19,[sp, #0x20]
0098c6c4	stp x29,x30,[sp, #0x30]
0098c6c8	add x29,sp,#0x30
0098c6cc	stp xzr,xzr,[x8]
0098c6d0	str xzr,[x8, #0x10]
0098c6d4	ldrb w24,[x1]
0098c6d8	mov x19,x8
0098c6dc	ldr x8,[x1, #0x8]
0098c6e0	mov x20,x1
0098c6e4	lsr w9,w24,#0x1
0098c6e8	tst w24,#0x1
0098c6ec	csel x21,x9,x8,eq
0098c6f0	add x8,x21,#0x1
0098c6f4	cmn x8,#0x10
0098c6f8	mov w22,w0
0098c6fc	b.cs 0x0098c76c
0098c700	cmp x8,#0x16
0098c704	b.hi 0x0098c718
0098c708	mov w8,#0x2
0098c70c	mov x0,x19
0098c710	strb w8,[x0], #0x1
0098c714	b 0x0098c738
0098c718	add x8,x21,#0x11
0098c71c	and x23,x8,#-0x10
0098c720	mov x0,x23
0098c724	bl 0x00c2fed0
0098c728	orr x8,x23,#0x1
0098c72c	mov w9,#0x1
0098c730	str x8,[x19]
0098c734	stp x9,x0,[x19, #0x8]
0098c738	strb w22,[x0]
0098c73c	strb wzr,[x0, #0x1]
0098c740	ldr x8,[x20, #0x10]
0098c744	tst w24,#0x1
0098c748	csinc x1,x8,x20,ne
0098c74c	mov x0,x19
0098c750	mov x2,x21
0098c754	bl 0x00c308c0
0098c758	ldp x29,x30,[sp, #0x30]
0098c75c	ldp x20,x19,[sp, #0x20]
0098c760	ldp x22,x21,[sp, #0x10]
0098c764	ldp x24,x23,[sp], #0x40
0098c768	ret
0098c76c	mov x0,x19
0098c770	bl 0x00c30ce0
