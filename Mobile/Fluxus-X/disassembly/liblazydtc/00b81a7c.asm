; mbedtls_mpi_is_prime_ext @ 00b81a7c
00b81a7c	sub sp,sp,#0x40
00b81a80	str x19,[sp, #0x20]
00b81a84	stp x29,x30,[sp, #0x30]
00b81a88	add x29,sp,#0x30
00b81a8c	mrs x19,tpidr_el0
00b81a90	ldr x8,[x19, #0x28]
00b81a94	mov w9,#0x1
00b81a98	str x8,[sp, #0x18]
00b81a9c	strh w9,[sp, #0x10]
00b81aa0	ldrh w9,[x0, #0xa]
00b81aa4	strh w9,[sp, #0x12]
00b81aa8	ldr x8,[x0]
00b81aac	mov x10,x9
00b81ab0	str x8,[sp, #0x8]
00b81ab4	cbz x10,0x00b81b54
00b81ab8	add x11,x8,x10, LSL #0x3
00b81abc	ldur x11,[x11, #-0x8]
00b81ac0	sub x10,x10,#0x1
00b81ac4	cbz x11,0x00b81ab4
00b81ac8	sub x10,x9,#0x1
00b81acc	mov x11,x10
00b81ad0	cmn x11,#0x1
00b81ad4	b.eq 0x00b81b0c
00b81ad8	ldr x12,[x8, x11, LSL #0x3]
00b81adc	sub x11,x11,#0x1
00b81ae0	cbz x12,0x00b81ad0
00b81ae4	add x11,x11,#0x2
00b81ae8	cmp x11,#0x1
00b81aec	b.hi 0x00b81b0c
00b81af0	mov x11,xzr
00b81af4	cmn x11,#0x8
00b81af8	b.eq 0x00b81b54
00b81afc	ldr x12,[x8, x11#0x0]
00b81b00	sub x11,x11,#0x8
00b81b04	cmp x12,#0x1
00b81b08	b.eq 0x00b81af4
00b81b0c	mov x11,x10
00b81b10	cmn x11,#0x1
00b81b14	b.eq 0x00b81b4c
00b81b18	ldr x12,[x8, x11, LSL #0x3]
00b81b1c	sub x11,x11,#0x1
00b81b20	cbz x12,0x00b81b10
00b81b24	add x11,x11,#0x2
00b81b28	cmp x11,#0x1
00b81b2c	b.hi 0x00b81b4c
00b81b30	mov x11,xzr
00b81b34	cmn x11,#0x8
00b81b38	b.eq 0x00b81c60
00b81b3c	ldr x12,[x8, x11#0x0]
00b81b40	sub x11,x11,#0x8
00b81b44	cmp x12,#0x2
00b81b48	b.eq 0x00b81b34
00b81b4c	ldr x11,[x8]
00b81b50	tbnz w11,#0x0,0x00b81b78
00b81b54	mov w0,#0xfffffff2
00b81b58	ldr x8,[x19, #0x28]
00b81b5c	ldr x9,[sp, #0x18]
00b81b60	cmp x8,x9
00b81b64	b.ne 0x00b81c68
00b81b68	ldp x29,x30,[sp, #0x30]
00b81b6c	ldr x19,[sp, #0x20]
00b81b70	add sp,sp,#0x40
00b81b74	ret
00b81b78	adrp x14,0x2d4000
00b81b7c	mov x12,xzr
00b81b80	and x13,x11,#0x1
00b81b84	orr w11,wzr,#0x3
00b81b88	add x14,x14,#0x99f
00b81b8c	cbz w11,0x00b81c28
00b81b90	mov w11,w11
00b81b94	cbz w9,0x00b81c04
00b81b98	cmp w11,#0x1
00b81b9c	b.eq 0x00b81c04
00b81ba0	cmp w11,#0x2
00b81ba4	mov x16,x13
00b81ba8	b.eq 0x00b81bdc
00b81bac	mov x16,xzr
00b81bb0	mov x15,x10
00b81bb4	ldr x17,[x8, x15, LSL #0x3]
00b81bb8	sub x15,x15,#0x1
00b81bbc	cmn x15,#0x1
00b81bc0	extr x16,x16,x17,#0x20
00b81bc4	udiv x18,x16,x11
00b81bc8	msub w16,w18,w11,w16
00b81bcc	bfm x17,x16,#0x20,#0x1f
00b81bd0	udiv x16,x17,x11
00b81bd4	msub x16,x16,x11,x17
00b81bd8	b.ne 0x00b81bb4
00b81bdc	cbz x16,0x00b81c04
00b81be0	ldrb w15,[x14, x12]
00b81be4	add x12,x12,#0x1
00b81be8	cmp x12,#0xa7
00b81bec	add w11,w11,w15
00b81bf0	b.cc 0x00b81b8c
00b81bf4	sxtw x1,w1
00b81bf8	add x0,sp,#0x8
00b81bfc	bl 0x00b81c6c
00b81c00	b 0x00b81b58
00b81c04	cmn x10,#0x1
00b81c08	b.eq 0x00b81c30
00b81c0c	ldr x9,[x8, x10, LSL #0x3]
00b81c10	sub x10,x10,#0x1
00b81c14	cbz x9,0x00b81c04
00b81c18	add x9,x10,#0x2
00b81c1c	cmp x9,#0x1
00b81c20	b.ne 0x00b81b54
00b81c24	b 0x00b81c3c
00b81c28	mov w0,#0xfffffff4
00b81c2c	b 0x00b81b58
00b81c30	mov x9,xzr
00b81c34	cmp x9,#0x1
00b81c38	b.ne 0x00b81b54
00b81c3c	mov x9,xzr
00b81c40	mov w0,#0xfffffff2
00b81c44	cmn x9,#0x8
00b81c48	b.eq 0x00b81c60
00b81c4c	ldr x10,[x8, x9#0x0]
00b81c50	sub x9,x9,#0x8
00b81c54	cmp x10,x11
00b81c58	b.eq 0x00b81c44
00b81c5c	b 0x00b81b58
00b81c60	mov w0,wzr
00b81c64	b 0x00b81b58
00b81c68	bl 0x00c2fec0
