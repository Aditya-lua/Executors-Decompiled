; FUN_00bdb6f4 @ 00bdb6f4
00bdb6f4	paciasp
00bdb6f8	sub sp,sp,#0x180
00bdb6fc	stp x29,x30,[sp, #0x120]
00bdb700	stp x28,x27,[sp, #0x130]
00bdb704	stp x26,x25,[sp, #0x140]
00bdb708	stp x24,x23,[sp, #0x150]
00bdb70c	stp x22,x21,[sp, #0x160]
00bdb710	stp x20,x19,[sp, #0x170]
00bdb714	add x29,sp,#0x120
00bdb718	ldr w8,[x3, #0x8]
00bdb71c	mov w9,#0x4a
00bdb720	mov x22,x4
00bdb724	mov x0,x3
00bdb728	mov x21,x2
00bdb72c	mov x19,x1
00bdb730	ands w8,w8,w9
00bdb734	sub x26,x29,#0x48
00bdb738	str x5,[sp, #0x18]
00bdb73c	b.eq 0x00bdb760
00bdb740	cmp w8,#0x40
00bdb744	b.eq 0x00bdb758
00bdb748	cmp w8,#0x8
00bdb74c	b.ne 0x00bdb768
00bdb750	mov w23,#0x10
00bdb754	b 0x00bdb76c
00bdb758	mov w23,#0x8
00bdb75c	b 0x00bdb76c
00bdb760	mov w23,wzr
00bdb764	b 0x00bdb76c
00bdb768	mov w23,#0xa
00bdb76c	sub x8,x29,#0x28
00bdb770	sub x1,x29,#0xc
00bdb774	bl 0x00c0bec0
00bdb778	stp xzr,xzr,[x26, #0x8]
00bdb77c	str xzr,[x26, #0x18]
00bdb780	sub x0,x29,#0x40
00bdb784	mov w1,#0x16
00bdb788	mov w2,wzr
00bdb78c	sub x20,x29,#0x40
00bdb790	bl 0x00c30250
00bdb794	ldurb w8,[x29, #-0x40]
00bdb798	add x10,sp,#0x38
00bdb79c	str x22,[sp, #0x20]
00bdb7a0	ldr x9,[x26, #0x18]
00bdb7a4	str x10,[sp, #0x30]
00bdb7a8	adrp x28,0xcb5000
00bdb7ac	tst w8,#0x1
00bdb7b0	ldr x28,[x28, #0xc08]
00bdb7b4	orr x27,x20,#0x1
00bdb7b8	csinc x24,x9,x20,ne
00bdb7bc	mov w20,#0x16
00bdb7c0	add x22,sp,#0x30
00bdb7c4	str x24,[x26]
00bdb7c8	str wzr,[sp, #0x2c]
00bdb7cc	b 0x00bdb7d8
00bdb7d0	add x8,x8,#0x1
00bdb7d4	str x8,[x19, #0x18]
00bdb7d8	cbz x19,0x00bdb804
00bdb7dc	ldp x8,x9,[x19, #0x18]
00bdb7e0	cmp x8,x9
00bdb7e4	b.eq 0x00bdb814
00bdb7e8	mov w25,wzr
00bdb7ec	cbz x21,0x00bdb80c
00bdb7f0	ldp x8,x9,[x21, #0x18]
00bdb7f4	cmp x8,x9
00bdb7f8	b.eq 0x00bdb838
00bdb7fc	tbnz w25,#0x0,0x00bdb85c
00bdb800	b 0x00bdb9a0
00bdb804	mov w25,#0x1
00bdb808	cbnz x21,0x00bdb7f0
00bdb80c	tbz w25,#0x0,0x00bdb85c
00bdb810	b 0x00bdb9a0
00bdb814	ldr x8,[x19]
00bdb818	ldr x8,[x8, #0x48]
00bdb81c	mov x0,x19
00bdb820	blr x8
00bdb824	cmn w0,#0x1
00bdb828	cset w25,eq
00bdb82c	csel x19,xzr,x19,eq
00bdb830	cbnz x21,0x00bdb7f0
00bdb834	b 0x00bdb80c
00bdb838	ldr x8,[x21]
00bdb83c	ldr x8,[x8, #0x48]
00bdb840	mov x0,x21
00bdb844	blr x8
00bdb848	cmn w0,#0x1
00bdb84c	cset w8,eq
00bdb850	csel x21,xzr,x21,eq
00bdb854	cmp w25,w8
00bdb858	b.eq 0x00bdb9a0
00bdb85c	ldurb w8,[x29, #-0x40]
00bdb860	ldr x9,[x26, #0x10]
00bdb864	ldr x11,[x26]
00bdb868	lsr x10,x8,#0x1
00bdb86c	tst w8,#0x1
00bdb870	csel x25,x10,x9,eq
00bdb874	add x9,x24,x25
00bdb878	cmp x11,x9
00bdb87c	b.ne 0x00bdb934
00bdb880	cmp x25,#0x1
00bdb884	b.lt 0x00bdb89c
00bdb888	sub x0,x29,#0x40
00bdb88c	mov x1,x25
00bdb890	mov w2,wzr
00bdb894	bl 0x00c30250
00bdb898	b 0x00bdb8c0
00bdb89c	lsl x9,x25,#0x1
00bdb8a0	tbnz w8,#0x0,0x00bdb8b4
00bdb8a4	lsl w8,w9,#0x1
00bdb8a8	sturb w8,[x29, #-0x40]
00bdb8ac	mov x8,x27
00bdb8b0	b 0x00bdb8bc
00bdb8b4	ldr x8,[x26, #0x18]
00bdb8b8	str x9,[x26, #0x10]
00bdb8bc	strb wzr,[x8, x9]
00bdb8c0	ldp x9,x10,[x26, #0x8]
00bdb8c4	ldurb w8,[x29, #-0x40]
00bdb8c8	tst w8,#0x1
00bdb8cc	and x11,x9,#-0x2
00bdb8d0	ubfx x12,x9,#0x1,#0x7
00bdb8d4	sub x11,x11,#0x1
00bdb8d8	csel x8,x20,x11,eq
00bdb8dc	tst x9,#0x1
00bdb8e0	csel x10,x12,x10,eq
00bdb8e4	subs x1,x8,x10
00bdb8e8	b.ls 0x00bdb8fc
00bdb8ec	sub x0,x29,#0x40
00bdb8f0	mov w2,wzr
00bdb8f4	bl 0x00c30250
00bdb8f8	b 0x00bdb91c
00bdb8fc	tbnz w9,#0x0,0x00bdb910
00bdb900	lsl w9,w8,#0x1
00bdb904	sturb w9,[x29, #-0x40]
00bdb908	mov x9,x27
00bdb90c	b 0x00bdb918
00bdb910	ldr x9,[x26, #0x18]
00bdb914	str x8,[x26, #0x10]
00bdb918	strb wzr,[x9, x8]
00bdb91c	ldurb w8,[x29, #-0x40]
00bdb920	ldr x9,[x26, #0x18]
00bdb924	tst w8,#0x1
00bdb928	csel x24,x27,x9,eq
00bdb92c	add x8,x24,x25
00bdb930	str x8,[x26]
00bdb934	ldp x8,x9,[x19, #0x18]
00bdb938	cmp x8,x9
00bdb93c	b.eq 0x00bdb948
00bdb940	ldrb w0,[x8]
00bdb944	b 0x00bdb958
00bdb948	ldr x8,[x19]
00bdb94c	ldr x8,[x8, #0x48]
00bdb950	mov x0,x19
00bdb954	blr x8
00bdb958	ldurb w5,[x29, #-0xc]
00bdb95c	sub x3,x29,#0x48
00bdb960	add x4,sp,#0x2c
00bdb964	sub x6,x29,#0x28
00bdb968	add x7,sp,#0x38
00bdb96c	mov w1,w23
00bdb970	mov x2,x24
00bdb974	stp x22,x28,[sp]
00bdb978	bl 0x00c440f0
00bdb97c	cbnz w0,0x00bdb9a0
00bdb980	ldp x8,x9,[x19, #0x18]
00bdb984	cmp x8,x9
00bdb988	b.ne 0x00bdb7d0
00bdb98c	ldr x8,[x19]
00bdb990	ldr x8,[x8, #0x50]
00bdb994	mov x0,x19
00bdb998	blr x8
00bdb99c	b 0x00bdb7d8
00bdb9a0	ldurb w8,[x29, #-0x28]
00bdb9a4	ldr x9,[x26, #0x28]
00bdb9a8	ldr x22,[sp, #0x20]
00bdb9ac	lsr x10,x8,#0x1
00bdb9b0	tst w8,#0x1
00bdb9b4	csel x8,x10,x9,eq
00bdb9b8	cbz x8,0x00bdb9dc
00bdb9bc	ldr x8,[sp, #0x30]
00bdb9c0	add x9,sp,#0x38
00bdb9c4	sub x9,x8,x9
00bdb9c8	cmp x9,#0x9f
00bdb9cc	b.gt 0x00bdb9dc
00bdb9d0	ldr w9,[sp, #0x2c]
00bdb9d4	str w9,[x8], #0x4
00bdb9d8	str x8,[sp, #0x30]
00bdb9dc	ldr x1,[x26]
00bdb9e0	mov x0,x24
00bdb9e4	mov x2,x22
00bdb9e8	mov w3,w23
00bdb9ec	bl 0x00c0c1fc
00bdb9f0	ldurb w10,[x29, #-0x28]
00bdb9f4	ldr x12,[sp, #0x30]
00bdb9f8	add x11,sp,#0x38
00bdb9fc	ldr x8,[x26, #0x28]
00bdba00	lsr x9,x10,#0x1
00bdba04	ands w13,w10,#0x1
00bdba08	sub x11,x12,x11
00bdba0c	csel x8,x9,x8,eq
00bdba10	ldr x9,[sp, #0x18]
00bdba14	cmp x11,#0x5
00bdba18	strh w0,[x9]
00bdba1c	b.lt 0x00bdbb7c
00bdba20	cbz x8,0x00bdbb7c
00bdba24	sub x8,x12,#0x4
00bdba28	add x9,sp,#0x38
00bdba2c	cmp x9,x8
00bdba30	cset w11,cc
00bdba34	cmp x9,x12
00bdba38	b.eq 0x00bdbae8
00bdba3c	cbz w11,0x00bdbae8
00bdba40	add x10,sp,#0x38
00bdba44	sub x14,x12,#0x8
00bdba48	add x11,x10,#0x4
00bdba4c	cmp x14,x11
00bdba50	csel x13,x14,x11,hi
00bdba54	sub x13,x13,#0x4
00bdba58	cmp x13,x10
00bdba5c	cinc x15,x10,ne
00bdba60	cmp x13,x10
00bdba64	sub x15,x13,x15
00bdba68	lsr x15,x15,#0x3
00bdba6c	cinc x13,x15,ne
00bdba70	cmp x13,#0x13
00bdba74	b.cc 0x00bdbabc
00bdba78	cmp x14,x11
00bdba7c	csel x14,x14,x11,hi
00bdba80	sub x14,x14,#0x4
00bdba84	cmp x14,x10
00bdba88	cinc x15,x10,ne
00bdba8c	cmp x14,x10
00bdba90	sub x15,x14,x15
00bdba94	lsr x15,x15,#0x3
00bdba98	cinc x14,x15,ne
00bdba9c	cmp x10,x12
00bdbaa0	b.cs 0x00bdbc60
00bdbaa4	lsl x14,x14,#0x2
00bdbaa8	sub x15,x12,x14
00bdbaac	add x11,x11,x14
00bdbab0	sub x14,x15,#0x4
00bdbab4	cmp x14,x11
00bdbab8	b.cs 0x00bdbc60
00bdbabc	mov x11,x8
00bdbac0	add x10,x10,#0x4
00bdbac4	ldr w12,[x11]
00bdbac8	ldur w13,[x10, #-0x4]
00bdbacc	stur w12,[x10, #-0x4]
00bdbad0	str w13,[x11], #-0x4
00bdbad4	cmp x10,x11
00bdbad8	add x10,x10,#0x4
00bdbadc	b.cc 0x00bdbac4
00bdbae0	ldurb w10,[x29, #-0x28]
00bdbae4	and w13,w10,#0x1
00bdbae8	ldr x11,[x26, #0x30]
00bdbaec	cmp w13,#0x0
00bdbaf0	sub x12,x29,#0x28
00bdbaf4	csinc x11,x11,x12,ne
00bdbaf8	cmp x9,x8
00bdbafc	b.cs 0x00bdbb54
00bdbb00	lsr w9,w10,#0x1
00bdbb04	ldr x10,[x26, #0x28]
00bdbb08	cmp w13,#0x0
00bdbb0c	csel x9,x9,x10,eq
00bdbb10	add x10,sp,#0x38
00bdbb14	add x9,x11,x9
00bdbb18	b 0x00bdbb34
00bdbb1c	sub x12,x9,x11
00bdbb20	add x10,x10,#0x4
00bdbb24	cmp x12,#0x1
00bdbb28	cinc x11,x11,gt
00bdbb2c	cmp x10,x8
00bdbb30	b.cs 0x00bdbb54
00bdbb34	ldrb w12,[x11]
00bdbb38	cbz w12,0x00bdbb1c
00bdbb3c	cmp w12,#0xff
00bdbb40	b.eq 0x00bdbb1c
00bdbb44	ldr w13,[x10]
00bdbb48	cmp w13,w12
00bdbb4c	b.eq 0x00bdbb1c
00bdbb50	b 0x00bdbb74
00bdbb54	ldrb w9,[x11]
00bdbb58	cbz w9,0x00bdbb7c
00bdbb5c	cmp w9,#0xff
00bdbb60	b.eq 0x00bdbb7c
00bdbb64	ldr w8,[x8]
00bdbb68	sub w8,w8,#0x1
00bdbb6c	cmp w8,w9
00bdbb70	b.cc 0x00bdbb7c
00bdbb74	mov w8,#0x4
00bdbb78	str w8,[x22]
00bdbb7c	cbz x19,0x00bdbc08
00bdbb80	ldp x8,x9,[x19, #0x18]
00bdbb84	cmp x8,x9
00bdbb88	b.eq 0x00bdbc18
00bdbb8c	mov w20,wzr
00bdbb90	cbz x21,0x00bdbc10
00bdbb94	ldp x8,x9,[x21, #0x18]
00bdbb98	cmp x8,x9
00bdbb9c	b.eq 0x00bdbc3c
00bdbba0	tbnz w20,#0x0,0x00bdbbb0
00bdbba4	ldr w8,[x22]
00bdbba8	orr w8,w8,#0x2
00bdbbac	str w8,[x22]
00bdbbb0	ldurb w8,[x29, #-0x40]
00bdbbb4	tbz w8,#0x0,0x00bdbbc8
00bdbbb8	ldr x8,[x26, #0x8]
00bdbbbc	ldr x0,[x26, #0x18]
00bdbbc0	and x1,x8,#-0x2
00bdbbc4	bl 0x00c2fe80
00bdbbc8	ldurb w8,[x29, #-0x28]
00bdbbcc	tbz w8,#0x0,0x00bdbbe0
00bdbbd0	ldr x8,[x26, #0x20]
00bdbbd4	ldr x0,[x26, #0x30]
00bdbbd8	and x1,x8,#-0x2
00bdbbdc	bl 0x00c2fe80
00bdbbe0	mov x0,x19
00bdbbe4	ldp x20,x19,[sp, #0x170]
00bdbbe8	ldp x22,x21,[sp, #0x160]
00bdbbec	ldp x24,x23,[sp, #0x150]
00bdbbf0	ldp x26,x25,[sp, #0x140]
00bdbbf4	ldp x28,x27,[sp, #0x130]
00bdbbf8	ldp x29,x30,[sp, #0x120]
00bdbbfc	add sp,sp,#0x180
00bdbc00	autiasp
00bdbc04	ret
00bdbc08	mov w20,#0x1
00bdbc0c	cbnz x21,0x00bdbb94
00bdbc10	tbnz w20,#0x0,0x00bdbba4
00bdbc14	b 0x00bdbbb0
00bdbc18	ldr x8,[x19]
00bdbc1c	ldr x8,[x8, #0x48]
00bdbc20	mov x0,x19
00bdbc24	blr x8
00bdbc28	cmn w0,#0x1
00bdbc2c	cset w20,eq
00bdbc30	csel x19,xzr,x19,eq
00bdbc34	cbnz x21,0x00bdbb94
00bdbc38	b 0x00bdbc10
00bdbc3c	ldr x8,[x21]
00bdbc40	ldr x8,[x8, #0x48]
00bdbc44	mov x0,x21
00bdbc48	blr x8
00bdbc4c	cmn w0,#0x1
00bdbc50	cset w8,eq
00bdbc54	eor w8,w20,w8
00bdbc58	tbz w8,#0x0,0x00bdbba4
00bdbc5c	b 0x00bdbbb0
00bdbc60	add x13,x13,#0x1
00bdbc64	add x15,sp,#0x38
00bdbc68	sub x12,x12,#0x10
00bdbc6c	and x14,x13,#0x7ffffffffffffff8
00bdbc70	lsl x10,x14,#0x2
00bdbc74	mov x16,x14
00bdbc78	sub x11,x8,x10
00bdbc7c	add x10,x15,x10
00bdbc80	add x15,x15,#0x10
00bdbc84	ldp q1,q0,[x12, #-0x10]
00bdbc88	sub x16,x16,#0x8
00bdbc8c	ldp q2,q3,[x15, #-0x10]
00bdbc90	rev64 v0.4S,v0.4S
00bdbc94	rev64 v1.4S,v1.4S
00bdbc98	rev64 v2.4S,v2.4S
00bdbc9c	rev64 v3.4S,v3.4S
00bdbca0	ext v0.16B,v0.16B,v0.16B,0x8
00bdbca4	ext v1.16B,v1.16B,v1.16B,0x8
00bdbca8	ext v2.16B,v2.16B,v2.16B,0x8
00bdbcac	ext v3.16B,v3.16B,v3.16B,0x8
00bdbcb0	stp q0,q1,[x15, #-0x10]
00bdbcb4	add x15,x15,#0x20
00bdbcb8	stp q3,q2,[x12, #-0x10]
00bdbcbc	sub x12,x12,#0x20
00bdbcc0	cbnz x16,0x00bdbc84
00bdbcc4	cmp x13,x14
00bdbcc8	b.eq 0x00bdbae0
00bdbccc	b 0x00bdbac0
