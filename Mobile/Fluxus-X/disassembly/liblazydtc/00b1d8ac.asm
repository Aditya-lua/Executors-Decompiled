; ossl_i2d_DHx_PUBKEY @ 00b1d8ac
00b1d8ac	str x21,[sp, #-0x30]!
00b1d8b0	stp x20,x19,[sp, #0x10]
00b1d8b4	stp x29,x30,[sp, #0x20]
00b1d8b8	add x29,sp,#0x20
00b1d8bc	cbz x0,0x00b1d938
00b1d8c0	mov x19,x1
00b1d8c4	mov x21,x0
00b1d8c8	bl 0x00c36450
00b1d8cc	cbz x0,0x00b1d904
00b1d8d0	mov w1,#0x398
00b1d8d4	mov x2,x21
00b1d8d8	mov x20,x0
00b1d8dc	bl 0x00c39b70
00b1d8e0	mov x0,x20
00b1d8e4	mov x1,x19
00b1d8e8	bl 0x00b1d40c
00b1d8ec	mov w19,w0
00b1d8f0	mov x0,x20
00b1d8f4	str xzr,[x20, #0x20]
00b1d8f8	bl 0x00c32450
00b1d8fc	mov w0,w19
00b1d900	b 0x00b1d938
00b1d904	bl 0x00c342a0
00b1d908	adrp x0,0x2bc000
00b1d90c	adrp x2,0x2c4000
00b1d910	add x0,x0,#0x79f
00b1d914	add x2,x2,#0x3ec
00b1d918	mov w1,#0x2ca
00b1d91c	bl 0x00c342b0
00b1d920	mov w1,#0x100
00b1d924	mov w0,#0xd
00b1d928	movk w1,#0xc, LSL #16
00b1d92c	mov x2,xzr
00b1d930	bl 0x00c342c0
00b1d934	mov w0,#0xffffffff
00b1d938	ldp x29,x30,[sp, #0x20]
00b1d93c	ldp x20,x19,[sp, #0x10]
00b1d940	ldr x21,[sp], #0x30
00b1d944	ret
