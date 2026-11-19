; FUN_00a8e7c8 @ 00a8e7c8
00a8e7c8	stp x24,x23,[sp, #-0x40]!
00a8e7cc	stp x22,x21,[sp, #0x10]
00a8e7d0	stp x20,x19,[sp, #0x20]
00a8e7d4	stp x29,x30,[sp, #0x30]
00a8e7d8	add x29,sp,#0x30
00a8e7dc	mov x22,x3
00a8e7e0	mov x19,x2
00a8e7e4	mov x20,x1
00a8e7e8	mov x21,x0
00a8e7ec	bl 0x00c36d40
00a8e7f0	sxtw x23,w0
00a8e7f4	mov x0,x21
00a8e7f8	bl 0x00c3cea0
00a8e7fc	cmp x23,x22
00a8e800	b.hi 0x00a8e830
00a8e804	mov x21,x0
00a8e808	mov x24,xzr
00a8e80c	sub x22,x22,x23
00a8e810	ldr x8,[x21, #0x118]
00a8e814	add x0,x19,x24
00a8e818	add x1,x20,x24
00a8e81c	mov x2,x21
00a8e820	blr x8
00a8e824	add x24,x24,x23
00a8e828	cmp x24,x22
00a8e82c	b.ls 0x00a8e810
00a8e830	ldp x29,x30,[sp, #0x30]
00a8e834	ldp x20,x19,[sp, #0x20]
00a8e838	ldp x22,x21,[sp, #0x10]
00a8e83c	mov w0,#0x1
00a8e840	ldp x24,x23,[sp], #0x40
00a8e844	ret
