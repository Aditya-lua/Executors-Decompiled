; LZ4_compress_limitedOutput @ 008dd548
008dd548	stp x29,x30,[sp, #-0x20]!
008dd54c	stp x28,x19,[sp, #0x10]
008dd550	mov x29,sp
008dd554	sub sp,sp,#0x4, LSL #12
008dd558	sub sp,sp,#0x30
008dd55c	mrs x19,tpidr_el0
008dd560	mov w4,w3
008dd564	mov w3,w2
008dd568	ldr x8,[x19, #0x28]
008dd56c	mov x2,x1
008dd570	mov x1,x0
008dd574	add x0,sp,#0x8
008dd578	mov w5,#0x1
008dd57c	stur x8,[x29, #-0x8]
008dd580	bl 0x00c309d0
008dd584	ldr x8,[x19, #0x28]
008dd588	ldur x9,[x29, #-0x8]
008dd58c	cmp x8,x9
008dd590	b.ne 0x008dd5a8
008dd594	add sp,sp,#0x4, LSL #12
008dd598	add sp,sp,#0x30
008dd59c	ldp x28,x19,[sp, #0x10]
008dd5a0	ldp x29,x30,[sp], #0x20
008dd5a4	ret
008dd5a8	bl 0x00c2fec0
