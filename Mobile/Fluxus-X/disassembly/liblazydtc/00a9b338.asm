; OPENSSL_DIR_read @ 00a9b338
00a9b338	str x21,[sp, #-0x30]!
00a9b33c	stp x20,x19,[sp, #0x10]
00a9b340	stp x29,x30,[sp, #0x20]
00a9b344	add x29,sp,#0x20
00a9b348	mov x21,x1
00a9b34c	mov x19,x0
00a9b350	bl 0x00c30710
00a9b354	mov x20,x0
00a9b358	cbz x19,0x00a9b39c
00a9b35c	cbz x21,0x00a9b39c
00a9b360	str wzr,[x20]
00a9b364	ldr x8,[x19]
00a9b368	cbz x8,0x00a9b3b8
00a9b36c	ldr x0,[x8]
00a9b370	bl 0x00c30420
00a9b374	cbz x0,0x00a9b3a8
00a9b378	ldr x8,[x19]
00a9b37c	add x1,x0,#0x13
00a9b380	mov w2,#0x1001
00a9b384	add x8,x8,#0x8
00a9b388	mov x0,x8
00a9b38c	bl 0x00c387f0
00a9b390	ldr x8,[x19]
00a9b394	add x0,x8,#0x8
00a9b398	b 0x00a9b3a8
00a9b39c	mov w8,#0x16
00a9b3a0	mov x0,xzr
00a9b3a4	str w8,[x20]
00a9b3a8	ldp x29,x30,[sp, #0x20]
00a9b3ac	ldp x20,x19,[sp, #0x10]
00a9b3b0	ldr x21,[sp], #0x30
00a9b3b4	ret
00a9b3b8	mov w0,#0x1010
00a9b3bc	bl 0x00c308d0
00a9b3c0	str x0,[x19]
00a9b3c4	cbz x0,0x00a9b40c
00a9b3c8	mov w2,#0x1010
00a9b3cc	mov w1,wzr
00a9b3d0	bl 0x00c301c0
00a9b3d4	mov x0,x21
00a9b3d8	bl 0x00c30410
00a9b3dc	ldr x8,[x19]
00a9b3e0	str x0,[x8]
00a9b3e4	ldr x8,[x19]
00a9b3e8	ldr x0,[x8]
00a9b3ec	cbnz x0,0x00a9b370
00a9b3f0	ldr w21,[x20]
00a9b3f4	mov x0,x8
00a9b3f8	bl 0x00c30960
00a9b3fc	mov x0,xzr
00a9b400	str xzr,[x19]
00a9b404	str w21,[x20]
00a9b408	b 0x00a9b3a8
00a9b40c	orr w8,wzr,#0xc
00a9b410	b 0x00a9b3a4
