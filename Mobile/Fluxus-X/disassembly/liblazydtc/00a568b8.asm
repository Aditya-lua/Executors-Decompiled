; EVP_PKEY_CTX_set_dh_paramgen_gindex @ 00a568b8
00a568b8	sub sp,sp,#0xa0
00a568bc	stp x29,x30,[sp, #0x90]
00a568c0	add x29,sp,#0x90
00a568c4	str x19,[sp, #0x80]
00a568c8	stur w1,[x29, #-0x4]
00a568cc	cbz x0,0x00a56948
00a568d0	ldr w8,[x0]
00a568d4	mov x19,x0
00a568d8	cmp w8,#0x2
00a568dc	b.eq 0x00a568e8
00a568e0	cmp w8,#0x4
00a568e4	b.ne 0x00a56948
00a568e8	ldr x8,[x19, #0x20]
00a568ec	cbz x8,0x00a56988
00a568f0	adrp x0,0x2a7000
00a568f4	add x0,x0,#0xf40
00a568f8	add x8,sp,#0x8
00a568fc	sub x1,x29,#0x4
00a56900	bl 0x00c36260
00a56904	ldr x8,[sp, #0x28]
00a56908	ldur q0,[sp, #0x18]
00a5690c	ldur q1,[sp, #0x8]
00a56910	str x8,[sp, #0x50]
00a56914	add x8,sp,#0x8
00a56918	stp q1,q0,[sp, #0x30]
00a5691c	bl 0x00c34c40
00a56920	ldr x8,[sp, #0x28]
00a56924	ldur q0,[sp, #0x18]
00a56928	ldur q1,[sp, #0x8]
00a5692c	add x1,sp,#0x30
00a56930	mov x0,x19
00a56934	str x8,[sp, #0x78]
00a56938	stur q0,[sp, #0x68]
00a5693c	stur q1,[sp, #0x58]
00a56940	bl 0x00c3c120
00a56944	b 0x00a56978
00a56948	bl 0x00c342a0
00a5694c	adrp x0,0x2cf000
00a56950	adrp x2,0x2c5000
00a56954	add x0,x0,#0xb4f
00a56958	add x2,x2,#0xa48
00a5695c	mov w1,#0x16
00a56960	bl 0x00c342b0
00a56964	orr w0,wzr,#0x6
00a56968	mov w1,#0x93
00a5696c	mov x2,xzr
00a56970	bl 0x00c342c0
00a56974	orr w0,wzr,#0xfffffffe
00a56978	ldp x29,x30,[sp, #0x90]
00a5697c	ldr x19,[sp, #0x80]
00a56980	add sp,sp,#0xa0
00a56984	ret
00a56988	ldr x8,[x19, #0x78]
00a5698c	ldr w8,[x8]
00a56990	cmp w8,#0x398
00a56994	b.eq 0x00a568f0
00a56998	cmp w8,#0x1c
00a5699c	b.eq 0x00a568f0
00a569a0	mov w0,#0xffffffff
00a569a4	b 0x00a56978
