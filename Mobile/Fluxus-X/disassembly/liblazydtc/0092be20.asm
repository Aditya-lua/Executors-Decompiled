; curl_multi_waitfds @ 0092be20
0092be20	sub sp,sp,#0x70
0092be24	stp x22,x21,[sp, #0x40]
0092be28	stp x20,x19,[sp, #0x50]
0092be2c	stp x29,x30,[sp, #0x60]
0092be30	add x29,sp,#0x60
0092be34	mrs x22,tpidr_el0
0092be38	ldr x8,[x22, #0x28]
0092be3c	mov x19,x3
0092be40	mov x20,x0
0092be44	stur x8,[x29, #-0x28]
0092be48	cbz x1,0x0092bed4
0092be4c	cbz x20,0x0092becc
0092be50	ldr w8,[x20]
0092be54	mov w9,#0xab1e
0092be58	movk w9,#0xb, LSL #16
0092be5c	cmp w8,w9
0092be60	b.ne 0x0092becc
0092be64	ldrb w8,[x20, #0x231]
0092be68	tbnz w8,#0x2,0x0092bedc
0092be6c	add x0,sp,#0x8
0092be70	bl 0x00934d0c
0092be74	movi v0.2D,#0x0
0092be78	stur q0,[sp, #0x28]
0092be7c	stur q0,[sp, #0x18]
0092be80	ldr x21,[x20, #0x8]
0092be84	cbz x21,0x0092beac
0092be88	add x1,sp,#0x18
0092be8c	mov x0,x21
0092be90	bl 0x0092bcf8
0092be94	add x0,sp,#0x8
0092be98	add x1,sp,#0x18
0092be9c	bl 0x00934d18
0092bea0	cbnz w0,0x0092bee4
0092bea4	ldr x21,[x21, #0x10]
0092bea8	cbnz x21,0x0092be88
0092beac	add x0,x20,#0x158
0092beb0	add x1,sp,#0x8
0092beb4	bl 0x00910e78
0092beb8	cmp w0,#0x0
0092bebc	orr w8,wzr,#0x3
0092bec0	csel w0,wzr,w8,eq
0092bec4	cbnz x19,0x0092beec
0092bec8	b 0x0092bef4
0092becc	mov w0,#0x1
0092bed0	b 0x0092bef4
0092bed4	mov w0,#0xa
0092bed8	b 0x0092bef4
0092bedc	mov w0,#0x8
0092bee0	b 0x0092bef4
0092bee4	orr w0,wzr,#0x3
0092bee8	cbz x19,0x0092bef4
0092beec	ldr w8,[sp, #0x10]
0092bef0	str w8,[x19]
0092bef4	ldr x8,[x22, #0x28]
0092bef8	ldur x9,[x29, #-0x28]
0092befc	cmp x8,x9
0092bf00	b.ne 0x0092bf18
0092bf04	ldp x29,x30,[sp, #0x60]
0092bf08	ldp x20,x19,[sp, #0x50]
0092bf0c	ldp x22,x21,[sp, #0x40]
0092bf10	add sp,sp,#0x70
0092bf14	ret
0092bf18	bl 0x00c2fec0
