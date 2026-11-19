; evp_keymgmt_util_get_deflt_digest_name @ 00a66120
00a66120	sub sp,sp,#0x1b0
00a66124	stp x22,x21,[sp, #0x180]
00a66128	stp x20,x19,[sp, #0x190]
00a6612c	stp x29,x30,[sp, #0x1a0]
00a66130	add x29,sp,#0x1a0
00a66134	mov x20,x2
00a66138	mov x21,x1
00a6613c	mov x22,x0
00a66140	add x0,sp,#0x8c
00a66144	mov w2,#0x64
00a66148	mov w1,wzr
00a6614c	stp x28,x23,[sp, #0x170]
00a66150	mov x19,x3
00a66154	sub x23,x29,#0xb0
00a66158	bl 0x00c301c0
00a6615c	add x0,sp,#0x28
00a66160	mov w2,#0x64
00a66164	mov w1,wzr
00a66168	bl 0x00c301c0
00a6616c	adrp x0,0x2b5000
00a66170	add x0,x0,#0xc7a
00a66174	mov x8,sp
00a66178	add x1,sp,#0x8c
00a6617c	mov w2,#0x64
00a66180	bl 0x00c36280
00a66184	ldr x8,[sp, #0x20]
00a66188	ldp q1,q0,[sp]
00a6618c	adrp x0,0x2c9000
00a66190	add x0,x0,#0x98e
00a66194	stur x8,[x29, #-0x90]
00a66198	mov x8,sp
00a6619c	add x1,sp,#0x28
00a661a0	mov w2,#0x64
00a661a4	stp q1,q0,[x29, #-0xb0]
00a661a8	bl 0x00c36280
00a661ac	ldr x8,[sp, #0x20]
00a661b0	ldp q1,q0,[sp]
00a661b4	stur x8,[x29, #-0x68]
00a661b8	mov x8,sp
00a661bc	stur q0,[x23, #0x38]
00a661c0	stur q1,[x23, #0x28]
00a661c4	bl 0x00c34c40
00a661c8	ldr x8,[sp, #0x20]
00a661cc	ldp q1,q0,[sp]
00a661d0	sub x2,x29,#0xb0
00a661d4	mov x0,x22
00a661d8	mov x1,x21
00a661dc	stur x8,[x29, #-0x40]
00a661e0	stp q1,q0,[x29, #-0x60]
00a661e4	bl 0x00c3d380
00a661e8	cbz w0,0x00a66208
00a661ec	add x0,x23,#0x28
00a661f0	bl 0x00c3d030
00a661f4	cbz w0,0x00a66210
00a661f8	add x8,sp,#0x28
00a661fc	mov w21,#0x2
00a66200	mov w9,#0x1
00a66204	b 0x00a66228
00a66208	mov w21,wzr
00a6620c	b 0x00a66254
00a66210	sub x0,x29,#0xb0
00a66214	bl 0x00c3d030
00a66218	cbz w0,0x00a66270
00a6621c	mov x9,xzr
00a66220	add x8,sp,#0x8c
00a66224	mov w21,#0x1
00a66228	mov w10,#0x28
00a6622c	sub x11,x29,#0xb0
00a66230	madd x9,x9,x10,x11
00a66234	ldr x9,[x9, #0x20]
00a66238	adrp x10,0x2d1000
00a6623c	add x10,x10,#0xa38
00a66240	mov x0,x20
00a66244	cmp x9,#0x2
00a66248	csel x1,x10,x8,cc
00a6624c	mov x2,x19
00a66250	bl 0x00c387f0
00a66254	mov w0,w21
00a66258	ldp x29,x30,[sp, #0x1a0]
00a6625c	ldp x20,x19,[sp, #0x190]
00a66260	ldp x22,x21,[sp, #0x180]
00a66264	ldp x28,x23,[sp, #0x170]
00a66268	add sp,sp,#0x1b0
00a6626c	ret
00a66270	orr w21,wzr,#0xfffffffe
00a66274	b 0x00a66254
