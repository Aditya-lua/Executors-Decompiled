; SSL_CTX_set0_tmp_dh_pkey @ 009b9868
009b9868	stp x20,x19,[sp, #-0x20]!
009b986c	mov x20,x0
009b9870	mov x0,x1
009b9874	stp x29,x30,[sp, #0x10]
009b9878	add x29,sp,#0x10
009b987c	mov x19,x1
009b9880	bl 0x00c324c0
009b9884	mov w1,#0x7
009b9888	mov w2,w0
009b988c	movk w1,#0x4, LSL #16
009b9890	mov x0,x20
009b9894	mov w3,wzr
009b9898	mov x4,x19
009b989c	bl 0x00c35180
009b98a0	cbz w0,0x009b98c0
009b98a4	ldr x8,[x20, #0x158]
009b98a8	ldr x0,[x8, #0x8]
009b98ac	bl 0x00c32450
009b98b0	ldr x8,[x20, #0x158]
009b98b4	mov w0,#0x1
009b98b8	str x19,[x8, #0x8]
009b98bc	b 0x009b98f0
009b98c0	bl 0x00c342a0
009b98c4	adrp x0,0x2c5000
009b98c8	adrp x2,0x2a5000
009b98cc	add x0,x0,#0x652
009b98d0	add x2,x2,#0x9eb
009b98d4	mov w1,#0x17a7
009b98d8	bl 0x00c342b0
009b98dc	mov w0,#0x14
009b98e0	mov w1,#0x18a
009b98e4	mov x2,xzr
009b98e8	bl 0x00c342c0
009b98ec	mov w0,wzr
009b98f0	ldp x29,x30,[sp, #0x10]
009b98f4	ldp x20,x19,[sp], #0x20
009b98f8	ret
