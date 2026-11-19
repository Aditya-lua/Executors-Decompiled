; EVP_PKEY_CTX_set_dsa_paramgen_md_props @ 00a79bf8
00a79bf8	sub sp,sp,#0xe0
00a79bfc	stp x22,x21,[sp, #0xb0]
00a79c00	stp x20,x19,[sp, #0xc0]
00a79c04	stp x29,x30,[sp, #0xd0]
00a79c08	add x29,sp,#0xd0
00a79c0c	cbz x0,0x00a79cd4
00a79c10	ldr w8,[x0]
00a79c14	mov x20,x2
00a79c18	mov x19,x0
00a79c1c	cmp w8,#0x2
00a79c20	b.eq 0x00a79c2c
00a79c24	cmp w8,#0x4
00a79c28	b.ne 0x00a79cd4
00a79c2c	ldr x8,[x19, #0x78]
00a79c30	cbz x8,0x00a79c40
00a79c34	ldr w8,[x8]
00a79c38	cmp w8,#0x74
00a79c3c	b.ne 0x00a79d18
00a79c40	adrp x0,0x29d000
00a79c44	add x22,sp,#0x30
00a79c48	add x0,x0,#0xe2e
00a79c4c	add x8,sp,#0x8
00a79c50	mov x2,xzr
00a79c54	add x21,x22,#0x28
00a79c58	bl 0x00c36280
00a79c5c	ldr x8,[sp, #0x28]
00a79c60	ldur q0,[sp, #0x18]
00a79c64	ldur q1,[sp, #0x8]
00a79c68	str x8,[sp, #0x50]
00a79c6c	stp q1,q0,[sp, #0x30]
00a79c70	cbz x20,0x00a79ca8
00a79c74	adrp x0,0x2d3000
00a79c78	add x0,x0,#0x7c2
00a79c7c	add x8,sp,#0x8
00a79c80	mov x1,x20
00a79c84	mov x2,xzr
00a79c88	add x22,x22,#0x50
00a79c8c	bl 0x00c36280
00a79c90	ldr x8,[sp, #0x28]
00a79c94	ldur q0,[sp, #0x8]
00a79c98	ldur q1,[sp, #0x18]
00a79c9c	str x8,[x21, #0x20]
00a79ca0	stp q0,q1,[x21]
00a79ca4	mov x21,x22
00a79ca8	add x8,sp,#0x8
00a79cac	bl 0x00c34c40
00a79cb0	ldr x8,[sp, #0x28]
00a79cb4	ldur q0,[sp, #0x8]
00a79cb8	ldur q1,[sp, #0x18]
00a79cbc	add x1,sp,#0x30
00a79cc0	mov x0,x19
00a79cc4	str x8,[x21, #0x20]
00a79cc8	stp q0,q1,[x21]
00a79ccc	bl 0x00c36dd0
00a79cd0	b 0x00a79d04
00a79cd4	bl 0x00c342a0
00a79cd8	adrp x0,0x2bb000
00a79cdc	adrp x2,0x2aa000
00a79ce0	add x0,x0,#0xce6
00a79ce4	add x2,x2,#0x26c
00a79ce8	mov w1,#0x14
00a79cec	bl 0x00c342b0
00a79cf0	orr w0,wzr,#0x6
00a79cf4	mov w1,#0x93
00a79cf8	mov x2,xzr
00a79cfc	bl 0x00c342c0
00a79d00	orr w0,wzr,#0xfffffffe
00a79d04	ldp x29,x30,[sp, #0xd0]
00a79d08	ldp x20,x19,[sp, #0xc0]
00a79d0c	ldp x22,x21,[sp, #0xb0]
00a79d10	add sp,sp,#0xe0
00a79d14	ret
00a79d18	mov w0,#0xffffffff
00a79d1c	b 0x00a79d04
