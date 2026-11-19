; PKCS7_set_digest @ 00ac34b8
00ac34b8	stp x20,x19,[sp, #-0x20]!
00ac34bc	stp x29,x30,[sp, #0x10]
00ac34c0	mov x19,x0
00ac34c4	ldr x0,[x0, #0x18]
00ac34c8	add x29,sp,#0x10
00ac34cc	mov x20,x1
00ac34d0	bl 0x00c37750
00ac34d4	cmp w0,#0x19
00ac34d8	b.ne 0x00ac3520
00ac34dc	bl 0x00c37a40
00ac34e0	ldr x8,[x19, #0x20]
00ac34e4	ldr x8,[x8, #0x8]
00ac34e8	str x0,[x8, #0x8]
00ac34ec	cbz x0,0x00ac3554
00ac34f0	ldr x8,[x19, #0x20]
00ac34f4	mov w9,#0x5
00ac34f8	mov x0,x20
00ac34fc	ldr x8,[x8, #0x8]
00ac3500	ldr x8,[x8, #0x8]
00ac3504	str w9,[x8]
00ac3508	bl 0x00c34c30
00ac350c	bl 0x00c37740
00ac3510	ldr x8,[x19, #0x20]
00ac3514	ldr x8,[x8, #0x8]
00ac3518	str x0,[x8]
00ac351c	b 0x00ac354c
00ac3520	bl 0x00c342a0
00ac3524	adrp x0,0x2ce000
00ac3528	adrp x2,0x2bc000
00ac352c	add x0,x0,#0x1ca
00ac3530	add x2,x2,#0x366
00ac3534	mov w1,#0x214
00ac3538	bl 0x00c342b0
00ac353c	mov w0,#0x21
00ac3540	mov w1,#0x71
00ac3544	mov x2,xzr
00ac3548	bl 0x00c342c0
00ac354c	mov w0,#0x1
00ac3550	b 0x00ac3588
00ac3554	bl 0x00c342a0
00ac3558	adrp x0,0x2ce000
00ac355c	adrp x2,0x2bc000
00ac3560	add x0,x0,#0x1ca
00ac3564	add x2,x2,#0x366
00ac3568	mov w1,#0x20c
00ac356c	bl 0x00c342b0
00ac3570	mov w1,#0x100
00ac3574	mov w0,#0x21
00ac3578	movk w1,#0xc, LSL #16
00ac357c	mov x2,xzr
00ac3580	bl 0x00c342c0
00ac3584	mov w0,wzr
00ac3588	ldp x29,x30,[sp, #0x10]
00ac358c	ldp x20,x19,[sp], #0x20
00ac3590	ret
