; ossl_dh_cache_named_group @ 00a1e2b0
00a1e2b0	stp x20,x19,[sp, #-0x20]!
00a1e2b4	stp x29,x30,[sp, #0x10]
00a1e2b8	add x29,sp,#0x10
00a1e2bc	cbz x0,0x00a1e320
00a1e2c0	mov x19,x0
00a1e2c4	ldr x0,[x0, #0x8]
00a1e2c8	str wzr,[x19, #0x3c]
00a1e2cc	cbz x0,0x00a1e320
00a1e2d0	ldr x2,[x19, #0x18]
00a1e2d4	cbz x2,0x00a1e320
00a1e2d8	ldr x1,[x19, #0x10]
00a1e2dc	bl 0x00c39f40
00a1e2e0	cbz x0,0x00a1e320
00a1e2e4	ldr x8,[x19, #0x10]
00a1e2e8	mov x20,x0
00a1e2ec	cbnz x8,0x00a1e2fc
00a1e2f0	mov x0,x20
00a1e2f4	bl 0x00c39f10
00a1e2f8	str x0,[x19, #0x10]
00a1e2fc	mov x0,x20
00a1e300	bl 0x00c39f20
00a1e304	str w0,[x19, #0x3c]
00a1e308	mov x0,x20
00a1e30c	bl 0x00c39f00
00a1e310	ldr x8,[x19, #0xc8]
00a1e314	str w0,[x19, #0x60]
00a1e318	add x8,x8,#0x1
00a1e31c	str x8,[x19, #0xc8]
00a1e320	ldp x29,x30,[sp, #0x10]
00a1e324	ldp x20,x19,[sp], #0x20
00a1e328	ret
