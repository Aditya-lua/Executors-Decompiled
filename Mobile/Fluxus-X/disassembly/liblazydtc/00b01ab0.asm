; X509V3_extensions_print @ 00b01ab0
00b01ab0	stp x28,x27,[sp, #-0x60]!
00b01ab4	stp x22,x21,[sp, #0x30]
00b01ab8	mov x22,x0
00b01abc	mov x0,x2
00b01ac0	stp x26,x25,[sp, #0x10]
00b01ac4	stp x24,x23,[sp, #0x20]
00b01ac8	stp x20,x19,[sp, #0x40]
00b01acc	stp x29,x30,[sp, #0x50]
00b01ad0	add x29,sp,#0x50
00b01ad4	mov w19,w4
00b01ad8	mov x20,x3
00b01adc	mov x21,x2
00b01ae0	mov x23,x1
00b01ae4	bl 0x00c325e0
00b01ae8	cmp w0,#0x1
00b01aec	b.lt 0x00b01c48
00b01af0	cbz x23,0x00b01b18
00b01af4	adrp x1,0x2b8000
00b01af8	adrp x3,0x2ab000
00b01afc	add x1,x1,#0x588
00b01b00	add x3,x3,#0x32c
00b01b04	mov x0,x22
00b01b08	mov w2,w19
00b01b0c	mov x4,x23
00b01b10	bl 0x00c32250
00b01b14	add w19,w19,#0x4
00b01b18	mov x0,x21
00b01b1c	bl 0x00c325e0
00b01b20	cmp w0,#0x1
00b01b24	b.lt 0x00b01c48
00b01b28	adrp x25,0x2ab000
00b01b2c	adrp x27,0x2bb000
00b01b30	mov w23,wzr
00b01b34	add w24,w19,#0x4
00b01b38	add x25,x25,#0x32c
00b01b3c	add x27,x27,#0x9d8
00b01b40	mov x0,x21
00b01b44	mov w1,w23
00b01b48	bl 0x00c32610
00b01b4c	mov x28,x0
00b01b50	bl 0x00c32b70
00b01b54	mov x26,x0
00b01b58	tbz w20,#0xd,0x00b01b7c
00b01b5c	mov x0,x26
00b01b60	bl 0x00c37750
00b01b64	cmp w0,#0x52
00b01b68	b.eq 0x00b01b7c
00b01b6c	mov x0,x26
00b01b70	bl 0x00c37750
00b01b74	cmp w0,#0x5a
00b01b78	b.ne 0x00b01c34
00b01b7c	cbz w19,0x00b01b9c
00b01b80	mov x0,x22
00b01b84	mov x1,x27
00b01b88	mov w2,w19
00b01b8c	mov x3,x25
00b01b90	bl 0x00c32250
00b01b94	cmp w0,#0x1
00b01b98	b.lt 0x00b01c50
00b01b9c	mov x0,x22
00b01ba0	mov x1,x26
00b01ba4	bl 0x00c32da0
00b01ba8	mov x0,x28
00b01bac	bl 0x00c40890
00b01bb0	adrp x8,0x29e000
00b01bb4	cmp w0,#0x0
00b01bb8	add x8,x8,#0xb9f
00b01bbc	adrp x1,0x2a2000
00b01bc0	csel x2,x25,x8,eq
00b01bc4	mov x0,x22
00b01bc8	add x1,x1,#0xe1f
00b01bcc	bl 0x00c32250
00b01bd0	cmp w0,#0x1
00b01bd4	b.lt 0x00b01c50
00b01bd8	mov x0,x22
00b01bdc	mov x1,x28
00b01be0	mov x2,x20
00b01be4	mov w3,w24
00b01be8	bl 0x00b017fc
00b01bec	cbnz w0,0x00b01c18
00b01bf0	mov x0,x22
00b01bf4	mov x1,x27
00b01bf8	mov w2,w24
00b01bfc	mov x3,x25
00b01c00	bl 0x00c32250
00b01c04	mov x0,x28
00b01c08	bl 0x00c32b60
00b01c0c	mov x1,x0
00b01c10	mov x0,x22
00b01c14	bl 0x00c32150
00b01c18	adrp x1,0x2c4000
00b01c1c	mov w2,#0x1
00b01c20	mov x0,x22
00b01c24	add x1,x1,#0xdae
00b01c28	bl 0x00c34240
00b01c2c	cmp w0,#0x1
00b01c30	b.lt 0x00b01c50
00b01c34	mov x0,x21
00b01c38	add w23,w23,#0x1
00b01c3c	bl 0x00c325e0
00b01c40	cmp w23,w0
00b01c44	b.lt 0x00b01b40
00b01c48	mov w0,#0x1
00b01c4c	b 0x00b01c54
00b01c50	mov w0,wzr
00b01c54	ldp x29,x30,[sp, #0x50]
00b01c58	ldp x20,x19,[sp, #0x40]
00b01c5c	ldp x22,x21,[sp, #0x30]
00b01c60	ldp x24,x23,[sp, #0x20]
00b01c64	ldp x26,x25,[sp, #0x10]
00b01c68	ldp x28,x27,[sp], #0x60
00b01c6c	ret
