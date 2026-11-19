; FUN_00b4f2ec @ 00b4f2ec
00b4f2ec	stp x20,x19,[sp, #-0x20]!
00b4f2f0	stp x29,x30,[sp, #0x10]
00b4f2f4	add x29,sp,#0x10
00b4f2f8	cbz x0,0x00b4f3e4
00b4f2fc	mov x20,x0
00b4f300	ldr x0,[x0]
00b4f304	mov x1,xzr
00b4f308	bl 0x00c3a840
00b4f30c	mov x19,x0
00b4f310	cbz x0,0x00b4f3e8
00b4f314	ldr x8,[x20, #0x80]
00b4f318	cbz x8,0x00b4f360
00b4f31c	ldr x0,[x20, #0x10]
00b4f320	cbz x0,0x00b4f338
00b4f324	bl 0x00c3abf0
00b4f328	tbnz w0,#0x1f,0x00b4f3dc
00b4f32c	mov w1,w0
00b4f330	ldr x0,[x20, #0x80]
00b4f334	bl 0x00c3aaf0
00b4f338	ldr x0,[x20, #0x18]
00b4f33c	cbz x0,0x00b4f36c
00b4f340	bl 0x00c3ad70
00b4f344	tbnz w0,#0x1f,0x00b4f3dc
00b4f348	mov w1,w0
00b4f34c	ldr x0,[x20, #0x80]
00b4f350	bl 0x00c3ab10
00b4f354	ldr x1,[x20, #0x80]
00b4f358	cbnz x1,0x00b4f374
00b4f35c	b 0x00b4f388
00b4f360	mov x0,x20
00b4f364	bl 0x00b4f5a8
00b4f368	cbz w0,0x00b4f3dc
00b4f36c	ldr x1,[x20, #0x80]
00b4f370	cbz x1,0x00b4f388
00b4f374	mov x0,x19
00b4f378	bl 0x00c3a880
00b4f37c	cmp w0,#0x0
00b4f380	cset w8,gt
00b4f384	b 0x00b4f3b8
00b4f388	bl 0x00c342a0
00b4f38c	adrp x0,0x2c6000
00b4f390	adrp x2,0x2ba000
00b4f394	add x0,x0,#0x737
00b4f398	add x2,x2,#0xb33
00b4f39c	mov w1,#0x4d1
00b4f3a0	bl 0x00c342b0
00b4f3a4	mov w0,#0x39
00b4f3a8	mov w1,#0xb1
00b4f3ac	mov x2,xzr
00b4f3b0	bl 0x00c342c0
00b4f3b4	mov w8,wzr
00b4f3b8	ldrb w9,[x20, #0x78]
00b4f3bc	tst w9,#0x3
00b4f3c0	b.eq 0x00b4f3d8
00b4f3c4	cbz w8,0x00b4f3dc
00b4f3c8	mov x0,x19
00b4f3cc	bl 0x00c3af80
00b4f3d0	cmp w0,#0x0
00b4f3d4	cset w8,ne
00b4f3d8	cbnz w8,0x00b4f3e8
00b4f3dc	mov x0,x19
00b4f3e0	bl 0x00c3a7c0
00b4f3e4	mov x19,xzr
00b4f3e8	ldp x29,x30,[sp, #0x10]
00b4f3ec	mov x0,x19
00b4f3f0	ldp x20,x19,[sp], #0x20
00b4f3f4	ret
