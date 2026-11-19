; FUN_00b4ea10 @ 00b4ea10
00b4ea10	cbz x0,0x00b4ead4
00b4ea14	stp x20,x19,[sp, #-0x20]!
00b4ea18	stp x29,x30,[sp, #0x10]
00b4ea1c	mov x19,x0
00b4ea20	ldr x0,[x0, #0x80]
00b4ea24	add x29,sp,#0x10
00b4ea28	bl 0x00c3a770
00b4ea2c	ldr x0,[x19, #0x30]
00b4ea30	bl 0x00c36290
00b4ea34	ldr x0,[x19, #0x38]
00b4ea38	bl 0x00c36290
00b4ea3c	ldr x0,[x19, #0x40]
00b4ea40	bl 0x00c36290
00b4ea44	ldr x0,[x19, #0x48]
00b4ea48	bl 0x00c36290
00b4ea4c	ldr x0,[x19, #0x50]
00b4ea50	bl 0x00c36290
00b4ea54	ldr x0,[x19, #0x8]
00b4ea58	adrp x20,0x2c6000
00b4ea5c	add x20,x20,#0x737
00b4ea60	mov w2,#0x54e
00b4ea64	mov x1,x20
00b4ea68	bl 0x00c32310
00b4ea6c	ldr x0,[x19, #0x28]
00b4ea70	mov w2,#0x54f
00b4ea74	mov x1,x20
00b4ea78	bl 0x00c32310
00b4ea7c	ldr x0,[x19, #0x18]
00b4ea80	mov w2,#0x550
00b4ea84	mov x1,x20
00b4ea88	bl 0x00c32310
00b4ea8c	ldr x0,[x19, #0x10]
00b4ea90	mov w2,#0x551
00b4ea94	mov x1,x20
00b4ea98	bl 0x00c32310
00b4ea9c	ldr x0,[x19, #0x60]
00b4eaa0	mov w2,#0x552
00b4eaa4	mov x1,x20
00b4eaa8	bl 0x00c32310
00b4eaac	ldr x0,[x19, #0x58]
00b4eab0	mov w2,#0x553
00b4eab4	mov x1,x20
00b4eab8	bl 0x00c32310
00b4eabc	ldp x29,x30,[sp, #0x10]
00b4eac0	mov w2,#0x554
00b4eac4	mov x0,x19
00b4eac8	mov x1,x20
00b4eacc	ldp x20,x19,[sp], #0x20
00b4ead0	b 0x00c32310
00b4ead4	ret
