; ASN1_verify @ 00ab33c4
00ab33c4	str x27,[sp, #-0x60]!
00ab33c8	stp x26,x25,[sp, #0x10]
00ab33cc	stp x24,x23,[sp, #0x20]
00ab33d0	stp x22,x21,[sp, #0x30]
00ab33d4	stp x20,x19,[sp, #0x40]
00ab33d8	stp x29,x30,[sp, #0x50]
00ab33dc	add x29,sp,#0x50
00ab33e0	mov x20,x4
00ab33e4	mov x22,x3
00ab33e8	mov x21,x2
00ab33ec	mov x24,x1
00ab33f0	mov x23,x0
00ab33f4	bl 0x00c31fa0
00ab33f8	mov x19,x0
00ab33fc	cbz x0,0x00ab3458
00ab3400	ldr x0,[x24]
00ab3404	bl 0x00c37750
00ab3408	bl 0x00c324f0
00ab340c	bl 0x00c35310
00ab3410	cbz x0,0x00ab3534
00ab3414	ldr w8,[x21, #0x4]
00ab3418	mov x25,x0
00ab341c	cmp w8,#0x3
00ab3420	b.ne 0x00ab3484
00ab3424	ldrb w8,[x21, #0x10]
00ab3428	tst w8,#0x7
00ab342c	b.eq 0x00ab3484
00ab3430	bl 0x00c342a0
00ab3434	adrp x0,0x2c8000
00ab3438	adrp x2,0x2da000
00ab343c	add x0,x0,#0x6b
00ab3440	add x2,x2,#0x4e1
00ab3444	mov w1,#0x2f
00ab3448	bl 0x00c342b0
00ab344c	mov w0,#0xd
00ab3450	mov w1,#0xdc
00ab3454	b 0x00ab3588
00ab3458	bl 0x00c342a0
00ab345c	adrp x0,0x2c8000
00ab3460	adrp x2,0x2da000
00ab3464	add x0,x0,#0x6b
00ab3468	add x2,x2,#0x4e1
00ab346c	mov w1,#0x24
00ab3470	bl 0x00c342b0
00ab3474	mov w1,#0x100
00ab3478	mov w0,#0xd
00ab347c	movk w1,#0xc, LSL #16
00ab3480	b 0x00ab3588
00ab3484	mov x0,x22
00ab3488	mov x1,xzr
00ab348c	blr x23
00ab3490	mov w27,w0
00ab3494	cmp w0,#0x0
00ab3498	b.le 0x00ab355c
00ab349c	mov w24,w27
00ab34a0	adrp x1,0x2c8000
00ab34a4	add x1,x1,#0x6b
00ab34a8	orr w2,wzr,#0x38
00ab34ac	mov x0,x24
00ab34b0	bl 0x00c32320
00ab34b4	cbz x0,0x00ab35bc
00ab34b8	mov x26,x0
00ab34bc	str x0,[sp, #0x8]
00ab34c0	add x1,sp,#0x8
00ab34c4	mov x0,x22
00ab34c8	blr x23
00ab34cc	mov x0,x19
00ab34d0	mov x1,x25
00ab34d4	mov x2,xzr
00ab34d8	bl 0x00c31f70
00ab34dc	cbz w0,0x00ab35d8
00ab34e0	sxtw x2,w27
00ab34e4	mov x0,x19
00ab34e8	mov x1,x26
00ab34ec	bl 0x00c31f80
00ab34f0	adrp x2,0x2c8000
00ab34f4	mov w22,w0
00ab34f8	add x2,x2,#0x6b
00ab34fc	mov w3,#0x43
00ab3500	mov x0,x26
00ab3504	mov x1,x24
00ab3508	bl 0x00c345e0
00ab350c	cbz w22,0x00ab35f0
00ab3510	ldr x1,[x21, #0x8]
00ab3514	ldr w2,[x21]
00ab3518	mov x0,x19
00ab351c	mov x3,x20
00ab3520	bl 0x00c3dbc0
00ab3524	cmp w0,#0x0
00ab3528	b.le 0x00ab3628
00ab352c	mov w20,#0x1
00ab3530	b 0x00ab3594
00ab3534	bl 0x00c342a0
00ab3538	adrp x0,0x2c8000
00ab353c	adrp x2,0x2da000
00ab3540	add x0,x0,#0x6b
00ab3544	add x2,x2,#0x4e1
00ab3548	mov w1,#0x2a
00ab354c	bl 0x00c342b0
00ab3550	mov w0,#0xd
00ab3554	mov w1,#0xa1
00ab3558	b 0x00ab3588
00ab355c	bl 0x00c342a0
00ab3560	adrp x0,0x2c8000
00ab3564	adrp x2,0x2da000
00ab3568	add x0,x0,#0x6b
00ab356c	add x2,x2,#0x4e1
00ab3570	mov w1,#0x35
00ab3574	bl 0x00c342b0
00ab3578	mov w8,#0x100
00ab357c	movk w8,#0xc, LSL #16
00ab3580	add w1,w8,#0x3
00ab3584	mov w0,#0xd
00ab3588	mov x2,xzr
00ab358c	bl 0x00c342c0
00ab3590	mov w20,#0xffffffff
00ab3594	mov x0,x19
00ab3598	bl 0x00c31f90
00ab359c	mov w0,w20
00ab35a0	ldp x29,x30,[sp, #0x50]
00ab35a4	ldp x20,x19,[sp, #0x40]
00ab35a8	ldp x22,x21,[sp, #0x30]
00ab35ac	ldp x24,x23,[sp, #0x20]
00ab35b0	ldp x26,x25,[sp, #0x10]
00ab35b4	ldr x27,[sp], #0x60
00ab35b8	ret
00ab35bc	bl 0x00c342a0
00ab35c0	adrp x0,0x2c8000
00ab35c4	adrp x2,0x2da000
00ab35c8	add x0,x0,#0x6b
00ab35cc	add x2,x2,#0x4e1
00ab35d0	mov w1,#0x3a
00ab35d4	b 0x00ab3470
00ab35d8	adrp x2,0x2c8000
00ab35dc	add x2,x2,#0x6b
00ab35e0	mov w3,#0x43
00ab35e4	mov x0,x26
00ab35e8	mov x1,x24
00ab35ec	bl 0x00c345e0
00ab35f0	bl 0x00c342a0
00ab35f4	adrp x0,0x2c8000
00ab35f8	adrp x2,0x2da000
00ab35fc	add x0,x0,#0x6b
00ab3600	add x2,x2,#0x4e1
00ab3604	mov w1,#0x46
00ab3608	bl 0x00c342b0
00ab360c	mov w1,#0x6
00ab3610	mov w0,#0xd
00ab3614	movk w1,#0x8, LSL #16
00ab3618	mov x2,xzr
00ab361c	bl 0x00c342c0
00ab3620	mov w20,wzr
00ab3624	b 0x00ab3594
00ab3628	bl 0x00c342a0
00ab362c	adrp x0,0x2c8000
00ab3630	adrp x2,0x2da000
00ab3634	add x0,x0,#0x6b
00ab3638	add x2,x2,#0x4e1
00ab363c	mov w1,#0x4d
00ab3640	b 0x00ab3608
