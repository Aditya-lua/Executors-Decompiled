; OSSL_STORE_INFO_get0_NAME_description @ 00aea650
00aea650	ldr w8,[x0]
00aea654	cmp w8,#0x1
00aea658	mov x8,xzr
00aea65c	b.ne 0x00aea664
00aea660	ldr x8,[x0, #0x10]
00aea664	mov x0,x8
00aea668	ret
