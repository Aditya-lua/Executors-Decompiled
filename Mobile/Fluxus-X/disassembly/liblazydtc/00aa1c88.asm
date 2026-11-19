; FUN_00aa1c88 @ 00aa1c88
00aa1c88	stp x20,x19,[sp, #-0x20]!
00aa1c8c	mov x19,x1
00aa1c90	adrp x2,0xc6d000
00aa1c94	mov x20,x0
00aa1c98	add x2,x2,#0x498
00aa1c9c	mov w1,#0x12
00aa1ca0	mov x0,x19
00aa1ca4	stp x29,x30,[sp, #0x10]
00aa1ca8	add x29,sp,#0x10
00aa1cac	bl 0x00c3b520
00aa1cb0	cbz x0,0x00aa1cfc
00aa1cb4	ldr x8,[x0, #0x30]
00aa1cb8	mov x0,x20
00aa1cbc	blr x8
00aa1cc0	mov x1,x0
00aa1cc4	mov w2,#0x1
00aa1cc8	mov x0,x19
00aa1ccc	bl 0x00c3eaa0
00aa1cd0	cbz x0,0x00aa1cfc
00aa1cd4	mov x19,x0
00aa1cd8	bl 0x00c3b690
00aa1cdc	mov x0,x19
00aa1ce0	bl 0x00c3eb70
00aa1ce4	cbz w0,0x00aa1cf8
00aa1ce8	mov w1,#0x1
00aa1cec	mov x0,x19
00aa1cf0	bl 0x00c3ea80
00aa1cf4	cbz w0,0x00aa1cfc
00aa1cf8	mov w0,#0x1
00aa1cfc	ldp x29,x30,[sp, #0x10]
00aa1d00	ldp x20,x19,[sp], #0x20
00aa1d04	ret
