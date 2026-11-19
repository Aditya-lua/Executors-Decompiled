; FUN_00bd34bc @ 00bd34bc
00bd34bc	paciasp
00bd34c0	sub sp,sp,#0x40
00bd34c4	stp x29,x30,[sp, #0x20]
00bd34c8	stp x20,x19,[sp, #0x30]
00bd34cc	add x29,sp,#0x20
00bd34d0	mov x19,x0
00bd34d4	mov x20,x1
00bd34d8	sub x0,x29,#0x8
00bd34dc	mov x1,x19
00bd34e0	mov w2,wzr
00bd34e4	stur wzr,[x29, #-0x4]
00bd34e8	bl 0x00c44060
00bd34ec	ldurb w8,[x29, #-0x8]
00bd34f0	cmp w8,#0x1
00bd34f4	b.ne 0x00bd35a8
00bd34f8	ldr x8,[x19]
00bd34fc	ldur x9,[x8, #-0x18]
00bd3500	add x8,sp,#0x8
00bd3504	add x0,x19,x9
00bd3508	bl 0x00c30070
00bd350c	adrp x1,0xcb5000
00bd3510	add x0,sp,#0x8
00bd3514	ldr x1,[x1, #0xba0]
00bd3518	bl 0x00c30080
00bd351c	ldr x8,[x19]
00bd3520	ldr x9,[x0]
00bd3524	ldur x8,[x8, #-0x18]
00bd3528	add x3,x19,x8
00bd352c	ldr x8,[x9, #0x20]
00bd3530	ldr x1,[x3, #0x28]
00bd3534	sub x4,x29,#0x4
00bd3538	add x5,sp,#0x10
00bd353c	mov x2,xzr
00bd3540	blr x8
00bd3544	add x0,sp,#0x8
00bd3548	bl 0x00c30090
00bd354c	ldr x8,[sp, #0x10]
00bd3550	mov x9,#-0x8001
00bd3554	cmp x8,x9
00bd3558	b.gt 0x00bd3568
00bd355c	ldur w8,[x29, #-0x4]
00bd3560	mov w9,#0x8000
00bd3564	b 0x00bd3578
00bd3568	cmp x8,#0x8, LSL #12
00bd356c	b.lt 0x00bd3588
00bd3570	ldur w8,[x29, #-0x4]
00bd3574	mov w9,#0x7fff
00bd3578	orr w8,w8,#0x4
00bd357c	stur w8,[x29, #-0x4]
00bd3580	strh w9,[x20]
00bd3584	b 0x00bd358c
00bd3588	strh w8,[x20]
00bd358c	ldr x8,[x19]
00bd3590	ldur x8,[x8, #-0x18]
00bd3594	add x0,x19,x8
00bd3598	ldur w8,[x29, #-0x4]
00bd359c	ldr w9,[x0, #0x20]
00bd35a0	orr w1,w9,w8
00bd35a4	bl 0x00c30130
00bd35a8	mov x0,x19
00bd35ac	ldp x20,x19,[sp, #0x30]
00bd35b0	ldp x29,x30,[sp, #0x20]
00bd35b4	add sp,sp,#0x40
00bd35b8	autiasp
00bd35bc	ret
