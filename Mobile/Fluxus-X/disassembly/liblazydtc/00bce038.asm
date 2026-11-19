; FUN_00bce038 @ 00bce038
00bce038	paciasp
00bce03c	sub sp,sp,#0x30
00bce040	stp x29,x30,[sp, #0x10]
00bce044	stp x20,x19,[sp, #0x20]
00bce048	add x29,sp,#0x10
00bce04c	mov x20,x0
00bce050	mov w0,#0x20
00bce054	bl 0x00c30000
00bce058	adrp x8,0xd26000
00bce05c	add x8,x8,#0x720
00bce060	mov x19,x0
00bce064	ldarb w8,[x8]
00bce068	tbz w8,#0x0,0x00bce0a4
00bce06c	mov w8,#0x1
00bce070	nop
00bce074	adr x9,0xcca5f8
00bce078	stp x8,x9,[sp]
00bce07c	mov x2,sp
00bce080	mov x0,x19
00bce084	mov x1,x20
00bce088	bl 0x00c43f20
00bce08c	adrp x1,0xcb5000
00bce090	adrp x2,0xcb5000
00bce094	mov x0,x19
00bce098	ldr x1,[x1, #0xb50]
00bce09c	ldr x2,[x2, #0xb38]
00bce0a0	bl 0x00c30020
00bce0a4	adrp x0,0xd26000
00bce0a8	add x0,x0,#0x720
00bce0ac	bl 0x00c2fe90
00bce0b0	cbz w0,0x00bce06c
00bce0b4	adrp x0,0xd26000
00bce0b8	add x0,x0,#0x720
00bce0bc	bl 0x00c2fea0
00bce0c0	b 0x00bce06c
