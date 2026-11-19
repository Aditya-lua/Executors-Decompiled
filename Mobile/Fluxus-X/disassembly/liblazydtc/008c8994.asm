; FUN_008c8994 @ 008c8994
008c8994	stp x29,x30,[sp, #-0x40]!
008c8998	str x23,[sp, #0x10]
008c899c	stp x22,x21,[sp, #0x20]
008c89a0	stp x20,x19,[sp, #0x30]
008c89a4	mov x29,sp
008c89a8	ldr w8,[x1, #0xc]
008c89ac	mov w20,w2
008c89b0	mov x22,x1
008c89b4	mov x19,x0
008c89b8	cmp w8,#0x7
008c89bc	b.eq 0x008c89cc
008c89c0	mov x0,x19
008c89c4	mov x1,x22
008c89c8	bl 0x008cda50
008c89cc	ldr x8,[x19, #0x50]
008c89d0	ldr x9,[x19, #0x18]
008c89d4	ldr x23,[x22]
008c89d8	cmp x8,x9
008c89dc	b.eq 0x008c89ec
008c89e0	add x21,x8,#0x30
008c89e4	str x21,[x19, #0x50]
008c89e8	b 0x008c89f8
008c89ec	mov x0,x19
008c89f0	bl 0x008b4200
008c89f4	mov x21,x0
008c89f8	ldrb w8,[x23, #0x6]
008c89fc	str x22,[x21, #0x8]
008c8a00	cbz w8,0x008c8a0c
008c8a04	mov x8,xzr
008c8a08	b 0x008c8a40
008c8a0c	adrp x8,0xd1f000
008c8a10	ldrb w9,[x8, #0xdf0]
008c8a14	ldr x8,[x23, #0x18]
008c8a18	cmp w9,#0x1
008c8a1c	b.ne 0x008c8a40
008c8a20	ldr x9,[x8, #0xd0]
008c8a24	cbz x9,0x008c8a40
008c8a28	str x9,[x23, #0x18]
008c8a2c	mov x8,x9
008c8a30	ldr x9,[x9, #0xd0]
008c8a34	cbnz x9,0x008c8a28
008c8a38	ldrb w9,[x8, #0x5]
008c8a3c	strb w9,[x23, #0x4]
008c8a40	ldr x9,[x19, #0x68]
008c8a44	ldrb w10,[x23, #0x4]
008c8a48	add x11,x22,#0x10
008c8a4c	str x8,[x21]
008c8a50	str xzr,[x21, #0x20]
008c8a54	add x8,x9,x10, LSL #0x4
008c8a58	ldr x9,[x19, #0x48]
008c8a5c	ldr x10,[x19, #0x68]
008c8a60	stp w20,wzr,[x21, #0x28]
008c8a64	stp x11,x8,[x21, #0x10]
008c8a68	ldrb w8,[x23, #0x4]
008c8a6c	sub x9,x9,x10
008c8a70	str x11,[x19, #0x70]
008c8a74	cmp x9,w8, UXTW  #0x4
008c8a78	b.gt 0x008c8a9c
008c8a7c	ldr w9,[x19, #0x40]
008c8a80	mov x0,x19
008c8a84	mov w2,#0x1
008c8a88	lsl w10,w9,#0x1
008c8a8c	add w11,w9,w8
008c8a90	cmp w9,w8
008c8a94	csel w1,w11,w10,lt
008c8a98	bl 0x008b3fdc
008c8a9c	ldrb w8,[x23, #0x6]
008c8aa0	cbz w8,0x008c8b04
008c8aa4	ldr x8,[x23, #0x28]
008c8aa8	mov x0,x19
008c8aac	blr x8
008c8ab0	tbnz w0,#0x1f,0x008c8bd4
008c8ab4	ldr x8,[x19, #0x50]
008c8ab8	ldr x10,[x8, #0x8]
008c8abc	cbz w20,0x008c8aec
008c8ac0	cbz w0,0x008c8aec
008c8ac4	ldr x9,[x19, #0x68]
008c8ac8	sub x11,x9,w0, UXTW  #0x4
008c8acc	add x11,x11,#0x10
008c8ad0	ldur q0,[x11, #-0x10]
008c8ad4	subs w20,w20,#0x1
008c8ad8	str q0,[x10], #0x10
008c8adc	b.eq 0x008c8aec
008c8ae0	cmp x11,x9
008c8ae4	add x11,x11,#0x10
008c8ae8	b.cc 0x008c8ad0
008c8aec	cmp w20,#0x1
008c8af0	sub x9,x8,#0x30
008c8af4	b.lt 0x008c8bf8
008c8af8	b.ne 0x008c8c00
008c8afc	mov x11,x10
008c8b00	b 0x008c8c30
008c8b04	adrp x8,0xd1f000
008c8b08	add x8,x8,#0x4f8
008c8b0c	ldrb w9,[x8]
008c8b10	ldr x8,[x23, #0x18]
008c8b14	cmp w9,#0x1
008c8b18	b.ne 0x008c8b28
008c8b1c	ldr w9,[x8, #0x48]
008c8b20	add w9,w9,#0x1
008c8b24	str w9,[x8, #0x48]
008c8b28	ldp x11,x9,[x19, #0x68]
008c8b2c	ldrb w10,[x8, #0x7]
008c8b30	add x9,x9,x10, LSL #0x4
008c8b34	cmp x11,x9
008c8b38	b.cs 0x008c8be4
008c8b3c	add x10,x11,#0x10
008c8b40	mvn x12,x11
008c8b44	cmp x9,x10
008c8b48	csel x10,x9,x10,hi
008c8b4c	add x10,x10,x12
008c8b50	cmp x10,#0x10
008c8b54	b.cc 0x008c8b8c
008c8b58	lsr x10,x10,#0x4
008c8b5c	add x12,x10,#0x1
008c8b60	and x13,x12,#0x1ffffffffffffffe
008c8b64	add x10,x11,x13, LSL #0x4
008c8b68	add x11,x11,#0x1c
008c8b6c	mov x14,x13
008c8b70	subs x14,x14,#0x2
008c8b74	stur wzr,[x11, #-0x10]
008c8b78	str wzr,[x11], #0x20
008c8b7c	b.ne 0x008c8b70
008c8b80	cmp x12,x13
008c8b84	mov x11,x10
008c8b88	b.eq 0x008c8ba0
008c8b8c	add x10,x11,#0x10
008c8b90	str wzr,[x11, #0xc]
008c8b94	cmp x10,x9
008c8b98	mov x11,x10
008c8b9c	b.cc 0x008c8b8c
008c8ba0	ldrb w9,[x8, #0x3]
008c8ba4	cbz w9,0x008c8bf0
008c8ba8	ldr x9,[x8, #0x30]
008c8bac	str x10,[x19, #0x68]
008c8bb0	str x9,[x21, #0x20]
008c8bb4	ldr x9,[x8, #0x58]
008c8bb8	cbz x9,0x008c8bdc
008c8bbc	ldr x8,[x8, #0x50]
008c8bc0	cbz x8,0x008c8bdc
008c8bc4	mov w8,#0x4
008c8bc8	mov w0,wzr
008c8bcc	str w8,[x21, #0x2c]
008c8bd0	b 0x008c8c60
008c8bd4	mov w0,#0x2
008c8bd8	b 0x008c8c60
008c8bdc	mov w0,wzr
008c8be0	b 0x008c8c60
008c8be4	mov x10,x11
008c8be8	ldrb w9,[x8, #0x3]
008c8bec	cbnz w9,0x008c8ba8
008c8bf0	ldr x10,[x21, #0x18]
008c8bf4	b 0x008c8ba8
008c8bf8	mov x11,x10
008c8bfc	b 0x008c8c50
008c8c00	mov w12,w20
008c8c04	and x13,x12,#0x7ffffffe
008c8c08	add x11,x10,x13, LSL #0x4
008c8c0c	sub w20,w20,w13
008c8c10	add x10,x10,#0x1c
008c8c14	mov x14,x13
008c8c18	subs x14,x14,#0x2
008c8c1c	stur wzr,[x10, #-0x10]
008c8c20	str wzr,[x10], #0x20
008c8c24	b.ne 0x008c8c18
008c8c28	cmp x13,x12
008c8c2c	b.eq 0x008c8c50
008c8c30	add w10,w20,#0x1
008c8c34	mov x12,x11
008c8c38	sub w10,w10,#0x1
008c8c3c	add x11,x12,#0x10
008c8c40	str wzr,[x12, #0xc]
008c8c44	cmp w10,#0x1
008c8c48	mov x12,x11
008c8c4c	b.hi 0x008c8c38
008c8c50	ldur x8,[x8, #-0x20]
008c8c54	mov w0,#0x1
008c8c58	str x9,[x19, #0x50]
008c8c5c	stp x11,x8,[x19, #0x68]
008c8c60	ldp x20,x19,[sp, #0x30]
008c8c64	ldr x23,[sp, #0x10]
008c8c68	ldp x22,x21,[sp, #0x20]
008c8c6c	ldp x29,x30,[sp], #0x40
008c8c70	ret
