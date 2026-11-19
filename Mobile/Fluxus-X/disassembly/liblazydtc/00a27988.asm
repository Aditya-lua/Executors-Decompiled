; ossl_ec_key_param_from_x509_algor @ 00a27988
00a27988	sub sp,sp,#0x40
00a2798c	stp x29,x30,[sp, #0x30]
00a27990	add x29,sp,#0x30
00a27994	stp x20,x19,[sp, #0x20]
00a27998	mov x19,x2
00a2799c	mov x20,x1
00a279a0	mov x3,x0
00a279a4	sub x1,x29,#0x14
00a279a8	add x2,sp,#0x10
00a279ac	mov x0,xzr
00a279b0	stur wzr,[x29, #-0x14]
00a279b4	str xzr,[sp, #0x10]
00a279b8	bl 0x00c32b50
00a279bc	mov x0,x20
00a279c0	mov x1,x19
00a279c4	bl 0x00c3a840
00a279c8	str x0,[sp, #0x8]
00a279cc	cbz x0,0x00a27a20
00a279d0	ldur w8,[x29, #-0x14]
00a279d4	cmp w8,#0x6
00a279d8	b.eq 0x00a27a4c
00a279dc	cmp w8,#0x10
00a279e0	b.ne 0x00a27a98
00a279e4	ldr x8,[sp, #0x10]
00a279e8	add x0,sp,#0x8
00a279ec	mov x1,sp
00a279f0	ldr x9,[x8, #0x8]
00a279f4	str x9,[sp]
00a279f8	ldrsw x2,[x8]
00a279fc	bl 0x00c3a900
00a27a00	cbnz x0,0x00a27a90
00a27a04	bl 0x00c342a0
00a27a08	adrp x0,0x2b2000
00a27a0c	adrp x2,0x2c3000
00a27a10	add x0,x0,#0x127
00a27a14	add x2,x2,#0x7e1
00a27a18	mov w1,#0x313
00a27a1c	b 0x00a27ab0
00a27a20	bl 0x00c342a0
00a27a24	adrp x0,0x2b2000
00a27a28	adrp x2,0x2c3000
00a27a2c	add x0,x0,#0x127
00a27a30	add x2,x2,#0x7e1
00a27a34	mov w1,#0x308
00a27a38	bl 0x00c342b0
00a27a3c	mov w1,#0x100
00a27a40	mov w0,#0x10
00a27a44	movk w1,#0xc, LSL #16
00a27a48	b 0x00a27abc
00a27a4c	ldr x0,[sp, #0x10]
00a27a50	bl 0x00c37750
00a27a54	mov w2,w0
00a27a58	mov x0,x20
00a27a5c	mov x1,x19
00a27a60	bl 0x00c3ac40
00a27a64	mov x19,x0
00a27a68	cbz x0,0x00a27ac8
00a27a6c	mov w1,#0x1
00a27a70	mov x0,x19
00a27a74	bl 0x00c3aaf0
00a27a78	ldr x0,[sp, #0x8]
00a27a7c	mov x1,x19
00a27a80	bl 0x00c3a880
00a27a84	cbz w0,0x00a27ac8
00a27a88	mov x0,x19
00a27a8c	bl 0x00c3a770
00a27a90	ldr x0,[sp, #0x8]
00a27a94	b 0x00a27adc
00a27a98	bl 0x00c342a0
00a27a9c	adrp x0,0x2b2000
00a27aa0	adrp x2,0x2c3000
00a27aa4	add x0,x0,#0x127
00a27aa8	add x2,x2,#0x7e1
00a27aac	mov w1,#0x325
00a27ab0	bl 0x00c342b0
00a27ab4	mov w0,#0x10
00a27ab8	mov w1,#0x8e
00a27abc	mov x2,xzr
00a27ac0	bl 0x00c342c0
00a27ac4	mov x19,xzr
00a27ac8	ldr x0,[sp, #0x8]
00a27acc	bl 0x00c3a7c0
00a27ad0	mov x0,x19
00a27ad4	bl 0x00c3a770
00a27ad8	mov x0,xzr
00a27adc	ldp x29,x30,[sp, #0x30]
00a27ae0	ldp x20,x19,[sp, #0x20]
00a27ae4	add sp,sp,#0x40
00a27ae8	ret
