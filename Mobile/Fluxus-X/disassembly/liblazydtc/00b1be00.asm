; X509_NAME_print @ 00b1be00
00b1be00	stp x24,x23,[sp, #-0x40]!
00b1be04	stp x20,x19,[sp, #0x20]
00b1be08	mov x20,x0
00b1be0c	mov x0,x1
00b1be10	mov x1,xzr
00b1be14	mov w2,wzr
00b1be18	stp x22,x21,[sp, #0x10]
00b1be1c	stp x29,x30,[sp, #0x30]
00b1be20	add x29,sp,#0x30
00b1be24	bl 0x00c40ae0
00b1be28	cbz x0,0x00b1bf54
00b1be2c	ldrb w8,[x0]
00b1be30	mov x19,x0
00b1be34	cbz w8,0x00b1bef0
00b1be38	add x22,x19,#0x1
00b1be3c	adrp x21,0x2a7000
00b1be40	add x21,x21,#0x15d
00b1be44	mov x24,x22
00b1be48	ldrb w8,[x24]
00b1be4c	cmp w8,#0x2f
00b1be50	b.ne 0x00b1be84
00b1be54	ldrb w0,[x24, #0x1]
00b1be58	bl 0x00c3e030
00b1be5c	cbz w0,0x00b1be80
00b1be60	ldrb w0,[x24, #0x2]
00b1be64	cmp w0,#0x3d
00b1be68	b.eq 0x00b1be94
00b1be6c	bl 0x00c3e030
00b1be70	cbz w0,0x00b1be80
00b1be74	ldrb w8,[x24, #0x3]
00b1be78	cmp w8,#0x3d
00b1be7c	b.eq 0x00b1be94
00b1be80	ldrb w8,[x24]
00b1be84	cbz w8,0x00b1be94
00b1be88	add x24,x24,#0x1
00b1be8c	cbnz w8,0x00b1be48
00b1be90	b 0x00b1bee0
00b1be94	sub w23,w24,w22
00b1be98	mov x0,x20
00b1be9c	mov x1,x22
00b1bea0	mov w2,w23
00b1bea4	bl 0x00c34240
00b1bea8	cmp w0,w23
00b1beac	b.ne 0x00b1bf0c
00b1beb0	ldrb w8,[x24]
00b1beb4	cbz w8,0x00b1bee0
00b1beb8	mov w2,#0x2
00b1bebc	mov x0,x20
00b1bec0	mov x1,x21
00b1bec4	bl 0x00c34240
00b1bec8	cmp w0,#0x2
00b1becc	b.ne 0x00b1bf0c
00b1bed0	ldrb w8,[x24]
00b1bed4	add x22,x24,#0x1
00b1bed8	mov x24,x22
00b1bedc	cbnz w8,0x00b1be48
00b1bee0	adrp x1,0x2c6000
00b1bee4	add x1,x1,#0x46b
00b1bee8	mov w2,#0x216
00b1beec	b 0x00b1befc
00b1bef0	adrp x1,0x2c6000
00b1bef4	add x1,x1,#0x46b
00b1bef8	orr w2,wzr,#0x1fc
00b1befc	mov x0,x19
00b1bf00	bl 0x00c32310
00b1bf04	mov w0,#0x1
00b1bf08	b 0x00b1bf54
00b1bf0c	bl 0x00c342a0
00b1bf10	adrp x20,0x2c6000
00b1bf14	add x20,x20,#0x46b
00b1bf18	adrp x2,0x2d0000
00b1bf1c	add x2,x2,#0x608
00b1bf20	mov w1,#0x219
00b1bf24	mov x0,x20
00b1bf28	bl 0x00c342b0
00b1bf2c	mov w1,#0x7
00b1bf30	mov w0,#0xb
00b1bf34	movk w1,#0x8, LSL #16
00b1bf38	mov x2,xzr
00b1bf3c	bl 0x00c342c0
00b1bf40	mov w2,#0x21a
00b1bf44	mov x0,x19
00b1bf48	mov x1,x20
00b1bf4c	bl 0x00c32310
00b1bf50	mov w0,wzr
00b1bf54	ldp x29,x30,[sp, #0x30]
00b1bf58	ldp x20,x19,[sp, #0x20]
00b1bf5c	ldp x22,x21,[sp, #0x10]
00b1bf60	ldp x24,x23,[sp], #0x40
00b1bf64	ret
