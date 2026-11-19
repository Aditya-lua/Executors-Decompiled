; dtls1_handle_timeout @ 009a6be0
009a6be0	sub sp,sp,#0x30
009a6be4	stp x29,x30,[sp, #0x20]
009a6be8	ldr x8,[x0, #0x4b8]
009a6bec	str x19,[sp, #0x10]
009a6bf0	mov x19,x0
009a6bf4	add x29,sp,#0x20
009a6bf8	ldr x9,[x8, #0x1f0]
009a6bfc	cbnz x9,0x009a6c08
009a6c00	ldr x8,[x8, #0x1f8]
009a6c04	cbz x8,0x009a6cf0
009a6c08	mov x0,sp
009a6c0c	mov x1,xzr
009a6c10	bl 0x00c31ff0
009a6c14	ldr x8,[x19, #0x4b8]
009a6c18	ldr x10,[sp]
009a6c1c	ldr x9,[x8, #0x1f0]
009a6c20	subs x9,x9,x10
009a6c24	b.lt 0x009a6c88
009a6c28	b.ne 0x009a6c40
009a6c2c	ldr x11,[x8, #0x1f8]
009a6c30	ldr x10,[sp, #0x8]
009a6c34	cmp x11,x10
009a6c38	b.gt 0x009a6c48
009a6c3c	b 0x009a6c88
009a6c40	ldr x10,[sp, #0x8]
009a6c44	ldr x11,[x8, #0x1f8]
009a6c48	sub x11,x11,x10
009a6c4c	mov w10,#0x4240
009a6c50	movk w10,#0xf, LSL #16
009a6c54	add x10,x11,x10
009a6c58	cmp x11,#0x0
009a6c5c	csel x10,x10,x11,lt
009a6c60	mov w12,#0x3a97
009a6c64	cmp x10,x12
009a6c68	add x9,x9,x11, ASR #0x3f
009a6c6c	b.gt 0x009a6c74
009a6c70	cbz x9,0x009a6c88
009a6c74	cmp x9,#0x0
009a6c78	b.gt 0x009a6cf0
009a6c7c	cmp x10,#0x0
009a6c80	mov w0,wzr
009a6c84	b.gt 0x009a6cf4
009a6c88	ldr x9,[x8, #0x208]
009a6c8c	ldr w1,[x8, #0x200]
009a6c90	cbz x9,0x009a6ca8
009a6c94	mov x0,x19
009a6c98	blr x9
009a6c9c	ldr x8,[x19, #0x4b8]
009a6ca0	str w0,[x8, #0x200]
009a6ca4	b 0x009a6cc0
009a6ca8	mov w10,#0x8700
009a6cac	lsl w9,w1,#0x1
009a6cb0	movk w10,#0x393, LSL #16
009a6cb4	cmp w9,w10
009a6cb8	csel w9,w9,w10,cc
009a6cbc	str w9,[x8, #0x200]
009a6cc0	mov x0,x19
009a6cc4	bl 0x009a6f04
009a6cc8	tbnz w0,#0x1f,0x009a6ce8
009a6ccc	mov x0,x19
009a6cd0	bl 0x009a6d04
009a6cd4	mov x0,x19
009a6cd8	ldp x29,x30,[sp, #0x20]
009a6cdc	ldr x19,[sp, #0x10]
009a6ce0	add sp,sp,#0x30
009a6ce4	b 0x00c343e0
009a6ce8	mov w0,#0xffffffff
009a6cec	b 0x009a6cf4
009a6cf0	mov w0,wzr
009a6cf4	ldp x29,x30,[sp, #0x20]
009a6cf8	ldr x19,[sp, #0x10]
009a6cfc	add sp,sp,#0x30
009a6d00	ret
