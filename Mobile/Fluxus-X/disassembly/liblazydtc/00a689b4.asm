; EVP_Q_mac @ 00a689b4
00a689b4	sub sp,sp,#0xe0
00a689b8	stp x29,x30,[sp, #0xd0]
00a689bc	add x29,sp,#0xd0
00a689c0	str x27,[sp, #0x80]
00a689c4	ldr x27,[x29, #0x28]
00a689c8	stp x26,x25,[sp, #0x90]
00a689cc	stp x24,x23,[sp, #0xa0]
00a689d0	stp x22,x21,[sp, #0xb0]
00a689d4	stp x20,x19,[sp, #0xc0]
00a689d8	mov x21,x7
00a689dc	mov x22,x6
00a689e0	mov x20,x5
00a689e4	mov x23,x4
00a689e8	mov x24,x3
00a689ec	bl 0x00c363a0
00a689f0	mov x19,x0
00a689f4	add x0,sp,#0x30
00a689f8	mov w2,#0x50
00a689fc	mov w1,wzr
00a68a00	bl 0x00c301c0
00a68a04	stur xzr,[x29, #-0x48]
00a68a08	cbz x27,0x00a68a10
00a68a0c	str xzr,[x27]
00a68a10	cbz x19,0x00a68ad8
00a68a14	cbz x24,0x00a68a78
00a68a18	mov x0,x19
00a68a1c	bl 0x00c3d7d0
00a68a20	adrp x25,0x29d000
00a68a24	add x25,x25,#0xe2e
00a68a28	mov x1,x25
00a68a2c	mov x26,x0
00a68a30	bl 0x00c36530
00a68a34	cbnz x0,0x00a68a50
00a68a38	adrp x25,0x2ad000
00a68a3c	add x25,x25,#0x804
00a68a40	mov x0,x26
00a68a44	mov x1,x25
00a68a48	bl 0x00c36530
00a68a4c	cbz x0,0x00a68b54
00a68a50	add x8,sp,#0x8
00a68a54	mov x0,x25
00a68a58	mov x1,x24
00a68a5c	mov x2,xzr
00a68a60	bl 0x00c36280
00a68a64	ldr x8,[sp, #0x28]
00a68a68	ldur q0,[sp, #0x18]
00a68a6c	ldur q1,[sp, #0x8]
00a68a70	str x8,[sp, #0x50]
00a68a74	stp q1,q0,[sp, #0x30]
00a68a78	orr x8,x20,x22
00a68a7c	cmp x8,#0x0
00a68a80	mov x0,x19
00a68a84	csel x24,x21,x20,eq
00a68a88	bl 0x00a682a0
00a68a8c	cbz x0,0x00a68ae0
00a68a90	ldr x8,[x0]
00a68a94	mov x20,x0
00a68a98	ldr x9,[x8, #0x88]
00a68a9c	cbz x9,0x00a68ae8
00a68aa0	ldr x0,[x20, #0x8]
00a68aa4	add x1,sp,#0x30
00a68aa8	blr x9
00a68aac	cbz w0,0x00a68bd8
00a68ab0	ldr x8,[x20]
00a68ab4	ldr x9,[x8, #0x88]
00a68ab8	cbz x9,0x00a68ae8
00a68abc	mov x25,x20
00a68ac0	ldr x0,[x25, #0x8]!
00a68ac4	mov x1,x23
00a68ac8	blr x9
00a68acc	cbz w0,0x00a68bd8
00a68ad0	ldr x8,[x20]
00a68ad4	b 0x00a68aec
00a68ad8	mov x21,xzr
00a68adc	b 0x00a68c10
00a68ae0	mov x21,xzr
00a68ae4	b 0x00a68c08
00a68ae8	add x25,x20,#0x8
00a68aec	ldr x8,[x8, #0x48]
00a68af0	ldr x0,[x25]
00a68af4	mov x1,x24
00a68af8	mov x2,x22
00a68afc	mov x3,x23
00a68b00	blr x8
00a68b04	cbz w0,0x00a68bd8
00a68b08	ldp x8,x0,[x20]
00a68b0c	ldr x2,[x29, #0x10]
00a68b10	mov x1,x21
00a68b14	ldr x8,[x8, #0x50]
00a68b18	blr x8
00a68b1c	cbz w0,0x00a68bd8
00a68b20	ldp x21,x4,[x29, #0x18]
00a68b24	sub x3,x29,#0x48
00a68b28	mov x0,x20
00a68b2c	mov w1,wzr
00a68b30	mov x2,x21
00a68b34	bl 0x00a6867c
00a68b38	cbz w0,0x00a68bd8
00a68b3c	cbz x21,0x00a68b8c
00a68b40	cbz x27,0x00a68bdc
00a68b44	cbz x21,0x00a68bdc
00a68b48	ldur x8,[x29, #-0x48]
00a68b4c	str x8,[x27]
00a68b50	b 0x00a68bdc
00a68b54	bl 0x00c342a0
00a68b58	adrp x0,0x2a6000
00a68b5c	adrp x2,0x2cb000
00a68b60	add x0,x0,#0x18
00a68b64	add x2,x2,#0x990
00a68b68	mov w1,#0x10f
00a68b6c	bl 0x00c342b0
00a68b70	mov w1,#0x106
00a68b74	orr w0,wzr,#0x6
00a68b78	movk w1,#0x8, LSL #16
00a68b7c	mov x2,xzr
00a68b80	bl 0x00c342c0
00a68b84	mov x21,xzr
00a68b88	b 0x00a68c08
00a68b8c	ldur x0,[x29, #-0x48]
00a68b90	adrp x1,0x2a6000
00a68b94	add x1,x1,#0x18
00a68b98	mov w2,#0x120
00a68b9c	bl 0x00c32320
00a68ba0	mov x21,x0
00a68ba4	cbz x0,0x00a68bdc
00a68ba8	ldur x4,[x29, #-0x48]
00a68bac	mov x0,x20
00a68bb0	mov w1,wzr
00a68bb4	mov x2,x21
00a68bb8	mov x3,xzr
00a68bbc	bl 0x00a6867c
00a68bc0	cbnz w0,0x00a68b40
00a68bc4	adrp x1,0x2a6000
00a68bc8	add x1,x1,#0x18
00a68bcc	mov w2,#0x122
00a68bd0	mov x0,x21
00a68bd4	bl 0x00c32310
00a68bd8	mov x21,xzr
00a68bdc	ldp x8,x0,[x20]
00a68be0	ldr x8,[x8, #0x40]
00a68be4	blr x8
00a68be8	ldr x0,[x20]
00a68bec	str xzr,[x20, #0x8]
00a68bf0	bl 0x00c363c0
00a68bf4	adrp x1,0x2a6000
00a68bf8	add x1,x1,#0x18
00a68bfc	orr w2,wzr,#0x30
00a68c00	mov x0,x20
00a68c04	bl 0x00c32310
00a68c08	mov x0,x19
00a68c0c	bl 0x00c363c0
00a68c10	mov x0,x21
00a68c14	ldp x29,x30,[sp, #0xd0]
00a68c18	ldp x20,x19,[sp, #0xc0]
00a68c1c	ldp x22,x21,[sp, #0xb0]
00a68c20	ldp x24,x23,[sp, #0xa0]
00a68c24	ldp x26,x25,[sp, #0x90]
00a68c28	ldr x27,[sp, #0x80]
00a68c2c	add sp,sp,#0xe0
00a68c30	ret
