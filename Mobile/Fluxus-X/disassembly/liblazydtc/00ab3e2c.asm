; PEM_X509_INFO_read_bio_ex @ 00ab3e2c
00ab3e2c	sub sp,sp,#0xc0
00ab3e30	stp x26,x25,[sp, #0x70]
00ab3e34	stp x24,x23,[sp, #0x80]
00ab3e38	stp x22,x21,[sp, #0x90]
00ab3e3c	stp x20,x19,[sp, #0xa0]
00ab3e40	mov x22,x5
00ab3e44	mov x23,x4
00ab3e48	mov x24,x3
00ab3e4c	mov x25,x2
00ab3e50	mov x20,x1
00ab3e54	mov x26,x0
00ab3e58	mov x19,x1
00ab3e5c	stp x28,x27,[sp, #0x60]
00ab3e60	stp x29,x30,[sp, #0xb0]
00ab3e64	add x29,sp,#0xb0
00ab3e68	stp xzr,xzr,[sp, #0x50]
00ab3e6c	str xzr,[sp, #0x48]
00ab3e70	cbnz x1,0x00ab3e80
00ab3e74	bl 0x00c34780
00ab3e78	mov x19,x0
00ab3e7c	cbz x0,0x00ab41a8
00ab3e80	bl 0x00c382c0
00ab3e84	mov x21,x0
00ab3e88	cbz x0,0x00ab41e4
00ab3e8c	bl 0x00c35250
00ab3e90	add x1,sp,#0x58
00ab3e94	add x2,sp,#0x50
00ab3e98	add x3,sp,#0x48
00ab3e9c	add x4,sp,#0x38
00ab3ea0	mov x0,x26
00ab3ea4	bl 0x00c35f90
00ab3ea8	cbz w0,0x00ab4148
00ab3eac	stp x25,x24,[sp, #0x8]
00ab3eb0	adrp x27,0x2d0000
00ab3eb4	adrp x28,0x2c6000
00ab3eb8	adrp x24,0x2c0000
00ab3ebc	add x27,x27,#0x239
00ab3ec0	add x28,x28,#0xbc
00ab3ec4	add x24,x24,#0x3d5
00ab3ec8	str x22,[sp, #0x18]
00ab3ecc	bl 0x00c35ed0
00ab3ed0	ldr x25,[sp, #0x58]
00ab3ed4	mov x1,x27
00ab3ed8	mov x0,x25
00ab3edc	bl 0x00c301f0
00ab3ee0	cbz w0,0x00ab3f38
00ab3ee4	mov x0,x25
00ab3ee8	mov x1,x24
00ab3eec	bl 0x00c301f0
00ab3ef0	cbz w0,0x00ab3f38
00ab3ef4	mov x0,x25
00ab3ef8	mov x1,x28
00ab3efc	bl 0x00c301f0
00ab3f00	cbz w0,0x00ab3f38
00ab3f04	adrp x1,0x2bc000
00ab3f08	mov x0,x25
00ab3f0c	add x1,x1,#0x2e2
00ab3f10	bl 0x00c301f0
00ab3f14	cbz w0,0x00ab3f60
00ab3f18	adrp x1,0x2a2000
00ab3f1c	mov x0,x25
00ab3f20	add x1,x1,#0xb4c
00ab3f24	bl 0x00c30c40
00ab3f28	cbz x0,0x00ab40e4
00ab3f2c	ldr x8,[x21, #0x10]
00ab3f30	cbnz x8,0x00ab3f40
00ab3f34	b 0x00ab4038
00ab3f38	ldr x8,[x21]
00ab3f3c	cbz x8,0x00ab3f7c
00ab3f40	mov x0,x19
00ab3f44	mov x1,x21
00ab3f48	bl 0x00c347a0
00ab3f4c	cbz w0,0x00ab41e4
00ab3f50	bl 0x00c382c0
00ab3f54	mov x21,x0
00ab3f58	cbnz x0,0x00ab3ed0
00ab3f5c	b 0x00ab41e4
00ab3f60	ldr x8,[x21, #0x8]
00ab3f64	cbnz x8,0x00ab3f40
00ab3f68	adrp x8,0xcb5000
00ab3f6c	ldr x8,[x8, #0x6d0]
00ab3f70	mov w25,wzr
00ab3f74	add x22,x21,#0x8
00ab3f78	b 0x00ab3fc0
00ab3f7c	mov x0,x25
00ab3f80	mov x1,x28
00ab3f84	bl 0x00c301f0
00ab3f88	ldr x1,[sp, #0x18]
00ab3f8c	mov w22,w0
00ab3f90	mov x0,x23
00ab3f94	bl 0x00c350a0
00ab3f98	str x0,[x21]
00ab3f9c	cbz x0,0x00ab41e4
00ab3fa0	adrp x8,0xcb5000
00ab3fa4	adrp x9,0xcb5000
00ab3fa8	ldr x8,[x8, #0x1b8]
00ab3fac	ldr x9,[x9, #0x6c8]
00ab3fb0	cmp w22,#0x0
00ab3fb4	mov w25,wzr
00ab3fb8	mov x22,x21
00ab3fbc	csel x8,x9,x8,eq
00ab3fc0	str x8,[sp]
00ab3fc4	ldr x0,[sp, #0x50]
00ab3fc8	add x1,sp,#0x20
00ab3fcc	bl 0x00c3f1b0
00ab3fd0	cbz w0,0x00ab41e4
00ab3fd4	ldr x1,[sp, #0x48]
00ab3fd8	ldp x3,x4,[sp, #0x8]
00ab3fdc	add x0,sp,#0x20
00ab3fe0	add x2,sp,#0x38
00ab3fe4	bl 0x00c3f1a0
00ab3fe8	cbz w0,0x00ab41e4
00ab3fec	ldr x8,[sp, #0x48]
00ab3ff0	str x8,[sp, #0x40]
00ab3ff4	cbz w25,0x00ab401c
00ab3ff8	ldr x3,[sp, #0x38]
00ab3ffc	ldr x5,[sp, #0x18]
00ab4000	add x2,sp,#0x40
00ab4004	mov w0,w25
00ab4008	mov x1,x22
00ab400c	mov x4,x23
00ab4010	bl 0x00c35ff0
00ab4014	cbnz x0,0x00ab40e4
00ab4018	b 0x00ab4294
00ab401c	ldr x2,[sp, #0x38]
00ab4020	ldr x8,[sp]
00ab4024	add x1,sp,#0x40
00ab4028	mov x0,x22
00ab402c	blr x8
00ab4030	cbnz x0,0x00ab40e4
00ab4034	b 0x00ab42bc
00ab4038	mov x22,x0
00ab403c	cmp x0,x25
00ab4040	b.eq 0x00ab406c
00ab4044	adrp x1,0x2c6000
00ab4048	mov x0,x25
00ab404c	add x1,x1,#0xd0
00ab4050	bl 0x00c301f0
00ab4054	cbz w0,0x00ab406c
00ab4058	sturb wzr,[x22, #-0x1]
00ab405c	ldr x0,[sp, #0x58]
00ab4060	bl 0x00c3d9d0
00ab4064	mov w25,w0
00ab4068	b 0x00ab4070
00ab406c	mov w25,wzr
00ab4070	str xzr,[x21, #0x38]
00ab4074	str wzr,[x21, #0x30]
00ab4078	bl 0x00c382e0
00ab407c	str x0,[x21, #0x10]
00ab4080	cbz x0,0x00ab41e4
00ab4084	mov x22,x0
00ab4088	ldr x0,[sp, #0x50]
00ab408c	str x0,[sp]
00ab4090	bl 0x00c2ff50
00ab4094	cmp w0,#0xa
00ab4098	b.gt 0x00ab40c0
00ab409c	ldr x0,[sp, #0x58]
00ab40a0	adrp x1,0x2c6000
00ab40a4	add x1,x1,#0xd0
00ab40a8	bl 0x00c301f0
00ab40ac	cbz w0,0x00ab40c0
00ab40b0	adrp x8,0xcb5000
00ab40b4	ldr x8,[x8, #0x340]
00ab40b8	add x22,x22,#0x18
00ab40bc	b 0x00ab3fc0
00ab40c0	ldr x0,[sp]
00ab40c4	add x1,x21,#0x18
00ab40c8	bl 0x00c3f1b0
00ab40cc	cbz w0,0x00ab41e4
00ab40d0	ldr x8,[sp, #0x48]
00ab40d4	str x8,[x21, #0x38]
00ab40d8	ldr x8,[sp, #0x38]
00ab40dc	str w8,[x21, #0x30]
00ab40e0	str xzr,[sp, #0x48]
00ab40e4	ldr x0,[sp, #0x58]
00ab40e8	adrp x22,0x2c6000
00ab40ec	add x22,x22,#0xa6
00ab40f0	mov w2,#0xb4
00ab40f4	mov x1,x22
00ab40f8	bl 0x00c32310
00ab40fc	ldr x0,[sp, #0x50]
00ab4100	mov w2,#0xb6
00ab4104	mov x1,x22
00ab4108	str xzr,[sp, #0x58]
00ab410c	bl 0x00c32310
00ab4110	ldr x0,[sp, #0x48]
00ab4114	mov w2,#0xb8
00ab4118	mov x1,x22
00ab411c	str xzr,[sp, #0x50]
00ab4120	bl 0x00c32310
00ab4124	str xzr,[sp, #0x48]
00ab4128	bl 0x00c35250
00ab412c	add x1,sp,#0x58
00ab4130	add x2,sp,#0x50
00ab4134	add x3,sp,#0x48
00ab4138	add x4,sp,#0x38
00ab413c	mov x0,x26
00ab4140	bl 0x00c35f90
00ab4144	cbnz w0,0x00ab3ecc
00ab4148	bl 0x00c32420
00ab414c	asr w8,w0,#0x1f
00ab4150	and w8,w8,#0x7f800000
00ab4154	orr w8,w8,#0x7fffff
00ab4158	and w8,w8,w0
00ab415c	cmp w8,#0x6c
00ab4160	b.ne 0x00ab41e0
00ab4164	bl 0x00c35240
00ab4168	ldr x8,[x21]
00ab416c	cbnz x8,0x00ab4188
00ab4170	ldr x8,[x21, #0x8]
00ab4174	cbnz x8,0x00ab4188
00ab4178	ldr x8,[x21, #0x10]
00ab417c	cbnz x8,0x00ab4188
00ab4180	ldr x8,[x21, #0x38]
00ab4184	cbz x8,0x00ab42b0
00ab4188	mov x0,x19
00ab418c	mov x1,x21
00ab4190	bl 0x00c347a0
00ab4194	mov w8,w0
00ab4198	mov x0,xzr
00ab419c	cbz w8,0x00ab41e4
00ab41a0	bl 0x00c32b80
00ab41a4	b 0x00ab4238
00ab41a8	bl 0x00c342a0
00ab41ac	adrp x0,0x2c6000
00ab41b0	adrp x2,0x2c4000
00ab41b4	add x0,x0,#0xa6
00ab41b8	add x2,x2,#0xd0
00ab41bc	mov w1,#0x46
00ab41c0	bl 0x00c342b0
00ab41c4	mov w1,#0x100
00ab41c8	mov w0,#0x9
00ab41cc	movk w1,#0xc, LSL #16
00ab41d0	mov x2,xzr
00ab41d4	bl 0x00c342c0
00ab41d8	mov x21,xzr
00ab41dc	b 0x00ab41e4
00ab41e0	bl 0x00c35ed0
00ab41e4	mov x0,x21
00ab41e8	bl 0x00c32b80
00ab41ec	mov x0,x19
00ab41f0	bl 0x00c325e0
00ab41f4	cmp w0,#0x1
00ab41f8	b.lt 0x00ab4224
00ab41fc	mov w21,wzr
00ab4200	mov x0,x19
00ab4204	mov w1,w21
00ab4208	bl 0x00c32610
00ab420c	bl 0x00c32b80
00ab4210	mov x0,x19
00ab4214	add w21,w21,#0x1
00ab4218	bl 0x00c325e0
00ab421c	cmp w21,w0
00ab4220	b.lt 0x00ab4200
00ab4224	cmp x19,x20
00ab4228	b.eq 0x00ab4234
00ab422c	mov x0,x19
00ab4230	bl 0x00c34770
00ab4234	mov x19,xzr
00ab4238	ldr x0,[sp, #0x58]
00ab423c	adrp x20,0x2c6000
00ab4240	add x20,x20,#0xa6
00ab4244	mov w2,#0xd3
00ab4248	mov x1,x20
00ab424c	bl 0x00c32310
00ab4250	ldr x0,[sp, #0x50]
00ab4254	mov w2,#0xd4
00ab4258	mov x1,x20
00ab425c	bl 0x00c32310
00ab4260	ldr x0,[sp, #0x48]
00ab4264	mov w2,#0xd5
00ab4268	mov x1,x20
00ab426c	bl 0x00c32310
00ab4270	mov x0,x19
00ab4274	ldp x29,x30,[sp, #0xb0]
00ab4278	ldp x20,x19,[sp, #0xa0]
00ab427c	ldp x22,x21,[sp, #0x90]
00ab4280	ldp x24,x23,[sp, #0x80]
00ab4284	ldp x26,x25,[sp, #0x70]
00ab4288	ldp x28,x27,[sp, #0x60]
00ab428c	add sp,sp,#0xc0
00ab4290	ret
00ab4294	bl 0x00c342a0
00ab4298	adrp x0,0x2c6000
00ab429c	adrp x2,0x2c4000
00ab42a0	add x0,x0,#0xa6
00ab42a4	add x2,x2,#0xd0
00ab42a8	mov w1,#0xa5
00ab42ac	b 0x00ab42d4
00ab42b0	mov x0,x21
00ab42b4	bl 0x00c32b80
00ab42b8	b 0x00ab4238
00ab42bc	bl 0x00c342a0
00ab42c0	adrp x0,0x2c6000
00ab42c4	adrp x2,0x2c4000
00ab42c8	add x0,x0,#0xa6
00ab42cc	add x2,x2,#0xd0
00ab42d0	mov w1,#0xa9
00ab42d4	bl 0x00c342b0
00ab42d8	mov w1,#0xd
00ab42dc	mov w0,#0x9
00ab42e0	movk w1,#0x8, LSL #16
00ab42e4	mov x2,xzr
00ab42e8	bl 0x00c342c0
00ab42ec	b 0x00ab41e4
