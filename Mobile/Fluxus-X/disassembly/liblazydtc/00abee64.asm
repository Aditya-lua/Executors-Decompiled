; PKCS7_type_is_other @ 00abee64
00abee64	stp x29,x30,[sp, #-0x10]!
00abee68	ldr x0,[x0, #0x18]
00abee6c	mov x29,sp
00abee70	bl 0x00c37750
00abee74	sub w8,w0,#0x15
00abee78	cmp w8,#0x5
00abee7c	cset w0,hi
00abee80	ldp x29,x30,[sp], #0x10
00abee84	ret
