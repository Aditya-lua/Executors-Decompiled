; FUN_009b8bec @ 009b8bec
009b8bec	stp x28,x27,[sp, #-0x60]!
009b8bf0	stp x26,x25,[sp, #0x10]
009b8bf4	stp x24,x23,[sp, #0x20]
009b8bf8	stp x22,x21,[sp, #0x30]
009b8bfc	stp x20,x19,[sp, #0x40]
009b8c00	stp x29,x30,[sp, #0x50]
009b8c04	ldr x8,[x1, #0x9a8]
009b8c08	add x29,sp,#0x50
009b8c0c	ldr x8,[x8, #0x3d0]
009b8c10	cbz x8,0x009b8d14
009b8c14	mov x21,x5
009b8c18	mov x22,x4
009b8c1c	mov x25,x3
009b8c20	mov x26,x2
009b8c24	mov x19,x1
009b8c28	mov x24,x0
009b8c2c	bl 0x00c2ff50
009b8c30	add x8,x21,x25
009b8c34	add x8,x0,x8, LSL #0x1
009b8c38	add x20,x8,#0x3
009b8c3c	adrp x1,0x2c5000
009b8c40	mov x27,x0
009b8c44	add x1,x1,#0x652
009b8c48	mov w2,#0x15a7
009b8c4c	mov x0,x20
009b8c50	bl 0x00c32320
009b8c54	cbz x0,0x009b8d1c
009b8c58	mov x1,x24
009b8c5c	mov x23,x0
009b8c60	bl 0x00c31b90
009b8c64	add x24,x23,x27
009b8c68	mov w8,#0x20
009b8c6c	strb w8,[x24], #0x1
009b8c70	cbz x25,0x009b8ca8
009b8c74	add x8,x27,x25, LSL #0x1
009b8c78	adrp x27,0x2d7000
009b8c7c	add x28,x8,#0x1
009b8c80	add x27,x27,#0x4c4
009b8c84	ldrb w2,[x26], #0x1
009b8c88	mov x0,x24
009b8c8c	mov x1,x27
009b8c90	bl 0x00c35d10
009b8c94	subs x25,x25,#0x1
009b8c98	add x24,x24,#0x2
009b8c9c	b.ne 0x009b8c84
009b8ca0	add x24,x23,x28
009b8ca4	mov w8,#0x20
009b8ca8	mov x25,x24
009b8cac	strb w8,[x25], #0x1
009b8cb0	cbz x21,0x009b8ce4
009b8cb4	mov w27,#0x1
009b8cb8	adrp x26,0x2d7000
009b8cbc	bfm x27,x21,#0x3f,#0x3e
009b8cc0	add x26,x26,#0x4c4
009b8cc4	ldrb w2,[x22], #0x1
009b8cc8	mov x0,x25
009b8ccc	mov x1,x26
009b8cd0	bl 0x00c35d10
009b8cd4	subs x21,x21,#0x1
009b8cd8	add x25,x25,#0x2
009b8cdc	b.ne 0x009b8cc4
009b8ce0	add x25,x24,x27
009b8ce4	strb wzr,[x25]
009b8ce8	ldr x8,[x19, #0x9a8]
009b8cec	mov x0,x19
009b8cf0	mov x1,x23
009b8cf4	ldr x8,[x8, #0x3d0]
009b8cf8	blr x8
009b8cfc	adrp x2,0x2c5000
009b8d00	add x2,x2,#0x652
009b8d04	mov w3,#0x15bd
009b8d08	mov x0,x23
009b8d0c	mov x1,x20
009b8d10	bl 0x00c345e0
009b8d14	mov w0,#0x1
009b8d18	b 0x009b8d54
009b8d1c	bl 0x00c342a0
009b8d20	adrp x0,0x2c5000
009b8d24	adrp x2,0x2d5000
009b8d28	add x0,x0,#0x652
009b8d2c	add x2,x2,#0x871
009b8d30	mov w1,#0x15a8
009b8d34	bl 0x00c342b0
009b8d38	mov w2,#0x100
009b8d3c	mov w1,#0x50
009b8d40	movk w2,#0xc, LSL #16
009b8d44	mov x0,x19
009b8d48	mov x3,xzr
009b8d4c	bl 0x00c34410
009b8d50	mov w0,wzr
009b8d54	ldp x29,x30,[sp, #0x50]
009b8d58	ldp x20,x19,[sp, #0x40]
009b8d5c	ldp x22,x21,[sp, #0x30]
009b8d60	ldp x24,x23,[sp, #0x20]
009b8d64	ldp x26,x25,[sp, #0x10]
009b8d68	ldp x28,x27,[sp], #0x60
009b8d6c	ret
