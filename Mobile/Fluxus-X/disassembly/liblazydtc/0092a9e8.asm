; FUN_0092a9e8 @ 0092a9e8
0092a9e8	sub sp,sp,#0x70
0092a9ec	str x25,[sp, #0x20]
0092a9f0	stp x24,x23,[sp, #0x30]
0092a9f4	stp x22,x21,[sp, #0x40]
0092a9f8	stp x20,x19,[sp, #0x50]
0092a9fc	stp x29,x30,[sp, #0x60]
0092aa00	add x29,sp,#0x60
0092aa04	mrs x25,tpidr_el0
0092aa08	ldr x8,[x25, #0x28]
0092aa0c	mov x24,x1
0092aa10	mov x22,x0
0092aa14	mov w0,#0x1
0092aa18	str x8,[sp, #0x18]
0092aa1c	adrp x8,0xcb4000
0092aa20	ldr x8,[x8, #0xdd0]
0092aa24	mov w1,#0x238
0092aa28	mov x23,x2
0092aa2c	ldr x8,[x8]
0092aa30	blr x8
0092aa34	mov x19,x0
0092aa38	cbz x0,0x0092ab70
0092aa3c	mov w8,#0xab1e
0092aa40	add x20,x19,#0xa0
0092aa44	movk w8,#0xb, LSL #16
0092aa48	mov x21,x19
0092aa4c	mov x0,x20
0092aa50	mov x1,x23
0092aa54	str w8,[x21], #0xf8
0092aa58	bl 0x00917c68
0092aa5c	adrp x2,0x92f000
0092aa60	adrp x3,0x92f000
0092aa64	adrp x4,0x92f000
0092aa68	add x2,x2,#0x4b8
0092aa6c	add x3,x3,#0x4cc
0092aa70	add x4,x4,#0x4e0
0092aa74	mov x0,x21
0092aa78	mov x1,x22
0092aa7c	bl 0x009164e8
0092aa80	adrp x2,0xcb4000
0092aa84	adrp x3,0xcb4000
0092aa88	ldr x2,[x2, #0xe00]
0092aa8c	ldr x3,[x3, #0xe08]
0092aa90	add x22,x19,#0x128
0092aa94	nop
0092aa98	adr x4,0x92aba4
0092aa9c	mov w1,#0x17
0092aaa0	mov x0,x22
0092aaa4	bl 0x009164e8
0092aaa8	add x23,x19,#0x158
0092aaac	mov x0,x23
0092aab0	mov x1,x19
0092aab4	mov x2,x24
0092aab8	bl 0x0090fae0
0092aabc	cbz w0,0x0092ab20
0092aac0	mov x1,sp
0092aac4	mov x0,x21
0092aac8	bl 0x00916a74
0092aacc	b 0x0092aad8
0092aad0	ldr x0,[x0, #0x18]
0092aad4	bl 0x00916838
0092aad8	mov x0,sp
0092aadc	bl 0x00916a80
0092aae0	cbnz x0,0x0092aad0
0092aae4	mov x0,x21
0092aae8	bl 0x00916838
0092aaec	mov x0,x22
0092aaf0	bl 0x00916838
0092aaf4	mov x0,x20
0092aaf8	bl 0x00916838
0092aafc	mov x0,x23
0092ab00	bl 0x0090fb7c
0092ab04	adrp x8,0xcb4000
0092ab08	ldr x8,[x8, #0xdd8]
0092ab0c	mov x0,x19
0092ab10	ldr x8,[x8]
0092ab14	blr x8
0092ab18	mov x19,xzr
0092ab1c	b 0x0092ab70
0092ab20	add x0,x19,#0x20
0092ab24	mov x1,xzr
0092ab28	bl 0x00925c98
0092ab2c	add x0,x19,#0x40
0092ab30	mov x1,xzr
0092ab34	bl 0x00925c98
0092ab38	add x0,x19,#0x60
0092ab3c	mov x1,xzr
0092ab40	bl 0x00925c98
0092ab44	ldrb w8,[x19, #0x231]
0092ab48	mov w9,#0x64
0092ab4c	add x0,x19,#0x220
0092ab50	mov w1,#0x1
0092ab54	orr w8,w8,#0x1
0092ab58	str w9,[x19, #0x228]
0092ab5c	strb w8,[x19, #0x231]
0092ab60	bl 0x0093f910
0092ab64	tbz w0,#0x1f,0x0092ab70
0092ab68	movi d0,#-0x1
0092ab6c	str d0,[x19, #0x220]
0092ab70	ldr x8,[x25, #0x28]
0092ab74	ldr x9,[sp, #0x18]
0092ab78	cmp x8,x9
0092ab7c	b.ne 0x0092aba0
0092ab80	mov x0,x19
0092ab84	ldp x29,x30,[sp, #0x60]
0092ab88	ldp x20,x19,[sp, #0x50]
0092ab8c	ldp x22,x21,[sp, #0x40]
0092ab90	ldp x24,x23,[sp, #0x30]
0092ab94	ldr x25,[sp, #0x20]
0092ab98	add sp,sp,#0x70
0092ab9c	ret
0092aba0	bl 0x00c2fec0
