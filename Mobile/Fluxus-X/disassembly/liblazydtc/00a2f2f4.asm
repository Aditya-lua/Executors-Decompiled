; EC_KEY_set_public_key_affine_coordinates @ 00a2f2f4
00a2f2f4	str x25,[sp, #-0x50]!
00a2f2f8	stp x24,x23,[sp, #0x10]
00a2f2fc	stp x22,x21,[sp, #0x20]
00a2f300	stp x20,x19,[sp, #0x30]
00a2f304	stp x29,x30,[sp, #0x40]
00a2f308	add x29,sp,#0x40
00a2f30c	cbz x0,0x00a2f410
00a2f310	mov x22,x2
00a2f314	cbz x2,0x00a2f410
00a2f318	mov x23,x1
00a2f31c	cbz x1,0x00a2f410
00a2f320	ldr x8,[x0, #0x18]
00a2f324	mov x21,x0
00a2f328	cbz x8,0x00a2f410
00a2f32c	ldr x0,[x21, #0x58]
00a2f330	bl 0x00c38a60
00a2f334	cbz x0,0x00a2f440
00a2f338	mov x19,x0
00a2f33c	bl 0x00c38a90
00a2f340	ldr x0,[x21, #0x18]
00a2f344	bl 0x00c3ab70
00a2f348	mov x20,x0
00a2f34c	cbz x0,0x00a2f3f0
00a2f350	mov x0,x19
00a2f354	bl 0x00c38a40
00a2f358	mov x25,x0
00a2f35c	mov x0,x19
00a2f360	bl 0x00c38a40
00a2f364	cbz x0,0x00a2f3f0
00a2f368	mov x24,x0
00a2f36c	ldr x0,[x21, #0x18]
00a2f370	mov x1,x20
00a2f374	mov x2,x23
00a2f378	mov x3,x22
00a2f37c	mov x4,x19
00a2f380	bl 0x00c3ae80
00a2f384	cbz w0,0x00a2f3f0
00a2f388	ldr x0,[x21, #0x18]
00a2f38c	mov x1,x20
00a2f390	mov x2,x25
00a2f394	mov x3,x24
00a2f398	mov x4,x19
00a2f39c	bl 0x00c3ae70
00a2f3a0	cbz w0,0x00a2f3f0
00a2f3a4	mov x0,x23
00a2f3a8	mov x1,x25
00a2f3ac	bl 0x00c38cc0
00a2f3b0	cbnz w0,0x00a2f3c4
00a2f3b4	mov x0,x22
00a2f3b8	mov x1,x24
00a2f3bc	bl 0x00c38cc0
00a2f3c0	cbz w0,0x00a2f460
00a2f3c4	bl 0x00c342a0
00a2f3c8	adrp x0,0x2b4000
00a2f3cc	adrp x2,0x2b7000
00a2f3d0	add x0,x0,#0x15e
00a2f3d4	add x2,x2,#0xa8f
00a2f3d8	mov w1,#0x27b
00a2f3dc	bl 0x00c342b0
00a2f3e0	mov w0,#0x10
00a2f3e4	mov w1,#0x92
00a2f3e8	mov x2,xzr
00a2f3ec	bl 0x00c342c0
00a2f3f0	mov w21,wzr
00a2f3f4	mov x0,x19
00a2f3f8	bl 0x00c38a20
00a2f3fc	mov x0,x19
00a2f400	bl 0x00c38a30
00a2f404	mov x0,x20
00a2f408	bl 0x00c3ab60
00a2f40c	b 0x00a2f444
00a2f410	bl 0x00c342a0
00a2f414	adrp x0,0x2b4000
00a2f418	adrp x2,0x2b7000
00a2f41c	add x0,x0,#0x15e
00a2f420	add x2,x2,#0xa8f
00a2f424	mov w1,#0x25f
00a2f428	bl 0x00c342b0
00a2f42c	mov w1,#0x102
00a2f430	mov w0,#0x10
00a2f434	movk w1,#0xc, LSL #16
00a2f438	mov x2,xzr
00a2f43c	bl 0x00c342c0
00a2f440	mov w21,wzr
00a2f444	mov w0,w21
00a2f448	ldp x29,x30,[sp, #0x40]
00a2f44c	ldp x20,x19,[sp, #0x30]
00a2f450	ldp x22,x21,[sp, #0x20]
00a2f454	ldp x24,x23,[sp, #0x10]
00a2f458	ldr x25,[sp], #0x50
00a2f45c	ret
00a2f460	ldr x8,[x21]
00a2f464	ldr x8,[x8, #0x38]
00a2f468	cbz x8,0x00a2f47c
00a2f46c	mov x0,x21
00a2f470	mov x1,x20
00a2f474	blr x8
00a2f478	cbz w0,0x00a2f3f0
00a2f47c	ldr x0,[x21, #0x20]
00a2f480	bl 0x00c3ab60
00a2f484	ldr x1,[x21, #0x18]
00a2f488	mov x0,x20
00a2f48c	bl 0x00c3afb0
00a2f490	ldr x8,[x21, #0x68]
00a2f494	str x0,[x21, #0x20]
00a2f498	add x8,x8,#0x1
00a2f49c	str x8,[x21, #0x68]
00a2f4a0	cbz x0,0x00a2f3f0
00a2f4a4	mov x0,x21
00a2f4a8	bl 0x00a2ecb8
00a2f4ac	cmp w0,#0x0
00a2f4b0	cset w21,ne
00a2f4b4	b 0x00a2f3f4
