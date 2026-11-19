; FUN_00b4c024 @ 00b4c024
00b4c024	stp x20,x19,[sp, #-0x20]!
00b4c028	stp x29,x30,[sp, #0x10]
00b4c02c	add x29,sp,#0x10
00b4c030	mov x19,x1
00b4c034	mov x20,x0
00b4c038	bl 0x00b4cea0
00b4c03c	cbz w0,0x00b4c120
00b4c040	adrp x1,0x2a4000
00b4c044	add x1,x1,#0x2a
00b4c048	mov x0,x19
00b4c04c	bl 0x00c36530
00b4c050	cbz x0,0x00b4c060
00b4c054	add x1,x20,#0x40
00b4c058	bl 0x00c36510
00b4c05c	cbz w0,0x00b4c120
00b4c060	adrp x1,0x2a7000
00b4c064	add x1,x1,#0xf40
00b4c068	mov x0,x19
00b4c06c	bl 0x00c36530
00b4c070	cbnz x0,0x00b4c0ec
00b4c074	adrp x1,0x2d9000
00b4c078	add x1,x1,#0xd90
00b4c07c	mov x0,x19
00b4c080	bl 0x00c36530
00b4c084	cbnz x0,0x00b4c0ec
00b4c088	adrp x1,0x2a4000
00b4c08c	add x1,x1,#0x10a
00b4c090	mov x0,x19
00b4c094	bl 0x00c36530
00b4c098	cbnz x0,0x00b4c0ec
00b4c09c	adrp x1,0x2bb000
00b4c0a0	add x1,x1,#0x864
00b4c0a4	mov x0,x19
00b4c0a8	bl 0x00c36530
00b4c0ac	cbnz x0,0x00b4c0ec
00b4c0b0	adrp x1,0x2db000
00b4c0b4	add x1,x1,#0xfc2
00b4c0b8	mov x0,x19
00b4c0bc	bl 0x00c36530
00b4c0c0	cbnz x0,0x00b4c0ec
00b4c0c4	adrp x1,0x29d000
00b4c0c8	add x1,x1,#0xe2e
00b4c0cc	mov x0,x19
00b4c0d0	bl 0x00c36530
00b4c0d4	cbnz x0,0x00b4c0ec
00b4c0d8	adrp x1,0x2d3000
00b4c0dc	add x1,x1,#0x7c2
00b4c0e0	mov x0,x19
00b4c0e4	bl 0x00c36530
00b4c0e8	cbz x0,0x00b4c12c
00b4c0ec	bl 0x00c342a0
00b4c0f0	adrp x0,0x2b0000
00b4c0f4	adrp x2,0x2cc000
00b4c0f8	add x0,x0,#0xe65
00b4c0fc	add x2,x2,#0x774
00b4c100	mov w1,#0x2a1
00b4c104	bl 0x00c342b0
00b4c108	mov w1,#0x106
00b4c10c	mov w0,#0x39
00b4c110	movk w1,#0x8, LSL #16
00b4c114	mov x2,xzr
00b4c118	bl 0x00c342c0
00b4c11c	mov w0,wzr
00b4c120	ldp x29,x30,[sp, #0x10]
00b4c124	ldp x20,x19,[sp], #0x20
00b4c128	ret
00b4c12c	mov w0,#0x1
00b4c130	b 0x00b4c120
