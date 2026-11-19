; DES_xcbc_encrypt @ 00a95764
00a95764	sub sp,sp,#0xa0
00a95768	stp x28,x27,[sp, #0x40]
00a9576c	stp x26,x25,[sp, #0x50]
00a95770	stp x24,x23,[sp, #0x60]
00a95774	stp x22,x21,[sp, #0x70]
00a95778	stp x20,x19,[sp, #0x80]
00a9577c	stp x29,x30,[sp, #0x90]
00a95780	ldp w13,w12,[x5]
00a95784	ldp w11,w10,[x6]
00a95788	ldp w28,w20,[x4]
00a9578c	mov x24,x4
00a95790	mov x19,x2
00a95794	mov x25,x1
00a95798	mov x23,x0
00a9579c	mov w21,w12
00a957a0	mov x27,x3
00a957a4	mov w26,w13
00a957a8	add x29,sp,#0x90
00a957ac	stp w11,w10,[sp, #0x30]
00a957b0	cbz w7,0x00a95984
00a957b4	subs x8,x19,#0x8
00a957b8	b.lt 0x00a958a0
00a957bc	str x8,[sp, #0x20]
00a957c0	mvn x8,x19
00a957c4	orr x9,xzr,#-0x10
00a957c8	cmn x8,#0x10
00a957cc	csinv x8,x9,x19,le
00a957d0	add x8,x8,x19
00a957d4	add x8,x8,#0x8
00a957d8	and x8,x8,#-0x8
00a957dc	str x8,[sp, #0x10]
00a957e0	add x8,x8,#0x8
00a957e4	str x8,[sp, #0x18]
00a957e8	add x8,x23,x8
00a957ec	add x19,x19,#0x8
00a957f0	mov x22,x25
00a957f4	str x8,[sp, #0x28]
00a957f8	ldp w8,w9,[x23], #0x8
00a957fc	eor w10,w28,w13
00a95800	eor w11,w20,w12
00a95804	add x0,sp,#0x38
00a95808	eor w8,w10,w8
00a9580c	eor w9,w11,w9
00a95810	mov w2,#0x1
00a95814	mov x1,x3
00a95818	stp w8,w9,[sp, #0x38]
00a9581c	bl 0x00c39a00
00a95820	ldr w8,[sp, #0x38]
00a95824	ldr w9,[sp, #0x30]
00a95828	sub x19,x19,#0x8
00a9582c	mov w13,w26
00a95830	mov x3,x27
00a95834	eor w28,w8,w9
00a95838	lsr w8,w28,#0x8
00a9583c	lsr w9,w28,#0x10
00a95840	strb w8,[x22, #0x1]
00a95844	lsr w8,w28,#0x18
00a95848	strb w28,[x22]
00a9584c	strb w9,[x22, #0x2]
00a95850	strb w8,[x22, #0x3]
00a95854	ldr w8,[sp, #0x3c]
00a95858	ldr w9,[sp, #0x34]
00a9585c	mov w12,w21
00a95860	cmp x19,#0xf
00a95864	eor w20,w8,w9
00a95868	lsr w8,w20,#0x8
00a9586c	strb w8,[x22, #0x5]
00a95870	lsr w8,w20,#0x10
00a95874	strb w8,[x22, #0x6]
00a95878	lsr w8,w20,#0x18
00a9587c	strb w20,[x22, #0x4]
00a95880	strb w8,[x22, #0x7]
00a95884	add x22,x22,#0x8
00a95888	b.gt 0x00a957f8
00a9588c	ldp x8,x23,[sp, #0x20]
00a95890	ldr x9,[sp, #0x10]
00a95894	sub x19,x8,x9
00a95898	ldr x8,[sp, #0x18]
00a9589c	add x25,x25,x8
00a958a0	cbz x19,0x00a95b34
00a958a4	sub x9,x19,#0x1
00a958a8	cmp x9,#0x6
00a958ac	mov w8,wzr
00a958b0	b.hi 0x00a95b94
00a958b4	adrp x10,0x76e000
00a958b8	add x10,x10,#0x7f0
00a958bc	ldrsw x9,[x10, x9, LSL #0x2]
00a958c0	add x11,x9,x10
00a958c4	add x9,x23,x19
00a958c8	mov w10,w8
00a958cc	br x11
00a958d0	ldrb w8,[x9, #-0x1]!
00a958d4	lsl w8,w8,#0x10
00a958d8	ldrb w10,[x9, #-0x1]!
00a958dc	orr w8,w8,w10, LSL #0x8
00a958e0	ldrb w10,[x9, #-0x1]!
00a958e4	orr w8,w8,w10
00a958e8	ldrb w11,[x9, #-0x1]!
00a958ec	mov w10,w8
00a958f0	lsl w8,w11,#0x18
00a958f4	ldrb w11,[x9, #-0x1]!
00a958f8	orr w8,w8,w11, LSL #0x10
00a958fc	ldrb w11,[x9, #-0x1]!
00a95900	orr w8,w8,w11, LSL #0x8
00a95904	ldurb w9,[x9, #-0x1]
00a95908	orr w8,w8,w9
00a9590c	eor w9,w28,w13
00a95910	eor w11,w20,w12
00a95914	eor w8,w9,w8
00a95918	eor w9,w11,w10
00a9591c	add x0,sp,#0x38
00a95920	mov w2,#0x1
00a95924	mov x1,x3
00a95928	stp w8,w9,[sp, #0x38]
00a9592c	bl 0x00c39a00
00a95930	ldr w8,[sp, #0x38]
00a95934	ldr w9,[sp, #0x30]
00a95938	eor w23,w8,w9
00a9593c	lsr w8,w23,#0x8
00a95940	strb w8,[x25, #0x1]
00a95944	lsr w8,w23,#0x10
00a95948	strb w8,[x25, #0x2]
00a9594c	lsr w8,w23,#0x18
00a95950	strb w23,[x25]
00a95954	strb w8,[x25, #0x3]
00a95958	ldr w8,[sp, #0x3c]
00a9595c	ldr w9,[sp, #0x34]
00a95960	eor w27,w8,w9
00a95964	lsr w8,w27,#0x8
00a95968	strb w8,[x25, #0x5]
00a9596c	lsr w8,w27,#0x10
00a95970	strb w8,[x25, #0x6]
00a95974	lsr w8,w27,#0x18
00a95978	strb w27,[x25, #0x4]
00a9597c	strb w8,[x25, #0x7]
00a95980	b 0x00a95b3c
00a95984	cmp x19,#0x9
00a95988	b.lt 0x00a95b2c
00a9598c	mvn x8,x19
00a95990	orr x9,xzr,#-0x11
00a95994	cmn x8,#0x11
00a95998	csinv x8,x9,x19,le
00a9599c	add x8,x8,x19
00a959a0	add x8,x8,#0x8
00a959a4	and x8,x8,#-0x8
00a959a8	str x8,[sp, #0x8]
00a959ac	add x8,x8,#0x8
00a959b0	str x8,[sp]
00a959b4	add x8,x23,x8
00a959b8	stp x8,x19,[sp, #0x10]
00a959bc	add x19,x19,#0x8
00a959c0	mov x22,x25
00a959c4	stp x25,x24,[sp, #0x20]
00a959c8	mov w24,w28
00a959cc	ldr w28,[x23]
00a959d0	mov w25,w20
00a959d4	add x0,sp,#0x38
00a959d8	mov x1,x3
00a959dc	eor w8,w28,w11
00a959e0	str w8,[sp, #0x38]
00a959e4	ldr w20,[x23, #0x4]
00a959e8	mov w2,wzr
00a959ec	eor w8,w20,w10
00a959f0	str w8,[sp, #0x3c]
00a959f4	bl 0x00c39a00
00a959f8	ldr w8,[sp, #0x38]
00a959fc	mov w9,w26
00a95a00	eor w9,w24,w26
00a95a04	mov w10,w21
00a95a08	eor w8,w9,w8
00a95a0c	ldr w9,[sp, #0x3c]
00a95a10	eor w10,w25,w21
00a95a14	ldr w11,[sp, #0x30]
00a95a18	strb w8,[x22]
00a95a1c	eor w9,w10,w9
00a95a20	lsr w10,w8,#0x8
00a95a24	strb w10,[x22, #0x1]
00a95a28	lsr w10,w8,#0x10
00a95a2c	strb w10,[x22, #0x2]
00a95a30	lsr w10,w9,#0x8
00a95a34	strb w10,[x22, #0x5]
00a95a38	ldr w10,[sp, #0x34]
00a95a3c	lsr w8,w8,#0x18
00a95a40	sub x19,x19,#0x8
00a95a44	strb w9,[x22, #0x4]
00a95a48	strb w8,[x22, #0x3]
00a95a4c	lsr w8,w9,#0x10
00a95a50	lsr w9,w9,#0x18
00a95a54	mov x3,x27
00a95a58	add x23,x23,#0x8
00a95a5c	cmp x19,#0x10
00a95a60	strb w8,[x22, #0x6]
00a95a64	strb w9,[x22, #0x7]
00a95a68	add x22,x22,#0x8
00a95a6c	b.gt 0x00a959c8
00a95a70	ldp x8,x25,[sp, #0x18]
00a95a74	ldr x9,[sp, #0x8]
00a95a78	ldr x24,[sp, #0x28]
00a95a7c	sub x8,x8,#0x8
00a95a80	sub x19,x8,x9
00a95a84	ldr x8,[sp]
00a95a88	ldr x9,[sp, #0x10]
00a95a8c	add x25,x25,x8
00a95a90	cbz x19,0x00a95b34
00a95a94	ldp w23,w27,[x9]
00a95a98	add x0,sp,#0x38
00a95a9c	mov x1,x3
00a95aa0	mov w2,wzr
00a95aa4	eor w8,w23,w11
00a95aa8	str w8,[sp, #0x38]
00a95aac	eor w8,w27,w10
00a95ab0	str w8,[sp, #0x3c]
00a95ab4	bl 0x00c39a00
00a95ab8	sub x8,x19,#0x1
00a95abc	cmp x8,#0x7
00a95ac0	b.hi 0x00a95b3c
00a95ac4	adrp x12,0x76e000
00a95ac8	add x12,x12,#0x80c
00a95acc	ldp w9,w11,[sp, #0x38]
00a95ad0	ldrsw x13,[x12, x8, LSL #0x2]
00a95ad4	eor w10,w28,w26
00a95ad8	eor w14,w20,w21
00a95adc	eor w8,w10,w9
00a95ae0	eor w10,w14,w11
00a95ae4	add x11,x13,x12
00a95ae8	add x9,x25,x19
00a95aec	br x11
00a95af0	lsr w11,w10,#0x18
00a95af4	strb w11,[x9, #-0x1]!
00a95af8	lsr w11,w10,#0x10
00a95afc	strb w11,[x9, #-0x1]!
00a95b00	lsr w11,w10,#0x8
00a95b04	strb w11,[x9, #-0x1]!
00a95b08	strb w10,[x9, #-0x1]!
00a95b0c	lsr w10,w8,#0x18
00a95b10	strb w10,[x9, #-0x1]!
00a95b14	lsr w10,w8,#0x10
00a95b18	strb w10,[x9, #-0x1]!
00a95b1c	lsr w10,w8,#0x8
00a95b20	strb w10,[x9, #-0x1]!
00a95b24	sturb w8,[x9, #-0x1]
00a95b28	b 0x00a95b3c
00a95b2c	mov x9,x23
00a95b30	cbnz x19,0x00a95a94
00a95b34	mov w23,w28
00a95b38	mov w27,w20
00a95b3c	lsr w8,w23,#0x8
00a95b40	lsr w9,w23,#0x10
00a95b44	lsr w10,w23,#0x18
00a95b48	lsr w11,w27,#0x8
00a95b4c	lsr w12,w27,#0x10
00a95b50	lsr w13,w27,#0x18
00a95b54	strb w23,[x24]
00a95b58	strb w27,[x24, #0x4]
00a95b5c	strb w8,[x24, #0x1]
00a95b60	strb w9,[x24, #0x2]
00a95b64	strb w10,[x24, #0x3]
00a95b68	strb w11,[x24, #0x5]
00a95b6c	strb w12,[x24, #0x6]
00a95b70	strb w13,[x24, #0x7]
00a95b74	ldp x29,x30,[sp, #0x90]
00a95b78	ldp x20,x19,[sp, #0x80]
00a95b7c	ldp x22,x21,[sp, #0x70]
00a95b80	ldp x24,x23,[sp, #0x60]
00a95b84	ldp x26,x25,[sp, #0x50]
00a95b88	ldp x28,x27,[sp, #0x40]
00a95b8c	add sp,sp,#0xa0
00a95b90	ret
00a95b94	mov w10,w8
00a95b98	b 0x00a9590c
