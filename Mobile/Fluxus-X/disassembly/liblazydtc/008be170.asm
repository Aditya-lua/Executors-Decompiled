; FUN_008be170 @ 008be170
008be170	stp x29,x30,[sp, #-0x20]!
008be174	stp x20,x19,[sp, #0x10]
008be178	mov x29,sp
008be17c	ldr w8,[x1, #0xc]
008be180	mov x19,x1
008be184	mov x20,x0
008be188	cmp w8,#0x2
008be18c	b.eq 0x008be1dc
008be190	cmp w8,#0x8
008be194	b.ne 0x008be1f8
008be198	ldr x9,[x19]
008be19c	ldrb w10,[x9, #0x3]
008be1a0	cmp w10,#0x81
008be1a4	b.eq 0x008be1f8
008be1a8	ldr x0,[x9, #0x8]
008be1ac	cbz x0,0x008be1f8
008be1b0	ldr x8,[x20, #0x60]
008be1b4	ldr x1,[x8, #0x3d0]
008be1b8	bl 0x008bb440
008be1bc	ldr w8,[x0, #0xc]
008be1c0	cmp w8,#0x5
008be1c4	b.eq 0x008be220
008be1c8	ldr x8,[x20, #0x60]
008be1cc	ldrsw x9,[x19, #0xc]
008be1d0	add x8,x8,x9, LSL #0x3
008be1d4	add x0,x8,#0x3e0
008be1d8	b 0x008be220
008be1dc	ldr w9,[x19, #0x8]
008be1e0	cmp w9,#0x7f
008be1e4	b.hi 0x008be1f8
008be1e8	ldr x10,[x20, #0x60]
008be1ec	add x9,x10,x9, LSL #0x3
008be1f0	ldr x0,[x9, #0x4c68]
008be1f4	cbnz x0,0x008be238
008be1f8	sxtw x9,w8
008be1fc	ldr x8,[x20, #0x60]
008be200	add x10,x8,x9, LSL #0x3
008be204	ldr x0,[x10, #0x448]
008be208	cbz x0,0x008be230
008be20c	ldr x1,[x8, #0x3d0]
008be210	bl 0x008bb440
008be214	ldr w8,[x0, #0xc]
008be218	cmp w8,#0x5
008be21c	b.ne 0x008be228
008be220	ldr x0,[x0]
008be224	b 0x008be238
008be228	ldr x8,[x20, #0x60]
008be22c	ldrsw x9,[x19, #0xc]
008be230	add x8,x8,x9, LSL #0x3
008be234	ldr x0,[x8, #0x3e0]
008be238	ldp x20,x19,[sp, #0x10]
008be23c	ldp x29,x30,[sp], #0x20
008be240	ret
