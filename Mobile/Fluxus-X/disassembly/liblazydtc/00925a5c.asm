; FUN_00925a5c @ 00925a5c
00925a5c	ldrh w8,[x0]
00925a60	cmp w8,#0xa
00925a64	mov w8,wzr
00925a68	b.ne 0x00925b44
00925a6c	ldrb w10,[x0, #0x8]
00925a70	and w8,w10,#0xfe
00925a74	cmp w8,#0xfc
00925a78	b.ne 0x00925a88
00925a7c	orr w8,wzr,#0x3
00925a80	mov w0,w8
00925a84	ret
00925a88	ldrb w8,[x0, #0x9]
00925a8c	and w9,w8,#0xc0
00925a90	bfm w9,w10,#0x18,#0x7
00925a94	cbz w9,0x00925ac0
00925a98	mov w8,#0xfe80
00925a9c	cmp w9,w8
00925aa0	b.eq 0x00925b4c
00925aa4	mov w8,#0xfec0
00925aa8	cmp w9,w8
00925aac	mov w8,wzr
00925ab0	b.ne 0x00925b44
00925ab4	mov w8,#0x2
00925ab8	mov w0,w8
00925abc	ret
00925ac0	ldrb w9,[x0, #0xa]
00925ac4	ldrb w10,[x0, #0xb]
00925ac8	ldrb w11,[x0, #0xc]
00925acc	ldrb w12,[x0, #0xd]
00925ad0	orr w8,w9,w8
00925ad4	ldrb w9,[x0, #0xe]
00925ad8	orr w8,w8,w10
00925adc	ldrb w10,[x0, #0xf]
00925ae0	orr w8,w8,w11
00925ae4	ldrb w11,[x0, #0x10]
00925ae8	orr w8,w8,w12
00925aec	ldrb w12,[x0, #0x11]
00925af0	orr w8,w8,w9
00925af4	ldrb w9,[x0, #0x12]
00925af8	orr w8,w8,w10
00925afc	ldrb w10,[x0, #0x13]
00925b00	orr w8,w8,w11
00925b04	ldrb w11,[x0, #0x14]
00925b08	orr w8,w8,w12
00925b0c	ldrb w12,[x0, #0x15]
00925b10	orr w8,w8,w9
00925b14	ldrb w9,[x0, #0x16]
00925b18	orr w8,w8,w10
00925b1c	orr w8,w8,w11
00925b20	orr w8,w8,w12
00925b24	orr w9,w8,w9
00925b28	mov w8,wzr
00925b2c	cbnz w9,0x00925b44
00925b30	ldrb w8,[x0, #0x17]
00925b34	cmp w8,#0x1
00925b38	mov w8,wzr
00925b3c	b.ne 0x00925b44
00925b40	mov w8,#0x4
00925b44	mov w0,w8
00925b48	ret
00925b4c	mov w8,#0x1
00925b50	mov w0,w8
00925b54	ret
