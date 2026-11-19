; SHA256_Final @ 00adfadc
00adfadc	str x21,[sp, #-0x30]!
00adfae0	stp x20,x19,[sp, #0x10]
00adfae4	stp x29,x30,[sp, #0x20]
00adfae8	ldr w8,[x1, #0x68]
00adfaec	add x21,x1,#0x28
00adfaf0	mov w9,#0x80
00adfaf4	mov x20,x1
00adfaf8	mov x19,x0
00adfafc	strb w9,[x21, x8]
00adfb00	cmp w8,#0x38
00adfb04	add x9,x8,#0x1
00adfb08	add x29,sp,#0x20
00adfb0c	b.cc 0x00adfb38
00adfb10	add x0,x21,x9
00adfb14	orr w9,wzr,#0x3f
00adfb18	sub x2,x9,x8
00adfb1c	mov w1,wzr
00adfb20	bl 0x00c301c0
00adfb24	mov w2,#0x1
00adfb28	mov x0,x20
00adfb2c	mov x1,x21
00adfb30	bl 0x00adfe04
00adfb34	mov x9,xzr
00adfb38	orr w8,wzr,#0x38
00adfb3c	add x0,x21,x9
00adfb40	sub x2,x8,x9
00adfb44	mov w1,wzr
00adfb48	bl 0x00c301c0
00adfb4c	ldp w9,w8,[x20, #0x20]
00adfb50	mov w2,#0x1
00adfb54	mov x0,x20
00adfb58	mov x1,x21
00adfb5c	lsr w10,w8,#0x18
00adfb60	strb w10,[x20, #0x60]
00adfb64	lsr w10,w8,#0x10
00adfb68	strb w8,[x20, #0x63]
00adfb6c	lsr w8,w8,#0x8
00adfb70	strb w8,[x20, #0x62]
00adfb74	lsr w8,w9,#0x18
00adfb78	strb w8,[x20, #0x64]
00adfb7c	lsr w8,w9,#0x10
00adfb80	strb w8,[x20, #0x65]
00adfb84	lsr w8,w9,#0x8
00adfb88	strb w10,[x20, #0x61]
00adfb8c	strb w8,[x20, #0x66]
00adfb90	strb w9,[x20, #0x67]
00adfb94	bl 0x00adfe04
00adfb98	mov w1,#0x40
00adfb9c	mov x0,x21
00adfba0	str wzr,[x20, #0x68]
00adfba4	bl 0x00c34750
00adfba8	ldr w8,[x20, #0x6c]
00adfbac	cmp w8,#0x1c
00adfbb0	b.eq 0x00adfcc0
00adfbb4	cmp w8,#0x20
00adfbb8	b.ne 0x00adfda4
00adfbbc	ldr w8,[x20]
00adfbc0	lsr w9,w8,#0x18
00adfbc4	strb w9,[x19]
00adfbc8	lsr w9,w8,#0x10
00adfbcc	strb w8,[x19, #0x3]
00adfbd0	lsr w8,w8,#0x8
00adfbd4	strb w9,[x19, #0x1]
00adfbd8	strb w8,[x19, #0x2]
00adfbdc	ldr w8,[x20, #0x4]
00adfbe0	lsr w9,w8,#0x18
00adfbe4	strb w9,[x19, #0x4]
00adfbe8	lsr w9,w8,#0x10
00adfbec	strb w8,[x19, #0x7]
00adfbf0	lsr w8,w8,#0x8
00adfbf4	strb w9,[x19, #0x5]
00adfbf8	strb w8,[x19, #0x6]
00adfbfc	ldr w8,[x20, #0x8]
00adfc00	lsr w9,w8,#0x18
00adfc04	strb w9,[x19, #0x8]
00adfc08	lsr w9,w8,#0x10
00adfc0c	strb w8,[x19, #0xb]
00adfc10	lsr w8,w8,#0x8
00adfc14	strb w9,[x19, #0x9]
00adfc18	strb w8,[x19, #0xa]
00adfc1c	ldr w8,[x20, #0xc]
00adfc20	lsr w9,w8,#0x18
00adfc24	strb w9,[x19, #0xc]
00adfc28	lsr w9,w8,#0x10
00adfc2c	strb w8,[x19, #0xf]
00adfc30	lsr w8,w8,#0x8
00adfc34	strb w9,[x19, #0xd]
00adfc38	strb w8,[x19, #0xe]
00adfc3c	ldr w8,[x20, #0x10]
00adfc40	lsr w9,w8,#0x18
00adfc44	strb w9,[x19, #0x10]
00adfc48	lsr w9,w8,#0x10
00adfc4c	strb w8,[x19, #0x13]
00adfc50	lsr w8,w8,#0x8
00adfc54	strb w9,[x19, #0x11]
00adfc58	strb w8,[x19, #0x12]
00adfc5c	ldr w8,[x20, #0x14]
00adfc60	lsr w9,w8,#0x18
00adfc64	strb w9,[x19, #0x14]
00adfc68	lsr w9,w8,#0x10
00adfc6c	strb w8,[x19, #0x17]
00adfc70	lsr w8,w8,#0x8
00adfc74	strb w9,[x19, #0x15]
00adfc78	strb w8,[x19, #0x16]
00adfc7c	ldr w8,[x20, #0x18]
00adfc80	lsr w9,w8,#0x18
00adfc84	strb w9,[x19, #0x18]
00adfc88	lsr w9,w8,#0x10
00adfc8c	strb w8,[x19, #0x1b]
00adfc90	lsr w8,w8,#0x8
00adfc94	strb w9,[x19, #0x19]
00adfc98	strb w8,[x19, #0x1a]
00adfc9c	ldr w8,[x20, #0x1c]
00adfca0	lsr w9,w8,#0x18
00adfca4	lsr w10,w8,#0x10
00adfca8	strb w8,[x19, #0x1f]
00adfcac	lsr w8,w8,#0x8
00adfcb0	strb w9,[x19, #0x1c]
00adfcb4	strb w10,[x19, #0x1d]
00adfcb8	strb w8,[x19, #0x1e]
00adfcbc	b 0x00adfdf0
00adfcc0	ldr w8,[x20]
00adfcc4	lsr w9,w8,#0x18
00adfcc8	strb w9,[x19]
00adfccc	lsr w9,w8,#0x10
00adfcd0	strb w8,[x19, #0x3]
00adfcd4	lsr w8,w8,#0x8
00adfcd8	strb w9,[x19, #0x1]
00adfcdc	strb w8,[x19, #0x2]
00adfce0	ldr w8,[x20, #0x4]
00adfce4	lsr w9,w8,#0x18
00adfce8	strb w9,[x19, #0x4]
00adfcec	lsr w9,w8,#0x10
00adfcf0	strb w8,[x19, #0x7]
00adfcf4	lsr w8,w8,#0x8
00adfcf8	strb w9,[x19, #0x5]
00adfcfc	strb w8,[x19, #0x6]
00adfd00	ldr w8,[x20, #0x8]
00adfd04	lsr w9,w8,#0x18
00adfd08	strb w9,[x19, #0x8]
00adfd0c	lsr w9,w8,#0x10
00adfd10	strb w8,[x19, #0xb]
00adfd14	lsr w8,w8,#0x8
00adfd18	strb w9,[x19, #0x9]
00adfd1c	strb w8,[x19, #0xa]
00adfd20	ldr w8,[x20, #0xc]
00adfd24	lsr w9,w8,#0x18
00adfd28	strb w9,[x19, #0xc]
00adfd2c	lsr w9,w8,#0x10
00adfd30	strb w8,[x19, #0xf]
00adfd34	lsr w8,w8,#0x8
00adfd38	strb w9,[x19, #0xd]
00adfd3c	strb w8,[x19, #0xe]
00adfd40	ldr w8,[x20, #0x10]
00adfd44	lsr w9,w8,#0x18
00adfd48	strb w9,[x19, #0x10]
00adfd4c	lsr w9,w8,#0x10
00adfd50	strb w8,[x19, #0x13]
00adfd54	lsr w8,w8,#0x8
00adfd58	strb w9,[x19, #0x11]
00adfd5c	strb w8,[x19, #0x12]
00adfd60	ldr w8,[x20, #0x14]
00adfd64	lsr w9,w8,#0x18
00adfd68	strb w9,[x19, #0x14]
00adfd6c	lsr w9,w8,#0x10
00adfd70	strb w8,[x19, #0x17]
00adfd74	lsr w8,w8,#0x8
00adfd78	strb w9,[x19, #0x15]
00adfd7c	strb w8,[x19, #0x16]
00adfd80	ldr w8,[x20, #0x18]
00adfd84	lsr w9,w8,#0x18
00adfd88	lsr w10,w8,#0x10
00adfd8c	strb w8,[x19, #0x1b]
00adfd90	lsr w8,w8,#0x8
00adfd94	strb w9,[x19, #0x18]
00adfd98	strb w10,[x19, #0x19]
00adfd9c	strb w8,[x19, #0x1a]
00adfda0	b 0x00adfdf0
00adfda4	mov w0,wzr
00adfda8	b.hi 0x00adfdf4
00adfdac	cmp w8,#0x4
00adfdb0	b.cc 0x00adfdf0
00adfdb4	mov x8,xzr
00adfdb8	ldr w9,[x20, x8, LSL #0x2]
00adfdbc	add x8,x8,#0x1
00adfdc0	lsr w10,w9,#0x18
00adfdc4	lsr w11,w9,#0x10
00adfdc8	lsr w12,w9,#0x8
00adfdcc	strb w10,[x19]
00adfdd0	strb w11,[x19, #0x1]
00adfdd4	strb w12,[x19, #0x2]
00adfdd8	strb w9,[x19, #0x3]
00adfddc	ldr w9,[x20, #0x6c]
00adfde0	add x19,x19,#0x4
00adfde4	lsr w9,w9,#0x2
00adfde8	cmp x8,x9
00adfdec	b.cc 0x00adfdb8
00adfdf0	mov w0,#0x1
00adfdf4	ldp x29,x30,[sp, #0x20]
00adfdf8	ldp x20,x19,[sp, #0x10]
00adfdfc	ldr x21,[sp], #0x30
00adfe00	ret
