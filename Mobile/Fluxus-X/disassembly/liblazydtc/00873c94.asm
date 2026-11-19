; FUN_00873c94 @ 00873c94
00873c94	stp x29,x30,[sp, #-0x30]!
00873c98	str x21,[sp, #0x10]
00873c9c	stp x20,x19,[sp, #0x20]
00873ca0	mov x29,sp
00873ca4	ldr x21,[x0]
00873ca8	cbz x21,0x00873cf4
00873cac	ldr x20,[x0, #0x8]
00873cb0	mov x19,x0
00873cb4	mov x0,x21
00873cb8	cmp x21,x20
00873cbc	b.eq 0x00873cd8
00873cc0	sub x20,x20,#0x88
00873cc4	mov x0,x20
00873cc8	bl 0x00873e90
00873ccc	cmp x20,x21
00873cd0	b.ne 0x00873cc0
00873cd4	ldr x0,[x19]
00873cd8	ldr x8,[x19, #0x10]
00873cdc	str x21,[x19, #0x8]
00873ce0	sub x1,x8,x0
00873ce4	ldp x20,x19,[sp, #0x20]
00873ce8	ldr x21,[sp, #0x10]
00873cec	ldp x29,x30,[sp], #0x30
00873cf0	b 0x00c2fe80
00873cf4	ldp x20,x19,[sp, #0x20]
00873cf8	ldr x21,[sp, #0x10]
00873cfc	ldp x29,x30,[sp], #0x30
00873d00	ret
