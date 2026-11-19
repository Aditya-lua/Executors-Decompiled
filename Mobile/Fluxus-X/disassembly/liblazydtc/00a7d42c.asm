; ossl_ffc_params_cmp @ 00a7d42c
00a7d42c	str x21,[sp, #-0x30]!
00a7d430	stp x20,x19,[sp, #0x10]
00a7d434	stp x29,x30,[sp, #0x20]
00a7d438	mov x19,x1
00a7d43c	mov x20,x0
00a7d440	ldr x0,[x0]
00a7d444	ldr x1,[x1]
00a7d448	add x29,sp,#0x20
00a7d44c	mov w21,w2
00a7d450	bl 0x00c38cc0
00a7d454	mov w8,w0
00a7d458	mov w0,wzr
00a7d45c	cbnz w8,0x00a7d498
00a7d460	ldr x0,[x20, #0x10]
00a7d464	ldr x1,[x19, #0x10]
00a7d468	bl 0x00c38cc0
00a7d46c	mov w8,w0
00a7d470	mov w0,wzr
00a7d474	cbnz w8,0x00a7d498
00a7d478	cbz w21,0x00a7d484
00a7d47c	mov w0,#0x1
00a7d480	b 0x00a7d498
00a7d484	ldr x0,[x20, #0x8]
00a7d488	ldr x1,[x19, #0x8]
00a7d48c	bl 0x00c38cc0
00a7d490	cmp w0,#0x0
00a7d494	cset w0,eq
00a7d498	ldp x29,x30,[sp, #0x20]
00a7d49c	ldp x20,x19,[sp, #0x10]
00a7d4a0	ldr x21,[sp], #0x30
00a7d4a4	ret
