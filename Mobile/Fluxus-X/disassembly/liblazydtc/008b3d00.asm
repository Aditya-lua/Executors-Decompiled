; FUN_008b3d00 @ 008b3d00
008b3d00	sub sp,sp,#0x150
008b3d04	stp x29,x30,[sp, #0x110]
008b3d08	str x28,[sp, #0x120]
008b3d0c	stp x22,x21,[sp, #0x130]
008b3d10	stp x20,x19,[sp, #0x140]
008b3d14	add x29,sp,#0x110
008b3d18	mrs x20,tpidr_el0
008b3d1c	ldr x8,[x20, #0x28]
008b3d20	stur x8,[x29, #-0x8]
008b3d24	ldr x22,[x0, #0x50]
008b3d28	ldr x8,[x22, #0x8]
008b3d2c	ldr w9,[x8, #0xc]
008b3d30	cmp w9,#0x7
008b3d34	b.ne 0x008b3d44
008b3d38	ldr x8,[x8]
008b3d3c	ldrb w8,[x8, #0x6]
008b3d40	cbz w8,0x008b3d6c
008b3d44	ldr x8,[x20, #0x28]
008b3d48	ldur x9,[x29, #-0x8]
008b3d4c	cmp x8,x9
008b3d50	b.ne 0x008b3e18
008b3d54	ldp x20,x19,[sp, #0x140]
008b3d58	ldr x28,[sp, #0x120]
008b3d5c	ldp x22,x21,[sp, #0x130]
008b3d60	ldp x29,x30,[sp, #0x110]
008b3d64	add sp,sp,#0x150
008b3d68	b 0x008ac4a8
008b3d6c	ldr x8,[x22]
008b3d70	mov x19,x1
008b3d74	mov x21,x0
008b3d78	add x0,sp,#0x8
008b3d7c	mov w1,#0x100
008b3d80	ldr x8,[x8, #0x70]
008b3d84	ldr w3,[x8, #0x14]
008b3d88	add x2,x8,#0x18
008b3d8c	bl 0x008b9674
008b3d90	ldr x9,[x22, #0x20]
008b3d94	ldr x8,[x22]
008b3d98	mov x2,x0
008b3d9c	cbz x9,0x008b3db4
008b3da0	ldr x10,[x8, #0x30]
008b3da4	subs x9,x9,x10
008b3da8	b.eq 0x008b3db4
008b3dac	lsr x9,x9,#0x2
008b3db0	sub w9,w9,#0x1
008b3db4	ldr x10,[x8, #0x90]
008b3db8	mov x0,x21
008b3dbc	cbz x10,0x008b3ddc
008b3dc0	ldr w11,[x8, #0xa8]
008b3dc4	ldr x8,[x8, #0x8]
008b3dc8	asr w11,w9,w11
008b3dcc	ldrb w9,[x10, w9, SXTW ]
008b3dd0	ldr w8,[x8, w11, SXTW #0x2]
008b3dd4	add w3,w8,w9
008b3dd8	b 0x008b3de0
008b3ddc	mov w3,wzr
008b3de0	adrp x1,0x29f000
008b3de4	add x1,x1,#0x357
008b3de8	mov x4,x19
008b3dec	bl 0x008b9568
008b3df0	ldr x8,[x20, #0x28]
008b3df4	ldur x9,[x29, #-0x8]
008b3df8	cmp x8,x9
008b3dfc	b.ne 0x008b3e18
008b3e00	ldp x20,x19,[sp, #0x140]
008b3e04	ldr x28,[sp, #0x120]
008b3e08	ldp x22,x21,[sp, #0x130]
008b3e0c	ldp x29,x30,[sp, #0x110]
008b3e10	add sp,sp,#0x150
008b3e14	ret
008b3e18	bl 0x00c2fec0
