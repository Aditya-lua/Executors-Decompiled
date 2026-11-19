; ossl_prov_cipher_reset @ 00b2032c
00b2032c	str x19,[sp, #-0x20]!
00b20330	stp x29,x30,[sp, #0x10]
00b20334	mov x19,x0
00b20338	ldr x0,[x0, #0x8]
00b2033c	add x29,sp,#0x10
00b20340	bl 0x00c357d0
00b20344	ldr x0,[x19, #0x10]
00b20348	stp xzr,xzr,[x19]
00b2034c	bl 0x00c32360
00b20350	str xzr,[x19, #0x10]
00b20354	ldp x29,x30,[sp, #0x10]
00b20358	ldr x19,[sp], #0x20
00b2035c	ret
