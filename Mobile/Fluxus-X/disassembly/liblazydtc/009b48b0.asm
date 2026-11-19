; SSL_read @ 009b48b0
009b48b0	sub sp,sp,#0x20
009b48b4	stp x29,x30,[sp, #0x10]
009b48b8	add x29,sp,#0x10
009b48bc	tbnz w2,#0x1f,0x009b48dc
009b48c0	sxtw x2,w2
009b48c4	add x3,sp,#0x8
009b48c8	bl 0x009b45d0
009b48cc	ldr w8,[sp, #0x8]
009b48d0	cmp w0,#0x0
009b48d4	csel w0,w8,w0,gt
009b48d8	b 0x009b490c
009b48dc	bl 0x00c342a0
009b48e0	adrp x0,0x2c5000
009b48e4	adrp x2,0x2b7000
009b48e8	add x0,x0,#0x652
009b48ec	add x2,x2,#0x740
009b48f0	mov w1,#0x76c
009b48f4	bl 0x00c342b0
009b48f8	mov w0,#0x14
009b48fc	mov w1,#0x10f
009b4900	mov x2,xzr
009b4904	bl 0x00c342c0
009b4908	mov w0,#0xffffffff
009b490c	ldp x29,x30,[sp, #0x10]
009b4910	add sp,sp,#0x20
009b4914	ret
