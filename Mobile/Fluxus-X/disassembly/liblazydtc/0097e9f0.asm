; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::setbuf @ 0097e9f0
0097e9f0	stp x22,x21,[sp, #-0x30]!
0097e9f4	stp x20,x19,[sp, #0x10]
0097e9f8	stp x29,x30,[sp, #0x20]
0097e9fc	add x29,sp,#0x20
0097ea00	ldrb w8,[x0, #0xa0]
0097ea04	mov x21,x2
0097ea08	mov x20,x1
0097ea0c	mov x19,x0
0097ea10	movi v0.2D,#0x0
0097ea14	stp q0,q0,[x0, #0x20]
0097ea18	str q0,[x0, #0x10]
0097ea1c	cbz w8,0x0097ea2c
0097ea20	ldr x0,[x19, #0x40]
0097ea24	cbz x0,0x0097ea2c
0097ea28	bl 0x00c333e0
0097ea2c	ldrb w8,[x19, #0xa1]
0097ea30	cbz w8,0x0097ea40
0097ea34	ldr x0,[x19, #0x68]
0097ea38	cbz x0,0x0097ea40
0097ea3c	bl 0x00c333e0
0097ea40	cmp x21,#0x9
0097ea44	str x21,[x19, #0x60]
0097ea48	b.cc 0x0097ea64
0097ea4c	ldrb w22,[x19, #0xa2]
0097ea50	cbz x20,0x0097ea9c
0097ea54	cbz w22,0x0097ea9c
0097ea58	str x20,[x19, #0x40]
0097ea5c	strb wzr,[x19, #0xa0]
0097ea60	b 0x0097ea80
0097ea64	ldrb w22,[x19, #0xa2]
0097ea68	add x8,x19,#0x58
0097ea6c	str x8,[x19, #0x40]
0097ea70	mov w8,#0x8
0097ea74	str x8,[x19, #0x60]
0097ea78	strb wzr,[x19, #0xa0]
0097ea7c	cbz w22,0x0097eab4
0097ea80	strb wzr,[x19, #0xa1]
0097ea84	stp xzr,xzr,[x19, #0x68]
0097ea88	mov x0,x19
0097ea8c	ldp x29,x30,[sp, #0x20]
0097ea90	ldp x20,x19,[sp, #0x10]
0097ea94	ldp x22,x21,[sp], #0x30
0097ea98	ret
0097ea9c	mov x0,x21
0097eaa0	bl 0x00c333f0
0097eaa4	mov w8,#0x1
0097eaa8	str x0,[x19, #0x40]
0097eaac	strb w8,[x19, #0xa0]
0097eab0	cbnz w22,0x0097ea80
0097eab4	cmp x21,#0x8
0097eab8	mov w8,#0x8
0097eabc	csel x0,x21,x8,gt
0097eac0	str x0,[x19, #0x70]
0097eac4	cbz x20,0x0097eadc
0097eac8	cmp x0,#0x8
0097eacc	b.cc 0x0097eadc
0097ead0	str x20,[x19, #0x68]
0097ead4	strb wzr,[x19, #0xa1]
0097ead8	b 0x0097ea88
0097eadc	bl 0x00c333f0
0097eae0	mov w8,#0x1
0097eae4	str x0,[x19, #0x68]
0097eae8	strb w8,[x19, #0xa1]
0097eaec	b 0x0097ea88
