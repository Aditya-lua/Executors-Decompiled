; mbedtls_internal_md5_process @ 00b796c8
00b796c8	sub sp,sp,#0xc0
00b796cc	stp x28,x27,[sp, #0x60]
00b796d0	stp x26,x25,[sp, #0x70]
00b796d4	stp x24,x23,[sp, #0x80]
00b796d8	stp x22,x21,[sp, #0x90]
00b796dc	stp x20,x19,[sp, #0xa0]
00b796e0	stp x29,x30,[sp, #0xb0]
00b796e4	add x29,sp,#0xb0
00b796e8	mrs x19,tpidr_el0
00b796ec	ldr x8,[x19, #0x28]
00b796f0	mov w22,#0xa478
00b796f4	movk w22,#0xd76a, LSL #16
00b796f8	mov w23,#0xb756
00b796fc	str x8,[sp, #0x58]
00b79700	ldp w21,w13,[x1]
00b79704	movk w23,#0xe8c7, LSL #16
00b79708	mov w24,#0x70db
00b7970c	movk w24,#0x2420, LSL #16
00b79710	stp w21,w13,[sp, #0x8]
00b79714	ldp w8,w4,[x1, #0x8]
00b79718	mov w25,#0xceee
00b7971c	movk w25,#0xc1bd, LSL #16
00b79720	stp w8,w4,[sp, #0x10]
00b79724	ldp w10,w6,[x1, #0x10]
00b79728	stp w10,w6,[sp, #0x18]
00b7972c	ldp w12,w20,[x1, #0x18]
00b79730	stp w12,w20,[sp, #0x20]
00b79734	ldp w14,w9,[x1, #0x20]
00b79738	stp w14,w9,[sp, #0x28]
00b7973c	ldp w3,w11,[x1, #0x28]
00b79740	stp w3,w11,[sp, #0x30]
00b79744	ldp w5,w15,[x1, #0x30]
00b79748	stp w5,w15,[sp, #0x38]
00b7974c	ldr w7,[x1, #0x38]
00b79750	ldr w1,[x1, #0x3c]
00b79754	stp w7,w1,[sp, #0x40]
00b79758	ldp w17,w18,[x0, #0x10]
00b7975c	ldp w2,w16,[x0, #0x8]
00b79760	eor w26,w18,w17
00b79764	and w26,w26,w16
00b79768	add w27,w21,w2
00b7976c	eor w26,w26,w18
00b79770	add w26,w27,w26
00b79774	add w22,w26,w22
00b79778	ror w22,w22,#0x19
00b7977c	eor w27,w17,w16
00b79780	add w22,w22,w16
00b79784	and w27,w22,w27
00b79788	add w26,w13,w18
00b7978c	eor w27,w27,w17
00b79790	add w26,w26,w27
00b79794	add w23,w26,w23
00b79798	ror w23,w23,#0x14
00b7979c	eor w26,w22,w16
00b797a0	add w23,w23,w22
00b797a4	and w26,w23,w26
00b797a8	add w27,w8,w17
00b797ac	eor w26,w26,w16
00b797b0	add w26,w27,w26
00b797b4	add w24,w26,w24
00b797b8	ror w24,w24,#0xf
00b797bc	eor w26,w23,w22
00b797c0	add w24,w24,w23
00b797c4	and w26,w24,w26
00b797c8	add w27,w4,w16
00b797cc	eor w26,w26,w22
00b797d0	add w26,w27,w26
00b797d4	add w25,w26,w25
00b797d8	ror w25,w25,#0xa
00b797dc	eor w26,w24,w23
00b797e0	add w25,w25,w24
00b797e4	and w26,w25,w26
00b797e8	mov w27,#0xfaf
00b797ec	add w22,w10,w22
00b797f0	eor w26,w26,w23
00b797f4	movk w27,#0xf57c, LSL #16
00b797f8	add w22,w22,w26
00b797fc	add w22,w22,w27
00b79800	ror w22,w22,#0x19
00b79804	eor w27,w25,w24
00b79808	add w22,w22,w25
00b7980c	and w27,w22,w27
00b79810	mov w26,#0xc62a
00b79814	add w23,w6,w23
00b79818	eor w27,w27,w24
00b7981c	movk w26,#0x4787, LSL #16
00b79820	add w23,w23,w27
00b79824	add w23,w23,w26
00b79828	ror w23,w23,#0x14
00b7982c	eor w26,w22,w25
00b79830	add w23,w23,w22
00b79834	and w26,w23,w26
00b79838	mov w27,#0x4613
00b7983c	add w24,w12,w24
00b79840	eor w26,w26,w25
00b79844	movk w27,#0xa830, LSL #16
00b79848	add w24,w24,w26
00b7984c	add w24,w24,w27
00b79850	ror w24,w24,#0xf
00b79854	eor w27,w23,w22
00b79858	add w24,w24,w23
00b7985c	and w27,w24,w27
00b79860	mov w26,#0x9501
00b79864	add w25,w20,w25
00b79868	eor w27,w27,w22
00b7986c	movk w26,#0xfd46, LSL #16
00b79870	add w25,w25,w27
00b79874	add w25,w25,w26
00b79878	ror w25,w25,#0xa
00b7987c	eor w26,w24,w23
00b79880	add w25,w25,w24
00b79884	and w26,w25,w26
00b79888	mov w27,#0x98d8
00b7988c	add w22,w14,w22
00b79890	eor w26,w26,w23
00b79894	movk w27,#0x6980, LSL #16
00b79898	add w22,w22,w26
00b7989c	add w22,w22,w27
00b798a0	ror w22,w22,#0x19
00b798a4	eor w27,w25,w24
00b798a8	add w22,w22,w25
00b798ac	and w27,w22,w27
00b798b0	mov w26,#0xf7af
00b798b4	add w23,w9,w23
00b798b8	eor w27,w27,w24
00b798bc	movk w26,#0x8b44, LSL #16
00b798c0	add w23,w23,w27
00b798c4	add w23,w23,w26
00b798c8	ror w23,w23,#0x14
00b798cc	eor w26,w22,w25
00b798d0	add w23,w23,w22
00b798d4	and w26,w23,w26
00b798d8	add w24,w3,w24
00b798dc	eor w26,w26,w25
00b798e0	mov w27,#0xffff5bb1
00b798e4	add w24,w24,w26
00b798e8	add w24,w24,w27
00b798ec	ror w24,w24,#0xf
00b798f0	eor w27,w23,w22
00b798f4	add w24,w24,w23
00b798f8	and w27,w24,w27
00b798fc	mov w26,#0xd7be
00b79900	add w25,w11,w25
00b79904	eor w27,w27,w22
00b79908	movk w26,#0x895c, LSL #16
00b7990c	add w25,w25,w27
00b79910	add w25,w25,w26
00b79914	ror w25,w25,#0xa
00b79918	eor w26,w24,w23
00b7991c	add w25,w25,w24
00b79920	and w26,w25,w26
00b79924	mov w27,#0x1122
00b79928	add w22,w5,w22
00b7992c	eor w26,w26,w23
00b79930	movk w27,#0x6b90, LSL #16
00b79934	add w22,w22,w26
00b79938	add w22,w22,w27
00b7993c	ror w22,w22,#0x19
00b79940	eor w27,w25,w24
00b79944	add w22,w22,w25
00b79948	and w27,w22,w27
00b7994c	mov w26,#0x7193
00b79950	add w23,w15,w23
00b79954	eor w27,w27,w24
00b79958	movk w26,#0xfd98, LSL #16
00b7995c	add w23,w23,w27
00b79960	add w23,w23,w26
00b79964	ror w23,w23,#0x14
00b79968	eor w26,w22,w25
00b7996c	add w23,w23,w22
00b79970	and w26,w23,w26
00b79974	mov w27,#0x438e
00b79978	add w24,w7,w24
00b7997c	eor w26,w26,w25
00b79980	movk w27,#0xa679, LSL #16
00b79984	add w24,w24,w26
00b79988	add w24,w24,w27
00b7998c	ror w24,w24,#0xf
00b79990	eor w27,w23,w22
00b79994	add w24,w24,w23
00b79998	and w27,w24,w27
00b7999c	mov w26,#0x821
00b799a0	add w25,w1,w25
00b799a4	eor w27,w27,w22
00b799a8	movk w26,#0x49b4, LSL #16
00b799ac	add w25,w25,w27
00b799b0	add w25,w25,w26
00b799b4	ror w25,w25,#0xa
00b799b8	add w25,w25,w24
00b799bc	eor w26,w25,w24
00b799c0	and w26,w26,w23
00b799c4	mov w27,#0x2562
00b799c8	add w22,w13,w22
00b799cc	eor w26,w26,w24
00b799d0	movk w27,#0xf61e, LSL #16
00b799d4	add w22,w22,w26
00b799d8	add w22,w22,w27
00b799dc	ror w22,w22,#0x1b
00b799e0	add w22,w22,w25
00b799e4	eor w27,w22,w25
00b799e8	and w27,w27,w24
00b799ec	mov w26,#0xb340
00b799f0	add w23,w12,w23
00b799f4	eor w27,w27,w25
00b799f8	movk w26,#0xc040, LSL #16
00b799fc	add w23,w23,w27
00b79a00	add w23,w23,w26
00b79a04	ror w23,w23,#0x17
00b79a08	add w23,w23,w22
00b79a0c	eor w26,w23,w22
00b79a10	and w26,w26,w25
00b79a14	mov w27,#0x5a51
00b79a18	add w24,w11,w24
00b79a1c	eor w26,w26,w22
00b79a20	movk w27,#0x265e, LSL #16
00b79a24	add w24,w24,w26
00b79a28	add w24,w24,w27
00b79a2c	ror w24,w24,#0x12
00b79a30	add w24,w24,w23
00b79a34	eor w27,w24,w23
00b79a38	and w27,w27,w22
00b79a3c	mov w26,#0xc7aa
00b79a40	add w25,w21,w25
00b79a44	eor w27,w27,w23
00b79a48	movk w26,#0xe9b6, LSL #16
00b79a4c	add w25,w25,w27
00b79a50	add w25,w25,w26
00b79a54	ror w25,w25,#0xc
00b79a58	add w25,w25,w24
00b79a5c	eor w26,w25,w24
00b79a60	and w26,w26,w23
00b79a64	mov w27,#0x105d
00b79a68	add w22,w6,w22
00b79a6c	eor w26,w26,w24
00b79a70	movk w27,#0xd62f, LSL #16
00b79a74	add w22,w22,w26
00b79a78	add w22,w22,w27
00b79a7c	ror w22,w22,#0x1b
00b79a80	add w22,w22,w25
00b79a84	eor w27,w22,w25
00b79a88	and w27,w27,w24
00b79a8c	mov w26,#0x1453
00b79a90	add w23,w3,w23
00b79a94	eor w27,w27,w25
00b79a98	movk w26,#0x244, LSL #16
00b79a9c	add w23,w23,w27
00b79aa0	add w23,w23,w26
00b79aa4	ror w23,w23,#0x17
00b79aa8	add w23,w23,w22
00b79aac	eor w26,w23,w22
00b79ab0	and w26,w26,w25
00b79ab4	mov w27,#0xe681
00b79ab8	add w24,w1,w24
00b79abc	eor w26,w26,w22
00b79ac0	movk w27,#0xd8a1, LSL #16
00b79ac4	add w24,w24,w26
00b79ac8	add w24,w24,w27
00b79acc	ror w24,w24,#0x12
00b79ad0	add w24,w24,w23
00b79ad4	eor w27,w24,w23
00b79ad8	and w27,w27,w22
00b79adc	mov w26,#0xfbc8
00b79ae0	add w25,w10,w25
00b79ae4	eor w27,w27,w23
00b79ae8	movk w26,#0xe7d3, LSL #16
00b79aec	add w25,w25,w27
00b79af0	add w25,w25,w26
00b79af4	ror w25,w25,#0xc
00b79af8	add w25,w25,w24
00b79afc	eor w26,w25,w24
00b79b00	and w26,w26,w23
00b79b04	mov w27,#0xcde6
00b79b08	add w22,w9,w22
00b79b0c	eor w26,w26,w24
00b79b10	movk w27,#0x21e1, LSL #16
00b79b14	add w22,w22,w26
00b79b18	add w22,w22,w27
00b79b1c	ror w22,w22,#0x1b
00b79b20	add w22,w22,w25
00b79b24	eor w27,w22,w25
00b79b28	and w27,w27,w24
00b79b2c	mov w26,#0x7d6
00b79b30	add w23,w7,w23
00b79b34	eor w27,w27,w25
00b79b38	movk w26,#0xc337, LSL #16
00b79b3c	add w23,w23,w27
00b79b40	add w23,w23,w26
00b79b44	ror w23,w23,#0x17
00b79b48	add w23,w23,w22
00b79b4c	eor w26,w23,w22
00b79b50	and w26,w26,w25
00b79b54	mov w27,#0xd87
00b79b58	add w24,w4,w24
00b79b5c	eor w26,w26,w22
00b79b60	movk w27,#0xf4d5, LSL #16
00b79b64	add w24,w24,w26
00b79b68	add w24,w24,w27
00b79b6c	ror w24,w24,#0x12
00b79b70	add w24,w24,w23
00b79b74	eor w27,w24,w23
00b79b78	and w27,w27,w22
00b79b7c	mov w26,#0x14ed
00b79b80	add w25,w14,w25
00b79b84	eor w27,w27,w23
00b79b88	movk w26,#0x455a, LSL #16
00b79b8c	add w25,w25,w27
00b79b90	add w25,w25,w26
00b79b94	ror w25,w25,#0xc
00b79b98	add w25,w25,w24
00b79b9c	eor w26,w25,w24
00b79ba0	and w26,w26,w23
00b79ba4	mov w27,#0xe905
00b79ba8	add w22,w15,w22
00b79bac	eor w26,w26,w24
00b79bb0	movk w27,#0xa9e3, LSL #16
00b79bb4	add w22,w22,w26
00b79bb8	add w22,w22,w27
00b79bbc	ror w22,w22,#0x1b
00b79bc0	add w22,w22,w25
00b79bc4	eor w27,w22,w25
00b79bc8	and w27,w27,w24
00b79bcc	mov w26,#0xa3f8
00b79bd0	add w23,w8,w23
00b79bd4	eor w27,w27,w25
00b79bd8	movk w26,#0xfcef, LSL #16
00b79bdc	add w23,w23,w27
00b79be0	add w23,w23,w26
00b79be4	ror w23,w23,#0x17
00b79be8	add w23,w23,w22
00b79bec	eor w26,w23,w22
00b79bf0	and w26,w26,w25
00b79bf4	mov w27,#0x2d9
00b79bf8	add w24,w20,w24
00b79bfc	eor w26,w26,w22
00b79c00	movk w27,#0x676f, LSL #16
00b79c04	add w24,w24,w26
00b79c08	add w24,w24,w27
00b79c0c	ror w24,w24,#0x12
00b79c10	add w24,w24,w23
00b79c14	eor w26,w24,w23
00b79c18	and w27,w26,w22
00b79c1c	add w25,w5,w25
00b79c20	eor w27,w27,w23
00b79c24	add w25,w25,w27
00b79c28	mov w27,#0x4c8a
00b79c2c	movk w27,#0x8d2a, LSL #16
00b79c30	add w25,w25,w27
00b79c34	ror w25,w25,#0xc
00b79c38	add w25,w25,w24
00b79c3c	mov w27,#0x3942
00b79c40	add w22,w6,w22
00b79c44	eor w26,w26,w25
00b79c48	movk w27,#0xfffa, LSL #16
00b79c4c	add w22,w22,w26
00b79c50	add w22,w22,w27
00b79c54	ror w22,w22,#0x1c
00b79c58	eor w27,w25,w24
00b79c5c	add w22,w22,w25
00b79c60	mov w26,#0xf681
00b79c64	add w23,w14,w23
00b79c68	eor w27,w27,w22
00b79c6c	movk w26,#0x8771, LSL #16
00b79c70	add w23,w23,w27
00b79c74	add w23,w23,w26
00b79c78	ror w23,w23,#0x15
00b79c7c	eor w26,w22,w25
00b79c80	add w23,w23,w22
00b79c84	mov w27,#0x6122
00b79c88	add w24,w11,w24
00b79c8c	eor w26,w26,w23
00b79c90	movk w27,#0x6d9d, LSL #16
00b79c94	add w24,w24,w26
00b79c98	add w24,w24,w27
00b79c9c	ror w24,w24,#0x10
00b79ca0	eor w27,w23,w22
00b79ca4	add w24,w24,w23
00b79ca8	mov w26,#0x380c
00b79cac	add w25,w7,w25
00b79cb0	eor w27,w27,w24
00b79cb4	movk w26,#0xfde5, LSL #16
00b79cb8	add w25,w25,w27
00b79cbc	add w25,w25,w26
00b79cc0	ror w25,w25,#0x9
00b79cc4	eor w26,w24,w23
00b79cc8	add w25,w25,w24
00b79ccc	mov w27,#0xea44
00b79cd0	add w22,w13,w22
00b79cd4	eor w26,w26,w25
00b79cd8	movk w27,#0xa4be, LSL #16
00b79cdc	add w22,w22,w26
00b79ce0	add w22,w22,w27
00b79ce4	ror w22,w22,#0x1c
00b79ce8	eor w27,w25,w24
00b79cec	add w22,w22,w25
00b79cf0	mov w26,#0xcfa9
00b79cf4	add w23,w10,w23
00b79cf8	eor w27,w27,w22
00b79cfc	movk w26,#0x4bde, LSL #16
00b79d00	add w23,w23,w27
00b79d04	add w23,w23,w26
00b79d08	ror w23,w23,#0x15
00b79d0c	eor w26,w22,w25
00b79d10	add w23,w23,w22
00b79d14	mov w27,#0x4b60
00b79d18	add w24,w20,w24
00b79d1c	eor w26,w26,w23
00b79d20	movk w27,#0xf6bb, LSL #16
00b79d24	add w24,w24,w26
00b79d28	add w24,w24,w27
00b79d2c	ror w24,w24,#0x10
00b79d30	eor w27,w23,w22
00b79d34	add w24,w24,w23
00b79d38	mov w26,#0xbc70
00b79d3c	add w25,w3,w25
00b79d40	eor w27,w27,w24
00b79d44	movk w26,#0xbebf, LSL #16
00b79d48	add w25,w25,w27
00b79d4c	add w25,w25,w26
00b79d50	ror w25,w25,#0x9
00b79d54	eor w26,w24,w23
00b79d58	add w25,w25,w24
00b79d5c	mov w27,#0x7ec6
00b79d60	add w22,w15,w22
00b79d64	eor w26,w26,w25
00b79d68	movk w27,#0x289b, LSL #16
00b79d6c	add w22,w22,w26
00b79d70	add w22,w22,w27
00b79d74	ror w22,w22,#0x1c
00b79d78	eor w27,w25,w24
00b79d7c	add w22,w22,w25
00b79d80	mov w26,#0x27fa
00b79d84	add w23,w21,w23
00b79d88	eor w27,w27,w22
00b79d8c	movk w26,#0xeaa1, LSL #16
00b79d90	add w23,w23,w27
00b79d94	add w23,w23,w26
00b79d98	ror w23,w23,#0x15
00b79d9c	eor w26,w22,w25
00b79da0	add w23,w23,w22
00b79da4	mov w27,#0x3085
00b79da8	add w24,w4,w24
00b79dac	eor w26,w26,w23
00b79db0	movk w27,#0xd4ef, LSL #16
00b79db4	add w24,w24,w26
00b79db8	add w24,w24,w27
00b79dbc	ror w24,w24,#0x10
00b79dc0	eor w27,w23,w22
00b79dc4	add w24,w24,w23
00b79dc8	mov w26,#0x1d05
00b79dcc	add w25,w12,w25
00b79dd0	eor w27,w27,w24
00b79dd4	movk w26,#0x488, LSL #16
00b79dd8	add w25,w25,w27
00b79ddc	add w25,w25,w26
00b79de0	ror w25,w25,#0x9
00b79de4	eor w26,w24,w23
00b79de8	add w25,w25,w24
00b79dec	mov w27,#0xd039
00b79df0	add w22,w9,w22
00b79df4	eor w26,w26,w25
00b79df8	movk w27,#0xd9d4, LSL #16
00b79dfc	add w22,w22,w26
00b79e00	add w22,w22,w27
00b79e04	ror w22,w22,#0x1c
00b79e08	eor w27,w25,w24
00b79e0c	add w22,w22,w25
00b79e10	mov w26,#0x99e5
00b79e14	add w23,w5,w23
00b79e18	eor w27,w27,w22
00b79e1c	movk w26,#0xe6db, LSL #16
00b79e20	add w23,w23,w27
00b79e24	add w23,w23,w26
00b79e28	ror w23,w23,#0x15
00b79e2c	eor w26,w22,w25
00b79e30	add w23,w23,w22
00b79e34	mov w27,#0x7cf8
00b79e38	add w24,w1,w24
00b79e3c	eor w26,w26,w23
00b79e40	movk w27,#0x1fa2, LSL #16
00b79e44	add w24,w24,w26
00b79e48	add w24,w24,w27
00b79e4c	ror w24,w24,#0x10
00b79e50	add w21,w21,w22
00b79e54	eor w22,w23,w22
00b79e58	add w24,w24,w23
00b79e5c	mov w26,#0x5665
00b79e60	add w25,w8,w25
00b79e64	eor w22,w22,w24
00b79e68	movk w26,#0xc4ac, LSL #16
00b79e6c	add w22,w25,w22
00b79e70	add w22,w22,w26
00b79e74	ror w22,w22,#0x9
00b79e78	add w22,w22,w24
00b79e7c	add w20,w20,w23
00b79e80	orn w23,w22,w23
00b79e84	mov w27,#0x2244
00b79e88	eor w23,w23,w24
00b79e8c	movk w27,#0xf429, LSL #16
00b79e90	add w21,w21,w23
00b79e94	add w21,w21,w27
00b79e98	add w28,w7,w24
00b79e9c	ror w7,w21,#0x1a
00b79ea0	add w30,w7,w22
00b79ea4	orn w7,w30,w24
00b79ea8	mov w25,#0xff97
00b79eac	eor w7,w7,w22
00b79eb0	movk w25,#0x432a, LSL #16
00b79eb4	add w7,w20,w7
00b79eb8	add w20,w7,w25
00b79ebc	add w24,w6,w22
00b79ec0	ror w6,w20,#0x16
00b79ec4	add w25,w6,w30
00b79ec8	orn w6,w25,w22
00b79ecc	mov w26,#0x23a7
00b79ed0	eor w6,w6,w30
00b79ed4	movk w26,#0xab94, LSL #16
00b79ed8	add w20,w28,w6
00b79edc	add w22,w20,w26
00b79ee0	ror w22,w22,#0x11
00b79ee4	add w22,w22,w25
00b79ee8	orn w26,w22,w30
00b79eec	mov w23,#0xa039
00b79ef0	eor w26,w26,w25
00b79ef4	movk w23,#0xfc93, LSL #16
00b79ef8	add w24,w24,w26
00b79efc	add w23,w24,w23
00b79f00	ror w23,w23,#0xb
00b79f04	add w23,w23,w22
00b79f08	add w4,w4,w25
00b79f0c	orn w25,w23,w25
00b79f10	mov w27,#0x59c3
00b79f14	add w5,w5,w30
00b79f18	eor w25,w25,w22
00b79f1c	movk w27,#0x655b, LSL #16
00b79f20	add w5,w5,w25
00b79f24	add w5,w5,w27
00b79f28	ror w5,w5,#0x1a
00b79f2c	add w5,w5,w23
00b79f30	add w3,w3,w22
00b79f34	orn w22,w5,w22
00b79f38	mov w21,#0xcc92
00b79f3c	eor w22,w22,w23
00b79f40	movk w21,#0x8f0c, LSL #16
00b79f44	add w4,w4,w22
00b79f48	add w4,w4,w21
00b79f4c	ror w4,w4,#0x16
00b79f50	add w4,w4,w5
00b79f54	add w13,w13,w23
00b79f58	orn w23,w4,w23
00b79f5c	mov w7,#0xf47d
00b79f60	eor w23,w23,w5
00b79f64	movk w7,#0xffef, LSL #16
00b79f68	add w3,w3,w23
00b79f6c	add w3,w3,w7
00b79f70	ror w3,w3,#0x11
00b79f74	add w3,w3,w4
00b79f78	add w14,w14,w5
00b79f7c	orn w5,w3,w5
00b79f80	mov w6,#0x5dd1
00b79f84	eor w5,w5,w4
00b79f88	movk w6,#0x8584, LSL #16
00b79f8c	add w13,w13,w5
00b79f90	add w13,w13,w6
00b79f94	ror w13,w13,#0xb
00b79f98	add w13,w13,w3
00b79f9c	add w1,w1,w4
00b79fa0	orn w4,w13,w4
00b79fa4	mov w20,#0x7e4f
00b79fa8	eor w4,w4,w3
00b79fac	movk w20,#0x6fa8, LSL #16
00b79fb0	add w14,w14,w4
00b79fb4	add w14,w14,w20
00b79fb8	ror w14,w14,#0x1a
00b79fbc	add w14,w14,w13
00b79fc0	add w12,w12,w3
00b79fc4	orn w3,w14,w3
00b79fc8	mov w26,#0xe6e0
00b79fcc	eor w3,w3,w13
00b79fd0	movk w26,#0xfe2c, LSL #16
00b79fd4	add w1,w1,w3
00b79fd8	add w1,w1,w26
00b79fdc	ror w1,w1,#0x16
00b79fe0	add w1,w1,w14
00b79fe4	add w15,w15,w13
00b79fe8	orn w13,w1,w13
00b79fec	mov w24,#0x4314
00b79ff0	eor w13,w13,w14
00b79ff4	movk w24,#0xa301, LSL #16
00b79ff8	add w12,w12,w13
00b79ffc	add w12,w12,w24
00b7a000	ror w12,w12,#0x11
00b7a004	add w12,w12,w1
00b7a008	orn w13,w12,w14
00b7a00c	mov w25,#0x11a1
00b7a010	eor w13,w13,w1
00b7a014	movk w25,#0x4e08, LSL #16
00b7a018	add w13,w15,w13
00b7a01c	add w13,w13,w25
00b7a020	ror w13,w13,#0xb
00b7a024	add w13,w13,w12
00b7a028	add w10,w10,w14
00b7a02c	orn w14,w13,w1
00b7a030	mov w27,#0x7e82
00b7a034	eor w14,w14,w12
00b7a038	movk w27,#0xf753, LSL #16
00b7a03c	add w10,w10,w14
00b7a040	add w10,w10,w27
00b7a044	ror w10,w10,#0x1a
00b7a048	add w10,w10,w13
00b7a04c	add w8,w8,w12
00b7a050	orn w12,w10,w12
00b7a054	mov w22,#0xf235
00b7a058	add w11,w11,w1
00b7a05c	eor w12,w12,w13
00b7a060	movk w22,#0xbd3a, LSL #16
00b7a064	add w11,w11,w12
00b7a068	add w11,w11,w22
00b7a06c	ror w11,w11,#0x16
00b7a070	add w11,w11,w10
00b7a074	orn w12,w11,w13
00b7a078	mov w21,#0xd2bb
00b7a07c	eor w12,w12,w10
00b7a080	movk w21,#0x2ad7, LSL #16
00b7a084	add w8,w8,w12
00b7a088	add w8,w8,w21
00b7a08c	ror w8,w8,#0x11
00b7a090	add w8,w8,w11
00b7a094	str w10,[sp, #0x48]
00b7a098	add w14,w10,w2
00b7a09c	orn w10,w8,w10
00b7a0a0	mov w23,#0xd391
00b7a0a4	add w9,w9,w13
00b7a0a8	eor w10,w10,w11
00b7a0ac	movk w23,#0xeb86, LSL #16
00b7a0b0	add w9,w9,w10
00b7a0b4	add w9,w9,w23
00b7a0b8	ror w9,w9,#0xb
00b7a0bc	stp w8,w11,[sp, #0x50]
00b7a0c0	add w12,w8,w17
00b7a0c4	add w8,w9,w8
00b7a0c8	add w13,w11,w18
00b7a0cc	str w8,[sp, #0x4c]
00b7a0d0	add w8,w8,w16
00b7a0d4	stp w14,w8,[x0, #0x8]
00b7a0d8	stp w12,w13,[x0, #0x10]
00b7a0dc	add x0,sp,#0x8
00b7a0e0	mov w1,#0x50
00b7a0e4	bl 0x00c42220
00b7a0e8	ldr x8,[x19, #0x28]
00b7a0ec	ldr x9,[sp, #0x58]
00b7a0f0	cmp x8,x9
00b7a0f4	b.ne 0x00b7a11c
00b7a0f8	ldp x29,x30,[sp, #0xb0]
00b7a0fc	ldp x20,x19,[sp, #0xa0]
00b7a100	ldp x22,x21,[sp, #0x90]
00b7a104	ldp x24,x23,[sp, #0x80]
00b7a108	ldp x26,x25,[sp, #0x70]
00b7a10c	ldp x28,x27,[sp, #0x60]
00b7a110	mov w0,wzr
00b7a114	add sp,sp,#0xc0
00b7a118	ret
00b7a11c	bl 0x00c2fec0
