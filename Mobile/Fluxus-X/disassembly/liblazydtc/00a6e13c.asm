; EVP_PKEY_can_sign @ 00a6e13c
00a6e13c	sub sp,sp,#0x30
00a6e140	stp x20,x19,[sp, #0x10]
00a6e144	stp x29,x30,[sp, #0x20]
00a6e148	mov x19,x0
00a6e14c	ldr x0,[x0, #0x60]
00a6e150	add x29,sp,#0x20
00a6e154	cbz x0,0x00a6e17c
00a6e158	bl 0x00c36360
00a6e15c	bl 0x00c3b2f0
00a6e160	ldr x8,[x19, #0x60]
00a6e164	mov x19,x0
00a6e168	ldr x9,[x8, #0x98]
00a6e16c	cbz x9,0x00a6e1c8
00a6e170	orr w0,wzr,#0xc
00a6e174	blr x9
00a6e178	b 0x00a6e1d0
00a6e17c	ldr w1,[x19]
00a6e180	add x0,sp,#0x8
00a6e184	bl 0x00c37b20
00a6e188	cbz x0,0x00a6e1f0
00a6e18c	ldr w20,[x0]
00a6e190	ldr x0,[sp, #0x8]
00a6e194	bl 0x00c32360
00a6e198	cmp w20,#0x38f
00a6e19c	mov w0,#0x1
00a6e1a0	b.gt 0x00a6e20c
00a6e1a4	cmp w20,#0x6
00a6e1a8	b.eq 0x00a6e1fc
00a6e1ac	cmp w20,#0x74
00a6e1b0	b.eq 0x00a6e1fc
00a6e1b4	cmp w20,#0x198
00a6e1b8	b.ne 0x00a6e1f8
00a6e1bc	ldr x0,[x19, #0x20]
00a6e1c0	bl 0x00c3af50
00a6e1c4	b 0x00a6e1fc
00a6e1c8	mov x0,x8
00a6e1cc	bl 0x00c3bf30
00a6e1d0	mov x1,x0
00a6e1d4	mov x0,x19
00a6e1d8	mov x2,xzr
00a6e1dc	bl 0x00c352e0
00a6e1e0	cbz x0,0x00a6e1f8
00a6e1e4	bl 0x00c352f0
00a6e1e8	mov w0,#0x1
00a6e1ec	b 0x00a6e1fc
00a6e1f0	ldr x0,[sp, #0x8]
00a6e1f4	bl 0x00c32360
00a6e1f8	mov w0,wzr
00a6e1fc	ldp x29,x30,[sp, #0x20]
00a6e200	ldp x20,x19,[sp, #0x10]
00a6e204	add sp,sp,#0x30
00a6e208	ret
00a6e20c	sub w8,w20,#0x43f
00a6e210	cmp w8,#0x2
00a6e214	b.cc 0x00a6e1fc
00a6e218	cmp w20,#0x390
00a6e21c	b.eq 0x00a6e1fc
00a6e220	b 0x00a6e1f8
