; SSL_SESSION_set1_master_key @ 009b7a6c
009b7a6c	stp x20,x19,[sp, #-0x20]!
009b7a70	mov x20,x0
009b7a74	cmp x2,#0x200
009b7a78	mov w0,wzr
009b7a7c	stp x29,x30,[sp, #0x10]
009b7a80	add x29,sp,#0x10
009b7a84	b.hi 0x009b7a9c
009b7a88	add x0,x20,#0x50
009b7a8c	mov x19,x2
009b7a90	bl 0x00c2ffd0
009b7a94	mov w0,#0x1
009b7a98	str x19,[x20, #0x8]
009b7a9c	ldp x29,x30,[sp, #0x10]
009b7aa0	ldp x20,x19,[sp], #0x20
009b7aa4	ret
