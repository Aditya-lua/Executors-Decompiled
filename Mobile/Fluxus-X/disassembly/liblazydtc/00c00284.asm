; std::__ndk1::__codecvt_utf8<char32_t>::do_out @ 00c00284
00c00284	paciasp
00c00288	sub sp,sp,#0x30
00c0028c	stp x29,x30,[sp, #0x10]
00c00290	stp x20,x19,[sp, #0x20]
00c00294	add x29,sp,#0x10
00c00298	mov x19,x7
00c0029c	mov x9,x6
00c002a0	mov x8,x5
00c002a4	ldr x6,[x0, #0x10]
00c002a8	ldr w7,[x0, #0x18]
00c002ac	mov x20,x4
00c002b0	mov x1,x3
00c002b4	mov x0,x2
00c002b8	add x2,sp,#0x8
00c002bc	mov x5,sp
00c002c0	mov x3,x8
00c002c4	mov x4,x9
00c002c8	bl 0x00bff480
00c002cc	ldp x9,x8,[sp]
00c002d0	str x8,[x20]
00c002d4	str x9,[x19]
00c002d8	ldp x20,x19,[sp, #0x20]
00c002dc	ldp x29,x30,[sp, #0x10]
00c002e0	add sp,sp,#0x30
00c002e4	autiasp
00c002e8	ret
