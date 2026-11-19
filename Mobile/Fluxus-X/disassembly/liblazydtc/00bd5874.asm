; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_ostream @ 00bd5874
00bd5874	paciasp
00bd5878	stp x29,x30,[sp, #-0x20]!
00bd587c	str x19,[sp, #0x10]
00bd5880	mov x29,sp
00bd5884	ldr x8,[x1]
00bd5888	str x8,[x0]
00bd588c	ldur x8,[x8, #-0x18]
00bd5890	ldr x9,[x1, #0x8]
00bd5894	mov x1,x2
00bd5898	str x9,[x0, x8#0x0]
00bd589c	ldr x8,[x0]
00bd58a0	ldur x8,[x8, #-0x18]
00bd58a4	add x19,x0,x8
00bd58a8	mov x0,x19
00bd58ac	bl 0x00c30100
00bd58b0	mov w8,#0xffffffff
00bd58b4	str xzr,[x19, #0x88]
00bd58b8	str w8,[x19, #0x90]
00bd58bc	ldr x19,[sp, #0x10]
00bd58c0	ldp x29,x30,[sp], #0x20
00bd58c4	autiasp
00bd58c8	ret
