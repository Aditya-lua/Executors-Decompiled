; SSL_CONF_CTX_set1_prefix @ 009ba404
009ba404	stp x20,x19,[sp, #-0x20]!
009ba408	mov x19,x0
009ba40c	stp x29,x30,[sp, #0x10]
009ba410	add x29,sp,#0x10
009ba414	cbz x1,0x009ba43c
009ba418	adrp x8,0x2ad000
009ba41c	add x8,x8,#0x7c2
009ba420	mov w2,#0x410
009ba424	mov x0,x1
009ba428	mov x1,x8
009ba42c	bl 0x00c34600
009ba430	mov x20,x0
009ba434	cbnz x0,0x009ba440
009ba438	b 0x009ba474
009ba43c	mov x20,xzr
009ba440	ldr x0,[x19, #0x8]
009ba444	adrp x1,0x2ad000
009ba448	add x1,x1,#0x7c2
009ba44c	mov w2,#0x414
009ba450	bl 0x00c32310
009ba454	str x20,[x19, #0x8]
009ba458	cbz x20,0x009ba468
009ba45c	mov x0,x20
009ba460	bl 0x00c2ff50
009ba464	b 0x009ba46c
009ba468	mov x0,xzr
009ba46c	str x0,[x19, #0x10]
009ba470	mov w0,#0x1
009ba474	ldp x29,x30,[sp, #0x10]
009ba478	ldp x20,x19,[sp], #0x20
009ba47c	ret
