; FUN_00c2e890 @ 00c2e890
00c2e890	paciasp
00c2e894	stp x29,x30,[sp, #-0x60]!
00c2e898	stp x28,x27,[sp, #0x10]
00c2e89c	stp x26,x25,[sp, #0x20]
00c2e8a0	stp x24,x23,[sp, #0x30]
00c2e8a4	stp x22,x21,[sp, #0x40]
00c2e8a8	stp x20,x19,[sp, #0x50]
00c2e8ac	mov x29,sp
00c2e8b0	sub sp,sp,#0x330
00c2e8b4	mov x8,x0
00c2e8b8	stur x0,[x29, #-0x8]
00c2e8bc	sub x0,x29,#0x8
00c2e8c0	add x1,x8,#0x14
00c2e8c4	mov x21,x3
00c2e8c8	mov x19,x2
00c2e8cc	bl 0x00c2e6c8
00c2e8d0	ldur x10,[x29, #-0x8]
00c2e8d4	str x21,[sp, #0x10]
00c2e8d8	add x20,x10,x0
00c2e8dc	cmp x10,x20
00c2e8e0	b.cs 0x00c2f018
00c2e8e4	add x8,sp,#0x8
00c2e8e8	add x21,x19,#0xf0
00c2e8ec	add x22,x19,#0xe8
00c2e8f0	add x23,x19,#0x108
00c2e8f4	add x24,x19,#0xf8
00c2e8f8	add x27,x8,#0x8
00c2e8fc	add x25,x19,#0x100
00c2e900	adrp x26,0x78d000
00c2e904	add x26,x26,#0x7c0
00c2e908	b 0x00c2e920
00c2e90c	ldr x8,[x8]
00c2e910	str x8,[x27, #0x8]!
00c2e914	ldur x10,[x29, #-0x8]
00c2e918	cmp x10,x20
00c2e91c	b.cs 0x00c2f014
00c2e920	add x8,x10,#0x1
00c2e924	stur x8,[x29, #-0x8]
00c2e928	ldrb w9,[x10]
00c2e92c	sub w11,w9,#0x3
00c2e930	cmp w11,#0x91
00c2e934	b.hi 0x00c2f110
00c2e938	adr x12,0xc2e948
00c2e93c	ldrh w13,[x26, x11, LSL #0x1]
00c2e940	add x12,x12,x13, LSL #0x2
00c2e944	br x12
00c2e948	bti j
00c2e94c	sub w8,w9,#0x30
00c2e950	b 0x00c2e910
00c2e954	bti j
00c2e958	mov x10,xzr
00c2e95c	sub w11,w9,#0x70
00c2e960	mov x12,#-0x7
00c2e964	mov x13,x8
00c2e968	cmp x13,x20
00c2e96c	b.eq 0x00c2f040
00c2e970	ldrb w14,[x13], #0x1
00c2e974	add x12,x12,#0x7
00c2e978	add x8,x8,#0x1
00c2e97c	and x15,x14,#0x7f
00c2e980	lsl x15,x15,x12
00c2e984	orr x10,x15,x10
00c2e988	tbnz w14,#0x7,0x00c2e968
00c2e98c	add w13,w12,#0x7
00c2e990	mov x15,#-0x1
00c2e994	cmp x12,#0x39
00c2e998	mov w12,#0x3f
00c2e99c	lsl x13,x15,x13
00c2e9a0	stur x8,[x29, #-0x8]
00c2e9a4	ccmp w14,w12,#0x0,cc
00c2e9a8	csel x12,x13,xzr,hi
00c2e9ac	cmp w9,#0x8d
00c2e9b0	b.le 0x00c2ea0c
00c2e9b4	cmp w9,#0x8f
00c2e9b8	b.gt 0x00c2ea34
00c2e9bc	cmp w9,#0x8e
00c2e9c0	mov x8,x21
00c2e9c4	b.eq 0x00c2ea58
00c2e9c8	cmp w9,#0x8f
00c2e9cc	mov x8,x24
00c2e9d0	b.eq 0x00c2ea58
00c2e9d4	b 0x00c2ea4c
00c2e9d8	bti j
00c2e9dc	cmp w9,#0x6f
00c2e9e0	mov x8,x24
00c2e9e4	b.eq 0x00c2e90c
00c2e9e8	cmp w9,#0x6e
00c2e9ec	mov x8,x21
00c2e9f0	b.eq 0x00c2e90c
00c2e9f4	cmp w9,#0x6d
00c2e9f8	mov x8,x22
00c2e9fc	b.eq 0x00c2e90c
00c2ea00	sub w8,w9,#0x50
00c2ea04	add x8,x19,w8, UXTW  #0x3
00c2ea08	b 0x00c2e90c
00c2ea0c	cmp w9,#0x6e
00c2ea10	mov x8,x24
00c2ea14	b.eq 0x00c2ea58
00c2ea18	cmp w9,#0x6f
00c2ea1c	mov x8,x25
00c2ea20	b.eq 0x00c2ea58
00c2ea24	cmp w9,#0x8d
00c2ea28	mov x8,x22
00c2ea2c	b.eq 0x00c2ea58
00c2ea30	b 0x00c2ea4c
00c2ea34	cmp w9,#0x90
00c2ea38	mov x8,x25
00c2ea3c	b.eq 0x00c2ea58
00c2ea40	cmp w9,#0x92
00c2ea44	mov x8,x23
00c2ea48	b.eq 0x00c2ea58
00c2ea4c	cmp w11,#0x1c
00c2ea50	b.hi 0x00c2f0dc
00c2ea54	add x8,x19,w11, UXTW  #0x3
00c2ea58	ldr x8,[x8]
00c2ea5c	orr x9,x10,x12
00c2ea60	add x8,x8,x9
00c2ea64	b 0x00c2e910
00c2ea68	bti j
00c2ea6c	ldur x8,[x10, #0x1]
00c2ea70	add x9,x10,#0x9
00c2ea74	b 0x00c2ed78
00c2ea78	bti j
00c2ea7c	sub x0,x29,#0x8
00c2ea80	mov x1,x20
00c2ea84	bl 0x00c2e6c8
00c2ea88	ldur x10,[x29, #-0x8]
00c2ea8c	mov x8,xzr
00c2ea90	mov x9,#-0x7
00c2ea94	mov x11,x10
00c2ea98	cmp x11,x20
00c2ea9c	b.eq 0x00c2f074
00c2eaa0	ldrb w12,[x11], #0x1
00c2eaa4	add x9,x9,#0x7
00c2eaa8	add x10,x10,#0x1
00c2eaac	and x13,x12,#0x7f
00c2eab0	lsl x13,x13,x9
00c2eab4	orr x8,x13,x8
00c2eab8	tbnz w12,#0x7,0x00c2ea98
00c2eabc	add w11,w9,#0x7
00c2eac0	mov x13,#-0x1
00c2eac4	cmp x9,#0x39
00c2eac8	mov w9,#0x3f
00c2eacc	lsl x11,x13,x11
00c2ead0	stur x10,[x29, #-0x8]
00c2ead4	ccmp w12,w9,#0x0,cc
00c2ead8	csel x9,x11,xzr,hi
00c2eadc	cmp w0,#0x1d
00c2eae0	b.le 0x00c2ef70
00c2eae4	cmp w0,#0x1f
00c2eae8	b.gt 0x00c2efc4
00c2eaec	cmp w0,#0x1e
00c2eaf0	mov x10,x21
00c2eaf4	b.eq 0x00c2efec
00c2eaf8	cmp w0,#0x1f
00c2eafc	mov x10,x24
00c2eb00	b.eq 0x00c2efec
00c2eb04	b 0x00c2efdc
00c2eb08	bti j
00c2eb0c	mov x8,x27
00c2eb10	ldr x9,[x27]
00c2eb14	ldr x10,[x8, #-0x8]!
00c2eb18	cmp x10,x9
00c2eb1c	cset w9,cc
00c2eb20	b 0x00c2eed4
00c2eb24	bti j
00c2eb28	mov x8,x27
00c2eb2c	ldr x9,[x27]
00c2eb30	ldr x10,[x8, #-0x8]!
00c2eb34	cmp x10,x9
00c2eb38	cset w9,ls
00c2eb3c	b 0x00c2eed4
00c2eb40	bti j
00c2eb44	mov x8,x27
00c2eb48	ldr x9,[x27]
00c2eb4c	ldr x10,[x8, #-0x8]!
00c2eb50	sdiv x11,x10,x9
00c2eb54	msub x9,x11,x9,x10
00c2eb58	b 0x00c2eed4
00c2eb5c	bti j
00c2eb60	mov x8,x27
00c2eb64	ldr x9,[x27]
00c2eb68	ldr x10,[x8, #-0x8]!
00c2eb6c	cmp x10,x9
00c2eb70	cset w9,eq
00c2eb74	b 0x00c2eed4
00c2eb78	bti j
00c2eb7c	ldursh x8,[x10, #0x1]
00c2eb80	add x9,x10,#0x3
00c2eb84	b 0x00c2ed78
00c2eb88	bti j
00c2eb8c	ldr x11,[x27], #-0x8
00c2eb90	ldursh x8,[x10, #0x1]
00c2eb94	add x9,x10,#0x3
00c2eb98	stur x9,[x29, #-0x8]
00c2eb9c	cbz x11,0x00c2e914
00c2eba0	add x8,x9,x8
00c2eba4	stur x8,[x29, #-0x8]
00c2eba8	b 0x00c2e914
00c2ebac	bti j
00c2ebb0	mov x8,x27
00c2ebb4	ldr x9,[x27]
00c2ebb8	ldr x10,[x8, #-0x8]!
00c2ebbc	cmp x10,x9
00c2ebc0	cset w9,cs
00c2ebc4	b 0x00c2eed4
00c2ebc8	bti j
00c2ebcc	mov x9,xzr
00c2ebd0	mov x10,#-0x7
00c2ebd4	mov x11,x8
00c2ebd8	cmp x11,x20
00c2ebdc	b.eq 0x00c2f0a8
00c2ebe0	ldrb w12,[x11], #0x1
00c2ebe4	add x10,x10,#0x7
00c2ebe8	add x8,x8,#0x1
00c2ebec	and x13,x12,#0x7f
00c2ebf0	lsl x13,x13,x10
00c2ebf4	orr x9,x13,x9
00c2ebf8	tbnz w12,#0x7,0x00c2ebd8
00c2ebfc	add w11,w10,#0x7
00c2ec00	mov x13,#-0x1
00c2ec04	cmp x10,#0x39
00c2ec08	mov w10,#0x3f
00c2ec0c	lsl x11,x13,x11
00c2ec10	stur x8,[x29, #-0x8]
00c2ec14	ccmp w12,w10,#0x0,cc
00c2ec18	csel x10,x11,xzr,hi
00c2ec1c	orr x9,x9,x10
00c2ec20	str x9,[x27, #0x8]!
00c2ec24	b 0x00c2e914
00c2ec28	bti j
00c2ec2c	mov x8,x27
00c2ec30	ldr x9,[x27]
00c2ec34	ldr x10,[x8, #-0x8]!
00c2ec38	and x9,x10,x9
00c2ec3c	b 0x00c2eed4
00c2ec40	bti j
00c2ec44	mov x8,x27
00c2ec48	ldr x9,[x27]
00c2ec4c	ldr x10,[x8, #-0x8]!
00c2ec50	cmp x10,x9
00c2ec54	cset w9,hi
00c2ec58	b 0x00c2eed4
00c2ec5c	bti j
00c2ec60	ldursw x8,[x10, #0x1]
00c2ec64	add x9,x10,#0x5
00c2ec68	b 0x00c2ed78
00c2ec6c	bti j
00c2ec70	mov x8,x27
00c2ec74	ldr x9,[x27]
00c2ec78	ldr x10,[x8, #-0x8]!
00c2ec7c	eor x9,x10,x9
00c2ec80	b 0x00c2eed4
00c2ec84	bti j
00c2ec88	ldr x8,[x27]
00c2ec8c	tbz x8,#0x3f,0x00c2e914
00c2ec90	b 0x00c2eeb0
00c2ec94	bti j
00c2ec98	ldrsb x8,[x10, #0x1]
00c2ec9c	b 0x00c2ecdc
00c2eca0	bti j
00c2eca4	ldr x8,[x27]
00c2eca8	b 0x00c2e910
00c2ecac	bti j
00c2ecb0	sub x0,x29,#0x8
00c2ecb4	mov x1,x20
00c2ecb8	bl 0x00c2e6c8
00c2ecbc	str x0,[x27, #0x8]!
00c2ecc0	b 0x00c2e914
00c2ecc4	bti j
00c2ecc8	ldur w8,[x10, #0x1]
00c2eccc	add x9,x10,#0x5
00c2ecd0	b 0x00c2ed78
00c2ecd4	bti j
00c2ecd8	ldrb w8,[x10, #0x1]
00c2ecdc	add x9,x10,#0x2
00c2ece0	b 0x00c2ed78
00c2ece4	bti j
00c2ece8	sub x27,x27,#0x8
00c2ecec	b 0x00c2e914
00c2ecf0	bti j
00c2ecf4	ldurh w8,[x10, #0x1]
00c2ecf8	add x9,x10,#0x3
00c2ecfc	b 0x00c2ed78
00c2ed00	bti j
00c2ed04	ldr x8,[x27]
00c2ed08	ldr x8,[x8]
00c2ed0c	str x8,[x27]
00c2ed10	b 0x00c2e914
00c2ed14	bti j
00c2ed18	ldur q0,[x27, #-0x10]
00c2ed1c	ldr x8,[x27]
00c2ed20	stur q0,[x27, #-0x8]
00c2ed24	stur x8,[x27, #-0x10]
00c2ed28	b 0x00c2e914
00c2ed2c	bti j
00c2ed30	mov x8,x27
00c2ed34	ldr x9,[x27]
00c2ed38	ldr x10,[x8, #-0x8]!
00c2ed3c	sdiv x9,x10,x9
00c2ed40	b 0x00c2eed4
00c2ed44	bti j
00c2ed48	ldur x8,[x27, #-0x8]
00c2ed4c	b 0x00c2e910
00c2ed50	bti j
00c2ed54	ldur q0,[x27, #-0x8]
00c2ed58	ext v0.16B,v0.16B,v0.16B,0x8
00c2ed5c	stur q0,[x27, #-0x8]
00c2ed60	b 0x00c2e914
00c2ed64	bti j
00c2ed68	ldrb w8,[x10, #0x1]
00c2ed6c	add x9,x10,#0x2
00c2ed70	sub x8,x27,x8, LSL #0x3
00c2ed74	ldr x8,[x8]
00c2ed78	stur x9,[x29, #-0x8]
00c2ed7c	b 0x00c2e910
00c2ed80	bti j
00c2ed84	ldr x8,[x27]
00c2ed88	mvn x8,x8
00c2ed8c	str x8,[x27]
00c2ed90	b 0x00c2e914
00c2ed94	bti j
00c2ed98	mov x8,x27
00c2ed9c	ldr x9,[x27]
00c2eda0	ldr x10,[x8, #-0x8]!
00c2eda4	lsl x9,x10,x9
00c2eda8	b 0x00c2eed4
00c2edac	bti j
00c2edb0	mov x8,x27
00c2edb4	ldr x9,[x27]
00c2edb8	ldr x10,[x8, #-0x8]!
00c2edbc	lsr x9,x10,x9
00c2edc0	b 0x00c2eed4
00c2edc4	bti j
00c2edc8	mov x8,x27
00c2edcc	ldr x9,[x27]
00c2edd0	ldr x10,[x8, #-0x8]!
00c2edd4	add x9,x10,x9
00c2edd8	b 0x00c2eed4
00c2eddc	bti j
00c2ede0	add x8,x10,#0x2
00c2ede4	stur x8,[x29, #-0x8]
00c2ede8	ldr x8,[x27]
00c2edec	ldrb w9,[x10, #0x1]
00c2edf0	cmp w9,#0x3
00c2edf4	b.gt 0x00c2ef34
00c2edf8	cmp w9,#0x1
00c2edfc	b.eq 0x00c2effc
00c2ee00	cmp w9,#0x2
00c2ee04	b.ne 0x00c2f1b8
00c2ee08	ldrh w8,[x8]
00c2ee0c	str x8,[x27]
00c2ee10	b 0x00c2e914
00c2ee14	bti j
00c2ee18	sub x0,x29,#0x8
00c2ee1c	mov x1,x20
00c2ee20	bl 0x00c2e6c8
00c2ee24	ldr x8,[x27]
00c2ee28	add x8,x8,x0
00c2ee2c	str x8,[x27]
00c2ee30	b 0x00c2e914
00c2ee34	bti j
00c2ee38	mov x8,x27
00c2ee3c	ldr x9,[x27]
00c2ee40	ldr x10,[x8, #-0x8]!
00c2ee44	asr x9,x10,x9
00c2ee48	b 0x00c2eed4
00c2ee4c	bti j
00c2ee50	ldr x8,[x27]
00c2ee54	ldr x8,[x8]
00c2ee58	str x8,[x27, #-0x8]!
00c2ee5c	b 0x00c2e914
00c2ee60	bti j
00c2ee64	mov x8,x27
00c2ee68	ldr x9,[x27]
00c2ee6c	ldr x10,[x8, #-0x8]!
00c2ee70	mul x9,x10,x9
00c2ee74	b 0x00c2eed4
00c2ee78	bti j
00c2ee7c	mov x8,x27
00c2ee80	ldr x9,[x27]
00c2ee84	ldr x10,[x8, #-0x8]!
00c2ee88	sub x9,x10,x9
00c2ee8c	b 0x00c2eed4
00c2ee90	bti j
00c2ee94	mov x8,x27
00c2ee98	ldr x9,[x27]
00c2ee9c	ldr x10,[x8, #-0x8]!
00c2eea0	orr x9,x10,x9
00c2eea4	b 0x00c2eed4
00c2eea8	bti j
00c2eeac	ldr x8,[x27]
00c2eeb0	neg x8,x8
00c2eeb4	str x8,[x27]
00c2eeb8	b 0x00c2e914
00c2eebc	bti j
00c2eec0	mov x8,x27
00c2eec4	ldr x9,[x27]
00c2eec8	ldr x10,[x8, #-0x8]!
00c2eecc	cmp x10,x9
00c2eed0	cset w9,ne
00c2eed4	str x9,[x8]
00c2eed8	mov x27,x8
00c2eedc	b 0x00c2e914
00c2eee0	bti j
00c2eee4	ldursh x8,[x10, #0x1]
00c2eee8	add x8,x10,x8
00c2eeec	add x8,x8,#0x3
00c2eef0	stur x8,[x29, #-0x8]
00c2eef4	b 0x00c2e914
00c2eef8	bti j
00c2eefc	sub x0,x29,#0x8
00c2ef00	mov x1,x20
00c2ef04	bl 0x00c2e6c8
00c2ef08	cmp w0,#0x1d
00c2ef0c	b.le 0x00c2ef48
00c2ef10	cmp w0,#0x1f
00c2ef14	b.gt 0x00c2ef98
00c2ef18	cmp w0,#0x1e
00c2ef1c	mov x8,x21
00c2ef20	b.eq 0x00c2e90c
00c2ef24	cmp w0,#0x1f
00c2ef28	mov x8,x24
00c2ef2c	b.eq 0x00c2e90c
00c2ef30	b 0x00c2efb0
00c2ef34	cmp w9,#0x4
00c2ef38	b.eq 0x00c2f008
00c2ef3c	cmp w9,#0x8
00c2ef40	b.eq 0x00c2ed08
00c2ef44	b 0x00c2f1b8
00c2ef48	cmn w0,#0x2
00c2ef4c	mov x8,x24
00c2ef50	b.eq 0x00c2e90c
00c2ef54	cmn w0,#0x1
00c2ef58	mov x8,x25
00c2ef5c	b.eq 0x00c2e90c
00c2ef60	cmp w0,#0x1d
00c2ef64	mov x8,x22
00c2ef68	b.eq 0x00c2e90c
00c2ef6c	b 0x00c2efb0
00c2ef70	cmn w0,#0x2
00c2ef74	mov x10,x24
00c2ef78	b.eq 0x00c2efec
00c2ef7c	cmn w0,#0x1
00c2ef80	mov x10,x25
00c2ef84	b.eq 0x00c2efec
00c2ef88	cmp w0,#0x1d
00c2ef8c	mov x10,x22
00c2ef90	b.eq 0x00c2efec
00c2ef94	b 0x00c2efdc
00c2ef98	cmp w0,#0x20
00c2ef9c	mov x8,x25
00c2efa0	b.eq 0x00c2e90c
00c2efa4	cmp w0,#0x22
00c2efa8	mov x8,x23
00c2efac	b.eq 0x00c2e90c
00c2efb0	cmp w0,#0x1c
00c2efb4	b.hi 0x00c2f220
00c2efb8	and x8,x0,#0x1f
00c2efbc	add x8,x19,x8, LSL #0x3
00c2efc0	b 0x00c2e90c
00c2efc4	cmp w0,#0x20
00c2efc8	mov x10,x25
00c2efcc	b.eq 0x00c2efec
00c2efd0	cmp w0,#0x22
00c2efd4	mov x10,x23
00c2efd8	b.eq 0x00c2efec
00c2efdc	cmp w0,#0x1c
00c2efe0	b.hi 0x00c2f1ec
00c2efe4	and x10,x0,#0x1f
00c2efe8	add x10,x19,x10, LSL #0x3
00c2efec	ldr x10,[x10]
00c2eff0	orr x8,x8,x9
00c2eff4	add x8,x10,x8
00c2eff8	b 0x00c2e910
00c2effc	ldrb w8,[x8]
00c2f000	str x8,[x27]
00c2f004	b 0x00c2e914
00c2f008	ldr w8,[x8]
00c2f00c	str x8,[x27]
00c2f010	b 0x00c2e914
00c2f014	ldr x21,[x27]
00c2f018	mov x0,x21
00c2f01c	add sp,sp,#0x330
00c2f020	ldp x20,x19,[sp, #0x50]
00c2f024	ldp x22,x21,[sp, #0x40]
00c2f028	ldp x24,x23,[sp, #0x30]
00c2f02c	ldp x26,x25,[sp, #0x20]
00c2f030	ldp x28,x27,[sp, #0x10]
00c2f034	ldp x29,x30,[sp], #0x60
00c2f038	autiasp
00c2f03c	ret
00c2f040	adrp x19,0xcb4000
00c2f044	adrp x1,0x2a1000
00c2f048	add x1,x1,#0x45d
00c2f04c	ldr x19,[x19, #0xba0]
00c2f050	adrp x2,0x2c2000
00c2f054	add x2,x2,#0xcb4
00c2f058	adrp x3,0x2b3000
00c2f05c	add x3,x3,#0x329
00c2f060	add x0,x19,#0x130
00c2f064	bl 0x00c30940
00c2f068	add x0,x19,#0x130
00c2f06c	bl 0x00c30c50
00c2f070	bl 0x00c30b40
00c2f074	adrp x19,0xcb4000
00c2f078	adrp x1,0x2a1000
00c2f07c	add x1,x1,#0x45d
00c2f080	ldr x19,[x19, #0xba0]
00c2f084	adrp x2,0x2c2000
00c2f088	add x2,x2,#0xcb4
00c2f08c	adrp x3,0x2b3000
00c2f090	add x3,x3,#0x329
00c2f094	add x0,x19,#0x130
00c2f098	bl 0x00c30940
00c2f09c	add x0,x19,#0x130
00c2f0a0	bl 0x00c30c50
00c2f0a4	bl 0x00c30b40
00c2f0a8	adrp x19,0xcb4000
00c2f0ac	adrp x1,0x2a1000
00c2f0b0	add x1,x1,#0x45d
00c2f0b4	ldr x19,[x19, #0xba0]
00c2f0b8	adrp x2,0x2c2000
00c2f0bc	add x2,x2,#0xcb4
00c2f0c0	adrp x3,0x2b3000
00c2f0c4	add x3,x3,#0x329
00c2f0c8	add x0,x19,#0x130
00c2f0cc	bl 0x00c30940
00c2f0d0	add x0,x19,#0x130
00c2f0d4	bl 0x00c30c50
00c2f0d8	bl 0x00c30b40
00c2f0dc	adrp x19,0xcb4000
00c2f0e0	adrp x1,0x2a1000
00c2f0e4	add x1,x1,#0x45d
00c2f0e8	ldr x19,[x19, #0xba0]
00c2f0ec	adrp x2,0x2ba000
00c2f0f0	add x2,x2,#0xce6
00c2f0f4	adrp x3,0x2b1000
00c2f0f8	add x3,x3,#0x204
00c2f0fc	add x0,x19,#0x130
00c2f100	bl 0x00c30940
00c2f104	add x0,x19,#0x130
00c2f108	bl 0x00c30c50
00c2f10c	bl 0x00c30b40
00c2f110	bti j
00c2f114	adrp x19,0xcb4000
00c2f118	adrp x1,0x2a1000
00c2f11c	add x1,x1,#0x45d
00c2f120	ldr x19,[x19, #0xba0]
00c2f124	adrp x2,0x2b5000
00c2f128	add x2,x2,#0x146
00c2f12c	adrp x3,0x2c8000
00c2f130	add x3,x3,#0xaab
00c2f134	add x0,x19,#0x130
00c2f138	bl 0x00c30940
00c2f13c	add x0,x19,#0x130
00c2f140	bl 0x00c30c50
00c2f144	bl 0x00c30b40
00c2f148	bti j
00c2f14c	adrp x19,0xcb4000
00c2f150	adrp x1,0x2a1000
00c2f154	add x1,x1,#0x45d
00c2f158	ldr x19,[x19, #0xba0]
00c2f15c	adrp x2,0x2b5000
00c2f160	add x2,x2,#0x146
00c2f164	adrp x3,0x2b3000
00c2f168	add x3,x3,#0x346
00c2f16c	add x0,x19,#0x130
00c2f170	bl 0x00c30940
00c2f174	add x0,x19,#0x130
00c2f178	bl 0x00c30c50
00c2f17c	bl 0x00c30b40
00c2f180	bti j
00c2f184	adrp x19,0xcb4000
00c2f188	adrp x1,0x2a1000
00c2f18c	add x1,x1,#0x45d
00c2f190	ldr x19,[x19, #0xba0]
00c2f194	adrp x2,0x2b5000
00c2f198	add x2,x2,#0x146
00c2f19c	adrp x3,0x2da000
00c2f1a0	add x3,x3,#0xea8
00c2f1a4	add x0,x19,#0x130
00c2f1a8	bl 0x00c30940
00c2f1ac	add x0,x19,#0x130
00c2f1b0	bl 0x00c30c50
00c2f1b4	bl 0x00c30b40
00c2f1b8	adrp x19,0xcb4000
00c2f1bc	adrp x1,0x2a1000
00c2f1c0	add x1,x1,#0x45d
00c2f1c4	ldr x19,[x19, #0xba0]
00c2f1c8	adrp x2,0x2b5000
00c2f1cc	add x2,x2,#0x146
00c2f1d0	adrp x3,0x2c2000
00c2f1d4	add x3,x3,#0xcbf
00c2f1d8	add x0,x19,#0x130
00c2f1dc	bl 0x00c30940
00c2f1e0	add x0,x19,#0x130
00c2f1e4	bl 0x00c30c50
00c2f1e8	bl 0x00c30b40
00c2f1ec	adrp x19,0xcb4000
00c2f1f0	adrp x1,0x2a1000
00c2f1f4	add x1,x1,#0x45d
00c2f1f8	ldr x19,[x19, #0xba0]
00c2f1fc	adrp x2,0x2ba000
00c2f200	add x2,x2,#0xce6
00c2f204	adrp x3,0x2b1000
00c2f208	add x3,x3,#0x204
00c2f20c	add x0,x19,#0x130
00c2f210	bl 0x00c30940
00c2f214	add x0,x19,#0x130
00c2f218	bl 0x00c30c50
00c2f21c	bl 0x00c30b40
00c2f220	adrp x19,0xcb4000
00c2f224	adrp x1,0x2a1000
00c2f228	add x1,x1,#0x45d
00c2f22c	ldr x19,[x19, #0xba0]
00c2f230	adrp x2,0x2ba000
00c2f234	add x2,x2,#0xce6
00c2f238	adrp x3,0x2b1000
00c2f23c	add x3,x3,#0x204
00c2f240	add x0,x19,#0x130
00c2f244	bl 0x00c30940
00c2f248	add x0,x19,#0x130
00c2f24c	bl 0x00c30c50
00c2f250	bl 0x00c30b40
