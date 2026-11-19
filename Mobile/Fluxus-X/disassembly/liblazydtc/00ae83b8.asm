; SRP_create_verifier_BN_ex @ 00ae83b8
00ae83b8	stp x28,x27,[sp, #-0x60]!
00ae83bc	stp x26,x25,[sp, #0x10]
00ae83c0	stp x24,x23,[sp, #0x20]
00ae83c4	stp x22,x21,[sp, #0x30]
00ae83c8	stp x20,x19,[sp, #0x40]
00ae83cc	stp x29,x30,[sp, #0x50]
00ae83d0	add x29,sp,#0x50
00ae83d4	sub sp,sp,#0x9e0
00ae83d8	mov x27,x0
00ae83dc	mov x0,x6
00ae83e0	mov x22,x7
00ae83e4	mov x28,x6
00ae83e8	mov x25,x5
00ae83ec	mov x24,x4
00ae83f0	mov x23,x3
00ae83f4	mov x20,x2
00ae83f8	mov x19,x1
00ae83fc	bl 0x00c38a60
00ae8400	mov w26,wzr
00ae8404	mov x21,xzr
00ae8408	str x0,[sp, #0x8]
00ae840c	cbz x27,0x00ae8494
00ae8410	cbz x19,0x00ae8494
00ae8414	cbz x20,0x00ae8494
00ae8418	cbz x23,0x00ae8494
00ae841c	cbz x24,0x00ae8494
00ae8420	cbz x25,0x00ae8494
00ae8424	ldr x8,[sp, #0x8]
00ae8428	str x22,[sp]
00ae842c	mov x22,x21
00ae8430	cbz x8,0x00ae84e8
00ae8434	ldr x22,[x20]
00ae8438	cbz x22,0x00ae84a0
00ae843c	ldr x4,[sp]
00ae8440	mov x0,x22
00ae8444	mov x1,x27
00ae8448	mov x2,x19
00ae844c	mov x3,x28
00ae8450	bl 0x00c36a20
00ae8454	mov x21,x0
00ae8458	cbz x0,0x00ae84e4
00ae845c	bl 0x00c37710
00ae8460	cbz x0,0x00ae8534
00ae8464	ldr x4,[sp, #0x8]
00ae8468	mov x1,x25
00ae846c	mov x2,x21
00ae8470	mov x3,x24
00ae8474	mov x19,x0
00ae8478	bl 0x00c38ad0
00ae847c	cbz w0,0x00ae8554
00ae8480	mov w26,#0x1
00ae8484	str x22,[x20]
00ae8488	str x19,[x23]
00ae848c	cbnz x20,0x00ae84ec
00ae8490	b 0x00ae8500
00ae8494	mov x22,x21
00ae8498	cbnz x20,0x00ae84ec
00ae849c	b 0x00ae8500
00ae84a0	add x1,sp,#0x14
00ae84a4	mov w2,#0x14
00ae84a8	mov x0,x28
00ae84ac	mov w3,wzr
00ae84b0	bl 0x00c347b0
00ae84b4	cmp w0,#0x1
00ae84b8	b.lt 0x00ae8540
00ae84bc	add x0,sp,#0x14
00ae84c0	mov w1,#0x14
00ae84c4	mov x2,xzr
00ae84c8	bl 0x00c36970
00ae84cc	mov x22,x0
00ae84d0	cbnz x0,0x00ae843c
00ae84d4	mov x21,xzr
00ae84d8	mov w26,wzr
00ae84dc	cbnz x20,0x00ae84ec
00ae84e0	b 0x00ae8500
00ae84e4	mov w26,wzr
00ae84e8	cbz x20,0x00ae8500
00ae84ec	ldr x8,[x20]
00ae84f0	cmp x8,x22
00ae84f4	b.eq 0x00ae8500
00ae84f8	mov x0,x22
00ae84fc	bl 0x00c322e0
00ae8500	mov x0,x21
00ae8504	bl 0x00c322e0
00ae8508	ldr x0,[sp, #0x8]
00ae850c	bl 0x00c38a30
00ae8510	mov w0,w26
00ae8514	add sp,sp,#0x9e0
00ae8518	ldp x29,x30,[sp, #0x50]
00ae851c	ldp x20,x19,[sp, #0x40]
00ae8520	ldp x22,x21,[sp, #0x30]
00ae8524	ldp x24,x23,[sp, #0x20]
00ae8528	ldp x26,x25,[sp, #0x10]
00ae852c	ldp x28,x27,[sp], #0x60
00ae8530	ret
00ae8534	mov w26,wzr
00ae8538	cbnz x20,0x00ae84ec
00ae853c	b 0x00ae8500
00ae8540	mov x21,xzr
00ae8544	mov x22,xzr
00ae8548	mov w26,wzr
00ae854c	cbnz x20,0x00ae84ec
00ae8550	b 0x00ae8500
00ae8554	mov x0,x19
00ae8558	bl 0x00c322e0
00ae855c	mov w26,wzr
00ae8560	cbnz x20,0x00ae84ec
00ae8564	b 0x00ae8500
