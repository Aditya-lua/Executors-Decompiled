; PKCS7_get_signed_attribute @ 00ac1210
00ac1210	str x19,[sp, #-0x20]!
00ac1214	stp x29,x30,[sp, #0x10]
00ac1218	ldr x19,[x0, #0x18]
00ac121c	mov w2,#0xffffffff
00ac1220	add x29,sp,#0x10
00ac1224	mov x0,x19
00ac1228	bl 0x00c3d100
00ac122c	mov w1,w0
00ac1230	mov x0,x19
00ac1234	bl 0x00c3d0f0
00ac1238	ldp x29,x30,[sp, #0x10]
00ac123c	mov w1,wzr
00ac1240	ldr x19,[sp], #0x20
00ac1244	b 0x00c3f610
