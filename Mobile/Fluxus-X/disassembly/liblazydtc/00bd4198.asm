; FUN_00bd4198 @ 00bd4198
00bd4198	paciasp
00bd419c	sub sp,sp,#0x30
00bd41a0	stp x29,x30,[sp, #0x10]
00bd41a4	stp x20,x19,[sp, #0x20]
00bd41a8	add x29,sp,#0x10
00bd41ac	mov x19,x0
00bd41b0	mov x20,x1
00bd41b4	add x0,sp,#0x8
00bd41b8	mov x1,x19
00bd41bc	mov w2,wzr
00bd41c0	stur wzr,[x29, #-0x4]
00bd41c4	bl 0x00c44060
00bd41c8	ldrb w8,[sp, #0x8]
00bd41cc	cmp w8,#0x1
00bd41d0	b.ne 0x00bd4244
00bd41d4	ldr x8,[x19]
00bd41d8	ldur x9,[x8, #-0x18]
00bd41dc	mov x8,sp
00bd41e0	add x0,x19,x9
00bd41e4	bl 0x00c30070
00bd41e8	adrp x1,0xcb5000
00bd41ec	mov x0,sp
00bd41f0	ldr x1,[x1, #0xba0]
00bd41f4	bl 0x00c30080
00bd41f8	ldr x8,[x19]
00bd41fc	ldr x9,[x0]
00bd4200	ldur x8,[x8, #-0x18]
00bd4204	add x3,x19,x8
00bd4208	ldr x8,[x9, #0x60]
00bd420c	ldr x1,[x3, #0x28]
00bd4210	sub x4,x29,#0x4
00bd4214	mov x2,xzr
00bd4218	mov x5,x20
00bd421c	blr x8
00bd4220	mov x0,sp
00bd4224	bl 0x00c30090
00bd4228	ldr x8,[x19]
00bd422c	ldur x8,[x8, #-0x18]
00bd4230	add x0,x19,x8
00bd4234	ldur w8,[x29, #-0x4]
00bd4238	ldr w9,[x0, #0x20]
00bd423c	orr w1,w9,w8
00bd4240	bl 0x00c30130
00bd4244	mov x0,x19
00bd4248	ldp x20,x19,[sp, #0x20]
00bd424c	ldp x29,x30,[sp, #0x10]
00bd4250	add sp,sp,#0x30
00bd4254	autiasp
00bd4258	ret
