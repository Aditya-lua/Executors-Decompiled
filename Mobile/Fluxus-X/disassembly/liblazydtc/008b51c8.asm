; FUN_008b51c8 @ 008b51c8
008b51c8	ldr x8,[x0, #0x60]
008b51cc	ldr x8,[x8, #0x718]
008b51d0	cbz x8,0x008b51dc
008b51d4	ldrb w8,[x2, #0x6]
008b51d8	cbz w8,0x008b51e4
008b51dc	mov w0,wzr
008b51e0	ret
008b51e4	ldr x8,[x1, #0x18]
008b51e8	ldr x9,[x2, #0x18]
008b51ec	ldr x8,[x8, #0xc0]
008b51f0	ldr w9,[x9, #0xcc]
008b51f4	add x8,x8,w3, UXTW  #0x4
008b51f8	ldr w10,[x8, #0x8]
008b51fc	cbz w10,0x008b520c
008b5200	cmp w10,w9
008b5204	b.eq 0x008b5210
008b5208	b 0x008b51dc
008b520c	stur w9,[x8, #0x8]
008b5210	ldur w9,[x8, #0xc]
008b5214	adrp x10,0xd1f000
008b5218	add w9,w9,#0x1
008b521c	stur w9,[x8, #0xc]
008b5220	ldr w10,[x10, #0x470]
008b5224	cmp w9,w10
008b5228	b.ge 0x008b5234
008b522c	mov w0,#0x1
008b5230	ret
008b5234	stp x29,x30,[sp, #-0x10]!
008b5238	mov x29,sp
008b523c	ldr x9,[x0, #0x60]
008b5240	ldur w3,[x8, #0x4]
008b5244	ldr x9,[x9, #0x718]
008b5248	blr x9
008b524c	mov w0,wzr
008b5250	ldp x29,x30,[sp], #0x10
008b5254	ret
