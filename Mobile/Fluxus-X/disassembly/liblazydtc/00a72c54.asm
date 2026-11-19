; FUN_00a72c54 @ 00a72c54
00a72c54	sub sp,sp,#0x80
00a72c58	stp x22,x21,[sp, #0x50]
00a72c5c	stp x20,x19,[sp, #0x60]
00a72c60	stp x29,x30,[sp, #0x70]
00a72c64	ldr x8,[x2, #0x20]
00a72c68	mov w21,w0
00a72c6c	add x29,sp,#0x70
00a72c70	mov x19,x2
00a72c74	mov x0,x8
00a72c78	mov x20,x1
00a72c7c	bl 0x00c37cd0
00a72c80	cmp w0,#0x6
00a72c84	b.eq 0x00a72c9c
00a72c88	ldr x0,[x19, #0x20]
00a72c8c	bl 0x00c37cd0
00a72c90	cmp w0,#0x390
00a72c94	mov w0,wzr
00a72c98	b.ne 0x00a72cfc
00a72c9c	ldr x0,[x19, #0x20]
00a72ca0	bl 0x00c3d8d0
00a72ca4	mov x22,x0
00a72ca8	bl 0x00c3db80
00a72cac	cmp w0,#0x7
00a72cb0	b.cc 0x00a72cf8
00a72cb4	mov x1,sp
00a72cb8	mov x0,x22
00a72cbc	bl 0x00c3db40
00a72cc0	cbz w0,0x00a72cf8
00a72cc4	ldr x8,[sp, #0x30]
00a72cc8	cbz x8,0x00a72cf8
00a72ccc	ldr x9,[x19, #0x30]
00a72cd0	mov w0,wzr
00a72cd4	ldr w9,[x9, #0x8]
00a72cd8	cmp w9,#0x2
00a72cdc	b.ne 0x00a72cfc
00a72ce0	mov w0,w21
00a72ce4	mov x1,x20
00a72ce8	mov x2,x19
00a72cec	str x8,[x19, #0x20]
00a72cf0	bl 0x00a6fd84
00a72cf4	b 0x00a72cfc
00a72cf8	mov w0,wzr
00a72cfc	ldp x29,x30,[sp, #0x70]
00a72d00	ldp x20,x19,[sp, #0x60]
00a72d04	ldp x22,x21,[sp, #0x50]
00a72d08	add sp,sp,#0x80
00a72d0c	ret
