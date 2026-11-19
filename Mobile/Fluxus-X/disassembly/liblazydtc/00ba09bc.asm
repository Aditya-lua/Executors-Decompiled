; mbedtls_ecjpake_read_round_two @ 00ba09bc
00ba09bc	sub sp,sp,#0x160
00ba09c0	str x28,[sp, #0x110]
00ba09c4	stp x24,x23,[sp, #0x120]
00ba09c8	stp x22,x21,[sp, #0x130]
00ba09cc	stp x20,x19,[sp, #0x140]
00ba09d0	stp x29,x30,[sp, #0x150]
00ba09d4	add x29,sp,#0x150
00ba09d8	mrs x24,tpidr_el0
00ba09dc	ldr x8,[x24, #0x28]
00ba09e0	mov x21,x0
00ba09e4	add x0,sp,#0x30
00ba09e8	mov x19,x2
00ba09ec	mov x20,x1
00ba09f0	stur x8,[x29, #-0x48]
00ba09f4	stur x1,[x29, #-0x60]
00ba09f8	bl 0x00c426c0
00ba09fc	mov x0,sp
00ba0a00	bl 0x00c42760
00ba0a04	sub x0,x29,#0x58
00ba0a08	add x22,x21,#0x8
00ba0a0c	bl 0x00c41c00
00ba0a10	sub x0,x29,#0x58
00ba0a14	mov w1,#0x1
00ba0a18	bl 0x00c41c40
00ba0a1c	mov w23,w0
00ba0a20	cbnz w0,0x00ba0a68
00ba0a24	add x5,x21,#0x100
00ba0a28	add x3,x21,#0xd0
00ba0a2c	mov x1,sp
00ba0a30	sub x2,x29,#0x58
00ba0a34	sub x4,x29,#0x58
00ba0a38	mov x0,x22
00ba0a3c	bl 0x00c42720
00ba0a40	mov w23,w0
00ba0a44	cbnz w0,0x00ba0a68
00ba0a48	add x5,x21,#0x130
00ba0a4c	mov x1,sp
00ba0a50	sub x2,x29,#0x58
00ba0a54	mov x3,sp
00ba0a58	sub x4,x29,#0x58
00ba0a5c	mov x0,x22
00ba0a60	bl 0x00c42720
00ba0a64	mov w23,w0
00ba0a68	sub x0,x29,#0x58
00ba0a6c	bl 0x00c41bb0
00ba0a70	cbnz w23,0x00ba0b00
00ba0a74	ldr w8,[x21, #0xc8]
00ba0a78	cbz w8,0x00ba0acc
00ba0a7c	mov w9,#0x1
00ba0a80	sub w8,w9,w8
00ba0a84	adrp x9,0xcab000
00ba0a88	add x9,x9,#0x448
00ba0a8c	ldr w0,[x21]
00ba0a90	ldr w2,[x21, #0xcc]
00ba0a94	ldr x5,[x9, w8, UXTW #0x3]
00ba0a98	add x19,x20,x19
00ba0a9c	add x4,x21,#0x190
00ba0aa0	mov x3,sp
00ba0aa4	sub x6,x29,#0x60
00ba0aa8	mov x1,x22
00ba0aac	mov x7,x19
00ba0ab0	bl 0x00ba0b44
00ba0ab4	ldur x8,[x29, #-0x60]
00ba0ab8	cmp x8,x19
00ba0abc	ccmp w0,#0x0,#0x0,ne
00ba0ac0	mov w8,#0xffffb080
00ba0ac4	csel w23,w0,w8,ne
00ba0ac8	b 0x00ba0b00
00ba0acc	add x0,sp,#0x30
00ba0ad0	sub x1,x29,#0x60
00ba0ad4	mov x2,x19
00ba0ad8	bl 0x00c427a0
00ba0adc	mov w23,w0
00ba0ae0	cbnz w0,0x00ba0b00
00ba0ae4	ldr w8,[sp, #0x30]
00ba0ae8	ldr w9,[x22]
00ba0aec	cmp w8,w9
00ba0af0	b.ne 0x00ba0afc
00ba0af4	ldr w8,[x21, #0xc8]
00ba0af8	b 0x00ba0a7c
00ba0afc	mov w23,#0xffffb180
00ba0b00	add x0,sp,#0x30
00ba0b04	bl 0x00c426b0
00ba0b08	mov x0,sp
00ba0b0c	bl 0x00c42750
00ba0b10	ldr x8,[x24, #0x28]
00ba0b14	ldur x9,[x29, #-0x48]
00ba0b18	cmp x8,x9
00ba0b1c	b.ne 0x00ba0b40
00ba0b20	mov w0,w23
00ba0b24	ldp x29,x30,[sp, #0x150]
00ba0b28	ldp x20,x19,[sp, #0x140]
00ba0b2c	ldp x22,x21,[sp, #0x130]
00ba0b30	ldp x24,x23,[sp, #0x120]
00ba0b34	ldr x28,[sp, #0x110]
00ba0b38	add sp,sp,#0x160
00ba0b3c	ret
00ba0b40	bl 0x00c2fec0
