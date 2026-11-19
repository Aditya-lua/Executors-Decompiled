; FUN_00963c1c @ 00963c1c
00963c1c	sub sp,sp,#0xb0
00963c20	stp x24,x23,[sp, #0x70]
00963c24	stp x22,x21,[sp, #0x80]
00963c28	stp x20,x19,[sp, #0x90]
00963c2c	stp x29,x30,[sp, #0xa0]
00963c30	add x29,sp,#0xa0
00963c34	mrs x24,tpidr_el0
00963c38	ldr x8,[x24, #0x28]
00963c3c	mov x21,x0
00963c40	mov x0,x2
00963c44	mov x19,x3
00963c48	mov x22,x2
00963c4c	mov x20,x1
00963c50	stur x8,[x29, #-0x38]
00963c54	bl 0x00c2ff50
00963c58	bl 0x00963a64
00963c5c	mov w2,w0
00963c60	adrp x0,0xc50000
00963c64	add x0,x0,#0x2e0
00963c68	mov x1,x22
00963c6c	bl 0x009230d0
00963c70	mov x22,x0
00963c74	cbz x0,0x00963d60
00963c78	mov x0,x21
00963c7c	bl 0x009252b0
00963c80	cbz x0,0x00963cac
00963c84	mov x0,x21
00963c88	bl 0x009252a8
00963c8c	mov x23,x0
00963c90	mov x0,x21
00963c94	bl 0x009252b0
00963c98	bl 0x00963a64
00963c9c	mov w2,w0
00963ca0	mov x0,x22
00963ca4	mov x1,x23
00963ca8	bl 0x0092328c
00963cac	sub x1,x29,#0x48
00963cb0	mov x0,x22
00963cb4	bl 0x009232ac
00963cb8	ldurb w2,[x29, #-0x48]
00963cbc	ldurb w3,[x29, #-0x47]
00963cc0	ldurb w4,[x29, #-0x46]
00963cc4	ldurb w5,[x29, #-0x45]
00963cc8	ldurb w6,[x29, #-0x44]
00963ccc	ldurb w7,[x29, #-0x43]
00963cd0	ldurb w8,[x29, #-0x42]
00963cd4	ldurb w9,[x29, #-0x41]
00963cd8	ldurb w10,[x29, #-0x40]
00963cdc	ldurb w11,[x29, #-0x3f]
00963ce0	ldurb w12,[x29, #-0x3e]
00963ce4	ldurb w13,[x29, #-0x3d]
00963ce8	ldurb w14,[x29, #-0x3c]
00963cec	ldurb w15,[x29, #-0x3b]
00963cf0	ldurb w16,[x29, #-0x3a]
00963cf4	ldurb w17,[x29, #-0x39]
00963cf8	adrp x0,0x2a1000
00963cfc	add x0,x0,#0xa65
00963d00	mov x1,x20
00963d04	str w17,[sp, #0x48]
00963d08	str w16,[sp, #0x40]
00963d0c	str w15,[sp, #0x38]
00963d10	str w14,[sp, #0x30]
00963d14	str w13,[sp, #0x28]
00963d18	str w12,[sp, #0x20]
00963d1c	str w11,[sp, #0x18]
00963d20	str w10,[sp, #0x10]
00963d24	str w9,[sp, #0x8]
00963d28	str w8,[sp]
00963d2c	bl 0x00c31d10
00963d30	mov x20,x0
00963d34	cbz x0,0x00963d60
00963d38	mov x0,x20
00963d3c	bl 0x00c2ff50
00963d40	adrp x3,0xcb4000
00963d44	ldr x3,[x3, #0xca8]
00963d48	mov x2,x0
00963d4c	mov x0,x19
00963d50	mov x1,x20
00963d54	bl 0x0092525c
00963d58	mov w0,wzr
00963d5c	b 0x00963d64
00963d60	mov w0,#0x1b
00963d64	ldr x8,[x24, #0x28]
00963d68	ldur x9,[x29, #-0x38]
00963d6c	cmp x8,x9
00963d70	b.ne 0x00963d8c
00963d74	ldp x29,x30,[sp, #0xa0]
00963d78	ldp x20,x19,[sp, #0x90]
00963d7c	ldp x22,x21,[sp, #0x80]
00963d80	ldp x24,x23,[sp, #0x70]
00963d84	add sp,sp,#0xb0
00963d88	ret
00963d8c	bl 0x00c2fec0
