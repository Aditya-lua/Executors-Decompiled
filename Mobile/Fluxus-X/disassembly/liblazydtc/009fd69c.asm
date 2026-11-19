; BIO_meth_new @ 009fd69c
009fd69c	str x21,[sp, #-0x30]!
009fd6a0	mov x21,x1
009fd6a4	adrp x1,0x2d7000
009fd6a8	stp x20,x19,[sp, #0x10]
009fd6ac	mov w20,w0
009fd6b0	add x1,x1,#0xc0d
009fd6b4	orr w0,wzr,#0x60
009fd6b8	mov w2,#0x26
009fd6bc	stp x29,x30,[sp, #0x20]
009fd6c0	add x29,sp,#0x20
009fd6c4	bl 0x00c34250
009fd6c8	mov x19,x0
009fd6cc	cbz x0,0x009fd6f4
009fd6d0	adrp x1,0x2d7000
009fd6d4	add x1,x1,#0xc0d
009fd6d8	mov w2,#0x29
009fd6dc	mov x0,x21
009fd6e0	bl 0x00c34600
009fd6e4	str x0,[x19, #0x8]
009fd6e8	cbz x0,0x009fd6f4
009fd6ec	str w20,[x19]
009fd6f0	b 0x009fd73c
009fd6f4	adrp x20,0x2d7000
009fd6f8	add x20,x20,#0xc0d
009fd6fc	mov w2,#0x2a
009fd700	mov x0,x19
009fd704	mov x1,x20
009fd708	bl 0x00c32310
009fd70c	bl 0x00c342a0
009fd710	adrp x2,0x2ab000
009fd714	add x2,x2,#0xe51
009fd718	mov w1,#0x2b
009fd71c	mov x0,x20
009fd720	bl 0x00c342b0
009fd724	mov w1,#0x100
009fd728	mov w0,#0x20
009fd72c	movk w1,#0xc, LSL #16
009fd730	mov x2,xzr
009fd734	bl 0x00c342c0
009fd738	mov x19,xzr
009fd73c	mov x0,x19
009fd740	ldp x29,x30,[sp, #0x20]
009fd744	ldp x20,x19,[sp, #0x10]
009fd748	ldr x21,[sp], #0x30
009fd74c	ret
