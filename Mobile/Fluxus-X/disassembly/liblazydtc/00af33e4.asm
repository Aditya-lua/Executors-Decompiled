; X509_aux_print @ 00af33e4
00af33e4	sub sp,sp,#0xa0
00af33e8	stp x20,x19,[sp, #0x80]
00af33ec	mov x19,x0
00af33f0	mov x0,x1
00af33f4	str x25,[sp, #0x50]
00af33f8	stp x24,x23,[sp, #0x60]
00af33fc	stp x22,x21,[sp, #0x70]
00af3400	stp x29,x30,[sp, #0x90]
00af3404	add x29,sp,#0x90
00af3408	mov w20,w2
00af340c	mov x21,x1
00af3410	bl 0x00c40720
00af3414	cbz w0,0x00af371c
00af3418	mov x0,x21
00af341c	bl 0x00c406f0
00af3420	mov x23,x0
00af3424	mov x0,x21
00af3428	bl 0x00c406d0
00af342c	mov x22,x0
00af3430	cbz x23,0x00af3614
00af3434	adrp x3,0x2ab000
00af3438	adrp x1,0x2c2000
00af343c	add x3,x3,#0x32c
00af3440	add w4,w20,#0x2
00af3444	add x1,x1,#0x49e
00af3448	mov x0,x19
00af344c	mov w2,w20
00af3450	mov x5,x3
00af3454	bl 0x00c32250
00af3458	mov x0,x23
00af345c	stur wzr,[x29, #-0x38]
00af3460	bl 0x00c325e0
00af3464	cmp w0,#0x1
00af3468	b.lt 0x00af3510
00af346c	ldur w1,[x29, #-0x38]
00af3470	mov x0,x23
00af3474	bl 0x00c32610
00af3478	mov x2,x0
00af347c	mov x0,sp
00af3480	mov w1,#0x50
00af3484	mov w3,wzr
00af3488	bl 0x00c32500
00af348c	mov x1,sp
00af3490	mov x0,x19
00af3494	bl 0x00c32260
00af3498	ldur w8,[x29, #-0x38]
00af349c	mov x0,x23
00af34a0	add w24,w8,#0x1
00af34a4	stur w24,[x29, #-0x38]
00af34a8	bl 0x00c325e0
00af34ac	cmp w24,w0
00af34b0	b.ge 0x00af3510
00af34b4	adrp x24,0x2a7000
00af34b8	add x24,x24,#0x15d
00af34bc	mov x0,x19
00af34c0	mov x1,x24
00af34c4	bl 0x00c32260
00af34c8	ldur w1,[x29, #-0x38]
00af34cc	mov x0,x23
00af34d0	bl 0x00c32610
00af34d4	mov x2,x0
00af34d8	mov x0,sp
00af34dc	mov w1,#0x50
00af34e0	mov w3,wzr
00af34e4	bl 0x00c32500
00af34e8	mov x1,sp
00af34ec	mov x0,x19
00af34f0	bl 0x00c32260
00af34f4	ldur w8,[x29, #-0x38]
00af34f8	mov x0,x23
00af34fc	add w25,w8,#0x1
00af3500	stur w25,[x29, #-0x38]
00af3504	bl 0x00c325e0
00af3508	cmp w25,w0
00af350c	b.lt 0x00af34bc
00af3510	adrp x1,0x2c4000
00af3514	add x1,x1,#0xdae
00af3518	mov x0,x19
00af351c	bl 0x00c32260
00af3520	cbz x22,0x00af3634
00af3524	adrp x3,0x2ab000
00af3528	adrp x1,0x2b0000
00af352c	add x3,x3,#0x32c
00af3530	add w4,w20,#0x2
00af3534	add x1,x1,#0x923
00af3538	mov x0,x19
00af353c	mov w2,w20
00af3540	mov x5,x3
00af3544	bl 0x00c32250
00af3548	mov x0,x22
00af354c	stur wzr,[x29, #-0x38]
00af3550	bl 0x00c325e0
00af3554	cmp w0,#0x1
00af3558	b.lt 0x00af3600
00af355c	ldur w1,[x29, #-0x38]
00af3560	mov x0,x22
00af3564	bl 0x00c32610
00af3568	mov x2,x0
00af356c	mov x0,sp
00af3570	mov w1,#0x50
00af3574	mov w3,wzr
00af3578	bl 0x00c32500
00af357c	mov x1,sp
00af3580	mov x0,x19
00af3584	bl 0x00c32260
00af3588	ldur w8,[x29, #-0x38]
00af358c	mov x0,x22
00af3590	add w23,w8,#0x1
00af3594	stur w23,[x29, #-0x38]
00af3598	bl 0x00c325e0
00af359c	cmp w23,w0
00af35a0	b.ge 0x00af3600
00af35a4	adrp x23,0x2a7000
00af35a8	add x23,x23,#0x15d
00af35ac	mov x0,x19
00af35b0	mov x1,x23
00af35b4	bl 0x00c32260
00af35b8	ldur w1,[x29, #-0x38]
00af35bc	mov x0,x22
00af35c0	bl 0x00c32610
00af35c4	mov x2,x0
00af35c8	mov x0,sp
00af35cc	mov w1,#0x50
00af35d0	mov w3,wzr
00af35d4	bl 0x00c32500
00af35d8	mov x1,sp
00af35dc	mov x0,x19
00af35e0	bl 0x00c32260
00af35e4	ldur w8,[x29, #-0x38]
00af35e8	mov x0,x22
00af35ec	add w24,w8,#0x1
00af35f0	stur w24,[x29, #-0x38]
00af35f4	bl 0x00c325e0
00af35f8	cmp w24,w0
00af35fc	b.lt 0x00af35ac
00af3600	adrp x1,0x2c4000
00af3604	add x1,x1,#0xdae
00af3608	mov x0,x19
00af360c	bl 0x00c32260
00af3610	b 0x00af3650
00af3614	adrp x1,0x2d8000
00af3618	adrp x3,0x2ab000
00af361c	add x1,x1,#0x828
00af3620	add x3,x3,#0x32c
00af3624	mov x0,x19
00af3628	mov w2,w20
00af362c	bl 0x00c32250
00af3630	cbnz x22,0x00af3524
00af3634	adrp x1,0x2b2000
00af3638	adrp x3,0x2ab000
00af363c	add x1,x1,#0xc06
00af3640	add x3,x3,#0x32c
00af3644	mov x0,x19
00af3648	mov w2,w20
00af364c	bl 0x00c32250
00af3650	sub x1,x29,#0x38
00af3654	mov x0,x21
00af3658	bl 0x00c406b0
00af365c	cbz x0,0x00af3684
00af3660	ldur w4,[x29, #-0x38]
00af3664	adrp x1,0x2ae000
00af3668	adrp x3,0x2ab000
00af366c	mov x5,x0
00af3670	add x1,x1,#0x74b
00af3674	add x3,x3,#0x32c
00af3678	mov x0,x19
00af367c	mov w2,w20
00af3680	bl 0x00c32250
00af3684	sub x1,x29,#0x34
00af3688	mov x0,x21
00af368c	bl 0x00c40710
00af3690	cbz x0,0x00af371c
00af3694	adrp x22,0x2ab000
00af3698	adrp x1,0x29e000
00af369c	add x22,x22,#0x32c
00af36a0	mov x21,x0
00af36a4	add x1,x1,#0xab0
00af36a8	mov x0,x19
00af36ac	mov w2,w20
00af36b0	mov x3,x22
00af36b4	bl 0x00c32250
00af36b8	ldur w8,[x29, #-0x34]
00af36bc	stur wzr,[x29, #-0x38]
00af36c0	cmp w8,#0x1
00af36c4	b.lt 0x00af3708
00af36c8	adrp x23,0x2bc000
00af36cc	adrp x20,0x2ce000
00af36d0	mov w8,wzr
00af36d4	add x23,x23,#0xda4
00af36d8	add x20,x20,#0x3f7
00af36dc	ldrb w3,[x21, w8, SXTW ]
00af36e0	cmp w8,#0x0
00af36e4	csel x2,x22,x23,eq
00af36e8	mov x0,x19
00af36ec	mov x1,x20
00af36f0	bl 0x00c32250
00af36f4	ldp w8,w9,[x29, #-0x38]
00af36f8	add w8,w8,#0x1
00af36fc	cmp w8,w9
00af3700	stur w8,[x29, #-0x38]
00af3704	b.lt 0x00af36dc
00af3708	adrp x1,0x2c4000
00af370c	add x1,x1,#0xdae
00af3710	mov w2,#0x1
00af3714	mov x0,x19
00af3718	bl 0x00c34240
00af371c	ldp x29,x30,[sp, #0x90]
00af3720	ldp x20,x19,[sp, #0x80]
00af3724	ldp x22,x21,[sp, #0x70]
00af3728	ldp x24,x23,[sp, #0x60]
00af372c	ldr x25,[sp, #0x50]
00af3730	mov w0,#0x1
00af3734	add sp,sp,#0xa0
00af3738	ret
