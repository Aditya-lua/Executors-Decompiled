; FUN_0097cb20 @ 0097cb20
0097cb20	stp x28,x27,[sp, #-0x60]!
0097cb24	stp x26,x25,[sp, #0x10]
0097cb28	stp x24,x23,[sp, #0x20]
0097cb2c	stp x22,x21,[sp, #0x30]
0097cb30	stp x20,x19,[sp, #0x40]
0097cb34	stp x29,x30,[sp, #0x50]
0097cb38	add x29,sp,#0x50
0097cb3c	sub sp,sp,#0x270
0097cb40	mrs x26,tpidr_el0
0097cb44	ldr x9,[x26, #0x28]
0097cb48	mov x28,x8
0097cb4c	str x9,[sp, #0x40]
0097cb50	ldp x20,x27,[x1]
0097cb54	stp xzr,xzr,[x1]
0097cb58	ldp x23,x19,[x2]
0097cb5c	stp xzr,xzr,[x2]
0097cb60	ldr x10,[x0, #0x8]
0097cb64	stp xzr,xzr,[sp, #0x98]
0097cb68	str xzr,[sp, #0x90]
0097cb6c	ldrb w9,[x20]
0097cb70	str x19,[sp, #0x38]
0097cb74	str x10,[sp, #0x20]
0097cb78	tbnz w9,#0x0,0x0097cb90
0097cb7c	ldr x8,[x20, #0x10]
0097cb80	str x8,[sp, #0xa0]
0097cb84	ldr q0,[x20]
0097cb88	str q0,[sp, #0x90]
0097cb8c	b 0x0097cbf4
0097cb90	ldr x22,[x20, #0x8]
0097cb94	cmn x22,#0x10
0097cb98	b.cs 0x0097df74
0097cb9c	ldr x24,[x20, #0x10]
0097cba0	cmp x22,#0x17
0097cba4	b.cs 0x0097cbc0
0097cba8	add x9,sp,#0x90
0097cbac	lsl w8,w22,#0x1
0097cbb0	orr x25,x9,#0x1
0097cbb4	strb w8,[sp, #0x90]
0097cbb8	cbnz x22,0x0097cbe0
0097cbbc	b 0x0097cbf0
0097cbc0	add x8,x22,#0x10
0097cbc4	and x21,x8,#-0x10
0097cbc8	mov x0,x21
0097cbcc	bl 0x00c2fed0
0097cbd0	orr x8,x21,#0x1
0097cbd4	mov x25,x0
0097cbd8	stp x22,x0,[sp, #0x98]
0097cbdc	str x8,[sp, #0x90]
0097cbe0	mov x0,x25
0097cbe4	mov x1,x24
0097cbe8	mov x2,x22
0097cbec	bl 0x00c2ffd0
0097cbf0	strb wzr,[x25, x22]
0097cbf4	ldrb w8,[sp, #0x90]
0097cbf8	ldr x9,[sp, #0x98]
0097cbfc	lsr w10,w8,#0x1
0097cc00	tst w8,#0x1
0097cc04	csel x9,x10,x9,eq
0097cc08	cbz x9,0x0097cc34
0097cc0c	cmp x9,#0x1
0097cc10	b.ne 0x0097cc48
0097cc14	ldr x9,[sp, #0xa0]
0097cc18	add x10,sp,#0x90
0097cc1c	orr x10,x10,#0x1
0097cc20	tst w8,#0x1
0097cc24	csel x8,x10,x9,eq
0097cc28	ldrb w8,[x8]
0097cc2c	cmp w8,#0x2f
0097cc30	b.ne 0x0097cc48
0097cc34	adrp x1,0x2b9000
0097cc38	add x1,x1,#0x5a4
0097cc3c	add x0,sp,#0x90
0097cc40	mov w2,#0xb
0097cc44	bl 0x00c31090
0097cc48	add x8,sp,#0x78
0097cc4c	add x8,x8,#0x8
0097cc50	stp xzr,xzr,[sp, #0x80]
0097cc54	str x8,[sp, #0x78]
0097cc58	add x8,sp,#0x100
0097cc5c	bl 0x00c331c0
0097cc60	mov w10,#0x6553
0097cc64	orr w8,wzr,#0xc
0097cc68	mov w9,#0x7265
0097cc6c	movk w10,#0x7672, LSL #16
0097cc70	add x11,sp,#0xb0
0097cc74	stp x26,x28,[sp, #0x28]
0097cc78	stp xzr,xzr,[sp, #0xb8]
0097cc7c	strb w8,[sp, #0xb0]
0097cc80	sturh w9,[sp, #0xb5]
0097cc84	stur w10,[sp, #0xb1]
0097cc88	strb wzr,[sp, #0xb7]
0097cc8c	str x11,[sp, #0xd0]
0097cc90	adrp x2,0x749000
0097cc94	add x2,x2,#0x7e2
0097cc98	add x0,sp,#0x78
0097cc9c	add x1,sp,#0xb0
0097cca0	add x3,sp,#0xd0
0097cca4	add x4,sp,#0x60
0097cca8	bl 0x00c32fb0
0097ccac	mov x19,x0
0097ccb0	ldrb w8,[x19, #0x38]!
0097ccb4	mov x22,x0
0097ccb8	add x28,sp,#0xd0
0097ccbc	tbnz w8,#0x0,0x0097ccc8
0097ccc0	strh wzr,[x19]
0097ccc4	b 0x0097cce8
0097ccc8	ldr x8,[x22, #0x48]
0097cccc	strb wzr,[x8]
0097ccd0	ldrb w8,[x22, #0x38]
0097ccd4	str xzr,[x22, #0x40]
0097ccd8	tbz w8,#0x0,0x0097cce8
0097ccdc	ldr x0,[x22, #0x48]
0097cce0	bl 0x00c301d0
0097cce4	str xzr,[x22, #0x38]
0097cce8	ldr x8,[sp, #0x110]
0097ccec	str x8,[x19, #0x10]
0097ccf0	ldr q0,[x28, #0x30]
0097ccf4	str q0,[x19]
0097ccf8	ldrb w8,[sp, #0xb0]
0097ccfc	stp xzr,xzr,[sp, #0x100]
0097cd00	str xzr,[sp, #0x110]
0097cd04	tbz w8,#0x0,0x0097cd20
0097cd08	ldr x0,[sp, #0xc0]
0097cd0c	bl 0x00c301d0
0097cd10	ldrb w8,[sp, #0x100]
0097cd14	tbz w8,#0x0,0x0097cd20
0097cd18	ldr x0,[sp, #0x110]
0097cd1c	bl 0x00c301d0
0097cd20	ldrb w8,[sp, #0x90]
0097cd24	ldp x11,x9,[sp, #0x98]
0097cd28	add x10,sp,#0x90
0097cd2c	orr x10,x10,#0x1
0097cd30	tst w8,#0x1
0097cd34	lsr w8,w8,#0x1
0097cd38	csel x19,x10,x9,eq
0097cd3c	csel x25,x8,x11,eq
0097cd40	cmp x25,#0x4
0097cd44	add x21,x19,x25
0097cd48	b.le 0x0097cdb0
0097cd4c	adrp x22,0x2c3000
0097cd50	add x22,x22,#0x5d
0097cd54	mov x8,x25
0097cd58	mov x0,x19
0097cd5c	subs x2,x8,#0x4
0097cd60	b.eq 0x0097cdb0
0097cd64	mov w1,#0x2e
0097cd68	bl 0x00c300a0
0097cd6c	mov x24,x0
0097cd70	cbz x0,0x0097cdb0
0097cd74	mov w2,#0x5
0097cd78	mov x0,x24
0097cd7c	mov x1,x22
0097cd80	bl 0x00c300b0
0097cd84	cbz w0,0x0097cd9c
0097cd88	add x0,x24,#0x1
0097cd8c	sub x8,x21,x0
0097cd90	cmp x8,#0x5
0097cd94	b.ge 0x0097cd5c
0097cd98	b 0x0097cdb0
0097cd9c	cmp x24,x21
0097cda0	b.eq 0x0097cdb0
0097cda4	sub x8,x24,x19
0097cda8	cmn x8,#0x1
0097cdac	b.ne 0x0097cebc
0097cdb0	cmp x25,#0x3
0097cdb4	b.gt 0x0097ce10
0097cdb8	cmp x25,#0x3
0097cdbc	b.lt 0x0097cef4
0097cdc0	adrp x22,0x2cb000
0097cdc4	add x22,x22,#0x28b
0097cdc8	mov x8,x25
0097cdcc	mov x0,x19
0097cdd0	subs x2,x8,#0x2
0097cdd4	b.eq 0x0097cef4
0097cdd8	mov w1,#0x2e
0097cddc	bl 0x00c300a0
0097cde0	mov x24,x0
0097cde4	cbz x0,0x0097cef4
0097cde8	orr w2,wzr,#0x3
0097cdec	mov x0,x24
0097cdf0	mov x1,x22
0097cdf4	bl 0x00c300b0
0097cdf8	cbz w0,0x0097cee0
0097cdfc	add x0,x24,#0x1
0097ce00	sub x8,x21,x0
0097ce04	cmp x8,#0x3
0097ce08	b.ge 0x0097cdd0
0097ce0c	b 0x0097cef4
0097ce10	mov w22,#0x682e
0097ce14	movk w22,#0x6d74, LSL #16
0097ce18	mov x8,x25
0097ce1c	mov x0,x19
0097ce20	subs x2,x8,#0x3
0097ce24	b.eq 0x0097ce54
0097ce28	mov w1,#0x2e
0097ce2c	bl 0x00c300a0
0097ce30	mov x8,x0
0097ce34	cbz x0,0x0097ce54
0097ce38	ldr w9,[x8]
0097ce3c	cmp w9,w22
0097ce40	b.eq 0x0097ce98
0097ce44	add x0,x8,#0x1
0097ce48	sub x8,x21,x0
0097ce4c	cmp x8,#0x4
0097ce50	b.ge 0x0097ce20
0097ce54	mov x9,x25
0097ce58	mov x0,x19
0097ce5c	subs x2,x9,#0x3
0097ce60	b.eq 0x0097cdb8
0097ce64	mov w1,#0x2e
0097ce68	bl 0x00c300a0
0097ce6c	cbz x0,0x0097cdb8
0097ce70	ldr w8,[x0]
0097ce74	mov w9,#0x632e
0097ce78	movk w9,#0x7373, LSL #16
0097ce7c	cmp w8,w9
0097ce80	b.eq 0x0097d064
0097ce84	add x0,x0,#0x1
0097ce88	sub x9,x21,x0
0097ce8c	cmp x9,#0x3
0097ce90	b.gt 0x0097ce5c
0097ce94	b 0x0097cdb8
0097ce98	cmp x8,x21
0097ce9c	mov x9,x25
0097cea0	mov x0,x19
0097cea4	b.eq 0x0097ce5c
0097cea8	sub x8,x8,x19
0097ceac	cmn x8,#0x1
0097ceb0	mov x9,x25
0097ceb4	mov x0,x19
0097ceb8	b.eq 0x0097ce5c
0097cebc	adrp x9,0x2d9000
0097cec0	add x9,x9,#0xc4
0097cec4	ldr x9,[x9]
0097cec8	mov w8,#0x12
0097cecc	mov x22,xzr
0097ced0	stp xzr,xzr,[sp, #0xb0]
0097ced4	strb w8,[sp, #0xb0]
0097ced8	mov w8,#0x6c
0097cedc	b 0x0097d25c
0097cee0	cmp x24,x21
0097cee4	b.eq 0x0097cef4
0097cee8	sub x8,x24,x19
0097ceec	cmn x8,#0x1
0097cef0	b.ne 0x0097d0c8
0097cef4	cmp x25,#0x3
0097cef8	b.gt 0x0097cf54
0097cefc	cmp x25,#0x4
0097cf00	b.le 0x0097d154
0097cf04	adrp x22,0x2a9000
0097cf08	add x22,x22,#0x5e0
0097cf0c	mov x8,x25
0097cf10	mov x0,x19
0097cf14	subs x2,x8,#0x4
0097cf18	b.eq 0x0097d154
0097cf1c	mov w1,#0x2e
0097cf20	bl 0x00c300a0
0097cf24	mov x24,x0
0097cf28	cbz x0,0x0097d154
0097cf2c	mov w2,#0x5
0097cf30	mov x0,x24
0097cf34	mov x1,x22
0097cf38	bl 0x00c300b0
0097cf3c	cbz w0,0x0097d140
0097cf40	add x0,x24,#0x1
0097cf44	sub x8,x21,x0
0097cf48	cmp x8,#0x4
0097cf4c	b.gt 0x0097cf14
0097cf50	b 0x0097d154
0097cf54	mov w22,#0x6d2e
0097cf58	movk w22,#0x736a, LSL #16
0097cf5c	mov x8,x25
0097cf60	mov x0,x19
0097cf64	subs x2,x8,#0x3
0097cf68	b.eq 0x0097cf98
0097cf6c	mov w1,#0x2e
0097cf70	bl 0x00c300a0
0097cf74	mov x8,x0
0097cf78	cbz x0,0x0097cf98
0097cf7c	ldr w9,[x8]
0097cf80	cmp w9,w22
0097cf84	b.eq 0x0097d0a4
0097cf88	add x0,x8,#0x1
0097cf8c	sub x8,x21,x0
0097cf90	cmp x8,#0x4
0097cf94	b.ge 0x0097cf64
0097cf98	mov x9,x25
0097cf9c	mov x0,x19
0097cfa0	subs x2,x9,#0x3
0097cfa4	b.eq 0x0097cfdc
0097cfa8	mov w1,#0x2e
0097cfac	bl 0x00c300a0
0097cfb0	mov x8,x0
0097cfb4	cbz x0,0x0097cfdc
0097cfb8	ldr w9,[x8]
0097cfbc	mov w10,#0x692e
0097cfc0	movk w10,#0x6f63, LSL #16
0097cfc4	cmp w9,w10
0097cfc8	b.eq 0x0097d0e8
0097cfcc	add x0,x8,#0x1
0097cfd0	sub x9,x21,x0
0097cfd4	cmp x9,#0x4
0097cfd8	b.ge 0x0097cfa0
0097cfdc	mov x9,x25
0097cfe0	mov x0,x19
0097cfe4	subs x2,x9,#0x3
0097cfe8	b.eq 0x0097d020
0097cfec	mov w1,#0x2e
0097cff0	bl 0x00c300a0
0097cff4	mov x8,x0
0097cff8	cbz x0,0x0097d020
0097cffc	ldr w9,[x8]
0097d000	mov w10,#0x702e
0097d004	movk w10,#0x676e, LSL #16
0097d008	cmp w9,w10
0097d00c	b.eq 0x0097d1dc
0097d010	add x0,x8,#0x1
0097d014	sub x9,x21,x0
0097d018	cmp x9,#0x4
0097d01c	b.ge 0x0097cfe4
0097d020	mov x9,x25
0097d024	mov x0,x19
0097d028	subs x2,x9,#0x3
0097d02c	b.eq 0x0097cefc
0097d030	mov w1,#0x2e
0097d034	bl 0x00c300a0
0097d038	cbz x0,0x0097cefc
0097d03c	ldr w8,[x0]
0097d040	mov w9,#0x6a2e
0097d044	movk w9,#0x6770, LSL #16
0097d048	cmp w8,w9
0097d04c	b.eq 0x0097d2a8
0097d050	add x0,x0,#0x1
0097d054	sub x9,x21,x0
0097d058	cmp x9,#0x4
0097d05c	b.ge 0x0097d028
0097d060	b 0x0097cefc
0097d064	cmp x0,x21
0097d068	b.eq 0x0097cdb8
0097d06c	sub x8,x0,x19
0097d070	cmn x8,#0x1
0097d074	b.eq 0x0097cdb8
0097d078	mov x9,#0x6574
0097d07c	movk x9,#0x7478, LSL #16
0097d080	movk x9,#0x632f, LSL #32
0097d084	mov w8,#0x10
0097d088	movk x9,#0x7373, LSL #48
0097d08c	mov x22,xzr
0097d090	stp xzr,xzr,[sp, #0xb0]
0097d094	strb w8,[sp, #0xb0]
0097d098	stur x9,[sp, #0xb1]
0097d09c	strb wzr,[sp, #0xb9]
0097d0a0	b 0x0097d32c
0097d0a4	cmp x8,x21
0097d0a8	mov x9,x25
0097d0ac	mov x0,x19
0097d0b0	b.eq 0x0097cfa0
0097d0b4	sub x8,x8,x19
0097d0b8	cmn x8,#0x1
0097d0bc	mov x9,x25
0097d0c0	mov x0,x19
0097d0c4	b.eq 0x0097cfa0
0097d0c8	stp xzr,xzr,[sp, #0xb0]
0097d0cc	mov w0,#0x20
0097d0d0	bl 0x00c2fed0
0097d0d4	adrp x9,0x2b1000
0097d0d8	mov x22,x0
0097d0dc	adrp x8,0x29c000
0097d0e0	add x9,x9,#0x97a
0097d0e4	b 0x0097d178
0097d0e8	cmp x8,x21
0097d0ec	mov x9,x25
0097d0f0	mov x0,x19
0097d0f4	b.eq 0x0097cfe4
0097d0f8	sub x8,x8,x19
0097d0fc	cmn x8,#0x1
0097d100	mov x9,x25
0097d104	mov x0,x19
0097d108	b.eq 0x0097cfe4
0097d10c	adrp x9,0x2c3000
0097d110	add x9,x9,#0x2cb
0097d114	ldr x9,[x9]
0097d118	mov w10,#0x6369
0097d11c	orr w8,wzr,#0x18
0097d120	movk w10,#0x6e6f, LSL #16
0097d124	mov x22,xzr
0097d128	stp xzr,xzr,[sp, #0xb0]
0097d12c	strb w8,[sp, #0xb0]
0097d130	stur w10,[sp, #0xb9]
0097d134	stur x9,[sp, #0xb1]
0097d138	strb wzr,[sp, #0xbd]
0097d13c	b 0x0097d32c
0097d140	cmp x24,x21
0097d144	b.eq 0x0097d154
0097d148	sub x8,x24,x19
0097d14c	cmn x8,#0x1
0097d150	b.ne 0x0097d2bc
0097d154	cmp x25,#0x4
0097d158	b.ge 0x0097d198
0097d15c	stp xzr,xzr,[sp, #0xb0]
0097d160	mov w0,#0x20
0097d164	bl 0x00c2fed0
0097d168	adrp x9,0x2a9000
0097d16c	mov x22,x0
0097d170	adrp x8,0x29c000
0097d174	add x9,x9,#0x54b
0097d178	ldr q0,[x8, #0x280]
0097d17c	ldr x8,[x9, #0x10]
0097d180	ldr q1,[x9]
0097d184	strb wzr,[x22, #0x18]
0097d188	str q0,[sp, #0xb0]
0097d18c	str x8,[x22, #0x10]
0097d190	str q1,[x22]
0097d194	b 0x0097d32c
0097d198	mov w22,#0x672e
0097d19c	movk w22,#0x6669, LSL #16
0097d1a0	mov x8,x25
0097d1a4	mov x0,x19
0097d1a8	subs x2,x8,#0x3
0097d1ac	b.eq 0x0097d268
0097d1b0	mov w1,#0x2e
0097d1b4	bl 0x00c300a0
0097d1b8	cbz x0,0x0097d268
0097d1bc	ldr w8,[x0]
0097d1c0	cmp w8,w22
0097d1c4	b.eq 0x0097d224
0097d1c8	add x0,x0,#0x1
0097d1cc	sub x8,x21,x0
0097d1d0	cmp x8,#0x4
0097d1d4	b.ge 0x0097d1a8
0097d1d8	b 0x0097d268
0097d1dc	cmp x8,x21
0097d1e0	mov x9,x25
0097d1e4	mov x0,x19
0097d1e8	b.eq 0x0097d028
0097d1ec	sub x8,x8,x19
0097d1f0	cmn x8,#0x1
0097d1f4	mov x9,x25
0097d1f8	mov x0,x19
0097d1fc	b.eq 0x0097d028
0097d200	adrp x9,0x2c4000
0097d204	add x9,x9,#0xff5
0097d208	ldr x9,[x9]
0097d20c	mov w8,#0x12
0097d210	mov x22,xzr
0097d214	stp xzr,xzr,[sp, #0xb0]
0097d218	strb w8,[sp, #0xb0]
0097d21c	mov w8,#0x67
0097d220	b 0x0097d25c
0097d224	cmp x0,x21
0097d228	b.eq 0x0097d268
0097d22c	sub x8,x0,x19
0097d230	cmn x8,#0x1
0097d234	mov x0,x19
0097d238	b.eq 0x0097d26c
0097d23c	adrp x9,0x2bb000
0097d240	add x9,x9,#0xc7
0097d244	ldr x9,[x9]
0097d248	mov w8,#0x12
0097d24c	mov x22,xzr
0097d250	stp xzr,xzr,[sp, #0xb0]
0097d254	strb w8,[sp, #0xb0]
0097d258	mov w8,#0x66
0097d25c	sturh w8,[sp, #0xb9]
0097d260	stur x9,[sp, #0xb1]
0097d264	b 0x0097d32c
0097d268	mov x0,x19
0097d26c	subs x2,x25,#0x3
0097d270	b.eq 0x0097d15c
0097d274	mov w1,#0x2e
0097d278	bl 0x00c300a0
0097d27c	cbz x0,0x0097d15c
0097d280	ldr w8,[x0]
0097d284	mov w9,#0x732e
0097d288	movk w9,#0x6776, LSL #16
0097d28c	cmp w8,w9
0097d290	b.eq 0x0097d2ec
0097d294	add x0,x0,#0x1
0097d298	sub x25,x21,x0
0097d29c	cmp x25,#0x4
0097d2a0	b.ge 0x0097d26c
0097d2a4	b 0x0097d15c
0097d2a8	cmp x0,x21
0097d2ac	b.eq 0x0097cefc
0097d2b0	sub x8,x0,x19
0097d2b4	cmn x8,#0x1
0097d2b8	b.eq 0x0097cefc
0097d2bc	adrp x9,0x2a5000
0097d2c0	add x9,x9,#0x3a5
0097d2c4	ldr x9,[x9]
0097d2c8	mov w8,#0x14
0097d2cc	mov w10,#0x6765
0097d2d0	mov x22,xzr
0097d2d4	stp xzr,xzr,[sp, #0xb0]
0097d2d8	strb w8,[sp, #0xb0]
0097d2dc	sturh w10,[sp, #0xb9]
0097d2e0	stur x9,[sp, #0xb1]
0097d2e4	strb wzr,[sp, #0xbb]
0097d2e8	b 0x0097d32c
0097d2ec	cmp x0,x21
0097d2f0	b.eq 0x0097d15c
0097d2f4	sub x8,x0,x19
0097d2f8	cmn x8,#0x1
0097d2fc	b.eq 0x0097d15c
0097d300	adrp x8,0x2cf000
0097d304	add x8,x8,#0x83
0097d308	ldr x9,[x8]
0097d30c	ldur x8,[x8, #0x5]
0097d310	mov x22,xzr
0097d314	mov w10,#0x1a
0097d318	stp xzr,xzr,[sp, #0xb0]
0097d31c	strb w10,[sp, #0xb0]
0097d320	stur x9,[sp, #0xb1]
0097d324	stur x8,[sp, #0xb6]
0097d328	strb wzr,[sp, #0xbe]
0097d32c	adrp x10,0x2c2000
0097d330	add x10,x10,#0xf9f
0097d334	ldr x10,[x10]
0097d338	mov w9,#0x7954
0097d33c	orr w8,wzr,#0x18
0097d340	movk w9,#0x6570, LSL #16
0097d344	add x11,sp,#0x100
0097d348	stp xzr,xzr,[sp, #0x100]
0097d34c	str xzr,[sp, #0x110]
0097d350	strb w8,[sp, #0x100]
0097d354	stur w9,[x28, #0x39]
0097d358	stur x10,[x28, #0x31]
0097d35c	strb wzr,[sp, #0x10d]
0097d360	str x11,[sp, #0xd0]
0097d364	adrp x2,0x749000
0097d368	add x2,x2,#0x7e2
0097d36c	add x0,sp,#0x78
0097d370	add x1,sp,#0x100
0097d374	add x3,sp,#0xd0
0097d378	add x4,sp,#0x60
0097d37c	bl 0x00c32fb0
0097d380	mov x19,x0
0097d384	ldrb w8,[x19, #0x38]!
0097d388	mov x24,x0
0097d38c	tbnz w8,#0x0,0x0097d39c
0097d390	strh wzr,[x24, #0x38]
0097d394	add x24,x24,#0x48
0097d398	b 0x0097d3bc
0097d39c	ldr x8,[x24, #0x48]!
0097d3a0	strb wzr,[x8]
0097d3a4	ldurb w8,[x24, #-0x10]
0097d3a8	stur xzr,[x24, #-0x8]
0097d3ac	tbz w8,#0x0,0x0097d3bc
0097d3b0	ldr x0,[x24]
0097d3b4	bl 0x00c301d0
0097d3b8	str xzr,[x19]
0097d3bc	ldr q0,[sp, #0xb0]
0097d3c0	str q0,[x19]
0097d3c4	str x22,[x24]
0097d3c8	ldrb w8,[sp, #0x100]
0097d3cc	stp xzr,xzr,[sp, #0xb0]
0097d3d0	tbz w8,#0x0,0x0097d3dc
0097d3d4	ldr x0,[sp, #0x110]
0097d3d8	bl 0x00c301d0
0097d3dc	adrp x0,0x2ab000
0097d3e0	add x0,x0,#0x502
0097d3e4	add x8,sp,#0x60
0097d3e8	add x1,sp,#0x90
0097d3ec	bl 0x00c304a0
0097d3f0	stp xzr,xzr,[sp, #0xd0]
0097d3f4	str xzr,[sp, #0xe0]
0097d3f8	adrp x9,0xcb4000
0097d3fc	ldr x9,[x9, #0xf58]
0097d400	add x8,sp,#0x100
0097d404	movi v0.2D,#0x0
0097d408	add x24,x8,#0xb8
0097d40c	add x25,x8,#0x10
0097d410	add x8,x9,#0x40
0097d414	add x9,x9,#0x18
0097d418	mov v0.D[0x0],x9
0097d41c	str x8,[sp, #0x1b8]
0097d420	str q0,[x28, #0x30]
0097d424	mov x0,x24
0097d428	mov x1,x25
0097d42c	bl 0x00c30100
0097d430	str xzr,[sp, #0x240]
0097d434	adrp x19,0xcb4000
0097d438	ldr x19,[x19, #0x9a8]
0097d43c	mov w8,#0xffffffff
0097d440	str w8,[sp, #0x248]
0097d444	add x8,x19,#0x18
0097d448	add x9,x19,#0x40
0097d44c	str x8,[sp, #0x100]
0097d450	str x9,[sp, #0x1b8]
0097d454	mov x0,x25
0097d458	bl 0x00c332e0
0097d45c	ldr x8,[sp, #0x188]
0097d460	cbz x8,0x0097d4b0
0097d464	ldr x8,[sp, #0x100]
0097d468	add x9,sp,#0x100
0097d46c	ldur x8,[x8, #-0x18]
0097d470	add x0,x9,x8
0097d474	ldr w8,[x0, #0x20]
0097d478	orr w1,w8,#0x4
0097d47c	bl 0x00c30130
0097d480	ldr x8,[sp, #0x188]
0097d484	cbnz x8,0x0097d4e4
0097d488	ldp x22,x8,[sp, #0xd0]
0097d48c	strb wzr,[sp, #0xb0]
0097d490	stp xzr,xzr,[sp, #0xc0]
0097d494	str xzr,[sp, #0xb8]
0097d498	subs x26,x8,x22
0097d49c	b.eq 0x0097d590
0097d4a0	tbnz x26,#0x3f,0x0097df98
0097d4a4	mov x0,x26
0097d4a8	bl 0x00c2fed0
0097d4ac	b 0x0097d574
0097d4b0	ldrb w8,[sp, #0x60]
0097d4b4	ldr x9,[sp, #0x70]
0097d4b8	add x10,sp,#0x60
0097d4bc	orr x10,x10,#0x1
0097d4c0	tst w8,#0x1
0097d4c4	adrp x1,0x2c8000
0097d4c8	csel x0,x10,x9,eq
0097d4cc	add x1,x1,#0xcc8
0097d4d0	bl 0x00c30c10
0097d4d4	str x0,[sp, #0x188]
0097d4d8	cbz x0,0x0097d464
0097d4dc	mov w8,#0x8
0097d4e0	str w8,[sp, #0x1a8]
0097d4e4	add x0,sp,#0x100
0097d4e8	mov w2,#0x2
0097d4ec	mov x1,xzr
0097d4f0	bl 0x00c33310
0097d4f4	add x0,sp,#0x100
0097d4f8	bl 0x00c33320
0097d4fc	mov x22,x1
0097d500	add x0,sp,#0x100
0097d504	mov x1,xzr
0097d508	mov w2,wzr
0097d50c	bl 0x00c33310
0097d510	ldp x1,x8,[sp, #0xd0]
0097d514	sub x8,x8,x1
0097d518	subs x8,x22,x8
0097d51c	b.ls 0x0097d534
0097d520	add x0,sp,#0xd0
0097d524	mov x1,x8
0097d528	bl 0x00c33330
0097d52c	ldr x1,[sp, #0xd0]
0097d530	b 0x0097d540
0097d534	b.cs 0x0097d540
0097d538	add x8,x1,x22
0097d53c	str x8,[sp, #0xd8]
0097d540	add x0,sp,#0x100
0097d544	mov x2,x22
0097d548	bl 0x00c33300
0097d54c	ldp x22,x9,[sp, #0xd0]
0097d550	mov w8,#0x1
0097d554	strb w8,[sp, #0xb0]
0097d558	stp xzr,xzr,[sp, #0xc0]
0097d55c	subs x26,x9,x22
0097d560	str xzr,[sp, #0xb8]
0097d564	b.eq 0x0097d590
0097d568	tbnz x26,#0x3f,0x0097df7c
0097d56c	mov x0,x26
0097d570	bl 0x00c2fed0
0097d574	add x21,x0,x26
0097d578	mov x1,x22
0097d57c	mov x2,x26
0097d580	stp x0,x0,[sp, #0xb8]
0097d584	str x21,[sp, #0xc8]
0097d588	bl 0x00c2ffd0
0097d58c	str x21,[sp, #0xc0]
0097d590	add x8,x19,#0x18
0097d594	add x9,x19,#0x40
0097d598	mov x0,x25
0097d59c	str x8,[sp, #0x100]
0097d5a0	str x9,[sp, #0x1b8]
0097d5a4	bl 0x00c332f0
0097d5a8	mov x0,x24
0097d5ac	bl 0x00c30ee0
0097d5b0	ldr x0,[sp, #0xd0]
0097d5b4	cbz x0,0x0097d5c0
0097d5b8	str x0,[sp, #0xd8]
0097d5bc	bl 0x00c301d0
0097d5c0	ldp x24,x8,[sp, #0xb8]
0097d5c4	stp xzr,xzr,[sp, #0x100]
0097d5c8	str xzr,[sp, #0x110]
0097d5cc	subs x25,x8,x24
0097d5d0	b.eq 0x0097d60c
0097d5d4	tbnz x25,#0x3f,0x0097df6c
0097d5d8	mov x0,x25
0097d5dc	bl 0x00c2fed0
0097d5e0	add x8,sp,#0x100
0097d5e4	add x26,x0,x25
0097d5e8	mov x1,x24
0097d5ec	mov x2,x25
0097d5f0	mov x22,x0
0097d5f4	stp x0,x0,[sp, #0x100]
0097d5f8	add x19,x8,#0x8
0097d5fc	str x26,[sp, #0x110]
0097d600	bl 0x00c2ffd0
0097d604	str x26,[sp, #0x108]
0097d608	b 0x0097d61c
0097d60c	add x8,sp,#0x100
0097d610	mov x26,xzr
0097d614	mov x22,xzr
0097d618	add x19,x8,#0x8
0097d61c	sub x24,x26,x22
0097d620	cmn x24,#0x10
0097d624	stp xzr,xzr,[sp, #0xd0]
0097d628	str xzr,[sp, #0xe0]
0097d62c	b.cs 0x0097df60
0097d630	cmp x24,#0x16
0097d634	b.hi 0x0097d654
0097d638	lsl w8,w24,#0x1
0097d63c	add x9,sp,#0xd0
0097d640	strb w8,[sp, #0xd0]
0097d644	orr x0,x9,#0x1
0097d648	cmp x22,x26
0097d64c	b.ne 0x0097d678
0097d650	b 0x0097d6f0
0097d654	add x8,x24,#0x10
0097d658	and x21,x8,#-0x10
0097d65c	mov x0,x21
0097d660	bl 0x00c2fed0
0097d664	orr x8,x21,#0x1
0097d668	stp x24,x0,[sp, #0xd8]
0097d66c	str x8,[sp, #0xd0]
0097d670	cmp x22,x26
0097d674	b.eq 0x0097d6f0
0097d678	cmp x24,#0x20
0097d67c	mov x8,x0
0097d680	mov x9,x22
0097d684	b.cc 0x0097d6dc
0097d688	cmp x0,x26
0097d68c	b.cs 0x0097d6a4
0097d690	add x8,x0,x24
0097d694	cmp x8,x22
0097d698	mov x8,x0
0097d69c	mov x9,x22
0097d6a0	b.hi 0x0097d6dc
0097d6a4	and x10,x24,#-0x20
0097d6a8	add x11,x22,#0x10
0097d6ac	add x8,x0,x10
0097d6b0	add x9,x22,x10
0097d6b4	add x12,x0,#0x10
0097d6b8	mov x13,x10
0097d6bc	ldp q0,q1,[x11, #-0x10]
0097d6c0	add x11,x11,#0x20
0097d6c4	subs x13,x13,#0x20
0097d6c8	stp q0,q1,[x12, #-0x10]
0097d6cc	add x12,x12,#0x20
0097d6d0	b.ne 0x0097d6bc
0097d6d4	cmp x10,x24
0097d6d8	b.eq 0x0097d6ec
0097d6dc	ldrb w10,[x9], #0x1
0097d6e0	cmp x26,x9
0097d6e4	strb w10,[x8], #0x1
0097d6e8	b.ne 0x0097d6dc
0097d6ec	add x0,x0,x24
0097d6f0	strb wzr,[x0]
0097d6f4	ldrb w21,[sp, #0xb0]
0097d6f8	ldr x0,[sp, #0x100]
0097d6fc	ldrb w24,[sp, #0xd0]
0097d700	ldur w8,[x28, #0x1]
0097d704	ldurh w9,[x28, #0x5]
0097d708	ldrb w10,[sp, #0xd7]
0097d70c	ldp x22,x26,[sp, #0xd8]
0097d710	str w8,[sp, #0xf8]
0097d714	strh w9,[sp, #0xfc]
0097d718	strb w10,[sp, #0xfe]
0097d71c	cbz x0,0x0097d728
0097d720	str x0,[x19]
0097d724	bl 0x00c301d0
0097d728	ldr x0,[sp, #0xb8]
0097d72c	cbz x0,0x0097d738
0097d730	str x0,[sp, #0xc0]
0097d734	bl 0x00c301d0
0097d738	cbz w21,0x0097d77c
0097d73c	and w8,w24,#0x1
0097d740	stp xzr,xzr,[sp, #0xb0]
0097d744	str xzr,[sp, #0xc0]
0097d748	str x27,[sp, #0x18]
0097d74c	str x26,[sp, #0x8]
0097d750	str w8,[sp, #0x14]
0097d754	tbnz w24,#0x0,0x0097d7f0
0097d758	ldr w8,[sp, #0xf8]
0097d75c	ldrh w9,[sp, #0xfc]
0097d760	ldrb w10,[sp, #0xfe]
0097d764	strb w24,[sp, #0xb0]
0097d768	stur w8,[sp, #0xb1]
0097d76c	sturh w9,[sp, #0xb5]
0097d770	strb w10,[sp, #0xb7]
0097d774	stp x22,x26,[sp, #0xb8]
0097d778	b 0x0097d84c
0097d77c	mov w8,#0x194
0097d780	add x9,sp,#0x100
0097d784	str w8,[sp, #0xd0]
0097d788	add x8,x9,#0x8
0097d78c	str wzr,[sp, #0x48]
0097d790	stp xzr,xzr,[sp, #0x108]
0097d794	stp xzr,xzr,[sp, #0xb0]
0097d798	str x8,[sp, #0x100]
0097d79c	str xzr,[sp, #0xc0]
0097d7a0	ldr x8,[sp, #0x30]
0097d7a4	adrp x1,0x2ab000
0097d7a8	add x1,x1,#0x956
0097d7ac	add x0,sp,#0xd0
0097d7b0	add x2,sp,#0x48
0097d7b4	add x3,sp,#0x100
0097d7b8	add x4,sp,#0xb0
0097d7bc	bl 0x00c332a0
0097d7c0	ldrb w8,[sp, #0xb0]
0097d7c4	ldr x19,[sp, #0x38]
0097d7c8	ldr x20,[sp, #0x28]
0097d7cc	tbz w8,#0x0,0x0097d7d8
0097d7d0	ldr x0,[sp, #0xc0]
0097d7d4	bl 0x00c301d0
0097d7d8	ldr x1,[sp, #0x108]
0097d7dc	add x0,sp,#0x100
0097d7e0	bl 0x00c32fc0
0097d7e4	and w8,w24,#0x1
0097d7e8	cbnz w8,0x0097de7c
0097d7ec	b 0x0097de84
0097d7f0	cmn x22,#0x10
0097d7f4	b.cs 0x0097df88
0097d7f8	cmp x22,#0x17
0097d7fc	b.cs 0x0097d818
0097d800	add x9,sp,#0xb0
0097d804	lsl w8,w22,#0x1
0097d808	orr x25,x9,#0x1
0097d80c	strb w8,[sp, #0xb0]
0097d810	cbnz x22,0x0097d838
0097d814	b 0x0097d848
0097d818	add x8,x22,#0x10
0097d81c	and x21,x8,#-0x10
0097d820	mov x0,x21
0097d824	bl 0x00c2fed0
0097d828	orr x8,x21,#0x1
0097d82c	mov x25,x0
0097d830	stp x22,x0,[sp, #0xb8]
0097d834	str x8,[sp, #0xb0]
0097d838	mov x0,x25
0097d83c	mov x1,x26
0097d840	mov x2,x22
0097d844	bl 0x00c2ffd0
0097d848	strb wzr,[x25, x22]
0097d84c	adrp x9,0x2b9000
0097d850	add x9,x9,#0x5b0
0097d854	ldur x10,[x9, #0x7]
0097d858	ldr x9,[x9]
0097d85c	orr w8,wzr,#0x1e
0097d860	add x26,x20,#0x60
0097d864	add x11,sp,#0x100
0097d868	stp xzr,xzr,[sp, #0x100]
0097d86c	strb w8,[sp, #0x100]
0097d870	stp x10,xzr,[sp, #0x108]
0097d874	stur x9,[x28, #0x31]
0097d878	strb wzr,[sp, #0x110]
0097d87c	str x11,[sp, #0x48]
0097d880	adrp x2,0x749000
0097d884	add x2,x2,#0x7e2
0097d888	add x1,sp,#0x100
0097d88c	add x3,sp,#0x48
0097d890	add x4,sp,#0xf0
0097d894	mov x0,x26
0097d898	bl 0x00c32fb0
0097d89c	stp xzr,xzr,[sp, #0xd8]
0097d8a0	str xzr,[sp, #0xd0]
0097d8a4	mov x8,x0
0097d8a8	ldrb w9,[x8, #0x38]!
0097d8ac	tbnz w9,#0x0,0x0097d928
0097d8b0	ldr x9,[x8, #0x10]
0097d8b4	str x9,[sp, #0xe0]
0097d8b8	ldr q0,[x8]
0097d8bc	str q0,[x28]
0097d8c0	ldrb w8,[sp, #0x100]
0097d8c4	tbz w8,#0x0,0x0097d8d0
0097d8c8	ldr x0,[sp, #0x110]
0097d8cc	bl 0x00c301d0
0097d8d0	ldrb w9,[sp, #0xd0]
0097d8d4	ldr x8,[sp, #0xd8]
0097d8d8	lsr w10,w9,#0x1
0097d8dc	tst w9,#0x1
0097d8e0	csel x8,x10,x8,eq
0097d8e4	cmp x8,#0x1
0097d8e8	b.ne 0x0097d958
0097d8ec	ldr x8,[sp, #0xe0]
0097d8f0	add x10,sp,#0xd0
0097d8f4	orr x10,x10,#0x1
0097d8f8	tst w9,#0x1
0097d8fc	csel x8,x10,x8,eq
0097d900	ldrb w8,[x8]
0097d904	cmp w8,#0x2a
0097d908	b.ne 0x0097da94
0097d90c	add x8,sp,#0x100
0097d910	add x0,sp,#0xb0
0097d914	bl 0x00c32f00
0097d918	ldrb w8,[sp, #0xb0]
0097d91c	tbnz w8,#0x0,0x0097d9f8
0097d920	strh wzr,[sp, #0xb0]
0097d924	b 0x0097da18
0097d928	ldr x22,[x0, #0x40]
0097d92c	cmn x22,#0x10
0097d930	b.cs 0x0097df90
0097d934	ldr x25,[x0, #0x48]
0097d938	cmp x22,#0x17
0097d93c	b.cs 0x0097d9b8
0097d940	add x9,sp,#0xd0
0097d944	lsl w8,w22,#0x1
0097d948	orr x27,x9,#0x1
0097d94c	strb w8,[sp, #0xd0]
0097d950	cbnz x22,0x0097d9d8
0097d954	b 0x0097d9e8
0097d958	ldr x10,[sp, #0xe0]
0097d95c	add x11,sp,#0xd0
0097d960	tst w9,#0x1
0097d964	orr x9,x11,#0x1
0097d968	csel x19,x9,x10,eq
0097d96c	cmp x8,#0x4
0097d970	b.lt 0x0097da94
0097d974	mov w22,#0x7a67
0097d978	add x21,x19,x8
0097d97c	movk w22,#0x7069, LSL #16
0097d980	mov x0,x19
0097d984	subs x2,x8,#0x3
0097d988	b.eq 0x0097da94
0097d98c	mov w1,#0x67
0097d990	bl 0x00c300a0
0097d994	cbz x0,0x0097da94
0097d998	ldr w8,[x0]
0097d99c	cmp w8,w22
0097d9a0	b.eq 0x0097df48
0097d9a4	add x0,x0,#0x1
0097d9a8	sub x8,x21,x0
0097d9ac	cmp x8,#0x4
0097d9b0	b.ge 0x0097d984
0097d9b4	b 0x0097da94
0097d9b8	add x8,x22,#0x10
0097d9bc	and x21,x8,#-0x10
0097d9c0	mov x0,x21
0097d9c4	bl 0x00c2fed0
0097d9c8	orr x8,x21,#0x1
0097d9cc	mov x27,x0
0097d9d0	stp x22,x0,[sp, #0xd8]
0097d9d4	str x8,[sp, #0xd0]
0097d9d8	mov x0,x27
0097d9dc	mov x1,x25
0097d9e0	mov x2,x22
0097d9e4	bl 0x00c2ffd0
0097d9e8	strb wzr,[x27, x22]
0097d9ec	ldrb w8,[sp, #0x100]
0097d9f0	tbnz w8,#0x0,0x0097d8c8
0097d9f4	b 0x0097d8d0
0097d9f8	ldr x8,[sp, #0xc0]
0097d9fc	strb wzr,[x8]
0097da00	ldrb w8,[sp, #0xb0]
0097da04	str xzr,[sp, #0xb8]
0097da08	tbz w8,#0x0,0x0097da18
0097da0c	ldr x0,[sp, #0xc0]
0097da10	bl 0x00c301d0
0097da14	str xzr,[sp, #0xb0]
0097da18	adrp x10,0x2af000
0097da1c	add x10,x10,#0x6b8
0097da20	ldr x8,[sp, #0x110]
0097da24	ldr q0,[x28, #0x30]
0097da28	ldr q1,[x10]
0097da2c	mov w9,#0x20
0097da30	add x11,sp,#0x100
0097da34	stp xzr,xzr,[sp, #0x100]
0097da38	str xzr,[sp, #0x110]
0097da3c	strb w9,[sp, #0x100]
0097da40	str x8,[sp, #0xc0]
0097da44	str q0,[sp, #0xb0]
0097da48	stur q1,[x28, #0x31]
0097da4c	strb wzr,[sp, #0x111]
0097da50	str x11,[sp, #0x48]
0097da54	adrp x2,0x749000
0097da58	add x2,x2,#0x7e2
0097da5c	add x0,sp,#0x78
0097da60	add x1,sp,#0x100
0097da64	add x3,sp,#0x48
0097da68	add x4,sp,#0xf0
0097da6c	bl 0x00c32fb0
0097da70	add x0,x0,#0x38
0097da74	adrp x1,0x2af000
0097da78	add x1,x1,#0x2db
0097da7c	mov w2,#0x4
0097da80	bl 0x00c31090
0097da84	ldrb w8,[sp, #0x100]
0097da88	tbz w8,#0x0,0x0097da94
0097da8c	ldr x0,[sp, #0x110]
0097da90	bl 0x00c301d0
0097da94	adrp x9,0x2a7000
0097da98	add x9,x9,#0x33c
0097da9c	ldur x10,[x9, #0x7]
0097daa0	ldr x9,[x9]
0097daa4	orr w8,wzr,#0x1e
0097daa8	add x11,sp,#0x100
0097daac	stp xzr,xzr,[sp, #0x100]
0097dab0	strb w8,[sp, #0x100]
0097dab4	stp x10,xzr,[sp, #0x108]
0097dab8	stur x9,[x28, #0x31]
0097dabc	strb wzr,[sp, #0x110]
0097dac0	str x11,[sp, #0x48]
0097dac4	adrp x2,0x749000
0097dac8	add x2,x2,#0x7e2
0097dacc	add x0,sp,#0x78
0097dad0	add x1,sp,#0x100
0097dad4	add x3,sp,#0x48
0097dad8	add x4,sp,#0xf0
0097dadc	bl 0x00c32fb0
0097dae0	add x0,x0,#0x38
0097dae4	adrp x1,0x2af000
0097dae8	add x1,x1,#0x2db
0097daec	mov w2,#0x4
0097daf0	bl 0x00c31090
0097daf4	ldrb w8,[sp, #0x100]
0097daf8	tbz w8,#0x0,0x0097db04
0097dafc	ldr x0,[sp, #0x110]
0097db00	bl 0x00c301d0
0097db04	adrp x19,0xcb4000
0097db08	adrp x8,0xcb4000
0097db0c	ldr x19,[x19, #0xc90]
0097db10	ldr x8,[x8, #0xc88]
0097db14	add x21,sp,#0x100
0097db18	movi v0.2D,#0x0
0097db1c	add x25,x21,#0x80
0097db20	add x9,x8,#0x40
0097db24	add x8,x8,#0x18
0097db28	add x24,x19,#0x40
0097db2c	add x22,x21,#0x18
0097db30	mov v0.D[0x0],x8
0097db34	str x24,[sp, #0x110]
0097db38	str x9,[sp, #0x180]
0097db3c	str q0,[x28, #0x30]
0097db40	mov x0,x25
0097db44	mov x1,x22
0097db48	bl 0x00c30100
0097db4c	str xzr,[sp, #0x208]
0097db50	adrp x11,0xcb4000
0097db54	ldr x11,[x11, #0xa08]
0097db58	mov w8,#0xffffffff
0097db5c	fmov d0,x24
0097db60	str w8,[sp, #0x210]
0097db64	add x8,x11,#0x10
0097db68	add x27,x21,#0x20
0097db6c	add x9,x19,#0x18
0097db70	add x10,x19,#0x68
0097db74	mov v0.D[0x1],x8
0097db78	mov x0,x27
0097db7c	str x9,[sp, #0x100]
0097db80	str x10,[sp, #0x180]
0097db84	str q0,[x28, #0x40]
0097db88	bl 0x00c30480
0097db8c	movi v0.2D,#0x0
0097db90	stur q0,[x28, #0x78]
0097db94	stur q0,[x28, #0x68]
0097db98	stur q0,[x28, #0x58]
0097db9c	adrp x24,0xcb4000
0097dba0	ldr x24,[x24, #0xa00]
0097dba4	orr w8,wzr,#0x18
0097dba8	add x9,x24,#0x10
0097dbac	str x9,[sp, #0x118]
0097dbb0	stur q0,[x28, #0x98]
0097dbb4	stur q0,[x28, #0x88]
0097dbb8	str w8,[sp, #0x178]
0097dbbc	mov x0,x23
0097dbc0	bl 0x00c32e10
0097dbc4	ldrb w9,[x0]
0097dbc8	ldp x10,x11,[x0, #0x8]
0097dbcc	add x8,sp,#0x100
0097dbd0	add x28,x8,#0x10
0097dbd4	tst w9,#0x1
0097dbd8	lsr w8,w9,#0x1
0097dbdc	csinc x1,x11,x0,ne
0097dbe0	csel x2,x8,x10,eq
0097dbe4	mov x0,x28
0097dbe8	bl 0x00c30e90
0097dbec	adrp x1,0x2bc000
0097dbf0	add x1,x1,#0xda4
0097dbf4	mov w2,#0x1
0097dbf8	bl 0x00c30e90
0097dbfc	mov x21,x0
0097dc00	mov x0,x23
0097dc04	bl 0x00c32e30
0097dc08	mov w1,w0
0097dc0c	mov x0,x21
0097dc10	bl 0x00c31aa0
0097dc14	adrp x1,0x2a1000
0097dc18	add x1,x1,#0x9a2
0097dc1c	mov w2,#0x1
0097dc20	bl 0x00c30e90
0097dc24	ldrb w8,[x20, #0x18]
0097dc28	ldp x9,x10,[x20, #0x20]
0097dc2c	add x11,x20,#0x19
0097dc30	tst w8,#0x1
0097dc34	lsr w12,w8,#0x1
0097dc38	csel x1,x11,x10,eq
0097dc3c	csel x2,x12,x9,eq
0097dc40	bl 0x00c30e90
0097dc44	adrp x1,0x2a1000
0097dc48	add x1,x1,#0x9a2
0097dc4c	mov w2,#0x1
0097dc50	bl 0x00c30e90
0097dc54	adrp x10,0x2cc000
0097dc58	add x10,x10,#0xd84
0097dc5c	ldr x10,[x10]
0097dc60	mov x23,x0
0097dc64	mov w8,#0x14
0097dc68	mov w9,#0x746e
0097dc6c	add x11,sp,#0x48
0097dc70	stp xzr,xzr,[sp, #0x48]
0097dc74	str xzr,[sp, #0x58]
0097dc78	strb w8,[sp, #0x48]
0097dc7c	sturh w9,[sp, #0x51]
0097dc80	stur x10,[sp, #0x49]
0097dc84	strb wzr,[sp, #0x53]
0097dc88	str x11,[sp, #0xf0]
0097dc8c	adrp x2,0x749000
0097dc90	add x2,x2,#0x7e2
0097dc94	add x1,sp,#0x48
0097dc98	add x3,sp,#0xf0
0097dc9c	add x4,sp,#0xe8
0097dca0	mov x0,x26
0097dca4	bl 0x00c32fb0
0097dca8	ldrb w8,[x0, #0x38]
0097dcac	ldp x9,x10,[x0, #0x40]
0097dcb0	add x11,x0,#0x39
0097dcb4	tst w8,#0x1
0097dcb8	lsr w12,w8,#0x1
0097dcbc	csel x1,x11,x10,eq
0097dcc0	csel x2,x12,x9,eq
0097dcc4	mov x0,x23
0097dcc8	bl 0x00c30e90
0097dccc	adrp x1,0x2a1000
0097dcd0	add x1,x1,#0x9a2
0097dcd4	mov w2,#0x1
0097dcd8	bl 0x00c30e90
0097dcdc	ldrb w8,[x20]
0097dce0	ldp x10,x9,[x20, #0x8]
0097dce4	tst w8,#0x1
0097dce8	lsr w11,w8,#0x1
0097dcec	csinc x1,x9,x20,ne
0097dcf0	csel x2,x11,x10,eq
0097dcf4	bl 0x00c30e90
0097dcf8	adrp x1,0x2a1000
0097dcfc	add x1,x1,#0x9a2
0097dd00	mov w2,#0x1
0097dd04	bl 0x00c30e90
0097dd08	ldrb w8,[sp, #0xb0]
0097dd0c	ldr x9,[sp, #0xb8]
0097dd10	lsr w10,w8,#0x1
0097dd14	tst w8,#0x1
0097dd18	csel x1,x10,x9,eq
0097dd1c	bl 0x00c32df0
0097dd20	ldrb w8,[sp, #0x48]
0097dd24	ldr x26,[sp, #0x8]
0097dd28	tbz w8,#0x0,0x0097dd34
0097dd2c	ldr x0,[sp, #0x58]
0097dd30	bl 0x00c301d0
0097dd34	add x8,sp,#0x48
0097dd38	mov x0,x22
0097dd3c	bl 0x00c30e20
0097dd40	ldr x0,[sp, #0x20]
0097dd44	add x1,sp,#0x48
0097dd48	bl 0x00c33350
0097dd4c	ldrb w8,[sp, #0x48]
0097dd50	tbz w8,#0x0,0x0097dd5c
0097dd54	ldr x0,[sp, #0x58]
0097dd58	bl 0x00c301d0
0097dd5c	adrp x9,0x2b9000
0097dd60	add x9,x9,#0x5c0
0097dd64	ldr x10,[x9]
0097dd68	ldur x9,[x9, #0x5]
0097dd6c	mov w8,#0x1a
0097dd70	add x11,sp,#0x48
0097dd74	stp xzr,xzr,[sp, #0x48]
0097dd78	str xzr,[sp, #0x58]
0097dd7c	strb w8,[sp, #0x48]
0097dd80	stur x10,[sp, #0x49]
0097dd84	stur x9,[sp, #0x4e]
0097dd88	strb wzr,[sp, #0x56]
0097dd8c	str x11,[sp, #0xf0]
0097dd90	adrp x2,0x749000
0097dd94	add x2,x2,#0x7e2
0097dd98	add x0,sp,#0x78
0097dd9c	add x1,sp,#0x48
0097dda0	add x3,sp,#0xf0
0097dda4	add x4,sp,#0xe8
0097dda8	bl 0x00c32fb0
0097ddac	add x0,x0,#0x38
0097ddb0	adrp x1,0x2c6000
0097ddb4	add x1,x1,#0xe43
0097ddb8	mov w2,#0x4
0097ddbc	bl 0x00c31090
0097ddc0	ldrb w8,[sp, #0x48]
0097ddc4	tbz w8,#0x0,0x0097ddd0
0097ddc8	ldr x0,[sp, #0x58]
0097ddcc	bl 0x00c301d0
0097ddd0	mov w8,#0xc8
0097ddd4	str w8,[sp, #0x48]
0097ddd8	str wzr,[sp, #0xf0]
0097dddc	ldr x8,[sp, #0x30]
0097dde0	adrp x1,0x2af000
0097dde4	add x1,x1,#0x2e0
0097dde8	add x0,sp,#0x48
0097ddec	add x2,sp,#0xf0
0097ddf0	add x3,sp,#0x78
0097ddf4	add x4,sp,#0xb0
0097ddf8	bl 0x00c332b0
0097ddfc	add x8,x19,#0x18
0097de00	str x8,[sp, #0x100]
0097de04	ldrb w8,[sp, #0x158]
0097de08	add x9,x19,#0x68
0097de0c	add x10,x19,#0x40
0097de10	add x11,x24,#0x10
0097de14	str x9,[sp, #0x180]
0097de18	stp x10,x11,[sp, #0x110]
0097de1c	tbz w8,#0x0,0x0097de28
0097de20	ldr x0,[sp, #0x168]
0097de24	bl 0x00c301d0
0097de28	adrp x8,0xcb4000
0097de2c	ldr x8,[x8, #0xa08]
0097de30	mov x0,x27
0097de34	add x8,x8,#0x10
0097de38	str x8,[sp, #0x118]
0097de3c	bl 0x00c30090
0097de40	mov x0,x25
0097de44	bl 0x00c30ee0
0097de48	ldrb w8,[sp, #0xd0]
0097de4c	ldr x19,[sp, #0x38]
0097de50	ldr x20,[sp, #0x28]
0097de54	tbz w8,#0x0,0x0097de60
0097de58	ldr x0,[sp, #0xe0]
0097de5c	bl 0x00c301d0
0097de60	ldrb w8,[sp, #0xb0]
0097de64	ldr x27,[sp, #0x18]
0097de68	tbz w8,#0x0,0x0097de74
0097de6c	ldr x0,[sp, #0xc0]
0097de70	bl 0x00c301d0
0097de74	ldr w8,[sp, #0x14]
0097de78	cbz w8,0x0097de84
0097de7c	mov x0,x26
0097de80	bl 0x00c301d0
0097de84	ldrb w8,[sp, #0x60]
0097de88	tbz w8,#0x0,0x0097de94
0097de8c	ldr x0,[sp, #0x70]
0097de90	bl 0x00c301d0
0097de94	ldr x1,[sp, #0x80]
0097de98	add x0,sp,#0x78
0097de9c	bl 0x00c32fc0
0097dea0	ldrb w8,[sp, #0x90]
0097dea4	tbz w8,#0x0,0x0097deb0
0097dea8	ldr x0,[sp, #0xa0]
0097deac	bl 0x00c301d0
0097deb0	cbz x19,0x0097dee4
0097deb4	add x8,x19,#0x8
0097deb8	ldaxr x9,[x8]
0097debc	sub x10,x9,#0x1
0097dec0	stlxr w11,x10,[x8]
0097dec4	cbnz w11,0x0097deb8
0097dec8	cbnz x9,0x0097dee4
0097decc	ldr x8,[x19]
0097ded0	mov x0,x19
0097ded4	ldr x8,[x8, #0x10]
0097ded8	blr x8
0097dedc	mov x0,x19
0097dee0	bl 0x00c2ff00
0097dee4	cbz x27,0x0097df18
0097dee8	add x8,x27,#0x8
0097deec	ldaxr x9,[x8]
0097def0	sub x10,x9,#0x1
0097def4	stlxr w11,x10,[x8]
0097def8	cbnz w11,0x0097deec
0097defc	cbnz x9,0x0097df18
0097df00	ldr x8,[x27]
0097df04	mov x0,x27
0097df08	ldr x8,[x8, #0x10]
0097df0c	blr x8
0097df10	mov x0,x27
0097df14	bl 0x00c2ff00
0097df18	ldr x8,[x20, #0x28]
0097df1c	ldr x9,[sp, #0x40]
0097df20	cmp x8,x9
0097df24	b.ne 0x0097df68
0097df28	add sp,sp,#0x270
0097df2c	ldp x29,x30,[sp, #0x50]
0097df30	ldp x20,x19,[sp, #0x40]
0097df34	ldp x22,x21,[sp, #0x30]
0097df38	ldp x24,x23,[sp, #0x20]
0097df3c	ldp x26,x25,[sp, #0x10]
0097df40	ldp x28,x27,[sp], #0x60
0097df44	ret
0097df48	cmp x0,x21
0097df4c	b.eq 0x0097da94
0097df50	sub x8,x0,x19
0097df54	cmn x8,#0x1
0097df58	b.ne 0x0097d90c
0097df5c	b 0x0097da94
0097df60	add x0,sp,#0xd0
0097df64	bl 0x00c30ce0
0097df68	bl 0x00c2fec0
0097df6c	add x0,sp,#0x100
0097df70	bl 0x00c30bd0
0097df74	add x0,sp,#0x90
0097df78	bl 0x00c30ce0
0097df7c	add x8,sp,#0xb0
0097df80	add x0,x8,#0x8
0097df84	bl 0x00c30bd0
0097df88	add x0,sp,#0xb0
0097df8c	bl 0x00c30ce0
0097df90	add x0,sp,#0xd0
0097df94	bl 0x00c30ce0
0097df98	add x8,sp,#0xb0
0097df9c	add x0,x8,#0x8
0097dfa0	bl 0x00c30bd0
