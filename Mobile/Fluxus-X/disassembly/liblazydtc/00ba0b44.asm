; FUN_00ba0b44 @ 00ba0b44
00ba0b44	sub sp,sp,#0xf0
00ba0b48	stp x28,x27,[sp, #0x90]
00ba0b4c	stp x26,x25,[sp, #0xa0]
00ba0b50	stp x24,x23,[sp, #0xb0]
00ba0b54	stp x22,x21,[sp, #0xc0]
00ba0b58	stp x20,x19,[sp, #0xd0]
00ba0b5c	stp x29,x30,[sp, #0xe0]
00ba0b60	add x29,sp,#0xe0
00ba0b64	mrs x28,tpidr_el0
00ba0b68	ldr x8,[x28, #0x28]
00ba0b6c	mov x26,x7
00ba0b70	mov x24,x6
00ba0b74	mov x22,x5
00ba0b78	stur x8,[x29, #-0x58]
00ba0b7c	ldr x8,[x6]
00ba0b80	mov x19,x4
00ba0b84	mov x20,x3
00ba0b88	mov w23,w2
00ba0b8c	mov x21,x1
00ba0b90	cmp x8,x7
00ba0b94	mov w25,w0
00ba0b98	b.ls 0x00ba0ba4
00ba0b9c	mov w27,#0xffffb080
00ba0ba0	b 0x00ba0c5c
00ba0ba4	sub x3,x26,x8
00ba0ba8	mov x0,x21
00ba0bac	mov x1,x19
00ba0bb0	mov x2,x24
00ba0bb4	bl 0x00c427c0
00ba0bb8	mov w27,w0
00ba0bbc	cbnz w0,0x00ba0c5c
00ba0bc0	mov x0,x19
00ba0bc4	bl 0x00c426d0
00ba0bc8	cbz w0,0x00ba0bd4
00ba0bcc	mov w27,#0xffffb380
00ba0bd0	b 0x00ba0c5c
00ba0bd4	add x0,sp,#0x58
00ba0bd8	bl 0x00c42760
00ba0bdc	add x0,sp,#0x28
00ba0be0	bl 0x00c42760
00ba0be4	add x0,sp,#0x18
00ba0be8	bl 0x00c41c00
00ba0bec	add x0,sp,#0x8
00ba0bf0	bl 0x00c41c00
00ba0bf4	ldr x8,[x24]
00ba0bf8	cmp x8,x26
00ba0bfc	b.hi 0x00ba0b9c
00ba0c00	sub x3,x26,x8
00ba0c04	add x1,sp,#0x58
00ba0c08	mov x0,x21
00ba0c0c	mov x2,x24
00ba0c10	bl 0x00c427c0
00ba0c14	mov w27,w0
00ba0c18	cbnz w0,0x00ba0c3c
00ba0c1c	ldr x8,[x24]
00ba0c20	cmp x8,x26
00ba0c24	b.cs 0x00ba0c38
00ba0c28	add x1,x8,#0x1
00ba0c2c	cmp x1,x26
00ba0c30	str x1,[x24]
00ba0c34	b.ls 0x00ba0c90
00ba0c38	mov w27,#0xffffb080
00ba0c3c	add x0,sp,#0x58
00ba0c40	bl 0x00c42750
00ba0c44	add x0,sp,#0x28
00ba0c48	bl 0x00c42750
00ba0c4c	add x0,sp,#0x18
00ba0c50	bl 0x00c41bb0
00ba0c54	add x0,sp,#0x8
00ba0c58	bl 0x00c41bb0
00ba0c5c	ldr x8,[x28, #0x28]
00ba0c60	ldur x9,[x29, #-0x58]
00ba0c64	cmp x8,x9
00ba0c68	b.ne 0x00ba0d38
00ba0c6c	mov w0,w27
00ba0c70	ldp x29,x30,[sp, #0xe0]
00ba0c74	ldp x20,x19,[sp, #0xd0]
00ba0c78	ldp x22,x21,[sp, #0xc0]
00ba0c7c	ldp x24,x23,[sp, #0xb0]
00ba0c80	ldp x26,x25,[sp, #0xa0]
00ba0c84	ldp x28,x27,[sp, #0x90]
00ba0c88	add sp,sp,#0xf0
00ba0c8c	ret
00ba0c90	ldrb w9,[x8]
00ba0c94	mov w27,#0xffffb080
00ba0c98	cbz w9,0x00ba0c3c
00ba0c9c	sub x8,x26,x1
00ba0ca0	cmp x8,x9
00ba0ca4	b.cc 0x00ba0c3c
00ba0ca8	add x0,sp,#0x18
00ba0cac	mov x2,x9
00ba0cb0	mov x26,x9
00ba0cb4	bl 0x00c41ca0
00ba0cb8	mov w27,w0
00ba0cbc	cbnz w0,0x00ba0c3c
00ba0cc0	ldr x8,[x24]
00ba0cc4	add x4,sp,#0x58
00ba0cc8	add x7,sp,#0x8
00ba0ccc	mov w0,w25
00ba0cd0	add x8,x8,x26
00ba0cd4	mov x1,x21
00ba0cd8	mov w2,w23
00ba0cdc	mov x3,x20
00ba0ce0	mov x5,x19
00ba0ce4	mov x6,x22
00ba0ce8	str x8,[x24]
00ba0cec	bl 0x00ba2054
00ba0cf0	mov w27,w0
00ba0cf4	cbnz w0,0x00ba0c3c
00ba0cf8	add x1,sp,#0x28
00ba0cfc	add x2,sp,#0x8
00ba0d00	add x4,sp,#0x18
00ba0d04	mov x0,x21
00ba0d08	mov x3,x19
00ba0d0c	mov x5,x20
00ba0d10	bl 0x00c42720
00ba0d14	mov w27,w0
00ba0d18	cbnz w0,0x00ba0c3c
00ba0d1c	add x0,sp,#0x28
00ba0d20	add x1,sp,#0x58
00ba0d24	bl 0x00c42740
00ba0d28	cmp w0,#0x0
00ba0d2c	mov w8,#0xffffb200
00ba0d30	csel w27,wzr,w8,eq
00ba0d34	b 0x00ba0c3c
00ba0d38	bl 0x00c2fec0
