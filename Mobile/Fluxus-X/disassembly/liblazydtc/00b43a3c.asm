; FUN_00b43a3c @ 00b43a3c
00b43a3c	sub sp,sp,#0xe0
00b43a40	stp x20,x19,[sp, #0xc0]
00b43a44	mov x20,x1
00b43a48	mov x19,x0
00b43a4c	add x0,sp,#0x60
00b43a50	mov w2,#0x50
00b43a54	mov w1,wzr
00b43a58	stp x22,x21,[sp, #0xb0]
00b43a5c	stp x29,x30,[sp, #0xd0]
00b43a60	add x29,sp,#0xd0
00b43a64	bl 0x00c301c0
00b43a68	str xzr,[sp, #0x58]
00b43a6c	cbz x19,0x00b43aa4
00b43a70	cbz x20,0x00b43c28
00b43a74	adrp x1,0x2b7000
00b43a78	add x1,x1,#0xd2b
00b43a7c	mov x0,x20
00b43a80	bl 0x00c36530
00b43a84	cbz x0,0x00b43ab0
00b43a88	add x1,sp,#0x8
00b43a8c	bl 0x00c36510
00b43a90	cbz w0,0x00b43aa4
00b43a94	ldr w8,[sp, #0x8]
00b43a98	add w9,w8,#0x1
00b43a9c	cmp w9,#0x2
00b43aa0	b.ls 0x00b43aac
00b43aa4	mov w0,wzr
00b43aa8	b 0x00b43c2c
00b43aac	str w8,[x19, #0x18]
00b43ab0	adrp x1,0x2a8000
00b43ab4	add x1,x1,#0x15
00b43ab8	mov x0,x20
00b43abc	bl 0x00c36530
00b43ac0	cbz x0,0x00b43b08
00b43ac4	add x8,sp,#0x60
00b43ac8	add x1,sp,#0x58
00b43acc	mov w2,#0x50
00b43ad0	str x8,[sp, #0x58]
00b43ad4	bl 0x00c3b720
00b43ad8	cbz w0,0x00b43c2c
00b43adc	ldrb w8,[sp, #0x60]
00b43ae0	cbz w8,0x00b43b04
00b43ae4	adrp x1,0x2b5000
00b43ae8	add x1,x1,#0xd3f
00b43aec	add x0,sp,#0x60
00b43af0	bl 0x00c301f0
00b43af4	mov w8,w0
00b43af8	mov w0,wzr
00b43afc	cbnz w8,0x00b43c2c
00b43b00	mov w8,#0x1
00b43b04	str w8,[x19, #0x1c]
00b43b08	adrp x1,0x2cb000
00b43b0c	add x1,x1,#0x99a
00b43b10	mov x0,x20
00b43b14	bl 0x00c36530
00b43b18	cbz x0,0x00b43bb0
00b43b1c	mov x21,x0
00b43b20	add x0,sp,#0x8
00b43b24	mov w2,#0x50
00b43b28	mov w1,wzr
00b43b2c	add x22,sp,#0x8
00b43b30	bl 0x00c301c0
00b43b34	add x8,sp,#0x60
00b43b38	add x1,sp,#0x58
00b43b3c	mov w2,#0x50
00b43b40	mov x0,x21
00b43b44	str x8,[sp, #0x58]
00b43b48	bl 0x00c3b720
00b43b4c	cbz w0,0x00b43c2c
00b43b50	adrp x1,0x2ac000
00b43b54	add x1,x1,#0xb0a
00b43b58	mov x0,x20
00b43b5c	str x22,[sp, #0x58]
00b43b60	bl 0x00c36530
00b43b64	cbz x0,0x00b43b78
00b43b68	add x1,sp,#0x58
00b43b6c	mov w2,#0x50
00b43b70	bl 0x00c3b720
00b43b74	cbz w0,0x00b43c2c
00b43b78	ldr x0,[x19, #0x20]
00b43b7c	bl 0x00c35800
00b43b80	ldr x0,[x19]
00b43b84	add x1,sp,#0x60
00b43b88	add x2,sp,#0x8
00b43b8c	bl 0x00c357f0
00b43b90	ldr x8,[x19]
00b43b94	mov x1,x0
00b43b98	str x0,[x19, #0x20]
00b43b9c	mov x0,x8
00b43ba0	bl 0x00c411c0
00b43ba4	ldr x8,[x19, #0x20]
00b43ba8	cbz w0,0x00b43c40
00b43bac	cbz x8,0x00b43aa4
00b43bb0	adrp x1,0x2c9000
00b43bb4	add x1,x1,#0x866
00b43bb8	mov x0,x20
00b43bbc	bl 0x00c36530
00b43bc0	cbz x0,0x00b43bd8
00b43bc4	add x1,sp,#0x8
00b43bc8	bl 0x00c3e920
00b43bcc	cbz w0,0x00b43c2c
00b43bd0	ldr x8,[sp, #0x8]
00b43bd4	str x8,[x19, #0x38]
00b43bd8	adrp x1,0x29e000
00b43bdc	add x1,x1,#0x10e
00b43be0	mov x0,x20
00b43be4	bl 0x00c36530
00b43be8	cbz x0,0x00b43c28
00b43bec	add x1,sp,#0x8
00b43bf0	mov x3,sp
00b43bf4	mov x2,xzr
00b43bf8	str xzr,[sp, #0x8]
00b43bfc	bl 0x00c3ace0
00b43c00	cbz w0,0x00b43c2c
00b43c04	ldr x0,[x19, #0x28]
00b43c08	adrp x1,0x2ae000
00b43c0c	add x1,x1,#0xb1e
00b43c10	mov w2,#0x136
00b43c14	bl 0x00c32310
00b43c18	ldr x8,[sp, #0x8]
00b43c1c	str x8,[x19, #0x28]
00b43c20	ldr x8,[sp]
00b43c24	str x8,[x19, #0x30]
00b43c28	mov w0,#0x1
00b43c2c	ldp x29,x30,[sp, #0xd0]
00b43c30	ldp x20,x19,[sp, #0xc0]
00b43c34	ldp x22,x21,[sp, #0xb0]
00b43c38	add sp,sp,#0xe0
00b43c3c	ret
00b43c40	mov x0,x8
00b43c44	bl 0x00c35800
00b43c48	mov w0,wzr
00b43c4c	str xzr,[x19, #0x20]
00b43c50	b 0x00b43c2c
