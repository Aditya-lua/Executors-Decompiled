; EVP_DecodeFinal @ 00a5a214
00a5a214	stp x20,x19,[sp, #-0x20]!
00a5a218	stp x29,x30,[sp, #0x10]
00a5a21c	str wzr,[x2]
00a5a220	ldr w3,[x0]
00a5a224	add x29,sp,#0x10
00a5a228	cbz w3,0x00a5a248
00a5a22c	mov x19,x2
00a5a230	add x2,x0,#0x8
00a5a234	mov x20,x0
00a5a238	bl 0x00a5a080
00a5a23c	tbnz w0,#0x1f,0x00a5a250
00a5a240	str wzr,[x20]
00a5a244	str w0,[x19]
00a5a248	mov w0,#0x1
00a5a24c	b 0x00a5a254
00a5a250	mov w0,#0xffffffff
00a5a254	ldp x29,x30,[sp, #0x10]
00a5a258	ldp x20,x19,[sp], #0x20
00a5a25c	ret
