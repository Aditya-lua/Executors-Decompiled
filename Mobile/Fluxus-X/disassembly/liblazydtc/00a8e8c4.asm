; FUN_00a8e8c4 @ 00a8e8c4
00a8e8c4	sub sp,sp,#0x50
00a8e8c8	stp x24,x23,[sp, #0x10]
00a8e8cc	stp x22,x21,[sp, #0x20]
00a8e8d0	stp x20,x19,[sp, #0x30]
00a8e8d4	stp x29,x30,[sp, #0x40]
00a8e8d8	add x29,sp,#0x40
00a8e8dc	mov x19,x3
00a8e8e0	mov x20,x2
00a8e8e4	mov x21,x1
00a8e8e8	mov x22,x0
00a8e8ec	bl 0x00c3cea0
00a8e8f0	mov x23,x0
00a8e8f4	mov x0,x22
00a8e8f8	bl 0x00c3ceb0
00a8e8fc	str w0,[sp, #0xc]
00a8e900	mov x0,x22
00a8e904	add x24,x22,#0x28
00a8e908	bl 0x00c3cec0
00a8e90c	ldr x7,[x23, #0x118]
00a8e910	mov w6,w0
00a8e914	add x5,sp,#0xc
00a8e918	mov x0,x20
00a8e91c	mov x1,x21
00a8e920	mov x2,x19
00a8e924	mov x3,x23
00a8e928	mov x4,x24
00a8e92c	bl 0x00c3e300
00a8e930	ldr w1,[sp, #0xc]
00a8e934	mov x0,x22
00a8e938	bl 0x00c3ced0
00a8e93c	ldp x29,x30,[sp, #0x40]
00a8e940	ldp x20,x19,[sp, #0x30]
00a8e944	ldp x22,x21,[sp, #0x20]
00a8e948	ldp x24,x23,[sp, #0x10]
00a8e94c	mov w0,#0x1
00a8e950	add sp,sp,#0x50
00a8e954	ret
