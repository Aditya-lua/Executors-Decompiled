; FUN_008ac5e4 @ 008ac5e4
008ac5e4	sub sp,sp,#0x60
008ac5e8	stp x29,x30,[sp, #0x30]
008ac5ec	stp x22,x21,[sp, #0x40]
008ac5f0	stp x20,x19,[sp, #0x50]
008ac5f4	add x29,sp,#0x30
008ac5f8	mrs x22,tpidr_el0
008ac5fc	mov x20,x2
008ac600	mov x19,x0
008ac604	ldr x8,[x22, #0x28]
008ac608	mov x21,x1
008ac60c	stur x8,[x29, #-0x8]
008ac610	ldr x8,[x0, #0x60]
008ac614	ldp x8,x9,[x8, #0x8]
008ac618	cmp x9,x8
008ac61c	b.cc 0x008ac62c
008ac620	mov x0,x19
008ac624	mov w1,#0x1
008ac628	bl 0x008b52c4
008ac62c	ldrb w8,[x19, #0x2]
008ac630	tbz w8,#0x2,0x008ac644
008ac634	add x2,x19,#0x38
008ac638	mov x0,x19
008ac63c	mov x1,x19
008ac640	bl 0x008b63a4
008ac644	ldp q0,q1,[x20]
008ac648	mov x2,sp
008ac64c	mov x0,x19
008ac650	mov x1,x21
008ac654	stp q0,q1,[sp]
008ac658	bl 0x008b949c
008ac65c	ldr x8,[x22, #0x28]
008ac660	ldur x9,[x29, #-0x8]
008ac664	cmp x8,x9
008ac668	b.ne 0x008ac680
008ac66c	ldp x20,x19,[sp, #0x50]
008ac670	ldp x22,x21,[sp, #0x40]
008ac674	ldp x29,x30,[sp, #0x30]
008ac678	add sp,sp,#0x60
008ac67c	ret
008ac680	bl 0x00c2fec0
