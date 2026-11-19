; PKCS7_get_smimecap @ 00ac2420
00ac2420	str x19,[sp, #-0x20]!
00ac2424	mov w1,#0xa7
00ac2428	stp x29,x30,[sp, #0x10]
00ac242c	add x29,sp,#0x10
00ac2430	bl 0x00c3f780
00ac2434	cbz x0,0x00ac2478
00ac2438	ldr w8,[x0]
00ac243c	mov x1,xzr
00ac2440	cmp w8,#0x10
00ac2444	b.ne 0x00ac247c
00ac2448	ldr x8,[x0, #0x8]
00ac244c	ldr x9,[x8, #0x8]
00ac2450	str x9,[sp, #0x8]
00ac2454	ldrsw x19,[x8]
00ac2458	bl 0x00c38200
00ac245c	mov x3,x0
00ac2460	add x1,sp,#0x8
00ac2464	mov x0,xzr
00ac2468	mov x2,x19
00ac246c	bl 0x00c36150
00ac2470	mov x1,x0
00ac2474	b 0x00ac247c
00ac2478	mov x1,xzr
00ac247c	ldp x29,x30,[sp, #0x10]
00ac2480	mov x0,x1
00ac2484	ldr x19,[sp], #0x20
00ac2488	ret
