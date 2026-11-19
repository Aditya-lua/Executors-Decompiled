; ossl_dh_compute_key @ 00a1e34c
00a1e34c	str x25,[sp, #-0x50]!
00a1e350	stp x24,x23,[sp, #0x10]
00a1e354	stp x22,x21,[sp, #0x20]
00a1e358	stp x20,x19,[sp, #0x30]
00a1e35c	stp x29,x30,[sp, #0x40]
00a1e360	ldr x8,[x2, #0x8]
00a1e364	mov x21,x0
00a1e368	add x29,sp,#0x40
00a1e36c	mov x22,x2
00a1e370	mov x0,x8
00a1e374	mov x23,x1
00a1e378	bl 0x00c322f0
00a1e37c	mov w8,#0x2711
00a1e380	cmp w0,w8
00a1e384	b.lt 0x00a1e3b0
00a1e388	bl 0x00c342a0
00a1e38c	adrp x0,0x2bf000
00a1e390	adrp x2,0x2a5000
00a1e394	add x0,x0,#0xb05
00a1e398	add x2,x2,#0xd4c
00a1e39c	orr w1,wzr,#0x30
00a1e3a0	bl 0x00c342b0
00a1e3a4	mov w0,#0x5
00a1e3a8	mov w1,#0x67
00a1e3ac	b 0x00a1e3ec
00a1e3b0	ldr x0,[x22, #0x10]
00a1e3b4	cbz x0,0x00a1e434
00a1e3b8	bl 0x00c322f0
00a1e3bc	mov w8,#0x2711
00a1e3c0	cmp w0,w8
00a1e3c4	b.lt 0x00a1e434
00a1e3c8	bl 0x00c342a0
00a1e3cc	adrp x0,0x2bf000
00a1e3d0	adrp x2,0x2a5000
00a1e3d4	add x0,x0,#0xb05
00a1e3d8	add x2,x2,#0xd4c
00a1e3dc	mov w1,#0x36
00a1e3e0	bl 0x00c342b0
00a1e3e4	mov w0,#0x5
00a1e3e8	mov w1,#0x82
00a1e3ec	mov x2,xzr
00a1e3f0	bl 0x00c342c0
00a1e3f4	mov x19,xzr
00a1e3f8	mov x20,xzr
00a1e3fc	mov w21,#0xffffffff
00a1e400	mov x0,x20
00a1e404	bl 0x00c38ca0
00a1e408	mov x0,x19
00a1e40c	bl 0x00c38a20
00a1e410	mov x0,x19
00a1e414	bl 0x00c38a30
00a1e418	mov w0,w21
00a1e41c	ldp x29,x30,[sp, #0x40]
00a1e420	ldp x20,x19,[sp, #0x30]
00a1e424	ldp x22,x21,[sp, #0x20]
00a1e428	ldp x24,x23,[sp, #0x10]
00a1e42c	ldr x25,[sp], #0x50
00a1e430	ret
00a1e434	ldr x0,[x22, #0x8]
00a1e438	bl 0x00c322f0
00a1e43c	cmp w0,#0x1ff
00a1e440	b.gt 0x00a1e478
00a1e444	bl 0x00c342a0
00a1e448	adrp x0,0x2bf000
00a1e44c	adrp x2,0x2a5000
00a1e450	add x0,x0,#0xb05
00a1e454	add x2,x2,#0xd4c
00a1e458	mov w1,#0x3b
00a1e45c	bl 0x00c342b0
00a1e460	mov w0,#0x5
00a1e464	orr w1,wzr,#0x7e
00a1e468	mov x2,xzr
00a1e46c	bl 0x00c342c0
00a1e470	mov w21,wzr
00a1e474	b 0x00a1e418
00a1e478	ldr x0,[x22, #0xb0]
00a1e47c	bl 0x00c38a60
00a1e480	mov x19,x0
00a1e484	cbz x0,0x00a1e3f8
00a1e488	mov x0,x19
00a1e48c	bl 0x00c38a90
00a1e490	mov x0,x19
00a1e494	bl 0x00c38a40
00a1e498	mov x24,x0
00a1e49c	mov x0,x19
00a1e4a0	bl 0x00c38a40
00a1e4a4	mov x20,x0
00a1e4a8	cbz x0,0x00a1e3fc
00a1e4ac	ldr x3,[x22, #0x78]
00a1e4b0	cbz x3,0x00a1e4c4
00a1e4b4	ldrb w8,[x22, #0x80]
00a1e4b8	tbnz w8,#0x0,0x00a1e4ec
00a1e4bc	mov x25,xzr
00a1e4c0	b 0x00a1e51c
00a1e4c4	bl 0x00c342a0
00a1e4c8	adrp x0,0x2bf000
00a1e4cc	adrp x2,0x2a5000
00a1e4d0	add x0,x0,#0xb05
00a1e4d4	add x2,x2,#0xd4c
00a1e4d8	mov w1,#0x49
00a1e4dc	bl 0x00c342b0
00a1e4e0	mov w0,#0x5
00a1e4e4	mov w1,#0x64
00a1e4e8	b 0x00a1e60c
00a1e4ec	ldr x1,[x22, #0xc0]
00a1e4f0	ldr x2,[x22, #0x8]
00a1e4f4	add x0,x22,#0x88
00a1e4f8	mov x3,x19
00a1e4fc	bl 0x00c38fa0
00a1e500	ldr x8,[x22, #0x78]
00a1e504	mov x25,x0
00a1e508	mov w1,#0x4
00a1e50c	mov x0,x8
00a1e510	bl 0x00c38dc0
00a1e514	cbz x25,0x00a1e3fc
00a1e518	ldr x3,[x22, #0x78]
00a1e51c	ldr x8,[x22, #0xb8]
00a1e520	ldr x4,[x22, #0x8]
00a1e524	mov x0,x22
00a1e528	mov x1,x20
00a1e52c	ldr x8,[x8, #0x18]
00a1e530	mov x2,x23
00a1e534	mov x5,x19
00a1e538	mov x6,x25
00a1e53c	blr x8
00a1e540	cbz w0,0x00a1e5e4
00a1e544	ldr x1,[x22, #0x8]
00a1e548	mov x0,x24
00a1e54c	bl 0x00c36990
00a1e550	cbz x0,0x00a1e5bc
00a1e554	mov w1,#0x1
00a1e558	mov x0,x24
00a1e55c	bl 0x00c38fd0
00a1e560	cbz w0,0x00a1e5bc
00a1e564	bl 0x00c38de0
00a1e568	mov x1,x0
00a1e56c	mov x0,x20
00a1e570	bl 0x00c38cc0
00a1e574	cmp w0,#0x1
00a1e578	b.lt 0x00a1e5bc
00a1e57c	mov x0,x20
00a1e580	mov x1,x24
00a1e584	bl 0x00c38cc0
00a1e588	cbz w0,0x00a1e5bc
00a1e58c	ldr x0,[x22, #0x8]
00a1e590	bl 0x00c322f0
00a1e594	add w8,w0,#0x7
00a1e598	add w9,w0,#0xe
00a1e59c	cmp w8,#0x0
00a1e5a0	csel w8,w9,w8,lt
00a1e5a4	asr w2,w8,#0x3
00a1e5a8	mov x0,x20
00a1e5ac	mov x1,x21
00a1e5b0	bl 0x00c38c70
00a1e5b4	mov w21,w0
00a1e5b8	b 0x00a1e400
00a1e5bc	bl 0x00c342a0
00a1e5c0	adrp x0,0x2bf000
00a1e5c4	adrp x2,0x2a5000
00a1e5c8	add x0,x0,#0xb05
00a1e5cc	add x2,x2,#0xd4c
00a1e5d0	mov w1,#0x61
00a1e5d4	bl 0x00c342b0
00a1e5d8	mov w0,#0x5
00a1e5dc	mov w1,#0x80
00a1e5e0	b 0x00a1e60c
00a1e5e4	bl 0x00c342a0
00a1e5e8	adrp x0,0x2bf000
00a1e5ec	adrp x2,0x2a5000
00a1e5f0	add x0,x0,#0xb05
00a1e5f4	add x2,x2,#0xd4c
00a1e5f8	mov w1,#0x58
00a1e5fc	bl 0x00c342b0
00a1e600	mov w1,#0x3
00a1e604	mov w0,#0x5
00a1e608	movk w1,#0x8, LSL #16
00a1e60c	mov x2,xzr
00a1e610	bl 0x00c342c0
00a1e614	b 0x00a1e3fc
