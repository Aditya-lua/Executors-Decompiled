; FUN_008ad20c @ 008ad20c
008ad20c	sub sp,sp,#0x30
008ad210	stp x29,x30,[sp, #0x10]
008ad214	stp x20,x19,[sp, #0x20]
008ad218	add x29,sp,#0x10
008ad21c	cmp w1,#0x1
008ad220	b.lt 0x008ad25c
008ad224	ldp x9,x8,[x0, #0x68]
008ad228	add x8,x8,w1, UXTW  #0x4
008ad22c	sub x8,x8,#0x10
008ad230	cmp x8,x9
008ad234	b.cc 0x008ad28c
008ad238	adrp x8,0xd1f000
008ad23c	add x8,x8,#0x1e0
008ad240	adrp x19,0xd1f000
008ad244	ldarb w8,[x8]
008ad248	tbz w8,#0x0,0x008ad2a8
008ad24c	ldr x8,[x19, #0x1d8]
008ad250	add x8,x8,#0x7f2, LSL #12
008ad254	add x8,x8,#0xef0
008ad258	b 0x008ad28c
008ad25c	mov w8,#0xffffd8f1
008ad260	cmp w1,w8
008ad264	b.lt 0x008ad274
008ad268	ldr x8,[x0, #0x68]
008ad26c	add x8,x8,w1, SXTW  #0x4
008ad270	b 0x008ad28c
008ad274	mov x19,x0
008ad278	mov w20,w2
008ad27c	bl 0x008aea7c
008ad280	mov w2,w20
008ad284	mov x8,x0
008ad288	mov x0,x19
008ad28c	ldr x1,[x8]
008ad290	cmp w2,#0x0
008ad294	cset w2,ne
008ad298	ldp x20,x19,[sp, #0x20]
008ad29c	ldp x29,x30,[sp, #0x10]
008ad2a0	add sp,sp,#0x30
008ad2a4	b 0x008bd4ec
008ad2a8	adrp x8,0xd1f000
008ad2ac	add x8,x8,#0x1e0
008ad2b0	str x0,[sp, #0x8]
008ad2b4	mov x0,x8
008ad2b8	str w2,[sp, #0x4]
008ad2bc	bl 0x00c2fe90
008ad2c0	ldr w2,[sp, #0x4]
008ad2c4	mov w8,w0
008ad2c8	ldr x0,[sp, #0x8]
008ad2cc	cbz w8,0x008ad24c
008ad2d0	adrp x8,0xcca000
008ad2d4	ldr x0,[x8, #0x8c8]
008ad2d8	bl 0x007fe1ec
008ad2dc	str x0,[x19, #0x1d8]
008ad2e0	adrp x0,0xd1f000
008ad2e4	add x0,x0,#0x1e0
008ad2e8	bl 0x00c2fea0
008ad2ec	ldr w2,[sp, #0x4]
008ad2f0	ldr x0,[sp, #0x8]
008ad2f4	b 0x008ad24c
