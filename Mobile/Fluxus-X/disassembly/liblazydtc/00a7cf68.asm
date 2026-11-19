; ossl_ffc_params_init @ 00a7cf68
00a7cf68	str x19,[sp, #-0x20]!
00a7cf6c	orr w2,wzr,#0x60
00a7cf70	mov w1,wzr
00a7cf74	stp x29,x30,[sp, #0x10]
00a7cf78	add x29,sp,#0x10
00a7cf7c	mov x19,x0
00a7cf80	bl 0x00c301c0
00a7cf84	mov w8,#0xffffffff
00a7cf88	orr w9,wzr,#0x3
00a7cf8c	str w8,[x19, #0x30]
00a7cf90	str w8,[x19, #0x38]
00a7cf94	str w9,[x19, #0x40]
00a7cf98	ldp x29,x30,[sp, #0x10]
00a7cf9c	ldr x19,[sp], #0x20
00a7cfa0	ret
