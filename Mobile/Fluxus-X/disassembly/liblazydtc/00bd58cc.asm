; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_ostream @ 00bd58cc
00bd58cc	paciasp
00bd58d0	stp x29,x30,[sp, #-0x20]!
00bd58d4	stp x20,x19,[sp, #0x10]
00bd58d8	mov x29,sp
00bd58dc	adrp x8,0xcb5000
00bd58e0	mov x19,x0
00bd58e4	mov x20,x0
00bd58e8	ldr x8,[x8, #0xba8]
00bd58ec	str xzr,[x0, #0x38]
00bd58f0	add x9,x8,#0x40
00bd58f4	add x8,x8,#0x18
00bd58f8	str x9,[x20, #0x8]!
00bd58fc	str x8,[x0]
00bd5900	mov x0,x20
00bd5904	bl 0x00c30100
00bd5908	mov w8,#0xffffffff
00bd590c	str xzr,[x19, #0x90]
00bd5910	str w8,[x19, #0x98]
00bd5914	ldp x20,x19,[sp, #0x10]
00bd5918	ldp x29,x30,[sp], #0x20
00bd591c	autiasp
00bd5920	ret
