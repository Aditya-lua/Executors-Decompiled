; EVP_KDF_settable_ctx_params @ 00a64830
00a64830	ldr x8,[x0, #0x68]
00a64834	cbz x8,0x00a64868
00a64838	str x19,[sp, #-0x20]!
00a6483c	stp x29,x30,[sp, #0x10]
00a64840	add x29,sp,#0x10
00a64844	mov x19,x0
00a64848	bl 0x00c3d260
00a6484c	bl 0x00c3b680
00a64850	ldr x2,[x19, #0x68]
00a64854	ldp x29,x30,[sp, #0x10]
00a64858	mov x1,x0
00a6485c	mov x0,xzr
00a64860	ldr x19,[sp], #0x20
00a64864	br x2
00a64868	mov x0,xzr
00a6486c	ret
