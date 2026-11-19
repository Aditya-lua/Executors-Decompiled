; FUN_00b6c17c @ 00b6c17c
00b6c17c	sub sp,sp,#0x80
00b6c180	str x27,[sp, #0x20]
00b6c184	stp x26,x25,[sp, #0x30]
00b6c188	stp x24,x23,[sp, #0x40]
00b6c18c	stp x22,x21,[sp, #0x50]
00b6c190	stp x20,x19,[sp, #0x60]
00b6c194	stp x29,x30,[sp, #0x70]
00b6c198	add x29,sp,#0x70
00b6c19c	mrs x27,tpidr_el0
00b6c1a0	ldr x8,[x27, #0x28]
00b6c1a4	sub x9,x4,#0x7
00b6c1a8	mov x21,x7
00b6c1ac	mov x22,x6
00b6c1b0	mov x23,x5
00b6c1b4	mov x24,x4
00b6c1b8	mov x25,x3
00b6c1bc	mov x19,x2
00b6c1c0	mov x20,x0
00b6c1c4	cmp x9,#0x6
00b6c1c8	str x8,[sp, #0x18]
00b6c1cc	b.ls 0x00b6c1d8
00b6c1d0	orr w0,wzr,#0xfffffff3
00b6c1d4	b 0x00b6c24c
00b6c1d8	and w8,w24,#0xff
00b6c1dc	orr w9,wzr,#0xf
00b6c1e0	orr w10,wzr,#0xe
00b6c1e4	sub w9,w9,w8
00b6c1e8	add x26,x20,#0x11
00b6c1ec	sub w8,w10,w8
00b6c1f0	stp w9,w1,[x20, #0x40]
00b6c1f4	mov x0,x26
00b6c1f8	mov x1,x25
00b6c1fc	mov x2,x24
00b6c200	stp xzr,xzr,[x20, #0x10]
00b6c204	strb w8,[x20, #0x10]
00b6c208	bl 0x00c2ffd0
00b6c20c	ldr w2,[x20, #0x40]
00b6c210	add x0,x26,x24
00b6c214	mov w1,wzr
00b6c218	bl 0x00c301c0
00b6c21c	mov w8,#0x1
00b6c220	add x0,x20,#0x1
00b6c224	mov x1,x25
00b6c228	mov x2,x24
00b6c22c	strb w8,[x20, #0x1f]
00b6c230	bl 0x00c2ffd0
00b6c234	ldr w8,[x20, #0xa8]
00b6c238	mov x0,x20
00b6c23c	orr w8,w8,#0x1
00b6c240	str w8,[x20, #0xa8]
00b6c244	bl 0x00b6b1c8
00b6c248	cbz w0,0x00b6c27c
00b6c24c	ldr x8,[x27, #0x28]
00b6c250	ldr x9,[sp, #0x18]
00b6c254	cmp x8,x9
00b6c258	b.ne 0x00b6c338
00b6c25c	ldp x29,x30,[sp, #0x70]
00b6c260	ldp x20,x19,[sp, #0x60]
00b6c264	ldp x22,x21,[sp, #0x50]
00b6c268	ldp x24,x23,[sp, #0x40]
00b6c26c	ldp x26,x25,[sp, #0x30]
00b6c270	ldr x27,[sp, #0x20]
00b6c274	add sp,sp,#0x80
00b6c278	ret
00b6c27c	lsr x8,x22,#0x8
00b6c280	cmp x8,#0xfe
00b6c284	orr w0,wzr,#0xfffffff3
00b6c288	b.hi 0x00b6c24c
00b6c28c	ldr x24,[x29, #0x20]
00b6c290	cmp x24,#0x2
00b6c294	b.eq 0x00b6c24c
00b6c298	cmp x24,#0x10
00b6c29c	b.hi 0x00b6c24c
00b6c2a0	tbnz w24,#0x0,0x00b6c24c
00b6c2a4	ldr w8,[x20, #0xa8]
00b6c2a8	mov x0,x20
00b6c2ac	stp x19,x22,[x20, #0x20]
00b6c2b0	stp x24,xzr,[x20, #0x30]
00b6c2b4	orr w8,w8,#0x2
00b6c2b8	str w8,[x20, #0xa8]
00b6c2bc	bl 0x00b6b1c8
00b6c2c0	cbnz w0,0x00b6c24c
00b6c2c4	mov x0,x20
00b6c2c8	mov x1,x23
00b6c2cc	mov x2,x22
00b6c2d0	bl 0x00c42060
00b6c2d4	cbnz w0,0x00b6c24c
00b6c2d8	ldr x22,[x29, #0x10]
00b6c2dc	mov x5,sp
00b6c2e0	mov x0,x20
00b6c2e4	mov x1,x21
00b6c2e8	mov x2,x19
00b6c2ec	mov x3,x22
00b6c2f0	mov x4,x19
00b6c2f4	bl 0x00c42050
00b6c2f8	cbnz w0,0x00b6c24c
00b6c2fc	add x1,sp,#0x8
00b6c300	mov x0,x20
00b6c304	mov x2,x24
00b6c308	bl 0x00c41ff0
00b6c30c	cbnz w0,0x00b6c24c
00b6c310	ldr x0,[x29, #0x18]
00b6c314	add x1,sp,#0x8
00b6c318	mov x2,x24
00b6c31c	bl 0x00c42190
00b6c320	cbz w0,0x00b6c24c
00b6c324	mov x0,x22
00b6c328	mov x1,x19
00b6c32c	bl 0x00c42220
00b6c330	orr w0,wzr,#0xfffffff1
00b6c334	b 0x00b6c24c
00b6c338	bl 0x00c2fec0
