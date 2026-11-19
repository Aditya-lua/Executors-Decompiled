; FUN_00ad6ba0 @ 00ad6ba0
00ad6ba0	str x25,[sp, #-0x50]!
00ad6ba4	stp x24,x23,[sp, #0x10]
00ad6ba8	stp x22,x21,[sp, #0x20]
00ad6bac	stp x20,x19,[sp, #0x30]
00ad6bb0	stp x29,x30,[sp, #0x40]
00ad6bb4	mov x25,x0
00ad6bb8	ldr x21,[x0, #0x98]
00ad6bbc	ldr x0,[x0, #0x88]
00ad6bc0	add x29,sp,#0x40
00ad6bc4	mov x22,x4
00ad6bc8	mov x23,x3
00ad6bcc	mov x19,x2
00ad6bd0	mov x20,x1
00ad6bd4	bl 0x00c3d8d0
00ad6bd8	ldr x8,[x21, #0x20]
00ad6bdc	mov x24,x0
00ad6be0	cbz x8,0x00ad6c74
00ad6be4	ldr w9,[x21, #0x1c]
00ad6be8	cmp w9,#0x1
00ad6bec	b.eq 0x00ad6c9c
00ad6bf0	cmp w9,#0x5
00ad6bf4	b.ne 0x00ad6c94
00ad6bf8	mov x0,x21
00ad6bfc	mov x1,x25
00ad6c00	bl 0x00ad789c
00ad6c04	cbz w0,0x00ad6c94
00ad6c08	ldr x2,[x21, #0x38]
00ad6c0c	mov w4,#0x5
00ad6c10	mov w0,w22
00ad6c14	mov x1,x23
00ad6c18	mov x3,x24
00ad6c1c	bl 0x00c3fdf0
00ad6c20	cmp w0,#0x1
00ad6c24	b.lt 0x00ad6d38
00ad6c28	ldr x8,[x21, #0x38]
00ad6c2c	sxtw x9,w0
00ad6c30	sub x22,x9,#0x1
00ad6c34	ldr x0,[x21, #0x20]
00ad6c38	ldrb w23,[x8, x22]
00ad6c3c	bl 0x00c34c30
00ad6c40	bl 0x00c3ffd0
00ad6c44	cmp w0,w23
00ad6c48	b.ne 0x00ad6ce4
00ad6c4c	ldr x0,[x21, #0x20]
00ad6c50	bl 0x00c34c20
00ad6c54	cmp w22,w0
00ad6c58	b.ne 0x00ad6d0c
00ad6c5c	cbz x20,0x00ad6cd8
00ad6c60	ldr x1,[x21, #0x38]
00ad6c64	mov x0,x20
00ad6c68	mov x2,x22
00ad6c6c	bl 0x00c2ffd0
00ad6c70	b 0x00ad6cd8
00ad6c74	ldr w4,[x21, #0x1c]
00ad6c78	mov w0,w22
00ad6c7c	mov x1,x23
00ad6c80	mov x2,x20
00ad6c84	mov x3,x24
00ad6c88	bl 0x00c3fdf0
00ad6c8c	tbz w0,#0x1f,0x00ad6cd4
00ad6c90	b 0x00ad6d3c
00ad6c94	mov w0,#0xffffffff
00ad6c98	b 0x00ad6d3c
00ad6c9c	mov x0,x8
00ad6ca0	bl 0x00c34c30
00ad6ca4	add x4,sp,#0x8
00ad6ca8	mov x1,xzr
00ad6cac	mov w2,wzr
00ad6cb0	mov x3,x20
00ad6cb4	mov x5,x23
00ad6cb8	mov x6,x22
00ad6cbc	mov x7,x24
00ad6cc0	bl 0x00c40030
00ad6cc4	cmp w0,#0x1
00ad6cc8	b.lt 0x00ad6d38
00ad6ccc	ldr w0,[sp, #0x8]
00ad6cd0	tbnz w0,#0x1f,0x00ad6d3c
00ad6cd4	sxtw x22,w0
00ad6cd8	mov w0,#0x1
00ad6cdc	str x22,[x19]
00ad6ce0	b 0x00ad6d3c
00ad6ce4	bl 0x00c342a0
00ad6ce8	adrp x0,0x2ae000
00ad6cec	adrp x2,0x2cc000
00ad6cf0	add x0,x0,#0x623
00ad6cf4	add x2,x2,#0x77
00ad6cf8	mov w1,#0xe2
00ad6cfc	bl 0x00c342b0
00ad6d00	mov w0,#0x4
00ad6d04	mov w1,#0x64
00ad6d08	b 0x00ad6d30
00ad6d0c	bl 0x00c342a0
00ad6d10	adrp x0,0x2ae000
00ad6d14	adrp x2,0x2cc000
00ad6d18	add x0,x0,#0x623
00ad6d1c	add x2,x2,#0x77
00ad6d20	mov w1,#0xe6
00ad6d24	bl 0x00c342b0
00ad6d28	mov w0,#0x4
00ad6d2c	mov w1,#0x8f
00ad6d30	mov x2,xzr
00ad6d34	bl 0x00c342c0
00ad6d38	mov w0,wzr
00ad6d3c	ldp x29,x30,[sp, #0x40]
00ad6d40	ldp x20,x19,[sp, #0x30]
00ad6d44	ldp x22,x21,[sp, #0x20]
00ad6d48	ldp x24,x23,[sp, #0x10]
00ad6d4c	ldr x25,[sp], #0x50
00ad6d50	ret
