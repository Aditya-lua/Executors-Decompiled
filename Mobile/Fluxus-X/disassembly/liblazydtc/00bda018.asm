; _INIT_2 @ 00bda018
00bda018	paciasp
00bda01c	stp x29,x30,[sp, #-0x20]!
00bda020	str x19,[sp, #0x10]
00bda024	mov x29,sp
00bda028	adrp x19,0xd26000
00bda02c	add x19,x19,#0xfa0
00bda030	mov x0,x19
00bda034	bl 0x00c440c0
00bda038	adrp x0,0xcb5000
00bda03c	nop
00bda040	adr x2,0xc48880
00bda044	ldr x0,[x0, #0xbf8]
00bda048	mov x1,x19
00bda04c	ldr x19,[sp, #0x10]
00bda050	ldp x29,x30,[sp], #0x20
00bda054	autiasp
00bda058	b 0x00c2fe70
