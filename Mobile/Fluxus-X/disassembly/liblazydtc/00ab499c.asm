; PEM_write_NETSCAPE_CERT_SEQUENCE @ 00ab499c
00ab499c	sub sp,sp,#0x20
00ab49a0	stp x29,x30,[sp, #0x10]
00ab49a4	mov x2,x0
00ab49a8	adrp x0,0xcb5000
00ab49ac	ldr x0,[x0, #0x370]
00ab49b0	mov x3,x1
00ab49b4	adrp x1,0x2d0000
00ab49b8	add x1,x1,#0x239
00ab49bc	mov x4,xzr
00ab49c0	mov x5,xzr
00ab49c4	mov w6,wzr
00ab49c8	mov x7,xzr
00ab49cc	add x29,sp,#0x10
00ab49d0	str xzr,[sp]
00ab49d4	bl 0x00c36060
00ab49d8	ldp x29,x30,[sp, #0x10]
00ab49dc	add sp,sp,#0x20
00ab49e0	ret
