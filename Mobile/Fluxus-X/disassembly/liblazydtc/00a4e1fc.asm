; FUN_00a4e1fc @ 00a4e1fc
00a4e1fc	stp x20,x19,[sp, #-0x20]!
00a4e200	adrp x1,0x2b4000
00a4e204	mov x19,x0
00a4e208	add x1,x1,#0x201
00a4e20c	mov w0,#0x28
00a4e210	mov w2,#0x37
00a4e214	stp x29,x30,[sp, #0x10]
00a4e218	add x29,sp,#0x10
00a4e21c	bl 0x00c34250
00a4e220	cbz x0,0x00a4e278
00a4e224	mov w8,#0x1000
00a4e228	adrp x1,0x2b4000
00a4e22c	mov x20,x0
00a4e230	str w8,[x0]
00a4e234	add x1,x1,#0x201
00a4e238	mov w0,#0x1000
00a4e23c	orr w2,wzr,#0x3c
00a4e240	bl 0x00c34250
00a4e244	str x0,[x20, #0x8]
00a4e248	cbz x0,0x00a4e260
00a4e24c	mov w0,#0x1
00a4e250	str x20,[x19, #0x40]
00a4e254	str w0,[x19, #0x28]
00a4e258	str wzr,[x19, #0x30]
00a4e25c	b 0x00a4e278
00a4e260	adrp x1,0x2b4000
00a4e264	add x1,x1,#0x201
00a4e268	orr w2,wzr,#0x3e
00a4e26c	mov x0,x20
00a4e270	bl 0x00c32310
00a4e274	mov w0,wzr
00a4e278	ldp x29,x30,[sp, #0x10]
00a4e27c	ldp x20,x19,[sp], #0x20
00a4e280	ret
