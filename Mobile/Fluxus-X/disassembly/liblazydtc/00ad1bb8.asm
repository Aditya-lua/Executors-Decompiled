; RSA_set0_factors @ 00ad1bb8
00ad1bb8	str x21,[sp, #-0x30]!
00ad1bbc	stp x20,x19,[sp, #0x10]
00ad1bc0	stp x29,x30,[sp, #0x20]
00ad1bc4	mov x19,x0
00ad1bc8	ldr x0,[x0, #0x40]
00ad1bcc	mov w8,wzr
00ad1bd0	add x29,sp,#0x20
00ad1bd4	orr x9,x1,x0
00ad1bd8	cbz x9,0x00ad1c38
00ad1bdc	ldr x8,[x19, #0x48]
00ad1be0	mov x20,x2
00ad1be4	orr x9,x2,x8
00ad1be8	mov w8,wzr
00ad1bec	cbz x9,0x00ad1c38
00ad1bf0	mov x21,x1
00ad1bf4	cbz x1,0x00ad1c0c
00ad1bf8	bl 0x00c322e0
00ad1bfc	mov w1,#0x4
00ad1c00	mov x0,x21
00ad1c04	str x21,[x19, #0x40]
00ad1c08	bl 0x00c38dc0
00ad1c0c	cbz x20,0x00ad1c28
00ad1c10	ldr x0,[x19, #0x48]
00ad1c14	bl 0x00c322e0
00ad1c18	mov w1,#0x4
00ad1c1c	mov x0,x20
00ad1c20	str x20,[x19, #0x48]
00ad1c24	bl 0x00c38dc0
00ad1c28	ldr w8,[x19, #0xd8]
00ad1c2c	add w8,w8,#0x1
00ad1c30	str w8,[x19, #0xd8]
00ad1c34	mov w8,#0x1
00ad1c38	ldp x29,x30,[sp, #0x20]
00ad1c3c	ldp x20,x19,[sp, #0x10]
00ad1c40	mov w0,w8
00ad1c44	ldr x21,[sp], #0x30
00ad1c48	ret
