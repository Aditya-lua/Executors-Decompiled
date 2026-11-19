; EVP_MAC_CTX_get_block_size @ 00a685a8
00a685a8	sub sp,sp,#0xa0
00a685ac	stp x29,x30,[sp, #0x90]
00a685b0	add x29,sp,#0x90
00a685b4	stur xzr,[x29, #-0x8]
00a685b8	ldr x8,[x0, #0x8]
00a685bc	str x19,[sp, #0x80]
00a685c0	cbz x8,0x00a6863c
00a685c4	mov x19,x0
00a685c8	add x0,sp,#0x30
00a685cc	mov w2,#0x50
00a685d0	mov w1,wzr
00a685d4	bl 0x00c301c0
00a685d8	adrp x0,0x2dc000
00a685dc	add x0,x0,#0x8b
00a685e0	add x8,sp,#0x8
00a685e4	sub x1,x29,#0x8
00a685e8	bl 0x00c36270
00a685ec	ldr x8,[sp, #0x28]
00a685f0	ldur q0,[sp, #0x18]
00a685f4	ldur q1,[sp, #0x8]
00a685f8	str x8,[sp, #0x50]
00a685fc	stp q1,q0,[sp, #0x30]
00a68600	ldr x9,[x19]
00a68604	ldr x8,[x9, #0x80]
00a68608	cbz x8,0x00a68620
00a6860c	ldr x0,[x19, #0x8]
00a68610	add x1,sp,#0x30
00a68614	blr x8
00a68618	cbnz w0,0x00a68634
00a6861c	b 0x00a6863c
00a68620	ldr x8,[x9, #0x78]
00a68624	cbz x8,0x00a6863c
00a68628	add x0,sp,#0x30
00a6862c	blr x8
00a68630	cbz w0,0x00a6863c
00a68634	ldur x0,[x29, #-0x8]
00a68638	b 0x00a68640
00a6863c	mov x0,xzr
00a68640	ldp x29,x30,[sp, #0x90]
00a68644	ldr x19,[sp, #0x80]
00a68648	add sp,sp,#0xa0
00a6864c	ret
