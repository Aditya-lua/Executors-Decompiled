; psa_crypto_local_input_free @ 00b8796c
00b8796c	str x19,[sp, #-0x20]!
00b87970	stp x29,x30,[sp, #0x10]
00b87974	add x29,sp,#0x10
00b87978	mov x19,x0
00b8797c	ldr x0,[x0]
00b87980	bl 0x00c30960
00b87984	stp xzr,xzr,[x19]
00b87988	ldp x29,x30,[sp, #0x10]
00b8798c	ldr x19,[sp], #0x20
00b87990	ret
