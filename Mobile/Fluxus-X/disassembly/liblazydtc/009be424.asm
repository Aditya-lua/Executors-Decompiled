; FUN_009be424 @ 009be424
009be424	ldr x9,[x1, #0x328]
009be428	cbz x9,0x009be48c
009be42c	ldr x10,[x1, #0x320]
009be430	cbz x10,0x009be48c
009be434	add x12,x0,#0x48
009be438	add x8,x1,#0x320
009be43c	cmp x9,x12
009be440	add x11,x0,#0x40
009be444	b.eq 0x009be460
009be448	cmp x10,x11
009be44c	b.eq 0x009be474
009be450	str x10,[x9, #0x320]
009be454	ldr x10,[x8]
009be458	str x9,[x10, #0x328]
009be45c	b 0x009be484
009be460	cmp x10,x11
009be464	b.eq 0x009be480
009be468	str x10,[x12]
009be46c	str x12,[x10, #0x328]
009be470	b 0x009be484
009be474	str x9,[x11]
009be478	str x11,[x9, #0x320]
009be47c	b 0x009be484
009be480	stp xzr,xzr,[x11]
009be484	str xzr,[x1, #0x390]
009be488	stp xzr,xzr,[x8]
009be48c	mov x9,x0
009be490	ldr x11,[x9, #0x40]!
009be494	cbz x11,0x009be4ac
009be498	ldr w8,[x1, #0x2f0]
009be49c	ldr w10,[x11, #0x2f0]
009be4a0	cbz w8,0x009be4c8
009be4a4	cbnz w10,0x009be4e4
009be4a8	b 0x009be50c
009be4ac	mov x8,x0
009be4b0	str x1,[x8, #0x48]!
009be4b4	stur x1,[x8, #-0x8]
009be4b8	str x9,[x1, #0x320]
009be4bc	str x8,[x1, #0x328]
009be4c0	str x0,[x1, #0x390]
009be4c4	ret
009be4c8	cbz w10,0x009be4e4
009be4cc	mov x9,x0
009be4d0	ldr x12,[x9, #0x48]!
009be4d4	ldr w10,[x12, #0x2f0]
009be4d8	cbnz w10,0x009be52c
009be4dc	ldr x10,[x1, #0x2e8]
009be4e0	b 0x009be520
009be4e4	ldr x10,[x1, #0x2e8]
009be4e8	ldr x12,[x11, #0x2e8]
009be4ec	cmp x10,x12
009be4f0	b.ge 0x009be50c
009be4f4	mov x9,x0
009be4f8	ldr x12,[x9, #0x48]!
009be4fc	ldr w13,[x12, #0x2f0]
009be500	cbz w8,0x009be51c
009be504	cbnz w13,0x009be520
009be508	b 0x009be564
009be50c	str x11,[x1, #0x328]
009be510	str x1,[x11, #0x320]
009be514	str x9,[x1, #0x320]
009be518	b 0x009be538
009be51c	cbnz w13,0x009be52c
009be520	ldr x13,[x12, #0x2e8]
009be524	cmp x10,x13
009be528	b.ge 0x009be564
009be52c	str x12,[x1, #0x320]
009be530	str x1,[x12, #0x328]
009be534	str x9,[x1, #0x328]
009be538	str x1,[x9]
009be53c	str x0,[x1, #0x390]
009be540	ret
009be544	ldr w12,[x11, #0x2f0]
009be548	cbz w8,0x009be560
009be54c	cbz w12,0x009be574
009be550	ldr x12,[x11, #0x2e8]
009be554	cmp x10,x12
009be558	b.lt 0x009be564
009be55c	b 0x009be574
009be560	cbz w12,0x009be550
009be564	ldr x11,[x11, #0x328]
009be568	cmp x11,x9
009be56c	b.ne 0x009be544
009be570	b 0x009be53c
009be574	str x11,[x1, #0x328]
009be578	ldr x8,[x11, #0x320]
009be57c	str x8,[x1, #0x320]
009be580	ldr x8,[x11, #0x320]
009be584	str x1,[x8, #0x328]
009be588	str x1,[x11, #0x320]
009be58c	str x0,[x1, #0x390]
009be590	ret
