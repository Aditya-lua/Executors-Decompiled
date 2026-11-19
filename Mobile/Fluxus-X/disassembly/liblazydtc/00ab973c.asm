; PEM_write_bio_PKCS8_PRIV_KEY_INFO @ 00ab973c
00ab973c	sub sp,sp,#0x20
00ab9740	stp x29,x30,[sp, #0x10]
00ab9744	mov x2,x0
00ab9748	adrp x0,0xcb5000
00ab974c	ldr x0,[x0, #0x380]
00ab9750	mov x3,x1
00ab9754	adrp x1,0x2a2000
00ab9758	add x1,x1,#0xb4c
00ab975c	mov x4,xzr
00ab9760	mov x5,xzr
00ab9764	mov w6,wzr
00ab9768	mov x7,xzr
00ab976c	add x29,sp,#0x10
00ab9770	str xzr,[sp]
00ab9774	bl 0x00c36070
00ab9778	ldp x29,x30,[sp, #0x10]
00ab977c	add sp,sp,#0x20
00ab9780	ret
