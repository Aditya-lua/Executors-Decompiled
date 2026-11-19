; FUN_00bd8b14 @ 00bd8b14
00bd8b14	paciasp
00bd8b18	stp x29,x30,[sp, #-0x50]!
00bd8b1c	stp x26,x25,[sp, #0x10]
00bd8b20	stp x24,x23,[sp, #0x20]
00bd8b24	stp x22,x21,[sp, #0x30]
00bd8b28	stp x20,x19,[sp, #0x40]
00bd8b2c	mov x29,sp
00bd8b30	adrp x20,0xcb5000
00bd8b34	adrp x19,0xcb4000
00bd8b38	ldr x20,[x20, #0xbb8]
00bd8b3c	ldr x19,[x19, #0xba0]
00bd8b40	mov x0,x20
00bd8b44	mov x1,x19
00bd8b48	bl 0x00bd8de0
00bd8b4c	adrp x21,0xcb5000
00bd8b50	add x1,x19,#0x98
00bd8b54	ldr x21,[x21, #0xbc0]
00bd8b58	add x0,x21,#0xa0
00bd8b5c	add x2,x21,#0x100
00bd8b60	str xzr,[x21, #0x100]
00bd8b64	bl 0x00bd94a8
00bd8b68	adrp x23,0xcb5000
00bd8b6c	mov x0,x21
00bd8b70	ldr x23,[x23, #0xb70]
00bd8b74	str xzr,[x21, #0x38]
00bd8b78	add x24,x23,#0x18
00bd8b7c	add x25,x23,#0x40
00bd8b80	str x24,[x21]
00bd8b84	str x25,[x0, #0x8]!
00bd8b88	add x1,x21,#0xa0
00bd8b8c	bl 0x00c30100
00bd8b90	str xzr,[x21, #0x90]
00bd8b94	adrp x22,0xcb4000
00bd8b98	mov w26,#0xffffffff
00bd8b9c	ldr x22,[x22, #0xd10]
00bd8ba0	add x1,x19,#0x130
00bd8ba4	str w26,[x21, #0x98]
00bd8ba8	add x0,x22,#0xa0
00bd8bac	add x2,x22,#0x100
00bd8bb0	str xzr,[x22, #0x100]
00bd8bb4	bl 0x00bd94a8
00bd8bb8	mov x0,x22
00bd8bbc	str xzr,[x22, #0x38]
00bd8bc0	str x24,[x22]
00bd8bc4	str x25,[x0, #0x8]!
00bd8bc8	add x1,x22,#0xa0
00bd8bcc	bl 0x00c30100
00bd8bd0	str xzr,[x22, #0x90]
00bd8bd4	adrp x25,0xcb5000
00bd8bd8	add x1,x19,#0x130
00bd8bdc	ldr x25,[x25, #0xbc8]
00bd8be0	str w26,[x22, #0x98]
00bd8be4	add x0,x25,#0xa0
00bd8be8	add x2,x25,#0x100
00bd8bec	str xzr,[x25, #0x100]
00bd8bf0	bl 0x00bd94a8
00bd8bf4	add x8,x23,#0x18
00bd8bf8	add x9,x23,#0x40
00bd8bfc	mov x0,x25
00bd8c00	str xzr,[x25, #0x38]
00bd8c04	str x8,[x25]
00bd8c08	str x9,[x0, #0x8]!
00bd8c0c	add x1,x25,#0xa0
00bd8c10	bl 0x00c30100
00bd8c14	mov w24,#0xffffffff
00bd8c18	ldr x8,[x20]
00bd8c1c	str xzr,[x25, #0x90]
00bd8c20	str w24,[x25, #0x98]
00bd8c24	ldr x9,[x22]
00bd8c28	mov x1,x19
00bd8c2c	ldur x8,[x8, #-0x18]
00bd8c30	add x8,x20,x8
00bd8c34	adrp x20,0xcb5000
00bd8c38	str x21,[x8, #0x88]
00bd8c3c	ldur x8,[x9, #-0x18]
00bd8c40	add x8,x22,x8
00bd8c44	ldr w10,[x8, #0x8]
00bd8c48	orr w10,w10,#0x2000
00bd8c4c	str w10,[x8, #0x8]
00bd8c50	ldur x8,[x9, #-0x18]
00bd8c54	add x8,x22,x8
00bd8c58	str x21,[x8, #0x88]
00bd8c5c	ldr x20,[x20, #0xbd0]
00bd8c60	mov x0,x20
00bd8c64	bl 0x00bd8efc
00bd8c68	adrp x21,0xcb5000
00bd8c6c	add x1,x19,#0x98
00bd8c70	ldr x21,[x21, #0xbd8]
00bd8c74	add x0,x21,#0xa0
00bd8c78	add x2,x21,#0x100
00bd8c7c	str xzr,[x21, #0x100]
00bd8c80	bl 0x00bd9c3c
00bd8c84	adrp x23,0xcb5000
00bd8c88	mov x0,x21
00bd8c8c	ldr x23,[x23, #0xba8]
00bd8c90	str xzr,[x21, #0x38]
00bd8c94	add x25,x23,#0x18
00bd8c98	add x26,x23,#0x40
00bd8c9c	str x25,[x21]
00bd8ca0	str x26,[x0, #0x8]!
00bd8ca4	add x1,x21,#0xa0
00bd8ca8	bl 0x00c30100
00bd8cac	str xzr,[x21, #0x90]
00bd8cb0	adrp x22,0xcb5000
00bd8cb4	add x1,x19,#0x130
00bd8cb8	ldr x22,[x22, #0xbe0]
00bd8cbc	str w24,[x21, #0x98]
00bd8cc0	add x0,x22,#0xa0
00bd8cc4	add x2,x22,#0x100
00bd8cc8	str xzr,[x22, #0x100]
00bd8ccc	bl 0x00bd9c3c
00bd8cd0	mov x0,x22
00bd8cd4	str xzr,[x22, #0x38]
00bd8cd8	str x25,[x22]
00bd8cdc	str x26,[x0, #0x8]!
00bd8ce0	add x1,x22,#0xa0
00bd8ce4	bl 0x00c30100
00bd8ce8	str xzr,[x22, #0x90]
00bd8cec	adrp x24,0xcb5000
00bd8cf0	mov w25,#0xffffffff
00bd8cf4	ldr x24,[x24, #0xbe8]
00bd8cf8	add x1,x19,#0x130
00bd8cfc	str w25,[x22, #0x98]
00bd8d00	add x0,x24,#0xa0
00bd8d04	add x2,x24,#0x100
00bd8d08	str xzr,[x24, #0x100]
00bd8d0c	bl 0x00bd9c3c
00bd8d10	add x8,x23,#0x18
00bd8d14	add x9,x23,#0x40
00bd8d18	mov x0,x24
00bd8d1c	str xzr,[x24, #0x38]
00bd8d20	str x8,[x24]
00bd8d24	str x9,[x0, #0x8]!
00bd8d28	add x1,x24,#0xa0
00bd8d2c	bl 0x00c30100
00bd8d30	ldr x8,[x20]
00bd8d34	str w25,[x24, #0x98]
00bd8d38	ldr x9,[x22]
00bd8d3c	str xzr,[x24, #0x90]
00bd8d40	ldur x8,[x8, #-0x18]
00bd8d44	add x8,x20,x8
00bd8d48	str x21,[x8, #0x88]
00bd8d4c	ldur x8,[x9, #-0x18]
00bd8d50	add x8,x22,x8
00bd8d54	ldr w10,[x8, #0x8]
00bd8d58	orr w10,w10,#0x2000
00bd8d5c	str w10,[x8, #0x8]
00bd8d60	ldur x8,[x9, #-0x18]
00bd8d64	add x8,x22,x8
00bd8d68	str x21,[x8, #0x88]
00bd8d6c	ldp x20,x19,[sp, #0x40]
00bd8d70	ldp x22,x21,[sp, #0x30]
00bd8d74	ldp x24,x23,[sp, #0x20]
00bd8d78	ldp x26,x25,[sp, #0x10]
00bd8d7c	ldp x29,x30,[sp], #0x50
00bd8d80	autiasp
00bd8d84	ret
