; std::__ndk1::__codecvt_utf8_utf16<char32_t>::do_out @ 00c01ae8
00c01ae8	paciasp
00c01aec	sub sp,sp,#0x30
00c01af0	stp x29,x30,[sp, #0x10]
00c01af4	stp x20,x19,[sp, #0x20]
00c01af8	add x29,sp,#0x10
00c01afc	mov x19,x7
00c01b00	mov x9,x6
00c01b04	mov x8,x5
00c01b08	ldr x6,[x0, #0x10]
00c01b0c	ldr w7,[x0, #0x18]
00c01b10	mov x20,x4
00c01b14	mov x1,x3
00c01b18	mov x0,x2
00c01b1c	add x2,sp,#0x8
00c01b20	mov x5,sp
00c01b24	mov x3,x8
00c01b28	mov x4,x9
00c01b2c	bl 0x00c01460
00c01b30	ldp x9,x8,[sp]
00c01b34	str x8,[x20]
00c01b38	str x9,[x19]
00c01b3c	ldp x20,x19,[sp, #0x20]
00c01b40	ldp x29,x30,[sp, #0x10]
00c01b44	add sp,sp,#0x30
00c01b48	autiasp
00c01b4c	ret
