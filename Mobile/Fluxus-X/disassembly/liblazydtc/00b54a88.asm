; FUN_00b54a88 @ 00b54a88
00b54a88	str x21,[sp, #-0x30]!
00b54a8c	stp x20,x19,[sp, #0x10]
00b54a90	stp x29,x30,[sp, #0x20]
00b54a94	mov x19,x0
00b54a98	ldr x0,[x0]
00b54a9c	add x29,sp,#0x20
00b54aa0	mov x20,x1
00b54aa4	bl 0x00c41210
00b54aa8	cbz x20,0x00b54b98
00b54aac	mov x2,x0
00b54ab0	add x0,x19,#0x10
00b54ab4	mov x1,x20
00b54ab8	bl 0x00c41150
00b54abc	cbz w0,0x00b54b9c
00b54ac0	adrp x1,0x2c4000
00b54ac4	add x1,x1,#0x73a
00b54ac8	mov x0,x20
00b54acc	bl 0x00c36530
00b54ad0	str wzr,[sp, #0x8]
00b54ad4	cbz x0,0x00b54af8
00b54ad8	add x1,sp,#0x8
00b54adc	bl 0x00c36510
00b54ae0	cbz w0,0x00b54b9c
00b54ae4	ldr w8,[sp, #0x8]
00b54ae8	cmp w8,#0x0
00b54aec	mov w8,#0x100
00b54af0	csel w21,wzr,w8,eq
00b54af4	b 0x00b54afc
00b54af8	mov w21,wzr
00b54afc	adrp x1,0x2c0000
00b54b00	add x1,x1,#0x97a
00b54b04	mov x0,x20
00b54b08	bl 0x00c36530
00b54b0c	str wzr,[sp, #0xc]
00b54b10	cbz x0,0x00b54b30
00b54b14	add x1,sp,#0xc
00b54b18	bl 0x00c36510
00b54b1c	cbz w0,0x00b54b9c
00b54b20	ldr w8,[sp, #0xc]
00b54b24	cbz w8,0x00b54b30
00b54b28	orr w21,w21,#0x1
00b54b2c	b 0x00b54b34
00b54b30	cbz w21,0x00b54b40
00b54b34	ldr x0,[x19, #0x8]
00b54b38	sxtw x1,w21
00b54b3c	bl 0x00c3dd50
00b54b40	adrp x1,0x2c5000
00b54b44	add x1,x1,#0x67e
00b54b48	mov x0,x20
00b54b4c	bl 0x00c36530
00b54b50	cbz x0,0x00b54b78
00b54b54	ldr w9,[x0, #0x8]
00b54b58	mov x8,x0
00b54b5c	mov w0,wzr
00b54b60	cmp w9,#0x5
00b54b64	b.ne 0x00b54b9c
00b54b68	ldp x1,x2,[x8, #0x10]
00b54b6c	mov x0,x19
00b54b70	bl 0x00b54bac
00b54b74	cbz w0,0x00b54b9c
00b54b78	adrp x1,0x2d5000
00b54b7c	add x1,x1,#0x970
00b54b80	mov x0,x20
00b54b84	bl 0x00c36530
00b54b88	cbz x0,0x00b54b98
00b54b8c	add x1,x19,#0x38
00b54b90	bl 0x00c3e920
00b54b94	cbz w0,0x00b54b9c
00b54b98	mov w0,#0x1
00b54b9c	ldp x29,x30,[sp, #0x20]
00b54ba0	ldp x20,x19,[sp, #0x10]
00b54ba4	ldr x21,[sp], #0x30
00b54ba8	ret
