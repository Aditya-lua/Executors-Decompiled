; FUN_00c2e12c @ 00c2e12c
00c2e12c	paciasp
00c2e130	stp x29,x30,[sp, #-0x20]!
00c2e134	str x19,[sp, #0x10]
00c2e138	mov x29,sp
00c2e13c	ldr w9,[x3]
00c2e140	mov x8,x2
00c2e144	cmp w9,#0x4
00c2e148	b.gt 0x00c2e17c
00c2e14c	cmp w9,#0x1
00c2e150	b.eq 0x00c2e1d4
00c2e154	cmp w9,#0x2
00c2e158	b.eq 0x00c2e164
00c2e15c	cmp w9,#0x3
00c2e160	b.ne 0x00c2e2d4
00c2e164	ldr x9,[x3, #0x8]
00c2e168	ldr x0,[x9, x8#0x0]
00c2e16c	ldr x19,[sp, #0x10]
00c2e170	ldp x29,x30,[sp], #0x20
00c2e174	autiasp
00c2e178	ret
00c2e17c	mov x2,x1
00c2e180	cmp w9,#0x5
00c2e184	b.eq 0x00c2e1e8
00c2e188	mov x1,x0
00c2e18c	cmp w9,#0x6
00c2e190	b.eq 0x00c2e1b4
00c2e194	cmp w9,#0x7
00c2e198	b.ne 0x00c2e2d4
00c2e19c	ldr x0,[x3, #0x8]
00c2e1a0	mov x3,x8
00c2e1a4	ldr x19,[sp, #0x10]
00c2e1a8	ldp x29,x30,[sp], #0x20
00c2e1ac	autiasp
00c2e1b0	b 0x00c2e890
00c2e1b4	ldr x0,[x3, #0x8]
00c2e1b8	mov x3,x8
00c2e1bc	bl 0x00c2e890
00c2e1c0	ldr x0,[x0]
00c2e1c4	ldr x19,[sp, #0x10]
00c2e1c8	ldp x29,x30,[sp], #0x20
00c2e1cc	autiasp
00c2e1d0	ret
00c2e1d4	mov x0,xzr
00c2e1d8	ldr x19,[sp, #0x10]
00c2e1dc	ldp x29,x30,[sp], #0x20
00c2e1e0	autiasp
00c2e1e4	ret
00c2e1e8	ldr x8,[x3, #0x8]
00c2e1ec	cmp w8,#0x1d
00c2e1f0	b.le 0x00c2e210
00c2e1f4	cmp w8,#0x1f
00c2e1f8	b.gt 0x00c2e240
00c2e1fc	cmp w8,#0x1e
00c2e200	b.eq 0x00c2e2a4
00c2e204	cmp w8,#0x1f
00c2e208	b.eq 0x00c2e268
00c2e20c	b 0x00c2e280
00c2e210	cmn w8,#0x2
00c2e214	b.eq 0x00c2e268
00c2e218	cmn w8,#0x1
00c2e21c	b.eq 0x00c2e250
00c2e220	cmp w8,#0x1d
00c2e224	b.ne 0x00c2e280
00c2e228	add x8,x2,#0xe8
00c2e22c	ldr x0,[x8]
00c2e230	ldr x19,[sp, #0x10]
00c2e234	ldp x29,x30,[sp], #0x20
00c2e238	autiasp
00c2e23c	ret
00c2e240	cmp w8,#0x22
00c2e244	b.eq 0x00c2e2bc
00c2e248	cmp w8,#0x20
00c2e24c	b.ne 0x00c2e280
00c2e250	add x8,x2,#0x100
00c2e254	ldr x0,[x8]
00c2e258	ldr x19,[sp, #0x10]
00c2e25c	ldp x29,x30,[sp], #0x20
00c2e260	autiasp
00c2e264	ret
00c2e268	add x8,x2,#0xf8
00c2e26c	ldr x0,[x8]
00c2e270	ldr x19,[sp, #0x10]
00c2e274	ldp x29,x30,[sp], #0x20
00c2e278	autiasp
00c2e27c	ret
00c2e280	cmp w8,#0x1c
00c2e284	b.hi 0x00c2e308
00c2e288	and x8,x8,#0x1f
00c2e28c	add x8,x2,x8, LSL #0x3
00c2e290	ldr x0,[x8]
00c2e294	ldr x19,[sp, #0x10]
00c2e298	ldp x29,x30,[sp], #0x20
00c2e29c	autiasp
00c2e2a0	ret
00c2e2a4	add x8,x2,#0xf0
00c2e2a8	ldr x0,[x8]
00c2e2ac	ldr x19,[sp, #0x10]
00c2e2b0	ldp x29,x30,[sp], #0x20
00c2e2b4	autiasp
00c2e2b8	ret
00c2e2bc	add x8,x2,#0x108
00c2e2c0	ldr x0,[x8]
00c2e2c4	ldr x19,[sp, #0x10]
00c2e2c8	ldp x29,x30,[sp], #0x20
00c2e2cc	autiasp
00c2e2d0	ret
00c2e2d4	adrp x19,0xcb4000
00c2e2d8	adrp x1,0x2a1000
00c2e2dc	add x1,x1,#0x45d
00c2e2e0	ldr x19,[x19, #0xba0]
00c2e2e4	adrp x2,0x2b8000
00c2e2e8	add x2,x2,#0xdc4
00c2e2ec	adrp x3,0x2b1000
00c2e2f0	add x3,x3,#0x21f
00c2e2f4	add x0,x19,#0x130
00c2e2f8	bl 0x00c30940
00c2e2fc	add x0,x19,#0x130
00c2e300	bl 0x00c30c50
00c2e304	bl 0x00c30b40
00c2e308	adrp x19,0xcb4000
00c2e30c	adrp x1,0x2a1000
00c2e310	add x1,x1,#0x45d
00c2e314	ldr x19,[x19, #0xba0]
00c2e318	adrp x2,0x2ba000
00c2e31c	add x2,x2,#0xce6
00c2e320	adrp x3,0x2b1000
00c2e324	add x3,x3,#0x204
00c2e328	add x0,x19,#0x130
00c2e32c	bl 0x00c30940
00c2e330	add x0,x19,#0x130
00c2e334	bl 0x00c30c50
00c2e338	bl 0x00c30b40
