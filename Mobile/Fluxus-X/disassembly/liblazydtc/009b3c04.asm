; SSL_get_rfd @ 009b3c04
009b3c04	str x19,[sp, #-0x20]!
009b3c08	stp x29,x30,[sp, #0x10]
009b3c0c	add x29,sp,#0x10
009b3c10	mov w19,#0xffffffff
009b3c14	stur w19,[x29, #-0x4]
009b3c18	ldr x0,[x0, #0x10]
009b3c1c	mov w1,#0x100
009b3c20	bl 0x00c355d0
009b3c24	cbz x0,0x009b3c3c
009b3c28	mov w1,#0x69
009b3c2c	sub x3,x29,#0x4
009b3c30	mov x2,xzr
009b3c34	bl 0x00c321a0
009b3c38	ldur w19,[x29, #-0x4]
009b3c3c	ldp x29,x30,[sp, #0x10]
009b3c40	mov w0,w19
009b3c44	ldr x19,[sp], #0x20
009b3c48	ret
