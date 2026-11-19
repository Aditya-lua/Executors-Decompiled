; FUN_00917c84 @ 00917c84
00917c84	stp x20,x19,[sp, #-0x20]!
00917c88	stp x29,x30,[sp, #0x10]
00917c8c	add x29,sp,#0x10
00917c90	mov x20,x1
00917c94	mov x19,x0
00917c98	cbz x0,0x00917cd8
00917c9c	ldr x8,[x19, #0xd0]
00917ca0	cbz x8,0x00917cb4
00917ca4	orr w1,wzr,#0x3
00917ca8	mov w2,#0x2
00917cac	mov x0,x19
00917cb0	bl 0x0093f628
00917cb4	mov x0,x20
00917cb8	bl 0x009168c8
00917cbc	ldr x8,[x19, #0xd0]
00917cc0	cbz x8,0x00917ce8
00917cc4	ldp x29,x30,[sp, #0x10]
00917cc8	orr w1,wzr,#0x3
00917ccc	mov x0,x19
00917cd0	ldp x20,x19,[sp], #0x20
00917cd4	b 0x0093f680
00917cd8	ldp x29,x30,[sp, #0x10]
00917cdc	mov x0,x20
00917ce0	ldp x20,x19,[sp], #0x20
00917ce4	b 0x009168c8
00917ce8	ldp x29,x30,[sp, #0x10]
00917cec	ldp x20,x19,[sp], #0x20
00917cf0	ret
