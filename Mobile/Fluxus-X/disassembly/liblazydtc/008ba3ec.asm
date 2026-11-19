; FUN_008ba3ec @ 008ba3ec
008ba3ec	adrp x8,0xd1f000
008ba3f0	ldr w9,[x1, #0x10]
008ba3f4	mov x4,x2
008ba3f8	ldrb w10,[x8, #0xbd8]
008ba3fc	ldr x8,[x0, #0x60]
008ba400	cmp w10,#0x1
008ba404	b.ne 0x008ba44c
008ba408	ldr w10,[x8, #0x28]
008ba40c	ldr w11,[x8, #0x30]
008ba410	madd w9,w10,w9,w11
008ba414	ldrb w10,[x8, #0x44]
008ba418	ldr x11,[x8, #0x38]
008ba41c	lsr w9,w9,w10
008ba420	add x10,x11,w9, SXTW  #0x3
008ba424	ldr x9,[x10]
008ba428	cbz x9,0x008ba49c
008ba42c	cmp x9,x1
008ba430	b.eq 0x008ba488
008ba434	mov x10,x9
008ba438	ldr x9,[x9, #0x8]
008ba43c	cbz x9,0x008ba49c
008ba440	cmp x9,x1
008ba444	b.ne 0x008ba434
008ba448	b 0x008ba484
008ba44c	ldr w10,[x8, #0x2c]
008ba450	ldr x11,[x8, #0x38]
008ba454	sub w10,w10,#0x1
008ba458	and w9,w10,w9
008ba45c	add x10,x11,w9, SXTW  #0x3
008ba460	ldr x9,[x10]
008ba464	cbz x9,0x008ba49c
008ba468	cmp x9,x1
008ba46c	b.eq 0x008ba488
008ba470	mov x10,x9
008ba474	ldr x9,[x9, #0x8]
008ba478	cbz x9,0x008ba49c
008ba47c	cmp x9,x1
008ba480	b.ne 0x008ba470
008ba484	add x10,x10,#0x8
008ba488	ldr x9,[x9, #0x8]
008ba48c	ldr w11,[x8, #0x40]
008ba490	str x9,[x10]
008ba494	sub w9,w11,#0x1
008ba498	str w9,[x8, #0x40]
008ba49c	ldr w8,[x1, #0x14]
008ba4a0	ldrb w3,[x1, #0x1]
008ba4a4	add x2,x8,#0x19
008ba4a8	b 0x008b7bd4
