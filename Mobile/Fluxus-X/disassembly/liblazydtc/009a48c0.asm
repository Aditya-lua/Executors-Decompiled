; ix::SocketOpenSSL::accept @ 009a48c0
009a48c0	sub sp,sp,#0xb0
009a48c4	str x27,[sp, #0x50]
009a48c8	stp x26,x25,[sp, #0x60]
009a48cc	stp x24,x23,[sp, #0x70]
009a48d0	stp x22,x21,[sp, #0x80]
009a48d4	stp x20,x19,[sp, #0x90]
009a48d8	stp x29,x30,[sp, #0xa0]
009a48dc	add x29,sp,#0xa0
009a48e0	mrs x27,tpidr_el0
009a48e4	ldr x8,[x27, #0x28]
009a48e8	add x19,x0,#0xe0
009a48ec	mov x20,x0
009a48f0	mov x0,x19
009a48f4	mov x21,x1
009a48f8	str x8,[sp, #0x48]
009a48fc	bl 0x00c2ff10
009a4900	adrp x8,0xcb5000
009a4904	ldr x8,[x8, #0x100]
009a4908	ldarb w8,[x8]
009a490c	tbnz w8,#0x0,0x009a4928
009a4910	adrp x1,0x2db000
009a4914	add x1,x1,#0x78c
009a4918	orr w2,wzr,#0x18
009a491c	mov x0,x21
009a4920	bl 0x00c31090
009a4924	b 0x009a4f84
009a4928	add x8,x20,#0x8
009a492c	ldar w8,[x8]
009a4930	cmn w8,#0x1
009a4934	b.eq 0x009a4f84
009a4938	bl 0x00c34090
009a493c	cbz x0,0x009a49b4
009a4940	str x0,[x20, #0x50]
009a4944	bl 0x00c32730
009a4948	str x0,[x20, #0x48]
009a494c	cbz x0,0x009a4f84
009a4950	mov w1,#0x21
009a4954	mov w2,#0x1
009a4958	mov x3,xzr
009a495c	bl 0x00c32710
009a4960	ldr x0,[x20, #0x48]
009a4964	mov w1,#0x21
009a4968	mov w2,#0x2
009a496c	mov x3,xzr
009a4970	bl 0x00c32710
009a4974	ldr x0,[x20, #0x48]
009a4978	mov w1,#0x850
009a497c	movk w1,#0x8200, LSL #16
009a4980	bl 0x00c327d0
009a4984	ldr x8,[x20, #0x48]
009a4988	cbz x8,0x009a4f84
009a498c	bl 0x00c323e0
009a4990	add x22,x20,#0x58
009a4994	mov x0,x22
009a4998	bl 0x00c336e0
009a499c	tbz w0,#0x0,0x009a4bc0
009a49a0	ldrb w8,[x20, #0x58]
009a49a4	ldr x0,[x20, #0x48]
009a49a8	tbnz w8,#0x0,0x009a49d0
009a49ac	add x1,x22,#0x1
009a49b0	b 0x009a49d4
009a49b4	adrp x1,0x2bd000
009a49b8	add x1,x1,#0x39a
009a49bc	orr w2,wzr,#0x1c
009a49c0	mov x0,x21
009a49c4	bl 0x00c31090
009a49c8	str xzr,[x20, #0x48]
009a49cc	b 0x009a4f84
009a49d0	ldr x1,[x20, #0x68]
009a49d4	bl 0x00c32850
009a49d8	cmp w0,#0x1
009a49dc	b.ne 0x009a49f8
009a49e0	mov x24,x20
009a49e4	ldrb w8,[x24, #0x70]!
009a49e8	ldur x0,[x24, #-0x28]
009a49ec	tbnz w8,#0x0,0x009a4a58
009a49f0	add x1,x24,#0x1
009a49f4	b 0x009a4a5c
009a49f8	bl 0x00c32400
009a49fc	mov x23,x0
009a4a00	adrp x0,0x2cb000
009a4a04	add x0,x0,#0x2e3
009a4a08	add x8,sp,#0x20
009a4a0c	mov x1,x22
009a4a10	bl 0x00c304a0
009a4a14	adrp x1,0x2db000
009a4a18	add x1,x1,#0x780
009a4a1c	add x0,sp,#0x20
009a4a20	mov w2,#0xb
009a4a24	bl 0x00c308c0
009a4a28	ldp x8,x25,[x0, #0x8]
009a4a2c	ldrb w24,[x0]
009a4a30	stur x8,[sp, #0x3f]
009a4a34	ldur x8,[x0, #0x1]
009a4a38	str x8,[sp, #0x38]
009a4a3c	stp xzr,xzr,[x0]
009a4a40	str xzr,[x0, #0x10]
009a4a44	ldrb w8,[x21]
009a4a48	tbnz w8,#0x0,0x009a4acc
009a4a4c	mov x26,x21
009a4a50	strh wzr,[x26], #0x10
009a4a54	b 0x009a4af0
009a4a58	ldr x1,[x20, #0x80]
009a4a5c	mov w2,#0x1
009a4a60	bl 0x00c32830
009a4a64	cmp w0,#0x1
009a4a68	b.eq 0x009a4bc0
009a4a6c	bl 0x00c32400
009a4a70	mov x23,x0
009a4a74	adrp x0,0x2bf000
009a4a78	add x0,x0,#0x59d
009a4a7c	add x8,sp,#0x20
009a4a80	mov x1,x24
009a4a84	bl 0x00c304a0
009a4a88	adrp x1,0x2db000
009a4a8c	add x1,x1,#0x780
009a4a90	add x0,sp,#0x20
009a4a94	mov w2,#0xb
009a4a98	bl 0x00c308c0
009a4a9c	ldp x8,x25,[x0, #0x8]
009a4aa0	ldrb w24,[x0]
009a4aa4	stur x8,[sp, #0x3f]
009a4aa8	ldur x8,[x0, #0x1]
009a4aac	str x8,[sp, #0x38]
009a4ab0	stp xzr,xzr,[x0]
009a4ab4	str xzr,[x0, #0x10]
009a4ab8	ldrb w8,[x21]
009a4abc	tbnz w8,#0x0,0x009a4b48
009a4ac0	mov x26,x21
009a4ac4	strh wzr,[x26], #0x10
009a4ac8	b 0x009a4b6c
009a4acc	mov x26,x21
009a4ad0	ldr x8,[x26, #0x10]!
009a4ad4	strb wzr,[x8]
009a4ad8	ldrb w8,[x21]
009a4adc	str xzr,[x21, #0x8]
009a4ae0	tbz w8,#0x0,0x009a4af0
009a4ae4	ldr x0,[x21, #0x10]
009a4ae8	bl 0x00c301d0
009a4aec	str xzr,[x21]
009a4af0	strb w24,[x21]
009a4af4	ldr x8,[sp, #0x38]
009a4af8	stur x8,[x21, #0x1]
009a4afc	ldur x8,[sp, #0x3f]
009a4b00	str x8,[x21, #0x8]
009a4b04	str x25,[x26]
009a4b08	ldrb w8,[sp, #0x20]
009a4b0c	stur xzr,[sp, #0x3f]
009a4b10	str xzr,[sp, #0x38]
009a4b14	tbz w8,#0x0,0x009a4b20
009a4b18	ldr x0,[sp, #0x30]
009a4b1c	bl 0x00c301d0
009a4b20	mov x0,x23
009a4b24	mov x1,xzr
009a4b28	bl 0x00c34000
009a4b2c	mov x23,x0
009a4b30	bl 0x00c2ff50
009a4b34	mov x2,x0
009a4b38	mov x0,x21
009a4b3c	mov x1,x23
009a4b40	bl 0x00c308c0
009a4b44	b 0x009a4bc0
009a4b48	mov x26,x21
009a4b4c	ldr x8,[x26, #0x10]!
009a4b50	strb wzr,[x8]
009a4b54	ldrb w8,[x21]
009a4b58	str xzr,[x21, #0x8]
009a4b5c	tbz w8,#0x0,0x009a4b6c
009a4b60	ldr x0,[x21, #0x10]
009a4b64	bl 0x00c301d0
009a4b68	str xzr,[x21]
009a4b6c	strb w24,[x21]
009a4b70	ldr x8,[sp, #0x38]
009a4b74	stur x8,[x21, #0x1]
009a4b78	ldur x8,[sp, #0x3f]
009a4b7c	str x8,[x21, #0x8]
009a4b80	str x25,[x26]
009a4b84	ldrb w8,[sp, #0x20]
009a4b88	stur xzr,[sp, #0x3f]
009a4b8c	str xzr,[sp, #0x38]
009a4b90	tbz w8,#0x0,0x009a4b9c
009a4b94	ldr x0,[sp, #0x30]
009a4b98	bl 0x00c301d0
009a4b9c	mov x0,x23
009a4ba0	mov x1,xzr
009a4ba4	bl 0x00c34000
009a4ba8	mov x23,x0
009a4bac	bl 0x00c2ff50
009a4bb0	mov x2,x0
009a4bb4	mov x0,x21
009a4bb8	mov x1,x23
009a4bbc	bl 0x00c308c0
009a4bc0	bl 0x00c323e0
009a4bc4	mov x0,x22
009a4bc8	bl 0x00c33700
009a4bcc	tbz w0,#0x0,0x009a4be4
009a4bd0	ldr x0,[x20, #0x48]
009a4bd4	mov w1,wzr
009a4bd8	mov x2,xzr
009a4bdc	bl 0x00c32810
009a4be0	b 0x009a4f0c
009a4be4	mov x0,x22
009a4be8	bl 0x00c33720
009a4bec	tbz w0,#0x0,0x009a4c40
009a4bf0	ldr x0,[x20, #0x48]
009a4bf4	bl 0x00c34030
009a4bf8	cbnz w0,0x009a4ef0
009a4bfc	bl 0x00c32400
009a4c00	mov x23,x0
009a4c04	adrp x1,0x2a5000
009a4c08	add x1,x1,#0x7b6
009a4c0c	orr w2,wzr,#0x3e
009a4c10	mov x0,x21
009a4c14	bl 0x00c31090
009a4c18	mov x0,x23
009a4c1c	mov x1,xzr
009a4c20	bl 0x00c34000
009a4c24	mov x23,x0
009a4c28	bl 0x00c2ff50
009a4c2c	mov x2,x0
009a4c30	mov x0,x21
009a4c34	mov x1,x23
009a4c38	bl 0x00c308c0
009a4c3c	b 0x009a4ef0
009a4c40	mov x0,x22
009a4c44	bl 0x00c336f0
009a4c48	add x23,x20,#0x88
009a4c4c	tbz w0,#0x0,0x009a4c74
009a4c50	stp xzr,xzr,[sp, #0x8]
009a4c54	str xzr,[sp]
009a4c58	ldrb w8,[x23]
009a4c5c	tbnz w8,#0x0,0x009a4c84
009a4c60	ldr x8,[x23, #0x10]
009a4c64	str x8,[sp, #0x10]
009a4c68	ldr q0,[x23]
009a4c6c	str q0,[sp]
009a4c70	b 0x009a4ddc
009a4c74	ldrb w8,[x23]
009a4c78	tbnz w8,#0x0,0x009a4cb4
009a4c7c	add x24,x23,#0x1
009a4c80	b 0x009a4cb8
009a4c84	ldr x23,[x20, #0x90]
009a4c88	cmn x23,#0x10
009a4c8c	b.cs 0x009a5010
009a4c90	ldr x24,[x20, #0x98]
009a4c94	cmp x23,#0x17
009a4c98	b.cs 0x009a4da8
009a4c9c	mov x9,sp
009a4ca0	lsl w8,w23,#0x1
009a4ca4	orr x25,x9,#0x1
009a4ca8	strb w8,[sp]
009a4cac	cbnz x23,0x009a4dc8
009a4cb0	b 0x009a4dd8
009a4cb4	ldr x24,[x20, #0x98]
009a4cb8	mov x0,x24
009a4cbc	bl 0x00c34070
009a4cc0	mov x1,x0
009a4cc4	cbz x1,0x009a4d48
009a4cc8	ldr x0,[x20, #0x48]
009a4ccc	bl 0x00c34020
009a4cd0	ldr x0,[x20, #0x48]
009a4cd4	mov x1,x24
009a4cd8	mov x2,xzr
009a4cdc	bl 0x00c34010
009a4ce0	cmp w0,#0x1
009a4ce4	b.eq 0x009a4ef0
009a4ce8	bl 0x00c32400
009a4cec	mov x24,x0
009a4cf0	adrp x0,0x29f000
009a4cf4	add x0,x0,#0xa52
009a4cf8	add x8,sp,#0x20
009a4cfc	mov x1,x23
009a4d00	bl 0x00c304a0
009a4d04	adrp x1,0x2db000
009a4d08	add x1,x1,#0x780
009a4d0c	add x0,sp,#0x20
009a4d10	mov w2,#0xb
009a4d14	bl 0x00c308c0
009a4d18	ldp x8,x25,[x0, #0x8]
009a4d1c	ldrb w23,[x0]
009a4d20	stur x8,[sp, #0x3f]
009a4d24	ldur x8,[x0, #0x1]
009a4d28	str x8,[sp, #0x38]
009a4d2c	stp xzr,xzr,[x0]
009a4d30	str xzr,[x0, #0x10]
009a4d34	ldrb w8,[x21]
009a4d38	tbnz w8,#0x0,0x009a4e78
009a4d3c	mov x26,x21
009a4d40	strh wzr,[x26], #0x10
009a4d44	b 0x009a4e9c
009a4d48	bl 0x00c32400
009a4d4c	mov x24,x0
009a4d50	adrp x0,0x2d9000
009a4d54	add x0,x0,#0x3cc
009a4d58	add x8,sp,#0x20
009a4d5c	mov x1,x23
009a4d60	bl 0x00c304a0
009a4d64	adrp x1,0x2a1000
009a4d68	add x1,x1,#0xc31
009a4d6c	add x0,sp,#0x20
009a4d70	mov w2,#0xb
009a4d74	bl 0x00c308c0
009a4d78	ldp x8,x25,[x0, #0x8]
009a4d7c	ldrb w23,[x0]
009a4d80	stur x8,[sp, #0x3f]
009a4d84	ldur x8,[x0, #0x1]
009a4d88	str x8,[sp, #0x38]
009a4d8c	stp xzr,xzr,[x0]
009a4d90	str xzr,[x0, #0x10]
009a4d94	ldrb w8,[x21]
009a4d98	tbnz w8,#0x0,0x009a4dfc
009a4d9c	mov x26,x21
009a4da0	strh wzr,[x26], #0x10
009a4da4	b 0x009a4e20
009a4da8	add x8,x23,#0x10
009a4dac	and x26,x8,#-0x10
009a4db0	mov x0,x26
009a4db4	bl 0x00c2fed0
009a4db8	orr x8,x26,#0x1
009a4dbc	mov x25,x0
009a4dc0	stp x23,x0,[sp, #0x8]
009a4dc4	str x8,[sp]
009a4dc8	mov x0,x25
009a4dcc	mov x1,x24
009a4dd0	mov x2,x23
009a4dd4	bl 0x00c2ffd0
009a4dd8	strb wzr,[x25, x23]
009a4ddc	mov x1,sp
009a4de0	mov x0,x20
009a4de4	bl 0x00c33fe0
009a4de8	ldrb w8,[sp]
009a4dec	tbz w8,#0x0,0x009a4ef0
009a4df0	ldr x0,[sp, #0x10]
009a4df4	bl 0x00c301d0
009a4df8	b 0x009a4ef0
009a4dfc	mov x26,x21
009a4e00	ldr x8,[x26, #0x10]!
009a4e04	strb wzr,[x8]
009a4e08	ldrb w8,[x21]
009a4e0c	str xzr,[x21, #0x8]
009a4e10	tbz w8,#0x0,0x009a4e20
009a4e14	ldr x0,[x21, #0x10]
009a4e18	bl 0x00c301d0
009a4e1c	str xzr,[x21]
009a4e20	strb w23,[x21]
009a4e24	ldr x8,[sp, #0x38]
009a4e28	stur x8,[x21, #0x1]
009a4e2c	ldur x8,[sp, #0x3f]
009a4e30	str x8,[x21, #0x8]
009a4e34	str x25,[x26]
009a4e38	ldrb w8,[sp, #0x20]
009a4e3c	stur xzr,[sp, #0x3f]
009a4e40	str xzr,[sp, #0x38]
009a4e44	tbz w8,#0x0,0x009a4e50
009a4e48	ldr x0,[sp, #0x30]
009a4e4c	bl 0x00c301d0
009a4e50	mov x0,x24
009a4e54	mov x1,xzr
009a4e58	bl 0x00c34000
009a4e5c	mov x23,x0
009a4e60	bl 0x00c2ff50
009a4e64	mov x2,x0
009a4e68	mov x0,x21
009a4e6c	mov x1,x23
009a4e70	bl 0x00c308c0
009a4e74	b 0x009a4ef0
009a4e78	mov x26,x21
009a4e7c	ldr x8,[x26, #0x10]!
009a4e80	strb wzr,[x8]
009a4e84	ldrb w8,[x21]
009a4e88	str xzr,[x21, #0x8]
009a4e8c	tbz w8,#0x0,0x009a4e9c
009a4e90	ldr x0,[x21, #0x10]
009a4e94	bl 0x00c301d0
009a4e98	str xzr,[x21]
009a4e9c	strb w23,[x21]
009a4ea0	ldr x8,[sp, #0x38]
009a4ea4	stur x8,[x21, #0x1]
009a4ea8	ldur x8,[sp, #0x3f]
009a4eac	str x8,[x21, #0x8]
009a4eb0	str x25,[x26]
009a4eb4	ldrb w8,[sp, #0x20]
009a4eb8	stur xzr,[sp, #0x3f]
009a4ebc	str xzr,[sp, #0x38]
009a4ec0	tbz w8,#0x0,0x009a4ecc
009a4ec4	ldr x0,[sp, #0x30]
009a4ec8	bl 0x00c301d0
009a4ecc	mov x0,x24
009a4ed0	mov x1,xzr
009a4ed4	bl 0x00c34000
009a4ed8	mov x23,x0
009a4edc	bl 0x00c2ff50
009a4ee0	mov x2,x0
009a4ee4	mov x0,x21
009a4ee8	mov x1,x23
009a4eec	bl 0x00c308c0
009a4ef0	ldr x0,[x20, #0x48]
009a4ef4	orr w1,wzr,#0x3
009a4ef8	mov x2,xzr
009a4efc	bl 0x00c32810
009a4f00	ldr x0,[x20, #0x48]
009a4f04	mov w1,#0x4
009a4f08	bl 0x00c34040
009a4f0c	mov x0,x22
009a4f10	bl 0x00c33710
009a4f14	mov w8,w0
009a4f18	ldr x0,[x20, #0x48]
009a4f1c	tbz w8,#0x0,0x009a4fc0
009a4f20	adrp x8,0xd21000
009a4f24	add x8,x8,#0x870
009a4f28	ldrb w9,[x8]
009a4f2c	ldr x10,[x8, #0x10]
009a4f30	tst w9,#0x1
009a4f34	csinc x1,x10,x8,ne
009a4f38	bl 0x00c32770
009a4f3c	cmp w0,#0x1
009a4f40	b.ne 0x009a4f84
009a4f44	ldr x0,[x20, #0x48]
009a4f48	bl 0x00c32990
009a4f4c	str x0,[x20, #0x40]
009a4f50	cbz x0,0x009a4fe0
009a4f54	add x8,x20,#0x8
009a4f58	ldar w1,[x8]
009a4f5c	bl 0x00c34080
009a4f60	mov x0,x20
009a4f64	mov x1,x21
009a4f68	bl 0x00c33fd0
009a4f6c	mov w21,w0
009a4f70	mov x0,x19
009a4f74	bl 0x00c2ff20
009a4f78	tbz w21,#0x0,0x009a5000
009a4f7c	mov w0,#0x1
009a4f80	b 0x009a4f90
009a4f84	mov x0,x19
009a4f88	bl 0x00c2ff20
009a4f8c	mov w0,wzr
009a4f90	ldr x8,[x27, #0x28]
009a4f94	ldr x9,[sp, #0x48]
009a4f98	cmp x8,x9
009a4f9c	b.ne 0x009a500c
009a4fa0	ldp x29,x30,[sp, #0xa0]
009a4fa4	ldp x20,x19,[sp, #0x90]
009a4fa8	ldp x22,x21,[sp, #0x80]
009a4fac	ldp x24,x23,[sp, #0x70]
009a4fb0	ldp x26,x25,[sp, #0x60]
009a4fb4	ldr x27,[sp, #0x50]
009a4fb8	add sp,sp,#0xb0
009a4fbc	ret
009a4fc0	mov x8,x20
009a4fc4	ldrb w9,[x8, #0xa0]!
009a4fc8	tbnz w9,#0x0,0x009a4fd4
009a4fcc	add x1,x8,#0x1
009a4fd0	b 0x009a4fd8
009a4fd4	ldr x1,[x20, #0xb0]
009a4fd8	bl 0x00c32770
009a4fdc	b 0x009a4f3c
009a4fe0	adrp x1,0x2d9000
009a4fe4	add x1,x1,#0x3f7
009a4fe8	mov w2,#0x19
009a4fec	mov x0,x21
009a4ff0	bl 0x00c31090
009a4ff4	ldr x0,[x20, #0x48]
009a4ff8	bl 0x00c32720
009a4ffc	b 0x009a49c8
009a5000	mov x0,x20
009a5004	bl 0x00c33ff0
009a5008	b 0x009a4f8c
009a500c	bl 0x00c2fec0
009a5010	mov x0,sp
009a5014	bl 0x00c30ce0
