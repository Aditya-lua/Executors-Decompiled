; EVP_PKEY_asn1_copy @ 009f09fc
009f09fc	sub sp,sp,#0x40
009f0a00	stp x20,x19,[sp, #0x20]
009f0a04	stp x29,x30,[sp, #0x30]
009f0a08	ldr q0,[x0]
009f0a0c	str x21,[sp, #0x10]
009f0a10	mov w2,#0x140
009f0a14	add x29,sp,#0x30
009f0a18	str q0,[sp]
009f0a1c	ldp x20,x21,[x0, #0x10]
009f0a20	mov x19,x0
009f0a24	bl 0x00c2ffd0
009f0a28	ldr q0,[sp]
009f0a2c	stp x20,x21,[x19, #0x10]
009f0a30	ldr x21,[sp, #0x10]
009f0a34	str q0,[x19]
009f0a38	ldp x29,x30,[sp, #0x30]
009f0a3c	ldp x20,x19,[sp, #0x20]
009f0a40	add sp,sp,#0x40
009f0a44	ret
