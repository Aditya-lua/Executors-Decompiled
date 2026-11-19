; ssl_clear_cipher_ctx @ 009b74e0
009b74e0	str x19,[sp, #-0x20]!
009b74e4	stp x29,x30,[sp, #0x10]
009b74e8	mov x19,x0
009b74ec	ldr x0,[x0, #0x848]
009b74f0	add x29,sp,#0x10
009b74f4	cbz x0,0x009b7500
009b74f8	bl 0x00c342d0
009b74fc	str xzr,[x19, #0x848]
009b7500	ldr x0,[x19, #0x878]
009b7504	cbz x0,0x009b7510
009b7508	bl 0x00c342d0
009b750c	str xzr,[x19, #0x878]
009b7510	ldr x0,[x19, #0x870]
009b7514	bl 0x00c34b60
009b7518	ldr x0,[x19, #0x868]
009b751c	str xzr,[x19, #0x870]
009b7520	bl 0x00c34b60
009b7524	str xzr,[x19, #0x868]
009b7528	ldp x29,x30,[sp, #0x10]
009b752c	ldr x19,[sp], #0x20
009b7530	ret
