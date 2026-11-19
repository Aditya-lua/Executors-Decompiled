; ssl_session_calculate_timeout @ 009bd264
009bd264	ldr x8,[x0, #0x2d8]
009bd268	tbz x8,#0x3f,0x009bd274
009bd26c	mov x8,xzr
009bd270	str xzr,[x0, #0x2d8]
009bd274	ldr x9,[x0, #0x2e0]
009bd278	lsr x10,x8,#0x3f
009bd27c	add x8,x8,x9
009bd280	cmp x9,#0x0
009bd284	str x8,[x0, #0x2e8]
009bd288	csel w8,w10,wzr,gt
009bd28c	str w8,[x0, #0x2f0]
009bd290	ret
