; ossl_core_bio_free @ 00a4e308
00a4e308	stp x20,x19,[sp, #-0x20]!
00a4e30c	stp x29,x30,[sp, #0x10]
00a4e310	add x29,sp,#0x10
00a4e314	cbz x0,0x00a4e374
00a4e318	mov x19,x0
00a4e31c	ldxr w8,[x19]
00a4e320	subs w9,w8,#0x1
00a4e324	stxr w10,w9,[x19]
00a4e328	cbnz w10,0x00a4e31c
00a4e32c	b.ne 0x00a4e338
00a4e330	dmb ISHLD
00a4e334	b 0x00a4e340
00a4e338	cmp w8,#0x1
00a4e33c	b.gt 0x00a4e374
00a4e340	ldr x0,[x19, #0x10]
00a4e344	bl 0x00c31a40
00a4e348	ldr x8,[x19, #0x8]
00a4e34c	mov w20,w0
00a4e350	mov x0,x8
00a4e354	bl 0x00c34d40
00a4e358	adrp x1,0x2b2000
00a4e35c	add x1,x1,#0x1d3
00a4e360	mov w2,#0x34
00a4e364	mov x0,x19
00a4e368	bl 0x00c32310
00a4e36c	mov w0,w20
00a4e370	b 0x00a4e378
00a4e374	mov w0,#0x1
00a4e378	ldp x29,x30,[sp, #0x10]
00a4e37c	ldp x20,x19,[sp], #0x20
00a4e380	ret
