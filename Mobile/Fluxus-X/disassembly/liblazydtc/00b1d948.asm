; d2i_DSA_PUBKEY @ 00b1d948
00b1d948	sub sp,sp,#0x40
00b1d94c	stp x22,x21,[sp, #0x10]
00b1d950	stp x20,x19,[sp, #0x20]
00b1d954	stp x29,x30,[sp, #0x30]
00b1d958	ldr x8,[x1]
00b1d95c	mov x20,x1
00b1d960	mov x19,x0
00b1d964	add x1,sp,#0x8
00b1d968	mov w5,#0x1
00b1d96c	mov x0,xzr
00b1d970	mov x3,xzr
00b1d974	mov x4,xzr
00b1d978	add x29,sp,#0x30
00b1d97c	str x8,[sp, #0x8]
00b1d980	bl 0x00b1d214
00b1d984	cbz x0,0x00b1d9bc
00b1d988	mov x22,x0
00b1d98c	bl 0x00c3d940
00b1d990	mov x21,x0
00b1d994	mov x0,x22
00b1d998	bl 0x00c32450
00b1d99c	cbz x21,0x00b1d9c0
00b1d9a0	ldr x8,[sp, #0x8]
00b1d9a4	str x8,[x20]
00b1d9a8	cbz x19,0x00b1d9c0
00b1d9ac	ldr x0,[x19]
00b1d9b0	bl 0x00c3a0a0
00b1d9b4	str x21,[x19]
00b1d9b8	b 0x00b1d9c0
00b1d9bc	mov x21,xzr
00b1d9c0	mov x0,x21
00b1d9c4	ldp x29,x30,[sp, #0x30]
00b1d9c8	ldp x20,x19,[sp, #0x20]
00b1d9cc	ldp x22,x21,[sp, #0x10]
00b1d9d0	add sp,sp,#0x40
00b1d9d4	ret
