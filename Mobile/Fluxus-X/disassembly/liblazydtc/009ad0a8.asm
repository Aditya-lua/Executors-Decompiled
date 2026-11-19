; SSL_CTX_add_client_CA @ 009ad0a8
009ad0a8	stp x20,x19,[sp, #-0x20]!
009ad0ac	stp x29,x30,[sp, #0x10]
009ad0b0	add x29,sp,#0x10
009ad0b4	cbz x1,0x009ad108
009ad0b8	ldr x8,[x0, #0x130]
009ad0bc	mov x20,x1
009ad0c0	mov x19,x0
009ad0c4	cbnz x8,0x009ad0d4
009ad0c8	bl 0x00c34780
009ad0cc	str x0,[x19, #0x130]
009ad0d0	cbz x0,0x009ad10c
009ad0d4	mov x0,x20
009ad0d8	bl 0x00c32d20
009ad0dc	bl 0x00c34f50
009ad0e0	cbz x0,0x009ad10c
009ad0e4	mov x20,x0
009ad0e8	ldr x0,[x19, #0x130]
009ad0ec	mov x1,x20
009ad0f0	bl 0x00c347a0
009ad0f4	cbz w0,0x009ad100
009ad0f8	mov w0,#0x1
009ad0fc	b 0x009ad10c
009ad100	mov x0,x20
009ad104	bl 0x00c34810
009ad108	mov w0,wzr
009ad10c	ldp x29,x30,[sp, #0x10]
009ad110	ldp x20,x19,[sp], #0x20
009ad114	ret
