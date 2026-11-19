; OPENSSL_sk_new_reserve @ 00ae8a68
00ae8a68	str x21,[sp, #-0x30]!
00ae8a6c	stp x20,x19,[sp, #0x10]
00ae8a70	mov w20,w1
00ae8a74	adrp x1,0x2c6000
00ae8a78	mov x21,x0
00ae8a7c	add x1,x1,#0x275
00ae8a80	mov w0,#0x20
00ae8a84	mov w2,#0xe4
00ae8a88	stp x29,x30,[sp, #0x20]
00ae8a8c	add x29,sp,#0x20
00ae8a90	bl 0x00c34250
00ae8a94	mov x19,x0
00ae8a98	cbz x0,0x00ae8aec
00ae8a9c	cmp w20,#0x1
00ae8aa0	str x21,[x19, #0x18]
00ae8aa4	b.lt 0x00ae8b1c
00ae8aa8	mov w2,#0x1
00ae8aac	mov x0,x19
00ae8ab0	mov w1,w20
00ae8ab4	bl 0x00ae8ba0
00ae8ab8	cbnz w0,0x00ae8b1c
00ae8abc	ldr x0,[x19, #0x8]
00ae8ac0	adrp x20,0x2c6000
00ae8ac4	add x20,x20,#0x275
00ae8ac8	mov w2,#0x1b2
00ae8acc	mov x1,x20
00ae8ad0	bl 0x00c32310
00ae8ad4	mov w2,#0x1b3
00ae8ad8	mov x0,x19
00ae8adc	mov x1,x20
00ae8ae0	bl 0x00c32310
00ae8ae4	mov x19,xzr
00ae8ae8	b 0x00ae8b1c
00ae8aec	bl 0x00c342a0
00ae8af0	adrp x0,0x2c6000
00ae8af4	adrp x2,0x2b8000
00ae8af8	add x0,x0,#0x275
00ae8afc	add x2,x2,#0x62a
00ae8b00	mov w1,#0xe7
00ae8b04	bl 0x00c342b0
00ae8b08	mov w1,#0x100
00ae8b0c	orr w0,wzr,#0xf
00ae8b10	movk w1,#0xc, LSL #16
00ae8b14	mov x2,xzr
00ae8b18	bl 0x00c342c0
00ae8b1c	mov x0,x19
00ae8b20	ldp x29,x30,[sp, #0x20]
00ae8b24	ldp x20,x19,[sp, #0x10]
00ae8b28	ldr x21,[sp], #0x30
00ae8b2c	ret
