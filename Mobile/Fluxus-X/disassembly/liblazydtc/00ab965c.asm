; PEM_write_bio_PKCS8 @ 00ab965c
00ab965c	sub sp,sp,#0x20
00ab9660	stp x29,x30,[sp, #0x10]
00ab9664	mov x2,x0
00ab9668	adrp x0,0xcb5000
00ab966c	ldr x0,[x0, #0x3a0]
00ab9670	mov x3,x1
00ab9674	adrp x1,0x2c6000
00ab9678	add x1,x1,#0xd0
00ab967c	mov x4,xzr
00ab9680	mov x5,xzr
00ab9684	mov w6,wzr
00ab9688	mov x7,xzr
00ab968c	add x29,sp,#0x10
00ab9690	str xzr,[sp]
00ab9694	bl 0x00c36070
00ab9698	ldp x29,x30,[sp, #0x10]
00ab969c	add sp,sp,#0x20
00ab96a0	ret
