; LZ4_compress_default @ 008d15c4
008d15c4	stp x29,x30,[sp, #-0x20]!
008d15c8	stp x28,x19,[sp, #0x10]
008d15cc	mov x29,sp
008d15d0	sub sp,sp,#0x4, LSL #12
008d15d4	sub sp,sp,#0x30
008d15d8	mrs x19,tpidr_el0
008d15dc	mov w4,w3
008d15e0	mov w3,w2
008d15e4	ldr x8,[x19, #0x28]
008d15e8	mov x2,x1
008d15ec	mov x1,x0
008d15f0	add x0,sp,#0x8
008d15f4	mov w5,#0x1
008d15f8	stur x8,[x29, #-0x8]
008d15fc	bl 0x00c309d0
008d1600	ldr x8,[x19, #0x28]
008d1604	ldur x9,[x29, #-0x8]
008d1608	cmp x8,x9
008d160c	b.ne 0x008d1624
008d1610	add sp,sp,#0x4, LSL #12
008d1614	add sp,sp,#0x30
008d1618	ldp x28,x19,[sp, #0x10]
008d161c	ldp x29,x30,[sp], #0x20
008d1620	ret
008d1624	bl 0x00c2fec0
