; ssl_cert_dup @ 009abfc0
009abfc0	str x25,[sp, #-0x50]!
009abfc4	adrp x1,0x2d5000
009abfc8	stp x20,x19,[sp, #0x30]
009abfcc	mov x20,x0
009abfd0	add x1,x1,#0x6b3
009abfd4	mov w0,#0x218
009abfd8	mov w2,#0x57
009abfdc	stp x24,x23,[sp, #0x10]
009abfe0	stp x22,x21,[sp, #0x20]
009abfe4	stp x29,x30,[sp, #0x40]
009abfe8	add x29,sp,#0x40
009abfec	bl 0x00c34250
009abff0	mov x19,x0
009abff4	cbz x0,0x009ac174
009abff8	add x8,x19,#0x208
009abffc	mov w9,#0x1
009ac000	stlr w9,[x8]
009ac004	mov x8,x20
009ac008	ldr x9,[x8], #0x20
009ac00c	sub x8,x9,x8
009ac010	add x8,x19,x8
009ac014	add x8,x8,#0x20
009ac018	str x8,[x19]
009ac01c	bl 0x00c34d50
009ac020	str x0,[x19, #0x210]
009ac024	cbz x0,0x009ac1a8
009ac028	ldr x0,[x20, #0x8]
009ac02c	cbz x0,0x009ac038
009ac030	str x0,[x19, #0x8]
009ac034	bl 0x00c34730
009ac038	ldr x8,[x20, #0x10]
009ac03c	adrp x21,0x2d5000
009ac040	mov x22,xzr
009ac044	mov x23,xzr
009ac048	str x8,[x19, #0x10]
009ac04c	ldr w8,[x20, #0x18]
009ac050	add x21,x21,#0x6b3
009ac054	str w8,[x19, #0x18]
009ac058	add x24,x20,x22
009ac05c	ldr x0,[x24, #0x20]
009ac060	cbz x0,0x009ac070
009ac064	add x8,x19,x22
009ac068	str x0,[x8, #0x20]
009ac06c	bl 0x00c350b0
009ac070	ldr x8,[x24, #0x28]
009ac074	cbz x8,0x009ac088
009ac078	add x9,x19,x22
009ac07c	str x8,[x9, #0x28]
009ac080	ldr x0,[x24, #0x28]
009ac084	bl 0x00c34730
009ac088	add x24,x20,x22
009ac08c	ldr x0,[x24, #0x30]
009ac090	cbz x0,0x009ac0a4
009ac094	bl 0x00c35070
009ac098	add x8,x19,x22
009ac09c	str x0,[x8, #0x30]
009ac0a0	cbz x0,0x009ac1f0
009ac0a4	ldr x8,[x24, #0x38]
009ac0a8	cbz x8,0x009ac0e0
009ac0ac	add x25,x20,x22
009ac0b0	ldr x0,[x25, #0x40]
009ac0b4	mov w2,#0x87
009ac0b8	mov x1,x21
009ac0bc	bl 0x00c32320
009ac0c0	add x8,x19,x22
009ac0c4	str x0,[x8, #0x38]
009ac0c8	cbz x0,0x009ac20c
009ac0cc	ldr x9,[x25, #0x40]
009ac0d0	str x9,[x8, #0x40]
009ac0d4	ldr x1,[x24, #0x38]
009ac0d8	ldr x2,[x25, #0x40]
009ac0dc	bl 0x00c2ffd0
009ac0e0	add x23,x23,#0x1
009ac0e4	cmp x23,#0x9
009ac0e8	add x22,x22,#0x28
009ac0ec	b.cc 0x009ac058
009ac0f0	ldr x8,[x20, #0x198]
009ac0f4	cbz x8,0x009ac264
009ac0f8	ldr x8,[x20, #0x1a0]
009ac0fc	adrp x1,0x2d5000
009ac100	add x1,x1,#0x6b3
009ac104	mov w2,#0x95
009ac108	lsl x0,x8,#0x1
009ac10c	bl 0x00c32320
009ac110	str x0,[x19, #0x198]
009ac114	cbz x0,0x009ac23c
009ac118	ldp x1,x8,[x20, #0x198]
009ac11c	lsl x2,x8,#0x1
009ac120	bl 0x00c2ffd0
009ac124	ldr x8,[x20, #0x1a0]
009ac128	str x8,[x19, #0x1a0]
009ac12c	ldr x8,[x20, #0x1a8]
009ac130	cbz x8,0x009ac270
009ac134	ldr x8,[x20, #0x1b0]
009ac138	adrp x1,0x2d5000
009ac13c	add x1,x1,#0x6b3
009ac140	mov w2,#0xa0
009ac144	lsl x0,x8,#0x1
009ac148	bl 0x00c32320
009ac14c	str x0,[x19, #0x1a8]
009ac150	cbz x0,0x009ac23c
009ac154	ldp x1,x8,[x20, #0x1a8]
009ac158	lsl x2,x8,#0x1
009ac15c	bl 0x00c2ffd0
009ac160	ldr x8,[x20, #0x1b0]
009ac164	str x8,[x19, #0x1b0]
009ac168	ldr x0,[x20, #0x188]
009ac16c	cbnz x0,0x009ac27c
009ac170	b 0x009ac2a0
009ac174	bl 0x00c342a0
009ac178	adrp x0,0x2d5000
009ac17c	adrp x2,0x2cb000
009ac180	add x0,x0,#0x6b3
009ac184	add x2,x2,#0x3f8
009ac188	mov w1,#0x5b
009ac18c	bl 0x00c342b0
009ac190	mov w1,#0x100
009ac194	mov w0,#0x14
009ac198	movk w1,#0xc, LSL #16
009ac19c	mov x2,xzr
009ac1a0	bl 0x00c342c0
009ac1a4	b 0x009ac248
009ac1a8	bl 0x00c342a0
009ac1ac	adrp x20,0x2d5000
009ac1b0	add x20,x20,#0x6b3
009ac1b4	adrp x2,0x2cb000
009ac1b8	add x2,x2,#0x3f8
009ac1bc	mov w1,#0x63
009ac1c0	mov x0,x20
009ac1c4	bl 0x00c342b0
009ac1c8	mov w1,#0x100
009ac1cc	mov w0,#0x14
009ac1d0	movk w1,#0xc, LSL #16
009ac1d4	mov x2,xzr
009ac1d8	bl 0x00c342c0
009ac1dc	mov w2,#0x64
009ac1e0	mov x0,x19
009ac1e4	mov x1,x20
009ac1e8	bl 0x00c32310
009ac1ec	b 0x009ac244
009ac1f0	bl 0x00c342a0
009ac1f4	adrp x0,0x2d5000
009ac1f8	adrp x2,0x2cb000
009ac1fc	add x0,x0,#0x6b3
009ac200	add x2,x2,#0x3f8
009ac204	mov w1,#0x80
009ac208	b 0x009ac224
009ac20c	bl 0x00c342a0
009ac210	adrp x0,0x2d5000
009ac214	adrp x2,0x2cb000
009ac218	add x0,x0,#0x6b3
009ac21c	add x2,x2,#0x3f8
009ac220	mov w1,#0x89
009ac224	bl 0x00c342b0
009ac228	mov w1,#0x100
009ac22c	mov w0,#0x14
009ac230	movk w1,#0xc, LSL #16
009ac234	mov x2,xzr
009ac238	bl 0x00c342c0
009ac23c	mov x0,x19
009ac240	bl 0x009ac32c
009ac244	mov x19,xzr
009ac248	mov x0,x19
009ac24c	ldp x29,x30,[sp, #0x40]
009ac250	ldp x20,x19,[sp, #0x30]
009ac254	ldp x22,x21,[sp, #0x20]
009ac258	ldp x24,x23,[sp, #0x10]
009ac25c	ldr x25,[sp], #0x50
009ac260	ret
009ac264	str xzr,[x19, #0x198]
009ac268	ldr x8,[x20, #0x1a8]
009ac26c	cbnz x8,0x009ac134
009ac270	str xzr,[x19, #0x1a8]
009ac274	ldr x0,[x20, #0x188]
009ac278	cbz x0,0x009ac2a0
009ac27c	ldr x1,[x20, #0x190]
009ac280	adrp x2,0x2d5000
009ac284	add x2,x2,#0x6b3
009ac288	mov w3,#0xaa
009ac28c	bl 0x00c345f0
009ac290	str x0,[x19, #0x188]
009ac294	cbz x0,0x009ac23c
009ac298	ldr x8,[x20, #0x190]
009ac29c	str x8,[x19, #0x190]
009ac2a0	ldr w8,[x20, #0x1c]
009ac2a4	str w8,[x19, #0x1c]
009ac2a8	add x8,x20,#0x1b8
009ac2ac	ldr q0,[x8]
009ac2b0	add x8,x19,#0x1b8
009ac2b4	str q0,[x8]
009ac2b8	ldr x0,[x20, #0x1d0]
009ac2bc	cbz x0,0x009ac2cc
009ac2c0	bl 0x00c32c60
009ac2c4	ldr x8,[x20, #0x1d0]
009ac2c8	str x8,[x19, #0x1d0]
009ac2cc	ldr x0,[x20, #0x1c8]
009ac2d0	cbz x0,0x009ac2e0
009ac2d4	bl 0x00c32c60
009ac2d8	ldr x8,[x20, #0x1c8]
009ac2dc	str x8,[x19, #0x1c8]
009ac2e0	ldr x8,[x20, #0x1e8]
009ac2e4	add x0,x19,#0x1d8
009ac2e8	add x1,x20,#0x1d8
009ac2ec	str x8,[x19, #0x1e8]
009ac2f0	ldr w8,[x20, #0x1f0]
009ac2f4	str w8,[x19, #0x1f0]
009ac2f8	ldr x8,[x20, #0x1f8]
009ac2fc	str x8,[x19, #0x1f8]
009ac300	bl 0x00c350d0
009ac304	cbz w0,0x009ac23c
009ac308	ldr x0,[x20, #0x200]
009ac30c	cbz x0,0x009ac248
009ac310	adrp x1,0x2d5000
009ac314	add x1,x1,#0x6b3
009ac318	mov w2,#0xc7
009ac31c	bl 0x00c34600
009ac320	str x0,[x19, #0x200]
009ac324	cbnz x0,0x009ac248
009ac328	b 0x009ac23c
