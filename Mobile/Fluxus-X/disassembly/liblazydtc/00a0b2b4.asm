; bn_sqr_recursive @ 00a0b2b4
00a0b2b4	stp x28,x27,[sp, #-0x60]!
00a0b2b8	cmp w2,#0x0
00a0b2bc	stp x22,x21,[sp, #0x30]
00a0b2c0	stp x20,x19,[sp, #0x40]
00a0b2c4	mov w20,w2
00a0b2c8	mov x22,x1
00a0b2cc	cinc w8,w2,lt
00a0b2d0	cmp w2,#0x8
00a0b2d4	mov x19,x0
00a0b2d8	stp x26,x25,[sp, #0x10]
00a0b2dc	stp x24,x23,[sp, #0x20]
00a0b2e0	stp x29,x30,[sp, #0x50]
00a0b2e4	add x29,sp,#0x50
00a0b2e8	b.eq 0x00a0b318
00a0b2ec	cmp w20,#0x4
00a0b2f0	b.ne 0x00a0b33c
00a0b2f4	mov x0,x19
00a0b2f8	mov x1,x22
00a0b2fc	ldp x29,x30,[sp, #0x50]
00a0b300	ldp x20,x19,[sp, #0x40]
00a0b304	ldp x22,x21,[sp, #0x30]
00a0b308	ldp x24,x23,[sp, #0x20]
00a0b30c	ldp x26,x25,[sp, #0x10]
00a0b310	ldp x28,x27,[sp], #0x60
00a0b314	b 0x00c38910
00a0b318	mov x0,x19
00a0b31c	mov x1,x22
00a0b320	ldp x29,x30,[sp, #0x50]
00a0b324	ldp x20,x19,[sp, #0x40]
00a0b328	ldp x22,x21,[sp, #0x30]
00a0b32c	ldp x24,x23,[sp, #0x20]
00a0b330	ldp x26,x25,[sp, #0x10]
00a0b334	ldp x28,x27,[sp], #0x60
00a0b338	b 0x00c38920
00a0b33c	mov x21,x3
00a0b340	cmp w20,#0xf
00a0b344	b.gt 0x00a0b374
00a0b348	mov x0,x19
00a0b34c	mov x1,x22
00a0b350	mov w2,w20
00a0b354	mov x3,x21
00a0b358	ldp x29,x30,[sp, #0x50]
00a0b35c	ldp x20,x19,[sp, #0x40]
00a0b360	ldp x22,x21,[sp, #0x30]
00a0b364	ldp x24,x23,[sp, #0x20]
00a0b368	ldp x26,x25,[sp, #0x10]
00a0b36c	ldp x28,x27,[sp], #0x60
00a0b370	b 0x00a0b1bc
00a0b374	asr w23,w8,#0x1
00a0b378	add x24,x22,w23, SXTW  #0x3
00a0b37c	mov x0,x22
00a0b380	mov x1,x24
00a0b384	mov w2,w23
00a0b388	sxtw x27,w23
00a0b38c	bl 0x00c38e30
00a0b390	cmp w0,#0x1
00a0b394	b.lt 0x00a0b3d0
00a0b398	mov x0,x21
00a0b39c	mov x1,x22
00a0b3a0	mov x2,x24
00a0b3a4	mov w3,w23
00a0b3a8	bl 0x00c38940
00a0b3ac	add x26,x21,w20, SXTW  #0x4
00a0b3b0	add x25,x21,w20, SXTW  #0x3
00a0b3b4	mov x0,x25
00a0b3b8	mov x1,x21
00a0b3bc	mov w2,w23
00a0b3c0	mov x3,x26
00a0b3c4	sxtw x28,w20
00a0b3c8	bl 0x00a0b2b4
00a0b3cc	b 0x00a0b3f0
00a0b3d0	tbnz w0,#0x1f,0x00a0b4b4
00a0b3d4	sbfiz x2,x20,#0x3,#0x20
00a0b3d8	add x25,x21,x2
00a0b3dc	mov x0,x25
00a0b3e0	mov w1,wzr
00a0b3e4	sxtw x28,w20
00a0b3e8	add x26,x21,w20, SXTW  #0x4
00a0b3ec	bl 0x00c301c0
00a0b3f0	mov x0,x19
00a0b3f4	mov x1,x22
00a0b3f8	mov w2,w23
00a0b3fc	mov x3,x26
00a0b400	bl 0x00a0b2b4
00a0b404	add x22,x19,x28, LSL #0x3
00a0b408	mov x0,x22
00a0b40c	mov x1,x24
00a0b410	mov w2,w23
00a0b414	mov x3,x26
00a0b418	bl 0x00a0b2b4
00a0b41c	mov x0,x21
00a0b420	mov x1,x19
00a0b424	mov x2,x22
00a0b428	mov w3,w20
00a0b42c	bl 0x00c388b0
00a0b430	mov x22,x0
00a0b434	mov x0,x25
00a0b438	mov x1,x21
00a0b43c	mov x2,x25
00a0b440	mov w3,w20
00a0b444	bl 0x00c38940
00a0b448	sub w21,w22,w0
00a0b44c	add x0,x19,x27, LSL #0x3
00a0b450	mov x1,x0
00a0b454	mov x2,x25
00a0b458	mov w3,w20
00a0b45c	bl 0x00c388b0
00a0b460	adds w9,w21,w0
00a0b464	b.eq 0x00a0b498
00a0b468	add x8,x27,w20, SXTW 
00a0b46c	lsl x10,x8,#0x3
00a0b470	ldr x11,[x19, x10#0x0]
00a0b474	adds x9,x11,w9, SXTW 
00a0b478	str x9,[x19, x10#0x0]
00a0b47c	b.cc 0x00a0b498
00a0b480	add x8,x19,x8, LSL #0x3
00a0b484	add x8,x8,#0x8
00a0b488	ldr x9,[x8]
00a0b48c	adds x9,x9,#0x1
00a0b490	str x9,[x8], #0x8
00a0b494	b.eq 0x00a0b488
00a0b498	ldp x29,x30,[sp, #0x50]
00a0b49c	ldp x20,x19,[sp, #0x40]
00a0b4a0	ldp x22,x21,[sp, #0x30]
00a0b4a4	ldp x24,x23,[sp, #0x20]
00a0b4a8	ldp x26,x25,[sp, #0x10]
00a0b4ac	ldp x28,x27,[sp], #0x60
00a0b4b0	ret
00a0b4b4	mov x0,x21
00a0b4b8	mov x1,x24
00a0b4bc	mov x2,x22
00a0b4c0	b 0x00a0b3a4
