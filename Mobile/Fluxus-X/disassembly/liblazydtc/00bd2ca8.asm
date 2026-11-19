; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::basic_istream @ 00bd2ca8
00bd2ca8	paciasp
00bd2cac	stp x29,x30,[sp, #-0x20]!
00bd2cb0	str x19,[sp, #0x10]
00bd2cb4	mov x29,sp
00bd2cb8	ldr x8,[x1]
00bd2cbc	str x8,[x0]
00bd2cc0	ldur x8,[x8, #-0x18]
00bd2cc4	ldr x9,[x1, #0x8]
00bd2cc8	str xzr,[x0, #0x8]
00bd2ccc	mov x1,x2
00bd2cd0	str x9,[x0, x8#0x0]
00bd2cd4	ldr x8,[x0]
00bd2cd8	ldur x8,[x8, #-0x18]
00bd2cdc	add x19,x0,x8
00bd2ce0	mov x0,x19
00bd2ce4	bl 0x00c30100
00bd2ce8	mov w8,#0xffffffff
00bd2cec	str xzr,[x19, #0x88]
00bd2cf0	str w8,[x19, #0x90]
00bd2cf4	ldr x19,[sp, #0x10]
00bd2cf8	ldp x29,x30,[sp], #0x20
00bd2cfc	autiasp
00bd2d00	ret
