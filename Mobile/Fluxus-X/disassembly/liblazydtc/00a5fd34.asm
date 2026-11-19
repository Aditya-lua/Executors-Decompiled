; EVP_PKEY_CTX_get_group_name @ 00a5fd34
00a5fd34	sub sp,sp,#0xb0
00a5fd38	stp x22,x21,[sp, #0x80]
00a5fd3c	stp x20,x19,[sp, #0x90]
00a5fd40	mov x21,x2
00a5fd44	mov x22,x1
00a5fd48	mov x19,x0
00a5fd4c	add x0,sp,#0x30
00a5fd50	mov w2,#0x50
00a5fd54	mov w1,wzr
00a5fd58	stp x29,x30,[sp, #0xa0]
00a5fd5c	add x29,sp,#0xa0
00a5fd60	bl 0x00c301c0
00a5fd64	cbz x19,0x00a5fdc8
00a5fd68	ldr w8,[x19]
00a5fd6c	cmp w8,#0x2
00a5fd70	b.eq 0x00a5fd7c
00a5fd74	cmp w8,#0x4
00a5fd78	b.ne 0x00a5fdc8
00a5fd7c	mov w20,#0xffffffff
00a5fd80	cbz x22,0x00a5fdf8
00a5fd84	adrp x0,0x2a2000
00a5fd88	add x0,x0,#0x238
00a5fd8c	add x8,sp,#0x8
00a5fd90	mov x1,x22
00a5fd94	mov x2,x21
00a5fd98	bl 0x00c36280
00a5fd9c	ldr x8,[sp, #0x28]
00a5fda0	ldur q0,[sp, #0x18]
00a5fda4	ldur q1,[sp, #0x8]
00a5fda8	add x1,sp,#0x30
00a5fdac	mov x0,x19
00a5fdb0	str x8,[sp, #0x50]
00a5fdb4	stp q1,q0,[sp, #0x30]
00a5fdb8	bl 0x00c3d000
00a5fdbc	cmp w0,#0x0
00a5fdc0	cneg w20,w20,ne
00a5fdc4	b 0x00a5fdf8
00a5fdc8	bl 0x00c342a0
00a5fdcc	adrp x0,0x2a0000
00a5fdd0	adrp x2,0x29e000
00a5fdd4	add x0,x0,#0x246
00a5fdd8	add x2,x2,#0x194
00a5fddc	mov w1,#0x478
00a5fde0	bl 0x00c342b0
00a5fde4	orr w0,wzr,#0x6
00a5fde8	mov w1,#0x93
00a5fdec	mov x2,xzr
00a5fdf0	bl 0x00c342c0
00a5fdf4	orr w20,wzr,#0xfffffffe
00a5fdf8	mov w0,w20
00a5fdfc	ldp x29,x30,[sp, #0xa0]
00a5fe00	ldp x20,x19,[sp, #0x90]
00a5fe04	ldp x22,x21,[sp, #0x80]
00a5fe08	add sp,sp,#0xb0
00a5fe0c	ret
