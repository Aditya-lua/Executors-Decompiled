; ossl_blob_length @ 00b34cec
00b34cec	add w8,w0,#0x7
00b34cf0	lsr w8,w8,#0x3
00b34cf4	cbz w1,0x00b34d08
00b34cf8	cbz w2,0x00b34d14
00b34cfc	add w8,w8,w8, LSL #0x1
00b34d00	add w0,w8,#0x2c
00b34d04	ret
00b34d08	cbz w2,0x00b34d20
00b34d0c	add w0,w8,#0x4
00b34d10	ret
00b34d14	lsl w8,w8,#0x1
00b34d18	add w0,w8,#0x40
00b34d1c	ret
00b34d20	add w9,w0,#0xf
00b34d24	lsr w9,w9,#0x4
00b34d28	add w9,w9,w9, LSL #0x2
00b34d2c	add w8,w9,w8, LSL #0x1
00b34d30	add w0,w8,#0x4
00b34d34	ret
