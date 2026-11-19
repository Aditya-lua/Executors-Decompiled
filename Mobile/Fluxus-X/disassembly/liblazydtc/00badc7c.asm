; mbedtls_sha512_starts @ 00badc7c
00badc7c	cmp w1,#0x1
00badc80	mov x8,x0
00badc84	b.ls 0x00badc90
00badc88	mov w0,#0xffffff8b
00badc8c	ret
00badc90	mov x9,#0x9ed8
00badc94	mov x10,#0xc908
00badc98	movk x9,#0xc105, LSL #16
00badc9c	movk x10,#0xf3bc, LSL #16
00badca0	movk x9,#0x9d5d, LSL #32
00badca4	movk x10,#0xe667, LSL #32
00badca8	cmp w1,#0x0
00badcac	movk x9,#0xcbbb, LSL #48
00badcb0	movk x10,#0x6a09, LSL #48
00badcb4	mov x11,#0xd507
00badcb8	mov x12,#0xa73b
00badcbc	mov x13,#0xdd17
00badcc0	mov x14,#0xf82b
00badcc4	mov x15,#0x5939
00badcc8	mov x16,#0x36f1
00badccc	mov x17,#0xb31
00badcd0	csel x9,x10,x9,eq
00badcd4	mov x10,#0x82d1
00badcd8	movk x11,#0x367c, LSL #16
00badcdc	movk x12,#0x84ca, LSL #16
00badce0	movk x13,#0x3070, LSL #16
00badce4	movk x14,#0xfe94, LSL #16
00badce8	movk x15,#0xf70e, LSL #16
00badcec	movk x16,#0x5f1d, LSL #16
00badcf0	movk x17,#0xffc0, LSL #16
00badcf4	movk x10,#0xade6, LSL #16
00badcf8	movk x11,#0x292a, LSL #32
00badcfc	movk x12,#0xae85, LSL #32
00badd00	movk x13,#0x15a, LSL #32
00badd04	movk x14,#0xf372, LSL #32
00badd08	movk x15,#0xecd8, LSL #32
00badd0c	movk x16,#0xf53a, LSL #32
00badd10	movk x17,#0x2667, LSL #32
00badd14	movk x10,#0x527f, LSL #32
00badd18	movk x11,#0x629a, LSL #48
00badd1c	movk x12,#0xbb67, LSL #48
00badd20	movk x13,#0x9159, LSL #48
00badd24	movk x14,#0x3c6e, LSL #48
00badd28	movk x15,#0x152f, LSL #48
00badd2c	movk x16,#0xa54f, LSL #48
00badd30	movk x17,#0x6733, LSL #48
00badd34	movk x10,#0x510e, LSL #48
00badd38	csel x11,x12,x11,eq
00badd3c	mov x12,#0x1511
00badd40	csel x13,x14,x13,eq
00badd44	mov x14,#0x6c1f
00badd48	csel x15,x16,x15,eq
00badd4c	mov x16,#0x8fa7
00badd50	csel x10,x10,x17,eq
00badd54	mov x17,#0xbd6b
00badd58	movk x12,#0x6858, LSL #16
00badd5c	movk x14,#0x2b3e, LSL #16
00badd60	movk x16,#0x64f9, LSL #16
00badd64	movk x17,#0xfb41, LSL #16
00badd68	movk x12,#0x4a87, LSL #32
00badd6c	movk x14,#0x688c, LSL #32
00badd70	movk x16,#0x2e0d, LSL #32
00badd74	movk x17,#0xd9ab, LSL #32
00badd78	movk x12,#0x8eb4, LSL #48
00badd7c	movk x14,#0x9b05, LSL #48
00badd80	movk x16,#0xdb0c, LSL #48
00badd84	movk x17,#0x1f83, LSL #48
00badd88	csel x12,x14,x12,eq
00badd8c	mov x14,#0x4fa4
00badd90	csel x16,x17,x16,eq
00badd94	mov x17,#0x2179
00badd98	movk x14,#0xbefa, LSL #16
00badd9c	movk x17,#0x137e, LSL #16
00badda0	movk x14,#0x481d, LSL #32
00badda4	movk x17,#0xcd19, LSL #32
00badda8	movk x14,#0x47b5, LSL #48
00baddac	movk x17,#0x5be0, LSL #48
00baddb0	mov w0,wzr
00baddb4	csel x14,x17,x14,eq
00baddb8	stp xzr,xzr,[x8]
00baddbc	stp x9,x11,[x8, #0x10]
00baddc0	stp x13,x15,[x8, #0x20]
00baddc4	stp x10,x12,[x8, #0x30]
00baddc8	stp x16,x14,[x8, #0x40]
00baddcc	str w1,[x8, #0xd0]
00baddd0	ret
