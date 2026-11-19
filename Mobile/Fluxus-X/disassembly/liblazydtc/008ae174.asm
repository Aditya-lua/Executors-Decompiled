; FUN_008ae174 @ 008ae174
008ae174	sub sp,sp,#0x40
008ae178	stp x29,x30,[sp, #0x10]
008ae17c	str x21,[sp, #0x20]
008ae180	stp x20,x19,[sp, #0x30]
008ae184	add x29,sp,#0x10
008ae188	mrs x21,tpidr_el0
008ae18c	mov x19,x0
008ae190	mov w20,w1
008ae194	ldr x8,[x21, #0x28]
008ae198	str x8,[sp, #0x8]
008ae19c	ldrb w8,[x0, #0x2]
008ae1a0	tbz w8,#0x2,0x008ae1b4
008ae1a4	add x2,x19,#0x38
008ae1a8	mov x0,x19
008ae1ac	mov x1,x19
008ae1b0	bl 0x008b63a4
008ae1b4	ldr x9,[x19, #0x50]
008ae1b8	ldr x8,[x19, #0x68]
008ae1bc	ldr x10,[x9, #0x18]
008ae1c0	add x11,x8,#0x10
008ae1c4	cmp x11,x10
008ae1c8	b.ls 0x008ae230
008ae1cc	ldr x11,[x19, #0x70]
008ae1d0	mov w12,#0xf3f0
008ae1d4	movk w12,#0x1, LSL #16
008ae1d8	sub x11,x8,x11
008ae1dc	cmp x11,x12
008ae1e0	b.gt 0x008ae2e0
008ae1e4	ldr x11,[x19, #0x48]
008ae1e8	sub x11,x11,x8
008ae1ec	cmp x11,#0x10
008ae1f0	b.gt 0x008ae220
008ae1f4	mov w8,#0x1
008ae1f8	nop
008ae1fc	adr x1,0x8aa604
008ae200	add x2,sp,#0x4
008ae204	mov x0,x19
008ae208	str w8,[sp, #0x4]
008ae20c	bl 0x008b3edc
008ae210	cbnz w0,0x008ae2e0
008ae214	ldr x9,[x19, #0x50]
008ae218	ldr x8,[x19, #0x68]
008ae21c	ldr x10,[x9, #0x18]
008ae220	add x11,x8,#0x10
008ae224	cmp x10,x11
008ae228	b.cs 0x008ae230
008ae22c	str x11,[x9, #0x18]
008ae230	cmp w20,#0x1
008ae234	b.lt 0x008ae270
008ae238	ldr x9,[x19, #0x70]
008ae23c	add x9,x9,w20, UXTW  #0x4
008ae240	sub x0,x9,#0x10
008ae244	cmp x0,x8
008ae248	b.cc 0x008ae290
008ae24c	adrp x8,0xd1f000
008ae250	add x8,x8,#0x1e0
008ae254	adrp x20,0xd1f000
008ae258	ldarb w8,[x8]
008ae25c	tbz w8,#0x0,0x008ae308
008ae260	ldr x8,[x20, #0x1d8]
008ae264	add x8,x8,#0x7f2, LSL #12
008ae268	add x0,x8,#0xef0
008ae26c	b 0x008ae290
008ae270	mov w9,#0xffffd8f1
008ae274	cmp w20,w9
008ae278	b.lt 0x008ae284
008ae27c	add x0,x8,w20, SXTW  #0x4
008ae280	b 0x008ae290
008ae284	mov x0,x19
008ae288	mov w1,w20
008ae28c	bl 0x008aea7c
008ae290	ldr x8,[x19, #0x68]
008ae294	ldr x1,[x0]
008ae298	mov x0,x19
008ae29c	sub x2,x8,#0x10
008ae2a0	bl 0x008ba594
008ae2a4	ldr x8,[x19, #0x68]
008ae2a8	cmp w0,#0x0
008ae2ac	mov x9,#-0x10
008ae2b0	cneg x9,x9,ne
008ae2b4	add x8,x8,x9
008ae2b8	str x8,[x19, #0x68]
008ae2bc	ldr x8,[x21, #0x28]
008ae2c0	ldr x9,[sp, #0x8]
008ae2c4	cmp x8,x9
008ae2c8	b.ne 0x008ae360
008ae2cc	ldp x20,x19,[sp, #0x30]
008ae2d0	ldr x21,[sp, #0x20]
008ae2d4	ldp x29,x30,[sp, #0x10]
008ae2d8	add sp,sp,#0x40
008ae2dc	ret
008ae2e0	adrp x1,0x2b6000
008ae2e4	add x1,x1,#0xc71
008ae2e8	mov x0,x19
008ae2ec	bl 0x008b9568
008ae2f0	ldr x8,[x21, #0x28]
008ae2f4	ldr x9,[sp, #0x8]
008ae2f8	cmp x8,x9
008ae2fc	b.ne 0x008ae360
008ae300	mov x0,x19
008ae304	bl 0x008aa5f4
008ae308	adrp x0,0xd1f000
008ae30c	add x0,x0,#0x1e0
008ae310	bl 0x00c2fe90
008ae314	cbz w0,0x008ae260
008ae318	adrp x8,0xcca000
008ae31c	ldr x0,[x8, #0x8c8]
008ae320	bl 0x007fe1ec
008ae324	str x0,[x20, #0x1d8]
008ae328	adrp x0,0xd1f000
008ae32c	add x0,x0,#0x1e0
008ae330	bl 0x00c2fea0
008ae334	b 0x008ae260
008ae360	bl 0x00c2fec0
