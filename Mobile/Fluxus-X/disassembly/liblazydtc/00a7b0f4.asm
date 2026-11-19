; ossl_ecdh_kdf_X9_63 @ 00a7b0f4
00a7b0f4	sub sp,sp,#0x140
00a7b0f8	stp x29,x30,[sp, #0x130]
00a7b0fc	add x29,sp,#0x130
00a7b100	stp x22,x21,[sp, #0x110]
00a7b104	ldr x22,[x29, #0x10]
00a7b108	mov x21,x0
00a7b10c	mov x0,x6
00a7b110	stp x28,x27,[sp, #0xe0]
00a7b114	stp x26,x25,[sp, #0xf0]
00a7b118	stp x24,x23,[sp, #0x100]
00a7b11c	stp x20,x19,[sp, #0x120]
00a7b120	mov x19,x7
00a7b124	mov x23,x5
00a7b128	mov x24,x4
00a7b12c	mov x25,x3
00a7b130	mov x26,x2
00a7b134	mov x20,x1
00a7b138	bl 0x00c36230
00a7b13c	adrp x1,0x2b5000
00a7b140	mov x27,x0
00a7b144	add x1,x1,#0xd3f
00a7b148	mov x0,x19
00a7b14c	mov x2,x22
00a7b150	bl 0x00c36210
00a7b154	mov x19,x0
00a7b158	bl 0x00c361f0
00a7b15c	cbz x0,0x00a7b23c
00a7b160	mov x22,x0
00a7b164	adrp x0,0x29d000
00a7b168	add x0,x0,#0xe2e
00a7b16c	add x8,sp,#0x8
00a7b170	mov x1,x27
00a7b174	mov x2,xzr
00a7b178	add x28,sp,#0x30
00a7b17c	bl 0x00c36280
00a7b180	ldr x8,[sp, #0x28]
00a7b184	ldur q0,[sp, #0x18]
00a7b188	ldur q1,[sp, #0x8]
00a7b18c	adrp x0,0x2c5000
00a7b190	str x8,[sp, #0x50]
00a7b194	add x0,x0,#0x67e
00a7b198	add x8,sp,#0x8
00a7b19c	mov x1,x26
00a7b1a0	mov x2,x25
00a7b1a4	stp q1,q0,[sp, #0x30]
00a7b1a8	bl 0x00c34c50
00a7b1ac	ldr x8,[sp, #0x28]
00a7b1b0	ldur q0,[sp, #0x18]
00a7b1b4	ldur q1,[sp, #0x8]
00a7b1b8	adrp x0,0x29e000
00a7b1bc	str x8,[sp, #0x78]
00a7b1c0	add x0,x0,#0x225
00a7b1c4	add x8,sp,#0x8
00a7b1c8	mov x1,x24
00a7b1cc	mov x2,x23
00a7b1d0	stur q0,[sp, #0x68]
00a7b1d4	stur q1,[sp, #0x58]
00a7b1d8	bl 0x00c34c50
00a7b1dc	ldr x8,[sp, #0x28]
00a7b1e0	ldur q0,[sp, #0x18]
00a7b1e4	ldur q1,[sp, #0x8]
00a7b1e8	str x8,[sp, #0xa0]
00a7b1ec	add x8,sp,#0x8
00a7b1f0	str q0,[x28, #0x60]
00a7b1f4	str q1,[sp, #0x80]
00a7b1f8	bl 0x00c34c40
00a7b1fc	ldr x8,[sp, #0x28]
00a7b200	ldur q0,[sp, #0x18]
00a7b204	ldur q1,[sp, #0x8]
00a7b208	add x3,sp,#0x30
00a7b20c	mov x0,x22
00a7b210	mov x1,x21
00a7b214	mov x2,x20
00a7b218	str x8,[sp, #0xc8]
00a7b21c	stur q0,[x28, #0x88]
00a7b220	stur q1,[x28, #0x78]
00a7b224	bl 0x00c36200
00a7b228	cmp w0,#0x0
00a7b22c	mov x0,x22
00a7b230	cset w20,gt
00a7b234	bl 0x00c361e0
00a7b238	b 0x00a7b240
00a7b23c	mov w20,wzr
00a7b240	mov x0,x19
00a7b244	bl 0x00c36220
00a7b248	mov w0,w20
00a7b24c	ldp x29,x30,[sp, #0x130]
00a7b250	ldp x20,x19,[sp, #0x120]
00a7b254	ldp x22,x21,[sp, #0x110]
00a7b258	ldp x24,x23,[sp, #0x100]
00a7b25c	ldp x26,x25,[sp, #0xf0]
00a7b260	ldp x28,x27,[sp, #0xe0]
00a7b264	add sp,sp,#0x140
00a7b268	ret
