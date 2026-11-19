; EVP_MAC_CTX_gettable_params @ 00a691cc
00a691cc	ldr x8,[x0]
00a691d0	ldr x9,[x8, #0x68]
00a691d4	cbz x9,0x00a6920c
00a691d8	str x19,[sp, #-0x20]!
00a691dc	stp x29,x30,[sp, #0x10]
00a691e0	mov x19,x0
00a691e4	ldr x0,[x8]
00a691e8	add x29,sp,#0x10
00a691ec	bl 0x00c3b680
00a691f0	ldp x9,x8,[x19]
00a691f4	ldp x29,x30,[sp, #0x10]
00a691f8	mov x1,x0
00a691fc	ldr x2,[x9, #0x68]
00a69200	mov x0,x8
00a69204	ldr x19,[sp], #0x20
00a69208	br x2
00a6920c	mov x0,xzr
00a69210	ret
