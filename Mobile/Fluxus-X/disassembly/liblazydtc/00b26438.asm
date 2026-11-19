; ossl_siv128_encrypt @ 00b26438
00b26438	sub sp,sp,#0x50
00b2643c	stp x22,x21,[sp, #0x20]
00b26440	stp x20,x19,[sp, #0x30]
00b26444	stp x29,x30,[sp, #0x40]
00b26448	ldr w8,[x0, #0x3c]
00b2644c	str x23,[sp, #0x10]
00b26450	add x29,sp,#0x40
00b26454	cbz w8,0x00b264ec
00b26458	mov x22,x1
00b2645c	mov x21,x2
00b26460	sub w8,w8,#0x1
00b26464	mov x1,sp
00b26468	mov x2,x22
00b2646c	mov x19,x3
00b26470	mov x20,x0
00b26474	str w8,[x0, #0x3c]
00b26478	bl 0x00b2650c
00b2647c	cbz w0,0x00b264ec
00b26480	ldr q0,[sp]
00b26484	mov x4,sp
00b26488	mov w5,#0x1
00b2648c	mov x1,xzr
00b26490	str q0,[x20, #0x10]
00b26494	ldrb w8,[sp, #0x8]
00b26498	mov x2,xzr
00b2649c	mov x3,xzr
00b264a0	and w8,w8,#0x7f
00b264a4	strb w8,[sp, #0x8]
00b264a8	ldrb w8,[sp, #0xc]
00b264ac	and w8,w8,#0x7f
00b264b0	strb w8,[sp, #0xc]
00b264b4	ldr x23,[x20, #0x20]
00b264b8	str w19,[sp, #0x1c]
00b264bc	mov x0,x23
00b264c0	bl 0x00c34be0
00b264c4	cbz w0,0x00b264ec
00b264c8	add x2,sp,#0x1c
00b264cc	mov x0,x23
00b264d0	mov x1,x21
00b264d4	mov x3,x22
00b264d8	mov w4,w19
00b264dc	bl 0x00c37310
00b264e0	cbz w0,0x00b264ec
00b264e4	str wzr,[x20, #0x38]
00b264e8	b 0x00b264f0
00b264ec	mov w19,wzr
00b264f0	mov w0,w19
00b264f4	ldp x29,x30,[sp, #0x40]
00b264f8	ldp x20,x19,[sp, #0x30]
00b264fc	ldp x22,x21,[sp, #0x20]
00b26500	ldr x23,[sp, #0x10]
00b26504	add sp,sp,#0x50
00b26508	ret
