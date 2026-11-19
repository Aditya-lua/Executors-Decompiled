; cpr::Session::proceed @ 008f2c30
008f2c30	stp x20,x19,[sp, #-0x20]!
008f2c34	stp x29,x30,[sp, #0x10]
008f2c38	add x29,sp,#0x10
008f2c3c	mov x19,x0
008f2c40	mov x20,x8
008f2c44	bl 0x00c31270
008f2c48	ldr x8,[x19, #0x2a0]
008f2c4c	cbz x8,0x008f2c64
008f2c50	ldp x29,x30,[sp, #0x10]
008f2c54	mov x8,x20
008f2c58	mov x0,x19
008f2c5c	ldp x20,x19,[sp], #0x20
008f2c60	b 0x00c313b0
008f2c64	mov x0,x19
008f2c68	bl 0x00c31250
008f2c6c	ldp x29,x30,[sp, #0x10]
008f2c70	mov w1,w0
008f2c74	mov x8,x20
008f2c78	mov x0,x19
008f2c7c	ldp x20,x19,[sp], #0x20
008f2c80	b 0x00c31380
