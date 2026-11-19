; FUN_00bd42d4 @ 00bd42d4
00bd42d4	paciasp
00bd42d8	sub sp,sp,#0x30
00bd42dc	stp x29,x30,[sp, #0x10]
00bd42e0	stp x20,x19,[sp, #0x20]
00bd42e4	add x29,sp,#0x10
00bd42e8	mov x19,x0
00bd42ec	mov x20,x1
00bd42f0	add x0,sp,#0x8
00bd42f4	mov x1,x19
00bd42f8	mov w2,wzr
00bd42fc	stur wzr,[x29, #-0x4]
00bd4300	bl 0x00c44060
00bd4304	ldrb w8,[sp, #0x8]
00bd4308	cmp w8,#0x1
00bd430c	b.ne 0x00bd4380
00bd4310	ldr x8,[x19]
00bd4314	ldur x9,[x8, #-0x18]
00bd4318	mov x8,sp
00bd431c	add x0,x19,x9
00bd4320	bl 0x00c30070
00bd4324	adrp x1,0xcb5000
00bd4328	mov x0,sp
00bd432c	ldr x1,[x1, #0xba0]
00bd4330	bl 0x00c30080
00bd4334	ldr x8,[x19]
00bd4338	ldr x9,[x0]
00bd433c	ldur x8,[x8, #-0x18]
00bd4340	add x3,x19,x8
00bd4344	ldr x8,[x9, #0x68]
00bd4348	ldr x1,[x3, #0x28]
00bd434c	sub x4,x29,#0x4
00bd4350	mov x2,xzr
00bd4354	mov x5,x20
00bd4358	blr x8
00bd435c	mov x0,sp
00bd4360	bl 0x00c30090
00bd4364	ldr x8,[x19]
00bd4368	ldur x8,[x8, #-0x18]
00bd436c	add x0,x19,x8
00bd4370	ldur w8,[x29, #-0x4]
00bd4374	ldr w9,[x0, #0x20]
00bd4378	orr w1,w9,w8
00bd437c	bl 0x00c30130
00bd4380	mov x0,x19
00bd4384	ldp x20,x19,[sp, #0x20]
00bd4388	ldp x29,x30,[sp, #0x10]
00bd438c	add sp,sp,#0x30
00bd4390	autiasp
00bd4394	ret
