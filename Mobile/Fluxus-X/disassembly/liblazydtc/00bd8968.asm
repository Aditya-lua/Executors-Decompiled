; FUN_00bd8968 @ 00bd8968
00bd8968	paciasp
00bd896c	stp x29,x30,[sp, #-0x20]!
00bd8970	str x19,[sp, #0x10]
00bd8974	mov x29,sp
00bd8978	mov w0,#0x8
00bd897c	bl 0x00c30000
00bd8980	mov x19,x0
00bd8984	bl 0x00c333c0
00bd8988	adrp x1,0xcb4000
00bd898c	adrp x2,0xcb4000
00bd8990	mov x0,x19
00bd8994	ldr x1,[x1, #0xf80]
00bd8998	ldr x2,[x2, #0xf78]
00bd899c	bl 0x00c30020
