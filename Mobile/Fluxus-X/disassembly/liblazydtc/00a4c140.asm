; ossl_curve448_scalar_decode @ 00a4c140
00a4c140	stp x20,x19,[sp, #-0x20]!
00a4c144	orr w2,wzr,#0x38
00a4c148	stp x29,x30,[sp, #0x10]
00a4c14c	add x29,sp,#0x10
00a4c150	mov x19,x0
00a4c154	bl 0x00a4c270
00a4c158	mov x8,#0xbb0d
00a4c15c	ldp x9,x11,[x19]
00a4c160	movk x8,#0x54a7, LSL #16
00a4c164	movk x8,#0x3d6d, LSL #32
00a4c168	movk x8,#0xdc87, LSL #48
00a4c16c	mov x10,#-0x1
00a4c170	mov x12,#0x70ab
00a4c174	cmn x9,x8
00a4c178	movk x12,#0x723a, LSL #16
00a4c17c	adcs x8,xzr,x10
00a4c180	movk x12,#0x3d8d, LSL #32
00a4c184	asr x9,x8,#0x3f
00a4c188	adds x8,x8,x11
00a4c18c	movk x12,#0xde93, LSL #48
00a4c190	adcs x9,x9,xzr
00a4c194	cmn x8,x12
00a4c198	ldp x8,x12,[x19, #0x10]
00a4c19c	mov x11,#0xc970
00a4c1a0	movk x11,#0x5129, LSL #16
00a4c1a4	adcs x9,x9,x10
00a4c1a8	movk x11,#0x24b6, LSL #32
00a4c1ac	adds x8,x9,x8
00a4c1b0	asr x9,x9,#0x3f
00a4c1b4	movk x11,#0x3bb1, LSL #48
00a4c1b8	adcs x9,x9,xzr
00a4c1bc	cmn x8,x11
00a4c1c0	adcs x9,x9,x10
00a4c1c4	mov w8,#0xdc17
00a4c1c8	asr x11,x9,#0x3f
00a4c1cc	adds x9,x9,x12
00a4c1d0	movk w8,#0x8335, LSL #16
00a4c1d4	adcs x11,x11,xzr
00a4c1d8	cmn x9,x8
00a4c1dc	ldp x12,x8,[x19, #0x20]
00a4c1e0	adcs x9,x11,x10
00a4c1e4	adrp x2,0xcb5000
00a4c1e8	mov x0,x19
00a4c1ec	adds x11,x9,x12
00a4c1f0	asr x9,x9,#0x3f
00a4c1f4	adcs x9,x9,xzr
00a4c1f8	cmn x11,#0x1
00a4c1fc	adcs x9,x9,x10
00a4c200	ldr x11,[x19, #0x30]
00a4c204	adds x8,x9,x8
00a4c208	asr x9,x9,#0x3f
00a4c20c	adcs x9,x9,xzr
00a4c210	cmn x8,#0x1
00a4c214	adcs x9,x9,x10
00a4c218	ldr x2,[x2, #0x538]
00a4c21c	asr x10,x9,#0x3f
00a4c220	adds x9,x9,x11
00a4c224	orr x8,xzr,#-0x3fffffffffffffff
00a4c228	adcs x10,x10,xzr
00a4c22c	cmn x9,x8
00a4c230	mov w8,#0xffffffff
00a4c234	mov x1,x19
00a4c238	adcs x20,x10,x8
00a4c23c	bl 0x00a4bc44
00a4c240	adrp x2,0x765000
00a4c244	add x2,x2,#0xef0
00a4c248	mov x0,x19
00a4c24c	mov x1,x19
00a4c250	bl 0x00a4bc44
00a4c254	and x8,x20,#0xffffffff
00a4c258	ldp x29,x30,[sp, #0x10]
00a4c25c	sub x8,x8,#0x1
00a4c260	asr x8,x8,#0x3f
00a4c264	mvn w0,w8
00a4c268	ldp x20,x19,[sp], #0x20
00a4c26c	ret
