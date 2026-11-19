; ASYNC_WAIT_CTX_set_wait_fd @ 009f99a4
009f99a4	str x23,[sp, #-0x40]!
009f99a8	mov x23,x1
009f99ac	adrp x1,0x2bb000
009f99b0	stp x22,x21,[sp, #0x10]
009f99b4	stp x20,x19,[sp, #0x20]
009f99b8	mov w22,w2
009f99bc	mov x19,x0
009f99c0	add x1,x1,#0x9b2
009f99c4	orr w0,wzr,#0x30
009f99c8	mov w2,#0x32
009f99cc	stp x29,x30,[sp, #0x30]
009f99d0	add x29,sp,#0x30
009f99d4	mov x20,x4
009f99d8	mov x21,x3
009f99dc	bl 0x00c34250
009f99e0	cbz x0,0x009f9a10
009f99e4	mov w8,#0x1
009f99e8	str x23,[x0]
009f99ec	str w22,[x0, #0x8]
009f99f0	stp x21,x20,[x0, #0x10]
009f99f4	str w8,[x0, #0x20]
009f99f8	ldr x9,[x19]
009f99fc	str x9,[x0, #0x28]
009f9a00	ldr x9,[x19, #0x8]
009f9a04	add x9,x9,#0x1
009f9a08	stp x0,x9,[x19]
009f9a0c	b 0x009f9a44
009f9a10	bl 0x00c342a0
009f9a14	adrp x0,0x2bb000
009f9a18	adrp x2,0x2af000
009f9a1c	add x0,x0,#0x9b2
009f9a20	add x2,x2,#0xcec
009f9a24	mov w1,#0x33
009f9a28	bl 0x00c342b0
009f9a2c	mov w1,#0x100
009f9a30	mov w0,#0x33
009f9a34	movk w1,#0xc, LSL #16
009f9a38	mov x2,xzr
009f9a3c	bl 0x00c342c0
009f9a40	mov w8,wzr
009f9a44	ldp x29,x30,[sp, #0x30]
009f9a48	ldp x20,x19,[sp, #0x20]
009f9a4c	ldp x22,x21,[sp, #0x10]
009f9a50	mov w0,w8
009f9a54	ldr x23,[sp], #0x40
009f9a58	ret
