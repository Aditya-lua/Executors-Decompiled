; SSL_set_fd @ 009b3cac
009b3cac	str x21,[sp, #-0x30]!
009b3cb0	stp x20,x19,[sp, #0x10]
009b3cb4	stp x29,x30,[sp, #0x20]
009b3cb8	add x29,sp,#0x20
009b3cbc	mov w20,w1
009b3cc0	mov x19,x0
009b3cc4	bl 0x00c35650
009b3cc8	bl 0x00c32240
009b3ccc	cbz x0,0x009b3cfc
009b3cd0	mov w1,#0x68
009b3cd4	mov x2,xzr
009b3cd8	mov w3,w20
009b3cdc	mov x21,x0
009b3ce0	bl 0x00c35600
009b3ce4	mov x0,x19
009b3ce8	mov x1,x21
009b3cec	mov x2,x21
009b3cf0	bl 0x009b3a80
009b3cf4	mov w0,#0x1
009b3cf8	b 0x009b3d30
009b3cfc	bl 0x00c342a0
009b3d00	adrp x0,0x2c5000
009b3d04	adrp x2,0x2d9000
009b3d08	add x0,x0,#0x652
009b3d0c	add x2,x2,#0x7a0
009b3d10	mov w1,#0x57c
009b3d14	bl 0x00c342b0
009b3d18	mov w1,#0x7
009b3d1c	mov w0,#0x14
009b3d20	movk w1,#0x8, LSL #16
009b3d24	mov x2,xzr
009b3d28	bl 0x00c342c0
009b3d2c	mov w0,wzr
009b3d30	ldp x29,x30,[sp, #0x20]
009b3d34	ldp x20,x19,[sp, #0x10]
009b3d38	ldr x21,[sp], #0x30
009b3d3c	ret
