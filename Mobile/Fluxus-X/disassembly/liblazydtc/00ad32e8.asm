; FUN_00ad32e8 @ 00ad32e8
00ad32e8	sub sp,sp,#0x70
00ad32ec	stp x28,x27,[sp, #0x10]
00ad32f0	stp x26,x25,[sp, #0x20]
00ad32f4	stp x24,x23,[sp, #0x30]
00ad32f8	stp x22,x21,[sp, #0x40]
00ad32fc	stp x20,x19,[sp, #0x50]
00ad3300	stp x29,x30,[sp, #0x60]
00ad3304	ldr x8,[x3, #0x28]
00ad3308	mov w26,w0
00ad330c	add x29,sp,#0x60
00ad3310	mov w28,w4
00ad3314	mov x0,x8
00ad3318	mov x23,x3
00ad331c	mov x22,x2
00ad3320	mov x27,x1
00ad3324	bl 0x00c322f0
00ad3328	cmp w0,#0x4, LSL #12
00ad332c	b.le 0x00ad3358
00ad3330	bl 0x00c342a0
00ad3334	adrp x0,0x2b8000
00ad3338	adrp x2,0x2bc000
00ad333c	add x0,x0,#0x60f
00ad3340	add x2,x2,#0x3fb
00ad3344	mov w1,#0x53
00ad3348	bl 0x00c342b0
00ad334c	mov w0,#0x4
00ad3350	mov w1,#0x69
00ad3354	b 0x00ad3474
00ad3358	ldp x0,x1,[x23, #0x28]
00ad335c	bl 0x00c369c0
00ad3360	cmp w0,#0x0
00ad3364	b.le 0x00ad3450
00ad3368	ldr x0,[x23, #0x28]
00ad336c	bl 0x00c322f0
00ad3370	cmp w0,#0xc01
00ad3374	b.lt 0x00ad33a4
00ad3378	ldr x0,[x23, #0x30]
00ad337c	bl 0x00c322f0
00ad3380	cmp w0,#0x41
00ad3384	b.lt 0x00ad33a4
00ad3388	bl 0x00c342a0
00ad338c	adrp x0,0x2b8000
00ad3390	adrp x2,0x2bc000
00ad3394	add x0,x0,#0x60f
00ad3398	add x2,x2,#0x3fb
00ad339c	mov w1,#0x5f
00ad33a0	b 0x00ad3468
00ad33a4	ldr x0,[x23, #0x8]
00ad33a8	bl 0x00c38a60
00ad33ac	mov x19,x0
00ad33b0	cbz x0,0x00ad3484
00ad33b4	mov x0,x19
00ad33b8	bl 0x00c38a90
00ad33bc	mov x0,x19
00ad33c0	bl 0x00c38a40
00ad33c4	mov x25,x0
00ad33c8	mov x0,x19
00ad33cc	bl 0x00c38a40
00ad33d0	ldr x8,[x23, #0x28]
00ad33d4	mov x24,x0
00ad33d8	mov x0,x8
00ad33dc	bl 0x00c322f0
00ad33e0	add w8,w0,#0x7
00ad33e4	add w9,w0,#0xe
00ad33e8	cmp w8,#0x0
00ad33ec	csel w8,w9,w8,lt
00ad33f0	adrp x1,0x2b8000
00ad33f4	sbfx x0,x8,#0x3,#0x1d
00ad33f8	add x1,x1,#0x60f
00ad33fc	mov w2,#0x6a
00ad3400	asr w20,w8,#0x3
00ad3404	bl 0x00c32320
00ad3408	mov x21,x0
00ad340c	cbz x24,0x00ad3490
00ad3410	cbz x21,0x00ad3490
00ad3414	cmp w28,#0x4
00ad3418	b.eq 0x00ad34bc
00ad341c	cmp w28,#0x3
00ad3420	b.eq 0x00ad34f0
00ad3424	cmp w28,#0x1
00ad3428	b.ne 0x00ad3558
00ad342c	ldr x0,[x23, #0x8]
00ad3430	mov x1,x21
00ad3434	mov w2,w20
00ad3438	mov x3,x27
00ad343c	mov w4,w26
00ad3440	bl 0x00c3ffb0
00ad3444	cmp w0,#0x1
00ad3448	b.ge 0x00ad350c
00ad344c	b 0x00ad3584
00ad3450	bl 0x00c342a0
00ad3454	adrp x0,0x2b8000
00ad3458	adrp x2,0x2bc000
00ad345c	add x0,x0,#0x60f
00ad3460	add x2,x2,#0x3fb
00ad3464	mov w1,#0x58
00ad3468	bl 0x00c342b0
00ad346c	mov w0,#0x4
00ad3470	mov w1,#0x65
00ad3474	mov x2,xzr
00ad3478	bl 0x00c342c0
00ad347c	mov w22,#0xffffffff
00ad3480	b 0x00ad35b0
00ad3484	mov w20,wzr
00ad3488	mov x21,xzr
00ad348c	b 0x00ad3584
00ad3490	bl 0x00c342a0
00ad3494	adrp x0,0x2b8000
00ad3498	adrp x2,0x2bc000
00ad349c	add x0,x0,#0x60f
00ad34a0	add x2,x2,#0x3fb
00ad34a4	mov w1,#0x6c
00ad34a8	bl 0x00c342b0
00ad34ac	mov w1,#0x100
00ad34b0	mov w0,#0x4
00ad34b4	movk w1,#0xc, LSL #16
00ad34b8	b 0x00ad357c
00ad34bc	ldr x0,[x23, #0x8]
00ad34c0	mov x1,x21
00ad34c4	mov w2,w20
00ad34c8	mov x3,x27
00ad34cc	mov w4,w26
00ad34d0	mov x5,xzr
00ad34d4	mov w6,wzr
00ad34d8	mov x7,xzr
00ad34dc	str xzr,[sp]
00ad34e0	bl 0x00c3ff50
00ad34e4	cmp w0,#0x1
00ad34e8	b.ge 0x00ad350c
00ad34ec	b 0x00ad3584
00ad34f0	mov x0,x21
00ad34f4	mov w1,w20
00ad34f8	mov x2,x27
00ad34fc	mov w3,w26
00ad3500	bl 0x00c3ff00
00ad3504	cmp w0,#0x1
00ad3508	b.lt 0x00ad3584
00ad350c	mov x0,x21
00ad3510	mov w1,w20
00ad3514	mov x2,x25
00ad3518	bl 0x00c36970
00ad351c	cbz x0,0x00ad3584
00ad3520	ldr x1,[x23, #0x28]
00ad3524	mov x0,x25
00ad3528	bl 0x00c369c0
00ad352c	tbnz w0,#0x1f,0x00ad35d4
00ad3530	bl 0x00c342a0
00ad3534	adrp x0,0x2b8000
00ad3538	adrp x2,0x2bc000
00ad353c	add x0,x0,#0x60f
00ad3540	add x2,x2,#0x3fb
00ad3544	mov w1,#0x89
00ad3548	bl 0x00c342b0
00ad354c	mov w0,#0x4
00ad3550	mov w1,#0x84
00ad3554	b 0x00ad357c
00ad3558	bl 0x00c342a0
00ad355c	adrp x0,0x2b8000
00ad3560	adrp x2,0x2bc000
00ad3564	add x0,x0,#0x60f
00ad3568	add x2,x2,#0x3fb
00ad356c	orr w1,wzr,#0x7e
00ad3570	bl 0x00c342b0
00ad3574	mov w0,#0x4
00ad3578	mov w1,#0x76
00ad357c	mov x2,xzr
00ad3580	bl 0x00c342c0
00ad3584	mov w22,#0xffffffff
00ad3588	mov x0,x19
00ad358c	bl 0x00c38a20
00ad3590	mov x0,x19
00ad3594	bl 0x00c38a30
00ad3598	adrp x2,0x2b8000
00ad359c	sxtw x1,w20
00ad35a0	add x2,x2,#0x60f
00ad35a4	mov w3,#0x9e
00ad35a8	mov x0,x21
00ad35ac	bl 0x00c345e0
00ad35b0	mov w0,w22
00ad35b4	ldp x29,x30,[sp, #0x60]
00ad35b8	ldp x20,x19,[sp, #0x50]
00ad35bc	ldp x22,x21,[sp, #0x40]
00ad35c0	ldp x24,x23,[sp, #0x30]
00ad35c4	ldp x26,x25,[sp, #0x20]
00ad35c8	ldp x28,x27,[sp, #0x10]
00ad35cc	add sp,sp,#0x70
00ad35d0	ret
00ad35d4	ldrb w8,[x23, #0xa4]
00ad35d8	tbz w8,#0x1,0x00ad35f4
00ad35dc	ldr x1,[x23, #0xd0]
00ad35e0	ldr x2,[x23, #0x28]
00ad35e4	add x0,x23,#0xa8
00ad35e8	mov x3,x19
00ad35ec	bl 0x00c38fa0
00ad35f0	cbz x0,0x00ad3584
00ad35f4	ldr x8,[x23, #0x18]
00ad35f8	ldp x3,x2,[x23, #0x28]
00ad35fc	ldr x5,[x23, #0xa8]
00ad3600	mov x0,x24
00ad3604	ldr x8,[x8, #0x30]
00ad3608	mov x1,x25
00ad360c	mov x4,x19
00ad3610	blr x8
00ad3614	cbz w0,0x00ad3584
00ad3618	mov x0,x24
00ad361c	mov x1,x22
00ad3620	mov w2,w20
00ad3624	bl 0x00c38c70
00ad3628	mov w22,w0
00ad362c	b 0x00ad3588
