; _INIT_1 @ 00c2bba8
00c2bba8	bti c
00c2bbac	adrp x8,0xd28000
00c2bbb0	ldr x8,[x8, #0xe8]
00c2bbb4	cbz x8,0x00c2bbbc
00c2bbb8	ret
00c2bbbc	paciasp
00c2bbc0	sub sp,sp,#0x70
00c2bbc4	stp x30,x19,[sp, #0x60]
00c2bbc8	adrp x0,0x2ab000
00c2bbcc	add x0,x0,#0x2fd
00c2bbd0	mov x1,sp
00c2bbd4	bl 0x00c43960
00c2bbd8	cmp w0,#0x0
00c2bbdc	b.le 0x00c2bbf8
00c2bbe0	adrp x1,0x2b1000
00c2bbe4	add x1,x1,#0x1f9
00c2bbe8	mov x0,sp
00c2bbec	mov w2,#0xa
00c2bbf0	bl 0x00c31bb0
00c2bbf4	cbz w0,0x00c2bc24
00c2bbf8	mov w0,#0x10
00c2bbfc	bl 0x00c3ed70
00c2bc00	mov x19,x0
00c2bc04	mov w0,#0x1a
00c2bc08	bl 0x00c3ed70
00c2bc0c	mov w8,#0x18
00c2bc10	str x0,[sp, #0x10]
00c2bc14	orr x0,x19,#0x4000000000000000
00c2bc18	mov x1,sp
00c2bc1c	stp x8,x19,[sp]
00c2bc20	bl 0x00c2b9bc
00c2bc24	ldp x30,x19,[sp, #0x60]
00c2bc28	add sp,sp,#0x70
00c2bc2c	autiasp
00c2bc30	ret
