; ssl_clear_hash_ctx @ 009b7ea4
009b7ea4	str x19,[sp, #-0x20]!
009b7ea8	stp x29,x30,[sp, #0x10]
009b7eac	mov x19,x0
009b7eb0	ldr x0,[x0]
009b7eb4	add x29,sp,#0x10
009b7eb8	bl 0x00c31f90
009b7ebc	str xzr,[x19]
009b7ec0	ldp x29,x30,[sp, #0x10]
009b7ec4	ldr x19,[sp], #0x20
009b7ec8	ret
