; RSA_set0_key @ 00ad1b1c
00ad1b1c	stp x22,x21,[sp, #-0x30]!
00ad1b20	stp x20,x19,[sp, #0x10]
00ad1b24	stp x29,x30,[sp, #0x20]
00ad1b28	mov x19,x0
00ad1b2c	ldr x0,[x0, #0x28]
00ad1b30	mov w8,wzr
00ad1b34	add x29,sp,#0x20
00ad1b38	orr x9,x1,x0
00ad1b3c	cbz x9,0x00ad1ba4
00ad1b40	ldr x8,[x19, #0x30]
00ad1b44	mov x21,x2
00ad1b48	orr x9,x2,x8
00ad1b4c	mov w8,wzr
00ad1b50	cbz x9,0x00ad1ba4
00ad1b54	mov x20,x3
00ad1b58	mov x22,x1
00ad1b5c	cbz x1,0x00ad1b68
00ad1b60	bl 0x00c36290
00ad1b64	str x22,[x19, #0x28]
00ad1b68	cbz x21,0x00ad1b78
00ad1b6c	ldr x0,[x19, #0x30]
00ad1b70	bl 0x00c36290
00ad1b74	str x21,[x19, #0x30]
00ad1b78	cbz x20,0x00ad1b94
00ad1b7c	ldr x0,[x19, #0x38]
00ad1b80	bl 0x00c322e0
00ad1b84	mov w1,#0x4
00ad1b88	mov x0,x20
00ad1b8c	str x20,[x19, #0x38]
00ad1b90	bl 0x00c38dc0
00ad1b94	ldr w8,[x19, #0xd8]
00ad1b98	add w8,w8,#0x1
00ad1b9c	str w8,[x19, #0xd8]
00ad1ba0	mov w8,#0x1
00ad1ba4	ldp x29,x30,[sp, #0x20]
00ad1ba8	ldp x20,x19,[sp, #0x10]
00ad1bac	mov w0,w8
00ad1bb0	ldp x22,x21,[sp], #0x30
00ad1bb4	ret
