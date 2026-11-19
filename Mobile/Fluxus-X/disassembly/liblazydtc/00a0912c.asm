; bn_mod_sub_fixed_top @ 00a0912c
00a0912c	str x23,[sp, #-0x40]!
00a09130	stp x22,x21,[sp, #0x10]
00a09134	stp x20,x19,[sp, #0x20]
00a09138	stp x29,x30,[sp, #0x30]
00a0913c	ldr w20,[x3, #0x8]
00a09140	mov x23,x1
00a09144	add x29,sp,#0x30
00a09148	mov x21,x3
00a0914c	mov w1,w20
00a09150	mov x22,x2
00a09154	mov x19,x0
00a09158	bl 0x00c38e80
00a0915c	cbz x0,0x00a092a0
00a09160	ldr x9,[x23]
00a09164	ldr x8,[x19]
00a09168	ldr x10,[x22]
00a0916c	cmp x9,#0x0
00a09170	csel x12,x8,x9,eq
00a09174	cmp x10,#0x0
00a09178	csel x13,x8,x10,eq
00a0917c	cbz w20,0x00a09294
00a09180	ldpsw x17,x1,[x23, #0x8]
00a09184	ldpsw x18,x0,[x22, #0x8]
00a09188	mov w2,#0x1
00a0918c	mov x11,xzr
00a09190	mov x16,xzr
00a09194	mov x14,xzr
00a09198	mov x10,xzr
00a0919c	mov x15,xzr
00a091a0	sxtw x9,w20
00a091a4	neg x17,x17
00a091a8	neg x18,x18
00a091ac	sub x0,x2,x0
00a091b0	sub x1,x2,x1
00a091b4	ldr x2,[x12, x14, LSL #0x3]
00a091b8	ldr x3,[x13, x15, LSL #0x3]
00a091bc	add x4,x1,x16
00a091c0	add x14,x14,x4, LSR #0x3f
00a091c4	add x4,x17,x16
00a091c8	and x2,x2,x4, ASR #0x3f
00a091cc	add x4,x18,x16
00a091d0	and x3,x3,x4, ASR #0x3f
00a091d4	add x11,x2,x11
00a091d8	cmp x2,x3
00a091dc	sub x11,x11,x3
00a091e0	cset w2,cc
00a091e4	add x4,x0,x16
00a091e8	str x11,[x8, x16, LSL #0x3]
00a091ec	csel x10,x10,x2,eq
00a091f0	add x16,x16,#0x1
00a091f4	add x15,x15,x4, LSR #0x3f
00a091f8	cmp x16,x9
00a091fc	neg x11,x10
00a09200	b.cc 0x00a091b4
00a09204	cbz w20,0x00a09294
00a09208	ldr x12,[x21]
00a0920c	mov x14,xzr
00a09210	mov x13,xzr
00a09214	mov w15,#0x2
00a09218	lsl x16,x14,#0x3
00a0921c	ldr x17,[x12, x16#0x0]
00a09220	ldr x18,[x8, x16#0x0]
00a09224	add x14,x14,#0x1
00a09228	and x17,x17,x11
00a0922c	adds x13,x17,x13
00a09230	cset w17,cs
00a09234	csinc x0,x15,xzr,cs
00a09238	adds x18,x13,x18
00a0923c	csel x13,x17,x0,cc
00a09240	cmp x14,x9
00a09244	str x18,[x8, x16#0x0]
00a09248	b.cc 0x00a09218
00a0924c	cbz w20,0x00a09294
00a09250	mov x11,xzr
00a09254	mov x14,xzr
00a09258	sub x10,x13,x10
00a0925c	mov w13,#0x2
00a09260	lsl x15,x11,#0x3
00a09264	ldr x16,[x12, x15#0x0]
00a09268	ldr x17,[x8, x15#0x0]
00a0926c	add x11,x11,#0x1
00a09270	and x16,x16,x10
00a09274	adds x14,x16,x14
00a09278	cset w16,cs
00a0927c	csinc x18,x13,xzr,cs
00a09280	adds x17,x14,x17
00a09284	csel x14,x16,x18,cc
00a09288	cmp x11,x9
00a0928c	str x17,[x8, x15#0x0]
00a09290	b.cc 0x00a09260
00a09294	mov w0,#0x1
00a09298	str w20,[x19, #0x8]
00a0929c	str wzr,[x19, #0x10]
00a092a0	ldp x29,x30,[sp, #0x30]
00a092a4	ldp x20,x19,[sp, #0x20]
00a092a8	ldp x22,x21,[sp, #0x10]
00a092ac	ldr x23,[sp], #0x40
00a092b0	ret
