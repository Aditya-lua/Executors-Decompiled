; FUN_00c25288 @ 00c25288
00c25288	paciasp
00c2528c	stp x29,x30,[sp, #-0x30]!
00c25290	str x21,[sp, #0x10]
00c25294	stp x20,x19,[sp, #0x20]
00c25298	mov x29,sp
00c2529c	ldr x21,[x0, #0x1330]
00c252a0	mov x19,x1
00c252a4	ldr x8,[x21, #0x8]
00c252a8	sub x9,x8,#0xfd0
00c252ac	cmn x9,#0xff1
00c252b0	b.hi 0x00c252d4
00c252b4	mov x20,x0
00c252b8	mov w0,#0x1000
00c252bc	bl 0x00c308d0
00c252c0	cbz x0,0x00c25330
00c252c4	mov x8,xzr
00c252c8	stp x21,xzr,[x0]
00c252cc	mov x21,x0
00c252d0	str x0,[x20, #0x1330]
00c252d4	add x9,x8,#0x20
00c252d8	mov x0,x19
00c252dc	add x20,x21,x8
00c252e0	str x9,[x21, #0x8]
00c252e4	bl 0x00c2ff50
00c252e8	adrp x9,0xcb1000
00c252ec	add x9,x9,#0x4c0
00c252f0	mov w11,#0x540
00c252f4	str x9,[x20, #0x10]!
00c252f8	ldurh w9,[x20, #0x9]
00c252fc	mov x8,x0
00c25300	mov w10,#0x8
00c25304	and w9,w9,#0xf000
00c25308	strb w10,[x20, #0x8]
00c2530c	orr w9,w9,w11
00c25310	stp x19,x8,[x20, #0x10]
00c25314	sturh w9,[x20, #0x9]
00c25318	mov x0,x20
00c2531c	ldp x20,x19,[sp, #0x20]
00c25320	ldr x21,[sp, #0x10]
00c25324	ldp x29,x30,[sp], #0x30
00c25328	autiasp
00c2532c	ret
00c25330	bl 0x00c2fff0
