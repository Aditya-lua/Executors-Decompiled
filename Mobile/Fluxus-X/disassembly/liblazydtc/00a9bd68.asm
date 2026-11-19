; OPENSSL_gmtime @ 00a9bd68
00a9bd68	str x19,[sp, #-0x20]!
00a9bd6c	stp x29,x30,[sp, #0x10]
00a9bd70	add x29,sp,#0x10
00a9bd74	mov x19,x1
00a9bd78	bl 0x00c309b0
00a9bd7c	ldp x29,x30,[sp, #0x10]
00a9bd80	cmp x0,#0x0
00a9bd84	csel x0,xzr,x19,eq
00a9bd88	ldr x19,[sp], #0x20
00a9bd8c	ret
