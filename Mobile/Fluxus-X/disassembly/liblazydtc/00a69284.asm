; EVP_add_cipher @ 00a69284
00a69284	str x19,[sp, #-0x20]!
00a69288	stp x29,x30,[sp, #0x10]
00a6928c	add x29,sp,#0x10
00a69290	cbz x0,0x00a692cc
00a69294	mov x19,x0
00a69298	ldr w0,[x0]
00a6929c	bl 0x00c324f0
00a692a0	mov w1,#0x2
00a692a4	mov x2,x19
00a692a8	bl 0x00c3d810
00a692ac	cbz w0,0x00a692cc
00a692b0	ldr w0,[x19]
00a692b4	bl 0x00c34d80
00a692b8	ldp x29,x30,[sp, #0x10]
00a692bc	mov w1,#0x2
00a692c0	mov x2,x19
00a692c4	ldr x19,[sp], #0x20
00a692c8	b 0x00c3d810
00a692cc	ldp x29,x30,[sp, #0x10]
00a692d0	mov w0,wzr
00a692d4	ldr x19,[sp], #0x20
00a692d8	ret
