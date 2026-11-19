; FUN_009c29d4 @ 009c29d4
009c29d4	stp x20,x19,[sp, #-0x20]!
009c29d8	mov x20,x1
009c29dc	adrp x1,0x2cf000
009c29e0	mov x19,x0
009c29e4	add x1,x1,#0x33a
009c29e8	mov x0,x20
009c29ec	stp x29,x30,[sp, #0x10]
009c29f0	add x29,sp,#0x10
009c29f4	bl 0x00c346e0
009c29f8	cbz w0,0x009c2a98
009c29fc	mov x0,x20
009c2a00	bl 0x00c36420
009c2a04	cbz w0,0x009c2a9c
009c2a08	cmp w0,#0x4
009c2a0c	mov w8,wzr
009c2a10	b.eq 0x009c2a58
009c2a14	ldr x8,[x19, #0x8]
009c2a18	ldr x9,[x8, #0xc0]
009c2a1c	ldrb w9,[x9, #0x60]
009c2a20	tbnz w9,#0x3,0x009c2a38
009c2a24	ldr w8,[x8]
009c2a28	cmp w8,#0x304
009c2a2c	b.lt 0x009c2a38
009c2a30	cmp w8,#0x10, LSL #12
009c2a34	b.ne 0x009c2a98
009c2a38	mov x0,x20
009c2a3c	bl 0x00c36430
009c2a40	cmp w0,#0x196
009c2a44	b.eq 0x009c2a8c
009c2a48	cmp w0,#0x197
009c2a4c	mov w0,wzr
009c2a50	b.ne 0x009c2a9c
009c2a54	mov w8,#0x2
009c2a58	ldr x9,[x19, #0xab8]
009c2a5c	cbz x9,0x009c2a98
009c2a60	ldr x10,[x19, #0xab0]
009c2a64	cbz x10,0x009c2a84
009c2a68	mov x11,xzr
009c2a6c	ldrb w12,[x9, x11]
009c2a70	cmp w12,w8, UXTB 
009c2a74	b.eq 0x009c2a98
009c2a78	add x11,x11,#0x1
009c2a7c	cmp x11,x10
009c2a80	b.cc 0x009c2a6c
009c2a84	mov w0,wzr
009c2a88	b 0x009c2a9c
009c2a8c	mov w8,#0x1
009c2a90	ldr x9,[x19, #0xab8]
009c2a94	cbnz x9,0x009c2a60
009c2a98	mov w0,#0x1
009c2a9c	ldp x29,x30,[sp, #0x10]
009c2aa0	ldp x20,x19,[sp], #0x20
009c2aa4	ret
