; FUN_00a80e90 @ 00a80e90
00a80e90	str x21,[sp, #-0x30]!
00a80e94	stp x20,x19,[sp, #0x10]
00a80e98	stp x29,x30,[sp, #0x20]
00a80e9c	add x29,sp,#0x20
00a80ea0	mov x19,x0
00a80ea4	bl 0x00c34d50
00a80ea8	str x0,[x19]
00a80eac	cbz x0,0x00a80fe4
00a80eb0	bl 0x00c34d50
00a80eb4	str x0,[x19, #0x198]
00a80eb8	cbz x0,0x00a80f28
00a80ebc	mov x20,xzr
00a80ec0	mov w21,#0xffffffff
00a80ec4	bl 0x00c34d50
00a80ec8	add x8,x19,x20, LSL #0x3
00a80ecc	add x9,x19,x20, LSL #0x2
00a80ed0	str x0,[x8, #0x100]
00a80ed4	str w21,[x9, #0xb0]
00a80ed8	cbz x0,0x00a80f28
00a80edc	add x20,x20,#0x1
00a80ee0	cmp x20,#0x12
00a80ee4	b.ls 0x00a80ec4
00a80ee8	mov x0,x19
00a80eec	bl 0x00c3dec0
00a80ef0	cbz w0,0x00a80f28
00a80ef4	add x3,x19,#0x8
00a80ef8	mov w1,#0x10
00a80efc	mov x0,x19
00a80f00	mov x2,xzr
00a80f04	bl 0x00c3a320
00a80f08	cbz w0,0x00a80f20
00a80f0c	mov x0,x19
00a80f10	bl 0x00c3df30
00a80f14	cbz w0,0x00a80f20
00a80f18	mov w0,#0x1
00a80f1c	b 0x00a80fe4
00a80f20	mov x0,x19
00a80f24	bl 0x00c3de80
00a80f28	ldr x0,[x19, #0x100]
00a80f2c	bl 0x00c34d40
00a80f30	ldr x0,[x19, #0x108]
00a80f34	bl 0x00c34d40
00a80f38	ldr x0,[x19, #0x110]
00a80f3c	bl 0x00c34d40
00a80f40	ldr x0,[x19, #0x118]
00a80f44	bl 0x00c34d40
00a80f48	ldr x0,[x19, #0x120]
00a80f4c	bl 0x00c34d40
00a80f50	ldr x0,[x19, #0x128]
00a80f54	bl 0x00c34d40
00a80f58	ldr x0,[x19, #0x130]
00a80f5c	bl 0x00c34d40
00a80f60	ldr x0,[x19, #0x138]
00a80f64	bl 0x00c34d40
00a80f68	ldr x0,[x19, #0x140]
00a80f6c	bl 0x00c34d40
00a80f70	ldr x0,[x19, #0x148]
00a80f74	bl 0x00c34d40
00a80f78	ldr x0,[x19, #0x150]
00a80f7c	bl 0x00c34d40
00a80f80	ldr x0,[x19, #0x158]
00a80f84	bl 0x00c34d40
00a80f88	ldr x0,[x19, #0x160]
00a80f8c	bl 0x00c34d40
00a80f90	ldr x0,[x19, #0x168]
00a80f94	bl 0x00c34d40
00a80f98	ldr x0,[x19, #0x170]
00a80f9c	bl 0x00c34d40
00a80fa0	ldr x0,[x19, #0x178]
00a80fa4	bl 0x00c34d40
00a80fa8	ldr x0,[x19, #0x180]
00a80fac	bl 0x00c34d40
00a80fb0	ldr x0,[x19, #0x188]
00a80fb4	bl 0x00c34d40
00a80fb8	ldr x0,[x19, #0x190]
00a80fbc	bl 0x00c34d40
00a80fc0	ldr x0,[x19, #0x198]
00a80fc4	bl 0x00c34d40
00a80fc8	ldr x0,[x19]
00a80fcc	bl 0x00c34d40
00a80fd0	mov w2,#0x1c8
00a80fd4	mov x0,x19
00a80fd8	mov w1,wzr
00a80fdc	bl 0x00c301c0
00a80fe0	mov w0,wzr
00a80fe4	ldp x29,x30,[sp, #0x20]
00a80fe8	ldp x20,x19,[sp, #0x10]
00a80fec	ldr x21,[sp], #0x30
00a80ff0	ret
