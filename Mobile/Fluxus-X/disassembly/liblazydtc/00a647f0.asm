; EVP_KDF_gettable_ctx_params @ 00a647f0
00a647f0	ldr x8,[x0, #0x60]
00a647f4	cbz x8,0x00a64828
00a647f8	str x19,[sp, #-0x20]!
00a647fc	stp x29,x30,[sp, #0x10]
00a64800	add x29,sp,#0x10
00a64804	mov x19,x0
00a64808	bl 0x00c3d260
00a6480c	bl 0x00c3b680
00a64810	ldr x2,[x19, #0x60]
00a64814	ldp x29,x30,[sp, #0x10]
00a64818	mov x1,x0
00a6481c	mov x0,xzr
00a64820	ldr x19,[sp], #0x20
00a64824	br x2
00a64828	mov x0,xzr
00a6482c	ret
