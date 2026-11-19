; FUN_0087515c @ 0087515c
0087515c	sub sp,sp,#0x80
00875160	stp x29,x30,[sp, #0x60]
00875164	str x19,[sp, #0x70]
00875168	add x29,sp,#0x60
0087516c	mrs x19,tpidr_el0
00875170	movi v0.2D,#0x0
00875174	add x2,sp,#0x30
00875178	ldr x8,[x19, #0x28]
0087517c	stur x8,[x29, #-0x8]
00875180	mov w8,#0x6
00875184	stp q0,q0,[sp, #0x30]
00875188	str w8,[sp, #0x30]
0087518c	str w1,[sp, #0x38]
00875190	str w8,[sp, #0x8]
00875194	mov w8,w1
00875198	add x1,sp,#0x8
0087519c	str xzr,[sp, #0x50]
008751a0	stp x8,xzr,[sp, #0x10]
008751a4	stp xzr,xzr,[sp, #0x20]
008751a8	bl 0x00874b84
008751ac	ldr x8,[x19, #0x28]
008751b0	ldur x9,[x29, #-0x8]
008751b4	cmp x8,x9
008751b8	b.ne 0x008751cc
008751bc	ldp x29,x30,[sp, #0x60]
008751c0	ldr x19,[sp, #0x70]
008751c4	add sp,sp,#0x80
008751c8	ret
008751cc	bl 0x00c2fec0
