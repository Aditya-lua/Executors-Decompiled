; FUN_00c10b48 @ 00c10b48
00c10b48	paciasp
00c10b4c	stp x29,x30,[sp, #-0x30]!
00c10b50	stp x22,x21,[sp, #0x10]
00c10b54	stp x20,x19,[sp, #0x20]
00c10b58	mov x29,sp
00c10b5c	ldr x22,[x0, #0x1330]
00c10b60	mov x19,x2
00c10b64	mov x20,x1
00c10b68	ldr x8,[x22, #0x8]
00c10b6c	sub x9,x8,#0xfc0
00c10b70	cmn x9,#0xff1
00c10b74	b.hi 0x00c10b98
00c10b78	mov x21,x0
00c10b7c	mov w0,#0x1000
00c10b80	bl 0x00c308d0
00c10b84	cbz x0,0x00c10bf8
00c10b88	mov x8,xzr
00c10b8c	stp x22,xzr,[x0]
00c10b90	mov x22,x0
00c10b94	str x0,[x21, #0x1330]
00c10b98	add x9,x8,#0x30
00c10b9c	mov x0,x20
00c10ba0	add x21,x22,x8
00c10ba4	str x9,[x22, #0x8]
00c10ba8	bl 0x00c2ff50
00c10bac	adrp x8,0xcb1000
00c10bb0	add x8,x8,#0x3c0
00c10bb4	ldr x10,[x19]
00c10bb8	str x8,[x21, #0x10]!
00c10bbc	ldurh w9,[x21, #0x9]
00c10bc0	mov w8,#0x15
00c10bc4	str x20,[x21, #0x10]
00c10bc8	strb w8,[x21, #0x8]
00c10bcc	and w8,w9,#0xf000
00c10bd0	mov w9,#0x540
00c10bd4	orr w8,w8,w9
00c10bd8	stp x0,x10,[x21, #0x18]
00c10bdc	sturh w8,[x21, #0x9]
00c10be0	mov x0,x21
00c10be4	ldp x20,x19,[sp, #0x20]
00c10be8	ldp x22,x21,[sp, #0x10]
00c10bec	ldp x29,x30,[sp], #0x30
00c10bf0	autiasp
00c10bf4	ret
00c10bf8	bl 0x00c2fff0
