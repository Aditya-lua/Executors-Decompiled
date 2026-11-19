; FUN_00aeb764 @ 00aeb764
00aeb764	sub sp,sp,#0x40
00aeb768	stp x22,x21,[sp, #0x10]
00aeb76c	stp x20,x19,[sp, #0x20]
00aeb770	stp x29,x30,[sp, #0x30]
00aeb774	str xzr,[sp, #0x8]
00aeb778	ldr w22,[x2, #0x8]
00aeb77c	mov x20,x2
00aeb780	mov x19,x1
00aeb784	mov x21,x0
00aeb788	add x29,sp,#0x30
00aeb78c	cbz w22,0x00aeb798
00aeb790	cbnz x21,0x00aeb7cc
00aeb794	b 0x00aeb7b0
00aeb798	ldr x0,[x20]
00aeb79c	bl 0x00c3b650
00aeb7a0	ldr x1,[x20, #0x10]
00aeb7a4	bl 0x00c3b620
00aeb7a8	mov w22,w0
00aeb7ac	cbnz x21,0x00aeb7cc
00aeb7b0	ldr x0,[x20]
00aeb7b4	adrp x2,0xc7d000
00aeb7b8	add x2,x2,#0xeb8
00aeb7bc	orr w1,wzr,#0xf
00aeb7c0	bl 0x00c3b520
00aeb7c4	mov x21,x0
00aeb7c8	cbz x0,0x00aeb7f0
00aeb7cc	ldr x2,[x20, #0x18]
00aeb7d0	add x4,sp,#0x8
00aeb7d4	mov x0,x21
00aeb7d8	mov w1,w22
00aeb7dc	mov x3,x19
00aeb7e0	bl 0x00c3b5b0
00aeb7e4	ldr x8,[sp, #0x8]
00aeb7e8	cmp w0,#0x0
00aeb7ec	csel x0,xzr,x8,eq
00aeb7f0	ldp x29,x30,[sp, #0x30]
00aeb7f4	ldp x20,x19,[sp, #0x20]
00aeb7f8	ldp x22,x21,[sp, #0x10]
00aeb7fc	add sp,sp,#0x40
00aeb800	ret
