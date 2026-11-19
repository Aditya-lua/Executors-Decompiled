; __cxa_guard_acquire @ 00c0d404
00c0d404	paciasp
00c0d408	sub sp,sp,#0x50
00c0d40c	stp x29,x30,[sp, #0x10]
00c0d410	stp x24,x23,[sp, #0x20]
00c0d414	stp x22,x21,[sp, #0x30]
00c0d418	stp x20,x19,[sp, #0x40]
00c0d41c	add x29,sp,#0x10
00c0d420	ldarb w8,[x0]
00c0d424	cbz w8,0x00c0d430
00c0d428	mov w0,wzr
00c0d42c	b 0x00c0d4dc
00c0d430	mov x19,x0
00c0d434	adrp x8,0x2ca000
00c0d438	add x8,x8,#0x9b4
00c0d43c	adrp x0,0xd27000
00c0d440	add x0,x0,#0xe08
00c0d444	str x8,[sp, #0x8]
00c0d448	bl 0x00c31ca0
00c0d44c	cbnz w0,0x00c0d4f8
00c0d450	ldrb w23,[x19, #0x1]
00c0d454	tbz w23,#0x1,0x00c0d470
00c0d458	ldr w21,[x19, #0x4]
00c0d45c	mov w0,#0xb2
00c0d460	bl 0x00c30bb0
00c0d464	mov x20,x0
00c0d468	cmp w21,w20
00c0d46c	b.eq 0x00c0d520
00c0d470	adrp x21,0xd27000
00c0d474	add x21,x21,#0xe30
00c0d478	adrp x22,0xd27000
00c0d47c	add x22,x22,#0xe08
00c0d480	ldrb w24,[x19, #0x1]
00c0d484	tbz w24,#0x1,0x00c0d4a0
00c0d488	orr w8,w24,#0x4
00c0d48c	strb w8,[x19, #0x1]
00c0d490	mov x0,x21
00c0d494	mov x1,x22
00c0d498	bl 0x00c43ad0
00c0d49c	b 0x00c0d480
00c0d4a0	cmp w24,#0x1
00c0d4a4	b.eq 0x00c0d4c4
00c0d4a8	tbnz w23,#0x1,0x00c0d4b8
00c0d4ac	mov w0,#0xb2
00c0d4b0	bl 0x00c30bb0
00c0d4b4	mov w20,w0
00c0d4b8	mov w8,#0x2
00c0d4bc	str w20,[x19, #0x4]
00c0d4c0	strb w8,[x19, #0x1]
00c0d4c4	adrp x0,0xd27000
00c0d4c8	add x0,x0,#0xe08
00c0d4cc	bl 0x00c31cb0
00c0d4d0	cbnz w0,0x00c0d50c
00c0d4d4	cmp w24,#0x1
00c0d4d8	cset w0,ne
00c0d4dc	ldp x20,x19,[sp, #0x40]
00c0d4e0	ldp x22,x21,[sp, #0x30]
00c0d4e4	ldp x24,x23,[sp, #0x20]
00c0d4e8	ldp x29,x30,[sp, #0x10]
00c0d4ec	add sp,sp,#0x50
00c0d4f0	autiasp
00c0d4f4	ret
00c0d4f8	adrp x0,0x2ab000
00c0d4fc	add x0,x0,#0x2ae
00c0d500	adrp x1,0x2ca000
00c0d504	add x1,x1,#0x9b4
00c0d508	bl 0x00c0de94
00c0d50c	adrp x0,0x2a1000
00c0d510	add x0,x0,#0x418
00c0d514	adrp x1,0x2ca000
00c0d518	add x1,x1,#0x9b4
00c0d51c	bl 0x00c0de94
00c0d520	adrp x0,0x2d4000
00c0d524	add x0,x0,#0xba9
00c0d528	bl 0x00c0de94
