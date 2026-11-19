; std::__ndk1::system_error::system_error @ 00bcb680
00bcb680	paciasp
00bcb684	sub sp,sp,#0x50
00bcb688	stp x29,x30,[sp, #0x20]
00bcb68c	str x21,[sp, #0x30]
00bcb690	stp x20,x19,[sp, #0x40]
00bcb694	add x29,sp,#0x20
00bcb698	mov x19,x2
00bcb69c	mov x20,x1
00bcb6a0	mov x21,x0
00bcb6a4	cbz w20,0x00bcb6c4
00bcb6a8	ldr x8,[x19]
00bcb6ac	mov x0,x19
00bcb6b0	mov w1,w20
00bcb6b4	ldr x9,[x8, #0x30]
00bcb6b8	add x8,sp,#0x8
00bcb6bc	blr x9
00bcb6c0	b 0x00bcb6cc
00bcb6c4	stp xzr,xzr,[sp, #0x8]
00bcb6c8	str xzr,[sp, #0x18]
00bcb6cc	add x1,sp,#0x8
00bcb6d0	mov x0,x21
00bcb6d4	bl 0x00c43cf0
00bcb6d8	ldrb w8,[sp, #0x8]
00bcb6dc	tbz w8,#0x0,0x00bcb6f0
00bcb6e0	ldr x8,[sp, #0x8]
00bcb6e4	ldr x0,[sp, #0x18]
00bcb6e8	and x1,x8,#-0x2
00bcb6ec	bl 0x00c2fe80
00bcb6f0	adrp x8,0xcb5000
00bcb6f4	ldr x8,[x8, #0xb18]
00bcb6f8	add x8,x8,#0x10
00bcb6fc	str x8,[x21]
00bcb700	stp x20,x19,[x21, #0x10]
00bcb704	ldp x20,x19,[sp, #0x40]
00bcb708	ldr x21,[sp, #0x30]
00bcb70c	ldp x29,x30,[sp, #0x20]
00bcb710	add sp,sp,#0x50
00bcb714	autiasp
00bcb718	ret
