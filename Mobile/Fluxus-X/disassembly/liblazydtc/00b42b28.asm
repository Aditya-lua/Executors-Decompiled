; FUN_00b42b28 @ 00b42b28
00b42b28	sub sp,sp,#0x50
00b42b2c	str x23,[sp, #0x10]
00b42b30	stp x22,x21,[sp, #0x20]
00b42b34	stp x20,x19,[sp, #0x30]
00b42b38	stp x29,x30,[sp, #0x40]
00b42b3c	add x29,sp,#0x40
00b42b40	mov x22,x3
00b42b44	mov x19,x2
00b42b48	mov x21,x1
00b42b4c	mov x20,x0
00b42b50	bl 0x00c41000
00b42b54	cbz w0,0x00b42ca4
00b42b58	ldr w8,[x20, #0x1c]
00b42b5c	cmp w8,#0x1
00b42b60	b.eq 0x00b42b9c
00b42b64	mov w23,wzr
00b42b68	cbnz w8,0x00b42ca8
00b42b6c	ldrb w8,[x20, #0x18]
00b42b70	mov x0,x20
00b42b74	mov x1,x21
00b42b78	mov x2,x19
00b42b7c	mov x3,x22
00b42b80	ldp x29,x30,[sp, #0x40]
00b42b84	ldp x20,x19,[sp, #0x30]
00b42b88	ldp x22,x21,[sp, #0x20]
00b42b8c	ldr x23,[sp, #0x10]
00b42b90	and w4,w8,#0x1
00b42b94	add sp,sp,#0x50
00b42b98	b 0x00b433a4
00b42b9c	ldr x8,[x20, #0x38]
00b42ba0	cbz x21,0x00b42bd4
00b42ba4	cmp x8,x22
00b42ba8	b.ls 0x00b42be0
00b42bac	bl 0x00c342a0
00b42bb0	adrp x0,0x2ce000
00b42bb4	adrp x2,0x2a1000
00b42bb8	add x0,x0,#0x8d0
00b42bbc	add x2,x2,#0x42
00b42bc0	orr w1,wzr,#0xc0
00b42bc4	bl 0x00c342b0
00b42bc8	mov w0,#0x39
00b42bcc	mov w1,#0x6a
00b42bd0	b 0x00b42c9c
00b42bd4	str x8,[x19]
00b42bd8	mov w23,#0x1
00b42bdc	b 0x00b42ca8
00b42be0	ldr x0,[x20, #0x8]
00b42be4	cbz x0,0x00b42c78
00b42be8	ldr x8,[x20, #0x10]
00b42bec	cbz x8,0x00b42c78
00b42bf0	bl 0x00c39b50
00b42bf4	sxtw x23,w0
00b42bf8	adrp x1,0x2ce000
00b42bfc	add x1,x1,#0x8d0
00b42c00	mov w2,#0xc5
00b42c04	mov x0,x23
00b42c08	str x23,[sp, #0x18]
00b42c0c	bl 0x00c39220
00b42c10	cbz x0,0x00b42cc4
00b42c14	mov x22,x0
00b42c18	add x2,sp,#0x18
00b42c1c	mov w4,#0x1
00b42c20	mov x0,x20
00b42c24	mov x1,x22
00b42c28	mov x3,x23
00b42c2c	bl 0x00b433a4
00b42c30	cbz w0,0x00b42cf0
00b42c34	ldr w8,[x20, #0x1c]
00b42c38	cmp w8,#0x1
00b42c3c	b.ne 0x00b42c68
00b42c40	ldp x6,x1,[x20, #0x30]
00b42c44	ldr x3,[sp, #0x18]
00b42c48	ldr x4,[x20, #0x40]
00b42c4c	ldp x7,x5,[x20, #0x20]
00b42c50	ldr x8,[x20]
00b42c54	mov x0,x21
00b42c58	mov x2,x22
00b42c5c	stp x8,xzr,[sp]
00b42c60	bl 0x00c39f70
00b42c64	cbz w0,0x00b42cf0
00b42c68	ldr x8,[x20, #0x38]
00b42c6c	mov w23,#0x1
00b42c70	str x8,[x19]
00b42c74	b 0x00b42cf4
00b42c78	bl 0x00c342a0
00b42c7c	adrp x0,0x2ce000
00b42c80	adrp x2,0x2c8000
00b42c84	add x0,x0,#0x8d0
00b42c88	add x2,x2,#0x712
00b42c8c	mov w1,#0x98
00b42c90	bl 0x00c342b0
00b42c94	mov w0,#0x39
00b42c98	mov w1,#0x80
00b42c9c	mov x2,xzr
00b42ca0	bl 0x00c342c0
00b42ca4	mov w23,wzr
00b42ca8	mov w0,w23
00b42cac	ldp x29,x30,[sp, #0x40]
00b42cb0	ldp x20,x19,[sp, #0x30]
00b42cb4	ldp x22,x21,[sp, #0x20]
00b42cb8	ldr x23,[sp, #0x10]
00b42cbc	add sp,sp,#0x50
00b42cc0	ret
00b42cc4	bl 0x00c342a0
00b42cc8	adrp x0,0x2ce000
00b42ccc	adrp x2,0x2a1000
00b42cd0	add x0,x0,#0x8d0
00b42cd4	add x2,x2,#0x42
00b42cd8	mov w1,#0xc6
00b42cdc	bl 0x00c342b0
00b42ce0	mov w1,#0x100
00b42ce4	mov w0,#0x39
00b42ce8	movk w1,#0xc, LSL #16
00b42cec	b 0x00b42c9c
00b42cf0	mov w23,wzr
00b42cf4	ldr x1,[sp, #0x18]
00b42cf8	adrp x2,0x2ce000
00b42cfc	add x2,x2,#0x8d0
00b42d00	mov w3,#0xda
00b42d04	mov x0,x22
00b42d08	bl 0x00c38e10
00b42d0c	b 0x00b42ca8
