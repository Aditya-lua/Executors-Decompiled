; std::__ndk1::basic_ostringstream<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator= @ 00bd7d1c
00bd7d1c	paciasp
00bd7d20	stp x29,x30,[sp, #-0x40]!
00bd7d24	str x23,[sp, #0x10]
00bd7d28	stp x22,x21,[sp, #0x20]
00bd7d2c	stp x20,x19,[sp, #0x30]
00bd7d30	mov x29,sp
00bd7d34	mov x20,x0
00bd7d38	mov x21,x1
00bd7d3c	mov x19,x0
00bd7d40	ldr x8,[x20], #0x8
00bd7d44	ldr x9,[x21], #0x8
00bd7d48	ldur x8,[x8, #-0x18]
00bd7d4c	ldur x9,[x9, #-0x18]
00bd7d50	add x22,x0,x8
00bd7d54	add x23,x1,x9
00bd7d58	mov x0,x22
00bd7d5c	mov x1,x23
00bd7d60	bl 0x00c43f40
00bd7d64	ldr x8,[x23, #0x88]
00bd7d68	ldr x9,[x22, #0x88]
00bd7d6c	mov x0,x20
00bd7d70	ldr w10,[x23, #0x90]
00bd7d74	mov x1,x21
00bd7d78	str x8,[x22, #0x88]
00bd7d7c	ldr w8,[x22, #0x90]
00bd7d80	str x9,[x23, #0x88]
00bd7d84	str w10,[x22, #0x90]
00bd7d88	str w8,[x23, #0x90]
00bd7d8c	bl 0x00c440b0
00bd7d90	mov x0,x19
00bd7d94	ldp x20,x19,[sp, #0x30]
00bd7d98	ldr x23,[sp, #0x10]
00bd7d9c	ldp x22,x21,[sp, #0x20]
00bd7da0	ldp x29,x30,[sp], #0x40
00bd7da4	autiasp
00bd7da8	ret
