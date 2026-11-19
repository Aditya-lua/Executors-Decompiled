; bn_sub_part_words @ 00a097e8
00a097e8	str x23,[sp, #-0x40]!
00a097ec	stp x22,x21,[sp, #0x10]
00a097f0	stp x20,x19,[sp, #0x20]
00a097f4	stp x29,x30,[sp, #0x30]
00a097f8	add x29,sp,#0x30
00a097fc	mov w19,w4
00a09800	mov w23,w3
00a09804	mov x20,x2
00a09808	mov x22,x1
00a0980c	mov x21,x0
00a09810	bl 0x00c38940
00a09814	cbz w19,0x00a099f0
00a09818	sxtw x9,w23
00a0981c	add x8,x21,w23, SXTW  #0x3
00a09820	tbnz w19,#0x1f,0x00a098b8
00a09824	add x9,x22,x9, LSL #0x3
00a09828	cbz x0,0x00a0998c
00a0982c	ldr x10,[x9]
00a09830	cmp x10,#0x0
00a09834	sub x11,x10,x0
00a09838	csel x0,x0,xzr,eq
00a0983c	cmp w19,#0x2
00a09840	str x11,[x8]
00a09844	b.lt 0x00a09980
00a09848	ldr x10,[x9, #0x8]
00a0984c	cmp x10,#0x0
00a09850	sub x11,x10,x0
00a09854	csel x0,x0,xzr,eq
00a09858	cmp w19,#0x2
00a0985c	str x11,[x8, #0x8]
00a09860	b.eq 0x00a099f0
00a09864	ldr x10,[x9, #0x10]
00a09868	cmp x10,#0x0
00a0986c	sub x11,x10,x0
00a09870	csel x0,x0,xzr,eq
00a09874	cmp w19,#0x4
00a09878	str x11,[x8, #0x10]
00a0987c	b.lt 0x00a099f0
00a09880	ldr x10,[x9, #0x18]
00a09884	cmp x10,#0x0
00a09888	sub x11,x10,x0
00a0988c	csel x10,x0,xzr,eq
00a09890	subs w19,w19,#0x4
00a09894	str x11,[x8, #0x18]
00a09898	b.eq 0x00a099ec
00a0989c	add x9,x9,#0x20
00a098a0	add x8,x8,#0x20
00a098a4	cbnz x10,0x00a0982c
00a098a8	mov x0,xzr
00a098ac	cmp w19,#0x1
00a098b0	b.ge 0x00a0998c
00a098b4	b 0x00a099f0
00a098b8	ldr x10,[x20, x9, LSL #0x3]
00a098bc	add x11,x10,x0
00a098c0	cmp x10,#0x0
00a098c4	neg x10,x11
00a098c8	csinc x0,x0,xzr,eq
00a098cc	cmn w19,#0x1
00a098d0	str x10,[x8]
00a098d4	b.eq 0x00a099f0
00a098d8	lsl x9,x9,#0x3
00a098dc	add x10,x21,x9
00a098e0	add x11,x20,x9
00a098e4	sub w8,w19,#0x4
00a098e8	add x9,x10,#0x10
00a098ec	add x10,x11,#0x20
00a098f0	ldur x11,[x10, #-0x18]
00a098f4	add x12,x11,x0
00a098f8	cmp x11,#0x0
00a098fc	neg x11,x12
00a09900	csinc x0,x0,xzr,eq
00a09904	cmn w8,#0x6
00a09908	stur x11,[x9, #-0x8]
00a0990c	b.eq 0x00a099f0
00a09910	ldur x11,[x10, #-0x10]
00a09914	add w12,w8,#0x4
00a09918	add x13,x11,x0
00a0991c	cmp x11,#0x0
00a09920	neg x11,x13
00a09924	csinc x0,x0,xzr,eq
00a09928	cmn w12,#0x4
00a0992c	str x11,[x9]
00a09930	b.gt 0x00a099f0
00a09934	ldur x11,[x10, #-0x8]
00a09938	add x12,x11,x0
00a0993c	cmp x11,#0x0
00a09940	neg x11,x12
00a09944	csinc x0,x0,xzr,eq
00a09948	cmn w8,#0x8
00a0994c	str x11,[x9, #0x8]
00a09950	b.eq 0x00a099f0
00a09954	ldr x11,[x10], #0x20
00a09958	add w8,w8,#0x4
00a0995c	add x12,x11,x0
00a09960	cmp x11,#0x0
00a09964	neg x11,x12
00a09968	csinc x0,x0,xzr,eq
00a0996c	cmn w8,#0x6
00a09970	str x11,[x9, #0x10]
00a09974	add x9,x9,#0x20
00a09978	b.le 0x00a098f0
00a0997c	b 0x00a099f0
00a09980	sub w19,w19,#0x1
00a09984	cmp w19,#0x1
00a09988	b.lt 0x00a099f0
00a0998c	ldr x10,[x9]
00a09990	cmp w19,#0x1
00a09994	str x10,[x8]
00a09998	b.eq 0x00a099f0
00a0999c	add x8,x8,#0x10
00a099a0	add x9,x9,#0x20
00a099a4	ldur x10,[x9, #-0x18]
00a099a8	cmp w19,#0x2
00a099ac	stur x10,[x8, #-0x8]
00a099b0	b.eq 0x00a099f0
00a099b4	ldur x11,[x9, #-0x10]
00a099b8	subs w10,w19,#0x4
00a099bc	str x11,[x8]
00a099c0	b.lt 0x00a099f0
00a099c4	ldur x11,[x9, #-0x8]
00a099c8	str x11,[x8, #0x8]
00a099cc	b.eq 0x00a099f0
00a099d0	ldr x11,[x9], #0x20
00a099d4	cmp w19,#0x5
00a099d8	mov w19,w10
00a099dc	str x11,[x8, #0x10]
00a099e0	add x8,x8,#0x20
00a099e4	b.gt 0x00a099a4
00a099e8	b 0x00a099f0
00a099ec	mov x0,x10
00a099f0	ldp x29,x30,[sp, #0x30]
00a099f4	ldp x20,x19,[sp, #0x20]
00a099f8	ldp x22,x21,[sp, #0x10]
00a099fc	ldr x23,[sp], #0x40
00a09a00	ret
