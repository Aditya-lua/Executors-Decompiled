; std::__ndk1::__codecvt_utf8_utf16<char16_t>::do_out @ 00c019b4
00c019b4	paciasp
00c019b8	sub sp,sp,#0x30
00c019bc	stp x29,x30,[sp, #0x10]
00c019c0	stp x20,x19,[sp, #0x20]
00c019c4	add x29,sp,#0x10
00c019c8	mov x19,x7
00c019cc	mov x9,x6
00c019d0	mov x8,x5
00c019d4	ldr x6,[x0, #0x10]
00c019d8	ldr w7,[x0, #0x18]
00c019dc	mov x20,x4
00c019e0	mov x1,x3
00c019e4	mov x0,x2
00c019e8	add x2,sp,#0x8
00c019ec	mov x5,sp
00c019f0	mov x3,x8
00c019f4	mov x4,x9
00c019f8	bl 0x00bfea60
00c019fc	ldp x9,x8,[sp]
00c01a00	str x8,[x20]
00c01a04	str x9,[x19]
00c01a08	ldp x20,x19,[sp, #0x20]
00c01a0c	ldp x29,x30,[sp, #0x10]
00c01a10	add sp,sp,#0x30
00c01a14	autiasp
00c01a18	ret
