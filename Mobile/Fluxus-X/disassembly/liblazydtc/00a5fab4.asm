; EVP_MD_CTX_set_pkey_ctx @ 00a5fab4
00a5fab4	stp x20,x19,[sp, #-0x20]!
00a5fab8	stp x29,x30,[sp, #0x10]
00a5fabc	ldr x8,[x0, #0x18]
00a5fac0	mov x19,x0
00a5fac4	mov x20,x1
00a5fac8	add x29,sp,#0x10
00a5facc	tbnz w8,#0xa,0x00a5fadc
00a5fad0	ldr x0,[x19, #0x28]
00a5fad4	bl 0x00c34620
00a5fad8	ldr x8,[x19, #0x18]
00a5fadc	orr x9,x8,#0x400
00a5fae0	and x8,x8,#-0x401
00a5fae4	cmp x20,#0x0
00a5fae8	csel x8,x8,x9,eq
00a5faec	str x20,[x19, #0x28]
00a5faf0	str x8,[x19, #0x18]
00a5faf4	ldp x29,x30,[sp, #0x10]
00a5faf8	ldp x20,x19,[sp], #0x20
00a5fafc	ret
