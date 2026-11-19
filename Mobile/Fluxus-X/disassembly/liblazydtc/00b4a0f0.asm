; FUN_00b4a0f0 @ 00b4a0f0
00b4a0f0	sub sp,sp,#0x50
00b4a0f4	stp x22,x21,[sp, #0x20]
00b4a0f8	stp x20,x19,[sp, #0x30]
00b4a0fc	stp x29,x30,[sp, #0x40]
00b4a100	mov x19,x0
00b4a104	ldr x0,[x0]
00b4a108	str x23,[sp, #0x10]
00b4a10c	add x29,sp,#0x40
00b4a110	mov x20,x1
00b4a114	bl 0x00c41210
00b4a118	cbz x20,0x00b4a294
00b4a11c	adrp x1,0x29d000
00b4a120	mov x21,x0
00b4a124	add x1,x1,#0xe2e
00b4a128	mov x0,x20
00b4a12c	bl 0x00c36530
00b4a130	cbz x0,0x00b4a1bc
00b4a134	ldr x0,[x0, #0x10]
00b4a138	adrp x1,0x2cd000
00b4a13c	add x1,x1,#0xdff
00b4a140	bl 0x00c35ee0
00b4a144	cbz w0,0x00b4a16c
00b4a148	ldr x0,[x19, #0x10]
00b4a14c	bl 0x00c36370
00b4a150	adrp x2,0x2c3000
00b4a154	add x0,x19,#0x8
00b4a158	add x2,x2,#0x5d3
00b4a15c	mov x1,x20
00b4a160	mov x3,xzr
00b4a164	mov x4,xzr
00b4a168	b 0x00b4a1b0
00b4a16c	adrp x2,0x2c3000
00b4a170	adrp x4,0x2d5000
00b4a174	add x0,x19,#0x8
00b4a178	add x2,x2,#0x5d3
00b4a17c	add x4,x4,#0x3fd
00b4a180	mov x1,x20
00b4a184	mov x3,xzr
00b4a188	mov x5,x21
00b4a18c	bl 0x00c41180
00b4a190	cbz w0,0x00b4a298
00b4a194	adrp x2,0x2c3000
00b4a198	adrp x4,0x2d1000
00b4a19c	add x0,x19,#0x10
00b4a1a0	add x2,x2,#0x5d3
00b4a1a4	add x4,x4,#0x42e
00b4a1a8	mov x1,x20
00b4a1ac	mov x3,xzr
00b4a1b0	mov x5,x21
00b4a1b4	bl 0x00c41180
00b4a1b8	cbz w0,0x00b4a298
00b4a1bc	adrp x1,0x2cd000
00b4a1c0	add x1,x1,#0x6e9
00b4a1c4	mov x0,x20
00b4a1c8	bl 0x00c36530
00b4a1cc	cbz x0,0x00b4a210
00b4a1d0	mov x22,x19
00b4a1d4	mov x21,x0
00b4a1d8	ldr x0,[x22, #0x18]!
00b4a1dc	adrp x2,0x2b8000
00b4a1e0	add x2,x2,#0xad4
00b4a1e4	mov w3,#0xc3
00b4a1e8	mov x23,x22
00b4a1ec	ldr x1,[x23, #0x8]!
00b4a1f0	bl 0x00c345e0
00b4a1f4	mov x0,x21
00b4a1f8	mov x1,x22
00b4a1fc	mov x2,xzr
00b4a200	mov x3,x23
00b4a204	str xzr,[x22]
00b4a208	bl 0x00c3ace0
00b4a20c	cbz w0,0x00b4a298
00b4a210	adrp x1,0x2bb000
00b4a214	add x1,x1,#0x864
00b4a218	mov x0,x20
00b4a21c	bl 0x00c36530
00b4a220	cbz x0,0x00b4a294
00b4a224	adrp x20,0x2bb000
00b4a228	mov x21,x0
00b4a22c	add x22,x19,#0x28
00b4a230	add x20,x20,#0x864
00b4a234	mov w23,#0x400
00b4a238	ldr x8,[x19, #0x428]
00b4a23c	str xzr,[sp, #0x8]
00b4a240	add x9,x22,x8
00b4a244	str x9,[sp, #0x18]
00b4a248	ldr x9,[x21, #0x18]
00b4a24c	cbz x9,0x00b4a278
00b4a250	ldr x9,[x21, #0x10]
00b4a254	cbz x9,0x00b4a278
00b4a258	sub x2,x23,x8
00b4a25c	add x1,sp,#0x18
00b4a260	add x3,sp,#0x8
00b4a264	mov x0,x21
00b4a268	bl 0x00c3ace0
00b4a26c	cbz w0,0x00b4a298
00b4a270	ldr x9,[sp, #0x8]
00b4a274	ldr x8,[x19, #0x428]
00b4a278	add x8,x8,x9
00b4a27c	add x0,x21,#0x28
00b4a280	mov x1,x20
00b4a284	str x8,[x19, #0x428]
00b4a288	bl 0x00c36530
00b4a28c	mov x21,x0
00b4a290	cbnz x0,0x00b4a238
00b4a294	mov w0,#0x1
00b4a298	ldp x29,x30,[sp, #0x40]
00b4a29c	ldp x20,x19,[sp, #0x30]
00b4a2a0	ldp x22,x21,[sp, #0x20]
00b4a2a4	ldr x23,[sp, #0x10]
00b4a2a8	add sp,sp,#0x50
00b4a2ac	ret
