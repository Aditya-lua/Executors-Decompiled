; BIO_new_from_core_bio @ 00a819ac
00a819ac	str x21,[sp, #-0x30]!
00a819b0	adrp x2,0xc61000
00a819b4	stp x20,x19,[sp, #0x10]
00a819b8	mov x19,x1
00a819bc	add x2,x2,#0x408
00a819c0	mov w1,#0x11
00a819c4	stp x29,x30,[sp, #0x20]
00a819c8	add x29,sp,#0x20
00a819cc	mov x20,x0
00a819d0	bl 0x00c3b520
00a819d4	cbz x0,0x00a81a2c
00a819d8	ldr x8,[x0, #0x8]
00a819dc	mov x21,x0
00a819e0	cbnz x8,0x00a819ec
00a819e4	ldr x8,[x21]
00a819e8	cbz x8,0x00a81a2c
00a819ec	adrp x1,0xc61000
00a819f0	add x1,x1,#0x3a8
00a819f4	mov x0,x20
00a819f8	bl 0x00c38650
00a819fc	mov x20,x0
00a81a00	cbz x0,0x00a81a30
00a81a04	ldr x8,[x21, #0x28]
00a81a08	mov x0,x19
00a81a0c	blr x8
00a81a10	cbz w0,0x00a81a24
00a81a14	mov x0,x20
00a81a18	mov x1,x19
00a81a1c	bl 0x00c32290
00a81a20	b 0x00a81a30
00a81a24	mov x0,x20
00a81a28	bl 0x00c31a40
00a81a2c	mov x20,xzr
00a81a30	mov x0,x20
00a81a34	ldp x29,x30,[sp, #0x20]
00a81a38	ldp x20,x19,[sp, #0x10]
00a81a3c	ldr x21,[sp], #0x30
00a81a40	ret
