; EVP_PKEY_derive_set_peer_ex @ 00a63920
00a63920	sub sp,sp,#0x40
00a63924	stp x22,x21,[sp, #0x10]
00a63928	stp x20,x19,[sp, #0x20]
00a6392c	stp x29,x30,[sp, #0x30]
00a63930	add x29,sp,#0x30
00a63934	str xzr,[sp, #0x8]
00a63938	cbz x0,0x00a639f4
00a6393c	ldr w8,[x0]
00a63940	mov x20,x1
00a63944	mov x19,x0
00a63948	cmp w8,#0x800
00a6394c	b.ne 0x00a63a54
00a63950	ldr x8,[x19, #0x30]
00a63954	cbz x8,0x00a63a54
00a63958	ldr x8,[x19, #0x28]
00a6395c	ldr x9,[x8, #0x40]
00a63960	cbz x9,0x00a63a2c
00a63964	cbz w2,0x00a63998
00a63968	ldp x0,x2,[x19, #0x8]
00a6396c	mov x1,x20
00a63970	bl 0x00c34640
00a63974	cbz x0,0x00a63a48
00a63978	mov x21,x0
00a6397c	bl 0x00c37150
00a63980	mov w22,w0
00a63984	mov x0,x21
00a63988	bl 0x00c34620
00a6398c	cmp w22,#0x1
00a63990	b.lt 0x00a63a48
00a63994	ldr x8,[x19, #0x28]
00a63998	ldr x0,[x19, #0x20]
00a6399c	ldr x21,[x8, #0x18]
00a639a0	bl 0x00c3bf30
00a639a4	ldr x2,[x19, #0x10]
00a639a8	mov x1,x0
00a639ac	mov x0,x21
00a639b0	bl 0x00c3bf80
00a639b4	str x0,[sp, #0x8]
00a639b8	cbz x0,0x00a63a50
00a639bc	ldp x1,x3,[x19, #0x8]
00a639c0	mov x21,x0
00a639c4	add x2,sp,#0x8
00a639c8	mov x0,x20
00a639cc	bl 0x00c3bfc0
00a639d0	mov x22,x0
00a639d4	mov x0,x21
00a639d8	bl 0x00c36350
00a639dc	cbz x22,0x00a63a54
00a639e0	ldp x8,x0,[x19, #0x28]
00a639e4	mov x1,x22
00a639e8	ldr x8,[x8, #0x40]
00a639ec	blr x8
00a639f0	b 0x00a63af4
00a639f4	bl 0x00c342a0
00a639f8	adrp x0,0x2d7000
00a639fc	adrp x2,0x2c3000
00a63a00	add x0,x0,#0xecb
00a63a04	add x2,x2,#0x9fb
00a63a08	mov w1,#0x182
00a63a0c	bl 0x00c342b0
00a63a10	mov w1,#0x102
00a63a14	orr w0,wzr,#0x6
00a63a18	movk w1,#0xc, LSL #16
00a63a1c	mov x2,xzr
00a63a20	bl 0x00c342c0
00a63a24	mov w0,#0xffffffff
00a63a28	b 0x00a63af4
00a63a2c	bl 0x00c342a0
00a63a30	adrp x0,0x2d7000
00a63a34	adrp x2,0x2c3000
00a63a38	add x0,x0,#0xecb
00a63a3c	add x2,x2,#0x9fb
00a63a40	mov w1,#0x18a
00a63a44	b 0x00a63adc
00a63a48	mov w0,#0xffffffff
00a63a4c	b 0x00a63af4
00a63a50	bl 0x00c36350
00a63a54	ldr x8,[x19, #0x78]
00a63a58	cbz x8,0x00a63ac4
00a63a5c	ldr x9,[x8, #0xb8]
00a63a60	cbnz x9,0x00a63a74
00a63a64	ldr x9,[x8, #0x98]
00a63a68	cbnz x9,0x00a63a74
00a63a6c	ldr x9,[x8, #0xa8]
00a63a70	cbz x9,0x00a63ac4
00a63a74	ldr x8,[x8, #0xc0]
00a63a78	cbz x8,0x00a63ac4
00a63a7c	ldr w9,[x19]
00a63a80	cmp w9,#0x200
00a63a84	b.eq 0x00a63a98
00a63a88	cmp w9,#0x400
00a63a8c	b.eq 0x00a63a98
00a63a90	cmp w9,#0x800
00a63a94	b.ne 0x00a63b08
00a63a98	mov w1,#0x2
00a63a9c	mov x0,x19
00a63aa0	mov w2,wzr
00a63aa4	mov x3,x20
00a63aa8	blr x8
00a63aac	cmp w0,#0x1
00a63ab0	b.lt 0x00a63af4
00a63ab4	cmp w0,#0x2
00a63ab8	b.ne 0x00a63b30
00a63abc	mov w0,#0x1
00a63ac0	b 0x00a63af4
00a63ac4	bl 0x00c342a0
00a63ac8	adrp x0,0x2d7000
00a63acc	adrp x2,0x2c3000
00a63ad0	add x0,x0,#0xecb
00a63ad4	add x2,x2,#0x9fb
00a63ad8	mov w1,#0x1bc
00a63adc	bl 0x00c342b0
00a63ae0	orr w0,wzr,#0x6
00a63ae4	mov w1,#0x96
00a63ae8	mov x2,xzr
00a63aec	bl 0x00c342c0
00a63af0	orr w0,wzr,#0xfffffffe
00a63af4	ldp x29,x30,[sp, #0x30]
00a63af8	ldp x20,x19,[sp, #0x20]
00a63afc	ldp x22,x21,[sp, #0x10]
00a63b00	add sp,sp,#0x40
00a63b04	ret
00a63b08	bl 0x00c342a0
00a63b0c	adrp x0,0x2d7000
00a63b10	adrp x2,0x2c3000
00a63b14	add x0,x0,#0xecb
00a63b18	add x2,x2,#0x9fb
00a63b1c	mov w1,#0x1c2
00a63b20	bl 0x00c342b0
00a63b24	orr w0,wzr,#0x6
00a63b28	mov w1,#0x97
00a63b2c	b 0x00a63a1c
00a63b30	ldr x8,[x19, #0x88]
00a63b34	cbz x8,0x00a63ba0
00a63b38	ldr w8,[x8]
00a63b3c	ldr w9,[x20]
00a63b40	cmp w8,w9
00a63b44	b.ne 0x00a63bc8
00a63b48	mov x0,x20
00a63b4c	bl 0x00c35f80
00a63b50	cbnz w0,0x00a63b64
00a63b54	ldr x0,[x19, #0x88]
00a63b58	mov x1,x20
00a63b5c	bl 0x00c3d1f0
00a63b60	cbz w0,0x00a63bf8
00a63b64	ldr x0,[x19, #0x90]
00a63b68	bl 0x00c32450
00a63b6c	ldr x8,[x19, #0x78]
00a63b70	str x20,[x19, #0x90]
00a63b74	mov w1,#0x2
00a63b78	mov w2,#0x1
00a63b7c	ldr x8,[x8, #0xc0]
00a63b80	mov x0,x19
00a63b84	mov x3,x20
00a63b88	blr x8
00a63b8c	cmp w0,#0x0
00a63b90	b.le 0x00a63bf0
00a63b94	mov x0,x20
00a63b98	bl 0x00c34730
00a63b9c	b 0x00a63abc
00a63ba0	bl 0x00c342a0
00a63ba4	adrp x0,0x2d7000
00a63ba8	adrp x2,0x2c3000
00a63bac	add x0,x0,#0xecb
00a63bb0	add x2,x2,#0x9fb
00a63bb4	mov w1,#0x1cf
00a63bb8	bl 0x00c342b0
00a63bbc	orr w0,wzr,#0x6
00a63bc0	mov w1,#0x9a
00a63bc4	b 0x00a63a1c
00a63bc8	bl 0x00c342a0
00a63bcc	adrp x0,0x2d7000
00a63bd0	adrp x2,0x2c3000
00a63bd4	add x0,x0,#0xecb
00a63bd8	add x2,x2,#0x9fb
00a63bdc	mov w1,#0x1d4
00a63be0	bl 0x00c342b0
00a63be4	orr w0,wzr,#0x6
00a63be8	mov w1,#0x65
00a63bec	b 0x00a63a1c
00a63bf0	str xzr,[x19, #0x90]
00a63bf4	b 0x00a63af4
00a63bf8	bl 0x00c342a0
00a63bfc	adrp x0,0x2d7000
00a63c00	adrp x2,0x2c3000
00a63c04	add x0,x0,#0xecb
00a63c08	add x2,x2,#0x9fb
00a63c0c	mov w1,#0x1e1
00a63c10	bl 0x00c342b0
00a63c14	orr w0,wzr,#0x6
00a63c18	mov w1,#0x99
00a63c1c	b 0x00a63a1c
