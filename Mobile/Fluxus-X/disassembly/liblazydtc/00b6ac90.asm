; mbedtls_cipher_crypt @ 00b6ac90
00b6ac90	sub sp,sp,#0x50
00b6ac94	stp x24,x23,[sp, #0x10]
00b6ac98	stp x22,x21,[sp, #0x20]
00b6ac9c	stp x20,x19,[sp, #0x30]
00b6aca0	stp x29,x30,[sp, #0x40]
00b6aca4	add x29,sp,#0x40
00b6aca8	mrs x24,tpidr_el0
00b6acac	ldr x8,[x24, #0x28]
00b6acb0	mov x19,x6
00b6acb4	mov x21,x5
00b6acb8	mov x22,x4
00b6acbc	mov x23,x3
00b6acc0	mov x20,x0
00b6acc4	str x8,[sp, #0x8]
00b6acc8	bl 0x00c42170
00b6accc	cbz w0,0x00b6acf8
00b6acd0	ldr x8,[x24, #0x28]
00b6acd4	ldr x9,[sp, #0x8]
00b6acd8	cmp x8,x9
00b6acdc	b.ne 0x00b6ad54
00b6ace0	ldp x29,x30,[sp, #0x40]
00b6ace4	ldp x20,x19,[sp, #0x30]
00b6ace8	ldp x22,x21,[sp, #0x20]
00b6acec	ldp x24,x23,[sp, #0x10]
00b6acf0	add sp,sp,#0x50
00b6acf4	ret
00b6acf8	ldr x8,[x20]
00b6acfc	cbz x8,0x00b6ad4c
00b6ad00	mov x0,x20
00b6ad04	mov x1,x23
00b6ad08	mov x2,x22
00b6ad0c	mov x3,x21
00b6ad10	mov x4,x19
00b6ad14	str xzr,[x20, #0x30]
00b6ad18	bl 0x00c42180
00b6ad1c	cbnz w0,0x00b6acd0
00b6ad20	ldr x8,[x19]
00b6ad24	mov x2,sp
00b6ad28	mov x0,x20
00b6ad2c	add x1,x21,x8
00b6ad30	bl 0x00c42150
00b6ad34	cbnz w0,0x00b6acd0
00b6ad38	ldr x8,[sp]
00b6ad3c	ldr x9,[x19]
00b6ad40	add x8,x9,x8
00b6ad44	str x8,[x19]
00b6ad48	b 0x00b6acd0
00b6ad4c	mov w0,#0xffff9f00
00b6ad50	b 0x00b6acd0
00b6ad54	bl 0x00c2fec0
