; Camellia_set_key @ 00a8ec80
00a8ec80	str x19,[sp, #-0x20]!
00a8ec84	mov x8,x0
00a8ec88	mov w0,#0xffffffff
00a8ec8c	stp x29,x30,[sp, #0x10]
00a8ec90	add x29,sp,#0x10
00a8ec94	cbz x8,0x00a8ecdc
00a8ec98	mov x19,x2
00a8ec9c	cbz x2,0x00a8ecdc
00a8eca0	cmp w1,#0x80
00a8eca4	b.eq 0x00a8ecb8
00a8eca8	cmp w1,#0x100
00a8ecac	b.eq 0x00a8ecb8
00a8ecb0	cmp w1,#0xc0
00a8ecb4	b.ne 0x00a8ecd8
00a8ecb8	mov w0,w1
00a8ecbc	mov x1,x8
00a8ecc0	mov x2,x19
00a8ecc4	bl 0x00c39240
00a8ecc8	mov w8,w0
00a8eccc	mov w0,wzr
00a8ecd0	str w8,[x19, #0x110]
00a8ecd4	b 0x00a8ecdc
00a8ecd8	orr w0,wzr,#0xfffffffe
00a8ecdc	ldp x29,x30,[sp, #0x10]
00a8ece0	ldr x19,[sp], #0x20
00a8ece4	ret
