; FUN_0080c1b0 @ 0080c1b0
0080c1b0	sub sp,sp,#0x40
0080c1b4	stp x29,x30,[sp, #0x10]
0080c1b8	stp x22,x21,[sp, #0x20]
0080c1bc	stp x20,x19,[sp, #0x30]
0080c1c0	add x29,sp,#0x10
0080c1c4	mrs x22,tpidr_el0
0080c1c8	mov x21,x2
0080c1cc	mov x19,x1
0080c1d0	ldr x8,[x22, #0x28]
0080c1d4	mov x20,x0
0080c1d8	str x8,[sp, #0x8]
0080c1dc	ldrb w8,[x2, #0xd]
0080c1e0	cmp w8,#0x1
0080c1e4	b.ne 0x0080c22c
0080c1e8	ldr s0,[x21, #0x8]
0080c1ec	adrp x8,0x29a000
0080c1f0	mov w9,#0x95
0080c1f4	ldr d1,[x8, #0xad0]
0080c1f8	adrp x8,0x29b000
0080c1fc	strb wzr,[x21, #0xd]
0080c200	uxtl v0.8H,v0.8B
0080c204	ldr d2,[x8, #0xeb0]
0080c208	ldrb w8,[x21, #0xc]
0080c20c	eor w8,w8,w9
0080c210	eor v0.8B,v0.8B,v1.8B
0080c214	ldr d1,[x21]
0080c218	strb w8,[x21, #0xc]
0080c21c	eor v1.8B,v1.8B,v2.8B
0080c220	uzp1 v0.8B,v0.8B,v0.8B
0080c224	str d1,[x21]
0080c228	str s0,[x21, #0x8]
0080c22c	mov x0,x20
0080c230	mov x1,x19
0080c234	mov x2,x21
0080c238	mov w3,wzr
0080c23c	mov x4,xzr
0080c240	bl 0x008ac76c
0080c244	mov x0,x20
0080c248	mov w1,#0xffffffff
0080c24c	bl 0x008aa2e4
0080c250	ldr x8,[x0]
0080c254	adrp x0,0xd1b000
0080c258	add x0,x0,#0x520
0080c25c	mov x1,sp
0080c260	mov x2,sp
0080c264	str x8,[sp]
0080c268	bl 0x00807f14
0080c26c	adrp x0,0xcca000
0080c270	add x0,x0,#0x848
0080c274	mov x1,sp
0080c278	mov x2,sp
0080c27c	str x19,[sp]
0080c280	bl 0x0080837c
0080c284	mov x0,x20
0080c288	mov w1,#0xffffd8ee
0080c28c	mov x2,x21
0080c290	bl 0x008ad800
0080c294	ldr x8,[x22, #0x28]
0080c298	ldr x9,[sp, #0x8]
0080c29c	cmp x8,x9
0080c2a0	b.ne 0x0080c2b8
0080c2a4	ldp x20,x19,[sp, #0x30]
0080c2a8	ldp x22,x21,[sp, #0x20]
0080c2ac	ldp x29,x30,[sp, #0x10]
0080c2b0	add sp,sp,#0x40
0080c2b4	ret
0080c2b8	bl 0x00c2fec0
