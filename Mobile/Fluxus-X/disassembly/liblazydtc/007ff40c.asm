; FUN_007ff40c @ 007ff40c
007ff40c	stp x29,x30,[sp, #-0x30]!
007ff410	stp x22,x21,[sp, #0x10]
007ff414	stp x20,x19,[sp, #0x20]
007ff418	mov x29,sp
007ff41c	mov x19,x2
007ff420	cmp x2,#0x16
007ff424	b.hi 0x007ff434
007ff428	lsl w8,w19,#0x1
007ff42c	strb w8,[x0], #0x1
007ff430	b 0x007ff46c
007ff434	cmn x19,#0x8
007ff438	b.cs 0x007ff480
007ff43c	orr x8,x19,#0x7
007ff440	mov w9,#0x1a
007ff444	mov x22,x0
007ff448	cmp x8,#0x17
007ff44c	mov x21,x1
007ff450	csinc x20,x9,x8,eq
007ff454	mov x0,x20
007ff458	bl 0x00c2fed0
007ff45c	orr x8,x20,#0x1
007ff460	mov x1,x21
007ff464	stp x19,x0,[x22, #0x8]
007ff468	str x8,[x22]
007ff46c	add x2,x19,#0x1
007ff470	ldp x20,x19,[sp, #0x20]
007ff474	ldp x22,x21,[sp, #0x10]
007ff478	ldp x29,x30,[sp], #0x30
007ff47c	b 0x00c2ff60
007ff480	bl 0x007fe124
