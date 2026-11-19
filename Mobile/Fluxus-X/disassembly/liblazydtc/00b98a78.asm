; FUN_00b98a78 @ 00b98a78
00b98a78	sub sp,sp,#0x80
00b98a7c	stp x26,x25,[sp, #0x30]
00b98a80	stp x24,x23,[sp, #0x40]
00b98a84	stp x22,x21,[sp, #0x50]
00b98a88	stp x20,x19,[sp, #0x60]
00b98a8c	stp x29,x30,[sp, #0x70]
00b98a90	add x29,sp,#0x70
00b98a94	mrs x26,tpidr_el0
00b98a98	ldr x8,[x26, #0x28]
00b98a9c	add x22,x0,#0x8
00b98aa0	mov x19,x0
00b98aa4	mov x0,x22
00b98aa8	str x8,[sp, #0x28]
00b98aac	ldrh w21,[x1]
00b98ab0	mov w23,w4
00b98ab4	mov w20,w3
00b98ab8	mov x24,x2
00b98abc	mov x25,x1
00b98ac0	bl 0x00c30260
00b98ac4	str w20,[x19]
00b98ac8	ldrh w25,[x25, #0x2]
00b98acc	add x2,sp,#0x10
00b98ad0	add x3,sp,#0xc
00b98ad4	add x4,sp,#0x8
00b98ad8	mov w0,w20
00b98adc	mov w1,w21
00b98ae0	str wzr,[sp, #0x8]
00b98ae4	str x25,[sp, #0x10]
00b98ae8	bl 0x00c42e60
00b98aec	mov x1,xzr
00b98af0	cbz w0,0x00b98b38
00b98af4	cbz x1,0x00b98b4c
00b98af8	mov x0,x22
00b98afc	bl 0x00c30280
00b98b00	cbnz w0,0x00b98cb0
00b98b04	mov w8,#0x2301
00b98b08	cmp w21,w8
00b98b0c	b.ne 0x00b98b54
00b98b10	cmp w25,#0x80
00b98b14	b.ne 0x00b98b54
00b98b18	ldr q0,[x24]
00b98b1c	add x1,sp,#0x10
00b98b20	orr w2,wzr,#0xc0
00b98b24	mov x0,x22
00b98b28	str q0,[sp, #0x10]
00b98b2c	ldr x8,[x24]
00b98b30	str x8,[sp, #0x20]
00b98b34	b 0x00b98b60
00b98b38	ldp w0,w2,[sp, #0x8]
00b98b3c	ldr w1,[sp, #0x10]
00b98b40	bl 0x00c42160
00b98b44	mov x1,x0
00b98b48	cbnz x1,0x00b98af8
00b98b4c	mov w0,#0xffffff7a
00b98b50	b 0x00b98cb4
00b98b54	mov x0,x22
00b98b58	mov x1,x24
00b98b5c	mov w2,w25
00b98b60	mov w3,w23
00b98b64	bl 0x00c302a0
00b98b68	cbnz w0,0x00b98cb0
00b98b6c	mov w8,#0x4000
00b98b70	movk w8,#0x440, LSL #16
00b98b74	cmp w20,w8
00b98b78	b.eq 0x00b98b94
00b98b7c	mov w8,#0x4100
00b98b80	movk w8,#0x440, LSL #16
00b98b84	cmp w20,w8
00b98b88	b.ne 0x00b98ba4
00b98b8c	mov w1,wzr
00b98b90	b 0x00b98b98
00b98b94	mov w1,#0x4
00b98b98	mov x0,x22
00b98b9c	bl 0x00c302b0
00b98ba0	cbnz w0,0x00b98cb0
00b98ba4	mov w8,#0x4800000
00b98ba8	and w9,w20,#0x7f800000
00b98bac	cmp w9,w8
00b98bb0	and w9,w21,#0x7000
00b98bb4	b.ne 0x00b98bc0
00b98bb8	mov w10,#0x1
00b98bbc	b 0x00b98bdc
00b98bc0	cmp w9,#0x2, LSL #12
00b98bc4	mov w10,wzr
00b98bc8	b.ne 0x00b98bdc
00b98bcc	ubfx w9,w21,#0x8,#0x3
00b98bd0	mov w10,#0x1
00b98bd4	lsl w10,w10,w9
00b98bd8	mov w9,#0x2000
00b98bdc	cmp w9,#0x2, LSL #12
00b98be0	strb w10,[x19, #0x5]
00b98be4	b.ne 0x00b98c74
00b98be8	and w9,w21,#0x700
00b98bec	cbz w9,0x00b98c74
00b98bf0	mov w9,#0xfff
00b98bf4	movk w9,#0x4c0, LSL #16
00b98bf8	cmp w20,w9
00b98bfc	b.gt 0x00b98c34
00b98c00	mov w9,#0x4000
00b98c04	movk w9,#0x440, LSL #16
00b98c08	cmp w20,w9
00b98c0c	b.eq 0x00b98c64
00b98c10	mov w9,#0x4100
00b98c14	movk w9,#0x440, LSL #16
00b98c18	cmp w20,w9
00b98c1c	b.eq 0x00b98c64
00b98c20	mov w9,#0xff00
00b98c24	movk w9,#0x440, LSL #16
00b98c28	cmp w20,w9
00b98c2c	b.eq 0x00b98c64
00b98c30	b 0x00b98c74
00b98c34	mov w9,#0x1000
00b98c38	movk w9,#0x4c0, LSL #16
00b98c3c	cmp w20,w9
00b98c40	b.eq 0x00b98c64
00b98c44	mov w9,#0x1200
00b98c48	movk w9,#0x4c0, LSL #16
00b98c4c	cmp w20,w9
00b98c50	b.eq 0x00b98c64
00b98c54	mov w9,#0x1100
00b98c58	movk w9,#0x4c0, LSL #16
00b98c5c	cmp w20,w9
00b98c60	b.ne 0x00b98c74
00b98c64	ubfx w8,w21,#0x8,#0x3
00b98c68	mov w9,#0x1
00b98c6c	lsl w8,w9,w8
00b98c70	b 0x00b98ca8
00b98c74	add w8,w8,#0x100
00b98c78	cmp w20,w8
00b98c7c	b.ne 0x00b98c94
00b98c80	mov w8,#0x2004
00b98c84	cmp w21,w8
00b98c88	b.ne 0x00b98c94
00b98c8c	orr w8,wzr,#0xc
00b98c90	b 0x00b98ca8
00b98c94	mov w8,#0x1300
00b98c98	movk w8,#0x4c0, LSL #16
00b98c9c	cmp w20,w8
00b98ca0	mov w8,#0xd
00b98ca4	csel w8,w8,wzr,eq
00b98ca8	mov w0,wzr
00b98cac	strb w8,[x19, #0x4]
00b98cb0	bl 0x00c42bf0
00b98cb4	ldr x8,[x26, #0x28]
00b98cb8	ldr x9,[sp, #0x28]
00b98cbc	cmp x8,x9
00b98cc0	b.ne 0x00b98ce0
00b98cc4	ldp x29,x30,[sp, #0x70]
00b98cc8	ldp x20,x19,[sp, #0x60]
00b98ccc	ldp x22,x21,[sp, #0x50]
00b98cd0	ldp x24,x23,[sp, #0x40]
00b98cd4	ldp x26,x25,[sp, #0x30]
00b98cd8	add sp,sp,#0x80
00b98cdc	ret
00b98ce0	bl 0x00c2fec0
