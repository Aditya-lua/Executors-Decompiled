; PEM_write_bio_X509 @ 00ab9fa0
00ab9fa0	sub sp,sp,#0x20
00ab9fa4	stp x29,x30,[sp, #0x10]
00ab9fa8	mov x2,x0
00ab9fac	adrp x0,0xcb5000
00ab9fb0	ldr x0,[x0, #0x2b8]
00ab9fb4	mov x3,x1
00ab9fb8	adrp x1,0x2d0000
00ab9fbc	add x1,x1,#0x239
00ab9fc0	mov x4,xzr
00ab9fc4	mov x5,xzr
00ab9fc8	mov w6,wzr
00ab9fcc	mov x7,xzr
00ab9fd0	add x29,sp,#0x10
00ab9fd4	str xzr,[sp]
00ab9fd8	bl 0x00c36070
00ab9fdc	ldp x29,x30,[sp, #0x10]
00ab9fe0	add sp,sp,#0x20
00ab9fe4	ret
