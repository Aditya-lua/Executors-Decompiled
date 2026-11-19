; RSA_set0_crt_params @ 00ad1c4c
00ad1c4c	stp x22,x21,[sp, #-0x30]!
00ad1c50	stp x20,x19,[sp, #0x10]
00ad1c54	stp x29,x30,[sp, #0x20]
00ad1c58	mov x19,x0
00ad1c5c	ldr x0,[x0, #0x50]
00ad1c60	mov w8,wzr
00ad1c64	add x29,sp,#0x20
00ad1c68	orr x9,x1,x0
00ad1c6c	cbz x9,0x00ad1cfc
00ad1c70	ldr x8,[x19, #0x58]
00ad1c74	mov x21,x2
00ad1c78	orr x9,x2,x8
00ad1c7c	mov w8,wzr
00ad1c80	cbz x9,0x00ad1cfc
00ad1c84	ldr x8,[x19, #0x60]
00ad1c88	mov x20,x3
00ad1c8c	orr x9,x3,x8
00ad1c90	mov w8,wzr
00ad1c94	cbz x9,0x00ad1cfc
00ad1c98	mov x22,x1
00ad1c9c	cbz x1,0x00ad1cb4
00ad1ca0	bl 0x00c322e0
00ad1ca4	mov w1,#0x4
00ad1ca8	mov x0,x22
00ad1cac	str x22,[x19, #0x50]
00ad1cb0	bl 0x00c38dc0
00ad1cb4	cbz x21,0x00ad1cd0
00ad1cb8	ldr x0,[x19, #0x58]
00ad1cbc	bl 0x00c322e0
00ad1cc0	mov w1,#0x4
00ad1cc4	mov x0,x21
00ad1cc8	str x21,[x19, #0x58]
00ad1ccc	bl 0x00c38dc0
00ad1cd0	cbz x20,0x00ad1cec
00ad1cd4	ldr x0,[x19, #0x60]
00ad1cd8	bl 0x00c322e0
00ad1cdc	mov w1,#0x4
00ad1ce0	mov x0,x20
00ad1ce4	str x20,[x19, #0x60]
00ad1ce8	bl 0x00c38dc0
00ad1cec	ldr w8,[x19, #0xd8]
00ad1cf0	add w8,w8,#0x1
00ad1cf4	str w8,[x19, #0xd8]
00ad1cf8	mov w8,#0x1
00ad1cfc	ldp x29,x30,[sp, #0x20]
00ad1d00	ldp x20,x19,[sp, #0x10]
00ad1d04	mov w0,w8
00ad1d08	ldp x22,x21,[sp], #0x30
00ad1d0c	ret
