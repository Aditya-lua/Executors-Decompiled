; i2d_X509_fp @ 00b15cfc
00b15cfc	stp x20,x19,[sp, #-0x20]!
00b15d00	stp x29,x30,[sp, #0x10]
00b15d04	add x29,sp,#0x10
00b15d08	mov x19,x1
00b15d0c	mov x20,x0
00b15d10	bl 0x00c36190
00b15d14	ldp x29,x30,[sp, #0x10]
00b15d18	mov x1,x20
00b15d1c	mov x2,x19
00b15d20	ldp x20,x19,[sp], #0x20
00b15d24	b 0x00c37520
