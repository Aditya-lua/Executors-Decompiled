; FUN_00b9e1e0 @ 00b9e1e0
00b9e1e0	sub sp,sp,#0xa0
00b9e1e4	stp x26,x25,[sp, #0x50]
00b9e1e8	stp x24,x23,[sp, #0x60]
00b9e1ec	stp x22,x21,[sp, #0x70]
00b9e1f0	stp x20,x19,[sp, #0x80]
00b9e1f4	stp x29,x30,[sp, #0x90]
00b9e1f8	add x29,sp,#0x90
00b9e1fc	mrs x26,tpidr_el0
00b9e200	ldr x8,[x26, #0x28]
00b9e204	mov w10,#0x200
00b9e208	movk w10,#0x3c0, LSL #16
00b9e20c	mov x19,x2
00b9e210	str x8,[sp, #0x48]
00b9e214	ldr w8,[x0]
00b9e218	mov x21,x0
00b9e21c	mov x20,x1
00b9e220	and w9,w8,#0xffc07fff
00b9e224	cmp w9,w10
00b9e228	b.ne 0x00b9e26c
00b9e22c	add x0,x21,#0x8
00b9e230	add x1,sp,#0x8
00b9e234	bl 0x00c42430
00b9e238	mov w21,w0
00b9e23c	cbnz w0,0x00b9e250
00b9e240	add x1,sp,#0x8
00b9e244	mov x0,x20
00b9e248	mov x2,x19
00b9e24c	bl 0x00c2ffd0
00b9e250	add x0,sp,#0x8
00b9e254	mov w1,#0x10
00b9e258	bl 0x00c42220
00b9e25c	mov w0,w21
00b9e260	bl 0x00c42bf0
00b9e264	mov w24,w0
00b9e268	b 0x00b9e378
00b9e26c	and w8,w8,#0x7fc00000
00b9e270	orr w9,wzr,#0x3800000
00b9e274	cmp w8,w9
00b9e278	b.ne 0x00b9e2c4
00b9e27c	ldr w23,[x21, #0x8]
00b9e280	str xzr,[sp]
00b9e284	sub w8,w23,#0x3
00b9e288	and w9,w8,#0xff
00b9e28c	cmp w9,#0x10
00b9e290	b.cs 0x00b9e2a4
00b9e294	and x9,x8,#0xff
00b9e298	mov w10,#0xe7e7
00b9e29c	lsr w9,w10,w9
00b9e2a0	tbnz w9,#0x0,0x00b9e2cc
00b9e2a4	mov w8,#0x2000000
00b9e2a8	mov w9,#0x13
00b9e2ac	movk w9,#0x200, LSL #16
00b9e2b0	bfxil w8,w23,#0x0,#0x8
00b9e2b4	cmp w8,w9
00b9e2b8	mov w8,#0x48
00b9e2bc	csel x25,x8,xzr,eq
00b9e2c0	b 0x00b9e2dc
00b9e2c4	mov w24,#0xffffff77
00b9e2c8	b 0x00b9e378
00b9e2cc	adrp x9,0x787000
00b9e2d0	sxtb x8,w8
00b9e2d4	add x9,x9,#0x790
00b9e2d8	ldr x25,[x9, x8, LSL #0x3]
00b9e2dc	add x22,x21,#0x10
00b9e2e0	add x1,sp,#0x8
00b9e2e4	mov w2,#0x40
00b9e2e8	mov x3,sp
00b9e2ec	mov x0,x22
00b9e2f0	bl 0x00c42ce0
00b9e2f4	mov w24,w0
00b9e2f8	cbnz w0,0x00b9e378
00b9e2fc	mov x0,x22
00b9e300	mov w1,w23
00b9e304	bl 0x00c42cf0
00b9e308	mov w24,w0
00b9e30c	cbnz w0,0x00b9e36c
00b9e310	add x1,x21,#0xf8
00b9e314	mov x0,x22
00b9e318	mov x2,x25
00b9e31c	bl 0x00c42d00
00b9e320	mov w24,w0
00b9e324	cbnz w0,0x00b9e36c
00b9e328	ldr x2,[sp]
00b9e32c	add x1,sp,#0x8
00b9e330	mov x0,x22
00b9e334	bl 0x00c42d00
00b9e338	mov w24,w0
00b9e33c	cbnz w0,0x00b9e36c
00b9e340	add x1,sp,#0x8
00b9e344	mov w2,#0x40
00b9e348	mov x3,sp
00b9e34c	mov x0,x22
00b9e350	bl 0x00c42ce0
00b9e354	mov w24,w0
00b9e358	cbnz w0,0x00b9e36c
00b9e35c	add x1,sp,#0x8
00b9e360	mov x0,x20
00b9e364	mov x2,x19
00b9e368	bl 0x00c2ffd0
00b9e36c	ldr x1,[sp]
00b9e370	add x0,sp,#0x8
00b9e374	bl 0x00c42220
00b9e378	ldr x8,[x26, #0x28]
00b9e37c	ldr x9,[sp, #0x48]
00b9e380	cmp x8,x9
00b9e384	b.ne 0x00b9e3a8
00b9e388	mov w0,w24
00b9e38c	ldp x29,x30,[sp, #0x90]
00b9e390	ldp x20,x19,[sp, #0x80]
00b9e394	ldp x22,x21,[sp, #0x70]
00b9e398	ldp x24,x23,[sp, #0x60]
00b9e39c	ldp x26,x25,[sp, #0x50]
00b9e3a0	add sp,sp,#0xa0
00b9e3a4	ret
00b9e3a8	bl 0x00c2fec0
