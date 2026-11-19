; FUN_00a73130 @ 00a73130
00a73130	sub sp,sp,#0xd0
00a73134	stp x22,x21,[sp, #0xa0]
00a73138	stp x20,x19,[sp, #0xb0]
00a7313c	stp x29,x30,[sp, #0xc0]
00a73140	ldr x8,[x2, #0x20]
00a73144	mov w21,w0
00a73148	add x29,sp,#0xc0
00a7314c	mov x19,x2
00a73150	mov x0,x8
00a73154	mov x20,x1
00a73158	bl 0x00c37cd0
00a7315c	cmp w0,#0x6
00a73160	b.eq 0x00a73178
00a73164	ldr x0,[x19, #0x20]
00a73168	bl 0x00c37cd0
00a7316c	cmp w0,#0x390
00a73170	mov w0,wzr
00a73174	b.ne 0x00a731dc
00a73178	ldr x0,[x19, #0x20]
00a7317c	bl 0x00c3d8d0
00a73180	mov x22,x0
00a73184	bl 0x00c3db80
00a73188	cmp w0,#0x4
00a7318c	b.cc 0x00a731d8
00a73190	add x1,sp,#0x50
00a73194	mov x2,sp
00a73198	mov x0,x22
00a7319c	bl 0x00c3db30
00a731a0	cbz w0,0x00a731d8
00a731a4	ldr x8,[sp, #0x68]
00a731a8	cbz x8,0x00a731d8
00a731ac	ldr x9,[x19, #0x30]
00a731b0	mov w0,wzr
00a731b4	ldr w9,[x9, #0x8]
00a731b8	cmp w9,#0x2
00a731bc	b.ne 0x00a731dc
00a731c0	mov w0,w21
00a731c4	mov x1,x20
00a731c8	mov x2,x19
00a731cc	str x8,[x19, #0x20]
00a731d0	bl 0x00a6fd84
00a731d4	b 0x00a731dc
00a731d8	mov w0,wzr
00a731dc	ldp x29,x30,[sp, #0xc0]
00a731e0	ldp x20,x19,[sp, #0xb0]
00a731e4	ldp x22,x21,[sp, #0xa0]
00a731e8	add sp,sp,#0xd0
00a731ec	ret
