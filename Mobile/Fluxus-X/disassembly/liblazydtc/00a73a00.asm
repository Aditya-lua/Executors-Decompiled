; FUN_00a73a00 @ 00a73a00
00a73a00	sub sp,sp,#0xd0
00a73a04	stp x22,x21,[sp, #0xa0]
00a73a08	stp x20,x19,[sp, #0xb0]
00a73a0c	stp x29,x30,[sp, #0xc0]
00a73a10	ldr x8,[x2, #0x20]
00a73a14	mov w21,w0
00a73a18	add x29,sp,#0xc0
00a73a1c	mov x19,x2
00a73a20	mov x0,x8
00a73a24	mov x20,x1
00a73a28	bl 0x00c37cd0
00a73a2c	cmp w0,#0x6
00a73a30	b.eq 0x00a73a48
00a73a34	ldr x0,[x19, #0x20]
00a73a38	bl 0x00c37cd0
00a73a3c	cmp w0,#0x390
00a73a40	mov w0,wzr
00a73a44	b.ne 0x00a73aac
00a73a48	ldr x0,[x19, #0x20]
00a73a4c	bl 0x00c3d8d0
00a73a50	mov x22,x0
00a73a54	bl 0x00c3db80
00a73a58	cmp w0,#0x7
00a73a5c	b.cc 0x00a73aa8
00a73a60	add x1,sp,#0x50
00a73a64	mov x2,sp
00a73a68	mov x0,x22
00a73a6c	bl 0x00c3db30
00a73a70	cbz w0,0x00a73aa8
00a73a74	ldr x8,[sp, #0x30]
00a73a78	cbz x8,0x00a73aa8
00a73a7c	ldr x9,[x19, #0x30]
00a73a80	mov w0,wzr
00a73a84	ldr w9,[x9, #0x8]
00a73a88	cmp w9,#0x2
00a73a8c	b.ne 0x00a73aac
00a73a90	mov w0,w21
00a73a94	mov x1,x20
00a73a98	mov x2,x19
00a73a9c	str x8,[x19, #0x20]
00a73aa0	bl 0x00a6fd84
00a73aa4	b 0x00a73aac
00a73aa8	mov w0,wzr
00a73aac	ldp x29,x30,[sp, #0xc0]
00a73ab0	ldp x20,x19,[sp, #0xb0]
00a73ab4	ldp x22,x21,[sp, #0xa0]
00a73ab8	add sp,sp,#0xd0
00a73abc	ret
