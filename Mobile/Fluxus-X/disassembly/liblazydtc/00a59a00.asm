; EVP_EncodeUpdate @ 00a59a00
00a59a00	str x25,[sp, #-0x50]!
00a59a04	stp x20,x19,[sp, #0x30]
00a59a08	mov w19,w4
00a59a0c	cmp w4,#0x1
00a59a10	stp x24,x23,[sp, #0x10]
00a59a14	stp x22,x21,[sp, #0x20]
00a59a18	stp x29,x30,[sp, #0x40]
00a59a1c	add x29,sp,#0x40
00a59a20	str wzr,[x2]
00a59a24	b.lt 0x00a59a74
00a59a28	mov x22,x3
00a59a2c	ldr w3,[x0, #0x4]
00a59a30	mov x20,x0
00a59a34	cmp w3,#0x51
00a59a38	b.ge 0x00a59ba0
00a59a3c	ldrsw x8,[x20]
00a59a40	sxtw x9,w3
00a59a44	sub x24,x9,x8
00a59a48	cmp w24,w19
00a59a4c	b.le 0x00a59a7c
00a59a50	add x8,x20,x8
00a59a54	add x0,x8,#0x8
00a59a58	sxtw x2,w19
00a59a5c	mov x1,x22
00a59a60	bl 0x00c2ffd0
00a59a64	ldr w8,[x20]
00a59a68	add w8,w8,w19
00a59a6c	str w8,[x20]
00a59a70	b 0x00a59b84
00a59a74	mov w0,wzr
00a59a78	b 0x00a59b88
00a59a7c	mov x21,x2
00a59a80	mov x23,x1
00a59a84	cbz w8,0x00a59b48
00a59a88	add x25,x20,#0x8
00a59a8c	add x0,x25,x8
00a59a90	mov x1,x22
00a59a94	mov x2,x24
00a59a98	bl 0x00c2ffd0
00a59a9c	ldr w3,[x20, #0x4]
00a59aa0	mov x0,x20
00a59aa4	mov x1,x23
00a59aa8	mov x2,x25
00a59aac	add x22,x22,x24
00a59ab0	sub w19,w19,w24
00a59ab4	bl 0x00a59bb8
00a59ab8	ldrb w8,[x20, #0x5c]
00a59abc	sxtw x24,w0
00a59ac0	add x23,x23,x24
00a59ac4	str wzr,[x20]
00a59ac8	tbnz w8,#0x0,0x00a59ad8
00a59acc	mov w8,#0xa
00a59ad0	strb w8,[x23], #0x1
00a59ad4	add x24,x24,#0x1
00a59ad8	strb wzr,[x23]
00a59adc	ldr w3,[x20, #0x4]
00a59ae0	lsr x8,x24,#0x1f
00a59ae4	cbnz x8,0x00a59b54
00a59ae8	cmp w19,w3
00a59aec	b.lt 0x00a59b54
00a59af0	mov w25,#0xa
00a59af4	mov x0,x20
00a59af8	mov x1,x23
00a59afc	mov x2,x22
00a59b00	bl 0x00a59bb8
00a59b04	ldrsw x8,[x20, #0x4]
00a59b08	ldrb w10,[x20, #0x5c]
00a59b0c	sxtw x9,w0
00a59b10	add x23,x23,x9
00a59b14	add x22,x22,x8
00a59b18	sub w19,w19,w8
00a59b1c	add x24,x24,x9
00a59b20	tbnz w10,#0x0,0x00a59b2c
00a59b24	strb w25,[x23], #0x1
00a59b28	add x24,x24,#0x1
00a59b2c	lsr x8,x24,#0x1f
00a59b30	strb wzr,[x23]
00a59b34	cbnz x8,0x00a59b54
00a59b38	ldr w3,[x20, #0x4]
00a59b3c	cmp w19,w3
00a59b40	b.ge 0x00a59af4
00a59b44	b 0x00a59b54
00a59b48	mov x24,xzr
00a59b4c	lsr x8,x24,#0x1f
00a59b50	cbz x8,0x00a59ae8
00a59b54	lsr x8,x24,#0x1f
00a59b58	cbz x8,0x00a59b68
00a59b5c	mov w0,wzr
00a59b60	str wzr,[x21]
00a59b64	b 0x00a59b88
00a59b68	cbz w19,0x00a59b7c
00a59b6c	add x0,x20,#0x8
00a59b70	sxtw x2,w19
00a59b74	mov x1,x22
00a59b78	bl 0x00c2ffd0
00a59b7c	str w19,[x20]
00a59b80	str w24,[x21]
00a59b84	mov w0,#0x1
00a59b88	ldp x29,x30,[sp, #0x40]
00a59b8c	ldp x20,x19,[sp, #0x30]
00a59b90	ldp x22,x21,[sp, #0x20]
00a59b94	ldp x24,x23,[sp, #0x10]
00a59b98	ldr x25,[sp], #0x50
00a59b9c	ret
00a59ba0	adrp x0,0x2c1000
00a59ba4	adrp x1,0x2b4000
00a59ba8	add x0,x0,#0xc59
00a59bac	add x1,x1,#0x242
00a59bb0	mov w2,#0xab
00a59bb4	bl 0x00c3c240
