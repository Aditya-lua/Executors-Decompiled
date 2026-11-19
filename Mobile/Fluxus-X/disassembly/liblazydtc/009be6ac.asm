; SSL_SESSION_set1_id @ 009be6ac
009be6ac	stp x29,x30,[sp, #-0x10]!
009be6b0	cmp w2,#0x21
009be6b4	mov x29,sp
009be6b8	b.cc 0x009be6f4
009be6bc	bl 0x00c342a0
009be6c0	adrp x0,0x2db000
009be6c4	adrp x2,0x2c1000
009be6c8	add x0,x0,#0xb17
009be6cc	add x2,x2,#0x766
009be6d0	mov w1,#0x390
009be6d4	bl 0x00c342b0
009be6d8	mov w0,#0x14
009be6dc	mov w1,#0x198
009be6e0	mov x2,xzr
009be6e4	bl 0x00c342c0
009be6e8	mov w0,wzr
009be6ec	ldp x29,x30,[sp], #0x10
009be6f0	ret
009be6f4	add x8,x0,#0x258
009be6f8	mov w2,w2
009be6fc	cmp x8,x1
009be700	str x2,[x0, #0x250]
009be704	b.eq 0x009be710
009be708	mov x0,x8
009be70c	bl 0x00c2ffd0
009be710	mov w0,#0x1
009be714	ldp x29,x30,[sp], #0x10
009be718	ret
