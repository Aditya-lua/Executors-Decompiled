; FUN_0084aa7c @ 0084aa7c
0084aa7c	sub sp,sp,#0xc0
0084aa80	stp x29,x30,[sp, #0x80]
0084aa84	stp x24,x23,[sp, #0x90]
0084aa88	stp x22,x21,[sp, #0xa0]
0084aa8c	stp x20,x19,[sp, #0xb0]
0084aa90	add x29,sp,#0x80
0084aa94	movi v0.2D,#0x0
0084aa98	mrs x24,tpidr_el0
0084aa9c	mov w22,w4
0084aaa0	ldr x9,[x24, #0x28]
0084aaa4	mov x19,x2
0084aaa8	mov x20,x1
0084aaac	mov x21,x0
0084aab0	mov x8,x3
0084aab4	stur x9,[x29, #-0x8]
0084aab8	mov w9,#0x1040
0084aabc	stp xzr,xzr,[sp, #0x30]
0084aac0	strb wzr,[sp, #0x40]
0084aac4	stp xzr,xzr,[sp, #0x48]
0084aac8	strb wzr,[sp, #0x58]
0084aacc	strb wzr,[sp, #0x60]
0084aad0	str xzr,[sp, #0x68]
0084aad4	stp q0,q0,[sp]
0084aad8	stur q0,[sp, #0x19]
0084aadc	mov x3,sp
0084aae0	orr w4,w4,w9
0084aae4	mov x0,x8
0084aae8	mov x1,x21
0084aaec	mov x2,x20
0084aaf0	bl 0x0084abb8
0084aaf4	mov w23,w0
0084aaf8	ubfx w4,w22,#0xb,#0x1
0084aafc	mov x3,sp
0084ab00	mov x0,x19
0084ab04	mov x1,x21
0084ab08	mov x2,x20
0084ab0c	bl 0x0084aeac
0084ab10	ldr x0,[sp]
0084ab14	cbz x0,0x0084ab28
0084ab18	ldr x8,[sp, #0x10]
0084ab1c	str x0,[sp, #0x8]
0084ab20	sub x1,x8,x0
0084ab24	bl 0x00c2fe80
0084ab28	tbz w23,#0x0,0x0084ab48
0084ab2c	ldrb w8,[x19, #0x58]
0084ab30	cmp w8,#0x1
0084ab34	b.ne 0x0084ab50
0084ab38	ldr x8,[x19]
0084ab3c	mov w0,wzr
0084ab40	str x8,[x19, #0x8]
0084ab44	b 0x0084ab54
0084ab48	mov w0,wzr
0084ab4c	b 0x0084ab54
0084ab50	mov w0,#0x1
0084ab54	ldr x8,[x24, #0x28]
0084ab58	ldur x9,[x29, #-0x8]
0084ab5c	cmp x8,x9
0084ab60	b.ne 0x0084abb4
0084ab64	ldp x20,x19,[sp, #0xb0]
0084ab68	ldp x22,x21,[sp, #0xa0]
0084ab6c	ldp x24,x23,[sp, #0x90]
0084ab70	ldp x29,x30,[sp, #0x80]
0084ab74	add sp,sp,#0xc0
0084ab78	ret
0084abb4	bl 0x00c2fec0
