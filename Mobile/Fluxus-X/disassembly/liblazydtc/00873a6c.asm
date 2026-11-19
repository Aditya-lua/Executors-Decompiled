; FUN_00873a6c @ 00873a6c
00873a6c	stp x29,x30,[sp, #-0x30]!
00873a70	str x21,[sp, #0x10]
00873a74	stp x20,x19,[sp, #0x20]
00873a78	mov x29,sp
00873a7c	ldr x20,[x0]
00873a80	cbz x20,0x00873ae8
00873a84	ldr x8,[x0, #0x8]
00873a88	mov x19,x0
00873a8c	mov x0,x20
00873a90	cmp x20,x8
00873a94	b.eq 0x00873acc
00873a98	mov x21,x8
00873a9c	b 0x00873aac
00873aa0	cmp x21,x20
00873aa4	mov x8,x21
00873aa8	b.eq 0x00873ac8
00873aac	ldrb w9,[x21, #-0x20]!
00873ab0	tbz w9,#0x0,0x00873aa0
00873ab4	ldur x0,[x8, #-0x10]
00873ab8	ldur x8,[x8, #-0x20]
00873abc	and x1,x8,#-0x2
00873ac0	bl 0x00c2fe80
00873ac4	b 0x00873aa0
00873ac8	ldr x0,[x19]
00873acc	ldr x8,[x19, #0x10]
00873ad0	str x20,[x19, #0x8]
00873ad4	sub x1,x8,x0
00873ad8	ldp x20,x19,[sp, #0x20]
00873adc	ldr x21,[sp, #0x10]
00873ae0	ldp x29,x30,[sp], #0x30
00873ae4	b 0x00c2fe80
00873ae8	ldp x20,x19,[sp, #0x20]
00873aec	ldr x21,[sp, #0x10]
00873af0	ldp x29,x30,[sp], #0x30
00873af4	ret
