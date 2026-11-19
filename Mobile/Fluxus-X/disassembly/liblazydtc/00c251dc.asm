; FUN_00c251dc @ 00c251dc
00c251dc	paciasp
00c251e0	stp x29,x30,[sp, #-0x30]!
00c251e4	str x21,[sp, #0x10]
00c251e8	stp x20,x19,[sp, #0x20]
00c251ec	mov x29,sp
00c251f0	ldr x21,[x0, #0x1330]
00c251f4	mov x19,x1
00c251f8	ldr x8,[x21, #0x8]
00c251fc	sub x9,x8,#0xfd0
00c25200	cmn x9,#0xff1
00c25204	b.hi 0x00c25228
00c25208	mov x20,x0
00c2520c	mov w0,#0x1000
00c25210	bl 0x00c308d0
00c25214	cbz x0,0x00c25284
00c25218	mov x8,xzr
00c2521c	stp x21,xzr,[x0]
00c25220	mov x21,x0
00c25224	str x0,[x20, #0x1330]
00c25228	add x9,x8,#0x20
00c2522c	mov x0,x19
00c25230	add x20,x21,x8
00c25234	str x9,[x21, #0x8]
00c25238	bl 0x00c2ff50
00c2523c	adrp x9,0xcb1000
00c25240	add x9,x9,#0x4c0
00c25244	mov w11,#0x540
00c25248	str x9,[x20, #0x10]!
00c2524c	ldurh w9,[x20, #0x9]
00c25250	mov x8,x0
00c25254	mov w10,#0x8
00c25258	and w9,w9,#0xf000
00c2525c	strb w10,[x20, #0x8]
00c25260	orr w9,w9,w11
00c25264	stp x19,x8,[x20, #0x10]
00c25268	sturh w9,[x20, #0x9]
00c2526c	mov x0,x20
00c25270	ldp x20,x19,[sp, #0x20]
00c25274	ldr x21,[sp, #0x10]
00c25278	ldp x29,x30,[sp], #0x30
00c2527c	autiasp
00c25280	ret
00c25284	bl 0x00c2fff0
