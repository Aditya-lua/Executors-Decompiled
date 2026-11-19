; SCT_CTX_set1_pubkey @ 00a14a7c
00a14a7c	str x21,[sp, #-0x30]!
00a14a80	stp x20,x19,[sp, #0x10]
00a14a84	mov x19,x0
00a14a88	mov x0,x1
00a14a8c	stp x29,x30,[sp, #0x20]
00a14a90	add x29,sp,#0x20
00a14a94	mov x21,x1
00a14a98	bl 0x00c39930
00a14a9c	cbz x0,0x00a14adc
00a14aa0	mov x20,x0
00a14aa4	add x2,x19,#0x8
00a14aa8	add x3,x19,#0x10
00a14aac	mov x0,x19
00a14ab0	mov x1,x21
00a14ab4	bl 0x00a14940
00a14ab8	cbz w0,0x00a14ad0
00a14abc	ldr x0,[x19]
00a14ac0	bl 0x00c32450
00a14ac4	mov w0,#0x1
00a14ac8	str x20,[x19]
00a14acc	b 0x00a14adc
00a14ad0	mov x0,x20
00a14ad4	bl 0x00c32450
00a14ad8	mov w0,wzr
00a14adc	ldp x29,x30,[sp, #0x20]
00a14ae0	ldp x20,x19,[sp, #0x10]
00a14ae4	ldr x21,[sp], #0x30
00a14ae8	ret
