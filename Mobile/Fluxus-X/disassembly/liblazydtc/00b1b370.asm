; X509_CRL_get0_by_cert @ 00b1b370
00b1b370	sub sp,sp,#0x40
00b1b374	stp x22,x21,[sp, #0x10]
00b1b378	stp x20,x19,[sp, #0x20]
00b1b37c	stp x29,x30,[sp, #0x30]
00b1b380	ldr x8,[x0, #0xd0]
00b1b384	mov x19,x0
00b1b388	add x29,sp,#0x30
00b1b38c	ldr x0,[x8, #0x18]
00b1b390	cbz x0,0x00b1b3dc
00b1b394	str x0,[sp, #0x8]
00b1b398	mov x0,x2
00b1b39c	mov x21,x2
00b1b3a0	mov x20,x1
00b1b3a4	bl 0x00c3f060
00b1b3a8	mov x22,x0
00b1b3ac	mov x0,x21
00b1b3b0	bl 0x00c32cf0
00b1b3b4	mov x3,x0
00b1b3b8	mov x0,x19
00b1b3bc	mov x1,x20
00b1b3c0	mov x2,x22
00b1b3c4	ldr x4,[sp, #0x8]
00b1b3c8	ldp x29,x30,[sp, #0x30]
00b1b3cc	ldp x20,x19,[sp, #0x20]
00b1b3d0	ldp x22,x21,[sp, #0x10]
00b1b3d4	add sp,sp,#0x40
00b1b3d8	br x4
00b1b3dc	ldp x29,x30,[sp, #0x30]
00b1b3e0	ldp x20,x19,[sp, #0x20]
00b1b3e4	ldp x22,x21,[sp, #0x10]
00b1b3e8	add sp,sp,#0x40
00b1b3ec	ret
