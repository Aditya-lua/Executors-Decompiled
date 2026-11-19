; FUN_00a55a38 @ 00a55a38
00a55a38	sub sp,sp,#0x70
00a55a3c	stp x28,x27,[sp, #0x10]
00a55a40	stp x26,x25,[sp, #0x20]
00a55a44	stp x24,x23,[sp, #0x30]
00a55a48	stp x22,x21,[sp, #0x40]
00a55a4c	stp x20,x19,[sp, #0x50]
00a55a50	stp x29,x30,[sp, #0x60]
00a55a54	add x29,sp,#0x60
00a55a58	str xzr,[sp, #0x8]
00a55a5c	cbz x0,0x00a55ac8
00a55a60	mov w21,w1
00a55a64	mov x19,x0
00a55a68	str x2,[sp]
00a55a6c	bl 0x00c3bfb0
00a55a70	str w21,[x19]
00a55a74	bl 0x00c35250
00a55a78	ldr x0,[x19, #0x20]
00a55a7c	cbz x0,0x00a55e30
00a55a80	ldr x8,[x19, #0x88]
00a55a84	cbz x8,0x00a55ae4
00a55a88	ldr x8,[x8, #0x60]
00a55a8c	cbz x8,0x00a55b10
00a55a90	cmp x8,x0
00a55a94	b.eq 0x00a55b10
00a55a98	bl 0x00c35ed0
00a55a9c	bl 0x00c342a0
00a55aa0	adrp x0,0x2cb000
00a55aa4	adrp x2,0x2d1000
00a55aa8	add x0,x0,#0x8db
00a55aac	add x2,x2,#0x9d0
00a55ab0	orr w1,wzr,#0x38
00a55ab4	bl 0x00c342b0
00a55ab8	mov w1,#0x103
00a55abc	orr w0,wzr,#0x6
00a55ac0	movk w1,#0xc, LSL #16
00a55ac4	b 0x00a55dcc
00a55ac8	bl 0x00c342a0
00a55acc	adrp x0,0x2cb000
00a55ad0	adrp x2,0x2d1000
00a55ad4	add x0,x0,#0x8db
00a55ad8	add x2,x2,#0x9d0
00a55adc	mov w1,#0x20
00a55ae0	b 0x00a55e8c
00a55ae4	bl 0x00c35ed0
00a55ae8	bl 0x00c342a0
00a55aec	adrp x0,0x2cb000
00a55af0	adrp x2,0x2d1000
00a55af4	add x0,x0,#0x8db
00a55af8	add x2,x2,#0x9d0
00a55afc	mov w1,#0x2e
00a55b00	bl 0x00c342b0
00a55b04	orr w0,wzr,#0x6
00a55b08	mov w1,#0x9a
00a55b0c	b 0x00a55dcc
00a55b10	mov w1,#0xd
00a55b14	bl 0x00c3bf90
00a55b18	cbz x0,0x00a55d18
00a55b1c	mov x23,x0
00a55b20	mov x27,xzr
00a55b24	mov x22,xzr
00a55b28	mov x20,xzr
00a55b2c	mov x24,xzr
00a55b30	mov w28,#0x1
00a55b34	cbz x22,0x00a55b98
00a55b38	add x9,x22,#0x20
00a55b3c	ldxr w8,[x9]
00a55b40	subs w10,w8,#0x1
00a55b44	stxr w11,w10,[x9]
00a55b48	cbnz w11,0x00a55b3c
00a55b4c	b.ne 0x00a55b58
00a55b50	dmb ISHLD
00a55b54	b 0x00a55b60
00a55b58	cmp w8,#0x1
00a55b5c	b.gt 0x00a55b98
00a55b60	ldr x0,[x22, #0x8]
00a55b64	adrp x25,0x2cb000
00a55b68	add x25,x25,#0x8db
00a55b6c	mov w2,#0x1c2
00a55b70	mov x1,x25
00a55b74	bl 0x00c32310
00a55b78	ldr x0,[x22, #0x18]
00a55b7c	bl 0x00c3b690
00a55b80	ldr x0,[x22, #0x28]
00a55b84	bl 0x00c34d40
00a55b88	mov w2,#0x1c5
00a55b8c	mov x0,x20
00a55b90	mov x1,x25
00a55b94	bl 0x00c32310
00a55b98	ldr x0,[sp, #0x8]
00a55b9c	bl 0x00c36350
00a55ba0	and w8,w28,#0x7fffffff
00a55ba4	cmp w8,#0x2
00a55ba8	b.eq 0x00a55bec
00a55bac	cmp w8,#0x1
00a55bb0	b.ne 0x00a55c34
00a55bb4	adrp x5,0xcb5000
00a55bb8	adrp x6,0xcb5000
00a55bbc	ldp x0,x3,[x19, #0x8]
00a55bc0	ldr x5,[x5, #0x608]
00a55bc4	ldr x6,[x6, #0x600]
00a55bc8	adrp x4,0xa56000
00a55bcc	mov w1,#0xd
00a55bd0	mov x2,x23
00a55bd4	add x4,x4,#0x410
00a55bd8	bl 0x00c3bf50
00a55bdc	mov x24,x0
00a55be0	cbz x0,0x00a55c9c
00a55be4	ldr x27,[x24, #0x18]
00a55be8	b 0x00a55c28
00a55bec	ldr x0,[x19, #0x20]
00a55bf0	bl 0x00c36360
00a55bf4	adrp x5,0xcb5000
00a55bf8	adrp x6,0xcb5000
00a55bfc	ldr x3,[x19, #0x10]
00a55c00	ldr x5,[x5, #0x608]
00a55c04	ldr x6,[x6, #0x600]
00a55c08	adrp x4,0xa56000
00a55c0c	mov w1,#0xd
00a55c10	mov x2,x23
00a55c14	add x4,x4,#0x410
00a55c18	mov x27,x0
00a55c1c	bl 0x00c3bf60
00a55c20	cbz x0,0x00a55e30
00a55c24	mov x24,x0
00a55c28	mov x20,x24
00a55c2c	mov x22,x24
00a55c30	b 0x00a55c38
00a55c34	cbz x22,0x00a55cb0
00a55c38	ldr x0,[x19, #0x20]
00a55c3c	bl 0x00c3bf30
00a55c40	ldr x2,[x19, #0x10]
00a55c44	mov x1,x0
00a55c48	mov x0,x27
00a55c4c	bl 0x00c3bf80
00a55c50	mov x26,x0
00a55c54	str x0,[sp, #0x8]
00a55c58	cbz x0,0x00a55c7c
00a55c5c	ldr x0,[x19, #0x88]
00a55c60	ldp x1,x3,[x19, #0x8]
00a55c64	add x2,sp,#0x8
00a55c68	bl 0x00c3bfc0
00a55c6c	ldr x8,[sp, #0x8]
00a55c70	mov x25,x0
00a55c74	cbnz x8,0x00a55c88
00a55c78	b 0x00a55c80
00a55c7c	mov x25,xzr
00a55c80	mov x0,x26
00a55c84	bl 0x00c36350
00a55c88	cbnz x25,0x00a55cc0
00a55c8c	add w28,w28,#0x1
00a55c90	cmp w28,#0x3
00a55c94	b.cc 0x00a55b34
00a55c98	b 0x00a55cc0
00a55c9c	mov x25,xzr
00a55ca0	mov x20,xzr
00a55ca4	mov x22,xzr
00a55ca8	cbz x25,0x00a55c8c
00a55cac	b 0x00a55cc0
00a55cb0	mov x25,xzr
00a55cb4	mov x24,xzr
00a55cb8	mov x20,xzr
00a55cbc	cbz x25,0x00a55c8c
00a55cc0	cbz x25,0x00a55d38
00a55cc4	bl 0x00c35240
00a55cc8	str x24,[x19, #0x28]
00a55ccc	ldr x0,[x22, #0x18]
00a55cd0	ldr x20,[x22, #0x30]
00a55cd4	bl 0x00c3b680
00a55cd8	blr x20
00a55cdc	str x0,[x19, #0x30]
00a55ce0	cbz x0,0x00a55d5c
00a55ce4	cmp w21,#0x400
00a55ce8	b.eq 0x00a55d78
00a55cec	cmp w21,#0x200
00a55cf0	b.ne 0x00a55da8
00a55cf4	ldr x8,[x22, #0x38]
00a55cf8	cbnz x8,0x00a55d80
00a55cfc	bl 0x00c342a0
00a55d00	adrp x0,0x2cb000
00a55d04	adrp x2,0x2d1000
00a55d08	add x0,x0,#0x8db
00a55d0c	add x2,x2,#0x9d0
00a55d10	mov w1,#0x9b
00a55d14	b 0x00a55f34
00a55d18	bl 0x00c35ed0
00a55d1c	bl 0x00c342a0
00a55d20	adrp x0,0x2cb000
00a55d24	adrp x2,0x2d1000
00a55d28	add x0,x0,#0x8db
00a55d2c	add x2,x2,#0x9d0
00a55d30	mov w1,#0x40
00a55d34	b 0x00a55dc0
00a55d38	cbz x22,0x00a55e30
00a55d3c	add x9,x22,#0x20
00a55d40	ldxr w8,[x9]
00a55d44	subs w10,w8,#0x1
00a55d48	stxr w11,w10,[x9]
00a55d4c	cbnz w11,0x00a55d40
00a55d50	b.ne 0x00a55df0
00a55d54	dmb ISHLD
00a55d58	b 0x00a55df8
00a55d5c	bl 0x00c342a0
00a55d60	adrp x0,0x2cb000
00a55d64	adrp x2,0x2d1000
00a55d68	add x0,x0,#0x8db
00a55d6c	add x2,x2,#0x9d0
00a55d70	mov w1,#0x94
00a55d74	b 0x00a55dc0
00a55d78	ldr x8,[x22, #0x48]
00a55d7c	cbz x8,0x00a55f1c
00a55d80	ldr x2,[sp]
00a55d84	mov x1,x25
00a55d88	blr x8
00a55d8c	mov w20,w0
00a55d90	cmp w0,#0x1
00a55d94	b.lt 0x00a55dd8
00a55d98	ldr x0,[sp, #0x8]
00a55d9c	bl 0x00c36350
00a55da0	mov w20,#0x1
00a55da4	b 0x00a55ea4
00a55da8	bl 0x00c342a0
00a55dac	adrp x0,0x2cb000
00a55db0	adrp x2,0x2d1000
00a55db4	add x0,x0,#0x8db
00a55db8	add x2,x2,#0x9d0
00a55dbc	mov w1,#0xaa
00a55dc0	bl 0x00c342b0
00a55dc4	orr w0,wzr,#0x6
00a55dc8	mov w1,#0x86
00a55dcc	mov x2,xzr
00a55dd0	bl 0x00c342c0
00a55dd4	mov w20,wzr
00a55dd8	mov x0,x19
00a55ddc	bl 0x00c3bfb0
00a55de0	str wzr,[x19]
00a55de4	ldr x0,[sp, #0x8]
00a55de8	bl 0x00c36350
00a55dec	b 0x00a55ea4
00a55df0	cmp w8,#0x1
00a55df4	b.gt 0x00a55e30
00a55df8	ldr x0,[x22, #0x8]
00a55dfc	adrp x20,0x2cb000
00a55e00	add x20,x20,#0x8db
00a55e04	mov w2,#0x1c2
00a55e08	mov x1,x20
00a55e0c	bl 0x00c32310
00a55e10	ldr x0,[x22, #0x18]
00a55e14	bl 0x00c3b690
00a55e18	ldr x0,[x22, #0x28]
00a55e1c	bl 0x00c34d40
00a55e20	mov w2,#0x1c5
00a55e24	mov x0,x24
00a55e28	mov x1,x20
00a55e2c	bl 0x00c32310
00a55e30	bl 0x00c35240
00a55e34	ldr x0,[sp, #0x8]
00a55e38	bl 0x00c36350
00a55e3c	str xzr,[sp, #0x8]
00a55e40	ldr x8,[x19, #0x78]
00a55e44	cbz x8,0x00a55e74
00a55e48	ldr x9,[x8, #0x98]
00a55e4c	cbz x9,0x00a55e74
00a55e50	ldr w9,[x19]
00a55e54	cmp w9,#0x400
00a55e58	b.eq 0x00a55ec8
00a55e5c	cmp w9,#0x200
00a55e60	b.ne 0x00a55ee8
00a55e64	ldr x8,[x8, #0x90]
00a55e68	cbnz x8,0x00a55ed0
00a55e6c	mov w20,#0x1
00a55e70	b 0x00a55ea4
00a55e74	bl 0x00c342a0
00a55e78	adrp x0,0x2cb000
00a55e7c	adrp x2,0x2d1000
00a55e80	add x0,x0,#0x8db
00a55e84	add x2,x2,#0x9d0
00a55e88	mov w1,#0xbd
00a55e8c	bl 0x00c342b0
00a55e90	orr w0,wzr,#0x6
00a55e94	mov w1,#0x96
00a55e98	mov x2,xzr
00a55e9c	bl 0x00c342c0
00a55ea0	orr w20,wzr,#0xfffffffe
00a55ea4	mov w0,w20
00a55ea8	ldp x29,x30,[sp, #0x60]
00a55eac	ldp x20,x19,[sp, #0x50]
00a55eb0	ldp x22,x21,[sp, #0x40]
00a55eb4	ldp x24,x23,[sp, #0x30]
00a55eb8	ldp x26,x25,[sp, #0x20]
00a55ebc	ldp x28,x27,[sp, #0x10]
00a55ec0	add sp,sp,#0x70
00a55ec4	ret
00a55ec8	ldr x8,[x8, #0xa0]
00a55ecc	cbz x8,0x00a55e6c
00a55ed0	mov x0,x19
00a55ed4	blr x8
00a55ed8	mov w20,w0
00a55edc	cmp w0,#0x0
00a55ee0	b.gt 0x00a55de4
00a55ee4	b 0x00a55dd8
00a55ee8	bl 0x00c342a0
00a55eec	adrp x0,0x2cb000
00a55ef0	adrp x2,0x2d1000
00a55ef4	add x0,x0,#0x8db
00a55ef8	add x2,x2,#0x9d0
00a55efc	mov w1,#0xcc
00a55f00	bl 0x00c342b0
00a55f04	orr w0,wzr,#0x6
00a55f08	mov w1,#0x86
00a55f0c	mov x2,xzr
00a55f10	bl 0x00c342c0
00a55f14	mov w20,#0xffffffff
00a55f18	b 0x00a55dd8
00a55f1c	bl 0x00c342a0
00a55f20	adrp x0,0x2cb000
00a55f24	adrp x2,0x2d1000
00a55f28	add x0,x0,#0x8db
00a55f2c	add x2,x2,#0x9d0
00a55f30	mov w1,#0xa3
00a55f34	bl 0x00c342b0
00a55f38	orr w0,wzr,#0x6
00a55f3c	mov w1,#0x96
00a55f40	mov x2,xzr
00a55f44	bl 0x00c342c0
00a55f48	orr w20,wzr,#0xfffffffe
00a55f4c	b 0x00a55dd8
