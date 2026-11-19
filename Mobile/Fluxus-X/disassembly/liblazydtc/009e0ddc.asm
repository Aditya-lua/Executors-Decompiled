; dtls1_do_write @ 009e0ddc
009e0ddc	sub sp,sp,#0x70
009e0de0	stp x28,x27,[sp, #0x10]
009e0de4	stp x26,x25,[sp, #0x20]
009e0de8	stp x24,x23,[sp, #0x30]
009e0dec	stp x22,x21,[sp, #0x40]
009e0df0	stp x20,x19,[sp, #0x50]
009e0df4	stp x29,x30,[sp, #0x60]
009e0df8	add x29,sp,#0x60
009e0dfc	mov w20,w1
009e0e00	mov x19,x0
009e0e04	bl 0x00c34130
009e0e08	cbz w0,0x009e11c4
009e0e0c	ldr x8,[x19, #0x4b8]
009e0e10	mov x0,x19
009e0e14	ldr x21,[x8, #0x130]
009e0e18	bl 0x00c34120
009e0e1c	cmp x21,x0
009e0e20	b.cc 0x009e11c4
009e0e24	cmp w20,#0x16
009e0e28	b.ne 0x009e0e4c
009e0e2c	ldr x8,[x19, #0xa0]
009e0e30	cbnz x8,0x009e0e4c
009e0e34	ldr x8,[x19, #0x4b8]
009e0e38	ldr x9,[x19, #0x98]
009e0e3c	ldr x8,[x8, #0x140]
009e0e40	add x8,x8,#0xc
009e0e44	cmp x9,x8
009e0e48	b.ne 0x009e11c4
009e0e4c	ldr x0,[x19, #0x890]
009e0e50	cbz x0,0x009e0eb0
009e0e54	ldr x8,[x19, #0x878]
009e0e58	cbz x8,0x009e0e74
009e0e5c	mov x0,x8
009e0e60	bl 0x00c34b80
009e0e64	bl 0x00c35280
009e0e68	mov x21,xzr
009e0e6c	tbnz w0,#0x15,0x009e0e80
009e0e70	ldr x0,[x19, #0x890]
009e0e74	bl 0x00c34c00
009e0e78	bl 0x00c34c20
009e0e7c	sxtw x21,w0
009e0e80	ldr x0,[x19, #0x878]
009e0e84	cbz x0,0x009e0ebc
009e0e88	bl 0x00c34b80
009e0e8c	bl 0x00c35290
009e0e90	cmp w0,#0x2
009e0e94	mov x9,xzr
009e0e98	b.ne 0x009e0ec0
009e0e9c	ldr x0,[x19, #0x878]
009e0ea0	bl 0x00c36d40
009e0ea4	lsl w8,w0,#0x1
009e0ea8	sxtw x9,w8
009e0eac	b 0x009e0ec0
009e0eb0	mov x21,xzr
009e0eb4	ldr x0,[x19, #0x878]
009e0eb8	cbnz x0,0x009e0e88
009e0ebc	mov x9,xzr
009e0ec0	mov x22,x19
009e0ec4	ldr x8,[x22, #0x98]!
009e0ec8	mov w10,#0x1
009e0ecc	stur w10,[x22, #-0x70]
009e0ed0	cbz x8,0x009e11e8
009e0ed4	add x24,x9,x21
009e0ed8	mov x23,xzr
009e0edc	mov w28,#0x1
009e0ee0	add x25,x24,#0xd
009e0ee4	add x26,x24,#0x19
009e0ee8	mov x27,#0xd00000000
009e0eec	cmp w20,#0x16
009e0ef0	b.ne 0x009e0f20
009e0ef4	ldr x9,[x19, #0xa0]
009e0ef8	cbz x9,0x009e0f20
009e0efc	cbz x23,0x009e0f18
009e0f00	cmp x9,#0xd
009e0f04	b.cc 0x009e11c4
009e0f08	sub x9,x9,#0xc
009e0f0c	add x8,x8,#0xc
009e0f10	stp x8,x9,[x19, #0x98]
009e0f14	b 0x009e0f20
009e0f18	ldr x8,[x19, #0x4b8]
009e0f1c	ldr x23,[x8, #0x150]
009e0f20	ldr x0,[x19, #0x18]
009e0f24	mov w1,#0xd
009e0f28	mov x2,xzr
009e0f2c	mov x3,xzr
009e0f30	bl 0x00c321a0
009e0f34	ldr x8,[x19, #0x4b8]
009e0f38	add x9,x27,x0, LSL #0x20
009e0f3c	add x9,x24,x9, ASR #0x20
009e0f40	ldr x8,[x8, #0x130]
009e0f44	subs x8,x8,x9
009e0f48	b.ls 0x009e0f54
009e0f4c	cmp x8,#0xc
009e0f50	b.hi 0x009e0f84
009e0f54	ldr x0,[x19, #0x18]
009e0f58	mov w1,#0xb
009e0f5c	mov x2,xzr
009e0f60	mov x3,xzr
009e0f64	bl 0x00c321a0
009e0f68	cmp w0,#0x0
009e0f6c	b.le 0x009e122c
009e0f70	ldr x8,[x19, #0x4b8]
009e0f74	ldr x8,[x8, #0x130]
009e0f78	cmp x8,x26
009e0f7c	b.ls 0x009e11c4
009e0f80	sub x8,x8,x25
009e0f84	ldr x9,[x19, #0x98]
009e0f88	mov x0,x19
009e0f8c	and x10,x9,#0xffffffff
009e0f90	cmp x10,x8
009e0f94	csel x21,x8,x9,hi
009e0f98	bl 0x00c344c0
009e0f9c	cmp x21,w0, UXTW 
009e0fa0	b.ls 0x009e0fb0
009e0fa4	mov x0,x19
009e0fa8	bl 0x00c344c0
009e0fac	mov w21,w0
009e0fb0	cmp w20,#0x16
009e0fb4	b.ne 0x009e1050
009e0fb8	subs x8,x21,#0xc
009e0fbc	b.cc 0x009e11c4
009e0fc0	ldr x9,[x19, #0x4b8]
009e0fc4	stp x23,x8,[x9, #0x150]
009e0fc8	ldr x8,[x19, #0x88]
009e0fcc	ldr x10,[x19, #0xa0]
009e0fd0	ldrb w11,[x9, #0x138]
009e0fd4	ldr x8,[x8, #0x8]
009e0fd8	add x8,x8,x10
009e0fdc	strb w11,[x8]
009e0fe0	ldr x10,[x9, #0x140]
009e0fe4	lsr x10,x10,#0x10
009e0fe8	strb w10,[x8, #0x1]
009e0fec	ldr x10,[x9, #0x140]
009e0ff0	lsr x10,x10,#0x8
009e0ff4	strb w10,[x8, #0x2]
009e0ff8	ldr x10,[x9, #0x140]
009e0ffc	strb w10,[x8, #0x3]
009e1000	ldrb w10,[x9, #0x149]
009e1004	strb w10,[x8, #0x4]
009e1008	ldrb w10,[x9, #0x148]
009e100c	strb w10,[x8, #0x5]
009e1010	ldr x10,[x9, #0x150]
009e1014	lsr x10,x10,#0x10
009e1018	strb w10,[x8, #0x6]
009e101c	ldr x10,[x9, #0x150]
009e1020	lsr x10,x10,#0x8
009e1024	strb w10,[x8, #0x7]
009e1028	ldr x10,[x9, #0x150]
009e102c	strb w10,[x8, #0x8]
009e1030	ldr x10,[x9, #0x158]
009e1034	lsr x10,x10,#0x10
009e1038	strb w10,[x8, #0x9]
009e103c	ldr x10,[x9, #0x158]
009e1040	lsr x10,x10,#0x8
009e1044	strb w10,[x8, #0xa]
009e1048	ldr x9,[x9, #0x158]
009e104c	strb w9,[x8, #0xb]
009e1050	ldr x8,[x19, #0x88]
009e1054	ldr x9,[x19, #0xa0]
009e1058	add x4,sp,#0x8
009e105c	mov x0,x19
009e1060	ldr x8,[x8, #0x8]
009e1064	mov w1,w20
009e1068	mov x3,x21
009e106c	add x2,x8,x9
009e1070	bl 0x00c34500
009e1074	cmp w0,#0x0
009e1078	b.le 0x009e110c
009e107c	ldr x8,[sp, #0x8]
009e1080	cmp x21,x8
009e1084	b.ne 0x009e11c4
009e1088	cmp w20,#0x16
009e108c	b.ne 0x009e10d4
009e1090	ldr x8,[x19, #0x4b8]
009e1094	ldr w9,[x8, #0x204]
009e1098	cbnz w9,0x009e10d4
009e109c	ldr x9,[x19, #0x88]
009e10a0	ldr x10,[x19, #0xa0]
009e10a4	ldr x9,[x9, #0x8]
009e10a8	add x1,x9,x10
009e10ac	cbnz x23,0x009e10bc
009e10b0	ldr w9,[x19]
009e10b4	cmp w9,#0x100
009e10b8	b.ne 0x009e115c
009e10bc	add x1,x1,#0xc
009e10c0	sub x2,x21,#0xc
009e10c4	mov x0,x19
009e10c8	bl 0x00c345b0
009e10cc	cbz w0,0x009e11c4
009e10d0	ldr x21,[sp, #0x8]
009e10d4	ldr x8,[x22]
009e10d8	subs x8,x8,x21
009e10dc	b.eq 0x009e11f0
009e10e0	ldr x9,[x19, #0xa0]
009e10e4	sub x10,x21,#0xc
009e10e8	add x23,x10,x23
009e10ec	add x9,x9,x21
009e10f0	stp x8,x9,[x19, #0x98]
009e10f4	str x10,[sp, #0x8]
009e10f8	ldr x9,[x19, #0x4b8]
009e10fc	stp x23,xzr,[x9, #0x150]
009e1100	mov w0,wzr
009e1104	cbnz x8,0x009e0eec
009e1108	b 0x009e11c8
009e110c	cbz w28,0x009e11c4
009e1110	mov x0,x19
009e1114	bl 0x00c34310
009e1118	mov w1,#0x2b
009e111c	mov x2,xzr
009e1120	mov x3,xzr
009e1124	bl 0x00c321a0
009e1128	cmp x0,#0x1
009e112c	b.lt 0x009e11c4
009e1130	mov x0,x19
009e1134	bl 0x00c342f0
009e1138	tbnz w0,#0xc,0x009e11c4
009e113c	mov x0,x19
009e1140	bl 0x00c34130
009e1144	cbz w0,0x009e11c4
009e1148	ldr x8,[x22]
009e114c	mov w28,wzr
009e1150	mov w0,wzr
009e1154	cbnz x8,0x009e0eec
009e1158	b 0x009e11c8
009e115c	ldrb w9,[x8, #0x138]
009e1160	strb w9,[x1]
009e1164	ldr x9,[x8, #0x140]
009e1168	lsr x9,x9,#0x10
009e116c	strb w9,[x1, #0x1]
009e1170	ldr x9,[x8, #0x140]
009e1174	lsr x9,x9,#0x8
009e1178	strb w9,[x1, #0x2]
009e117c	ldr x9,[x8, #0x140]
009e1180	strb w9,[x1, #0x3]
009e1184	ldrb w9,[x8, #0x149]
009e1188	strb w9,[x1, #0x4]
009e118c	ldrb w9,[x8, #0x148]
009e1190	strh wzr,[x1, #0x6]
009e1194	strb wzr,[x1, #0x8]
009e1198	strb w9,[x1, #0x5]
009e119c	ldr x9,[x8, #0x140]
009e11a0	lsr x9,x9,#0x10
009e11a4	strb w9,[x1, #0x9]
009e11a8	ldr x9,[x8, #0x140]
009e11ac	lsr x9,x9,#0x8
009e11b0	strb w9,[x1, #0xa]
009e11b4	ldr x8,[x8, #0x140]
009e11b8	strb w8,[x1, #0xb]
009e11bc	ldr x2,[sp, #0x8]
009e11c0	b 0x009e10c4
009e11c4	mov w0,#0xffffffff
009e11c8	ldp x29,x30,[sp, #0x60]
009e11cc	ldp x20,x19,[sp, #0x50]
009e11d0	ldp x22,x21,[sp, #0x40]
009e11d4	ldp x24,x23,[sp, #0x30]
009e11d8	ldp x26,x25,[sp, #0x20]
009e11dc	ldp x28,x27,[sp, #0x10]
009e11e0	add sp,sp,#0x70
009e11e4	ret
009e11e8	mov w0,wzr
009e11ec	b 0x009e11c8
009e11f0	ldr x8,[x19, #0x4c0]
009e11f4	cbz x8,0x009e1220
009e11f8	ldr x9,[x19, #0x88]
009e11fc	ldr x10,[x19, #0xa0]
009e1200	ldr w1,[x19]
009e1204	ldr x6,[x19, #0x4c8]
009e1208	ldr x3,[x9, #0x8]
009e120c	add x4,x10,x21
009e1210	mov w0,#0x1
009e1214	mov w2,w20
009e1218	mov x5,x19
009e121c	blr x8
009e1220	stp xzr,xzr,[x22]
009e1224	mov w0,#0x1
009e1228	b 0x009e11c8
009e122c	mov w8,#0x2
009e1230	str w8,[x19, #0x28]
009e1234	b 0x009e11c8
