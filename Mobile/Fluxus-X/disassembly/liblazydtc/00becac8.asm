; std::__ndk1::__time_put::__do_put @ 00becac8
00becac8	paciasp
00becacc	sub sp,sp,#0xc0
00becad0	stp x29,x30,[sp, #0x80]
00becad4	str x23,[sp, #0x90]
00becad8	stp x22,x21,[sp, #0xa0]
00becadc	stp x20,x19,[sp, #0xb0]
00becae0	add x29,sp,#0x80
00becae4	mov x19,x2
00becae8	mov x20,x1
00becaec	mov x21,x0
00becaf0	mov w8,#0x25
00becaf4	tst w5,#0xff
00becaf8	strb w4,[x29, #0x19]
00becafc	strb w8,[x29, #0x18]
00becb00	strb w5,[x29, #0x1a]
00becb04	strb wzr,[x29, #0x1b]
00becb08	b.eq 0x00becb14
00becb0c	strb w5,[x29, #0x19]
00becb10	strb w4,[x29, #0x1a]
00becb14	ldr x4,[x21]
00becb18	add x0,sp,#0x1c
00becb1c	add x2,x29,#0x18
00becb20	mov w1,#0x64
00becb24	add x23,sp,#0x1c
00becb28	bl 0x00c43b60
00becb2c	ldr x8,[x19]
00becb30	ldr x0,[x21]
00becb34	stp x23,xzr,[sp, #0x8]
00becb38	sub x8,x8,x20
00becb3c	asr x22,x8,#0x2
00becb40	bl 0x00c43880
00becb44	mov x21,x0
00becb48	str x0,[x29, #0x18]
00becb4c	add x1,sp,#0x8
00becb50	add x3,sp,#0x10
00becb54	mov x0,x20
00becb58	mov x2,x22
00becb5c	bl 0x00c43af0
00becb60	mov x22,x0
00becb64	cbz x21,0x00becb70
00becb68	mov x0,x21
00becb6c	bl 0x00c43880
00becb70	cmn x22,#0x1
00becb74	b.eq 0x00becb9c
00becb78	add x8,x20,x22, LSL #0x2
00becb7c	str x8,[x19]
00becb80	ldp x20,x19,[sp, #0xb0]
00becb84	ldr x23,[sp, #0x90]
00becb88	ldp x22,x21,[sp, #0xa0]
00becb8c	ldp x29,x30,[sp, #0x80]
00becb90	add sp,sp,#0xc0
00becb94	autiasp
00becb98	ret
00becb9c	adrp x0,0x29f000
00becba0	add x0,x0,#0x109
00becba4	bl 0x00c43d00
00becba8	bl 0x007fe114
