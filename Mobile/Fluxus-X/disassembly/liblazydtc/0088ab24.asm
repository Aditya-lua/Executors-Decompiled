; FUN_0088ab24 @ 0088ab24
0088ab24	sub sp,sp,#0xc0
0088ab28	stp x29,x30,[sp, #0x60]
0088ab2c	stp x28,x27,[sp, #0x70]
0088ab30	stp x26,x25,[sp, #0x80]
0088ab34	stp x24,x23,[sp, #0x90]
0088ab38	stp x22,x21,[sp, #0xa0]
0088ab3c	stp x20,x19,[sp, #0xb0]
0088ab40	add x29,sp,#0x60
0088ab44	mrs x23,tpidr_el0
0088ab48	mov x20,x1
0088ab4c	mov x19,x0
0088ab50	ldr x8,[x23, #0x28]
0088ab54	stur x8,[x29, #-0x8]
0088ab58	ldr x21,[x1, #0x28]
0088ab5c	ldr w8,[x0, #0x64c]
0088ab60	stur x0,[x29, #-0x18]
0088ab64	cmp x21,#0x1
0088ab68	stur w8,[x29, #-0x10]
0088ab6c	b.ne 0x0088ac34
0088ab70	ldr x8,[x20, #0x38]
0088ab74	cmp x8,#0x1
0088ab78	b.ne 0x0088ac6c
0088ab7c	ldr x8,[x20, #0x20]
0088ab80	ldr x1,[x8]
0088ab84	add x8,sp,#0x18
0088ab88	sub x2,x29,#0x18
0088ab8c	mov x0,x19
0088ab90	bl 0x00899540
0088ab94	ldr x8,[x20, #0x30]
0088ab98	ldr w9,[sp, #0x18]
0088ab9c	ldr x21,[x8]
0088aba0	cbz w9,0x0088b004
0088aba4	mov x0,x19
0088aba8	mov x1,x21
0088abac	bl 0x0088df20
0088abb0	mov w22,w0
0088abb4	tbz w0,#0x1f,0x0088abf0
0088abb8	ldr w2,[x19, #0x64c]
0088abbc	add w8,w2,#0x1
0088abc0	cmp w8,#0x100
0088abc4	b.cs 0x0088b06c
0088abc8	ldr w9,[x19, #0x650]
0088abcc	str w8,[x19, #0x64c]
0088abd0	cmp w9,w8
0088abd4	csel w8,w9,w8,hi
0088abd8	str w8,[x19, #0x650]
0088abdc	mov x0,x19
0088abe0	mov x1,x21
0088abe4	mov w3,#0xff
0088abe8	bl 0x00891438
0088abec	mov w22,w0
0088abf0	ldr w8,[x19, #0xc]
0088abf4	cmp w8,#0x1
0088abf8	b.lt 0x0088ac14
0088abfc	ldr x8,[x20, #0x20]
0088ac00	ldr x0,[x19]
0088ac04	ldr x8,[x8]
0088ac08	ldr w8,[x8, #0xc]
0088ac0c	add w1,w8,#0x1
0088ac10	bl 0x00876644
0088ac14	ldr x8,[x20, #0x20]
0088ac18	ldr x4,[x8]
0088ac1c	add x1,sp,#0x18
0088ac20	mov x0,x19
0088ac24	mov w2,w22
0088ac28	mov w3,#0x1
0088ac2c	bl 0x00892774
0088ac30	b 0x0088afc8
0088ac34	stp xzr,xzr,[sp]
0088ac38	str xzr,[sp, #0x10]
0088ac3c	cbz x21,0x0088ad0c
0088ac40	mov x8,#0x2493
0088ac44	movk x8,#0x9249, LSL #16
0088ac48	movk x8,#0x4924, LSL #32
0088ac4c	movk x8,#0x492, LSL #48
0088ac50	cmp x21,x8
0088ac54	b.cc 0x0088ac74
0088ac58	ldr x8,[x23, #0x28]
0088ac5c	ldur x9,[x29, #-0x8]
0088ac60	cmp x8,x9
0088ac64	b.ne 0x0088b124
0088ac68	bl 0x00899c0c
0088ac6c	stp xzr,xzr,[sp]
0088ac70	str xzr,[sp, #0x10]
0088ac74	lsl x8,x21,#0x6
0088ac78	sub x0,x8,x21, LSL #0x3
0088ac7c	bl 0x00c2fed0
0088ac80	mov w8,#0x38
0088ac84	movi v0.2D,#0x0
0088ac88	mov w9,#0xffff
0088ac8c	madd x8,x21,x8,x0
0088ac90	stp x0,x0,[sp]
0088ac94	str x8,[sp, #0x10]
0088ac98	str xzr,[x0, #0x30]
0088ac9c	stp q0,q0,[x0, #0x10]
0088aca0	str q0,[x0]
0088aca4	strh w9,[x0, #0x30]
0088aca8	add x0,x0,#0x38
0088acac	cmp x0,x8
0088acb0	b.ne 0x0088ac98
0088acb4	str x8,[sp, #0x8]
0088acb8	cbz x21,0x0088ad0c
0088acbc	mov x21,xzr
0088acc0	mov x22,xzr
0088acc4	ldr x8,[x20, #0x20]
0088acc8	ldr x1,[x8, x22, LSL #0x3]
0088accc	add x8,sp,#0x18
0088acd0	sub x2,x29,#0x18
0088acd4	mov x0,x19
0088acd8	bl 0x00899540
0088acdc	ldr x8,[sp]
0088ace0	ldur q0,[sp, #0x38]
0088ace4	add x22,x22,#0x1
0088ace8	ldur q1,[sp, #0x28]
0088acec	ldur q2,[sp, #0x18]
0088acf0	add x8,x8,x21
0088acf4	add x21,x21,#0x38
0088acf8	stp q1,q0,[x8, #0x10]
0088acfc	str q2,[x8]
0088ad00	ldr x8,[x20, #0x28]
0088ad04	cmp x22,x8
0088ad08	b.cc 0x0088acc4
0088ad0c	mov x2,sp
0088ad10	add x3,x20,#0x30
0088ad14	mov x0,x19
0088ad18	mov x1,x20
0088ad1c	bl 0x008998dc
0088ad20	ldr x21,[x20, #0x28]
0088ad24	cbz x21,0x0088aebc
0088ad28	mov x22,xzr
0088ad2c	mov x28,xzr
0088ad30	mov w24,#0x69
0088ad34	mov w25,#0x38
0088ad38	mov w26,#0xff
0088ad3c	b 0x0088ad5c
0088ad40	strb w0,[x28, #0x31]
0088ad44	ldr x21,[x20, #0x28]
0088ad48	add x24,x24,#0x38
0088ad4c	sub x22,x22,#0x1
0088ad50	mov x28,x27
0088ad54	cmp x27,x21
0088ad58	b.cs 0x0088aebc
0088ad5c	ldr x8,[x20, #0x38]
0088ad60	cmp x28,x8
0088ad64	b.cs 0x0088aebc
0088ad68	ldur x9,[x20, #0x30]
0088ad6c	add x27,x28,#0x1
0088ad70	cmp x27,x8
0088ad74	ldr x1,[x9, x28, LSL #0x3]
0088ad78	b.ne 0x0088ae3c
0088ad7c	cmp x21,x8
0088ad80	b.ls 0x0088ae3c
0088ad84	sub w8,w21,w8
0088ad88	ldr w21,[x19, #0x64c]
0088ad8c	add w3,w8,#0x1
0088ad90	add w8,w21,w3
0088ad94	cmp w8,#0x100
0088ad98	b.cs 0x0088b01c
0088ad9c	ldr w9,[x19, #0x650]
0088ada0	str w8,[x19, #0x64c]
0088ada4	cmp w9,w8
0088ada8	csel w8,w9,w8,hi
0088adac	str w8,[x19, #0x650]
0088adb0	mov x0,x19
0088adb4	mov w2,w21
0088adb8	mov w4,#0x1
0088adbc	bl 0x008956b0
0088adc0	ldr x8,[x20, #0x28]
0088adc4	subs x10,x8,x28
0088adc8	b.ls 0x0088ad44
0088adcc	ldr x9,[sp]
0088add0	cmp x10,#0x2
0088add4	b.cc 0x0088ae14
0088add8	and x11,x10,#-0x2
0088addc	add x14,x8,x22
0088ade0	mov x12,xzr
0088ade4	add x28,x28,x11
0088ade8	add x13,x9,x24
0088adec	and x14,x14,#-0x2
0088adf0	add w15,w12,w21
0088adf4	add x12,x12,#0x2
0088adf8	add w16,w15,#0x1
0088adfc	cmp x14,x12
0088ae00	sturb w15,[x13, #-0x38]
0088ae04	strb w16,[x13], #0x70
0088ae08	b.ne 0x0088adf0
0088ae0c	cmp x10,x11
0088ae10	b.eq 0x0088ad44
0088ae14	madd x10,x28,x25,x9
0088ae18	sub x8,x8,x28
0088ae1c	add x9,x28,x22
0088ae20	add x10,x10,#0x31
0088ae24	add w11,w9,w21
0088ae28	subs x8,x8,#0x1
0088ae2c	add x9,x9,#0x1
0088ae30	strb w11,[x10], #0x38
0088ae34	b.ne 0x0088ae24
0088ae38	b 0x0088ad44
0088ae3c	ldr x8,[sp]
0088ae40	nop
0088ae44	madd x28,x28,x25,x8
0088ae48	ldr w8,[x28]
0088ae4c	cbz w8,0x0088ae98
0088ae50	mov x0,x19
0088ae54	mov x21,x1
0088ae58	bl 0x0088df20
0088ae5c	tbz w0,#0x1f,0x0088ad40
0088ae60	ldr w2,[x19, #0x64c]
0088ae64	add w8,w2,#0x1
0088ae68	cmp w8,#0x100
0088ae6c	b.cs 0x0088b044
0088ae70	ldr w9,[x19, #0x650]
0088ae74	str w8,[x19, #0x64c]
0088ae78	cmp w9,w8
0088ae7c	csel w8,w9,w8,hi
0088ae80	str w8,[x19, #0x650]
0088ae84	mov x0,x19
0088ae88	mov x1,x21
0088ae8c	mov w3,#0xff
0088ae90	bl 0x00891438
0088ae94	b 0x0088ad40
0088ae98	ldrb w8,[x28, #0x30]
0088ae9c	ldrb w9,[x28, #0x4]
0088aea0	bics wzr,w26,w8
0088aea4	csel w2,w9,w8,eq
0088aea8	strb w2,[x28, #0x31]
0088aeac	mov x0,x19
0088aeb0	mov w3,wzr
0088aeb4	bl 0x0088d1d0
0088aeb8	b 0x0088ad44
0088aebc	ldr x8,[x20, #0x38]
0088aec0	cmp x21,x8
0088aec4	b.cs 0x0088aee8
0088aec8	ldur x8,[x20, #0x30]
0088aecc	ldr x1,[x8, x21, LSL #0x3]
0088aed0	mov x0,x19
0088aed4	bl 0x00889800
0088aed8	ldr x8,[x20, #0x38]
0088aedc	add x21,x21,#0x1
0088aee0	cmp x21,x8
0088aee4	b.cc 0x0088aec8
0088aee8	ldp x21,x22,[sp]
0088aeec	cmp x21,x22
0088aef0	b.eq 0x0088af64
0088aef4	mov x24,xzr
0088aef8	b 0x0088af28
0088aefc	ldr x8,[x20, #0x20]
0088af00	ldr x4,[x8, x24, LSL #0x3]
0088af04	ldrb w2,[x21, #0x31]
0088af08	mov x0,x19
0088af0c	mov x1,x21
0088af10	mov w3,#0x1
0088af14	bl 0x00892774
0088af18	add x21,x21,#0x38
0088af1c	add x24,x24,#0x1
0088af20	cmp x21,x22
0088af24	b.eq 0x0088af60
0088af28	ldr w8,[x21]
0088af2c	cbz w8,0x0088af18
0088af30	ldr w8,[x19, #0xc]
0088af34	cmp w8,#0x1
0088af38	b.lt 0x0088af4c
0088af3c	ldr x0,[x19]
0088af40	ldr w8,[x21, #0x20]
0088af44	add w1,w8,#0x1
0088af48	bl 0x00876644
0088af4c	ldr x8,[x20, #0x28]
0088af50	cmp x24,x8
0088af54	b.cc 0x0088aefc
0088af58	mov x4,xzr
0088af5c	b 0x0088af04
0088af60	ldp x21,x22,[sp]
0088af64	cmp x21,x22
0088af68	b.ne 0x0088af80
0088af6c	cbnz x21,0x0088afb4
0088af70	b 0x0088afc8
0088af74	add x21,x21,#0x38
0088af78	cmp x21,x22
0088af7c	b.eq 0x0088afac
0088af80	ldr w8,[x21]
0088af84	cbnz w8,0x0088af74
0088af88	ldrb w3,[x21, #0x31]
0088af8c	ldrb w2,[x21, #0x4]
0088af90	cmp w3,w2
0088af94	b.eq 0x0088af74
0088af98	ldr x0,[x19]
0088af9c	mov w1,#0x6
0088afa0	mov w4,wzr
0088afa4	bl 0x00875b54
0088afa8	b 0x0088af74
0088afac	ldr x21,[sp]
0088afb0	cbz x21,0x0088afc8
0088afb4	ldr x8,[sp, #0x10]
0088afb8	mov x0,x21
0088afbc	str x21,[sp, #0x8]
0088afc0	sub x1,x8,x21
0088afc4	bl 0x00c2fe80
0088afc8	ldur w8,[x29, #-0x10]
0088afcc	ldur x9,[x29, #-0x18]
0088afd0	str w8,[x9, #0x64c]
0088afd4	ldr x8,[x23, #0x28]
0088afd8	ldur x9,[x29, #-0x8]
0088afdc	cmp x8,x9
0088afe0	b.ne 0x0088b124
0088afe4	ldp x20,x19,[sp, #0xb0]
0088afe8	ldp x22,x21,[sp, #0xa0]
0088afec	ldp x24,x23,[sp, #0x90]
0088aff0	ldp x26,x25,[sp, #0x80]
0088aff4	ldp x28,x27,[sp, #0x70]
0088aff8	ldp x29,x30,[sp, #0x60]
0088affc	add sp,sp,#0xc0
0088b000	ret
0088b004	ldrb w2,[sp, #0x1c]
0088b008	mov x0,x19
0088b00c	mov x1,x21
0088b010	mov w3,wzr
0088b014	bl 0x0088d1d0
0088b018	b 0x0088afc8
0088b01c	ldr x8,[x23, #0x28]
0088b020	ldur x9,[x29, #-0x8]
0088b024	cmp x8,x9
0088b028	b.ne 0x0088b124
0088b02c	adrp x1,0x2d0000
0088b030	add x1,x1,#0xc00
0088b034	add x0,x20,#0xc
0088b038	mov w2,w3
0088b03c	mov w3,#0xff
0088b040	bl 0x0087fcd8
0088b044	ldr x8,[x23, #0x28]
0088b048	ldur x9,[x29, #-0x8]
0088b04c	cmp x8,x9
0088b050	b.ne 0x0088b124
0088b054	adrp x1,0x2d0000
0088b058	add x1,x1,#0xc00
0088b05c	add x0,x21,#0xc
0088b060	mov w2,#0x1
0088b064	mov w3,#0xff
0088b068	bl 0x0087fcd8
0088b06c	ldr x8,[x23, #0x28]
0088b070	ldur x9,[x29, #-0x8]
0088b074	cmp x8,x9
0088b078	b.ne 0x0088b124
0088b07c	adrp x1,0x2d0000
0088b080	add x1,x1,#0xc00
0088b084	add x0,x21,#0xc
0088b088	mov w2,#0x1
0088b08c	mov w3,#0xff
0088b090	bl 0x0087fcd8
0088b124	bl 0x00c2fec0
