; EVP_PKEY_CTX_set_dh_paramgen_seed @ 00a569a8
00a569a8	sub sp,sp,#0xa0
00a569ac	str x19,[sp, #0x80]
00a569b0	stp x29,x30,[sp, #0x90]
00a569b4	add x29,sp,#0x90
00a569b8	cbz x0,0x00a56a30
00a569bc	ldr w8,[x0]
00a569c0	mov x19,x0
00a569c4	cmp w8,#0x2
00a569c8	b.eq 0x00a569d4
00a569cc	cmp w8,#0x4
00a569d0	b.ne 0x00a56a30
00a569d4	ldr x8,[x19, #0x20]
00a569d8	cbz x8,0x00a56a70
00a569dc	adrp x0,0x2bb000
00a569e0	add x0,x0,#0x864
00a569e4	add x8,sp,#0x8
00a569e8	bl 0x00c34c50
00a569ec	ldr x8,[sp, #0x28]
00a569f0	ldur q0,[sp, #0x18]
00a569f4	ldur q1,[sp, #0x8]
00a569f8	str x8,[sp, #0x50]
00a569fc	add x8,sp,#0x8
00a56a00	stp q1,q0,[sp, #0x30]
00a56a04	bl 0x00c34c40
00a56a08	ldr x8,[sp, #0x28]
00a56a0c	ldur q0,[sp, #0x18]
00a56a10	ldur q1,[sp, #0x8]
00a56a14	add x1,sp,#0x30
00a56a18	mov x0,x19
00a56a1c	str x8,[sp, #0x78]
00a56a20	stur q0,[sp, #0x68]
00a56a24	stur q1,[sp, #0x58]
00a56a28	bl 0x00c3c120
00a56a2c	b 0x00a56a60
00a56a30	bl 0x00c342a0
00a56a34	adrp x0,0x2cf000
00a56a38	adrp x2,0x2c5000
00a56a3c	add x0,x0,#0xb4f
00a56a40	add x2,x2,#0xa48
00a56a44	mov w1,#0x16
00a56a48	bl 0x00c342b0
00a56a4c	orr w0,wzr,#0x6
00a56a50	mov w1,#0x93
00a56a54	mov x2,xzr
00a56a58	bl 0x00c342c0
00a56a5c	orr w0,wzr,#0xfffffffe
00a56a60	ldp x29,x30,[sp, #0x90]
00a56a64	ldr x19,[sp, #0x80]
00a56a68	add sp,sp,#0xa0
00a56a6c	ret
00a56a70	ldr x8,[x19, #0x78]
00a56a74	ldr w8,[x8]
00a56a78	cmp w8,#0x398
00a56a7c	b.eq 0x00a569dc
00a56a80	cmp w8,#0x1c
00a56a84	b.eq 0x00a569dc
00a56a88	mov w0,#0xffffffff
00a56a8c	b 0x00a56a60
