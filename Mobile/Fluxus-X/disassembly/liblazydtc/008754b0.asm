; FUN_008754b0 @ 008754b0
008754b0	sub sp,sp,#0x80
008754b4	stp x29,x30,[sp, #0x60]
008754b8	str x19,[sp, #0x70]
008754bc	add x29,sp,#0x60
008754c0	mrs x19,tpidr_el0
008754c4	movi v0.2D,#0x0
008754c8	add x2,sp,#0x30
008754cc	ldr x8,[x19, #0x28]
008754d0	stur x8,[x29, #-0x8]
008754d4	mov w8,#0x8
008754d8	stp q0,q0,[sp, #0x30]
008754dc	str w8,[sp, #0x30]
008754e0	str w1,[sp, #0x38]
008754e4	str w8,[sp, #0x8]
008754e8	mov w8,w1
008754ec	add x1,sp,#0x8
008754f0	str xzr,[sp, #0x50]
008754f4	stp x8,xzr,[sp, #0x10]
008754f8	stp xzr,xzr,[sp, #0x20]
008754fc	bl 0x00874b84
00875500	ldr x8,[x19, #0x28]
00875504	ldur x9,[x29, #-0x8]
00875508	cmp x8,x9
0087550c	b.ne 0x00875520
00875510	ldp x29,x30,[sp, #0x60]
00875514	ldr x19,[sp, #0x70]
00875518	add sp,sp,#0x80
0087551c	ret
00875520	bl 0x00c2fec0
