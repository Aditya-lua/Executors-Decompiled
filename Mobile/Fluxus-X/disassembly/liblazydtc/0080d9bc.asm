; FUN_0080d9bc @ 0080d9bc
0080d9bc	ldr x10,[x0, #0x8]
0080d9c0	ldr x9,[x1, #0x8]
0080d9c4	fmov d0,x10
0080d9c8	cnt v0.8B,v0.8B
0080d9cc	addv b0,v0.8B
0080d9d0	fmov x14,d0
0080d9d4	cmp x14,#0x1
0080d9d8	b.hi 0x0080d9e8
0080d9dc	sub x11,x10,#0x1
0080d9e0	and x9,x11,x9
0080d9e4	b 0x0080d9f8
0080d9e8	cmp x9,x10
0080d9ec	b.cc 0x0080d9f8
0080d9f0	udiv x11,x9,x10
0080d9f4	msub x9,x11,x10,x9
0080d9f8	ldr x13,[x0]
0080d9fc	ldr x12,[x13, x9, LSL #0x3]
0080da00	mov x11,x12
0080da04	ldr x12,[x12]
0080da08	cmp x12,x1
0080da0c	b.ne 0x0080da00
0080da10	add x12,x0,#0x10
0080da14	cmp x11,x12
0080da18	b.eq 0x0080da4c
0080da1c	ldr x15,[x11, #0x8]
0080da20	cmp x14,#0x1
0080da24	b.hi 0x0080da34
0080da28	sub x16,x10,#0x1
0080da2c	and x15,x15,x16
0080da30	b 0x0080da44
0080da34	cmp x15,x10
0080da38	b.cc 0x0080da44
0080da3c	udiv x16,x15,x10
0080da40	msub x15,x16,x10,x15
0080da44	cmp x15,x9
0080da48	b.eq 0x0080da88
0080da4c	ldr x15,[x1]
0080da50	cbz x15,0x0080da84
0080da54	ldr x15,[x15, #0x8]
0080da58	cmp x14,#0x1
0080da5c	b.hi 0x0080da6c
0080da60	sub x16,x10,#0x1
0080da64	and x15,x15,x16
0080da68	b 0x0080da7c
0080da6c	cmp x15,x10
0080da70	b.cc 0x0080da7c
0080da74	udiv x16,x15,x10
0080da78	msub x15,x16,x10,x15
0080da7c	cmp x15,x9
0080da80	b.eq 0x0080da88
0080da84	str xzr,[x13, x9, LSL #0x3]
0080da88	ldr x15,[x1]
0080da8c	cbz x15,0x0080dac8
0080da90	ldr x16,[x15, #0x8]
0080da94	cmp x14,#0x1
0080da98	b.hi 0x0080daa8
0080da9c	sub x10,x10,#0x1
0080daa0	and x16,x16,x10
0080daa4	b 0x0080dab8
0080daa8	cmp x16,x10
0080daac	b.cc 0x0080dab8
0080dab0	udiv x14,x16,x10
0080dab4	msub x16,x14,x10,x16
0080dab8	cmp x16,x9
0080dabc	b.eq 0x0080dac8
0080dac0	str x11,[x13, x16, LSL #0x3]
0080dac4	ldr x15,[x1]
0080dac8	ldr x9,[x0, #0x18]
0080dacc	str x15,[x11]
0080dad0	str xzr,[x1]
0080dad4	sub x9,x9,#0x1
0080dad8	stp x1,x12,[x8]
0080dadc	str x9,[x0, #0x18]
0080dae0	mov w9,#0x1
0080dae4	strb w9,[x8, #0x10]
0080dae8	stur wzr,[x8, #0x11]
0080daec	str wzr,[x8, #0x14]
0080daf0	ret
