; std::__ndk1::iostream_category @ 00bcd9d8
00bcd9d8	paciasp
00bcd9dc	stp x29,x30,[sp, #-0x10]!
00bcd9e0	mov x29,sp
00bcd9e4	adrp x8,0xd26000
00bcd9e8	add x8,x8,#0x720
00bcd9ec	ldarb w8,[x8]
00bcd9f0	tbz w8,#0x0,0x00bcda08
00bcd9f4	nop
00bcd9f8	adr x0,0xcca5f8
00bcd9fc	ldp x29,x30,[sp], #0x10
00bcda00	autiasp
00bcda04	ret
00bcda08	adrp x0,0xd26000
00bcda0c	add x0,x0,#0x720
00bcda10	bl 0x00c2fe90
00bcda14	cbz w0,0x00bcd9f4
00bcda18	adrp x0,0xd26000
00bcda1c	add x0,x0,#0x720
00bcda20	bl 0x00c2fea0
00bcda24	b 0x00bcd9f4
