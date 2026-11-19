; FUN_00bcf4f8 @ 00bcf4f8
00bcf4f8	paciasp
00bcf4fc	sub sp,sp,#0x30
00bcf500	stp x29,x30,[sp, #0x10]
00bcf504	stp x20,x19,[sp, #0x20]
00bcf508	add x29,sp,#0x10
00bcf50c	mov x19,x0
00bcf510	mov x20,x1
00bcf514	add x0,sp,#0x8
00bcf518	mov x1,x19
00bcf51c	mov w2,wzr
00bcf520	stur wzr,[x29, #-0x4]
00bcf524	bl 0x00c30140
00bcf528	ldrb w8,[sp, #0x8]
00bcf52c	cmp w8,#0x1
00bcf530	b.ne 0x00bcf5a4
00bcf534	ldr x8,[x19]
00bcf538	ldur x9,[x8, #-0x18]
00bcf53c	mov x8,sp
00bcf540	add x0,x19,x9
00bcf544	bl 0x00c30070
00bcf548	adrp x1,0xcb4000
00bcf54c	mov x0,sp
00bcf550	ldr x1,[x1, #0xf38]
00bcf554	bl 0x00c30080
00bcf558	ldr x8,[x19]
00bcf55c	ldr x9,[x0]
00bcf560	ldur x8,[x8, #-0x18]
00bcf564	add x3,x19,x8
00bcf568	ldr x8,[x9, #0x38]
00bcf56c	ldr x1,[x3, #0x28]
00bcf570	sub x4,x29,#0x4
00bcf574	mov x2,xzr
00bcf578	mov x5,x20
00bcf57c	blr x8
00bcf580	mov x0,sp
00bcf584	bl 0x00c30090
00bcf588	ldr x8,[x19]
00bcf58c	ldur x8,[x8, #-0x18]
00bcf590	add x0,x19,x8
00bcf594	ldur w8,[x29, #-0x4]
00bcf598	ldr w9,[x0, #0x20]
00bcf59c	orr w1,w9,w8
00bcf5a0	bl 0x00c30130
00bcf5a4	mov x0,x19
00bcf5a8	ldp x20,x19,[sp, #0x20]
00bcf5ac	ldp x29,x30,[sp, #0x10]
00bcf5b0	add sp,sp,#0x30
00bcf5b4	autiasp
00bcf5b8	ret
