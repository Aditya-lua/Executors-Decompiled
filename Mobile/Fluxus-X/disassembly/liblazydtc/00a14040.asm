; SCT_set0_signature @ 00a14040
00a14040	str x21,[sp, #-0x30]!
00a14044	stp x20,x19,[sp, #0x10]
00a14048	stp x29,x30,[sp, #0x20]
00a1404c	mov x20,x0
00a14050	ldr x0,[x0, #0x48]
00a14054	mov x21,x1
00a14058	adrp x1,0x2a7000
00a1405c	mov x19,x2
00a14060	add x1,x1,#0xdc3
00a14064	mov w2,#0xab
00a14068	add x29,sp,#0x20
00a1406c	bl 0x00c32310
00a14070	stp x21,x19,[x20, #0x48]
00a14074	str wzr,[x20, #0x60]
00a14078	ldp x29,x30,[sp, #0x20]
00a1407c	ldp x20,x19,[sp, #0x10]
00a14080	ldr x21,[sp], #0x30
00a14084	ret
