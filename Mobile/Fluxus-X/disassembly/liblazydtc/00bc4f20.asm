; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert @ 00bc4f20
00bc4f20	paciasp
00bc4f24	stp x29,x30,[sp, #-0x60]!
00bc4f28	str x27,[sp, #0x10]
00bc4f2c	stp x26,x25,[sp, #0x20]
00bc4f30	stp x24,x23,[sp, #0x30]
00bc4f34	stp x22,x21,[sp, #0x40]
00bc4f38	stp x20,x19,[sp, #0x50]
00bc4f3c	mov x29,sp
00bc4f40	ldp x10,x11,[x0]
00bc4f44	mov w20,w2
00bc4f48	ldrb w9,[x0]
00bc4f4c	ldr x8,[x0, #0x10]
00bc4f50	mov x19,x0
00bc4f54	add x26,x0,#0x1
00bc4f58	and x12,x10,#-0x2
00bc4f5c	lsr x13,x9,#0x1
00bc4f60	tst w9,#0x1
00bc4f64	sub x12,x12,#0x1
00bc4f68	mov w9,#0x16
00bc4f6c	csinc x25,x8,x0,ne
00bc4f70	csel x27,x13,x11,eq
00bc4f74	csel x9,x9,x12,eq
00bc4f78	sub x21,x1,x25
00bc4f7c	cmp x9,x27
00bc4f80	and w9,w10,#0xff
00bc4f84	b.ne 0x00bc4fd0
00bc4f88	cmn x27,#0x9
00bc4f8c	b.eq 0x00bc50a8
00bc4f90	tst w9,#0x1
00bc4f94	mov x9,#-0xe
00bc4f98	mov x22,x1
00bc4f9c	movk x9,#0x7fff, LSL #48
00bc4fa0	csel x23,x26,x8,eq
00bc4fa4	cmp x27,x9
00bc4fa8	b.hi 0x00bc4ff0
00bc4fac	lsl x8,x27,#0x1
00bc4fb0	mov w9,#0x1a
00bc4fb4	orr x8,x8,#0x7
00bc4fb8	cmp x8,#0x17
00bc4fbc	csinc x8,x9,x8,eq
00bc4fc0	cmp x27,#0xc
00bc4fc4	mov w9,#0x17
00bc4fc8	csel x24,x9,x8,cc
00bc4fcc	b 0x00bc4ff4
00bc4fd0	tst w9,#0x1
00bc4fd4	csel x22,x26,x8,eq
00bc4fd8	subs x2,x27,x21
00bc4fdc	b.eq 0x00bc5054
00bc4fe0	add x1,x22,x21
00bc4fe4	add x0,x1,#0x1
00bc4fe8	bl 0x00c2ff60
00bc4fec	b 0x00bc5054
00bc4ff0	mov x24,#-0x9
00bc4ff4	mov x0,x24
00bc4ff8	bl 0x00c2fed0
00bc4ffc	cmp x22,x25
00bc5000	mov x22,x0
00bc5004	b.eq 0x00bc5018
00bc5008	mov x0,x22
00bc500c	mov x1,x23
00bc5010	mov x2,x21
00bc5014	bl 0x00c2ff60
00bc5018	subs x2,x27,x21
00bc501c	b.eq 0x00bc5030
00bc5020	add x8,x22,x21
00bc5024	add x1,x23,x21
00bc5028	add x0,x8,#0x1
00bc502c	bl 0x00c2ff60
00bc5030	add x25,x27,#0x1
00bc5034	cmp x25,#0x17
00bc5038	b.eq 0x00bc5048
00bc503c	mov x0,x23
00bc5040	mov x1,x25
00bc5044	bl 0x00c2fe80
00bc5048	orr x8,x24,#0x1
00bc504c	stp x25,x22,[x19, #0x8]
00bc5050	str x8,[x19]
00bc5054	add x9,x27,#0x1
00bc5058	strb w20,[x22, x21]
00bc505c	strb wzr,[x22, x9]
00bc5060	ldrb w8,[x19]
00bc5064	tbnz w8,#0x0,0x00bc5074
00bc5068	lsl w9,w9,#0x1
00bc506c	strb w9,[x19]
00bc5070	b 0x00bc5078
00bc5074	str x9,[x19, #0x8]
00bc5078	ldr x9,[x19, #0x10]
00bc507c	tst w8,#0x1
00bc5080	csel x8,x26,x9,eq
00bc5084	add x0,x21,x8
00bc5088	ldp x20,x19,[sp, #0x50]
00bc508c	ldr x27,[sp, #0x10]
00bc5090	ldp x22,x21,[sp, #0x40]
00bc5094	ldp x24,x23,[sp, #0x30]
00bc5098	ldp x26,x25,[sp, #0x20]
00bc509c	ldp x29,x30,[sp], #0x60
00bc50a0	autiasp
00bc50a4	ret
00bc50a8	bl 0x007fe124
