; GENERAL_NAME_get0_value @ 00af5154
00af5154	cbz x1,0x00af5160
00af5158	ldr w8,[x0]
00af515c	str w8,[x1]
00af5160	ldr w8,[x0]
00af5164	cmp w8,#0x8
00af5168	mov x8,xzr
00af516c	b.hi 0x00af5174
00af5170	ldr x8,[x0, #0x8]
00af5174	mov x0,x8
00af5178	ret
