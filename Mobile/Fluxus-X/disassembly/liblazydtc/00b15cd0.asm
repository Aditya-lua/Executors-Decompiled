; d2i_X509_fp @ 00b15cd0
00b15cd0	stp x20,x19,[sp, #-0x20]!
00b15cd4	stp x29,x30,[sp, #0x10]
00b15cd8	add x29,sp,#0x10
00b15cdc	mov x19,x1
00b15ce0	mov x20,x0
00b15ce4	bl 0x00c36190
00b15ce8	ldp x29,x30,[sp, #0x10]
00b15cec	mov x1,x20
00b15cf0	mov x2,x19
00b15cf4	ldp x20,x19,[sp], #0x20
00b15cf8	b 0x00c37440
