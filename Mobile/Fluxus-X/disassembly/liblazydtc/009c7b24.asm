; tls13_export_keying_material @ 009c7b24
009c7b24	sub sp,sp,#0x150
009c7b28	stp x28,x27,[sp, #0xf0]
009c7b2c	stp x26,x25,[sp, #0x100]
009c7b30	stp x24,x23,[sp, #0x110]
009c7b34	stp x22,x21,[sp, #0x120]
009c7b38	stp x20,x19,[sp, #0x130]
009c7b3c	stp x29,x30,[sp, #0x140]
009c7b40	add x29,sp,#0x140
009c7b44	mov w28,w7
009c7b48	mov x27,x6
009c7b4c	mov x26,x5
009c7b50	mov x24,x4
009c7b54	mov x25,x3
009c7b58	mov x21,x2
009c7b5c	str x1,[sp, #0x18]
009c7b60	mov x22,x0
009c7b64	bl 0x00c34a10
009c7b68	mov x23,x0
009c7b6c	bl 0x00c31fa0
009c7b70	mov x19,x0
009c7b74	mov w20,wzr
009c7b78	cbz x23,0x009c7c78
009c7b7c	cbz x19,0x009c7c78
009c7b80	mov x0,x22
009c7b84	bl 0x00c36820
009c7b88	cbz w0,0x009c7c74
009c7b8c	mov x0,x19
009c7b90	mov x1,x23
009c7b94	mov x2,xzr
009c7b98	bl 0x00c31f70
009c7b9c	cmp w0,#0x1
009c7ba0	b.lt 0x009c7c74
009c7ba4	cmp w28,#0x0
009c7ba8	csel x2,xzr,x27,eq
009c7bac	mov x0,x19
009c7bb0	mov x1,x26
009c7bb4	bl 0x00c31f80
009c7bb8	cmp w0,#0x1
009c7bbc	b.lt 0x009c7c74
009c7bc0	add x1,sp,#0x68
009c7bc4	add x2,sp,#0x24
009c7bc8	mov x0,x19
009c7bcc	bl 0x00c31f60
009c7bd0	cmp w0,#0x1
009c7bd4	b.lt 0x009c7c74
009c7bd8	mov x0,x19
009c7bdc	mov x1,x23
009c7be0	mov x2,xzr
009c7be4	bl 0x00c31f70
009c7be8	cmp w0,#0x1
009c7bec	b.lt 0x009c7c74
009c7bf0	add x1,sp,#0x28
009c7bf4	add x2,sp,#0x20
009c7bf8	mov x0,x19
009c7bfc	bl 0x00c31f60
009c7c00	cmp w0,#0x1
009c7c04	b.lt 0x009c7c74
009c7c08	ldp w6,w8,[sp, #0x20]
009c7c0c	add x2,x22,#0x7c4
009c7c10	add x5,sp,#0x28
009c7c14	sub x7,x29,#0x98
009c7c18	mov x0,x22
009c7c1c	mov x1,x23
009c7c20	mov x3,x25
009c7c24	mov x4,x24
009c7c28	str wzr,[sp, #0x8]
009c7c2c	str x8,[sp]
009c7c30	bl 0x009c6600
009c7c34	cbz w0,0x009c7c74
009c7c38	ldr w6,[sp, #0x24]
009c7c3c	ldr x7,[sp, #0x18]
009c7c40	adrp x3,0x74c000
009c7c44	add x3,x3,#0xeaa
009c7c48	sub x2,x29,#0x98
009c7c4c	mov w4,#0x8
009c7c50	add x5,sp,#0x68
009c7c54	mov x0,x22
009c7c58	mov x1,x23
009c7c5c	str wzr,[sp, #0x8]
009c7c60	str x21,[sp]
009c7c64	bl 0x009c6600
009c7c68	cmp w0,#0x0
009c7c6c	cset w20,ne
009c7c70	b 0x009c7c78
009c7c74	mov w20,wzr
009c7c78	mov x0,x19
009c7c7c	bl 0x00c31f90
009c7c80	mov w0,w20
009c7c84	ldp x29,x30,[sp, #0x140]
009c7c88	ldp x20,x19,[sp, #0x130]
009c7c8c	ldp x22,x21,[sp, #0x120]
009c7c90	ldp x24,x23,[sp, #0x110]
009c7c94	ldp x26,x25,[sp, #0x100]
009c7c98	ldp x28,x27,[sp, #0xf0]
009c7c9c	add sp,sp,#0x150
009c7ca0	ret
