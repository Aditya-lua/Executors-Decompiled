; GENERAL_NAME_get0_otherName @ 00af51d4
00af51d4	ldr w9,[x0]
00af51d8	mov w8,wzr
00af51dc	cbz w9,0x00af51e8
00af51e0	mov w0,w8
00af51e4	ret
00af51e8	cbz x1,0x00af51f8
00af51ec	ldr x8,[x0, #0x8]
00af51f0	ldr x8,[x8]
00af51f4	str x8,[x1]
00af51f8	cbz x2,0x00af5208
00af51fc	ldr x8,[x0, #0x8]
00af5200	ldr x8,[x8, #0x8]
00af5204	str x8,[x2]
00af5208	mov w8,#0x1
00af520c	mov w0,w8
00af5210	ret
