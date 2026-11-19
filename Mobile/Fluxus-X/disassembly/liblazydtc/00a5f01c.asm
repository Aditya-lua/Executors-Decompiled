; EVP_Cipher @ 00a5f01c
00a5f01c	ldr x9,[x0]
00a5f020	mov x4,x2
00a5f024	ldr x8,[x9, #0x78]
00a5f028	cbz x8,0x00a5f074
00a5f02c	sub sp,sp,#0x20
00a5f030	stp x29,x30,[sp, #0x10]
00a5f034	str xzr,[sp, #0x8]
00a5f038	ldr x10,[x9, #0xb8]
00a5f03c	ldrsw x8,[x9, #0x4]
00a5f040	add x29,sp,#0x10
00a5f044	cbz x10,0x00a5f084
00a5f048	ldr x0,[x0, #0xa8]
00a5f04c	cmp w8,#0x1
00a5f050	mov w5,w3
00a5f054	csel x8,xzr,x8,eq
00a5f058	add x3,x8,x5
00a5f05c	add x2,sp,#0x8
00a5f060	blr x10
00a5f064	ldr w8,[sp, #0x8]
00a5f068	cmp w0,#0x0
00a5f06c	csinv w0,w8,wzr,ne
00a5f070	b 0x00a5f0c4
00a5f074	ldr x5,[x9, #0x28]
00a5f078	mov w3,w3
00a5f07c	mov x2,x4
00a5f080	br x5
00a5f084	cbz x4,0x00a5f0ac
00a5f088	ldr x9,[x9, #0xa8]
00a5f08c	ldr x0,[x0, #0xa8]
00a5f090	cmp w8,#0x1
00a5f094	mov w5,w3
00a5f098	csel x8,xzr,x8,eq
00a5f09c	add x3,x8,x5
00a5f0a0	add x2,sp,#0x8
00a5f0a4	blr x9
00a5f0a8	b 0x00a5f0c4
00a5f0ac	ldr x9,[x9, #0xb0]
00a5f0b0	ldr x0,[x0, #0xa8]
00a5f0b4	cmp w8,#0x1
00a5f0b8	csel x3,xzr,x8,eq
00a5f0bc	add x2,sp,#0x8
00a5f0c0	blr x9
00a5f0c4	ldp x29,x30,[sp, #0x10]
00a5f0c8	add sp,sp,#0x20
00a5f0cc	ret
