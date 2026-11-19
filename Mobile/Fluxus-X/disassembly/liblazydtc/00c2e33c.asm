; FUN_00c2e33c @ 00c2e33c
00c2e33c	paciasp
00c2e340	stp x29,x30,[sp, #-0x30]!
00c2e344	str x21,[sp, #0x10]
00c2e348	stp x20,x19,[sp, #0x20]
00c2e34c	mov x29,sp
00c2e350	and w8,w3,#0xf
00c2e354	ldr x19,[x1]
00c2e358	cmp w8,#0x3
00c2e35c	b.le 0x00c2e384
00c2e360	cmp w8,#0x9
00c2e364	b.le 0x00c2e3f8
00c2e368	cmp w8,#0xa
00c2e36c	b.eq 0x00c2e4c8
00c2e370	cmp w8,#0xb
00c2e374	b.eq 0x00c2e4e8
00c2e378	cmp w8,#0xc
00c2e37c	b.eq 0x00c2e488
00c2e380	b 0x00c2e694
00c2e384	cmp w8,#0x1
00c2e388	b.gt 0x00c2e3c8
00c2e38c	cbz w8,0x00c2e488
00c2e390	cmp w8,#0x1
00c2e394	b.ne 0x00c2e694
00c2e398	mov x0,x1
00c2e39c	mov x1,x2
00c2e3a0	mov w20,w3
00c2e3a4	mov x21,x4
00c2e3a8	bl 0x00c2e6c8
00c2e3ac	mov x4,x21
00c2e3b0	mov w3,w20
00c2e3b4	and w8,w20,#0xff
00c2e3b8	ubfx w8,w8,#0x4,#0x3
00c2e3bc	cmp w8,#0x1
00c2e3c0	b.le 0x00c2e504
00c2e3c4	b 0x00c2e470
00c2e3c8	cmp w8,#0x2
00c2e3cc	b.eq 0x00c2e4a8
00c2e3d0	cmp w8,#0x3
00c2e3d4	b.ne 0x00c2e694
00c2e3d8	mov x8,x19
00c2e3dc	ldr w0,[x8], #0x4
00c2e3e0	str x8,[x1]
00c2e3e4	and w8,w3,#0xff
00c2e3e8	ubfx w8,w8,#0x4,#0x3
00c2e3ec	cmp w8,#0x1
00c2e3f0	b.le 0x00c2e504
00c2e3f4	b 0x00c2e470
00c2e3f8	cmp w8,#0x4
00c2e3fc	b.eq 0x00c2e488
00c2e400	cmp w8,#0x9
00c2e404	b.ne 0x00c2e694
00c2e408	mov x8,xzr
00c2e40c	mov x10,#-0x7
00c2e410	mov x9,x19
00c2e414	mov x11,x19
00c2e418	cmp x11,x2
00c2e41c	b.eq 0x00c2e544
00c2e420	ldrb w12,[x11], #0x1
00c2e424	add x10,x10,#0x7
00c2e428	add x9,x9,#0x1
00c2e42c	and x13,x12,#0x7f
00c2e430	lsl x13,x13,x10
00c2e434	orr x8,x13,x8
00c2e438	tbnz w12,#0x7,0x00c2e418
00c2e43c	add w11,w10,#0x7
00c2e440	mov x13,#-0x1
00c2e444	cmp x10,#0x39
00c2e448	mov w10,#0x3f
00c2e44c	lsl x11,x13,x11
00c2e450	str x9,[x1]
00c2e454	ccmp w12,w10,#0x0,cc
00c2e458	csel x10,x11,xzr,hi
00c2e45c	orr x0,x8,x10
00c2e460	and w8,w3,#0xff
00c2e464	ubfx w8,w8,#0x4,#0x3
00c2e468	cmp w8,#0x1
00c2e46c	b.le 0x00c2e504
00c2e470	cmp w8,#0x3
00c2e474	b.gt 0x00c2e578
00c2e478	b.ne 0x00c2e5bc
00c2e47c	cbz x4,0x00c2e62c
00c2e480	add x0,x0,x4
00c2e484	b 0x00c2e514
00c2e488	mov x8,x19
00c2e48c	ldr x0,[x8], #0x8
00c2e490	str x8,[x1]
00c2e494	and w8,w3,#0xff
00c2e498	ubfx w8,w8,#0x4,#0x3
00c2e49c	cmp w8,#0x1
00c2e4a0	b.le 0x00c2e504
00c2e4a4	b 0x00c2e470
00c2e4a8	mov x8,x19
00c2e4ac	ldrh w0,[x8], #0x2
00c2e4b0	str x8,[x1]
00c2e4b4	and w8,w3,#0xff
00c2e4b8	ubfx w8,w8,#0x4,#0x3
00c2e4bc	cmp w8,#0x1
00c2e4c0	b.le 0x00c2e504
00c2e4c4	b 0x00c2e470
00c2e4c8	mov x8,x19
00c2e4cc	ldrsh x0,[x8], #0x2
00c2e4d0	str x8,[x1]
00c2e4d4	and w8,w3,#0xff
00c2e4d8	ubfx w8,w8,#0x4,#0x3
00c2e4dc	cmp w8,#0x1
00c2e4e0	b.le 0x00c2e504
00c2e4e4	b 0x00c2e470
00c2e4e8	mov x8,x19
00c2e4ec	ldrsw x0,[x8], #0x4
00c2e4f0	str x8,[x1]
00c2e4f4	and w8,w3,#0xff
00c2e4f8	ubfx w8,w8,#0x4,#0x3
00c2e4fc	cmp w8,#0x1
00c2e500	b.gt 0x00c2e470
00c2e504	cbz w8,0x00c2e514
00c2e508	cmp w8,#0x1
00c2e50c	b.ne 0x00c2e660
00c2e510	add x0,x0,x19
00c2e514	tbnz w3,#0x7,0x00c2e52c
00c2e518	ldp x20,x19,[sp, #0x20]
00c2e51c	ldr x21,[sp, #0x10]
00c2e520	ldp x29,x30,[sp], #0x30
00c2e524	autiasp
00c2e528	ret
00c2e52c	ldr x0,[x0]
00c2e530	ldp x20,x19,[sp, #0x20]
00c2e534	ldr x21,[sp, #0x10]
00c2e538	ldp x29,x30,[sp], #0x30
00c2e53c	autiasp
00c2e540	ret
00c2e544	adrp x19,0xcb4000
00c2e548	adrp x1,0x2a1000
00c2e54c	add x1,x1,#0x45d
00c2e550	ldr x19,[x19, #0xba0]
00c2e554	adrp x2,0x2c2000
00c2e558	add x2,x2,#0xcb4
00c2e55c	adrp x3,0x2b3000
00c2e560	add x3,x3,#0x329
00c2e564	add x0,x19,#0x130
00c2e568	bl 0x00c30940
00c2e56c	add x0,x19,#0x130
00c2e570	bl 0x00c30c50
00c2e574	bl 0x00c30b40
00c2e578	cmp w8,#0x4
00c2e57c	b.eq 0x00c2e5f8
00c2e580	cmp w8,#0x5
00c2e584	b.ne 0x00c2e660
00c2e588	adrp x19,0xcb4000
00c2e58c	adrp x1,0x2a1000
00c2e590	add x1,x1,#0x45d
00c2e594	ldr x19,[x19, #0xba0]
00c2e598	adrp x2,0x2da000
00c2e59c	add x2,x2,#0xe9c
00c2e5a0	adrp x3,0x2b8000
00c2e5a4	add x3,x3,#0xd94
00c2e5a8	add x0,x19,#0x130
00c2e5ac	bl 0x00c30940
00c2e5b0	add x0,x19,#0x130
00c2e5b4	bl 0x00c30c50
00c2e5b8	bl 0x00c30b40
00c2e5bc	cmp w8,#0x2
00c2e5c0	b.ne 0x00c2e660
00c2e5c4	adrp x19,0xcb4000
00c2e5c8	adrp x1,0x2a1000
00c2e5cc	add x1,x1,#0x45d
00c2e5d0	ldr x19,[x19, #0xba0]
00c2e5d4	adrp x2,0x2da000
00c2e5d8	add x2,x2,#0xe9c
00c2e5dc	adrp x3,0x2c8000
00c2e5e0	add x3,x3,#0xa7b
00c2e5e4	add x0,x19,#0x130
00c2e5e8	bl 0x00c30940
00c2e5ec	add x0,x19,#0x130
00c2e5f0	bl 0x00c30c50
00c2e5f4	bl 0x00c30b40
00c2e5f8	adrp x19,0xcb4000
00c2e5fc	adrp x1,0x2a1000
00c2e600	add x1,x1,#0x45d
00c2e604	ldr x19,[x19, #0xba0]
00c2e608	adrp x2,0x2da000
00c2e60c	add x2,x2,#0xe9c
00c2e610	adrp x3,0x2a1000
00c2e614	add x3,x3,#0x471
00c2e618	add x0,x19,#0x130
00c2e61c	bl 0x00c30940
00c2e620	add x0,x19,#0x130
00c2e624	bl 0x00c30c50
00c2e628	bl 0x00c30b40
00c2e62c	adrp x19,0xcb4000
00c2e630	adrp x1,0x2a1000
00c2e634	add x1,x1,#0x45d
00c2e638	ldr x19,[x19, #0xba0]
00c2e63c	adrp x2,0x2da000
00c2e640	add x2,x2,#0xe9c
00c2e644	adrp x3,0x2ce000
00c2e648	add x3,x3,#0xc0d
00c2e64c	add x0,x19,#0x130
00c2e650	bl 0x00c30940
00c2e654	add x0,x19,#0x130
00c2e658	bl 0x00c30c50
00c2e65c	bl 0x00c30b40
00c2e660	adrp x19,0xcb4000
00c2e664	adrp x1,0x2a1000
00c2e668	add x1,x1,#0x45d
00c2e66c	ldr x19,[x19, #0xba0]
00c2e670	adrp x2,0x2da000
00c2e674	add x2,x2,#0xe9c
00c2e678	adrp x3,0x2c2000
00c2e67c	add x3,x3,#0xc9b
00c2e680	add x0,x19,#0x130
00c2e684	bl 0x00c30940
00c2e688	add x0,x19,#0x130
00c2e68c	bl 0x00c30c50
00c2e690	bl 0x00c30b40
00c2e694	adrp x19,0xcb4000
00c2e698	adrp x1,0x2a1000
00c2e69c	add x1,x1,#0x45d
00c2e6a0	ldr x19,[x19, #0xba0]
00c2e6a4	adrp x2,0x2da000
00c2e6a8	add x2,x2,#0xe9c
00c2e6ac	adrp x3,0x2c2000
00c2e6b0	add x3,x3,#0xc9b
00c2e6b4	add x0,x19,#0x130
00c2e6b8	bl 0x00c30940
00c2e6bc	add x0,x19,#0x130
00c2e6c0	bl 0x00c30c50
00c2e6c4	bl 0x00c30b40
