; ssl_evp_md_up_ref @ 009b979c
009b979c	str x19,[sp, #-0x20]!
009b97a0	stp x29,x30,[sp, #0x10]
009b97a4	add x29,sp,#0x10
009b97a8	mov x19,x0
009b97ac	bl 0x00c35810
009b97b0	cbz x0,0x009b97c4
009b97b4	ldp x29,x30,[sp, #0x10]
009b97b8	mov x0,x19
009b97bc	ldr x19,[sp], #0x20
009b97c0	b 0x00c35820
009b97c4	ldp x29,x30,[sp, #0x10]
009b97c8	mov w0,#0x1
009b97cc	ldr x19,[sp], #0x20
009b97d0	ret
