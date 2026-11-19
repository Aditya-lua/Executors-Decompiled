; cpr::Proxies::Proxies @ 008fb298
008fb298	sub sp,sp,#0x80
008fb29c	str x25,[sp, #0x30]
008fb2a0	stp x24,x23,[sp, #0x40]
008fb2a4	stp x22,x21,[sp, #0x50]
008fb2a8	stp x20,x19,[sp, #0x60]
008fb2ac	stp x29,x30,[sp, #0x70]
008fb2b0	add x29,sp,#0x70
008fb2b4	mrs x24,tpidr_el0
008fb2b8	ldr x8,[x24, #0x28]
008fb2bc	mov x21,x0
008fb2c0	mov x20,x1
008fb2c4	mov x19,x0
008fb2c8	str x8,[sp, #0x28]
008fb2cc	str xzr,[x21, #0x8]!
008fb2d0	str xzr,[x0, #0x10]
008fb2d4	str x21,[x0]
008fb2d8	ldr x25,[x20], #0x8
008fb2dc	b 0x008fb2e4
008fb2e0	mov x25,x9
008fb2e4	cmp x25,x20
008fb2e8	b.eq 0x008fb3b0
008fb2ec	add x23,x25,#0x20
008fb2f0	add x2,sp,#0x8
008fb2f4	mov x3,sp
008fb2f8	mov x0,x19
008fb2fc	mov x1,x21
008fb300	mov x4,x23
008fb304	bl 0x00c31120
008fb308	ldr x8,[x0]
008fb30c	mov x22,x0
008fb310	cbz x8,0x008fb320
008fb314	ldr x8,[x25, #0x8]
008fb318	cbnz x8,0x008fb370
008fb31c	b 0x008fb380
008fb320	add x8,sp,#0x10
008fb324	mov x0,x19
008fb328	mov x1,x23
008fb32c	bl 0x00c31140
008fb330	ldp x8,x1,[sp, #0x8]
008fb334	stp xzr,xzr,[x1]
008fb338	str x8,[x1, #0x10]
008fb33c	str x1,[x22]
008fb340	ldr x8,[x19]
008fb344	ldr x8,[x8]
008fb348	cbz x8,0x008fb354
008fb34c	str x8,[x19]
008fb350	ldr x1,[x22]
008fb354	ldr x0,[x19, #0x8]
008fb358	bl 0x00c30c90
008fb35c	ldr x8,[x19, #0x10]
008fb360	add x8,x8,#0x1
008fb364	str x8,[x19, #0x10]
008fb368	ldr x8,[x25, #0x8]
008fb36c	cbz x8,0x008fb380
008fb370	mov x25,x8
008fb374	ldr x8,[x8]
008fb378	cbnz x8,0x008fb370
008fb37c	b 0x008fb2e4
008fb380	mov x8,x25
008fb384	ldr x9,[x8, #0x10]!
008fb388	ldr x10,[x9]
008fb38c	cmp x10,x25
008fb390	b.eq 0x008fb2e0
008fb394	ldr x9,[x8]
008fb398	mov x8,x9
008fb39c	ldr x25,[x8, #0x10]!
008fb3a0	ldr x10,[x25]
008fb3a4	cmp x10,x9
008fb3a8	b.ne 0x008fb394
008fb3ac	b 0x008fb2e4
008fb3b0	ldr x8,[x24, #0x28]
008fb3b4	ldr x9,[sp, #0x28]
008fb3b8	cmp x8,x9
008fb3bc	b.ne 0x008fb3dc
008fb3c0	ldp x29,x30,[sp, #0x70]
008fb3c4	ldp x20,x19,[sp, #0x60]
008fb3c8	ldp x22,x21,[sp, #0x50]
008fb3cc	ldp x24,x23,[sp, #0x40]
008fb3d0	ldr x25,[sp, #0x30]
008fb3d4	add sp,sp,#0x80
008fb3d8	ret
008fb3dc	bl 0x00c2fec0
