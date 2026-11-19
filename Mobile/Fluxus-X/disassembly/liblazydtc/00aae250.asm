; OBJ_txt2obj @ 00aae250
00aae250	sub sp,sp,#0x70
00aae254	stp x20,x19,[sp, #0x50]
00aae258	mov x19,x0
00aae25c	stp x22,x21,[sp, #0x40]
00aae260	stp x29,x30,[sp, #0x60]
00aae264	add x29,sp,#0x60
00aae268	cbz w1,0x00aae328
00aae26c	mov w3,#0xffffffff
00aae270	mov x0,xzr
00aae274	mov w1,wzr
00aae278	mov x2,x19
00aae27c	bl 0x00c37680
00aae280	cmp w0,#0x1
00aae284	b.lt 0x00aae320
00aae288	mov w20,w0
00aae28c	orr w2,wzr,#0x6
00aae290	mov w0,wzr
00aae294	mov w1,w20
00aae298	bl 0x00c376b0
00aae29c	tbnz w0,#0x1f,0x00aae320
00aae2a0	sxtw x22,w0
00aae2a4	adrp x1,0x2d8000
00aae2a8	add x1,x1,#0x291
00aae2ac	mov w2,#0x18b
00aae2b0	mov x0,x22
00aae2b4	bl 0x00c32320
00aae2b8	cbz x0,0x00aae3f0
00aae2bc	mov x21,x0
00aae2c0	str x0,[sp, #0x18]
00aae2c4	add x0,sp,#0x18
00aae2c8	orr w3,wzr,#0x6
00aae2cc	mov w1,wzr
00aae2d0	mov w2,w20
00aae2d4	mov w4,wzr
00aae2d8	bl 0x00c376c0
00aae2dc	ldr x0,[sp, #0x18]
00aae2e0	mov w3,#0xffffffff
00aae2e4	mov w1,w20
00aae2e8	mov x2,x19
00aae2ec	bl 0x00c37680
00aae2f0	mov x1,sp
00aae2f4	mov x0,xzr
00aae2f8	mov x2,x22
00aae2fc	str x21,[sp]
00aae300	bl 0x00c37690
00aae304	adrp x1,0x2d8000
00aae308	mov x19,x0
00aae30c	add x1,x1,#0x291
00aae310	mov w2,#0x198
00aae314	mov x0,x21
00aae318	bl 0x00c32310
00aae31c	b 0x00aae474
00aae320	mov x19,xzr
00aae324	b 0x00aae474
00aae328	add x21,sp,#0x18
00aae32c	mov w0,#0x40
00aae330	mov x1,xzr
00aae334	str x21,[sp, #0x10]
00aae338	bl 0x00c35500
00aae33c	adrp x20,0xd22000
00aae340	ldr x0,[x20, #0x188]
00aae344	str x19,[sp, #0x18]
00aae348	cbz x0,0x00aae36c
00aae34c	mov w8,#0x1
00aae350	mov x1,sp
00aae354	str w8,[sp]
00aae358	str x21,[sp, #0x8]
00aae35c	bl 0x00c34de0
00aae360	cbz x0,0x00aae36c
00aae364	ldr x8,[x0, #0x8]
00aae368	b 0x00aae3a8
00aae36c	adrp x1,0x770000
00aae370	adrp x4,0xaaf000
00aae374	add x1,x1,#0xef8
00aae378	add x4,x4,#0xa8
00aae37c	add x0,sp,#0x10
00aae380	mov w2,#0x4d7
00aae384	mov w3,#0x4
00aae388	mov w5,wzr
00aae38c	bl 0x00c3de50
00aae390	cbz x0,0x00aae3ac
00aae394	ldr w8,[x0]
00aae398	adrp x10,0xc6d000
00aae39c	mov w9,#0x28
00aae3a0	add x10,x10,#0xa58
00aae3a4	madd x8,x8,x9,x10
00aae3a8	ldr w0,[x8, #0x10]!
00aae3ac	cbnz w0,0x00aae46c
00aae3b0	add x21,sp,#0x18
00aae3b4	mov w0,#0x40
00aae3b8	mov x1,xzr
00aae3bc	str x21,[sp, #0x10]
00aae3c0	bl 0x00c35500
00aae3c4	ldr x0,[x20, #0x188]
00aae3c8	str x19,[sp, #0x20]
00aae3cc	cbz x0,0x00aae428
00aae3d0	mov w8,#0x2
00aae3d4	mov x1,sp
00aae3d8	str w8,[sp]
00aae3dc	str x21,[sp, #0x8]
00aae3e0	bl 0x00c34de0
00aae3e4	cbz x0,0x00aae428
00aae3e8	ldr x8,[x0, #0x8]
00aae3ec	b 0x00aae464
00aae3f0	bl 0x00c342a0
00aae3f4	adrp x0,0x2d8000
00aae3f8	adrp x2,0x2b4000
00aae3fc	add x0,x0,#0x291
00aae400	add x2,x2,#0x4e5
00aae404	mov w1,#0x18c
00aae408	bl 0x00c342b0
00aae40c	mov w1,#0x100
00aae410	mov w0,#0x8
00aae414	movk w1,#0xc, LSL #16
00aae418	mov x2,xzr
00aae41c	bl 0x00c342c0
00aae420	mov x19,xzr
00aae424	b 0x00aae474
00aae428	adrp x1,0x76f000
00aae42c	adrp x4,0xaaf000
00aae430	add x1,x1,#0xb9c
00aae434	add x4,x4,#0x80
00aae438	add x0,sp,#0x10
00aae43c	mov w2,#0x4d7
00aae440	mov w3,#0x4
00aae444	mov w5,wzr
00aae448	bl 0x00c3de50
00aae44c	cbz x0,0x00aae468
00aae450	ldr w8,[x0]
00aae454	adrp x10,0xc6d000
00aae458	mov w9,#0x28
00aae45c	add x10,x10,#0xa58
00aae460	madd x8,x8,x9,x10
00aae464	ldr w0,[x8, #0x10]!
00aae468	cbz w0,0x00aae48c
00aae46c	bl 0x00aadeac
00aae470	mov x19,x0
00aae474	mov x0,x19
00aae478	ldp x29,x30,[sp, #0x60]
00aae47c	ldp x20,x19,[sp, #0x50]
00aae480	ldp x22,x21,[sp, #0x40]
00aae484	add sp,sp,#0x70
00aae488	ret
00aae48c	ldrb w0,[x19]
00aae490	bl 0x00c37770
00aae494	cbnz w0,0x00aae26c
00aae498	bl 0x00c342a0
00aae49c	adrp x0,0x2d8000
00aae4a0	adrp x2,0x2b4000
00aae4a4	add x0,x0,#0x291
00aae4a8	add x2,x2,#0x4e5
00aae4ac	mov w1,#0x178
00aae4b0	bl 0x00c342b0
00aae4b4	mov w0,#0x8
00aae4b8	mov w1,#0x67
00aae4bc	b 0x00aae418
