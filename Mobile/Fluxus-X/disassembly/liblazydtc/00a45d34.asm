; FUN_00a45d34 @ 00a45d34
00a45d34	sub sp,sp,#0x70
00a45d38	stp x28,x27,[sp, #0x10]
00a45d3c	stp x26,x25,[sp, #0x20]
00a45d40	stp x24,x23,[sp, #0x30]
00a45d44	stp x22,x21,[sp, #0x40]
00a45d48	stp x20,x19,[sp, #0x50]
00a45d4c	stp x29,x30,[sp, #0x60]
00a45d50	ldr w8,[x1, #0x28]
00a45d54	ldr w9,[x1]
00a45d58	mov x19,x0
00a45d5c	mov x20,x1
00a45d60	add x22,x0,#0x28
00a45d64	add w8,w9,w8
00a45d68	str w8,[x0]
00a45d6c	ldr w8,[x1, #0x2c]
00a45d70	ldr w9,[x1, #0x4]
00a45d74	add x29,sp,#0x60
00a45d78	mov x21,x2
00a45d7c	add w8,w9,w8
00a45d80	str w8,[x0, #0x4]
00a45d84	ldr w8,[x1, #0x30]
00a45d88	ldr w9,[x1, #0x8]
00a45d8c	add w8,w9,w8
00a45d90	str w8,[x0, #0x8]
00a45d94	ldr w8,[x1, #0x34]
00a45d98	ldr w9,[x1, #0xc]
00a45d9c	add w8,w9,w8
00a45da0	str w8,[x0, #0xc]
00a45da4	ldr w8,[x1, #0x38]
00a45da8	ldr w9,[x1, #0x10]
00a45dac	add w8,w9,w8
00a45db0	str w8,[x0, #0x10]
00a45db4	ldr w8,[x1, #0x3c]
00a45db8	ldr w9,[x1, #0x14]
00a45dbc	add w8,w9,w8
00a45dc0	str w8,[x0, #0x14]
00a45dc4	ldr w8,[x1, #0x40]
00a45dc8	ldr w9,[x1, #0x18]
00a45dcc	add w8,w9,w8
00a45dd0	str w8,[x0, #0x18]
00a45dd4	ldr w8,[x1, #0x44]
00a45dd8	ldr w9,[x1, #0x1c]
00a45ddc	add w8,w9,w8
00a45de0	str w8,[x0, #0x1c]
00a45de4	ldr w8,[x1, #0x48]
00a45de8	ldr w9,[x1, #0x20]
00a45dec	add w8,w9,w8
00a45df0	str w8,[x0, #0x20]
00a45df4	ldr w8,[x1, #0x4c]
00a45df8	ldr w9,[x1, #0x24]
00a45dfc	add w8,w9,w8
00a45e00	str w8,[x0, #0x24]
00a45e04	ldr w8,[x1, #0x28]
00a45e08	ldr w9,[x1]
00a45e0c	sub w8,w8,w9
00a45e10	str w8,[x0, #0x28]
00a45e14	ldr w8,[x1, #0x2c]
00a45e18	ldr w9,[x1, #0x4]
00a45e1c	sub w8,w8,w9
00a45e20	str w8,[x0, #0x2c]
00a45e24	ldr w8,[x1, #0x30]
00a45e28	ldr w9,[x1, #0x8]
00a45e2c	sub w8,w8,w9
00a45e30	str w8,[x0, #0x30]
00a45e34	ldr w8,[x1, #0x34]
00a45e38	ldr w9,[x1, #0xc]
00a45e3c	sub w8,w8,w9
00a45e40	str w8,[x0, #0x34]
00a45e44	ldr w8,[x1, #0x38]
00a45e48	ldr w9,[x1, #0x10]
00a45e4c	sub w8,w8,w9
00a45e50	str w8,[x0, #0x38]
00a45e54	ldr w8,[x1, #0x3c]
00a45e58	ldr w9,[x1, #0x14]
00a45e5c	sub w8,w8,w9
00a45e60	str w8,[x0, #0x3c]
00a45e64	ldr w8,[x1, #0x40]
00a45e68	ldr w9,[x1, #0x18]
00a45e6c	sub w8,w8,w9
00a45e70	str w8,[x0, #0x40]
00a45e74	ldr w8,[x1, #0x44]
00a45e78	ldr w9,[x1, #0x1c]
00a45e7c	sub w8,w8,w9
00a45e80	str w8,[x0, #0x44]
00a45e84	ldr w8,[x1, #0x48]
00a45e88	ldr w9,[x1, #0x20]
00a45e8c	sub w8,w8,w9
00a45e90	str w8,[x0, #0x48]
00a45e94	ldr w8,[x1, #0x4c]
00a45e98	ldr w9,[x1, #0x24]
00a45e9c	mov x1,x19
00a45ea0	sub w8,w8,w9
00a45ea4	str w8,[x0, #0x4c]
00a45ea8	add x0,x0,#0x50
00a45eac	bl 0x00a44e38
00a45eb0	add x2,x21,#0x28
00a45eb4	mov x0,x22
00a45eb8	mov x1,x22
00a45ebc	bl 0x00a44e38
00a45ec0	add x0,x19,#0x78
00a45ec4	add x1,x21,#0x50
00a45ec8	add x2,x20,#0x78
00a45ecc	bl 0x00a44e38
00a45ed0	ldp w8,w9,[x20, #0x50]
00a45ed4	str w8,[sp, #0xc]
00a45ed8	ldp w14,w15,[x19, #0x50]
00a45edc	ldp w16,w17,[x19, #0x28]
00a45ee0	ldp w18,w0,[x19, #0x58]
00a45ee4	ldp w1,w2,[x19, #0x30]
00a45ee8	ldp w3,w4,[x19, #0x60]
00a45eec	ldp w5,w6,[x19, #0x38]
00a45ef0	ldp w7,w21,[x19, #0x68]
00a45ef4	ldp w22,w23,[x19, #0x40]
00a45ef8	ldp w24,w25,[x19, #0x70]
00a45efc	ldp w26,w27,[x19, #0x48]
00a45f00	sub w28,w14,w16
00a45f04	sub w30,w15,w17
00a45f08	add w14,w16,w14
00a45f0c	sub w16,w18,w1
00a45f10	add w15,w17,w15
00a45f14	sub w17,w0,w2
00a45f18	add w18,w1,w18
00a45f1c	sub w1,w3,w5
00a45f20	add w0,w2,w0
00a45f24	sub w2,w4,w6
00a45f28	add w3,w5,w3
00a45f2c	sub w5,w7,w22
00a45f30	add w4,w6,w4
00a45f34	sub w6,w21,w23
00a45f38	add w7,w22,w7
00a45f3c	sub w22,w24,w26
00a45f40	add w21,w23,w21
00a45f44	sub w23,w25,w27
00a45f48	add w24,w26,w24
00a45f4c	add w25,w27,w25
00a45f50	ldp w10,w11,[x20, #0x58]
00a45f54	ldp w12,w13,[x20, #0x60]
00a45f58	ldp w26,w27,[x20, #0x68]
00a45f5c	ldp w8,w20,[x20, #0x70]
00a45f60	stp w28,w30,[x19]
00a45f64	stp w16,w17,[x19, #0x8]
00a45f68	stp w1,w2,[x19, #0x10]
00a45f6c	stp w5,w6,[x19, #0x18]
00a45f70	stp w22,w23,[x19, #0x20]
00a45f74	stp w14,w15,[x19, #0x28]
00a45f78	stp w18,w0,[x19, #0x30]
00a45f7c	stp w3,w4,[x19, #0x38]
00a45f80	stp w7,w21,[x19, #0x40]
00a45f84	stp w24,w25,[x19, #0x48]
00a45f88	ldr w5,[sp, #0xc]
00a45f8c	ldp w14,w16,[x19, #0x78]
00a45f90	ldp w15,w17,[x19, #0x80]
00a45f94	ldp w18,w0,[x19, #0x88]
00a45f98	ldp w1,w2,[x19, #0x90]
00a45f9c	ldp w3,w4,[x19, #0x98]
00a45fa0	lsl w5,w5,#0x1
00a45fa4	lsl w9,w9,#0x1
00a45fa8	lsl w10,w10,#0x1
00a45fac	lsl w11,w11,#0x1
00a45fb0	lsl w12,w12,#0x1
00a45fb4	lsl w13,w13,#0x1
00a45fb8	lsl w6,w26,#0x1
00a45fbc	lsl w7,w27,#0x1
00a45fc0	lsl w8,w8,#0x1
00a45fc4	lsl w20,w20,#0x1
00a45fc8	add w21,w14,w5
00a45fcc	sub w14,w5,w14
00a45fd0	add w5,w16,w9
00a45fd4	sub w9,w9,w16
00a45fd8	add w16,w15,w10
00a45fdc	sub w10,w10,w15
00a45fe0	add w15,w17,w11
00a45fe4	sub w11,w11,w17
00a45fe8	add w17,w18,w12
00a45fec	sub w12,w12,w18
00a45ff0	add w18,w0,w13
00a45ff4	sub w13,w13,w0
00a45ff8	add w0,w1,w6
00a45ffc	sub w1,w6,w1
00a46000	add w6,w2,w7
00a46004	sub w2,w7,w2
00a46008	add w7,w3,w8
00a4600c	sub w8,w8,w3
00a46010	add w3,w4,w20
00a46014	sub w4,w20,w4
00a46018	stp w21,w5,[x19, #0x50]
00a4601c	stp w16,w15,[x19, #0x58]
00a46020	stp w17,w18,[x19, #0x60]
00a46024	stp w0,w6,[x19, #0x68]
00a46028	stp w7,w3,[x19, #0x70]
00a4602c	stp w14,w9,[x19, #0x78]
00a46030	stp w10,w11,[x19, #0x80]
00a46034	stp w12,w13,[x19, #0x88]
00a46038	stp w1,w2,[x19, #0x90]
00a4603c	stp w8,w4,[x19, #0x98]
00a46040	ldp x29,x30,[sp, #0x60]
00a46044	ldp x20,x19,[sp, #0x50]
00a46048	ldp x22,x21,[sp, #0x40]
00a4604c	ldp x24,x23,[sp, #0x30]
00a46050	ldp x26,x25,[sp, #0x20]
00a46054	ldp x28,x27,[sp, #0x10]
00a46058	add sp,sp,#0x70
00a4605c	ret
