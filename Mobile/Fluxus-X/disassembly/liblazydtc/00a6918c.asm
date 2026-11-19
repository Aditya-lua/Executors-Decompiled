; EVP_MAC_settable_ctx_params @ 00a6918c
00a6918c	ldr x8,[x0, #0x70]
00a69190	cbz x8,0x00a691c4
00a69194	str x19,[sp, #-0x20]!
00a69198	stp x29,x30,[sp, #0x10]
00a6919c	mov x19,x0
00a691a0	ldr x0,[x0]
00a691a4	add x29,sp,#0x10
00a691a8	bl 0x00c3b680
00a691ac	ldr x2,[x19, #0x70]
00a691b0	ldp x29,x30,[sp, #0x10]
00a691b4	mov x1,x0
00a691b8	mov x0,xzr
00a691bc	ldr x19,[sp], #0x20
00a691c0	br x2
00a691c4	mov x0,xzr
00a691c8	ret
