; SSL_CTX_set_client_CA_list @ 009aceac
009aceac	stp x20,x19,[sp, #-0x20]!
009aceb0	stp x29,x30,[sp, #0x10]
009aceb4	mov x20,x1
009aceb8	adrp x1,0xcb5000
009acebc	mov x19,x0
009acec0	ldr x0,[x0, #0x130]
009acec4	ldr x1,[x1, #0x140]
009acec8	add x29,sp,#0x10
009acecc	bl 0x00c32600
009aced0	str x20,[x19, #0x130]
009aced4	ldp x29,x30,[sp, #0x10]
009aced8	ldp x20,x19,[sp], #0x20
009acedc	ret
