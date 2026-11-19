; FUN_008b2a58 @ 008b2a58
008b2a58	stp x29,x30,[sp, #-0x30]!
008b2a5c	stp x22,x21,[sp, #0x10]
008b2a60	stp x20,x19,[sp, #0x20]
008b2a64	mov x29,sp
008b2a68	ldr x8,[x1, #0x38]
008b2a6c	mov x21,x1
008b2a70	mov x19,x0
008b2a74	mov x1,x2
008b2a78	mov x20,x3
008b2a7c	mov x22,x2
008b2a80	mov x0,x8
008b2a84	bl 0x008bb440
008b2a88	ldr d0,[x0]
008b2a8c	ldr w9,[x21, #0x58]
008b2a90	ldr x10,[x21, #0x28]
008b2a94	fcvtzu w8,d0
008b2a98	ldr q0,[x20]
008b2a9c	sub w8,w8,w9
008b2aa0	str q0,[x10,w8, uxtw #4]
008b2aa4	ldr w8,[x20, #0xc]
008b2aa8	cmp w8,#0x5
008b2aac	b.lt 0x008b2ad4
008b2ab0	ldrb w8,[x21, #0x2]
008b2ab4	tbz w8,#0x2,0x008b2ad4
008b2ab8	ldr x2,[x20]
008b2abc	ldrb w8,[x2, #0x2]
008b2ac0	tst w8,#0x3
008b2ac4	b.eq 0x008b2ad4
008b2ac8	mov x0,x19
008b2acc	mov x1,x21
008b2ad0	bl 0x008b6188
008b2ad4	adrp x1,0x2c0000
008b2ad8	add x1,x1,#0xe42
008b2adc	mov x0,x19
008b2ae0	mov w2,#0x6
008b2ae4	bl 0x008b9ff8
008b2ae8	ldrb w8,[x21, #0x6a]
008b2aec	cmp x22,x0
008b2af0	adrp x1,0x2d7000
008b2af4	add x1,x1,#0xb
008b2af8	cset w9,eq
008b2afc	mov x0,x19
008b2b00	orr w8,w8,w9
008b2b04	mov w2,#0xa
008b2b08	strb w8,[x21, #0x6a]
008b2b0c	bl 0x008b9ff8
008b2b10	cmp x22,x0
008b2b14	b.eq 0x008b2b44
008b2b18	ldr x9,[x19, #0x60]
008b2b1c	mov x8,xzr
008b2b20	add x9,x9,#0x338
008b2b24	ldr x10,[x9, x8, LSL #0x3]
008b2b28	cmp x8,#0x13
008b2b2c	b.hi 0x008b2b3c
008b2b30	cmp x22,x10
008b2b34	add x8,x8,#0x1
008b2b38	b.ne 0x008b2b24
008b2b3c	cmp x22,x10
008b2b40	b.ne 0x008b2c2c
008b2b44	ldr x0,[x21, #0x50]
008b2b48	cbz x0,0x008b2ba0
008b2b4c	ldr x8,[x19, #0x60]
008b2b50	ldr x9,[x8, #0x370]
008b2b54	cmp x22,x9
008b2b58	b.eq 0x008b2b74
008b2b5c	ldr x9,[x8, #0x3b8]
008b2b60	cmp x22,x9
008b2b64	b.eq 0x008b2b74
008b2b68	ldr x8,[x8, #0x3c0]
008b2b6c	cmp x22,x8
008b2b70	b.ne 0x008b2bd8
008b2b74	mov x1,x22
008b2b78	bl 0x008bb440
008b2b7c	ldr w8,[x0, #0xc]
008b2b80	cbz w8,0x008b2bd8
008b2b84	ldr x8,[x21, #0x10]
008b2b88	adrp x1,0x2ba000
008b2b8c	add x1,x1,#0xf16
008b2b90	add x2,x22,#0x18
008b2b94	mov x0,x19
008b2b98	add x3,x8,#0x18
008b2b9c	bl 0x008b39cc
008b2ba0	mov x0,x19
008b2ba4	mov w1,wzr
008b2ba8	mov w2,#0x1
008b2bac	bl 0x008bae54
008b2bb0	ldrb w8,[x21, #0x2]
008b2bb4	str x0,[x21, #0x50]
008b2bb8	tbz w8,#0x2,0x008b2bd8
008b2bbc	ldrb w8,[x0, #0x2]
008b2bc0	mov x2,x0
008b2bc4	tst w8,#0x3
008b2bc8	b.eq 0x008b2bd8
008b2bcc	mov x0,x19
008b2bd0	mov x1,x21
008b2bd4	bl 0x008b6188
008b2bd8	ldr x1,[x21, #0x50]
008b2bdc	mov x0,x19
008b2be0	mov x2,x22
008b2be4	bl 0x008bce4c
008b2be8	ldr q0,[x20]
008b2bec	str q0,[x0]
008b2bf0	ldr w8,[x20, #0xc]
008b2bf4	cmp w8,#0x5
008b2bf8	b.lt 0x008b2c2c
008b2bfc	ldr x1,[x21, #0x50]
008b2c00	ldrb w8,[x1, #0x2]
008b2c04	tbz w8,#0x2,0x008b2c2c
008b2c08	ldr x2,[x20]
008b2c0c	ldrb w8,[x2, #0x2]
008b2c10	tst w8,#0x3
008b2c14	b.eq 0x008b2c2c
008b2c18	mov x0,x19
008b2c1c	ldp x20,x19,[sp, #0x20]
008b2c20	ldp x22,x21,[sp, #0x10]
008b2c24	ldp x29,x30,[sp], #0x30
008b2c28	b 0x008b6188
008b2c2c	ldp x20,x19,[sp, #0x20]
008b2c30	ldp x22,x21,[sp, #0x10]
008b2c34	ldp x29,x30,[sp], #0x30
008b2c38	ret
