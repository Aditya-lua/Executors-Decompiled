; FUN_00bd6290 @ 00bd6290
00bd6290	paciasp
00bd6294	sub sp,sp,#0x60
00bd6298	stp x29,x30,[sp, #0x20]
00bd629c	stp x24,x23,[sp, #0x30]
00bd62a0	stp x22,x21,[sp, #0x40]
00bd62a4	stp x20,x19,[sp, #0x50]
00bd62a8	add x29,sp,#0x20
00bd62ac	mov w20,w1
00bd62b0	mov x19,x0
00bd62b4	add x0,sp,#0x8
00bd62b8	mov x1,x19
00bd62bc	bl 0x00c44040
00bd62c0	ldrb w8,[sp, #0x8]
00bd62c4	cmp w8,#0x1
00bd62c8	b.ne 0x00bd6398
00bd62cc	ldr x8,[x19]
00bd62d0	ldur x9,[x8, #-0x18]
00bd62d4	sub x8,x29,#0x8
00bd62d8	add x0,x19,x9
00bd62dc	bl 0x00c30070
00bd62e0	adrp x1,0xcb5000
00bd62e4	sub x0,x29,#0x8
00bd62e8	ldr x1,[x1, #0xbb0]
00bd62ec	bl 0x00c30080
00bd62f0	mov x21,x0
00bd62f4	sub x0,x29,#0x8
00bd62f8	bl 0x00c30090
00bd62fc	ldr x8,[x19]
00bd6300	ldur x8,[x8, #-0x18]
00bd6304	add x2,x19,x8
00bd6308	ldr w3,[x2, #0x90]
00bd630c	ldr x22,[x2, #0x28]
00bd6310	cmn w3,#0x1
00bd6314	b.ne 0x00bd6360
00bd6318	sub x8,x29,#0x8
00bd631c	mov x0,x2
00bd6320	mov x24,x2
00bd6324	bl 0x00c30070
00bd6328	adrp x1,0xcb5000
00bd632c	sub x0,x29,#0x8
00bd6330	ldr x1,[x1, #0xb98]
00bd6334	bl 0x00c30080
00bd6338	ldr x8,[x0]
00bd633c	ldr x8,[x8, #0x58]
00bd6340	mov w1,#0x20
00bd6344	blr x8
00bd6348	mov w23,w0
00bd634c	sub x0,x29,#0x8
00bd6350	bl 0x00c30090
00bd6354	mov x2,x24
00bd6358	mov w3,w23
00bd635c	str w23,[x24, #0x90]
00bd6360	ldr x8,[x21]
00bd6364	mov w4,w20
00bd6368	ldr x8,[x8, #0x30]
00bd636c	mov x0,x21
00bd6370	mov x1,x22
00bd6374	blr x8
00bd6378	cbnz x0,0x00bd6398
00bd637c	ldr x8,[x19]
00bd6380	mov w9,#0x5
00bd6384	ldur x8,[x8, #-0x18]
00bd6388	add x0,x19,x8
00bd638c	ldr w8,[x0, #0x20]
00bd6390	orr w1,w8,w9
00bd6394	bl 0x00c30130
00bd6398	add x0,sp,#0x8
00bd639c	bl 0x00c44050
00bd63a0	mov x0,x19
00bd63a4	ldp x20,x19,[sp, #0x50]
00bd63a8	ldp x22,x21,[sp, #0x40]
00bd63ac	ldp x24,x23,[sp, #0x30]
00bd63b0	ldp x29,x30,[sp, #0x20]
00bd63b4	add sp,sp,#0x60
00bd63b8	autiasp
00bd63bc	ret
