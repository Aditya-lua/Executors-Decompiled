; ossl_policy_level_add_node @ 00b13a50
00b13a50	stp x24,x23,[sp, #-0x40]!
00b13a54	stp x22,x21,[sp, #0x10]
00b13a58	stp x20,x19,[sp, #0x20]
00b13a5c	stp x29,x30,[sp, #0x30]
00b13a60	ldr x8,[x3, #0x8]
00b13a64	mov w24,w4
00b13a68	mov x22,x3
00b13a6c	mov x21,x2
00b13a70	mov x23,x1
00b13a74	mov x20,x0
00b13a78	add x29,sp,#0x30
00b13a7c	cbz x8,0x00b13a90
00b13a80	ldr x9,[x22]
00b13a84	mov x19,xzr
00b13a88	cmp x9,x8
00b13a8c	b.cs 0x00b13c4c
00b13a90	adrp x1,0x2a8000
00b13a94	add x1,x1,#0x9e2
00b13a98	orr w0,wzr,#0x18
00b13a9c	mov w2,#0x47
00b13aa0	bl 0x00c34250
00b13aa4	mov x19,x0
00b13aa8	cbz x0,0x00b13ad8
00b13aac	stp x23,x21,[x19]
00b13ab0	cbz x20,0x00b13b34
00b13ab4	ldr x0,[x23, #0x8]
00b13ab8	bl 0x00c37750
00b13abc	cmp w0,#0x2ea
00b13ac0	b.ne 0x00b13b0c
00b13ac4	ldr x8,[x20, #0x10]
00b13ac8	cbnz x8,0x00b13c34
00b13acc	str x19,[x20, #0x10]
00b13ad0	cbnz w24,0x00b13b38
00b13ad4	b 0x00b13b58
00b13ad8	bl 0x00c342a0
00b13adc	adrp x0,0x2a8000
00b13ae0	adrp x2,0x2b6000
00b13ae4	add x0,x0,#0x9e2
00b13ae8	add x2,x2,#0x6b6
00b13aec	mov w1,#0x49
00b13af0	bl 0x00c342b0
00b13af4	mov w1,#0x100
00b13af8	mov w0,#0x22
00b13afc	movk w1,#0xc, LSL #16
00b13b00	mov x2,xzr
00b13b04	bl 0x00c342c0
00b13b08	b 0x00b13c4c
00b13b0c	ldr x0,[x20, #0x8]
00b13b10	cbnz x0,0x00b13b28
00b13b14	adrp x0,0xb13000
00b13b18	add x0,x0,#0x95c
00b13b1c	bl 0x00c35340
00b13b20	str x0,[x20, #0x8]
00b13b24	cbz x0,0x00b13c04
00b13b28	mov x1,x19
00b13b2c	bl 0x00c347a0
00b13b30	cbz w0,0x00b13b94
00b13b34	cbz w24,0x00b13b58
00b13b38	ldr x0,[x22, #0x20]
00b13b3c	cbnz x0,0x00b13b4c
00b13b40	bl 0x00c34780
00b13b44	str x0,[x22, #0x20]
00b13b48	cbz x0,0x00b13bb0
00b13b4c	mov x1,x23
00b13b50	bl 0x00c347a0
00b13b54	cbz w0,0x00b13b78
00b13b58	ldr x8,[x22]
00b13b5c	add x8,x8,#0x1
00b13b60	str x8,[x22]
00b13b64	cbz x21,0x00b13c4c
00b13b68	ldr w8,[x21, #0x10]
00b13b6c	add w8,w8,#0x1
00b13b70	str w8,[x21, #0x10]
00b13b74	b 0x00b13c4c
00b13b78	bl 0x00c342a0
00b13b7c	adrp x0,0x2a8000
00b13b80	adrp x2,0x2b6000
00b13b84	add x0,x0,#0x9e2
00b13b88	add x2,x2,#0x6b6
00b13b8c	mov w1,#0x6a
00b13b90	b 0x00b13bc8
00b13b94	bl 0x00c342a0
00b13b98	adrp x0,0x2a8000
00b13b9c	adrp x2,0x2b6000
00b13ba0	add x0,x0,#0x9e2
00b13ba4	add x2,x2,#0x6b6
00b13ba8	mov w1,#0x5c
00b13bac	b 0x00b13c1c
00b13bb0	bl 0x00c342a0
00b13bb4	adrp x0,0x2a8000
00b13bb8	adrp x2,0x2b6000
00b13bbc	add x0,x0,#0x9e2
00b13bc0	add x2,x2,#0x6b6
00b13bc4	mov w1,#0x66
00b13bc8	bl 0x00c342b0
00b13bcc	mov w1,#0x100
00b13bd0	mov w0,#0x22
00b13bd4	movk w1,#0xc, LSL #16
00b13bd8	mov x2,xzr
00b13bdc	bl 0x00c342c0
00b13be0	cbz x20,0x00b13c34
00b13be4	ldr x8,[x20, #0x10]
00b13be8	cmp x8,x19
00b13bec	b.eq 0x00b13bfc
00b13bf0	ldr x0,[x20, #0x8]
00b13bf4	bl 0x00c325f0
00b13bf8	b 0x00b13c34
00b13bfc	str xzr,[x20, #0x10]
00b13c00	b 0x00b13c34
00b13c04	bl 0x00c342a0
00b13c08	adrp x0,0x2a8000
00b13c0c	adrp x2,0x2b6000
00b13c10	add x0,x0,#0x9e2
00b13c14	add x2,x2,#0x6b6
00b13c18	mov w1,#0x58
00b13c1c	bl 0x00c342b0
00b13c20	mov w1,#0x100
00b13c24	mov w0,#0x22
00b13c28	movk w1,#0xc, LSL #16
00b13c2c	mov x2,xzr
00b13c30	bl 0x00c342c0
00b13c34	adrp x1,0x2a8000
00b13c38	add x1,x1,#0x9e2
00b13c3c	mov w2,#0x84
00b13c40	mov x0,x19
00b13c44	bl 0x00c32310
00b13c48	mov x19,xzr
00b13c4c	mov x0,x19
00b13c50	ldp x29,x30,[sp, #0x30]
00b13c54	ldp x20,x19,[sp, #0x20]
00b13c58	ldp x22,x21,[sp, #0x10]
00b13c5c	ldp x24,x23,[sp], #0x40
00b13c60	ret
