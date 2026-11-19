; FUN_009a9a60 @ 009a9a60
009a9a60	stp x24,x23,[sp, #-0x40]!
009a9a64	stp x22,x21,[sp, #0x10]
009a9a68	stp x20,x19,[sp, #0x20]
009a9a6c	stp x29,x30,[sp, #0x30]
009a9a70	add x29,sp,#0x30
009a9a74	mov x20,x4
009a9a78	mov w21,w3
009a9a7c	mov x22,x2
009a9a80	mov x23,x1
009a9a84	mov x19,x0
009a9a88	bl 0x00c30710
009a9a8c	str wzr,[x0]
009a9a90	ldr w8,[x19, #0x1ac]
009a9a94	cbz w8,0x009a9adc
009a9a98	add x24,x19,#0xc58
009a9a9c	mov x0,x24
009a9aa0	bl 0x00c347c0
009a9aa4	cbnz w0,0x009a9adc
009a9aa8	mov x0,x24
009a9aac	bl 0x00c347d0
009a9ab0	cbnz w0,0x009a9adc
009a9ab4	mov x0,x19
009a9ab8	bl 0x00c344e0
009a9abc	cbnz w0,0x009a9adc
009a9ac0	mov x0,x19
009a9ac4	bl 0x00c34830
009a9ac8	ldr d0,[x19, #0x1b0]
009a9acc	movi v1.2S,#0x1
009a9ad0	str wzr,[x19, #0x1ac]
009a9ad4	add v0.2S,v0.2S,v1.2S
009a9ad8	str d0,[x19, #0x1b0]
009a9adc	ldr x8,[x19, #0x8]
009a9ae0	mov w9,#0x1
009a9ae4	str w9,[x19, #0x1b8]
009a9ae8	mov w1,#0x17
009a9aec	ldr x8,[x8, #0x68]
009a9af0	mov x0,x19
009a9af4	mov x2,xzr
009a9af8	mov x3,x23
009a9afc	mov x4,x22
009a9b00	mov w5,w21
009a9b04	mov x6,x20
009a9b08	blr x8
009a9b0c	cmn w0,#0x1
009a9b10	b.ne 0x009a9b6c
009a9b14	ldr w8,[x19, #0x1b8]
009a9b18	cmp w8,#0x2
009a9b1c	b.ne 0x009a9b6c
009a9b20	mov w1,#0x1
009a9b24	mov x0,x19
009a9b28	bl 0x00c34820
009a9b2c	ldr x8,[x19, #0x8]
009a9b30	mov w1,#0x17
009a9b34	mov x0,x19
009a9b38	mov x2,xzr
009a9b3c	ldr x8,[x8, #0x68]
009a9b40	mov x3,x23
009a9b44	mov x4,x22
009a9b48	mov w5,w21
009a9b4c	mov x6,x20
009a9b50	blr x8
009a9b54	mov w20,w0
009a9b58	mov x0,x19
009a9b5c	mov w1,wzr
009a9b60	bl 0x00c34820
009a9b64	mov w0,w20
009a9b68	b 0x009a9b70
009a9b6c	str wzr,[x19, #0x1b8]
009a9b70	ldp x29,x30,[sp, #0x30]
009a9b74	ldp x20,x19,[sp, #0x20]
009a9b78	ldp x22,x21,[sp, #0x10]
009a9b7c	ldp x24,x23,[sp], #0x40
009a9b80	ret
