; OPENSSL_utf82uni @ 00abd208
00abd208	str x27,[sp, #-0x60]!
00abd20c	stp x22,x21,[sp, #0x30]
00abd210	stp x20,x19,[sp, #0x40]
00abd214	mov x20,x3
00abd218	mov x19,x2
00abd21c	mov w22,w1
00abd220	mov x21,x0
00abd224	cmn w1,#0x1
00abd228	stp x26,x25,[sp, #0x10]
00abd22c	stp x24,x23,[sp, #0x20]
00abd230	stp x29,x30,[sp, #0x50]
00abd234	add x29,sp,#0x50
00abd238	str xzr,[sp, #0x8]
00abd23c	b.ne 0x00abd24c
00abd240	mov x0,x21
00abd244	bl 0x00c2ff50
00abd248	mov x22,x0
00abd24c	cmp w22,#0x1
00abd250	mov w24,#0x2
00abd254	b.lt 0x00abd2a4
00abd258	mov w23,wzr
00abd25c	mov w25,wzr
00abd260	mov w26,#0x4
00abd264	add x0,x21,w25, SXTW 
00abd268	sub w1,w22,w25
00abd26c	add x2,sp,#0x8
00abd270	bl 0x00c37820
00abd274	tbnz w0,#0x1f,0x00abd35c
00abd278	ldr x8,[sp, #0x8]
00abd27c	lsr x8,x8,#0x10
00abd280	cmp x8,#0x10
00abd284	b.hi 0x00abd378
00abd288	cmp x8,#0x0
00abd28c	add w25,w0,w25
00abd290	csel w8,w26,w24,ne
00abd294	cmp w22,w25
00abd298	add w23,w8,w23
00abd29c	b.gt 0x00abd264
00abd2a0	add w24,w23,#0x2
00abd2a4	adrp x1,0x2b4000
00abd2a8	sxtw x0,w24
00abd2ac	add x1,x1,#0x83a
00abd2b0	mov w2,#0x7a
00abd2b4	bl 0x00c32320
00abd2b8	mov x23,x0
00abd2bc	cbz x0,0x00abd380
00abd2c0	cmp w22,#0x1
00abd2c4	mov x8,x23
00abd2c8	b.lt 0x00abd344
00abd2cc	mov w25,wzr
00abd2d0	mov w26,#0xd800
00abd2d4	mov x27,x23
00abd2d8	add x0,x21,w25, SXTW 
00abd2dc	sub w1,w22,w25
00abd2e0	add x2,sp,#0x8
00abd2e4	bl 0x00c37820
00abd2e8	ldr x8,[sp, #0x8]
00abd2ec	subs x9,x8,#0x10, LSL #12
00abd2f0	b.cc 0x00abd320
00abd2f4	lsr x10,x9,#0xa
00abd2f8	mov w11,#0xdc
00abd2fc	add w10,w10,w26
00abd300	bfxil w11,w9,#0x8,#0x2
00abd304	lsr w12,w10,#0x8
00abd308	str x9,[sp, #0x8]
00abd30c	add x8,x27,#0x4
00abd310	strb w11,[x27, #0x2]
00abd314	strb w12,[x27]
00abd318	strb w9,[x27, #0x3]
00abd31c	b 0x00abd330
00abd320	lsr x9,x8,#0x8
00abd324	mov x8,x27
00abd328	strb w9,[x8], #0x2
00abd32c	ldrb w10,[sp, #0x8]
00abd330	add w25,w0,w25
00abd334	cmp w22,w25
00abd338	strb w10,[x27, #0x1]
00abd33c	mov x27,x8
00abd340	b.gt 0x00abd2d8
00abd344	strh wzr,[x8]
00abd348	cbz x20,0x00abd350
00abd34c	str w24,[x20]
00abd350	cbz x19,0x00abd3b0
00abd354	str x23,[x19]
00abd358	b 0x00abd3b0
00abd35c	mov x0,x21
00abd360	mov w1,w22
00abd364	mov x2,x19
00abd368	mov x3,x20
00abd36c	bl 0x00abcf20
00abd370	mov x23,x0
00abd374	b 0x00abd3b0
00abd378	mov x23,xzr
00abd37c	b 0x00abd3b0
00abd380	bl 0x00c342a0
00abd384	adrp x0,0x2b4000
00abd388	adrp x2,0x2ac000
00abd38c	add x0,x0,#0x83a
00abd390	add x2,x2,#0x6ca
00abd394	mov w1,#0x7b
00abd398	bl 0x00c342b0
00abd39c	mov w1,#0x100
00abd3a0	mov w0,#0x23
00abd3a4	movk w1,#0xc, LSL #16
00abd3a8	mov x2,xzr
00abd3ac	bl 0x00c342c0
00abd3b0	mov x0,x23
00abd3b4	ldp x29,x30,[sp, #0x50]
00abd3b8	ldp x20,x19,[sp, #0x40]
00abd3bc	ldp x22,x21,[sp, #0x30]
00abd3c0	ldp x24,x23,[sp, #0x20]
00abd3c4	ldp x26,x25,[sp, #0x10]
00abd3c8	ldr x27,[sp], #0x60
00abd3cc	ret
