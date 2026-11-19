; pqueue_insert @ 009a7dcc
009a7dcc	stp x22,x21,[sp, #-0x30]!
009a7dd0	stp x20,x19,[sp, #0x10]
009a7dd4	stp x29,x30,[sp, #0x20]
009a7dd8	ldr x8,[x0]
009a7ddc	mov x20,x0
009a7de0	mov x19,x1
009a7de4	add x29,sp,#0x20
009a7de8	cbz x8,0x009a7e38
009a7dec	mov x22,xzr
009a7df0	mov w2,#0x8
009a7df4	mov x0,x8
009a7df8	mov x1,x19
009a7dfc	mov x21,x8
009a7e00	bl 0x00c300b0
009a7e04	cmp w0,#0x1
009a7e08	b.ge 0x009a7e28
009a7e0c	cbz w0,0x009a7e40
009a7e10	ldr x8,[x21, #0x10]
009a7e14	mov x22,x21
009a7e18	cbnz x8,0x009a7df0
009a7e1c	add x20,x21,#0x10
009a7e20	str xzr,[x19, #0x10]
009a7e24	b 0x009a7e38
009a7e28	add x8,x22,#0x10
009a7e2c	cmp x22,#0x0
009a7e30	str x21,[x19, #0x10]
009a7e34	csel x20,x20,x8,eq
009a7e38	str x19,[x20]
009a7e3c	b 0x009a7e44
009a7e40	mov x19,xzr
009a7e44	mov x0,x19
009a7e48	ldp x29,x30,[sp, #0x20]
009a7e4c	ldp x20,x19,[sp, #0x10]
009a7e50	ldp x22,x21,[sp], #0x30
009a7e54	ret
