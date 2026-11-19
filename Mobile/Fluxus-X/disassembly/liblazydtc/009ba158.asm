; SSL_CONF_CTX_finish @ 009ba158
009ba158	str x23,[sp, #-0x40]!
009ba15c	stp x22,x21,[sp, #0x10]
009ba160	stp x20,x19,[sp, #0x20]
009ba164	stp x29,x30,[sp, #0x30]
009ba168	ldr x8,[x0, #0x18]
009ba16c	mov x19,x0
009ba170	add x29,sp,#0x30
009ba174	cbz x8,0x009ba19c
009ba178	add x8,x8,#0x158
009ba17c	ldr x8,[x8]
009ba180	cbz x8,0x009ba220
009ba184	ldrb w9,[x19]
009ba188	tbz w9,#0x6,0x009ba220
009ba18c	mov x21,xzr
009ba190	add x22,x19,#0x30
009ba194	add x23,x8,#0x28
009ba198	b 0x009ba1c4
009ba19c	ldr x8,[x19, #0x20]
009ba1a0	cbz x8,0x009ba220
009ba1a4	add x8,x8,#0x898
009ba1a8	ldr x8,[x8]
009ba1ac	cbnz x8,0x009ba184
009ba1b0	b 0x009ba220
009ba1b4	mov w0,#0x1
009ba1b8	ldr x8,[x19, #0x20]
009ba1bc	cbnz x8,0x009ba1f8
009ba1c0	b 0x009ba208
009ba1c4	ldr x20,[x22, x21, LSL #0x3]
009ba1c8	cbz x20,0x009ba210
009ba1cc	ldr x8,[x23]
009ba1d0	cbnz x8,0x009ba210
009ba1d4	ldrb w8,[x19]
009ba1d8	tbz w8,#0x5,0x009ba210
009ba1dc	ldr x0,[x19, #0x18]
009ba1e0	cbz x0,0x009ba1b4
009ba1e4	mov w2,#0x1
009ba1e8	mov x1,x20
009ba1ec	bl 0x00c32830
009ba1f0	ldr x8,[x19, #0x20]
009ba1f4	cbz x8,0x009ba208
009ba1f8	mov w2,#0x1
009ba1fc	mov x0,x8
009ba200	mov x1,x20
009ba204	bl 0x00c35f40
009ba208	cmp w0,#0x1
009ba20c	b.lt 0x009ba278
009ba210	add x21,x21,#0x1
009ba214	cmp x21,#0x9
009ba218	add x23,x23,#0x28
009ba21c	b.cc 0x009ba1c4
009ba220	ldr x1,[x19, #0xa8]
009ba224	cbz x1,0x009ba260
009ba228	ldr x0,[x19, #0x20]
009ba22c	cbz x0,0x009ba238
009ba230	bl 0x00c34f40
009ba234	b 0x009ba25c
009ba238	ldr x0,[x19, #0x18]
009ba23c	cbz x0,0x009ba248
009ba240	bl 0x00c34ec0
009ba244	b 0x009ba25c
009ba248	adrp x8,0xcb5000
009ba24c	ldr x8,[x8, #0x140]
009ba250	mov x0,x1
009ba254	mov x1,x8
009ba258	bl 0x00c32600
009ba25c	str xzr,[x19, #0xa8]
009ba260	mov w0,#0x1
009ba264	ldp x29,x30,[sp, #0x30]
009ba268	ldp x20,x19,[sp, #0x20]
009ba26c	ldp x22,x21,[sp, #0x10]
009ba270	ldr x23,[sp], #0x40
009ba274	ret
009ba278	mov w0,wzr
009ba27c	b 0x009ba264
