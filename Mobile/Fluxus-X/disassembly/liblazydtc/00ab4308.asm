; PEM_X509_INFO_write_bio @ 00ab4308
00ab4308	stp x28,x27,[sp, #-0x60]!
00ab430c	stp x26,x25,[sp, #0x10]
00ab4310	stp x24,x23,[sp, #0x20]
00ab4314	stp x22,x21,[sp, #0x30]
00ab4318	stp x20,x19,[sp, #0x40]
00ab431c	stp x29,x30,[sp, #0x50]
00ab4320	add x29,sp,#0x50
00ab4324	sub sp,sp,#0x410
00ab4328	mov x22,x6
00ab432c	mov x23,x5
00ab4330	mov w24,w4
00ab4334	mov x25,x3
00ab4338	mov x21,x2
00ab433c	mov x20,x1
00ab4340	mov x19,x0
00ab4344	cbz x2,0x00ab43ac
00ab4348	mov x0,x21
00ab434c	bl 0x00c3cef0
00ab4350	cbz x0,0x00ab4378
00ab4354	bl 0x00c2ff50
00ab4358	mov x26,x0
00ab435c	mov x0,x21
00ab4360	bl 0x00c34bc0
00ab4364	lsl w8,w0,#0x1
00ab4368	add x8,x26,w8, SXTW 
00ab436c	add x8,x8,#0x24
00ab4370	cmp x8,#0x401
00ab4374	b.cc 0x00ab43ac
00ab4378	bl 0x00c342a0
00ab437c	adrp x0,0x2c6000
00ab4380	adrp x2,0x2ba000
00ab4384	add x0,x0,#0xa6
00ab4388	add x2,x2,#0x5de
00ab438c	mov w1,#0xf3
00ab4390	bl 0x00c342b0
00ab4394	mov w0,#0x9
00ab4398	mov w1,#0x71
00ab439c	mov x2,xzr
00ab43a0	bl 0x00c342c0
00ab43a4	mov w19,wzr
00ab43a8	b 0x00ab4480
00ab43ac	ldr x8,[x20, #0x10]
00ab43b0	cbz x8,0x00ab4464
00ab43b4	ldr x26,[x20, #0x38]
00ab43b8	cbz x26,0x00ab4434
00ab43bc	ldrsw x27,[x20, #0x30]
00ab43c0	cmp w27,#0x1
00ab43c4	b.lt 0x00ab4434
00ab43c8	cbz x21,0x00ab44b0
00ab43cc	ldr x0,[x20, #0x18]
00ab43d0	bl 0x00c3cef0
00ab43d4	cbz x0,0x00ab44d8
00ab43d8	mov x22,x0
00ab43dc	add x0,sp,#0x8
00ab43e0	mov w1,#0xa
00ab43e4	add x23,x20,#0x20
00ab43e8	strb wzr,[sp, #0x8]
00ab43ec	bl 0x00c3f1c0
00ab43f0	mov x0,x21
00ab43f4	bl 0x00c34bc0
00ab43f8	mov w2,w0
00ab43fc	add x0,sp,#0x8
00ab4400	mov x1,x22
00ab4404	mov x3,x23
00ab4408	bl 0x00c3f190
00ab440c	adrp x1,0x2b4000
00ab4410	add x1,x1,#0x80d
00ab4414	add x2,sp,#0x8
00ab4418	mov x0,x19
00ab441c	mov x3,x26
00ab4420	mov x4,x27
00ab4424	bl 0x00c3f1d0
00ab4428	cmp w0,#0x1
00ab442c	b.ge 0x00ab4464
00ab4430	b 0x00ab43a4
00ab4434	ldr x0,[x8, #0x18]
00ab4438	bl 0x00c3d8d0
00ab443c	mov x1,x0
00ab4440	mov x0,x19
00ab4444	mov x2,x21
00ab4448	mov x3,x25
00ab444c	mov w4,w24
00ab4450	mov x5,x23
00ab4454	mov x6,x22
00ab4458	bl 0x00c3f160
00ab445c	cmp w0,#0x1
00ab4460	b.lt 0x00ab43a4
00ab4464	ldr x1,[x20]
00ab4468	cbz x1,0x00ab447c
00ab446c	mov x0,x19
00ab4470	bl 0x00c32660
00ab4474	cmp w0,#0x1
00ab4478	b.lt 0x00ab43a4
00ab447c	mov w19,#0x1
00ab4480	add x0,sp,#0x8
00ab4484	mov w1,#0x400
00ab4488	bl 0x00c34750
00ab448c	mov w0,w19
00ab4490	add sp,sp,#0x410
00ab4494	ldp x29,x30,[sp, #0x50]
00ab4498	ldp x20,x19,[sp, #0x40]
00ab449c	ldp x22,x21,[sp, #0x30]
00ab44a0	ldp x24,x23,[sp, #0x20]
00ab44a4	ldp x26,x25,[sp, #0x10]
00ab44a8	ldp x28,x27,[sp], #0x60
00ab44ac	ret
00ab44b0	bl 0x00c342a0
00ab44b4	adrp x0,0x2c6000
00ab44b8	adrp x2,0x2ba000
00ab44bc	add x0,x0,#0xa6
00ab44c0	add x2,x2,#0x5de
00ab44c4	mov w1,#0x100
00ab44c8	bl 0x00c342b0
00ab44cc	mov w0,#0x9
00ab44d0	orr w1,wzr,#0x7f
00ab44d4	b 0x00ab439c
00ab44d8	bl 0x00c342a0
00ab44dc	adrp x0,0x2c6000
00ab44e0	adrp x2,0x2ba000
00ab44e4	add x0,x0,#0xa6
00ab44e8	add x2,x2,#0x5de
00ab44ec	mov w1,#0x110
00ab44f0	b 0x00ab4390
