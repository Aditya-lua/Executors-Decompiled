; FUN_00b94e7c @ 00b94e7c
00b94e7c	sub sp,sp,#0x80
00b94e80	stp x28,x27,[sp, #0x20]
00b94e84	stp x26,x25,[sp, #0x30]
00b94e88	stp x24,x23,[sp, #0x40]
00b94e8c	stp x22,x21,[sp, #0x50]
00b94e90	stp x20,x19,[sp, #0x60]
00b94e94	stp x29,x30,[sp, #0x70]
00b94e98	add x29,sp,#0x70
00b94e9c	adrp x27,0xd26000
00b94ea0	adrp x28,0xd26000
00b94ea4	adrp x26,0xd26000
00b94ea8	str xzr,[x27, #0x18]
00b94eac	str xzr,[x28, #0x10]
00b94eb0	str xzr,[x26, #0x8]
00b94eb4	mov x22,x2
00b94eb8	ldr x2,[x5]
00b94ebc	mov x23,x1
00b94ec0	mov w19,w0
00b94ec4	mov w1,#0x10
00b94ec8	mov x0,x3
00b94ecc	mov x24,x5
00b94ed0	mov x20,x4
00b94ed4	mov x21,x3
00b94ed8	bl 0x00c41cc0
00b94edc	mov w25,w0
00b94ee0	cbnz w0,0x00b94f0c
00b94ee4	nop
00b94ee8	adr x4,0xb94e44
00b94eec	mov x0,x23
00b94ef0	mov x1,x22
00b94ef4	mov x2,x21
00b94ef8	mov x3,x20
00b94efc	mov x5,xzr
00b94f00	bl 0x00b923c4
00b94f04	mov w25,w0
00b94f08	cbz w0,0x00b94f38
00b94f0c	mov w1,wzr
00b94f10	cbz w19,0x00b95060
00b94f14	cbz w25,0x00b94f28
00b94f18	adrp x0,0x2d4000
00b94f1c	add x0,x0,#0xa46
00b94f20	bl 0x00c41af0
00b94f24	b 0x00b95060
00b94f28	adrp x0,0x77c000
00b94f2c	add x0,x0,#0x87c
00b94f30	bl 0x00c30760
00b94f34	b 0x00b95060
00b94f38	mov x8,x26
00b94f3c	mov x9,x28
00b94f40	mov x10,x27
00b94f44	ldr x26,[x27, #0x18]
00b94f48	ldr x28,[x28, #0x10]
00b94f4c	ldr x27,[x8, #0x8]
00b94f50	str xzr,[x10, #0x18]
00b94f54	str xzr,[x9, #0x10]
00b94f58	str xzr,[x8, #0x8]
00b94f5c	ldr x2,[x24, #0x8]
00b94f60	mov w1,#0x10
00b94f64	mov x0,x21
00b94f68	bl 0x00c41cc0
00b94f6c	mov w25,w0
00b94f70	cbnz w0,0x00b94fa4
00b94f74	nop
00b94f78	adr x4,0xb94e44
00b94f7c	mov x0,x23
00b94f80	mov x1,x22
00b94f84	mov x2,x21
00b94f88	mov x3,x20
00b94f8c	mov x5,xzr
00b94f90	stp x27,x28,[sp, #0x8]
00b94f94	str x26,[sp, #0x18]
00b94f98	bl 0x00b923c4
00b94f9c	mov w25,w0
00b94fa0	cbz w0,0x00b94fb0
00b94fa4	mov w1,#0x1
00b94fa8	cbnz w19,0x00b94f14
00b94fac	b 0x00b95060
00b94fb0	adrp x27,0xd26000
00b94fb4	ldr x8,[x27, #0x18]
00b94fb8	ldr x9,[sp, #0x18]
00b94fbc	mov w1,#0x1
00b94fc0	cmp x8,x9
00b94fc4	b.ne 0x00b9504c
00b94fc8	adrp x28,0xd26000
00b94fcc	ldr x8,[x28, #0x10]
00b94fd0	ldr x9,[sp, #0x10]
00b94fd4	cmp x8,x9
00b94fd8	b.ne 0x00b95058
00b94fdc	adrp x26,0xd26000
00b94fe0	ldr x8,[x26, #0x8]
00b94fe4	ldr x9,[sp, #0x8]
00b94fe8	mov w25,#0x1
00b94fec	cmp x8,x9
00b94ff0	b.ne 0x00b9505c
00b94ff4	str xzr,[x27, #0x18]
00b94ff8	str xzr,[x28, #0x10]
00b94ffc	str xzr,[x26, #0x8]
00b95000	ldr x2,[x24, #0x10]
00b95004	mov w1,#0x10
00b95008	mov x0,x21
00b9500c	bl 0x00c41cc0
00b95010	mov w25,w0
00b95014	cbnz w0,0x00b95040
00b95018	nop
00b9501c	adr x4,0xb94e44
00b95020	mov x0,x23
00b95024	mov x1,x22
00b95028	mov x2,x21
00b9502c	mov x3,x20
00b95030	mov x5,xzr
00b95034	bl 0x00b923c4
00b95038	mov w25,w0
00b9503c	cbz w0,0x00b95084
00b95040	mov w1,#0x2
00b95044	cbnz w19,0x00b94f14
00b95048	b 0x00b95060
00b9504c	mov w25,#0x1
00b95050	cbnz w19,0x00b94f14
00b95054	b 0x00b95060
00b95058	mov w25,#0x1
00b9505c	cbnz w19,0x00b94f14
00b95060	mov w0,w25
00b95064	ldp x29,x30,[sp, #0x70]
00b95068	ldp x20,x19,[sp, #0x60]
00b9506c	ldp x22,x21,[sp, #0x50]
00b95070	ldp x24,x23,[sp, #0x40]
00b95074	ldp x26,x25,[sp, #0x30]
00b95078	ldp x28,x27,[sp, #0x20]
00b9507c	add sp,sp,#0x80
00b95080	ret
00b95084	ldr x8,[x27, #0x18]
00b95088	ldr x9,[sp, #0x18]
00b9508c	mov w25,#0x1
00b95090	mov w1,#0x2
00b95094	cmp x8,x9
00b95098	b.ne 0x00b9505c
00b9509c	ldr x8,[x28, #0x10]
00b950a0	ldr x9,[sp, #0x10]
00b950a4	cmp x8,x9
00b950a8	b.ne 0x00b9505c
00b950ac	ldr x8,[x26, #0x8]
00b950b0	ldr x9,[sp, #0x8]
00b950b4	cmp x8,x9
00b950b8	b.ne 0x00b9505c
00b950bc	str xzr,[x27, #0x18]
00b950c0	str xzr,[x28, #0x10]
00b950c4	str xzr,[x26, #0x8]
00b950c8	ldr x2,[x24, #0x18]
00b950cc	mov w1,#0x10
00b950d0	mov x0,x21
00b950d4	bl 0x00c41cc0
00b950d8	mov w25,w0
00b950dc	cbnz w0,0x00b95108
00b950e0	nop
00b950e4	adr x4,0xb94e44
00b950e8	mov x0,x23
00b950ec	mov x1,x22
00b950f0	mov x2,x21
00b950f4	mov x3,x20
00b950f8	mov x5,xzr
00b950fc	bl 0x00b923c4
00b95100	mov w25,w0
00b95104	cbz w0,0x00b95114
00b95108	orr w1,wzr,#0x3
00b9510c	cbnz w19,0x00b94f14
00b95110	b 0x00b95060
00b95114	ldr x8,[x27, #0x18]
00b95118	ldr x9,[sp, #0x18]
00b9511c	mov w25,#0x1
00b95120	orr w1,wzr,#0x3
00b95124	cmp x8,x9
00b95128	b.ne 0x00b9505c
00b9512c	ldr x8,[x28, #0x10]
00b95130	ldr x9,[sp, #0x10]
00b95134	cmp x8,x9
00b95138	b.ne 0x00b9505c
00b9513c	adrp x9,0xd26000
00b95140	ldr x8,[x9, #0x8]
00b95144	ldr x10,[sp, #0x8]
00b95148	cmp x8,x10
00b9514c	adrp x8,0xd26000
00b95150	b.ne 0x00b9505c
00b95154	str xzr,[x8, #0x18]
00b95158	str xzr,[x28, #0x10]
00b9515c	str xzr,[x9, #0x8]
00b95160	ldr x2,[x24, #0x20]
00b95164	mov w1,#0x10
00b95168	mov x0,x21
00b9516c	bl 0x00c41cc0
00b95170	mov w25,w0
00b95174	cbnz w0,0x00b951a0
00b95178	nop
00b9517c	adr x4,0xb94e44
00b95180	mov x0,x23
00b95184	mov x1,x22
00b95188	mov x2,x21
00b9518c	mov x3,x20
00b95190	mov x5,xzr
00b95194	bl 0x00b923c4
00b95198	mov w25,w0
00b9519c	cbz w0,0x00b951ac
00b951a0	mov w1,#0x4
00b951a4	cbnz w19,0x00b94f14
00b951a8	b 0x00b95060
00b951ac	adrp x8,0xd26000
00b951b0	ldr x8,[x8, #0x18]
00b951b4	ldr x9,[sp, #0x18]
00b951b8	mov w25,#0x1
00b951bc	mov w1,#0x4
00b951c0	cmp x8,x9
00b951c4	b.ne 0x00b9505c
00b951c8	adrp x8,0xd26000
00b951cc	ldr x8,[x8, #0x10]
00b951d0	ldr x9,[sp, #0x10]
00b951d4	cmp x8,x9
00b951d8	b.ne 0x00b9505c
00b951dc	adrp x9,0xd26000
00b951e0	ldr x8,[x9, #0x8]
00b951e4	ldr x10,[sp, #0x8]
00b951e8	cmp x8,x10
00b951ec	adrp x8,0xd26000
00b951f0	adrp x10,0xd26000
00b951f4	b.ne 0x00b9505c
00b951f8	str xzr,[x10, #0x18]
00b951fc	str xzr,[x8, #0x10]
00b95200	str xzr,[x9, #0x8]
00b95204	ldr x2,[x24, #0x28]
00b95208	mov w1,#0x10
00b9520c	mov x0,x21
00b95210	bl 0x00c41cc0
00b95214	mov w25,w0
00b95218	cbz w0,0x00b95228
00b9521c	mov w1,#0x5
00b95220	cbnz w19,0x00b94f14
00b95224	b 0x00b95060
00b95228	nop
00b9522c	adr x4,0xb94e44
00b95230	mov x0,x23
00b95234	mov x1,x22
00b95238	mov x2,x21
00b9523c	mov x3,x20
00b95240	mov x5,xzr
00b95244	bl 0x00b923c4
00b95248	mov w25,w0
00b9524c	mov w1,#0x5
00b95250	cbnz w0,0x00b9505c
00b95254	adrp x8,0xd26000
00b95258	ldr x8,[x8, #0x18]
00b9525c	ldr x11,[sp, #0x18]
00b95260	adrp x9,0xd26000
00b95264	ldr x9,[x9, #0x10]
00b95268	adrp x10,0xd26000
00b9526c	cmp x8,x11
00b95270	ldr x11,[sp, #0x10]
00b95274	ldr x10,[x10, #0x8]
00b95278	cset w8,eq
00b9527c	cmp x9,x11
00b95280	ldr x11,[sp, #0x8]
00b95284	cset w9,eq
00b95288	and w8,w8,w9
00b9528c	cmp x10,x11
00b95290	cset w9,eq
00b95294	and w10,w8,w9
00b95298	tst w8,w9
00b9529c	cinc w1,w1,ne
00b952a0	eor w25,w10,#0x1
00b952a4	cbnz w19,0x00b94f14
00b952a8	b 0x00b95060
