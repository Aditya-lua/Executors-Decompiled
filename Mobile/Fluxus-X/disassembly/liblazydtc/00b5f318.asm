; FUN_00b5f318 @ 00b5f318
00b5f318	cbz x0,0x00b5f37c
00b5f31c	stp x20,x19,[sp, #-0x20]!
00b5f320	stp x29,x30,[sp, #0x10]
00b5f324	mov x19,x0
00b5f328	ldr x0,[x0, #0x28]
00b5f32c	add x29,sp,#0x10
00b5f330	bl 0x00c31f90
00b5f334	ldr x0,[x19, #0x20]
00b5f338	bl 0x00c35800
00b5f33c	ldr x0,[x19, #0x70]
00b5f340	bl 0x00c35800
00b5f344	ldr x0,[x19, #0x8]
00b5f348	adrp x1,0x2a3000
00b5f34c	add x1,x1,#0x265
00b5f350	mov w2,#0x3d0
00b5f354	bl 0x00c32310
00b5f358	ldr x20,[x19, #0xb8]
00b5f35c	cbz x20,0x00b5f380
00b5f360	ldr x0,[x19, #0x10]
00b5f364	bl 0x00c3fab0
00b5f368	sxtw x1,w0
00b5f36c	mov x0,x20
00b5f370	bl 0x00c34750
00b5f374	ldr x0,[x19, #0xb8]
00b5f378	b 0x00b5f384
00b5f37c	ret
00b5f380	mov x0,xzr
00b5f384	adrp x20,0x2a3000
00b5f388	add x20,x20,#0x265
00b5f38c	mov w2,#0x1f7
00b5f390	mov x1,x20
00b5f394	bl 0x00c32310
00b5f398	ldr x0,[x19, #0x10]
00b5f39c	str xzr,[x19, #0xb8]
00b5f3a0	bl 0x00c326d0
00b5f3a4	ldp x29,x30,[sp, #0x10]
00b5f3a8	orr w1,wzr,#0xc0
00b5f3ac	mov w3,#0x3d4
00b5f3b0	mov x0,x19
00b5f3b4	mov x2,x20
00b5f3b8	ldp x20,x19,[sp], #0x20
00b5f3bc	b 0x00c345e0
