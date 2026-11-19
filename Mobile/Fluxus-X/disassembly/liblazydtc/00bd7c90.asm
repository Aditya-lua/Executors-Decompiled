; std::__ndk1::basic_stringstream<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator= @ 00bd7c90
00bd7c90	paciasp
00bd7c94	stp x29,x30,[sp, #-0x30]!
00bd7c98	stp x22,x21,[sp, #0x10]
00bd7c9c	stp x20,x19,[sp, #0x20]
00bd7ca0	mov x29,sp
00bd7ca4	ldp x11,x8,[x1]
00bd7ca8	mov x19,x1
00bd7cac	ldp x10,x9,[x0]
00bd7cb0	mov x20,x0
00bd7cb4	str x8,[x0, #0x8]
00bd7cb8	str x9,[x1, #0x8]
00bd7cbc	ldur x8,[x10, #-0x18]
00bd7cc0	ldur x9,[x11, #-0x18]
00bd7cc4	add x21,x0,x8
00bd7cc8	add x22,x1,x9
00bd7ccc	mov x0,x21
00bd7cd0	mov x1,x22
00bd7cd4	bl 0x00c43f40
00bd7cd8	ldr x8,[x22, #0x88]
00bd7cdc	ldr x9,[x21, #0x88]
00bd7ce0	add x0,x20,#0x18
00bd7ce4	ldr w10,[x22, #0x90]
00bd7ce8	add x1,x19,#0x18
00bd7cec	str x8,[x21, #0x88]
00bd7cf0	ldr w8,[x21, #0x90]
00bd7cf4	str x9,[x22, #0x88]
00bd7cf8	str w10,[x21, #0x90]
00bd7cfc	str w8,[x22, #0x90]
00bd7d00	bl 0x00c440b0
00bd7d04	mov x0,x20
00bd7d08	ldp x20,x19,[sp, #0x20]
00bd7d0c	ldp x22,x21,[sp, #0x10]
00bd7d10	ldp x29,x30,[sp], #0x30
00bd7d14	autiasp
00bd7d18	ret
