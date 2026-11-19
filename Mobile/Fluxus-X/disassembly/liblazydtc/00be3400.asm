; std::__ndk1::__num_get<char>::__stage2_float_loop @ 00be3400
00be3400	paciasp
00be3404	stp x29,x30,[sp, #-0x60]!
00be3408	stp x28,x27,[sp, #0x10]
00be340c	stp x26,x25,[sp, #0x20]
00be3410	stp x24,x23,[sp, #0x30]
00be3414	stp x22,x21,[sp, #0x40]
00be3418	stp x20,x19,[sp, #0x50]
00be341c	mov x29,sp
00be3420	ldp x21,x20,[x29, #0x68]
00be3424	and w8,w0,#0xff
00be3428	ldr x22,[x29, #0x60]
00be342c	cmp w8,w5, UXTB 
00be3430	b.ne 0x00be3494
00be3434	ldrb w8,[x1]
00be3438	cmp w8,#0x1
00be343c	b.ne 0x00be3528
00be3440	ldr x8,[x4]
00be3444	mov w10,#0x2e
00be3448	strb wzr,[x1]
00be344c	add x9,x8,#0x1
00be3450	str x9,[x4]
00be3454	strb w10,[x8]
00be3458	ldrb w8,[x7]
00be345c	ldr x9,[x7, #0x8]
00be3460	lsr x10,x8,#0x1
00be3464	tst w8,#0x1
00be3468	csel x8,x10,x9,eq
00be346c	cbz x8,0x00be3530
00be3470	ldr x8,[x21]
00be3474	sub x9,x8,x22
00be3478	cmp x9,#0x9f
00be347c	b.gt 0x00be3530
00be3480	ldr w9,[x20]
00be3484	mov w0,wzr
00be3488	str w9,[x8], #0x4
00be348c	str x8,[x21]
00be3490	b 0x00be3668
00be3494	cmp w8,w6, UXTB 
00be3498	b.ne 0x00be34e8
00be349c	ldrb w8,[x7]
00be34a0	ldr x9,[x7, #0x8]
00be34a4	lsr x10,x8,#0x1
00be34a8	tst w8,#0x1
00be34ac	csel x8,x10,x9,eq
00be34b0	cbz x8,0x00be34e8
00be34b4	ldrb w8,[x1]
00be34b8	cmp w8,#0x1
00be34bc	b.ne 0x00be3528
00be34c0	ldr x8,[x21]
00be34c4	sub x9,x8,x22
00be34c8	cmp x9,#0x9f
00be34cc	b.gt 0x00be3530
00be34d0	ldr w9,[x20]
00be34d4	mov w0,wzr
00be34d8	str w9,[x8], #0x4
00be34dc	str x8,[x21]
00be34e0	str wzr,[x20]
00be34e4	b 0x00be3668
00be34e8	ldr x19,[x29, #0x78]
00be34ec	mov x24,x1
00be34f0	mov x26,x2
00be34f4	and w1,w0,#0xff
00be34f8	mov w2,#0x1c
00be34fc	mov x27,x3
00be3500	mov x0,x19
00be3504	mov x23,x7
00be3508	mov x25,x4
00be350c	add x28,x19,#0x1c
00be3510	bl 0x00c300a0
00be3514	cmp x0,#0x0
00be3518	csel x8,x28,x0,eq
00be351c	sub x10,x8,x19
00be3520	cmp x10,#0x1b
00be3524	b.le 0x00be3538
00be3528	mov w0,#0xffffffff
00be352c	b 0x00be3668
00be3530	mov w0,wzr
00be3534	b 0x00be3668
00be3538	adrp x8,0xcb5000
00be353c	and x9,x10,#-0x2
00be3540	ldr x8,[x8, #0xc08]
00be3544	cmp x9,#0x16
00be3548	ldrb w8,[x8, x10]
00be354c	b.eq 0x00be35ac
00be3550	cmp x9,#0x18
00be3554	mov x9,x25
00be3558	b.ne 0x00be35cc
00be355c	ldr x10,[x9]
00be3560	cmp x10,x27
00be3564	b.eq 0x00be3598
00be3568	ldurb w11,[x10, #-0x1]
00be356c	ldrb w12,[x26]
00be3570	sub w13,w11,#0x7b
00be3574	eor w14,w11,#0x20
00be3578	cmn w13,#0x1a
00be357c	sub w13,w12,#0x7b
00be3580	csel w11,w11,w14,cc
00be3584	eor w14,w12,#0x20
00be3588	cmn w13,#0x1a
00be358c	csel w12,w12,w14,cc
00be3590	cmp w11,w12
00be3594	b.ne 0x00be3528
00be3598	add x11,x10,#0x1
00be359c	mov w0,wzr
00be35a0	str x11,[x9]
00be35a4	strb w8,[x10]
00be35a8	b 0x00be3668
00be35ac	mov w9,#0x50
00be35b0	mov w0,wzr
00be35b4	strb w9,[x26]
00be35b8	ldr x9,[x25]
00be35bc	add x10,x9,#0x1
00be35c0	str x10,[x25]
00be35c4	strb w8,[x9]
00be35c8	b 0x00be3668
00be35cc	sub w11,w8,#0x7b
00be35d0	eor w12,w8,#0x20
00be35d4	cmn w11,#0x1a
00be35d8	ldrb w11,[x26]
00be35dc	csel w12,w8,w12,cc
00be35e0	cmp w12,w11
00be35e4	b.ne 0x00be3640
00be35e8	sub w12,w12,#0x5b
00be35ec	orr w13,w11,#0x20
00be35f0	cmn w12,#0x1a
00be35f4	csel w11,w11,w13,cc
00be35f8	strb w11,[x26]
00be35fc	ldrb w11,[x24]
00be3600	cmp w11,#0x1
00be3604	b.ne 0x00be3640
00be3608	strb wzr,[x24]
00be360c	ldrb w11,[x23]
00be3610	ldr x12,[x23, #0x8]
00be3614	lsr x13,x11,#0x1
00be3618	tst w11,#0x1
00be361c	csel x11,x13,x12,eq
00be3620	cbz x11,0x00be3640
00be3624	ldr x11,[x21]
00be3628	sub x12,x11,x22
00be362c	cmp x12,#0x9f
00be3630	b.gt 0x00be3640
00be3634	ldr w12,[x20]
00be3638	str w12,[x11], #0x4
00be363c	str x11,[x21]
00be3640	ldr x11,[x9]
00be3644	cmp x10,#0x15
00be3648	mov w0,wzr
00be364c	add x12,x11,#0x1
00be3650	str x12,[x9]
00be3654	strb w8,[x11]
00be3658	b.gt 0x00be3668
00be365c	ldr w8,[x20]
00be3660	add w8,w8,#0x1
00be3664	str w8,[x20]
00be3668	ldp x20,x19,[sp, #0x50]
00be366c	ldp x22,x21,[sp, #0x40]
00be3670	ldp x24,x23,[sp, #0x30]
00be3674	ldp x26,x25,[sp, #0x20]
00be3678	ldp x28,x27,[sp, #0x10]
00be367c	ldp x29,x30,[sp], #0x60
00be3680	autiasp
00be3684	ret
