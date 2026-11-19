; FUN_0085cdc0 @ 0085cdc0
0085cdc0	sub sp,sp,#0x110
0085cdc4	stp x29,x30,[sp, #0xb0]
0085cdc8	stp x28,x27,[sp, #0xc0]
0085cdcc	stp x26,x25,[sp, #0xd0]
0085cdd0	stp x24,x23,[sp, #0xe0]
0085cdd4	stp x22,x21,[sp, #0xf0]
0085cdd8	stp x20,x19,[sp, #0x100]
0085cddc	add x29,sp,#0xb0
0085cde0	mrs x27,tpidr_el0
0085cde4	adrp x28,0xd1b000
0085cde8	mov x19,x0
0085cdec	ldr x8,[x27, #0x28]
0085cdf0	adrp x21,0xd1b000
0085cdf4	stur x8,[x29, #-0x10]
0085cdf8	ldr w8,[x1, #0x8]
0085cdfc	ldr w9,[x28, #0x10]
0085ce00	stur x1,[x29, #-0x18]
0085ce04	cmp w8,w9
0085ce08	b.ne 0x0085ce1c
0085ce0c	ldr x9,[x1, #0x20]
0085ce10	ldrb w9,[x9, #0x30]
0085ce14	cmp w9,#0x1
0085ce18	b.ne 0x0085ce9c
0085ce1c	ldr w9,[x21, #0x20]
0085ce20	cmp w8,w9
0085ce24	b.eq 0x0085ce9c
0085ce28	adrp x9,0xd1b000
0085ce2c	ldr w9,[x9, #0x60]
0085ce30	cmp w8,w9
0085ce34	b.eq 0x0085ce9c
0085ce38	adrp x9,0xd1b000
0085ce3c	ldr w9,[x9, #0x50]
0085ce40	cmp w8,w9
0085ce44	b.eq 0x0085ce9c
0085ce48	adrp x8,0xd1e000
0085ce4c	ldrb w8,[x8, #0xc40]
0085ce50	cmp w8,#0x1
0085ce54	b.ne 0x0085ce64
0085ce58	mov x0,x19
0085ce5c	bl 0x00864840
0085ce60	b 0x0085ce98
0085ce64	ldr x0,[x19, #0xe8]
0085ce68	mov x20,x1
0085ce6c	mov w1,#0x8
0085ce70	bl 0x0084e938
0085ce74	mov w8,#0x1
0085ce78	str x20,[x0]
0085ce7c	adrp x3,0x2a9000
0085ce80	add x3,x3,#0x221
0085ce84	stp x0,x8,[x29, #-0x30]
0085ce88	add x1,x20,#0xc
0085ce8c	sub x2,x29,#0x30
0085ce90	mov x0,x19
0085ce94	bl 0x008659e8
0085ce98	stur x0,[x29, #-0x18]
0085ce9c	ldr x25,[x19, #0x2a8]
0085cea0	ldr x8,[x19, #0x2a0]
0085cea4	add x23,x19,#0x2a0
0085cea8	ldr x20,[x19, #0x458]
0085ceac	ldr x22,[x19, #0x450]
0085ceb0	stp x8,x27,[sp, #0x18]
0085ceb4	sub x8,x25,x8
0085ceb8	str x8,[sp, #0x30]
0085cebc	sub x8,x20,x22
0085cec0	str x8,[sp, #0x28]
0085cec4	sub x1,x29,#0x18
0085cec8	mov x0,x23
0085cecc	bl 0x00872064
0085ced0	ldr w8,[x19, #0x90]
0085ced4	stp x22,x20,[sp, #0x8]
0085ced8	add x22,x19,#0x450
0085cedc	cmp w8,#0x2c
0085cee0	b.ne 0x0085d010
0085cee4	str x25,[sp]
0085cee8	mov x20,xzr
0085ceec	adrp x25,0xd1b000
0085cef0	adrp x27,0xd1b000
0085cef4	mov w26,#0x1
0085cef8	ldrb w8,[x19, #0x68]
0085cefc	cmp w8,#0x1
0085cf00	b.ne 0x0085cf14
0085cf04	add x1,x19,#0x94
0085cf08	mov x0,x22
0085cf0c	bl 0x00870ce4
0085cf10	add x20,x20,#0x1
0085cf14	mov x0,x19
0085cf18	bl 0x00858f2c
0085cf1c	mov x0,x19
0085cf20	mov w1,#0x1
0085cf24	bl 0x0085cb14
0085cf28	ldr w8,[x0, #0x8]
0085cf2c	ldr w9,[x28, #0x10]
0085cf30	stur x0,[x29, #-0x48]
0085cf34	cmp w8,w9
0085cf38	b.ne 0x0085cf4c
0085cf3c	ldr x9,[x0, #0x20]
0085cf40	ldrb w9,[x9, #0x30]
0085cf44	cmp w9,#0x1
0085cf48	b.ne 0x0085cfc8
0085cf4c	ldr w9,[x21, #0x20]
0085cf50	cmp w8,w9
0085cf54	b.eq 0x0085cfc8
0085cf58	ldr w9,[x25, #0x60]
0085cf5c	cmp w8,w9
0085cf60	b.eq 0x0085cfc8
0085cf64	ldr w9,[x27, #0x50]
0085cf68	cmp w8,w9
0085cf6c	b.eq 0x0085cfc8
0085cf70	adrp x8,0xd1e000
0085cf74	mov x24,x0
0085cf78	ldrb w8,[x8, #0xc40]
0085cf7c	cmp w8,#0x1
0085cf80	b.ne 0x0085cf94
0085cf84	mov x0,x19
0085cf88	mov x1,x24
0085cf8c	bl 0x00864840
0085cf90	b 0x0085cfc4
0085cf94	ldr x0,[x19, #0xe8]
0085cf98	mov w1,#0x8
0085cf9c	bl 0x0084e938
0085cfa0	mov w8,#0x1
0085cfa4	str x24,[x0]
0085cfa8	stp x0,x8,[x29, #-0x30]
0085cfac	add x1,x24,#0xc
0085cfb0	sub x2,x29,#0x30
0085cfb4	mov x0,x19
0085cfb8	adrp x3,0x2a9000
0085cfbc	add x3,x3,#0x221
0085cfc0	bl 0x008659e8
0085cfc4	stur x0,[x29, #-0x48]
0085cfc8	sub x1,x29,#0x48
0085cfcc	mov x0,x23
0085cfd0	bl 0x00872064
0085cfd4	ldr w8,[x19, #0x90]
0085cfd8	add x26,x26,#0x1
0085cfdc	cmp w8,#0x2c
0085cfe0	b.eq 0x0085cef8
0085cfe4	ldr x27,[sp, #0x20]
0085cfe8	ldr x25,[sp]
0085cfec	cmp w8,#0x3d
0085cff0	b.eq 0x0085d020
0085cff4	adrp x2,0x2ab000
0085cff8	add x2,x2,#0x391
0085cffc	mov x0,x19
0085d000	mov w1,#0x3d
0085d004	bl 0x0086e3b4
0085d008	mov x21,#-0x1
0085d00c	b 0x0085d02c
0085d010	mov x20,xzr
0085d014	mov w26,#0x1
0085d018	cmp w8,#0x3d
0085d01c	b.ne 0x0085cff4
0085d020	mov x0,x19
0085d024	bl 0x00858f2c
0085d028	ldr x21,[x19, #0xb0]
0085d02c	ldr x8,[x19, #0x2c0]
0085d030	ldr x9,[x19, #0x2b8]
0085d034	ldr x10,[x19, #0x458]
0085d038	ldr x11,[x19, #0x450]
0085d03c	sub x8,x8,x9
0085d040	add x9,x19,#0x2b8
0085d044	asr x8,x8,#0x3
0085d048	sub x10,x10,x11
0085d04c	stp xzr,x9,[x29, #-0x38]
0085d050	asr x9,x10,#0x3
0085d054	stp x8,xzr,[x29, #-0x28]
0085d058	ldrb w8,[x19, #0x68]
0085d05c	stp x22,x9,[x29, #-0x48]
0085d060	cmp w8,#0x0
0085d064	sub x8,x29,#0x48
0085d068	csel x2,x8,xzr,ne
0085d06c	sub x1,x29,#0x30
0085d070	mov x0,x19
0085d074	bl 0x00861848
0085d078	ldur x28,[x29, #-0x30]
0085d07c	ldur x9,[x29, #-0x18]
0085d080	ldr x24,[x19, #0xe8]
0085d084	ldr x8,[x28, #0x8]
0085d088	ldur x9,[x9, #0xc]
0085d08c	ldur x8,[x8, #-0x8]
0085d090	ldur x8,[x8, #0x14]
0085d094	stp x9,x8,[sp, #0x58]
0085d098	cbz x26,0x0085d0fc
0085d09c	ldr x23,[x23]
0085d0a0	lsl x1,x26,#0x3
0085d0a4	mov x0,x24
0085d0a8	bl 0x0084e938
0085d0ac	ldr x12,[sp, #0x18]
0085d0b0	cmp x26,#0x8
0085d0b4	b.cc 0x0085d0cc
0085d0b8	add x8,x12,x0
0085d0bc	add x9,x23,x25
0085d0c0	sub x8,x8,x9
0085d0c4	cmp x8,#0x20
0085d0c8	b.cs 0x0085d3d8
0085d0cc	mov x8,xzr
0085d0d0	lsl x10,x8,#0x3
0085d0d4	sub x8,x26,x8
0085d0d8	add x9,x25,x10
0085d0dc	add x10,x0,x10
0085d0e0	sub x9,x9,x12
0085d0e4	add x9,x23,x9
0085d0e8	ldr x11,[x9], #0x8
0085d0ec	subs x8,x8,#0x1
0085d0f0	str x11,[x10], #0x8
0085d0f4	b.ne 0x0085d0e8
0085d0f8	b 0x0085d100
0085d0fc	mov x0,xzr
0085d100	ldur x23,[x29, #-0x20]
0085d104	stp x0,x26,[sp, #0x48]
0085d108	cbz x23,0x0085d168
0085d10c	ldur x26,[x29, #-0x28]
0085d110	ldr x25,[x28]
0085d114	lsl x1,x23,#0x3
0085d118	ldr x0,[x19, #0xe8]
0085d11c	bl 0x0084e938
0085d120	cmp x23,#0x8
0085d124	b.cc 0x0085d13c
0085d128	lsl x8,x26,#0x3
0085d12c	add x10,x8,x25
0085d130	sub x8,x0,x10
0085d134	cmp x8,#0x20
0085d138	b.cs 0x0085d414
0085d13c	mov x8,xzr
0085d140	lsl x10,x8,#0x3
0085d144	sub x8,x23,x8
0085d148	add x9,x10,x26, LSL #0x3
0085d14c	add x10,x0,x10
0085d150	add x9,x25,x9
0085d154	ldr x11,[x9], #0x8
0085d158	subs x8,x8,#0x1
0085d15c	str x11,[x10], #0x8
0085d160	b.ne 0x0085d154
0085d164	b 0x0085d16c
0085d168	mov x0,xzr
0085d16c	stp x0,x23,[sp, #0x38]
0085d170	mov x0,x24
0085d174	mov w1,#0x40
0085d178	bl 0x0084e938
0085d17c	add x1,sp,#0x58
0085d180	add x2,sp,#0x48
0085d184	add x3,sp,#0x38
0085d188	mov x23,x0
0085d18c	bl 0x00850184
0085d190	ldrb w8,[x19, #0x68]
0085d194	cmp w8,#0x1
0085d198	b.ne 0x0085d2bc
0085d19c	ldr x24,[x19, #0xe8]
0085d1a0	cbz x20,0x0085d208
0085d1a4	ldr x25,[x22]
0085d1a8	lsl x1,x20,#0x3
0085d1ac	mov x0,x24
0085d1b0	bl 0x0084e938
0085d1b4	ldp x13,x12,[sp, #0x8]
0085d1b8	cmp x20,#0x8
0085d1bc	b.cc 0x0085d1d4
0085d1c0	add x8,x13,x0
0085d1c4	add x9,x25,x12
0085d1c8	sub x8,x8,x9
0085d1cc	cmp x8,#0x20
0085d1d0	b.cs 0x0085d448
0085d1d4	mov x8,xzr
0085d1d8	lsl x10,x8,#0x3
0085d1dc	sub x8,x20,x8
0085d1e0	add x9,x12,x10
0085d1e4	add x10,x0,x10
0085d1e8	sub x9,x9,x13
0085d1ec	add x9,x25,x9
0085d1f0	ldr x11,[x9], #0x8
0085d1f4	subs x8,x8,#0x1
0085d1f8	str x11,[x10], #0x8
0085d1fc	b.ne 0x0085d1f0
0085d200	str x0,[sp, #0x18]
0085d204	b 0x0085d20c
0085d208	str xzr,[sp, #0x18]
0085d20c	ldur x25,[x29, #-0x38]
0085d210	mov x22,x21
0085d214	cbz x25,0x0085d278
0085d218	ldp x8,x21,[x29, #-0x48]
0085d21c	lsl x1,x25,#0x3
0085d220	ldr x0,[x19, #0xe8]
0085d224	ldr x27,[x8]
0085d228	bl 0x0084e938
0085d22c	mov x26,x0
0085d230	cmp x25,#0x8
0085d234	b.cc 0x0085d24c
0085d238	lsl x8,x21,#0x3
0085d23c	add x10,x8,x27
0085d240	sub x8,x26,x10
0085d244	cmp x8,#0x20
0085d248	b.cs 0x0085d484
0085d24c	mov x8,xzr
0085d250	lsl x10,x8,#0x3
0085d254	sub x8,x25,x8
0085d258	add x9,x10,x21, LSL #0x3
0085d25c	add x10,x26,x10
0085d260	add x9,x27,x9
0085d264	ldr x11,[x9], #0x8
0085d268	subs x8,x8,#0x1
0085d26c	str x11,[x10], #0x8
0085d270	b.ne 0x0085d264
0085d274	b 0x0085d27c
0085d278	mov x26,xzr
0085d27c	mov x0,x24
0085d280	mov w1,#0x30
0085d284	bl 0x0084e938
0085d288	ldr x1,[sp, #0x18]
0085d28c	mov x2,x20
0085d290	mov x3,x22
0085d294	mov x4,x26
0085d298	mov x5,x25
0085d29c	mov x24,x0
0085d2a0	bl 0x00851fb4
0085d2a4	str x23,[sp, #0x58]
0085d2a8	add x0,x19,#0x4b0
0085d2ac	add x1,sp,#0x58
0085d2b0	bl 0x00860fa0
0085d2b4	ldr x27,[sp, #0x20]
0085d2b8	str x24,[x0]
0085d2bc	ldp x22,x9,[x29, #-0x48]
0085d2c0	ldp x10,x8,[x22]
0085d2c4	add x20,x10,x9, LSL #0x3
0085d2c8	cmp x20,x8
0085d2cc	b.eq 0x0085d2f4
0085d2d0	sub x9,x8,x20
0085d2d4	add x1,x20,x9
0085d2d8	subs x21,x8,x1
0085d2dc	b.eq 0x0085d2ec
0085d2e0	mov x0,x20
0085d2e4	mov x2,x21
0085d2e8	bl 0x00c2ff60
0085d2ec	add x8,x20,x21
0085d2f0	str x8,[x22, #0x8]
0085d2f4	ldp x10,x8,[x28]
0085d2f8	ldur x9,[x29, #-0x28]
0085d2fc	add x20,x10,x9, LSL #0x3
0085d300	cmp x20,x8
0085d304	b.eq 0x0085d32c
0085d308	sub x9,x8,x20
0085d30c	add x1,x20,x9
0085d310	subs x21,x8,x1
0085d314	b.eq 0x0085d324
0085d318	mov x0,x20
0085d31c	mov x2,x21
0085d320	bl 0x00c2ff60
0085d324	add x8,x20,x21
0085d328	str x8,[x28, #0x8]
0085d32c	ldr x9,[x19, #0x450]
0085d330	ldr x10,[sp, #0x28]
0085d334	ldr x8,[x19, #0x458]
0085d338	add x20,x10,x9
0085d33c	cmp x20,x8
0085d340	b.eq 0x0085d368
0085d344	sub x9,x8,x20
0085d348	add x1,x20,x9
0085d34c	subs x21,x8,x1
0085d350	b.eq 0x0085d360
0085d354	mov x0,x20
0085d358	mov x2,x21
0085d35c	bl 0x00c2ff60
0085d360	add x8,x20,x21
0085d364	str x8,[x19, #0x458]
0085d368	ldr x9,[x19, #0x2a0]
0085d36c	ldr x10,[sp, #0x30]
0085d370	ldr x8,[x19, #0x2a8]
0085d374	add x20,x10,x9
0085d378	cmp x20,x8
0085d37c	b.eq 0x0085d3a4
0085d380	sub x9,x8,x20
0085d384	add x1,x20,x9
0085d388	subs x21,x8,x1
0085d38c	b.eq 0x0085d39c
0085d390	mov x0,x20
0085d394	mov x2,x21
0085d398	bl 0x00c2ff60
0085d39c	add x8,x20,x21
0085d3a0	str x8,[x19, #0x2a8]
0085d3a4	ldr x8,[x27, #0x28]
0085d3a8	ldur x9,[x29, #-0x10]
0085d3ac	cmp x8,x9
0085d3b0	b.ne 0x0085d5ec
0085d3b4	mov x0,x23
0085d3b8	ldp x20,x19,[sp, #0x100]
0085d3bc	ldp x22,x21,[sp, #0xf0]
0085d3c0	ldp x24,x23,[sp, #0xe0]
0085d3c4	ldp x26,x25,[sp, #0xd0]
0085d3c8	ldp x28,x27,[sp, #0xc0]
0085d3cc	ldp x29,x30,[sp, #0xb0]
0085d3d0	add sp,sp,#0x110
0085d3d4	ret
0085d3d8	ldr x9,[sp, #0x30]
0085d3dc	and x8,x26,#-0x4
0085d3e0	mov x11,x8
0085d3e4	add x10,x9,x23
0085d3e8	add x9,x0,#0x10
0085d3ec	add x10,x10,#0x10
0085d3f0	ldp q0,q1,[x10, #-0x10]
0085d3f4	subs x11,x11,#0x4
0085d3f8	add x10,x10,#0x20
0085d3fc	stp q0,q1,[x9, #-0x10]
0085d400	add x9,x9,#0x20
0085d404	b.ne 0x0085d3f0
0085d408	cmp x26,x8
0085d40c	b.eq 0x0085d100
0085d410	b 0x0085d0d0
0085d414	and x8,x23,#-0x4
0085d418	add x9,x0,#0x10
0085d41c	add x10,x10,#0x10
0085d420	mov x11,x8
0085d424	ldp q0,q1,[x10, #-0x10]
0085d428	subs x11,x11,#0x4
0085d42c	add x10,x10,#0x20
0085d430	stp q0,q1,[x9, #-0x10]
0085d434	add x9,x9,#0x20
0085d438	b.ne 0x0085d424
0085d43c	cmp x23,x8
0085d440	b.eq 0x0085d16c
0085d444	b 0x0085d140
0085d448	ldr x9,[sp, #0x28]
0085d44c	and x8,x20,#-0x4
0085d450	mov x11,x8
0085d454	add x10,x9,x25
0085d458	add x9,x0,#0x10
0085d45c	add x10,x10,#0x10
0085d460	ldp q0,q1,[x10, #-0x10]
0085d464	subs x11,x11,#0x4
0085d468	add x10,x10,#0x20
0085d46c	stp q0,q1,[x9, #-0x10]
0085d470	add x9,x9,#0x20
0085d474	b.ne 0x0085d460
0085d478	cmp x20,x8
0085d47c	b.eq 0x0085d200
0085d480	b 0x0085d1d8
0085d484	and x8,x25,#-0x4
0085d488	add x9,x26,#0x10
0085d48c	add x10,x10,#0x10
0085d490	mov x11,x8
0085d494	ldp q0,q1,[x10, #-0x10]
0085d498	subs x11,x11,#0x4
0085d49c	add x10,x10,#0x20
0085d4a0	stp q0,q1,[x9, #-0x10]
0085d4a4	add x9,x9,#0x20
0085d4a8	b.ne 0x0085d494
0085d4ac	cmp x25,x8
0085d4b0	b.eq 0x0085d27c
0085d4b4	b 0x0085d250
0085d5ec	bl 0x00c2fec0
