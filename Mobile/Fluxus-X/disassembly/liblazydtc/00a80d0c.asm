; FUN_00a80d0c @ 00a80d0c
00a80d0c	cbz x0,0x00a80e30
00a80d10	stp x22,x21,[sp, #-0x30]!
00a80d14	stp x20,x19,[sp, #0x10]
00a80d18	stp x29,x30,[sp, #0x20]
00a80d1c	add x29,sp,#0x20
00a80d20	mov x19,x0
00a80d24	bl 0x00c3deb0
00a80d28	ldr x20,[x19, #0x1b8]
00a80d2c	cbz x20,0x00a80d60
00a80d30	adrp x21,0x2aa000
00a80d34	add x21,x21,#0x296
00a80d38	ldr x8,[x20]
00a80d3c	mov x0,x19
00a80d40	blr x8
00a80d44	ldr x22,[x20, #0x8]
00a80d48	mov w2,#0x84
00a80d4c	mov x0,x20
00a80d50	mov x1,x21
00a80d54	bl 0x00c32310
00a80d58	mov x20,x22
00a80d5c	cbnz x22,0x00a80d38
00a80d60	add x2,x19,#0x8
00a80d64	mov w0,#0x10
00a80d68	mov x1,xzr
00a80d6c	bl 0x00c356c0
00a80d70	mov x0,x19
00a80d74	bl 0x00c3de80
00a80d78	ldr x0,[x19, #0x100]
00a80d7c	bl 0x00c34d40
00a80d80	ldr x0,[x19, #0x108]
00a80d84	bl 0x00c34d40
00a80d88	ldr x0,[x19, #0x110]
00a80d8c	bl 0x00c34d40
00a80d90	ldr x0,[x19, #0x118]
00a80d94	bl 0x00c34d40
00a80d98	ldr x0,[x19, #0x120]
00a80d9c	bl 0x00c34d40
00a80da0	ldr x0,[x19, #0x128]
00a80da4	bl 0x00c34d40
00a80da8	ldr x0,[x19, #0x130]
00a80dac	bl 0x00c34d40
00a80db0	ldr x0,[x19, #0x138]
00a80db4	bl 0x00c34d40
00a80db8	ldr x0,[x19, #0x140]
00a80dbc	bl 0x00c34d40
00a80dc0	ldr x0,[x19, #0x148]
00a80dc4	bl 0x00c34d40
00a80dc8	ldr x0,[x19, #0x150]
00a80dcc	bl 0x00c34d40
00a80dd0	ldr x0,[x19, #0x158]
00a80dd4	bl 0x00c34d40
00a80dd8	ldr x0,[x19, #0x160]
00a80ddc	bl 0x00c34d40
00a80de0	ldr x0,[x19, #0x168]
00a80de4	bl 0x00c34d40
00a80de8	ldr x0,[x19, #0x170]
00a80dec	bl 0x00c34d40
00a80df0	ldr x0,[x19, #0x178]
00a80df4	bl 0x00c34d40
00a80df8	ldr x0,[x19, #0x180]
00a80dfc	bl 0x00c34d40
00a80e00	ldr x0,[x19, #0x188]
00a80e04	bl 0x00c34d40
00a80e08	ldr x0,[x19, #0x190]
00a80e0c	bl 0x00c34d40
00a80e10	ldr x0,[x19, #0x198]
00a80e14	bl 0x00c34d40
00a80e18	ldr x0,[x19]
00a80e1c	bl 0x00c34d40
00a80e20	str xzr,[x19]
00a80e24	ldp x29,x30,[sp, #0x20]
00a80e28	ldp x20,x19,[sp, #0x10]
00a80e2c	ldp x22,x21,[sp], #0x30
00a80e30	ret
