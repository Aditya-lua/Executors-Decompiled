; ossl_prov_bio_vprintf @ 00b1fc54
00b1fc54	adrp x8,0xd23000
00b1fc58	ldr x8,[x8, #0x800]
00b1fc5c	cbz x8,0x00b1fc90
00b1fc60	sub sp,sp,#0x30
00b1fc64	stp x29,x30,[sp, #0x20]
00b1fc68	ldr q0,[x2, #0x10]
00b1fc6c	add x29,sp,#0x20
00b1fc70	str q0,[sp, #0x10]
00b1fc74	ldr q0,[x2]
00b1fc78	mov x2,sp
00b1fc7c	str q0,[sp]
00b1fc80	blr x8
00b1fc84	ldp x29,x30,[sp, #0x20]
00b1fc88	add sp,sp,#0x30
00b1fc8c	ret
00b1fc90	mov w0,#0xffffffff
00b1fc94	ret
