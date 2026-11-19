; ossl_bn_miller_rabin_is_prime @ 00a1afa0
00a1afa0	sub sp,sp,#0x90
00a1afa4	stp x28,x27,[sp, #0x30]
00a1afa8	stp x26,x25,[sp, #0x40]
00a1afac	stp x24,x23,[sp, #0x50]
00a1afb0	stp x22,x21,[sp, #0x60]
00a1afb4	stp x20,x19,[sp, #0x70]
00a1afb8	stp x29,x30,[sp, #0x80]
00a1afbc	add x29,sp,#0x80
00a1afc0	mov x24,x5
00a1afc4	mov w21,w4
00a1afc8	mov x23,x3
00a1afcc	mov x19,x2
00a1afd0	mov w28,w1
00a1afd4	mov x20,x0
00a1afd8	bl 0x00c38d10
00a1afdc	cbz w0,0x00a1b0fc
00a1afe0	mov x0,x19
00a1afe4	str w21,[sp, #0x1c]
00a1afe8	bl 0x00c38a90
00a1afec	mov x0,x19
00a1aff0	bl 0x00c38a40
00a1aff4	mov x25,x0
00a1aff8	mov x0,x19
00a1affc	bl 0x00c38a40
00a1b000	mov x21,x0
00a1b004	mov x0,x19
00a1b008	bl 0x00c38a40
00a1b00c	mov x22,x0
00a1b010	mov x0,x19
00a1b014	bl 0x00c38a40
00a1b018	str x0,[sp, #0x20]
00a1b01c	mov x0,x19
00a1b020	bl 0x00c38a40
00a1b024	mov x27,x0
00a1b028	mov x0,x19
00a1b02c	bl 0x00c38a40
00a1b030	str x0,[sp, #0x28]
00a1b034	mov x0,x19
00a1b038	bl 0x00c38a40
00a1b03c	mov x26,x0
00a1b040	cbz x0,0x00a1b09c
00a1b044	mov x0,x21
00a1b048	mov x1,x20
00a1b04c	bl 0x00c36990
00a1b050	cbz x0,0x00a1b09c
00a1b054	mov w1,#0x1
00a1b058	mov x0,x21
00a1b05c	bl 0x00c38fd0
00a1b060	cbz w0,0x00a1b09c
00a1b064	mov x0,x22
00a1b068	mov x1,x20
00a1b06c	bl 0x00c36990
00a1b070	cbz x0,0x00a1b09c
00a1b074	orr w1,wzr,#0x3
00a1b078	mov x0,x22
00a1b07c	bl 0x00c38fd0
00a1b080	cbz w0,0x00a1b09c
00a1b084	mov x0,x22
00a1b088	bl 0x00c369b0
00a1b08c	cbnz w0,0x00a1b09c
00a1b090	mov x0,x22
00a1b094	bl 0x00c37f40
00a1b098	cbz w0,0x00a1b124
00a1b09c	mov x24,x27
00a1b0a0	mov w20,wzr
00a1b0a4	mov x27,xzr
00a1b0a8	ldr x23,[sp, #0x20]
00a1b0ac	ldr x28,[sp, #0x28]
00a1b0b0	mov x0,x25
00a1b0b4	bl 0x00c38ca0
00a1b0b8	mov x0,x21
00a1b0bc	bl 0x00c38ca0
00a1b0c0	mov x0,x22
00a1b0c4	bl 0x00c38ca0
00a1b0c8	mov x0,x23
00a1b0cc	bl 0x00c38ca0
00a1b0d0	mov x0,x24
00a1b0d4	bl 0x00c38ca0
00a1b0d8	mov x0,x28
00a1b0dc	bl 0x00c38ca0
00a1b0e0	mov x0,x26
00a1b0e4	bl 0x00c38ca0
00a1b0e8	mov x0,x19
00a1b0ec	bl 0x00c38a20
00a1b0f0	mov x0,x27
00a1b0f4	bl 0x00c38f70
00a1b0f8	b 0x00a1b100
00a1b0fc	mov w20,wzr
00a1b100	mov w0,w20
00a1b104	ldp x29,x30,[sp, #0x80]
00a1b108	ldp x20,x19,[sp, #0x70]
00a1b10c	ldp x22,x21,[sp, #0x60]
00a1b110	ldp x24,x23,[sp, #0x50]
00a1b114	ldp x26,x25,[sp, #0x40]
00a1b118	ldp x28,x27,[sp, #0x30]
00a1b11c	add sp,sp,#0x90
00a1b120	ret
00a1b124	str x25,[sp, #0x10]
00a1b128	mov w25,wzr
00a1b12c	str x24,[sp]
00a1b130	add w25,w25,#0x1
00a1b134	mov x0,x21
00a1b138	mov w1,w25
00a1b13c	bl 0x00c38d00
00a1b140	cbz w0,0x00a1b130
00a1b144	mov x0,x27
00a1b148	mov x1,x21
00a1b14c	mov w2,w25
00a1b150	mov x24,x27
00a1b154	bl 0x00c39070
00a1b158	cbz w0,0x00a1b19c
00a1b15c	bl 0x00c38f80
00a1b160	mov x27,x0
00a1b164	cbz x0,0x00a1b3c4
00a1b168	mov x0,x27
00a1b16c	mov x1,x20
00a1b170	mov x2,x19
00a1b174	bl 0x00c38f90
00a1b178	cbz w0,0x00a1b3c4
00a1b17c	cbz w28,0x00a1b1a8
00a1b180	cmp w28,#0x1
00a1b184	b.ge 0x00a1b1c0
00a1b188	orr w8,wzr,#0x3
00a1b18c	ldr x9,[sp]
00a1b190	str w8,[x9]
00a1b194	mov w20,#0x1
00a1b198	b 0x00a1b3c8
00a1b19c	mov w20,wzr
00a1b1a0	mov x27,xzr
00a1b1a4	b 0x00a1b3c8
00a1b1a8	mov x0,x20
00a1b1ac	bl 0x00c322f0
00a1b1b0	cmp w0,#0x800
00a1b1b4	mov w8,#0x40
00a1b1b8	mov w9,#0x80
00a1b1bc	csel w28,w9,w8,gt
00a1b1c0	str wzr,[sp, #0x8]
00a1b1c4	mov x0,x26
00a1b1c8	mov x1,x22
00a1b1cc	mov w2,wzr
00a1b1d0	mov x3,x19
00a1b1d4	bl 0x00c39160
00a1b1d8	cbz w0,0x00a1b3c4
00a1b1dc	mov w1,#0x2
00a1b1e0	mov x0,x26
00a1b1e4	bl 0x00c376e0
00a1b1e8	cbz w0,0x00a1b3c4
00a1b1ec	ldr w8,[sp, #0x1c]
00a1b1f0	cbz w8,0x00a1b218
00a1b1f4	ldr x0,[sp, #0x10]
00a1b1f8	mov x1,x26
00a1b1fc	mov x2,x20
00a1b200	mov x3,x19
00a1b204	bl 0x00c38b10
00a1b208	cbz w0,0x00a1b3c4
00a1b20c	ldr x0,[sp, #0x10]
00a1b210	bl 0x00c38d20
00a1b214	cbz w0,0x00a1b3d0
00a1b218	ldr x0,[sp, #0x28]
00a1b21c	mov x1,x26
00a1b220	mov x2,x24
00a1b224	mov x3,x20
00a1b228	mov x4,x19
00a1b22c	mov x5,x27
00a1b230	bl 0x00c38ae0
00a1b234	cbz w0,0x00a1b3c4
00a1b238	ldr x0,[sp, #0x28]
00a1b23c	bl 0x00c38d20
00a1b240	cbz w0,0x00a1b278
00a1b244	cbz x23,0x00a1b324
00a1b248	ldr w8,[x23]
00a1b24c	cmp w8,#0x2
00a1b250	b.eq 0x00a1b30c
00a1b254	cmp w8,#0x1
00a1b258	b.ne 0x00a1b3c4
00a1b25c	ldr x8,[x23, #0x10]
00a1b260	cbz x8,0x00a1b324
00a1b264	ldr x2,[x23, #0x8]
00a1b268	ldr w1,[sp, #0x8]
00a1b26c	mov w0,#0x1
00a1b270	blr x8
00a1b274	b 0x00a1b324
00a1b278	ldr x0,[sp, #0x28]
00a1b27c	mov x1,x21
00a1b280	bl 0x00c38cc0
00a1b284	cbz w0,0x00a1b244
00a1b288	ldp x0,x1,[sp, #0x20]
00a1b28c	bl 0x00c36990
00a1b290	cmp x0,#0x0
00a1b294	cset w8,ne
00a1b298	cmp w25,#0x2
00a1b29c	b.cc 0x00a1b33c
00a1b2a0	mov w9,#0x1
00a1b2a4	str w9,[sp, #0xc]
00a1b2a8	tbz w8,#0x0,0x00a1b3c4
00a1b2ac	ldp x1,x0,[sp, #0x20]
00a1b2b0	mov x3,x20
00a1b2b4	mov x4,x19
00a1b2b8	mov x2,x1
00a1b2bc	bl 0x00c38ef0
00a1b2c0	cbz w0,0x00a1b3c4
00a1b2c4	ldr x0,[sp, #0x28]
00a1b2c8	mov x1,x21
00a1b2cc	bl 0x00c38cc0
00a1b2d0	cbz w0,0x00a1b244
00a1b2d4	ldr x0,[sp, #0x28]
00a1b2d8	bl 0x00c38d20
00a1b2dc	cbnz w0,0x00a1b378
00a1b2e0	ldr w8,[sp, #0xc]
00a1b2e4	ldp x0,x1,[sp, #0x20]
00a1b2e8	add w8,w8,#0x1
00a1b2ec	str w8,[sp, #0xc]
00a1b2f0	bl 0x00c36990
00a1b2f4	ldr w9,[sp, #0xc]
00a1b2f8	cmp x0,#0x0
00a1b2fc	cset w8,ne
00a1b300	cmp w9,w25
00a1b304	b.cc 0x00a1b2a8
00a1b308	b 0x00a1b33c
00a1b30c	ldr x8,[x23, #0x10]
00a1b310	ldr w1,[sp, #0x8]
00a1b314	mov w0,#0x1
00a1b318	mov x2,x23
00a1b31c	blr x8
00a1b320	cbz w0,0x00a1b3c4
00a1b324	ldr w8,[sp, #0x8]
00a1b328	add w8,w8,#0x1
00a1b32c	cmp w8,w28
00a1b330	str w8,[sp, #0x8]
00a1b334	b.lt 0x00a1b1c4
00a1b338	b 0x00a1b188
00a1b33c	cbz w8,0x00a1b3c4
00a1b340	ldp x1,x28,[sp, #0x20]
00a1b344	mov x3,x20
00a1b348	mov x4,x19
00a1b34c	mov x0,x28
00a1b350	mov x2,x1
00a1b354	bl 0x00c38ef0
00a1b358	cbz w0,0x00a1b3f4
00a1b35c	mov x0,x28
00a1b360	bl 0x00c38d20
00a1b364	cbnz w0,0x00a1b378
00a1b368	ldr x0,[sp, #0x20]
00a1b36c	mov x1,x28
00a1b370	bl 0x00c36990
00a1b374	cbz x0,0x00a1b3f4
00a1b378	ldr w8,[sp, #0x1c]
00a1b37c	cbz w8,0x00a1b3e0
00a1b380	ldr x23,[sp, #0x20]
00a1b384	mov w1,#0x1
00a1b388	mov x0,x23
00a1b38c	bl 0x00c38fd0
00a1b390	ldr x25,[sp, #0x10]
00a1b394	cbz w0,0x00a1b3ec
00a1b398	mov x0,x25
00a1b39c	mov x1,x23
00a1b3a0	mov x2,x20
00a1b3a4	mov x3,x19
00a1b3a8	bl 0x00c38b10
00a1b3ac	cbz w0,0x00a1b3ec
00a1b3b0	mov x0,x25
00a1b3b4	bl 0x00c38d20
00a1b3b8	cbz w0,0x00a1b3d0
00a1b3bc	mov w8,#0x2
00a1b3c0	b 0x00a1b18c
00a1b3c4	mov w20,wzr
00a1b3c8	ldr x25,[sp, #0x10]
00a1b3cc	b 0x00a1b0a8
00a1b3d0	ldr x8,[sp]
00a1b3d4	mov w20,#0x1
00a1b3d8	str w20,[x8]
00a1b3dc	b 0x00a1b3c8
00a1b3e0	ldr x8,[sp]
00a1b3e4	str wzr,[x8]
00a1b3e8	b 0x00a1b194
00a1b3ec	mov w20,wzr
00a1b3f0	b 0x00a1b0ac
00a1b3f4	ldr x25,[sp, #0x10]
00a1b3f8	ldr x23,[sp, #0x20]
00a1b3fc	mov w20,wzr
00a1b400	b 0x00a1b0b0
