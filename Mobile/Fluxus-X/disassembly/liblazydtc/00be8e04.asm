; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get_time @ 00be8e04
00be8e04	paciasp
00be8e08	sub sp,sp,#0x20
00be8e0c	stp x29,x30,[sp, #0x10]
00be8e10	add x29,sp,#0x10
00be8e14	mov x8,#0x4825
00be8e18	add x6,sp,#0x8
00be8e1c	movk x8,#0x253a, LSL #16
00be8e20	movk x8,#0x3a4d, LSL #32
00be8e24	movk x8,#0x5325, LSL #48
00be8e28	str x8,[sp, #0x8]
00be8e2c	add x8,sp,#0x8
00be8e30	add x7,x8,#0x8
00be8e34	bl 0x00c44190
00be8e38	ldp x29,x30,[sp, #0x10]
00be8e3c	add sp,sp,#0x20
00be8e40	autiasp
00be8e44	ret
