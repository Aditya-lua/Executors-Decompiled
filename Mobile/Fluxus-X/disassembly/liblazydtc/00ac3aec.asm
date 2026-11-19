; Poly1305_Init @ 00ac3aec
00ac3aec	ldr w8,[x1, #0x10]
00ac3af0	str w8,[x0, #0xc0]
00ac3af4	ldr w8,[x1, #0x14]
00ac3af8	str w8,[x0, #0xc4]
00ac3afc	ldr w8,[x1, #0x18]
00ac3b00	str w8,[x0, #0xc8]
00ac3b04	ldr w8,[x1, #0x1c]
00ac3b08	str wzr,[x0, #0x10]
00ac3b0c	stp xzr,xzr,[x0]
00ac3b10	str w8,[x0, #0xcc]
00ac3b14	ldrb w8,[x1]
00ac3b18	ldrb w9,[x1, #0x1]
00ac3b1c	ldrb w10,[x1, #0x2]
00ac3b20	ldrb w11,[x1, #0x3]
00ac3b24	bfm w8,w9,#0x18,#0x7
00ac3b28	bfm w8,w10,#0x10,#0x7
00ac3b2c	bfm w8,w11,#0x8,#0x3
00ac3b30	str w8,[x0, #0x14]
00ac3b34	ldr w8,[x1, #0x4]
00ac3b38	and w8,w8,#0xffffffc
00ac3b3c	str w8,[x0, #0x18]
00ac3b40	ldr w8,[x1, #0x8]
00ac3b44	and w8,w8,#0xffffffc
00ac3b48	str w8,[x0, #0x1c]
00ac3b4c	ldr w8,[x1, #0xc]
00ac3b50	str xzr,[x0, #0xe0]
00ac3b54	and w8,w8,#0xffffffc
00ac3b58	str w8,[x0, #0x20]
00ac3b5c	ret
