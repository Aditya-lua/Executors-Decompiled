; FUN_0094ac70 @ 0094ac70
0094ac70	sub sp,sp,#0x1a0
0094ac74	stp x28,x27,[sp, #0x140]
0094ac78	stp x26,x25,[sp, #0x150]
0094ac7c	stp x24,x23,[sp, #0x160]
0094ac80	stp x22,x21,[sp, #0x170]
0094ac84	stp x20,x19,[sp, #0x180]
0094ac88	stp x29,x30,[sp, #0x190]
0094ac8c	add x29,sp,#0x190
0094ac90	mrs x25,tpidr_el0
0094ac94	ldr x8,[x25, #0x28]
0094ac98	mov x19,x1
0094ac9c	mov x20,x0
0094aca0	stur x8,[x29, #-0x60]
0094aca4	cbz x0,0x0094b02c
0094aca8	cbz x19,0x0094b028
0094acac	ldrb w21,[x20]
0094acb0	mov w0,wzr
0094acb4	cbz w21,0x0094b02c
0094acb8	ldrb w23,[x19]
0094acbc	cbz w23,0x0094b028
0094acc0	adrp x0,0x2c8000
0094acc4	add x0,x0,#0xdbd
0094acc8	mov x1,x19
0094accc	bl 0x00c301f0
0094acd0	cbz w0,0x0094b020
0094acd4	cmp w21,#0x5b
0094acd8	b.ne 0x0094ad1c
0094acdc	mov w1,#0x5d
0094ace0	mov x0,x20
0094ace4	bl 0x00c30890
0094ace8	cbz x0,0x0094b02c
0094acec	add x1,x20,#0x1
0094acf0	sub x21,x0,x1
0094acf4	cmp x21,#0x7f
0094acf8	mov w0,wzr
0094acfc	b.hi 0x0094b02c
0094ad00	add x0,sp,#0x90
0094ad04	mov x2,x21
0094ad08	add x20,sp,#0x90
0094ad0c	bl 0x00c2ffd0
0094ad10	strb wzr,[x20, x21]
0094ad14	mov w26,#0x2
0094ad18	b 0x0094ad6c
0094ad1c	mov x0,x20
0094ad20	bl 0x00c2ff50
0094ad24	mov x21,x0
0094ad28	mov w0,#0x2
0094ad2c	add x2,sp,#0x90
0094ad30	mov x1,x20
0094ad34	bl 0x00c31b60
0094ad38	cmp w0,#0x1
0094ad3c	b.ne 0x0094ad50
0094ad40	mov w26,#0x1
0094ad44	ldrb w23,[x19]
0094ad48	cbnz w23,0x0094ad6c
0094ad4c	b 0x0094b028
0094ad50	sub x8,x21,#0x1
0094ad54	ldrb w9,[x20, x8]
0094ad58	mov w26,wzr
0094ad5c	cmp w9,#0x2e
0094ad60	csel x21,x8,x21,eq
0094ad64	ldrb w23,[x19]
0094ad68	cbz w23,0x0094b028
0094ad6c	mov x28,#0x201
0094ad70	mov w27,#0x1
0094ad74	movk x28,#0x1001, LSL #32
0094ad78	sub w24,w26,#0x1
0094ad7c	b 0x0094ad84
0094ad80	ldrb w23,[x19, #0x1]!
0094ad84	and w8,w23,#0xff
0094ad88	cmp w8,#0x9
0094ad8c	b.eq 0x0094ad80
0094ad90	cmp w8,#0x20
0094ad94	b.eq 0x0094ad80
0094ad98	mov x22,xzr
0094ad9c	mov w8,w23
0094ada0	b 0x0094adb0
0094ada4	add x8,x19,x22
0094ada8	ldrb w8,[x8, #0x1]
0094adac	add x22,x22,#0x1
0094adb0	and w9,w8,#0xff
0094adb4	cmp w9,#0x2c
0094adb8	and x8,x8,#0xff
0094adbc	b.hi 0x0094ada4
0094adc0	lsl x8,x27,x8
0094adc4	tst x8,x28
0094adc8	b.eq 0x0094ada4
0094adcc	cbz x22,0x0094afbc
0094add0	cmp w24,#0x2
0094add4	b.cs 0x0094ae24
0094add8	cmp x22,#0x80
0094addc	b.cs 0x0094afbc
0094ade0	add x0,sp,#0x10
0094ade4	mov x1,x19
0094ade8	mov x2,x22
0094adec	str w24,[sp, #0xc]
0094adf0	add x23,sp,#0x10
0094adf4	bl 0x00c2ffd0
0094adf8	add x0,sp,#0x10
0094adfc	mov w1,#0x2f
0094ae00	strb wzr,[x23, x22]
0094ae04	bl 0x00c30890
0094ae08	mov x24,x0
0094ae0c	cbz x0,0x0094ae64
0094ae10	add x0,x24,#0x1
0094ae14	bl 0x00c308a0
0094ae18	mov w23,w0
0094ae1c	strb wzr,[x24]
0094ae20	b 0x0094ae68
0094ae24	cbnz w26,0x0094afbc
0094ae28	add x8,x19,x22
0094ae2c	ldurb w8,[x8, #-0x1]
0094ae30	sub x9,x22,#0x1
0094ae34	cmp w8,#0x2e
0094ae38	csel x2,x9,x22,eq
0094ae3c	cbz x2,0x0094af88
0094ae40	and w8,w23,#0xff
0094ae44	cmp w8,#0x2e
0094ae48	mov x0,x19
0094ae4c	b.ne 0x0094af8c
0094ae50	add x0,x19,#0x1
0094ae54	sub x2,x2,#0x1
0094ae58	subs x8,x21,x2
0094ae5c	b.eq 0x0094af94
0094ae60	b 0x0094afa8
0094ae64	mov w23,wzr
0094ae68	mov w8,#0x80
0094ae6c	cmp w26,#0x2
0094ae70	b.ne 0x0094af24
0094ae74	cmp w23,#0x0
0094ae78	csel w8,w8,w23,eq
0094ae7c	cmp w8,#0x87
0094ae80	b.hi 0x0094af1c
0094ae84	lsr w24,w8,#0x3
0094ae88	cmp w24,#0x10
0094ae8c	and w23,w8,#0x7
0094ae90	b.ne 0x0094ae98
0094ae94	cbnz w23,0x0094af1c
0094ae98	mov w0,#0xa
0094ae9c	sub x2,x29,#0x70
0094aea0	mov x1,x20
0094aea4	bl 0x00c31b60
0094aea8	cmp w0,#0x1
0094aeac	b.ne 0x0094af1c
0094aeb0	mov w0,#0xa
0094aeb4	add x1,sp,#0x10
0094aeb8	sub x2,x29,#0x80
0094aebc	bl 0x00c31b60
0094aec0	sub x10,x29,#0x80
0094aec4	sub x9,x29,#0x70
0094aec8	cmp w0,#0x1
0094aecc	b.ne 0x0094af1c
0094aed0	cbz w24,0x0094aef0
0094aed4	mov w2,w24
0094aed8	sub x0,x29,#0x70
0094aedc	sub x1,x29,#0x80
0094aee0	bl 0x00c300b0
0094aee4	sub x10,x29,#0x80
0094aee8	sub x9,x29,#0x70
0094aeec	cbnz w0,0x0094af1c
0094aef0	cbz w23,0x0094b020
0094aef4	mov w8,w24
0094aef8	ldrb w9,[x9, x8]
0094aefc	ldrb w8,[x10, x8]
0094af00	mov w10,#0x8
0094af04	sub w10,w10,w23
0094af08	eor w8,w8,w9
0094af0c	orr w9,wzr,#0xff
0094af10	lsl w9,w9,w10
0094af14	tst w9,w8
0094af18	b.ne 0x0094b020
0094af1c	ldr w24,[sp, #0xc]
0094af20	b 0x0094afbc
0094af24	ldr w24,[sp, #0xc]
0094af28	cmp w23,#0x20
0094af2c	stur wzr,[x29, #-0x70]
0094af30	stur wzr,[x29, #-0x80]
0094af34	b.hi 0x0094afbc
0094af38	mov w0,#0x2
0094af3c	sub x2,x29,#0x70
0094af40	mov x1,x20
0094af44	bl 0x00c31b60
0094af48	cmp w0,#0x1
0094af4c	b.ne 0x0094afbc
0094af50	mov w0,#0x2
0094af54	add x1,sp,#0x10
0094af58	sub x2,x29,#0x80
0094af5c	bl 0x00c31b60
0094af60	cmp w0,#0x1
0094af64	b.ne 0x0094afbc
0094af68	orr w8,w23,#0x20
0094af6c	cmp w8,#0x20
0094af70	b.ne 0x0094aff8
0094af74	ldur w8,[x29, #-0x70]
0094af78	ldur w9,[x29, #-0x80]
0094af7c	cmp w8,w9
0094af80	b.ne 0x0094afbc
0094af84	b 0x0094b020
0094af88	mov x0,x19
0094af8c	subs x8,x21,x2
0094af90	b.ne 0x0094afa8
0094af94	mov x1,x20
0094af98	mov x2,x21
0094af9c	bl 0x00c31b50
0094afa0	cbz w0,0x0094afbc
0094afa4	b 0x0094b020
0094afa8	b.ls 0x0094afbc
0094afac	add x1,x20,x8
0094afb0	ldurb w8,[x1, #-0x1]
0094afb4	cmp w8,#0x2e
0094afb8	b.eq 0x0094af9c
0094afbc	add x19,x19,x22
0094afc0	b 0x0094afc8
0094afc4	add x19,x19,#0x1
0094afc8	ldrb w8,[x19]
0094afcc	cmp w8,#0x9
0094afd0	b.eq 0x0094afc4
0094afd4	cmp w8,#0x20
0094afd8	b.eq 0x0094afc4
0094afdc	cmp w8,#0x2c
0094afe0	b.ne 0x0094b028
0094afe4	ldrb w23,[x19, #0x1]!
0094afe8	cmp w23,#0x2c
0094afec	b.eq 0x0094afe4
0094aff0	cbnz w23,0x0094ad84
0094aff4	b 0x0094b028
0094aff8	ldur w8,[x29, #-0x70]
0094affc	ldur w9,[x29, #-0x80]
0094b000	mov w10,#0x20
0094b004	sub w10,w10,w23
0094b008	mov w11,#0xffffffff
0094b00c	eor w8,w9,w8
0094b010	lsl w10,w11,w10
0094b014	rev w8,w8
0094b018	tst w8,w10
0094b01c	b.ne 0x0094afbc
0094b020	mov w0,#0x1
0094b024	b 0x0094b02c
0094b028	mov w0,wzr
0094b02c	ldr x8,[x25, #0x28]
0094b030	ldur x9,[x29, #-0x60]
0094b034	cmp x8,x9
0094b038	b.ne 0x0094b05c
0094b03c	ldp x29,x30,[sp, #0x190]
0094b040	ldp x20,x19,[sp, #0x180]
0094b044	ldp x22,x21,[sp, #0x170]
0094b048	ldp x24,x23,[sp, #0x160]
0094b04c	ldp x26,x25,[sp, #0x150]
0094b050	ldp x28,x27,[sp, #0x140]
0094b054	add sp,sp,#0x1a0
0094b058	ret
0094b05c	bl 0x00c2fec0
