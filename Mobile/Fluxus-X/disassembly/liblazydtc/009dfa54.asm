; tls_process_server_done @ 009dfa54
009dfa54	str x19,[sp, #-0x20]!
009dfa58	stp x29,x30,[sp, #0x10]
009dfa5c	ldr x8,[x1, #0x8]
009dfa60	mov x19,x0
009dfa64	add x29,sp,#0x10
009dfa68	cbz x8,0x009dfaa4
009dfa6c	bl 0x00c342a0
009dfa70	adrp x0,0x2d7000
009dfa74	adrp x2,0x2c1000
009dfa78	add x0,x0,#0xb1a
009dfa7c	add x2,x2,#0x88e
009dfa80	mov w1,#0xaa8
009dfa84	bl 0x00c342b0
009dfa88	mov w1,#0x32
009dfa8c	mov w2,#0x9f
009dfa90	mov x0,x19
009dfa94	mov x3,xzr
009dfa98	bl 0x00c34410
009dfa9c	mov w0,wzr
009dfaa0	b 0x009dfad0
009dfaa4	ldr x8,[x19, #0x2e0]
009dfaa8	ldrb w8,[x8, #0x1c]
009dfaac	tbz w8,#0x5,0x009dfac0
009dfab0	mov x0,x19
009dfab4	bl 0x00c36ab0
009dfab8	cmp w0,#0x0
009dfabc	b.le 0x009dfadc
009dfac0	mov x0,x19
009dfac4	bl 0x009e0b38
009dfac8	cmp w0,#0x0
009dfacc	cset w0,ne
009dfad0	ldp x29,x30,[sp, #0x10]
009dfad4	ldr x19,[sp], #0x20
009dfad8	ret
009dfadc	bl 0x00c342a0
009dfae0	adrp x0,0x2d7000
009dfae4	adrp x2,0x2c1000
009dfae8	add x0,x0,#0xb1a
009dfaec	add x2,x2,#0x88e
009dfaf0	mov w1,#0xaae
009dfaf4	bl 0x00c342b0
009dfaf8	mov w1,#0x50
009dfafc	mov w2,#0x169
009dfb00	b 0x009dfa90
