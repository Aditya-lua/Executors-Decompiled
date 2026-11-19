; FUN_00a87458 @ 00a87458
00a87458	sub sp,sp,#0x50
00a8745c	stp x24,x23,[sp, #0x10]
00a87460	stp x22,x21,[sp, #0x20]
00a87464	stp x20,x19,[sp, #0x30]
00a87468	stp x29,x30,[sp, #0x40]
00a8746c	add x29,sp,#0x40
00a87470	mov x19,x3
00a87474	mov x20,x2
00a87478	mov x21,x1
00a8747c	mov x22,x0
00a87480	bl 0x00c3cea0
00a87484	mov x23,x0
00a87488	mov x0,x22
00a8748c	bl 0x00c3ceb0
00a87490	str w0,[sp, #0xc]
00a87494	mov x0,x22
00a87498	add x24,x22,#0x28
00a8749c	bl 0x00c3cec0
00a874a0	ldr x7,[x23, #0xf8]
00a874a4	mov w6,w0
00a874a8	add x5,sp,#0xc
00a874ac	mov x0,x20
00a874b0	mov x1,x21
00a874b4	mov x2,x19
00a874b8	mov x3,x23
00a874bc	mov x4,x24
00a874c0	bl 0x00c3e300
00a874c4	ldr w1,[sp, #0xc]
00a874c8	mov x0,x22
00a874cc	bl 0x00c3ced0
00a874d0	ldp x29,x30,[sp, #0x40]
00a874d4	ldp x20,x19,[sp, #0x30]
00a874d8	ldp x22,x21,[sp, #0x20]
00a874dc	ldp x24,x23,[sp, #0x10]
00a874e0	mov w0,#0x1
00a874e4	add sp,sp,#0x50
00a874e8	ret
