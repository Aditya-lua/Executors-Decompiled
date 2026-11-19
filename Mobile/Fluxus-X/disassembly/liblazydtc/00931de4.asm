; FUN_00931de4 @ 00931de4
00931de4	str x21,[sp, #-0x30]!
00931de8	stp x20,x19,[sp, #0x10]
00931dec	stp x29,x30,[sp, #0x20]
00931df0	add x29,sp,#0x20
00931df4	mov x19,x0
00931df8	str wzr,[x0, #0xc30]
00931dfc	bl 0x00941cb8
00931e00	str x0,[x19, #0xb30]
00931e04	ldrb w8,[x19, #0xc34]
00931e08	str x1,[x19, #0xb38]
00931e0c	ldr q0,[x19, #0xb30]
00931e10	add x9,x19,#0xb88
00931e14	and w8,w8,#0xfffffffd
00931e18	strb w8,[x19, #0xc34]
00931e1c	str q0,[x19, #0xb70]
00931e20	str q0,[x9]
00931e24	ldr w8,[x19, #0xadc]
00931e28	mov w9,#0x90
00931e2c	mov x20,x0
00931e30	mov x21,x1
00931e34	and w8,w8,w9
00931e38	ldr x9,[x19, #0x330]
00931e3c	str xzr,[x19, #0xb80]
00931e40	str xzr,[x19, #0xb98]
00931e44	str xzr,[x19, #0xac8]
00931e48	str xzr,[x19, #0xac0]
00931e4c	str w8,[x19, #0xadc]
00931e50	cbz x9,0x00931e80
00931e54	ldr x2,[x19, #0xb88]
00931e58	ldr x3,[x19, #0xb90]
00931e5c	mov x0,x20
00931e60	mov x1,x21
00931e64	bl 0x00941d54
00931e68	cmp x0,#0xbb8
00931e6c	b.lt 0x00931e80
00931e70	ldr x8,[x19, #0xac0]
00931e74	str x20,[x19, #0xb88]
00931e78	str x21,[x19, #0xb90]
00931e7c	str x8,[x19, #0xb98]
00931e80	ldr x8,[x19, #0x328]
00931e84	cbz x8,0x00931eb4
00931e88	ldr x2,[x19, #0xb70]
00931e8c	ldr x3,[x19, #0xb78]
00931e90	mov x0,x20
00931e94	mov x1,x21
00931e98	bl 0x00941d54
00931e9c	cmp x0,#0xbb8
00931ea0	b.lt 0x00931eb4
00931ea4	ldr x8,[x19, #0xac8]
00931ea8	str x20,[x19, #0xb70]
00931eac	str x21,[x19, #0xb78]
00931eb0	str x8,[x19, #0xb80]
00931eb4	ldp x29,x30,[sp, #0x20]
00931eb8	ldp x20,x19,[sp, #0x10]
00931ebc	ldr x21,[sp], #0x30
00931ec0	ret
