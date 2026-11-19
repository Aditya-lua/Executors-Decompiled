; std::__ndk1::locale::id::__get @ 00bfb690
00bfb690	paciasp
00bfb694	sub sp,sp,#0x30
00bfb698	stp x29,x30,[sp, #0x10]
00bfb69c	str x19,[sp, #0x20]
00bfb6a0	add x29,sp,#0x10
00bfb6a4	str x0,[sp]
00bfb6a8	mov x19,x0
00bfb6ac	ldar x8,[x0]
00bfb6b0	cmn x8,#0x1
00bfb6b4	b.eq 0x00bfb6dc
00bfb6b8	mov x8,sp
00bfb6bc	add x9,x29,#0x18
00bfb6c0	nop
00bfb6c4	adr x2,0xc0bab0
00bfb6c8	add x1,sp,#0x8
00bfb6cc	mov x0,x19
00bfb6d0	str x8,[x29, #0x18]
00bfb6d4	str x9,[sp, #0x8]
00bfb6d8	bl 0x00c305d0
00bfb6dc	ldrsw x8,[x19, #0x8]
00bfb6e0	sub x0,x8,#0x1
00bfb6e4	ldp x29,x30,[sp, #0x10]
00bfb6e8	ldr x19,[sp, #0x20]
00bfb6ec	add sp,sp,#0x30
00bfb6f0	autiasp
00bfb6f4	ret
