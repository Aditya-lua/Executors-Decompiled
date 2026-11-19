; X509v3_asid_inherits @ 00afa094
00afa094	cbz x0,0x00afa0bc
00afa098	ldr x8,[x0]
00afa09c	cbz x8,0x00afa0a8
00afa0a0	ldr w8,[x8]
00afa0a4	cbz w8,0x00afa0c8
00afa0a8	ldr x8,[x0, #0x8]
00afa0ac	cbz x8,0x00afa0c0
00afa0b0	ldr w8,[x8]
00afa0b4	cmp w8,#0x0
00afa0b8	cset w0,eq
00afa0bc	ret
00afa0c0	mov w0,wzr
00afa0c4	ret
00afa0c8	mov w0,#0x1
00afa0cc	ret
