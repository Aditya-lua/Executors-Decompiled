; X509V3_EXT_add_list @ 00af5880
00af5880	str x19,[sp, #-0x20]!
00af5884	stp x29,x30,[sp, #0x10]
00af5888	ldr w8,[x0]
00af588c	add x29,sp,#0x10
00af5890	cmn w8,#0x1
00af5894	b.eq 0x00af58b4
00af5898	mov x19,x0
00af589c	mov x0,x19
00af58a0	bl 0x00af56a4
00af58a4	cbz w0,0x00af58b8
00af58a8	ldr w8,[x19, #0x68]!
00af58ac	cmn w8,#0x1
00af58b0	b.ne 0x00af589c
00af58b4	mov w0,#0x1
00af58b8	ldp x29,x30,[sp, #0x10]
00af58bc	ldr x19,[sp], #0x20
00af58c0	ret
