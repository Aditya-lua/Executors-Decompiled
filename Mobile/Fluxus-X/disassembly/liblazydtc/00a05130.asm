; bn_add_words @ 00a05130
00a05130	cmp w3,#0x1
00a05134	b.lt 0x00a0520c
00a05138	mov x8,x0
00a0513c	mov x0,xzr
00a05140	subs w11,w3,#0x4
00a05144	b.cc 0x00a05214
00a05148	and w9,w11,#0xfffffffc
00a0514c	add x12,x9,#0x4
00a05150	lsl x10,x12,#0x3
00a05154	add x9,x1,x10
00a05158	add x10,x8,x10
00a0515c	mov w13,#0x2
00a05160	mov x14,x2
00a05164	ldr x15,[x1]
00a05168	ldr x16,[x14]
00a0516c	sub w3,w3,#0x4
00a05170	adds x15,x15,x0
00a05174	cset w17,cs
00a05178	csinc x18,x13,xzr,cs
00a0517c	adds x15,x15,x16
00a05180	str x15,[x8]
00a05184	ldr x15,[x1, #0x8]
00a05188	csel x16,x17,x18,cc
00a0518c	ldr x17,[x14, #0x8]
00a05190	adds x15,x16,x15
00a05194	cset w16,cs
00a05198	csinc x18,x13,xzr,cs
00a0519c	adds x15,x15,x17
00a051a0	str x15,[x8, #0x8]
00a051a4	ldr x15,[x1, #0x10]
00a051a8	ldr x17,[x14, #0x10]
00a051ac	csel x16,x16,x18,cc
00a051b0	adds x15,x16,x15
00a051b4	cset w16,cs
00a051b8	csinc x18,x13,xzr,cs
00a051bc	adds x15,x15,x17
00a051c0	str x15,[x8, #0x10]
00a051c4	ldr x15,[x1, #0x18]
00a051c8	ldr x17,[x14, #0x18]
00a051cc	csel x16,x16,x18,cc
00a051d0	add x1,x1,#0x20
00a051d4	adds x15,x16,x15
00a051d8	cset w16,cs
00a051dc	csinc x18,x13,xzr,cs
00a051e0	adds x15,x15,x17
00a051e4	add x14,x14,#0x20
00a051e8	csel x0,x16,x18,cc
00a051ec	str x15,[x8, #0x18]
00a051f0	cmp w3,#0x3
00a051f4	add x8,x8,#0x20
00a051f8	b.hi 0x00a05164
00a051fc	ands w3,w11,#0x3
00a05200	b.eq 0x00a05248
00a05204	add x2,x2,x12, LSL #0x3
00a05208	b 0x00a0521c
00a0520c	mov x0,xzr
00a05210	ret
00a05214	mov x9,x1
00a05218	mov x10,x8
00a0521c	mov w8,#0x2
00a05220	ldr x11,[x9], #0x8
00a05224	ldr x12,[x2], #0x8
00a05228	adds x11,x11,x0
00a0522c	cset w13,cs
00a05230	csinc x14,x8,xzr,cs
00a05234	adds x11,x11,x12
00a05238	csel x0,x13,x14,cc
00a0523c	subs w3,w3,#0x1
00a05240	str x11,[x10], #0x8
00a05244	b.ne 0x00a05220
00a05248	ret
