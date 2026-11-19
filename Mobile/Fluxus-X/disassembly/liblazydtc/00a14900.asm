; SCT_CTX_set1_issuer @ 00a14900
00a14900	str x19,[sp, #-0x20]!
00a14904	mov x19,x0
00a14908	mov x0,x1
00a1490c	stp x29,x30,[sp, #0x10]
00a14910	add x29,sp,#0x10
00a14914	bl 0x00c32cd0
00a14918	ldp x29,x30,[sp, #0x10]
00a1491c	add x2,x19,#0x18
00a14920	add x3,x19,#0x20
00a14924	mov x1,x0
00a14928	mov x0,x19
00a1492c	ldr x19,[sp], #0x20
00a14930	b 0x00a14940
