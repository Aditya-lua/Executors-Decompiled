; std::__ndk1::ios_base::imbue @ 00bcdb44
00bcdb44	paciasp
00bcdb48	stp x29,x30,[sp, #-0x30]!
00bcdb4c	str x21,[sp, #0x10]
00bcdb50	stp x20,x19,[sp, #0x20]
00bcdb54	mov x29,sp
00bcdb58	mov x21,x1
00bcdb5c	mov x20,x0
00bcdb60	add x1,x0,#0x30
00bcdb64	mov x0,x8
00bcdb68	mov x19,x8
00bcdb6c	bl 0x00c30660
00bcdb70	add x0,x20,#0x30
00bcdb74	mov x1,x21
00bcdb78	bl 0x00c43f00
00bcdb7c	ldr x8,[x20, #0x48]
00bcdb80	cbz x8,0x00bcdbac
00bcdb84	sub x21,x8,#0x1
00bcdb88	ldp x8,x9,[x20, #0x38]
00bcdb8c	ldr x8,[x8, x21, LSL #0x3]
00bcdb90	ldr w2,[x9, x21, LSL #0x2]
00bcdb94	mov w0,#0x1
00bcdb98	mov x1,x20
00bcdb9c	blr x8
00bcdba0	sub x21,x21,#0x1
00bcdba4	cmn x21,#0x1
00bcdba8	b.ne 0x00bcdb88
00bcdbac	ldp x20,x19,[sp, #0x20]
00bcdbb0	ldr x21,[sp, #0x10]
00bcdbb4	ldp x29,x30,[sp], #0x30
00bcdbb8	autiasp
00bcdbbc	ret
