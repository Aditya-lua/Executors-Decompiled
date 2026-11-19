; ssl_cert_is_disabled @ 009b13cc
009b13cc	str x19,[sp, #-0x20]!
009b13d0	mov x19,x0
009b13d4	mov x0,x1
009b13d8	stp x29,x30,[sp, #0x10]
009b13dc	add x29,sp,#0x10
009b13e0	bl 0x00c35130
009b13e4	cbz x0,0x009b13fc
009b13e8	ldr w8,[x0, #0x4]
009b13ec	ldr w9,[x19, #0x64c]
009b13f0	tst w9,w8
009b13f4	cset w0,ne
009b13f8	b 0x009b1400
009b13fc	mov w0,#0x1
009b1400	ldp x29,x30,[sp, #0x10]
009b1404	ldr x19,[sp], #0x20
009b1408	ret
