; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get_date @ 00be8e48
00be8e48	paciasp
00be8e4c	stp x29,x30,[sp, #-0x40]!
00be8e50	stp x24,x23,[sp, #0x10]
00be8e54	stp x22,x21,[sp, #0x20]
00be8e58	stp x20,x19,[sp, #0x30]
00be8e5c	mov x29,sp
00be8e60	mov x22,x0
00be8e64	ldr x8,[x0, #0x10]!
00be8e68	mov x19,x5
00be8e6c	mov x20,x4
00be8e70	mov x21,x3
00be8e74	ldr x8,[x8, #0x28]
00be8e78	mov x23,x2
00be8e7c	mov x24,x1
00be8e80	blr x8
00be8e84	mov x8,x0
00be8e88	mov x0,x22
00be8e8c	mov x1,x24
00be8e90	ldrb w9,[x8]
00be8e94	ldp x11,x10,[x8, #0x8]
00be8e98	mov x2,x23
00be8e9c	mov x3,x21
00be8ea0	mov x4,x20
00be8ea4	lsr x12,x9,#0x1
00be8ea8	tst w9,#0x1
00be8eac	mov x5,x19
00be8eb0	csinc x6,x10,x8,ne
00be8eb4	csel x8,x12,x11,eq
00be8eb8	add x7,x6,x8
00be8ebc	ldp x20,x19,[sp, #0x30]
00be8ec0	ldp x22,x21,[sp, #0x20]
00be8ec4	ldp x24,x23,[sp, #0x10]
00be8ec8	ldp x29,x30,[sp], #0x40
00be8ecc	autiasp
00be8ed0	b 0x00c44190
