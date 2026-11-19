; FUN_00b52a40 @ 00b52a40
00b52a40	sub sp,sp,#0xd0
00b52a44	stp x29,x30,[sp, #0xc0]
00b52a48	add x29,sp,#0xc0
00b52a4c	stp w1,w0,[x29, #-0x8]
00b52a50	mov x0,x2
00b52a54	str x19,[sp, #0xb0]
00b52a58	bl 0x00c38c30
00b52a5c	mov x19,x0
00b52a60	add x0,sp,#0x30
00b52a64	orr w2,wzr,#0x78
00b52a68	mov w1,wzr
00b52a6c	bl 0x00c301c0
00b52a70	adrp x0,0x2a0000
00b52a74	add x0,x0,#0x361
00b52a78	add x8,sp,#0x8
00b52a7c	sub x1,x29,#0x4
00b52a80	bl 0x00c36260
00b52a84	ldr x8,[sp, #0x28]
00b52a88	ldur q0,[sp, #0x18]
00b52a8c	ldur q1,[sp, #0x8]
00b52a90	adrp x0,0x2cd000
00b52a94	str x8,[sp, #0x50]
00b52a98	add x0,x0,#0xb87
00b52a9c	add x8,sp,#0x8
00b52aa0	sub x1,x29,#0x8
00b52aa4	stp q1,q0,[sp, #0x30]
00b52aa8	bl 0x00c36260
00b52aac	ldr x8,[sp, #0x28]
00b52ab0	ldur q0,[sp, #0x18]
00b52ab4	ldur q1,[sp, #0x8]
00b52ab8	add x0,sp,#0x30
00b52abc	str x8,[sp, #0x78]
00b52ac0	stur q0,[sp, #0x68]
00b52ac4	stur q1,[sp, #0x58]
00b52ac8	ldp x8,x1,[x19, #0x48]
00b52acc	blr x8
00b52ad0	ldp x29,x30,[sp, #0xc0]
00b52ad4	ldr x19,[sp, #0xb0]
00b52ad8	add sp,sp,#0xd0
00b52adc	ret
