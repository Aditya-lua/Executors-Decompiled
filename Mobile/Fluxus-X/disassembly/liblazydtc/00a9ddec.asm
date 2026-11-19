; ossl_param_build_set_bn @ 00a9ddec
00a9ddec	str x19,[sp, #-0x20]!
00a9ddf0	mov x19,x3
00a9ddf4	stp x29,x30,[sp, #0x10]
00a9ddf8	add x29,sp,#0x10
00a9ddfc	cbz x0,0x00a9de14
00a9de00	ldp x29,x30,[sp, #0x10]
00a9de04	mov x1,x2
00a9de08	mov x2,x19
00a9de0c	ldr x19,[sp], #0x20
00a9de10	b 0x00c364d0
00a9de14	mov x0,x1
00a9de18	mov x1,x2
00a9de1c	bl 0x00c3e8c0
00a9de20	cbz x0,0x00a9de38
00a9de24	mov x1,x19
00a9de28	bl 0x00c3da80
00a9de2c	cmp w0,#0x0
00a9de30	cset w0,gt
00a9de34	b 0x00a9de3c
00a9de38	mov w0,#0x1
00a9de3c	ldp x29,x30,[sp, #0x10]
00a9de40	ldr x19,[sp], #0x20
00a9de44	ret
