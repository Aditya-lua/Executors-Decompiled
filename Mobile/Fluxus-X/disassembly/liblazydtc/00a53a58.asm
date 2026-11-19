; ENGINE_set_default_pkey_meths @ 00a53a58
00a53a58	str x19,[sp, #-0x20]!
00a53a5c	stp x29,x30,[sp, #0x10]
00a53a60	ldr x8,[x0, #0x48]
00a53a64	add x29,sp,#0x10
00a53a68	cbz x8,0x00a53ab0
00a53a6c	add x2,sp,#0x8
00a53a70	mov x1,xzr
00a53a74	mov w3,wzr
00a53a78	mov x19,x0
00a53a7c	blr x8
00a53a80	cmp w0,#0x0
00a53a84	b.le 0x00a53ab0
00a53a88	ldr x3,[sp, #0x8]
00a53a8c	mov w4,w0
00a53a90	adrp x0,0xd21000
00a53a94	adrp x1,0xa53000
00a53a98	add x0,x0,#0xa00
00a53a9c	add x1,x1,#0x9c0
00a53aa0	mov w5,#0x1
00a53aa4	mov x2,x19
00a53aa8	bl 0x00c3bce0
00a53aac	b 0x00a53ab4
00a53ab0	mov w0,#0x1
00a53ab4	ldp x29,x30,[sp, #0x10]
00a53ab8	ldr x19,[sp], #0x20
00a53abc	ret
