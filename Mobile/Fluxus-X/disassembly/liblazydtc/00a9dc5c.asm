; ossl_param_build_set_long @ 00a9dc5c
00a9dc5c	str x19,[sp, #-0x20]!
00a9dc60	mov x19,x3
00a9dc64	stp x29,x30,[sp, #0x10]
00a9dc68	add x29,sp,#0x10
00a9dc6c	cbz x0,0x00a9dc84
00a9dc70	ldp x29,x30,[sp, #0x10]
00a9dc74	mov x1,x2
00a9dc78	mov x2,x19
00a9dc7c	ldr x19,[sp], #0x20
00a9dc80	b 0x00c39b90
00a9dc84	mov x0,x1
00a9dc88	mov x1,x2
00a9dc8c	bl 0x00c3e8c0
00a9dc90	cbz x0,0x00a9dca4
00a9dc94	ldp x29,x30,[sp, #0x10]
00a9dc98	mov x1,x19
00a9dc9c	ldr x19,[sp], #0x20
00a9dca0	b 0x00c3e8d0
00a9dca4	ldp x29,x30,[sp, #0x10]
00a9dca8	mov w0,#0x1
00a9dcac	ldr x19,[sp], #0x20
00a9dcb0	ret
