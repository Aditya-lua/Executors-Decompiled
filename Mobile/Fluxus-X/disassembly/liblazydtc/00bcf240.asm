; FUN_00bcf240 @ 00bcf240
00bcf240	paciasp
00bcf244	sub sp,sp,#0x40
00bcf248	stp x29,x30,[sp, #0x20]
00bcf24c	stp x20,x19,[sp, #0x30]
00bcf250	add x29,sp,#0x20
00bcf254	mov x19,x0
00bcf258	mov x20,x1
00bcf25c	sub x0,x29,#0x8
00bcf260	mov x1,x19
00bcf264	mov w2,wzr
00bcf268	stur wzr,[x29, #-0x4]
00bcf26c	bl 0x00c30140
00bcf270	ldurb w8,[x29, #-0x8]
00bcf274	cmp w8,#0x1
00bcf278	b.ne 0x00bcf32c
00bcf27c	ldr x8,[x19]
00bcf280	ldur x9,[x8, #-0x18]
00bcf284	add x8,sp,#0x8
00bcf288	add x0,x19,x9
00bcf28c	bl 0x00c30070
00bcf290	adrp x1,0xcb4000
00bcf294	add x0,sp,#0x8
00bcf298	ldr x1,[x1, #0xf38]
00bcf29c	bl 0x00c30080
00bcf2a0	ldr x8,[x19]
00bcf2a4	ldr x9,[x0]
00bcf2a8	ldur x8,[x8, #-0x18]
00bcf2ac	add x3,x19,x8
00bcf2b0	ldr x8,[x9, #0x20]
00bcf2b4	ldr x1,[x3, #0x28]
00bcf2b8	sub x4,x29,#0x4
00bcf2bc	add x5,sp,#0x10
00bcf2c0	mov x2,xzr
00bcf2c4	blr x8
00bcf2c8	add x0,sp,#0x8
00bcf2cc	bl 0x00c30090
00bcf2d0	ldr x8,[sp, #0x10]
00bcf2d4	mov x9,#-0x8001
00bcf2d8	cmp x8,x9
00bcf2dc	b.gt 0x00bcf2ec
00bcf2e0	ldur w8,[x29, #-0x4]
00bcf2e4	mov w9,#0x8000
00bcf2e8	b 0x00bcf2fc
00bcf2ec	cmp x8,#0x8, LSL #12
00bcf2f0	b.lt 0x00bcf30c
00bcf2f4	ldur w8,[x29, #-0x4]
00bcf2f8	mov w9,#0x7fff
00bcf2fc	orr w8,w8,#0x4
00bcf300	stur w8,[x29, #-0x4]
00bcf304	strh w9,[x20]
00bcf308	b 0x00bcf310
00bcf30c	strh w8,[x20]
00bcf310	ldr x8,[x19]
00bcf314	ldur x8,[x8, #-0x18]
00bcf318	add x0,x19,x8
00bcf31c	ldur w8,[x29, #-0x4]
00bcf320	ldr w9,[x0, #0x20]
00bcf324	orr w1,w9,w8
00bcf328	bl 0x00c30130
00bcf32c	mov x0,x19
00bcf330	ldp x20,x19,[sp, #0x30]
00bcf334	ldp x29,x30,[sp, #0x20]
00bcf338	add sp,sp,#0x40
00bcf33c	autiasp
00bcf340	ret
