; psa_mac_verify @ 00b88bd0
00b88bd0	sub sp,sp,#0xa0
00b88bd4	stp x26,x25,[sp, #0x50]
00b88bd8	stp x24,x23,[sp, #0x60]
00b88bdc	stp x22,x21,[sp, #0x70]
00b88be0	stp x20,x19,[sp, #0x80]
00b88be4	stp x29,x30,[sp, #0x90]
00b88be8	add x29,sp,#0x90
00b88bec	mrs x26,tpidr_el0
00b88bf0	ldr x8,[x26, #0x28]
00b88bf4	mov x20,x5
00b88bf8	mov x22,x4
00b88bfc	mov x21,x3
00b88c00	mov x25,x2
00b88c04	mov w23,w1
00b88c08	mov w24,w0
00b88c0c	str x8,[sp, #0x48]
00b88c10	cbz x3,0x00b88c3c
00b88c14	mov w1,#0x1
00b88c18	mov x0,x21
00b88c1c	bl 0x00c30a30
00b88c20	mov x19,x0
00b88c24	cbz x0,0x00b88cac
00b88c28	mov x0,x19
00b88c2c	mov x1,x25
00b88c30	mov x2,x21
00b88c34	bl 0x00c2ffd0
00b88c38	b 0x00b88c40
00b88c3c	mov x19,xzr
00b88c40	add x4,sp,#0x8
00b88c44	mov w5,#0x40
00b88c48	mov x6,sp
00b88c4c	mov w0,w24
00b88c50	mov w1,w23
00b88c54	mov x2,x19
00b88c58	mov x3,x21
00b88c5c	mov w7,wzr
00b88c60	bl 0x00b88a80
00b88c64	mov w23,w0
00b88c68	cbz w0,0x00b88c74
00b88c6c	mov x21,xzr
00b88c70	b 0x00b88ce4
00b88c74	ldr x8,[sp]
00b88c78	cmp x8,x20
00b88c7c	b.ne 0x00b88cb8
00b88c80	cbz x20,0x00b88cc4
00b88c84	mov w1,#0x1
00b88c88	mov x0,x20
00b88c8c	bl 0x00c30a30
00b88c90	mov x21,x0
00b88c94	cbz x0,0x00b88cb0
00b88c98	mov x0,x21
00b88c9c	mov x1,x22
00b88ca0	mov x2,x20
00b88ca4	bl 0x00c2ffd0
00b88ca8	b 0x00b88cc8
00b88cac	mov x21,xzr
00b88cb0	mov w23,#0xffffff73
00b88cb4	b 0x00b88ce4
00b88cb8	mov x21,xzr
00b88cbc	mov w23,#0xffffff6b
00b88cc0	b 0x00b88ce4
00b88cc4	mov x21,xzr
00b88cc8	add x1,sp,#0x8
00b88ccc	mov x0,x21
00b88cd0	mov x2,x20
00b88cd4	bl 0x00c42190
00b88cd8	cmp w0,#0x0
00b88cdc	mov w8,#0xffffff6b
00b88ce0	csel w23,wzr,w8,eq
00b88ce4	add x0,sp,#0x8
00b88ce8	mov w1,#0x40
00b88cec	bl 0x00c42220
00b88cf0	mov x0,x19
00b88cf4	bl 0x00c30960
00b88cf8	mov x0,x21
00b88cfc	bl 0x00c30960
00b88d00	ldr x8,[x26, #0x28]
00b88d04	ldr x9,[sp, #0x48]
00b88d08	cmp x8,x9
00b88d0c	b.ne 0x00b88d30
00b88d10	mov w0,w23
00b88d14	ldp x29,x30,[sp, #0x90]
00b88d18	ldp x20,x19,[sp, #0x80]
00b88d1c	ldp x22,x21,[sp, #0x70]
00b88d20	ldp x24,x23,[sp, #0x60]
00b88d24	ldp x26,x25,[sp, #0x50]
00b88d28	add sp,sp,#0xa0
00b88d2c	ret
00b88d30	bl 0x00c2fec0
