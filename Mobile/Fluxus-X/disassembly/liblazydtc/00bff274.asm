; std::__ndk1::codecvt<char16_t,char8_t,mbstate_t>::do_in @ 00bff274
00bff274	paciasp
00bff278	sub sp,sp,#0x30
00bff27c	stp x29,x30,[sp, #0x10]
00bff280	stp x20,x19,[sp, #0x20]
00bff284	add x29,sp,#0x10
00bff288	mov x8,x5
00bff28c	mov x19,x7
00bff290	mov x20,x4
00bff294	mov x1,x3
00bff298	mov x0,x2
00bff29c	add x2,sp,#0x8
00bff2a0	mov x5,sp
00bff2a4	mov x3,x8
00bff2a8	mov x4,x6
00bff2ac	mov w6,#0x10ffff
00bff2b0	mov w7,wzr
00bff2b4	bl 0x00bfed18
00bff2b8	ldp x9,x8,[sp]
00bff2bc	str x8,[x20]
00bff2c0	str x9,[x19]
00bff2c4	ldp x20,x19,[sp, #0x20]
00bff2c8	ldp x29,x30,[sp, #0x10]
00bff2cc	add sp,sp,#0x30
00bff2d0	autiasp
00bff2d4	ret
