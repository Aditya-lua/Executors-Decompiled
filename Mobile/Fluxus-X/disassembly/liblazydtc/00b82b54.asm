; mbedtls_mpi_self_test @ 00b82b54
00b82b54	sub sp,sp,#0xe0
00b82b58	str x27,[sp, #0x80]
00b82b5c	stp x26,x25,[sp, #0x90]
00b82b60	stp x24,x23,[sp, #0xa0]
00b82b64	stp x22,x21,[sp, #0xb0]
00b82b68	stp x20,x19,[sp, #0xc0]
00b82b6c	stp x29,x30,[sp, #0xd0]
00b82b70	add x29,sp,#0xd0
00b82b74	mrs x24,tpidr_el0
00b82b78	ldr x8,[x24, #0x28]
00b82b7c	adrp x2,0x2c8000
00b82b80	mov w19,w0
00b82b84	add x2,x2,#0x813
00b82b88	stur x8,[x29, #-0x58]
00b82b8c	mov w8,#0x1
00b82b90	add x0,sp,#0x68
00b82b94	mov w1,#0x10
00b82b98	str w8,[sp, #0x70]
00b82b9c	str xzr,[sp, #0x68]
00b82ba0	str w8,[sp, #0x60]
00b82ba4	str xzr,[sp, #0x58]
00b82ba8	str w8,[sp, #0x50]
00b82bac	str xzr,[sp, #0x48]
00b82bb0	str w8,[sp, #0x40]
00b82bb4	str xzr,[sp, #0x38]
00b82bb8	str w8,[sp, #0x30]
00b82bbc	str xzr,[sp, #0x28]
00b82bc0	str w8,[sp, #0x20]
00b82bc4	str xzr,[sp, #0x18]
00b82bc8	str w8,[sp, #0x10]
00b82bcc	str xzr,[sp, #0x8]
00b82bd0	bl 0x00c41cc0
00b82bd4	mov w20,w0
00b82bd8	cbnz w0,0x00b82c48
00b82bdc	adrp x2,0x2c6000
00b82be0	add x2,x2,#0x84c
00b82be4	add x0,sp,#0x58
00b82be8	mov w1,#0x10
00b82bec	bl 0x00c41cc0
00b82bf0	mov w20,w0
00b82bf4	cbnz w0,0x00b82c48
00b82bf8	adrp x2,0x2dd000
00b82bfc	add x2,x2,#0x9d
00b82c00	add x0,sp,#0x48
00b82c04	mov w1,#0x10
00b82c08	bl 0x00c41cc0
00b82c0c	mov w20,w0
00b82c10	cbnz w0,0x00b82c48
00b82c14	add x0,sp,#0x38
00b82c18	add x1,sp,#0x68
00b82c1c	add x2,sp,#0x48
00b82c20	bl 0x00c41c80
00b82c24	mov w20,w0
00b82c28	cbnz w0,0x00b82c48
00b82c2c	adrp x2,0x2c0000
00b82c30	add x2,x2,#0xa23
00b82c34	add x0,sp,#0x18
00b82c38	mov w1,#0x10
00b82c3c	bl 0x00c41cc0
00b82c40	mov w20,w0
00b82c44	cbz w0,0x00b82d80
00b82c48	cmp w19,#0x0
00b82c4c	cset w21,ne
00b82c50	cbz w19,0x00b82c6c
00b82c54	cbz w20,0x00b82c6c
00b82c58	adrp x0,0x2bc000
00b82c5c	add x0,x0,#0xb0a
00b82c60	mov w1,w20
00b82c64	bl 0x00c41af0
00b82c68	mov w21,#0x1
00b82c6c	ldr x0,[sp, #0x68]
00b82c70	cbz x0,0x00b82c80
00b82c74	ldrh w8,[sp, #0x72]
00b82c78	lsl x1,x8,#0x3
00b82c7c	bl 0x00c42230
00b82c80	ldr x0,[sp, #0x58]
00b82c84	mov w19,#0x1
00b82c88	str w19,[sp, #0x70]
00b82c8c	str xzr,[sp, #0x68]
00b82c90	cbz x0,0x00b82ca0
00b82c94	ldrh w8,[sp, #0x62]
00b82c98	lsl x1,x8,#0x3
00b82c9c	bl 0x00c42230
00b82ca0	ldr x0,[sp, #0x48]
00b82ca4	str w19,[sp, #0x60]
00b82ca8	str xzr,[sp, #0x58]
00b82cac	cbz x0,0x00b82cbc
00b82cb0	ldrh w8,[sp, #0x52]
00b82cb4	lsl x1,x8,#0x3
00b82cb8	bl 0x00c42230
00b82cbc	ldr x0,[sp, #0x38]
00b82cc0	mov w19,#0x1
00b82cc4	str w19,[sp, #0x50]
00b82cc8	str xzr,[sp, #0x48]
00b82ccc	cbz x0,0x00b82cdc
00b82cd0	ldrh w8,[sp, #0x42]
00b82cd4	lsl x1,x8,#0x3
00b82cd8	bl 0x00c42230
00b82cdc	ldr x0,[sp, #0x28]
00b82ce0	str w19,[sp, #0x40]
00b82ce4	str xzr,[sp, #0x38]
00b82ce8	cbz x0,0x00b82cf8
00b82cec	ldrh w8,[sp, #0x32]
00b82cf0	lsl x1,x8,#0x3
00b82cf4	bl 0x00c42230
00b82cf8	ldr x0,[sp, #0x18]
00b82cfc	mov w19,#0x1
00b82d00	str w19,[sp, #0x30]
00b82d04	str xzr,[sp, #0x28]
00b82d08	cbz x0,0x00b82d18
00b82d0c	ldrh w8,[sp, #0x22]
00b82d10	lsl x1,x8,#0x3
00b82d14	bl 0x00c42230
00b82d18	ldr x0,[sp, #0x8]
00b82d1c	str w19,[sp, #0x20]
00b82d20	str xzr,[sp, #0x18]
00b82d24	cbz x0,0x00b82d34
00b82d28	ldrh w8,[sp, #0x12]
00b82d2c	lsl x1,x8,#0x3
00b82d30	bl 0x00c42230
00b82d34	mov w8,#0x1
00b82d38	str w8,[sp, #0x10]
00b82d3c	str xzr,[sp, #0x8]
00b82d40	cbz w21,0x00b82d4c
00b82d44	mov w0,#0xa
00b82d48	bl 0x00c42240
00b82d4c	ldr x8,[x24, #0x28]
00b82d50	ldur x9,[x29, #-0x58]
00b82d54	cmp x8,x9
00b82d58	b.ne 0x00b835e0
00b82d5c	mov w0,w20
00b82d60	ldp x29,x30,[sp, #0xd0]
00b82d64	ldp x20,x19,[sp, #0xc0]
00b82d68	ldp x22,x21,[sp, #0xb0]
00b82d6c	ldp x24,x23,[sp, #0xa0]
00b82d70	ldp x26,x25,[sp, #0x90]
00b82d74	ldr x27,[sp, #0x80]
00b82d78	add sp,sp,#0xe0
00b82d7c	ret
00b82d80	cbz w19,0x00b82d90
00b82d84	adrp x0,0x2a3000
00b82d88	add x0,x0,#0x38d
00b82d8c	bl 0x00c41af0
00b82d90	ldrh w9,[sp, #0x42]
00b82d94	ldr x8,[sp, #0x38]
00b82d98	sub x9,x9,#0x1
00b82d9c	cmn x9,#0x1
00b82da0	b.eq 0x00b82db8
00b82da4	ldr x10,[x8, x9, LSL #0x3]
00b82da8	sub x9,x9,#0x1
00b82dac	cbz x10,0x00b82d9c
00b82db0	add x9,x9,#0x2
00b82db4	b 0x00b82dbc
00b82db8	mov x9,xzr
00b82dbc	ldrh w11,[sp, #0x22]
00b82dc0	ldr x10,[sp, #0x18]
00b82dc4	sub x11,x11,#0x1
00b82dc8	cmn x11,#0x1
00b82dcc	b.eq 0x00b82dec
00b82dd0	ldr x12,[x10, x11, LSL #0x3]
00b82dd4	sub x11,x11,#0x1
00b82dd8	cbz x12,0x00b82dc8
00b82ddc	add x11,x11,#0x2
00b82de0	orr x12,x11,x9
00b82de4	cbnz x12,0x00b82df8
00b82de8	b 0x00b82e7c
00b82dec	mov x11,xzr
00b82df0	orr x12,x11,x9
00b82df4	cbz x12,0x00b82e7c
00b82df8	cmp x9,x11
00b82dfc	b.ls 0x00b82e0c
00b82e00	ldrsh w11,[sp, #0x40]
00b82e04	cbnz w11,0x00b82e20
00b82e08	b 0x00b82e7c
00b82e0c	cmp x11,x9
00b82e10	b.ls 0x00b82e38
00b82e14	ldrsh w8,[sp, #0x20]
00b82e18	neg w11,w8
00b82e1c	cbz w11,0x00b82e7c
00b82e20	cbz w19,0x00b83558
00b82e24	adrp x0,0x77c000
00b82e28	add x0,x0,#0x854
00b82e2c	bl 0x00c30760
00b82e30	mov w20,#0x1
00b82e34	b 0x00b82c48
00b82e38	ldrsh w11,[sp, #0x40]
00b82e3c	ldrsh w12,[sp, #0x20]
00b82e40	cmp w11,#0x1
00b82e44	b.lt 0x00b82f18
00b82e48	tbnz w12,#0x1f,0x00b82e20
00b82e4c	cbz x9,0x00b82e7c
00b82e50	lsl x12,x9,#0x3
00b82e54	add x13,x8,x12
00b82e58	add x12,x10,x12
00b82e5c	ldur x13,[x13, #-0x8]
00b82e60	ldur x12,[x12, #-0x8]
00b82e64	sub x9,x9,#0x1
00b82e68	cmp x13,x12
00b82e6c	b.hi 0x00b82e1c
00b82e70	b.cs 0x00b82e4c
00b82e74	neg w11,w11
00b82e78	cbnz w11,0x00b82e20
00b82e7c	cbz w19,0x00b82e8c
00b82e80	adrp x0,0x77c000
00b82e84	add x0,x0,#0x87c
00b82e88	bl 0x00c30760
00b82e8c	add x0,sp,#0x38
00b82e90	add x1,sp,#0x28
00b82e94	add x2,sp,#0x68
00b82e98	add x3,sp,#0x48
00b82e9c	bl 0x00c41b70
00b82ea0	mov w20,w0
00b82ea4	cbnz w0,0x00b82c48
00b82ea8	adrp x2,0x2ac000
00b82eac	add x2,x2,#0xc35
00b82eb0	add x0,sp,#0x18
00b82eb4	mov w1,#0x10
00b82eb8	bl 0x00c41cc0
00b82ebc	mov w20,w0
00b82ec0	cbnz w0,0x00b82c48
00b82ec4	adrp x2,0x2ac000
00b82ec8	add x2,x2,#0xc59
00b82ecc	add x0,sp,#0x8
00b82ed0	mov w1,#0x10
00b82ed4	bl 0x00c41cc0
00b82ed8	mov w20,w0
00b82edc	cbnz w0,0x00b82c48
00b82ee0	cbz w19,0x00b82ef0
00b82ee4	adrp x0,0x2b8000
00b82ee8	add x0,x0,#0xc00
00b82eec	bl 0x00c41af0
00b82ef0	ldrh w9,[sp, #0x42]
00b82ef4	ldr x8,[sp, #0x38]
00b82ef8	sub x9,x9,#0x1
00b82efc	cmn x9,#0x1
00b82f00	b.eq 0x00b82f28
00b82f04	ldr x10,[x8, x9, LSL #0x3]
00b82f08	sub x9,x9,#0x1
00b82f0c	cbz x10,0x00b82efc
00b82f10	add x9,x9,#0x2
00b82f14	b 0x00b82f2c
00b82f18	cbz w11,0x00b82e4c
00b82f1c	cmp w12,#0x0
00b82f20	b.gt 0x00b82e20
00b82f24	b 0x00b82e4c
00b82f28	mov x9,xzr
00b82f2c	ldrh w11,[sp, #0x22]
00b82f30	ldr x10,[sp, #0x18]
00b82f34	sub x11,x11,#0x1
00b82f38	cmn x11,#0x1
00b82f3c	b.eq 0x00b82f5c
00b82f40	ldr x12,[x10, x11, LSL #0x3]
00b82f44	sub x11,x11,#0x1
00b82f48	cbz x12,0x00b82f38
00b82f4c	add x11,x11,#0x2
00b82f50	orr x12,x11,x9
00b82f54	cbnz x12,0x00b82f68
00b82f58	b 0x00b82f90
00b82f5c	mov x11,xzr
00b82f60	orr x12,x11,x9
00b82f64	cbz x12,0x00b82f90
00b82f68	cmp x9,x11
00b82f6c	b.ls 0x00b82f7c
00b82f70	ldrsh w11,[sp, #0x40]
00b82f74	cbnz w11,0x00b82e20
00b82f78	b 0x00b82f90
00b82f7c	cmp x11,x9
00b82f80	b.ls 0x00b830a8
00b82f84	ldrsh w8,[sp, #0x20]
00b82f88	neg w11,w8
00b82f8c	cbnz w11,0x00b82e20
00b82f90	ldrh w9,[sp, #0x32]
00b82f94	ldr x8,[sp, #0x28]
00b82f98	sub x9,x9,#0x1
00b82f9c	cmn x9,#0x1
00b82fa0	b.eq 0x00b82fb8
00b82fa4	ldr x10,[x8, x9, LSL #0x3]
00b82fa8	sub x9,x9,#0x1
00b82fac	cbz x10,0x00b82f9c
00b82fb0	add x9,x9,#0x2
00b82fb4	b 0x00b82fbc
00b82fb8	mov x9,xzr
00b82fbc	ldrh w11,[sp, #0x12]
00b82fc0	ldr x10,[sp, #0x8]
00b82fc4	sub x11,x11,#0x1
00b82fc8	cmn x11,#0x1
00b82fcc	b.eq 0x00b82fec
00b82fd0	ldr x12,[x10, x11, LSL #0x3]
00b82fd4	sub x11,x11,#0x1
00b82fd8	cbz x12,0x00b82fc8
00b82fdc	add x11,x11,#0x2
00b82fe0	orr x12,x11,x9
00b82fe4	cbnz x12,0x00b82ff8
00b82fe8	b 0x00b83020
00b82fec	mov x11,xzr
00b82ff0	orr x12,x11,x9
00b82ff4	cbz x12,0x00b83020
00b82ff8	cmp x9,x11
00b82ffc	b.ls 0x00b8300c
00b83000	ldrsh w11,[sp, #0x30]
00b83004	cbnz w11,0x00b82e20
00b83008	b 0x00b83020
00b8300c	cmp x11,x9
00b83010	b.ls 0x00b830f0
00b83014	ldrsh w8,[sp, #0x10]
00b83018	neg w11,w8
00b8301c	cbnz w11,0x00b82e20
00b83020	cbz w19,0x00b83030
00b83024	adrp x0,0x77c000
00b83028	add x0,x0,#0x87c
00b8302c	bl 0x00c30760
00b83030	add x0,sp,#0x38
00b83034	add x1,sp,#0x68
00b83038	add x2,sp,#0x58
00b8303c	add x4,sp,#0x48
00b83040	mov w3,wzr
00b83044	mov x5,xzr
00b83048	bl 0x00b80638
00b8304c	mov w20,w0
00b83050	cbnz w0,0x00b82c48
00b83054	adrp x2,0x2a6000
00b83058	add x2,x2,#0xd88
00b8305c	add x0,sp,#0x18
00b83060	mov w1,#0x10
00b83064	bl 0x00c41cc0
00b83068	mov w20,w0
00b8306c	cbnz w0,0x00b82c48
00b83070	cbz w19,0x00b83080
00b83074	adrp x0,0x2ac000
00b83078	add x0,x0,#0xcb8
00b8307c	bl 0x00c41af0
00b83080	ldrh w9,[sp, #0x42]
00b83084	ldr x8,[sp, #0x38]
00b83088	sub x9,x9,#0x1
00b8308c	cmn x9,#0x1
00b83090	b.eq 0x00b83158
00b83094	ldr x10,[x8, x9, LSL #0x3]
00b83098	sub x9,x9,#0x1
00b8309c	cbz x10,0x00b8308c
00b830a0	add x9,x9,#0x2
00b830a4	b 0x00b8315c
00b830a8	ldrsh w11,[sp, #0x40]
00b830ac	ldrsh w12,[sp, #0x20]
00b830b0	cmp w11,#0x1
00b830b4	b.lt 0x00b83138
00b830b8	tbnz w12,#0x1f,0x00b82e20
00b830bc	cbz x9,0x00b82f90
00b830c0	lsl x12,x9,#0x3
00b830c4	add x13,x8,x12
00b830c8	add x12,x10,x12
00b830cc	ldur x13,[x13, #-0x8]
00b830d0	ldur x12,[x12, #-0x8]
00b830d4	sub x9,x9,#0x1
00b830d8	cmp x13,x12
00b830dc	b.hi 0x00b82f8c
00b830e0	b.cs 0x00b830bc
00b830e4	neg w11,w11
00b830e8	cbnz w11,0x00b82e20
00b830ec	b 0x00b82f90
00b830f0	ldrsh w11,[sp, #0x30]
00b830f4	ldrsh w12,[sp, #0x10]
00b830f8	cmp w11,#0x1
00b830fc	b.lt 0x00b83148
00b83100	tbnz w12,#0x1f,0x00b82e20
00b83104	cbz x9,0x00b83020
00b83108	lsl x12,x9,#0x3
00b8310c	add x13,x8,x12
00b83110	add x12,x10,x12
00b83114	ldur x13,[x13, #-0x8]
00b83118	ldur x12,[x12, #-0x8]
00b8311c	sub x9,x9,#0x1
00b83120	cmp x13,x12
00b83124	b.hi 0x00b8301c
00b83128	b.cs 0x00b83104
00b8312c	neg w11,w11
00b83130	cbnz w11,0x00b82e20
00b83134	b 0x00b83020
00b83138	cbz w11,0x00b830bc
00b8313c	cmp w12,#0x0
00b83140	b.gt 0x00b82e20
00b83144	b 0x00b830bc
00b83148	cbz w11,0x00b83104
00b8314c	cmp w12,#0x0
00b83150	b.gt 0x00b82e20
00b83154	b 0x00b83104
00b83158	mov x9,xzr
00b8315c	ldrh w11,[sp, #0x22]
00b83160	ldr x10,[sp, #0x18]
00b83164	sub x11,x11,#0x1
00b83168	cmn x11,#0x1
00b8316c	b.eq 0x00b8318c
00b83170	ldr x12,[x10, x11, LSL #0x3]
00b83174	sub x11,x11,#0x1
00b83178	cbz x12,0x00b83168
00b8317c	add x11,x11,#0x2
00b83180	orr x12,x11,x9
00b83184	cbnz x12,0x00b83198
00b83188	b 0x00b831c0
00b8318c	mov x11,xzr
00b83190	orr x12,x11,x9
00b83194	cbz x12,0x00b831c0
00b83198	cmp x9,x11
00b8319c	b.ls 0x00b831ac
00b831a0	ldrsh w11,[sp, #0x40]
00b831a4	cbnz w11,0x00b82e20
00b831a8	b 0x00b831c0
00b831ac	cmp x11,x9
00b831b0	b.ls 0x00b8323c
00b831b4	ldrsh w8,[sp, #0x20]
00b831b8	neg w11,w8
00b831bc	cbnz w11,0x00b82e20
00b831c0	cbz w19,0x00b831d0
00b831c4	adrp x0,0x77c000
00b831c8	add x0,x0,#0x87c
00b831cc	bl 0x00c30760
00b831d0	add x0,sp,#0x38
00b831d4	add x1,sp,#0x68
00b831d8	add x2,sp,#0x48
00b831dc	bl 0x00c41c10
00b831e0	mov w20,w0
00b831e4	cbnz w0,0x00b82c48
00b831e8	adrp x2,0x2ae000
00b831ec	add x2,x2,#0xc7b
00b831f0	add x0,sp,#0x18
00b831f4	mov w1,#0x10
00b831f8	bl 0x00c41cc0
00b831fc	mov w20,w0
00b83200	cbnz w0,0x00b82c48
00b83204	cbz w19,0x00b83214
00b83208	adrp x0,0x2a1000
00b8320c	add x0,x0,#0x1e0
00b83210	bl 0x00c41af0
00b83214	ldrh w9,[sp, #0x42]
00b83218	ldr x8,[sp, #0x38]
00b8321c	sub x9,x9,#0x1
00b83220	cmn x9,#0x1
00b83224	b.eq 0x00b83294
00b83228	ldr x10,[x8, x9, LSL #0x3]
00b8322c	sub x9,x9,#0x1
00b83230	cbz x10,0x00b83220
00b83234	add x9,x9,#0x2
00b83238	b 0x00b83298
00b8323c	ldrsh w11,[sp, #0x40]
00b83240	ldrsh w12,[sp, #0x20]
00b83244	cmp w11,#0x1
00b83248	b.lt 0x00b83284
00b8324c	tbnz w12,#0x1f,0x00b82e20
00b83250	cbz x9,0x00b831c0
00b83254	lsl x12,x9,#0x3
00b83258	add x13,x8,x12
00b8325c	add x12,x10,x12
00b83260	ldur x13,[x13, #-0x8]
00b83264	ldur x12,[x12, #-0x8]
00b83268	sub x9,x9,#0x1
00b8326c	cmp x13,x12
00b83270	b.hi 0x00b831bc
00b83274	b.cs 0x00b83250
00b83278	neg w11,w11
00b8327c	cbnz w11,0x00b82e20
00b83280	b 0x00b831c0
00b83284	cbz w11,0x00b83250
00b83288	cmp w12,#0x0
00b8328c	b.gt 0x00b82e20
00b83290	b 0x00b83250
00b83294	mov x9,xzr
00b83298	ldrh w11,[sp, #0x22]
00b8329c	ldr x10,[sp, #0x18]
00b832a0	sub x11,x11,#0x1
00b832a4	cmn x11,#0x1
00b832a8	b.eq 0x00b832c8
00b832ac	ldr x12,[x10, x11, LSL #0x3]
00b832b0	sub x11,x11,#0x1
00b832b4	cbz x12,0x00b832a4
00b832b8	add x11,x11,#0x2
00b832bc	orr x12,x11,x9
00b832c0	cbnz x12,0x00b832d4
00b832c4	b 0x00b832fc
00b832c8	mov x11,xzr
00b832cc	orr x12,x11,x9
00b832d0	cbz x12,0x00b832fc
00b832d4	cmp x9,x11
00b832d8	b.ls 0x00b832e8
00b832dc	ldrsh w11,[sp, #0x40]
00b832e0	cbnz w11,0x00b82e20
00b832e4	b 0x00b832fc
00b832e8	cmp x11,x9
00b832ec	b.ls 0x00b8356c
00b832f0	ldrsh w8,[sp, #0x20]
00b832f4	neg w11,w8
00b832f8	cbnz w11,0x00b82e20
00b832fc	cbz w19,0x00b83318
00b83300	adrp x0,0x77c000
00b83304	add x0,x0,#0x87c
00b83308	bl 0x00c30760
00b8330c	adrp x0,0x2d8000
00b83310	add x0,x0,#0xd0c
00b83314	bl 0x00c41af0
00b83318	adrp x26,0x780000
00b8331c	mov x21,xzr
00b83320	orr w25,wzr,#0xc
00b83324	add x26,x26,#0x530
00b83328	mov w27,#0x1
00b8332c	ldrh w23,[sp, #0x42]
00b83330	cbz x23,0x00b83340
00b83334	ldr x20,[sp, #0x38]
00b83338	lsl x2,x23,#0x3
00b8333c	b 0x00b83388
00b83340	mov w0,#0x1
00b83344	mov w1,#0x8
00b83348	bl 0x00c30a30
00b8334c	mov x20,x0
00b83350	cbz x0,0x00b835b4
00b83354	ldr x22,[sp, #0x38]
00b83358	cbz x22,0x00b8337c
00b8335c	lsl x23,x23,#0x3
00b83360	mov x0,x20
00b83364	mov x1,x22
00b83368	mov x2,x23
00b8336c	bl 0x00c2ffd0
00b83370	mov x0,x22
00b83374	mov x1,x23
00b83378	bl 0x00c42230
00b8337c	mov w2,#0x8
00b83380	strh w27,[sp, #0x42]
00b83384	str x20,[sp, #0x38]
00b83388	mul x8,x21,x25
00b8338c	ldrsw x22,[x26, x8#0x0]
00b83390	mov x0,x20
00b83394	mov w1,wzr
00b83398	bl 0x00c301c0
00b8339c	ldr x8,[sp, #0x38]
00b833a0	cmp x22,#0x0
00b833a4	cneg x9,x22,mi
00b833a8	str x9,[x8]
00b833ac	ldrh w23,[sp, #0x32]
00b833b0	asr x8,x22,#0x3f
00b833b4	orr w8,w8,#0x1
00b833b8	strh w8,[sp, #0x40]
00b833bc	cbz x23,0x00b833cc
00b833c0	ldr x20,[sp, #0x28]
00b833c4	lsl x2,x23,#0x3
00b833c8	b 0x00b83418
00b833cc	mov w0,#0x1
00b833d0	mov w1,#0x8
00b833d4	bl 0x00c30a30
00b833d8	mov x20,x0
00b833dc	cbz x0,0x00b835b4
00b833e0	ldr x22,[sp, #0x28]
00b833e4	cbz x22,0x00b83408
00b833e8	lsl x23,x23,#0x3
00b833ec	mov x0,x20
00b833f0	mov x1,x22
00b833f4	mov x2,x23
00b833f8	bl 0x00c2ffd0
00b833fc	mov x0,x22
00b83400	mov x1,x23
00b83404	bl 0x00c42230
00b83408	mov w2,#0x8
00b8340c	strh w27,[sp, #0x32]
00b83410	str x20,[sp, #0x28]
00b83414	nop
00b83418	madd x8,x21,x25,x26
00b8341c	ldrsw x22,[x8, #0x4]
00b83420	mov x0,x20
00b83424	mov w1,wzr
00b83428	bl 0x00c301c0
00b8342c	ldr x8,[sp, #0x28]
00b83430	cmp x22,#0x0
00b83434	asr x9,x22,#0x3f
00b83438	cneg x10,x22,mi
00b8343c	orr w9,w9,#0x1
00b83440	add x0,sp,#0x68
00b83444	add x1,sp,#0x38
00b83448	add x2,sp,#0x28
00b8344c	str x10,[x8]
00b83450	strh w9,[sp, #0x30]
00b83454	bl 0x00c41bc0
00b83458	mov w20,w0
00b8345c	cbnz w0,0x00b82c48
00b83460	madd x8,x21,x25,x26
00b83464	ldrsw x9,[x8, #0x8]
00b83468	ldrh w10,[sp, #0x72]
00b8346c	ldr x8,[sp, #0x68]
00b83470	cmp x9,#0x0
00b83474	asr x11,x9,#0x3f
00b83478	cneg x9,x9,mi
00b8347c	orr w11,w11,#0x1
00b83480	sub x10,x10,#0x1
00b83484	cmn x10,#0x1
00b83488	b.eq 0x00b834a0
00b8348c	ldr x12,[x8, x10, LSL #0x3]
00b83490	sub x10,x10,#0x1
00b83494	cbz x12,0x00b83484
00b83498	add x10,x10,#0x2
00b8349c	b 0x00b834a4
00b834a0	mov x10,xzr
00b834a4	mov w12,#0x2
00b834a8	subs x12,x12,#0x1
00b834ac	b.eq 0x00b834b4
00b834b0	cbz x9,0x00b834a8
00b834b4	orr x13,x12,x10
00b834b8	cbz x13,0x00b8351c
00b834bc	cmp x10,x12
00b834c0	b.ls 0x00b834d0
00b834c4	ldrsh w12,[sp, #0x70]
00b834c8	cbz w12,0x00b8351c
00b834cc	b 0x00b83540
00b834d0	cmp x12,x10
00b834d4	b.hi 0x00b83540
00b834d8	ldrsh w12,[sp, #0x70]
00b834dc	cmp w12,#0x1
00b834e0	b.lt 0x00b834ec
00b834e4	tbz w11,#0x1f,0x00b834f8
00b834e8	b 0x00b83540
00b834ec	cmp w11,#0x1
00b834f0	b.lt 0x00b834f8
00b834f4	cbnz w12,0x00b83540
00b834f8	cbz x10,0x00b8351c
00b834fc	add x11,x8,x10, LSL #0x3
00b83500	ldur x11,[x11, #-0x8]
00b83504	sub x10,x10,#0x1
00b83508	cmp x11,x9
00b8350c	b.hi 0x00b83518
00b83510	b.cs 0x00b834f8
00b83514	neg w12,w12
00b83518	cbnz w12,0x00b83540
00b8351c	add x21,x21,#0x1
00b83520	cmp x21,#0x3
00b83524	b.cc 0x00b8332c
00b83528	cbz w19,0x00b835cc
00b8352c	adrp x0,0x77c000
00b83530	add x0,x0,#0x87c
00b83534	bl 0x00c30760
00b83538	mov w20,wzr
00b8353c	b 0x00b82c68
00b83540	cbz w19,0x00b83558
00b83544	adrp x0,0x2c6000
00b83548	add x0,x0,#0x8cd
00b8354c	mov w1,w21
00b83550	bl 0x00c41af0
00b83554	b 0x00b82e30
00b83558	mov w21,wzr
00b8355c	mov w20,#0x1
00b83560	ldr x0,[sp, #0x68]
00b83564	cbnz x0,0x00b82c74
00b83568	b 0x00b82c80
00b8356c	ldrsh w11,[sp, #0x40]
00b83570	ldrsh w12,[sp, #0x20]
00b83574	cmp w11,#0x1
00b83578	b.lt 0x00b835bc
00b8357c	tbnz w12,#0x1f,0x00b82e20
00b83580	cbz x9,0x00b832fc
00b83584	lsl x12,x9,#0x3
00b83588	add x13,x8,x12
00b8358c	add x12,x10,x12
00b83590	ldur x13,[x13, #-0x8]
00b83594	ldur x12,[x12, #-0x8]
00b83598	sub x9,x9,#0x1
00b8359c	cmp x13,x12
00b835a0	b.hi 0x00b832f8
00b835a4	b.cs 0x00b83580
00b835a8	neg w11,w11
00b835ac	cbnz w11,0x00b82e20
00b835b0	b 0x00b832fc
00b835b4	orr w20,wzr,#0xfffffff0
00b835b8	b 0x00b82c48
00b835bc	cbz w11,0x00b83580
00b835c0	cmp w12,#0x0
00b835c4	b.gt 0x00b82e20
00b835c8	b 0x00b83580
00b835cc	mov w21,wzr
00b835d0	mov w20,wzr
00b835d4	ldr x0,[sp, #0x68]
00b835d8	cbnz x0,0x00b82c74
00b835dc	b 0x00b82c80
00b835e0	bl 0x00c2fec0
