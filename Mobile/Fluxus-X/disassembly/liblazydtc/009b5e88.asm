; SSL_get_servername_type @ 009b5e88
009b5e88	stp x29,x30,[sp, #-0x10]!
009b5e8c	mov w1,wzr
009b5e90	mov x29,sp
009b5e94	bl 0x009b5db0
009b5e98	cmp x0,#0x0
009b5e9c	csetm w0,eq
009b5ea0	ldp x29,x30,[sp], #0x10
009b5ea4	ret
