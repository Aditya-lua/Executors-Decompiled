; FUN_008ac684 @ 008ac684
008ac684	sub sp,sp,#0x140
008ac688	stp x29,x30,[sp, #0x100]
008ac68c	str x28,[sp, #0x110]
008ac690	stp x22,x21,[sp, #0x120]
008ac694	stp x20,x19,[sp, #0x130]
008ac698	add x29,sp,#0x100
008ac69c	stp x2,x3,[sp, #0x80]
008ac6a0	mov x19,x0
008ac6a4	mov x20,x1
008ac6a8	stp x4,x5,[sp, #0x90]
008ac6ac	stp x6,x7,[sp, #0xa0]
008ac6b0	stp q0,q1,[sp]
008ac6b4	stp q2,q3,[sp, #0x20]
008ac6b8	stp q4,q5,[sp, #0x40]
008ac6bc	stp q6,q7,[sp, #0x60]
008ac6c0	mrs x21,tpidr_el0
008ac6c4	ldr x8,[x21, #0x28]
008ac6c8	stur x8,[x29, #-0x8]
008ac6cc	ldr x8,[x0, #0x60]
008ac6d0	ldp x8,x9,[x8, #0x8]
008ac6d4	cmp x9,x8
008ac6d8	b.cc 0x008ac6e8
008ac6dc	mov x0,x19
008ac6e0	mov w1,#0x1
008ac6e4	bl 0x008b52c4
008ac6e8	ldrb w8,[x19, #0x2]
008ac6ec	sub x22,x29,#0x28
008ac6f0	tbz w8,#0x2,0x008ac704
008ac6f4	add x2,x19,#0x38
008ac6f8	mov x0,x19
008ac6fc	mov x1,x19
008ac700	bl 0x008b63a4
008ac704	mov x8,#-0x30
008ac708	mov x9,sp
008ac70c	add x10,sp,#0x80
008ac710	movk x8,#0xff80, LSL #32
008ac714	add x9,x9,#0x80
008ac718	sub x2,x29,#0x50
008ac71c	stp x9,x8,[x29, #-0x18]
008ac720	add x8,x29,#0x40
008ac724	add x9,x10,#0x30
008ac728	stp x8,x9,[x29, #-0x28]
008ac72c	mov x0,x19
008ac730	mov x1,x20
008ac734	ldp q1,q0,[x22]
008ac738	stp q1,q0,[x29, #-0x50]
008ac73c	bl 0x008b949c
008ac740	ldr x8,[x21, #0x28]
008ac744	ldur x9,[x29, #-0x8]
008ac748	cmp x8,x9
008ac74c	b.ne 0x008ac768
008ac750	ldp x20,x19,[sp, #0x130]
008ac754	ldr x28,[sp, #0x110]
008ac758	ldp x22,x21,[sp, #0x120]
008ac75c	ldp x29,x30,[sp, #0x100]
008ac760	add sp,sp,#0x140
008ac764	ret
008ac768	bl 0x00c2fec0
