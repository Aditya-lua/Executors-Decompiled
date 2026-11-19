; evp_pkey_ctx_set_params_strict @ 00a7616c
00a7616c	stp x22,x21,[sp, #-0x30]!
00a76170	stp x20,x19,[sp, #0x10]
00a76174	mov x20,x0
00a76178	mov w0,wzr
00a7617c	stp x29,x30,[sp, #0x20]
00a76180	add x29,sp,#0x20
00a76184	cbz x20,0x00a761e0
00a76188	mov x19,x1
00a7618c	cbz x1,0x00a761e0
00a76190	ldr x8,[x20, #0x20]
00a76194	cbz x8,0x00a761c4
00a76198	mov x0,x20
00a7619c	bl 0x00a75fe0
00a761a0	ldr x1,[x19]
00a761a4	cbz x1,0x00a761c4
00a761a8	mov x21,x0
00a761ac	add x22,x19,#0x28
00a761b0	mov x0,x21
00a761b4	bl 0x00c36530
00a761b8	cbz x0,0x00a761dc
00a761bc	ldr x1,[x22], #0x28
00a761c0	cbnz x1,0x00a761b0
00a761c4	mov x0,x20
00a761c8	mov x1,x19
00a761cc	ldp x29,x30,[sp, #0x20]
00a761d0	ldp x20,x19,[sp, #0x10]
00a761d4	ldp x22,x21,[sp], #0x30
00a761d8	b 0x00a75c0c
00a761dc	orr w0,wzr,#0xfffffffe
00a761e0	ldp x29,x30,[sp, #0x20]
00a761e4	ldp x20,x19,[sp, #0x10]
00a761e8	ldp x22,x21,[sp], #0x30
00a761ec	ret
