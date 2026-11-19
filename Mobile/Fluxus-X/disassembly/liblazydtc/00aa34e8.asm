; OSSL_PROVIDER_set_default_search_path @ 00aa34e8
00aa34e8	stp x20,x19,[sp, #-0x20]!
00aa34ec	mov x20,x0
00aa34f0	stp x29,x30,[sp, #0x10]
00aa34f4	add x29,sp,#0x10
00aa34f8	cbz x1,0x00aa3550
00aa34fc	adrp x8,0x2aa000
00aa3500	add x8,x8,#0x4b5
00aa3504	mov w2,#0x32f
00aa3508	mov x0,x1
00aa350c	mov x1,x8
00aa3510	bl 0x00c34600
00aa3514	mov x19,x0
00aa3518	cbnz x0,0x00aa3554
00aa351c	bl 0x00c342a0
00aa3520	adrp x0,0x2aa000
00aa3524	adrp x2,0x2cb000
00aa3528	add x0,x0,#0x4b5
00aa352c	add x2,x2,#0xc26
00aa3530	mov w1,#0x331
00aa3534	bl 0x00c342b0
00aa3538	mov w1,#0x100
00aa353c	orr w0,wzr,#0xf
00aa3540	movk w1,#0xc, LSL #16
00aa3544	mov x2,xzr
00aa3548	bl 0x00c342c0
00aa354c	b 0x00aa35ec
00aa3550	mov x19,xzr
00aa3554	adrp x2,0xc6d000
00aa3558	add x2,x2,#0x4c8
00aa355c	mov w1,#0x1
00aa3560	mov x0,x20
00aa3564	bl 0x00c3b520
00aa3568	cbz x0,0x00aa35a4
00aa356c	mov x20,x0
00aa3570	ldr x0,[x0, #0x18]
00aa3574	bl 0x00c356a0
00aa3578	cbz w0,0x00aa35d8
00aa357c	ldr x0,[x20, #0x28]
00aa3580	adrp x1,0x2aa000
00aa3584	add x1,x1,#0x4b5
00aa3588	mov w2,#0x337
00aa358c	bl 0x00c32310
00aa3590	ldr x0,[x20, #0x18]
00aa3594	str x19,[x20, #0x28]
00aa3598	bl 0x00c35690
00aa359c	mov w0,#0x1
00aa35a0	b 0x00aa35f0
00aa35a4	bl 0x00c342a0
00aa35a8	adrp x0,0x2aa000
00aa35ac	adrp x2,0x2bb000
00aa35b0	add x0,x0,#0x4b5
00aa35b4	add x2,x2,#0xf7d
00aa35b8	mov w1,#0x156
00aa35bc	bl 0x00c342b0
00aa35c0	mov w8,#0x100
00aa35c4	movk w8,#0xc, LSL #16
00aa35c8	add w1,w8,#0x3
00aa35cc	orr w0,wzr,#0xf
00aa35d0	mov x2,xzr
00aa35d4	bl 0x00c342c0
00aa35d8	adrp x1,0x2aa000
00aa35dc	add x1,x1,#0x4b5
00aa35e0	mov w2,#0x33c
00aa35e4	mov x0,x19
00aa35e8	bl 0x00c32310
00aa35ec	mov w0,wzr
00aa35f0	ldp x29,x30,[sp, #0x10]
00aa35f4	ldp x20,x19,[sp], #0x20
00aa35f8	ret
