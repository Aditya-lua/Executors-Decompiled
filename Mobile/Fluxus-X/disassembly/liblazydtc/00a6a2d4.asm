; PKCS5_v2_scrypt_keyivgen_ex @ 00a6a2d4
00a6a2d4	sub sp,sp,#0xd0
00a6a2d8	str x27,[sp, #0x70]
00a6a2dc	stp x26,x25,[sp, #0x80]
00a6a2e0	stp x24,x23,[sp, #0x90]
00a6a2e4	stp x22,x21,[sp, #0xa0]
00a6a2e8	stp x20,x19,[sp, #0xb0]
00a6a2ec	stp x29,x30,[sp, #0xc0]
00a6a2f0	add x29,sp,#0xc0
00a6a2f4	mov x25,x7
00a6a2f8	mov w22,w6
00a6a2fc	mov x19,x3
00a6a300	mov w26,w2
00a6a304	mov x24,x1
00a6a308	mov x23,x0
00a6a30c	bl 0x00c34b80
00a6a310	cbz x0,0x00a6a41c
00a6a314	adrp x0,0xc5e000
00a6a318	add x0,x0,#0x8f0
00a6a31c	mov x1,x19
00a6a320	bl 0x00c37a80
00a6a324	mov x19,x0
00a6a328	cbz x0,0x00a6a454
00a6a32c	mov x0,x23
00a6a330	bl 0x00c3cca0
00a6a334	mov w20,w0
00a6a338	tbnz w0,#0x1f,0x00a6a47c
00a6a33c	ldr x1,[x19, #0x20]
00a6a340	sxtw x21,w20
00a6a344	cbz x1,0x00a6a360
00a6a348	add x0,sp,#0x30
00a6a34c	bl 0x00c375a0
00a6a350	cbz w0,0x00a6a4d8
00a6a354	ldr x8,[sp, #0x30]
00a6a358	cmp x8,x21
00a6a35c	b.ne 0x00a6a4d8
00a6a360	ldr x1,[x19, #0x8]
00a6a364	add x0,sp,#0x20
00a6a368	bl 0x00c375a0
00a6a36c	cbz w0,0x00a6a4b0
00a6a370	ldr x1,[x19, #0x10]
00a6a374	add x0,sp,#0x28
00a6a378	bl 0x00c375a0
00a6a37c	cbz w0,0x00a6a4b0
00a6a380	ldr x1,[x19, #0x18]
00a6a384	sub x0,x29,#0x48
00a6a388	bl 0x00c375a0
00a6a38c	cbz w0,0x00a6a4b0
00a6a390	ldr x27,[x29, #0x10]
00a6a394	ldp x4,x5,[sp, #0x20]
00a6a398	ldur x6,[x29, #-0x48]
00a6a39c	mov x0,xzr
00a6a3a0	mov x1,xzr
00a6a3a4	mov x2,xzr
00a6a3a8	mov x3,xzr
00a6a3ac	mov x7,xzr
00a6a3b0	stp xzr,xzr,[sp]
00a6a3b4	stp x25,x27,[sp, #0x10]
00a6a3b8	bl 0x00c3d8a0
00a6a3bc	cbz w0,0x00a6a4b0
00a6a3c0	ldr x8,[x19]
00a6a3c4	ldp x4,x5,[sp, #0x20]
00a6a3c8	ldur x6,[x29, #-0x48]
00a6a3cc	sxtw x1,w26
00a6a3d0	ldr x2,[x8, #0x8]
00a6a3d4	ldrsw x3,[x8]
00a6a3d8	add x8,sp,#0x30
00a6a3dc	mov x0,x24
00a6a3e0	mov x7,xzr
00a6a3e4	stp x25,x27,[sp, #0x10]
00a6a3e8	stp x8,x21,[sp]
00a6a3ec	bl 0x00c3d8a0
00a6a3f0	cbz w0,0x00a6a54c
00a6a3f4	add x3,sp,#0x30
00a6a3f8	mov x0,x23
00a6a3fc	mov x1,xzr
00a6a400	mov x2,xzr
00a6a404	mov x4,xzr
00a6a408	mov w5,w22
00a6a40c	bl 0x00c34be0
00a6a410	mov w22,w0
00a6a414	cbnz w20,0x00a6a50c
00a6a418	b 0x00a6a518
00a6a41c	bl 0x00c342a0
00a6a420	adrp x0,0x29e000
00a6a424	adrp x2,0x2a0000
00a6a428	add x0,x0,#0x1b0
00a6a42c	add x2,x2,#0x312
00a6a430	orr w1,wzr,#0xe0
00a6a434	bl 0x00c342b0
00a6a438	orr w0,wzr,#0x6
00a6a43c	mov w1,#0x83
00a6a440	mov x2,xzr
00a6a444	bl 0x00c342c0
00a6a448	mov x19,xzr
00a6a44c	mov w22,wzr
00a6a450	b 0x00a6a518
00a6a454	bl 0x00c342a0
00a6a458	adrp x0,0x29e000
00a6a45c	adrp x2,0x2a0000
00a6a460	add x0,x0,#0x1b0
00a6a464	add x2,x2,#0x312
00a6a468	mov w1,#0xe9
00a6a46c	bl 0x00c342b0
00a6a470	orr w0,wzr,#0x6
00a6a474	mov w1,#0x72
00a6a478	b 0x00a6a4a0
00a6a47c	bl 0x00c342a0
00a6a480	adrp x0,0x29e000
00a6a484	adrp x2,0x2a0000
00a6a488	add x0,x0,#0x1b0
00a6a48c	add x2,x2,#0x312
00a6a490	mov w1,#0xef
00a6a494	bl 0x00c342b0
00a6a498	orr w0,wzr,#0x6
00a6a49c	mov w1,#0x82
00a6a4a0	mov x2,xzr
00a6a4a4	bl 0x00c342c0
00a6a4a8	mov w22,wzr
00a6a4ac	b 0x00a6a518
00a6a4b0	bl 0x00c342a0
00a6a4b4	adrp x0,0x29e000
00a6a4b8	adrp x2,0x2a0000
00a6a4bc	add x0,x0,#0x1b0
00a6a4c0	add x2,x2,#0x312
00a6a4c4	mov w1,#0x104
00a6a4c8	bl 0x00c342b0
00a6a4cc	orr w0,wzr,#0x6
00a6a4d0	mov w1,#0xab
00a6a4d4	b 0x00a6a4fc
00a6a4d8	bl 0x00c342a0
00a6a4dc	adrp x0,0x29e000
00a6a4e0	adrp x2,0x2a0000
00a6a4e4	add x0,x0,#0x1b0
00a6a4e8	add x2,x2,#0x312
00a6a4ec	mov w1,#0xfa
00a6a4f0	bl 0x00c342b0
00a6a4f4	orr w0,wzr,#0x6
00a6a4f8	mov w1,#0x7b
00a6a4fc	mov x2,xzr
00a6a500	bl 0x00c342c0
00a6a504	mov w22,wzr
00a6a508	cbz w20,0x00a6a518
00a6a50c	add x0,sp,#0x30
00a6a510	mov x1,x21
00a6a514	bl 0x00c34750
00a6a518	adrp x1,0xc5e000
00a6a51c	add x1,x1,#0x8f0
00a6a520	mov x0,x19
00a6a524	bl 0x00c36160
00a6a528	mov w0,w22
00a6a52c	ldp x29,x30,[sp, #0xc0]
00a6a530	ldp x20,x19,[sp, #0xb0]
00a6a534	ldp x22,x21,[sp, #0xa0]
00a6a538	ldp x24,x23,[sp, #0x90]
00a6a53c	ldp x26,x25,[sp, #0x80]
00a6a540	ldr x27,[sp, #0x70]
00a6a544	add sp,sp,#0xd0
00a6a548	ret
00a6a54c	mov w22,wzr
00a6a550	cbnz w20,0x00a6a50c
00a6a554	b 0x00a6a518
