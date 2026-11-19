; ix::SocketOpenSSL::openSSLAddCARootsFromString @ 009a3dd4
009a3dd4	stp x24,x23,[sp, #-0x40]!
009a3dd8	stp x22,x21,[sp, #0x10]
009a3ddc	stp x20,x19,[sp, #0x20]
009a3de0	stp x29,x30,[sp, #0x30]
009a3de4	add x29,sp,#0x30
009a3de8	ldr x0,[x0, #0x48]
009a3dec	mov x20,x1
009a3df0	bl 0x00c31a70
009a3df4	mov x19,x0
009a3df8	cbz x0,0x009a3ef0
009a3dfc	mov w1,#0x8000
009a3e00	movk w1,#0x8, LSL #16
009a3e04	mov x0,x19
009a3e08	bl 0x00c32c50
009a3e0c	ldrb w8,[x20]
009a3e10	tbnz w8,#0x0,0x009a3e20
009a3e14	add x0,x20,#0x1
009a3e18	lsr w1,w8,#0x1
009a3e1c	b 0x009a3e24
009a3e20	ldp x1,x0,[x20, #0x8]
009a3e24	bl 0x00c31a50
009a3e28	mov x20,x0
009a3e2c	cbz x0,0x009a3ef0
009a3e30	adrp x3,0x2ab000
009a3e34	add x3,x3,#0x32c
009a3e38	mov x0,x20
009a3e3c	mov x1,xzr
009a3e40	mov x2,xzr
009a3e44	bl 0x00c32650
009a3e48	mov x22,x0
009a3e4c	bl 0x00c323e0
009a3e50	mov x23,xzr
009a3e54	cbz x22,0x009a3ec8
009a3e58	adrp x21,0x2ab000
009a3e5c	mov w24,#0x5800000
009a3e60	add x21,x21,#0x32c
009a3e64	mov x0,x19
009a3e68	mov x1,x22
009a3e6c	bl 0x00c31a80
009a3e70	cbnz w0,0x009a3e9c
009a3e74	bl 0x00c32400
009a3e78	and x8,x0,#0xff800000
009a3e7c	cmp x8,x24
009a3e80	b.ne 0x009a3ed0
009a3e84	asr w8,w0,#0x1f
009a3e88	and w8,w8,#0x7f800000
009a3e8c	orr w8,w8,#0x7fffff
009a3e90	and w8,w8,w0
009a3e94	cmp w8,#0x65
009a3e98	b.ne 0x009a3ed0
009a3e9c	mov x0,x22
009a3ea0	bl 0x00c31a90
009a3ea4	mov x0,x20
009a3ea8	mov x1,xzr
009a3eac	mov x2,xzr
009a3eb0	mov x3,x21
009a3eb4	add x23,x23,#0x1
009a3eb8	bl 0x00c32650
009a3ebc	mov x22,x0
009a3ec0	bl 0x00c323e0
009a3ec4	cbnz x22,0x009a3e64
009a3ec8	mov w19,#0x1
009a3ecc	b 0x009a3edc
009a3ed0	mov x0,x22
009a3ed4	bl 0x00c31a90
009a3ed8	mov w19,wzr
009a3edc	mov x0,x20
009a3ee0	bl 0x00c31a40
009a3ee4	cmp x23,#0x0
009a3ee8	cset w8,ne
009a3eec	and w0,w8,w19
009a3ef0	ldp x29,x30,[sp, #0x30]
009a3ef4	ldp x20,x19,[sp, #0x20]
009a3ef8	ldp x22,x21,[sp, #0x10]
009a3efc	ldp x24,x23,[sp], #0x40
009a3f00	ret
