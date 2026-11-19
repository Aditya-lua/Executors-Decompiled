; FUN_00b97e00 @ 00b97e00
00b97e00	sub sp,sp,#0x60
00b97e04	stp x24,x23,[sp, #0x20]
00b97e08	stp x22,x21,[sp, #0x30]
00b97e0c	stp x20,x19,[sp, #0x40]
00b97e10	stp x29,x30,[sp, #0x50]
00b97e14	add x29,sp,#0x50
00b97e18	mrs x24,tpidr_el0
00b97e1c	ldr x8,[x24, #0x28]
00b97e20	mov x20,x1
00b97e24	mov w19,w3
00b97e28	mov x22,x2
00b97e2c	str x8,[sp, #0x18]
00b97e30	ldrh w8,[x1, #0x2]
00b97e34	mov x21,x0
00b97e38	add x2,sp,#0x8
00b97e3c	add x3,sp,#0x10
00b97e40	str x8,[sp, #0x8]
00b97e44	ldrh w1,[x1]
00b97e48	add x4,sp,#0x14
00b97e4c	mov w0,w19
00b97e50	bl 0x00c42e60
00b97e54	cbz w0,0x00b97e80
00b97e58	ldr x8,[x24, #0x28]
00b97e5c	ldr x9,[sp, #0x18]
00b97e60	cmp x8,x9
00b97e64	b.ne 0x00b97fb4
00b97e68	ldp x29,x30,[sp, #0x50]
00b97e6c	ldp x20,x19,[sp, #0x40]
00b97e70	ldp x22,x21,[sp, #0x30]
00b97e74	ldp x24,x23,[sp, #0x20]
00b97e78	add sp,sp,#0x60
00b97e7c	ret
00b97e80	mov w9,#0x500
00b97e84	and w8,w19,#0xffc07fff
00b97e88	movk w9,#0x500, LSL #16
00b97e8c	cmp w8,w9
00b97e90	b.eq 0x00b97f04
00b97e94	mov w9,#0x200
00b97e98	movk w9,#0x540, LSL #16
00b97e9c	cmp w8,w9
00b97ea0	b.eq 0x00b97f44
00b97ea4	mov w9,#0x100
00b97ea8	movk w9,#0x540, LSL #16
00b97eac	cmp w8,w9
00b97eb0	b.ne 0x00b97f3c
00b97eb4	mov w8,#0x100
00b97eb8	movk w8,#0x550, LSL #16
00b97ebc	str w8,[x21]
00b97ec0	ldrh w8,[x20]
00b97ec4	mov w9,#0x7700
00b97ec8	and w8,w8,w9
00b97ecc	mov w9,#0x2400
00b97ed0	cmp w8,w9
00b97ed4	b.ne 0x00b97fac
00b97ed8	add x23,x21,#0x8
00b97edc	mov x0,x23
00b97ee0	bl 0x00c42010
00b97ee4	ldr w1,[sp, #0x14]
00b97ee8	ldr w3,[sp, #0x8]
00b97eec	mov x0,x23
00b97ef0	mov x2,x22
00b97ef4	bl 0x00c42030
00b97ef8	bl 0x00c42bf0
00b97efc	cbnz w0,0x00b97e58
00b97f00	b 0x00b97f94
00b97f04	mov w8,#0x500
00b97f08	movk w8,#0x510, LSL #16
00b97f0c	cmp w19,w8
00b97f10	str w8,[x21]
00b97f14	b.ne 0x00b97f3c
00b97f18	add x23,x21,#0x8
00b97f1c	mov x0,x23
00b97f20	bl 0x00c42100
00b97f24	mov x0,x23
00b97f28	mov x1,x22
00b97f2c	bl 0x00c42110
00b97f30	bl 0x00c42bf0
00b97f34	cbnz w0,0x00b97e58
00b97f38	b 0x00b97f94
00b97f3c	mov w0,#0xffffff7a
00b97f40	b 0x00b97e58
00b97f44	mov w8,#0x100
00b97f48	movk w8,#0x550, LSL #16
00b97f4c	add w8,w8,#0x100
00b97f50	str w8,[x21]
00b97f54	ldrh w8,[x20]
00b97f58	mov w9,#0x7700
00b97f5c	and w8,w8,w9
00b97f60	mov w9,#0x2400
00b97f64	cmp w8,w9
00b97f68	b.ne 0x00b97fac
00b97f6c	add x23,x21,#0x8
00b97f70	mov x0,x23
00b97f74	bl 0x00c42390
00b97f78	ldr w1,[sp, #0x14]
00b97f7c	ldr w3,[sp, #0x8]
00b97f80	mov x0,x23
00b97f84	mov x2,x22
00b97f88	bl 0x00c423a0
00b97f8c	bl 0x00c42bf0
00b97f90	cbnz w0,0x00b97e58
00b97f94	ldrh w8,[x20]
00b97f98	mov w0,wzr
00b97f9c	ubfx w9,w19,#0x10,#0x6
00b97fa0	strb w9,[x21, #0x7]
00b97fa4	strh w8,[x21, #0x4]
00b97fa8	b 0x00b97e58
00b97fac	mov w0,#0xffffff79
00b97fb0	b 0x00b97e58
00b97fb4	bl 0x00c2fec0
