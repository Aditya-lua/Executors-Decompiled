; ossl_ec_GFp_simple_points_make_affine @ 00a3b01c
00a3b01c	stp x28,x27,[sp, #-0x60]!
00a3b020	stp x26,x25,[sp, #0x10]
00a3b024	stp x24,x23,[sp, #0x20]
00a3b028	stp x22,x21,[sp, #0x30]
00a3b02c	stp x20,x19,[sp, #0x40]
00a3b030	stp x29,x30,[sp, #0x50]
00a3b034	add x29,sp,#0x50
00a3b038	cbz x1,0x00a3b374
00a3b03c	mov x21,x3
00a3b040	mov x23,x2
00a3b044	mov x19,x1
00a3b048	mov x24,x0
00a3b04c	mov x20,xzr
00a3b050	cbnz x3,0x00a3b068
00a3b054	ldr x0,[x24, #0xa8]
00a3b058	bl 0x00c38a60
00a3b05c	mov x20,x0
00a3b060	mov x21,x0
00a3b064	cbz x0,0x00a3b388
00a3b068	mov x0,x21
00a3b06c	bl 0x00c38a90
00a3b070	mov x0,x21
00a3b074	bl 0x00c38a40
00a3b078	mov x25,x0
00a3b07c	mov x0,x21
00a3b080	bl 0x00c38a40
00a3b084	mov x26,x0
00a3b088	cbz x0,0x00a3b37c
00a3b08c	adrp x1,0x2c7000
00a3b090	lsl x0,x19,#0x3
00a3b094	add x1,x1,#0x8a7
00a3b098	mov w2,#0x4ce
00a3b09c	bl 0x00c32320
00a3b0a0	mov x22,x0
00a3b0a4	cbz x0,0x00a3b3ec
00a3b0a8	mov x27,xzr
00a3b0ac	bl 0x00c37710
00a3b0b0	str x0,[x22, x27, LSL #0x3]
00a3b0b4	cbz x0,0x00a3b3ec
00a3b0b8	add x27,x27,#0x1
00a3b0bc	cmp x27,x19
00a3b0c0	b.cc 0x00a3b0ac
00a3b0c4	ldr x8,[x23]
00a3b0c8	ldr x0,[x8, #0x20]
00a3b0cc	bl 0x00c369b0
00a3b0d0	cbz w0,0x00a3b390
00a3b0d4	ldr x8,[x24]
00a3b0d8	ldr x9,[x8, #0x128]
00a3b0dc	ldr x8,[x22]
00a3b0e0	cbz x9,0x00a3b3a8
00a3b0e4	mov x0,x24
00a3b0e8	mov x1,x8
00a3b0ec	mov x2,x21
00a3b0f0	blr x9
00a3b0f4	cbz w0,0x00a3b3ec
00a3b0f8	cmp x19,#0x2
00a3b0fc	b.cc 0x00a3b168
00a3b100	mov x28,xzr
00a3b104	add x27,x23,#0x8
00a3b108	ldr x8,[x27, x28, LSL #0x3]
00a3b10c	ldr x0,[x8, #0x20]
00a3b110	bl 0x00c369b0
00a3b114	cbz w0,0x00a3b12c
00a3b118	add x8,x22,x28, LSL #0x3
00a3b11c	ldp x1,x0,[x8]
00a3b120	bl 0x00c36990
00a3b124	cbnz x0,0x00a3b158
00a3b128	b 0x00a3b3ec
00a3b12c	lsl x9,x28,#0x3
00a3b130	ldr x8,[x24]
00a3b134	add x10,x22,x9
00a3b138	ldr x9,[x27, x9#0x0]
00a3b13c	ldp x2,x1,[x10]
00a3b140	ldr x8,[x8, #0xf8]
00a3b144	mov x0,x24
00a3b148	ldr x3,[x9, #0x20]
00a3b14c	mov x4,x21
00a3b150	blr x8
00a3b154	cbz w0,0x00a3b3ec
00a3b158	add x8,x28,#0x2
00a3b15c	add x28,x28,#0x1
00a3b160	cmp x8,x19
00a3b164	b.cc 0x00a3b108
00a3b168	ldr x8,[x24]
00a3b16c	sub x27,x19,#0x1
00a3b170	ldr x2,[x22, x27, LSL #0x3]
00a3b174	mov x0,x24
00a3b178	ldr x8,[x8, #0x110]
00a3b17c	mov x1,x25
00a3b180	mov x3,x21
00a3b184	blr x8
00a3b188	cbz w0,0x00a3b3bc
00a3b18c	ldr x8,[x24]
00a3b190	ldr x8,[x8, #0x118]
00a3b194	cbz x8,0x00a3b1d0
00a3b198	mov x0,x24
00a3b19c	mov x1,x25
00a3b1a0	mov x2,x25
00a3b1a4	mov x3,x21
00a3b1a8	blr x8
00a3b1ac	cbz w0,0x00a3b3ec
00a3b1b0	ldr x8,[x24]
00a3b1b4	mov x0,x24
00a3b1b8	mov x1,x25
00a3b1bc	mov x2,x25
00a3b1c0	ldr x8,[x8, #0x118]
00a3b1c4	mov x3,x21
00a3b1c8	blr x8
00a3b1cc	cbz w0,0x00a3b3ec
00a3b1d0	cbz x27,0x00a3b25c
00a3b1d4	ldr x8,[x23, x27, LSL #0x3]
00a3b1d8	ldr x0,[x8, #0x20]
00a3b1dc	bl 0x00c369b0
00a3b1e0	cbz w0,0x00a3b1f0
00a3b1e4	sub x27,x27,#0x1
00a3b1e8	cbnz x27,0x00a3b1d4
00a3b1ec	b 0x00a3b25c
00a3b1f0	ldr x8,[x24]
00a3b1f4	sub x28,x27,#0x1
00a3b1f8	ldr x2,[x22, x28, LSL #0x3]
00a3b1fc	mov x0,x24
00a3b200	ldr x8,[x8, #0xf8]
00a3b204	mov x1,x26
00a3b208	mov x3,x25
00a3b20c	mov x4,x21
00a3b210	blr x8
00a3b214	cbz w0,0x00a3b3ec
00a3b218	ldr x8,[x24]
00a3b21c	ldr x9,[x23, x27, LSL #0x3]
00a3b220	mov x0,x24
00a3b224	mov x1,x25
00a3b228	ldr x8,[x8, #0xf8]
00a3b22c	ldr x3,[x9, #0x20]
00a3b230	mov x2,x25
00a3b234	mov x4,x21
00a3b238	blr x8
00a3b23c	cbz w0,0x00a3b3ec
00a3b240	ldr x8,[x23, x27, LSL #0x3]
00a3b244	mov x1,x26
00a3b248	ldr x0,[x8, #0x20]
00a3b24c	bl 0x00c36990
00a3b250	mov x27,x28
00a3b254	cbz x0,0x00a3b3ec
00a3b258	cbnz x27,0x00a3b1d4
00a3b25c	ldr x8,[x23]
00a3b260	ldr x0,[x8, #0x20]
00a3b264	bl 0x00c369b0
00a3b268	cbnz w0,0x00a3b280
00a3b26c	ldr x8,[x23]
00a3b270	mov x1,x25
00a3b274	ldr x0,[x8, #0x20]
00a3b278	bl 0x00c36990
00a3b27c	cbz x0,0x00a3b3ec
00a3b280	mov x27,xzr
00a3b284	mov w28,#0x1
00a3b288	ldr x26,[x23, x27, LSL #0x3]
00a3b28c	ldr x0,[x26, #0x20]
00a3b290	bl 0x00c369b0
00a3b294	cbnz w0,0x00a3b360
00a3b298	ldr x8,[x24]
00a3b29c	ldr x2,[x26, #0x20]
00a3b2a0	mov x0,x24
00a3b2a4	mov x1,x25
00a3b2a8	ldr x8,[x8, #0x100]
00a3b2ac	mov x3,x21
00a3b2b0	blr x8
00a3b2b4	cbz w0,0x00a3b3ec
00a3b2b8	ldr x8,[x24]
00a3b2bc	ldr x1,[x26, #0x10]
00a3b2c0	mov x0,x24
00a3b2c4	mov x3,x25
00a3b2c8	ldr x8,[x8, #0xf8]
00a3b2cc	mov x2,x1
00a3b2d0	mov x4,x21
00a3b2d4	blr x8
00a3b2d8	cbz w0,0x00a3b3ec
00a3b2dc	ldr x8,[x24]
00a3b2e0	ldr x3,[x26, #0x20]
00a3b2e4	mov x0,x24
00a3b2e8	mov x1,x25
00a3b2ec	ldr x8,[x8, #0xf8]
00a3b2f0	mov x2,x25
00a3b2f4	mov x4,x21
00a3b2f8	blr x8
00a3b2fc	cbz w0,0x00a3b3ec
00a3b300	ldr x8,[x24]
00a3b304	ldr x1,[x26, #0x18]
00a3b308	mov x0,x24
00a3b30c	mov x3,x25
00a3b310	ldr x8,[x8, #0xf8]
00a3b314	mov x2,x1
00a3b318	mov x4,x21
00a3b31c	blr x8
00a3b320	cbz w0,0x00a3b3ec
00a3b324	ldr x8,[x24]
00a3b328	ldr x9,[x8, #0x128]
00a3b32c	ldr x8,[x26, #0x20]
00a3b330	cbz x9,0x00a3b34c
00a3b334	mov x0,x24
00a3b338	mov x1,x8
00a3b33c	mov x2,x21
00a3b340	blr x9
00a3b344	cbnz w0,0x00a3b35c
00a3b348	b 0x00a3b3ec
00a3b34c	mov w1,#0x1
00a3b350	mov x0,x8
00a3b354	bl 0x00c37720
00a3b358	cbz w0,0x00a3b3ec
00a3b35c	str w28,[x26, #0x28]
00a3b360	add x27,x27,#0x1
00a3b364	cmp x27,x19
00a3b368	mov w26,#0x1
00a3b36c	b.cc 0x00a3b288
00a3b370	b 0x00a3b3f0
00a3b374	mov w26,#0x1
00a3b378	b 0x00a3b438
00a3b37c	mov x22,xzr
00a3b380	mov x23,xzr
00a3b384	b 0x00a3b3f4
00a3b388	mov w26,wzr
00a3b38c	b 0x00a3b438
00a3b390	ldr x8,[x23]
00a3b394	ldr x0,[x22]
00a3b398	ldr x1,[x8, #0x20]
00a3b39c	bl 0x00c36990
00a3b3a0	cbnz x0,0x00a3b0f8
00a3b3a4	b 0x00a3b3ec
00a3b3a8	mov w1,#0x1
00a3b3ac	mov x0,x8
00a3b3b0	bl 0x00c37720
00a3b3b4	cbnz w0,0x00a3b0f8
00a3b3b8	b 0x00a3b3ec
00a3b3bc	bl 0x00c342a0
00a3b3c0	adrp x0,0x2c7000
00a3b3c4	adrp x2,0x2d1000
00a3b3c8	add x0,x0,#0x8a7
00a3b3cc	add x2,x2,#0x906
00a3b3d0	mov w1,#0x4fb
00a3b3d4	bl 0x00c342b0
00a3b3d8	mov w1,#0x3
00a3b3dc	mov w0,#0x10
00a3b3e0	movk w1,#0x8, LSL #16
00a3b3e4	mov x2,xzr
00a3b3e8	bl 0x00c342c0
00a3b3ec	mov w26,wzr
00a3b3f0	mov x23,x22
00a3b3f4	mov x0,x21
00a3b3f8	bl 0x00c38a20
00a3b3fc	mov x0,x20
00a3b400	bl 0x00c38a30
00a3b404	cbz x23,0x00a3b438
00a3b408	mov x20,xzr
00a3b40c	ldr x0,[x23, x20, LSL #0x3]
00a3b410	cbz x0,0x00a3b424
00a3b414	bl 0x00c322e0
00a3b418	add x20,x20,#0x1
00a3b41c	cmp x20,x19
00a3b420	b.cc 0x00a3b40c
00a3b424	adrp x1,0x2c7000
00a3b428	add x1,x1,#0x8a7
00a3b42c	mov w2,#0x550
00a3b430	mov x0,x22
00a3b434	bl 0x00c32310
00a3b438	mov w0,w26
00a3b43c	ldp x29,x30,[sp, #0x50]
00a3b440	ldp x20,x19,[sp, #0x40]
00a3b444	ldp x22,x21,[sp, #0x30]
00a3b448	ldp x24,x23,[sp, #0x20]
00a3b44c	ldp x26,x25,[sp, #0x10]
00a3b450	ldp x28,x27,[sp], #0x60
00a3b454	ret
