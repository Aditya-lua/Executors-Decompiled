; ossl_param_build_set_multi_key_bn @ 00a9de48
00a9de48	stp x24,x23,[sp, #-0x40]!
00a9de4c	stp x22,x21,[sp, #0x10]
00a9de50	mov x22,x0
00a9de54	mov x0,x3
00a9de58	stp x20,x19,[sp, #0x20]
00a9de5c	stp x29,x30,[sp, #0x30]
00a9de60	add x29,sp,#0x30
00a9de64	mov x19,x3
00a9de68	mov x20,x2
00a9de6c	mov x21,x1
00a9de70	bl 0x00c325e0
00a9de74	cmp w0,#0x1
00a9de78	cbz x22,0x00a9dec4
00a9de7c	b.lt 0x00a9df14
00a9de80	mov x21,xzr
00a9de84	sxtw x23,w0
00a9de88	ldr x8,[x20, x21, LSL #0x3]
00a9de8c	cbz x8,0x00a9df14
00a9de90	mov x0,x19
00a9de94	mov w1,w21
00a9de98	bl 0x00c32610
00a9de9c	cbz x0,0x00a9deb4
00a9dea0	ldr x1,[x20, x21, LSL #0x3]
00a9dea4	mov x2,x0
00a9dea8	mov x0,x22
00a9deac	bl 0x00c364d0
00a9deb0	cbz w0,0x00a9df18
00a9deb4	add x21,x21,#0x1
00a9deb8	cmp x21,x23
00a9debc	b.lt 0x00a9de88
00a9dec0	b 0x00a9df14
00a9dec4	b.lt 0x00a9df14
00a9dec8	mov x22,xzr
00a9decc	sxtw x24,w0
00a9ded0	ldr x8,[x20, x22, LSL #0x3]
00a9ded4	cbz x8,0x00a9df14
00a9ded8	mov x0,x19
00a9dedc	mov w1,w22
00a9dee0	bl 0x00c32610
00a9dee4	ldr x1,[x20, x22, LSL #0x3]
00a9dee8	mov x23,x0
00a9deec	mov x0,x21
00a9def0	bl 0x00c3e8c0
00a9def4	cbz x23,0x00a9df08
00a9def8	cbz x0,0x00a9df08
00a9defc	mov x1,x23
00a9df00	bl 0x00c3da80
00a9df04	cbz w0,0x00a9df18
00a9df08	add x22,x22,#0x1
00a9df0c	cmp x22,x24
00a9df10	b.lt 0x00a9ded0
00a9df14	mov w0,#0x1
00a9df18	ldp x29,x30,[sp, #0x30]
00a9df1c	ldp x20,x19,[sp, #0x20]
00a9df20	ldp x22,x21,[sp, #0x10]
00a9df24	ldp x24,x23,[sp], #0x40
00a9df28	ret
