; evp_cipher_cache_constants @ 00a5ed4c
00a5ed4c	stp x28,x21,[sp, #-0x30]!
00a5ed50	stp x20,x19,[sp, #0x10]
00a5ed54	stp x29,x30,[sp, #0x20]
00a5ed58	add x29,sp,#0x20
00a5ed5c	sub sp,sp,#0x200
00a5ed60	mov x19,x0
00a5ed64	adrp x0,0x2b9000
00a5ed68	add x0,x0,#0xdb8
00a5ed6c	add x8,sp,#0x8
00a5ed70	sub x1,x29,#0x48
00a5ed74	add x20,sp,#0x30
00a5ed78	stp xzr,xzr,[x29, #-0x30]
00a5ed7c	stur wzr,[x29, #-0x34]
00a5ed80	stp xzr,xzr,[x29, #-0x48]
00a5ed84	stur xzr,[x29, #-0x50]
00a5ed88	stur wzr,[x29, #-0x54]
00a5ed8c	bl 0x00c36270
00a5ed90	ldr x8,[sp, #0x28]
00a5ed94	ldur q0,[sp, #0x18]
00a5ed98	ldur q1,[sp, #0x8]
00a5ed9c	adrp x0,0x2c3000
00a5eda0	str x8,[sp, #0x50]
00a5eda4	add x0,x0,#0x9bc
00a5eda8	add x8,sp,#0x8
00a5edac	sub x1,x29,#0x40
00a5edb0	stp q1,q0,[sp, #0x30]
00a5edb4	bl 0x00c36270
00a5edb8	ldr x8,[sp, #0x28]
00a5edbc	ldur q0,[sp, #0x18]
00a5edc0	ldur q1,[sp, #0x8]
00a5edc4	adrp x0,0x2bd000
00a5edc8	str x8,[sp, #0x78]
00a5edcc	add x0,x0,#0xa97
00a5edd0	add x8,sp,#0x8
00a5edd4	sub x1,x29,#0x50
00a5edd8	stur q0,[sp, #0x68]
00a5eddc	stur q1,[sp, #0x58]
00a5ede0	bl 0x00c36270
00a5ede4	ldr x8,[sp, #0x28]
00a5ede8	ldur q0,[sp, #0x18]
00a5edec	ldur q1,[sp, #0x8]
00a5edf0	adrp x0,0x2d7000
00a5edf4	str x8,[sp, #0xa0]
00a5edf8	add x0,x0,#0xa76
00a5edfc	add x8,sp,#0x8
00a5ee00	sub x1,x29,#0x54
00a5ee04	str q0,[x20, #0x60]
00a5ee08	str q1,[sp, #0x80]
00a5ee0c	bl 0x00c37340
00a5ee10	ldr x8,[sp, #0x28]
00a5ee14	ldur q0,[sp, #0x18]
00a5ee18	ldur q1,[sp, #0x8]
00a5ee1c	adrp x0,0x2c9000
00a5ee20	str x8,[sp, #0xc8]
00a5ee24	add x0,x0,#0x959
00a5ee28	add x8,sp,#0x8
00a5ee2c	sub x1,x29,#0x24
00a5ee30	stur q0,[x20, #0x88]
00a5ee34	stur q1,[x20, #0x78]
00a5ee38	bl 0x00c36260
00a5ee3c	ldr x8,[sp, #0x28]
00a5ee40	ldur q0,[sp, #0x8]
00a5ee44	ldur q1,[sp, #0x18]
00a5ee48	adrp x0,0x2a4000
00a5ee4c	str x8,[sp, #0xf0]
00a5ee50	add x0,x0,#0x63
00a5ee54	add x8,sp,#0x8
00a5ee58	sub x1,x29,#0x28
00a5ee5c	stp q0,q1,[x20, #0xa0]
00a5ee60	bl 0x00c36260
00a5ee64	ldr x8,[sp, #0x28]
00a5ee68	ldur q0,[sp, #0x18]
00a5ee6c	ldur q1,[sp, #0x8]
00a5ee70	adrp x0,0x2c5000
00a5ee74	str x8,[sp, #0x118]
00a5ee78	add x0,x0,#0xa92
00a5ee7c	add x8,sp,#0x8
00a5ee80	sub x1,x29,#0x2c
00a5ee84	stur q0,[x20, #0xd8]
00a5ee88	stur q1,[x20, #0xc8]
00a5ee8c	bl 0x00c36260
00a5ee90	ldr x8,[sp, #0x28]
00a5ee94	ldur q0,[sp, #0x8]
00a5ee98	ldur q1,[sp, #0x18]
00a5ee9c	adrp x0,0x2c9000
00a5eea0	str x8,[sp, #0x140]
00a5eea4	add x0,x0,#0x95e
00a5eea8	add x8,sp,#0x8
00a5eeac	sub x1,x29,#0x30
00a5eeb0	stp q0,q1,[x20, #0xf0]
00a5eeb4	add x21,x20,#0x118
00a5eeb8	bl 0x00c36260
00a5eebc	ldr x8,[sp, #0x28]
00a5eec0	ldur q0,[sp, #0x18]
00a5eec4	ldur q1,[sp, #0x8]
00a5eec8	adrp x0,0x2bf000
00a5eecc	add x9,x20,#0x128
00a5eed0	str x8,[sp, #0x168]
00a5eed4	add x0,x0,#0xc88
00a5eed8	add x8,sp,#0x8
00a5eedc	sub x1,x29,#0x34
00a5eee0	str q0,[x9]
00a5eee4	str q1,[x21]
00a5eee8	bl 0x00c36260
00a5eeec	ldr x8,[sp, #0x28]
00a5eef0	ldur q0,[sp, #0x8]
00a5eef4	ldur q1,[sp, #0x18]
00a5eef8	add x21,x20,#0x168
00a5eefc	str x8,[sp, #0x190]
00a5ef00	add x8,sp,#0x8
00a5ef04	stp q0,q1,[x20, #0x140]
00a5ef08	bl 0x00c34c40
00a5ef0c	ldur q0,[sp, #0x18]
00a5ef10	ldur q1,[sp, #0x8]
00a5ef14	ldr x8,[sp, #0x28]
00a5ef18	add x9,x20,#0x178
00a5ef1c	add x1,sp,#0x30
00a5ef20	mov x0,x19
00a5ef24	str q0,[x9]
00a5ef28	str q1,[x21]
00a5ef2c	str x8,[sp, #0x1b8]
00a5ef30	bl 0x00c3d050
00a5ef34	cmp w0,#0x0
00a5ef38	cset w20,gt
00a5ef3c	cmp w0,#0x1
00a5ef40	b.lt 0x00a5efe8
00a5ef44	ldur x8,[x29, #-0x48]
00a5ef48	str w8,[x19, #0x4]
00a5ef4c	ldur x8,[x29, #-0x40]
00a5ef50	str w8,[x19, #0xc]
00a5ef54	ldur x8,[x29, #-0x50]
00a5ef58	str w8,[x19, #0x8]
00a5ef5c	ldur w8,[x29, #-0x54]
00a5ef60	str x8,[x19, #0x10]
00a5ef64	ldur w9,[x29, #-0x24]
00a5ef68	cbz w9,0x00a5ef74
00a5ef6c	orr x8,x8,#0x200000
00a5ef70	str x8,[x19, #0x10]
00a5ef74	ldur w9,[x29, #-0x28]
00a5ef78	cbz w9,0x00a5ef84
00a5ef7c	orr x8,x8,#0x10
00a5ef80	str x8,[x19, #0x10]
00a5ef84	ldur w9,[x29, #-0x2c]
00a5ef88	cbz w9,0x00a5ef94
00a5ef8c	orr x8,x8,#0x4000
00a5ef90	str x8,[x19, #0x10]
00a5ef94	ldur w9,[x29, #-0x30]
00a5ef98	cbz w9,0x00a5efa4
00a5ef9c	orr x8,x8,#0x400000
00a5efa0	str x8,[x19, #0x10]
00a5efa4	ldr x9,[x19, #0xb8]
00a5efa8	cbz x9,0x00a5efb4
00a5efac	orr x8,x8,#0x100000
00a5efb0	str x8,[x19, #0x10]
00a5efb4	ldur w9,[x29, #-0x34]
00a5efb8	cbz w9,0x00a5efc4
00a5efbc	orr x8,x8,#0x200
00a5efc0	str x8,[x19, #0x10]
00a5efc4	mov x0,x19
00a5efc8	bl 0x00c3cd00
00a5efcc	adrp x1,0x2b7000
00a5efd0	add x1,x1,#0xcaa
00a5efd4	bl 0x00c36530
00a5efd8	cbz x0,0x00a5efe8
00a5efdc	ldr x8,[x19, #0x10]
00a5efe0	orr x8,x8,#0x1000000
00a5efe4	str x8,[x19, #0x10]
00a5efe8	mov w0,w20
00a5efec	add sp,sp,#0x200
00a5eff0	ldp x29,x30,[sp, #0x20]
00a5eff4	ldp x20,x19,[sp, #0x10]
00a5eff8	ldp x28,x21,[sp], #0x30
00a5effc	ret
