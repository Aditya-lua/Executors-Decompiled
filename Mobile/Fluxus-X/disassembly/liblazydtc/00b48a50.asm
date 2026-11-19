; FUN_00b48a50 @ 00b48a50
00b48a50	stp x22,x21,[sp, #-0x30]!
00b48a54	stp x20,x19,[sp, #0x10]
00b48a58	stp x29,x30,[sp, #0x20]
00b48a5c	ldr x22,[x0]
00b48a60	add x20,x0,#0x8
00b48a64	mov x19,x0
00b48a68	mov x0,x20
00b48a6c	add x29,sp,#0x20
00b48a70	bl 0x00c41170
00b48a74	ldp x0,x1,[x19, #0x20]
00b48a78	adrp x21,0x2cc000
00b48a7c	add x21,x21,#0x73f
00b48a80	mov w3,#0x53
00b48a84	mov x2,x21
00b48a88	bl 0x00c345e0
00b48a8c	ldp x0,x1,[x19, #0x30]
00b48a90	mov w3,#0x54
00b48a94	mov x2,x21
00b48a98	bl 0x00c345e0
00b48a9c	ldp x0,x1,[x19, #0x48]
00b48aa0	mov w3,#0x55
00b48aa4	mov x2,x21
00b48aa8	bl 0x00c345e0
00b48aac	mov w2,#0x50
00b48ab0	mov x0,x20
00b48ab4	mov w1,wzr
00b48ab8	bl 0x00c301c0
00b48abc	str x22,[x19]
00b48ac0	ldp x29,x30,[sp, #0x20]
00b48ac4	ldp x20,x19,[sp, #0x10]
00b48ac8	ldp x22,x21,[sp], #0x30
00b48acc	ret
