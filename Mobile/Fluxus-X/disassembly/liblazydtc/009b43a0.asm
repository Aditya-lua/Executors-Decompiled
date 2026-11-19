; SSL_get_async_status @ 009b43a0
009b43a0	ldr x0,[x0, #0x1d30]
009b43a4	cbz x0,0x009b43cc
009b43a8	str x19,[sp, #-0x20]!
009b43ac	stp x29,x30,[sp, #0x10]
009b43b0	add x29,sp,#0x10
009b43b4	mov x19,x1
009b43b8	bl 0x00c35570
009b43bc	str w0,[x19]
009b43c0	ldp x29,x30,[sp, #0x10]
009b43c4	mov w0,#0x1
009b43c8	ldr x19,[sp], #0x20
009b43cc	ret
