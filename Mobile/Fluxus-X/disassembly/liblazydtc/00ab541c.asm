; PEM_write_DHxparams @ 00ab541c
00ab541c	sub sp,sp,#0x20
00ab5420	stp x29,x30,[sp, #0x10]
00ab5424	mov x2,x0
00ab5428	adrp x0,0xcb5000
00ab542c	ldr x0,[x0, #0x4d8]
00ab5430	mov x3,x1
00ab5434	adrp x1,0x2c6000
00ab5438	add x1,x1,#0xe6
00ab543c	mov x4,xzr
00ab5440	mov x5,xzr
00ab5444	mov w6,wzr
00ab5448	mov x7,xzr
00ab544c	add x29,sp,#0x10
00ab5450	str xzr,[sp]
00ab5454	bl 0x00c36060
00ab5458	ldp x29,x30,[sp, #0x10]
00ab545c	add sp,sp,#0x20
00ab5460	ret
