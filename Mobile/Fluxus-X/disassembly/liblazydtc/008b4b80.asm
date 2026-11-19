; FUN_008b4b80 @ 008b4b80
008b4b80	stp x29,x30,[sp, #-0x30]!
008b4b84	str x21,[sp, #0x10]
008b4b88	stp x20,x19,[sp, #0x20]
008b4b8c	mov x29,sp
008b4b90	mov x19,x1
008b4b94	mov x20,x0
008b4b98	mov w21,#0xffffffed
008b4b9c	b 0x008b4ba8
008b4ba0	mov x0,x20
008b4ba4	bl 0x008be71c
008b4ba8	ldrb w8,[x20, #0x3]
008b4bac	cmp w8,#0x7f
008b4bb0	b.eq 0x008b4bb8
008b4bb4	cbnz w8,0x008b4c4c
008b4bb8	ldr x9,[x20, #0x20]
008b4bbc	ldr x8,[x20, #0x50]
008b4bc0	add x9,x9,x19
008b4bc4	cmp x8,x9
008b4bc8	b.ls 0x008b4c4c
008b4bcc	ldr x9,[x8, #0x8]
008b4bd0	strb wzr,[x20, #0x3]
008b4bd4	ldr w10,[x8, #0x2c]
008b4bd8	ldr x9,[x9]
008b4bdc	ldrb w11,[x9, #0x6]
008b4be0	cbz w11,0x008b4c30
008b4be4	tbnz w10,#0x4,0x008b4c40
008b4be8	and w10,w10,w21
008b4bec	mov x0,x20
008b4bf0	mov w1,wzr
008b4bf4	str w10,[x8, #0x2c]
008b4bf8	ldr x8,[x9, #0x20]
008b4bfc	blr x8
008b4c00	ldrb w8,[x20, #0x3]
008b4c04	cmp w8,#0x7f
008b4c08	b.eq 0x008b4ba8
008b4c0c	cmp w8,#0x1
008b4c10	b.eq 0x008b4c4c
008b4c14	cmp w8,#0x6
008b4c18	b.eq 0x008b4c4c
008b4c1c	ldr x8,[x20, #0x68]
008b4c20	sub x1,x8,w0, SXTW  #0x4
008b4c24	mov x0,x20
008b4c28	bl 0x008c8c74
008b4c2c	b 0x008b4ba8
008b4c30	tbz w10,#0x3,0x008b4ba0
008b4c34	mov x0,x20
008b4c38	bl 0x008c8948
008b4c3c	b 0x008b4ba0
008b4c40	mov x0,x20
008b4c44	bl 0x008c8d44
008b4c48	b 0x008b4ba8
008b4c4c	ldp x20,x19,[sp, #0x20]
008b4c50	ldr x21,[sp, #0x10]
008b4c54	ldp x29,x30,[sp], #0x30
008b4c58	ret
