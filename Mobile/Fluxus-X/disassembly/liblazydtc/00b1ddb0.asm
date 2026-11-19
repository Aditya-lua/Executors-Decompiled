; ossl_d2i_ED448_PUBKEY @ 00b1ddb0
00b1ddb0	sub sp,sp,#0x40
00b1ddb4	stp x22,x21,[sp, #0x10]
00b1ddb8	stp x20,x19,[sp, #0x20]
00b1ddbc	stp x29,x30,[sp, #0x30]
00b1ddc0	ldr x8,[x1]
00b1ddc4	mov x20,x1
00b1ddc8	mov x19,x0
00b1ddcc	add x1,sp,#0x8
00b1ddd0	mov w5,#0x1
00b1ddd4	mov x0,xzr
00b1ddd8	mov x3,xzr
00b1dddc	mov x4,xzr
00b1dde0	add x29,sp,#0x30
00b1dde4	str x8,[sp, #0x8]
00b1dde8	bl 0x00b1d214
00b1ddec	cbz x0,0x00b1de3c
00b1ddf0	mov x22,x0
00b1ddf4	bl 0x00c324b0
00b1ddf8	cmp w0,#0x440
00b1ddfc	b.ne 0x00b1de34
00b1de00	mov x0,x22
00b1de04	bl 0x00c3d9f0
00b1de08	mov x21,x0
00b1de0c	mov x0,x22
00b1de10	bl 0x00c32450
00b1de14	cbz x21,0x00b1de40
00b1de18	ldr x8,[sp, #0x8]
00b1de1c	str x8,[x20]
00b1de20	cbz x19,0x00b1de40
00b1de24	ldr x0,[x19]
00b1de28	bl 0x00c3b270
00b1de2c	str x21,[x19]
00b1de30	b 0x00b1de40
00b1de34	mov x0,x22
00b1de38	bl 0x00c32450
00b1de3c	mov x21,xzr
00b1de40	mov x0,x21
00b1de44	ldp x29,x30,[sp, #0x30]
00b1de48	ldp x20,x19,[sp, #0x20]
00b1de4c	ldp x22,x21,[sp, #0x10]
00b1de50	add sp,sp,#0x40
00b1de54	ret
