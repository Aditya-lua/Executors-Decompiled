; FUN_00b44e44 @ 00b44e44
00b44e44	sub sp,sp,#0x120
00b44e48	stp x28,x27,[sp, #0xc0]
00b44e4c	stp x26,x25,[sp, #0xd0]
00b44e50	stp x24,x23,[sp, #0xe0]
00b44e54	stp x22,x21,[sp, #0xf0]
00b44e58	stp x20,x19,[sp, #0x100]
00b44e5c	stp x29,x30,[sp, #0x110]
00b44e60	add x29,sp,#0x110
00b44e64	mov x21,x3
00b44e68	mov x19,x2
00b44e6c	mov x20,x1
00b44e70	mov x22,x0
00b44e74	bl 0x00c41000
00b44e78	cbz w0,0x00b44ff4
00b44e7c	mov x0,x22
00b44e80	mov x1,x21
00b44e84	bl 0x00b45084
00b44e88	cbz w0,0x00b44ff4
00b44e8c	add x0,x22,#0x10
00b44e90	bl 0x00c41160
00b44e94	cbz x0,0x00b44fc8
00b44e98	ldr w8,[x22, #0x8]
00b44e9c	mov x21,x0
00b44ea0	cmp w8,#0x2
00b44ea4	b.eq 0x00b4501c
00b44ea8	cmp w8,#0x1
00b44eac	mov w23,wzr
00b44eb0	b.ne 0x00b44ff8
00b44eb4	ldr x0,[x22]
00b44eb8	bl 0x00c41210
00b44ebc	ldr x8,[x22, #0x48]
00b44ec0	ldp x27,x28,[x22, #0x38]
00b44ec4	ldr x24,[x22, #0x28]
00b44ec8	ldr x26,[x22, #0x60]
00b44ecc	str x8,[sp, #0x30]
00b44ed0	ldp x8,x25,[x22, #0x50]
00b44ed4	mov x23,x0
00b44ed8	mov x0,x21
00b44edc	str x8,[sp, #0x28]
00b44ee0	bl 0x00c34c20
00b44ee4	cmp w0,#0x1
00b44ee8	b.lt 0x00b44ff4
00b44eec	adrp x8,0x77c000
00b44ef0	sxtw x22,w0
00b44ef4	cmp x27,#0x0
00b44ef8	add x8,x8,#0x150
00b44efc	csel x28,x22,x28,eq
00b44f00	csel x4,x8,x27,eq
00b44f04	cbz x24,0x00b4504c
00b44f08	str x4,[sp, #0x20]
00b44f0c	bl 0x00c31fa0
00b44f10	mov x27,x0
00b44f14	cbz x0,0x00b45040
00b44f18	mov x0,x27
00b44f1c	mov x1,x21
00b44f20	mov x2,xzr
00b44f24	bl 0x00c31f70
00b44f28	cmp w0,#0x1
00b44f2c	b.lt 0x00b45040
00b44f30	add x1,sp,#0x38
00b44f34	mov x0,x27
00b44f38	mov x2,xzr
00b44f3c	bl 0x00c31f60
00b44f40	cmp w0,#0x0
00b44f44	b.le 0x00b45040
00b44f48	mov x0,x27
00b44f4c	bl 0x00c31f90
00b44f50	ldp x4,x3,[sp, #0x28]
00b44f54	add x27,sp,#0x78
00b44f58	add x7,sp,#0x38
00b44f5c	mov x0,x21
00b44f60	mov x1,x24
00b44f64	mov x2,x22
00b44f68	mov x5,x25
00b44f6c	mov x6,x26
00b44f70	str x22,[sp]
00b44f74	stp x27,x22,[sp, #0x8]
00b44f78	bl 0x00b4573c
00b44f7c	cmp w0,#0x0
00b44f80	csel x24,x24,x27,eq
00b44f84	cbz w0,0x00b44ff4
00b44f88	ldr x4,[sp, #0x20]
00b44f8c	mov x0,x23
00b44f90	mov x1,x21
00b44f94	mov x2,x24
00b44f98	mov x3,x22
00b44f9c	mov x5,x28
00b44fa0	mov x6,x20
00b44fa4	mov x7,x19
00b44fa8	bl 0x00b451d8
00b44fac	cmp x24,x27
00b44fb0	mov w23,w0
00b44fb4	b.ne 0x00b44ff8
00b44fb8	add x0,sp,#0x78
00b44fbc	mov x1,x22
00b44fc0	bl 0x00c34750
00b44fc4	b 0x00b44ff8
00b44fc8	bl 0x00c342a0
00b44fcc	adrp x0,0x2be000
00b44fd0	adrp x2,0x2b2000
00b44fd4	add x0,x0,#0xa28
00b44fd8	add x2,x2,#0xfee
00b44fdc	mov w1,#0x2bb
00b44fe0	bl 0x00c342b0
00b44fe4	mov w0,#0x39
00b44fe8	mov w1,#0x81
00b44fec	mov x2,xzr
00b44ff0	bl 0x00c342c0
00b44ff4	mov w23,wzr
00b44ff8	mov w0,w23
00b44ffc	ldp x29,x30,[sp, #0x110]
00b45000	ldp x20,x19,[sp, #0x100]
00b45004	ldp x22,x21,[sp, #0xf0]
00b45008	ldp x24,x23,[sp, #0xe0]
00b4500c	ldp x26,x25,[sp, #0xd0]
00b45010	ldp x28,x27,[sp, #0xc0]
00b45014	add sp,sp,#0x120
00b45018	ret
00b4501c	ldp x1,x2,[x22, #0x38]
00b45020	ldp x3,x4,[x22, #0x48]
00b45024	ldp x5,x6,[x22, #0x58]
00b45028	ldp x7,x8,[x22, #0x68]
00b4502c	mov x0,x21
00b45030	stp x20,x19,[sp, #0x8]
00b45034	str x8,[sp]
00b45038	bl 0x00b4573c
00b4503c	b 0x00b44ffc
00b45040	mov x0,x27
00b45044	bl 0x00c31f90
00b45048	b 0x00b44ff4
00b4504c	adrp x2,0x77c000
00b45050	add x2,x2,#0x150
00b45054	mov x0,x23
00b45058	mov x1,x21
00b4505c	mov x3,xzr
00b45060	mov x5,x28
00b45064	mov x6,x20
00b45068	mov x7,x19
00b4506c	bl 0x00b451d8
00b45070	mov w23,w0
00b45074	b 0x00b44ff8
