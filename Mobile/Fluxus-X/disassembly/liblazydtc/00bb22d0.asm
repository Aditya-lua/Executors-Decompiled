; ZSTD_DCtx_refPrefix_advanced @ 00bb22d0
00bb22d0	sub sp,sp,#0x60
00bb22d4	stp x29,x30,[sp, #0x20]
00bb22d8	stp x24,x23,[sp, #0x30]
00bb22dc	stp x22,x21,[sp, #0x40]
00bb22e0	stp x20,x19,[sp, #0x50]
00bb22e4	add x29,sp,#0x20
00bb22e8	mrs x23,tpidr_el0
00bb22ec	add x24,x0,#0x7, LSL #12
00bb22f0	ldr x8,[x23, #0x28]
00bb22f4	stur x8,[x29, #-0x8]
00bb22f8	ldr w8,[x24, #0x61c]
00bb22fc	cbz w8,0x00bb2308
00bb2300	mov x0,#-0x3c
00bb2304	b 0x00bb2378
00bb2308	mov x19,x0
00bb230c	ldr x0,[x0, #0x75e8]
00bb2310	mov x20,x2
00bb2314	mov x22,x1
00bb2318	mov w21,w3
00bb231c	bl 0x00c435b0
00bb2320	movi v0.2D,#0x0
00bb2324	mov w8,#0x75e8
00bb2328	str wzr,[x24, #0x600]
00bb232c	str q0,[x19,x8]
00bb2330	cbz x22,0x00bb236c
00bb2334	cbz x20,0x00bb236c
00bb2338	ldr q0,[x19, #0x75b0]
00bb233c	ldr x8,[x19, #0x75c0]
00bb2340	mov x4,sp
00bb2344	mov x0,x22
00bb2348	mov x1,x20
00bb234c	mov w2,#0x1
00bb2350	mov w3,w21
00bb2354	str q0,[sp]
00bb2358	str x8,[sp, #0x10]
00bb235c	bl 0x00c435a0
00bb2360	str x0,[x19, #0x75e8]
00bb2364	cbz x0,0x00bb23a0
00bb2368	str x0,[x19, #0x75f0]
00bb236c	mov x0,xzr
00bb2370	mov w8,#0x1
00bb2374	str w8,[x24, #0x600]
00bb2378	ldr x8,[x23, #0x28]
00bb237c	ldur x9,[x29, #-0x8]
00bb2380	cmp x8,x9
00bb2384	b.ne 0x00bb23a8
00bb2388	ldp x20,x19,[sp, #0x50]
00bb238c	ldp x22,x21,[sp, #0x40]
00bb2390	ldp x24,x23,[sp, #0x30]
00bb2394	ldp x29,x30,[sp, #0x20]
00bb2398	add sp,sp,#0x60
00bb239c	ret
00bb23a0	mov x0,#-0x40
00bb23a4	b 0x00bb2378
00bb23a8	bl 0x00c2fec0
