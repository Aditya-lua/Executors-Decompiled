; SSL_set0_wbio @ 009b3a34
009b3a34	stp x20,x19,[sp, #-0x20]!
009b3a38	stp x29,x30,[sp, #0x10]
009b3a3c	mov x19,x0
009b3a40	ldp x0,x8,[x0, #0x18]
009b3a44	mov x20,x1
009b3a48	add x29,sp,#0x10
009b3a4c	cbz x8,0x009b3a58
009b3a50	bl 0x00c35630
009b3a54	str x0,[x19, #0x18]
009b3a58	bl 0x00c355e0
009b3a5c	ldr x0,[x19, #0x20]
009b3a60	str x20,[x19, #0x18]
009b3a64	cbz x0,0x009b3a74
009b3a68	mov x1,x20
009b3a6c	bl 0x00c35640
009b3a70	str x0,[x19, #0x18]
009b3a74	ldp x29,x30,[sp, #0x10]
009b3a78	ldp x20,x19,[sp], #0x20
009b3a7c	ret
