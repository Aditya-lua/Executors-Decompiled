; BN_GF2m_mod_div @ 00a2d130
00a2d130	stp x24,x23,[sp, #-0x40]!
00a2d134	stp x22,x21,[sp, #0x10]
00a2d138	mov x22,x0
00a2d13c	mov x0,x4
00a2d140	stp x20,x19,[sp, #0x20]
00a2d144	stp x29,x30,[sp, #0x30]
00a2d148	add x29,sp,#0x30
00a2d14c	mov x19,x4
00a2d150	mov x20,x3
00a2d154	mov x24,x2
00a2d158	mov x21,x1
00a2d15c	bl 0x00c38a90
00a2d160	mov x0,x19
00a2d164	bl 0x00c38a40
00a2d168	cbz x0,0x00a2d1a8
00a2d16c	mov x1,x24
00a2d170	mov x2,x20
00a2d174	mov x3,x19
00a2d178	mov x23,x0
00a2d17c	bl 0x00a2caa4
00a2d180	cbz w0,0x00a2d1a8
00a2d184	mov x0,x22
00a2d188	mov x1,x21
00a2d18c	mov x2,x23
00a2d190	mov x3,x20
00a2d194	mov x4,x19
00a2d198	bl 0x00a2c73c
00a2d19c	cmp w0,#0x0
00a2d1a0	cset w20,ne
00a2d1a4	b 0x00a2d1ac
00a2d1a8	mov w20,wzr
00a2d1ac	mov x0,x19
00a2d1b0	bl 0x00c38a20
00a2d1b4	mov w0,w20
00a2d1b8	ldp x29,x30,[sp, #0x30]
00a2d1bc	ldp x20,x19,[sp, #0x20]
00a2d1c0	ldp x22,x21,[sp, #0x10]
00a2d1c4	ldp x24,x23,[sp], #0x40
00a2d1c8	ret
