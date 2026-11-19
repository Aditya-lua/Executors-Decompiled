; FUN_00a98424 @ 00a98424
00a98424	sub sp,sp,#0x60
00a98428	stp x26,x25,[sp, #0x10]
00a9842c	stp x24,x23,[sp, #0x20]
00a98430	stp x22,x21,[sp, #0x30]
00a98434	stp x20,x19,[sp, #0x40]
00a98438	stp x29,x30,[sp, #0x50]
00a9843c	add x29,sp,#0x50
00a98440	cbz x3,0x00a984d8
00a98444	adrp x25,0xcb5000
00a98448	ldr x25,[x25, #0x690]
00a9844c	lsr x8,x3,#0x1e
00a98450	mov w9,#0x40000000
00a98454	cmp x8,#0x0
00a98458	mov x19,x3
00a9845c	mov x20,x2
00a98460	mov x21,x1
00a98464	mov x22,x0
00a98468	add x23,x0,#0x28
00a9846c	csel x24,x3,x9,eq
00a98470	mov x0,x22
00a98474	bl 0x00c3ceb0
00a98478	str w0,[sp, #0xc]
00a9847c	mov x0,x22
00a98480	bl 0x00c3cea0
00a98484	mov x26,x0
00a98488	mov x0,x22
00a9848c	bl 0x00c3cec0
00a98490	mov w6,w0
00a98494	add x5,sp,#0xc
00a98498	mov x0,x20
00a9849c	mov x1,x21
00a984a0	mov x2,x24
00a984a4	mov x3,x26
00a984a8	mov x4,x23
00a984ac	mov x7,x25
00a984b0	bl 0x00c3e300
00a984b4	ldr w1,[sp, #0xc]
00a984b8	mov x0,x22
00a984bc	bl 0x00c3ced0
00a984c0	sub x19,x19,x24
00a984c4	cmp x19,x24
00a984c8	add x20,x20,x24
00a984cc	add x21,x21,x24
00a984d0	csel x24,x19,x24,cc
00a984d4	cbnz x19,0x00a98470
00a984d8	ldp x29,x30,[sp, #0x50]
00a984dc	ldp x20,x19,[sp, #0x40]
00a984e0	ldp x22,x21,[sp, #0x30]
00a984e4	ldp x24,x23,[sp, #0x20]
00a984e8	ldp x26,x25,[sp, #0x10]
00a984ec	mov w0,#0x1
00a984f0	add sp,sp,#0x60
00a984f4	ret
