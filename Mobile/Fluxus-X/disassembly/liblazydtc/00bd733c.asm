; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::tellp @ 00bd733c
00bd733c	bti c
00bd7340	ldr x8,[x0]
00bd7344	mov w10,#0x5
00bd7348	ldur x8,[x8, #-0x18]
00bd734c	add x8,x0,x8
00bd7350	ldrb w9,[x8, #0x20]
00bd7354	tst w9,w10
00bd7358	b.eq 0x00bd7368
00bd735c	mov x0,xzr
00bd7360	mov x1,#-0x1
00bd7364	ret
00bd7368	paciasp
00bd736c	stp x29,x30,[sp, #-0x10]!
00bd7370	mov x29,sp
00bd7374	ldr x0,[x8, #0x28]
00bd7378	mov x1,xzr
00bd737c	mov w2,#0x1
00bd7380	mov w3,#0x10
00bd7384	ldr x8,[x0]
00bd7388	ldr x8,[x8, #0x20]
00bd738c	blr x8
00bd7390	ldp x29,x30,[sp], #0x10
00bd7394	autiasp
00bd7398	ret
