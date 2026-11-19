; ix::SocketOpenSSL::close @ 009a39e0
009a39e0	stp x20,x19,[sp, #-0x20]!
009a39e4	stp x29,x30,[sp, #0x10]
009a39e8	add x29,sp,#0x10
009a39ec	add x19,x0,#0xe0
009a39f0	mov x20,x0
009a39f4	mov x0,x19
009a39f8	bl 0x00c2ff10
009a39fc	ldr x0,[x20, #0x40]
009a3a00	cbz x0,0x009a3a0c
009a3a04	bl 0x00c328b0
009a3a08	str xzr,[x20, #0x40]
009a3a0c	ldr x0,[x20, #0x48]
009a3a10	cbz x0,0x009a3a1c
009a3a14	bl 0x00c32720
009a3a18	str xzr,[x20, #0x48]
009a3a1c	mov x0,x20
009a3a20	bl 0x00c33560
009a3a24	ldp x29,x30,[sp, #0x10]
009a3a28	mov x0,x19
009a3a2c	ldp x20,x19,[sp], #0x20
009a3a30	b 0x00c2ff20
