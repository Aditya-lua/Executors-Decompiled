; mbedtls_cipher_finish @ 00b6a340
00b6a340	stp x22,x21,[sp, #-0x30]!
00b6a344	stp x20,x19,[sp, #0x10]
00b6a348	stp x29,x30,[sp, #0x20]
00b6a34c	add x29,sp,#0x20
00b6a350	ldr x8,[x0]
00b6a354	mov x19,x2
00b6a358	mov x21,x0
00b6a35c	mov x20,x1
00b6a360	cbz x8,0x00b6a3e0
00b6a364	str xzr,[x19]
00b6a368	ldr w9,[x8, #0x8]
00b6a36c	and w10,w9,#0xf000
00b6a370	cmp w10,#0x2, LSL #12
00b6a374	b.ne 0x00b6a380
00b6a378	ldr x10,[x21, #0x18]
00b6a37c	cbz x10,0x00b6a3e0
00b6a380	lsr w10,w9,#0xc
00b6a384	add w11,w10,#0x7
00b6a388	mvn w10,w11
00b6a38c	tst w10,#0xf
00b6a390	mov w10,#0x4c0000
00b6a394	b.eq 0x00b6a3a8
00b6a398	and x11,x11,#0xf
00b6a39c	mov w12,#0x7c03
00b6a3a0	lsr w11,w12,w11
00b6a3a4	tbnz w11,#0x0,0x00b6a44c
00b6a3a8	and w11,w9,#0xfe0000
00b6a3ac	cmp w11,w10
00b6a3b0	mov w0,wzr
00b6a3b4	b.eq 0x00b6a3e4
00b6a3b8	ubfx w10,w9,#0xc,#0x4
00b6a3bc	cmp w10,#0x2
00b6a3c0	b.eq 0x00b6a3f4
00b6a3c4	cmp w10,#0x1
00b6a3c8	b.ne 0x00b6a444
00b6a3cc	ldr x8,[x21, #0x30]
00b6a3d0	cmp x8,#0x0
00b6a3d4	mov w8,#0xffff9d80
00b6a3d8	csel w0,wzr,w8,eq
00b6a3dc	b 0x00b6a3e4
00b6a3e0	mov w0,#0xffff9f00
00b6a3e4	ldp x29,x30,[sp, #0x20]
00b6a3e8	ldp x20,x19,[sp, #0x10]
00b6a3ec	ldp x22,x21,[sp], #0x30
00b6a3f0	ret
00b6a3f4	ldr w1,[x21, #0xc]
00b6a3f8	cmp w1,#0x1
00b6a3fc	b.ne 0x00b6a454
00b6a400	ldr x8,[x21, #0x10]
00b6a404	cbz x8,0x00b6a3cc
00b6a408	ldr x10,[x21, #0x48]
00b6a40c	lsr w9,w9,#0x3
00b6a410	ldr x2,[x21, #0x30]
00b6a414	and w9,w9,#0x1c
00b6a418	cmp x10,#0x0
00b6a41c	add x22,x21,#0x20
00b6a420	csel w9,w9,w10,eq
00b6a424	sxtw x1,w9
00b6a428	mov x0,x22
00b6a42c	blr x8
00b6a430	ldr x8,[x21]
00b6a434	ldr w1,[x21, #0xc]
00b6a438	ldr w9,[x8, #0x8]
00b6a43c	and x10,x9,#0x1f
00b6a440	b 0x00b6a468
00b6a444	mov w0,#0xffff9f80
00b6a448	b 0x00b6a3e4
00b6a44c	mov w0,wzr
00b6a450	b 0x00b6a3e4
00b6a454	ldr x11,[x21, #0x30]
00b6a458	and w10,w9,#0x1f
00b6a45c	cmp x11,x10
00b6a460	b.ne 0x00b6a4c0
00b6a464	add x22,x21,#0x20
00b6a468	adrp x11,0xcb5000
00b6a46c	ldr x11,[x11, #0xa80]
00b6a470	ubfx w9,w9,#0x1a,#0x5
00b6a474	ldr x0,[x21, #0x50]
00b6a478	cmp x8,#0x0
00b6a47c	ldr x9,[x11, w9, UXTW #0x3]
00b6a480	csel x2,xzr,x10,eq
00b6a484	add x3,x21,#0x38
00b6a488	mov x4,x22
00b6a48c	ldr x9,[x9, #0x10]
00b6a490	mov x5,x20
00b6a494	blr x9
00b6a498	cbnz w0,0x00b6a3e4
00b6a49c	ldr w8,[x21, #0xc]
00b6a4a0	cbz w8,0x00b6a4cc
00b6a4a4	ldr x8,[x21]
00b6a4a8	cbz x8,0x00b6a4b4
00b6a4ac	ldr w8,[x8, #0x8]
00b6a4b0	and x8,x8,#0x1f
00b6a4b4	mov w0,wzr
00b6a4b8	str x8,[x19]
00b6a4bc	b 0x00b6a3e4
00b6a4c0	ldr x8,[x21, #0x10]
00b6a4c4	orr x8,x11,x8
00b6a4c8	b 0x00b6a3d0
00b6a4cc	ldr x8,[x21]
00b6a4d0	ldr x3,[x21, #0x18]
00b6a4d4	cbz x8,0x00b6a4e4
00b6a4d8	ldr w8,[x8, #0x8]
00b6a4dc	and x1,x8,#0x1f
00b6a4e0	b 0x00b6a4e8
00b6a4e4	mov x1,xzr
00b6a4e8	mov x0,x20
00b6a4ec	mov x2,x19
00b6a4f0	ldp x29,x30,[sp, #0x20]
00b6a4f4	ldp x20,x19,[sp, #0x10]
00b6a4f8	ldp x22,x21,[sp], #0x30
00b6a4fc	br x3
