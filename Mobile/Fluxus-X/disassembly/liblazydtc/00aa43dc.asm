; ossl_provider_self_test @ 00aa43dc
00aa43dc	str x19,[sp, #-0x20]!
00aa43e0	stp x29,x30,[sp, #0x10]
00aa43e4	ldr x8,[x0, #0x90]
00aa43e8	add x29,sp,#0x10
00aa43ec	cbz x8,0x00aa4410
00aa43f0	mov x19,x0
00aa43f4	ldr x0,[x0, #0xd0]
00aa43f8	blr x8
00aa43fc	cbnz w0,0x00aa4414
00aa4400	mov x0,x19
00aa4404	bl 0x00aa3e00
00aa4408	mov w0,wzr
00aa440c	b 0x00aa4414
00aa4410	mov w0,#0x1
00aa4414	ldp x29,x30,[sp, #0x10]
00aa4418	ldr x19,[sp], #0x20
00aa441c	ret
