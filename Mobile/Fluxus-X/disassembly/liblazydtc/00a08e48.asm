; bn_mod_add_fixed_top @ 00a08e48
00a08e48	sub sp,sp,#0xd0
00a08e4c	stp x26,x25,[sp, #0x80]
00a08e50	stp x24,x23,[sp, #0x90]
00a08e54	stp x22,x21,[sp, #0xa0]
00a08e58	stp x20,x19,[sp, #0xb0]
00a08e5c	stp x29,x30,[sp, #0xc0]
00a08e60	ldr w20,[x3, #0x8]
00a08e64	mov x24,x1
00a08e68	add x29,sp,#0xc0
00a08e6c	mov x22,x3
00a08e70	mov w1,w20
00a08e74	mov x23,x2
00a08e78	mov x19,x0
00a08e7c	bl 0x00c38e80
00a08e80	cbz x0,0x00a09008
00a08e84	cmp w20,#0x11
00a08e88	sxtw x25,w20
00a08e8c	b.cc 0x00a08ee4
00a08e90	adrp x1,0x2b4000
00a08e94	lsl x0,x25,#0x3
00a08e98	add x1,x1,#0x47
00a08e9c	mov w2,#0x41
00a08ea0	bl 0x00c32320
00a08ea4	mov x21,x0
00a08ea8	cbnz x0,0x00a08ee8
00a08eac	bl 0x00c342a0
00a08eb0	adrp x0,0x2b4000
00a08eb4	adrp x2,0x2a9000
00a08eb8	add x0,x0,#0x47
00a08ebc	add x2,x2,#0xfcd
00a08ec0	mov w1,#0x43
00a08ec4	bl 0x00c342b0
00a08ec8	mov w1,#0x100
00a08ecc	orr w0,wzr,#0x3
00a08ed0	movk w1,#0xc, LSL #16
00a08ed4	mov x2,xzr
00a08ed8	bl 0x00c342c0
00a08edc	mov w0,wzr
00a08ee0	b 0x00a09008
00a08ee4	mov x21,sp
00a08ee8	ldr x8,[x24]
00a08eec	ldr x9,[x23]
00a08ef0	cmp x8,#0x0
00a08ef4	csel x8,x21,x8,eq
00a08ef8	cmp x9,#0x0
00a08efc	csel x9,x21,x9,eq
00a08f00	cbz w20,0x00a08f84
00a08f04	ldpsw x13,x16,[x24, #0x8]
00a08f08	ldpsw x14,x15,[x23, #0x8]
00a08f0c	mov w17,#0x1
00a08f10	mov x12,xzr
00a08f14	mov x10,xzr
00a08f18	mov x11,xzr
00a08f1c	mov x26,xzr
00a08f20	neg x13,x13
00a08f24	neg x14,x14
00a08f28	sub x15,x17,x15
00a08f2c	sub x16,x17,x16
00a08f30	mov w17,#0x2
00a08f34	ldr x18,[x8, x10, LSL #0x3]
00a08f38	ldr x0,[x9, x11, LSL #0x3]
00a08f3c	add x1,x13,x12
00a08f40	and x18,x18,x1, ASR #0x3f
00a08f44	add x1,x14,x12
00a08f48	and x0,x0,x1, ASR #0x3f
00a08f4c	adds x18,x18,x26
00a08f50	cset w1,cs
00a08f54	csinc x2,x17,xzr,cs
00a08f58	adds x18,x0,x18
00a08f5c	add x0,x16,x12
00a08f60	str x18,[x21, x12, LSL #0x3]
00a08f64	add x18,x15,x12
00a08f68	add x12,x12,#0x1
00a08f6c	csel x26,x1,x2,cc
00a08f70	add x10,x10,x0, LSR #0x3f
00a08f74	cmp x12,x25
00a08f78	add x11,x11,x18, LSR #0x3f
00a08f7c	b.cc 0x00a08f34
00a08f80	b 0x00a08f88
00a08f84	mov x26,xzr
00a08f88	ldr x23,[x19]
00a08f8c	ldr x2,[x22]
00a08f90	mov x1,x21
00a08f94	mov w3,w20
00a08f98	mov x0,x23
00a08f9c	bl 0x00c38940
00a08fa0	cbz w20,0x00a08fdc
00a08fa4	sub x9,x26,x0
00a08fa8	mov x8,xzr
00a08fac	mvn x10,x9
00a08fb0	lsl x11,x8,#0x3
00a08fb4	ldr x12,[x21, x11#0x0]
00a08fb8	ldr x13,[x23, x11#0x0]
00a08fbc	add x8,x8,#0x1
00a08fc0	cmp x8,x25
00a08fc4	and x12,x12,x9
00a08fc8	and x13,x13,x10
00a08fcc	orr x12,x13,x12
00a08fd0	str x12,[x23, x11#0x0]
00a08fd4	str xzr,[x21, x11#0x0]
00a08fd8	b.cc 0x00a08fb0
00a08fdc	mov x8,sp
00a08fe0	cmp x21,x8
00a08fe4	str w20,[x19, #0x8]
00a08fe8	str wzr,[x19, #0x10]
00a08fec	b.eq 0x00a09004
00a08ff0	adrp x1,0x2b4000
00a08ff4	add x1,x1,#0x47
00a08ff8	mov w2,#0x63
00a08ffc	mov x0,x21
00a09000	bl 0x00c32310
00a09004	mov w0,#0x1
00a09008	ldp x29,x30,[sp, #0xc0]
00a0900c	ldp x20,x19,[sp, #0xb0]
00a09010	ldp x22,x21,[sp, #0xa0]
00a09014	ldp x24,x23,[sp, #0x90]
00a09018	ldp x26,x25,[sp, #0x80]
00a0901c	add sp,sp,#0xd0
00a09020	ret
