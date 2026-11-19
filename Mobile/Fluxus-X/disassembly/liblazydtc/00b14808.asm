; X509_VERIFY_PARAM_get_count @ 00b14808
00b14808	adrp x8,0xd22000
00b1480c	ldr x0,[x8, #0x7f0]
00b14810	cbz x0,0x00b1482c
00b14814	stp x29,x30,[sp, #-0x10]!
00b14818	mov x29,sp
00b1481c	bl 0x00c325e0
00b14820	add w0,w0,#0x5
00b14824	ldp x29,x30,[sp], #0x10
00b14828	ret
00b1482c	mov w0,#0x5
00b14830	ret
