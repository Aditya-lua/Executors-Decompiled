; FUN_00b48550 @ 00b48550
00b48550	sub sp,sp,#0xc0
00b48554	stp x22,x21,[sp, #0x90]
00b48558	stp x20,x19,[sp, #0xa0]
00b4855c	stp x29,x30,[sp, #0xb0]
00b48560	add x8,x1,x2, LSL #0x7
00b48564	ldur q0,[x8, #-0x10]
00b48568	lsl x22,x2,#0x1
00b4856c	str x23,[sp, #0x80]
00b48570	add x29,sp,#0xb0
00b48574	str q0,[sp, #0x30]
00b48578	ldur q0,[x8, #-0x20]
00b4857c	str q0,[sp, #0x20]
00b48580	ldur q0,[x8, #-0x30]
00b48584	str q0,[sp, #0x10]
00b48588	ldur q0,[x8, #-0x40]
00b4858c	str q0,[sp]
00b48590	cbz x22,0x00b48850
00b48594	mov x19,x2
00b48598	mov x20,x1
00b4859c	mov x21,x0
00b485a0	mov x23,xzr
00b485a4	ldr q0,[x20]
00b485a8	ldr q1,[sp]
00b485ac	mov w2,#0xa
00b485b0	eor v0.16B,v1.16B,v0.16B
00b485b4	str q0,[sp]
00b485b8	ldr q0,[x20, #0x10]
00b485bc	ldr q1,[sp, #0x10]
00b485c0	eor v0.16B,v1.16B,v0.16B
00b485c4	str q0,[sp, #0x10]
00b485c8	ldr q0,[x20, #0x20]
00b485cc	ldp q2,q1,[sp, #0x10]
00b485d0	eor v0.16B,v1.16B,v0.16B
00b485d4	str q0,[sp, #0x20]
00b485d8	ldr q0,[x20, #0x30]
00b485dc	ldp q3,q1,[sp, #0x20]
00b485e0	eor v0.16B,v1.16B,v0.16B
00b485e4	str q0,[sp, #0x30]
00b485e8	ldr q0,[sp]
00b485ec	ldr q1,[sp, #0x30]
00b485f0	stp q0,q2,[sp, #0x40]
00b485f4	stp q3,q1,[sp, #0x60]
00b485f8	ldp w11,w9,[sp, #0x40]
00b485fc	ldp w8,w15,[sp, #0x70]
00b48600	ldp w5,w13,[sp, #0x50]
00b48604	ldp w14,w4,[sp, #0x60]
00b48608	ldp w16,w12,[sp, #0x68]
00b4860c	ldp w10,w0,[sp, #0x58]
00b48610	ldp w3,w17,[sp, #0x78]
00b48614	ldp w18,w1,[sp, #0x48]
00b48618	add w6,w11,w8
00b4861c	eor w5,w5,w6, ROR #0x19
00b48620	add w6,w13,w9
00b48624	eor w4,w4,w6, ROR #0x19
00b48628	add w6,w16,w10
00b4862c	eor w3,w3,w6, ROR #0x19
00b48630	add w6,w17,w12
00b48634	eor w1,w1,w6, ROR #0x19
00b48638	add w6,w5,w11
00b4863c	eor w14,w14,w6, ROR #0x17
00b48640	add w6,w4,w13
00b48644	eor w15,w15,w6, ROR #0x17
00b48648	add w6,w3,w16
00b4864c	eor w18,w18,w6, ROR #0x17
00b48650	add w6,w1,w17
00b48654	eor w0,w0,w6, ROR #0x17
00b48658	add w6,w14,w5
00b4865c	eor w8,w8,w6, ROR #0x13
00b48660	add w6,w15,w4
00b48664	eor w9,w9,w6, ROR #0x13
00b48668	add w6,w18,w3
00b4866c	eor w10,w10,w6, ROR #0x13
00b48670	add w6,w0,w1
00b48674	eor w12,w12,w6, ROR #0x13
00b48678	add w6,w8,w14
00b4867c	eor w11,w11,w6, ROR #0xe
00b48680	add w6,w9,w15
00b48684	eor w13,w13,w6, ROR #0xe
00b48688	add w6,w10,w18
00b4868c	eor w16,w16,w6, ROR #0xe
00b48690	add w6,w12,w0
00b48694	eor w17,w17,w6, ROR #0xe
00b48698	add w6,w11,w1
00b4869c	eor w9,w9,w6, ROR #0x19
00b486a0	add w6,w13,w5
00b486a4	eor w10,w10,w6, ROR #0x19
00b486a8	add w6,w16,w4
00b486ac	eor w12,w12,w6, ROR #0x19
00b486b0	add w6,w17,w3
00b486b4	eor w8,w8,w6, ROR #0x19
00b486b8	add w6,w9,w11
00b486bc	eor w18,w18,w6, ROR #0x17
00b486c0	add w6,w10,w13
00b486c4	eor w0,w0,w6, ROR #0x17
00b486c8	add w6,w12,w16
00b486cc	eor w14,w14,w6, ROR #0x17
00b486d0	add w6,w8,w17
00b486d4	eor w15,w15,w6, ROR #0x17
00b486d8	add w6,w18,w9
00b486dc	eor w1,w1,w6, ROR #0x13
00b486e0	add w6,w0,w10
00b486e4	eor w5,w5,w6, ROR #0x13
00b486e8	add w6,w14,w12
00b486ec	eor w4,w4,w6, ROR #0x13
00b486f0	add w6,w15,w8
00b486f4	eor w3,w3,w6, ROR #0x13
00b486f8	add w6,w1,w18
00b486fc	eor w11,w11,w6, ROR #0xe
00b48700	add w6,w5,w0
00b48704	eor w13,w13,w6, ROR #0xe
00b48708	add w6,w4,w14
00b4870c	sub w2,w2,#0x2
00b48710	eor w16,w16,w6, ROR #0xe
00b48714	add w6,w3,w15
00b48718	cmp w2,#0x2
00b4871c	eor w17,w17,w6, ROR #0xe
00b48720	b.hi 0x00b48618
00b48724	ldr w2,[sp]
00b48728	stp w11,w9,[sp, #0x40]
00b4872c	stp w8,w15,[sp, #0x70]
00b48730	stp w10,w0,[sp, #0x58]
00b48734	add w2,w2,w11
00b48738	str w2,[sp]
00b4873c	ldr w2,[sp, #0x4]
00b48740	stp w18,w1,[sp, #0x48]
00b48744	add x20,x20,#0x40
00b48748	stp w5,w13,[sp, #0x50]
00b4874c	add w2,w2,w9
00b48750	str w2,[sp, #0x4]
00b48754	ldr w2,[sp, #0x8]
00b48758	stp w14,w4,[sp, #0x60]
00b4875c	stp w16,w12,[sp, #0x68]
00b48760	stp w3,w17,[sp, #0x78]
00b48764	add w2,w2,w18
00b48768	str w2,[sp, #0x8]
00b4876c	ldr w2,[sp, #0xc]
00b48770	add w2,w2,w1
00b48774	str w2,[sp, #0xc]
00b48778	ldr w2,[sp, #0x10]
00b4877c	mov w1,#0x40
00b48780	add w2,w2,w5
00b48784	str w2,[sp, #0x10]
00b48788	ldr w2,[sp, #0x14]
00b4878c	add w2,w2,w13
00b48790	str w2,[sp, #0x14]
00b48794	ldr w2,[sp, #0x18]
00b48798	add w2,w2,w10
00b4879c	str w2,[sp, #0x18]
00b487a0	ldr w2,[sp, #0x1c]
00b487a4	add w2,w2,w0
00b487a8	str w2,[sp, #0x1c]
00b487ac	ldr w2,[sp, #0x20]
00b487b0	add x0,sp,#0x40
00b487b4	add w2,w2,w14
00b487b8	str w2,[sp, #0x20]
00b487bc	ldr w2,[sp, #0x24]
00b487c0	add w2,w2,w4
00b487c4	str w2,[sp, #0x24]
00b487c8	ldr w2,[sp, #0x28]
00b487cc	add w11,w2,w16
00b487d0	str w11,[sp, #0x28]
00b487d4	ldr w11,[sp, #0x2c]
00b487d8	add w11,w11,w12
00b487dc	str w11,[sp, #0x2c]
00b487e0	ldr w11,[sp, #0x30]
00b487e4	add w8,w11,w8
00b487e8	str w8,[sp, #0x30]
00b487ec	ldr w8,[sp, #0x34]
00b487f0	add w8,w8,w15
00b487f4	str w8,[sp, #0x34]
00b487f8	ldr w8,[sp, #0x38]
00b487fc	add w8,w8,w3
00b48800	str w8,[sp, #0x38]
00b48804	ldr w8,[sp, #0x3c]
00b48808	add w8,w8,w17
00b4880c	str w8,[sp, #0x3c]
00b48810	bl 0x00c34750
00b48814	and x8,x23,#0x1
00b48818	ldr q0,[sp, #0x30]
00b4881c	mul x8,x8,x19
00b48820	add x8,x8,x23, LSR #0x1
00b48824	add x8,x21,x8, LSL #0x6
00b48828	str q0,[x8, #0x30]
00b4882c	ldr q0,[sp, #0x20]
00b48830	add x23,x23,#0x1
00b48834	cmp x23,x22
00b48838	str q0,[x8, #0x20]
00b4883c	ldr q0,[sp, #0x10]
00b48840	str q0,[x8, #0x10]
00b48844	ldr q0,[sp]
00b48848	str q0,[x8]
00b4884c	b.ne 0x00b485a4
00b48850	mov x0,sp
00b48854	mov w1,#0x40
00b48858	bl 0x00c34750
00b4885c	ldp x29,x30,[sp, #0xb0]
00b48860	ldp x20,x19,[sp, #0xa0]
00b48864	ldp x22,x21,[sp, #0x90]
00b48868	ldr x23,[sp, #0x80]
00b4886c	add sp,sp,#0xc0
00b48870	ret
