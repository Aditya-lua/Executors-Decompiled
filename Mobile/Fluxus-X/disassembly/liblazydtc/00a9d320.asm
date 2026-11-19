; OSSL_PARAM_BLD_push_uint64 @ 00a9d320
00a9d320	str x19,[sp, #-0x20]!
00a9d324	mov x19,x2
00a9d328	mov w2,#0x8
00a9d32c	mov w3,#0x8
00a9d330	mov w4,#0x2
00a9d334	mov w5,wzr
00a9d338	stp x29,x30,[sp, #0x10]
00a9d33c	add x29,sp,#0x10
00a9d340	bl 0x00a9d5b4
00a9d344	cbz x0,0x00a9d350
00a9d348	str x19,[x0, #0x30]
00a9d34c	mov w0,#0x1
00a9d350	ldp x29,x30,[sp, #0x10]
00a9d354	ldr x19,[sp], #0x20
00a9d358	ret
