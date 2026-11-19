; FUN_00c1e91c @ 00c1e91c
00c1e91c	paciasp
00c1e920	stp x29,x30,[sp, #-0x30]!
00c1e924	str x21,[sp, #0x10]
00c1e928	stp x20,x19,[sp, #0x20]
00c1e92c	mov x29,sp
00c1e930	ldp x9,x10,[x1, #0x8]
00c1e934	mov x19,x1
00c1e938	ldr x8,[x1]
00c1e93c	mov x21,x0
00c1e940	add x11,x9,#0x8
00c1e944	cmp x11,x10
00c1e948	b.ls 0x00c1e978
00c1e94c	lsl x10,x10,#0x1
00c1e950	add x9,x9,#0x3e8
00c1e954	mov x0,x8
00c1e958	cmp x10,x9
00c1e95c	csel x1,x10,x9,hi
00c1e960	str x1,[x19, #0x10]
00c1e964	bl 0x00c30950
00c1e968	str x0,[x19]
00c1e96c	cbz x0,0x00c1ea58
00c1e970	ldr x9,[x19, #0x8]
00c1e974	mov x8,x0
00c1e978	mov x10,#0x7527
00c1e97c	movk x10,#0x6e6e, LSL #16
00c1e980	movk x10,#0x6d61, LSL #32
00c1e984	movk x10,#0x6465, LSL #48
00c1e988	str x10,[x8, x9#0x0]
00c1e98c	ldr x8,[x19, #0x8]
00c1e990	add x8,x8,#0x8
00c1e994	str x8,[x19, #0x8]
00c1e998	ldr x20,[x21, #0x18]
00c1e99c	cbz x20,0x00c1e9f8
00c1e9a0	ldr x10,[x19, #0x10]
00c1e9a4	add x9,x8,x20
00c1e9a8	ldr x21,[x21, #0x10]
00c1e9ac	ldr x0,[x19]
00c1e9b0	cmp x9,x10
00c1e9b4	b.ls 0x00c1e9dc
00c1e9b8	lsl x8,x10,#0x1
00c1e9bc	add x9,x9,#0x3e0
00c1e9c0	cmp x8,x9
00c1e9c4	csel x1,x8,x9,hi
00c1e9c8	str x1,[x19, #0x10]
00c1e9cc	bl 0x00c30950
00c1e9d0	str x0,[x19]
00c1e9d4	cbz x0,0x00c1ea60
00c1e9d8	ldr x8,[x19, #0x8]
00c1e9dc	add x0,x0,x8
00c1e9e0	mov x1,x21
00c1e9e4	mov x2,x20
00c1e9e8	bl 0x00c2ffd0
00c1e9ec	ldr x8,[x19, #0x8]
00c1e9f0	add x8,x8,x20
00c1e9f4	str x8,[x19, #0x8]
00c1e9f8	ldr x9,[x19, #0x10]
00c1e9fc	add x10,x8,#0x1
00c1ea00	ldr x0,[x19]
00c1ea04	cmp x10,x9
00c1ea08	b.ls 0x00c1ea30
00c1ea0c	lsl x9,x9,#0x1
00c1ea10	add x8,x8,#0x3e1
00c1ea14	cmp x9,x8
00c1ea18	csel x1,x9,x8,hi
00c1ea1c	str x1,[x19, #0x10]
00c1ea20	bl 0x00c30950
00c1ea24	str x0,[x19]
00c1ea28	cbz x0,0x00c1ea5c
00c1ea2c	ldr x8,[x19, #0x8]
00c1ea30	mov w9,#0x27
00c1ea34	strb w9,[x0, x8]
00c1ea38	ldr x8,[x19, #0x8]
00c1ea3c	add x8,x8,#0x1
00c1ea40	str x8,[x19, #0x8]
00c1ea44	ldp x20,x19,[sp, #0x20]
00c1ea48	ldr x21,[sp, #0x10]
00c1ea4c	ldp x29,x30,[sp], #0x30
00c1ea50	autiasp
00c1ea54	ret
00c1ea58	bl 0x00c30b40
00c1ea5c	bl 0x00c30b40
00c1ea60	bl 0x00c30b40
