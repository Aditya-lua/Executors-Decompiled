; std::__ndk1::__vector_base<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::~__vector_base @ 0098cde4
0098cde4	str x21,[sp, #-0x30]!
0098cde8	stp x20,x19,[sp, #0x10]
0098cdec	stp x29,x30,[sp, #0x20]
0098cdf0	add x29,sp,#0x20
0098cdf4	ldr x20,[x0]
0098cdf8	mov x19,x0
0098cdfc	cbz x20,0x0098ce34
0098ce00	ldr x8,[x19, #0x8]
0098ce04	cmp x8,x20
0098ce08	b.eq 0x0098ce44
0098ce0c	mov x21,x8
0098ce10	ldrb w9,[x21, #-0x18]!
0098ce14	tbz w9,#0x0,0x0098ce20
0098ce18	ldur x0,[x8, #-0x8]
0098ce1c	bl 0x00c301d0
0098ce20	cmp x20,x21
0098ce24	mov x8,x21
0098ce28	b.ne 0x0098ce10
0098ce2c	ldr x0,[x19]
0098ce30	b 0x0098ce48
0098ce34	ldp x29,x30,[sp, #0x20]
0098ce38	ldp x20,x19,[sp, #0x10]
0098ce3c	ldr x21,[sp], #0x30
0098ce40	ret
0098ce44	mov x0,x20
0098ce48	str x20,[x19, #0x8]
0098ce4c	ldp x29,x30,[sp, #0x20]
0098ce50	ldp x20,x19,[sp, #0x10]
0098ce54	ldr x21,[sp], #0x30
0098ce58	b 0x00c301d0
