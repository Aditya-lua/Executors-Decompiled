; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::sentry::~sentry @ 00bd5a9c
00bd5a9c	paciasp
00bd5aa0	stp x29,x30,[sp, #-0x20]!
00bd5aa4	str x19,[sp, #0x10]
00bd5aa8	mov x29,sp
00bd5aac	ldr x8,[x0, #0x8]
00bd5ab0	ldr x9,[x8]
00bd5ab4	ldur x9,[x9, #-0x18]
00bd5ab8	add x8,x8,x9
00bd5abc	ldr x9,[x8, #0x28]
00bd5ac0	cbz x9,0x00bd5b24
00bd5ac4	ldr w9,[x8, #0x20]
00bd5ac8	cbnz w9,0x00bd5b24
00bd5acc	ldrb w8,[x8, #0x9]
00bd5ad0	tbz w8,#0x5,0x00bd5b24
00bd5ad4	mov x19,x0
00bd5ad8	bl 0x00c43c10
00bd5adc	cbnz w0,0x00bd5b24
00bd5ae0	ldr x8,[x19, #0x8]
00bd5ae4	ldr x9,[x8]
00bd5ae8	ldur x9,[x9, #-0x18]
00bd5aec	add x8,x8,x9
00bd5af0	ldr x0,[x8, #0x28]
00bd5af4	ldr x8,[x0]
00bd5af8	ldr x8,[x8, #0x30]
00bd5afc	blr x8
00bd5b00	cmn w0,#0x1
00bd5b04	b.ne 0x00bd5b24
00bd5b08	ldr x8,[x19, #0x8]
00bd5b0c	ldr x9,[x8]
00bd5b10	ldur x9,[x9, #-0x18]
00bd5b14	add x0,x8,x9
00bd5b18	ldr w8,[x0, #0x20]
00bd5b1c	orr w1,w8,#0x1
00bd5b20	bl 0x00c30130
00bd5b24	ldr x19,[sp, #0x10]
00bd5b28	ldp x29,x30,[sp], #0x20
00bd5b2c	autiasp
00bd5b30	ret
