; X509_PURPOSE_get_count @ 00b027c0
00b027c0	adrp x8,0xd22000
00b027c4	ldr x0,[x8, #0x7e0]
00b027c8	cbz x0,0x00b027e4
00b027cc	stp x29,x30,[sp, #-0x10]!
00b027d0	mov x29,sp
00b027d4	bl 0x00c325e0
00b027d8	add w0,w0,#0x9
00b027dc	ldp x29,x30,[sp], #0x10
00b027e0	ret
00b027e4	mov w0,#0x9
00b027e8	ret
