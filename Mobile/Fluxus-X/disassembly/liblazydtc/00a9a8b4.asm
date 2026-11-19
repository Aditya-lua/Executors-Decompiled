; FUN_00a9a8b4 @ 00a9a8b4
00a9a8b4	str x25,[sp, #-0x50]!
00a9a8b8	stp x24,x23,[sp, #0x10]
00a9a8bc	stp x22,x21,[sp, #0x20]
00a9a8c0	stp x20,x19,[sp, #0x30]
00a9a8c4	stp x29,x30,[sp, #0x40]
00a9a8c8	add x29,sp,#0x40
00a9a8cc	cbz x0,0x00a9abb8
00a9a8d0	adrp x23,0xd22000
00a9a8d4	add x23,x23,#0x108
00a9a8d8	ldr x8,[x23, #0x10]
00a9a8dc	mov x19,x0
00a9a8e0	cmp x8,x0
00a9a8e4	b.hi 0x00a9ac78
00a9a8e8	ldr x9,[x23, #0x18]
00a9a8ec	add x10,x8,x9
00a9a8f0	cmp x10,x19
00a9a8f4	b.ls 0x00a9ac78
00a9a8f8	ldp x11,x10,[x23, #0x28]
00a9a8fc	add x9,x19,x9
00a9a900	sub x8,x9,x8
00a9a904	cmp x10,x8
00a9a908	sub x20,x11,#0x1
00a9a90c	b.ls 0x00a9a918
00a9a910	ldr x2,[x23, #0x38]
00a9a914	b 0x00a9a94c
00a9a918	ldr x2,[x23, #0x38]
00a9a91c	udiv x8,x8,x10
00a9a920	mov w9,#0x1
00a9a924	lsr x10,x8,#0x3
00a9a928	ldrb w10,[x2, x10]
00a9a92c	and x11,x8,#0x7
00a9a930	lsl x11,x9,x11
00a9a934	tst x11,x10
00a9a938	b.ne 0x00a9a94c
00a9a93c	tbnz w8,#0x0,0x00a9ac60
00a9a940	lsr x8,x8,#0x1
00a9a944	sub x20,x20,#0x1
00a9a948	cbnz x8,0x00a9a924
00a9a94c	mov x0,x19
00a9a950	mov w1,w20
00a9a954	bl 0x00a9b18c
00a9a958	cbz w0,0x00a9ac90
00a9a95c	ldr x2,[x23, #0x40]
00a9a960	mov x0,x19
00a9a964	mov w1,w20
00a9a968	bl 0x00a9b250
00a9a96c	ldr x8,[x23, #0x20]
00a9a970	lsl x21,x20,#0x3
00a9a974	mov x1,x19
00a9a978	add x0,x8,x21
00a9a97c	bl 0x00a9b0a0
00a9a980	sub x24,x21,#0x8
00a9a984	mov w25,#0x1
00a9a988	ldp x8,x9,[x23, #0x10]
00a9a98c	and x11,x20,#0xffffffff
00a9a990	lsl x10,x25,x11
00a9a994	sub x12,x19,x8
00a9a998	lsr x9,x9,x11
00a9a99c	ldr x11,[x23, #0x38]
00a9a9a0	udiv x12,x12,x9
00a9a9a4	add x13,x12,x10
00a9a9a8	lsr x12,x13,#0x3
00a9a9ac	ldrb w15,[x11, x12]
00a9a9b0	eor x13,x13,#0x1
00a9a9b4	and x14,x13,#0x7
00a9a9b8	lsl x14,x25,x14
00a9a9bc	tst x14,x15
00a9a9c0	b.eq 0x00a9abb8
00a9a9c4	ldr x2,[x23, #0x40]
00a9a9c8	ldrb w12,[x2, x12]
00a9a9cc	tst x14,x12
00a9a9d0	b.ne 0x00a9abb8
00a9a9d4	sub x12,x10,#0x1
00a9a9d8	and x13,x13,x12
00a9a9dc	mul x13,x13,x9
00a9a9e0	adds x21,x8,x13
00a9a9e4	b.eq 0x00a9abb8
00a9a9e8	udiv x13,x13,x9
00a9a9ec	add x10,x13,x10
00a9a9f0	lsr x13,x10,#0x3
00a9a9f4	ldrb w14,[x11, x13]
00a9a9f8	eor x10,x10,#0x1
00a9a9fc	and x11,x10,#0x7
00a9aa00	lsl x11,x25,x11
00a9aa04	tst x11,x14
00a9aa08	b.eq 0x00a9aa30
00a9aa0c	ldrb w13,[x2, x13]
00a9aa10	tst x11,x13
00a9aa14	mov x11,xzr
00a9aa18	b.ne 0x00a9aa34
00a9aa1c	and x10,x10,x12
00a9aa20	madd x11,x10,x9,x8
00a9aa24	cmp x19,x11
00a9aa28	b.eq 0x00a9aa3c
00a9aa2c	b 0x00a9abe8
00a9aa30	mov x11,xzr
00a9aa34	cmp x19,x11
00a9aa38	b.ne 0x00a9abe8
00a9aa3c	cbz x19,0x00a9ac00
00a9aa40	mov x0,x19
00a9aa44	mov w1,w20
00a9aa48	bl 0x00a9b18c
00a9aa4c	cbnz w0,0x00a9ac18
00a9aa50	ldr x2,[x23, #0x38]
00a9aa54	mov x0,x19
00a9aa58	mov w1,w20
00a9aa5c	bl 0x00a9b250
00a9aa60	ldr x8,[x19]
00a9aa64	cbz x8,0x00a9aa70
00a9aa68	ldr x9,[x19, #0x8]
00a9aa6c	str x9,[x8, #0x8]
00a9aa70	ldr x9,[x19, #0x8]
00a9aa74	str x8,[x9]
00a9aa78	ldr x8,[x19]
00a9aa7c	cbz x8,0x00a9aabc
00a9aa80	ldr x8,[x8, #0x8]
00a9aa84	ldr x9,[x23, #0x20]
00a9aa88	cmp x8,x9
00a9aa8c	b.cc 0x00a9aaa0
00a9aa90	ldr x10,[x23, #0x28]
00a9aa94	add x9,x9,x10, LSL #0x3
00a9aa98	cmp x8,x9
00a9aa9c	b.cc 0x00a9aabc
00a9aaa0	ldr x9,[x23, #0x10]
00a9aaa4	cmp x8,x9
00a9aaa8	b.cc 0x00a9abd0
00a9aaac	ldr x10,[x23, #0x18]
00a9aab0	add x9,x9,x10
00a9aab4	cmp x8,x9
00a9aab8	b.cs 0x00a9abd0
00a9aabc	ldr x2,[x23, #0x40]
00a9aac0	mov x0,x19
00a9aac4	mov w1,w20
00a9aac8	bl 0x00a9b18c
00a9aacc	cbnz w0,0x00a9ac30
00a9aad0	ldr x2,[x23, #0x38]
00a9aad4	mov x0,x21
00a9aad8	mov w1,w20
00a9aadc	bl 0x00a9b250
00a9aae0	ldr x8,[x21]
00a9aae4	cbz x8,0x00a9aaf0
00a9aae8	ldr x9,[x21, #0x8]
00a9aaec	str x9,[x8, #0x8]
00a9aaf0	ldr x9,[x21, #0x8]
00a9aaf4	str x8,[x9]
00a9aaf8	ldr x8,[x21]
00a9aafc	cbz x8,0x00a9ab3c
00a9ab00	ldr x8,[x8, #0x8]
00a9ab04	ldr x9,[x23, #0x20]
00a9ab08	cmp x8,x9
00a9ab0c	b.cc 0x00a9ab20
00a9ab10	ldr x10,[x23, #0x28]
00a9ab14	add x9,x9,x10, LSL #0x3
00a9ab18	cmp x8,x9
00a9ab1c	b.cc 0x00a9ab3c
00a9ab20	ldr x9,[x23, #0x10]
00a9ab24	cmp x8,x9
00a9ab28	b.cc 0x00a9abd0
00a9ab2c	ldr x10,[x23, #0x18]
00a9ab30	add x9,x9,x10
00a9ab34	cmp x8,x9
00a9ab38	b.cs 0x00a9abd0
00a9ab3c	cmp x19,x21
00a9ab40	csel x8,x19,x21,hi
00a9ab44	stp xzr,xzr,[x8]
00a9ab48	ldr x2,[x23, #0x40]
00a9ab4c	sub x22,x20,#0x1
00a9ab50	csel x19,x21,x19,hi
00a9ab54	mov x0,x19
00a9ab58	mov w1,w22
00a9ab5c	bl 0x00a9b18c
00a9ab60	cbnz w0,0x00a9ac48
00a9ab64	ldr x2,[x23, #0x38]
00a9ab68	mov x0,x19
00a9ab6c	mov w1,w22
00a9ab70	bl 0x00a9afb8
00a9ab74	ldr x8,[x23, #0x20]
00a9ab78	mov x1,x19
00a9ab7c	add x0,x8,x24
00a9ab80	bl 0x00a9b0a0
00a9ab84	ldr x8,[x23, #0x20]
00a9ab88	sub x24,x24,#0x8
00a9ab8c	add x8,x8,x20, LSL #0x3
00a9ab90	ldur x8,[x8, #-0x8]
00a9ab94	mov x20,x22
00a9ab98	cmp x8,x19
00a9ab9c	b.eq 0x00a9a988
00a9aba0	adrp x0,0x2da000
00a9aba4	adrp x1,0x2d6000
00a9aba8	add x0,x0,#0xc6
00a9abac	add x1,x1,#0xc
00a9abb0	mov w2,#0x2ca
00a9abb4	bl 0x00c3c240
00a9abb8	ldp x29,x30,[sp, #0x40]
00a9abbc	ldp x20,x19,[sp, #0x30]
00a9abc0	ldp x22,x21,[sp, #0x20]
00a9abc4	ldp x24,x23,[sp, #0x10]
00a9abc8	ldr x25,[sp], #0x50
00a9abcc	ret
00a9abd0	adrp x0,0x2c5000
00a9abd4	adrp x1,0x2d6000
00a9abd8	add x0,x0,#0xd24
00a9abdc	add x1,x1,#0xc
00a9abe0	mov w2,#0x196
00a9abe4	bl 0x00c3c240
00a9abe8	adrp x0,0x2a4000
00a9abec	adrp x1,0x2d6000
00a9abf0	add x0,x0,#0x3c1
00a9abf4	add x1,x1,#0xc
00a9abf8	mov w2,#0x2b7
00a9abfc	bl 0x00c3c240
00a9ac00	adrp x0,0x2cd000
00a9ac04	adrp x1,0x2d6000
00a9ac08	add x0,x0,#0xdc3
00a9ac0c	add x1,x1,#0xc
00a9ac10	mov w2,#0x2b8
00a9ac14	bl 0x00c3c240
00a9ac18	adrp x0,0x2b0000
00a9ac1c	adrp x1,0x2d6000
00a9ac20	add x0,x0,#0x323
00a9ac24	add x1,x1,#0xc
00a9ac28	mov w2,#0x2b9
00a9ac2c	bl 0x00c3c240
00a9ac30	adrp x0,0x2b0000
00a9ac34	adrp x1,0x2d6000
00a9ac38	add x0,x0,#0x323
00a9ac3c	add x1,x1,#0xc
00a9ac40	mov w2,#0x2bc
00a9ac44	bl 0x00c3c240
00a9ac48	adrp x0,0x2b0000
00a9ac4c	adrp x1,0x2d6000
00a9ac50	add x0,x0,#0x323
00a9ac54	add x1,x1,#0xc
00a9ac58	mov w2,#0x2c7
00a9ac5c	bl 0x00c3c240
00a9ac60	adrp x0,0x2a4000
00a9ac64	adrp x1,0x2d6000
00a9ac68	add x0,x0,#0x3f8
00a9ac6c	add x1,x1,#0xc
00a9ac70	mov w2,#0x14c
00a9ac74	bl 0x00c3c240
00a9ac78	adrp x0,0x29e000
00a9ac7c	adrp x1,0x2d6000
00a9ac80	add x0,x0,#0x41c
00a9ac84	add x1,x1,#0xc
00a9ac88	mov w2,#0x2ac
00a9ac8c	bl 0x00c3c240
00a9ac90	adrp x0,0x2ac000
00a9ac94	adrp x1,0x2d6000
00a9ac98	add x0,x0,#0x398
00a9ac9c	add x1,x1,#0xc
00a9aca0	mov w2,#0x2b1
00a9aca4	bl 0x00c3c240
