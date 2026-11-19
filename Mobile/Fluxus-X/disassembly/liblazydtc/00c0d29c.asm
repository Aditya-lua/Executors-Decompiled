; std::__ndk1::__get_classname @ 00c0d29c
00c0d29c	paciasp
00c0d2a0	stp x29,x30,[sp, #-0x40]!
00c0d2a4	stp x24,x23,[sp, #0x10]
00c0d2a8	stp x22,x21,[sp, #0x20]
00c0d2ac	stp x20,x19,[sp, #0x30]
00c0d2b0	mov x29,sp
00c0d2b4	mov w19,w1
00c0d2b8	mov x20,x0
00c0d2bc	mov w22,#0xf
00c0d2c0	nop
00c0d2c4	adr x21,0xcb0338
00c0d2c8	lsr x23,x22,#0x1
00c0d2cc	mov x1,x20
00c0d2d0	add x24,x21,x23, LSL #0x4
00c0d2d4	ldr x0,[x24], #0x10
00c0d2d8	bl 0x00c301f0
00c0d2dc	mvn x8,x23
00c0d2e0	cmp w0,#0x0
00c0d2e4	add x8,x22,x8
00c0d2e8	csel x21,x24,x21,lt
00c0d2ec	csel x22,x8,x23,lt
00c0d2f0	cbnz x22,0x00c0d2c8
00c0d2f4	adrp x8,0xcb0000
00c0d2f8	add x8,x8,#0x428
00c0d2fc	cmp x21,x8
00c0d300	b.eq 0x00c0d314
00c0d304	ldr x1,[x21]
00c0d308	mov x0,x20
00c0d30c	bl 0x00c301f0
00c0d310	cbz w0,0x00c0d330
00c0d314	mov w0,wzr
00c0d318	ldp x20,x19,[sp, #0x30]
00c0d31c	ldp x22,x21,[sp, #0x20]
00c0d320	ldp x24,x23,[sp, #0x10]
00c0d324	ldp x29,x30,[sp], #0x40
00c0d328	autiasp
00c0d32c	ret
00c0d330	ldrh w8,[x21, #0x8]
00c0d334	mov w9,#0x8078
00c0d338	cmp w8,#0x8, LSL #12
00c0d33c	csel w0,w8,w9,ne
00c0d340	tbz w19,#0x0,0x00c0d318
00c0d344	cmp w8,#0x8, LSL #12
00c0d348	b.eq 0x00c0d318
00c0d34c	orr w9,w8,#0x20
00c0d350	tst w8,#0x18
00c0d354	csel w0,w8,w9,eq
00c0d358	b 0x00c0d318
