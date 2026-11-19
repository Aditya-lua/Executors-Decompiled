; tls1_check_chain @ 009c4740
009c4740	sub sp,sp,#0xa0
009c4744	stp x28,x27,[sp, #0x40]
009c4748	stp x26,x25,[sp, #0x50]
009c474c	stp x24,x23,[sp, #0x60]
009c4750	stp x22,x21,[sp, #0x70]
009c4754	stp x20,x19,[sp, #0x80]
009c4758	stp x29,x30,[sp, #0x90]
009c475c	ldr x24,[x0, #0x898]
009c4760	mov w23,w4
009c4764	mov x19,x0
009c4768	cmn w4,#0x1
009c476c	ldr w25,[x24, #0x1c]
009c4770	add x29,sp,#0x90
009c4774	b.eq 0x009c47a4
009c4778	cmn w23,#0x2
009c477c	b.ne 0x009c480c
009c4780	mov x9,x24
009c4784	ldr x8,[x9], #0x20
009c4788	orr x10,xzr,#-0x3333333333333334
009c478c	movk x10,#0xcccd
009c4790	sub x9,x8,x9
009c4794	asr x9,x9,#0x3
009c4798	mul x23,x9,x10
009c479c	sxtw x9,w23
009c47a0	b 0x009c481c
009c47a4	mov x21,x1
009c47a8	cbz x1,0x009c48a0
009c47ac	mov x22,x2
009c47b0	cbz x2,0x009c48a0
009c47b4	add x1,sp,#0x38
009c47b8	mov x0,x22
009c47bc	mov x20,x3
009c47c0	bl 0x00c35150
009c47c4	cbz x0,0x009c48a0
009c47c8	ldr x23,[sp, #0x38]
009c47cc	ldr w8,[x24, #0x1c]
009c47d0	mov w9,#0x1
009c47d4	movk w9,#0x3, LSL #16
009c47d8	lsl x12,x23,#0x20
009c47dc	mov w10,#0x6f0
009c47e0	mov w11,#0x50
009c47e4	tst w8,w9
009c47e8	add x8,x19,x12, ASR #0x1e
009c47ec	csel w26,w11,w10,eq
009c47f0	add x8,x8,#0x3b8
009c47f4	mov w28,#0x1
009c47f8	str x8,[sp, #0x30]
009c47fc	and w8,w25,#0x30000
009c4800	cbnz w8,0x009c4854
009c4804	mov w27,wzr
009c4808	b 0x009c48ac
009c480c	mov w8,#0x28
009c4810	smaddl x8,w23,w8,x24
009c4814	sxtw x9,w23
009c4818	add x8,x8,#0x20
009c481c	ldr x21,[x8]
009c4820	add x9,x19,x9, LSL #0x2
009c4824	add x20,x9,#0x3b8
009c4828	cbz x21,0x009c4894
009c482c	ldr x22,[x8, #0x8]
009c4830	cbz x22,0x009c4894
009c4834	str x20,[sp, #0x30]
009c4838	ldr x20,[x8, #0x10]
009c483c	mov w8,#0x1
009c4840	movk w8,#0x3, LSL #16
009c4844	mov w26,wzr
009c4848	and w28,w25,w8
009c484c	and w8,w25,#0x30000
009c4850	cbz w8,0x009c4804
009c4854	mov w3,w8
009c4858	mov x0,xzr
009c485c	mov x1,x21
009c4860	mov x2,x20
009c4864	orr w25,w26,#0x800
009c4868	bl 0x00c36570
009c486c	cmp w0,#0x0
009c4870	orr w8,w0,w26
009c4874	cset w9,eq
009c4878	cmp w8,#0x0
009c487c	csel w8,wzr,w25,eq
009c4880	lsl w27,w9,#0xb
009c4884	cbnz w26,0x009c48a8
009c4888	mov w26,w8
009c488c	cbz w0,0x009c48ac
009c4890	ldr x20,[sp, #0x30]
009c4894	mov w26,wzr
009c4898	mov w27,wzr
009c489c	b 0x009c4e38
009c48a0	mov w0,wzr
009c48a4	b 0x009c4ea0
009c48a8	mov w26,w8
009c48ac	mov x0,x19
009c48b0	bl 0x00c35af0
009c48b4	and w8,w0,#0xffffff00
009c48b8	cmp w8,#0x300
009c48bc	b.ne 0x009c4958
009c48c0	mov x0,x19
009c48c4	bl 0x00c35af0
009c48c8	cmp w28,#0x0
009c48cc	cset w25,ne
009c48d0	cbz w28,0x009c4960
009c48d4	cmp w0,#0x303
009c48d8	b.lt 0x009c4960
009c48dc	ldr x8,[x19, #0x398]
009c48e0	mov w28,wzr
009c48e4	cbnz x8,0x009c4910
009c48e8	ldr x8,[x19, #0x390]
009c48ec	mov w28,wzr
009c48f0	cbnz x8,0x009c4910
009c48f4	cmp w23,#0x6
009c48f8	b.hi 0x009c490c
009c48fc	and x8,x23,#0xff
009c4900	mov w9,#0x7d
009c4904	lsr w8,w9,w8
009c4908	tbnz w8,#0x0,0x009c4ec0
009c490c	mov w28,#0xffffffff
009c4910	ldr x8,[x19, #0x8]
009c4914	str w26,[sp, #0x2c]
009c4918	ldr x9,[x8, #0xc0]
009c491c	ldrb w9,[x9, #0x60]
009c4920	tbnz w9,#0x3,0x009c4a58
009c4924	ldr w8,[x8]
009c4928	cmp w8,#0x304
009c492c	b.lt 0x009c4a58
009c4930	cmp w8,#0x10, LSL #12
009c4934	b.eq 0x009c4a58
009c4938	mov x0,x19
009c493c	mov x1,x21
009c4940	mov x2,x22
009c4944	bl 0x009c4f6c
009c4948	orr w8,w27,#0x10
009c494c	cmp x0,#0x0
009c4950	csel w23,w27,w8,eq
009c4954	b 0x009c4b58
009c4958	cmp w28,#0x0
009c495c	cset w25,ne
009c4960	orr w8,w27,#0x30
009c4964	cmp w26,#0x0
009c4968	csel w27,w27,w8,eq
009c496c	mov w2,#0x1
009c4970	mov x0,x19
009c4974	mov x1,x21
009c4978	bl 0x009c517c
009c497c	cbz w0,0x009c49e0
009c4980	orr w24,w27,#0x40
009c4984	ldr w8,[x19, #0x38]
009c4988	cbz w8,0x009c49f0
009c498c	cbz w25,0x009c4a34
009c4990	mov x0,x20
009c4994	orr w27,w24,#0x80
009c4998	bl 0x00c325e0
009c499c	cmp w0,#0x1
009c49a0	b.lt 0x009c49f4
009c49a4	mov w23,wzr
009c49a8	mov x0,x20
009c49ac	mov w1,w23
009c49b0	bl 0x00c32610
009c49b4	mov x1,x0
009c49b8	mov x0,x19
009c49bc	mov w2,wzr
009c49c0	bl 0x009c517c
009c49c4	cbz w0,0x009c4aa0
009c49c8	mov x0,x20
009c49cc	add w23,w23,#0x1
009c49d0	bl 0x00c325e0
009c49d4	cmp w23,w0
009c49d8	b.lt 0x009c49a8
009c49dc	b 0x009c49f4
009c49e0	cbz w26,0x009c4df8
009c49e4	mov w24,w27
009c49e8	ldr w8,[x19, #0x38]
009c49ec	cbnz w8,0x009c498c
009c49f0	orr w27,w24,#0x80
009c49f4	ldr w8,[x19, #0x38]
009c49f8	eor w9,w25,#0x1
009c49fc	cmp w8,#0x0
009c4a00	cset w8,ne
009c4a04	orr w8,w9,w8
009c4a08	tbnz w8,#0x0,0x009c4a30
009c4a0c	adrp x1,0x2db000
009c4a10	add x1,x1,#0x996
009c4a14	mov x0,x22
009c4a18	bl 0x00c346e0
009c4a1c	cbz w0,0x009c4a7c
009c4a20	mov w8,#0x1
009c4a24	ldr x9,[x19, #0x300]
009c4a28	cbnz x9,0x009c4cdc
009c4a2c	b 0x009c4d04
009c4a30	mov w24,w27
009c4a34	ldr x20,[sp, #0x30]
009c4a38	orr w27,w24,#0x600
009c4a3c	cmp w26,#0x0
009c4a40	cset w8,eq
009c4a44	bics wzr,w26,w27
009c4a48	cset w9,eq
009c4a4c	orr w8,w8,w9
009c4a50	orr w27,w27,w8
009c4a54	b 0x009c4e38
009c4a58	cmn w28,#0x1
009c4a5c	b.eq 0x009c4b54
009c4a60	mov x0,x21
009c4a64	bl 0x00c36590
009c4a68	mov w23,w0
009c4a6c	cbz w28,0x009c4aac
009c4a70	cmp w23,w28
009c4a74	b.ne 0x009c4b44
009c4a78	b 0x009c4b54
009c4a7c	adrp x1,0x2c7000
009c4a80	add x1,x1,#0x4e5
009c4a84	mov x0,x22
009c4a88	bl 0x00c346e0
009c4a8c	cbz w0,0x009c4cbc
009c4a90	mov w8,#0x2
009c4a94	ldr x9,[x19, #0x300]
009c4a98	cbnz x9,0x009c4cdc
009c4a9c	b 0x009c4d04
009c4aa0	cbz w26,0x009c4df8
009c4aa4	and w27,w24,#0xffffff7f
009c4aa8	b 0x009c49f4
009c4aac	ldr x8,[x19, #0x8]
009c4ab0	ldr x9,[x8, #0xc0]
009c4ab4	ldrb w9,[x9, #0x60]
009c4ab8	tbnz w9,#0x3,0x009c4aec
009c4abc	ldr w8,[x8]
009c4ac0	cmp w8,#0x304
009c4ac4	b.lt 0x009c4aec
009c4ac8	cmp w8,#0x10, LSL #12
009c4acc	b.eq 0x009c4aec
009c4ad0	ldr x8,[x19, #0x398]
009c4ad4	cbz x8,0x009c4aec
009c4ad8	add x8,x19,#0x3a8
009c4adc	mov w24,#0x1
009c4ae0	ldr x25,[x8]
009c4ae4	cbnz x25,0x009c4b00
009c4ae8	b 0x009c4b44
009c4aec	mov w8,#0x1db0
009c4af0	mov w24,wzr
009c4af4	add x8,x19,x8
009c4af8	ldr x25,[x8]
009c4afc	cbz x25,0x009c4b44
009c4b00	mov x26,xzr
009c4b04	cbz w24,0x009c4b20
009c4b08	ldr x8,[x19, #0x398]
009c4b0c	mov x0,x19
009c4b10	ldrh w1,[x8, x26, LSL #0x1]
009c4b14	bl 0x009c21e4
009c4b18	cbnz x0,0x009c4b2c
009c4b1c	b 0x009c4b38
009c4b20	ldr x8,[x19, #0x1da8]
009c4b24	ldr x0,[x8, x26, LSL #0x3]
009c4b28	cbz x0,0x009c4b38
009c4b2c	ldr w8,[x0, #0x1c]
009c4b30	cmp w23,w8
009c4b34	b.eq 0x009c4b54
009c4b38	add x26,x26,#0x1
009c4b3c	cmp x26,x25
009c4b40	b.cc 0x009c4b04
009c4b44	ldr w8,[sp, #0x2c]
009c4b48	cbz w8,0x009c4e00
009c4b4c	mov w23,w27
009c4b50	b 0x009c4b58
009c4b54	orr w23,w27,#0x10
009c4b58	mov x0,x20
009c4b5c	orr w27,w23,#0x20
009c4b60	bl 0x00c325e0
009c4b64	cmp w0,#0x1
009c4b68	b.lt 0x009c4cb0
009c4b6c	mov w8,#0x1db0
009c4b70	add x8,x19,x8
009c4b74	str w23,[sp, #0x14]
009c4b78	mov w23,wzr
009c4b7c	stp x22,x8,[sp, #0x18]
009c4b80	add x8,x19,#0x3a8
009c4b84	str x8,[sp, #0x8]
009c4b88	mov x0,x20
009c4b8c	mov w1,w23
009c4b90	bl 0x00c32610
009c4b94	mov w22,w28
009c4b98	cmn w28,#0x1
009c4b9c	b.eq 0x009c4bb8
009c4ba0	bl 0x00c36590
009c4ba4	mov w24,w0
009c4ba8	cbz w22,0x009c4bd8
009c4bac	cmp w24,w22
009c4bb0	mov w8,w22
009c4bb4	b.ne 0x009c4c6c
009c4bb8	mov x0,x20
009c4bbc	add w23,w23,#0x1
009c4bc0	bl 0x00c325e0
009c4bc4	cmp w23,w0
009c4bc8	mov w25,#0x1
009c4bcc	mov w28,w22
009c4bd0	b.lt 0x009c4b88
009c4bd4	b 0x009c4e08
009c4bd8	ldr x8,[x19, #0x8]
009c4bdc	ldr x9,[x8, #0xc0]
009c4be0	ldrb w9,[x9, #0x60]
009c4be4	tbnz w9,#0x3,0x009c4c18
009c4be8	ldr w8,[x8]
009c4bec	cmp w8,#0x304
009c4bf0	b.lt 0x009c4c18
009c4bf4	cmp w8,#0x10, LSL #12
009c4bf8	b.eq 0x009c4c18
009c4bfc	ldr x8,[x19, #0x398]
009c4c00	cbz x8,0x009c4c18
009c4c04	ldr x8,[sp, #0x8]
009c4c08	mov w25,#0x1
009c4c0c	ldr x26,[x8]
009c4c10	cbnz x26,0x009c4c28
009c4c14	b 0x009c4c6c
009c4c18	ldr x8,[sp, #0x20]
009c4c1c	mov w25,wzr
009c4c20	ldr x26,[x8]
009c4c24	cbz x26,0x009c4c6c
009c4c28	mov x28,xzr
009c4c2c	cbz w25,0x009c4c48
009c4c30	ldr x8,[x19, #0x398]
009c4c34	mov x0,x19
009c4c38	ldrh w1,[x8, x28, LSL #0x1]
009c4c3c	bl 0x009c21e4
009c4c40	cbnz x0,0x009c4c54
009c4c44	b 0x009c4c60
009c4c48	ldr x8,[x19, #0x1da8]
009c4c4c	ldr x0,[x8, x28, LSL #0x3]
009c4c50	cbz x0,0x009c4c60
009c4c54	ldr w8,[x0, #0x1c]
009c4c58	cmp w24,w8
009c4c5c	b.eq 0x009c4bb8
009c4c60	add x28,x28,#0x1
009c4c64	cmp x28,x26
009c4c68	b.cc 0x009c4c2c
009c4c6c	ldr w26,[sp, #0x2c]
009c4c70	ldr w8,[sp, #0x14]
009c4c74	ldr x22,[sp, #0x18]
009c4c78	cmp w26,#0x0
009c4c7c	and w8,w8,#0xffffffdf
009c4c80	cset w9,eq
009c4c84	csel w27,w27,w8,eq
009c4c88	lsl w8,w9,#0x1
009c4c8c	ands w8,w8,#0x7
009c4c90	mov w25,#0x1
009c4c94	b.eq 0x009c496c
009c4c98	cmp w8,#0x2
009c4c9c	b.eq 0x009c4df8
009c4ca0	cmp w8,#0x7
009c4ca4	mov w0,wzr
009c4ca8	b.eq 0x009c496c
009c4cac	b 0x009c4ea0
009c4cb0	ldr w26,[sp, #0x2c]
009c4cb4	mov w25,#0x1
009c4cb8	b 0x009c496c
009c4cbc	adrp x1,0x2cf000
009c4cc0	add x1,x1,#0x33a
009c4cc4	mov x0,x22
009c4cc8	bl 0x00c346e0
009c4ccc	cbz w0,0x009c4e14
009c4cd0	mov w8,#0x40
009c4cd4	ldr x9,[x19, #0x300]
009c4cd8	cbz x9,0x009c4d04
009c4cdc	ldr x10,[x19, #0x2f8]
009c4ce0	mov x11,xzr
009c4ce4	ldrb w12,[x10, x11]
009c4ce8	cmp w8,w12
009c4cec	b.eq 0x009c4d00
009c4cf0	add x11,x11,#0x1
009c4cf4	cmp x11,x9
009c4cf8	b.cc 0x009c4ce4
009c4cfc	b 0x009c4d04
009c4d00	orr w27,w27,#0x400
009c4d04	and w8,w27,#0x400
009c4d08	orr w8,w8,w26
009c4d0c	cbz w8,0x009c4df8
009c4d10	ldr x22,[x19, #0x308]
009c4d14	cbz x22,0x009c4e20
009c4d18	mov x0,x22
009c4d1c	bl 0x00c325e0
009c4d20	cbz w0,0x009c4e20
009c4d24	mov x0,x21
009c4d28	bl 0x00c32cf0
009c4d2c	mov x21,x0
009c4d30	mov x0,x22
009c4d34	bl 0x00c325e0
009c4d38	cmp w0,#0x1
009c4d3c	b.lt 0x009c4d74
009c4d40	mov w23,wzr
009c4d44	mov x0,x22
009c4d48	mov w1,w23
009c4d4c	bl 0x00c32610
009c4d50	mov x1,x0
009c4d54	mov x0,x21
009c4d58	bl 0x00c36560
009c4d5c	cbz w0,0x009c4e20
009c4d60	mov x0,x22
009c4d64	add w23,w23,#0x1
009c4d68	bl 0x00c325e0
009c4d6c	cmp w23,w0
009c4d70	b.lt 0x009c4d44
009c4d74	mov x0,x20
009c4d78	bl 0x00c325e0
009c4d7c	cmp w0,#0x1
009c4d80	b.lt 0x009c4e24
009c4d84	mov w21,wzr
009c4d88	mov x0,x20
009c4d8c	mov w1,w21
009c4d90	bl 0x00c32610
009c4d94	bl 0x00c32cf0
009c4d98	mov x23,x0
009c4d9c	mov x0,x22
009c4da0	bl 0x00c325e0
009c4da4	cmp w0,#0x1
009c4da8	b.lt 0x009c4de0
009c4dac	mov w24,wzr
009c4db0	mov x0,x22
009c4db4	mov w1,w24
009c4db8	bl 0x00c32610
009c4dbc	mov x1,x0
009c4dc0	mov x0,x23
009c4dc4	bl 0x00c36560
009c4dc8	cbz w0,0x009c4e20
009c4dcc	mov x0,x22
009c4dd0	add w24,w24,#0x1
009c4dd4	bl 0x00c325e0
009c4dd8	cmp w24,w0
009c4ddc	b.lt 0x009c4db0
009c4de0	mov x0,x20
009c4de4	add w21,w21,#0x1
009c4de8	bl 0x00c325e0
009c4dec	cmp w21,w0
009c4df0	b.lt 0x009c4d88
009c4df4	b 0x009c4e24
009c4df8	ldr x20,[sp, #0x30]
009c4dfc	b 0x009c4e38
009c4e00	ldr x20,[sp, #0x30]
009c4e04	b 0x009c4e34
009c4e08	ldr w26,[sp, #0x2c]
009c4e0c	ldr x22,[sp, #0x18]
009c4e10	b 0x009c496c
009c4e14	orr w27,w27,#0x400
009c4e18	ldr x22,[x19, #0x308]
009c4e1c	cbnz x22,0x009c4d18
009c4e20	orr w27,w27,#0x200
009c4e24	ldr x20,[sp, #0x30]
009c4e28	and w8,w27,#0x200
009c4e2c	orr w8,w8,w26
009c4e30	cbnz w8,0x009c4a3c
009c4e34	mov w26,wzr
009c4e38	mov x0,x19
009c4e3c	bl 0x00c35af0
009c4e40	and w8,w0,#0xffffff00
009c4e44	cmp w8,#0x300
009c4e48	b.ne 0x009c4e8c
009c4e4c	mov x0,x19
009c4e50	bl 0x00c35af0
009c4e54	cmp w0,#0x303
009c4e58	mov w8,#0x102
009c4e5c	b.lt 0x009c4e68
009c4e60	ldr w9,[x20]
009c4e64	and w8,w9,w8
009c4e68	orr w0,w8,w27
009c4e6c	cbnz w26,0x009c4ea0
009c4e70	tbnz w27,#0x0,0x009c4e9c
009c4e74	ldr w8,[x20]
009c4e78	mov w9,#0x102
009c4e7c	mov w0,wzr
009c4e80	and w8,w8,w9
009c4e84	str w8,[x20]
009c4e88	b 0x009c4ea0
009c4e8c	mov w8,#0x102
009c4e90	orr w0,w8,w27
009c4e94	cbnz w26,0x009c4ea0
009c4e98	b 0x009c4e70
009c4e9c	str w0,[x20]
009c4ea0	ldp x29,x30,[sp, #0x90]
009c4ea4	ldp x20,x19,[sp, #0x80]
009c4ea8	ldp x22,x21,[sp, #0x70]
009c4eac	ldp x24,x23,[sp, #0x60]
009c4eb0	ldp x26,x25,[sp, #0x50]
009c4eb4	ldp x28,x27,[sp, #0x40]
009c4eb8	add sp,sp,#0xa0
009c4ebc	ret
009c4ec0	adrp x9,0x74c000
009c4ec4	sbfiz x8,x23,#0x2,#0x20
009c4ec8	add x9,x9,#0xde0
009c4ecc	ldr x25,[x24, #0x198]
009c4ed0	ldr w28,[x9, x8#0x0]
009c4ed4	cbz x25,0x009c4910
009c4ed8	ldr x23,[x24, #0x1a0]
009c4edc	cbz x23,0x009c4f58
009c4ee0	adrp x9,0x74c000
009c4ee4	add x9,x9,#0xe00
009c4ee8	str x22,[sp, #0x18]
009c4eec	mov w22,w28
009c4ef0	mov w28,w26
009c4ef4	ldr w26,[x9, x8#0x0]
009c4ef8	mov x24,xzr
009c4efc	ldrh w1,[x25, x24, LSL #0x1]
009c4f00	mov x0,x19
009c4f04	bl 0x009c21e4
009c4f08	cbz x0,0x009c4f24
009c4f0c	ldr w8,[x0, #0xc]
009c4f10	cmp w8,#0x40
009c4f14	b.ne 0x009c4f24
009c4f18	ldr w8,[x0, #0x14]
009c4f1c	cmp w8,w26
009c4f20	b.eq 0x009c4f30
009c4f24	add x24,x24,#0x1
009c4f28	cmp x24,x23
009c4f2c	b.cc 0x009c4efc
009c4f30	mov w26,w28
009c4f34	cmp w28,#0x0
009c4f38	mov w28,w22
009c4f3c	ldr x22,[sp, #0x18]
009c4f40	orr w8,wzr,#0x7
009c4f44	mov w9,#0x2
009c4f48	csel w8,w9,w8,eq
009c4f4c	cmp x24,x23
009c4f50	b.ne 0x009c4910
009c4f54	b 0x009c4c8c
009c4f58	cmp w26,#0x0
009c4f5c	orr w8,wzr,#0x7
009c4f60	mov w9,#0x2
009c4f64	csel w8,w9,w8,eq
009c4f68	b 0x009c4c8c
