; mbedtls_mpi_core_shift_r @ 00b83ab0
00b83ab0	str x21,[sp, #-0x30]!
00b83ab4	stp x20,x19,[sp, #0x10]
00b83ab8	stp x29,x30,[sp, #0x20]
00b83abc	add x29,sp,#0x20
00b83ac0	lsr x9,x2,#0x6
00b83ac4	mov x20,x1
00b83ac8	cmp x9,x1
00b83acc	mov x19,x0
00b83ad0	b.hi 0x00b83ae0
00b83ad4	and x21,x2,#0x3f
00b83ad8	b.ne 0x00b83afc
00b83adc	cbz x21,0x00b83afc
00b83ae0	lsl x2,x20,#0x3
00b83ae4	mov x0,x19
00b83ae8	ldp x29,x30,[sp, #0x20]
00b83aec	ldp x20,x19,[sp, #0x10]
00b83af0	mov w1,wzr
00b83af4	ldr x21,[sp], #0x30
00b83af8	b 0x00c301c0
00b83afc	cbz x9,0x00b83b9c
00b83b00	subs x8,x20,x9
00b83b04	b.eq 0x00b83b80
00b83b08	cmp x8,#0x3
00b83b0c	mov x10,xzr
00b83b10	b.ls 0x00b83b60
00b83b14	add x10,x19,x20, LSL #0x3
00b83b18	cmp x10,x19
00b83b1c	b.ls 0x00b83b34
00b83b20	add x10,x19,x8, LSL #0x3
00b83b24	add x11,x19,x9, LSL #0x3
00b83b28	cmp x11,x10
00b83b2c	mov x10,xzr
00b83b30	b.cc 0x00b83b60
00b83b34	and x10,x8,#-0x4
00b83b38	lsl x11,x9,#0x3
00b83b3c	mov x12,x10
00b83b40	mov x13,x19
00b83b44	add x14,x13,x11
00b83b48	ldp q0,q1,[x14]
00b83b4c	subs x12,x12,#0x4
00b83b50	stp q0,q1,[x13], #0x20
00b83b54	b.ne 0x00b83b44
00b83b58	cmp x8,x10
00b83b5c	b.eq 0x00b83b80
00b83b60	add x9,x10,x9
00b83b64	add x11,x19,x10, LSL #0x3
00b83b68	sub x12,x8,x10
00b83b6c	add x9,x19,x9, LSL #0x3
00b83b70	ldr x10,[x9], #0x8
00b83b74	subs x12,x12,#0x1
00b83b78	str x10,[x11], #0x8
00b83b7c	b.ne 0x00b83b70
00b83b80	cmp x8,x20
00b83b84	b.cs 0x00b83b9c
00b83b88	add x0,x19,x8, LSL #0x3
00b83b8c	sub x8,x20,x8
00b83b90	lsl x2,x8,#0x3
00b83b94	mov w1,wzr
00b83b98	bl 0x00c301c0
00b83b9c	cbz x20,0x00b83c64
00b83ba0	cbz x21,0x00b83c64
00b83ba4	mov w8,#0x40
00b83ba8	cmp x20,#0x4
00b83bac	sub x8,x8,x21
00b83bb0	b.cs 0x00b83bc0
00b83bb4	mov x10,xzr
00b83bb8	mov x9,x20
00b83bbc	b 0x00b83c38
00b83bc0	and x10,x20,#-0x4
00b83bc4	dup v1.2D,x21
00b83bc8	add x11,x19,x20, LSL #0x3
00b83bcc	dup v0.2D,x8
00b83bd0	movi v2.2D,#0x0
00b83bd4	sub x9,x20,x10
00b83bd8	sub x11,x11,#0x10
00b83bdc	neg v1.2D,v1.2D
00b83be0	mov x12,x10
00b83be4	ldp q4,q3,[x11, #-0x10]
00b83be8	subs x12,x12,#0x4
00b83bec	ext v3.16B,v3.16B,v3.16B,0x8
00b83bf0	ext v4.16B,v4.16B,v4.16B,0x8
00b83bf4	ushl v5.2D,v3.2D,v0.2D
00b83bf8	ushl v3.2D,v3.2D,v1.2D
00b83bfc	ext v7.16B,v2.16B,v5.16B,0x8
00b83c00	ushl v2.2D,v4.2D,v0.2D
00b83c04	ushl v6.2D,v4.2D,v1.2D
00b83c08	ext v4.16B,v5.16B,v2.16B,0x8
00b83c0c	orr v3.16B,v3.16B,v7.16B
00b83c10	orr v4.16B,v6.16B,v4.16B
00b83c14	ext v3.16B,v3.16B,v3.16B,0x8
00b83c18	str q3,[x11]
00b83c1c	ext v3.16B,v4.16B,v4.16B,0x8
00b83c20	stur q3,[x11, #-0x10]
00b83c24	sub x11,x11,#0x20
00b83c28	b.ne 0x00b83be4
00b83c2c	cmp x10,x20
00b83c30	b.eq 0x00b83c64
00b83c34	mov x10,v2.D[0x1]
00b83c38	sub x9,x9,#0x1
00b83c3c	lsl x11,x9,#0x3
00b83c40	ldr x12,[x19, x11#0x0]
00b83c44	sub x9,x9,#0x1
00b83c48	cmn x9,#0x1
00b83c4c	lsr x13,x12,x21
00b83c50	orr x10,x13,x10
00b83c54	lsl x12,x12,x8
00b83c58	str x10,[x19, x11#0x0]
00b83c5c	mov x10,x12
00b83c60	b.ne 0x00b83c3c
00b83c64	ldp x29,x30,[sp, #0x20]
00b83c68	ldp x20,x19,[sp, #0x10]
00b83c6c	ldr x21,[sp], #0x30
00b83c70	ret
