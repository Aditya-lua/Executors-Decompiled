; ix::SocketOpenSSL::SocketOpenSSL @ 009a337c
009a337c	sub sp,sp,#0x70
009a3380	stp x22,x21,[sp, #0x40]
009a3384	stp x20,x19,[sp, #0x50]
009a3388	stp x29,x30,[sp, #0x60]
009a338c	add x29,sp,#0x60
009a3390	mrs x22,tpidr_el0
009a3394	ldr x8,[x22, #0x28]
009a3398	mov x21,x1
009a339c	mov w1,w2
009a33a0	mov x19,x0
009a33a4	stur x8,[x29, #-0x28]
009a33a8	bl 0x00c335a0
009a33ac	adrp x8,0xcb5000
009a33b0	ldr x8,[x8, #0x120]
009a33b4	add x20,x19,#0x58
009a33b8	stp xzr,xzr,[x19, #0x40]
009a33bc	add x8,x8,#0x10
009a33c0	str x8,[x19]
009a33c4	mov x0,x20
009a33c8	mov x1,x21
009a33cc	bl 0x00c340c0
009a33d0	str xzr,[x19, #0x100]
009a33d4	adrp x8,0xcb5000
009a33d8	ldr x8,[x8, #0xf8]
009a33dc	movi v0.2D,#0x0
009a33e0	mov x21,x19
009a33e4	str q0,[x21, #0xe0]!
009a33e8	str q0,[x19, #0xf0]
009a33ec	mov v0.D[0x0],x8
009a33f0	str x19,[sp, #0x8]
009a33f4	str q0,[sp, #0x10]
009a33f8	adrp x8,0xcb5000
009a33fc	ldr x8,[x8, #0xf0]
009a3400	ldar x8,[x8]
009a3404	cmn x8,#0x1
009a3408	b.eq 0x009a3438
009a340c	add x8,sp,#0x10
009a3410	add x9,sp,#0x8
009a3414	add x10,sp,#0x28
009a3418	stp x8,x9,[sp, #0x28]
009a341c	str x10,[sp, #0x20]
009a3420	adrp x0,0xcb5000
009a3424	adrp x2,0xcb5000
009a3428	ldr x0,[x0, #0xf0]
009a342c	ldr x2,[x2, #0x118]
009a3430	add x1,sp,#0x20
009a3434	bl 0x00c305d0
009a3438	ldr x8,[x22, #0x28]
009a343c	ldur x9,[x29, #-0x28]
009a3440	cmp x8,x9
009a3444	b.ne 0x009a345c
009a3448	ldp x29,x30,[sp, #0x60]
009a344c	ldp x20,x19,[sp, #0x50]
009a3450	ldp x22,x21,[sp, #0x40]
009a3454	add sp,sp,#0x70
009a3458	ret
009a345c	bl 0x00c2fec0
