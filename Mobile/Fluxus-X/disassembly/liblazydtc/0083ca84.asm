; FUN_0083ca84 @ 0083ca84
0083ca84	sub sp,sp,#0x70
0083ca88	stp x29,x30,[sp, #0x20]
0083ca8c	stp x26,x25,[sp, #0x30]
0083ca90	stp x24,x23,[sp, #0x40]
0083ca94	stp x22,x21,[sp, #0x50]
0083ca98	stp x20,x19,[sp, #0x60]
0083ca9c	add x29,sp,#0x20
0083caa0	mrs x22,tpidr_el0
0083caa4	mov x19,x0
0083caa8	mov x21,x3
0083caac	ldr x8,[x22, #0x28]
0083cab0	stur x8,[x29, #-0x8]
0083cab4	ldr x23,[x0, #0x8]
0083cab8	ldr x24,[x1]
0083cabc	cbz x23,0x0083cae4
0083cac0	fmov d0,x23
0083cac4	cnt v0.8B,v0.8B
0083cac8	addv b0,v0.8B
0083cacc	fmov x8,d0
0083cad0	cmp x8,#0x1
0083cad4	b.hi 0x0083cae8
0083cad8	sub x9,x23,#0x1
0083cadc	and x26,x9,x24
0083cae0	b 0x0083cafc
0083cae4	b 0x0083cb60
0083cae8	cmp x24,x23
0083caec	mov x26,x24
0083caf0	b.cc 0x0083cafc
0083caf4	udiv x9,x24,x23
0083caf8	msub x26,x9,x23,x24
0083cafc	ldr x9,[x19]
0083cb00	ldr x9,[x9, x26, LSL #0x3]
0083cb04	cbz x9,0x0083cb60
0083cb08	ldr x20,[x9]
0083cb0c	cbz x20,0x0083cb60
0083cb10	sub x9,x23,#0x1
0083cb14	b 0x0083cb2c
0083cb18	ldr x10,[x20, #0x10]
0083cb1c	cmp x10,x24
0083cb20	b.eq 0x0083cc90
0083cb24	ldr x20,[x20]
0083cb28	cbz x20,0x0083cb60
0083cb2c	ldr x10,[x20, #0x8]
0083cb30	cmp x10,x24
0083cb34	b.eq 0x0083cb18
0083cb38	cmp x8,#0x1
0083cb3c	b.hi 0x0083cb48
0083cb40	and x10,x10,x9
0083cb44	b 0x0083cb58
0083cb48	cmp x10,x23
0083cb4c	b.cc 0x0083cb58
0083cb50	udiv x11,x10,x23
0083cb54	msub x10,x11,x23,x10
0083cb58	cmp x10,x26
0083cb5c	b.eq 0x0083cb24
0083cb60	mov w0,#0x40
0083cb64	add x25,x19,#0x10
0083cb68	bl 0x00c2fed0
0083cb6c	ldr x9,[x19, #0x18]
0083cb70	movi v1.2D,#0x0
0083cb74	ldr x8,[x21]
0083cb78	stp xzr,x24,[x0]
0083cb7c	mov x20,x0
0083cb80	mov w10,#0x1
0083cb84	add x9,x9,#0x1
0083cb88	ldr x8,[x8]
0083cb8c	stp x25,x10,[sp, #0x8]
0083cb90	ucvtf s0,x9
0083cb94	stur q1,[x0, #0x28]
0083cb98	stur q1,[x0, #0x18]
0083cb9c	ldr s1,[x19, #0x20]
0083cba0	str x8,[x0, #0x10]
0083cba4	mov w8,#0x3f800000
0083cba8	str w8,[x0, #0x38]
0083cbac	cbz x23,0x0083cbc0
0083cbb0	ucvtf s2,x23
0083cbb4	fmul s2,s1,s2
0083cbb8	fcmp s2,s0
0083cbbc	b.pl 0x0083ccdc
0083cbc0	lsl x8,x23,#0x1
0083cbc4	cmp x23,#0x3
0083cbc8	b.cc 0x0083cbdc
0083cbcc	sub x9,x23,#0x1
0083cbd0	tst x23,x9
0083cbd4	cset w9,ne
0083cbd8	b 0x0083cbe0
0083cbdc	mov w9,#0x1
0083cbe0	fdiv s0,s0,s1
0083cbe4	orr x8,x9,x8
0083cbe8	mov x26,sp
0083cbec	fcvtpu x10,s0
0083cbf0	cmp x8,x10
0083cbf4	csel x21,x8,x10,hi
0083cbf8	subs x8,x21,#0x1
0083cbfc	b.ne 0x0083cc08
0083cc00	mov w21,#0x2
0083cc04	b 0x0083cc20
0083cc08	tst x21,x8
0083cc0c	b.eq 0x0083cc20
0083cc10	mov x0,x21
0083cc14	bl 0x00c301b0
0083cc18	ldr x23,[x19, #0x8]
0083cc1c	mov x21,x0
0083cc20	cmp x21,x23
0083cc24	b.ls 0x0083cc38
0083cc28	mov x0,x19
0083cc2c	mov x1,x21
0083cc30	bl 0x0083cdb0
0083cc34	b 0x0083ccac
0083cc38	b.cs 0x0083ccac
0083cc3c	ldr x8,[x19, #0x18]
0083cc40	ldr s1,[x19, #0x20]
0083cc44	cmp x23,#0x3
0083cc48	ucvtf s0,x8
0083cc4c	fdiv s0,s0,s1
0083cc50	fcvtpu x0,s0
0083cc54	b.cc 0x0083cc98
0083cc58	fmov d0,x23
0083cc5c	cnt v0.8B,v0.8B
0083cc60	addv b0,v0.8B
0083cc64	fmov x8,d0
0083cc68	cmp x8,#0x1
0083cc6c	b.hi 0x0083cc98
0083cc70	sub x8,x0,#0x1
0083cc74	mov w9,#0x1
0083cc78	cmp x0,#0x2
0083cc7c	clz x8,x8
0083cc80	neg x8,x8
0083cc84	lsl x8,x9,x8
0083cc88	csel x0,x0,x8,cc
0083cc8c	b 0x0083cc9c
0083cc90	mov x1,xzr
0083cc94	b 0x0083cd04
0083cc98	bl 0x00c301b0
0083cc9c	cmp x21,x0
0083cca0	csel x21,x21,x0,hi
0083cca4	cmp x21,x23
0083cca8	b.cc 0x0083cc28
0083ccac	ldr x23,[x19, #0x8]
0083ccb0	sub x8,x23,#0x1
0083ccb4	tst x23,x8
0083ccb8	b.ne 0x0083ccc4
0083ccbc	and x26,x8,x24
0083ccc0	b 0x0083ccdc
0083ccc4	cmp x24,x23
0083ccc8	b.cs 0x0083ccd4
0083cccc	mov x26,x24
0083ccd0	b 0x0083ccdc
0083ccd4	udiv x8,x24,x23
0083ccd8	msub x26,x8,x23,x24
0083ccdc	ldr x8,[x19]
0083cce0	ldr x9,[x8, x26, LSL #0x3]
0083cce4	cbz x9,0x0083cd34
0083cce8	ldr x8,[x9]
0083ccec	str x8,[x20]
0083ccf0	str x20,[x9]
0083ccf4	ldr x8,[x19, #0x18]
0083ccf8	mov w1,#0x1
0083ccfc	add x8,x8,#0x1
0083cd00	str x8,[x19, #0x18]
0083cd04	ldr x8,[x22, #0x28]
0083cd08	ldur x9,[x29, #-0x8]
0083cd0c	cmp x8,x9
0083cd10	b.ne 0x0083cdac
0083cd14	mov x0,x20
0083cd18	ldp x20,x19,[sp, #0x60]
0083cd1c	ldp x22,x21,[sp, #0x50]
0083cd20	ldp x24,x23,[sp, #0x40]
0083cd24	ldp x26,x25,[sp, #0x30]
0083cd28	ldp x29,x30,[sp, #0x20]
0083cd2c	add sp,sp,#0x70
0083cd30	ret
0083cd34	ldr x9,[x25]
0083cd38	str x20,[x25]
0083cd3c	str x9,[x20]
0083cd40	str x25,[x8, x26, LSL #0x3]
0083cd44	ldr x9,[x20]
0083cd48	cbz x9,0x0083ccf4
0083cd4c	sub x10,x23,#0x1
0083cd50	ldr x9,[x9, #0x8]
0083cd54	tst x23,x10
0083cd58	b.ne 0x0083cd68
0083cd5c	and x9,x9,x10
0083cd60	str x20,[x8, x9, LSL #0x3]
0083cd64	b 0x0083ccf4
0083cd68	cmp x9,x23
0083cd6c	b.cc 0x0083cd78
0083cd70	udiv x10,x9,x23
0083cd74	msub x9,x10,x23,x9
0083cd78	str x20,[x8, x9, LSL #0x3]
0083cd7c	b 0x0083ccf4
0083cdac	bl 0x00c2fec0
