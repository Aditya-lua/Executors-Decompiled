; mbedtls_chachapoly_encrypt_and_tag @ 00b6d2e0
00b6d2e0	sub sp,sp,#0xb0
00b6d2e4	str x27,[sp, #0x50]
00b6d2e8	stp x26,x25,[sp, #0x60]
00b6d2ec	stp x24,x23,[sp, #0x70]
00b6d2f0	stp x22,x21,[sp, #0x80]
00b6d2f4	stp x20,x19,[sp, #0x90]
00b6d2f8	stp x29,x30,[sp, #0xa0]
00b6d2fc	add x29,sp,#0xa0
00b6d300	mrs x27,tpidr_el0
00b6d304	ldr x8,[x27, #0x28]
00b6d308	mov x23,x1
00b6d30c	mov x1,x2
00b6d310	mov w2,wzr
00b6d314	mov x19,x7
00b6d318	mov x21,x6
00b6d31c	mov x22,x5
00b6d320	mov x24,x4
00b6d324	mov x25,x3
00b6d328	mov x20,x0
00b6d32c	str x8,[sp, #0x48]
00b6d330	bl 0x00c420a0
00b6d334	mov w26,w0
00b6d338	cbnz w0,0x00b6d390
00b6d33c	movi v0.2D,#0x0
00b6d340	mov w1,#0x40
00b6d344	add x2,sp,#0x8
00b6d348	add x3,sp,#0x8
00b6d34c	mov x0,x20
00b6d350	stur q0,[sp, #0x38]
00b6d354	stur q0,[sp, #0x28]
00b6d358	stur q0,[sp, #0x18]
00b6d35c	stur q0,[sp, #0x8]
00b6d360	bl 0x00c420b0
00b6d364	mov w26,w0
00b6d368	cbnz w0,0x00b6d390
00b6d36c	add x0,x20,#0x88
00b6d370	add x1,sp,#0x8
00b6d374	bl 0x00c42280
00b6d378	mov w26,w0
00b6d37c	cbnz w0,0x00b6d390
00b6d380	adrp x8,0x29a000
00b6d384	ldr d0,[x8, #0xd30]
00b6d388	stp xzr,xzr,[x20, #0xd8]
00b6d38c	str d0,[x20, #0xe8]
00b6d390	add x0,sp,#0x8
00b6d394	mov w1,#0x40
00b6d398	bl 0x00c42220
00b6d39c	cbnz w26,0x00b6d404
00b6d3a0	ldr w8,[x20, #0xe8]
00b6d3a4	cmp w8,#0x1
00b6d3a8	b.ne 0x00b6d400
00b6d3ac	ldr x8,[x20, #0xd8]
00b6d3b0	add x0,x20,#0x88
00b6d3b4	mov x1,x25
00b6d3b8	mov x2,x24
00b6d3bc	add x8,x8,x24
00b6d3c0	str x8,[x20, #0xd8]
00b6d3c4	bl 0x00c42290
00b6d3c8	mov w26,w0
00b6d3cc	cbnz w0,0x00b6d404
00b6d3d0	mov x0,x20
00b6d3d4	mov x1,x23
00b6d3d8	mov x2,x22
00b6d3dc	mov x3,x21
00b6d3e0	bl 0x00c42130
00b6d3e4	mov w26,w0
00b6d3e8	cbnz w0,0x00b6d404
00b6d3ec	mov x0,x20
00b6d3f0	mov x1,x19
00b6d3f4	bl 0x00c420e0
00b6d3f8	mov w26,w0
00b6d3fc	b 0x00b6d404
00b6d400	mov w26,#0xffffffac
00b6d404	ldr x8,[x27, #0x28]
00b6d408	ldr x9,[sp, #0x48]
00b6d40c	cmp x8,x9
00b6d410	b.ne 0x00b6d438
00b6d414	mov w0,w26
00b6d418	ldp x29,x30,[sp, #0xa0]
00b6d41c	ldp x20,x19,[sp, #0x90]
00b6d420	ldp x22,x21,[sp, #0x80]
00b6d424	ldp x24,x23,[sp, #0x70]
00b6d428	ldp x26,x25,[sp, #0x60]
00b6d42c	ldr x27,[sp, #0x50]
00b6d430	add sp,sp,#0xb0
00b6d434	ret
00b6d438	bl 0x00c2fec0
