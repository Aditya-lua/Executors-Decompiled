; std::__ndk1::to_string @ 00bc8ba8
00bc8ba8	paciasp
00bc8bac	sub sp,sp,#0x40
00bc8bb0	stp x29,x30,[sp, #0x10]
00bc8bb4	stp x22,x21,[sp, #0x20]
00bc8bb8	stp x20,x19,[sp, #0x30]
00bc8bbc	add x29,sp,#0x10
00bc8bc0	mov w1,w0
00bc8bc4	add x0,sp,#0x4
00bc8bc8	mov x19,x8
00bc8bcc	add x20,x0,#0xb
00bc8bd0	tbz w1,#0x1f,0x00bc8be4
00bc8bd4	mov w8,#0x2d
00bc8bd8	orr x0,x0,#0x1
00bc8bdc	neg w1,w1
00bc8be0	strb w8,[sp, #0x4]
00bc8be4	sub x8,x20,x0
00bc8be8	cmp x8,#0x9
00bc8bec	b.gt 0x00bc8c30
00bc8bf0	orr w9,w1,#0x1
00bc8bf4	mov w10,#0x20
00bc8bf8	clz w9,w9
00bc8bfc	sub w9,w10,w9
00bc8c00	mov w10,#0x4d1
00bc8c04	mul w9,w9,w10
00bc8c08	adrp x10,0x78a000
00bc8c0c	add x10,x10,#0x158
00bc8c10	lsr w9,w9,#0xc
00bc8c14	ldr w10,[x10, w9, UXTW #0x2]
00bc8c18	cmp w1,w10
00bc8c1c	cset w10,cc
00bc8c20	sub w9,w9,w10
00bc8c24	add w9,w9,#0x1
00bc8c28	cmp x8,x9
00bc8c2c	b.lt 0x00bc8c38
00bc8c30	bl 0x00bcac54
00bc8c34	mov x20,x0
00bc8c38	add x8,sp,#0x4
00bc8c3c	sub x21,x20,x8
00bc8c40	cmn x21,#0x8
00bc8c44	b.cs 0x00bc8cbc
00bc8c48	cmp x21,#0x16
00bc8c4c	b.hi 0x00bc8c5c
00bc8c50	lsl w8,w21,#0x1
00bc8c54	strb w8,[x19], #0x1
00bc8c58	b 0x00bc8c84
00bc8c5c	orr x8,x21,#0x7
00bc8c60	mov w9,#0x1a
00bc8c64	cmp x8,#0x17
00bc8c68	csinc x22,x9,x8,eq
00bc8c6c	mov x0,x22
00bc8c70	bl 0x00c2fed0
00bc8c74	orr x8,x22,#0x1
00bc8c78	stp x21,x0,[x19, #0x8]
00bc8c7c	str x8,[x19]
00bc8c80	mov x19,x0
00bc8c84	add x8,sp,#0x4
00bc8c88	cmp x8,x20
00bc8c8c	b.eq 0x00bc8ca0
00bc8c90	add x1,sp,#0x4
00bc8c94	mov x0,x19
00bc8c98	mov x2,x21
00bc8c9c	bl 0x00c2ffd0
00bc8ca0	strb wzr,[x19, x21]
00bc8ca4	ldp x20,x19,[sp, #0x30]
00bc8ca8	ldp x22,x21,[sp, #0x20]
00bc8cac	ldp x29,x30,[sp, #0x10]
00bc8cb0	add sp,sp,#0x40
00bc8cb4	autiasp
00bc8cb8	ret
00bc8cbc	bl 0x007fe124
