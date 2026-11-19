; std::__ndk1::codecvt<char16_t,char,mbstate_t>::do_out @ 00bfe9fc
00bfe9fc	paciasp
00bfea00	sub sp,sp,#0x30
00bfea04	stp x29,x30,[sp, #0x10]
00bfea08	stp x20,x19,[sp, #0x20]
00bfea0c	add x29,sp,#0x10
00bfea10	mov x8,x5
00bfea14	mov x19,x7
00bfea18	mov x20,x4
00bfea1c	mov x1,x3
00bfea20	mov x0,x2
00bfea24	add x2,sp,#0x8
00bfea28	mov x5,sp
00bfea2c	mov x3,x8
00bfea30	mov x4,x6
00bfea34	mov w6,#0x10ffff
00bfea38	mov w7,wzr
00bfea3c	bl 0x00bfea60
00bfea40	ldp x9,x8,[sp]
00bfea44	str x8,[x20]
00bfea48	str x9,[x19]
00bfea4c	ldp x20,x19,[sp, #0x20]
00bfea50	ldp x29,x30,[sp, #0x10]
00bfea54	add sp,sp,#0x30
00bfea58	autiasp
00bfea5c	ret
