; FUN_00874ea4 @ 00874ea4
00874ea4	sub sp,sp,#0x80
00874ea8	stp x29,x30,[sp, #0x60]
00874eac	str x19,[sp, #0x70]
00874eb0	add x29,sp,#0x60
00874eb4	mrs x19,tpidr_el0
00874eb8	movi v0.2D,#0x0
00874ebc	add x2,sp,#0x30
00874ec0	ldr x8,[x19, #0x28]
00874ec4	stur x8,[x29, #-0x8]
00874ec8	mov w8,#0x1
00874ecc	stp q0,q0,[sp, #0x30]
00874ed0	str w8,[sp, #0x30]
00874ed4	strb w1,[sp, #0x38]
00874ed8	str w8,[sp, #0x8]
00874edc	and x8,x1,#0x1
00874ee0	add x1,sp,#0x8
00874ee4	str xzr,[sp, #0x50]
00874ee8	stp x8,xzr,[sp, #0x10]
00874eec	stp xzr,xzr,[sp, #0x20]
00874ef0	bl 0x00874b84
00874ef4	ldr x8,[x19, #0x28]
00874ef8	ldur x9,[x29, #-0x8]
00874efc	cmp x8,x9
00874f00	b.ne 0x00874f14
00874f04	ldp x29,x30,[sp, #0x60]
00874f08	ldr x19,[sp, #0x70]
00874f0c	add sp,sp,#0x80
00874f10	ret
00874f14	bl 0x00c2fec0
