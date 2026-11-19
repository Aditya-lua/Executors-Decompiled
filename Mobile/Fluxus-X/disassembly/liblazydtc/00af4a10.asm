; X509V3_string_free @ 00af4a10
00af4a10	cbz x1,0x00af4a28
00af4a14	ldr x8,[x0, #0x28]
00af4a18	ldr x2,[x8, #0x10]
00af4a1c	cbz x2,0x00af4a28
00af4a20	ldr x0,[x0, #0x30]
00af4a24	br x2
00af4a28	ret
