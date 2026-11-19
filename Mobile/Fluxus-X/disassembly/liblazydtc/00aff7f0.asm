; FUN_00aff7f0 @ 00aff7f0
00aff7f0	sub sp,sp,#0x160
00aff7f4	stp x26,x25,[sp, #0x110]
00aff7f8	stp x24,x23,[sp, #0x120]
00aff7fc	stp x22,x21,[sp, #0x130]
00aff800	stp x20,x19,[sp, #0x140]
00aff804	stp x29,x30,[sp, #0x150]
00aff808	ldr w8,[x1]
00aff80c	mov w19,#0x33
00aff810	str x28,[sp, #0x100]
00aff814	add x29,sp,#0x150
00aff818	cmp w8,#0x7
00aff81c	b.hi 0x00afffbc
00aff820	adrp x9,0x77b000
00aff824	add x9,x9,#0x5e8
00aff828	ldrsw x8,[x9, x8, LSL #0x2]
00aff82c	add x8,x8,x9
00aff830	br x8
00aff834	cmp w0,#0x1
00aff838	b.ne 0x00affc3c
00aff83c	ldr x8,[x1, #0x8]
00aff840	ldr x9,[x2, #0x8]
00aff844	orr w10,wzr,#0xff
00aff848	ldr x21,[x8, #0x8]
00aff84c	stur x10,[x29, #-0x48]
00aff850	ldrsw x19,[x9]
00aff854	ldr x20,[x9, #0x8]
00aff858	cmp w19,#0x1
00aff85c	b.lt 0x00aff874
00aff860	mov x0,x20
00aff864	mov w1,wzr
00aff868	mov x2,x19
00aff86c	bl 0x00c300a0
00aff870	cbnz x0,0x00affc34
00aff874	adrp x2,0x2bc000
00aff878	add x2,x2,#0x5f4
00aff87c	mov w3,#0x28c
00aff880	mov x0,x20
00aff884	mov x1,x19
00aff888	bl 0x00c36180
00aff88c	cbz x0,0x00affb8c
00aff890	ldr w8,[x21]
00aff894	mov x20,x0
00aff898	cmp w8,#0xc
00aff89c	b.ne 0x00affde4
00aff8a0	ldr x19,[x21, #0x8]
00aff8a4	orr x9,xzr,#-0x100000000
00aff8a8	ldrsw x8,[x19]
00aff8ac	ldr x21,[x19, #0x8]
00aff8b0	add x11,x9,x8, LSL #0x20
00aff8b4	sub x10,x8,#0x1
00aff8b8	add x12,x10,#0x1
00aff8bc	cmp x12,#0x1
00aff8c0	mov x12,x11
00aff8c4	b.lt 0x00affd20
00aff8c8	ldrb w13,[x21, x10]
00aff8cc	add x11,x12,x9
00aff8d0	sub w8,w8,#0x1
00aff8d4	sub x10,x10,#0x1
00aff8d8	cmp w13,#0x40
00aff8dc	b.ne 0x00aff8b8
00aff8e0	b 0x00affd24
00aff8e4	ldr x8,[x2, #0x8]
00aff8e8	ldr x9,[x1, #0x8]
00aff8ec	orr x11,xzr,#-0x100000000
00aff8f0	mov x10,xzr
00aff8f4	ldr x22,[x8, #0x8]
00aff8f8	ldrsw x23,[x8]
00aff8fc	ldr x19,[x9, #0x8]
00aff900	mov x20,x22
00aff904	and x8,x23,#0xffffffff
00aff908	add x14,x11,x23, LSL #0x20
00aff90c	add x12,x22,x23
00aff910	add x13,x23,x10
00aff914	cmp x13,#0x1
00aff918	mov x13,x14
00aff91c	b.lt 0x00affb94
00aff920	add x14,x12,x10
00aff924	ldurb w15,[x14, #-0x1]
00aff928	add x14,x13,x11
00aff92c	sub x10,x10,#0x1
00aff930	cmp w15,#0x40
00aff934	b.ne 0x00aff910
00aff938	b 0x00affb9c
00aff93c	ldr x8,[x2, #0x8]
00aff940	ldrsw x10,[x8]
00aff944	cbz w10,0x00afffb8
00aff948	ldr x9,[x1, #0x8]
00aff94c	ldr w11,[x9]
00aff950	cmp w11,w10
00aff954	b.lt 0x00afffb0
00aff958	ldr x8,[x8, #0x8]
00aff95c	ldr x9,[x9, #0x8]
00aff960	cmp w11,w10
00aff964	b.le 0x00aff988
00aff968	ldrb w12,[x8]
00aff96c	sub w11,w11,w10
00aff970	add x9,x9,w11, SXTW 
00aff974	cmp w12,#0x2e
00aff978	b.eq 0x00aff988
00aff97c	ldurb w11,[x9, #-0x1]
00aff980	cmp w11,#0x2e
00aff984	b.ne 0x00afffb0
00aff988	neg x10,x10
00aff98c	ldrb w12,[x8]
00aff990	ldrb w11,[x9]
00aff994	cmp w12,w11
00aff998	b.eq 0x00aff9c8
00aff99c	sub w13,w12,#0x41
00aff9a0	add w14,w12,#0x20
00aff9a4	sub w15,w11,#0x41
00aff9a8	cmp w13,#0x1a
00aff9ac	add w16,w11,#0x20
00aff9b0	csel w12,w14,w12,cc
00aff9b4	cmp w15,#0x1a
00aff9b8	and w12,w12,#0xff
00aff9bc	csel w11,w16,w11,cc
00aff9c0	cmp w12,w11, UXTB 
00aff9c4	b.ne 0x00afffb0
00aff9c8	mov w19,wzr
00aff9cc	add x8,x8,#0x1
00aff9d0	adds x10,x10,#0x1
00aff9d4	add x9,x9,#0x1
00aff9d8	b.ne 0x00aff98c
00aff9dc	b 0x00afffbc
00aff9e0	ldr x20,[x1, #0x8]
00aff9e4	ldr x21,[x2, #0x8]
00aff9e8	ldr w8,[x20, #0x8]
00aff9ec	cbz w8,0x00affa00
00aff9f0	mov x0,x20
00aff9f4	mov x1,xzr
00aff9f8	bl 0x00c350f0
00aff9fc	tbnz w0,#0x1f,0x00affb8c
00affa00	ldr w8,[x21, #0x8]
00affa04	cbz w8,0x00affa18
00affa08	mov x0,x21
00affa0c	mov x1,xzr
00affa10	bl 0x00c350f0
00affa14	tbnz w0,#0x1f,0x00affb8c
00affa18	ldrsw x2,[x21, #0x20]
00affa1c	ldr w8,[x20, #0x20]
00affa20	mov w19,#0x2f
00affa24	cmp w2,w8
00affa28	b.gt 0x00afffbc
00affa2c	ldr x0,[x21, #0x18]
00affa30	ldr x1,[x20, #0x18]
00affa34	bl 0x00c300b0
00affa38	cmp w0,#0x0
00affa3c	csel w19,wzr,w19,eq
00affa40	b 0x00afffbc
00affa44	ldr x8,[x1, #0x8]
00affa48	ldr x24,[x2, #0x8]
00affa4c	mov w1,#0x3a
00affa50	ldr x21,[x8, #0x8]
00affa54	ldrsw x22,[x8]
00affa58	ldr x23,[x24, #0x8]
00affa5c	mov x0,x21
00affa60	mov x2,x22
00affa64	bl 0x00c300a0
00affa68	cbz x0,0x00affc34
00affa6c	add x25,x22,x21
00affa70	sub x8,x25,x0
00affa74	mov x19,x0
00affa78	cmp x8,#0x3
00affa7c	b.lt 0x00affc34
00affa80	ldrb w8,[x19, #0x1]
00affa84	cmp w8,#0x2f
00affa88	b.ne 0x00affc34
00affa8c	ldrb w8,[x19, #0x2]
00affa90	cmp w8,#0x2f
00affa94	b.ne 0x00affc34
00affa98	add x20,x19,#0x3
00affa9c	sub x8,x21,x20
00affaa0	add x21,x8,x22
00affaa4	mov w1,#0x3a
00affaa8	mov x0,x20
00affaac	mov x2,x21
00affab0	bl 0x00c300a0
00affab4	cbnz x0,0x00affad0
00affab8	mov w1,#0x2f
00affabc	mov x0,x20
00affac0	mov x2,x21
00affac4	bl 0x00c300a0
00affac8	cbnz x0,0x00affad0
00affacc	mov x0,x25
00affad0	sub x9,x0,x20
00affad4	cbz w9,0x00affc34
00affad8	ldrsw x10,[x24]
00affadc	cmp w10,#0x1
00affae0	b.lt 0x00affe00
00affae4	ldrb w8,[x23]
00affae8	cmp w8,#0x2e
00affaec	b.ne 0x00affe00
00affaf0	cmp w10,w9
00affaf4	b.ge 0x00afffb0
00affaf8	orr w11,wzr,#0x3
00affafc	add x8,x23,#0x1
00affb00	add x9,x19,w9, SXTW 
00affb04	sub x10,x11,x10
00affb08	mov w11,#0x2e
00affb0c	b 0x00affcd8
00affb10	ldr x9,[x1, #0x8]
00affb14	ldr x11,[x2, #0x8]
00affb18	ldr w10,[x9]
00affb1c	ldr x8,[x9, #0x8]
00affb20	ldr x9,[x11, #0x8]
00affb24	ldr w11,[x11]
00affb28	cmp w10,#0x10
00affb2c	b.eq 0x00affb38
00affb30	cmp w10,#0x4
00affb34	b.ne 0x00affc34
00affb38	cmp w11,#0x20
00affb3c	b.eq 0x00affb48
00affb40	cmp w11,#0x8
00affb44	b.ne 0x00affc34
00affb48	sxtw x10,w10
00affb4c	lsl w12,w10,#0x1
00affb50	cmp w12,w11
00affb54	b.ne 0x00afffb0
00affb58	mov x11,xzr
00affb5c	add x12,x9,x10
00affb60	ldrb w13,[x8, x11]
00affb64	ldrb w14,[x9, x11]
00affb68	ldrb w15,[x12, x11]
00affb6c	eor w13,w14,w13
00affb70	tst w13,w15
00affb74	b.ne 0x00afffb0
00affb78	add x11,x11,#0x1
00affb7c	cmp x11,x10
00affb80	mov w19,wzr
00affb84	b.lt 0x00affb60
00affb88	b 0x00afffbc
00affb8c	mov w19,#0x11
00affb90	b 0x00afffbc
00affb94	cmn w8,w10
00affb98	b.eq 0x00affc44
00affb9c	add x25,x22,x13, ASR #0x20
00affba0	ldrsw x24,[x9]
00affba4	orr x11,xzr,#-0x100000000
00affba8	mov x10,xzr
00affbac	and x9,x24,#0xffffffff
00affbb0	add x14,x11,x24, LSL #0x20
00affbb4	add x12,x19,x24
00affbb8	add x13,x24,x10
00affbbc	cmp x13,#0x1
00affbc0	mov x13,x14
00affbc4	b.lt 0x00affbe4
00affbc8	add x14,x12,x10
00affbcc	ldurb w15,[x14, #-0x1]
00affbd0	add x14,x13,x11
00affbd4	sub x10,x10,#0x1
00affbd8	cmp w15,#0x40
00affbdc	b.ne 0x00affbb8
00affbe0	b 0x00affbec
00affbe4	cmn w9,w10
00affbe8	b.eq 0x00affc34
00affbec	asr x21,x13,#0x20
00affbf0	adds x26,x19,x21
00affbf4	b.eq 0x00affc34
00affbf8	cbz x25,0x00affc4c
00affbfc	subs x8,x25,x22
00affc00	b.eq 0x00afff30
00affc04	cmp x8,x21
00affc08	b.ne 0x00afffb0
00affc0c	mov x0,x20
00affc10	mov w1,wzr
00affc14	mov x2,x21
00affc18	bl 0x00c300a0
00affc1c	cbnz x0,0x00affc34
00affc20	mov x0,x19
00affc24	mov w1,wzr
00affc28	mov x2,x21
00affc2c	bl 0x00c300a0
00affc30	cbz x0,0x00afff1c
00affc34	mov w19,#0x35
00affc38	b 0x00afffbc
00affc3c	mov w19,#0x33
00affc40	b 0x00afffbc
00affc44	mov x25,xzr
00affc48	b 0x00affba0
00affc4c	cmp w23,#0x1
00affc50	b.lt 0x00afff34
00affc54	ldrb w10,[x20]
00affc58	cmp w10,#0x2e
00affc5c	b.ne 0x00afff34
00affc60	cmp w9,w8
00affc64	b.le 0x00afffb0
00affc68	neg x8,x23
00affc6c	add x9,x19,x24
00affc70	add x10,x22,#0x1
00affc74	mov w11,#0x2e
00affc78	b 0x00affc84
00affc7c	ldrb w11,[x10], #0x1
00affc80	add x8,x8,#0x1
00affc84	ldrb w12,[x9, x8]
00affc88	and w13,w11,#0xff
00affc8c	cmp w13,w12
00affc90	b.eq 0x00affcc4
00affc94	sub w13,w11,#0x41
00affc98	and w13,w13,#0xff
00affc9c	add w14,w11,#0x20
00affca0	sub w15,w12,#0x41
00affca4	cmp w13,#0x1a
00affca8	add w16,w12,#0x20
00affcac	csel w11,w14,w11,cc
00affcb0	cmp w15,#0x1a
00affcb4	and w11,w11,#0xff
00affcb8	csel w12,w16,w12,cc
00affcbc	cmp w11,w12, UXTB 
00affcc0	b.ne 0x00afffb0
00affcc4	cmn x8,#0x1
00affcc8	b.ne 0x00affc7c
00affccc	b 0x00afffb8
00affcd0	ldrb w11,[x8], #0x1
00affcd4	add x10,x10,#0x1
00affcd8	ldrb w12,[x9, x10]
00affcdc	cmp w12,w11, UXTB 
00affce0	b.eq 0x00affd14
00affce4	sub w13,w12,#0x41
00affce8	sub w15,w11,#0x41
00affcec	add w14,w12,#0x20
00affcf0	cmp w13,#0x1a
00affcf4	and w13,w15,#0xff
00affcf8	add w16,w11,#0x20
00affcfc	csel w12,w14,w12,cc
00affd00	cmp w13,#0x1a
00affd04	and w12,w12,#0xff
00affd08	csel w11,w16,w11,cc
00affd0c	cmp w12,w11, UXTB 
00affd10	b.ne 0x00afffb0
00affd14	cmp x10,#0x2
00affd18	b.ne 0x00affcd0
00affd1c	b 0x00afffb8
00affd20	cbz w8,0x00affde4
00affd24	adds x22,x21,x12, ASR #0x20
00affd28	b.eq 0x00affde4
00affd2c	mov x0,sp
00affd30	mov w2,#0x100
00affd34	mov w1,wzr
00affd38	mov x23,sp
00affd3c	bl 0x00c301c0
00affd40	ldrb w8,[x20]
00affd44	cmp w8,#0x2e
00affd48	b.ne 0x00affe6c
00affd4c	orr w9,wzr,#0xfe
00affd50	orr x1,x23,#0x1
00affd54	sub x2,x29,#0x48
00affd58	mov x0,x20
00affd5c	strb w8,[sp]
00affd60	stur x9,[x29, #-0x48]
00affd64	bl 0x00c3ec30
00affd68	cmp w0,#0x1
00affd6c	b.lt 0x00afff0c
00affd70	ldrsw x19,[x19]
00affd74	mov x0,sp
00affd78	bl 0x00c2ff50
00affd7c	cmp x0,x19
00affd80	b.cs 0x00afff14
00affd84	cbz x0,0x00afffe0
00affd88	mov x8,sp
00affd8c	neg x9,x0
00affd90	add x10,x21,x19
00affd94	ldrb w12,[x8]
00affd98	ldrb w11,[x10, x9]
00affd9c	cmp w12,w11
00affda0	b.eq 0x00affdd0
00affda4	sub w13,w12,#0x41
00affda8	add w14,w12,#0x20
00affdac	sub w15,w11,#0x41
00affdb0	cmp w13,#0x1a
00affdb4	add w16,w11,#0x20
00affdb8	csel w12,w14,w12,cc
00affdbc	cmp w15,#0x1a
00affdc0	and w12,w12,#0xff
00affdc4	csel w11,w16,w11,cc
00affdc8	cmp w12,w11, UXTB 
00affdcc	b.ne 0x00afff14
00affdd0	mov w19,wzr
00affdd4	adds x9,x9,#0x1
00affdd8	add x8,x8,#0x1
00affddc	b.ne 0x00affd94
00affde0	b 0x00affde8
00affde4	mov w19,#0x35
00affde8	adrp x1,0x2bc000
00affdec	add x1,x1,#0x5f4
00affdf0	mov w2,#0x2c0
00affdf4	mov x0,x20
00affdf8	bl 0x00c32310
00affdfc	b 0x00afffbc
00affe00	cmp w10,w9
00affe04	b.ne 0x00afffb0
00affe08	lsl x8,x9,#0x20
00affe0c	cbz x8,0x00afffb8
00affe10	mov x8,xzr
00affe14	sub x8,x8,w9, SXTW 
00affe18	ldrb w10,[x20]
00affe1c	ldrb w9,[x23]
00affe20	cmp w10,w9
00affe24	b.eq 0x00affe54
00affe28	sub w11,w10,#0x41
00affe2c	add w12,w10,#0x20
00affe30	sub w13,w9,#0x41
00affe34	cmp w11,#0x1a
00affe38	add w14,w9,#0x20
00affe3c	csel w10,w12,w10,cc
00affe40	cmp w13,#0x1a
00affe44	and w10,w10,#0xff
00affe48	csel w9,w14,w9,cc
00affe4c	cmp w10,w9, UXTB 
00affe50	b.ne 0x00afffb0
00affe54	mov w19,wzr
00affe58	add x20,x20,#0x1
00affe5c	adds x8,x8,#0x1
00affe60	add x23,x23,#0x1
00affe64	b.ne 0x00affe18
00affe68	b 0x00afffbc
00affe6c	mov x1,sp
00affe70	sub x2,x29,#0x48
00affe74	mov x0,x20
00affe78	bl 0x00c3ec30
00affe7c	cmp w0,#0x1
00affe80	b.lt 0x00afff0c
00affe84	ldr x23,[x19, #0x8]
00affe88	ldrsw x19,[x19]
00affe8c	add x21,x22,#0x1
00affe90	mov x0,sp
00affe94	sub x8,x23,x21
00affe98	add x22,x8,x19
00affe9c	bl 0x00c2ff50
00affea0	cmp x22,x0
00affea4	b.ne 0x00afff14
00affea8	cbz x22,0x00afffe0
00affeac	sub x9,x21,x23
00affeb0	mov x8,sp
00affeb4	sub x9,x9,x19
00affeb8	ldrb w11,[x8]
00affebc	ldrb w10,[x21]
00affec0	cmp w11,w10
00affec4	b.eq 0x00affef4
00affec8	sub w12,w11,#0x41
00affecc	add w13,w11,#0x20
00affed0	sub w14,w10,#0x41
00affed4	cmp w12,#0x1a
00affed8	add w15,w10,#0x20
00affedc	csel w11,w13,w11,cc
00affee0	cmp w14,#0x1a
00affee4	and w11,w11,#0xff
00affee8	csel w10,w15,w10,cc
00affeec	cmp w11,w10, UXTB 
00affef0	b.ne 0x00afff14
00affef4	mov w19,wzr
00affef8	add x8,x8,#0x1
00affefc	adds x9,x9,#0x1
00afff00	add x21,x21,#0x1
00afff04	b.ne 0x00affeb8
00afff08	b 0x00affde8
00afff0c	mov w19,#0x1
00afff10	b 0x00affde8
00afff14	mov w19,#0x2f
00afff18	b 0x00affde8
00afff1c	mov x0,x20
00afff20	mov x1,x19
00afff24	mov x2,x21
00afff28	bl 0x00c31bb0
00afff2c	cbnz w0,0x00afffb0
00afff30	add x20,x25,#0x1
00afff34	add x8,x26,#0x1
00afff38	sub x9,x23,x20
00afff3c	add x10,x24,x19
00afff40	add x9,x9,x22
00afff44	sub x10,x10,x8
00afff48	cmp x9,x10
00afff4c	b.ne 0x00afffb0
00afff50	cbz x9,0x00afffb8
00afff54	sub x9,x20,x23
00afff58	sub x9,x9,x22
00afff5c	ldrb w11,[x20]
00afff60	ldrb w10,[x8]
00afff64	cmp w11,w10
00afff68	b.eq 0x00afff98
00afff6c	sub w12,w11,#0x41
00afff70	add w13,w11,#0x20
00afff74	sub w14,w10,#0x41
00afff78	cmp w12,#0x1a
00afff7c	add w15,w10,#0x20
00afff80	csel w11,w13,w11,cc
00afff84	cmp w14,#0x1a
00afff88	and w11,w11,#0xff
00afff8c	csel w10,w15,w10,cc
00afff90	cmp w11,w10, UXTB 
00afff94	b.ne 0x00afffb0
00afff98	mov w19,wzr
00afff9c	add x20,x20,#0x1
00afffa0	adds x9,x9,#0x1
00afffa4	add x8,x8,#0x1
00afffa8	b.ne 0x00afff5c
00afffac	b 0x00afffbc
00afffb0	mov w19,#0x2f
00afffb4	b 0x00afffbc
00afffb8	mov w19,wzr
00afffbc	mov w0,w19
00afffc0	ldp x29,x30,[sp, #0x150]
00afffc4	ldp x20,x19,[sp, #0x140]
00afffc8	ldp x22,x21,[sp, #0x130]
00afffcc	ldp x24,x23,[sp, #0x120]
00afffd0	ldp x26,x25,[sp, #0x110]
00afffd4	ldr x28,[sp, #0x100]
00afffd8	add sp,sp,#0x160
00afffdc	ret
00afffe0	mov w19,wzr
00afffe4	b 0x00affde8
