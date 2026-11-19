; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_day @ 00be9ae4
00be9ae4	paciasp
00be9ae8	stp x29,x30,[sp, #-0x20]!
00be9aec	stp x20,x19,[sp, #0x10]
00be9af0	mov x29,sp
00be9af4	mov x19,x4
00be9af8	mov x0,x2
00be9afc	mov x20,x1
00be9b00	mov x1,x3
00be9b04	mov x2,x4
00be9b08	mov x3,x5
00be9b0c	mov w4,#0x2
00be9b10	bl 0x00bea2fc
00be9b14	ldr w8,[x19]
00be9b18	sub w9,w0,#0x1
00be9b1c	cmp w9,#0x1e
00be9b20	b.hi 0x00be9b30
00be9b24	tbnz w8,#0x2,0x00be9b30
00be9b28	str w0,[x20]
00be9b2c	b 0x00be9b38
00be9b30	orr w8,w8,#0x4
00be9b34	str w8,[x19]
00be9b38	ldp x20,x19,[sp, #0x10]
00be9b3c	ldp x29,x30,[sp], #0x20
00be9b40	autiasp
00be9b44	ret
