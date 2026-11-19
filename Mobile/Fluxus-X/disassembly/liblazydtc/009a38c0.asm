; ix::SocketOpenSSL::openSSLInitialize @ 009a38c0
009a38c0	stp x29,x30,[sp, #-0x10]!
009a38c4	mov x29,sp
009a38c8	mov w0,#0x40
009a38cc	mov x1,xzr
009a38d0	bl 0x00c325d0
009a38d4	cbz w0,0x009a3904
009a38d8	mov x0,xzr
009a38dc	mov x1,xzr
009a38e0	bl 0x00c325d0
009a38e4	mov w0,#0x2
009a38e8	movk w0,#0x20, LSL #16
009a38ec	mov x1,xzr
009a38f0	bl 0x00c325d0
009a38f4	adrp x8,0xcb5000
009a38f8	ldr x8,[x8, #0x100]
009a38fc	mov w9,#0x1
009a3900	stlrb w9,[x8]
009a3904	ldp x29,x30,[sp], #0x10
009a3908	ret
