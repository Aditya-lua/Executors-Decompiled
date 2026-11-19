; mbedtls_ecdsa_write_signature_restartable @ 00b9be14
00b9be14	sub sp,sp,#0x140
00b9be18	stp x28,x27,[sp, #0xe0]
00b9be1c	stp x26,x25,[sp, #0xf0]
00b9be20	stp x24,x23,[sp, #0x100]
00b9be24	stp x22,x21,[sp, #0x110]
00b9be28	stp x20,x19,[sp, #0x120]
00b9be2c	stp x29,x30,[sp, #0x130]
00b9be30	add x29,sp,#0x130
00b9be34	mrs x27,tpidr_el0
00b9be38	ldr x8,[x27, #0x28]
00b9be3c	mov x22,x7
00b9be40	mov x19,x6
00b9be44	mov x21,x5
00b9be48	mov x20,x4
00b9be4c	mov x23,x3
00b9be50	mov x25,x2
00b9be54	mov w24,w1
00b9be58	mov x26,x0
00b9be5c	stur x8,[x29, #-0x60]
00b9be60	cbz x7,0x00b9bebc
00b9be64	ldr x28,[x29, #0x10]
00b9be68	add x0,sp,#0x28
00b9be6c	bl 0x00c41c00
00b9be70	add x0,sp,#0x18
00b9be74	bl 0x00c41c00
00b9be78	add x3,x26,#0xc0
00b9be7c	add x1,sp,#0x28
00b9be80	add x2,sp,#0x18
00b9be84	mov x0,x26
00b9be88	mov x4,x25
00b9be8c	mov x5,x23
00b9be90	mov w6,w24
00b9be94	mov x7,x22
00b9be98	str x28,[sp]
00b9be9c	bl 0x00c42530
00b9bea0	mov w22,w0
00b9bea4	cbz w0,0x00b9bef4
00b9bea8	add x0,sp,#0x28
00b9beac	bl 0x00c41bb0
00b9beb0	add x0,sp,#0x18
00b9beb4	bl 0x00c41bb0
00b9beb8	b 0x00b9bec0
00b9bebc	mov w22,#0xffffb080
00b9bec0	ldr x8,[x27, #0x28]
00b9bec4	ldur x9,[x29, #-0x60]
00b9bec8	cmp x8,x9
00b9becc	b.ne 0x00b9bfb4
00b9bed0	mov w0,w22
00b9bed4	ldp x29,x30,[sp, #0x130]
00b9bed8	ldp x20,x19,[sp, #0x120]
00b9bedc	ldp x22,x21,[sp, #0x110]
00b9bee0	ldp x24,x23,[sp, #0x100]
00b9bee4	ldp x26,x25,[sp, #0xf0]
00b9bee8	ldp x28,x27,[sp, #0xe0]
00b9beec	add sp,sp,#0x140
00b9bef0	ret
00b9bef4	add x0,sp,#0x44
00b9bef8	mov w2,#0x8b
00b9befc	mov w1,wzr
00b9bf00	add x22,sp,#0x44
00b9bf04	bl 0x00c301c0
00b9bf08	add x8,x22,#0x8b
00b9bf0c	add x0,sp,#0x38
00b9bf10	add x1,sp,#0x44
00b9bf14	add x2,sp,#0x18
00b9bf18	str x8,[sp, #0x38]
00b9bf1c	bl 0x00c41ad0
00b9bf20	mov w22,w0
00b9bf24	tbnz w0,#0x1f,0x00b9bea8
00b9bf28	add x0,sp,#0x38
00b9bf2c	add x1,sp,#0x44
00b9bf30	add x2,sp,#0x28
00b9bf34	bl 0x00c41ad0
00b9bf38	tbnz w0,#0x1f,0x00b9bf88
00b9bf3c	sxtw x8,w0
00b9bf40	add x23,x8,w22, SXTW 
00b9bf44	add x0,sp,#0x38
00b9bf48	add x1,sp,#0x44
00b9bf4c	mov x2,x23
00b9bf50	bl 0x00c41ac0
00b9bf54	mov w22,w0
00b9bf58	tbnz w0,#0x1f,0x00b9bea8
00b9bf5c	add x0,sp,#0x38
00b9bf60	add x1,sp,#0x44
00b9bf64	orr w2,wzr,#0x30
00b9bf68	bl 0x00c41ae0
00b9bf6c	tbnz w0,#0x1f,0x00b9bf90
00b9bf70	add x8,x23,w22, SXTW 
00b9bf74	add x23,x8,w0, SXTW 
00b9bf78	cmp x23,x21
00b9bf7c	b.ls 0x00b9bf98
00b9bf80	mov w22,#0xffffb100
00b9bf84	b 0x00b9bea8
00b9bf88	mov w22,w0
00b9bf8c	b 0x00b9bea8
00b9bf90	mov w22,w0
00b9bf94	b 0x00b9bea8
00b9bf98	ldr x1,[sp, #0x38]
00b9bf9c	mov x0,x20
00b9bfa0	mov x2,x23
00b9bfa4	bl 0x00c2ffd0
00b9bfa8	mov w22,wzr
00b9bfac	str x23,[x19]
00b9bfb0	b 0x00b9bea8
00b9bfb4	bl 0x00c2fec0
