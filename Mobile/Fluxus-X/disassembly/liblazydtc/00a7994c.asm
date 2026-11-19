; EVP_PKEY_CTX_set_dsa_paramgen_seed @ 00a7994c
00a7994c	sub sp,sp,#0xa0
00a79950	str x19,[sp, #0x80]
00a79954	stp x29,x30,[sp, #0x90]
00a79958	add x29,sp,#0x90
00a7995c	cbz x0,0x00a799e0
00a79960	ldr w8,[x0]
00a79964	mov x19,x0
00a79968	cmp w8,#0x2
00a7996c	b.eq 0x00a79978
00a79970	cmp w8,#0x4
00a79974	b.ne 0x00a799e0
00a79978	ldr x8,[x19, #0x78]
00a7997c	cbz x8,0x00a7998c
00a79980	ldr w8,[x8]
00a79984	cmp w8,#0x74
00a79988	b.ne 0x00a79a20
00a7998c	adrp x0,0x2bb000
00a79990	add x0,x0,#0x864
00a79994	add x8,sp,#0x8
00a79998	bl 0x00c34c50
00a7999c	ldr x8,[sp, #0x28]
00a799a0	ldur q0,[sp, #0x18]
00a799a4	ldur q1,[sp, #0x8]
00a799a8	str x8,[sp, #0x50]
00a799ac	add x8,sp,#0x8
00a799b0	stp q1,q0,[sp, #0x30]
00a799b4	bl 0x00c34c40
00a799b8	ldr x8,[sp, #0x28]
00a799bc	ldur q0,[sp, #0x18]
00a799c0	ldur q1,[sp, #0x8]
00a799c4	add x1,sp,#0x30
00a799c8	mov x0,x19
00a799cc	str x8,[sp, #0x78]
00a799d0	stur q0,[sp, #0x68]
00a799d4	stur q1,[sp, #0x58]
00a799d8	bl 0x00c36dd0
00a799dc	b 0x00a79a10
00a799e0	bl 0x00c342a0
00a799e4	adrp x0,0x2bb000
00a799e8	adrp x2,0x2aa000
00a799ec	add x0,x0,#0xce6
00a799f0	add x2,x2,#0x26c
00a799f4	mov w1,#0x14
00a799f8	bl 0x00c342b0
00a799fc	orr w0,wzr,#0x6
00a79a00	mov w1,#0x93
00a79a04	mov x2,xzr
00a79a08	bl 0x00c342c0
00a79a0c	orr w0,wzr,#0xfffffffe
00a79a10	ldp x29,x30,[sp, #0x90]
00a79a14	ldr x19,[sp, #0x80]
00a79a18	add sp,sp,#0xa0
00a79a1c	ret
00a79a20	mov w0,#0xffffffff
00a79a24	b 0x00a79a10
