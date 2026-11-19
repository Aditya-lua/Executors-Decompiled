; FUN_00b3f0f8 @ 00b3f0f8
00b3f0f8	stp x20,x19,[sp, #-0x20]!
00b3f0fc	mov x19,x1
00b3f100	mov w1,#0x1000
00b3f104	stp x29,x30,[sp, #0x10]
00b3f108	add x29,sp,#0x10
00b3f10c	mov x20,x0
00b3f110	bl 0x00c39ff0
00b3f114	cbz w0,0x00b3f12c
00b3f118	ldp x29,x30,[sp, #0x10]
00b3f11c	mov x0,x20
00b3f120	mov x1,x19
00b3f124	ldp x20,x19,[sp], #0x20
00b3f128	b 0x00c39bf0
00b3f12c	ldp x29,x30,[sp, #0x10]
00b3f130	mov x0,x20
00b3f134	mov x1,x19
00b3f138	ldp x20,x19,[sp], #0x20
00b3f13c	b 0x00c39be0
