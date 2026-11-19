; psa_verify_hash @ 00b899a0
00b899a0	sub sp,sp,#0x60
00b899a4	stp x26,x25,[sp, #0x10]
00b899a8	stp x24,x23,[sp, #0x20]
00b899ac	stp x22,x21,[sp, #0x30]
00b899b0	stp x20,x19,[sp, #0x40]
00b899b4	stp x29,x30,[sp, #0x50]
00b899b8	add x29,sp,#0x50
00b899bc	mrs x26,tpidr_el0
00b899c0	ldr x8,[x26, #0x28]
00b899c4	mov x21,x5
00b899c8	mov x25,x4
00b899cc	mov x22,x3
00b899d0	mov x20,x2
00b899d4	mov w23,w1
00b899d8	mov w24,w0
00b899dc	str x8,[sp, #0x8]
00b899e0	cbz x3,0x00b89a34
00b899e4	mov w1,#0x1
00b899e8	mov x0,x22
00b899ec	bl 0x00c30a30
00b899f0	mov x19,x0
00b899f4	cbz x0,0x00b89b30
00b899f8	mov x0,x19
00b899fc	mov x1,x20
00b89a00	mov x2,x22
00b89a04	bl 0x00c2ffd0
00b89a08	cbz x21,0x00b89a3c
00b89a0c	mov w1,#0x1
00b89a10	mov x0,x21
00b89a14	bl 0x00c30a30
00b89a18	mov x20,x0
00b89a1c	cbz x0,0x00b89b34
00b89a20	mov x0,x20
00b89a24	mov x1,x25
00b89a28	mov x2,x21
00b89a2c	bl 0x00c2ffd0
00b89a30	b 0x00b89a40
00b89a34	mov x19,xzr
00b89a38	cbnz x21,0x00b89a0c
00b89a3c	mov x20,xzr
00b89a40	mov w8,#0x8ff
00b89a44	and w25,w23,#0xffffff00
00b89a48	movk w8,#0x600, LSL #16
00b89a4c	cmp w25,w8
00b89a50	b.gt 0x00b89a6c
00b89a54	mov w8,#0x200
00b89a58	movk w8,#0x600, LSL #16
00b89a5c	cmp w25,w8
00b89a60	b.eq 0x00b89aa0
00b89a64	mov w8,#0x300
00b89a68	b 0x00b89a80
00b89a6c	mov w8,#0x900
00b89a70	movk w8,#0x600, LSL #16
00b89a74	cmp w25,w8
00b89a78	b.eq 0x00b89aa0
00b89a7c	mov w8,#0x1300
00b89a80	movk w8,#0x600, LSL #16
00b89a84	cmp w25,w8
00b89a88	b.eq 0x00b89aa0
00b89a8c	lsr w8,w23,#0x9
00b89a90	orr w8,w8,#0x1
00b89a94	orr w9,wzr,#0x30003
00b89a98	cmp w8,w9
00b89a9c	b.ne 0x00b89b9c
00b89aa0	mov x1,sp
00b89aa4	mov w2,#0x2000
00b89aa8	mov w0,w24
00b89aac	mov w3,w23
00b89ab0	bl 0x00b86e5c
00b89ab4	mov w24,w0
00b89ab8	cbnz w0,0x00b89ba0
00b89abc	ldr x0,[sp]
00b89ac0	ldr w8,[x0, #0x4]
00b89ac4	cmp w8,#0xff
00b89ac8	b.hi 0x00b89b90
00b89acc	ldrh w8,[x0]
00b89ad0	ldp x1,x2,[x0, #0x28]
00b89ad4	mov w10,#0x4001
00b89ad8	and w9,w8,#0xffffcfff
00b89adc	cmp w9,w10
00b89ae0	b.ne 0x00b89b3c
00b89ae4	mov w8,#0x200
00b89ae8	movk w8,#0x600, LSL #16
00b89aec	cmp w25,w8
00b89af0	b.eq 0x00b89b14
00b89af4	mov w8,#0x1300
00b89af8	movk w8,#0x600, LSL #16
00b89afc	cmp w25,w8
00b89b00	b.eq 0x00b89b14
00b89b04	mov w8,#0x300
00b89b08	movk w8,#0x600, LSL #16
00b89b0c	cmp w25,w8
00b89b10	b.ne 0x00b89b90
00b89b14	mov w3,w23
00b89b18	mov x4,x19
00b89b1c	mov x5,x22
00b89b20	mov x6,x20
00b89b24	mov x7,x21
00b89b28	bl 0x00c43170
00b89b2c	b 0x00b89b78
00b89b30	mov x20,xzr
00b89b34	mov w24,#0xffffff73
00b89b38	b 0x00b89ba0
00b89b3c	mov w9,#0xcf00
00b89b40	and w8,w8,w9
00b89b44	mov w9,#0x4100
00b89b48	cmp w8,w9
00b89b4c	b.ne 0x00b89be0
00b89b50	lsr w8,w23,#0x9
00b89b54	orr w9,wzr,#0x30003
00b89b58	cmp w8,w9
00b89b5c	b.ne 0x00b89b90
00b89b60	mov w3,w23
00b89b64	mov x4,x19
00b89b68	mov x5,x22
00b89b6c	mov x6,x20
00b89b70	mov x7,x21
00b89b74	bl 0x00c42f30
00b89b78	mov w21,w0
00b89b7c	ldr x0,[sp]
00b89b80	bl 0x00c431e0
00b89b84	cmp w21,#0x0
00b89b88	csel w24,w0,w21,eq
00b89b8c	b 0x00b89ba0
00b89b90	mov w24,#0xffffff79
00b89b94	bl 0x00c431e0
00b89b98	b 0x00b89ba0
00b89b9c	mov w24,#0xffffff79
00b89ba0	mov x0,x19
00b89ba4	bl 0x00c30960
00b89ba8	mov x0,x20
00b89bac	bl 0x00c30960
00b89bb0	ldr x8,[x26, #0x28]
00b89bb4	ldr x9,[sp, #0x8]
00b89bb8	cmp x8,x9
00b89bbc	b.ne 0x00b89be8
00b89bc0	mov w0,w24
00b89bc4	ldp x29,x30,[sp, #0x50]
00b89bc8	ldp x20,x19,[sp, #0x40]
00b89bcc	ldp x22,x21,[sp, #0x30]
00b89bd0	ldp x24,x23,[sp, #0x20]
00b89bd4	ldp x26,x25,[sp, #0x10]
00b89bd8	add sp,sp,#0x60
00b89bdc	ret
00b89be0	mov w24,#0xffffff7a
00b89be4	b 0x00b89b94
00b89be8	bl 0x00c2fec0
