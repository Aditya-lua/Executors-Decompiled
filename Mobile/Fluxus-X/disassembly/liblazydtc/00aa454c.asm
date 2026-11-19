; ossl_provider_test_operation_bit @ 00aa454c
00aa454c	str x21,[sp, #-0x30]!
00aa4550	stp x20,x19,[sp, #0x10]
00aa4554	stp x29,x30,[sp, #0x20]
00aa4558	add x29,sp,#0x20
00aa455c	cbz x2,0x00aa45bc
00aa4560	str wzr,[x2]
00aa4564	mov x19,x0
00aa4568	ldr x0,[x0, #0xb8]
00aa456c	mov x20,x2
00aa4570	mov x21,x1
00aa4574	bl 0x00c35680
00aa4578	cbz w0,0x00aa45f0
00aa457c	ldr x9,[x19, #0xb0]
00aa4580	lsr x8,x21,#0x3
00aa4584	cmp x9,x8
00aa4588	b.ls 0x00aa45ac
00aa458c	ldr x9,[x19, #0xa8]
00aa4590	mov w10,#0x1
00aa4594	ldrb w8,[x9, x8]
00aa4598	and w9,w21,#0x7
00aa459c	lsl w9,w10,w9
00aa45a0	tst w9,w8
00aa45a4	cset w8,ne
00aa45a8	str w8,[x20]
00aa45ac	ldr x0,[x19, #0xb8]
00aa45b0	bl 0x00c35690
00aa45b4	mov w0,#0x1
00aa45b8	b 0x00aa45f0
00aa45bc	bl 0x00c342a0
00aa45c0	adrp x0,0x2aa000
00aa45c4	adrp x2,0x2c3000
00aa45c8	add x0,x0,#0x4b5
00aa45cc	add x2,x2,#0xcf1
00aa45d0	mov w1,#0x67d
00aa45d4	bl 0x00c342b0
00aa45d8	mov w1,#0x102
00aa45dc	orr w0,wzr,#0xf
00aa45e0	movk w1,#0xc, LSL #16
00aa45e4	mov x2,xzr
00aa45e8	bl 0x00c342c0
00aa45ec	mov w0,wzr
00aa45f0	ldp x29,x30,[sp, #0x20]
00aa45f4	ldp x20,x19,[sp, #0x10]
00aa45f8	ldr x21,[sp], #0x30
00aa45fc	ret
