; X509V3_section_free @ 00af4a2c
00af4a2c	cbz x1,0x00af4a44
00af4a30	ldr x8,[x0, #0x28]
00af4a34	ldr x2,[x8, #0x18]
00af4a38	cbz x2,0x00af4a44
00af4a3c	ldr x0,[x0, #0x30]
00af4a40	br x2
00af4a44	ret
