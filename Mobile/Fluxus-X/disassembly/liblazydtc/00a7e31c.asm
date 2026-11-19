; FUN_00a7e31c @ 00a7e31c
00a7e31c	sub sp,sp,#0x100
00a7e320	stp x28,x27,[sp, #0xa0]
00a7e324	stp x26,x25,[sp, #0xb0]
00a7e328	stp x24,x23,[sp, #0xc0]
00a7e32c	stp x22,x21,[sp, #0xd0]
00a7e330	stp x20,x19,[sp, #0xe0]
00a7e334	stp x29,x30,[sp, #0xf0]
00a7e338	add x29,sp,#0xf0
00a7e33c	mov x28,x7
00a7e340	mov x25,x6
00a7e344	mov x22,x5
00a7e348	mov x23,x4
00a7e34c	stp w2,w3,[sp, #0x50]
00a7e350	mov x26,x1
00a7e354	mov x19,x0
00a7e358	bl 0x00c38a90
00a7e35c	mov x0,x19
00a7e360	bl 0x00c38a40
00a7e364	mov x27,x0
00a7e368	mov x0,x19
00a7e36c	bl 0x00c38a40
00a7e370	str x0,[sp, #0x40]
00a7e374	mov x0,x19
00a7e378	bl 0x00c38a40
00a7e37c	str x0,[sp, #0x38]
00a7e380	mov x0,x19
00a7e384	bl 0x00c38a40
00a7e388	mov x20,x0
00a7e38c	mov x0,x19
00a7e390	bl 0x00c38a40
00a7e394	cbz x0,0x00a7e5bc
00a7e398	str x25,[sp, #0x28]
00a7e39c	ldr w25,[x29, #0x10]
00a7e3a0	mov x21,x0
00a7e3a4	bl 0x00c38de0
00a7e3a8	sub w25,w25,#0x1
00a7e3ac	mov x1,x0
00a7e3b0	mov x0,x20
00a7e3b4	mov w2,w25
00a7e3b8	bl 0x00c38fc0
00a7e3bc	cbz w0,0x00a7e5bc
00a7e3c0	mov x0,x26
00a7e3c4	str w25,[sp, #0x24]
00a7e3c8	bl 0x00c34c20
00a7e3cc	cmp w0,#0x1
00a7e3d0	b.lt 0x00a7e5bc
00a7e3d4	ldr w8,[sp, #0x50]
00a7e3d8	tbnz w8,#0x1f,0x00a7e5a4
00a7e3dc	ldr x8,[x29, #0x20]
00a7e3e0	mov w25,w0
00a7e3e4	mov w24,wzr
00a7e3e8	str x8,[sp]
00a7e3ec	ldr x8,[x29, #0x18]
00a7e3f0	stp x28,x8,[sp, #0x10]
00a7e3f4	lsl w8,w0,#0x3
00a7e3f8	str w8,[sp, #0x34]
00a7e3fc	sxtw x8,w22
00a7e400	str x8,[sp, #0x48]
00a7e404	cbz w24,0x00a7e41c
00a7e408	ldr x0,[sp, #0x18]
00a7e40c	mov w1,wzr
00a7e410	mov w2,w24
00a7e414	bl 0x00c39100
00a7e418	cbz w0,0x00a7e5bc
00a7e41c	mov x0,x27
00a7e420	bl 0x00c38e00
00a7e424	ldr w8,[sp, #0x54]
00a7e428	tbnz w8,#0x1f,0x00a7e4c8
00a7e42c	mov w28,wzr
00a7e430	ldr x8,[sp, #0x48]
00a7e434	subs x9,x8,#0x1
00a7e438	b.lt 0x00a7e458
00a7e43c	add x8,x23,x8
00a7e440	ldurb w10,[x8, #-0x1]
00a7e444	add w10,w10,#0x1
00a7e448	tst w10,#0xff
00a7e44c	sturb w10,[x8, #-0x1]
00a7e450	mov x8,x9
00a7e454	b.eq 0x00a7e434
00a7e458	add x2,sp,#0x58
00a7e45c	mov x0,x23
00a7e460	mov x1,x22
00a7e464	mov x3,xzr
00a7e468	mov x4,x26
00a7e46c	mov x5,xzr
00a7e470	bl 0x00c370c0
00a7e474	cbz w0,0x00a7e5bc
00a7e478	add x0,sp,#0x58
00a7e47c	mov w1,w25
00a7e480	mov x2,x21
00a7e484	bl 0x00c36970
00a7e488	cbz x0,0x00a7e5bc
00a7e48c	ldr w8,[sp, #0x34]
00a7e490	mov x0,x21
00a7e494	mov x1,x21
00a7e498	mul w2,w8,w28
00a7e49c	bl 0x00c38fc0
00a7e4a0	cbz w0,0x00a7e5bc
00a7e4a4	mov x0,x27
00a7e4a8	mov x1,x27
00a7e4ac	mov x2,x21
00a7e4b0	bl 0x00c38870
00a7e4b4	cbz w0,0x00a7e5bc
00a7e4b8	ldr w8,[sp, #0x54]
00a7e4bc	cmp w28,w8
00a7e4c0	add w28,w28,#0x1
00a7e4c4	b.lt 0x00a7e430
00a7e4c8	ldr w1,[sp, #0x24]
00a7e4cc	mov x0,x27
00a7e4d0	bl 0x00c38d50
00a7e4d4	cbz w0,0x00a7e5bc
00a7e4d8	ldr x28,[sp, #0x40]
00a7e4dc	mov x1,x27
00a7e4e0	mov x0,x28
00a7e4e4	bl 0x00c36990
00a7e4e8	cbz x0,0x00a7e5bc
00a7e4ec	mov x0,x28
00a7e4f0	mov x1,x28
00a7e4f4	mov x2,x20
00a7e4f8	bl 0x00c38870
00a7e4fc	cbz w0,0x00a7e5bc
00a7e500	ldr x1,[sp, #0x28]
00a7e504	mov x0,x21
00a7e508	bl 0x00c39050
00a7e50c	cbz w0,0x00a7e5bc
00a7e510	str x20,[sp, #0x8]
00a7e514	ldr x20,[sp, #0x38]
00a7e518	mov x0,xzr
00a7e51c	mov x2,x28
00a7e520	mov x3,x21
00a7e524	mov x1,x20
00a7e528	mov x4,x19
00a7e52c	bl 0x00c38ab0
00a7e530	cbz w0,0x00a7e5bc
00a7e534	bl 0x00c38de0
00a7e538	mov x2,x0
00a7e53c	mov x0,x21
00a7e540	mov x1,x20
00a7e544	bl 0x00c38880
00a7e548	cbz w0,0x00a7e5bc
00a7e54c	mov x1,x28
00a7e550	ldr x28,[sp, #0x10]
00a7e554	mov x2,x21
00a7e558	mov x0,x28
00a7e55c	bl 0x00c38880
00a7e560	cbz w0,0x00a7e5bc
00a7e564	ldr x20,[sp, #0x8]
00a7e568	mov x0,x28
00a7e56c	mov x1,x20
00a7e570	bl 0x00c38cc0
00a7e574	tbnz w0,#0x1f,0x00a7e594
00a7e578	ldr x2,[sp, #0x18]
00a7e57c	mov x0,x28
00a7e580	mov x1,x19
00a7e584	bl 0x00c39110
00a7e588	cmp w0,#0x1
00a7e58c	b.ge 0x00a7e5ec
00a7e590	cbnz w0,0x00a7e5bc
00a7e594	ldr w8,[sp, #0x50]
00a7e598	cmp w24,w8
00a7e59c	add w24,w24,#0x1
00a7e5a0	b.lt 0x00a7e404
00a7e5a4	ldr x8,[x29, #0x28]
00a7e5a8	mov w20,wzr
00a7e5ac	ldr w9,[x8]
00a7e5b0	orr w9,w9,#0x1
00a7e5b4	str w9,[x8]
00a7e5b8	b 0x00a7e5c0
00a7e5bc	mov w20,#0xffffffff
00a7e5c0	mov x0,x19
00a7e5c4	bl 0x00c38a20
00a7e5c8	mov w0,w20
00a7e5cc	ldp x29,x30,[sp, #0xf0]
00a7e5d0	ldp x20,x19,[sp, #0xe0]
00a7e5d4	ldp x22,x21,[sp, #0xd0]
00a7e5d8	ldp x24,x23,[sp, #0xc0]
00a7e5dc	ldp x26,x25,[sp, #0xb0]
00a7e5e0	ldp x28,x27,[sp, #0xa0]
00a7e5e4	add sp,sp,#0x100
00a7e5e8	ret
00a7e5ec	ldr x8,[sp]
00a7e5f0	mov w20,#0x1
00a7e5f4	str w24,[x8]
00a7e5f8	b 0x00a7e5c0
