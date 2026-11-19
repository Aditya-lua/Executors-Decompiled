; FUN_0085ea84 @ 0085ea84
0085ea84	stp x29,x30,[sp, #-0x20]!
0085ea88	stp x20,x19,[sp, #0x10]
0085ea8c	mov x29,sp
0085ea90	mov x19,x2
0085ea94	cbz x2,0x0085eb14
0085ea98	mov x20,x1
0085ea9c	ldr x0,[x0, #0xe8]
0085eaa0	lsl x1,x19,#0x3
0085eaa4	bl 0x0084e938
0085eaa8	cmp x19,#0x4
0085eaac	mov x8,xzr
0085eab0	b.cc 0x0085eaf0
0085eab4	sub x9,x0,x20
0085eab8	cmp x9,#0x20
0085eabc	b.cc 0x0085eaf0
0085eac0	and x8,x19,#-0x4
0085eac4	add x9,x0,#0x10
0085eac8	add x10,x20,#0x10
0085eacc	mov x11,x8
0085ead0	ldp q0,q1,[x10, #-0x10]
0085ead4	subs x11,x11,#0x4
0085ead8	add x10,x10,#0x20
0085eadc	stp q0,q1,[x9, #-0x10]
0085eae0	add x9,x9,#0x20
0085eae4	b.ne 0x0085ead0
0085eae8	cmp x19,x8
0085eaec	b.eq 0x0085eb18
0085eaf0	lsl x10,x8,#0x3
0085eaf4	sub x8,x19,x8
0085eaf8	add x9,x20,x10
0085eafc	add x10,x0,x10
0085eb00	ldr x11,[x9], #0x8
0085eb04	subs x8,x8,#0x1
0085eb08	str x11,[x10], #0x8
0085eb0c	b.ne 0x0085eb00
0085eb10	b 0x0085eb18
0085eb14	mov x0,xzr
0085eb18	mov x1,x19
0085eb1c	ldp x20,x19,[sp, #0x10]
0085eb20	ldp x29,x30,[sp], #0x20
0085eb24	ret
