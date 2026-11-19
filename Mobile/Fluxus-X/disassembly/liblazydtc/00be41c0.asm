; std::__ndk1::num_put<char,std::__ndk1::ostreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_put @ 00be41c0
00be41c0	bti c
00be41c4	adrp x5,0x2b5000
00be41c8	add x5,x5,#0x54
00be41cc	b 0x00be41d0
00be41d0	paciasp
00be41d4	sub sp,sp,#0xa0
00be41d8	stp x29,x30,[sp, #0x60]
00be41dc	str x23,[sp, #0x70]
00be41e0	stp x22,x21,[sp, #0x80]
00be41e4	stp x20,x19,[sp, #0x90]
00be41e8	add x29,sp,#0x60
00be41ec	ldr w9,[x2, #0x8]
00be41f0	mov w8,#0x25
00be41f4	add x10,x29,#0x18
00be41f8	mov x22,x4
00be41fc	mov w19,w3
00be4200	mov x20,x2
00be4204	mov x21,x1
00be4208	str x8,[x29, #0x18]
00be420c	orr x8,x10,#0x1
00be4210	tbz w9,#0xb,0x00be423c
00be4214	mov w10,#0x4a
00be4218	and w10,w9,w10
00be421c	cmp w10,#0x8
00be4220	b.eq 0x00be423c
00be4224	cmp w10,#0x40
00be4228	b.eq 0x00be423c
00be422c	add x8,x29,#0x18
00be4230	mov w10,#0x2b
00be4234	orr x8,x8,#0x2
00be4238	strb w10,[x29, #0x19]
00be423c	tbz w9,#0x9,0x00be4248
00be4240	mov w10,#0x23
00be4244	strb w10,[x8], #0x1
00be4248	ldrb w10,[x5]
00be424c	cbz w10,0x00be4260
00be4250	add x11,x5,#0x1
00be4254	strb w10,[x8], #0x1
00be4258	ldrb w10,[x11], #0x1
00be425c	cbnz w10,0x00be4254
00be4260	mov w10,#0x4a
00be4264	and w10,w9,w10
00be4268	cmp w10,#0x40
00be426c	b.eq 0x00be428c
00be4270	cmp w10,#0x8
00be4274	b.ne 0x00be4294
00be4278	tst w9,#0x4000
00be427c	mov w9,#0x58
00be4280	mov w10,#0x78
00be4284	csel w9,w10,w9,eq
00be4288	b 0x00be4298
00be428c	mov w9,#0x6f
00be4290	b 0x00be4298
00be4294	mov w9,#0x64
00be4298	strb w9,[x8]
00be429c	adrp x8,0xd27000
00be42a0	add x8,x8,#0xf8
00be42a4	ldarb w8,[x8]
00be42a8	adrp x23,0xd27000
00be42ac	tbz w8,#0x0,0x00be43a8
00be42b0	ldr x2,[x23, #0xf0]
00be42b4	sub x0,x29,#0x18
00be42b8	add x3,x29,#0x18
00be42bc	mov w1,#0x18
00be42c0	mov x4,x22
00be42c4	sub x22,x29,#0x18
00be42c8	bl 0x00c0cd14
00be42cc	ldr w8,[x20, #0x8]
00be42d0	mov w9,#0xb0
00be42d4	add x22,x22,w0, SXTW 
00be42d8	and w8,w8,w9
00be42dc	mov x23,x22
00be42e0	cmp w8,#0x20
00be42e4	b.eq 0x00be4340
00be42e8	cmp w8,#0x10
00be42ec	b.ne 0x00be433c
00be42f0	ldurb w8,[x29, #-0x18]
00be42f4	cmp w8,#0x2d
00be42f8	b.eq 0x00be4304
00be42fc	cmp w8,#0x2b
00be4300	b.ne 0x00be4310
00be4304	sub x8,x29,#0x18
00be4308	orr x23,x8,#0x1
00be430c	b 0x00be4340
00be4310	cmp w0,#0x2
00be4314	b.lt 0x00be433c
00be4318	cmp w8,#0x30
00be431c	b.ne 0x00be433c
00be4320	ldurb w8,[x29, #-0x17]
00be4324	orr w8,w8,#0x20
00be4328	cmp w8,#0x78
00be432c	b.ne 0x00be433c
00be4330	sub x8,x29,#0x18
00be4334	orr x23,x8,#0x2
00be4338	b 0x00be4340
00be433c	sub x23,x29,#0x18
00be4340	mov x8,sp
00be4344	mov x0,x20
00be4348	bl 0x00c30070
00be434c	sub x0,x29,#0x18
00be4350	add x3,sp,#0x1b
00be4354	add x4,sp,#0x10
00be4358	add x5,sp,#0x8
00be435c	mov x6,sp
00be4360	mov x1,x23
00be4364	mov x2,x22
00be4368	bl 0x00c44150
00be436c	mov x0,sp
00be4370	bl 0x00c30090
00be4374	ldp x3,x2,[sp, #0x8]
00be4378	add x1,sp,#0x1b
00be437c	mov x0,x21
00be4380	mov x4,x20
00be4384	mov w5,w19
00be4388	bl 0x00be5420
00be438c	ldp x20,x19,[sp, #0x90]
00be4390	ldr x23,[sp, #0x70]
00be4394	ldp x22,x21,[sp, #0x80]
00be4398	ldp x29,x30,[sp, #0x60]
00be439c	add sp,sp,#0xa0
00be43a0	autiasp
00be43a4	ret
00be43a8	adrp x0,0xd27000
00be43ac	add x0,x0,#0xf8
00be43b0	bl 0x00c2fe90
00be43b4	cbz w0,0x00be42b0
00be43b8	adrp x1,0x2c6000
00be43bc	add x1,x1,#0xbfc
00be43c0	mov w0,#0x1fbf
00be43c4	mov x2,xzr
00be43c8	bl 0x00c43890
00be43cc	str x0,[x23, #0xf0]
00be43d0	adrp x0,0xd27000
00be43d4	add x0,x0,#0xf8
00be43d8	bl 0x00c2fea0
00be43dc	b 0x00be42b0
