; X509_check_host @ 00b06a60
00b06a60	str x23,[sp, #-0x40]!
00b06a64	stp x22,x21,[sp, #0x10]
00b06a68	stp x20,x19,[sp, #0x20]
00b06a6c	stp x29,x30,[sp, #0x30]
00b06a70	add x29,sp,#0x30
00b06a74	cbz x1,0x00b06aa8
00b06a78	mov x19,x4
00b06a7c	mov w20,w3
00b06a80	mov x23,x2
00b06a84	mov x21,x1
00b06a88	mov x22,x0
00b06a8c	cbz x2,0x00b06ac0
00b06a90	subs x8,x23,#0x1
00b06a94	csinc x2,x8,xzr,ne
00b06a98	mov x0,x21
00b06a9c	mov w1,wzr
00b06aa0	bl 0x00c300a0
00b06aa4	cbz x0,0x00b06acc
00b06aa8	ldp x29,x30,[sp, #0x30]
00b06aac	ldp x20,x19,[sp, #0x20]
00b06ab0	ldp x22,x21,[sp, #0x10]
00b06ab4	orr w0,wzr,#0xfffffffe
00b06ab8	ldr x23,[sp], #0x40
00b06abc	ret
00b06ac0	mov x0,x21
00b06ac4	bl 0x00c2ff50
00b06ac8	mov x23,x0
00b06acc	cmp x23,#0x2
00b06ad0	b.cc 0x00b06ae4
00b06ad4	sub x8,x23,#0x1
00b06ad8	ldrb w9,[x21, x8]
00b06adc	cmp w9,#0x0
00b06ae0	csel x23,x8,x23,eq
00b06ae4	mov x0,x22
00b06ae8	mov x1,x21
00b06aec	mov w3,w20
00b06af0	mov x5,x19
00b06af4	ldp x29,x30,[sp, #0x30]
00b06af8	ldp x20,x19,[sp, #0x20]
00b06afc	ldp x22,x21,[sp, #0x10]
00b06b00	mov w4,#0x2
00b06b04	mov x2,x23
00b06b08	ldr x23,[sp], #0x40
00b06b0c	b 0x00b06b10
