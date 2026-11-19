; SSL_CTX_set0_CA_list @ 009ace54
009ace54	stp x20,x19,[sp, #-0x20]!
009ace58	stp x29,x30,[sp, #0x10]
009ace5c	mov x20,x1
009ace60	adrp x1,0xcb5000
009ace64	mov x19,x0
009ace68	ldr x0,[x0, #0x128]
009ace6c	ldr x1,[x1, #0x140]
009ace70	add x29,sp,#0x10
009ace74	bl 0x00c32600
009ace78	str x20,[x19, #0x128]
009ace7c	ldp x29,x30,[sp, #0x10]
009ace80	ldp x20,x19,[sp], #0x20
009ace84	ret
