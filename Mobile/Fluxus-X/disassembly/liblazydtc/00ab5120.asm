; PEM_write_ECPKParameters @ 00ab5120
00ab5120	sub sp,sp,#0x20
00ab5124	stp x29,x30,[sp, #0x10]
00ab5128	mov x2,x0
00ab512c	adrp x0,0xcb5000
00ab5130	ldr x0,[x0, #0x578]
00ab5134	mov x3,x1
00ab5138	adrp x1,0x2d4000
00ab513c	add x1,x1,#0x2c4
00ab5140	mov x4,xzr
00ab5144	mov x5,xzr
00ab5148	mov w6,wzr
00ab514c	mov x7,xzr
00ab5150	add x29,sp,#0x10
00ab5154	str xzr,[sp]
00ab5158	bl 0x00c36060
00ab515c	ldp x29,x30,[sp, #0x10]
00ab5160	add sp,sp,#0x20
00ab5164	ret
