; X509V3_get_section @ 00af49b0
00af49b0	mov x8,x0
00af49b4	ldr x0,[x0, #0x30]
00af49b8	cbz x0,0x00af49d0
00af49bc	ldr x8,[x8, #0x28]
00af49c0	cbz x8,0x00af49d0
00af49c4	ldr x2,[x8, #0x8]
00af49c8	cbz x2,0x00af49d0
00af49cc	br x2
00af49d0	stp x29,x30,[sp, #-0x10]!
00af49d4	mov x29,sp
00af49d8	bl 0x00c342a0
00af49dc	adrp x0,0x2aa000
00af49e0	adrp x2,0x2d4000
00af49e4	add x0,x0,#0x9f7
00af49e8	add x2,x2,#0x4b9
00af49ec	mov w1,#0x18b
00af49f0	bl 0x00c342b0
00af49f4	mov w0,#0x22
00af49f8	mov w1,#0x94
00af49fc	mov x2,xzr
00af4a00	bl 0x00c342c0
00af4a04	mov x0,xzr
00af4a08	ldp x29,x30,[sp], #0x10
00af4a0c	ret
