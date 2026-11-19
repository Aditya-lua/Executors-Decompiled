; PKCS7_set_content @ 00ac2a54
00ac2a54	stp x20,x19,[sp, #-0x20]!
00ac2a58	stp x29,x30,[sp, #0x10]
00ac2a5c	mov x20,x0
00ac2a60	ldr x0,[x0, #0x18]
00ac2a64	add x29,sp,#0x10
00ac2a68	mov x19,x1
00ac2a6c	bl 0x00c37750
00ac2a70	cmp w0,#0x19
00ac2a74	b.eq 0x00ac2a9c
00ac2a78	cmp w0,#0x16
00ac2a7c	b.ne 0x00ac2ab8
00ac2a80	ldr x8,[x20, #0x20]
00ac2a84	ldr x0,[x8, #0x28]
00ac2a88	bl 0x00c3f560
00ac2a8c	ldr x8,[x20, #0x20]
00ac2a90	mov w0,#0x1
00ac2a94	str x19,[x8, #0x28]
00ac2a98	b 0x00ac2ae8
00ac2a9c	ldr x8,[x20, #0x20]
00ac2aa0	ldr x0,[x8, #0x10]
00ac2aa4	bl 0x00c3f560
00ac2aa8	ldr x8,[x20, #0x20]
00ac2aac	mov w0,#0x1
00ac2ab0	str x19,[x8, #0x10]
00ac2ab4	b 0x00ac2ae8
00ac2ab8	bl 0x00c342a0
00ac2abc	adrp x0,0x2ce000
00ac2ac0	adrp x2,0x2d0000
00ac2ac4	add x0,x0,#0x1ca
00ac2ac8	add x2,x2,#0x29d
00ac2acc	mov w1,#0x66
00ac2ad0	bl 0x00c342b0
00ac2ad4	mov w0,#0x21
00ac2ad8	orr w1,wzr,#0x70
00ac2adc	mov x2,xzr
00ac2ae0	bl 0x00c342c0
00ac2ae4	mov w0,wzr
00ac2ae8	ldp x29,x30,[sp, #0x10]
00ac2aec	ldp x20,x19,[sp], #0x20
00ac2af0	ret
