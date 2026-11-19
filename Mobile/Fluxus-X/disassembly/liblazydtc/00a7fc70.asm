; OPENSSL_LH_new @ 00a7fc70
00a7fc70	str x21,[sp, #-0x30]!
00a7fc74	mov x21,x1
00a7fc78	adrp x1,0x2b0000
00a7fc7c	stp x20,x19,[sp, #0x10]
00a7fc80	mov x20,x0
00a7fc84	add x1,x1,#0xdf
00a7fc88	mov w0,#0x48
00a7fc8c	mov w2,#0x33
00a7fc90	stp x29,x30,[sp, #0x20]
00a7fc94	add x29,sp,#0x20
00a7fc98	bl 0x00c34250
00a7fc9c	mov x19,x0
00a7fca0	cbz x0,0x00a7fd30
00a7fca4	adrp x1,0x2b0000
00a7fca8	add x1,x1,#0xdf
00a7fcac	mov w0,#0x80
00a7fcb0	mov w2,#0x3b
00a7fcb4	bl 0x00c34250
00a7fcb8	str x0,[x19]
00a7fcbc	cbz x0,0x00a7fd08
00a7fcc0	adrp x9,0x29b000
00a7fcc4	ldr d0,[x9, #0x528]
00a7fcc8	adrp x8,0xcb4000
00a7fccc	mov w9,#0x8
00a7fcd0	ldr x8,[x8, #0x9c8]
00a7fcd4	str w9,[x19, #0x24]
00a7fcd8	adrp x9,0x29c000
00a7fcdc	str d0,[x19, #0x18]
00a7fce0	ldr q0,[x9, #0x4c0]
00a7fce4	adrp x9,0xcb5000
00a7fce8	ldr x9,[x9, #0x4a8]
00a7fcec	cmp x21,#0x0
00a7fcf0	csel x8,x8,x21,eq
00a7fcf4	cmp x20,#0x0
00a7fcf8	csel x9,x9,x20,eq
00a7fcfc	stp x8,x9,[x19, #0x8]
00a7fd00	stur q0,[x19, #0x28]
00a7fd04	b 0x00a7fd30
00a7fd08	adrp x20,0x2b0000
00a7fd0c	add x20,x20,#0xdf
00a7fd10	mov w2,#0x47
00a7fd14	mov x1,x20
00a7fd18	bl 0x00c32310
00a7fd1c	mov w2,#0x48
00a7fd20	mov x0,x19
00a7fd24	mov x1,x20
00a7fd28	bl 0x00c32310
00a7fd2c	mov x19,xzr
00a7fd30	mov x0,x19
00a7fd34	ldp x29,x30,[sp, #0x20]
00a7fd38	ldp x20,x19,[sp, #0x10]
00a7fd3c	ldr x21,[sp], #0x30
00a7fd40	ret
