; X509_CRL_sign @ 00b15aa0
00b15aa0	sub sp,sp,#0x40
00b15aa4	str x21,[sp, #0x10]
00b15aa8	stp x20,x19,[sp, #0x20]
00b15aac	stp x29,x30,[sp, #0x30]
00b15ab0	add x29,sp,#0x30
00b15ab4	cbz x0,0x00b15afc
00b15ab8	mov w8,#0x1
00b15abc	mov x19,x2
00b15ac0	mov x20,x1
00b15ac4	mov x21,x0
00b15ac8	str w8,[x0, #0x50]
00b15acc	bl 0x00c40ed0
00b15ad0	ldp x8,x9,[x21, #0xe8]
00b15ad4	add x1,x21,#0x8
00b15ad8	add x2,x21,#0x58
00b15adc	add x3,x21,#0x68
00b15ae0	mov x4,x21
00b15ae4	mov x5,xzr
00b15ae8	mov x6,x20
00b15aec	mov x7,x19
00b15af0	stp x8,x9,[sp]
00b15af4	bl 0x00c377e0
00b15af8	b 0x00b15b30
00b15afc	bl 0x00c342a0
00b15b00	adrp x0,0x2c4000
00b15b04	adrp x2,0x2cc000
00b15b08	add x0,x0,#0x3b5
00b15b0c	add x2,x2,#0x308
00b15b10	mov w1,#0x8b
00b15b14	bl 0x00c342b0
00b15b18	mov w1,#0x102
00b15b1c	mov w0,#0xb
00b15b20	movk w1,#0xc, LSL #16
00b15b24	mov x2,xzr
00b15b28	bl 0x00c342c0
00b15b2c	mov w0,wzr
00b15b30	ldp x29,x30,[sp, #0x30]
00b15b34	ldp x20,x19,[sp, #0x20]
00b15b38	ldr x21,[sp, #0x10]
00b15b3c	add sp,sp,#0x40
00b15b40	ret
