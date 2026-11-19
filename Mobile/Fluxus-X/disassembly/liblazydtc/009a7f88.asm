; ssl3_set_handshake_header @ 009a7f88
009a7f88	str x19,[sp, #-0x20]!
009a7f8c	cmp w2,#0x101
009a7f90	stp x29,x30,[sp, #0x10]
009a7f94	add x29,sp,#0x10
009a7f98	b.ne 0x009a7fa4
009a7f9c	mov w0,#0x1
009a7fa0	b 0x009a7fd0
009a7fa4	mov x19,x1
009a7fa8	sxtw x1,w2
009a7fac	mov w2,#0x1
009a7fb0	mov x0,x19
009a7fb4	bl 0x00c343a0
009a7fb8	cbz w0,0x009a7fd0
009a7fbc	orr w1,wzr,#0x3
009a7fc0	mov x0,x19
009a7fc4	bl 0x00c343b0
009a7fc8	cmp w0,#0x0
009a7fcc	cset w0,ne
009a7fd0	ldp x29,x30,[sp, #0x10]
009a7fd4	ldr x19,[sp], #0x20
009a7fd8	ret
