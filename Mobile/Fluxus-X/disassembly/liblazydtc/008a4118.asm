; FUN_008a4118 @ 008a4118
008a4118	stp x29,x30,[sp, #-0x20]!
008a411c	str x19,[sp, #0x10]
008a4120	mov x29,sp
008a4124	mov x19,x0
008a4128	ldr x0,[x0, #0x118]
008a412c	adrp x8,0xc4c000
008a4130	add x8,x8,#0x4b8
008a4134	str x8,[x19]
008a4138	cbz x0,0x008a4168
008a413c	bl 0x00c301d0
008a4140	ldr x0,[x19, #0x130]
008a4144	str xzr,[x19, #0x118]
008a4148	bl 0x00c301d0
008a414c	mov x0,xzr
008a4150	stp xzr,xzr,[x19, #0x120]
008a4154	str xzr,[x19, #0x130]
008a4158	bl 0x00c301d0
008a415c	mov w8,#0x40
008a4160	str xzr,[x19, #0x138]
008a4164	strb w8,[x19, #0x148]
008a4168	ldr x0,[x19, #0x130]
008a416c	bl 0x00c301d0
008a4170	ldr x0,[x19, #0xe0]
008a4174	cbz x0,0x008a41a4
008a4178	bl 0x00c301d0
008a417c	ldr x0,[x19, #0xf8]
008a4180	str xzr,[x19, #0xe0]
008a4184	bl 0x00c301d0
008a4188	mov x0,xzr
008a418c	stp xzr,xzr,[x19, #0xe8]
008a4190	str xzr,[x19, #0xf8]
008a4194	bl 0x00c301d0
008a4198	mov w8,#0x40
008a419c	str xzr,[x19, #0x100]
008a41a0	strb w8,[x19, #0x110]
008a41a4	ldr x0,[x19, #0xf8]
008a41a8	bl 0x00c301d0
008a41ac	ldr x0,[x19, #0xa8]
008a41b0	cbz x0,0x008a41e0
008a41b4	bl 0x00c301d0
008a41b8	ldr x0,[x19, #0xc0]
008a41bc	str xzr,[x19, #0xa8]
008a41c0	bl 0x00c301d0
008a41c4	mov x0,xzr
008a41c8	stp xzr,xzr,[x19, #0xb0]
008a41cc	str xzr,[x19, #0xc0]
008a41d0	bl 0x00c301d0
008a41d4	mov w8,#0x40
008a41d8	str xzr,[x19, #0xc8]
008a41dc	strb w8,[x19, #0xd8]
008a41e0	ldr x0,[x19, #0xc0]
008a41e4	bl 0x00c301d0
008a41e8	ldr x0,[x19, #0x90]
008a41ec	cbz x0,0x008a4200
008a41f0	ldr x8,[x19, #0xa0]
008a41f4	str x0,[x19, #0x98]
008a41f8	sub x1,x8,x0
008a41fc	bl 0x00c2fe80
008a4200	ldr x0,[x19, #0x58]
008a4204	cbz x0,0x008a4234
008a4208	bl 0x00c301d0
008a420c	ldr x0,[x19, #0x70]
008a4210	str xzr,[x19, #0x58]
008a4214	bl 0x00c301d0
008a4218	mov x0,xzr
008a421c	stp xzr,xzr,[x19, #0x60]
008a4220	str xzr,[x19, #0x70]
008a4224	bl 0x00c301d0
008a4228	mov w8,#0x40
008a422c	str xzr,[x19, #0x78]
008a4230	strb w8,[x19, #0x88]
008a4234	ldr x0,[x19, #0x70]
008a4238	ldr x19,[sp, #0x10]
008a423c	ldp x29,x30,[sp], #0x20
008a4240	b 0x00c301d0
