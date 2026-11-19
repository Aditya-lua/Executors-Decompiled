; SSL_set_session_id_context @ 009b2578
009b2578	stp x29,x30,[sp, #-0x10]!
009b257c	cmp w2,#0x21
009b2580	mov x29,sp
009b2584	b.cc 0x009b25c0
009b2588	bl 0x00c342a0
009b258c	adrp x0,0x2c5000
009b2590	adrp x2,0x2b1000
009b2594	add x0,x0,#0x652
009b2598	add x2,x2,#0xeaa
009b259c	mov w1,#0x38a
009b25a0	bl 0x00c342b0
009b25a4	mov w0,#0x14
009b25a8	mov w1,#0x111
009b25ac	mov x2,xzr
009b25b0	bl 0x00c342c0
009b25b4	mov w0,wzr
009b25b8	ldp x29,x30,[sp], #0x10
009b25bc	ret
009b25c0	mov w2,w2
009b25c4	str x2,[x0, #0x8f0]
009b25c8	add x0,x0,#0x8f8
009b25cc	bl 0x00c2ffd0
009b25d0	mov w0,#0x1
009b25d4	ldp x29,x30,[sp], #0x10
009b25d8	ret
