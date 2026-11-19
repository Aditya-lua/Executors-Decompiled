; i2d_PKCS7_fp @ 00b15ea0
00b15ea0	stp x20,x19,[sp, #-0x20]!
00b15ea4	stp x29,x30,[sp, #0x10]
00b15ea8	add x29,sp,#0x10
00b15eac	mov x19,x1
00b15eb0	mov x20,x0
00b15eb4	bl 0x00c3f440
00b15eb8	ldp x29,x30,[sp, #0x10]
00b15ebc	mov x1,x20
00b15ec0	mov x2,x19
00b15ec4	ldp x20,x19,[sp], #0x20
00b15ec8	b 0x00c37520
