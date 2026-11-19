; FUN_00c1ea70 @ 00c1ea70
00c1ea70	paciasp
00c1ea74	stp x29,x30,[sp, #-0x30]!
00c1ea78	str x21,[sp, #0x10]
00c1ea7c	stp x20,x19,[sp, #0x20]
00c1ea80	mov x29,sp
00c1ea84	ldr x21,[x0, #0x1330]
00c1ea88	mov x19,x1
00c1ea8c	ldr x8,[x21, #0x8]
00c1ea90	sub x9,x8,#0xfd0
00c1ea94	cmn x9,#0xff1
00c1ea98	b.hi 0x00c1eabc
00c1ea9c	mov x20,x0
00c1eaa0	mov w0,#0x1000
00c1eaa4	bl 0x00c308d0
00c1eaa8	cbz x0,0x00c1eb0c
00c1eaac	mov x8,xzr
00c1eab0	stp x21,xzr,[x0]
00c1eab4	mov x21,x0
00c1eab8	str x0,[x20, #0x1330]
00c1eabc	add x9,x8,#0x20
00c1eac0	add x0,x21,x8
00c1eac4	adrp x8,0xcb2000
00c1eac8	add x8,x8,#0x558
00c1eacc	str x9,[x21, #0x8]
00c1ead0	mov w9,#0x27
00c1ead4	str x8,[x0, #0x10]!
00c1ead8	ldurh w8,[x0, #0x9]
00c1eadc	mov w10,#0x500
00c1eae0	strb w9,[x0, #0x8]
00c1eae4	ldr x9,[x19]
00c1eae8	and w8,w8,#0xf000
00c1eaec	orr w8,w8,w10
00c1eaf0	sturh w8,[x0, #0x9]
00c1eaf4	str x9,[x0, #0x10]
00c1eaf8	ldp x20,x19,[sp, #0x20]
00c1eafc	ldr x21,[sp, #0x10]
00c1eb00	ldp x29,x30,[sp], #0x30
00c1eb04	autiasp
00c1eb08	ret
00c1eb0c	bl 0x00c2fff0
