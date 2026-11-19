; mbedtls_psa_hash_finish @ 00b9da18
00b9da18	str x23,[sp, #-0x40]!
00b9da1c	stp x22,x21,[sp, #0x10]
00b9da20	stp x20,x19,[sp, #0x20]
00b9da24	stp x29,x30,[sp, #0x30]
00b9da28	add x29,sp,#0x30
00b9da2c	ldr w8,[x0]
00b9da30	mov x19,x3
00b9da34	mov x22,x2
00b9da38	mov x21,x0
00b9da3c	sub w9,w8,#0x3
00b9da40	and w10,w9,#0xff
00b9da44	cmp w10,#0x10
00b9da48	mov x20,x1
00b9da4c	b.cs 0x00b9da60
00b9da50	and x10,x9,#0xff
00b9da54	mov w11,#0xe7e7
00b9da58	lsr w10,w11,w10
00b9da5c	tbnz w10,#0x0,0x00b9db04
00b9da60	and w8,w8,#0xff
00b9da64	mov w9,#0x13
00b9da68	orr w8,w8,#0x2000000
00b9da6c	movk w9,#0x200, LSL #16
00b9da70	cmp w8,w9
00b9da74	cset w8,eq
00b9da78	lsl x23,x8,#0x6
00b9da7c	str x22,[x19]
00b9da80	cbz x22,0x00b9da94
00b9da84	mov w1,#0x21
00b9da88	mov x0,x20
00b9da8c	mov x2,x22
00b9da90	bl 0x00c301c0
00b9da94	cmp x23,x22
00b9da98	b.ls 0x00b9daa4
00b9da9c	mov w0,#0xffffff76
00b9daa0	b 0x00b9daf0
00b9daa4	ldr w8,[x21]
00b9daa8	mov w9,#0xfffd
00b9daac	movk w9,#0xfdff, LSL #16
00b9dab0	mov w0,#0xffffff77
00b9dab4	add w8,w8,w9
00b9dab8	cmp w8,#0x10
00b9dabc	b.hi 0x00b9daf0
00b9dac0	adrp x9,0x787000
00b9dac4	add x9,x9,#0x638
00b9dac8	ldrsw x8,[x9, x8, LSL #0x2]
00b9dacc	add x8,x8,x9
00b9dad0	br x8
00b9dad4	add x0,x21,#0x8
00b9dad8	mov x1,x20
00b9dadc	mov x2,x22
00b9dae0	bl 0x00c42af0
00b9dae4	bl 0x00c42bf0
00b9dae8	cbnz w0,0x00b9daf0
00b9daec	str x23,[x19]
00b9daf0	ldp x29,x30,[sp, #0x30]
00b9daf4	ldp x20,x19,[sp, #0x20]
00b9daf8	ldp x22,x21,[sp, #0x10]
00b9dafc	ldr x23,[sp], #0x40
00b9db00	ret
00b9db04	sxtb x8,w9
00b9db08	adrp x9,0x787000
00b9db0c	add x9,x9,#0x680
00b9db10	ldr x23,[x9, x8, LSL #0x3]
00b9db14	str x22,[x19]
00b9db18	cbnz x22,0x00b9da84
00b9db1c	b 0x00b9da94
00b9db20	add x0,x21,#0x8
00b9db24	mov x1,x20
00b9db28	bl 0x00c42a90
00b9db2c	bl 0x00c42bf0
00b9db30	cbnz w0,0x00b9daf0
00b9db34	b 0x00b9daec
00b9db38	add x0,x21,#0x8
00b9db3c	mov x1,x20
00b9db40	bl 0x00c42b60
00b9db44	bl 0x00c42bf0
00b9db48	cbnz w0,0x00b9daf0
00b9db4c	b 0x00b9daec
00b9db50	add x0,x21,#0x8
00b9db54	mov x1,x20
00b9db58	bl 0x00c42900
00b9db5c	bl 0x00c42bf0
00b9db60	cbnz w0,0x00b9daf0
00b9db64	b 0x00b9daec
00b9db68	add x0,x21,#0x8
00b9db6c	mov x1,x20
00b9db70	bl 0x00c429b0
00b9db74	bl 0x00c42bf0
00b9db78	cbnz w0,0x00b9daf0
00b9db7c	b 0x00b9daec
00b9db80	add x0,x21,#0x8
00b9db84	mov x1,x20
00b9db88	bl 0x00c42a20
00b9db8c	bl 0x00c42bf0
00b9db90	cbnz w0,0x00b9daf0
00b9db94	b 0x00b9daec
