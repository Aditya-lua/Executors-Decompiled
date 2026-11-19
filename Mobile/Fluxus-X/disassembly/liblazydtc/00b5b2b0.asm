; FUN_00b5b2b0 @ 00b5b2b0
00b5b2b0	stp x22,x21,[sp, #-0x30]!
00b5b2b4	stp x20,x19,[sp, #0x10]
00b5b2b8	stp x29,x30,[sp, #0x20]
00b5b2bc	ldr w8,[x0, #0x8]
00b5b2c0	add x29,sp,#0x20
00b5b2c4	cmp w8,#0x1
00b5b2c8	b.ne 0x00b5b32c
00b5b2cc	mov x19,x1
00b5b2d0	mov w1,#0x1
00b5b2d4	mov w0,w3
00b5b2d8	mov x3,x2
00b5b2dc	bl 0x00c3f910
00b5b2e0	cbz x0,0x00b5b364
00b5b2e4	mov x20,x0
00b5b2e8	bl 0x00c3f8b0
00b5b2ec	mov x21,x0
00b5b2f0	cbz x0,0x00b5b318
00b5b2f4	mov x0,x20
00b5b2f8	bl 0x00c3f950
00b5b2fc	mov x22,x0
00b5b300	mov x0,x20
00b5b304	bl 0x00c3f900
00b5b308	mov x2,x0
00b5b30c	mov x0,x19
00b5b310	mov x1,x22
00b5b314	bl 0x00c2ffd0
00b5b318	cmp x21,#0x0
00b5b31c	mov x0,x20
00b5b320	cset w19,ne
00b5b324	bl 0x00c3f8f0
00b5b328	b 0x00b5b398
00b5b32c	mov x20,x0
00b5b330	bl 0x00c342a0
00b5b334	adrp x0,0x2ce000
00b5b338	adrp x2,0x2b4000
00b5b33c	add x0,x0,#0x930
00b5b340	add x2,x2,#0xefa
00b5b344	mov w1,#0x67
00b5b348	bl 0x00c342b0
00b5b34c	ldr w8,[x20, #0x8]
00b5b350	mov w0,#0x39
00b5b354	cmp w8,#0x2
00b5b358	orr w8,wzr,#0xc0
00b5b35c	cinc w1,w8,ne
00b5b360	b 0x00b5b38c
00b5b364	bl 0x00c342a0
00b5b368	adrp x0,0x2ce000
00b5b36c	adrp x2,0x2b4000
00b5b370	add x0,x0,#0x930
00b5b374	add x2,x2,#0xefa
00b5b378	mov w1,#0x6d
00b5b37c	bl 0x00c342b0
00b5b380	mov w1,#0x100
00b5b384	mov w0,#0x39
00b5b388	movk w1,#0xc, LSL #16
00b5b38c	mov x2,xzr
00b5b390	bl 0x00c342c0
00b5b394	mov w19,wzr
00b5b398	mov w0,w19
00b5b39c	ldp x29,x30,[sp, #0x20]
00b5b3a0	ldp x20,x19,[sp, #0x10]
00b5b3a4	ldp x22,x21,[sp], #0x30
00b5b3a8	ret
