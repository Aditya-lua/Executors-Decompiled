; FUN_008e4bc8 @ 008e4bc8
008e4b68	str x30,[sp, #-0x10]!
008e4b6c	cmp w0,#0x5
008e4b70	b.cs 0x008e4b88
008e4b74	adrp x8,0x744000
008e4b78	add x8,x8,#0xf40
008e4b7c	ldr w0,[x8, w0, SXTW #0x2]
008e4b80	ldr x30,[sp], #0x10
008e4b84	ret
008e4b88	adrp x1,0x2bc000
008e4b8c	adrp x2,0x2a5000
008e4b90	adrp x4,0x2b6000
008e4b94	add x1,x1,#0xd80
008e4b98	add x2,x2,#0x271
008e4b9c	add x4,x4,#0xe11
008e4ba0	mov w0,#0xffffffff
008e4ba4	mov w3,#0x79
008e4ba8	bl 0x00c30b30
008e4bac	adrp x1,0x2ce000
008e4bb0	adrp x2,0x2ce000
008e4bb4	add x1,x1,#0xe75
008e4bb8	add x2,x2,#0xe7e
008e4bbc	mov w0,#0xffffffff
008e4bc0	bl 0x00c30b30
008e4bc4	bl 0x00c30b40
008e4bc8	mov x20,x0
008e4bcc	mov w0,w2
008e4bd0	mov w19,w1
008e4bd4	b 0x008e4b68
