; FUN_00874f8c @ 00874f8c
00874f8c	sub sp,sp,#0x80
00874f90	stp x29,x30,[sp, #0x60]
00874f94	str x19,[sp, #0x70]
00874f98	add x29,sp,#0x60
00874f9c	mrs x19,tpidr_el0
00874fa0	movi v4.2D,#0x0
00874fa4	add x1,sp,#0x8
00874fa8	ldr x8,[x19, #0x28]
00874fac	add x2,sp,#0x30
00874fb0	stur x8,[x29, #-0x8]
00874fb4	mov w8,#0x3
00874fb8	str xzr,[sp, #0x50]
00874fbc	stp q4,q4,[sp, #0x30]
00874fc0	str w8,[sp, #0x30]
00874fc4	stp s0,s1,[sp, #0x38]
00874fc8	stp s2,s3,[sp, #0x40]
00874fcc	str w8,[sp, #0x8]
00874fd0	stp xzr,xzr,[sp, #0x20]
00874fd4	stp s0,s1,[sp, #0x10]
00874fd8	stp s2,s3,[sp, #0x18]
00874fdc	bl 0x00874b84
00874fe0	ldr x8,[x19, #0x28]
00874fe4	ldur x9,[x29, #-0x8]
00874fe8	cmp x8,x9
00874fec	b.ne 0x00875000
00874ff0	ldp x29,x30,[sp, #0x60]
00874ff4	ldr x19,[sp, #0x70]
00874ff8	add sp,sp,#0x80
00874ffc	ret
00875000	bl 0x00c2fec0
