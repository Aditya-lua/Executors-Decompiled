; std::__ndk1::codecvt<char16_t,char,mbstate_t>::do_in @ 00bfecb4
00bfecb4	paciasp
00bfecb8	sub sp,sp,#0x30
00bfecbc	stp x29,x30,[sp, #0x10]
00bfecc0	stp x20,x19,[sp, #0x20]
00bfecc4	add x29,sp,#0x10
00bfecc8	mov x8,x5
00bfeccc	mov x19,x7
00bfecd0	mov x20,x4
00bfecd4	mov x1,x3
00bfecd8	mov x0,x2
00bfecdc	add x2,sp,#0x8
00bfece0	mov x5,sp
00bfece4	mov x3,x8
00bfece8	mov x4,x6
00bfecec	mov w6,#0x10ffff
00bfecf0	mov w7,wzr
00bfecf4	bl 0x00bfed18
00bfecf8	ldp x9,x8,[sp]
00bfecfc	str x8,[x20]
00bfed00	str x9,[x19]
00bfed04	ldp x20,x19,[sp, #0x20]
00bfed08	ldp x29,x30,[sp, #0x10]
00bfed0c	add sp,sp,#0x30
00bfed10	autiasp
00bfed14	ret
