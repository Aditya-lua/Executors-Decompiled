; FUN_008e4b20 @ 008e4b20
008e4b20	str x30,[sp, #-0x20]!
008e4b24	stp x20,x19,[sp, #0x10]
008e4b28	bl 0x008e4bc8
008e4b2c	cmp x20,#0x0
008e4b30	mov w8,#0x32
008e4b34	mov w9,#0x22
008e4b38	mov w2,w0
008e4b3c	csel w3,w9,w8,eq
008e4b40	sxtw x1,w19
008e4b44	mov w4,#0xffffffff
008e4b48	mov x0,x20
008e4b4c	mov x5,xzr
008e4b50	bl 0x00c30b60
008e4b54	ldp x20,x19,[sp, #0x10]
008e4b58	cmn x0,#0x1
008e4b5c	csel x0,xzr,x0,eq
008e4b60	ldr x30,[sp], #0x20
008e4b64	ret
