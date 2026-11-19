; v2i_ASN1_BIT_STRING @ 00afe9cc
00afe9cc	stp x26,x25,[sp, #-0x50]!
00afe9d0	stp x24,x23,[sp, #0x10]
00afe9d4	stp x22,x21,[sp, #0x20]
00afe9d8	stp x20,x19,[sp, #0x30]
00afe9dc	stp x29,x30,[sp, #0x40]
00afe9e0	add x29,sp,#0x40
00afe9e4	mov x20,x2
00afe9e8	mov x21,x0
00afe9ec	bl 0x00c38040
00afe9f0	mov x19,x0
00afe9f4	cbz x0,0x00afea94
00afe9f8	mov x0,x20
00afe9fc	bl 0x00c325e0
00afea00	cmp w0,#0x1
00afea04	b.lt 0x00afeb08
00afea08	mov w22,wzr
00afea0c	mov x0,x20
00afea10	mov w1,w22
00afea14	bl 0x00c32610
00afea18	ldr x8,[x21, #0x60]
00afea1c	mov x23,x0
00afea20	ldr x25,[x8, #0x8]
00afea24	cbz x25,0x00afeac8
00afea28	ldr x24,[x23, #0x8]
00afea2c	add x26,x8,#0x10
00afea30	ldr x0,[x26]
00afea34	mov x1,x24
00afea38	bl 0x00c301f0
00afea3c	cbz w0,0x00afea60
00afea40	mov x0,x25
00afea44	mov x1,x24
00afea48	bl 0x00c301f0
00afea4c	cbz w0,0x00afea60
00afea50	ldr x25,[x26, #0x10]
00afea54	add x26,x26,#0x18
00afea58	cbnz x25,0x00afea30
00afea5c	b 0x00afeac8
00afea60	ldur w1,[x26, #-0x10]
00afea64	mov w2,#0x1
00afea68	mov x0,x19
00afea6c	bl 0x00c373d0
00afea70	cbz w0,0x00afeb24
00afea74	ldur x8,[x26, #-0x8]
00afea78	cbz x8,0x00afeac8
00afea7c	mov x0,x20
00afea80	add w22,w22,#0x1
00afea84	bl 0x00c325e0
00afea88	cmp w22,w0
00afea8c	b.lt 0x00afea0c
00afea90	b 0x00afeb08
00afea94	bl 0x00c342a0
00afea98	adrp x0,0x2ac000
00afea9c	adrp x2,0x2a4000
00afeaa0	add x0,x0,#0x866
00afeaa4	add x2,x2,#0x9f2
00afeaa8	mov w1,#0x43
00afeaac	bl 0x00c342b0
00afeab0	mov w1,#0x100
00afeab4	mov w0,#0x22
00afeab8	movk w1,#0xc, LSL #16
00afeabc	mov x2,xzr
00afeac0	bl 0x00c342c0
00afeac4	b 0x00afeb08
00afeac8	bl 0x00c342a0
00afeacc	adrp x0,0x2ac000
00afead0	adrp x2,0x2a4000
00afead4	add x0,x0,#0x866
00afead8	add x2,x2,#0x9f2
00afeadc	mov w1,#0x54
00afeae0	bl 0x00c342b0
00afeae4	ldr x3,[x23, #0x8]
00afeae8	adrp x2,0x2b6000
00afeaec	add x2,x2,#0xc62
00afeaf0	mov w0,#0x22
00afeaf4	mov w1,#0x6f
00afeaf8	bl 0x00c342c0
00afeafc	mov x0,x19
00afeb00	bl 0x00c38030
00afeb04	mov x19,xzr
00afeb08	mov x0,x19
00afeb0c	ldp x29,x30,[sp, #0x40]
00afeb10	ldp x20,x19,[sp, #0x30]
00afeb14	ldp x22,x21,[sp, #0x20]
00afeb18	ldp x24,x23,[sp, #0x10]
00afeb1c	ldp x26,x25,[sp], #0x50
00afeb20	ret
00afeb24	bl 0x00c342a0
00afeb28	adrp x0,0x2ac000
00afeb2c	adrp x2,0x2a4000
00afeb30	add x0,x0,#0x866
00afeb34	add x2,x2,#0x9f2
00afeb38	mov w1,#0x4c
00afeb3c	bl 0x00c342b0
00afeb40	mov w1,#0x100
00afeb44	mov w0,#0x22
00afeb48	movk w1,#0xc, LSL #16
00afeb4c	mov x2,xzr
00afeb50	bl 0x00c342c0
00afeb54	b 0x00afeafc
