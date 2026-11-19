; WPACKET_reserve_bytes @ 00a9c32c
00a9c32c	str x21,[sp, #-0x30]!
00a9c330	mov x21,x0
00a9c334	mov w0,wzr
00a9c338	stp x20,x19,[sp, #0x10]
00a9c33c	stp x29,x30,[sp, #0x20]
00a9c340	add x29,sp,#0x20
00a9c344	cbz x1,0x00a9c40c
00a9c348	ldr x8,[x21, #0x28]
00a9c34c	cbz x8,0x00a9c40c
00a9c350	ldp x8,x9,[x21, #0x18]
00a9c354	mov x20,x1
00a9c358	mov w0,wzr
00a9c35c	sub x9,x9,x8
00a9c360	cmp x9,x1
00a9c364	b.cc 0x00a9c40c
00a9c368	ldr x0,[x21]
00a9c36c	mov x19,x2
00a9c370	cbz x0,0x00a9c3a8
00a9c374	ldr x9,[x0]
00a9c378	sub x8,x9,x8
00a9c37c	cmp x8,x20
00a9c380	b.cs 0x00a9c3a8
00a9c384	cmp x9,x20
00a9c388	csel x8,x20,x9,cc
00a9c38c	tbnz x8,#0x3f,0x00a9c41c
00a9c390	lsl x8,x8,#0x1
00a9c394	cmp x8,#0x100
00a9c398	mov w9,#0x100
00a9c39c	csel x1,x8,x9,hi
00a9c3a0	bl 0x00c37000
00a9c3a4	cbz x0,0x00a9c40c
00a9c3a8	cbz x19,0x00a9c408
00a9c3ac	ldr x8,[x21, #0x8]
00a9c3b0	cbz x8,0x00a9c3c8
00a9c3b4	ldrb w9,[x21, #0x30]
00a9c3b8	tbnz w9,#0x0,0x00a9c3dc
00a9c3bc	ldr x9,[x21, #0x10]
00a9c3c0	add x8,x8,x9
00a9c3c4	b 0x00a9c3ec
00a9c3c8	ldr x8,[x21]
00a9c3cc	cbz x8,0x00a9c3ec
00a9c3d0	ldr x8,[x8, #0x8]
00a9c3d4	cbnz x8,0x00a9c3b4
00a9c3d8	b 0x00a9c3ec
00a9c3dc	ldr x9,[x21, #0x20]
00a9c3e0	ldr x10,[x21, #0x10]
00a9c3e4	add x8,x8,x9
00a9c3e8	sub x8,x8,x10
00a9c3ec	mov w0,#0x1
00a9c3f0	str x8,[x19]
00a9c3f4	cbz x8,0x00a9c40c
00a9c3f8	ldrb w9,[x21, #0x30]
00a9c3fc	tbz w9,#0x0,0x00a9c40c
00a9c400	sub x8,x8,x20
00a9c404	str x8,[x19]
00a9c408	mov w0,#0x1
00a9c40c	ldp x29,x30,[sp, #0x20]
00a9c410	ldp x20,x19,[sp, #0x10]
00a9c414	ldr x21,[sp], #0x30
00a9c418	ret
00a9c41c	mov x1,#-0x1
00a9c420	bl 0x00c37000
00a9c424	cbnz x0,0x00a9c3a8
00a9c428	b 0x00a9c40c
