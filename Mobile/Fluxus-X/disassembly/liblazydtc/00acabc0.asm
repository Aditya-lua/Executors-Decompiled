; ossl_rand_pool_add_end @ 00acabc0
00acabc0	ldr x9,[x0, #0x28]
00acabc4	ldr x8,[x0, #0x8]
00acabc8	sub x9,x9,x8
00acabcc	cmp x9,x1
00acabd0	b.cs 0x00acac14
00acabd4	stp x29,x30,[sp, #-0x10]!
00acabd8	mov x29,sp
00acabdc	bl 0x00c342a0
00acabe0	adrp x0,0x29e000
00acabe4	adrp x2,0x2d8000
00acabe8	add x0,x0,#0x966
00acabec	add x2,x2,#0x713
00acabf0	mov w1,#0x192
00acabf4	bl 0x00c342b0
00acabf8	mov w0,#0x24
00acabfc	mov w1,#0x7d
00acac00	mov x2,xzr
00acac04	bl 0x00c342c0
00acac08	mov w0,wzr
00acac0c	ldp x29,x30,[sp], #0x10
00acac10	ret
00acac14	cbz x1,0x00acac2c
00acac18	ldr x9,[x0, #0x30]
00acac1c	add x8,x8,x1
00acac20	str x8,[x0, #0x8]
00acac24	add x8,x9,x2
00acac28	str x8,[x0, #0x30]
00acac2c	mov w0,#0x1
00acac30	ret
