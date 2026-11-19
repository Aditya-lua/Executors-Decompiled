; LZ4_decompress_fast_withPrefix64k @ 008d8978
008d8978	stp x29,x30,[sp, #-0x50]!
008d897c	str x25,[sp, #0x10]
008d8980	stp x24,x23,[sp, #0x20]
008d8984	stp x22,x21,[sp, #0x30]
008d8988	stp x20,x19,[sp, #0x40]
008d898c	mov x29,sp
008d8990	add x23,x1,w2, SXTW 
008d8994	mov x21,x1
008d8998	mov x19,x0
008d899c	sub x24,x1,#0x10, LSL #12
008d89a0	mov x20,x0
008d89a4	b 0x008d89b8
008d89a8	add x21,x8,x9
008d89ac	sub x8,x23,x21
008d89b0	cmp x8,#0x5
008d89b4	b.cc 0x008d8b10
008d89b8	ldrb w25,[x20], #0x1
008d89bc	lsr x22,x25,#0x4
008d89c0	cmp w22,#0xf
008d89c4	b.ne 0x008d89e0
008d89c8	mov x8,xzr
008d89cc	ldrb w9,[x20], #0x1
008d89d0	cmp x9,#0xff
008d89d4	add x8,x8,x9
008d89d8	b.eq 0x008d89cc
008d89dc	add x22,x8,#0xf
008d89e0	sub x8,x23,x21
008d89e4	cmp x8,x22
008d89e8	b.cc 0x008d8b10
008d89ec	mov x0,x21
008d89f0	mov x1,x20
008d89f4	mov x2,x22
008d89f8	bl 0x00c2ff60
008d89fc	add x8,x21,x22
008d8a00	add x20,x20,x22
008d8a04	sub x11,x23,x8
008d8a08	cmp x11,#0xb
008d8a0c	b.ls 0x008d8b08
008d8a10	and x10,x25,#0xf
008d8a14	ldrh w13,[x20], #0x2
008d8a18	cmp w10,#0xf
008d8a1c	b.ne 0x008d8a38
008d8a20	mov x9,xzr
008d8a24	ldrb w10,[x20], #0x1
008d8a28	cmp x10,#0xff
008d8a2c	add x9,x9,x10
008d8a30	b.eq 0x008d8a24
008d8a34	add x10,x9,#0xf
008d8a38	add x9,x10,#0x4
008d8a3c	sub x12,x8,x24
008d8a40	cmp x11,x9
008d8a44	ccmp x12,x13,#0x0,cs
008d8a48	b.cc 0x008d8b10
008d8a4c	cbz x9,0x008d89a8
008d8a50	mov x12,xzr
008d8a54	cmp x9,#0x8
008d8a58	neg x11,x13
008d8a5c	b.cc 0x008d8ae4
008d8a60	cmp w13,#0x20
008d8a64	b.cc 0x008d8ae4
008d8a68	cmp x9,#0x20
008d8a6c	b.cs 0x008d8a78
008d8a70	mov x12,xzr
008d8a74	b 0x008d8ab8
008d8a78	and x12,x9,#-0x20
008d8a7c	add x14,x21,#0x10
008d8a80	sub x13,x22,x13
008d8a84	add x13,x14,x13
008d8a88	add x14,x14,x22
008d8a8c	mov x15,x12
008d8a90	ldp q0,q1,[x13, #-0x10]
008d8a94	subs x15,x15,#0x20
008d8a98	add x13,x13,#0x20
008d8a9c	stp q0,q1,[x14, #-0x10]
008d8aa0	add x14,x14,#0x20
008d8aa4	b.ne 0x008d8a90
008d8aa8	cmp x9,x12
008d8aac	b.eq 0x008d89a8
008d8ab0	tst x9,#0x18
008d8ab4	b.eq 0x008d8ae4
008d8ab8	mov x14,x12
008d8abc	and x12,x9,#-0x8
008d8ac0	add x13,x14,x22
008d8ac4	sub x14,x14,x12
008d8ac8	add x13,x21,x13
008d8acc	ldr d0,[x13,x11]
008d8ad0	adds x14,x14,#0x8
008d8ad4	str d0,[x13], #0x8
008d8ad8	b.ne 0x008d8acc
008d8adc	cmp x9,x12
008d8ae0	b.eq 0x008d89a8
008d8ae4	add x13,x12,x22
008d8ae8	sub x12,x10,x12
008d8aec	add x10,x21,x13
008d8af0	add x12,x12,#0x4
008d8af4	ldrb w13,[x10, x11]
008d8af8	subs x12,x12,#0x1
008d8afc	strb w13,[x10], #0x1
008d8b00	b.ne 0x008d8af4
008d8b04	b 0x008d89a8
008d8b08	cmp x8,x23
008d8b0c	b.eq 0x008d8b2c
008d8b10	mov w0,#0xffffffff
008d8b14	ldp x20,x19,[sp, #0x40]
008d8b18	ldr x25,[sp, #0x10]
008d8b1c	ldp x22,x21,[sp, #0x30]
008d8b20	ldp x24,x23,[sp, #0x20]
008d8b24	ldp x29,x30,[sp], #0x50
008d8b28	ret
008d8b2c	sub w0,w20,w19
008d8b30	b 0x008d8b14
