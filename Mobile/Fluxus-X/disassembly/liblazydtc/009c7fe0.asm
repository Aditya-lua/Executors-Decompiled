; ssl_hmac_old_new @ 009c7fe0
009c7fe0	str x19,[sp, #-0x20]!
009c7fe4	stp x29,x30,[sp, #0x10]
009c7fe8	add x29,sp,#0x10
009c7fec	mov x19,x0
009c7ff0	bl 0x00c36910
009c7ff4	str x0,[x19, #0x8]
009c7ff8	ldp x29,x30,[sp, #0x10]
009c7ffc	cmp x0,#0x0
009c8000	cset w8,ne
009c8004	mov w0,w8
009c8008	ldr x19,[sp], #0x20
009c800c	ret
