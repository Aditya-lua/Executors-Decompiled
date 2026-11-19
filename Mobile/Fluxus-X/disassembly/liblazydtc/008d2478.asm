; LZ4_compress_destSize @ 008d2478
008d2478	stp x29,x30,[sp, #-0x20]!
008d247c	stp x28,x19,[sp, #0x10]
008d2480	mov x29,sp
008d2484	sub sp,sp,#0x4, LSL #12
008d2488	sub sp,sp,#0x30
008d248c	mrs x19,tpidr_el0
008d2490	mov w4,w3
008d2494	mov x3,x2
008d2498	ldr x8,[x19, #0x28]
008d249c	mov x2,x1
008d24a0	mov x1,x0
008d24a4	add x0,sp,#0x8
008d24a8	mov w5,#0x1
008d24ac	stur x8,[x29, #-0x8]
008d24b0	bl 0x008d1670
008d24b4	ldr x8,[x19, #0x28]
008d24b8	ldur x9,[x29, #-0x8]
008d24bc	cmp x8,x9
008d24c0	b.ne 0x008d24d8
008d24c4	add sp,sp,#0x4, LSL #12
008d24c8	add sp,sp,#0x30
008d24cc	ldp x28,x19,[sp, #0x10]
008d24d0	ldp x29,x30,[sp], #0x20
008d24d4	ret
008d24d8	bl 0x00c2fec0
