; FUN_00c0c1fc @ 00c0c1fc
00c0c1fc	paciasp
00c0c200	sub sp,sp,#0x60
00c0c204	stp x29,x30,[sp, #0x10]
00c0c208	stp x26,x25,[sp, #0x20]
00c0c20c	stp x24,x23,[sp, #0x30]
00c0c210	stp x22,x21,[sp, #0x40]
00c0c214	stp x20,x19,[sp, #0x50]
00c0c218	add x29,sp,#0x10
00c0c21c	cmp x0,x1
00c0c220	mov x19,x2
00c0c224	b.eq 0x00c0c2c4
00c0c228	ldrb w24,[x0]
00c0c22c	mov w21,w3
00c0c230	mov x20,x1
00c0c234	mov x22,x0
00c0c238	cmp w24,#0x2d
00c0c23c	b.ne 0x00c0c24c
00c0c240	add x22,x22,#0x1
00c0c244	cmp x22,x20
00c0c248	b.eq 0x00c0c2c4
00c0c24c	bl 0x00c30710
00c0c250	ldr w25,[x0]
00c0c254	str wzr,[x0]
00c0c258	adrp x8,0xd27000
00c0c25c	add x8,x8,#0xf8
00c0c260	mov x23,x0
00c0c264	adrp x26,0xd27000
00c0c268	ldarb w8,[x8]
00c0c26c	tbz w8,#0x0,0x00c0c304
00c0c270	ldr x3,[x26, #0xf0]
00c0c274	add x1,sp,#0x8
00c0c278	mov x0,x22
00c0c27c	mov w2,w21
00c0c280	bl 0x00c43950
00c0c284	ldr w8,[x23]
00c0c288	cbz w8,0x00c0c2b4
00c0c28c	ldr x9,[sp, #0x8]
00c0c290	cmp x9,x20
00c0c294	b.ne 0x00c0c2c4
00c0c298	lsr x9,x0,#0x10
00c0c29c	cbnz x9,0x00c0c2f8
00c0c2a0	cmp w8,#0x22
00c0c2a4	b.eq 0x00c0c2f8
00c0c2a8	cmp w24,#0x2d
00c0c2ac	cneg w0,w0,eq
00c0c2b0	b 0x00c0c2d0
00c0c2b4	ldr x8,[sp, #0x8]
00c0c2b8	str w25,[x23]
00c0c2bc	cmp x8,x20
00c0c2c0	b.eq 0x00c0c2f0
00c0c2c4	mov w0,wzr
00c0c2c8	mov w8,#0x4
00c0c2cc	str w8,[x19]
00c0c2d0	ldp x20,x19,[sp, #0x50]
00c0c2d4	ldp x22,x21,[sp, #0x40]
00c0c2d8	ldp x24,x23,[sp, #0x30]
00c0c2dc	ldp x26,x25,[sp, #0x20]
00c0c2e0	ldp x29,x30,[sp, #0x10]
00c0c2e4	add sp,sp,#0x60
00c0c2e8	autiasp
00c0c2ec	ret
00c0c2f0	cmp x0,#0x10, LSL #12
00c0c2f4	b.cc 0x00c0c2a8
00c0c2f8	mov w8,#0x4
00c0c2fc	mov w0,#0xffff
00c0c300	b 0x00c0c2cc
00c0c304	adrp x0,0xd27000
00c0c308	add x0,x0,#0xf8
00c0c30c	bl 0x00c2fe90
00c0c310	cbz w0,0x00c0c270
00c0c314	adrp x1,0x2c6000
00c0c318	add x1,x1,#0xbfc
00c0c31c	mov w0,#0x1fbf
00c0c320	mov x2,xzr
00c0c324	bl 0x00c43890
00c0c328	str x0,[x26, #0xf0]
00c0c32c	adrp x0,0xd27000
00c0c330	add x0,x0,#0xf8
00c0c334	bl 0x00c2fea0
00c0c338	b 0x00c0c270
