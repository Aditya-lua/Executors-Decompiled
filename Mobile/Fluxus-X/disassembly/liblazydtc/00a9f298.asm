; OSSL_PARAM_set_double @ 00a9f298
00a9f298	cbz x0,0x00a9f2e8
00a9f29c	ldr w8,[x0, #0x8]
00a9f2a0	str xzr,[x0, #0x20]
00a9f2a4	cmp w8,#0x1
00a9f2a8	b.eq 0x00a9f2f0
00a9f2ac	cmp w8,#0x2
00a9f2b0	b.eq 0x00a9f358
00a9f2b4	cmp w8,#0x3
00a9f2b8	mov w8,wzr
00a9f2bc	b.ne 0x00a9f418
00a9f2c0	ldr x9,[x0, #0x10]
00a9f2c4	mov w8,#0x8
00a9f2c8	str x8,[x0, #0x20]
00a9f2cc	cbz x9,0x00a9f414
00a9f2d0	ldr x8,[x0, #0x18]
00a9f2d4	cmp x8,#0x8
00a9f2d8	mov w8,wzr
00a9f2dc	b.ne 0x00a9f418
00a9f2e0	str d0,[x9]
00a9f2e4	b 0x00a9f414
00a9f2e8	mov w0,wzr
00a9f2ec	ret
00a9f2f0	fcvtzs x10,d0
00a9f2f4	scvtf d1,x10
00a9f2f8	fcmp d1,d0
00a9f2fc	b.ne 0x00a9f3c0
00a9f300	ldr x9,[x0, #0x10]
00a9f304	mov w8,#0x8
00a9f308	str x8,[x0, #0x20]
00a9f30c	cbz x9,0x00a9f414
00a9f310	ldr x8,[x0, #0x18]
00a9f314	cmp x8,#0x8
00a9f318	b.eq 0x00a9f3e4
00a9f31c	cmp x8,#0x4
00a9f320	mov w8,wzr
00a9f324	b.ne 0x00a9f418
00a9f328	adrp x8,0x29b000
00a9f32c	ldr d1,[x8, #0xb88]
00a9f330	fcmp d0,d1
00a9f334	b.lt 0x00a9f420
00a9f338	adrp x8,0x29b000
00a9f33c	ldr d1,[x8, #0x220]
00a9f340	mov w8,wzr
00a9f344	fcmp d0,d1
00a9f348	b.hi 0x00a9f418
00a9f34c	mov w8,#0x4
00a9f350	fcvtzs w10,d0
00a9f354	b 0x00a9f3b4
00a9f358	fcvtzu x10,d0
00a9f35c	ucvtf d1,x10
00a9f360	fcmp d1,d0
00a9f364	b.ne 0x00a9f3c8
00a9f368	ldr x9,[x0, #0x10]
00a9f36c	mov w8,#0x8
00a9f370	str x8,[x0, #0x20]
00a9f374	cbz x9,0x00a9f414
00a9f378	ldr x8,[x0, #0x18]
00a9f37c	cmp x8,#0x8
00a9f380	b.eq 0x00a9f3d0
00a9f384	cmp x8,#0x4
00a9f388	mov w8,wzr
00a9f38c	b.ne 0x00a9f418
00a9f390	fcmp d0,#0.0
00a9f394	b.lt 0x00a9f428
00a9f398	adrp x8,0x29a000
00a9f39c	ldr d1,[x8, #0x540]
00a9f3a0	mov w8,wzr
00a9f3a4	fcmp d0,d1
00a9f3a8	b.hi 0x00a9f418
00a9f3ac	mov w8,#0x4
00a9f3b0	fcvtzu w10,d0
00a9f3b4	str x8,[x0, #0x20]
00a9f3b8	str w10,[x9]
00a9f3bc	b 0x00a9f414
00a9f3c0	mov w0,wzr
00a9f3c4	ret
00a9f3c8	mov w0,wzr
00a9f3cc	ret
00a9f3d0	fcmp d0,#0.0
00a9f3d4	b.lt 0x00a9f430
00a9f3d8	adrp x8,0x29a000
00a9f3dc	ldr d1,[x8, #0x9c0]
00a9f3e0	b 0x00a9f3fc
00a9f3e4	adrp x8,0x29b000
00a9f3e8	ldr d1,[x8, #0x708]
00a9f3ec	fcmp d0,d1
00a9f3f0	b.lt 0x00a9f438
00a9f3f4	adrp x8,0x29a000
00a9f3f8	ldr d1,[x8, #0xe78]
00a9f3fc	fcmp d0,d1
00a9f400	mov w8,wzr
00a9f404	b.pl 0x00a9f418
00a9f408	mov w8,#0x8
00a9f40c	str x8,[x0, #0x20]
00a9f410	str x10,[x9]
00a9f414	mov w8,#0x1
00a9f418	mov w0,w8
00a9f41c	ret
00a9f420	mov w0,wzr
00a9f424	ret
00a9f428	mov w0,wzr
00a9f42c	ret
00a9f430	mov w0,wzr
00a9f434	ret
00a9f438	mov w0,wzr
00a9f43c	ret
