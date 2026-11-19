; tls_parse_stoc_status_request @ 009d49fc
009d49fc	str x19,[sp, #-0x20]!
009d4a00	cmp w2,#0x4, LSL #12
009d4a04	stp x29,x30,[sp, #0x10]
009d4a08	add x29,sp,#0x10
009d4a0c	b.ne 0x009d4a18
009d4a10	mov w0,#0x1
009d4a14	b 0x009d4aac
009d4a18	ldr w8,[x0, #0xa60]
009d4a1c	mov x19,x0
009d4a20	cmp w8,#0x1
009d4a24	b.ne 0x009d4a78
009d4a28	ldr x8,[x19, #0x8]
009d4a2c	ldr x9,[x8, #0xc0]
009d4a30	ldr w9,[x9, #0x60]
009d4a34	tbnz w9,#0x3,0x009d4a4c
009d4a38	ldr w10,[x8]
009d4a3c	cmp w10,#0x304
009d4a40	b.lt 0x009d4a4c
009d4a44	cmp w10,#0x10, LSL #12
009d4a48	b.ne 0x009d4ac0
009d4a4c	ldr x10,[x1, #0x8]
009d4a50	cbz x10,0x009d4ab8
009d4a54	bl 0x00c342a0
009d4a58	adrp x0,0x2bf000
009d4a5c	adrp x2,0x2bb000
009d4a60	add x0,x0,#0x967
009d4a64	add x2,x2,#0x8c5
009d4a68	mov w1,#0x57d
009d4a6c	bl 0x00c342b0
009d4a70	mov w1,#0x32
009d4a74	b 0x009d4a98
009d4a78	bl 0x00c342a0
009d4a7c	adrp x0,0x2bf000
009d4a80	adrp x2,0x2bb000
009d4a84	add x0,x0,#0x967
009d4a88	add x2,x2,#0x8c5
009d4a8c	mov w1,#0x579
009d4a90	bl 0x00c342b0
009d4a94	mov w1,#0x6e
009d4a98	mov w2,#0x6e
009d4a9c	mov x0,x19
009d4aa0	mov x3,xzr
009d4aa4	bl 0x00c34410
009d4aa8	mov w0,wzr
009d4aac	ldp x29,x30,[sp, #0x10]
009d4ab0	ldr x19,[sp], #0x20
009d4ab4	ret
009d4ab8	tbnz w9,#0x3,0x009d4ae4
009d4abc	ldr w10,[x8]
009d4ac0	cmp w10,#0x304
009d4ac4	b.lt 0x009d4ae4
009d4ac8	cmp w10,#0x10, LSL #12
009d4acc	b.eq 0x009d4ae4
009d4ad0	cbnz x4,0x009d4a10
009d4ad4	ldp x29,x30,[sp, #0x10]
009d4ad8	mov x0,x19
009d4adc	ldr x19,[sp], #0x20
009d4ae0	b 0x00c36fa0
009d4ae4	mov w0,#0x1
009d4ae8	str w0,[x19, #0xa74]
009d4aec	b 0x009d4aac
