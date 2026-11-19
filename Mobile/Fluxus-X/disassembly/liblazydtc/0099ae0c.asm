; std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::insert<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>> @ 0099ae0c
0099ae0c	str x27,[sp, #-0x60]!
0099ae10	stp x26,x25,[sp, #0x10]
0099ae14	stp x24,x23,[sp, #0x20]
0099ae18	stp x22,x21,[sp, #0x30]
0099ae1c	stp x20,x19,[sp, #0x40]
0099ae20	stp x29,x30,[sp, #0x50]
0099ae24	add x29,sp,#0x50
0099ae28	ldr x25,[x2]
0099ae2c	ldr x26,[x3]
0099ae30	mov x21,x2
0099ae34	mov x19,x1
0099ae38	mov x20,x0
0099ae3c	sub x27,x26,x25
0099ae40	cmp x25,x26
0099ae44	csel x9,xzr,x27,eq
0099ae48	cmp x9,#0x1
0099ae4c	b.lt 0x0099b104
0099ae50	ldp x8,x10,[x20, #0x8]
0099ae54	sub x11,x10,x8
0099ae58	cmp x9,x11
0099ae5c	b.le 0x0099ae9c
0099ae60	ldr x23,[x20]
0099ae64	sub x8,x8,x23
0099ae68	adds x8,x8,x9
0099ae6c	b.mi 0x0099b128
0099ae70	sub x9,x10,x23
0099ae74	orr x10,xzr,#0x3fffffffffffffff
0099ae78	cmp x9,x10
0099ae7c	sub x21,x19,x23
0099ae80	b.cs 0x0099aee0
0099ae84	lsl x9,x9,#0x1
0099ae88	cmp x9,x8
0099ae8c	csel x22,x8,x9,cc
0099ae90	cbnz x22,0x0099aee4
0099ae94	mov x24,xzr
0099ae98	b 0x0099aef0
0099ae9c	sub x11,x8,x19
0099aea0	cmp x9,x11
0099aea4	b.le 0x0099aed4
0099aea8	cmp x11,#0x1
0099aeac	b.lt 0x0099aff0
0099aeb0	mvn x10,x11
0099aeb4	cmn x10,#0x2
0099aeb8	orr x10,xzr,#-0x2
0099aebc	csinv x10,x10,x11,le
0099aec0	add x10,x11,x10
0099aec4	add x10,x25,x10
0099aec8	add x12,x10,#0x2
0099aecc	mov x25,x12
0099aed0	b 0x0099aff4
0099aed4	mov x10,x8
0099aed8	mov x25,x26
0099aedc	b 0x0099b024
0099aee0	orr x22,xzr,#0x7fffffffffffffff
0099aee4	mov x0,x22
0099aee8	bl 0x00c2fed0
0099aeec	mov x24,x0
0099aef0	cmp x25,x26
0099aef4	add x21,x24,x21
0099aef8	b.eq 0x0099af90
0099aefc	sub x8,x19,x25
0099af00	sub x8,x8,x23
0099af04	cmp x27,#0x20
0099af08	add x8,x26,x8
0099af0c	mov x9,x21
0099af10	mov x10,x25
0099af14	b.cc 0x0099af74
0099af18	cmp x21,x26
0099af1c	b.cs 0x0099af34
0099af20	add x9,x24,x8
0099af24	cmp x9,x25
0099af28	mov x9,x21
0099af2c	mov x10,x25
0099af30	b.hi 0x0099af74
0099af34	add x13,x19,#0x10
0099af38	and x11,x27,#-0x20
0099af3c	sub x13,x13,x23
0099af40	add x12,x25,#0x10
0099af44	add x9,x21,x11
0099af48	add x10,x25,x11
0099af4c	add x13,x24,x13
0099af50	mov x14,x11
0099af54	ldp q0,q1,[x12, #-0x10]
0099af58	add x12,x12,#0x20
0099af5c	subs x14,x14,#0x20
0099af60	stp q0,q1,[x13, #-0x10]
0099af64	add x13,x13,#0x20
0099af68	b.ne 0x0099af54
0099af6c	cmp x11,x27
0099af70	b.eq 0x0099af84
0099af74	ldrb w11,[x10], #0x1
0099af78	cmp x26,x10
0099af7c	strb w11,[x9], #0x1
0099af80	b.ne 0x0099af74
0099af84	ldr x23,[x20]
0099af88	add x25,x24,x8
0099af8c	b 0x0099af94
0099af90	mov x25,x21
0099af94	sub x2,x19,x23
0099af98	cmp x2,#0x1
0099af9c	sub x26,x21,x2
0099afa0	b.lt 0x0099afb0
0099afa4	mov x0,x26
0099afa8	mov x1,x23
0099afac	bl 0x00c2ffd0
0099afb0	ldr x8,[x20, #0x8]
0099afb4	add x22,x24,x22
0099afb8	sub x27,x8,x19
0099afbc	cmp x27,#0x1
0099afc0	b.lt 0x0099afd8
0099afc4	mov x0,x25
0099afc8	mov x1,x19
0099afcc	mov x2,x27
0099afd0	bl 0x00c2ffd0
0099afd4	add x25,x25,x27
0099afd8	stp x26,x25,[x20]
0099afdc	str x22,[x20, #0x10]
0099afe0	cbz x23,0x0099b108
0099afe4	mov x0,x23
0099afe8	bl 0x00c301d0
0099afec	b 0x0099b108
0099aff0	mov x12,x25
0099aff4	mov x10,x8
0099aff8	cmp x12,x26
0099affc	b.eq 0x0099b01c
0099b000	ldrb w13,[x12], #0x1
0099b004	strb w13,[x10]
0099b008	ldr x10,[x20, #0x8]
0099b00c	cmp x26,x12
0099b010	add x10,x10,#0x1
0099b014	str x10,[x20, #0x8]
0099b018	b.ne 0x0099b000
0099b01c	cmp x11,#0x1
0099b020	b.lt 0x0099b104
0099b024	add x11,x19,x9
0099b028	sub x9,x10,x9
0099b02c	cmp x9,x8
0099b030	sub x2,x10,x11
0099b034	b.cs 0x0099b06c
0099b038	sub x9,x11,x10
0099b03c	add x12,x10,x19
0099b040	sub x9,x9,x19
0099b044	add x8,x8,x9
0099b048	sub x9,x12,x11
0099b04c	mov x11,x10
0099b050	ldrb w12,[x9], #0x1
0099b054	subs x8,x8,#0x1
0099b058	strb w12,[x11]
0099b05c	ldr x11,[x20, #0x8]
0099b060	add x11,x11,#0x1
0099b064	str x11,[x20, #0x8]
0099b068	b.ne 0x0099b050
0099b06c	cbz x2,0x0099b07c
0099b070	sub x0,x10,x2
0099b074	mov x1,x19
0099b078	bl 0x00c2ff60
0099b07c	ldr x8,[x21]
0099b080	cmp x8,x25
0099b084	b.eq 0x0099b104
0099b088	sub x10,x25,x8
0099b08c	cmp x10,#0x20
0099b090	b.cs 0x0099b09c
0099b094	mov x9,x19
0099b098	b 0x0099b0f4
0099b09c	cmp x19,x25
0099b0a0	b.cs 0x0099b0b8
0099b0a4	sub x9,x19,x8
0099b0a8	add x9,x25,x9
0099b0ac	cmp x8,x9
0099b0b0	mov x9,x19
0099b0b4	b.cc 0x0099b0f4
0099b0b8	and x11,x10,#-0x20
0099b0bc	add x13,x19,#0x10
0099b0c0	add x12,x8,x11
0099b0c4	add x9,x19,x11
0099b0c8	add x8,x8,#0x10
0099b0cc	mov x14,x11
0099b0d0	ldp q0,q1,[x8, #-0x10]
0099b0d4	subs x14,x14,#0x20
0099b0d8	add x8,x8,#0x20
0099b0dc	stp q0,q1,[x13, #-0x10]
0099b0e0	add x13,x13,#0x20
0099b0e4	b.ne 0x0099b0d0
0099b0e8	cmp x10,x11
0099b0ec	mov x8,x12
0099b0f0	b.eq 0x0099b104
0099b0f4	ldrb w10,[x8], #0x1
0099b0f8	cmp x25,x8
0099b0fc	strb w10,[x9], #0x1
0099b100	b.ne 0x0099b0f4
0099b104	mov x21,x19
0099b108	mov x0,x21
0099b10c	ldp x29,x30,[sp, #0x50]
0099b110	ldp x20,x19,[sp, #0x40]
0099b114	ldp x22,x21,[sp, #0x30]
0099b118	ldp x24,x23,[sp, #0x20]
0099b11c	ldp x26,x25,[sp, #0x10]
0099b120	ldr x27,[sp], #0x60
0099b124	ret
0099b128	mov x0,x20
0099b12c	bl 0x00c30bd0
