; PEM_write @ 00ab6eb4
00ab6eb4	stp x24,x23,[sp, #-0x40]!
00ab6eb8	stp x22,x21,[sp, #0x10]
00ab6ebc	stp x20,x19,[sp, #0x20]
00ab6ec0	stp x29,x30,[sp, #0x30]
00ab6ec4	add x29,sp,#0x30
00ab6ec8	mov x19,x4
00ab6ecc	mov x20,x3
00ab6ed0	mov x21,x2
00ab6ed4	mov x22,x1
00ab6ed8	mov x24,x0
00ab6edc	bl 0x00c32270
00ab6ee0	bl 0x00c32240
00ab6ee4	cbz x0,0x00ab6f28
00ab6ee8	mov w1,#0x6a
00ab6eec	mov x2,xzr
00ab6ef0	mov x3,x24
00ab6ef4	mov x23,x0
00ab6ef8	bl 0x00c321a0
00ab6efc	mov x0,x23
00ab6f00	mov x1,x22
00ab6f04	mov x2,x21
00ab6f08	mov x3,x20
00ab6f0c	mov x4,x19
00ab6f10	bl 0x00ab66a4
00ab6f14	mov w19,w0
00ab6f18	mov x0,x23
00ab6f1c	bl 0x00c31a40
00ab6f20	mov w0,w19
00ab6f24	b 0x00ab6f5c
00ab6f28	bl 0x00c342a0
00ab6f2c	adrp x0,0x2ce000
00ab6f30	adrp x2,0x2a8000
00ab6f34	add x0,x0,#0x16c
00ab6f38	add x2,x2,#0x6e5
00ab6f3c	mov w1,#0x256
00ab6f40	bl 0x00c342b0
00ab6f44	mov w1,#0x7
00ab6f48	mov w0,#0x9
00ab6f4c	movk w1,#0x8, LSL #16
00ab6f50	mov x2,xzr
00ab6f54	bl 0x00c342c0
00ab6f58	mov w0,wzr
00ab6f5c	ldp x29,x30,[sp, #0x30]
00ab6f60	ldp x20,x19,[sp, #0x20]
00ab6f64	ldp x22,x21,[sp, #0x10]
00ab6f68	ldp x24,x23,[sp], #0x40
00ab6f6c	ret
