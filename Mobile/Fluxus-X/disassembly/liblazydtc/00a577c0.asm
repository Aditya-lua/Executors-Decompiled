; FUN_00a577c0 @ 00a577c0
00a577c0	str x23,[sp, #-0x40]!
00a577c4	stp x22,x21,[sp, #0x10]
00a577c8	stp x20,x19,[sp, #0x20]
00a577cc	stp x29,x30,[sp, #0x30]
00a577d0	ldr x9,[x0, #0x28]
00a577d4	mov x22,x3
00a577d8	mov x21,x2
00a577dc	mov x19,x0
00a577e0	mov x20,x1
00a577e4	add x29,sp,#0x30
00a577e8	cbz x9,0x00a57864
00a577ec	ldr w8,[x9]
00a577f0	sub w10,w8,#0x10
00a577f4	cmp w10,#0x30
00a577f8	b.hi 0x00a57814
00a577fc	mov w11,#0x1
00a57800	lsl x10,x11,x10
00a57804	mov x11,#0x1000000010000
00a57808	movk x11,#0x1
00a5780c	tst x10,x11
00a57810	b.ne 0x00a57824
00a57814	cmp w8,#0x100
00a57818	b.eq 0x00a57824
00a5781c	cmp w8,#0x80
00a57820	b.ne 0x00a57864
00a57824	ldr x9,[x9, #0x30]
00a57828	cbz x9,0x00a57864
00a5782c	cmp w8,#0x100
00a57830	b.eq 0x00a57920
00a57834	cmp w8,#0x80
00a57838	b.ne 0x00a57948
00a5783c	mov x0,x19
00a57840	mov x2,x20
00a57844	mov x3,x22
00a57848	ldp x29,x30,[sp, #0x30]
00a5784c	ldp x20,x19,[sp, #0x20]
00a57850	ldp x22,x21,[sp, #0x10]
00a57854	mov x1,xzr
00a57858	mov x4,xzr
00a5785c	ldr x23,[sp], #0x40
00a57860	b 0x00c3c170
00a57864	mov w1,#0x2
00a57868	mov x0,x19
00a5786c	bl 0x00c3c180
00a57870	ldr x0,[x19, #0x38]
00a57874	cbz x0,0x00a57890
00a57878	ldr x8,[x19, #0x8]
00a5787c	cbz x8,0x00a578e4
00a57880	ldr x8,[x8, #0xb0]
00a57884	cbz x8,0x00a5788c
00a57888	blr x8
00a5788c	str xzr,[x19, #0x38]
00a57890	cbz x20,0x00a578a4
00a57894	str x20,[x19]
00a57898	ldr x0,[x19, #0x10]
00a5789c	cbnz x0,0x00a578b4
00a578a0	b 0x00a578cc
00a578a4	ldr x20,[x19, #0x8]
00a578a8	cbz x20,0x00a57970
00a578ac	ldr x0,[x19, #0x10]
00a578b0	cbz x0,0x00a578cc
00a578b4	ldr x8,[x19, #0x8]
00a578b8	cbz x8,0x00a578cc
00a578bc	ldr w9,[x20]
00a578c0	ldr w8,[x8]
00a578c4	cmp w9,w8
00a578c8	b.eq 0x00a57b28
00a578cc	bl 0x00c32360
00a578d0	str xzr,[x19, #0x10]
00a578d4	cbz x22,0x00a57900
00a578d8	mov x23,xzr
00a578dc	mov w21,#0x1
00a578e0	b 0x00a579b4
00a578e4	bl 0x00c342a0
00a578e8	adrp x0,0x2b7000
00a578ec	adrp x2,0x29e000
00a578f0	add x0,x0,#0xc61
00a578f4	add x2,x2,#0x129
00a578f8	mov w1,#0xae
00a578fc	b 0x00a57a2c
00a57900	ldr w0,[x20]
00a57904	bl 0x00c368c0
00a57908	ldr x8,[x19, #0x10]
00a5790c	orr x8,x0,x8
00a57910	cbz x8,0x00a57998
00a57914	mov x23,x0
00a57918	mov w21,wzr
00a5791c	b 0x00a579b4
00a57920	mov x0,x19
00a57924	mov x2,x20
00a57928	mov x3,x22
00a5792c	ldp x29,x30,[sp, #0x30]
00a57930	ldp x20,x19,[sp, #0x20]
00a57934	ldp x22,x21,[sp, #0x10]
00a57938	mov x1,xzr
00a5793c	mov x4,xzr
00a57940	ldr x23,[sp], #0x40
00a57944	b 0x00c3b2b0
00a57948	bl 0x00c342a0
00a5794c	adrp x0,0x2b7000
00a57950	adrp x2,0x29e000
00a57954	add x0,x0,#0xc61
00a57958	add x2,x2,#0x129
00a5795c	mov w1,#0xa5
00a57960	bl 0x00c342b0
00a57964	orr w0,wzr,#0x6
00a57968	mov w1,#0xbd
00a5796c	b 0x00a57a38
00a57970	bl 0x00c342a0
00a57974	adrp x0,0x2b7000
00a57978	adrp x2,0x29e000
00a5797c	add x0,x0,#0xc61
00a57980	add x2,x2,#0x129
00a57984	mov w1,#0xba
00a57988	bl 0x00c342b0
00a5798c	orr w0,wzr,#0x6
00a57990	mov w1,#0x8b
00a57994	b 0x00a57a38
00a57998	ldrb w8,[x19, #0x19]
00a5799c	tbnz w8,#0x0,0x00a579ac
00a579a0	ldr w8,[x20, #0x18]
00a579a4	cmp w8,#0x2
00a579a8	b.ne 0x00a57c08
00a579ac	mov w21,wzr
00a579b0	mov x23,xzr
00a579b4	ldr x8,[x19, #0x8]
00a579b8	ldr x0,[x19, #0x40]
00a579bc	cmp x8,x0
00a579c0	b.ne 0x00a579c8
00a579c4	str xzr,[x19, #0x8]
00a579c8	cbz x0,0x00a57a00
00a579cc	ldr w8,[x0, #0x18]
00a579d0	cbnz w8,0x00a57a00
00a579d4	add x9,x0,#0x78
00a579d8	ldxr w8,[x9]
00a579dc	subs w10,w8,#0x1
00a579e0	stxr w11,w10,[x9]
00a579e4	cbnz w11,0x00a579d8
00a579e8	b.ne 0x00a579f4
00a579ec	dmb ISHLD
00a579f0	b 0x00a579fc
00a579f4	cmp w8,#0x1
00a579f8	b.gt 0x00a57a00
00a579fc	bl 0x00c3c280
00a57a00	str xzr,[x19, #0x40]
00a57a04	cbz w21,0x00a57a58
00a57a08	mov x0,x22
00a57a0c	bl 0x00c323b0
00a57a10	cbnz w0,0x00a57a60
00a57a14	bl 0x00c342a0
00a57a18	adrp x0,0x2b7000
00a57a1c	adrp x2,0x29e000
00a57a20	add x0,x0,#0xc61
00a57a24	add x2,x2,#0x129
00a57a28	mov w1,#0x12b
00a57a2c	bl 0x00c342b0
00a57a30	orr w0,wzr,#0x6
00a57a34	mov w1,#0x86
00a57a38	mov x2,xzr
00a57a3c	bl 0x00c342c0
00a57a40	mov w0,wzr
00a57a44	ldp x29,x30,[sp, #0x30]
00a57a48	ldp x20,x19,[sp, #0x20]
00a57a4c	ldp x22,x21,[sp, #0x10]
00a57a50	ldr x23,[sp], #0x40
00a57a54	ret
00a57a58	mov x22,x23
00a57a5c	cbz x23,0x00a57a74
00a57a60	ldr w1,[x20]
00a57a64	mov x0,x22
00a57a68	bl 0x00c368b0
00a57a6c	cbz x0,0x00a57bd0
00a57a70	mov x20,x0
00a57a74	ldr x8,[x19, #0x8]
00a57a78	str x22,[x19, #0x10]
00a57a7c	cmp x8,x20
00a57a80	b.eq 0x00a57b28
00a57a84	cbz x8,0x00a57af4
00a57a88	ldr x8,[x8, #0x40]
00a57a8c	cbz x8,0x00a57ab0
00a57a90	mov w1,#0x2
00a57a94	mov x0,x19
00a57a98	bl 0x00c3c1d0
00a57a9c	cbnz w0,0x00a57ab0
00a57aa0	ldr x8,[x19, #0x8]
00a57aa4	mov x0,x19
00a57aa8	ldr x8,[x8, #0x40]
00a57aac	blr x8
00a57ab0	ldr x8,[x19, #0x20]
00a57ab4	cbz x8,0x00a57af4
00a57ab8	ldr x8,[x19, #0x8]
00a57abc	ldr w8,[x8, #0x4c]
00a57ac0	cmp w8,#0x1
00a57ac4	b.lt 0x00a57af4
00a57ac8	mov w1,#0x4
00a57acc	mov x0,x19
00a57ad0	bl 0x00c3c1d0
00a57ad4	ldr x8,[x19, #0x8]
00a57ad8	ldr x0,[x19, #0x20]
00a57adc	adrp x2,0x2b7000
00a57ae0	add x2,x2,#0xc61
00a57ae4	ldrsw x1,[x8, #0x4c]
00a57ae8	mov w3,#0x25
00a57aec	bl 0x00c345e0
00a57af0	str xzr,[x19, #0x20]
00a57af4	ldrb w8,[x19, #0x19]
00a57af8	str x20,[x19, #0x8]
00a57afc	tbnz w8,#0x0,0x00a57b28
00a57b00	ldrsw x0,[x20, #0x4c]
00a57b04	cbz w0,0x00a57b28
00a57b08	ldr x8,[x20, #0x28]
00a57b0c	adrp x1,0x2b7000
00a57b10	add x1,x1,#0xc61
00a57b14	mov w2,#0x14c
00a57b18	str x8,[x19, #0x30]
00a57b1c	bl 0x00c34250
00a57b20	str x0,[x19, #0x20]
00a57b24	cbz x0,0x00a57c98
00a57b28	ldr x0,[x19, #0x28]
00a57b2c	cbz x0,0x00a57b70
00a57b30	ldr w8,[x0]
00a57b34	sub w9,w8,#0x10
00a57b38	cmp w9,#0x30
00a57b3c	b.hi 0x00a57b58
00a57b40	mov w10,#0x1
00a57b44	lsl x9,x10,x9
00a57b48	mov x10,#0x1000000010000
00a57b4c	movk x10,#0x1
00a57b50	tst x9,x10
00a57b54	b.ne 0x00a57b68
00a57b58	cmp w8,#0x100
00a57b5c	b.eq 0x00a57b68
00a57b60	cmp w8,#0x80
00a57b64	b.ne 0x00a57ba0
00a57b68	ldr x8,[x0, #0x28]
00a57b6c	cbz x8,0x00a57ba0
00a57b70	ldrb w8,[x19, #0x19]
00a57b74	tbnz w8,#0x0,0x00a57b98
00a57b78	ldr x8,[x19, #0x8]
00a57b7c	mov x0,x19
00a57b80	ldp x29,x30,[sp, #0x30]
00a57b84	ldp x20,x19,[sp, #0x20]
00a57b88	ldr x1,[x8, #0x20]
00a57b8c	ldp x22,x21,[sp, #0x10]
00a57b90	ldr x23,[sp], #0x40
00a57b94	br x1
00a57b98	mov w0,#0x1
00a57b9c	b 0x00a57a44
00a57ba0	mov w1,#0xffffffff
00a57ba4	orr w2,wzr,#0x1f0
00a57ba8	orr w3,wzr,#0x7
00a57bac	mov w4,wzr
00a57bb0	mov x5,x19
00a57bb4	bl 0x00c370f0
00a57bb8	cmn w0,#0x2
00a57bbc	b.eq 0x00a57b70
00a57bc0	cmp w0,#0x1
00a57bc4	mov w0,wzr
00a57bc8	b.lt 0x00a57a44
00a57bcc	b 0x00a57b70
00a57bd0	bl 0x00c342a0
00a57bd4	adrp x0,0x2b7000
00a57bd8	adrp x2,0x29e000
00a57bdc	add x0,x0,#0xc61
00a57be0	add x2,x2,#0x129
00a57be4	mov w1,#0x137
00a57be8	bl 0x00c342b0
00a57bec	orr w0,wzr,#0x6
00a57bf0	mov w1,#0x86
00a57bf4	mov x2,xzr
00a57bf8	bl 0x00c342c0
00a57bfc	mov x0,x22
00a57c00	bl 0x00c32360
00a57c04	b 0x00a57a40
00a57c08	ldr x8,[x19, #0x8]
00a57c0c	cbz x8,0x00a57c7c
00a57c10	ldr x8,[x8, #0x40]
00a57c14	cbz x8,0x00a57c38
00a57c18	mov w1,#0x2
00a57c1c	mov x0,x19
00a57c20	bl 0x00c3c1d0
00a57c24	cbnz w0,0x00a57c38
00a57c28	ldr x8,[x19, #0x8]
00a57c2c	mov x0,x19
00a57c30	ldr x8,[x8, #0x40]
00a57c34	blr x8
00a57c38	ldr x8,[x19, #0x20]
00a57c3c	cbz x8,0x00a57c7c
00a57c40	ldr x8,[x19, #0x8]
00a57c44	ldr w8,[x8, #0x4c]
00a57c48	cmp w8,#0x1
00a57c4c	b.lt 0x00a57c7c
00a57c50	mov w1,#0x4
00a57c54	mov x0,x19
00a57c58	bl 0x00c3c1d0
00a57c5c	ldr x8,[x19, #0x8]
00a57c60	ldr x0,[x19, #0x20]
00a57c64	adrp x2,0x2b7000
00a57c68	add x2,x2,#0xc61
00a57c6c	ldrsw x1,[x8, #0x4c]
00a57c70	mov w3,#0x25
00a57c74	bl 0x00c345e0
00a57c78	str xzr,[x19, #0x20]
00a57c7c	ldr x8,[x20, #0x70]
00a57c80	cbnz x8,0x00a57d5c
00a57c84	ldr w0,[x20]
00a57c88	cbz w0,0x00a57cc4
00a57c8c	bl 0x00c324f0
00a57c90	mov x2,x0
00a57c94	b 0x00a57ccc
00a57c98	bl 0x00c342a0
00a57c9c	adrp x0,0x2b7000
00a57ca0	adrp x2,0x29e000
00a57ca4	add x0,x0,#0xc61
00a57ca8	add x2,x2,#0x129
00a57cac	mov w1,#0x14e
00a57cb0	bl 0x00c342b0
00a57cb4	mov w1,#0x100
00a57cb8	orr w0,wzr,#0x6
00a57cbc	movk w1,#0xc, LSL #16
00a57cc0	b 0x00a57a38
00a57cc4	adrp x2,0x29d000
00a57cc8	add x2,x2,#0xc23
00a57ccc	adrp x3,0x2ab000
00a57cd0	adrp x4,0xa59000
00a57cd4	adrp x5,0xa59000
00a57cd8	adrp x6,0xa59000
00a57cdc	add x3,x3,#0x32c
00a57ce0	add x4,x4,#0x84
00a57ce4	add x5,x5,#0x588
00a57ce8	add x6,x6,#0x5ac
00a57cec	mov w1,#0x1
00a57cf0	mov x0,xzr
00a57cf4	bl 0x00c3bf50
00a57cf8	cbz x0,0x00a57d30
00a57cfc	mov x20,x0
00a57d00	ldr x0,[x19, #0x40]
00a57d04	cbz x0,0x00a57d58
00a57d08	ldr w8,[x0, #0x18]
00a57d0c	cbnz w8,0x00a57d58
00a57d10	add x9,x0,#0x78
00a57d14	ldxr w8,[x9]
00a57d18	subs w10,w8,#0x1
00a57d1c	stxr w11,w10,[x9]
00a57d20	cbnz w11,0x00a57d14
00a57d24	b.ne 0x00a57d4c
00a57d28	dmb ISHLD
00a57d2c	b 0x00a57d54
00a57d30	bl 0x00c342a0
00a57d34	adrp x0,0x2b7000
00a57d38	adrp x2,0x29e000
00a57d3c	add x0,x0,#0xc61
00a57d40	add x2,x2,#0x129
00a57d44	orr w1,wzr,#0xfe
00a57d48	b 0x00a57a2c
00a57d4c	cmp w8,#0x1
00a57d50	b.gt 0x00a57d58
00a57d54	bl 0x00c3c280
00a57d58	str x20,[x19, #0x40]
00a57d5c	ldr x0,[x19, #0x38]
00a57d60	cbz x0,0x00a57d88
00a57d64	ldr x8,[x19, #0x8]
00a57d68	cbz x8,0x00a57d88
00a57d6c	cmp x8,x20
00a57d70	b.eq 0x00a57d88
00a57d74	ldr x8,[x8, #0xb0]
00a57d78	cbz x8,0x00a57d80
00a57d7c	blr x8
00a57d80	mov x0,xzr
00a57d84	str xzr,[x19, #0x38]
00a57d88	ldr x8,[x20, #0x70]
00a57d8c	cbz x8,0x00a57e00
00a57d90	ldr x8,[x19, #0x40]
00a57d94	cmp x8,x20
00a57d98	b.eq 0x00a57e00
00a57d9c	ldr w9,[x20, #0x18]
00a57da0	cbnz w9,0x00a57dbc
00a57da4	add x8,x20,#0x78
00a57da8	ldxr w9,[x8]
00a57dac	add w9,w9,#0x1
00a57db0	stxr w10,w9,[x8]
00a57db4	cbnz w10,0x00a57da8
00a57db8	ldr x8,[x19, #0x40]
00a57dbc	cbz x8,0x00a57df8
00a57dc0	ldr w9,[x8, #0x18]
00a57dc4	cbnz w9,0x00a57df8
00a57dc8	add x10,x8,#0x78
00a57dcc	ldxr w9,[x10]
00a57dd0	subs w11,w9,#0x1
00a57dd4	stxr w12,w11,[x10]
00a57dd8	cbnz w12,0x00a57dcc
00a57ddc	b.ne 0x00a57de8
00a57de0	dmb ISHLD
00a57de4	b 0x00a57df0
00a57de8	cmp w9,#0x1
00a57dec	b.gt 0x00a57df8
00a57df0	mov x0,x8
00a57df4	bl 0x00c3c280
00a57df8	ldr x0,[x19, #0x38]
00a57dfc	str x20,[x19, #0x40]
00a57e00	str x20,[x19, #0x8]
00a57e04	cbnz x0,0x00a57e24
00a57e08	ldr x0,[x20, #0x70]
00a57e0c	ldr x22,[x20, #0x88]
00a57e10	bl 0x00c3b680
00a57e14	blr x22
00a57e18	str x0,[x19, #0x38]
00a57e1c	cbz x0,0x00a57e60
00a57e20	ldr x20,[x19, #0x8]
00a57e24	ldr x2,[x20, #0x90]
00a57e28	cbz x2,0x00a57e44
00a57e2c	mov x1,x21
00a57e30	ldp x29,x30,[sp, #0x30]
00a57e34	ldp x20,x19,[sp, #0x20]
00a57e38	ldp x22,x21,[sp, #0x10]
00a57e3c	ldr x23,[sp], #0x40
00a57e40	br x2
00a57e44	bl 0x00c342a0
00a57e48	adrp x0,0x2b7000
00a57e4c	adrp x2,0x29e000
00a57e50	add x0,x0,#0xc61
00a57e54	add x2,x2,#0x129
00a57e58	mov w1,#0x11e
00a57e5c	b 0x00a57a2c
00a57e60	bl 0x00c342a0
00a57e64	adrp x0,0x2b7000
00a57e68	adrp x2,0x29e000
00a57e6c	add x0,x0,#0xc61
00a57e70	add x2,x2,#0x129
00a57e74	mov w1,#0x118
00a57e78	b 0x00a57a2c
