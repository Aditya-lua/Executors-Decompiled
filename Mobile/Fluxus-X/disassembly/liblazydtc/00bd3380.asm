; FUN_00bd3380 @ 00bd3380
00bd3380	paciasp
00bd3384	sub sp,sp,#0x30
00bd3388	stp x29,x30,[sp, #0x10]
00bd338c	stp x20,x19,[sp, #0x20]
00bd3390	add x29,sp,#0x10
00bd3394	mov x19,x0
00bd3398	mov x20,x1
00bd339c	add x0,sp,#0x8
00bd33a0	mov x1,x19
00bd33a4	mov w2,wzr
00bd33a8	stur wzr,[x29, #-0x4]
00bd33ac	bl 0x00c44060
00bd33b0	ldrb w8,[sp, #0x8]
00bd33b4	cmp w8,#0x1
00bd33b8	b.ne 0x00bd342c
00bd33bc	ldr x8,[x19]
00bd33c0	ldur x9,[x8, #-0x18]
00bd33c4	mov x8,sp
00bd33c8	add x0,x19,x9
00bd33cc	bl 0x00c30070
00bd33d0	adrp x1,0xcb5000
00bd33d4	mov x0,sp
00bd33d8	ldr x1,[x1, #0xba0]
00bd33dc	bl 0x00c30080
00bd33e0	ldr x8,[x19]
00bd33e4	ldr x9,[x0]
00bd33e8	ldur x8,[x8, #-0x18]
00bd33ec	add x3,x19,x8
00bd33f0	ldr x8,[x9, #0x18]
00bd33f4	ldr x1,[x3, #0x28]
00bd33f8	sub x4,x29,#0x4
00bd33fc	mov x2,xzr
00bd3400	mov x5,x20
00bd3404	blr x8
00bd3408	mov x0,sp
00bd340c	bl 0x00c30090
00bd3410	ldr x8,[x19]
00bd3414	ldur x8,[x8, #-0x18]
00bd3418	add x0,x19,x8
00bd341c	ldur w8,[x29, #-0x4]
00bd3420	ldr w9,[x0, #0x20]
00bd3424	orr w1,w9,w8
00bd3428	bl 0x00c30130
00bd342c	mov x0,x19
00bd3430	ldp x20,x19,[sp, #0x20]
00bd3434	ldp x29,x30,[sp, #0x10]
00bd3438	add sp,sp,#0x30
00bd343c	autiasp
00bd3440	ret
