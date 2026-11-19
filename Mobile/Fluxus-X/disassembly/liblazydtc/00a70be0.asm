; FUN_00a70be0 @ 00a70be0
00a70be0	stp x24,x23,[sp, #-0x40]!
00a70be4	stp x22,x21,[sp, #0x10]
00a70be8	stp x20,x19,[sp, #0x20]
00a70bec	stp x29,x30,[sp, #0x30]
00a70bf0	add x29,sp,#0x30
00a70bf4	cbz x2,0x00a70cfc
00a70bf8	mov x20,x2
00a70bfc	mov x21,x1
00a70c00	mov x19,x0
00a70c04	mov x24,xzr
00a70c08	mov x23,x1
00a70c0c	ldp w9,w8,[x23, #0x4]
00a70c10	cmn w9,#0x1
00a70c14	cset w10,eq
00a70c18	cmn w8,#0x1
00a70c1c	cset w11,eq
00a70c20	eor w10,w10,w11
00a70c24	tbnz w10,#0x0,0x00a70c78
00a70c28	ldr w10,[x23, #0xc]
00a70c2c	cmn w10,#0x1
00a70c30	b.eq 0x00a70c40
00a70c34	ldr w11,[x19, #0xc]
00a70c38	tst w11,w10
00a70c3c	b.eq 0x00a70c78
00a70c40	cmn w9,#0x1
00a70c44	b.eq 0x00a70c60
00a70c48	ldr w10,[x19, #0x4]
00a70c4c	cmp w10,w9
00a70c50	b.eq 0x00a70c60
00a70c54	ldr w9,[x19, #0x8]
00a70c58	cmp w9,w8
00a70c5c	b.ne 0x00a70c78
00a70c60	ldr w8,[x19, #0x10]
00a70c64	add x22,x21,x24, LSL #0x6
00a70c68	cbz w8,0x00a70c8c
00a70c6c	ldr w9,[x23, #0x10]
00a70c70	cmp w8,w9
00a70c74	b.eq 0x00a70d00
00a70c78	add x24,x24,#0x1
00a70c7c	cmp x24,x20
00a70c80	add x23,x23,#0x40
00a70c84	b.cc 0x00a70c0c
00a70c88	b 0x00a70cfc
00a70c8c	ldr x0,[x19, #0x18]
00a70c90	cbz x0,0x00a70ccc
00a70c94	ldr w8,[x23]
00a70c98	orr w8,w8,#0x2
00a70c9c	cmp w8,#0x2
00a70ca0	b.ne 0x00a70c78
00a70ca4	ldr x1,[x23, #0x18]
00a70ca8	cbz x1,0x00a70cb4
00a70cac	bl 0x00c35ee0
00a70cb0	cbz w0,0x00a70d18
00a70cb4	ldr x1,[x23, #0x20]
00a70cb8	cbz x1,0x00a70c78
00a70cbc	ldr x0,[x19, #0x20]
00a70cc0	bl 0x00c35ee0
00a70cc4	cbnz w0,0x00a70c78
00a70cc8	b 0x00a70d24
00a70ccc	ldr x0,[x19, #0x28]
00a70cd0	cbz x0,0x00a70cfc
00a70cd4	ldr w8,[x23]
00a70cd8	cbz w8,0x00a70ce8
00a70cdc	ldr w9,[x19]
00a70ce0	cmp w9,w8
00a70ce4	b.ne 0x00a70c78
00a70ce8	ldr x1,[x23, #0x28]
00a70cec	cbz x1,0x00a70d30
00a70cf0	bl 0x00c35ee0
00a70cf4	cbnz w0,0x00a70c78
00a70cf8	b 0x00a70d00
00a70cfc	mov x22,xzr
00a70d00	mov x0,x22
00a70d04	ldp x29,x30,[sp, #0x30]
00a70d08	ldp x20,x19,[sp, #0x20]
00a70d0c	ldp x22,x21,[sp, #0x10]
00a70d10	ldp x24,x23,[sp], #0x40
00a70d14	ret
00a70d18	ldr x8,[x19, #0x18]
00a70d1c	mov x9,xzr
00a70d20	b 0x00a70d2c
00a70d24	ldr x9,[x19, #0x20]
00a70d28	mov x8,xzr
00a70d2c	stp x8,x9,[x19, #0x18]
00a70d30	mov x22,x23
00a70d34	b 0x00a70d00
