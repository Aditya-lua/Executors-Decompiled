; EC_KEY_print @ 00a23ffc
00a23ffc	str x21,[sp, #-0x30]!
00a24000	mov x21,x0
00a24004	mov x0,x1
00a24008	stp x20,x19,[sp, #0x10]
00a2400c	stp x29,x30,[sp, #0x20]
00a24010	add x29,sp,#0x20
00a24014	mov w19,w2
00a24018	mov x20,x1
00a2401c	bl 0x00c3a7d0
00a24020	mov x1,x20
00a24024	mov w2,w19
00a24028	ldp x29,x30,[sp, #0x20]
00a2402c	ldp x20,x19,[sp, #0x10]
00a24030	cmp x0,#0x0
00a24034	cset w3,eq
00a24038	mov x0,x21
00a2403c	ldr x21,[sp], #0x30
00a24040	b 0x00a24044
