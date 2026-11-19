; FUN_00bdf898 @ 00bdf898
00bdf898	paciasp
00bdf89c	sub sp,sp,#0x1e0
00bdf8a0	stp x29,x30,[sp, #0x180]
00bdf8a4	stp x28,x27,[sp, #0x190]
00bdf8a8	stp x26,x25,[sp, #0x1a0]
00bdf8ac	stp x24,x23,[sp, #0x1b0]
00bdf8b0	stp x22,x21,[sp, #0x1c0]
00bdf8b4	stp x20,x19,[sp, #0x1d0]
00bdf8b8	add x29,sp,#0x180
00bdf8bc	ldr w8,[x3, #0x8]
00bdf8c0	mov w9,#0x4a
00bdf8c4	mov x25,x3
00bdf8c8	mov x20,x2
00bdf8cc	mov x21,x1
00bdf8d0	sub x27,x29,#0xb0
00bdf8d4	ands w8,w8,w9
00bdf8d8	stp x5,x4,[sp, #0x10]
00bdf8dc	b.eq 0x00bdf900
00bdf8e0	cmp w8,#0x40
00bdf8e4	b.eq 0x00bdf8f8
00bdf8e8	cmp w8,#0x8
00bdf8ec	b.ne 0x00bdf908
00bdf8f0	mov w23,#0x10
00bdf8f4	b 0x00bdf90c
00bdf8f8	mov w23,#0x8
00bdf8fc	b 0x00bdf90c
00bdf900	mov w23,wzr
00bdf904	b 0x00bdf90c
00bdf908	mov w23,#0xa
00bdf90c	sub x2,x29,#0x74
00bdf910	mov x1,x25
00bdf914	bl 0x00c0cb44
00bdf918	mov x24,x0
00bdf91c	sub x8,x29,#0x90
00bdf920	sub x1,x29,#0xc
00bdf924	mov x0,x25
00bdf928	bl 0x00c0cc28
00bdf92c	stp xzr,xzr,[x27, #0x8]
00bdf930	str xzr,[x27, #0x18]
00bdf934	sub x0,x29,#0xa8
00bdf938	mov w1,#0x16
00bdf93c	mov w2,wzr
00bdf940	sub x19,x29,#0xa8
00bdf944	bl 0x00c30250
00bdf948	ldurb w8,[x29, #-0xa8]
00bdf94c	ldr x9,[x27, #0x18]
00bdf950	add x10,sp,#0x30
00bdf954	orr x28,x19,#0x1
00bdf958	add x22,sp,#0x28
00bdf95c	str x10,[sp, #0x28]
00bdf960	tst w8,#0x1
00bdf964	str wzr,[sp, #0x24]
00bdf968	csinc x25,x9,x19,ne
00bdf96c	mov w19,#0x16
00bdf970	str x25,[x27]
00bdf974	b 0x00bdf980
00bdf978	add x8,x8,#0x4
00bdf97c	str x8,[x21, #0x18]
00bdf980	cbz x21,0x00bdf998
00bdf984	ldp x8,x9,[x21, #0x18]
00bdf988	cmp x8,x9
00bdf98c	b.eq 0x00bdf9a8
00bdf990	ldr w0,[x8]
00bdf994	b 0x00bdf9b8
00bdf998	mov w26,#0x1
00bdf99c	cbnz x20,0x00bdf9c8
00bdf9a0	tbz w26,#0x0,0x00bdfa00
00bdf9a4	b 0x00bdfb44
00bdf9a8	ldr x8,[x21]
00bdf9ac	ldr x8,[x8, #0x48]
00bdf9b0	mov x0,x21
00bdf9b4	blr x8
00bdf9b8	cmn w0,#0x1
00bdf9bc	cset w26,eq
00bdf9c0	csel x21,xzr,x21,eq
00bdf9c4	cbz x20,0x00bdf9a0
00bdf9c8	ldp x8,x9,[x20, #0x18]
00bdf9cc	cmp x8,x9
00bdf9d0	b.eq 0x00bdf9dc
00bdf9d4	ldr w0,[x8]
00bdf9d8	b 0x00bdf9ec
00bdf9dc	ldr x8,[x20]
00bdf9e0	ldr x8,[x8, #0x48]
00bdf9e4	mov x0,x20
00bdf9e8	blr x8
00bdf9ec	cmn w0,#0x1
00bdf9f0	cset w8,eq
00bdf9f4	csel x20,xzr,x20,eq
00bdf9f8	cmp w26,w8
00bdf9fc	b.eq 0x00bdfb44
00bdfa00	ldurb w8,[x29, #-0xa8]
00bdfa04	ldr x9,[x27, #0x10]
00bdfa08	ldr x11,[x27]
00bdfa0c	lsr x10,x8,#0x1
00bdfa10	tst w8,#0x1
00bdfa14	csel x26,x10,x9,eq
00bdfa18	add x9,x25,x26
00bdfa1c	cmp x11,x9
00bdfa20	b.ne 0x00bdfad8
00bdfa24	cmp x26,#0x1
00bdfa28	b.lt 0x00bdfa40
00bdfa2c	sub x0,x29,#0xa8
00bdfa30	mov x1,x26
00bdfa34	mov w2,wzr
00bdfa38	bl 0x00c30250
00bdfa3c	b 0x00bdfa64
00bdfa40	lsl x9,x26,#0x1
00bdfa44	tbnz w8,#0x0,0x00bdfa58
00bdfa48	lsl w8,w9,#0x1
00bdfa4c	sturb w8,[x29, #-0xa8]
00bdfa50	mov x8,x28
00bdfa54	b 0x00bdfa60
00bdfa58	ldr x8,[x27, #0x18]
00bdfa5c	str x9,[x27, #0x10]
00bdfa60	strb wzr,[x8, x9]
00bdfa64	ldp x9,x10,[x27, #0x8]
00bdfa68	ldurb w8,[x29, #-0xa8]
00bdfa6c	tst w8,#0x1
00bdfa70	and x11,x9,#-0x2
00bdfa74	ubfx x12,x9,#0x1,#0x7
00bdfa78	sub x11,x11,#0x1
00bdfa7c	csel x8,x19,x11,eq
00bdfa80	tst x9,#0x1
00bdfa84	csel x10,x12,x10,eq
00bdfa88	subs x1,x8,x10
00bdfa8c	b.ls 0x00bdfaa0
00bdfa90	sub x0,x29,#0xa8
00bdfa94	mov w2,wzr
00bdfa98	bl 0x00c30250
00bdfa9c	b 0x00bdfac0
00bdfaa0	tbnz w9,#0x0,0x00bdfab4
00bdfaa4	lsl w9,w8,#0x1
00bdfaa8	sturb w9,[x29, #-0xa8]
00bdfaac	mov x9,x28
00bdfab0	b 0x00bdfabc
00bdfab4	ldr x9,[x27, #0x18]
00bdfab8	str x8,[x27, #0x10]
00bdfabc	strb wzr,[x9, x8]
00bdfac0	ldurb w8,[x29, #-0xa8]
00bdfac4	ldr x9,[x27, #0x18]
00bdfac8	tst w8,#0x1
00bdfacc	csel x25,x28,x9,eq
00bdfad0	add x8,x25,x26
00bdfad4	str x8,[x27]
00bdfad8	ldp x8,x9,[x21, #0x18]
00bdfadc	cmp x8,x9
00bdfae0	b.eq 0x00bdfaec
00bdfae4	ldr w0,[x8]
00bdfae8	b 0x00bdfafc
00bdfaec	ldr x8,[x21]
00bdfaf0	ldr x8,[x8, #0x48]
00bdfaf4	mov x0,x21
00bdfaf8	blr x8
00bdfafc	ldur w5,[x29, #-0xc]
00bdfb00	sub x3,x29,#0xb0
00bdfb04	add x4,sp,#0x24
00bdfb08	sub x6,x29,#0x90
00bdfb0c	add x7,sp,#0x30
00bdfb10	mov w1,w23
00bdfb14	mov x2,x25
00bdfb18	stp x22,x24,[sp]
00bdfb1c	bl 0x00c44120
00bdfb20	cbnz w0,0x00bdfb44
00bdfb24	ldp x8,x9,[x21, #0x18]
00bdfb28	cmp x8,x9
00bdfb2c	b.ne 0x00bdf978
00bdfb30	ldr x8,[x21]
00bdfb34	ldr x8,[x8, #0x50]
00bdfb38	mov x0,x21
00bdfb3c	blr x8
00bdfb40	b 0x00bdf980
00bdfb44	ldurb w8,[x29, #-0x90]
00bdfb48	ldr x9,[x27, #0x28]
00bdfb4c	ldr x22,[sp, #0x18]
00bdfb50	lsr x10,x8,#0x1
00bdfb54	tst w8,#0x1
00bdfb58	csel x8,x10,x9,eq
00bdfb5c	cbz x8,0x00bdfb80
00bdfb60	ldr x8,[sp, #0x28]
00bdfb64	add x9,sp,#0x30
00bdfb68	sub x9,x8,x9
00bdfb6c	cmp x9,#0x9f
00bdfb70	b.gt 0x00bdfb80
00bdfb74	ldr w9,[sp, #0x24]
00bdfb78	str w9,[x8], #0x4
00bdfb7c	str x8,[sp, #0x28]
00bdfb80	ldr x1,[x27]
00bdfb84	mov x0,x25
00bdfb88	mov x2,x22
00bdfb8c	mov w3,w23
00bdfb90	bl 0x00c0c0d4
00bdfb94	ldurb w10,[x29, #-0x90]
00bdfb98	ldr x12,[sp, #0x28]
00bdfb9c	add x11,sp,#0x30
00bdfba0	ldr x8,[x27, #0x28]
00bdfba4	lsr x9,x10,#0x1
00bdfba8	ands w13,w10,#0x1
00bdfbac	sub x11,x12,x11
00bdfbb0	csel x8,x9,x8,eq
00bdfbb4	ldr x9,[sp, #0x10]
00bdfbb8	cmp x11,#0x5
00bdfbbc	str x0,[x9]
00bdfbc0	b.lt 0x00bdfd20
00bdfbc4	cbz x8,0x00bdfd20
00bdfbc8	sub x8,x12,#0x4
00bdfbcc	add x9,sp,#0x30
00bdfbd0	cmp x9,x8
00bdfbd4	cset w11,cc
00bdfbd8	cmp x9,x12
00bdfbdc	b.eq 0x00bdfc8c
00bdfbe0	cbz w11,0x00bdfc8c
00bdfbe4	add x10,sp,#0x30
00bdfbe8	sub x14,x12,#0x8
00bdfbec	add x11,x10,#0x4
00bdfbf0	cmp x14,x11
00bdfbf4	csel x13,x14,x11,hi
00bdfbf8	sub x13,x13,#0x4
00bdfbfc	cmp x13,x10
00bdfc00	cinc x15,x10,ne
00bdfc04	cmp x13,x10
00bdfc08	sub x15,x13,x15
00bdfc0c	lsr x15,x15,#0x3
00bdfc10	cinc x13,x15,ne
00bdfc14	cmp x13,#0x13
00bdfc18	b.cc 0x00bdfc60
00bdfc1c	cmp x14,x11
00bdfc20	csel x14,x14,x11,hi
00bdfc24	sub x14,x14,#0x4
00bdfc28	cmp x14,x10
00bdfc2c	cinc x15,x10,ne
00bdfc30	cmp x14,x10
00bdfc34	sub x15,x14,x15
00bdfc38	lsr x15,x15,#0x3
00bdfc3c	cinc x14,x15,ne
00bdfc40	cmp x10,x12
00bdfc44	b.cs 0x00bdfe00
00bdfc48	lsl x14,x14,#0x2
00bdfc4c	sub x15,x12,x14
00bdfc50	add x11,x11,x14
00bdfc54	sub x14,x15,#0x4
00bdfc58	cmp x14,x11
00bdfc5c	b.cs 0x00bdfe00
00bdfc60	mov x11,x8
00bdfc64	add x10,x10,#0x4
00bdfc68	ldr w12,[x11]
00bdfc6c	ldur w13,[x10, #-0x4]
00bdfc70	stur w12,[x10, #-0x4]
00bdfc74	str w13,[x11], #-0x4
00bdfc78	cmp x10,x11
00bdfc7c	add x10,x10,#0x4
00bdfc80	b.cc 0x00bdfc68
00bdfc84	ldurb w10,[x29, #-0x90]
00bdfc88	and w13,w10,#0x1
00bdfc8c	ldr x11,[x27, #0x30]
00bdfc90	cmp w13,#0x0
00bdfc94	sub x12,x29,#0x90
00bdfc98	csinc x11,x11,x12,ne
00bdfc9c	cmp x9,x8
00bdfca0	b.cs 0x00bdfcf8
00bdfca4	lsr w9,w10,#0x1
00bdfca8	ldr x10,[x27, #0x28]
00bdfcac	cmp w13,#0x0
00bdfcb0	csel x9,x9,x10,eq
00bdfcb4	add x10,sp,#0x30
00bdfcb8	add x9,x11,x9
00bdfcbc	b 0x00bdfcd8
00bdfcc0	sub x12,x9,x11
00bdfcc4	add x10,x10,#0x4
00bdfcc8	cmp x12,#0x1
00bdfccc	cinc x11,x11,gt
00bdfcd0	cmp x10,x8
00bdfcd4	b.cs 0x00bdfcf8
00bdfcd8	ldrb w12,[x11]
00bdfcdc	cbz w12,0x00bdfcc0
00bdfce0	cmp w12,#0xff
00bdfce4	b.eq 0x00bdfcc0
00bdfce8	ldr w13,[x10]
00bdfcec	cmp w13,w12
00bdfcf0	b.eq 0x00bdfcc0
00bdfcf4	b 0x00bdfd18
00bdfcf8	ldrb w9,[x11]
00bdfcfc	cbz w9,0x00bdfd20
00bdfd00	cmp w9,#0xff
00bdfd04	b.eq 0x00bdfd20
00bdfd08	ldr w8,[x8]
00bdfd0c	sub w8,w8,#0x1
00bdfd10	cmp w8,w9
00bdfd14	b.cc 0x00bdfd20
00bdfd18	mov w8,#0x4
00bdfd1c	str w8,[x22]
00bdfd20	cbz x21,0x00bdfd38
00bdfd24	ldp x8,x9,[x21, #0x18]
00bdfd28	cmp x8,x9
00bdfd2c	b.eq 0x00bdfd48
00bdfd30	ldr w0,[x8]
00bdfd34	b 0x00bdfd58
00bdfd38	mov w19,#0x1
00bdfd3c	cbnz x20,0x00bdfd68
00bdfd40	tbnz w19,#0x0,0x00bdfd9c
00bdfd44	b 0x00bdfda8
00bdfd48	ldr x8,[x21]
00bdfd4c	ldr x8,[x8, #0x48]
00bdfd50	mov x0,x21
00bdfd54	blr x8
00bdfd58	cmn w0,#0x1
00bdfd5c	cset w19,eq
00bdfd60	csel x21,xzr,x21,eq
00bdfd64	cbz x20,0x00bdfd40
00bdfd68	ldp x8,x9,[x20, #0x18]
00bdfd6c	cmp x8,x9
00bdfd70	b.eq 0x00bdfd7c
00bdfd74	ldr w0,[x8]
00bdfd78	b 0x00bdfd8c
00bdfd7c	ldr x8,[x20]
00bdfd80	ldr x8,[x8, #0x48]
00bdfd84	mov x0,x20
00bdfd88	blr x8
00bdfd8c	cmn w0,#0x1
00bdfd90	cset w8,eq
00bdfd94	eor w8,w19,w8
00bdfd98	tbnz w8,#0x0,0x00bdfda8
00bdfd9c	ldr w8,[x22]
00bdfda0	orr w8,w8,#0x2
00bdfda4	str w8,[x22]
00bdfda8	ldurb w8,[x29, #-0xa8]
00bdfdac	tbz w8,#0x0,0x00bdfdc0
00bdfdb0	ldr x8,[x27, #0x8]
00bdfdb4	ldr x0,[x27, #0x18]
00bdfdb8	and x1,x8,#-0x2
00bdfdbc	bl 0x00c2fe80
00bdfdc0	ldurb w8,[x29, #-0x90]
00bdfdc4	tbz w8,#0x0,0x00bdfdd8
00bdfdc8	ldr x8,[x27, #0x20]
00bdfdcc	ldr x0,[x27, #0x30]
00bdfdd0	and x1,x8,#-0x2
00bdfdd4	bl 0x00c2fe80
00bdfdd8	mov x0,x21
00bdfddc	ldp x20,x19,[sp, #0x1d0]
00bdfde0	ldp x22,x21,[sp, #0x1c0]
00bdfde4	ldp x24,x23,[sp, #0x1b0]
00bdfde8	ldp x26,x25,[sp, #0x1a0]
00bdfdec	ldp x28,x27,[sp, #0x190]
00bdfdf0	ldp x29,x30,[sp, #0x180]
00bdfdf4	add sp,sp,#0x1e0
00bdfdf8	autiasp
00bdfdfc	ret
00bdfe00	add x13,x13,#0x1
00bdfe04	add x15,sp,#0x30
00bdfe08	sub x12,x12,#0x10
00bdfe0c	and x14,x13,#0x7ffffffffffffff8
00bdfe10	lsl x10,x14,#0x2
00bdfe14	mov x16,x14
00bdfe18	sub x11,x8,x10
00bdfe1c	add x10,x15,x10
00bdfe20	add x15,x15,#0x10
00bdfe24	ldp q1,q0,[x12, #-0x10]
00bdfe28	sub x16,x16,#0x8
00bdfe2c	ldp q2,q3,[x15, #-0x10]
00bdfe30	rev64 v0.4S,v0.4S
00bdfe34	rev64 v1.4S,v1.4S
00bdfe38	rev64 v2.4S,v2.4S
00bdfe3c	rev64 v3.4S,v3.4S
00bdfe40	ext v0.16B,v0.16B,v0.16B,0x8
00bdfe44	ext v1.16B,v1.16B,v1.16B,0x8
00bdfe48	ext v2.16B,v2.16B,v2.16B,0x8
00bdfe4c	ext v3.16B,v3.16B,v3.16B,0x8
00bdfe50	stp q0,q1,[x15, #-0x10]
00bdfe54	add x15,x15,#0x20
00bdfe58	stp q3,q2,[x12, #-0x10]
00bdfe5c	sub x12,x12,#0x20
00bdfe60	cbnz x16,0x00bdfe24
00bdfe64	cmp x13,x14
00bdfe68	b.eq 0x00bdfc84
00bdfe6c	b 0x00bdfc64
