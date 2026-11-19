; mbedtls_ccm_starts @ 00b6b110
00b6b110	stp x22,x21,[sp, #-0x30]!
00b6b114	stp x20,x19,[sp, #0x10]
00b6b118	stp x29,x30,[sp, #0x20]
00b6b11c	add x29,sp,#0x20
00b6b120	sub x8,x3,#0x7
00b6b124	mov x20,x3
00b6b128	mov x21,x2
00b6b12c	cmp x8,#0x6
00b6b130	mov x19,x0
00b6b134	b.ls 0x00b6b14c
00b6b138	ldp x29,x30,[sp, #0x20]
00b6b13c	ldp x20,x19,[sp, #0x10]
00b6b140	orr w0,wzr,#0xfffffff3
00b6b144	ldp x22,x21,[sp], #0x30
00b6b148	ret
00b6b14c	and w8,w20,#0xff
00b6b150	orr w9,wzr,#0xf
00b6b154	orr w10,wzr,#0xe
00b6b158	sub w9,w9,w8
00b6b15c	add x22,x19,#0x11
00b6b160	sub w8,w10,w8
00b6b164	stp w9,w1,[x19, #0x40]
00b6b168	mov x0,x22
00b6b16c	mov x1,x21
00b6b170	mov x2,x20
00b6b174	stp xzr,xzr,[x19, #0x10]
00b6b178	strb w8,[x19, #0x10]
00b6b17c	bl 0x00c2ffd0
00b6b180	ldr w2,[x19, #0x40]
00b6b184	add x0,x22,x20
00b6b188	mov w1,wzr
00b6b18c	bl 0x00c301c0
00b6b190	mov w8,#0x1
00b6b194	add x0,x19,#0x1
00b6b198	mov x1,x21
00b6b19c	mov x2,x20
00b6b1a0	strb w8,[x19, #0x1f]
00b6b1a4	bl 0x00c2ffd0
00b6b1a8	ldr w8,[x19, #0xa8]
00b6b1ac	mov x0,x19
00b6b1b0	orr w8,w8,#0x1
00b6b1b4	str w8,[x19, #0xa8]
00b6b1b8	ldp x29,x30,[sp, #0x20]
00b6b1bc	ldp x20,x19,[sp, #0x10]
00b6b1c0	ldp x22,x21,[sp], #0x30
00b6b1c4	b 0x00b6b1c8
