; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::tellp @ 00bd2098
00bd2098	bti c
00bd209c	ldr x8,[x0]
00bd20a0	mov w10,#0x5
00bd20a4	ldur x8,[x8, #-0x18]
00bd20a8	add x8,x0,x8
00bd20ac	ldrb w9,[x8, #0x20]
00bd20b0	tst w9,w10
00bd20b4	b.eq 0x00bd20c4
00bd20b8	mov x0,xzr
00bd20bc	mov x1,#-0x1
00bd20c0	ret
00bd20c4	paciasp
00bd20c8	stp x29,x30,[sp, #-0x10]!
00bd20cc	mov x29,sp
00bd20d0	ldr x0,[x8, #0x28]
00bd20d4	mov x1,xzr
00bd20d8	mov w2,#0x1
00bd20dc	mov w3,#0x10
00bd20e0	ldr x8,[x0]
00bd20e4	ldr x8,[x8, #0x20]
00bd20e8	blr x8
00bd20ec	ldp x29,x30,[sp], #0x10
00bd20f0	autiasp
00bd20f4	ret
