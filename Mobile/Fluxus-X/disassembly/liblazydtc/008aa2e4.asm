; FUN_008aa2e4 @ 008aa2e4
008aa2e4	stp x29,x30,[sp, #-0x30]!
008aa2e8	str x21,[sp, #0x10]
008aa2ec	stp x20,x19,[sp, #0x20]
008aa2f0	mov x29,sp
008aa2f4	mov w19,#0x2ef0
008aa2f8	cmp w1,#0x1
008aa2fc	adrp x21,0xd1f000
008aa300	add x21,x21,#0x1e0
008aa304	movk w19,#0x7f, LSL #16
008aa308	adrp x20,0xd1f000
008aa30c	b.lt 0x008aa338
008aa310	ldp x9,x8,[x0, #0x68]
008aa314	add x8,x8,w1, UXTW  #0x4
008aa318	sub x0,x8,#0x10
008aa31c	cmp x0,x9
008aa320	b.cc 0x008aa354
008aa324	ldarb w8,[x21]
008aa328	tbz w8,#0x0,0x008aa3c0
008aa32c	ldr x8,[x20, #0x1d8]
008aa330	add x0,x8,x19
008aa334	b 0x008aa354
008aa338	mov w8,#0xffffd8f1
008aa33c	cmp w1,w8
008aa340	b.lt 0x008aa350
008aa344	ldr x8,[x0, #0x68]
008aa348	add x0,x8,w1, SXTW  #0x4
008aa34c	b 0x008aa354
008aa350	bl 0x008aea7c
008aa354	ldarb w8,[x21]
008aa358	tbz w8,#0x0,0x008aa37c
008aa35c	ldr x8,[x20, #0x1d8]
008aa360	add x8,x8,x19
008aa364	cmp x0,x8
008aa368	csel x0,xzr,x0,eq
008aa36c	ldp x20,x19,[sp, #0x20]
008aa370	ldr x21,[sp, #0x10]
008aa374	ldp x29,x30,[sp], #0x30
008aa378	ret
008aa37c	adrp x8,0xd1f000
008aa380	add x8,x8,#0x1e0
008aa384	mov x21,x0
008aa388	mov x0,x8
008aa38c	bl 0x00c2fe90
008aa390	mov w8,w0
008aa394	mov x0,x21
008aa398	cbz w8,0x008aa35c
008aa39c	adrp x8,0xcca000
008aa3a0	ldr x0,[x8, #0x8c8]
008aa3a4	bl 0x007fe1ec
008aa3a8	str x0,[x20, #0x1d8]
008aa3ac	adrp x0,0xd1f000
008aa3b0	add x0,x0,#0x1e0
008aa3b4	bl 0x00c2fea0
008aa3b8	mov x0,x21
008aa3bc	b 0x008aa35c
008aa3c0	adrp x0,0xd1f000
008aa3c4	add x0,x0,#0x1e0
008aa3c8	bl 0x00c2fe90
008aa3cc	cbz w0,0x008aa32c
008aa3d0	adrp x8,0xcca000
008aa3d4	ldr x0,[x8, #0x8c8]
008aa3d8	bl 0x007fe1ec
008aa3dc	str x0,[x20, #0x1d8]
008aa3e0	adrp x0,0xd1f000
008aa3e4	add x0,x0,#0x1e0
008aa3e8	bl 0x00c2fea0
008aa3ec	b 0x008aa32c
