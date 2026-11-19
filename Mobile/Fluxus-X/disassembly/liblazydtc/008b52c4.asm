; FUN_008b52c4 @ 008b52c4
008b52c4	sub sp,sp,#0x50
008b52c8	stp x29,x30,[sp, #0x10]
008b52cc	stp x24,x23,[sp, #0x20]
008b52d0	stp x22,x21,[sp, #0x30]
008b52d4	stp x20,x19,[sp, #0x40]
008b52d8	add x29,sp,#0x10
008b52dc	ldr x22,[x0, #0x60]
008b52e0	ldrb w8,[x22]
008b52e4	cbz w8,0x008b52f0
008b52e8	mov x0,xzr
008b52ec	b 0x008b54e4
008b52f0	ldp w8,w9,[x22, #0x1c]
008b52f4	ldp x23,x20,[x22, #0x8]
008b52f8	mov x19,x0
008b52fc	mul w8,w9,w8
008b5300	mov w9,#0x851f
008b5304	movk w9,#0x51eb, LSL #16
008b5308	smull x8,w8,w9
008b530c	lsr x9,x8,#0x20
008b5310	lsr x10,x8,#0x3f
008b5314	ldr x8,[x22, #0x688]
008b5318	add w21,w10,w9, ASR #0x5
008b531c	cbnz x8,0x008b54fc
008b5320	ldrb w8,[x22, #0x1]
008b5324	sxtw x21,w21
008b5328	cbz w8,0x008b53a4
008b532c	sub x23,x20,x23
008b5330	tbz w1,#0x0,0x008b5360
008b5334	ldrsw x8,[x22, #0x20]
008b5338	mov x9,#0xf5c3
008b533c	movk x9,#0x5c28, LSL #16
008b5340	mul x8,x23,x8
008b5344	movk x9,#0xc28f, LSL #32
008b5348	movk x9,#0x28f5, LSL #48
008b534c	lsr x8,x8,#0x2
008b5350	umulh x8,x8,x9
008b5354	lsr x8,x8,#0x2
008b5358	cmp x8,x21
008b535c	csel x21,x8,x21,hi
008b5360	ldrb w20,[x22, #0x1]
008b5364	mov x0,x19
008b5368	mov x1,x21
008b536c	bl 0x008b552c
008b5370	mov w8,#0x64
008b5374	ldrsw x9,[x22, #0x20]
008b5378	mul x8,x0,x8
008b537c	udiv x0,x8,x9
008b5380	ldrb w9,[x22, #0x1]
008b5384	ldr x8,[x22, #0x10]
008b5388	cbz w9,0x008b53c0
008b538c	add x9,x8,x0
008b5390	subs x8,x9,x23
008b5394	str x9,[x22, #0x8]
008b5398	b.cc 0x008b54dc
008b539c	str x8,[x22, #0x8]
008b53a0	b 0x008b54dc
008b53a4	mov w24,w1
008b53a8	bl 0x008b97ec
008b53ac	mov w1,w24
008b53b0	str d0,[x22, #0x5570]
008b53b4	sub x23,x20,x23
008b53b8	tbnz w1,#0x0,0x008b5334
008b53bc	b 0x008b5360
008b53c0	mov x10,#0xf5c3
008b53c4	lsr x9,x8,#0x2
008b53c8	ldr d0,[x22, #0x5578]
008b53cc	movk x10,#0x5c28, LSL #16
008b53d0	ldr d1,[x22, #0x5580]
008b53d4	adrp x11,0x29b000
008b53d8	movk x10,#0xc28f, LSL #32
008b53dc	ldr d2,[x11, #0xc90]
008b53e0	mov x21,x0
008b53e4	movk x10,#0x28f5, LSL #48
008b53e8	fsub d1,d0,d1
008b53ec	umulh x9,x9,x10
008b53f0	ldrsw x10,[x22, #0x18]
008b53f4	fcmp d1,d2
008b53f8	lsr x9,x9,#0x2
008b53fc	mul x9,x9,x10
008b5400	mov x10,x9
008b5404	b.mi 0x008b54c0
008b5408	adrp x10,0xd1f000
008b540c	ldr x11,[x22, #0x5558]
008b5410	ldr x12,[x22, #0x5560]
008b5414	ldrb w10,[x10, #0x4d8]
008b5418	ldr x14,[x22, #0x5568]
008b541c	adrp x17,0x29b000
008b5420	subs x12,x11,x12
008b5424	ldr d5,[x17, #0xd50]
008b5428	ldr d6,[x22, #0x5570]
008b542c	csel x13,xzr,x12,cc
008b5430	cmp w10,#0x0
008b5434	sub x11,x11,x14
008b5438	csel x10,x13,x12,ne
008b543c	mov w14,#0x54d0
008b5440	lsr x11,x11,#0xa
008b5444	ucvtf d2,x10
008b5448	add x10,x22,#0x5, LSL #12
008b544c	fsub d0,d0,d6
008b5450	ldr w12,[x10, #0x550]
008b5454	ldr w16,[x10, #0x554]
008b5458	and x13,x12,#0x1f
008b545c	add w12,w12,#0x1
008b5460	fdiv d1,d2,d1
008b5464	add x13,x22,x13, LSL #0x2
008b5468	scvtf d2,w11
008b546c	str w12,[x10, #0x550]
008b5470	ldr w15,[x13, x14#0x0]
008b5474	str w11,[x13, x14#0x0]
008b5478	sub w15,w11,w15
008b547c	add w15,w16,w15
008b5480	adrp x16,0x29a000
008b5484	scvtf d3,w15
008b5488	ldr d4,[x16, #0x210]
008b548c	str w15,[x10, #0x554]
008b5490	fmul d2,d2,d4
008b5494	fmul d3,d3,d5
008b5498	fadd d2,d2,d3
008b549c	fcvtzs x16,d2,#0xa
008b54a0	fmul d0,d0,d1
008b54a4	sub x16,x9,x16
008b54a8	fcvtzs x17,d0
008b54ac	sub x11,x16,x17
008b54b0	cmp x11,x9
008b54b4	csel x13,x11,x9,lt
008b54b8	cmp x11,x8
008b54bc	csel x10,x8,x13,lt
008b54c0	str x10,[x22, #0x8]
008b54c4	str x9,[x22, #0x5568]
008b54c8	bl 0x008b97ec
008b54cc	ldr x8,[x22, #0x10]
008b54d0	str d0,[x22, #0x5580]
008b54d4	mov x0,x21
008b54d8	str x8,[x22, #0x5560]
008b54dc	ldr x8,[x22, #0x688]
008b54e0	cbnz x8,0x008b5514
008b54e4	ldp x20,x19,[sp, #0x40]
008b54e8	ldp x22,x21,[sp, #0x30]
008b54ec	ldp x24,x23,[sp, #0x20]
008b54f0	ldp x29,x30,[sp, #0x10]
008b54f4	add sp,sp,#0x50
008b54f8	ret
008b54fc	mov x0,x19
008b5500	stur w1,[x29, #-0x4]
008b5504	mov w1,wzr
008b5508	blr x8
008b550c	ldur w1,[x29, #-0x4]
008b5510	b 0x008b5320
008b5514	mov x21,x0
008b5518	mov x0,x19
008b551c	mov w1,w20
008b5520	blr x8
008b5524	mov x0,x21
008b5528	b 0x008b54e4
