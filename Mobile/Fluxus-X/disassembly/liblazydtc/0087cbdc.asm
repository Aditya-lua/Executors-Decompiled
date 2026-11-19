; FUN_0087cbdc @ 0087cbdc
0087cbdc	sub sp,sp,#0xd0
0087cbe0	stp d9,d8,[sp, #0x90]
0087cbe4	stp x29,x30,[sp, #0xa0]
0087cbe8	str x21,[sp, #0xb0]
0087cbec	stp x20,x19,[sp, #0xc0]
0087cbf0	add x29,sp,#0xa0
0087cbf4	mrs x19,tpidr_el0
0087cbf8	sub w9,w1,#0x2
0087cbfc	ldr x10,[x19, #0x28]
0087cc00	cmp w9,#0x5b
0087cc04	stur x10,[x29, #-0x18]
0087cc08	b.hi 0x0087db54
0087cc0c	adrp x10,0x363000
0087cc10	add x10,x10,#0x532
0087cc14	adr x11,0x87cc24
0087cc18	ldrh w12,[x10, x9, LSL #0x1]
0087cc1c	add x11,x11,x12, LSL #0x2
0087cc20	br x11
0087cc24	cmp x3,#0x1
0087cc28	b.ne 0x0087db54
0087cc2c	ldr w9,[x2]
0087cc30	cmp w9,#0x3
0087cc34	b.ne 0x0087db54
0087cc38	ldr d1,[x2, #0x8]
0087cc3c	movi v0.2D,#0x0
0087cc40	str w9,[x8]
0087cc44	fabs d1,d1
0087cc48	b 0x0087d9b4
0087cc4c	cmp x3,#0x1
0087cc50	b.ne 0x0087db54
0087cc54	ldr w9,[x2]
0087cc58	cmp w9,#0x3
0087cc5c	b.ne 0x0087db54
0087cc60	ldr d0,[x2, #0x8]
0087cc64	movi d1,#0x0
0087cc68	movi v2.2D,#0x0
0087cc6c	str w9,[x8]
0087cc70	fcmp d0,#0.0
0087cc74	fmov d0,-0x4010000000000000
0087cc78	fcsel d0,d0,d1,mi
0087cc7c	fmov d1,0x3ff0000000000000
0087cc80	fcsel d0,d1,d0,gt
0087cc84	stur q2,[x8, #0x4]
0087cc88	stur q2,[x8, #0x14]
0087cc8c	b 0x0087cf80
0087cc90	cmp x3,#0x1
0087cc94	b.ne 0x0087db54
0087cc98	ldr w9,[x2]
0087cc9c	cmp w9,#0x3
0087cca0	b.ne 0x0087db54
0087cca4	movi v0.2D,#0x0
0087cca8	ldr x9,[x2, #0x8]
0087ccac	mov w10,#0x2
0087ccb0	str w10,[x8]
0087ccb4	mov x10,#0x7ff0000000000000
0087ccb8	and x9,x9,#0x7fffffffffffffff
0087ccbc	cmp x9,x10
0087ccc0	stur q0,[x8, #0x4]
0087ccc4	cset w9,lt
0087ccc8	b 0x0087d788
0087cccc	cmp x3,#0x2
0087ccd0	b.ne 0x0087db54
0087ccd4	ldr w9,[x2]
0087ccd8	cmp w9,#0x3
0087ccdc	b.ne 0x0087db54
0087cce0	ldr w9,[x2, #0x28]
0087cce4	cmp w9,#0x3
0087cce8	b.ne 0x0087db54
0087ccec	ldr d0,[x2, #0x30]
0087ccf0	fcvtzs w9,d0
0087ccf4	cmp w9,#0x1f
0087ccf8	b.hi 0x0087db54
0087ccfc	ldr d0,[x2, #0x8]
0087cd00	fcvtzs x10,d0
0087cd04	movi v0.2D,#0x0
0087cd08	lsl w9,w10,w9
0087cd0c	b 0x0087d9a8
0087cd10	cmp x3,#0x1
0087cd14	b.ne 0x0087db54
0087cd18	ldr w9,[x2]
0087cd1c	cmp w9,#0x6
0087cd20	b.ne 0x0087db54
0087cd24	ldr s1,[x2, #0x4]
0087cd28	mov w9,#0x3
0087cd2c	movi v0.2D,#0x0
0087cd30	str w9,[x8]
0087cd34	ucvtf d1,d1
0087cd38	b 0x0087d9b4
0087cd3c	cmp x3,#0x7f
0087cd40	b.hi 0x0087db54
0087cd44	movi v0.2D,#0x0
0087cd48	stp q0,q0,[sp]
0087cd4c	stp q0,q0,[sp, #0x20]
0087cd50	stp q0,q0,[sp, #0x40]
0087cd54	stp q0,q0,[sp, #0x60]
0087cd58	cbz x3,0x0087d878
0087cd5c	mov x9,xzr
0087cd60	add x10,x2,#0x8
0087cd64	mov x11,sp
0087cd68	ldur w12,[x10, #-0x8]
0087cd6c	cmp w12,#0x3
0087cd70	b.ne 0x0087d818
0087cd74	ldr d0,[x10]
0087cd78	fcvtzs w12,d0
0087cd7c	cmp w12,#0x100
0087cd80	b.cs 0x0087d818
0087cd84	strb w12,[x11, x9]
0087cd88	add x9,x9,#0x1
0087cd8c	add x10,x10,#0x28
0087cd90	cmp x3,x9
0087cd94	b.ne 0x0087cd68
0087cd98	mov x1,sp
0087cd9c	mov x2,x3
0087cda0	mov x20,x8
0087cda4	mov x21,x3
0087cda8	bl 0x008530cc
0087cdac	mov w8,#0x6
0087cdb0	stp xzr,xzr,[x20, #0x18]
0087cdb4	stp w8,w21,[x20]
0087cdb8	stp x0,xzr,[x20, #0x8]
0087cdbc	b 0x0087d9c4
0087cdc0	cmp x3,#0x1
0087cdc4	b.ne 0x0087db54
0087cdc8	ldr w9,[x2]
0087cdcc	cbz w9,0x0087db54
0087cdd0	ldr x9,[x19, #0x28]
0087cdd4	ldur x10,[x29, #-0x18]
0087cdd8	cmp x9,x10
0087cddc	b.ne 0x0087db88
0087cde0	mov x0,x2
0087cde4	ldp x20,x19,[sp, #0xc0]
0087cde8	ldr x21,[sp, #0xb0]
0087cdec	ldp x29,x30,[sp, #0xa0]
0087cdf0	ldp d9,d8,[sp, #0x90]
0087cdf4	add sp,sp,#0xd0
0087cdf8	b 0x0087db8c
0087cdfc	cmp x3,#0x1
0087ce00	b.ne 0x0087db54
0087ce04	ldr w9,[x2]
0087ce08	cmp w9,#0x3
0087ce0c	b.ne 0x0087db54
0087ce10	ldr d0,[x2, #0x8]
0087ce14	fcvtzs x9,d0
0087ce18	movi v0.2D,#0x0
0087ce1c	mvn w9,w9
0087ce20	b 0x0087d9a8
0087ce24	cmp x3,#0x1
0087ce28	b.ne 0x0087db54
0087ce2c	ldr w9,[x2]
0087ce30	cmp w9,#0x3
0087ce34	b.ne 0x0087db54
0087ce38	ldr d1,[x2, #0x8]
0087ce3c	movi v0.2D,#0x0
0087ce40	str w9,[x8]
0087ce44	frinta d1,d1
0087ce48	b 0x0087d9b4
0087ce4c	cmp x3,#0x1
0087ce50	b.ne 0x0087db54
0087ce54	ldr w9,[x2]
0087ce58	cmp w9,#0x3
0087ce5c	b.ne 0x0087db54
0087ce60	adrp x9,0x29b000
0087ce64	ldr d1,[x2, #0x8]
0087ce68	movi v0.2D,#0x0
0087ce6c	ldr d2,[x9, #0xa38]
0087ce70	mov w9,#0x3
0087ce74	fmul d1,d1,d2
0087ce78	b 0x0087d450
0087ce7c	cmp x3,#0x3
0087ce80	b.cc 0x0087db54
0087ce84	ldr w9,[x2]
0087ce88	cmp w9,#0x3
0087ce8c	b.ne 0x0087db54
0087ce90	ldr w9,[x2, #0x28]
0087ce94	cmp w9,#0x3
0087ce98	b.ne 0x0087db54
0087ce9c	ldr w9,[x2, #0x50]
0087cea0	cmp w9,#0x3
0087cea4	b.ne 0x0087db54
0087cea8	cmp x3,#0x3
0087ceac	b.ne 0x0087d940
0087ceb0	mov w10,#0x1
0087ceb4	b 0x0087d954
0087ceb8	cmp x3,#0x1
0087cebc	b.ne 0x0087db54
0087cec0	ldr w9,[x2]
0087cec4	cmp w9,#0x3
0087cec8	b.ne 0x0087db54
0087cecc	ldr d0,[x2, #0x8]
0087ced0	movi v1.2D,#0x0
0087ced4	fsqrt d0,d0
0087ced8	b 0x0087cf74
0087cedc	cmp x3,#0x1
0087cee0	b.ne 0x0087db54
0087cee4	ldr w9,[x2]
0087cee8	cmp w9,#0x3
0087ceec	b.ne 0x0087db54
0087cef0	ldr d0,[x2, #0x8]
0087cef4	mov x20,x8
0087cef8	bl 0x00c30790
0087cefc	b 0x0087d690
0087cf00	cbz x3,0x0087db54
0087cf04	ldr w9,[x2]
0087cf08	cmp w9,#0x3
0087cf0c	b.ne 0x0087db54
0087cf10	ldr d0,[x2, #0x8]
0087cf14	subs x10,x3,#0x1
0087cf18	fcvtzs x9,d0
0087cf1c	b.eq 0x0087d6f4
0087cf20	add x11,x2,#0x30
0087cf24	ldur w12,[x11, #-0x8]
0087cf28	cmp w12,#0x3
0087cf2c	b.ne 0x0087db54
0087cf30	ldr d0,[x11], #0x28
0087cf34	subs x10,x10,#0x1
0087cf38	fcvtzs x12,d0
0087cf3c	and w9,w9,w12
0087cf40	b.ne 0x0087cf24
0087cf44	b 0x0087d6f4
0087cf48	cmp x3,#0x1
0087cf4c	b.ne 0x0087db54
0087cf50	ldr w9,[x2]
0087cf54	cmp w9,#0x3
0087cf58	b.ne 0x0087db54
0087cf5c	adrp x9,0x29b000
0087cf60	ldr d0,[x2, #0x8]
0087cf64	ldr d1,[x9, #0xa38]
0087cf68	mov w9,#0x3
0087cf6c	fdiv d0,d0,d1
0087cf70	movi v1.2D,#0x0
0087cf74	str w9,[x8]
0087cf78	stur q1,[x8, #0x4]
0087cf7c	stur q1,[x8, #0x14]
0087cf80	str wzr,[x8, #0x24]
0087cf84	str d0,[x8, #0x8]
0087cf88	b 0x0087d9c4
0087cf8c	cmp x3,#0x1
0087cf90	b.ne 0x0087db54
0087cf94	ldr w9,[x2]
0087cf98	cmp w9,#0x3
0087cf9c	b.ne 0x0087db54
0087cfa0	ldr d0,[x2, #0x8]
0087cfa4	mov x20,x8
0087cfa8	bl 0x00c307a0
0087cfac	b 0x0087d690
0087cfb0	cmp x3,#0x1
0087cfb4	b.ne 0x0087db54
0087cfb8	ldr w9,[x2]
0087cfbc	cmp w9,#0x3
0087cfc0	b.ne 0x0087db54
0087cfc4	ldr d0,[x2, #0x8]
0087cfc8	mov x20,x8
0087cfcc	bl 0x00c307b0
0087cfd0	b 0x0087d690
0087cfd4	cmp x3,#0x1
0087cfd8	b.ne 0x0087db54
0087cfdc	ldr w9,[x2]
0087cfe0	cbz w9,0x0087db54
0087cfe4	ldr x9,[x19, #0x28]
0087cfe8	ldur x10,[x29, #-0x18]
0087cfec	cmp x9,x10
0087cff0	b.ne 0x0087db88
0087cff4	mov x0,x2
0087cff8	ldp x20,x19,[sp, #0xc0]
0087cffc	ldr x21,[sp, #0xb0]
0087d000	ldp x29,x30,[sp, #0xa0]
0087d004	ldp d9,d8,[sp, #0x90]
0087d008	add sp,sp,#0xd0
0087d00c	b 0x0087dc5c
0087d010	cmp x3,#0x1
0087d014	b.ne 0x0087db54
0087d018	ldr w9,[x2]
0087d01c	cmp w9,#0x3
0087d020	b.ne 0x0087db54
0087d024	ldr d1,[x2, #0x8]
0087d028	movi v0.2D,#0x0
0087d02c	str w9,[x8]
0087d030	frintm d1,d1
0087d034	b 0x0087d9b4
0087d038	cbz x3,0x0087db54
0087d03c	ldr w9,[x2]
0087d040	cmp w9,#0x3
0087d044	b.ne 0x0087db54
0087d048	ldr d0,[x2, #0x8]
0087d04c	subs x10,x3,#0x1
0087d050	fcvtzs x9,d0
0087d054	b.eq 0x0087d6f4
0087d058	add x11,x2,#0x30
0087d05c	ldur w12,[x11, #-0x8]
0087d060	cmp w12,#0x3
0087d064	b.ne 0x0087db54
0087d068	ldr d0,[x11], #0x28
0087d06c	subs x10,x10,#0x1
0087d070	fcvtzs x12,d0
0087d074	eor w9,w9,w12
0087d078	b.ne 0x0087d05c
0087d07c	b 0x0087d6f4
0087d080	cmp x3,#0x2
0087d084	b.ne 0x0087db54
0087d088	ldr w9,[x2]
0087d08c	cmp w9,#0x3
0087d090	b.ne 0x0087db54
0087d094	ldr w9,[x2, #0x28]
0087d098	cmp w9,#0x3
0087d09c	b.ne 0x0087db54
0087d0a0	ldr d0,[x2, #0x8]
0087d0a4	ldr d1,[x2, #0x30]
0087d0a8	mov x20,x8
0087d0ac	bl 0x00c307c0
0087d0b0	b 0x0087d690
0087d0b4	cbz x3,0x0087db54
0087d0b8	ldr w9,[x2]
0087d0bc	cmp w9,#0x3
0087d0c0	b.ne 0x0087db54
0087d0c4	ldr d0,[x2, #0x8]
0087d0c8	subs x10,x3,#0x1
0087d0cc	fcvtzs x9,d0
0087d0d0	b.eq 0x0087d0f8
0087d0d4	add x11,x2,#0x30
0087d0d8	ldur w12,[x11, #-0x8]
0087d0dc	cmp w12,#0x3
0087d0e0	b.ne 0x0087db54
0087d0e4	ldr d0,[x11], #0x28
0087d0e8	subs x10,x10,#0x1
0087d0ec	fcvtzs x12,d0
0087d0f0	and w9,w9,w12
0087d0f4	b.ne 0x0087d0d8
0087d0f8	movi v0.2D,#0x0
0087d0fc	cmp w9,#0x0
0087d100	mov w10,#0x2
0087d104	cset w9,ne
0087d108	str wzr,[x8, #0x24]
0087d10c	str w10,[x8]
0087d110	stur q0,[x8, #0x4]
0087d114	stur q0,[x8, #0x14]
0087d118	strb w9,[x8, #0x8]
0087d11c	b 0x0087d9c4
0087d120	cmp x3,#0x2
0087d124	b.ne 0x0087db54
0087d128	ldr w9,[x2]
0087d12c	cmp w9,#0x3
0087d130	b.ne 0x0087db54
0087d134	ldr w9,[x2, #0x28]
0087d138	cmp w9,#0x3
0087d13c	b.ne 0x0087db54
0087d140	ldr d0,[x2, #0x30]
0087d144	ldr d1,[x2, #0x8]
0087d148	fcvtzs w9,d0
0087d14c	fcvtzs x10,d1
0087d150	movi v0.2D,#0x0
0087d154	neg w9,w9
0087d158	ror w9,w10,w9
0087d15c	b 0x0087d9a8
0087d160	cmp x3,#0x1
0087d164	b.ne 0x0087db54
0087d168	ldr w9,[x2]
0087d16c	cmp w9,#0x3
0087d170	b.ne 0x0087db54
0087d174	ldr d0,[x2, #0x8]
0087d178	mov x20,x8
0087d17c	bl 0x00c307d0
0087d180	b 0x0087d690
0087d184	cmp x3,#0x1
0087d188	b.ne 0x0087db54
0087d18c	ldr w9,[x2]
0087d190	cmp w9,#0x3
0087d194	b.ne 0x0087db54
0087d198	ldr d0,[x2, #0x8]
0087d19c	mov x20,x8
0087d1a0	bl 0x00c307e0
0087d1a4	b 0x0087d690
0087d1a8	cmp x3,#0x2
0087d1ac	b.ne 0x0087db54
0087d1b0	ldr w9,[x2]
0087d1b4	cmp w9,#0x3
0087d1b8	b.ne 0x0087db54
0087d1bc	ldr w9,[x2, #0x28]
0087d1c0	cmp w9,#0x3
0087d1c4	b.ne 0x0087db54
0087d1c8	ldr d0,[x2, #0x30]
0087d1cc	mov x20,x8
0087d1d0	fcvtzs w0,d0
0087d1d4	ldr d0,[x2, #0x8]
0087d1d8	bl 0x00c307f0
0087d1dc	b 0x0087d690
0087d1e0	cmp x3,#0x1
0087d1e4	b.ne 0x0087db54
0087d1e8	ldr w9,[x2]
0087d1ec	cmp w9,#0x3
0087d1f0	b.ne 0x0087db54
0087d1f4	ldr d0,[x2, #0x8]
0087d1f8	mov x20,x8
0087d1fc	bl 0x00c30800
0087d200	b 0x0087d690
0087d204	cmp x3,#0x2
0087d208	b.ne 0x0087db54
0087d20c	ldr w9,[x2]
0087d210	cmp w9,#0x3
0087d214	b.ne 0x0087db54
0087d218	ldr w9,[x2, #0x28]
0087d21c	cmp w9,#0x3
0087d220	b.ne 0x0087db54
0087d224	ldr d0,[x2, #0x8]
0087d228	ldr d1,[x2, #0x30]
0087d22c	mov x20,x8
0087d230	bl 0x00c30810
0087d234	b 0x0087d690
0087d238	cmp x3,#0x2
0087d23c	b.cc 0x0087db54
0087d240	ldr w9,[x2]
0087d244	cmp w9,#0x6
0087d248	b.ne 0x0087db54
0087d24c	ldr w9,[x2, #0x28]
0087d250	cmp w9,#0x3
0087d254	b.ne 0x0087db54
0087d258	cmp x3,#0x2
0087d25c	b.ne 0x0087d828
0087d260	ldr w9,[x2, #0x4]
0087d264	mov w10,w9
0087d268	b 0x0087d840
0087d26c	cmp x3,#0x2
0087d270	b.cc 0x0087db54
0087d274	ldr w9,[x2]
0087d278	cmp w9,#0x3
0087d27c	b.ne 0x0087db54
0087d280	ldr w9,[x2, #0x28]
0087d284	cmp w9,#0x3
0087d288	b.ne 0x0087db54
0087d28c	cmp x3,#0x4
0087d290	tbz w4,#0x0,0x0087d8a4
0087d294	b.eq 0x0087dabc
0087d298	cmp x3,#0x3
0087d29c	b.eq 0x0087da44
0087d2a0	cmp x3,#0x2
0087d2a4	b.ne 0x0087db54
0087d2a8	adrp x9,0x29a000
0087d2ac	ldr d1,[x2, #0x8]
0087d2b0	ldr d2,[x2, #0x30]
0087d2b4	ldr d0,[x9, #0x850]
0087d2b8	str d2,[x8, #0x10]
0087d2bc	stp d0,d1,[x8]
0087d2c0	ldr x9,[x19, #0x28]
0087d2c4	ldur x10,[x29, #-0x18]
0087d2c8	cmp x9,x10
0087d2cc	b.ne 0x0087db88
0087d2d0	stp xzr,xzr,[x8, #0x18]
0087d2d4	b 0x0087db70
0087d2d8	cmp x3,#0x1
0087d2dc	b.ne 0x0087db54
0087d2e0	ldr w9,[x2]
0087d2e4	cmp w9,#0x3
0087d2e8	b.ne 0x0087db54
0087d2ec	ldr d0,[x2, #0x8]
0087d2f0	mov x20,x8
0087d2f4	bl 0x00c30820
0087d2f8	b 0x0087d690
0087d2fc	cmp x3,#0x1
0087d300	b.ne 0x0087db54
0087d304	ldr w9,[x2]
0087d308	cmp w9,#0x3
0087d30c	b.ne 0x0087db54
0087d310	ldr d0,[x2, #0x8]
0087d314	mov x20,x8
0087d318	bl 0x00c30830
0087d31c	b 0x0087d690
0087d320	cmp x3,#0x1
0087d324	b.ne 0x0087db54
0087d328	ldr w9,[x2]
0087d32c	cmp w9,#0x3
0087d330	b.ne 0x0087db54
0087d334	movi v0.2D,#0x0
0087d338	ldr x9,[x2, #0x8]
0087d33c	mov w10,#0x2
0087d340	str w10,[x8]
0087d344	mov x10,#0x7ff0000000000000
0087d348	and x9,x9,#0x7fffffffffffffff
0087d34c	cmp x9,x10
0087d350	stur q0,[x8, #0x4]
0087d354	cset w9,eq
0087d358	b 0x0087d788
0087d35c	cmp x3,#0x2
0087d360	b.ne 0x0087db54
0087d364	ldr w9,[x2]
0087d368	cmp w9,#0x3
0087d36c	b.ne 0x0087db54
0087d370	ldr w9,[x2, #0x28]
0087d374	cmp w9,#0x3
0087d378	b.ne 0x0087db54
0087d37c	ldr d0,[x2, #0x30]
0087d380	fcvtzs w9,d0
0087d384	cmp w9,#0x1f
0087d388	b.hi 0x0087db54
0087d38c	ldr d0,[x2, #0x8]
0087d390	fcvtzs x10,d0
0087d394	movi v0.2D,#0x0
0087d398	asr w9,w10,w9
0087d39c	b 0x0087d9a8
0087d3a0	cmp x3,#0x3
0087d3a4	b.ne 0x0087db54
0087d3a8	ldr w9,[x2]
0087d3ac	cmp w9,#0x3
0087d3b0	b.ne 0x0087db54
0087d3b4	ldr w9,[x2, #0x28]
0087d3b8	cmp w9,#0x3
0087d3bc	b.ne 0x0087db54
0087d3c0	ldr w9,[x2, #0x50]
0087d3c4	cmp w9,#0x3
0087d3c8	b.ne 0x0087db54
0087d3cc	fmov d0,0x3ff0000000000000
0087d3d0	ldr d1,[x2, #0x58]
0087d3d4	fcmp d1,d0
0087d3d8	ldr d0,[x2, #0x30]
0087d3dc	b.eq 0x0087d5f0
0087d3e0	ldr d2,[x2, #0x8]
0087d3e4	fsub d0,d0,d2
0087d3e8	fmadd d0,d0,d1,d2
0087d3ec	b 0x0087d5f0
0087d3f0	cmp x3,#0x1
0087d3f4	b.ne 0x0087db54
0087d3f8	ldr w9,[x2]
0087d3fc	cmp w9,#0x3
0087d400	b.ne 0x0087db54
0087d404	ldr d1,[x2, #0x8]
0087d408	movi v0.2D,#0x0
0087d40c	str w9,[x8]
0087d410	frintp d1,d1
0087d414	b 0x0087d9b4
0087d418	cmp x3,#0x2
0087d41c	b.eq 0x0087d798
0087d420	cmp x3,#0x1
0087d424	b.ne 0x0087db54
0087d428	ldr w9,[x2]
0087d42c	cmp w9,#0x6
0087d430	b.ne 0x0087db54
0087d434	ldr w9,[x2, #0x4]
0087d438	cbz w9,0x0087db54
0087d43c	ldr x9,[x2, #0x8]
0087d440	movi v0.2D,#0x0
0087d444	ldr b1,[x9]
0087d448	ucvtf d1,d1
0087d44c	mov w9,#0x3
0087d450	str w9,[x8]
0087d454	b 0x0087d9b4
0087d458	cmp x3,#0x2
0087d45c	b.cc 0x0087db54
0087d460	ldr w9,[x2]
0087d464	cmp w9,#0x3
0087d468	b.ne 0x0087db54
0087d46c	ldr w9,[x2, #0x28]
0087d470	cmp w9,#0x3
0087d474	b.ne 0x0087db54
0087d478	cmp x3,#0x2
0087d47c	b.ne 0x0087d8ec
0087d480	mov w10,#0x1
0087d484	b 0x0087d900
0087d488	cmp x3,#0x2
0087d48c	b.eq 0x0087d7e0
0087d490	cmp x3,#0x1
0087d494	b.ne 0x0087db54
0087d498	ldr w9,[x2]
0087d49c	cmp w9,#0x3
0087d4a0	b.ne 0x0087db54
0087d4a4	ldr d0,[x2, #0x8]
0087d4a8	mov x20,x8
0087d4ac	bl 0x00c30840
0087d4b0	b 0x0087d690
0087d4b4	cbz x3,0x0087db54
0087d4b8	ldr w9,[x2]
0087d4bc	cmp w9,#0x3
0087d4c0	b.ne 0x0087db54
0087d4c4	ldr d0,[x2, #0x8]
0087d4c8	subs x9,x3,#0x1
0087d4cc	b.eq 0x0087d5f0
0087d4d0	add x10,x2,#0x30
0087d4d4	ldur w11,[x10, #-0x8]
0087d4d8	cmp w11,#0x3
0087d4dc	b.ne 0x0087db54
0087d4e0	ldr d1,[x10], #0x28
0087d4e4	fcmp d1,d0
0087d4e8	fcsel d0,d1,d0,gt
0087d4ec	subs x9,x9,#0x1
0087d4f0	b.ne 0x0087d4d4
0087d4f4	b 0x0087d5f0
0087d4f8	cmp x3,#0x1
0087d4fc	b.ne 0x0087db54
0087d500	ldr w9,[x2]
0087d504	cmp w9,#0x3
0087d508	b.ne 0x0087db54
0087d50c	ldr d0,[x2, #0x8]
0087d510	mov x20,x8
0087d514	bl 0x00c30850
0087d518	b 0x0087d690
0087d51c	cmp x3,#0x1
0087d520	b.ne 0x0087db54
0087d524	ldr w9,[x2]
0087d528	cmp w9,#0x3
0087d52c	b.ne 0x0087db54
0087d530	ldr d0,[x2, #0x8]
0087d534	mov x20,x8
0087d538	bl 0x00c30860
0087d53c	b 0x0087d690
0087d540	cmp x3,#0x2
0087d544	b.ne 0x0087db54
0087d548	ldr w9,[x2]
0087d54c	cmp w9,#0x3
0087d550	b.ne 0x0087db54
0087d554	ldr w9,[x2, #0x28]
0087d558	cmp w9,#0x3
0087d55c	b.ne 0x0087db54
0087d560	ldr d0,[x2, #0x8]
0087d564	ldr d1,[x2, #0x30]
0087d568	fcvtzs x9,d0
0087d56c	fcvtzs w10,d1
0087d570	movi v0.2D,#0x0
0087d574	ror w9,w9,w10
0087d578	b 0x0087d9a8
0087d57c	cmp x3,#0x2
0087d580	b.ne 0x0087db54
0087d584	ldr w9,[x2]
0087d588	cmp w9,#0x3
0087d58c	b.ne 0x0087db54
0087d590	ldr w9,[x2, #0x28]
0087d594	cmp w9,#0x3
0087d598	b.ne 0x0087db54
0087d59c	ldr d0,[x2, #0x8]
0087d5a0	ldr d1,[x2, #0x30]
0087d5a4	mov x20,x8
0087d5a8	bl 0x00c30770
0087d5ac	b 0x0087d690
0087d5b0	cbz x3,0x0087db54
0087d5b4	ldr w9,[x2]
0087d5b8	cmp w9,#0x3
0087d5bc	b.ne 0x0087db54
0087d5c0	ldr d0,[x2, #0x8]
0087d5c4	subs x9,x3,#0x1
0087d5c8	b.eq 0x0087d5f0
0087d5cc	add x10,x2,#0x30
0087d5d0	ldur w11,[x10, #-0x8]
0087d5d4	cmp w11,#0x3
0087d5d8	b.ne 0x0087db54
0087d5dc	ldr d1,[x10], #0x28
0087d5e0	fcmp d1,d0
0087d5e4	fcsel d0,d1,d0,mi
0087d5e8	subs x9,x9,#0x1
0087d5ec	b.ne 0x0087d5d0
0087d5f0	movi v1.2D,#0x0
0087d5f4	mov w9,#0x3
0087d5f8	str wzr,[x8, #0x24]
0087d5fc	str w9,[x8]
0087d600	stur q1,[x8, #0x4]
0087d604	stur q1,[x8, #0x14]
0087d608	str d0,[x8, #0x8]
0087d60c	b 0x0087d9c4
0087d610	cmp x3,#0x3
0087d614	b.ne 0x0087db54
0087d618	ldr w9,[x2]
0087d61c	cmp w9,#0x3
0087d620	b.ne 0x0087db54
0087d624	ldr w9,[x2, #0x28]
0087d628	cmp w9,#0x3
0087d62c	b.ne 0x0087db54
0087d630	ldr w9,[x2, #0x50]
0087d634	cmp w9,#0x3
0087d638	b.ne 0x0087db54
0087d63c	ldr d1,[x2, #0x30]
0087d640	ldr d0,[x2, #0x58]
0087d644	fcmp d1,d0
0087d648	b.hi 0x0087db54
0087d64c	ldr d2,[x2, #0x8]
0087d650	mov w9,#0x3
0087d654	str w9,[x8]
0087d658	fcmp d2,d1
0087d65c	fcsel d1,d1,d2,mi
0087d660	movi v2.2D,#0x0
0087d664	fcmp d1,d0
0087d668	fcsel d0,d0,d1,gt
0087d66c	b 0x0087cc84
0087d670	cmp x3,#0x1
0087d674	b.ne 0x0087db54
0087d678	ldr w9,[x2]
0087d67c	cmp w9,#0x3
0087d680	b.ne 0x0087db54
0087d684	ldr d0,[x2, #0x8]
0087d688	mov x20,x8
0087d68c	bl 0x00c30870
0087d690	movi v1.2D,#0x0
0087d694	mov w8,#0x3
0087d698	str wzr,[x20, #0x24]
0087d69c	str w8,[x20]
0087d6a0	stur q1,[x20, #0x4]
0087d6a4	stur q1,[x20, #0x14]
0087d6a8	str d0,[x20, #0x8]
0087d6ac	b 0x0087d9c4
0087d6b0	cbz x3,0x0087db54
0087d6b4	ldr w9,[x2]
0087d6b8	cmp w9,#0x3
0087d6bc	b.ne 0x0087db54
0087d6c0	ldr d0,[x2, #0x8]
0087d6c4	subs x10,x3,#0x1
0087d6c8	fcvtzs x9,d0
0087d6cc	b.eq 0x0087d6f4
0087d6d0	add x11,x2,#0x30
0087d6d4	ldur w12,[x11, #-0x8]
0087d6d8	cmp w12,#0x3
0087d6dc	b.ne 0x0087db54
0087d6e0	ldr d0,[x11], #0x28
0087d6e4	subs x10,x10,#0x1
0087d6e8	fcvtzs x12,d0
0087d6ec	orr w9,w9,w12
0087d6f0	b.ne 0x0087d6d4
0087d6f4	movi v0.2D,#0x0
0087d6f8	ucvtf d1,w9
0087d6fc	mov w9,#0x3
0087d700	str wzr,[x8, #0x24]
0087d704	str w9,[x8]
0087d708	stur q0,[x8, #0x4]
0087d70c	stur q0,[x8, #0x14]
0087d710	b 0x0087d9c0
0087d714	cmp x3,#0x2
0087d718	b.ne 0x0087db54
0087d71c	ldr w9,[x2]
0087d720	cmp w9,#0x3
0087d724	b.ne 0x0087db54
0087d728	ldr w9,[x2, #0x28]
0087d72c	cmp w9,#0x3
0087d730	b.ne 0x0087db54
0087d734	ldr d0,[x2, #0x30]
0087d738	fcvtzs w9,d0
0087d73c	cmp w9,#0x1f
0087d740	b.hi 0x0087db54
0087d744	ldr d0,[x2, #0x8]
0087d748	fcvtzs x10,d0
0087d74c	movi v0.2D,#0x0
0087d750	lsr w9,w10,w9
0087d754	b 0x0087d9a8
0087d758	cmp x3,#0x1
0087d75c	b.ne 0x0087db54
0087d760	ldr w9,[x2]
0087d764	cmp w9,#0x3
0087d768	b.ne 0x0087db54
0087d76c	ldr d1,[x2, #0x8]
0087d770	movi v0.2D,#0x0
0087d774	mov w9,#0x2
0087d778	str w9,[x8]
0087d77c	fcmp d1,d1
0087d780	stur q0,[x8, #0x4]
0087d784	cset w9,vs
0087d788	stur q0,[x8, #0x14]
0087d78c	str wzr,[x8, #0x24]
0087d790	strb w9,[x8, #0x8]
0087d794	b 0x0087d9c4
0087d798	ldr w9,[x2]
0087d79c	cmp w9,#0x6
0087d7a0	b.ne 0x0087db54
0087d7a4	ldr w9,[x2, #0x28]
0087d7a8	cmp w9,#0x3
0087d7ac	b.ne 0x0087db54
0087d7b0	ldr d0,[x2, #0x30]
0087d7b4	fcvtzs w9,d0
0087d7b8	cmp w9,#0x1
0087d7bc	b.lt 0x0087db54
0087d7c0	ldr w10,[x2, #0x4]
0087d7c4	cmp w10,w9
0087d7c8	b.cc 0x0087db54
0087d7cc	ldr x10,[x2, #0x8]
0087d7d0	movi v0.2D,#0x0
0087d7d4	add x9,x10,w9, UXTW 
0087d7d8	ldur b1,[x9, #-0x1]
0087d7dc	b 0x0087d448
0087d7e0	ldr w9,[x2]
0087d7e4	cmp w9,#0x3
0087d7e8	b.ne 0x0087db54
0087d7ec	ldr w9,[x2, #0x28]
0087d7f0	cmp w9,#0x3
0087d7f4	b.ne 0x0087db54
0087d7f8	fmov d0,0x4000000000000000
0087d7fc	ldr d8,[x2, #0x30]
0087d800	fcmp d8,d0
0087d804	b.ne 0x0087d9d8
0087d808	ldr d0,[x2, #0x8]
0087d80c	mov x20,x8
0087d810	bl 0x00c30880
0087d814	b 0x0087d690
0087d818	movi v0.2D,#0x0
0087d81c	str xzr,[x8, #0x20]
0087d820	stp q0,q0,[x8]
0087d824	b 0x0087d9c4
0087d828	ldr w9,[x2, #0x50]
0087d82c	cmp w9,#0x3
0087d830	b.ne 0x0087db54
0087d834	ldr d0,[x2, #0x58]
0087d838	ldr w9,[x2, #0x4]
0087d83c	fcvtzs w10,d0
0087d840	add w11,w9,#0x1
0087d844	and w12,w11,w10, ASR #0x1f
0087d848	adds w10,w12,w10
0087d84c	b.le 0x0087d878
0087d850	ldr d0,[x2, #0x30]
0087d854	fcvtzs w12,d0
0087d858	and w11,w11,w12, ASR #0x1f
0087d85c	add w11,w11,w12
0087d860	cmp w11,#0x1
0087d864	csinc w11,w11,wzr,gt
0087d868	cmp w10,w9
0087d86c	csel w9,w10,w9,lt
0087d870	subs w9,w9,w11
0087d874	b.ge 0x0087da14
0087d878	fmov d0,xzr
0087d87c	adrp x9,0x29a000
0087d880	str xzr,[x8, #0x20]
0087d884	ldr d1,[x9, #0x9b0]
0087d888	adrp x9,0x2ab000
0087d88c	add x9,x9,#0x32c
0087d890	str x9,[x8, #0x8]
0087d894	mov v0.D[0x1],v0.D[0x0]
0087d898	str d1,[x8]
0087d89c	str q0,[x8, #0x10]
0087d8a0	b 0x0087d9c4
0087d8a4	b.eq 0x0087dafc
0087d8a8	cmp x3,#0x3
0087d8ac	b.eq 0x0087da74
0087d8b0	cmp x3,#0x2
0087d8b4	b.ne 0x0087db54
0087d8b8	ldr d0,[x2, #0x8]
0087d8bc	ldr d2,[x2, #0x30]
0087d8c0	movi v1.2D,#0x0
0087d8c4	mov w9,#0x4
0087d8c8	str wzr,[x8, #0x24]
0087d8cc	fcvt s0,d0
0087d8d0	fcvt s2,d2
0087d8d4	str w9,[x8]
0087d8d8	stur q1,[x8, #0x4]
0087d8dc	stur q1,[x8, #0x14]
0087d8e0	stp s0,s2,[x8, #0x8]
0087d8e4	str wzr,[x8, #0x14]
0087d8e8	b 0x0087d9c4
0087d8ec	ldr w9,[x2, #0x50]
0087d8f0	cmp w9,#0x3
0087d8f4	b.ne 0x0087db54
0087d8f8	ldr d0,[x2, #0x58]
0087d8fc	fcvtzs w10,d0
0087d900	ldr d0,[x2, #0x30]
0087d904	fcvtzs w9,d0
0087d908	tbnz w9,#0x1f,0x0087db54
0087d90c	subs w11,w10,#0x1
0087d910	b.lt 0x0087db54
0087d914	add w10,w10,w9
0087d918	cmp w10,#0x20
0087d91c	b.gt 0x0087db54
0087d920	ldr d0,[x2, #0x8]
0087d924	mov w12,#0xfffffffe
0087d928	lsl w11,w12,w11
0087d92c	fcvtzs x10,d0
0087d930	movi v0.2D,#0x0
0087d934	lsr w9,w10,w9
0087d938	bic w9,w9,w11
0087d93c	b 0x0087d9a8
0087d940	ldr w9,[x2, #0x78]
0087d944	cmp w9,#0x3
0087d948	b.ne 0x0087db54
0087d94c	ldr d0,[x2, #0x80]
0087d950	fcvtzs w10,d0
0087d954	ldr d0,[x2, #0x58]
0087d958	fcvtzs w9,d0
0087d95c	tbnz w9,#0x1f,0x0087db54
0087d960	subs w11,w10,#0x1
0087d964	b.lt 0x0087db54
0087d968	add w10,w10,w9
0087d96c	cmp w10,#0x20
0087d970	b.gt 0x0087db54
0087d974	ldr d0,[x2, #0x30]
0087d978	ldr d1,[x2, #0x8]
0087d97c	mov w12,#0xfffffffe
0087d980	lsl w11,w12,w11
0087d984	fcvtzs x10,d0
0087d988	fcvtzs x12,d1
0087d98c	movi v0.2D,#0x0
0087d990	mvn w13,w11
0087d994	lsl w13,w13,w9
0087d998	bic w10,w10,w11
0087d99c	lsl w9,w10,w9
0087d9a0	bic w10,w12,w13
0087d9a4	orr w9,w9,w10
0087d9a8	mov w10,#0x3
0087d9ac	ucvtf d1,w9
0087d9b0	str w10,[x8]
0087d9b4	stur q0,[x8, #0x4]
0087d9b8	stur q0,[x8, #0x14]
0087d9bc	str wzr,[x8, #0x24]
0087d9c0	str d1,[x8, #0x8]
0087d9c4	ldr x8,[x19, #0x28]
0087d9c8	ldur x9,[x29, #-0x18]
0087d9cc	cmp x8,x9
0087d9d0	b.ne 0x0087db88
0087d9d4	b 0x0087db70
0087d9d8	fmov d0,0x4024000000000000
0087d9dc	mov x20,x8
0087d9e0	fcmp d8,d0
0087d9e4	ldr d0,[x2, #0x8]
0087d9e8	b.eq 0x0087cef8
0087d9ec	bl 0x00c30840
0087d9f0	fmov d9,d0
0087d9f4	fmov d0,d8
0087d9f8	bl 0x00c30840
0087d9fc	fdiv d0,d9,d0
0087da00	movi v1.2D,#0x0
0087da04	mov w8,#0x3
0087da08	str w8,[x20]
0087da0c	str wzr,[x20, #0x24]
0087da10	b 0x0087d6a0
0087da14	ldr x10,[x2, #0x8]
0087da18	add w20,w9,#0x1
0087da1c	mov x21,x8
0087da20	sxtw x2,w20
0087da24	add x10,x10,w11, UXTW 
0087da28	sub x1,x10,#0x1
0087da2c	bl 0x008530cc
0087da30	mov w8,#0x6
0087da34	stp xzr,xzr,[x21, #0x18]
0087da38	stp w8,w20,[x21]
0087da3c	stp x0,xzr,[x21, #0x8]
0087da40	b 0x0087d9c4
0087da44	ldr w9,[x2, #0x50]
0087da48	cmp w9,#0x3
0087da4c	b.ne 0x0087db54
0087da50	ldr d0,[x2, #0x30]
0087da54	ldr d1,[x2, #0x58]
0087da58	adrp x9,0x29a000
0087da5c	ldr d2,[x9, #0x850]
0087da60	str xzr,[x8, #0x20]
0087da64	stp d0,d1,[x8, #0x10]
0087da68	ldr d0,[x2, #0x8]
0087da6c	stp d2,d0,[x8]
0087da70	b 0x0087d9c4
0087da74	ldr w9,[x2, #0x50]
0087da78	cmp w9,#0x3
0087da7c	b.ne 0x0087db54
0087da80	ldr d0,[x2, #0x8]
0087da84	ldr d2,[x2, #0x30]
0087da88	movi v1.2D,#0x0
0087da8c	ldr d3,[x2, #0x58]
0087da90	mov w9,#0x4
0087da94	str wzr,[x8, #0x24]
0087da98	fcvt s0,d0
0087da9c	fcvt s2,d2
0087daa0	str w9,[x8]
0087daa4	fcvt s3,d3
0087daa8	stur q1,[x8, #0x4]
0087daac	stur q1,[x8, #0x14]
0087dab0	stp s0,s2,[x8, #0x8]
0087dab4	str s3,[x8, #0x10]
0087dab8	b 0x0087d9c4
0087dabc	ldr w9,[x2, #0x50]
0087dac0	cmp w9,#0x3
0087dac4	b.ne 0x0087db54
0087dac8	ldr w9,[x2, #0x78]
0087dacc	cmp w9,#0x3
0087dad0	b.ne 0x0087db54
0087dad4	adrp x9,0x29a000
0087dad8	ldr d1,[x2, #0x8]
0087dadc	ldr d2,[x2, #0x30]
0087dae0	ldr d0,[x9, #0x850]
0087dae4	stp d0,d1,[x8]
0087dae8	ldr d0,[x2, #0x58]
0087daec	ldr d1,[x2, #0x80]
0087daf0	stp d2,d0,[x8, #0x10]
0087daf4	str d1,[x8, #0x20]
0087daf8	b 0x0087d9c4
0087dafc	ldr w9,[x2, #0x50]
0087db00	cmp w9,#0x3
0087db04	b.ne 0x0087db54
0087db08	ldr w9,[x2, #0x78]
0087db0c	cmp w9,#0x3
0087db10	b.ne 0x0087db54
0087db14	ldr d0,[x2, #0x8]
0087db18	add x9,x2,#0x30
0087db1c	ldr d1,[x2, #0x58]
0087db20	movi v2.2D,#0x0
0087db24	str wzr,[x8, #0x24]
0087db28	ld1 {v0.D}[1],[x9]
0087db2c	add x9,x2,#0x80
0087db30	ld1 {v1.D}[1],[x9]
0087db34	mov w9,#0x4
0087db38	str w9,[x8]
0087db3c	fcvtn v0.2S,v0.2D
0087db40	stur q2,[x8, #0x4]
0087db44	stur q2,[x8, #0x14]
0087db48	fcvtn2 v0.4S,v1.2D
0087db4c	stur q0,[x8, #0x8]
0087db50	b 0x0087d9c4
0087db54	ldr x9,[x19, #0x28]
0087db58	ldur x10,[x29, #-0x18]
0087db5c	cmp x9,x10
0087db60	b.ne 0x0087db88
0087db64	movi v0.2D,#0x0
0087db68	str xzr,[x8, #0x20]
0087db6c	stp q0,q0,[x8]
0087db70	ldp x20,x19,[sp, #0xc0]
0087db74	ldr x21,[sp, #0xb0]
0087db78	ldp x29,x30,[sp, #0xa0]
0087db7c	ldp d9,d8,[sp, #0x90]
0087db80	add sp,sp,#0xd0
0087db84	ret
0087db88	bl 0x00c2fec0
0087db8c	ldr w9,[x0]
0087db90	cmp w9,#0x3
0087db94	b.gt 0x0087dbc4
0087db98	cmp w9,#0x1
0087db9c	b.eq 0x0087dc14
0087dba0	cmp w9,#0x2
0087dba4	b.eq 0x0087dc40
0087dba8	cmp w9,#0x3
0087dbac	b.ne 0x0087dc30
0087dbb0	fmov d0,xzr
0087dbb4	movi v1.2S,#0x6
0087dbb8	adrp x9,0x2bc000
0087dbbc	add x9,x9,#0xc27
0087dbc0	b 0x0087dbfc
0087dbc4	sub w10,w9,#0x4
0087dbc8	cmp w10,#0x2
0087dbcc	b.cs 0x0087dbe4
0087dbd0	fmov d0,xzr
0087dbd4	movi v1.2S,#0x6
0087dbd8	adrp x9,0x2ca000
0087dbdc	add x9,x9,#0xa6b
0087dbe0	b 0x0087dbfc
0087dbe4	cmp w9,#0x6
0087dbe8	b.ne 0x0087dc30
0087dbec	fmov d0,xzr
0087dbf0	movi v1.2S,#0x6
0087dbf4	adrp x9,0x2ae000
0087dbf8	add x9,x9,#0xf43
0087dbfc	str xzr,[x8, #0x20]
0087dc00	str x9,[x8, #0x8]
0087dc04	mov v0.D[0x1],v0.D[0x0]
0087dc08	str d1,[x8]
0087dc0c	str q0,[x8, #0x10]
0087dc10	ret
0087dc14	fmov d0,xzr
0087dc18	adrp x9,0x29b000
0087dc1c	str xzr,[x8, #0x20]
0087dc20	ldr d1,[x9, #0x8a8]
0087dc24	adrp x9,0x29d000
0087dc28	add x9,x9,#0x3c1
0087dc2c	b 0x0087dc00
0087dc30	movi v0.2D,#0x0
0087dc34	str xzr,[x8, #0x20]
0087dc38	stp q0,q0,[x8]
0087dc3c	ret
0087dc40	fmov d0,xzr
0087dc44	adrp x9,0x29b000
0087dc48	str xzr,[x8, #0x20]
0087dc4c	ldr d1,[x9, #0x520]
0087dc50	adrp x9,0x2b1000
0087dc54	add x9,x9,#0x390
0087dc58	b 0x0087dc00
0087dc5c	ldr w9,[x0]
0087dc60	cmp w9,#0x3
0087dc64	b.gt 0x0087dc94
0087dc68	cmp w9,#0x1
0087dc6c	b.eq 0x0087dcd0
0087dc70	cmp w9,#0x2
0087dc74	b.eq 0x0087dcec
0087dc78	cmp w9,#0x3
0087dc7c	b.ne 0x0087dca0
0087dc80	fmov d0,xzr
0087dc84	movi v1.2S,#0x6
0087dc88	adrp x9,0x2bc000
0087dc8c	add x9,x9,#0xc27
0087dc90	b 0x0087dcc8
0087dc94	sub w10,w9,#0x4
0087dc98	cmp w10,#0x2
0087dc9c	b.cs 0x0087dcb0
0087dca0	movi v0.2D,#0x0
0087dca4	str xzr,[x8, #0x20]
0087dca8	stp q0,q0,[x8]
0087dcac	ret
0087dcb0	cmp w9,#0x6
0087dcb4	b.ne 0x0087dca0
0087dcb8	fmov d0,xzr
0087dcbc	movi v1.2S,#0x6
0087dcc0	adrp x9,0x2ae000
0087dcc4	add x9,x9,#0xf43
0087dcc8	str xzr,[x8, #0x20]
0087dccc	b 0x0087dd04
0087dcd0	fmov d0,xzr
0087dcd4	adrp x9,0x29b000
0087dcd8	str xzr,[x8, #0x20]
0087dcdc	ldr d1,[x9, #0x8a8]
0087dce0	adrp x9,0x29d000
0087dce4	add x9,x9,#0x3c1
0087dce8	b 0x0087dd04
0087dcec	fmov d0,xzr
0087dcf0	adrp x9,0x29b000
0087dcf4	str xzr,[x8, #0x20]
0087dcf8	ldr d1,[x9, #0x520]
0087dcfc	adrp x9,0x2b1000
0087dd00	add x9,x9,#0x390
0087dd04	str x9,[x8, #0x8]
0087dd08	mov v0.D[0x1],v0.D[0x0]
0087dd0c	str d1,[x8]
0087dd10	str q0,[x8, #0x10]
0087dd14	ret
