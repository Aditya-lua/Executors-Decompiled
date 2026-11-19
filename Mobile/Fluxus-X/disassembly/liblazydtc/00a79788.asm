; EVP_PKEY_CTX_set_dsa_paramgen_type @ 00a79788
00a79788	sub sp,sp,#0xa0
00a7978c	str x19,[sp, #0x80]
00a79790	stp x29,x30,[sp, #0x90]
00a79794	add x29,sp,#0x90
00a79798	cbz x0,0x00a79820
00a7979c	ldr w8,[x0]
00a797a0	mov x19,x0
00a797a4	cmp w8,#0x2
00a797a8	b.eq 0x00a797b4
00a797ac	cmp w8,#0x4
00a797b0	b.ne 0x00a79820
00a797b4	ldr x8,[x19, #0x78]
00a797b8	cbz x8,0x00a797c8
00a797bc	ldr w8,[x8]
00a797c0	cmp w8,#0x74
00a797c4	b.ne 0x00a79860
00a797c8	adrp x0,0x2ce000
00a797cc	add x0,x0,#0xcd9
00a797d0	add x8,sp,#0x8
00a797d4	mov x2,xzr
00a797d8	bl 0x00c36280
00a797dc	ldr x8,[sp, #0x28]
00a797e0	ldur q0,[sp, #0x18]
00a797e4	ldur q1,[sp, #0x8]
00a797e8	str x8,[sp, #0x50]
00a797ec	add x8,sp,#0x8
00a797f0	stp q1,q0,[sp, #0x30]
00a797f4	bl 0x00c34c40
00a797f8	ldr x8,[sp, #0x28]
00a797fc	ldur q0,[sp, #0x18]
00a79800	ldur q1,[sp, #0x8]
00a79804	add x1,sp,#0x30
00a79808	mov x0,x19
00a7980c	str x8,[sp, #0x78]
00a79810	stur q0,[sp, #0x68]
00a79814	stur q1,[sp, #0x58]
00a79818	bl 0x00c36dd0
00a7981c	b 0x00a79850
00a79820	bl 0x00c342a0
00a79824	adrp x0,0x2bb000
00a79828	adrp x2,0x2aa000
00a7982c	add x0,x0,#0xce6
00a79830	add x2,x2,#0x26c
00a79834	mov w1,#0x14
00a79838	bl 0x00c342b0
00a7983c	orr w0,wzr,#0x6
00a79840	mov w1,#0x93
00a79844	mov x2,xzr
00a79848	bl 0x00c342c0
00a7984c	orr w0,wzr,#0xfffffffe
00a79850	ldp x29,x30,[sp, #0x90]
00a79854	ldr x19,[sp, #0x80]
00a79858	add sp,sp,#0xa0
00a7985c	ret
00a79860	mov w0,#0xffffffff
00a79864	b 0x00a79850
