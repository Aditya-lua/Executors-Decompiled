; ossl_ec_GFp_simple_point_copy @ 00a39bd4
00a39bd4	stp x20,x19,[sp, #-0x20]!
00a39bd8	stp x29,x30,[sp, #0x10]
00a39bdc	mov x20,x1
00a39be0	mov x19,x0
00a39be4	ldr x0,[x0, #0x10]
00a39be8	ldr x1,[x1, #0x10]
00a39bec	add x29,sp,#0x10
00a39bf0	bl 0x00c36990
00a39bf4	cbz x0,0x00a39c2c
00a39bf8	ldr x0,[x19, #0x18]
00a39bfc	ldr x1,[x20, #0x18]
00a39c00	bl 0x00c36990
00a39c04	cbz x0,0x00a39c2c
00a39c08	ldr x0,[x19, #0x20]
00a39c0c	ldr x1,[x20, #0x20]
00a39c10	bl 0x00c36990
00a39c14	cbz x0,0x00a39c2c
00a39c18	ldr w8,[x20, #0x28]
00a39c1c	mov w0,#0x1
00a39c20	str w8,[x19, #0x28]
00a39c24	ldr w8,[x20, #0x8]
00a39c28	str w8,[x19, #0x8]
00a39c2c	ldp x29,x30,[sp, #0x10]
00a39c30	ldp x20,x19,[sp], #0x20
00a39c34	ret
