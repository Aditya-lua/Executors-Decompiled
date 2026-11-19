; FUN_00afc228 @ 00afc228
00afc228	sub sp,sp,#0x80
00afc22c	stp x28,x27,[sp, #0x20]
00afc230	mov x27,x0
00afc234	mov x0,x2
00afc238	stp x26,x25,[sp, #0x30]
00afc23c	stp x24,x23,[sp, #0x40]
00afc240	stp x22,x21,[sp, #0x50]
00afc244	stp x20,x19,[sp, #0x60]
00afc248	stp x29,x30,[sp, #0x70]
00afc24c	add x29,sp,#0x70
00afc250	mov x21,x2
00afc254	mov x20,x1
00afc258	bl 0x00c325e0
00afc25c	mov w23,w0
00afc260	mov x0,xzr
00afc264	mov w1,w23
00afc268	bl 0x00c34790
00afc26c	mov x19,x0
00afc270	cbz x0,0x00afc438
00afc274	cmp w23,#0x1
00afc278	b.lt 0x00afc4bc
00afc27c	adrp x28,0xc7f000
00afc280	mov w24,wzr
00afc284	add x28,x28,#0x7b8
00afc288	str x27,[sp, #0x10]
00afc28c	str w23,[sp, #0xc]
00afc290	mov x0,x21
00afc294	mov w1,w24
00afc298	bl 0x00c32610
00afc29c	ldr x8,[x0, #0x10]
00afc2a0	mov x2,x0
00afc2a4	cbz x8,0x00afc318
00afc2a8	mov x0,x27
00afc2ac	mov x1,x20
00afc2b0	bl 0x00c40970
00afc2b4	mov x26,x0
00afc2b8	cbz x0,0x00afc494
00afc2bc	bl 0x00c40800
00afc2c0	mov x25,x0
00afc2c4	cbz x0,0x00afc440
00afc2c8	mov x0,x25
00afc2cc	mov x1,x26
00afc2d0	bl 0x00c347a0
00afc2d4	cbz w0,0x00afc440
00afc2d8	adrp x0,0xc7f000
00afc2dc	add x0,x0,#0x820
00afc2e0	bl 0x00c372e0
00afc2e4	cbz x0,0x00afc4e0
00afc2e8	mov x22,x0
00afc2ec	mov x0,x19
00afc2f0	mov x1,x22
00afc2f4	bl 0x00c347a0
00afc2f8	mov x0,x28
00afc2fc	bl 0x00c372e0
00afc300	str x0,[x22]
00afc304	cbz x0,0x00afc4e0
00afc308	str x25,[x0, #0x8]
00afc30c	ldr x8,[x22]
00afc310	str wzr,[x8]
00afc314	b 0x00afc428
00afc318	ldr x1,[x2, #0x8]
00afc31c	mov x0,x20
00afc320	mov x23,x21
00afc324	mov x21,x28
00afc328	bl 0x00c396b0
00afc32c	cbz x0,0x00afc490
00afc330	mov x28,x0
00afc334	adrp x0,0xc7f000
00afc338	add x0,x0,#0x820
00afc33c	bl 0x00c372e0
00afc340	mov x25,x0
00afc344	cbz x0,0x00afc474
00afc348	mov x0,x28
00afc34c	bl 0x00c325e0
00afc350	cmp w0,#0x1
00afc354	b.lt 0x00afc400
00afc358	mov w27,wzr
00afc35c	add x8,x25,#0x8
00afc360	str x8,[sp, #0x18]
00afc364	mov x0,x28
00afc368	mov w1,w27
00afc36c	bl 0x00c32610
00afc370	mov x22,x0
00afc374	mov x0,x25
00afc378	mov x1,x20
00afc37c	mov x2,x22
00afc380	bl 0x00afcb9c
00afc384	cmp w0,#0x0
00afc388	b.le 0x00afc3a4
00afc38c	mov x0,x28
00afc390	add w27,w27,#0x1
00afc394	bl 0x00c325e0
00afc398	cmp w27,w0
00afc39c	b.lt 0x00afc364
00afc3a0	b 0x00afc400
00afc3a4	tbnz w0,#0x1f,0x00afc474
00afc3a8	ldr x26,[x22, #0x8]
00afc3ac	adrp x1,0x2c2000
00afc3b0	add x1,x1,#0x50c
00afc3b4	mov x0,x26
00afc3b8	bl 0x00c301f0
00afc3bc	cbz w0,0x00afc3ec
00afc3c0	adrp x1,0x2a4000
00afc3c4	mov x0,x26
00afc3c8	add x1,x1,#0x99a
00afc3cc	bl 0x00c301f0
00afc3d0	cbnz w0,0x00afc38c
00afc3d4	ldr x1,[x22, #0x10]
00afc3d8	mov x0,x20
00afc3dc	bl 0x00afd018
00afc3e0	str x0,[x25, #0x10]
00afc3e4	cbnz x0,0x00afc38c
00afc3e8	b 0x00afc474
00afc3ec	ldr x1,[x22, #0x10]
00afc3f0	ldr x0,[sp, #0x18]
00afc3f4	bl 0x00afcdf8
00afc3f8	cbnz w0,0x00afc38c
00afc3fc	b 0x00afc474
00afc400	mov x0,x20
00afc404	mov x1,x28
00afc408	bl 0x00c396d0
00afc40c	mov x0,x19
00afc410	mov x1,x25
00afc414	bl 0x00c347a0
00afc418	ldr x27,[sp, #0x10]
00afc41c	mov x28,x21
00afc420	mov x21,x23
00afc424	ldr w23,[sp, #0xc]
00afc428	add w24,w24,#0x1
00afc42c	cmp w24,w23
00afc430	b.lt 0x00afc290
00afc434	b 0x00afc4bc
00afc438	mov x26,xzr
00afc43c	mov x25,xzr
00afc440	bl 0x00c342a0
00afc444	adrp x0,0x2b2000
00afc448	adrp x2,0x2ae000
00afc44c	add x0,x0,#0xca4
00afc450	add x2,x2,#0x798
00afc454	mov w1,#0x121
00afc458	bl 0x00c342b0
00afc45c	mov w1,#0x100
00afc460	mov w0,#0x22
00afc464	movk w1,#0xc, LSL #16
00afc468	mov x2,xzr
00afc46c	bl 0x00c342c0
00afc470	b 0x00afc498
00afc474	adrp x1,0xc7f000
00afc478	add x1,x1,#0x820
00afc47c	mov x0,x25
00afc480	bl 0x00c36160
00afc484	mov x0,x20
00afc488	mov x1,x28
00afc48c	bl 0x00c396d0
00afc490	mov x26,xzr
00afc494	mov x25,xzr
00afc498	mov x0,x26
00afc49c	bl 0x00c3ef00
00afc4a0	mov x0,x25
00afc4a4	bl 0x00c324e0
00afc4a8	adrp x1,0xcb5000
00afc4ac	ldr x1,[x1, #0x838]
00afc4b0	mov x0,x19
00afc4b4	bl 0x00c32600
00afc4b8	mov x19,xzr
00afc4bc	mov x0,x19
00afc4c0	ldp x29,x30,[sp, #0x70]
00afc4c4	ldp x20,x19,[sp, #0x60]
00afc4c8	ldp x22,x21,[sp, #0x50]
00afc4cc	ldp x24,x23,[sp, #0x40]
00afc4d0	ldp x26,x25,[sp, #0x30]
00afc4d4	ldp x28,x27,[sp, #0x20]
00afc4d8	add sp,sp,#0x80
00afc4dc	ret
00afc4e0	mov x26,xzr
00afc4e4	b 0x00afc440
