; EVP_MD_CTX_get1_md @ 00a5fa70
00a5fa70	str x19,[sp, #-0x20]!
00a5fa74	stp x29,x30,[sp, #0x10]
00a5fa78	add x29,sp,#0x10
00a5fa7c	cbz x0,0x00a5fa9c
00a5fa80	ldr x19,[x0]
00a5fa84	cbz x19,0x00a5fa9c
00a5fa88	mov x0,x19
00a5fa8c	bl 0x00c35820
00a5fa90	cmp w0,#0x0
00a5fa94	csel x0,xzr,x19,eq
00a5fa98	b 0x00a5faa0
00a5fa9c	mov x0,xzr
00a5faa0	ldp x29,x30,[sp, #0x10]
00a5faa4	ldr x19,[sp], #0x20
00a5faa8	ret
