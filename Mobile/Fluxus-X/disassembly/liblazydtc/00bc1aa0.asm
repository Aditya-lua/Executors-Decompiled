; ZSTD_XXH32_update @ 00bc1aa0
00bc1aa0	cbz x1,0x00bc1c30
00bc1aa4	stp x29,x30,[sp, #-0x40]!
00bc1aa8	stp x24,x23,[sp, #0x10]
00bc1aac	stp x22,x21,[sp, #0x20]
00bc1ab0	stp x20,x19,[sp, #0x30]
00bc1ab4	mov x29,sp
00bc1ab8	ldp w8,w9,[x0]
00bc1abc	cmp x2,#0xf
00bc1ac0	mov x19,x0
00bc1ac4	add w10,w8,w2
00bc1ac8	ldr w8,[x0, #0x28]
00bc1acc	ccmp w10,#0xf,#0x2,ls
00bc1ad0	cset w11,hi
00bc1ad4	add x12,x2,x8
00bc1ad8	orr w9,w9,w11
00bc1adc	cmp x12,#0xf
00bc1ae0	stp w10,w9,[x0]
00bc1ae4	b.hi 0x00bc1b08
00bc1ae8	add x8,x19,x8
00bc1aec	mov x20,x2
00bc1af0	add x0,x8,#0x18
00bc1af4	bl 0x00c2ffd0
00bc1af8	ldr w8,[x19, #0x28]
00bc1afc	add w8,w8,w20
00bc1b00	str w8,[x19, #0x28]
00bc1b04	b 0x00bc1c20
00bc1b08	mov w22,#0x79b1
00bc1b0c	mov w23,#0xca77
00bc1b10	add x21,x1,x2
00bc1b14	movk w22,#0x9e37, LSL #16
00bc1b18	movk w23,#0x85eb, LSL #16
00bc1b1c	cbz w8,0x00bc1b90
00bc1b20	mov w24,#0x10
00bc1b24	add x9,x19,#0x18
00bc1b28	mov x20,x1
00bc1b2c	sub w2,w24,w8
00bc1b30	add x0,x9,x8
00bc1b34	bl 0x00c2ffd0
00bc1b38	ldp w8,w9,[x19, #0x18]
00bc1b3c	ldp w10,w11,[x19, #0x8]
00bc1b40	madd w8,w8,w23,w10
00bc1b44	madd w9,w9,w23,w11
00bc1b48	ldp w10,w12,[x19, #0x20]
00bc1b4c	ror w8,w8,#0x13
00bc1b50	ldp w11,w13,[x19, #0x10]
00bc1b54	ror w9,w9,#0x13
00bc1b58	madd w10,w10,w23,w11
00bc1b5c	madd w11,w12,w23,w13
00bc1b60	mul w8,w8,w22
00bc1b64	mul w9,w9,w22
00bc1b68	ror w10,w10,#0x13
00bc1b6c	stp w8,w9,[x19, #0x8]
00bc1b70	ldr w8,[x19, #0x28]
00bc1b74	ror w11,w11,#0x13
00bc1b78	mul w10,w10,w22
00bc1b7c	str wzr,[x19, #0x28]
00bc1b80	sub w8,w24,w8
00bc1b84	mul w11,w11,w22
00bc1b88	add x1,x20,x8
00bc1b8c	stp w10,w11,[x19, #0x10]
00bc1b90	sub x8,x21,#0x10
00bc1b94	cmp x1,x8
00bc1b98	b.hi 0x00bc1c04
00bc1b9c	ldr w9,[x19, #0x8]
00bc1ba0	ldr w10,[x1]
00bc1ba4	ldp w11,w12,[x19, #0xc]
00bc1ba8	madd w9,w10,w23,w9
00bc1bac	ror w9,w9,#0x13
00bc1bb0	mul w9,w9,w22
00bc1bb4	str w9,[x19, #0x8]
00bc1bb8	ldr w10,[x1, #0x4]
00bc1bbc	madd w10,w10,w23,w11
00bc1bc0	ldr w11,[x19, #0x14]
00bc1bc4	ror w10,w10,#0x13
00bc1bc8	mul w10,w10,w22
00bc1bcc	str w10,[x19, #0xc]
00bc1bd0	ldr w10,[x1, #0x8]
00bc1bd4	madd w10,w10,w23,w12
00bc1bd8	ror w10,w10,#0x13
00bc1bdc	mul w10,w10,w22
00bc1be0	str w10,[x19, #0x10]
00bc1be4	ldr w10,[x1, #0xc]
00bc1be8	add x1,x1,#0x10
00bc1bec	cmp x1,x8
00bc1bf0	madd w10,w10,w23,w11
00bc1bf4	ror w10,w10,#0x13
00bc1bf8	mul w10,w10,w22
00bc1bfc	str w10,[x19, #0x14]
00bc1c00	b.ls 0x00bc1ba0
00bc1c04	cmp x1,x21
00bc1c08	b.cs 0x00bc1c20
00bc1c0c	sub x20,x21,x1
00bc1c10	add x0,x19,#0x18
00bc1c14	mov x2,x20
00bc1c18	bl 0x00c2ffd0
00bc1c1c	str w20,[x19, #0x28]
00bc1c20	ldp x20,x19,[sp, #0x30]
00bc1c24	ldp x22,x21,[sp, #0x20]
00bc1c28	ldp x24,x23,[sp, #0x10]
00bc1c2c	ldp x29,x30,[sp], #0x40
00bc1c30	mov w0,wzr
00bc1c34	ret
