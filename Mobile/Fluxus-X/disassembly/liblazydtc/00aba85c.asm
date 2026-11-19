; PKCS12_key_gen_utf8 @ 00aba85c
00aba85c	sub sp,sp,#0x30
00aba860	stp x29,x30,[sp, #0x20]
00aba864	add x29,sp,#0x20
00aba868	ldr x8,[x29, #0x10]
00aba86c	stp xzr,xzr,[sp, #0x8]
00aba870	str x8,[sp]
00aba874	bl 0x00aba75c
00aba878	ldp x29,x30,[sp, #0x20]
00aba87c	add sp,sp,#0x30
00aba880	ret
