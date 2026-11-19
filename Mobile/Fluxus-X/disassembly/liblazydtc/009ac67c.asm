; ssl_cert_add0_chain_cert @ 009ac67c
009ac67c	str x21,[sp, #-0x30]!
009ac680	add x8,x0,#0x898
009ac684	add x9,x1,#0x158
009ac688	cmp x0,#0x0
009ac68c	stp x20,x19,[sp, #0x10]
009ac690	stp x29,x30,[sp, #0x20]
009ac694	csel x8,x9,x8,eq
009ac698	ldr x8,[x8]
009ac69c	add x29,sp,#0x20
009ac6a0	ldr x21,[x8]
009ac6a4	cbz x21,0x009ac718
009ac6a8	mov w3,wzr
009ac6ac	mov w4,wzr
009ac6b0	mov x19,x2
009ac6b4	bl 0x00c351a0
009ac6b8	cmp w0,#0x1
009ac6bc	b.ne 0x009ac6e8
009ac6c0	ldr x0,[x21, #0x10]
009ac6c4	cbnz x0,0x009ac6d4
009ac6c8	bl 0x00c34780
009ac6cc	str x0,[x21, #0x10]
009ac6d0	cbz x0,0x009ac718
009ac6d4	mov x1,x19
009ac6d8	bl 0x00c347a0
009ac6dc	cmp w0,#0x0
009ac6e0	cset w0,ne
009ac6e4	b 0x009ac71c
009ac6e8	mov w20,w0
009ac6ec	bl 0x00c342a0
009ac6f0	adrp x0,0x2d5000
009ac6f4	adrp x2,0x2d3000
009ac6f8	add x0,x0,#0x6b3
009ac6fc	add x2,x2,#0x505
009ac700	mov w1,#0x131
009ac704	bl 0x00c342b0
009ac708	mov w0,#0x14
009ac70c	mov w1,w20
009ac710	mov x2,xzr
009ac714	bl 0x00c342c0
009ac718	mov w0,wzr
009ac71c	ldp x29,x30,[sp, #0x20]
009ac720	ldp x20,x19,[sp, #0x10]
009ac724	ldr x21,[sp], #0x30
009ac728	ret
