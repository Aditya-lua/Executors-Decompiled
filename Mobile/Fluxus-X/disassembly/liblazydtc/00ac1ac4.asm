; FUN_00ac1ac4 @ 00ac1ac4
00ac1ac4	stp x26,x25,[sp, #-0x50]!
00ac1ac8	stp x24,x23,[sp, #0x10]
00ac1acc	stp x22,x21,[sp, #0x20]
00ac1ad0	stp x20,x19,[sp, #0x30]
00ac1ad4	stp x29,x30,[sp, #0x40]
00ac1ad8	add x29,sp,#0x40
00ac1adc	mov x19,x3
00ac1ae0	mov x20,x2
00ac1ae4	mov w24,w1
00ac1ae8	mov x22,x0
00ac1aec	bl 0x00c321b0
00ac1af0	mov x23,x0
00ac1af4	mov x0,x22
00ac1af8	bl 0x00c35620
00ac1afc	cbz x23,0x00ac1cfc
00ac1b00	mov x21,x0
00ac1b04	cmp w24,#0x64
00ac1b08	b.gt 0x00ac1b6c
00ac1b0c	sub w8,w24,#0x1
00ac1b10	cmp w8,#0xc
00ac1b14	b.hi 0x00ac1cd0
00ac1b18	adrp x9,0x774000
00ac1b1c	add x9,x9,#0x560
00ac1b20	ldrsw x8,[x9, x8, LSL #0x2]
00ac1b24	add x8,x8,x9
00ac1b28	br x8
00ac1b2c	adrp x8,0x29b000
00ac1b30	ldr x22,[x23, #0x18]
00ac1b34	ldr d0,[x8, #0x470]
00ac1b38	mov x0,x22
00ac1b3c	stur d0,[x23, #0xc]
00ac1b40	bl 0x00c3cec0
00ac1b44	mov w5,w0
00ac1b48	mov x0,x22
00ac1b4c	mov x1,xzr
00ac1b50	mov x2,xzr
00ac1b54	mov x3,xzr
00ac1b58	mov x4,xzr
00ac1b5c	bl 0x00c34be0
00ac1b60	cbz w0,0x00ac1cc8
00ac1b64	mov w1,#0x1
00ac1b68	b 0x00ac1c84
00ac1b6c	cmp w24,#0x65
00ac1b70	b.eq 0x00ac1c8c
00ac1b74	cmp w24,#0x71
00ac1b78	b.eq 0x00ac1cc0
00ac1b7c	cmp w24,#0x81
00ac1b80	b.ne 0x00ac1cd0
00ac1b84	ldr x8,[x23, #0x18]
00ac1b88	mov w1,#0x1
00ac1b8c	mov w23,#0x1
00ac1b90	mov x0,x22
00ac1b94	str x8,[x19]
00ac1b98	b 0x00ac1c68
00ac1b9c	ldr w8,[x23, #0x8]
00ac1ba0	cmp w8,#0x1
00ac1ba4	b.lt 0x00ac1cf8
00ac1ba8	mov w1,#0x2
00ac1bac	b 0x00ac1c84
00ac1bb0	ldpsw x8,x9,[x23]
00ac1bb4	sub x23,x8,x9
00ac1bb8	cmp w23,#0x0
00ac1bbc	b.gt 0x00ac1cfc
00ac1bc0	mov w1,#0xa
00ac1bc4	b 0x00ac1c84
00ac1bc8	add x24,x23,#0x30
00ac1bcc	mov w25,#0x1
00ac1bd0	ldp w8,w9,[x23]
00ac1bd4	subs w26,w8,w9
00ac1bd8	b.eq 0x00ac1c04
00ac1bdc	mov x0,x22
00ac1be0	mov x1,xzr
00ac1be4	mov w2,wzr
00ac1be8	bl 0x00ac1628
00ac1bec	tbnz w0,#0x1f,0x00ac1c30
00ac1bf0	ldp w8,w9,[x23]
00ac1bf4	sub w10,w8,w9
00ac1bf8	cmp w10,w26
00ac1bfc	b.ne 0x00ac1bd4
00ac1c00	b 0x00ac1c30
00ac1c04	ldr w8,[x23, #0xc]
00ac1c08	cbnz w8,0x00ac1d18
00ac1c0c	ldr x0,[x23, #0x18]
00ac1c10	mov x1,x24
00ac1c14	mov x2,x23
00ac1c18	str w25,[x23, #0xc]
00ac1c1c	str wzr,[x23, #0x4]
00ac1c20	bl 0x00c36e20
00ac1c24	cmp w0,#0x1
00ac1c28	str w0,[x23, #0x10]
00ac1c2c	b.ge 0x00ac1bd0
00ac1c30	sxtw x23,w0
00ac1c34	b 0x00ac1cfc
00ac1c38	mov x0,x19
00ac1c3c	bl 0x00c321b0
00ac1c40	mov x20,x0
00ac1c44	bl 0x00c34b90
00ac1c48	str x0,[x20, #0x18]
00ac1c4c	cbz x0,0x00ac1cc8
00ac1c50	ldr x1,[x23, #0x18]
00ac1c54	bl 0x00c3cc90
00ac1c58	cbz w0,0x00ac1cc8
00ac1c5c	sxtw x23,w0
00ac1c60	mov w1,#0x1
00ac1c64	mov x0,x19
00ac1c68	bl 0x00c322b0
00ac1c6c	b 0x00ac1cfc
00ac1c70	ldpsw x8,x9,[x23]
00ac1c74	sub x23,x8,x9
00ac1c78	cmp w23,#0x0
00ac1c7c	b.gt 0x00ac1cfc
00ac1c80	mov w1,#0xd
00ac1c84	mov x0,x21
00ac1c88	b 0x00ac1cd8
00ac1c8c	orr w1,wzr,#0xf
00ac1c90	mov x0,x22
00ac1c94	bl 0x00c32190
00ac1c98	mov w1,#0x65
00ac1c9c	mov x0,x21
00ac1ca0	mov x2,x20
00ac1ca4	mov x3,x19
00ac1ca8	bl 0x00c321a0
00ac1cac	mov x19,x0
00ac1cb0	mov x0,x22
00ac1cb4	bl 0x00c38460
00ac1cb8	mov x0,x19
00ac1cbc	b 0x00ac1d00
00ac1cc0	ldrsw x23,[x23, #0x10]
00ac1cc4	b 0x00ac1cfc
00ac1cc8	mov x23,xzr
00ac1ccc	b 0x00ac1cfc
00ac1cd0	mov x0,x21
00ac1cd4	mov w1,w24
00ac1cd8	mov x2,x20
00ac1cdc	mov x3,x19
00ac1ce0	ldp x29,x30,[sp, #0x40]
00ac1ce4	ldp x20,x19,[sp, #0x30]
00ac1ce8	ldp x22,x21,[sp, #0x20]
00ac1cec	ldp x24,x23,[sp, #0x10]
00ac1cf0	ldp x26,x25,[sp], #0x50
00ac1cf4	b 0x00c321a0
00ac1cf8	mov w23,#0x1
00ac1cfc	mov x0,x23
00ac1d00	ldp x29,x30,[sp, #0x40]
00ac1d04	ldp x20,x19,[sp, #0x30]
00ac1d08	ldp x22,x21,[sp, #0x20]
00ac1d0c	ldp x24,x23,[sp, #0x10]
00ac1d10	ldp x26,x25,[sp], #0x50
00ac1d14	ret
00ac1d18	mov w1,#0xb
00ac1d1c	b 0x00ac1c84
