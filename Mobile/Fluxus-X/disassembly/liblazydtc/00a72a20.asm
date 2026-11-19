; FUN_00a72a20 @ 00a72a20
00a72a20	sub sp,sp,#0x80
00a72a24	stp x22,x21,[sp, #0x50]
00a72a28	stp x20,x19,[sp, #0x60]
00a72a2c	stp x29,x30,[sp, #0x70]
00a72a30	ldr x8,[x2, #0x20]
00a72a34	mov w21,w0
00a72a38	add x29,sp,#0x70
00a72a3c	mov x19,x2
00a72a40	mov x0,x8
00a72a44	mov x20,x1
00a72a48	bl 0x00c37cd0
00a72a4c	cmp w0,#0x6
00a72a50	b.eq 0x00a72a68
00a72a54	ldr x0,[x19, #0x20]
00a72a58	bl 0x00c37cd0
00a72a5c	cmp w0,#0x390
00a72a60	mov w0,wzr
00a72a64	b.ne 0x00a72ac8
00a72a68	ldr x0,[x19, #0x20]
00a72a6c	bl 0x00c3d8d0
00a72a70	mov x22,x0
00a72a74	bl 0x00c3db80
00a72a78	cmp w0,#0x4
00a72a7c	b.cc 0x00a72ac4
00a72a80	mov x1,sp
00a72a84	mov x0,x22
00a72a88	bl 0x00c3db40
00a72a8c	cbz w0,0x00a72ac4
00a72a90	ldr x8,[sp, #0x18]
00a72a94	cbz x8,0x00a72ac4
00a72a98	ldr x9,[x19, #0x30]
00a72a9c	mov w0,wzr
00a72aa0	ldr w9,[x9, #0x8]
00a72aa4	cmp w9,#0x2
00a72aa8	b.ne 0x00a72ac8
00a72aac	mov w0,w21
00a72ab0	mov x1,x20
00a72ab4	mov x2,x19
00a72ab8	str x8,[x19, #0x20]
00a72abc	bl 0x00a6fd84
00a72ac0	b 0x00a72ac8
00a72ac4	mov w0,wzr
00a72ac8	ldp x29,x30,[sp, #0x70]
00a72acc	ldp x20,x19,[sp, #0x60]
00a72ad0	ldp x22,x21,[sp, #0x50]
00a72ad4	add sp,sp,#0x80
00a72ad8	ret
