; EVP_PKEY_CTX_set_dsa_paramgen_gindex @ 00a79868
00a79868	sub sp,sp,#0xa0
00a7986c	stp x29,x30,[sp, #0x90]
00a79870	add x29,sp,#0x90
00a79874	str x19,[sp, #0x80]
00a79878	stur w1,[x29, #-0x4]
00a7987c	cbz x0,0x00a79904
00a79880	ldr w8,[x0]
00a79884	mov x19,x0
00a79888	cmp w8,#0x2
00a7988c	b.eq 0x00a79898
00a79890	cmp w8,#0x4
00a79894	b.ne 0x00a79904
00a79898	ldr x8,[x19, #0x78]
00a7989c	cbz x8,0x00a798ac
00a798a0	ldr w8,[x8]
00a798a4	cmp w8,#0x74
00a798a8	b.ne 0x00a79944
00a798ac	adrp x0,0x2a7000
00a798b0	add x0,x0,#0xf40
00a798b4	add x8,sp,#0x8
00a798b8	sub x1,x29,#0x4
00a798bc	bl 0x00c36260
00a798c0	ldr x8,[sp, #0x28]
00a798c4	ldur q0,[sp, #0x18]
00a798c8	ldur q1,[sp, #0x8]
00a798cc	str x8,[sp, #0x50]
00a798d0	add x8,sp,#0x8
00a798d4	stp q1,q0,[sp, #0x30]
00a798d8	bl 0x00c34c40
00a798dc	ldr x8,[sp, #0x28]
00a798e0	ldur q0,[sp, #0x18]
00a798e4	ldur q1,[sp, #0x8]
00a798e8	add x1,sp,#0x30
00a798ec	mov x0,x19
00a798f0	str x8,[sp, #0x78]
00a798f4	stur q0,[sp, #0x68]
00a798f8	stur q1,[sp, #0x58]
00a798fc	bl 0x00c36dd0
00a79900	b 0x00a79934
00a79904	bl 0x00c342a0
00a79908	adrp x0,0x2bb000
00a7990c	adrp x2,0x2aa000
00a79910	add x0,x0,#0xce6
00a79914	add x2,x2,#0x26c
00a79918	mov w1,#0x14
00a7991c	bl 0x00c342b0
00a79920	orr w0,wzr,#0x6
00a79924	mov w1,#0x93
00a79928	mov x2,xzr
00a7992c	bl 0x00c342c0
00a79930	orr w0,wzr,#0xfffffffe
00a79934	ldp x29,x30,[sp, #0x90]
00a79938	ldr x19,[sp, #0x80]
00a7993c	add sp,sp,#0xa0
00a79940	ret
00a79944	mov w0,#0xffffffff
00a79948	b 0x00a79934
