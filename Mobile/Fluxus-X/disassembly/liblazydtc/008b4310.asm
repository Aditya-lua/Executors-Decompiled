; FUN_008b4310 @ 008b4310
008b4310	stp x29,x30,[sp, #-0x30]!
008b4314	str x21,[sp, #0x10]
008b4318	stp x20,x19,[sp, #0x20]
008b431c	mov x29,sp
008b4320	ldrh w8,[x0, #0x28]
008b4324	mov x19,x0
008b4328	add w8,w8,#0x1
008b432c	and w9,w8,#0xffff
008b4330	strh w8,[x0, #0x28]
008b4334	cmp w9,#0xc8
008b4338	b.cc 0x008b434c
008b433c	b.eq 0x008b4438
008b4340	and w8,w8,#0xffff
008b4344	cmp w8,#0xe1
008b4348	b.cs 0x008b4448
008b434c	ldr x8,[x19, #0x50]
008b4350	ldrh w9,[x19, #0x2a]
008b4354	mov x0,x19
008b4358	ldr w10,[x8, #0x2c]
008b435c	add w9,w9,#0x1
008b4360	strh w9,[x19, #0x2a]
008b4364	orr w9,w10,#0x8
008b4368	str w9,[x8, #0x2c]
008b436c	bl 0x008c8994
008b4370	cbnz w0,0x008b43d4
008b4374	ldr x8,[x19, #0x50]
008b4378	ldrb w21,[x19, #0x6]
008b437c	mov w10,#0x1
008b4380	strb w10,[x19, #0x6]
008b4384	ldr w9,[x8, #0x2c]
008b4388	orr w9,w9,#0x1
008b438c	str w9,[x8, #0x2c]
008b4390	ldrb w9,[x19, #0x2]
008b4394	tbz w9,#0x2,0x008b43ac
008b4398	add x2,x19,#0x38
008b439c	mov x0,x19
008b43a0	mov x1,x19
008b43a4	bl 0x008b63a4
008b43a8	ldr x8,[x19, #0x50]
008b43ac	ldr x9,[x19, #0x20]
008b43b0	mov x0,x19
008b43b4	sub x8,x8,x9
008b43b8	sub x20,x8,#0x30
008b43bc	bl 0x008be71c
008b43c0	mov x0,x19
008b43c4	mov x1,x20
008b43c8	bl 0x008b4b80
008b43cc	tbnz w21,#0x0,0x008b43d4
008b43d0	strb wzr,[x19, #0x6]
008b43d4	ldrb w20,[x19, #0x3]
008b43d8	cbnz w20,0x008b4420
008b43dc	ldr x10,[x19, #0x60]
008b43e0	ldr x8,[x19, #0x50]
008b43e4	ldrh w9,[x19, #0x2a]
008b43e8	ldrh w11,[x19, #0x28]
008b43ec	ldp x10,x13,[x10, #0x8]
008b43f0	sub w9,w9,#0x1
008b43f4	ldr w12,[x8, #0x2c]
008b43f8	strh w9,[x19, #0x2a]
008b43fc	sub w11,w11,#0x1
008b4400	strh w11,[x19, #0x28]
008b4404	and w9,w12,#0xfffffff7
008b4408	cmp x13,x10
008b440c	str w9,[x8, #0x2c]
008b4410	b.cc 0x008b4420
008b4414	mov x0,x19
008b4418	mov w1,#0x1
008b441c	bl 0x008b52c4
008b4420	cmp w20,#0x0
008b4424	cset w0,ne
008b4428	ldp x20,x19,[sp, #0x20]
008b442c	ldr x21,[sp, #0x10]
008b4430	ldp x29,x30,[sp], #0x30
008b4434	ret
008b4438	adrp x1,0x2a7000
008b443c	add x1,x1,#0x1c7
008b4440	mov x0,x19
008b4444	bl 0x008b39cc
008b4448	mov x0,x19
008b444c	mov w1,#0x5
008b4450	bl 0x008b3f9c
