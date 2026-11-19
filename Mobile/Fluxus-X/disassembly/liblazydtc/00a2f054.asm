; ossl_ec_key_private_check @ 00a2f054
00a2f054	stp x20,x19,[sp, #-0x20]!
00a2f058	stp x29,x30,[sp, #0x10]
00a2f05c	add x29,sp,#0x10
00a2f060	cbz x0,0x00a2f0c8
00a2f064	ldr x8,[x0, #0x18]
00a2f068	mov x19,x0
00a2f06c	cbz x8,0x00a2f0c8
00a2f070	ldr x20,[x19, #0x28]
00a2f074	cbz x20,0x00a2f0c8
00a2f078	bl 0x00c38de0
00a2f07c	mov x1,x0
00a2f080	mov x0,x20
00a2f084	bl 0x00c38cc0
00a2f088	tbnz w0,#0x1f,0x00a2f0a0
00a2f08c	ldr x8,[x19, #0x18]
00a2f090	ldr x0,[x19, #0x28]
00a2f094	ldr x1,[x8, #0x10]
00a2f098	bl 0x00c38cc0
00a2f09c	tbnz w0,#0x1f,0x00a2f108
00a2f0a0	bl 0x00c342a0
00a2f0a4	adrp x0,0x2b4000
00a2f0a8	adrp x2,0x2af000
00a2f0ac	add x0,x0,#0x15e
00a2f0b0	add x2,x2,#0xe47
00a2f0b4	mov w1,#0x206
00a2f0b8	bl 0x00c342b0
00a2f0bc	mov w0,#0x10
00a2f0c0	mov w1,#0x7b
00a2f0c4	b 0x00a2f0f0
00a2f0c8	bl 0x00c342a0
00a2f0cc	adrp x0,0x2b4000
00a2f0d0	adrp x2,0x2af000
00a2f0d4	add x0,x0,#0x15e
00a2f0d8	add x2,x2,#0xe47
00a2f0dc	mov w1,#0x201
00a2f0e0	bl 0x00c342b0
00a2f0e4	mov w1,#0x102
00a2f0e8	mov w0,#0x10
00a2f0ec	movk w1,#0xc, LSL #16
00a2f0f0	mov x2,xzr
00a2f0f4	bl 0x00c342c0
00a2f0f8	mov w0,wzr
00a2f0fc	ldp x29,x30,[sp, #0x10]
00a2f100	ldp x20,x19,[sp], #0x20
00a2f104	ret
00a2f108	mov w0,#0x1
00a2f10c	b 0x00a2f0fc
