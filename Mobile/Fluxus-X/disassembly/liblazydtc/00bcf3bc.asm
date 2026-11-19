; FUN_00bcf3bc @ 00bcf3bc
00bcf3bc	paciasp
00bcf3c0	sub sp,sp,#0x30
00bcf3c4	stp x29,x30,[sp, #0x10]
00bcf3c8	stp x20,x19,[sp, #0x20]
00bcf3cc	add x29,sp,#0x10
00bcf3d0	mov x19,x0
00bcf3d4	mov x20,x1
00bcf3d8	add x0,sp,#0x8
00bcf3dc	mov x1,x19
00bcf3e0	mov w2,wzr
00bcf3e4	stur wzr,[x29, #-0x4]
00bcf3e8	bl 0x00c30140
00bcf3ec	ldrb w8,[sp, #0x8]
00bcf3f0	cmp w8,#0x1
00bcf3f4	b.ne 0x00bcf468
00bcf3f8	ldr x8,[x19]
00bcf3fc	ldur x9,[x8, #-0x18]
00bcf400	mov x8,sp
00bcf404	add x0,x19,x9
00bcf408	bl 0x00c30070
00bcf40c	adrp x1,0xcb4000
00bcf410	mov x0,sp
00bcf414	ldr x1,[x1, #0xf38]
00bcf418	bl 0x00c30080
00bcf41c	ldr x8,[x19]
00bcf420	ldr x9,[x0]
00bcf424	ldur x8,[x8, #-0x18]
00bcf428	add x3,x19,x8
00bcf42c	ldr x8,[x9, #0x30]
00bcf430	ldr x1,[x3, #0x28]
00bcf434	sub x4,x29,#0x4
00bcf438	mov x2,xzr
00bcf43c	mov x5,x20
00bcf440	blr x8
00bcf444	mov x0,sp
00bcf448	bl 0x00c30090
00bcf44c	ldr x8,[x19]
00bcf450	ldur x8,[x8, #-0x18]
00bcf454	add x0,x19,x8
00bcf458	ldur w8,[x29, #-0x4]
00bcf45c	ldr w9,[x0, #0x20]
00bcf460	orr w1,w9,w8
00bcf464	bl 0x00c30130
00bcf468	mov x0,x19
00bcf46c	ldp x20,x19,[sp, #0x20]
00bcf470	ldp x29,x30,[sp, #0x10]
00bcf474	add sp,sp,#0x30
00bcf478	autiasp
00bcf47c	ret
