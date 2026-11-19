; FUN_00bf7758 @ 00bf7758
00bf7758	paciasp
00bf775c	stp x29,x30,[sp, #-0x50]!
00bf7760	str x25,[sp, #0x10]
00bf7764	stp x24,x23,[sp, #0x20]
00bf7768	stp x22,x21,[sp, #0x30]
00bf776c	stp x20,x19,[sp, #0x40]
00bf7770	mov x29,sp
00bf7774	movi v0.2D,#0x0
00bf7778	mov x8,#-0x1
00bf777c	adrp x9,0xcad000
00bf7780	add x9,x9,#0x530
00bf7784	mov x20,x0
00bf7788	mov w21,w3
00bf778c	stp x9,x8,[x0]
00bf7790	mov w9,#0x1
00bf7794	mov x8,x0
00bf7798	str x9,[x0, #0x118]
00bf779c	add x9,x0,#0x118
00bf77a0	mov x19,x0
00bf77a4	str q0,[x8, #0x28]!
00bf77a8	mov x22,x2
00bf77ac	str x8,[x20, #0x10]!
00bf77b0	stur q0,[x0, #0x38]
00bf77b4	stur q0,[x0, #0x48]
00bf77b8	stur q0,[x0, #0x58]
00bf77bc	stur q0,[x0, #0x68]
00bf77c0	stur q0,[x0, #0x78]
00bf77c4	stur q0,[x0, #0x88]
00bf77c8	stur q0,[x0, #0x98]
00bf77cc	stur q0,[x0, #0xa8]
00bf77d0	stur q0,[x0, #0xb8]
00bf77d4	stur q0,[x0, #0xc8]
00bf77d8	stur q0,[x0, #0xd8]
00bf77dc	stur q0,[x0, #0xe8]
00bf77e0	stur q0,[x0, #0xf8]
00bf77e4	str q0,[x8, #0xe0]
00bf77e8	stp x9,x9,[x0, #0x18]
00bf77ec	ldrb w24,[x1, #0x120]
00bf77f0	ldr x23,[x1, #0x128]
00bf77f4	ubfx w8,w24,#0x1,#0x7
00bf77f8	tst w24,#0x1
00bf77fc	csel x8,x8,x23,eq
00bf7800	cmp x8,#0x1
00bf7804	b.ne 0x00bf7824
00bf7808	ldr x9,[x1, #0x130]
00bf780c	add x10,x1,#0x121
00bf7810	tst w24,#0x1
00bf7814	csel x9,x10,x9,eq
00bf7818	ldrb w9,[x9]
00bf781c	cmp w9,#0x2a
00bf7820	b.eq 0x00bf7898
00bf7824	ldrb w9,[x22]
00bf7828	ldr x10,[x22, #0x8]
00bf782c	ubfx w11,w9,#0x1,#0x7
00bf7830	tst w9,#0x1
00bf7834	csel x10,x11,x10,eq
00bf7838	cmp x10,#0x1
00bf783c	b.ne 0x00bf7858
00bf7840	ldr x11,[x22, #0x10]
00bf7844	tst w9,#0x1
00bf7848	csinc x11,x11,x22,ne
00bf784c	ldrb w11,[x11]
00bf7850	cmp w11,#0x2a
00bf7854	b.eq 0x00bf7898
00bf7858	cbz w21,0x00bf7d30
00bf785c	cmp x8,x10
00bf7860	b.ne 0x00bf7898
00bf7864	ldr x10,[x1, #0x130]
00bf7868	add x11,x1,#0x121
00bf786c	tst w24,#0x1
00bf7870	ldr x12,[x22, #0x10]
00bf7874	mov x25,x1
00bf7878	mov x2,x8
00bf787c	csel x0,x11,x10,eq
00bf7880	tst w9,#0x1
00bf7884	csinc x9,x12,x22,ne
00bf7888	mov x1,x9
00bf788c	bl 0x00c300b0
00bf7890	mov x1,x25
00bf7894	cbz w0,0x00bf7d30
00bf7898	mov w8,#0x2a02
00bf789c	strb wzr,[x19, #0x122]
00bf78a0	strh w8,[x19, #0x120]
00bf78a4	cmp x19,x1
00bf78a8	b.eq 0x00bf78c4
00bf78ac	ldp x8,x2,[x1, #0x10]
00bf78b0	sub x9,x2,x8
00bf78b4	asr x3,x9,#0x3
00bf78b8	mov x0,x20
00bf78bc	mov x1,x8
00bf78c0	bl 0x00c0b578
00bf78c4	ldp x9,x8,[x19, #0x10]
00bf78c8	cmp x8,x9
00bf78cc	b.eq 0x00bf790c
00bf78d0	mov x10,xzr
00bf78d4	mov w23,#0x1
00bf78d8	b 0x00bf78f0
00bf78dc	mov w10,w23
00bf78e0	sub x11,x8,x9
00bf78e4	add w23,w23,#0x1
00bf78e8	cmp x10,x11, ASR #0x3
00bf78ec	b.cs 0x00bf790c
00bf78f0	ldr x10,[x9, x10, LSL #0x3]
00bf78f4	cbz x10,0x00bf78dc
00bf78f8	add x1,x10,#0x8
00bf78fc	mov w0,#0x1
00bf7900	bl 0x00c2bce0
00bf7904	ldp x9,x8,[x19, #0x10]
00bf7908	b 0x00bf78dc
00bf790c	tbz w21,#0x3,0x00bf7958
00bf7910	mov w0,#0x18
00bf7914	bl 0x00c2fed0
00bf7918	mov x1,x22
00bf791c	mov x2,xzr
00bf7920	mov x23,x0
00bf7924	bl 0x00c44380
00bf7928	mov x0,x19
00bf792c	mov x1,x23
00bf7930	bl 0x00bf5a30
00bf7934	mov w0,#0x18
00bf7938	bl 0x00c2fed0
00bf793c	mov x1,x22
00bf7940	mov x2,xzr
00bf7944	mov x23,x0
00bf7948	bl 0x00c44390
00bf794c	mov x0,x19
00bf7950	mov x1,x23
00bf7954	bl 0x00bf5b5c
00bf7958	tbz w21,#0x0,0x00bf7aac
00bf795c	mov w0,#0x28
00bf7960	bl 0x00c2fed0
00bf7964	mov x1,x22
00bf7968	mov x2,xzr
00bf796c	mov x23,x0
00bf7970	bl 0x00c443a0
00bf7974	mov x0,x19
00bf7978	mov x1,x23
00bf797c	bl 0x00bf5c88
00bf7980	mov w0,#0x18
00bf7984	bl 0x00c2fed0
00bf7988	mov x1,x22
00bf798c	mov x2,xzr
00bf7990	mov x23,x0
00bf7994	bl 0x00c443b0
00bf7998	mov x0,x19
00bf799c	mov x1,x23
00bf79a0	bl 0x00bf5db4
00bf79a4	mov w0,#0x10
00bf79a8	bl 0x00c2fed0
00bf79ac	mov x1,x0
00bf79b0	adrp x8,0xcb5000
00bf79b4	mov x9,#-0x1
00bf79b8	ldr x8,[x8, #0xd88]
00bf79bc	add x8,x8,#0x10
00bf79c0	stp x8,x9,[x1]
00bf79c4	mov x0,x19
00bf79c8	bl 0x00bf5ee0
00bf79cc	mov w0,#0x18
00bf79d0	bl 0x00c2fed0
00bf79d4	ldrb w8,[x22]
00bf79d8	ldr x9,[x22, #0x10]
00bf79dc	mov x23,x0
00bf79e0	tst w8,#0x1
00bf79e4	csinc x1,x9,x22,ne
00bf79e8	mov x2,xzr
00bf79ec	bl 0x00c443c0
00bf79f0	adrp x8,0xcb5000
00bf79f4	ldr x8,[x8, #0xd90]
00bf79f8	add x8,x8,#0x10
00bf79fc	str x8,[x23]
00bf7a00	mov x0,x19
00bf7a04	mov x1,x23
00bf7a08	bl 0x00bf600c
00bf7a0c	mov w0,#0x10
00bf7a10	bl 0x00c2fed0
00bf7a14	mov x1,x0
00bf7a18	adrp x8,0xcb5000
00bf7a1c	mov x9,#-0x1
00bf7a20	ldr x8,[x8, #0xd98]
00bf7a24	add x8,x8,#0x10
00bf7a28	stp x8,x9,[x1]
00bf7a2c	mov x0,x19
00bf7a30	bl 0x00bf6138
00bf7a34	mov w0,#0x10
00bf7a38	bl 0x00c2fed0
00bf7a3c	mov x1,x0
00bf7a40	adrp x8,0xcb5000
00bf7a44	mov x9,#-0x1
00bf7a48	ldr x8,[x8, #0xda0]
00bf7a4c	add x8,x8,#0x10
00bf7a50	stp x8,x9,[x1]
00bf7a54	mov x0,x19
00bf7a58	bl 0x00bf6264
00bf7a5c	mov w0,#0x10
00bf7a60	bl 0x00c2fed0
00bf7a64	mov x1,x0
00bf7a68	adrp x8,0xcb5000
00bf7a6c	mov x9,#-0x1
00bf7a70	ldr x8,[x8, #0xda8]
00bf7a74	add x8,x8,#0x10
00bf7a78	stp x8,x9,[x1]
00bf7a7c	mov x0,x19
00bf7a80	bl 0x00bf6390
00bf7a84	mov w0,#0x10
00bf7a88	bl 0x00c2fed0
00bf7a8c	mov x1,x0
00bf7a90	adrp x8,0xcb5000
00bf7a94	mov x9,#-0x1
00bf7a98	ldr x8,[x8, #0xdb0]
00bf7a9c	add x8,x8,#0x10
00bf7aa0	stp x8,x9,[x1]
00bf7aa4	mov x0,x19
00bf7aa8	bl 0x00bf64bc
00bf7aac	tbz w21,#0x4,0x00bf7b40
00bf7ab0	mov w0,#0x88
00bf7ab4	bl 0x00c2fed0
00bf7ab8	mov x1,x22
00bf7abc	mov x2,xzr
00bf7ac0	mov x23,x0
00bf7ac4	bl 0x00bf696c
00bf7ac8	mov x0,x19
00bf7acc	mov x1,x23
00bf7ad0	bl 0x00bf6840
00bf7ad4	mov w0,#0x88
00bf7ad8	bl 0x00c2fed0
00bf7adc	mov x1,x22
00bf7ae0	mov x2,xzr
00bf7ae4	mov x23,x0
00bf7ae8	bl 0x00bf6b9c
00bf7aec	mov x0,x19
00bf7af0	mov x1,x23
00bf7af4	bl 0x00bf6a70
00bf7af8	mov w0,#0x88
00bf7afc	bl 0x00c2fed0
00bf7b00	mov x1,x22
00bf7b04	mov x2,xzr
00bf7b08	mov x23,x0
00bf7b0c	bl 0x00bf6dcc
00bf7b10	mov x0,x19
00bf7b14	mov x1,x23
00bf7b18	bl 0x00bf6ca0
00bf7b1c	mov w0,#0x88
00bf7b20	bl 0x00c2fed0
00bf7b24	mov x1,x22
00bf7b28	mov x2,xzr
00bf7b2c	mov x23,x0
00bf7b30	bl 0x00bf6fa4
00bf7b34	mov x0,x19
00bf7b38	mov x1,x23
00bf7b3c	bl 0x00bf6e78
00bf7b40	tbz w21,#0x1,0x00bf7b8c
00bf7b44	mov w0,#0x30
00bf7b48	bl 0x00c2fed0
00bf7b4c	mov x1,x22
00bf7b50	mov x2,xzr
00bf7b54	mov x23,x0
00bf7b58	bl 0x00c443d0
00bf7b5c	mov x0,x19
00bf7b60	mov x1,x23
00bf7b64	bl 0x00bf65e8
00bf7b68	mov w0,#0x30
00bf7b6c	bl 0x00c2fed0
00bf7b70	mov x1,x22
00bf7b74	mov x2,xzr
00bf7b78	mov x23,x0
00bf7b7c	bl 0x00c443e0
00bf7b80	mov x0,x19
00bf7b84	mov x1,x23
00bf7b88	bl 0x00bf6714
00bf7b8c	tbz w21,#0x2,0x00bf7cc0
00bf7b90	mov w0,#0x440
00bf7b94	bl 0x00c2fed0
00bf7b98	adrp x8,0xcb5000
00bf7b9c	mov x23,x0
00bf7ba0	mov x9,#-0x1
00bf7ba4	ldr x8,[x8, #0xd28]
00bf7ba8	add x10,x8,#0x10
00bf7bac	add x8,x8,#0x70
00bf7bb0	stp x10,x9,[x0]
00bf7bb4	str x8,[x0, #0x10]
00bf7bb8	add x0,x0,#0x18
00bf7bbc	mov x1,x22
00bf7bc0	bl 0x00c443f0
00bf7bc4	adrp x8,0xcb5000
00bf7bc8	ldr x8,[x8, #0xdb8]
00bf7bcc	add x9,x8,#0x10
00bf7bd0	add x8,x8,#0xa8
00bf7bd4	str x9,[x23]
00bf7bd8	str x8,[x23, #0x10]
00bf7bdc	mov x0,x19
00bf7be0	mov x1,x23
00bf7be4	bl 0x00bf7050
00bf7be8	mov w0,#0x440
00bf7bec	bl 0x00c2fed0
00bf7bf0	adrp x8,0xcb5000
00bf7bf4	mov x23,x0
00bf7bf8	mov x9,#-0x1
00bf7bfc	ldr x8,[x8, #0xd38]
00bf7c00	add x10,x8,#0x10
00bf7c04	add x8,x8,#0x70
00bf7c08	stp x10,x9,[x0]
00bf7c0c	str x8,[x0, #0x10]
00bf7c10	add x0,x0,#0x18
00bf7c14	mov x1,x22
00bf7c18	bl 0x00c44400
00bf7c1c	adrp x8,0xcb5000
00bf7c20	ldr x8,[x8, #0xdc0]
00bf7c24	add x9,x8,#0x10
00bf7c28	add x8,x8,#0xa8
00bf7c2c	str x9,[x23]
00bf7c30	str x8,[x23, #0x10]
00bf7c34	mov x0,x19
00bf7c38	mov x1,x23
00bf7c3c	bl 0x00bf717c
00bf7c40	mov w0,#0x18
00bf7c44	bl 0x00c2fed0
00bf7c48	adrp x24,0xcb5000
00bf7c4c	mov x23,x0
00bf7c50	mov x8,#-0x1
00bf7c54	ldr x24,[x24, #0xd48]
00bf7c58	add x9,x24,#0x10
00bf7c5c	stp x9,x8,[x0], #0x10
00bf7c60	mov x1,x22
00bf7c64	bl 0x00c44410
00bf7c68	adrp x8,0xcb5000
00bf7c6c	ldr x8,[x8, #0xdc8]
00bf7c70	add x8,x8,#0x10
00bf7c74	str x8,[x23]
00bf7c78	mov x0,x19
00bf7c7c	mov x1,x23
00bf7c80	bl 0x00bf72a8
00bf7c84	mov w0,#0x18
00bf7c88	bl 0x00c2fed0
00bf7c8c	mov x23,x0
00bf7c90	mov x8,#-0x1
00bf7c94	add x9,x24,#0x10
00bf7c98	stp x9,x8,[x0], #0x10
00bf7c9c	mov x1,x22
00bf7ca0	bl 0x00c44410
00bf7ca4	adrp x8,0xcb5000
00bf7ca8	ldr x8,[x8, #0xdd0]
00bf7cac	add x8,x8,#0x10
00bf7cb0	str x8,[x23]
00bf7cb4	mov x0,x19
00bf7cb8	mov x1,x23
00bf7cbc	bl 0x00bf73d4
00bf7cc0	tbz w21,#0x5,0x00bf7d14
00bf7cc4	mov w0,#0x10
00bf7cc8	bl 0x00c2fed0
00bf7ccc	mov x1,x0
00bf7cd0	adrp x8,0xcb5000
00bf7cd4	mov x9,#-0x1
00bf7cd8	ldr x8,[x8, #0xdd8]
00bf7cdc	add x8,x8,#0x10
00bf7ce0	stp x8,x9,[x1]
00bf7ce4	mov x0,x19
00bf7ce8	bl 0x00bf7500
00bf7cec	mov w0,#0x10
00bf7cf0	bl 0x00c2fed0
00bf7cf4	mov x1,x0
00bf7cf8	adrp x8,0xcb5000
00bf7cfc	mov x9,#-0x1
00bf7d00	ldr x8,[x8, #0xde0]
00bf7d04	add x8,x8,#0x10
00bf7d08	stp x8,x9,[x1]
00bf7d0c	mov x0,x19
00bf7d10	bl 0x00bf762c
00bf7d14	ldp x20,x19,[sp, #0x40]
00bf7d18	ldr x25,[sp, #0x10]
00bf7d1c	ldp x22,x21,[sp, #0x30]
00bf7d20	ldp x24,x23,[sp, #0x20]
00bf7d24	ldp x29,x30,[sp], #0x50
00bf7d28	autiasp
00bf7d2c	ret
00bf7d30	tbnz w24,#0x0,0x00bf7d48
00bf7d34	ldr x8,[x1, #0x130]
00bf7d38	ldr q0,[x1, #0x120]
00bf7d3c	str x8,[x19, #0x130]
00bf7d40	str q0,[x19, #0x120]
00bf7d44	b 0x00bf78a4
00bf7d48	ldr x8,[x1, #0x130]
00bf7d4c	add x0,x19,#0x120
00bf7d50	mov x24,x1
00bf7d54	mov x1,x8
00bf7d58	mov x2,x23
00bf7d5c	bl 0x007ff40c
00bf7d60	mov x1,x24
00bf7d64	b 0x00bf78a4
