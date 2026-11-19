; std::__ndk1::__check_grouping @ 00bef154
00bef154	bti c
00bef158	ldrb w9,[x0]
00bef15c	ldr x8,[x0, #0x8]
00bef160	sub x12,x2,x1
00bef164	lsr x10,x9,#0x1
00bef168	ands w11,w9,#0x1
00bef16c	csel x8,x10,x8,eq
00bef170	cmp x12,#0x5
00bef174	b.lt 0x00bef334
00bef178	cbz x8,0x00bef334
00bef17c	cmp x1,x2
00bef180	sub x8,x2,#0x4
00bef184	b.eq 0x00bef2a8
00bef188	cmp x1,x8
00bef18c	b.cs 0x00bef2a8
00bef190	sub x13,x2,#0x8
00bef194	add x11,x1,#0x4
00bef198	cmp x13,x11
00bef19c	csel x9,x13,x11,hi
00bef1a0	sub x9,x9,#0x4
00bef1a4	cmp x9,x1
00bef1a8	cinc x10,x1,ne
00bef1ac	cmp x9,x1
00bef1b0	sub x10,x9,x10
00bef1b4	mov x9,x8
00bef1b8	lsr x10,x10,#0x3
00bef1bc	cinc x12,x10,ne
00bef1c0	mov x10,x1
00bef1c4	cmp x12,#0x13
00bef1c8	b.cc 0x00bef280
00bef1cc	cmp x13,x11
00bef1d0	csel x9,x13,x11,hi
00bef1d4	sub x9,x9,#0x4
00bef1d8	cmp x9,x1
00bef1dc	cinc x10,x1,ne
00bef1e0	cmp x9,x1
00bef1e4	sub x10,x9,x10
00bef1e8	lsr x10,x10,#0x3
00bef1ec	cinc x9,x10,ne
00bef1f0	cmp x1,x2
00bef1f4	b.cs 0x00bef218
00bef1f8	lsl x9,x9,#0x2
00bef1fc	sub x10,x2,x9
00bef200	add x9,x11,x9
00bef204	sub x10,x10,#0x4
00bef208	cmp x10,x9
00bef20c	mov x9,x8
00bef210	mov x10,x1
00bef214	b.cc 0x00bef280
00bef218	add x11,x12,#0x1
00bef21c	add x13,x1,#0x10
00bef220	sub x14,x2,#0x10
00bef224	and x12,x11,#0x7ffffffffffffff8
00bef228	lsl x10,x12,#0x2
00bef22c	mov x15,x12
00bef230	sub x9,x8,x10
00bef234	add x10,x1,x10
00bef238	ldp q1,q0,[x14, #-0x10]
00bef23c	sub x15,x15,#0x8
00bef240	ldp q2,q3,[x13, #-0x10]
00bef244	rev64 v0.4S,v0.4S
00bef248	rev64 v1.4S,v1.4S
00bef24c	rev64 v2.4S,v2.4S
00bef250	rev64 v3.4S,v3.4S
00bef254	ext v0.16B,v0.16B,v0.16B,0x8
00bef258	ext v1.16B,v1.16B,v1.16B,0x8
00bef25c	ext v2.16B,v2.16B,v2.16B,0x8
00bef260	ext v3.16B,v3.16B,v3.16B,0x8
00bef264	stp q0,q1,[x13, #-0x10]
00bef268	add x13,x13,#0x20
00bef26c	stp q3,q2,[x14, #-0x10]
00bef270	sub x14,x14,#0x20
00bef274	cbnz x15,0x00bef238
00bef278	cmp x11,x12
00bef27c	b.eq 0x00bef2a0
00bef280	add x10,x10,#0x4
00bef284	ldr w11,[x9]
00bef288	ldur w12,[x10, #-0x4]
00bef28c	stur w11,[x10, #-0x4]
00bef290	str w12,[x9], #-0x4
00bef294	cmp x10,x9
00bef298	add x10,x10,#0x4
00bef29c	b.cc 0x00bef284
00bef2a0	ldrb w9,[x0]
00bef2a4	and w11,w9,#0x1
00bef2a8	ldr x10,[x0, #0x10]
00bef2ac	cmp w11,#0x0
00bef2b0	csinc x10,x10,x0,ne
00bef2b4	cmp x1,x8
00bef2b8	b.cs 0x00bef30c
00bef2bc	lsr w9,w9,#0x1
00bef2c0	ldr x12,[x0, #0x8]
00bef2c4	cmp w11,#0x0
00bef2c8	csel x9,x9,x12,eq
00bef2cc	add x9,x10,x9
00bef2d0	b 0x00bef2ec
00bef2d4	sub x11,x9,x10
00bef2d8	add x1,x1,#0x4
00bef2dc	cmp x11,#0x1
00bef2e0	cinc x10,x10,gt
00bef2e4	cmp x1,x8
00bef2e8	b.cs 0x00bef30c
00bef2ec	ldrb w11,[x10]
00bef2f0	cbz w11,0x00bef2d4
00bef2f4	cmp w11,#0xff
00bef2f8	b.eq 0x00bef2d4
00bef2fc	ldr w12,[x1]
00bef300	cmp w12,w11
00bef304	b.eq 0x00bef2d4
00bef308	b 0x00bef32c
00bef30c	ldrb w9,[x10]
00bef310	cbz w9,0x00bef334
00bef314	cmp w9,#0xff
00bef318	b.eq 0x00bef334
00bef31c	ldr w8,[x8]
00bef320	sub w8,w8,#0x1
00bef324	cmp w8,w9
00bef328	b.cc 0x00bef334
00bef32c	mov w8,#0x4
00bef330	str w8,[x3]
00bef334	ret
