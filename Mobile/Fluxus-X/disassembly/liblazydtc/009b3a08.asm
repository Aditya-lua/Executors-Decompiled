; SSL_set0_rbio @ 009b3a08
009b3a08	stp x20,x19,[sp, #-0x20]!
009b3a0c	stp x29,x30,[sp, #0x10]
009b3a10	mov x19,x0
009b3a14	ldr x0,[x0, #0x10]
009b3a18	add x29,sp,#0x10
009b3a1c	mov x20,x1
009b3a20	bl 0x00c355e0
009b3a24	str x20,[x19, #0x10]
009b3a28	ldp x29,x30,[sp, #0x10]
009b3a2c	ldp x20,x19,[sp], #0x20
009b3a30	ret
