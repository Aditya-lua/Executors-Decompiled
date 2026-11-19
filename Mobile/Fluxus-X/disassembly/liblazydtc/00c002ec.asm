; std::__ndk1::__codecvt_utf8<char32_t>::do_in @ 00c002ec
00c002ec	paciasp
00c002f0	sub sp,sp,#0x30
00c002f4	stp x29,x30,[sp, #0x10]
00c002f8	stp x20,x19,[sp, #0x20]
00c002fc	add x29,sp,#0x10
00c00300	mov x19,x7
00c00304	mov x9,x6
00c00308	mov x8,x5
00c0030c	ldr x6,[x0, #0x10]
00c00310	ldr w7,[x0, #0x18]
00c00314	mov x20,x4
00c00318	mov x1,x3
00c0031c	mov x0,x2
00c00320	add x2,sp,#0x8
00c00324	mov x5,sp
00c00328	mov x3,x8
00c0032c	mov x4,x9
00c00330	bl 0x00bff66c
00c00334	ldp x9,x8,[sp]
00c00338	str x8,[x20]
00c0033c	str x9,[x19]
00c00340	ldp x20,x19,[sp, #0x20]
00c00344	ldp x29,x30,[sp, #0x10]
00c00348	add sp,sp,#0x30
00c0034c	autiasp
00c00350	ret
