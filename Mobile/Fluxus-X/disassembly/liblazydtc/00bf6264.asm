; FUN_00bf6264 @ 00bf6264
00bf6264	paciasp
00bf6268	sub sp,sp,#0x50
00bf626c	stp x29,x30,[sp, #0x20]
00bf6270	stp x22,x21,[sp, #0x30]
00bf6274	stp x20,x19,[sp, #0x40]
00bf6278	add x29,sp,#0x20
00bf627c	adrp x20,0xcb5000
00bf6280	mov x19,x1
00bf6284	mov x21,x0
00bf6288	ldr x20,[x20, #0xc80]
00bf628c	str x20,[sp, #0x8]
00bf6290	ldar x8,[x20]
00bf6294	cmn x8,#0x1
00bf6298	b.eq 0x00bf62c4
00bf629c	add x8,sp,#0x8
00bf62a0	sub x9,x29,#0x8
00bf62a4	adrp x0,0xcb5000
00bf62a8	stur x8,[x29, #-0x8]
00bf62ac	nop
00bf62b0	adr x2,0xc0bab0
00bf62b4	str x9,[sp, #0x10]
00bf62b8	add x1,sp,#0x10
00bf62bc	ldr x0,[x0, #0xc80]
00bf62c0	bl 0x00c305d0
00bf62c4	ldrsw x8,[x20, #0x8]
00bf62c8	add x1,x19,#0x8
00bf62cc	mov w0,#0x1
00bf62d0	sub x22,x8,#0x1
00bf62d4	bl 0x00c2bce0
00bf62d8	mov x20,x21
00bf62dc	ldp x8,x9,[x20, #0x10]!
00bf62e0	sub x9,x9,x8
00bf62e4	asr x10,x9,#0x3
00bf62e8	cmp x10,x22
00bf62ec	b.hi 0x00bf6318
00bf62f0	add x9,x22,#0x1
00bf62f4	subs x1,x9,x10
00bf62f8	b.ls 0x00bf630c
00bf62fc	mov x0,x20
00bf6300	bl 0x00c0b6e4
00bf6304	ldr x8,[x20]
00bf6308	b 0x00bf6318
00bf630c	b.cs 0x00bf6318
00bf6310	add x9,x8,x9, LSL #0x3
00bf6314	str x9,[x21, #0x18]
00bf6318	ldr x21,[x8, x22, LSL #0x3]
00bf631c	cbz x21,0x00bf6340
00bf6320	add x1,x21,#0x8
00bf6324	mov x0,#-0x1
00bf6328	bl 0x00c2bd10
00bf632c	cbnz x0,0x00bf6340
00bf6330	ldr x8,[x21]
00bf6334	mov x0,x21
00bf6338	ldr x8,[x8, #0x10]
00bf633c	blr x8
00bf6340	ldr x8,[x20]
00bf6344	str x19,[x8, x22, LSL #0x3]
00bf6348	ldp x20,x19,[sp, #0x40]
00bf634c	ldp x22,x21,[sp, #0x30]
00bf6350	ldp x29,x30,[sp, #0x20]
00bf6354	add sp,sp,#0x50
00bf6358	autiasp
00bf635c	ret
