; ix::WebSocket::setOnMessageCallback @ 0098f6bc
0098f6bc	sub sp,sp,#0x70
0098f6c0	str x21,[sp, #0x40]
0098f6c4	stp x20,x19,[sp, #0x50]
0098f6c8	stp x29,x30,[sp, #0x60]
0098f6cc	add x29,sp,#0x60
0098f6d0	mrs x20,tpidr_el0
0098f6d4	ldr x8,[x20, #0x28]
0098f6d8	add x19,x0,#0x3d0
0098f6dc	stur x8,[x29, #-0x28]
0098f6e0	ldr x8,[x1, #0x20]
0098f6e4	cbz x8,0x0098f708
0098f6e8	cmp x1,x8
0098f6ec	b.eq 0x0098f710
0098f6f0	ldr x9,[x8]
0098f6f4	mov x0,x8
0098f6f8	ldr x9,[x9, #0x10]
0098f6fc	blr x9
0098f700	str x0,[sp, #0x20]
0098f704	b 0x0098f72c
0098f708	str xzr,[sp, #0x20]
0098f70c	b 0x0098f72c
0098f710	mov x9,sp
0098f714	str x9,[sp, #0x20]
0098f718	ldr x9,[x8]
0098f71c	mov x1,sp
0098f720	mov x0,x8
0098f724	ldr x9,[x9, #0x18]
0098f728	blr x9
0098f72c	mov x0,sp
0098f730	mov x1,x19
0098f734	mov x21,sp
0098f738	bl 0x00c339f0
0098f73c	ldr x0,[sp, #0x20]
0098f740	cmp x21,x0
0098f744	b.eq 0x0098f758
0098f748	cbz x0,0x0098f764
0098f74c	ldr x8,[x0]
0098f750	ldr x8,[x8, #0x28]
0098f754	b 0x0098f760
0098f758	ldr x8,[x0]
0098f75c	ldr x8,[x8, #0x20]
0098f760	blr x8
0098f764	ldr x8,[x20, #0x28]
0098f768	ldur x9,[x29, #-0x28]
0098f76c	cmp x8,x9
0098f770	b.ne 0x0098f788
0098f774	ldp x29,x30,[sp, #0x60]
0098f778	ldp x20,x19,[sp, #0x50]
0098f77c	ldr x21,[sp, #0x40]
0098f780	add sp,sp,#0x70
0098f784	ret
0098f788	bl 0x00c2fec0
