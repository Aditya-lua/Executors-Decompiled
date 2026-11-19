; EVP_PKEY_meth_copy @ 00a75648
00a75648	stp x20,x19,[sp, #-0x20]!
00a7564c	stp x29,x30,[sp, #0x10]
00a75650	ldr x20,[x0]
00a75654	mov w2,#0x100
00a75658	add x29,sp,#0x10
00a7565c	mov x19,x0
00a75660	bl 0x00c2ffd0
00a75664	str x20,[x19]
00a75668	ldp x29,x30,[sp, #0x10]
00a7566c	ldp x20,x19,[sp], #0x20
00a75670	ret
