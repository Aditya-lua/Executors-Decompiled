; FUN_00c2323c @ 00c2323c
00c2323c	paciasp
00c23240	stp x29,x30,[sp, #-0x40]!
00c23244	str x23,[sp, #0x10]
00c23248	stp x22,x21,[sp, #0x20]
00c2324c	stp x20,x19,[sp, #0x30]
00c23250	mov x29,sp
00c23254	ldr x23,[x0, #0x1330]
00c23258	mov x19,x3
00c2325c	mov x20,x2
00c23260	mov x21,x1
00c23264	ldr x8,[x23, #0x8]
00c23268	sub x9,x8,#0xfd0
00c2326c	cmn x9,#0xff1
00c23270	b.hi 0x00c23294
00c23274	mov x22,x0
00c23278	mov w0,#0x1000
00c2327c	bl 0x00c308d0
00c23280	cbz x0,0x00c232f8
00c23284	mov x8,xzr
00c23288	stp x23,xzr,[x0]
00c2328c	mov x23,x0
00c23290	str x0,[x22, #0x1330]
00c23294	add x9,x8,#0x20
00c23298	add x0,x23,x8
00c2329c	ldr x8,[x21]
00c232a0	str x9,[x23, #0x8]
00c232a4	adrp x9,0xcb3000
00c232a8	add x9,x9,#0x278
00c232ac	str x9,[x0, #0x10]!
00c232b0	ldurh w9,[x0, #0x9]
00c232b4	mov w10,#0x31
00c232b8	ldrb w11,[x20]
00c232bc	str x8,[x0, #0x10]
00c232c0	strb w10,[x0, #0x8]
00c232c4	mov w10,#0x540
00c232c8	and w8,w9,#0xf000
00c232cc	ldr w9,[x19]
00c232d0	orr w8,w8,w10
00c232d4	strb w11,[x0, #0x18]
00c232d8	sturh w8,[x0, #0x9]
00c232dc	str w9,[x0, #0x1c]
00c232e0	ldp x20,x19,[sp, #0x30]
00c232e4	ldr x23,[sp, #0x10]
00c232e8	ldp x22,x21,[sp, #0x20]
00c232ec	ldp x29,x30,[sp], #0x40
00c232f0	autiasp
00c232f4	ret
00c232f8	bl 0x00c2fff0
