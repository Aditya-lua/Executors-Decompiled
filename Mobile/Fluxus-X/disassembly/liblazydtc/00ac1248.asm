; PKCS7_get_attribute @ 00ac1248
00ac1248	str x19,[sp, #-0x20]!
00ac124c	stp x29,x30,[sp, #0x10]
00ac1250	ldr x19,[x0, #0x30]
00ac1254	mov w2,#0xffffffff
00ac1258	add x29,sp,#0x10
00ac125c	mov x0,x19
00ac1260	bl 0x00c3d100
00ac1264	mov w1,w0
00ac1268	mov x0,x19
00ac126c	bl 0x00c3d0f0
00ac1270	ldp x29,x30,[sp, #0x10]
00ac1274	mov w1,wzr
00ac1278	ldr x19,[sp], #0x20
00ac127c	b 0x00c3f610
