; std::__ndk1::codecvt<char32_t,char,mbstate_t>::do_in @ 00bff608
00bff608	paciasp
00bff60c	sub sp,sp,#0x30
00bff610	stp x29,x30,[sp, #0x10]
00bff614	stp x20,x19,[sp, #0x20]
00bff618	add x29,sp,#0x10
00bff61c	mov x8,x5
00bff620	mov x19,x7
00bff624	mov x20,x4
00bff628	mov x1,x3
00bff62c	mov x0,x2
00bff630	add x2,sp,#0x8
00bff634	mov x5,sp
00bff638	mov x3,x8
00bff63c	mov x4,x6
00bff640	mov w6,#0x10ffff
00bff644	mov w7,wzr
00bff648	bl 0x00bff66c
00bff64c	ldp x9,x8,[sp]
00bff650	str x8,[x20]
00bff654	str x9,[x19]
00bff658	ldp x20,x19,[sp, #0x20]
00bff65c	ldp x29,x30,[sp, #0x10]
00bff660	add sp,sp,#0x30
00bff664	autiasp
00bff668	ret
