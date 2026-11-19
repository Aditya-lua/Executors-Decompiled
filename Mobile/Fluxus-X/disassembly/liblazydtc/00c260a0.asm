; FUN_00c260a0 @ 00c260a0
00c260a0	paciasp
00c260a4	stp x29,x30,[sp, #-0x30]!
00c260a8	str x21,[sp, #0x10]
00c260ac	stp x20,x19,[sp, #0x20]
00c260b0	mov x29,sp
00c260b4	ldr x21,[x0, #0x1330]
00c260b8	mov x19,x1
00c260bc	ldr x8,[x21, #0x8]
00c260c0	sub x9,x8,#0xfc0
00c260c4	cmn x9,#0xff1
00c260c8	b.hi 0x00c260ec
00c260cc	mov x20,x0
00c260d0	mov w0,#0x1000
00c260d4	bl 0x00c308d0
00c260d8	cbz x0,0x00c2614c
00c260dc	mov x8,xzr
00c260e0	stp x21,xzr,[x0]
00c260e4	mov x21,x0
00c260e8	str x0,[x20, #0x1330]
00c260ec	add x9,x8,#0x30
00c260f0	add x0,x21,x8
00c260f4	adrp x8,0xcb3000
00c260f8	add x8,x8,#0xd40
00c260fc	str x9,[x21, #0x8]
00c26100	ldr x10,[x19]
00c26104	str x8,[x0, #0x10]!
00c26108	ldurh w8,[x0, #0x9]
00c2610c	mov w9,#0x5
00c26110	mov w11,#0x540
00c26114	strb w9,[x0, #0x8]
00c26118	adrp x9,0x2ac000
00c2611c	add x9,x9,#0xd85
00c26120	and w8,w8,#0xf000
00c26124	stp x10,x9,[x0, #0x10]
00c26128	mov w9,#0x8
00c2612c	orr w8,w8,w11
00c26130	str x9,[x0, #0x20]
00c26134	sturh w8,[x0, #0x9]
00c26138	ldp x20,x19,[sp, #0x20]
00c2613c	ldr x21,[sp, #0x10]
00c26140	ldp x29,x30,[sp], #0x30
00c26144	autiasp
00c26148	ret
00c2614c	bl 0x00c2fff0
