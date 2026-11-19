; EVP_EncryptUpdate @ 00a5afcc
00a5afcc	str x19,[sp, #-0x20]!
00a5afd0	stp x29,x30,[sp, #0x10]
00a5afd4	add x29,sp,#0x10
00a5afd8	cbz x2,0x00a5b060
00a5afdc	str wzr,[x2]
00a5afe0	ldr w9,[x0, #0x10]
00a5afe4	mov x19,x2
00a5afe8	cbz w9,0x00a5b08c
00a5afec	ldr x9,[x0]
00a5aff0	cbz x9,0x00a5b0b4
00a5aff4	ldr x10,[x9, #0x78]
00a5aff8	mov x8,x3
00a5affc	cbz x10,0x00a5b0dc
00a5b000	ldrsw x10,[x9, #0x4]
00a5b004	cmp w10,#0x1
00a5b008	b.lt 0x00a5b0ec
00a5b00c	ldr x9,[x9, #0xa8]
00a5b010	cbz x9,0x00a5b0ec
00a5b014	ldr x0,[x0, #0xa8]
00a5b018	cmp w10,#0x1
00a5b01c	sxtw x5,w4
00a5b020	csel x10,xzr,x10,eq
00a5b024	add x3,x10,x5
00a5b028	add x2,sp,#0x8
00a5b02c	mov x4,x8
00a5b030	blr x9
00a5b034	cbz w0,0x00a5b11c
00a5b038	ldr x8,[sp, #0x8]
00a5b03c	lsr x9,x8,#0x1f
00a5b040	cbz x9,0x00a5b128
00a5b044	bl 0x00c342a0
00a5b048	adrp x0,0x2a5000
00a5b04c	adrp x2,0x2d5000
00a5b050	add x0,x0,#0xf9d
00a5b054	add x2,x2,#0xcce
00a5b058	mov w1,#0x2b2
00a5b05c	b 0x00a5b104
00a5b060	bl 0x00c342a0
00a5b064	adrp x0,0x2a5000
00a5b068	adrp x2,0x2d5000
00a5b06c	add x0,x0,#0xf9d
00a5b070	add x2,x2,#0xcce
00a5b074	mov w1,#0x293
00a5b078	bl 0x00c342b0
00a5b07c	mov w1,#0x102
00a5b080	orr w0,wzr,#0x6
00a5b084	movk w1,#0xc, LSL #16
00a5b088	b 0x00a5b110
00a5b08c	bl 0x00c342a0
00a5b090	adrp x0,0x2a5000
00a5b094	adrp x2,0x2d5000
00a5b098	add x0,x0,#0xf9d
00a5b09c	add x2,x2,#0xcce
00a5b0a0	mov w1,#0x299
00a5b0a4	bl 0x00c342b0
00a5b0a8	orr w0,wzr,#0x6
00a5b0ac	mov w1,#0x94
00a5b0b0	b 0x00a5b110
00a5b0b4	bl 0x00c342a0
00a5b0b8	adrp x0,0x2a5000
00a5b0bc	adrp x2,0x2d5000
00a5b0c0	add x0,x0,#0xf9d
00a5b0c4	add x2,x2,#0xcce
00a5b0c8	mov w1,#0x29e
00a5b0cc	bl 0x00c342b0
00a5b0d0	orr w0,wzr,#0x6
00a5b0d4	mov w1,#0x83
00a5b0d8	b 0x00a5b110
00a5b0dc	mov x2,x19
00a5b0e0	mov x3,x8
00a5b0e4	bl 0x00a5bc20
00a5b0e8	b 0x00a5b11c
00a5b0ec	bl 0x00c342a0
00a5b0f0	adrp x0,0x2a5000
00a5b0f4	adrp x2,0x2d5000
00a5b0f8	add x0,x0,#0xf9d
00a5b0fc	add x2,x2,#0xcce
00a5b100	mov w1,#0x2a8
00a5b104	bl 0x00c342b0
00a5b108	orr w0,wzr,#0x6
00a5b10c	mov w1,#0xbd
00a5b110	mov x2,xzr
00a5b114	bl 0x00c342c0
00a5b118	mov w0,wzr
00a5b11c	ldp x29,x30,[sp, #0x10]
00a5b120	ldr x19,[sp], #0x20
00a5b124	ret
00a5b128	str w8,[x19]
00a5b12c	b 0x00a5b11c
