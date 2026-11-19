; FUN_00a73640 @ 00a73640
00a73640	sub sp,sp,#0xd0
00a73644	stp x22,x21,[sp, #0xa0]
00a73648	stp x20,x19,[sp, #0xb0]
00a7364c	stp x29,x30,[sp, #0xc0]
00a73650	ldr x8,[x2, #0x20]
00a73654	mov w21,w0
00a73658	add x29,sp,#0xc0
00a7365c	mov x19,x2
00a73660	mov x0,x8
00a73664	mov x20,x1
00a73668	bl 0x00c37cd0
00a7366c	cmp w0,#0x6
00a73670	b.eq 0x00a73688
00a73674	ldr x0,[x19, #0x20]
00a73678	bl 0x00c37cd0
00a7367c	cmp w0,#0x390
00a73680	mov w0,wzr
00a73684	b.ne 0x00a736ec
00a73688	ldr x0,[x19, #0x20]
00a7368c	bl 0x00c3d8d0
00a73690	mov x22,x0
00a73694	bl 0x00c3db80
00a73698	cmp w0,#0x2
00a7369c	b.cc 0x00a736e8
00a736a0	add x1,sp,#0x50
00a736a4	mov x2,sp
00a736a8	mov x0,x22
00a736ac	bl 0x00c3db30
00a736b0	cbz w0,0x00a736e8
00a736b4	ldr x8,[sp, #0x8]
00a736b8	cbz x8,0x00a736e8
00a736bc	ldr x9,[x19, #0x30]
00a736c0	mov w0,wzr
00a736c4	ldr w9,[x9, #0x8]
00a736c8	cmp w9,#0x2
00a736cc	b.ne 0x00a736ec
00a736d0	mov w0,w21
00a736d4	mov x1,x20
00a736d8	mov x2,x19
00a736dc	str x8,[x19, #0x20]
00a736e0	bl 0x00a6fd84
00a736e4	b 0x00a736ec
00a736e8	mov w0,wzr
00a736ec	ldp x29,x30,[sp, #0xc0]
00a736f0	ldp x20,x19,[sp, #0xb0]
00a736f4	ldp x22,x21,[sp, #0xa0]
00a736f8	add sp,sp,#0xd0
00a736fc	ret
