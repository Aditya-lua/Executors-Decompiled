; ossl_blake2s_init @ 00b2fc74
00b2fc74	stp x20,x19,[sp, #-0x20]!
00b2fc78	mov x19,x1
00b2fc7c	mov x20,x0
00b2fc80	add x0,x0,#0x20
00b2fc84	mov w2,#0x58
00b2fc88	mov w1,wzr
00b2fc8c	stp x29,x30,[sp, #0x10]
00b2fc90	add x29,sp,#0x10
00b2fc94	bl 0x00c301c0
00b2fc98	adrp x8,0x364000
00b2fc9c	add x8,x8,#0xd70
00b2fca0	ldp q1,q0,[x8]
00b2fca4	mov w9,#0xe667
00b2fca8	movk w9,#0x6a09, LSL #16
00b2fcac	mov w0,#0x1
00b2fcb0	stp q1,q0,[x20]
00b2fcb4	ldrb w8,[x19]
00b2fcb8	str x8,[x20, #0x78]
00b2fcbc	ldr w8,[x19]
00b2fcc0	eor w8,w8,w9
00b2fcc4	str w8,[x20]
00b2fcc8	ldr w8,[x19, #0x4]
00b2fccc	mov w9,#0xae85
00b2fcd0	movk w9,#0xbb67, LSL #16
00b2fcd4	eor w8,w8,w9
00b2fcd8	str w8,[x20, #0x4]
00b2fcdc	ldr w8,[x19, #0x8]
00b2fce0	mov w9,#0xf372
00b2fce4	movk w9,#0x3c6e, LSL #16
00b2fce8	eor w8,w8,w9
00b2fcec	str w8,[x20, #0x8]
00b2fcf0	ldr w8,[x19, #0xc]
00b2fcf4	mov w9,#0xf53a
00b2fcf8	movk w9,#0xa54f, LSL #16
00b2fcfc	eor w8,w8,w9
00b2fd00	str w8,[x20, #0xc]
00b2fd04	ldr w8,[x19, #0x10]
00b2fd08	mov w9,#0x527f
00b2fd0c	movk w9,#0x510e, LSL #16
00b2fd10	eor w8,w8,w9
00b2fd14	str w8,[x20, #0x10]
00b2fd18	ldr w8,[x19, #0x14]
00b2fd1c	mov w9,#0x688c
00b2fd20	movk w9,#0x9b05, LSL #16
00b2fd24	eor w8,w8,w9
00b2fd28	str w8,[x20, #0x14]
00b2fd2c	ldr w8,[x19, #0x18]
00b2fd30	mov w9,#0xd9ab
00b2fd34	movk w9,#0x1f83, LSL #16
00b2fd38	eor w8,w8,w9
00b2fd3c	str w8,[x20, #0x18]
00b2fd40	ldr w8,[x19, #0x1c]
00b2fd44	mov w9,#0xcd19
00b2fd48	movk w9,#0x5be0, LSL #16
00b2fd4c	eor w8,w8,w9
00b2fd50	str w8,[x20, #0x1c]
00b2fd54	ldp x29,x30,[sp, #0x10]
00b2fd58	ldp x20,x19,[sp], #0x20
00b2fd5c	ret
