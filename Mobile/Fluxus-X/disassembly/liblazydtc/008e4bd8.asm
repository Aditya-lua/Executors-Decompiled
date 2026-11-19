; CodePatch @ 008e4bd8
008e4bd8	stp x30,x23,[sp, #-0x30]!
008e4bdc	stp x22,x21,[sp, #0x10]
008e4be0	stp x20,x19,[sp, #0x20]
008e4be4	mov x21,x0
008e4be8	mov w0,#0x27
008e4bec	mov w19,w2
008e4bf0	mov x20,x1
008e4bf4	bl 0x00c30bc0
008e4bf8	mov x8,xzr
008e4bfc	sub x8,x8,w0, SXTW 
008e4c00	sxtw x22,w0
008e4c04	and x23,x8,x21
008e4c08	mov w2,#0x7
008e4c0c	mov x0,x23
008e4c10	mov x1,x22
008e4c14	sub w21,w21,w23
008e4c18	bl 0x00c30b70
008e4c1c	add x21,x23,w21, SXTW 
008e4c20	mov w2,w19
008e4c24	mov x0,x21
008e4c28	mov x1,x20
008e4c2c	bl 0x00c2ffd0
008e4c30	mov w2,#0x5
008e4c34	mov x0,x23
008e4c38	mov x1,x22
008e4c3c	bl 0x00c30b70
008e4c40	add x1,x21,w19, UXTW 
008e4c44	mov x0,x21
008e4c48	bl 0x008e4ce4
008e4c4c	ldp x20,x19,[sp, #0x20]
008e4c50	ldp x22,x21,[sp, #0x10]
008e4c54	mov w0,wzr
008e4c58	ldp x30,x23,[sp], #0x30
008e4c5c	ret
