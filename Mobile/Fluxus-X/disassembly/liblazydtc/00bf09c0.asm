; std::__ndk1::money_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get @ 00bf09c0
00bf09c0	paciasp
00bf09c4	stp x29,x30,[sp, #-0x60]!
00bf09c8	str x28,[sp, #0x10]
00bf09cc	stp x26,x25,[sp, #0x20]
00bf09d0	stp x24,x23,[sp, #0x30]
00bf09d4	stp x22,x21,[sp, #0x40]
00bf09d8	stp x20,x19,[sp, #0x50]
00bf09dc	mov x29,sp
00bf09e0	sub sp,sp,#0x1e0
00bf09e4	stur x1,[x29, #-0x18]
00bf09e8	adrp x8,0xcb5000
00bf09ec	mov x21,x6
00bf09f0	ldr x8,[x8, #0xc18]
00bf09f4	mov x19,x5
00bf09f8	mov x24,x4
00bf09fc	mov w23,w3
00bf0a00	mov x20,x2
00bf0a04	add x25,sp,#0x38
00bf0a08	stp x25,x8,[sp, #0x28]
00bf0a0c	add x8,sp,#0x18
00bf0a10	mov x0,x4
00bf0a14	bl 0x00c30070
00bf0a18	adrp x26,0xcb5000
00bf0a1c	ldr x26,[x26, #0xb98]
00bf0a20	ldr x22,[sp, #0x18]
00bf0a24	stur x26,[x29, #-0x10]
00bf0a28	ldar x8,[x26]
00bf0a2c	cmn x8,#0x1
00bf0a30	b.eq 0x00bf0a5c
00bf0a34	sub x8,x29,#0x10
00bf0a38	add x9,x29,#0x18
00bf0a3c	str x8,[x29, #0x18]
00bf0a40	stur x9,[x29, #-0x8]
00bf0a44	adrp x0,0xcb5000
00bf0a48	nop
00bf0a4c	adr x2,0xc0bab0
00bf0a50	ldr x0,[x0, #0xb98]
00bf0a54	sub x1,x29,#0x8
00bf0a58	bl 0x00c305d0
00bf0a5c	ldp x8,x10,[x22, #0x10]
00bf0a60	ldrsw x9,[x26, #0x8]
00bf0a64	sub x9,x9,#0x1
00bf0a68	sub x10,x10,x8
00bf0a6c	cmp x9,x10, ASR #0x3
00bf0a70	b.cs 0x00bf0c98
00bf0a74	ldr x22,[x8, x9, LSL #0x3]
00bf0a78	cbz x22,0x00bf0c98
00bf0a7c	ldr w4,[x24, #0x8]
00bf0a80	add x10,x25,#0x190
00bf0a84	strb wzr,[x29, #0x18]
00bf0a88	add x8,sp,#0x20
00bf0a8c	add x9,sp,#0x28
00bf0a90	sub x0,x29,#0x18
00bf0a94	and w2,w23,#0x1
00bf0a98	add x3,sp,#0x18
00bf0a9c	add x6,x29,#0x18
00bf0aa0	mov x1,x20
00bf0aa4	mov x5,x19
00bf0aa8	mov x7,x22
00bf0aac	stp x8,x10,[sp, #0x8]
00bf0ab0	str x9,[sp]
00bf0ab4	bl 0x00c44220
00bf0ab8	tbz w0,#0x0,0x00bf0bbc
00bf0abc	ldrb w8,[x21]
00bf0ac0	tbnz w8,#0x0,0x00bf0ad0
00bf0ac4	str wzr,[x21, #0x4]
00bf0ac8	strb wzr,[x21]
00bf0acc	b 0x00bf0adc
00bf0ad0	ldr x8,[x21, #0x10]
00bf0ad4	str wzr,[x8]
00bf0ad8	str xzr,[x21, #0x8]
00bf0adc	ldrb w8,[x29, #0x18]
00bf0ae0	cmp w8,#0x1
00bf0ae4	b.ne 0x00bf0b78
00bf0ae8	ldr x8,[x22]
00bf0aec	ldr x8,[x8, #0x58]
00bf0af0	mov x0,x22
00bf0af4	mov w1,#0x2d
00bf0af8	blr x8
00bf0afc	ldrb w9,[x21]
00bf0b00	mov w23,w0
00bf0b04	tbnz w9,#0x0,0x00bf0b18
00bf0b08	cmp w9,#0x8
00bf0b0c	b.ne 0x00bf0b60
00bf0b10	mov w24,#0x4
00bf0b14	b 0x00bf0b2c
00bf0b18	ldp x9,x8,[x21]
00bf0b1c	and x9,x9,#-0x2
00bf0b20	sub x24,x9,#0x1
00bf0b24	cmp x8,x24
00bf0b28	b.ne 0x00bf0b50
00bf0b2c	mov x0,x21
00bf0b30	mov x1,x24
00bf0b34	mov w2,#0x1
00bf0b38	mov x3,x24
00bf0b3c	mov x4,x24
00bf0b40	mov x5,xzr
00bf0b44	mov x6,xzr
00bf0b48	bl 0x00c43d70
00bf0b4c	mov x8,x24
00bf0b50	ldr x9,[x21, #0x10]
00bf0b54	add x10,x8,#0x1
00bf0b58	str x10,[x21, #0x8]
00bf0b5c	b 0x00bf0b70
00bf0b60	lsr x8,x9,#0x1
00bf0b64	add w10,w9,#0x2
00bf0b68	mov x9,x21
00bf0b6c	strb w10,[x9], #0x4
00bf0b70	add x8,x9,x8, LSL #0x2
00bf0b74	stp w23,wzr,[x8]
00bf0b78	ldr x8,[x22]
00bf0b7c	ldr x8,[x8, #0x58]
00bf0b80	mov x0,x22
00bf0b84	mov w1,#0x30
00bf0b88	blr x8
00bf0b8c	ldp x2,x1,[sp, #0x20]
00bf0b90	sub x8,x2,#0x4
00bf0b94	cmp x1,x8
00bf0b98	b.cs 0x00bf0bb4
00bf0b9c	ldr w9,[x1]
00bf0ba0	cmp w9,w0
00bf0ba4	b.ne 0x00bf0bb4
00bf0ba8	add x1,x1,#0x4
00bf0bac	cmp x1,x8
00bf0bb0	b.cc 0x00bf0b9c
00bf0bb4	mov x0,x21
00bf0bb8	bl 0x00bf0ce8
00bf0bbc	ldur x0,[x29, #-0x18]
00bf0bc0	cbz x0,0x00bf0c08
00bf0bc4	ldp x8,x9,[x0, #0x18]
00bf0bc8	cmp x8,x9
00bf0bcc	b.eq 0x00bf0bd8
00bf0bd0	ldr w0,[x8]
00bf0bd4	b 0x00bf0be4
00bf0bd8	ldr x8,[x0]
00bf0bdc	ldr x8,[x8, #0x48]
00bf0be0	blr x8
00bf0be4	cmn w0,#0x1
00bf0be8	b.eq 0x00bf0c04
00bf0bec	ldur x8,[x29, #-0x18]
00bf0bf0	cmp x8,#0x0
00bf0bf4	cset w21,eq
00bf0bf8	cbnz x20,0x00bf0c10
00bf0bfc	tbnz w21,#0x0,0x00bf0c44
00bf0c00	b 0x00bf0c50
00bf0c04	stur xzr,[x29, #-0x18]
00bf0c08	mov w21,#0x1
00bf0c0c	cbz x20,0x00bf0bfc
00bf0c10	ldp x8,x9,[x20, #0x18]
00bf0c14	cmp x8,x9
00bf0c18	b.eq 0x00bf0c24
00bf0c1c	ldr w0,[x8]
00bf0c20	b 0x00bf0c34
00bf0c24	ldr x8,[x20]
00bf0c28	ldr x8,[x8, #0x48]
00bf0c2c	mov x0,x20
00bf0c30	blr x8
00bf0c34	cmn w0,#0x1
00bf0c38	cset w8,eq
00bf0c3c	eor w8,w21,w8
00bf0c40	tbnz w8,#0x0,0x00bf0c50
00bf0c44	ldr w8,[x19]
00bf0c48	orr w8,w8,#0x2
00bf0c4c	str w8,[x19]
00bf0c50	ldur x19,[x29, #-0x18]
00bf0c54	add x0,sp,#0x18
00bf0c58	bl 0x00c30090
00bf0c5c	ldr x0,[sp, #0x28]
00bf0c60	str xzr,[sp, #0x28]
00bf0c64	cbz x0,0x00bf0c70
00bf0c68	ldr x8,[sp, #0x30]
00bf0c6c	blr x8
00bf0c70	mov x0,x19
00bf0c74	add sp,sp,#0x1e0
00bf0c78	ldp x20,x19,[sp, #0x50]
00bf0c7c	ldr x28,[sp, #0x10]
00bf0c80	ldp x22,x21,[sp, #0x40]
00bf0c84	ldp x24,x23,[sp, #0x30]
00bf0c88	ldp x26,x25,[sp, #0x20]
00bf0c8c	ldp x29,x30,[sp], #0x60
00bf0c90	autiasp
00bf0c94	ret
00bf0c98	bl 0x00bd8968
