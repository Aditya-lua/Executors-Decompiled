; FUN_00c22f34 @ 00c22f34
00c22f34	paciasp
00c22f38	stp x29,x30,[sp, #-0x30]!
00c22f3c	str x21,[sp, #0x10]
00c22f40	stp x20,x19,[sp, #0x20]
00c22f44	mov x29,sp
00c22f48	mov x20,x0
00c22f4c	ldr x0,[x0, #0x10]
00c22f50	mov x19,x1
00c22f54	ldr x8,[x0]
00c22f58	ldr x8,[x8, #0x20]
00c22f5c	blr x8
00c22f60	ldp x8,x9,[x19, #0x8]
00c22f64	ldr x0,[x19]
00c22f68	add x10,x8,#0x5
00c22f6c	cmp x10,x9
00c22f70	b.ls 0x00c22f98
00c22f74	lsl x9,x9,#0x1
00c22f78	add x8,x8,#0x3e5
00c22f7c	cmp x9,x8
00c22f80	csel x1,x9,x8,hi
00c22f84	str x1,[x19, #0x10]
00c22f88	bl 0x00c30950
00c22f8c	str x0,[x19]
00c22f90	cbz x0,0x00c2307c
00c22f94	ldr x8,[x19, #0x8]
00c22f98	mov w10,#0x615b
00c22f9c	add x8,x0,x8
00c22fa0	mov w9,#0x3a
00c22fa4	movk w10,#0x6962, LSL #16
00c22fa8	strb w9,[x8, #0x4]
00c22fac	str w10,[x8]
00c22fb0	ldr x8,[x19, #0x8]
00c22fb4	add x8,x8,#0x5
00c22fb8	str x8,[x19, #0x8]
00c22fbc	ldr x21,[x20, #0x20]
00c22fc0	cbz x21,0x00c2301c
00c22fc4	ldr x10,[x19, #0x10]
00c22fc8	add x9,x8,x21
00c22fcc	ldr x20,[x20, #0x18]
00c22fd0	ldr x0,[x19]
00c22fd4	cmp x9,x10
00c22fd8	b.ls 0x00c23000
00c22fdc	lsl x8,x10,#0x1
00c22fe0	add x9,x9,#0x3e0
00c22fe4	cmp x8,x9
00c22fe8	csel x1,x8,x9,hi
00c22fec	str x1,[x19, #0x10]
00c22ff0	bl 0x00c30950
00c22ff4	str x0,[x19]
00c22ff8	cbz x0,0x00c23084
00c22ffc	ldr x8,[x19, #0x8]
00c23000	add x0,x0,x8
00c23004	mov x1,x20
00c23008	mov x2,x21
00c2300c	bl 0x00c2ffd0
00c23010	ldr x8,[x19, #0x8]
00c23014	add x8,x8,x21
00c23018	str x8,[x19, #0x8]
00c2301c	ldr x9,[x19, #0x10]
00c23020	add x10,x8,#0x1
00c23024	ldr x0,[x19]
00c23028	cmp x10,x9
00c2302c	b.ls 0x00c23054
00c23030	lsl x9,x9,#0x1
00c23034	add x8,x8,#0x3e1
00c23038	cmp x9,x8
00c2303c	csel x1,x9,x8,hi
00c23040	str x1,[x19, #0x10]
00c23044	bl 0x00c30950
00c23048	str x0,[x19]
00c2304c	cbz x0,0x00c23080
00c23050	ldr x8,[x19, #0x8]
00c23054	mov w9,#0x5d
00c23058	strb w9,[x0, x8]
00c2305c	ldr x8,[x19, #0x8]
00c23060	add x8,x8,#0x1
00c23064	str x8,[x19, #0x8]
00c23068	ldp x20,x19,[sp, #0x20]
00c2306c	ldr x21,[sp, #0x10]
00c23070	ldp x29,x30,[sp], #0x30
00c23074	autiasp
00c23078	ret
00c2307c	bl 0x00c30b40
00c23080	bl 0x00c30b40
00c23084	bl 0x00c30b40
