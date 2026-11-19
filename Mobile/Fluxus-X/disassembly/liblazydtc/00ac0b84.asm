; PKCS7_dataVerify @ 00ac0b84
00ac0b84	str x25,[sp, #-0x50]!
00ac0b88	stp x24,x23,[sp, #0x10]
00ac0b8c	stp x22,x21,[sp, #0x20]
00ac0b90	stp x20,x19,[sp, #0x30]
00ac0b94	stp x29,x30,[sp, #0x40]
00ac0b98	add x29,sp,#0x40
00ac0b9c	cbz x3,0x00ac0c58
00ac0ba0	ldr x8,[x3, #0x20]
00ac0ba4	mov x20,x3
00ac0ba8	cbz x8,0x00ac0c80
00ac0bac	mov x23,x0
00ac0bb0	ldr x0,[x20, #0x18]
00ac0bb4	mov x19,x4
00ac0bb8	mov x21,x2
00ac0bbc	mov x22,x1
00ac0bc0	bl 0x00c37750
00ac0bc4	cmp w0,#0x16
00ac0bc8	b.eq 0x00ac0bdc
00ac0bcc	ldr x0,[x20, #0x18]
00ac0bd0	bl 0x00c37750
00ac0bd4	cmp w0,#0x18
00ac0bd8	b.ne 0x00ac0cd0
00ac0bdc	ldr x8,[x20, #0x20]
00ac0be0	ldr x9,[x19, #0x8]
00ac0be4	ldr x25,[x8, #0x10]!
00ac0be8	ldp x1,x2,[x9]
00ac0bec	mov x0,x25
00ac0bf0	bl 0x00c3f7c0
00ac0bf4	cbz x0,0x00ac0ca8
00ac0bf8	mov x24,x0
00ac0bfc	mov x0,x22
00ac0c00	mov x1,x23
00ac0c04	mov x2,x24
00ac0c08	mov x3,x25
00ac0c0c	bl 0x00c34fc0
00ac0c10	cbz w0,0x00ac0cf8
00ac0c14	mov w1,#0x4
00ac0c18	mov x0,x22
00ac0c1c	bl 0x00c3f0c0
00ac0c20	mov x0,x22
00ac0c24	bl 0x00c350c0
00ac0c28	cmp w0,#0x0
00ac0c2c	b.le 0x00ac0d14
00ac0c30	mov x0,x21
00ac0c34	mov x1,x20
00ac0c38	mov x2,x19
00ac0c3c	mov x3,x24
00ac0c40	ldp x29,x30,[sp, #0x40]
00ac0c44	ldp x20,x19,[sp, #0x30]
00ac0c48	ldp x22,x21,[sp, #0x20]
00ac0c4c	ldp x24,x23,[sp, #0x10]
00ac0c50	ldr x25,[sp], #0x50
00ac0c54	b 0x00ac0d60
00ac0c58	bl 0x00c342a0
00ac0c5c	adrp x0,0x29e000
00ac0c60	adrp x2,0x2cb000
00ac0c64	add x0,x0,#0x913
00ac0c68	add x2,x2,#0xfc1
00ac0c6c	mov w1,#0x3c9
00ac0c70	bl 0x00c342b0
00ac0c74	mov w0,#0x21
00ac0c78	mov w1,#0x8f
00ac0c7c	b 0x00ac0d3c
00ac0c80	bl 0x00c342a0
00ac0c84	adrp x0,0x29e000
00ac0c88	adrp x2,0x2cb000
00ac0c8c	add x0,x0,#0x913
00ac0c90	add x2,x2,#0xfc1
00ac0c94	mov w1,#0x3ce
00ac0c98	bl 0x00c342b0
00ac0c9c	mov w0,#0x21
00ac0ca0	mov w1,#0x7a
00ac0ca4	b 0x00ac0d3c
00ac0ca8	bl 0x00c342a0
00ac0cac	adrp x0,0x29e000
00ac0cb0	adrp x2,0x2cb000
00ac0cb4	add x0,x0,#0x913
00ac0cb8	add x2,x2,#0xfc1
00ac0cbc	mov w1,#0x3e1
00ac0cc0	bl 0x00c342b0
00ac0cc4	mov w0,#0x21
00ac0cc8	mov w1,#0x6a
00ac0ccc	b 0x00ac0d3c
00ac0cd0	bl 0x00c342a0
00ac0cd4	adrp x0,0x29e000
00ac0cd8	adrp x2,0x2cb000
00ac0cdc	add x0,x0,#0x913
00ac0ce0	add x2,x2,#0xfc1
00ac0ce4	mov w1,#0x3d7
00ac0ce8	bl 0x00c342b0
00ac0cec	mov w0,#0x21
00ac0cf0	mov w1,#0x72
00ac0cf4	b 0x00ac0d3c
00ac0cf8	bl 0x00c342a0
00ac0cfc	adrp x0,0x29e000
00ac0d00	adrp x2,0x2cb000
00ac0d04	add x0,x0,#0x913
00ac0d08	add x2,x2,#0xfc1
00ac0d0c	mov w1,#0x3e7
00ac0d10	b 0x00ac0d2c
00ac0d14	bl 0x00c342a0
00ac0d18	adrp x0,0x29e000
00ac0d1c	adrp x2,0x2cb000
00ac0d20	add x0,x0,#0x913
00ac0d24	add x2,x2,#0xfc1
00ac0d28	mov w1,#0x3ed
00ac0d2c	bl 0x00c342b0
00ac0d30	mov w1,#0xb
00ac0d34	mov w0,#0x21
00ac0d38	movk w1,#0x8, LSL #16
00ac0d3c	mov x2,xzr
00ac0d40	bl 0x00c342c0
00ac0d44	ldp x29,x30,[sp, #0x40]
00ac0d48	ldp x20,x19,[sp, #0x30]
00ac0d4c	ldp x22,x21,[sp, #0x20]
00ac0d50	ldp x24,x23,[sp, #0x10]
00ac0d54	mov w0,wzr
00ac0d58	ldr x25,[sp], #0x50
00ac0d5c	ret
