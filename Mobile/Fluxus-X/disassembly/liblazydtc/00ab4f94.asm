; PEM_write_bio_DSAparams @ 00ab4f94
00ab4f94	sub sp,sp,#0x20
00ab4f98	stp x29,x30,[sp, #0x10]
00ab4f9c	mov x2,x0
00ab4fa0	adrp x0,0xcb5000
00ab4fa4	ldr x0,[x0, #0x508]
00ab4fa8	mov x3,x1
00ab4fac	adrp x1,0x2c8000
00ab4fb0	add x1,x1,#0xb6
00ab4fb4	mov x4,xzr
00ab4fb8	mov x5,xzr
00ab4fbc	mov w6,wzr
00ab4fc0	mov x7,xzr
00ab4fc4	add x29,sp,#0x10
00ab4fc8	str xzr,[sp]
00ab4fcc	bl 0x00c36070
00ab4fd0	ldp x29,x30,[sp, #0x10]
00ab4fd4	add sp,sp,#0x20
00ab4fd8	ret
