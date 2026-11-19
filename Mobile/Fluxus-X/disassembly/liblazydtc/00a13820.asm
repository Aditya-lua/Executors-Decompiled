; d2i_SCT_LIST @ 00a13820
00a13820	sub sp,sp,#0x40
00a13824	stp x21,xzr,[sp, #0x10]
00a13828	stp x20,x19,[sp, #0x20]
00a1382c	stp x29,x30,[sp, #0x30]
00a13830	ldr x8,[x1]
00a13834	mov x19,x1
00a13838	mov x21,x0
00a1383c	add x0,sp,#0x18
00a13840	add x1,sp,#0x8
00a13844	add x29,sp,#0x30
00a13848	mov x20,x2
00a1384c	str x8,[sp, #0x8]
00a13850	bl 0x00c37c80
00a13854	cbz x0,0x00a13894
00a13858	ldr x8,[sp, #0x18]
00a1385c	add x1,sp,#0x8
00a13860	mov x0,x21
00a13864	ldr x9,[x8, #0x8]
00a13868	str x9,[sp, #0x8]
00a1386c	ldrsw x2,[x8]
00a13870	bl 0x00a133f8
00a13874	mov x21,x0
00a13878	cbz x0,0x00a13888
00a1387c	ldr x8,[x19]
00a13880	add x8,x8,x20
00a13884	str x8,[x19]
00a13888	ldr x0,[sp, #0x18]
00a1388c	bl 0x00c35530
00a13890	b 0x00a13898
00a13894	mov x21,xzr
00a13898	mov x0,x21
00a1389c	ldp x29,x30,[sp, #0x30]
00a138a0	ldp x20,x19,[sp, #0x20]
00a138a4	ldr x21,[sp, #0x10]
00a138a8	add sp,sp,#0x40
00a138ac	ret
