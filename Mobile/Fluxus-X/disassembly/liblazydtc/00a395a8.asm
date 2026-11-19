; ossl_ec_GFp_simple_group_copy @ 00a395a8
00a395a8	stp x20,x19,[sp, #-0x20]!
00a395ac	stp x29,x30,[sp, #0x10]
00a395b0	mov x20,x1
00a395b4	mov x19,x0
00a395b8	ldr x0,[x0, #0x40]
00a395bc	ldr x1,[x1, #0x40]
00a395c0	add x29,sp,#0x10
00a395c4	bl 0x00c36990
00a395c8	cbz x0,0x00a395f8
00a395cc	ldr x0,[x19, #0x60]
00a395d0	ldr x1,[x20, #0x60]
00a395d4	bl 0x00c36990
00a395d8	cbz x0,0x00a395f8
00a395dc	ldr x0,[x19, #0x68]
00a395e0	ldr x1,[x20, #0x68]
00a395e4	bl 0x00c36990
00a395e8	cbz x0,0x00a395f8
00a395ec	ldr w8,[x20, #0x70]
00a395f0	mov w0,#0x1
00a395f4	str w8,[x19, #0x70]
00a395f8	ldp x29,x30,[sp, #0x10]
00a395fc	ldp x20,x19,[sp], #0x20
00a39600	ret
