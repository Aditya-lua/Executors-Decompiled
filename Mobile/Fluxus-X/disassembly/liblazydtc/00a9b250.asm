; FUN_00a9b250 @ 00a9b250
00a9b250	stp x29,x30,[sp, #-0x10]!
00a9b254	mov x29,sp
00a9b258	tbnz w1,#0x1f,0x00a9b2d8
00a9b25c	adrp x8,0xd22000
00a9b260	add x8,x8,#0x108
00a9b264	ldr x9,[x8, #0x28]
00a9b268	cmp x9,w1, SXTW 
00a9b26c	b.le 0x00a9b2d8
00a9b270	ldp x9,x11,[x8, #0x10]
00a9b274	mov w10,w1
00a9b278	lsr x11,x11,x10
00a9b27c	sub x9,x0,x9
00a9b280	sub x12,x11,#0x1
00a9b284	tst x12,x9
00a9b288	b.ne 0x00a9b308
00a9b28c	mov w12,#0x1
00a9b290	lsl x10,x12,x10
00a9b294	udiv x9,x9,x11
00a9b298	adds x10,x9,x10
00a9b29c	b.eq 0x00a9b2f0
00a9b2a0	ldr x8,[x8, #0x48]
00a9b2a4	cmp x10,x8
00a9b2a8	b.cs 0x00a9b2f0
00a9b2ac	lsr x8,x10,#0x3
00a9b2b0	ldrb w9,[x2, x8]
00a9b2b4	and x10,x10,#0x7
00a9b2b8	mov w11,#0x1
00a9b2bc	lsl x10,x11,x10
00a9b2c0	tst x10,x9
00a9b2c4	b.eq 0x00a9b320
00a9b2c8	bic w9,w9,w10
00a9b2cc	strb w9,[x2, x8]
00a9b2d0	ldp x29,x30,[sp], #0x10
00a9b2d4	ret
00a9b2d8	adrp x0,0x2a0000
00a9b2dc	adrp x1,0x2d6000
00a9b2e0	add x0,x0,#0x625
00a9b2e4	add x1,x1,#0xc
00a9b2e8	mov w2,#0x162
00a9b2ec	bl 0x00c3c240
00a9b2f0	adrp x0,0x2d1000
00a9b2f4	adrp x1,0x2d6000
00a9b2f8	add x0,x0,#0xd40
00a9b2fc	add x1,x1,#0xc
00a9b300	mov w2,#0x165
00a9b304	bl 0x00c3c240
00a9b308	adrp x0,0x2a8000
00a9b30c	adrp x1,0x2d6000
00a9b310	add x0,x0,#0x368
00a9b314	add x1,x1,#0xc
00a9b318	mov w2,#0x163
00a9b31c	bl 0x00c3c240
00a9b320	adrp x0,0x2d3000
00a9b324	adrp x1,0x2d6000
00a9b328	add x0,x0,#0xe45
00a9b32c	add x1,x1,#0xc
00a9b330	mov w2,#0x166
00a9b334	bl 0x00c3c240
