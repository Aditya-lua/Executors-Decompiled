; ossl_statem_check_finish_init @ 009da41c
009da41c	cmn w1,#0x1
009da420	b.eq 0x009da440
009da424	ldr w8,[x0, #0x38]
009da428	cbz w8,0x009da470
009da42c	ldr w8,[x0, #0x84]
009da430	cmp w8,#0xc
009da434	b.ne 0x009da4a4
009da438	ldr w8,[x0, #0x5c]
009da43c	b 0x009da494
009da440	ldr w8,[x0, #0x5c]
009da444	and w8,w8,#0xfffffffe
009da448	cmp w8,#0x2e
009da44c	b.ne 0x009da4a4
009da450	ldr w8,[x0, #0x84]
009da454	mov w9,#0x1
009da458	cmp w8,#0x3
009da45c	str w9,[x0, #0x64]
009da460	b.ne 0x009da4a4
009da464	orr w8,wzr,#0x7
009da468	str w8,[x0, #0x84]
009da46c	ret
009da470	ldr w8,[x0, #0x5c]
009da474	cbz w1,0x009da494
009da478	and w8,w8,#0xfffffffe
009da47c	cmp w8,#0x2e
009da480	b.ne 0x009da4a4
009da484	ldr w8,[x0, #0x84]
009da488	cmp w8,#0x4
009da48c	b.ne 0x009da454
009da490	b 0x009da4a4
009da494	cmp w8,#0x2e
009da498	b.ne 0x009da4a4
009da49c	mov w8,#0x1
009da4a0	str w8,[x0, #0x64]
009da4a4	ret
