; SSL_set_client_CA_list @ 009acee8
009acee8	stp x20,x19,[sp, #-0x20]!
009aceec	stp x29,x30,[sp, #0x10]
009acef0	mov x20,x1
009acef4	adrp x1,0xcb5000
009acef8	mov x19,x0
009acefc	ldr x0,[x0, #0x9d8]
009acf00	ldr x1,[x1, #0x140]
009acf04	add x29,sp,#0x10
009acf08	bl 0x00c32600
009acf0c	str x20,[x19, #0x9d8]
009acf10	ldp x29,x30,[sp, #0x10]
009acf14	ldp x20,x19,[sp], #0x20
009acf18	ret
