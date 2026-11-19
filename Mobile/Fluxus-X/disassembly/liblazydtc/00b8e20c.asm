; FUN_00b8e20c @ 00b8e20c
00b8e20c	sub sp,sp,#0x70
00b8e210	stp x28,x27,[sp, #0x10]
00b8e214	stp x26,x25,[sp, #0x20]
00b8e218	stp x24,x23,[sp, #0x30]
00b8e21c	stp x22,x21,[sp, #0x40]
00b8e220	stp x20,x19,[sp, #0x50]
00b8e224	stp x29,x30,[sp, #0x60]
00b8e228	add x29,sp,#0x60
00b8e22c	mrs x28,tpidr_el0
00b8e230	ldr x8,[x28, #0x28]
00b8e234	mov w10,#0x9000000
00b8e238	mov x20,x4
00b8e23c	mov x21,x3
00b8e240	str x8,[sp, #0x8]
00b8e244	ldr w9,[x0]
00b8e248	and w8,w1,#0xffff
00b8e24c	mov x19,x0
00b8e250	mov w22,#0xffffff79
00b8e254	and w11,w9,#0x7f000000
00b8e258	cmp w11,w10
00b8e25c	and w10,w9,#0xfe00ffff
00b8e260	orr w10,w10,#0x8000000
00b8e264	csel w25,w10,w9,eq
00b8e268	cmp w8,#0x200
00b8e26c	b.le 0x00b8e294
00b8e270	sub w8,w8,#0x201
00b8e274	cmp w8,#0x4
00b8e278	b.cs 0x00b8e774
00b8e27c	ands w8,w2,#0xffff
00b8e280	b.eq 0x00b8e2d8
00b8e284	mov w9,#0x1001
00b8e288	cmp w8,w9
00b8e28c	b.eq 0x00b8e2d8
00b8e290	b 0x00b8e660
00b8e294	cmp w8,#0x101
00b8e298	b.eq 0x00b8e2ac
00b8e29c	cmp w8,#0x102
00b8e2a0	b.eq 0x00b8e2b8
00b8e2a4	cmp w8,#0x103
00b8e2a8	b.ne 0x00b8e774
00b8e2ac	ands w8,w2,#0xffff
00b8e2b0	b.ne 0x00b8e2cc
00b8e2b4	b 0x00b8e2d8
00b8e2b8	ands w8,w2,#0xffff
00b8e2bc	b.eq 0x00b8e2d8
00b8e2c0	mov w9,#0x1203
00b8e2c4	cmp w8,w9
00b8e2c8	b.eq 0x00b8e2d8
00b8e2cc	mov w9,#0x1200
00b8e2d0	cmp w8,w9
00b8e2d4	b.ne 0x00b8e660
00b8e2d8	mov w8,#0xff00
00b8e2dc	and w26,w25,#0xffffff00
00b8e2e0	movk w8,#0xf7ff, LSL #16
00b8e2e4	add w8,w26,w8
00b8e2e8	lsr w8,w8,#0x8
00b8e2ec	cmp w8,#0x4
00b8e2f0	b.hi 0x00b8e3bc
00b8e2f4	adrp x9,0x780000
00b8e2f8	add x9,x9,#0x7f4
00b8e2fc	ldrsw x8,[x9, x8, LSL #0x2]
00b8e300	add x8,x8,x9
00b8e304	br x8
00b8e3bc	mov w8,#0x400
00b8e3c0	movk w8,#0x800, LSL #16
00b8e3c4	add w8,w8,#0x209
00b8e3c8	cmp w25,w8
00b8e3cc	b.ne 0x00b8e4f0
00b8e3d0	and w8,w1,#0xffff
00b8e3d4	cmp w8,#0x101
00b8e3d8	mov w22,#0xffffff79
00b8e3dc	b.ne 0x00b8e774
00b8e3e0	cmp x20,#0x41
00b8e3e4	b.ne 0x00b8e774
00b8e3e8	ldrb w8,[x21]
00b8e3ec	cmp w8,#0x4
00b8e3f0	b.ne 0x00b8e660
00b8e3f4	ldur q0,[x21, #0x11]
00b8e3f8	add x8,x19,#0x10
00b8e3fc	mov w22,wzr
00b8e400	str q0,[x8, #0x10]
00b8e404	ldur q0,[x21, #0x1]
00b8e408	str q0,[x8]
00b8e40c	b 0x00b8e77c
00b8e4f0	mov w22,#0xffffff77
00b8e4f4	b 0x00b8e77c
00b8e660	mov w22,#0xffffff79
00b8e664	b 0x00b8e774
00b8e774	mov x0,x19
00b8e778	bl 0x00c42d20
00b8e77c	ldr x8,[x28, #0x28]
00b8e780	ldr x9,[sp, #0x8]
00b8e784	cmp x8,x9
00b8e788	b.ne 0x00b8e8ac
00b8e78c	mov w0,w22
00b8e790	ldp x29,x30,[sp, #0x60]
00b8e794	ldp x20,x19,[sp, #0x50]
00b8e798	ldp x22,x21,[sp, #0x40]
00b8e79c	ldp x24,x23,[sp, #0x30]
00b8e7a0	ldp x26,x25,[sp, #0x20]
00b8e7a4	ldp x28,x27,[sp, #0x10]
00b8e7a8	add sp,sp,#0x70
00b8e7ac	ret
00b8e8ac	bl 0x00c2fec0
