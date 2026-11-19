; PKCS7_digest_from_attributes @ 00ac115c
00ac115c	str x19,[sp, #-0x20]!
00ac1160	mov w1,#0x33
00ac1164	mov w2,#0xffffffff
00ac1168	stp x29,x30,[sp, #0x10]
00ac116c	add x29,sp,#0x10
00ac1170	mov x19,x0
00ac1174	bl 0x00c3d100
00ac1178	mov w1,w0
00ac117c	mov x0,x19
00ac1180	bl 0x00c3d0f0
00ac1184	mov w1,wzr
00ac1188	bl 0x00c3f610
00ac118c	cbz x0,0x00ac1194
00ac1190	ldr x0,[x0, #0x8]
00ac1194	ldp x29,x30,[sp, #0x10]
00ac1198	ldr x19,[sp], #0x20
00ac119c	ret
