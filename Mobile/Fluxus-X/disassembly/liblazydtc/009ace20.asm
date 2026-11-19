; SSL_set0_CA_list @ 009ace20
009ace20	stp x20,x19,[sp, #-0x20]!
009ace24	stp x29,x30,[sp, #0x10]
009ace28	mov x20,x1
009ace2c	adrp x1,0xcb5000
009ace30	mov x19,x0
009ace34	ldr x0,[x0, #0x9d0]
009ace38	ldr x1,[x1, #0x140]
009ace3c	add x29,sp,#0x10
009ace40	bl 0x00c32600
009ace44	str x20,[x19, #0x9d0]
009ace48	ldp x29,x30,[sp, #0x10]
009ace4c	ldp x20,x19,[sp], #0x20
009ace50	ret
