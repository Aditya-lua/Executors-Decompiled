; EVP_PKEY_get_raw_public_key @ 00a6d024
00a6d024	sub sp,sp,#0x30
00a6d028	stp x29,x30,[sp, #0x20]
00a6d02c	add x29,sp,#0x20
00a6d030	stur x1,[x29, #-0x8]
00a6d034	ldr x8,[x0, #0x60]
00a6d038	cbz x8,0x00a6d06c
00a6d03c	cmp x1,#0x0
00a6d040	sub x8,x29,#0x8
00a6d044	csel x8,xzr,x8,eq
00a6d048	stp x8,x2,[sp]
00a6d04c	adrp x2,0xa6c000
00a6d050	mov w9,#0x2
00a6d054	add x2,x2,#0xfa8
00a6d058	mov w1,#0x2
00a6d05c	mov x3,sp
00a6d060	str w9,[sp, #0x10]
00a6d064	bl 0x00c3d300
00a6d068	b 0x00a6d100
00a6d06c	ldr x8,[x0, #0x8]
00a6d070	cbz x8,0x00a6d08c
00a6d074	ldr x8,[x8, #0x110]
00a6d078	cbz x8,0x00a6d0a8
00a6d07c	blr x8
00a6d080	cbz w0,0x00a6d0d0
00a6d084	mov w0,#0x1
00a6d088	b 0x00a6d100
00a6d08c	bl 0x00c342a0
00a6d090	adrp x0,0x2c1000
00a6d094	adrp x2,0x2cf000
00a6d098	add x0,x0,#0xcf9
00a6d09c	add x2,x2,#0xc04
00a6d0a0	mov w1,#0x255
00a6d0a4	b 0x00a6d0c0
00a6d0a8	bl 0x00c342a0
00a6d0ac	adrp x0,0x2c1000
00a6d0b0	adrp x2,0x2cf000
00a6d0b4	add x0,x0,#0xcf9
00a6d0b8	add x2,x2,#0xc04
00a6d0bc	mov w1,#0x25a
00a6d0c0	bl 0x00c342b0
00a6d0c4	orr w0,wzr,#0x6
00a6d0c8	mov w1,#0x96
00a6d0cc	b 0x00a6d0f4
00a6d0d0	bl 0x00c342a0
00a6d0d4	adrp x0,0x2c1000
00a6d0d8	adrp x2,0x2cf000
00a6d0dc	add x0,x0,#0xcf9
00a6d0e0	add x2,x2,#0xc04
00a6d0e4	mov w1,#0x25f
00a6d0e8	bl 0x00c342b0
00a6d0ec	orr w0,wzr,#0x6
00a6d0f0	mov w1,#0xb6
00a6d0f4	mov x2,xzr
00a6d0f8	bl 0x00c342c0
00a6d0fc	mov w0,wzr
00a6d100	ldp x29,x30,[sp, #0x20]
00a6d104	add sp,sp,#0x30
00a6d108	ret
