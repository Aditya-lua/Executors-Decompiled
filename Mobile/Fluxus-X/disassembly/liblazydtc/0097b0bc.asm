; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::sentry::sentry @ 0097b0bc
0097b0bc	sub sp,sp,#0x50
0097b0c0	str x23,[sp, #0x10]
0097b0c4	stp x22,x21,[sp, #0x20]
0097b0c8	stp x20,x19,[sp, #0x30]
0097b0cc	stp x29,x30,[sp, #0x40]
0097b0d0	add x29,sp,#0x40
0097b0d4	mrs x23,tpidr_el0
0097b0d8	ldr x8,[x23, #0x28]
0097b0dc	mov x19,x0
0097b0e0	mov x20,x1
0097b0e4	mov w21,w2
0097b0e8	str x8,[sp, #0x8]
0097b0ec	strb wzr,[x0]
0097b0f0	ldr x8,[x1]
0097b0f4	ldur x8,[x8, #-0x18]
0097b0f8	add x0,x1,x8
0097b0fc	ldr w8,[x0, #0x20]
0097b100	cbz w8,0x0097b110
0097b104	orr w1,w8,#0x4
0097b108	bl 0x00c30130
0097b10c	b 0x0097b280
0097b110	ldr x0,[x0, #0x88]
0097b114	cbz x0,0x0097b11c
0097b118	bl 0x00c30e50
0097b11c	tbnz w21,#0x0,0x0097b264
0097b120	ldr x8,[x20]
0097b124	ldur x8,[x8, #-0x18]
0097b128	add x0,x20,x8
0097b12c	ldrb w8,[x0, #0x9]
0097b130	tbz w8,#0x4,0x0097b264
0097b134	mov x8,sp
0097b138	bl 0x00c30070
0097b13c	adrp x1,0xcb4000
0097b140	ldr x1,[x1, #0x998]
0097b144	mov x0,sp
0097b148	bl 0x00c30080
0097b14c	mov x22,x0
0097b150	mov x0,sp
0097b154	bl 0x00c30090
0097b158	ldr x8,[x20]
0097b15c	ldur x8,[x8, #-0x18]
0097b160	add x8,x20,x8
0097b164	ldr x21,[x8, #0x28]
0097b168	cbz x21,0x0097b208
0097b16c	ldp x8,x9,[x21, #0x18]
0097b170	cmp x8,x9
0097b174	b.ne 0x0097b190
0097b178	ldr x8,[x21]
0097b17c	mov x0,x21
0097b180	ldr x8,[x8, #0x48]
0097b184	blr x8
0097b188	cmn w0,#0x1
0097b18c	b.eq 0x0097b240
0097b190	ldp x8,x9,[x21, #0x18]
0097b194	cmp x8,x9
0097b198	b.eq 0x0097b1ac
0097b19c	ldrb w0,[x8]
0097b1a0	sxtb w8,w0
0097b1a4	tbz w8,#0x1f,0x0097b1c4
0097b1a8	b 0x0097b214
0097b1ac	ldr x8,[x21]
0097b1b0	mov x0,x21
0097b1b4	ldr x8,[x8, #0x48]
0097b1b8	blr x8
0097b1bc	sxtb w8,w0
0097b1c0	tbnz w8,#0x1f,0x0097b214
0097b1c4	ldr x8,[x22, #0x10]
0097b1c8	and w9,w0,#0xff
0097b1cc	lsl x9,x9,#0x3
0097b1d0	ldrb w8,[x8, x9]
0097b1d4	tbz w8,#0x0,0x0097b214
0097b1d8	ldp x8,x9,[x21, #0x18]
0097b1dc	cmp x8,x9
0097b1e0	b.eq 0x0097b1f4
0097b1e4	add x8,x8,#0x1
0097b1e8	str x8,[x21, #0x18]
0097b1ec	cbnz x21,0x0097b16c
0097b1f0	b 0x0097b208
0097b1f4	ldr x8,[x21]
0097b1f8	mov x0,x21
0097b1fc	ldr x8,[x8, #0x50]
0097b200	blr x8
0097b204	cbnz x21,0x0097b16c
0097b208	mov x0,xzr
0097b20c	cbnz x21,0x0097b21c
0097b210	b 0x0097b24c
0097b214	mov x0,x21
0097b218	cbz x21,0x0097b24c
0097b21c	ldp x8,x9,[x0, #0x18]
0097b220	cmp x8,x9
0097b224	b.ne 0x0097b264
0097b228	ldr x8,[x21]
0097b22c	ldr x8,[x8, #0x48]
0097b230	blr x8
0097b234	cmn w0,#0x1
0097b238	b.ne 0x0097b264
0097b23c	b 0x0097b24c
0097b240	mov x21,xzr
0097b244	mov x0,xzr
0097b248	cbnz x21,0x0097b21c
0097b24c	ldr x8,[x20]
0097b250	ldur x8,[x8, #-0x18]
0097b254	add x0,x20,x8
0097b258	ldr w8,[x0, #0x20]
0097b25c	orr w1,w8,#0x6
0097b260	bl 0x00c30130
0097b264	ldr x8,[x20]
0097b268	ldur x8,[x8, #-0x18]
0097b26c	add x8,x20,x8
0097b270	ldr w8,[x8, #0x20]
0097b274	cmp w8,#0x0
0097b278	cset w8,eq
0097b27c	strb w8,[x19]
0097b280	ldr x8,[x23, #0x28]
0097b284	ldr x9,[sp, #0x8]
0097b288	cmp x8,x9
0097b28c	b.ne 0x0097b2a8
0097b290	ldp x29,x30,[sp, #0x40]
0097b294	ldp x20,x19,[sp, #0x30]
0097b298	ldp x22,x21,[sp, #0x20]
0097b29c	ldr x23,[sp, #0x10]
0097b2a0	add sp,sp,#0x50
0097b2a4	ret
0097b2a8	bl 0x00c2fec0
