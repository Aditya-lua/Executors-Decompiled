; ossl_bio_init_core @ 00a81a44
00a81a44	str x19,[sp, #-0x20]!
00a81a48	adrp x2,0xc61000
00a81a4c	mov x19,x1
00a81a50	add x2,x2,#0x408
00a81a54	mov w1,#0x11
00a81a58	stp x29,x30,[sp, #0x10]
00a81a5c	add x29,sp,#0x10
00a81a60	bl 0x00c3b520
00a81a64	cbz x0,0x00a81b24
00a81a68	adrp x9,0x766000
00a81a6c	add x8,x19,#0x8
00a81a70	add x9,x9,#0xb74
00a81a74	b 0x00a81a7c
00a81a78	add x8,x8,#0x10
00a81a7c	ldur w10,[x8, #-0x8]
00a81a80	cmp w10,#0x32
00a81a84	b.hi 0x00a81a78
00a81a88	ldrsw x10,[x9, x10, LSL #0x2]
00a81a8c	add x10,x10,x9
00a81a90	br x10
00a81a94	ldr x10,[x0]
00a81a98	cbnz x10,0x00a81a78
00a81a9c	ldr x10,[x8], #0x10
00a81aa0	str x10,[x0]
00a81aa4	b 0x00a81a7c
00a81aa8	ldr x10,[x0, #0x8]
00a81aac	cbnz x10,0x00a81a78
00a81ab0	ldr x10,[x8], #0x10
00a81ab4	str x10,[x0, #0x8]
00a81ab8	b 0x00a81a7c
00a81abc	ldr x10,[x0, #0x28]
00a81ac0	cbnz x10,0x00a81a78
00a81ac4	ldr x10,[x8], #0x10
00a81ac8	str x10,[x0, #0x28]
00a81acc	b 0x00a81a7c
00a81ad0	ldr x10,[x0, #0x30]
00a81ad4	cbnz x10,0x00a81a78
00a81ad8	ldr x10,[x8]
00a81adc	str x10,[x0, #0x30]
00a81ae0	b 0x00a81a78
00a81ae4	ldr x10,[x0, #0x18]
00a81ae8	cbnz x10,0x00a81a78
00a81aec	ldr x10,[x8], #0x10
00a81af0	str x10,[x0, #0x18]
00a81af4	b 0x00a81a7c
00a81af8	ldr x10,[x0, #0x10]
00a81afc	cbnz x10,0x00a81a78
00a81b00	ldr x10,[x8], #0x10
00a81b04	str x10,[x0, #0x10]
00a81b08	b 0x00a81a7c
00a81b0c	ldr x10,[x0, #0x20]
00a81b10	cbnz x10,0x00a81a78
00a81b14	ldr x10,[x8], #0x10
00a81b18	str x10,[x0, #0x20]
00a81b1c	b 0x00a81a7c
00a81b20	mov w0,#0x1
00a81b24	ldp x29,x30,[sp, #0x10]
00a81b28	ldr x19,[sp], #0x20
00a81b2c	ret
