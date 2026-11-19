; FUN_00a2b220 @ 00a2b220
00a2b220	stp x26,x25,[sp, #-0x50]!
00a2b224	stp x24,x23,[sp, #0x10]
00a2b228	stp x22,x21,[sp, #0x20]
00a2b22c	stp x20,x19,[sp, #0x30]
00a2b230	stp x29,x30,[sp, #0x40]
00a2b234	ldr x8,[x1, #0x20]
00a2b238	mov x22,x0
00a2b23c	add x29,sp,#0x40
00a2b240	mov x19,x4
00a2b244	mov x0,x8
00a2b248	mov x21,x3
00a2b24c	mov x26,x2
00a2b250	mov x20,x1
00a2b254	bl 0x00c369b0
00a2b258	cbz w0,0x00a2b27c
00a2b25c	mov x0,x22
00a2b260	mov x1,x20
00a2b264	ldp x29,x30,[sp, #0x40]
00a2b268	ldp x20,x19,[sp, #0x30]
00a2b26c	ldp x22,x21,[sp, #0x20]
00a2b270	ldp x24,x23,[sp, #0x10]
00a2b274	ldp x26,x25,[sp], #0x50
00a2b278	b 0x00c3af10
00a2b27c	ldr x0,[x26, #0x20]
00a2b280	bl 0x00c369b0
00a2b284	cbz w0,0x00a2b2ec
00a2b288	mov x0,x20
00a2b28c	mov x1,x21
00a2b290	bl 0x00c3acc0
00a2b294	cbz w0,0x00a2b2b4
00a2b298	mov x0,x22
00a2b29c	mov x1,x20
00a2b2a0	mov x2,x19
00a2b2a4	bl 0x00c3af00
00a2b2a8	cbz w0,0x00a2b2b4
00a2b2ac	mov w21,#0x1
00a2b2b0	b 0x00a2b5ac
00a2b2b4	bl 0x00c342a0
00a2b2b8	adrp x0,0x29e000
00a2b2bc	adrp x2,0x2a2000
00a2b2c0	add x0,x0,#0x82
00a2b2c4	add x2,x2,#0x26a
00a2b2c8	mov w1,#0x332
00a2b2cc	bl 0x00c342b0
00a2b2d0	mov w1,#0x10
00a2b2d4	mov w0,#0x10
00a2b2d8	movk w1,#0x8, LSL #16
00a2b2dc	mov x2,xzr
00a2b2e0	bl 0x00c342c0
00a2b2e4	mov w21,wzr
00a2b2e8	b 0x00a2b5ac
00a2b2ec	mov x0,x19
00a2b2f0	bl 0x00c38a90
00a2b2f4	mov x0,x19
00a2b2f8	bl 0x00c38a40
00a2b2fc	mov x25,x0
00a2b300	mov x0,x19
00a2b304	bl 0x00c38a40
00a2b308	mov x24,x0
00a2b30c	mov x0,x19
00a2b310	bl 0x00c38a40
00a2b314	cbz x0,0x00a2b570
00a2b318	ldr x8,[x22]
00a2b31c	ldr x2,[x20, #0x20]
00a2b320	ldr x3,[x26, #0x20]
00a2b324	mov x23,x0
00a2b328	ldr x8,[x8, #0xf8]
00a2b32c	mov x0,x22
00a2b330	mov x1,x25
00a2b334	mov x4,x19
00a2b338	blr x8
00a2b33c	cbz w0,0x00a2b5a0
00a2b340	ldr x8,[x22]
00a2b344	ldr x2,[x21, #0x10]
00a2b348	ldr x3,[x20, #0x20]
00a2b34c	mov x0,x22
00a2b350	ldr x8,[x8, #0xf8]
00a2b354	mov x1,x24
00a2b358	mov x4,x19
00a2b35c	blr x8
00a2b360	cbz w0,0x00a2b5a0
00a2b364	ldr x1,[x20, #0x10]
00a2b368	mov x0,x24
00a2b36c	mov x2,x24
00a2b370	bl 0x00c38b40
00a2b374	cbz w0,0x00a2b5a0
00a2b378	ldr x8,[x22]
00a2b37c	ldr x2,[x21, #0x10]
00a2b380	ldr x3,[x26, #0x20]
00a2b384	mov x0,x22
00a2b388	ldr x8,[x8, #0xf8]
00a2b38c	mov x1,x23
00a2b390	mov x4,x19
00a2b394	blr x8
00a2b398	cbz w0,0x00a2b5a0
00a2b39c	ldr x8,[x22]
00a2b3a0	ldr x1,[x20, #0x20]
00a2b3a4	ldr x2,[x20, #0x10]
00a2b3a8	mov x0,x22
00a2b3ac	ldr x8,[x8, #0xf8]
00a2b3b0	mov x3,x23
00a2b3b4	mov x4,x19
00a2b3b8	blr x8
00a2b3bc	cbz w0,0x00a2b5a0
00a2b3c0	ldr x2,[x26, #0x10]
00a2b3c4	mov x0,x23
00a2b3c8	mov x1,x23
00a2b3cc	bl 0x00c38b40
00a2b3d0	cbz w0,0x00a2b5a0
00a2b3d4	ldr x8,[x22]
00a2b3d8	mov x0,x22
00a2b3dc	mov x1,x24
00a2b3e0	mov x2,x24
00a2b3e4	ldr x8,[x8, #0xf8]
00a2b3e8	mov x3,x23
00a2b3ec	mov x4,x19
00a2b3f0	blr x8
00a2b3f4	cbz w0,0x00a2b5a0
00a2b3f8	ldr x8,[x22]
00a2b3fc	ldr x2,[x21, #0x10]
00a2b400	mov x0,x22
00a2b404	mov x1,x23
00a2b408	ldr x8,[x8, #0x100]
00a2b40c	mov x3,x19
00a2b410	blr x8
00a2b414	cbz w0,0x00a2b5a0
00a2b418	ldr x1,[x21, #0x18]
00a2b41c	mov x0,x23
00a2b420	mov x2,x23
00a2b424	bl 0x00c38b40
00a2b428	cbz w0,0x00a2b5a0
00a2b42c	ldr x8,[x22]
00a2b430	mov x0,x22
00a2b434	mov x1,x23
00a2b438	mov x2,x23
00a2b43c	ldr x8,[x8, #0xf8]
00a2b440	mov x3,x25
00a2b444	mov x4,x19
00a2b448	blr x8
00a2b44c	cbz w0,0x00a2b5a0
00a2b450	mov x0,x24
00a2b454	mov x1,x23
00a2b458	mov x2,x24
00a2b45c	bl 0x00c38b40
00a2b460	cbz w0,0x00a2b5a0
00a2b464	ldr x8,[x22]
00a2b468	ldr x2,[x21, #0x10]
00a2b46c	mov x0,x22
00a2b470	mov x1,x23
00a2b474	ldr x8,[x8, #0xf8]
00a2b478	mov x3,x25
00a2b47c	mov x4,x19
00a2b480	blr x8
00a2b484	cbz w0,0x00a2b5a0
00a2b488	ldr x8,[x22]
00a2b48c	mov x0,x22
00a2b490	mov x1,x23
00a2b494	mov x2,x23
00a2b498	ldr x8,[x8, #0x110]
00a2b49c	mov x3,x19
00a2b4a0	blr x8
00a2b4a4	cbz w0,0x00a2b5a0
00a2b4a8	ldr x8,[x22]
00a2b4ac	mov x0,x22
00a2b4b0	mov x1,x24
00a2b4b4	mov x2,x24
00a2b4b8	ldr x8,[x8, #0xf8]
00a2b4bc	mov x3,x23
00a2b4c0	mov x4,x19
00a2b4c4	blr x8
00a2b4c8	cbz w0,0x00a2b5a0
00a2b4cc	ldr x8,[x22]
00a2b4d0	ldr x1,[x20, #0x10]
00a2b4d4	ldr x2,[x20, #0x20]
00a2b4d8	mov x0,x22
00a2b4dc	ldr x8,[x8, #0xf8]
00a2b4e0	mov x3,x23
00a2b4e4	mov x4,x19
00a2b4e8	blr x8
00a2b4ec	cbz w0,0x00a2b5a0
00a2b4f0	ldr x1,[x21, #0x10]
00a2b4f4	ldr x2,[x20, #0x10]
00a2b4f8	mov x0,x23
00a2b4fc	bl 0x00c38b40
00a2b500	cbz w0,0x00a2b5a0
00a2b504	ldr x8,[x22]
00a2b508	mov x0,x22
00a2b50c	mov x1,x23
00a2b510	mov x2,x23
00a2b514	ldr x8,[x8, #0xf8]
00a2b518	mov x3,x24
00a2b51c	mov x4,x19
00a2b520	blr x8
00a2b524	cbz w0,0x00a2b5a0
00a2b528	ldr x0,[x20, #0x18]
00a2b52c	ldr x1,[x21, #0x18]
00a2b530	mov x2,x23
00a2b534	bl 0x00c38b40
00a2b538	cbz w0,0x00a2b5a0
00a2b53c	ldr x0,[x20, #0x20]
00a2b540	mov w1,#0x1
00a2b544	mov w21,#0x1
00a2b548	bl 0x00c37720
00a2b54c	cbz w0,0x00a2b5a0
00a2b550	ldr x0,[x20, #0x10]
00a2b554	mov w1,wzr
00a2b558	str w21,[x20, #0x28]
00a2b55c	bl 0x00c37f50
00a2b560	ldr x0,[x20, #0x18]
00a2b564	mov w1,wzr
00a2b568	bl 0x00c37f50
00a2b56c	b 0x00a2b5a4
00a2b570	bl 0x00c342a0
00a2b574	adrp x0,0x29e000
00a2b578	adrp x2,0x2a2000
00a2b57c	add x0,x0,#0x82
00a2b580	add x2,x2,#0x26a
00a2b584	mov w1,#0x33d
00a2b588	bl 0x00c342b0
00a2b58c	mov w1,#0x100
00a2b590	mov w0,#0x10
00a2b594	movk w1,#0xc, LSL #16
00a2b598	mov x2,xzr
00a2b59c	bl 0x00c342c0
00a2b5a0	mov w21,wzr
00a2b5a4	mov x0,x19
00a2b5a8	bl 0x00c38a20
00a2b5ac	mov w0,w21
00a2b5b0	ldp x29,x30,[sp, #0x40]
00a2b5b4	ldp x20,x19,[sp, #0x30]
00a2b5b8	ldp x22,x21,[sp, #0x20]
00a2b5bc	ldp x24,x23,[sp, #0x10]
00a2b5c0	ldp x26,x25,[sp], #0x50
00a2b5c4	ret
