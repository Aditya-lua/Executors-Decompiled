; mbedtls_ecp_self_test @ 00b94b08
00b94b08	str x28,[sp, #-0x60]!
00b94b0c	stp x26,x25,[sp, #0x10]
00b94b10	stp x24,x23,[sp, #0x20]
00b94b14	stp x22,x21,[sp, #0x30]
00b94b18	stp x20,x19,[sp, #0x40]
00b94b1c	stp x29,x30,[sp, #0x50]
00b94b20	add x29,sp,#0x50
00b94b24	sub sp,sp,#0x1a0
00b94b28	mrs x26,tpidr_el0
00b94b2c	adrp x8,0x2ae000
00b94b30	add x8,x8,#0xcdc
00b94b34	ldr x9,[x26, #0x28]
00b94b38	fmov d0,x8
00b94b3c	adrp x8,0x2b3000
00b94b40	add x8,x8,#0x121
00b94b44	mov v0.D[0x1],x8
00b94b48	adrp x8,0x2be000
00b94b4c	add x8,x8,#0xbee
00b94b50	stur x9,[x29, #-0x58]
00b94b54	adrp x9,0x2a4000
00b94b58	add x9,x9,#0xfd6
00b94b5c	stur q0,[x29, #-0x90]
00b94b60	fmov d0,x8
00b94b64	adrp x8,0x2ce000
00b94b68	add x8,x8,#0xa03
00b94b6c	mov v0.D[0x1],x9
00b94b70	adrp x9,0x2d8000
00b94b74	add x9,x9,#0xd29
00b94b78	stur q0,[x29, #-0x80]
00b94b7c	fmov d0,x8
00b94b80	adrp x8,0x2a8000
00b94b84	add x8,x8,#0xf05
00b94b88	mov v0.D[0x1],x9
00b94b8c	adrp x9,0x2b4000
00b94b90	add x9,x9,#0xf89
00b94b94	stur q0,[x29, #-0x70]
00b94b98	fmov d0,x8
00b94b9c	adrp x8,0x2c2000
00b94ba0	add x8,x8,#0xba4
00b94ba4	mov v0.D[0x1],x9
00b94ba8	adrp x9,0x2b3000
00b94bac	add x9,x9,#0x152
00b94bb0	stur q0,[x29, #-0xc0]
00b94bb4	fmov d0,x8
00b94bb8	adrp x8,0x2d8000
00b94bbc	add x8,x8,#0xd5a
00b94bc0	mov v0.D[0x1],x9
00b94bc4	adrp x9,0x2ca000
00b94bc8	add x9,x9,#0x902
00b94bcc	stur q0,[x29, #-0xb0]
00b94bd0	fmov d0,x8
00b94bd4	add x20,sp,#0x70
00b94bd8	mov w19,w0
00b94bdc	mov v0.D[0x1],x9
00b94be0	add x0,x20,#0x8
00b94be4	stur q0,[x29, #-0xa0]
00b94be8	str wzr,[sp, #0x70]
00b94bec	bl 0x00c41c00
00b94bf0	add x0,x20,#0x18
00b94bf4	bl 0x00c41c00
00b94bf8	add x0,x20,#0x28
00b94bfc	bl 0x00c41c00
00b94c00	add x0,x20,#0x38
00b94c04	bl 0x00c41c00
00b94c08	add x0,x20,#0x48
00b94c0c	bl 0x00c41c00
00b94c10	add x0,x20,#0x58
00b94c14	bl 0x00c41c00
00b94c18	add x0,x20,#0x68
00b94c1c	bl 0x00c41c00
00b94c20	add x0,sp,#0x40
00b94c24	stp xzr,xzr,[sp, #0xe8]
00b94c28	str wzr,[sp, #0xf8]
00b94c2c	stp xzr,xzr,[sp, #0x120]
00b94c30	stp xzr,xzr,[sp, #0x110]
00b94c34	stp xzr,xzr,[sp, #0x100]
00b94c38	add x21,sp,#0x40
00b94c3c	bl 0x00c41c00
00b94c40	add x20,x21,#0x10
00b94c44	mov x0,x20
00b94c48	bl 0x00c41c00
00b94c4c	add x21,x21,#0x20
00b94c50	mov x0,x21
00b94c54	bl 0x00c41c00
00b94c58	add x0,sp,#0x10
00b94c5c	add x23,sp,#0x10
00b94c60	bl 0x00c41c00
00b94c64	add x22,x23,#0x10
00b94c68	mov x0,x22
00b94c6c	bl 0x00c41c00
00b94c70	add x23,x23,#0x20
00b94c74	mov x0,x23
00b94c78	bl 0x00c41c00
00b94c7c	mov x0,sp
00b94c80	bl 0x00c41c00
00b94c84	add x0,sp,#0x70
00b94c88	mov w1,#0x1
00b94c8c	bl 0x00c42800
00b94c90	mov w25,w0
00b94c94	cbnz w0,0x00b94da8
00b94c98	cbz w19,0x00b94ca8
00b94c9c	adrp x0,0x2cc000
00b94ca0	add x0,x0,#0x862
00b94ca4	bl 0x00c41af0
00b94ca8	mov x0,sp
00b94cac	mov w1,#0x2
00b94cb0	bl 0x00c41c40
00b94cb4	mov w25,w0
00b94cb8	cbnz w0,0x00b94da8
00b94cbc	add x8,sp,#0x70
00b94cc0	add x24,x8,#0x38
00b94cc4	nop
00b94cc8	adr x4,0xb94e44
00b94ccc	add x0,sp,#0x70
00b94cd0	add x1,sp,#0x10
00b94cd4	mov x2,sp
00b94cd8	mov x3,x24
00b94cdc	mov x5,xzr
00b94ce0	bl 0x00b923c4
00b94ce4	mov w25,w0
00b94ce8	cbnz w0,0x00b94da8
00b94cec	add x1,sp,#0x70
00b94cf0	add x2,sp,#0x40
00b94cf4	mov x3,sp
00b94cf8	sub x5,x29,#0x90
00b94cfc	mov w0,w19
00b94d00	mov x4,x24
00b94d04	bl 0x00b94e7c
00b94d08	mov w25,w0
00b94d0c	cbnz w0,0x00b94da8
00b94d10	cbz w19,0x00b94d20
00b94d14	adrp x0,0x2dd000
00b94d18	add x0,x0,#0xfe
00b94d1c	bl 0x00c41af0
00b94d20	add x1,sp,#0x70
00b94d24	add x2,sp,#0x40
00b94d28	mov x3,sp
00b94d2c	add x4,sp,#0x10
00b94d30	sub x5,x29,#0x90
00b94d34	mov w0,w19
00b94d38	bl 0x00b94e7c
00b94d3c	mov w25,w0
00b94d40	cbnz w0,0x00b94da8
00b94d44	add x0,sp,#0x70
00b94d48	bl 0x00c426b0
00b94d4c	add x0,sp,#0x40
00b94d50	bl 0x00c41bb0
00b94d54	mov x0,x20
00b94d58	bl 0x00c41bb0
00b94d5c	mov x0,x21
00b94d60	bl 0x00c41bb0
00b94d64	cbz w19,0x00b94d74
00b94d68	adrp x0,0x2ce000
00b94d6c	add x0,x0,#0xa34
00b94d70	bl 0x00c41af0
00b94d74	add x0,sp,#0x70
00b94d78	mov w1,#0x9
00b94d7c	bl 0x00c42800
00b94d80	mov w25,w0
00b94d84	cbnz w0,0x00b94da8
00b94d88	add x1,sp,#0x70
00b94d8c	add x2,sp,#0x40
00b94d90	mov x3,sp
00b94d94	sub x5,x29,#0xc0
00b94d98	mov w0,w19
00b94d9c	mov x4,x24
00b94da0	bl 0x00b94e7c
00b94da4	mov w25,w0
00b94da8	cbz w19,0x00b94dc0
00b94dac	tbz w25,#0x1f,0x00b94dc0
00b94db0	adrp x0,0x2bc000
00b94db4	add x0,x0,#0xb0a
00b94db8	mov w1,w25
00b94dbc	bl 0x00c41af0
00b94dc0	add x0,sp,#0x70
00b94dc4	bl 0x00c426b0
00b94dc8	add x0,sp,#0x40
00b94dcc	bl 0x00c41bb0
00b94dd0	mov x0,x20
00b94dd4	bl 0x00c41bb0
00b94dd8	mov x0,x21
00b94ddc	bl 0x00c41bb0
00b94de0	add x0,sp,#0x10
00b94de4	bl 0x00c41bb0
00b94de8	mov x0,x22
00b94dec	bl 0x00c41bb0
00b94df0	mov x0,x23
00b94df4	bl 0x00c41bb0
00b94df8	mov x0,sp
00b94dfc	bl 0x00c41bb0
00b94e00	cbz w19,0x00b94e0c
00b94e04	mov w0,#0xa
00b94e08	bl 0x00c42240
00b94e0c	ldr x8,[x26, #0x28]
00b94e10	ldur x9,[x29, #-0x58]
00b94e14	cmp x8,x9
00b94e18	b.ne 0x00b94e40
00b94e1c	mov w0,w25
00b94e20	add sp,sp,#0x1a0
00b94e24	ldp x29,x30,[sp, #0x50]
00b94e28	ldp x20,x19,[sp, #0x40]
00b94e2c	ldp x22,x21,[sp, #0x30]
00b94e30	ldp x24,x23,[sp, #0x20]
00b94e34	ldp x26,x25,[sp, #0x10]
00b94e38	ldr x28,[sp], #0x60
00b94e3c	ret
00b94e40	bl 0x00c2fec0
