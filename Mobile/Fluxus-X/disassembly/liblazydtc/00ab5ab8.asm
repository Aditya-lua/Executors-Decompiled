; PEM_dek_info @ 00ab5ab8
00ab5ab8	stp x24,x23,[sp, #-0x40]!
00ab5abc	stp x22,x21,[sp, #0x10]
00ab5ac0	stp x20,x19,[sp, #0x20]
00ab5ac4	stp x29,x30,[sp, #0x30]
00ab5ac8	add x29,sp,#0x30
00ab5acc	mov x19,x3
00ab5ad0	mov w21,w2
00ab5ad4	mov x22,x1
00ab5ad8	mov x20,x0
00ab5adc	bl 0x00c2ff50
00ab5ae0	mov w8,#0x400
00ab5ae4	add x20,x20,x0
00ab5ae8	sub w23,w8,w0
00ab5aec	adrp x2,0x2d8000
00ab5af0	sxtw x1,w23
00ab5af4	add x2,x2,#0x5b8
00ab5af8	mov x0,x20
00ab5afc	mov x3,x22
00ab5b00	bl 0x00c34d30
00ab5b04	cmp w0,#0x1
00ab5b08	b.lt 0x00ab5b6c
00ab5b0c	sub w22,w23,w0
00ab5b10	cmp w21,#0x1
00ab5b14	add x20,x20,w0, SXTW 
00ab5b18	b.lt 0x00ab5b5c
00ab5b1c	sxtw x24,w21
00ab5b20	adrp x21,0x2c7000
00ab5b24	mov x23,xzr
00ab5b28	add x21,x21,#0x74b
00ab5b2c	ldrb w3,[x19, x23]
00ab5b30	sxtw x1,w22
00ab5b34	mov x0,x20
00ab5b38	mov x2,x21
00ab5b3c	bl 0x00c34d30
00ab5b40	cmp w0,#0x1
00ab5b44	b.lt 0x00ab5b6c
00ab5b48	add x23,x23,#0x1
00ab5b4c	sub w22,w22,w0
00ab5b50	cmp x23,x24
00ab5b54	add x20,x20,w0, SXTW 
00ab5b58	b.lt 0x00ab5b2c
00ab5b5c	cmp w22,#0x1
00ab5b60	b.le 0x00ab5b6c
00ab5b64	mov w8,#0xa
00ab5b68	strh w8,[x20]
00ab5b6c	ldp x29,x30,[sp, #0x30]
00ab5b70	ldp x20,x19,[sp, #0x20]
00ab5b74	ldp x22,x21,[sp, #0x10]
00ab5b78	ldp x24,x23,[sp], #0x40
00ab5b7c	ret
