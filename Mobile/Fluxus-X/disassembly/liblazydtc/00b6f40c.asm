; mbedtls_aes_crypt_ofb @ 00b6f40c
00b6f40c	str x25,[sp, #-0x50]!
00b6f410	stp x24,x23,[sp, #0x10]
00b6f414	stp x22,x21,[sp, #0x20]
00b6f418	stp x20,x19,[sp, #0x30]
00b6f41c	stp x29,x30,[sp, #0x40]
00b6f420	add x29,sp,#0x40
00b6f424	ldr x25,[x2]
00b6f428	mov x20,x5
00b6f42c	mov x21,x4
00b6f430	mov x22,x3
00b6f434	mov x19,x2
00b6f438	mov x23,x1
00b6f43c	cmp x25,#0xf
00b6f440	mov x24,x0
00b6f444	b.ls 0x00b6f450
00b6f448	orr w0,wzr,#0xffffffdf
00b6f44c	b 0x00b6f490
00b6f450	cbz x23,0x00b6f488
00b6f454	sub x23,x23,#0x1
00b6f458	cbnz x25,0x00b6f46c
00b6f45c	mov x0,x24
00b6f460	mov x1,x22
00b6f464	mov x2,x22
00b6f468	bl 0x00c419a0
00b6f46c	ldrb w8,[x21], #0x1
00b6f470	ldrb w9,[x22, x25]
00b6f474	add w10,w25,#0x1
00b6f478	and x25,x10,#0xf
00b6f47c	eor w8,w9,w8
00b6f480	strb w8,[x20], #0x1
00b6f484	cbnz x23,0x00b6f454
00b6f488	mov w0,wzr
00b6f48c	str x25,[x19]
00b6f490	ldp x29,x30,[sp, #0x40]
00b6f494	ldp x20,x19,[sp, #0x30]
00b6f498	ldp x22,x21,[sp, #0x20]
00b6f49c	ldp x24,x23,[sp, #0x10]
00b6f4a0	ldr x25,[sp], #0x50
00b6f4a4	ret
