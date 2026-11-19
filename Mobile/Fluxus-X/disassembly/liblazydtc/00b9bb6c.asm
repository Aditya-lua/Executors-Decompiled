; mbedtls_ecdsa_sign_det_ext @ 00b9bb6c
00b9bb6c	sub sp,sp,#0x20
00b9bb70	stp x29,x30,[sp, #0x10]
00b9bb74	add x29,sp,#0x10
00b9bb78	ldr x8,[x29, #0x10]
00b9bb7c	str x8,[sp]
00b9bb80	bl 0x00c42530
00b9bb84	ldp x29,x30,[sp, #0x10]
00b9bb88	add sp,sp,#0x20
00b9bb8c	ret
