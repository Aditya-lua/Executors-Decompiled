; EVP_KDF_CTX_settable_params @ 00a648c0
00a648c0	str x19,[sp, #-0x20]!
00a648c4	stp x29,x30,[sp, #0x10]
00a648c8	mov x19,x0
00a648cc	ldr x0,[x0]
00a648d0	add x29,sp,#0x10
00a648d4	ldr x8,[x0, #0x68]
00a648d8	cbz x8,0x00a64900
00a648dc	bl 0x00c3d260
00a648e0	bl 0x00c3b680
00a648e4	ldp x9,x8,[x19]
00a648e8	ldp x29,x30,[sp, #0x10]
00a648ec	mov x1,x0
00a648f0	ldr x2,[x9, #0x68]
00a648f4	mov x0,x8
00a648f8	ldr x19,[sp], #0x20
00a648fc	br x2
00a64900	ldp x29,x30,[sp, #0x10]
00a64904	mov x0,xzr
00a64908	ldr x19,[sp], #0x20
00a6490c	ret
