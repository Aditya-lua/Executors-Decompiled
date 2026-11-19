; EVP_ASYM_CIPHER_gettable_ctx_params @ 00a56820
00a56820	str x19,[sp, #-0x20]!
00a56824	stp x29,x30,[sp, #0x10]
00a56828	add x29,sp,#0x10
00a5682c	cbz x0,0x00a5685c
00a56830	ldr x8,[x0, #0x70]
00a56834	mov x19,x0
00a56838	cbz x8,0x00a5685c
00a5683c	ldr x0,[x19, #0x18]
00a56840	bl 0x00c3b680
00a56844	ldr x2,[x19, #0x70]
00a56848	ldp x29,x30,[sp, #0x10]
00a5684c	mov x1,x0
00a56850	mov x0,xzr
00a56854	ldr x19,[sp], #0x20
00a56858	br x2
00a5685c	ldp x29,x30,[sp, #0x10]
00a56860	mov x0,xzr
00a56864	ldr x19,[sp], #0x20
00a56868	ret
