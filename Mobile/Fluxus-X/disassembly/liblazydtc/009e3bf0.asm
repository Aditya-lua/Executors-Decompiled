; tls_construct_key_update @ 009e3bf0
009e3bf0	str x19,[sp, #-0x20]!
009e3bf4	stp x29,x30,[sp, #0x10]
009e3bf8	ldrsw x8,[x0, #0xba4]
009e3bfc	mov x19,x0
009e3c00	mov x0,x1
009e3c04	mov w2,#0x1
009e3c08	mov x1,x8
009e3c0c	add x29,sp,#0x10
009e3c10	bl 0x00c343a0
009e3c14	cbz w0,0x009e3c28
009e3c18	mov w8,#0xffffffff
009e3c1c	mov w0,#0x1
009e3c20	str w8,[x19, #0xba4]
009e3c24	b 0x009e3c60
009e3c28	bl 0x00c342a0
009e3c2c	adrp x0,0x2bb000
009e3c30	adrp x2,0x2bb000
009e3c34	add x0,x0,#0x912
009e3c38	add x2,x2,#0x92a
009e3c3c	mov w1,#0x285
009e3c40	bl 0x00c342b0
009e3c44	mov w2,#0x103
009e3c48	mov w1,#0x50
009e3c4c	movk w2,#0xc, LSL #16
009e3c50	mov x0,x19
009e3c54	mov x3,xzr
009e3c58	bl 0x00c34410
009e3c5c	mov w0,wzr
009e3c60	ldp x29,x30,[sp, #0x10]
009e3c64	ldr x19,[sp], #0x20
009e3c68	ret
