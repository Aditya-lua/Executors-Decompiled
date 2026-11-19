; PEM_write_X509_REQ @ 00ab458c
00ab458c	sub sp,sp,#0x20
00ab4590	stp x29,x30,[sp, #0x10]
00ab4594	mov x2,x0
00ab4598	adrp x0,0xcb5000
00ab459c	ldr x0,[x0, #0x748]
00ab45a0	mov x3,x1
00ab45a4	adrp x1,0x29e000
00ab45a8	add x1,x1,#0x8ab
00ab45ac	mov x4,xzr
00ab45b0	mov x5,xzr
00ab45b4	mov w6,wzr
00ab45b8	mov x7,xzr
00ab45bc	add x29,sp,#0x10
00ab45c0	str xzr,[sp]
00ab45c4	bl 0x00c36060
00ab45c8	ldp x29,x30,[sp, #0x10]
00ab45cc	add sp,sp,#0x20
00ab45d0	ret
