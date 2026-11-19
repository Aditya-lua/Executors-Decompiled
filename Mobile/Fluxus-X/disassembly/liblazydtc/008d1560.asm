; LZ4_compress_fast @ 008d1560
008d1560	stp x29,x30,[sp, #-0x20]!
008d1564	stp x28,x19,[sp, #0x10]
008d1568	mov x29,sp
008d156c	sub sp,sp,#0x4, LSL #12
008d1570	sub sp,sp,#0x30
008d1574	mrs x19,tpidr_el0
008d1578	mov w5,w4
008d157c	mov w4,w3
008d1580	ldr x8,[x19, #0x28]
008d1584	mov w3,w2
008d1588	mov x2,x1
008d158c	mov x1,x0
008d1590	add x0,sp,#0x8
008d1594	stur x8,[x29, #-0x8]
008d1598	bl 0x00c309d0
008d159c	ldr x8,[x19, #0x28]
008d15a0	ldur x9,[x29, #-0x8]
008d15a4	cmp x8,x9
008d15a8	b.ne 0x008d15c0
008d15ac	add sp,sp,#0x4, LSL #12
008d15b0	add sp,sp,#0x30
008d15b4	ldp x28,x19,[sp, #0x10]
008d15b8	ldp x29,x30,[sp], #0x20
008d15bc	ret
008d15c0	bl 0x00c2fec0
