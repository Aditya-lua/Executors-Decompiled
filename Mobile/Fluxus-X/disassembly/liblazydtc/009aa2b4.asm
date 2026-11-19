; ssl_derive @ 009aa2b4
009aa2b4	str x23,[sp, #-0x40]!
009aa2b8	stp x20,x19,[sp, #0x20]
009aa2bc	mov x20,x0
009aa2c0	stp x22,x21,[sp, #0x10]
009aa2c4	stp x29,x30,[sp, #0x30]
009aa2c8	add x29,sp,#0x30
009aa2cc	str xzr,[sp, #0x8]
009aa2d0	cbz x1,0x009aa3c4
009aa2d4	mov x23,x2
009aa2d8	cbz x2,0x009aa3c4
009aa2dc	ldr x8,[x20, #0x9a8]
009aa2e0	mov w21,w3
009aa2e4	mov x22,x1
009aa2e8	ldr x0,[x8]
009aa2ec	ldr x2,[x8, #0x440]
009aa2f0	bl 0x00c34640
009aa2f4	mov x19,x0
009aa2f8	bl 0x00c346a0
009aa2fc	cmp w0,#0x1
009aa300	b.lt 0x009aa400
009aa304	mov x0,x19
009aa308	mov x1,x23
009aa30c	bl 0x00c346b0
009aa310	cmp w0,#0x1
009aa314	b.lt 0x009aa400
009aa318	add x2,sp,#0x8
009aa31c	mov x0,x19
009aa320	mov x1,xzr
009aa324	bl 0x00c34690
009aa328	cmp w0,#0x0
009aa32c	b.le 0x009aa400
009aa330	ldr x8,[x20, #0x8]
009aa334	ldr x9,[x8, #0xc0]
009aa338	ldrb w9,[x9, #0x60]
009aa33c	tbnz w9,#0x3,0x009aa374
009aa340	ldr w8,[x8]
009aa344	cmp w8,#0x304
009aa348	b.lt 0x009aa374
009aa34c	cmp w8,#0x10, LSL #12
009aa350	b.eq 0x009aa374
009aa354	adrp x1,0x2a3000
009aa358	add x1,x1,#0xa5a
009aa35c	mov x0,x22
009aa360	bl 0x00c346e0
009aa364	cbz w0,0x009aa374
009aa368	mov w1,#0x1
009aa36c	mov x0,x19
009aa370	bl 0x00c34650
009aa374	ldr x0,[sp, #0x8]
009aa378	adrp x1,0x2a3000
009aa37c	add x1,x1,#0xa43
009aa380	mov w2,#0x12d0
009aa384	bl 0x00c32320
009aa388	mov x22,x0
009aa38c	cbz x0,0x009aa474
009aa390	add x2,sp,#0x8
009aa394	mov x0,x19
009aa398	mov x1,x22
009aa39c	bl 0x00c34690
009aa3a0	cmp w0,#0x0
009aa3a4	b.le 0x009aa4a4
009aa3a8	cbz w21,0x009aa4e0
009aa3ac	ldr x2,[sp, #0x8]
009aa3b0	mov x0,x20
009aa3b4	mov x1,x22
009aa3b8	bl 0x009aa1fc
009aa3bc	mov w20,w0
009aa3c0	b 0x009aa43c
009aa3c4	bl 0x00c342a0
009aa3c8	adrp x0,0x2a3000
009aa3cc	adrp x2,0x2bf000
009aa3d0	add x0,x0,#0xa43
009aa3d4	add x2,x2,#0x5cc
009aa3d8	mov w1,#0x12c0
009aa3dc	bl 0x00c342b0
009aa3e0	mov w2,#0x103
009aa3e4	mov w1,#0x50
009aa3e8	movk w2,#0xc, LSL #16
009aa3ec	mov x0,x20
009aa3f0	mov x3,xzr
009aa3f4	bl 0x00c34410
009aa3f8	mov w20,wzr
009aa3fc	b 0x009aa45c
009aa400	bl 0x00c342a0
009aa404	adrp x0,0x2a3000
009aa408	adrp x2,0x2bf000
009aa40c	add x0,x0,#0xa43
009aa410	add x2,x2,#0x5cc
009aa414	mov w1,#0x12c9
009aa418	bl 0x00c342b0
009aa41c	mov w2,#0x103
009aa420	mov w1,#0x50
009aa424	movk w2,#0xc, LSL #16
009aa428	mov x0,x20
009aa42c	mov x3,xzr
009aa430	bl 0x00c34410
009aa434	mov w20,wzr
009aa438	mov x22,xzr
009aa43c	ldr x1,[sp, #0x8]
009aa440	adrp x2,0x2a3000
009aa444	add x2,x2,#0xa43
009aa448	mov w3,#0x12e7
009aa44c	mov x0,x22
009aa450	bl 0x00c345e0
009aa454	mov x0,x19
009aa458	bl 0x00c34620
009aa45c	mov w0,w20
009aa460	ldp x29,x30,[sp, #0x30]
009aa464	ldp x20,x19,[sp, #0x20]
009aa468	ldp x22,x21,[sp, #0x10]
009aa46c	ldr x23,[sp], #0x40
009aa470	ret
009aa474	bl 0x00c342a0
009aa478	adrp x0,0x2a3000
009aa47c	adrp x2,0x2bf000
009aa480	add x0,x0,#0xa43
009aa484	add x2,x2,#0x5cc
009aa488	mov w1,#0x12d2
009aa48c	bl 0x00c342b0
009aa490	mov w8,#0x103
009aa494	movk w8,#0xc, LSL #16
009aa498	sub w2,w8,#0x3
009aa49c	mov w1,#0x50
009aa4a0	b 0x009aa4cc
009aa4a4	bl 0x00c342a0
009aa4a8	adrp x0,0x2a3000
009aa4ac	adrp x2,0x2bf000
009aa4b0	add x0,x0,#0xa43
009aa4b4	add x2,x2,#0x5cc
009aa4b8	mov w1,#0x12d7
009aa4bc	bl 0x00c342b0
009aa4c0	mov w2,#0x103
009aa4c4	mov w1,#0x50
009aa4c8	movk w2,#0xc, LSL #16
009aa4cc	mov x0,x20
009aa4d0	mov x3,xzr
009aa4d4	bl 0x00c34410
009aa4d8	mov w20,wzr
009aa4dc	b 0x009aa43c
009aa4e0	str x22,[x20, #0x360]
009aa4e4	ldr x8,[sp, #0x8]
009aa4e8	str x8,[x20, #0x368]
009aa4ec	mov w20,#0x1
009aa4f0	b 0x009aa438
