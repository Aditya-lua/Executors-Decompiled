; FUN_008cbab8 @ 008cbab8
008cbab8	stp x29,x30,[sp, #-0x10]!
008cbabc	mov x29,sp
008cbac0	ldr w8,[x1, #0xc]
008cbac4	ldr w9,[x2, #0xc]
008cbac8	cmp w8,w9
008cbacc	b.ne 0x008cbaf0
008cbad0	cmp w8,#0x3
008cbad4	b.ne 0x008cbaf8
008cbad8	ldr d0,[x1]
008cbadc	ldr d1,[x2]
008cbae0	fcmp d0,d1
008cbae4	cset w0,mi
008cbae8	ldp x29,x30,[sp], #0x10
008cbaec	ret
008cbaf0	mov w3,#0x10
008cbaf4	bl 0x008b3b74
008cbaf8	cmp w8,#0x5
008cbafc	b.ne 0x008cbb18
008cbb00	ldr x0,[x1]
008cbb04	ldr x1,[x2]
008cbb08	bl 0x008cba50
008cbb0c	lsr w0,w0,#0x1f
008cbb10	ldp x29,x30,[sp], #0x10
008cbb14	ret
008cbb18	mov w3,#0x10
008cbb1c	mov w4,#0x1
008cbb20	ldp x29,x30,[sp], #0x10
008cbb24	b 0x008cbb28
008cbb28	stp x29,x30,[sp, #-0x40]!
008cbb2c	stp x24,x23,[sp, #0x10]
008cbb30	stp x22,x21,[sp, #0x20]
008cbb34	stp x20,x19,[sp, #0x30]
008cbb38	mov x29,sp
008cbb3c	mov x19,x2
008cbb40	mov w2,w3
008cbb44	mov w23,w4
008cbb48	mov w22,w3
008cbb4c	mov x21,x1
008cbb50	mov x20,x0
008cbb54	bl 0x008be028
008cbb58	ldr w8,[x0, #0xc]
008cbb5c	cbz w8,0x008cbbc0
008cbb60	mov x24,x0
008cbb64	mov x0,x20
008cbb68	mov x1,x19
008cbb6c	mov w2,w22
008cbb70	bl 0x008be028
008cbb74	mov x1,x0
008cbb78	mov x0,x24
008cbb7c	bl 0x008b9214
008cbb80	cbz w0,0x008cbbc0
008cbb84	ldr x1,[x20, #0x68]
008cbb88	mov x0,x20
008cbb8c	mov x2,x24
008cbb90	mov x3,x21
008cbb94	mov x4,x19
008cbb98	bl 0x008cb070
008cbb9c	ldr x8,[x20, #0x68]
008cbba0	ldr w0,[x8, #0xc]
008cbba4	cbz w0,0x008cbbc8
008cbba8	cmp w0,#0x1
008cbbac	b.ne 0x008cbbdc
008cbbb0	ldr w8,[x8]
008cbbb4	cmp w8,#0x0
008cbbb8	cset w0,ne
008cbbbc	b 0x008cbbc8
008cbbc0	tbnz w23,#0x0,0x008cbbe4
008cbbc4	mov w0,#0xffffffff
008cbbc8	ldp x20,x19,[sp, #0x30]
008cbbcc	ldp x22,x21,[sp, #0x20]
008cbbd0	ldp x24,x23,[sp, #0x10]
008cbbd4	ldp x29,x30,[sp], #0x40
008cbbd8	ret
008cbbdc	mov w0,#0x1
008cbbe0	b 0x008cbbc8
008cbbe4	mov x0,x20
008cbbe8	mov x1,x21
008cbbec	mov x2,x19
008cbbf0	mov w3,w22
008cbbf4	bl 0x008b3b74
