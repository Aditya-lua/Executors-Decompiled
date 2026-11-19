; FUN_008cd244 @ 008cd244
008cd244	sub sp,sp,#0x70
008cd248	stp x29,x30,[sp, #0x20]
008cd24c	str x25,[sp, #0x30]
008cd250	stp x24,x23,[sp, #0x40]
008cd254	stp x22,x21,[sp, #0x50]
008cd258	stp x20,x19,[sp, #0x60]
008cd25c	add x29,sp,#0x20
008cd260	mrs x23,tpidr_el0
008cd264	mov x19,x3
008cd268	mov x21,x2
008cd26c	ldr x8,[x23, #0x28]
008cd270	cmp x2,#0x0
008cd274	mov x20,x1
008cd278	mov x22,x0
008cd27c	stur x8,[x29, #-0x8]
008cd280	ldr w8,[x2, #0xc]
008cd284	ldr w9,[x3, #0xc]
008cd288	ccmp w8,#0x4,#0x0,ne
008cd28c	cset w11,eq
008cd290	cmp x3,#0x0
008cd294	ccmp w9,#0x4,#0x0,ne
008cd298	cset w10,eq
008cd29c	cmp w11,#0x1
008cd2a0	b.ne 0x008cd358
008cd2a4	tbz w10,#0x0,0x008cd358
008cd2a8	ldr w8,[x21, #0xc]
008cd2ac	mov x24,x21
008cd2b0	cmp w8,#0x3
008cd2b4	b.eq 0x008cd2e0
008cd2b8	cmp w8,#0x5
008cd2bc	b.ne 0x008cd30c
008cd2c0	ldr x8,[x21]
008cd2c4	add x1,sp,#0x10
008cd2c8	add x0,x8,#0x18
008cd2cc	bl 0x008b93c8
008cd2d0	cbz w0,0x008cd30c
008cd2d4	ldr d0,[sp, #0x10]
008cd2d8	add x24,sp,#0x8
008cd2dc	str d0,[sp, #0x8]
008cd2e0	ldr w8,[x19, #0xc]
008cd2e4	cmp w8,#0x3
008cd2e8	b.eq 0x008cd3b8
008cd2ec	cmp w8,#0x5
008cd2f0	b.ne 0x008cd30c
008cd2f4	ldr x8,[x19]
008cd2f8	add x1,sp,#0x10
008cd2fc	add x25,sp,#0x10
008cd300	add x0,x8,#0x18
008cd304	bl 0x008b93c8
008cd308	cbnz w0,0x008cd3bc
008cd30c	mov x0,x22
008cd310	mov x1,x21
008cd314	mov w2,#0xe
008cd318	bl 0x008be028
008cd31c	ldr w8,[x0, #0xc]
008cd320	cbnz w8,0x008cd33c
008cd324	mov x0,x22
008cd328	mov x1,x19
008cd32c	mov w2,#0xe
008cd330	bl 0x008be028
008cd334	ldr w8,[x0, #0xc]
008cd338	cbz w8,0x008cd400
008cd33c	mov x2,x0
008cd340	mov x0,x22
008cd344	mov x1,x20
008cd348	mov x3,x21
008cd34c	mov x4,x19
008cd350	bl 0x008cb070
008cd354	b 0x008cd3d4
008cd358	cbz w11,0x008cd380
008cd35c	cmp w9,#0x3
008cd360	b.eq 0x008cd2a8
008cd364	cmp w9,#0x5
008cd368	b.ne 0x008cd2a8
008cd36c	ldr x8,[x19]
008cd370	add x1,sp,#0x10
008cd374	add x0,x8,#0x18
008cd378	bl 0x008b93c8
008cd37c	b 0x008cd2a8
008cd380	cmp w8,#0x3
008cd384	eor w9,w10,#0x1
008cd388	csinc w9,w9,wzr,ne
008cd38c	tbnz w9,#0x0,0x008cd2a8
008cd390	cmp w8,#0x5
008cd394	b.ne 0x008cd2a8
008cd398	ldr x8,[x21]
008cd39c	add x1,sp,#0x10
008cd3a0	add x0,x8,#0x18
008cd3a4	bl 0x008b93c8
008cd3a8	cbz w0,0x008cd2a8
008cd3ac	ldr d0,[sp, #0x10]
008cd3b0	str d0,[sp, #0x8]
008cd3b4	b 0x008cd2a8
008cd3b8	mov x25,x19
008cd3bc	ldr d1,[x25]
008cd3c0	ldr d0,[x24]
008cd3c4	bl 0x00c30770
008cd3c8	mov w8,#0x3
008cd3cc	str d0,[x20]
008cd3d0	str w8,[x20, #0xc]
008cd3d4	ldr x8,[x23, #0x28]
008cd3d8	ldur x9,[x29, #-0x8]
008cd3dc	cmp x8,x9
008cd3e0	b.ne 0x008cd424
008cd3e4	ldp x20,x19,[sp, #0x60]
008cd3e8	ldr x25,[sp, #0x30]
008cd3ec	ldp x22,x21,[sp, #0x50]
008cd3f0	ldp x24,x23,[sp, #0x40]
008cd3f4	ldp x29,x30,[sp, #0x20]
008cd3f8	add sp,sp,#0x70
008cd3fc	ret
008cd400	ldr x8,[x23, #0x28]
008cd404	ldur x9,[x29, #-0x8]
008cd408	cmp x8,x9
008cd40c	b.ne 0x008cd424
008cd410	mov x0,x22
008cd414	mov x1,x21
008cd418	mov x2,x19
008cd41c	mov w3,#0xe
008cd420	bl 0x008b3afc
008cd424	bl 0x00c2fec0
