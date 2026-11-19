; FUN_00ae8ba0 @ 00ae8ba0
00ae8ba0	str x21,[sp, #-0x30]!
00ae8ba4	stp x20,x19,[sp, #0x10]
00ae8ba8	stp x29,x30,[sp, #0x20]
00ae8bac	ldr w8,[x0]
00ae8bb0	orr w9,wzr,#0x7fffffff
00ae8bb4	add x29,sp,#0x20
00ae8bb8	sub w9,w9,w8
00ae8bbc	cmp w9,w1
00ae8bc0	b.ge 0x00ae8bf8
00ae8bc4	bl 0x00c342a0
00ae8bc8	adrp x0,0x2c6000
00ae8bcc	adrp x2,0x2d0000
00ae8bd0	add x0,x0,#0x275
00ae8bd4	add x2,x2,#0x3a4
00ae8bd8	mov w1,#0xb4
00ae8bdc	bl 0x00c342b0
00ae8be0	orr w0,wzr,#0xf
00ae8be4	mov w1,#0x72
00ae8be8	mov x2,xzr
00ae8bec	bl 0x00c342c0
00ae8bf0	mov w0,wzr
00ae8bf4	b 0x00ae8ce4
00ae8bf8	mov x19,x0
00ae8bfc	ldr x0,[x0, #0x8]
00ae8c00	add w8,w8,w1
00ae8c04	cmp w8,#0x4
00ae8c08	mov w9,#0x4
00ae8c0c	csel w21,w8,w9,gt
00ae8c10	cbz x0,0x00ae8c2c
00ae8c14	ldr w20,[x19, #0x14]
00ae8c18	cbz w2,0x00ae8c54
00ae8c1c	cmp w21,w20
00ae8c20	mov w20,w21
00ae8c24	b.ne 0x00ae8cc0
00ae8c28	b 0x00ae8ce0
00ae8c2c	mov w8,w21
00ae8c30	adrp x1,0x2c6000
00ae8c34	lsl x0,x8,#0x3
00ae8c38	add x1,x1,#0x275
00ae8c3c	mov w2,#0xc3
00ae8c40	bl 0x00c34250
00ae8c44	str x0,[x19, #0x8]
00ae8c48	cbz x0,0x00ae8ca0
00ae8c4c	str w21,[x19, #0x14]
00ae8c50	b 0x00ae8ce0
00ae8c54	cmp w21,w20
00ae8c58	b.le 0x00ae8ce0
00ae8c5c	mov w8,#0x5554
00ae8c60	movk w8,#0x5555, LSL #16
00ae8c64	cmp w20,w8
00ae8c68	b.gt 0x00ae8cbc
00ae8c6c	cmp w20,#0x0
00ae8c70	cinc w9,w20,lt
00ae8c74	add w20,w20,w9, ASR #0x1
00ae8c78	cmp w20,w21
00ae8c7c	b.lt 0x00ae8c64
00ae8c80	cbnz w20,0x00ae8cc0
00ae8c84	bl 0x00c342a0
00ae8c88	adrp x0,0x2c6000
00ae8c8c	adrp x2,0x2d0000
00ae8c90	add x0,x0,#0x275
00ae8c94	add x2,x2,#0x3a4
00ae8c98	mov w1,#0xd0
00ae8c9c	b 0x00ae8bdc
00ae8ca0	bl 0x00c342a0
00ae8ca4	adrp x0,0x2c6000
00ae8ca8	adrp x2,0x2d0000
00ae8cac	add x0,x0,#0x275
00ae8cb0	add x2,x2,#0x3a4
00ae8cb4	mov w1,#0xc4
00ae8cb8	b 0x00ae8d0c
00ae8cbc	orr w20,wzr,#0x7fffffff
00ae8cc0	adrp x2,0x2c6000
00ae8cc4	sbfiz x1,x20,#0x3,#0x20
00ae8cc8	add x2,x2,#0x275
00ae8ccc	mov w3,#0xd7
00ae8cd0	bl 0x00c356f0
00ae8cd4	cbz x0,0x00ae8cf4
00ae8cd8	str x0,[x19, #0x8]
00ae8cdc	str w20,[x19, #0x14]
00ae8ce0	mov w0,#0x1
00ae8ce4	ldp x29,x30,[sp, #0x20]
00ae8ce8	ldp x20,x19,[sp, #0x10]
00ae8cec	ldr x21,[sp], #0x30
00ae8cf0	ret
00ae8cf4	bl 0x00c342a0
00ae8cf8	adrp x0,0x2c6000
00ae8cfc	adrp x2,0x2d0000
00ae8d00	add x0,x0,#0x275
00ae8d04	add x2,x2,#0x3a4
00ae8d08	mov w1,#0xd9
00ae8d0c	bl 0x00c342b0
00ae8d10	mov w1,#0x100
00ae8d14	orr w0,wzr,#0xf
00ae8d18	movk w1,#0xc, LSL #16
00ae8d1c	b 0x00ae8be8
