; tls_get_digest_from_engine @ 009c7e98
009c7e98	stp x20,x19,[sp, #-0x20]!
009c7e9c	stp x29,x30,[sp, #0x10]
009c7ea0	add x29,sp,#0x10
009c7ea4	mov w20,w0
009c7ea8	bl 0x00c368c0
009c7eac	cbz x0,0x009c7ecc
009c7eb0	mov w1,w20
009c7eb4	mov x19,x0
009c7eb8	bl 0x00c368b0
009c7ebc	mov x20,x0
009c7ec0	mov x0,x19
009c7ec4	bl 0x00c32360
009c7ec8	mov x0,x20
009c7ecc	ldp x29,x30,[sp, #0x10]
009c7ed0	ldp x20,x19,[sp], #0x20
009c7ed4	ret
