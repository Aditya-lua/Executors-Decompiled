; FUN_00b1d214 @ 00b1d214
00b1d214	sub sp,sp,#0x60
00b1d218	stp x25,xzr,[sp, #0x10]
00b1d21c	stp x24,x23,[sp, #0x20]
00b1d220	stp x22,x21,[sp, #0x30]
00b1d224	stp x20,x19,[sp, #0x40]
00b1d228	stp x29,x30,[sp, #0x50]
00b1d22c	ldr x8,[x1]
00b1d230	mov w22,w5
00b1d234	mov x23,x4
00b1d238	mov x25,x3
00b1d23c	mov x21,x2
00b1d240	mov x20,x1
00b1d244	mov x19,x0
00b1d248	add x29,sp,#0x50
00b1d24c	str x8,[sp, #0x8]
00b1d250	cbnz x3,0x00b1d260
00b1d254	cbnz x23,0x00b1d260
00b1d258	mov x0,xzr
00b1d25c	cbz w22,0x00b1d2d8
00b1d260	adrp x1,0x2bc000
00b1d264	add x1,x1,#0x79f
00b1d268	orr w0,wzr,#0x30
00b1d26c	mov w2,#0x1f5
00b1d270	bl 0x00c34250
00b1d274	str x0,[sp, #0x18]
00b1d278	cbz x0,0x00b1d340
00b1d27c	mov x24,x0
00b1d280	ldr x0,[x0, #0x20]
00b1d284	adrp x1,0x2bc000
00b1d288	add x1,x1,#0x79f
00b1d28c	mov w2,#0x34
00b1d290	str x25,[x24, #0x18]
00b1d294	bl 0x00c32310
00b1d298	str xzr,[x24, #0x20]
00b1d29c	cbz x23,0x00b1d2bc
00b1d2a0	adrp x1,0x2bc000
00b1d2a4	add x1,x1,#0x79f
00b1d2a8	mov w2,#0x37
00b1d2ac	mov x0,x23
00b1d2b0	bl 0x00c34600
00b1d2b4	str x0,[x24, #0x20]
00b1d2b8	cbz x0,0x00b1d338
00b1d2bc	ldrb w8,[x24, #0x28]
00b1d2c0	cmp w22,#0x0
00b1d2c4	cset w9,ne
00b1d2c8	add x0,sp,#0x18
00b1d2cc	and w8,w8,#0xfe
00b1d2d0	orr w8,w8,w9
00b1d2d4	strb w8,[x24, #0x28]
00b1d2d8	adrp x3,0xc82000
00b1d2dc	add x3,x3,#0x640
00b1d2e0	add x1,sp,#0x8
00b1d2e4	mov x2,x21
00b1d2e8	bl 0x00c36150
00b1d2ec	cbz x0,0x00b1d338
00b1d2f0	mov x22,x0
00b1d2f4	bl 0x00b1d11c
00b1d2f8	cbz x0,0x00b1d3ac
00b1d2fc	mov x21,x0
00b1d300	bl 0x00c34730
00b1d304	cbz w0,0x00b1d378
00b1d308	adrp x1,0xc82000
00b1d30c	add x1,x1,#0x640
00b1d310	mov x0,x22
00b1d314	bl 0x00c36160
00b1d318	ldr x8,[sp, #0x8]
00b1d31c	str xzr,[sp, #0x18]
00b1d320	str x8,[x20]
00b1d324	cbz x19,0x00b1d3c4
00b1d328	ldr x0,[x19]
00b1d32c	bl 0x00c32450
00b1d330	str x21,[x19]
00b1d334	b 0x00b1d3c4
00b1d338	mov x21,xzr
00b1d33c	b 0x00b1d3c4
00b1d340	bl 0x00c342a0
00b1d344	adrp x0,0x2bc000
00b1d348	adrp x2,0x2ca000
00b1d34c	add x0,x0,#0x79f
00b1d350	add x2,x2,#0x6fc
00b1d354	mov w1,#0x1f7
00b1d358	bl 0x00c342b0
00b1d35c	mov w1,#0x100
00b1d360	mov w0,#0xb
00b1d364	movk w1,#0xc, LSL #16
00b1d368	mov x2,xzr
00b1d36c	bl 0x00c342c0
00b1d370	mov x21,xzr
00b1d374	b 0x00b1d3d4
00b1d378	bl 0x00c342a0
00b1d37c	adrp x0,0x2bc000
00b1d380	adrp x2,0x2ce000
00b1d384	add x0,x0,#0x79f
00b1d388	add x2,x2,#0x5f4
00b1d38c	mov w1,#0x1d6
00b1d390	bl 0x00c342b0
00b1d394	mov w8,#0x100
00b1d398	movk w8,#0xc, LSL #16
00b1d39c	add w1,w8,#0x3
00b1d3a0	mov w0,#0xb
00b1d3a4	mov x2,xzr
00b1d3a8	bl 0x00c342c0
00b1d3ac	adrp x1,0xc82000
00b1d3b0	add x1,x1,#0x640
00b1d3b4	mov x0,x22
00b1d3b8	bl 0x00c36160
00b1d3bc	mov x21,xzr
00b1d3c0	str xzr,[sp, #0x18]
00b1d3c4	ldr x0,[sp, #0x18]
00b1d3c8	adrp x1,0xc82000
00b1d3cc	add x1,x1,#0x640
00b1d3d0	bl 0x00c36160
00b1d3d4	mov x0,x21
00b1d3d8	ldp x29,x30,[sp, #0x50]
00b1d3dc	ldp x20,x19,[sp, #0x40]
00b1d3e0	ldp x22,x21,[sp, #0x30]
00b1d3e4	ldp x24,x23,[sp, #0x20]
00b1d3e8	ldr x25,[sp, #0x10]
00b1d3ec	add sp,sp,#0x60
00b1d3f0	ret
