; FUN_0084b7e4 @ 0084b7e4
0084b7e4	sub sp,sp,#0x190
0084b7e8	stp x29,x30,[sp, #0x130]
0084b7ec	stp x28,x27,[sp, #0x140]
0084b7f0	stp x26,x25,[sp, #0x150]
0084b7f4	stp x24,x23,[sp, #0x160]
0084b7f8	stp x22,x21,[sp, #0x170]
0084b7fc	stp x20,x19,[sp, #0x180]
0084b800	add x29,sp,#0x130
0084b804	str x1,[sp, #0x18]
0084b808	mrs x25,tpidr_el0
0084b80c	movi v0.2D,#0x0
0084b810	ldr x8,[x25, #0x28]
0084b814	stur x8,[x29, #-0x18]
0084b818	sub x8,x29,#0x80
0084b81c	ldr x27,[x0, #0x28]
0084b820	stp xzr,xzr,[sp, #0x20]
0084b824	str xzr,[sp, #0x30]
0084b828	stur wzr,[x29, #-0x80]
0084b82c	stur q0,[x8, #0x8]
0084b830	stur q0,[x8, #0x18]
0084b834	stur q0,[x8, #0x28]
0084b838	stur q0,[x8, #0x38]
0084b83c	stur q0,[x8, #0x48]
0084b840	stur xzr,[x8, #0x55]
0084b844	cbz x27,0x0084b910
0084b848	mov w23,w5
0084b84c	mov w21,w4
0084b850	mov x19,x3
0084b854	mov x20,x2
0084b858	mov x24,x0
0084b85c	stp x2,x2,[sp, #0x98]
0084b860	strb wzr,[sp, #0xa8]
0084b864	str wzr,[sp, #0x38]
0084b868	stp q0,q0,[sp, #0x40]
0084b86c	stp q0,q0,[sp, #0x60]
0084b870	stur q0,[sp, #0x80]
0084b874	stur xzr,[sp, #0x8d]
0084b878	add x0,sp,#0x20
0084b87c	add x1,sp,#0x38
0084b880	str x25,[sp, #0x8]
0084b884	bl 0x008447a0
0084b888	mov x8,x0
0084b88c	ldr x0,[sp, #0x70]
0084b890	str x8,[sp, #0x28]
0084b894	cbz x0,0x0084b8a8
0084b898	ldr x8,[sp, #0x80]
0084b89c	str x0,[sp, #0x78]
0084b8a0	sub x1,x8,x0
0084b8a4	bl 0x00c2fe80
0084b8a8	ldr x0,[sp, #0x58]
0084b8ac	cbz x0,0x0084b8c0
0084b8b0	ldr x8,[sp, #0x68]
0084b8b4	str x0,[sp, #0x60]
0084b8b8	sub x1,x8,x0
0084b8bc	bl 0x00c2fe80
0084b8c0	ldr x22,[sp, #0x28]
0084b8c4	orr x10,xzr,#-0x5555555555555556
0084b8c8	movk x10,#0xaaab
0084b8cc	mov x0,x22
0084b8d0	ldur x9,[x22, #-0x38]
0084b8d4	stur wzr,[x22, #-0x60]
0084b8d8	ldr x8,[x0, #-0x40]!
0084b8dc	stur x20,[x22, #-0x48]
0084b8e0	sub x9,x9,x8
0084b8e4	asr x9,x9,#0x3
0084b8e8	mul x10,x9,x10
0084b8ec	ldr x9,[sp, #0x18]
0084b8f0	stp x9,x9,[x22, #-0x58]
0084b8f4	ldr w9,[x24, #0x1c]
0084b8f8	subs x1,x9,x10
0084b8fc	b.ls 0x0084b920
0084b900	add x2,sp,#0x98
0084b904	bl 0x00844b70
0084b908	ldr x22,[sp, #0x28]
0084b90c	b 0x0084b930
0084b910	mov w24,wzr
0084b914	ldur x0,[x29, #-0x48]
0084b918	cbnz x0,0x0084bd0c
0084b91c	b 0x0084bd1c
0084b920	b.cs 0x0084b930
0084b924	mov w10,#0x18
0084b928	umaddl x8,w9,w10,x8
0084b92c	stur x8,[x22, #-0x38]
0084b930	mov x0,x22
0084b934	str x19,[sp]
0084b938	ldp x8,x9,[x0, #-0x28]!
0084b93c	sub x10,x9,x8
0084b940	ldr w9,[x24, #0x20]
0084b944	asr x10,x10,#0x4
0084b948	subs x1,x9,x10
0084b94c	b.ls 0x0084b95c
0084b950	bl 0x00844cfc
0084b954	ldr x22,[sp, #0x28]
0084b958	b 0x0084b968
0084b95c	b.cs 0x0084b968
0084b960	add x8,x8,x9, LSL #0x4
0084b964	stur x8,[x22, #-0x20]
0084b968	ldr x9,[sp, #0x18]
0084b96c	mov x19,xzr
0084b970	mov w24,wzr
0084b974	mov w26,wzr
0084b978	stur x27,[x22, #-0x10]
0084b97c	and w8,w23,#0x1
0084b980	sub x27,x20,x9
0084b984	add x28,sp,#0x38
0084b988	stur w21,[x22, #-0x8]
0084b98c	str x20,[sp, #0x10]
0084b990	sturb w8,[x22, #-0x4]
0084b994	b 0x0084b9b0
0084b998	add w9,w8,#0x3e3
0084b99c	cmp w9,#0x2
0084b9a0	b.cs 0x0084ba10
0084b9a4	ldp x8,x22,[sp, #0x20]
0084b9a8	cmp x8,x22
0084b9ac	b.eq 0x0084bc98
0084b9b0	add w26,w26,#0x1
0084b9b4	tst w26,#0xfff
0084b9b8	b.ne 0x0084b9c8
0084b9bc	lsr w8,w26,#0xc
0084b9c0	cmp w8,w27
0084b9c4	b.ge 0x0084bdd8
0084b9c8	mov x20,x22
0084b9cc	ldr x0,[x20, #-0x10]!
0084b9d0	sub x23,x20,#0x50
0084b9d4	cbz x0,0x0084b9e8
0084b9d8	ldr x8,[x0]
0084b9dc	ldr x8,[x8, #0x10]
0084b9e0	mov x1,x23
0084b9e4	blr x8
0084b9e8	ldr w8,[x23]
0084b9ec	cmn w8,#0x3e2
0084b9f0	b.le 0x0084b998
0084b9f4	cmn w8,#0x3e1
0084b9f8	b.eq 0x0084ba40
0084b9fc	cmn w8,#0x3e0
0084ba00	b.eq 0x0084ba80
0084ba04	cmn w8,#0x3df
0084ba08	b.eq 0x0084b9a4
0084ba0c	b 0x0084bdf0
0084ba10	cmn w8,#0x3e8
0084ba14	b.ne 0x0084bdf0
0084ba18	tbz w21,#0x5,0x0084ba2c
0084ba1c	ldur x8,[x22, #-0x50]
0084ba20	ldr x9,[sp, #0x18]
0084ba24	cmp x8,x9
0084ba28	b.eq 0x0084ba40
0084ba2c	tbz w21,#0xc,0x0084bb28
0084ba30	ldur x8,[x22, #-0x50]
0084ba34	ldr x9,[sp, #0x10]
0084ba38	cmp x8,x9
0084ba3c	b.eq 0x0084bb28
0084ba40	ldr x20,[sp, #0x28]
0084ba44	ldur x0,[x20, #-0x28]
0084ba48	cbz x0,0x0084ba5c
0084ba4c	ldur x8,[x20, #-0x18]
0084ba50	stur x0,[x20, #-0x20]
0084ba54	sub x1,x8,x0
0084ba58	bl 0x00c2fe80
0084ba5c	ldur x0,[x20, #-0x40]
0084ba60	cbz x0,0x0084ba74
0084ba64	ldur x8,[x20, #-0x30]
0084ba68	stur x0,[x20, #-0x38]
0084ba6c	sub x1,x8,x0
0084ba70	bl 0x00c2fe80
0084ba74	sub x8,x20,#0x60
0084ba78	str x8,[sp, #0x28]
0084ba7c	b 0x0084b9a4
0084ba80	add x0,sp,#0x38
0084ba84	mov x1,x23
0084ba88	bl 0x00844534
0084ba8c	ldr x0,[x20]
0084ba90	ldr x8,[x0]
0084ba94	ldr x8,[x8, #0x18]
0084ba98	mov w1,#0x1
0084ba9c	mov x2,x23
0084baa0	blr x8
0084baa4	ldr x0,[sp, #0x88]
0084baa8	ldr x8,[x0]
0084baac	ldr x8,[x8, #0x18]
0084bab0	add x2,sp,#0x38
0084bab4	mov w1,wzr
0084bab8	blr x8
0084babc	ldp x8,x9,[sp, #0x28]
0084bac0	cmp x8,x9
0084bac4	b.cs 0x0084bc10
0084bac8	ldur q0,[sp, #0x48]
0084bacc	ldur q1,[sp, #0x38]
0084bad0	stp xzr,xzr,[x8, #0x30]
0084bad4	stp xzr,xzr,[x8, #0x20]
0084bad8	stp q1,q0,[x8]
0084badc	ldur q0,[sp, #0x58]
0084bae0	stp xzr,xzr,[x8, #0x40]
0084bae4	str q0,[x8, #0x20]
0084bae8	ldr x9,[sp, #0x68]
0084baec	stp xzr,xzr,[x28, #0x20]
0084baf0	str x9,[x8, #0x30]
0084baf4	ldur q0,[sp, #0x70]
0084baf8	stur q0,[x8, #0x38]
0084bafc	ldr x9,[sp, #0x80]
0084bb00	stp xzr,xzr,[x28, #0x30]
0084bb04	str x9,[x8, #0x48]
0084bb08	ldur x9,[x28, #0x55]
0084bb0c	ldur x10,[x28, #0x50]
0084bb10	stp xzr,xzr,[x28, #0x40]
0084bb14	stur x9,[x8, #0x55]
0084bb18	str x10,[x8, #0x50]
0084bb1c	add x8,x8,#0x60
0084bb20	str x8,[sp, #0x28]
0084bb24	b 0x0084bc3c
0084bb28	ldp x9,x8,[x22, #-0x58]
0084bb2c	sub x25,x8,x9
0084bb30	cmp x19,x25
0084bb34	cset w8,ge
0084bb38	and w8,w24,w8
0084bb3c	tbnz w8,#0x0,0x0084bba8
0084bb40	ldp q1,q0,[x23]
0084bb44	sub x8,x29,#0x80
0084bb48	cmp x8,x23
0084bb4c	stp q1,q0,[x29, #-0x80]
0084bb50	b.eq 0x0084bb90
0084bb54	ldp x1,x2,[x22, #-0x40]
0084bb58	orr x9,xzr,#-0x5555555555555556
0084bb5c	movk x9,#0xaaab
0084bb60	sub x8,x2,x1
0084bb64	asr x8,x8,#0x3
0084bb68	mul x3,x8,x9
0084bb6c	sub x8,x29,#0x80
0084bb70	add x0,x8,#0x20
0084bb74	bl 0x0084cf44
0084bb78	ldp x1,x2,[x22, #-0x28]
0084bb7c	sub x8,x2,x1
0084bb80	asr x3,x8,#0x4
0084bb84	sub x8,x29,#0x80
0084bb88	add x0,x8,#0x38
0084bb8c	bl 0x0084d118
0084bb90	ldur x8,[x20, #0x5]
0084bb94	ldr x9,[x20]
0084bb98	sub x10,x29,#0x80
0084bb9c	mov x19,x25
0084bba0	stur x8,[x10, #0x55]
0084bba4	stur x9,[x10, #0x50]
0084bba8	ldr x20,[sp, #0x28]
0084bbac	cmp x19,x27
0084bbb0	b.ne 0x0084bc58
0084bbb4	ldr x19,[sp, #0x20]
0084bbb8	cmp x19,x20
0084bbbc	b.ne 0x0084bbdc
0084bbc0	str x19,[sp, #0x28]
0084bbc4	mov w24,#0x1
0084bbc8	mov x19,x27
0084bbcc	b 0x0084b9a4
0084bbd0	sub x20,x20,#0x60
0084bbd4	cmp x20,x19
0084bbd8	b.eq 0x0084bbc0
0084bbdc	ldur x0,[x20, #-0x28]
0084bbe0	cbz x0,0x0084bbf4
0084bbe4	ldur x8,[x20, #-0x18]
0084bbe8	stur x0,[x20, #-0x20]
0084bbec	sub x1,x8,x0
0084bbf0	bl 0x00c2fe80
0084bbf4	ldur x0,[x20, #-0x40]
0084bbf8	cbz x0,0x0084bbd0
0084bbfc	ldur x8,[x20, #-0x30]
0084bc00	stur x0,[x20, #-0x38]
0084bc04	sub x1,x8,x0
0084bc08	bl 0x00c2fe80
0084bc0c	b 0x0084bbd0
0084bc10	add x0,sp,#0x20
0084bc14	add x1,sp,#0x38
0084bc18	bl 0x008447a0
0084bc1c	mov x8,x0
0084bc20	ldr x0,[sp, #0x70]
0084bc24	str x8,[sp, #0x28]
0084bc28	cbz x0,0x0084bc3c
0084bc2c	ldr x8,[sp, #0x80]
0084bc30	str x0,[sp, #0x78]
0084bc34	sub x1,x8,x0
0084bc38	bl 0x00c2fe80
0084bc3c	ldr x0,[sp, #0x58]
0084bc40	cbz x0,0x0084b9a4
0084bc44	ldr x8,[sp, #0x68]
0084bc48	str x0,[sp, #0x60]
0084bc4c	sub x1,x8,x0
0084bc50	bl 0x00c2fe80
0084bc54	b 0x0084b9a4
0084bc58	ldur x0,[x20, #-0x28]
0084bc5c	cbz x0,0x0084bc70
0084bc60	ldur x8,[x20, #-0x18]
0084bc64	stur x0,[x20, #-0x20]
0084bc68	sub x1,x8,x0
0084bc6c	bl 0x00c2fe80
0084bc70	ldur x0,[x20, #-0x40]
0084bc74	cbz x0,0x0084bc88
0084bc78	ldur x8,[x20, #-0x30]
0084bc7c	stur x0,[x20, #-0x38]
0084bc80	sub x1,x8,x0
0084bc84	bl 0x00c2fe80
0084bc88	sub x8,x20,#0x60
0084bc8c	mov w24,#0x1
0084bc90	str x8,[sp, #0x28]
0084bc94	b 0x0084b9a4
0084bc98	tbz w24,#0x0,0x0084bd00
0084bc9c	ldr x8,[sp]
0084bca0	ldr x10,[sp, #0x18]
0084bca4	ldr x8,[x8]
0084bca8	add x9,x10,x19
0084bcac	stp x10,x9,[x8]
0084bcb0	mov w10,#0x1
0084bcb4	strb w10,[x8, #0x10]
0084bcb8	ldp x10,x9,[x29, #-0x60]
0084bcbc	subs x9,x9,x10
0084bcc0	b.eq 0x0084bd00
0084bcc4	asr x9,x9,#0x3
0084bcc8	orr x11,xzr,#-0x5555555555555556
0084bccc	add x10,x10,#0x10
0084bcd0	movk x11,#0xaaab
0084bcd4	mov w12,#0x1
0084bcd8	mul x9,x9,x11
0084bcdc	mov w11,#0x18
0084bce0	umaddl x13,w12,w11,x8
0084bce4	ldur q0,[x10, #-0x10]
0084bce8	cmp x9,w12, UXTW 
0084bcec	add w12,w12,#0x1
0084bcf0	str q0,[x13]
0084bcf4	ldrb w14,[x10], #0x18
0084bcf8	strb w14,[x13, #0x10]
0084bcfc	b.hi 0x0084bce0
0084bd00	ldr x25,[sp, #0x8]
0084bd04	ldur x0,[x29, #-0x48]
0084bd08	cbz x0,0x0084bd1c
0084bd0c	ldur x8,[x29, #-0x38]
0084bd10	stur x0,[x29, #-0x40]
0084bd14	sub x1,x8,x0
0084bd18	bl 0x00c2fe80
0084bd1c	ldur x0,[x29, #-0x60]
0084bd20	cbz x0,0x0084bd34
0084bd24	ldur x8,[x29, #-0x50]
0084bd28	stur x0,[x29, #-0x58]
0084bd2c	sub x1,x8,x0
0084bd30	bl 0x00c2fe80
0084bd34	ldr x19,[sp, #0x20]
0084bd38	cbz x19,0x0084bda4
0084bd3c	ldr x20,[sp, #0x28]
0084bd40	mov x0,x19
0084bd44	cmp x19,x20
0084bd48	b.ne 0x0084bd5c
0084bd4c	b 0x0084bd94
0084bd50	sub x20,x20,#0x60
0084bd54	cmp x20,x19
0084bd58	b.eq 0x0084bd90
0084bd5c	ldur x0,[x20, #-0x28]
0084bd60	cbz x0,0x0084bd74
0084bd64	ldur x8,[x20, #-0x18]
0084bd68	stur x0,[x20, #-0x20]
0084bd6c	sub x1,x8,x0
0084bd70	bl 0x00c2fe80
0084bd74	ldur x0,[x20, #-0x40]
0084bd78	cbz x0,0x0084bd50
0084bd7c	ldur x8,[x20, #-0x30]
0084bd80	stur x0,[x20, #-0x38]
0084bd84	sub x1,x8,x0
0084bd88	bl 0x00c2fe80
0084bd8c	b 0x0084bd50
0084bd90	ldr x0,[sp, #0x20]
0084bd94	ldr x8,[sp, #0x30]
0084bd98	str x19,[sp, #0x28]
0084bd9c	sub x1,x8,x0
0084bda0	bl 0x00c2fe80
0084bda4	ldr x8,[x25, #0x28]
0084bda8	ldur x9,[x29, #-0x18]
0084bdac	cmp x8,x9
0084bdb0	b.ne 0x0084be5c
0084bdb4	and w0,w24,#0x1
0084bdb8	ldp x20,x19,[sp, #0x180]
0084bdbc	ldp x22,x21,[sp, #0x170]
0084bdc0	ldp x24,x23,[sp, #0x160]
0084bdc4	ldp x26,x25,[sp, #0x150]
0084bdc8	ldp x28,x27,[sp, #0x140]
0084bdcc	ldp x29,x30,[sp, #0x130]
0084bdd0	add sp,sp,#0x190
0084bdd4	ret
0084bdd8	ldr x8,[sp, #0x8]
0084bddc	ldr x8,[x8, #0x28]
0084bde0	ldur x9,[x29, #-0x18]
0084bde4	cmp x8,x9
0084bde8	b.ne 0x0084be5c
0084bdec	bl 0x008444e8
0084bdf0	ldr x8,[sp, #0x8]
0084bdf4	ldr x8,[x8, #0x28]
0084bdf8	ldur x9,[x29, #-0x18]
0084bdfc	cmp x8,x9
0084be00	b.ne 0x0084be5c
0084be04	bl 0x008446b4
0084be08	b 0x0084be2c
0084be2c	mov x19,x0
0084be30	sub x0,x29,#0x80
0084be34	bl 0x00844494
0084be38	add x0,sp,#0x20
0084be3c	bl 0x00844700
0084be40	ldr x8,[sp, #0x8]
0084be44	ldr x8,[x8, #0x28]
0084be48	ldur x9,[x29, #-0x18]
0084be4c	cmp x8,x9
0084be50	b.ne 0x0084be5c
0084be54	mov x0,x19
0084be58	bl 0x00c2c090
0084be5c	bl 0x00c2fec0
