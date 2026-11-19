; EVP_DecryptUpdate @ 00a5b130
00a5b130	sub sp,sp,#0x60
00a5b134	stp x24,x23,[sp, #0x20]
00a5b138	mov w24,w4
00a5b13c	stp x26,x25,[sp, #0x10]
00a5b140	stp x22,x21,[sp, #0x30]
00a5b144	stp x20,x19,[sp, #0x40]
00a5b148	stp x29,x30,[sp, #0x50]
00a5b14c	add x29,sp,#0x50
00a5b150	cbz x2,0x00a5b190
00a5b154	str wzr,[x2]
00a5b158	ldr w8,[x0, #0x10]
00a5b15c	mov x19,x2
00a5b160	mov x21,x0
00a5b164	cbz w8,0x00a5b1e0
00a5b168	bl 0x00c342a0
00a5b16c	adrp x0,0x2a5000
00a5b170	adrp x2,0x2d3000
00a5b174	add x0,x0,#0xf9d
00a5b178	add x2,x2,#0xb12
00a5b17c	mov w1,#0x32e
00a5b180	bl 0x00c342b0
00a5b184	orr w0,wzr,#0x6
00a5b188	mov w1,#0x94
00a5b18c	b 0x00a5b1b8
00a5b190	bl 0x00c342a0
00a5b194	adrp x0,0x2a5000
00a5b198	adrp x2,0x2d3000
00a5b19c	add x0,x0,#0xf9d
00a5b1a0	add x2,x2,#0xb12
00a5b1a4	mov w1,#0x328
00a5b1a8	bl 0x00c342b0
00a5b1ac	mov w1,#0x102
00a5b1b0	orr w0,wzr,#0x6
00a5b1b4	movk w1,#0xc, LSL #16
00a5b1b8	mov x2,xzr
00a5b1bc	bl 0x00c342c0
00a5b1c0	mov w0,wzr
00a5b1c4	ldp x29,x30,[sp, #0x50]
00a5b1c8	ldp x20,x19,[sp, #0x40]
00a5b1cc	ldp x22,x21,[sp, #0x30]
00a5b1d0	ldp x24,x23,[sp, #0x20]
00a5b1d4	ldp x26,x25,[sp, #0x10]
00a5b1d8	add sp,sp,#0x60
00a5b1dc	ret
00a5b1e0	ldr x8,[x21]
00a5b1e4	cbz x8,0x00a5b270
00a5b1e8	ldr x9,[x8, #0x78]
00a5b1ec	mov x22,x3
00a5b1f0	mov x20,x1
00a5b1f4	sxtw x25,w24
00a5b1f8	cbz x9,0x00a5b298
00a5b1fc	mov x0,x21
00a5b200	bl 0x00c36d40
00a5b204	cmp w0,#0x1
00a5b208	b.lt 0x00a5b340
00a5b20c	ldr x8,[x21]
00a5b210	ldr x9,[x8, #0xa8]
00a5b214	cbz x9,0x00a5b340
00a5b218	ldr x8,[x21, #0xa8]
00a5b21c	sxtw x10,w0
00a5b220	cmp w0,#0x1
00a5b224	csel x10,xzr,x10,eq
00a5b228	add x3,x10,x25
00a5b22c	add x2,sp,#0x8
00a5b230	mov x0,x8
00a5b234	mov x1,x20
00a5b238	mov x4,x22
00a5b23c	mov x5,x25
00a5b240	blr x9
00a5b244	cbz w0,0x00a5b1c4
00a5b248	ldr x8,[sp, #0x8]
00a5b24c	lsr x9,x8,#0x1f
00a5b250	cbz x9,0x00a5b3f0
00a5b254	bl 0x00c342a0
00a5b258	adrp x0,0x2a5000
00a5b25c	adrp x2,0x2d3000
00a5b260	add x0,x0,#0xf9d
00a5b264	add x2,x2,#0xb12
00a5b268	mov w1,#0x345
00a5b26c	b 0x00a5b358
00a5b270	bl 0x00c342a0
00a5b274	adrp x0,0x2a5000
00a5b278	adrp x2,0x2d3000
00a5b27c	add x0,x0,#0xf9d
00a5b280	add x2,x2,#0xb12
00a5b284	mov w1,#0x333
00a5b288	bl 0x00c342b0
00a5b28c	orr w0,wzr,#0x6
00a5b290	mov w1,#0x83
00a5b294	b 0x00a5b1b8
00a5b298	ldr w23,[x8, #0x4]
00a5b29c	mov w1,#0x2000
00a5b2a0	mov x0,x21
00a5b2a4	sxtw x26,w23
00a5b2a8	bl 0x00c3cce0
00a5b2ac	mov w9,w24
00a5b2b0	cbz w0,0x00a5b2c8
00a5b2b4	add w8,w24,#0x7
00a5b2b8	add w9,w24,#0xe
00a5b2bc	cmp w8,#0x0
00a5b2c0	csel w8,w9,w8,lt
00a5b2c4	asr w9,w8,#0x3
00a5b2c8	ldr x8,[x21]
00a5b2cc	ldrb w10,[x8, #0x12]
00a5b2d0	tbnz w10,#0x4,0x00a5b368
00a5b2d4	cmp w24,#0x0
00a5b2d8	b.le 0x00a5b3f8
00a5b2dc	ldrb w8,[x21, #0x71]
00a5b2e0	tbnz w8,#0x0,0x00a5b404
00a5b2e4	cmp w23,#0x21
00a5b2e8	b.cs 0x00a5b500
00a5b2ec	ldr w8,[x21, #0x80]
00a5b2f0	cbz w8,0x00a5b42c
00a5b2f4	subs x9,x20,x22
00a5b2f8	b.eq 0x00a5b324
00a5b2fc	cmp x9,x26
00a5b300	neg x10,x26
00a5b304	cset w8,cc
00a5b308	cmp x9,x10
00a5b30c	cset w10,hi
00a5b310	cbz x9,0x00a5b434
00a5b314	cmp w26,#0x1
00a5b318	b.lt 0x00a5b434
00a5b31c	orr w8,w8,w10
00a5b320	cbz w8,0x00a5b434
00a5b324	bl 0x00c342a0
00a5b328	adrp x0,0x2a5000
00a5b32c	adrp x2,0x2d3000
00a5b330	add x0,x0,#0xf9d
00a5b334	add x2,x2,#0xb12
00a5b338	mov w1,#0x372
00a5b33c	b 0x00a5b3b8
00a5b340	bl 0x00c342a0
00a5b344	adrp x0,0x2a5000
00a5b348	adrp x2,0x2d3000
00a5b34c	add x0,x0,#0xf9d
00a5b350	add x2,x2,#0xb12
00a5b354	mov w1,#0x33c
00a5b358	bl 0x00c342b0
00a5b35c	orr w0,wzr,#0x6
00a5b360	mov w1,#0xbd
00a5b364	b 0x00a5b1b8
00a5b368	cmp w26,#0x1
00a5b36c	b.ne 0x00a5b3c8
00a5b370	sub x12,x20,x22
00a5b374	sxtw x10,w9
00a5b378	cmp x12,x10
00a5b37c	neg x11,x10
00a5b380	cset w10,cc
00a5b384	cmp x12,x11
00a5b388	cset w11,hi
00a5b38c	cbz x12,0x00a5b3c8
00a5b390	cmp w9,#0x1
00a5b394	b.lt 0x00a5b3c8
00a5b398	orr w9,w10,w11
00a5b39c	cbz w9,0x00a5b3c8
00a5b3a0	bl 0x00c342a0
00a5b3a4	adrp x0,0x2a5000
00a5b3a8	adrp x2,0x2d3000
00a5b3ac	add x0,x0,#0xf9d
00a5b3b0	add x2,x2,#0xb12
00a5b3b4	mov w1,#0x357
00a5b3b8	bl 0x00c342b0
00a5b3bc	orr w0,wzr,#0x6
00a5b3c0	mov w1,#0xa2
00a5b3c4	b 0x00a5b1b8
00a5b3c8	ldr x8,[x8, #0x28]
00a5b3cc	mov x0,x21
00a5b3d0	mov x1,x20
00a5b3d4	mov x2,x22
00a5b3d8	mov x3,x25
00a5b3dc	blr x8
00a5b3e0	tbnz w0,#0x1f,0x00a5b420
00a5b3e4	str w0,[x19]
00a5b3e8	mov w0,#0x1
00a5b3ec	b 0x00a5b1c4
00a5b3f0	str w8,[x19]
00a5b3f4	b 0x00a5b1c4
00a5b3f8	str wzr,[x19]
00a5b3fc	cset w0,eq
00a5b400	b 0x00a5b1c4
00a5b404	mov x0,x21
00a5b408	mov x1,x20
00a5b40c	mov x2,x19
00a5b410	mov x3,x22
00a5b414	mov w4,w24
00a5b418	bl 0x00a5bc20
00a5b41c	b 0x00a5b1c4
00a5b420	mov w0,wzr
00a5b424	str wzr,[x19]
00a5b428	b 0x00a5b1c4
00a5b42c	mov w25,wzr
00a5b430	b 0x00a5b48c
00a5b434	neg w8,w26
00a5b438	orr w9,wzr,#0x7fffffff
00a5b43c	and w8,w8,w24
00a5b440	sub w9,w9,w23
00a5b444	cmp w8,w9
00a5b448	b.ls 0x00a5b474
00a5b44c	bl 0x00c342a0
00a5b450	adrp x0,0x2a5000
00a5b454	adrp x2,0x2d3000
00a5b458	add x0,x0,#0xf9d
00a5b45c	add x2,x2,#0xb12
00a5b460	mov w1,#0x37f
00a5b464	bl 0x00c342b0
00a5b468	orr w0,wzr,#0x6
00a5b46c	mov w1,#0xca
00a5b470	b 0x00a5b1b8
00a5b474	add x1,x21,#0x88
00a5b478	mov x0,x20
00a5b47c	mov x2,x23
00a5b480	bl 0x00c2ffd0
00a5b484	add x20,x20,x23
00a5b488	mov w25,#0x1
00a5b48c	mov x0,x21
00a5b490	mov x1,x20
00a5b494	mov x2,x19
00a5b498	mov x3,x22
00a5b49c	mov w4,w24
00a5b4a0	bl 0x00a5bc20
00a5b4a4	cbz w0,0x00a5b1c4
00a5b4a8	cmp w26,#0x2
00a5b4ac	b.cc 0x00a5b4b8
00a5b4b0	ldr w8,[x21, #0x14]
00a5b4b4	cbz w8,0x00a5b4d0
00a5b4b8	str wzr,[x21, #0x80]
00a5b4bc	cbz w25,0x00a5b3e8
00a5b4c0	ldr w8,[x19]
00a5b4c4	add w8,w8,w23
00a5b4c8	str w8,[x19]
00a5b4cc	b 0x00a5b3e8
00a5b4d0	ldr w8,[x19]
00a5b4d4	mov w9,#0x1
00a5b4d8	add x0,x21,#0x88
00a5b4dc	mov x2,x23
00a5b4e0	sub w8,w8,w23
00a5b4e4	str w8,[x19]
00a5b4e8	str w9,[x21, #0x80]
00a5b4ec	ldrsw x8,[x19]
00a5b4f0	add x1,x20,x8
00a5b4f4	bl 0x00c2ffd0
00a5b4f8	cbnz w25,0x00a5b4c0
00a5b4fc	b 0x00a5b3e8
00a5b500	adrp x0,0x2d9000
00a5b504	adrp x1,0x2a5000
00a5b508	add x0,x0,#0xc6b
00a5b50c	add x1,x1,#0xf9d
00a5b510	mov w2,#0x36c
00a5b514	bl 0x00c3c240
