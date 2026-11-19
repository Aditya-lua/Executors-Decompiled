; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::sentry::~sentry @ 00bd1088
00bd1088	paciasp
00bd108c	stp x29,x30,[sp, #-0x20]!
00bd1090	str x19,[sp, #0x10]
00bd1094	mov x29,sp
00bd1098	ldr x8,[x0, #0x8]
00bd109c	ldr x9,[x8]
00bd10a0	ldur x9,[x9, #-0x18]
00bd10a4	add x8,x8,x9
00bd10a8	ldr x9,[x8, #0x28]
00bd10ac	cbz x9,0x00bd1110
00bd10b0	ldr w9,[x8, #0x20]
00bd10b4	cbnz w9,0x00bd1110
00bd10b8	ldrb w8,[x8, #0x9]
00bd10bc	tbz w8,#0x5,0x00bd1110
00bd10c0	mov x19,x0
00bd10c4	bl 0x00c43c10
00bd10c8	cbnz w0,0x00bd1110
00bd10cc	ldr x8,[x19, #0x8]
00bd10d0	ldr x9,[x8]
00bd10d4	ldur x9,[x9, #-0x18]
00bd10d8	add x8,x8,x9
00bd10dc	ldr x0,[x8, #0x28]
00bd10e0	ldr x8,[x0]
00bd10e4	ldr x8,[x8, #0x30]
00bd10e8	blr x8
00bd10ec	cmn w0,#0x1
00bd10f0	b.ne 0x00bd1110
00bd10f4	ldr x8,[x19, #0x8]
00bd10f8	ldr x9,[x8]
00bd10fc	ldur x9,[x9, #-0x18]
00bd1100	add x0,x8,x9
00bd1104	ldr w8,[x0, #0x20]
00bd1108	orr w1,w8,#0x1
00bd110c	bl 0x00c30130
00bd1110	ldr x19,[sp, #0x10]
00bd1114	ldp x29,x30,[sp], #0x20
00bd1118	autiasp
00bd111c	ret
