; psa_cipher_encrypt @ 00b8b0d8
00b8b0d8	sub sp,sp,#0xb0
00b8b0dc	stp x28,x27,[sp, #0x50]
00b8b0e0	stp x26,x25,[sp, #0x60]
00b8b0e4	stp x24,x23,[sp, #0x70]
00b8b0e8	stp x22,x21,[sp, #0x80]
00b8b0ec	stp x20,x19,[sp, #0x90]
00b8b0f0	stp x29,x30,[sp, #0xa0]
00b8b0f4	add x29,sp,#0xa0
00b8b0f8	mrs x21,tpidr_el0
00b8b0fc	ldr x8,[x21, #0x28]
00b8b100	and w9,w1,#0x7f000000
00b8b104	mov w10,#0x4000000
00b8b108	mov x24,x6
00b8b10c	mov x26,x5
00b8b110	mov x19,x4
00b8b114	mov x20,x3
00b8b118	mov x28,x2
00b8b11c	mov w22,w1
00b8b120	cmp w9,w10
00b8b124	str x8,[sp, #0x48]
00b8b128	str xzr,[sp, #0x30]
00b8b12c	b.ne 0x00b8b15c
00b8b130	add x1,sp,#0x30
00b8b134	mov w2,#0x100
00b8b138	mov w3,w22
00b8b13c	bl 0x00b86e5c
00b8b140	mov w27,w0
00b8b144	cbz w0,0x00b8b1ec
00b8b148	mov x23,xzr
00b8b14c	mov x26,xzr
00b8b150	mov x25,xzr
00b8b154	mov x20,xzr
00b8b158	b 0x00b8b170
00b8b15c	mov x23,xzr
00b8b160	mov x26,xzr
00b8b164	mov x25,xzr
00b8b168	mov x20,xzr
00b8b16c	mov w27,#0xffffff79
00b8b170	ldr x0,[sp, #0x30]
00b8b174	bl 0x00c431e0
00b8b178	mov x8,xzr
00b8b17c	mov x19,x20
00b8b180	mov x0,x23
00b8b184	str x8,[x24]
00b8b188	bl 0x00c30960
00b8b18c	cbz x25,0x00b8b1b8
00b8b190	cbz x19,0x00b8b1b4
00b8b194	cbz x26,0x00b8b1a8
00b8b198	mov x0,x19
00b8b19c	mov x1,x25
00b8b1a0	mov x2,x26
00b8b1a4	bl 0x00c2ffd0
00b8b1a8	mov x0,x25
00b8b1ac	bl 0x00c30960
00b8b1b0	b 0x00b8b1b8
00b8b1b4	mov w27,#0xffffff69
00b8b1b8	ldr x8,[x21, #0x28]
00b8b1bc	ldr x9,[sp, #0x48]
00b8b1c0	cmp x8,x9
00b8b1c4	b.ne 0x00b8b4d8
00b8b1c8	mov w0,w27
00b8b1cc	ldp x29,x30,[sp, #0xa0]
00b8b1d0	ldp x20,x19,[sp, #0x90]
00b8b1d4	ldp x22,x21,[sp, #0x80]
00b8b1d8	ldp x24,x23,[sp, #0x70]
00b8b1dc	ldp x26,x25,[sp, #0x60]
00b8b1e0	ldp x28,x27,[sp, #0x50]
00b8b1e4	add sp,sp,#0xb0
00b8b1e8	ret
00b8b1ec	ldr x8,[sp, #0x30]
00b8b1f0	ldrh w8,[x8]
00b8b1f4	and w9,w8,#0x7000
00b8b1f8	cmp w9,#0x2, LSL #12
00b8b1fc	b.ne 0x00b8b2a0
00b8b200	and w9,w8,#0x700
00b8b204	cbz w9,0x00b8b2a0
00b8b208	mov w9,#0xfff
00b8b20c	movk w9,#0x4c0, LSL #16
00b8b210	cmp w22,w9
00b8b214	b.gt 0x00b8b24c
00b8b218	mov w9,#0x4000
00b8b21c	movk w9,#0x440, LSL #16
00b8b220	cmp w22,w9
00b8b224	b.eq 0x00b8b27c
00b8b228	mov w9,#0x4100
00b8b22c	movk w9,#0x440, LSL #16
00b8b230	cmp w22,w9
00b8b234	b.eq 0x00b8b27c
00b8b238	mov w9,#0xff00
00b8b23c	movk w9,#0x440, LSL #16
00b8b240	cmp w22,w9
00b8b244	b.eq 0x00b8b27c
00b8b248	b 0x00b8b2a0
00b8b24c	mov w9,#0x1000
00b8b250	movk w9,#0x4c0, LSL #16
00b8b254	cmp w22,w9
00b8b258	b.eq 0x00b8b27c
00b8b25c	mov w9,#0x1100
00b8b260	movk w9,#0x4c0, LSL #16
00b8b264	cmp w22,w9
00b8b268	b.eq 0x00b8b27c
00b8b26c	mov w9,#0x1200
00b8b270	movk w9,#0x4c0, LSL #16
00b8b274	cmp w22,w9
00b8b278	b.ne 0x00b8b2a0
00b8b27c	ubfx w8,w8,#0x8,#0x3
00b8b280	cmp w8,#0x4
00b8b284	b.ls 0x00b8b304
00b8b288	mov x23,xzr
00b8b28c	mov x26,xzr
00b8b290	mov x25,xzr
00b8b294	mov x20,xzr
00b8b298	mov w27,#0xffffff7c
00b8b29c	b 0x00b8b170
00b8b2a0	mov w9,#0x100
00b8b2a4	movk w9,#0x480, LSL #16
00b8b2a8	cmp w22,w9
00b8b2ac	b.ne 0x00b8b2e0
00b8b2b0	mov w9,#0x2004
00b8b2b4	cmp w8,w9
00b8b2b8	b.ne 0x00b8b2e0
00b8b2bc	orr w10,wzr,#0xc
00b8b2c0	cmp x10,x26
00b8b2c4	b.ls 0x00b8b314
00b8b2c8	mov x23,xzr
00b8b2cc	mov x26,xzr
00b8b2d0	mov x25,xzr
00b8b2d4	mov x20,xzr
00b8b2d8	mov w27,#0xffffff76
00b8b2dc	b 0x00b8b170
00b8b2e0	mov w8,#0x1300
00b8b2e4	movk w8,#0x4c0, LSL #16
00b8b2e8	cmp w22,w8
00b8b2ec	mov x8,xzr
00b8b2f0	b.ne 0x00b8b3b0
00b8b2f4	mov w10,#0xd
00b8b2f8	cmp x10,x26
00b8b2fc	b.hi 0x00b8b2c8
00b8b300	b 0x00b8b314
00b8b304	mov w9,#0x1
00b8b308	lsl w10,w9,w8
00b8b30c	cmp x10,x26
00b8b310	b.hi 0x00b8b2c8
00b8b314	adrp x8,0xd25000
00b8b318	add x8,x8,#0xb10
00b8b31c	ldrb w9,[x8, #0x1]
00b8b320	mov w27,#0xffffff77
00b8b324	cmp w9,#0x2
00b8b328	b.ne 0x00b8b148
00b8b32c	ldrb w9,[x8]
00b8b330	stp x26,x20,[sp, #0x18]
00b8b334	mov x23,xzr
00b8b338	mov x26,xzr
00b8b33c	mov x25,xzr
00b8b340	cmp w9,#0x7
00b8b344	mov x20,xzr
00b8b348	b.ne 0x00b8b170
00b8b34c	add x23,sp,#0x38
00b8b350	mov w20,#0x400
00b8b354	add x25,x8,#0x358
00b8b358	mov x27,x10
00b8b35c	str x10,[sp, #0x28]
00b8b360	cmp x27,#0x400
00b8b364	csel x26,x27,x20,cc
00b8b368	mov x0,x25
00b8b36c	mov x1,x23
00b8b370	mov x2,x26
00b8b374	bl 0x00c303a0
00b8b378	cbnz w0,0x00b8b39c
00b8b37c	subs x27,x27,x26
00b8b380	add x23,x23,x26
00b8b384	b.ne 0x00b8b360
00b8b388	ldp x26,x20,[sp, #0x18]
00b8b38c	ldr x8,[sp, #0x28]
00b8b390	str x8,[sp, #0x28]
00b8b394	cbnz x20,0x00b8b3b8
00b8b398	b 0x00b8b3e4
00b8b39c	bl 0x00c42bf0
00b8b3a0	ldp x26,x20,[sp, #0x18]
00b8b3a4	ldr x8,[sp, #0x28]
00b8b3a8	mov w27,w0
00b8b3ac	cbnz w0,0x00b8b148
00b8b3b0	str x8,[sp, #0x28]
00b8b3b4	cbz x20,0x00b8b3e4
00b8b3b8	mov w1,#0x1
00b8b3bc	mov x0,x20
00b8b3c0	bl 0x00c30a30
00b8b3c4	mov x23,x0
00b8b3c8	cbz x0,0x00b8b48c
00b8b3cc	mov x0,x23
00b8b3d0	mov x1,x28
00b8b3d4	mov x2,x20
00b8b3d8	bl 0x00c2ffd0
00b8b3dc	cbnz x26,0x00b8b3ec
00b8b3e0	b 0x00b8b40c
00b8b3e4	mov x23,xzr
00b8b3e8	cbz x26,0x00b8b40c
00b8b3ec	mov w1,#0x1
00b8b3f0	mov x0,x26
00b8b3f4	bl 0x00c30a30
00b8b3f8	mov x25,x0
00b8b3fc	mov x9,x26
00b8b400	cbnz x0,0x00b8b418
00b8b404	mov x26,xzr
00b8b408	b 0x00b8b494
00b8b40c	mov x9,x26
00b8b410	mov x25,xzr
00b8b414	mov x19,xzr
00b8b418	ldr x0,[sp, #0x30]
00b8b41c	ldr w8,[x0, #0x4]
00b8b420	cmp w8,#0x100
00b8b424	b.cs 0x00b8b480
00b8b428	ldr x5,[sp, #0x28]
00b8b42c	ldp x1,x2,[x0, #0x28]
00b8b430	cmp x25,#0x0
00b8b434	add x4,sp,#0x38
00b8b438	sub x8,x9,x5
00b8b43c	add x9,x25,x5
00b8b440	csel x9,xzr,x9,eq
00b8b444	mov w3,w22
00b8b448	mov x6,x23
00b8b44c	mov x7,x20
00b8b450	stp x8,x24,[sp, #0x8]
00b8b454	str x9,[sp]
00b8b458	bl 0x00c42ea0
00b8b45c	ldr x8,[sp, #0x30]
00b8b460	mov w22,w0
00b8b464	mov x0,x8
00b8b468	bl 0x00c431e0
00b8b46c	mov w27,w0
00b8b470	cbz w22,0x00b8b4a0
00b8b474	mov x8,xzr
00b8b478	mov w27,w22
00b8b47c	b 0x00b8b180
00b8b480	mov w27,#0xffffff79
00b8b484	mov x20,x19
00b8b488	b 0x00b8b170
00b8b48c	mov x26,xzr
00b8b490	mov x25,xzr
00b8b494	mov x20,xzr
00b8b498	mov w27,#0xffffff73
00b8b49c	b 0x00b8b170
00b8b4a0	cbz w27,0x00b8b4ac
00b8b4a4	mov x8,xzr
00b8b4a8	b 0x00b8b180
00b8b4ac	ldr x9,[sp, #0x28]
00b8b4b0	cbz x9,0x00b8b4c8
00b8b4b4	ldr x2,[sp, #0x28]
00b8b4b8	add x1,sp,#0x38
00b8b4bc	mov x0,x25
00b8b4c0	bl 0x00c2ffd0
00b8b4c4	ldr x9,[sp, #0x28]
00b8b4c8	ldr x8,[x24]
00b8b4cc	mov w27,wzr
00b8b4d0	add x8,x8,x9
00b8b4d4	b 0x00b8b180
00b8b4d8	bl 0x00c2fec0
