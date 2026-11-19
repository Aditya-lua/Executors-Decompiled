; SSL_SESSION_set1_id_context @ 009bea18
009bea18	stp x29,x30,[sp, #-0x10]!
009bea1c	cmp w2,#0x21
009bea20	mov x29,sp
009bea24	b.cc 0x009bea60
009bea28	bl 0x00c342a0
009bea2c	adrp x0,0x2db000
009bea30	adrp x2,0x2ab000
009bea34	add x0,x0,#0xb17
009bea38	add x2,x2,#0xccb
009bea3c	mov w1,#0x438
009bea40	bl 0x00c342b0
009bea44	mov w0,#0x14
009bea48	mov w1,#0x111
009bea4c	mov x2,xzr
009bea50	bl 0x00c342c0
009bea54	mov w0,wzr
009bea58	ldp x29,x30,[sp], #0x10
009bea5c	ret
009bea60	add x8,x0,#0x280
009bea64	mov w2,w2
009bea68	cmp x8,x1
009bea6c	str x2,[x0, #0x278]
009bea70	b.eq 0x009bea7c
009bea74	mov x0,x8
009bea78	bl 0x00c2ffd0
009bea7c	mov w0,#0x1
009bea80	ldp x29,x30,[sp], #0x10
009bea84	ret
