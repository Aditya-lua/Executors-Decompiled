; FUN_00a8b218 @ 00a8b218
00a8b218	stp x22,x21,[sp, #-0x30]!
00a8b21c	stp x20,x19,[sp, #0x10]
00a8b220	stp x29,x30,[sp, #0x20]
00a8b224	add x29,sp,#0x20
00a8b228	mov x20,x2
00a8b22c	mov x21,x1
00a8b230	mov x22,x0
00a8b234	bl 0x00c3cea0
00a8b238	orr x8,x21,x20
00a8b23c	cbz x8,0x00a8b2a8
00a8b240	mov x19,x0
00a8b244	cbz x21,0x00a8b2b0
00a8b248	mov x0,x22
00a8b24c	bl 0x00c3cca0
00a8b250	lsl w1,w0,#0x3
00a8b254	mov x0,x21
00a8b258	mov x2,x19
00a8b25c	bl 0x00c373a0
00a8b260	adrp x2,0xcb5000
00a8b264	ldr x2,[x2, #0x318]
00a8b268	add x21,x19,#0x120
00a8b26c	mov w22,w0
00a8b270	mov x0,x21
00a8b274	mov x1,x19
00a8b278	bl 0x00c3e390
00a8b27c	tbnz w22,#0x1f,0x00a8b2cc
00a8b280	cbz x20,0x00a8b300
00a8b284	ldrsw x2,[x19, #0x2e0]
00a8b288	mov x0,x21
00a8b28c	mov x1,x20
00a8b290	bl 0x00c3e3a0
00a8b294	mov w8,#0x1
00a8b298	str w8,[x19, #0x11c]
00a8b29c	mov w0,#0x1
00a8b2a0	str w0,[x19, #0x118]
00a8b2a4	b 0x00a8b330
00a8b2a8	mov w0,#0x1
00a8b2ac	b 0x00a8b330
00a8b2b0	ldr w8,[x19, #0x118]
00a8b2b4	cbz w8,0x00a8b314
00a8b2b8	ldrsw x2,[x19, #0x2e0]
00a8b2bc	add x0,x19,#0x120
00a8b2c0	mov x1,x20
00a8b2c4	bl 0x00c3e3a0
00a8b2c8	b 0x00a8b324
00a8b2cc	bl 0x00c342a0
00a8b2d0	adrp x0,0x2b2000
00a8b2d4	adrp x2,0x2b0000
00a8b2d8	add x0,x0,#0x30b
00a8b2dc	add x2,x2,#0x161
00a8b2e0	mov w1,#0xe6
00a8b2e4	bl 0x00c342b0
00a8b2e8	orr w0,wzr,#0x6
00a8b2ec	mov w1,#0xb0
00a8b2f0	mov x2,xzr
00a8b2f4	bl 0x00c342c0
00a8b2f8	mov w0,wzr
00a8b2fc	b 0x00a8b330
00a8b300	ldr w8,[x19, #0x11c]
00a8b304	cbz w8,0x00a8b29c
00a8b308	ldr x20,[x19, #0x2d8]
00a8b30c	cbnz x20,0x00a8b284
00a8b310	b 0x00a8b29c
00a8b314	ldr x0,[x19, #0x2d8]
00a8b318	ldrsw x2,[x19, #0x2e0]
00a8b31c	mov x1,x20
00a8b320	bl 0x00c2ffd0
00a8b324	mov w0,#0x1
00a8b328	str w0,[x19, #0x11c]
00a8b32c	str wzr,[x19, #0x2e8]
00a8b330	ldp x29,x30,[sp, #0x20]
00a8b334	ldp x20,x19,[sp, #0x10]
00a8b338	ldp x22,x21,[sp], #0x30
00a8b33c	ret
