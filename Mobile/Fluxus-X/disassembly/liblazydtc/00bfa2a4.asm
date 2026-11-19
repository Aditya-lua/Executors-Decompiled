; FUN_00bfa2a4 @ 00bfa2a4
00bfa2a4	paciasp
00bfa2a8	sub sp,sp,#0x50
00bfa2ac	stp x29,x30,[sp, #0x20]
00bfa2b0	stp x22,x21,[sp, #0x30]
00bfa2b4	stp x20,x19,[sp, #0x40]
00bfa2b8	add x29,sp,#0x20
00bfa2bc	adrp x20,0xcb5000
00bfa2c0	mov x19,x1
00bfa2c4	mov x21,x0
00bfa2c8	ldr x20,[x20, #0xd40]
00bfa2cc	str x20,[sp, #0x8]
00bfa2d0	ldar x8,[x20]
00bfa2d4	cmn x8,#0x1
00bfa2d8	b.eq 0x00bfa304
00bfa2dc	add x8,sp,#0x8
00bfa2e0	sub x9,x29,#0x8
00bfa2e4	adrp x0,0xcb5000
00bfa2e8	stur x8,[x29, #-0x8]
00bfa2ec	nop
00bfa2f0	adr x2,0xc0bab0
00bfa2f4	str x9,[sp, #0x10]
00bfa2f8	add x1,sp,#0x10
00bfa2fc	ldr x0,[x0, #0xd40]
00bfa300	bl 0x00c305d0
00bfa304	ldp x8,x10,[x19, #0x10]
00bfa308	ldrsw x9,[x20, #0x8]
00bfa30c	sub x22,x9,#0x1
00bfa310	sub x9,x10,x8
00bfa314	cmp x22,x9, ASR #0x3
00bfa318	b.cs 0x00bfa3b8
00bfa31c	ldr x19,[x8, x22, LSL #0x3]
00bfa320	cbz x19,0x00bfa3b8
00bfa324	add x1,x19,#0x8
00bfa328	mov w0,#0x1
00bfa32c	bl 0x00c2bce0
00bfa330	mov x20,x21
00bfa334	ldp x8,x9,[x20, #0x10]!
00bfa338	sub x9,x9,x8
00bfa33c	asr x10,x9,#0x3
00bfa340	cmp x10,x22
00bfa344	b.hi 0x00bfa370
00bfa348	add x9,x22,#0x1
00bfa34c	subs x1,x9,x10
00bfa350	b.ls 0x00bfa364
00bfa354	mov x0,x20
00bfa358	bl 0x00c0b6e4
00bfa35c	ldr x8,[x20]
00bfa360	b 0x00bfa370
00bfa364	b.cs 0x00bfa370
00bfa368	add x9,x8,x9, LSL #0x3
00bfa36c	str x9,[x21, #0x18]
00bfa370	ldr x21,[x8, x22, LSL #0x3]
00bfa374	cbz x21,0x00bfa398
00bfa378	add x1,x21,#0x8
00bfa37c	mov x0,#-0x1
00bfa380	bl 0x00c2bd10
00bfa384	cbnz x0,0x00bfa398
00bfa388	ldr x8,[x21]
00bfa38c	mov x0,x21
00bfa390	ldr x8,[x8, #0x10]
00bfa394	blr x8
00bfa398	ldr x8,[x20]
00bfa39c	str x19,[x8, x22, LSL #0x3]
00bfa3a0	ldp x20,x19,[sp, #0x40]
00bfa3a4	ldp x22,x21,[sp, #0x30]
00bfa3a8	ldp x29,x30,[sp, #0x20]
00bfa3ac	add sp,sp,#0x50
00bfa3b0	autiasp
00bfa3b4	ret
00bfa3b8	bl 0x00bd8968
