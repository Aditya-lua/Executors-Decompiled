; FUN_00bcc1b4 @ 00bcc1b4
00bcc1b4	paciasp
00bcc1b8	stp x29,x30,[sp, #-0x20]!
00bcc1bc	stp x20,x19,[sp, #0x10]
00bcc1c0	mov x29,sp
00bcc1c4	mov w20,w0
00bcc1c8	mov w0,#0x20
00bcc1cc	bl 0x00c30000
00bcc1d0	adrp x8,0xd26000
00bcc1d4	add x8,x8,#0x700
00bcc1d8	mov x19,x0
00bcc1dc	ldarb w8,[x8]
00bcc1e0	tbz w8,#0x0,0x00bcc210
00bcc1e4	mov w1,w20
00bcc1e8	nop
00bcc1ec	adr x2,0xcca5f0
00bcc1f0	mov x0,x19
00bcc1f4	bl 0x00c314d0
00bcc1f8	adrp x1,0xcb4000
00bcc1fc	adrp x2,0xcb4000
00bcc200	mov x0,x19
00bcc204	ldr x1,[x1, #0xd20]
00bcc208	ldr x2,[x2, #0xd08]
00bcc20c	bl 0x00c30020
00bcc210	adrp x0,0xd26000
00bcc214	add x0,x0,#0x700
00bcc218	bl 0x00c2fe90
00bcc21c	cbz w0,0x00bcc1e4
00bcc220	adrp x0,0xd26000
00bcc224	add x0,x0,#0x700
00bcc228	bl 0x00c2fea0
00bcc22c	b 0x00bcc1e4
