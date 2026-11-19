; FUN_00c13b34 @ 00c13b34
00c13b34	paciasp
00c13b38	stp x29,x30,[sp, #-0x30]!
00c13b3c	str x21,[sp, #0x10]
00c13b40	stp x20,x19,[sp, #0x20]
00c13b44	mov x29,sp
00c13b48	ldr x21,[x0, #0x1330]
00c13b4c	mov x19,x1
00c13b50	ldr x8,[x21, #0x8]
00c13b54	sub x9,x8,#0xfc0
00c13b58	cmn x9,#0xff1
00c13b5c	b.hi 0x00c13b80
00c13b60	mov x20,x0
00c13b64	mov w0,#0x1000
00c13b68	bl 0x00c308d0
00c13b6c	cbz x0,0x00c13be0
00c13b70	mov x8,xzr
00c13b74	stp x21,xzr,[x0]
00c13b78	mov x21,x0
00c13b7c	str x0,[x20, #0x1330]
00c13b80	add x9,x8,#0x30
00c13b84	add x0,x21,x8
00c13b88	adrp x8,0xcb1000
00c13b8c	add x8,x8,#0x3c0
00c13b90	str x9,[x21, #0x8]
00c13b94	mov w10,#0x540
00c13b98	str x8,[x0, #0x10]!
00c13b9c	ldurh w9,[x0, #0x9]
00c13ba0	mov w8,#0x15
00c13ba4	mov w11,#0x28
00c13ba8	strb w8,[x0, #0x8]
00c13bac	adrp x8,0x2bc000
00c13bb0	add x8,x8,#0xbb0
00c13bb4	and w9,w9,#0xf000
00c13bb8	str x8,[x0, #0x10]
00c13bbc	orr w8,w9,w10
00c13bc0	ldr x9,[x19]
00c13bc4	sturh w8,[x0, #0x9]
00c13bc8	stp x11,x9,[x0, #0x18]
00c13bcc	ldp x20,x19,[sp, #0x20]
00c13bd0	ldr x21,[sp, #0x10]
00c13bd4	ldp x29,x30,[sp], #0x30
00c13bd8	autiasp
00c13bdc	ret
00c13be0	bl 0x00c2fff0
