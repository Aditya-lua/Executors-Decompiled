; X509_OBJECT_retrieve_by_subject @ 00b0ac08
00b0ac08	sub sp,sp,#0x1b0
00b0ac0c	stp x28,x19,[sp, #0x190]
00b0ac10	stp x29,x30,[sp, #0x1a0]
00b0ac14	add x29,sp,#0x1a0
00b0ac18	mov x19,x0
00b0ac1c	stur w1,[x29, #-0x20]
00b0ac20	cbz w1,0x00b0ac44
00b0ac24	cmp w1,#0x2
00b0ac28	b.eq 0x00b0ac58
00b0ac2c	cmp w1,#0x1
00b0ac30	b.ne 0x00b0ac68
00b0ac34	mov x8,sp
00b0ac38	stur x8,[x29, #-0x18]
00b0ac3c	add x8,x8,#0x48
00b0ac40	b 0x00b0ac64
00b0ac44	mov w1,#0xffffffff
00b0ac48	cmn w1,#0x1
00b0ac4c	b.ne 0x00b0ac84
00b0ac50	mov x0,xzr
00b0ac54	b 0x00b0ac8c
00b0ac58	mov x8,sp
00b0ac5c	stur x8,[x29, #-0x18]
00b0ac60	add x8,x8,#0x18
00b0ac64	str x2,[x8]
00b0ac68	sub x1,x29,#0x20
00b0ac6c	mov x0,x19
00b0ac70	mov x2,xzr
00b0ac74	bl 0x00c40220
00b0ac78	mov w1,w0
00b0ac7c	cmn w1,#0x1
00b0ac80	b.eq 0x00b0ac50
00b0ac84	mov x0,x19
00b0ac88	bl 0x00c32610
00b0ac8c	ldp x29,x30,[sp, #0x1a0]
00b0ac90	ldp x28,x19,[sp, #0x190]
00b0ac94	add sp,sp,#0x1b0
00b0ac98	ret
