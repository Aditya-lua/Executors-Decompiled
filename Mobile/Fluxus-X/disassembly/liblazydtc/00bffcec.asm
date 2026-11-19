; std::__ndk1::__codecvt_utf8<wchar_t>::do_out @ 00bffcec
00bffcec	paciasp
00bffcf0	sub sp,sp,#0x30
00bffcf4	stp x29,x30,[sp, #0x10]
00bffcf8	stp x20,x19,[sp, #0x20]
00bffcfc	add x29,sp,#0x10
00bffd00	mov x19,x7
00bffd04	mov x9,x6
00bffd08	mov x8,x5
00bffd0c	ldr x6,[x0, #0x18]
00bffd10	ldr w7,[x0, #0x20]
00bffd14	mov x20,x4
00bffd18	mov x1,x3
00bffd1c	mov x0,x2
00bffd20	add x2,sp,#0x8
00bffd24	mov x5,sp
00bffd28	mov x3,x8
00bffd2c	mov x4,x9
00bffd30	bl 0x00bff480
00bffd34	ldp x9,x8,[sp]
00bffd38	str x8,[x20]
00bffd3c	str x9,[x19]
00bffd40	ldp x20,x19,[sp, #0x20]
00bffd44	ldp x29,x30,[sp, #0x10]
00bffd48	add sp,sp,#0x30
00bffd4c	autiasp
00bffd50	ret
