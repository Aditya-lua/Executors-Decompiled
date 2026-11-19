; ssl3_enc @ 009ce0e8
009ce0e8	sub sp,sp,#0xf0
009ce0ec	stp x20,x19,[sp, #0xd0]
009ce0f0	mov x19,x0
009ce0f4	cmp x2,#0x1
009ce0f8	mov w0,wzr
009ce0fc	stp x28,x27,[sp, #0x90]
009ce100	stp x26,x25,[sp, #0xa0]
009ce104	stp x24,x23,[sp, #0xb0]
009ce108	stp x22,x21,[sp, #0xc0]
009ce10c	stp x29,x30,[sp, #0xe0]
009ce110	add x29,sp,#0xe0
009ce114	b.ne 0x009ce390
009ce118	mov x20,x5
009ce11c	mov x25,x4
009ce120	mov w24,w3
009ce124	mov x23,x1
009ce128	cbz w3,0x009ce2a4
009ce12c	ldr x22,[x19, #0x878]
009ce130	cbz x22,0x009ce2ac
009ce134	mov x0,x22
009ce138	bl 0x00c34b80
009ce13c	mov x26,x0
009ce140	cbz x26,0x009ce2b4
009ce144	cbz x22,0x009ce2b4
009ce148	ldr x8,[x19, #0x918]
009ce14c	cbz x8,0x009ce2b4
009ce150	mov x0,x26
009ce154	mov x21,x20
009ce158	bl 0x00c34bb0
009ce15c	mov x8,x23
009ce160	ldr x28,[x8, #0x8]!
009ce164	mov x20,x0
009ce168	mov x0,x22
009ce16c	str x8,[sp]
009ce170	bl 0x00c36d40
009ce174	sxtw x27,w0
009ce178	cbnz x20,0x009ce1cc
009ce17c	cbz w24,0x009ce1cc
009ce180	cmp w0,#0x1
009ce184	b.eq 0x009ce1cc
009ce188	ldr x9,[x23, #0x28]
009ce18c	ldr x10,[x23, #0x8]
009ce190	udiv x8,x28,x27
009ce194	msub x8,x8,x27,x28
009ce198	sub x20,x27,x8
009ce19c	add x0,x9,x10
009ce1a0	mov w1,wzr
009ce1a4	mov x2,x20
009ce1a8	add x28,x20,x28
009ce1ac	bl 0x00c301c0
009ce1b0	ldr x8,[x23, #0x8]
009ce1b4	ldr x9,[x23, #0x28]
009ce1b8	sub w10,w20,#0x1
009ce1bc	add x8,x8,x20
009ce1c0	add x9,x9,x28
009ce1c4	str x8,[x23, #0x8]
009ce1c8	sturb w10,[x9, #-0x1]
009ce1cc	mov x20,x21
009ce1d0	cbz w24,0x009ce2d0
009ce1d4	mov x0,x26
009ce1d8	bl 0x00c34bb0
009ce1dc	cbz x0,0x009ce2f0
009ce1e0	ldp x1,x3,[x23, #0x20]
009ce1e4	sub x2,x29,#0x54
009ce1e8	mov x0,x22
009ce1ec	mov w4,w28
009ce1f0	bl 0x00c36d70
009ce1f4	cbz w0,0x009ce2e8
009ce1f8	ldursw x8,[x29, #-0x54]
009ce1fc	ldr x9,[sp]
009ce200	str x8,[x9]
009ce204	cbnz w24,0x009ce2c8
009ce208	cbz x25,0x009ce2c8
009ce20c	adrp x0,0x2cf000
009ce210	add x0,x0,#0x7ef
009ce214	add x8,sp,#0x8
009ce218	mov x1,x25
009ce21c	mov x2,x20
009ce220	str wzr,[x25, #0x8]
009ce224	bl 0x00c36de0
009ce228	ldr x8,[sp, #0x28]
009ce22c	ldur q0,[sp, #0x18]
009ce230	ldur q1,[sp, #0x8]
009ce234	str x8,[sp, #0x50]
009ce238	add x8,sp,#0x8
009ce23c	stp q1,q0,[sp, #0x30]
009ce240	bl 0x00c34c40
009ce244	ldr x8,[sp, #0x28]
009ce248	ldur q0,[sp, #0x18]
009ce24c	ldur q1,[sp, #0x8]
009ce250	add x1,sp,#0x30
009ce254	mov x0,x22
009ce258	str x8,[sp, #0x78]
009ce25c	stur q0,[sp, #0x68]
009ce260	stur q1,[sp, #0x58]
009ce264	bl 0x00c36d50
009ce268	cbnz w0,0x009ce2c8
009ce26c	bl 0x00c342a0
009ce270	adrp x0,0x2cf000
009ce274	adrp x2,0x2bf000
009ce278	add x0,x0,#0x7d6
009ce27c	add x2,x2,#0x947
009ce280	mov w1,#0x3a8
009ce284	bl 0x00c342b0
009ce288	mov w2,#0x103
009ce28c	mov w1,#0x50
009ce290	movk w2,#0xc, LSL #16
009ce294	mov x0,x19
009ce298	mov x3,xzr
009ce29c	bl 0x00c34410
009ce2a0	b 0x009ce2e8
009ce2a4	ldr x22,[x19, #0x848]
009ce2a8	cbnz x22,0x009ce134
009ce2ac	mov x26,xzr
009ce2b0	cbnz x26,0x009ce144
009ce2b4	ldp x0,x1,[x23, #0x20]
009ce2b8	ldr x2,[x23, #0x8]
009ce2bc	bl 0x00c2ff60
009ce2c0	ldr x8,[x23, #0x20]
009ce2c4	str x8,[x23, #0x28]
009ce2c8	mov w0,#0x1
009ce2cc	b 0x009ce390
009ce2d0	cbz x28,0x009ce2e8
009ce2d4	udiv x8,x28,x27
009ce2d8	msub x8,x8,x27,x28
009ce2dc	mov w0,wzr
009ce2e0	cbnz x8,0x009ce390
009ce2e4	b 0x009ce1d4
009ce2e8	mov w0,wzr
009ce2ec	b 0x009ce390
009ce2f0	ldp x1,x2,[x23, #0x20]
009ce2f4	mov x0,x22
009ce2f8	mov w3,w28
009ce2fc	bl 0x00c36d60
009ce300	cmp w0,#0x0
009ce304	b.le 0x009ce358
009ce308	cbnz w24,0x009ce2c8
009ce30c	ldr x8,[x19, #0x9a8]
009ce310	ldr x1,[x23, #0x10]
009ce314	ldr x2,[x23, #0x20]
009ce318	cmp x25,#0x0
009ce31c	ldr x7,[x8]
009ce320	add x8,x25,#0x8
009ce324	ldr x0,[sp]
009ce328	mov x3,x25
009ce32c	mov x5,x27
009ce330	mov x6,x20
009ce334	ldp x29,x30,[sp, #0xe0]
009ce338	ldp x20,x19,[sp, #0xd0]
009ce33c	ldp x22,x21,[sp, #0xc0]
009ce340	ldp x24,x23,[sp, #0xb0]
009ce344	ldp x26,x25,[sp, #0xa0]
009ce348	ldp x28,x27,[sp, #0x90]
009ce34c	csel x4,xzr,x8,eq
009ce350	add sp,sp,#0xf0
009ce354	b 0x00c36e00
009ce358	bl 0x00c342a0
009ce35c	adrp x0,0x2cf000
009ce360	adrp x2,0x2bf000
009ce364	add x0,x0,#0x7d6
009ce368	add x2,x2,#0x947
009ce36c	mov w1,#0x3af
009ce370	bl 0x00c342b0
009ce374	mov w2,#0x103
009ce378	mov w1,#0x14
009ce37c	movk w2,#0xc, LSL #16
009ce380	mov x0,x19
009ce384	mov x3,xzr
009ce388	bl 0x00c34410
009ce38c	mov w0,wzr
009ce390	ldp x29,x30,[sp, #0xe0]
009ce394	ldp x20,x19,[sp, #0xd0]
009ce398	ldp x22,x21,[sp, #0xc0]
009ce39c	ldp x24,x23,[sp, #0xb0]
009ce3a0	ldp x26,x25,[sp, #0xa0]
009ce3a4	ldp x28,x27,[sp, #0x90]
009ce3a8	add sp,sp,#0xf0
009ce3ac	ret
