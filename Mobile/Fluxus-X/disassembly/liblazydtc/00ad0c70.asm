; BN_BLINDING_free @ 00ad0c70
00ad0c70	cbz x0,0x00ad0cc8
00ad0c74	str x19,[sp, #-0x20]!
00ad0c78	stp x29,x30,[sp, #0x10]
00ad0c7c	mov x19,x0
00ad0c80	ldr x0,[x0]
00ad0c84	add x29,sp,#0x10
00ad0c88	bl 0x00c36290
00ad0c8c	ldr x0,[x19, #0x8]
00ad0c90	bl 0x00c36290
00ad0c94	ldr x0,[x19, #0x10]
00ad0c98	bl 0x00c36290
00ad0c9c	ldr x0,[x19, #0x18]
00ad0ca0	bl 0x00c36290
00ad0ca4	ldr x0,[x19, #0x48]
00ad0ca8	bl 0x00c34d40
00ad0cac	ldp x29,x30,[sp, #0x10]
00ad0cb0	adrp x1,0x2be000
00ad0cb4	add x1,x1,#0x30a
00ad0cb8	mov w2,#0x5a
00ad0cbc	mov x0,x19
00ad0cc0	ldr x19,[sp], #0x20
00ad0cc4	b 0x00c32310
00ad0cc8	ret
