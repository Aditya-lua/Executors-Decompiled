; X509_REQ_get_extensions @ 00b0c218
00b0c218	sub sp,sp,#0x30
00b0c21c	stp x20,x19,[sp, #0x10]
00b0c220	mov x19,x0
00b0c224	mov x0,xzr
00b0c228	stp x29,x30,[sp, #0x20]
00b0c22c	add x29,sp,#0x20
00b0c230	cbz x19,0x00b0c2c8
00b0c234	adrp x8,0xcc9000
00b0c238	ldr x8,[x8, #0xbd8]
00b0c23c	cbz x8,0x00b0c2c8
00b0c240	ldr w1,[x8]
00b0c244	cbz w1,0x00b0c2c4
00b0c248	add x20,x8,#0x4
00b0c24c	ldr x0,[x19, #0x30]
00b0c250	mov w2,#0xffffffff
00b0c254	bl 0x00c3d100
00b0c258	cmn w0,#0x1
00b0c25c	b.ne 0x00b0c26c
00b0c260	ldr w1,[x20], #0x4
00b0c264	cbnz w1,0x00b0c24c
00b0c268	b 0x00b0c2c4
00b0c26c	mov w1,w0
00b0c270	ldr x0,[x19, #0x30]
00b0c274	bl 0x00c3d0f0
00b0c278	mov w1,wzr
00b0c27c	bl 0x00c3f610
00b0c280	cbz x0,0x00b0c2c4
00b0c284	ldr w9,[x0]
00b0c288	mov x8,x0
00b0c28c	mov x0,xzr
00b0c290	cmp w9,#0x10
00b0c294	b.ne 0x00b0c2c8
00b0c298	ldr x8,[x8, #0x8]
00b0c29c	ldr x9,[x8, #0x8]
00b0c2a0	str x9,[sp, #0x8]
00b0c2a4	ldrsw x19,[x8]
00b0c2a8	bl 0x00c40c70
00b0c2ac	mov x3,x0
00b0c2b0	add x1,sp,#0x8
00b0c2b4	mov x0,xzr
00b0c2b8	mov x2,x19
00b0c2bc	bl 0x00c36150
00b0c2c0	b 0x00b0c2c8
00b0c2c4	bl 0x00c34780
00b0c2c8	ldp x29,x30,[sp, #0x20]
00b0c2cc	ldp x20,x19,[sp, #0x10]
00b0c2d0	add sp,sp,#0x30
00b0c2d4	ret
