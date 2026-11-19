; psa_its_set @ 00ba2a70
00ba2a70	sub sp,sp,#0x80
00ba2a74	stp x24,x23,[sp, #0x40]
00ba2a78	stp x22,x21,[sp, #0x50]
00ba2a7c	stp x20,x19,[sp, #0x60]
00ba2a80	stp x29,x30,[sp, #0x70]
00ba2a84	add x29,sp,#0x70
00ba2a88	mrs x22,tpidr_el0
00ba2a8c	ldr x8,[x22, #0x28]
00ba2a90	mov x19,x2
00ba2a94	mov w20,w1
00ba2a98	mov x5,x0
00ba2a9c	str x8,[sp, #0x38]
00ba2aa0	cbz x0,0x00ba2b5c
00ba2aa4	mov x8,#0x5350
00ba2aa8	movk x8,#0x41, LSL #16
00ba2aac	movk x8,#0x5449, LSL #32
00ba2ab0	stp w20,w3,[sp, #0x10]
00ba2ab4	adrp x2,0x2c8000
00ba2ab8	adrp x3,0x2ab000
00ba2abc	adrp x6,0x2da000
00ba2ac0	movk x8,#0x53, LSL #48
00ba2ac4	lsr x4,x5,#0x20
00ba2ac8	add x2,x2,#0x894
00ba2acc	add x3,x3,#0x32c
00ba2ad0	add x6,x6,#0xd07
00ba2ad4	add x0,sp,#0x1c
00ba2ad8	mov w1,#0x19
00ba2adc	str x8,[sp, #0x8]
00ba2ae0	bl 0x00c31ed0
00ba2ae4	adrp x0,0x2d2000
00ba2ae8	adrp x1,0x2a6000
00ba2aec	add x0,x0,#0x957
00ba2af0	add x1,x1,#0xd85
00ba2af4	bl 0x00c30c10
00ba2af8	mov x21,x0
00ba2afc	cbz x0,0x00ba2b64
00ba2b00	mov x0,x21
00ba2b04	mov x1,xzr
00ba2b08	bl 0x00c42490
00ba2b0c	add x0,sp,#0x8
00ba2b10	mov w1,#0x1
00ba2b14	mov w2,#0x10
00ba2b18	mov x3,x21
00ba2b1c	bl 0x00c308f0
00ba2b20	mov w23,#0xffffff72
00ba2b24	cmp x0,#0x10
00ba2b28	mov w24,#0xffffff72
00ba2b2c	b.ne 0x00ba2b70
00ba2b30	cbz w20,0x00ba2b54
00ba2b34	mov w20,w20
00ba2b38	mov w1,#0x1
00ba2b3c	mov x0,x19
00ba2b40	mov x2,x20
00ba2b44	mov x3,x21
00ba2b48	bl 0x00c308f0
00ba2b4c	cmp x0,x20
00ba2b50	b.ne 0x00ba2b6c
00ba2b54	mov w24,wzr
00ba2b58	b 0x00ba2b70
00ba2b5c	mov w19,#0xffffff78
00ba2b60	b 0x00ba2bb4
00ba2b64	mov w19,#0xffffff6e
00ba2b68	b 0x00ba2ba8
00ba2b6c	mov w24,#0xffffff72
00ba2b70	mov x0,x21
00ba2b74	bl 0x00c30be0
00ba2b78	cmp w0,#0x0
00ba2b7c	ccmp w24,#0x0,#0x0,ne
00ba2b80	orr w8,w0,w24
00ba2b84	csel w19,w23,w24,eq
00ba2b88	cbnz w8,0x00ba2ba8
00ba2b8c	adrp x0,0x2d2000
00ba2b90	add x0,x0,#0x957
00ba2b94	add x1,sp,#0x1c
00ba2b98	bl 0x00c31f30
00ba2b9c	cmp w0,#0x0
00ba2ba0	mov w8,#0xffffff6e
00ba2ba4	csel w19,wzr,w8,eq
00ba2ba8	adrp x0,0x2d2000
00ba2bac	add x0,x0,#0x957
00ba2bb0	bl 0x00c433e0
00ba2bb4	ldr x8,[x22, #0x28]
00ba2bb8	ldr x9,[sp, #0x38]
00ba2bbc	cmp x8,x9
00ba2bc0	b.ne 0x00ba2be0
00ba2bc4	mov w0,w19
00ba2bc8	ldp x29,x30,[sp, #0x70]
00ba2bcc	ldp x20,x19,[sp, #0x60]
00ba2bd0	ldp x22,x21,[sp, #0x50]
00ba2bd4	ldp x24,x23,[sp, #0x40]
00ba2bd8	add sp,sp,#0x80
00ba2bdc	ret
00ba2be0	bl 0x00c2fec0
