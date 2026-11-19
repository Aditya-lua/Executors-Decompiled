; std::__ndk1::basic_iostream<char,std::__ndk1::char_traits<char>>::swap @ 00bd2484
00bd2484	paciasp
00bd2488	stp x29,x30,[sp, #-0x20]!
00bd248c	stp x20,x19,[sp, #0x10]
00bd2490	mov x29,sp
00bd2494	ldp x11,x8,[x1]
00bd2498	ldp x10,x9,[x0]
00bd249c	str x8,[x0, #0x8]
00bd24a0	str x9,[x1, #0x8]
00bd24a4	ldur x8,[x10, #-0x18]
00bd24a8	ldur x9,[x11, #-0x18]
00bd24ac	add x19,x0,x8
00bd24b0	add x20,x1,x9
00bd24b4	mov x0,x19
00bd24b8	mov x1,x20
00bd24bc	bl 0x00c43f40
00bd24c0	ldr x8,[x20, #0x88]
00bd24c4	ldr x9,[x19, #0x88]
00bd24c8	ldr w10,[x20, #0x90]
00bd24cc	str x8,[x19, #0x88]
00bd24d0	ldr w8,[x19, #0x90]
00bd24d4	str x9,[x20, #0x88]
00bd24d8	str w10,[x19, #0x90]
00bd24dc	str w8,[x20, #0x90]
00bd24e0	ldp x20,x19,[sp, #0x10]
00bd24e4	ldp x29,x30,[sp], #0x20
00bd24e8	autiasp
00bd24ec	ret
