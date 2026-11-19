; FUN_00894bcc @ 00894bcc
00894bcc	sub sp,sp,#0xd0
00894bd0	stp x29,x30,[sp, #0x70]
00894bd4	stp x28,x27,[sp, #0x80]
00894bd8	stp x26,x25,[sp, #0x90]
00894bdc	stp x24,x23,[sp, #0xa0]
00894be0	stp x22,x21,[sp, #0xb0]
00894be4	stp x20,x19,[sp, #0xc0]
00894be8	add x29,sp,#0x70
00894bec	str x1,[sp, #0x8]
00894bf0	mrs x23,tpidr_el0
00894bf4	movi v0.2D,#0x0
00894bf8	ldr x8,[x23, #0x28]
00894bfc	mov x19,x2
00894c00	stur x8,[x29, #-0x8]
00894c04	adrp x8,0xc4b000
00894c08	add x8,x8,#0xb0
00894c0c	stp x8,x0,[sp, #0x18]
00894c10	ldr x8,[x3, #0x28]
00894c14	stur q0,[sp, #0x28]
00894c18	cmp x4,x8
00894c1c	mov w8,#0x40
00894c20	stur q0,[sp, #0x38]
00894c24	stur q0,[sp, #0x48]
00894c28	str xzr,[sp, #0x58]
00894c2c	strb w8,[sp, #0x60]
00894c30	b.cs 0x00894cf4
00894c34	mov x21,x4
00894c38	mov x22,x3
00894c3c	add x25,sp,#0x18
00894c40	adrp x26,0xd1b000
00894c44	adrp x27,0xd1b000
00894c48	adrp x28,0xd1b000
00894c4c	b 0x00894c6c
00894c50	add x0,x25,#0x18
00894c54	add x1,x8,#0x20
00894c58	bl 0x00894dec
00894c5c	ldr x8,[x22, #0x28]
00894c60	add x21,x21,#0x1
00894c64	cmp x21,x8
00894c68	b.cs 0x00894cf4
00894c6c	ldr x8,[x22, #0x20]
00894c70	ldr w10,[x26, #0x170]
00894c74	ldr x8,[x8, x21, LSL #0x3]
00894c78	ldr w9,[x8, #0x8]
00894c7c	cmp x8,#0x0
00894c80	ccmp w9,w10,#0x0,ne
00894c84	b.eq 0x00894cc0
00894c88	cbz x8,0x00894c98
00894c8c	ldr w10,[x27, #0x1d0]
00894c90	cmp w9,w10
00894c94	b.eq 0x00894c50
00894c98	cbz x8,0x00894c5c
00894c9c	ldr w10,[x28, #0x220]
00894ca0	cmp w9,w10
00894ca4	b.ne 0x00894c5c
00894ca8	ldr w9,[x8, #0x40]
00894cac	cbz w9,0x00894c5c
00894cb0	add x0,x25,#0x18
00894cb4	add x1,x8,#0x20
00894cb8	bl 0x00894dec
00894cbc	b 0x00894c5c
00894cc0	ldr x9,[x8, #0x28]
00894cc4	cbz x9,0x00894c5c
00894cc8	ldr x20,[x8, #0x20]
00894ccc	lsl x24,x9,#0x3
00894cd0	ldr x8,[x20]
00894cd4	str x8,[sp, #0x10]
00894cd8	add x0,x25,#0x18
00894cdc	add x1,sp,#0x10
00894ce0	bl 0x00894dec
00894ce4	subs x24,x24,#0x8
00894ce8	add x20,x20,#0x8
00894cec	b.ne 0x00894cd0
00894cf0	b 0x00894c5c
00894cf4	ldr x8,[x19]
00894cf8	ldr x8,[x8]
00894cfc	add x1,sp,#0x18
00894d00	mov x0,x19
00894d04	blr x8
00894d08	ldr x8,[sp, #0x28]
00894d0c	cbnz x8,0x00894d88
00894d10	ldr x0,[sp, #0x30]
00894d14	adrp x8,0xc4b000
00894d18	add x8,x8,#0xb0
00894d1c	str x8,[sp, #0x18]
00894d20	cbz x0,0x00894d50
00894d24	bl 0x00c301d0
00894d28	ldr x0,[sp, #0x48]
00894d2c	str xzr,[sp, #0x30]
00894d30	bl 0x00c301d0
00894d34	mov x0,xzr
00894d38	stp xzr,xzr,[sp, #0x38]
00894d3c	str xzr,[sp, #0x48]
00894d40	bl 0x00c301d0
00894d44	mov w8,#0x40
00894d48	str xzr,[sp, #0x50]
00894d4c	strb w8,[sp, #0x60]
00894d50	ldr x0,[sp, #0x48]
00894d54	bl 0x00c301d0
00894d58	ldr x8,[x23, #0x28]
00894d5c	ldur x9,[x29, #-0x8]
00894d60	cmp x8,x9
00894d64	b.ne 0x00894de8
00894d68	ldp x20,x19,[sp, #0xc0]
00894d6c	ldp x22,x21,[sp, #0xb0]
00894d70	ldp x24,x23,[sp, #0xa0]
00894d74	ldp x26,x25,[sp, #0x90]
00894d78	ldp x28,x27,[sp, #0x80]
00894d7c	ldp x29,x30,[sp, #0x70]
00894d80	add sp,sp,#0xd0
00894d84	ret
00894d88	ldr x2,[x8]
00894d8c	ldr x8,[sp, #0x8]
00894d90	ldr w8,[x8, #0xc]
00894d94	ldr x9,[x23, #0x28]
00894d98	ldur x10,[x29, #-0x8]
00894d9c	cmp x9,x10
00894da0	b.ne 0x00894de8
00894da4	adrp x1,0x2b3000
00894da8	add x1,x1,#0x412
00894dac	add x0,x19,#0xc
00894db0	add w3,w8,#0x1
00894db4	bl 0x0087fcd8
00894de8	bl 0x00c2fec0
