; ssl_evp_cipher_up_ref @ 009b9764
009b9764	str x19,[sp, #-0x20]!
009b9768	stp x29,x30,[sp, #0x10]
009b976c	add x29,sp,#0x10
009b9770	mov x19,x0
009b9774	bl 0x00c34bb0
009b9778	cbz x0,0x009b978c
009b977c	ldp x29,x30,[sp, #0x10]
009b9780	mov x0,x19
009b9784	ldr x19,[sp], #0x20
009b9788	b 0x00c357e0
009b978c	ldp x29,x30,[sp, #0x10]
009b9790	mov w0,#0x1
009b9794	ldr x19,[sp], #0x20
009b9798	ret
