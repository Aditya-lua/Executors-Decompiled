; FUN_008e3bb4 @ 008e3bb4
008e3bb4	sub sp,sp,#0x50
008e3bb8	stp x30,x21,[sp, #0x30]
008e3bbc	stp x20,x19,[sp, #0x40]
008e3bc0	mov x19,x0
008e3bc4	mov x0,x2
008e3bc8	mov x21,x2
008e3bcc	mov x20,x1
008e3bd0	bl 0x008e4750
008e3bd4	tbz w0,#0x0,0x008e3c28
008e3bd8	mov x0,x21
008e3bdc	bl 0x008e475c
008e3be0	ldr x8,[x19, #0x8]
008e3be4	mov w21,w0
008e3be8	ldr x9,[x8]
008e3bec	mov x0,x8
008e3bf0	ldr x9,[x9, #0x20]
008e3bf4	blr x9
008e3bf8	ldr w8,[x20, #0x8]
008e3bfc	adrp x9,0xc4e000
008e3c00	add x9,x9,#0x320
008e3c04	str x9,[sp, #0x18]
008e3c08	str w8,[sp, #0x20]
008e3c0c	ldur x8,[x20, #0xc]
008e3c10	sub w9,w21,w0
008e3c14	sxtw x2,w9
008e3c18	add x1,sp,#0x18
008e3c1c	stur x8,[sp, #0x24]
008e3c20	mov x0,x19
008e3c24	b 0x008e3c70
008e3c28	ldr x0,[x19, #0x8]
008e3c2c	ldr x8,[x0]
008e3c30	ldr x8,[x8, #0x20]
008e3c34	blr x8
008e3c38	mov w1,w0
008e3c3c	mov x0,x21
008e3c40	mov w2,wzr
008e3c44	bl 0x008e403c
008e3c48	ldr w8,[x20, #0x8]
008e3c4c	adrp x9,0xc4e000
008e3c50	add x9,x9,#0x320
008e3c54	str x9,[sp]
008e3c58	str w8,[sp, #0x8]
008e3c5c	ldur x8,[x20, #0xc]
008e3c60	mov x1,sp
008e3c64	mov x0,x19
008e3c68	mov x2,xzr
008e3c6c	stur x8,[sp, #0xc]
008e3c70	bl 0x008e3f9c
008e3c74	ldp x20,x19,[sp, #0x40]
008e3c78	ldp x30,x21,[sp, #0x30]
008e3c7c	add sp,sp,#0x50
008e3c80	ret
