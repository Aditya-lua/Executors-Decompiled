; FUN_00b5d2a0 @ 00b5d2a0
00b5d2a0	sub sp,sp,#0x190
00b5d2a4	stp x29,x30,[sp, #0x180]
00b5d2a8	add x29,sp,#0x180
00b5d2ac	str x28,[sp, #0x150]
00b5d2b0	stp x22,x21,[sp, #0x160]
00b5d2b4	stp x20,x19,[sp, #0x170]
00b5d2b8	stur xzr,[x29, #-0x28]
00b5d2bc	cbz x0,0x00b5d3b0
00b5d2c0	mov x20,x1
00b5d2c4	cbz x1,0x00b5d3ac
00b5d2c8	adrp x1,0x29d000
00b5d2cc	mov x19,x0
00b5d2d0	add x1,x1,#0xe2e
00b5d2d4	mov x0,x20
00b5d2d8	bl 0x00c36530
00b5d2dc	cbz x0,0x00b5d36c
00b5d2e0	mov x21,x0
00b5d2e4	movi v0.2D,#0x0
00b5d2e8	sub x8,x29,#0x68
00b5d2ec	add x0,sp,#0x10
00b5d2f0	mov w2,#0x100
00b5d2f4	mov w1,wzr
00b5d2f8	sturh wzr,[x29, #-0x38]
00b5d2fc	stur q0,[x29, #-0x48]
00b5d300	stur q0,[x29, #-0x58]
00b5d304	stur q0,[x29, #-0x68]
00b5d308	stur x8,[x29, #-0x70]
00b5d30c	add x22,sp,#0x10
00b5d310	bl 0x00c301c0
00b5d314	adrp x1,0x2d3000
00b5d318	add x1,x1,#0x7c2
00b5d31c	mov x0,x20
00b5d320	str x22,[sp, #0x8]
00b5d324	bl 0x00c36530
00b5d328	mov x22,x0
00b5d32c	sub x1,x29,#0x70
00b5d330	mov w2,#0x32
00b5d334	mov x0,x21
00b5d338	bl 0x00c3b720
00b5d33c	cbz w0,0x00b5d3b0
00b5d340	cbz x22,0x00b5d358
00b5d344	add x1,sp,#0x8
00b5d348	mov w2,#0x100
00b5d34c	mov x0,x22
00b5d350	bl 0x00c3b720
00b5d354	cbz w0,0x00b5d3b0
00b5d358	sub x1,x29,#0x68
00b5d35c	add x2,sp,#0x10
00b5d360	mov x0,x19
00b5d364	bl 0x00b5d5b4
00b5d368	cbz w0,0x00b5d3b0
00b5d36c	adrp x1,0x2d2000
00b5d370	add x1,x1,#0x8a9
00b5d374	mov x0,x20
00b5d378	bl 0x00c36530
00b5d37c	cbz x0,0x00b5d3ac
00b5d380	sub x1,x29,#0x28
00b5d384	bl 0x00c3e920
00b5d388	cbz w0,0x00b5d3b0
00b5d38c	ldrb w9,[x19, #0x4a]
00b5d390	ldur x8,[x29, #-0x28]
00b5d394	tbnz w9,#0x0,0x00b5d3a8
00b5d398	ldr x9,[x19, #0x160]
00b5d39c	mov w0,wzr
00b5d3a0	cmp x8,x9
00b5d3a4	b.ne 0x00b5d3b0
00b5d3a8	str x8,[x19, #0x160]
00b5d3ac	mov w0,#0x1
00b5d3b0	ldp x29,x30,[sp, #0x180]
00b5d3b4	ldp x20,x19,[sp, #0x170]
00b5d3b8	ldp x22,x21,[sp, #0x160]
00b5d3bc	ldr x28,[sp, #0x150]
00b5d3c0	add sp,sp,#0x190
00b5d3c4	ret
