; FUN_00a87694 @ 00a87694
00a87694	sub sp,sp,#0x50
00a87698	stp x24,x23,[sp, #0x10]
00a8769c	stp x22,x21,[sp, #0x20]
00a876a0	stp x20,x19,[sp, #0x30]
00a876a4	stp x29,x30,[sp, #0x40]
00a876a8	add x29,sp,#0x40
00a876ac	mov x19,x3
00a876b0	mov x20,x2
00a876b4	mov x21,x1
00a876b8	mov x22,x0
00a876bc	bl 0x00c3cea0
00a876c0	mov x23,x0
00a876c4	mov x0,x22
00a876c8	bl 0x00c3ceb0
00a876cc	str w0,[sp, #0xc]
00a876d0	mov x0,x22
00a876d4	add x24,x22,#0x28
00a876d8	bl 0x00c3cec0
00a876dc	ldr x7,[x23, #0xf8]
00a876e0	mov w6,w0
00a876e4	add x5,sp,#0xc
00a876e8	mov x0,x20
00a876ec	mov x1,x21
00a876f0	mov x2,x19
00a876f4	mov x3,x23
00a876f8	mov x4,x24
00a876fc	bl 0x00c3e2f0
00a87700	ldr w1,[sp, #0xc]
00a87704	mov x0,x22
00a87708	bl 0x00c3ced0
00a8770c	ldp x29,x30,[sp, #0x40]
00a87710	ldp x20,x19,[sp, #0x30]
00a87714	ldp x22,x21,[sp, #0x20]
00a87718	ldp x24,x23,[sp, #0x10]
00a8771c	mov w0,#0x1
00a87720	add sp,sp,#0x50
00a87724	ret
