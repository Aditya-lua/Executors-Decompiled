; SSL_get_fd @ 009b3bbc
009b3bbc	str x19,[sp, #-0x20]!
009b3bc0	stp x29,x30,[sp, #0x10]
009b3bc4	add x29,sp,#0x10
009b3bc8	mov w19,#0xffffffff
009b3bcc	stur w19,[x29, #-0x4]
009b3bd0	ldr x0,[x0, #0x10]
009b3bd4	mov w1,#0x100
009b3bd8	bl 0x00c355d0
009b3bdc	cbz x0,0x009b3bf4
009b3be0	mov w1,#0x69
009b3be4	sub x3,x29,#0x4
009b3be8	mov x2,xzr
009b3bec	bl 0x00c321a0
009b3bf0	ldur w19,[x29, #-0x4]
009b3bf4	ldp x29,x30,[sp, #0x10]
009b3bf8	mov w0,w19
009b3bfc	ldr x19,[sp], #0x20
009b3c00	ret
