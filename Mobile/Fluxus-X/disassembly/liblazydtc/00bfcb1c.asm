; std::__ndk1::ctype<char>::ctype @ 00bfcb1c
00bfcb1c	bti c
00bfcb20	adrp x8,0xcb5000
00bfcb24	sub x9,x3,#0x1
00bfcb28	ldr x8,[x8, #0xe18]
00bfcb2c	stp x9,x1,[x0, #0x8]
00bfcb30	strb w2,[x0, #0x18]
00bfcb34	add x8,x8,#0x10
00bfcb38	str x8,[x0]
00bfcb3c	cbz x1,0x00bfcb44
00bfcb40	ret
00bfcb44	adrp x8,0x78a000
00bfcb48	add x8,x8,#0x8e8
00bfcb4c	str x8,[x0, #0x10]
00bfcb50	ret
