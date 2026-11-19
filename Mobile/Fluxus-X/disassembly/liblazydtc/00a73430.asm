; FUN_00a73430 @ 00a73430
00a73430	sub sp,sp,#0xd0
00a73434	stp x22,x21,[sp, #0xa0]
00a73438	stp x20,x19,[sp, #0xb0]
00a7343c	stp x29,x30,[sp, #0xc0]
00a73440	ldr x8,[x2, #0x20]
00a73444	mov w21,w0
00a73448	add x29,sp,#0xc0
00a7344c	mov x19,x2
00a73450	mov x0,x8
00a73454	mov x20,x1
00a73458	bl 0x00c37cd0
00a7345c	cmp w0,#0x6
00a73460	b.eq 0x00a73478
00a73464	ldr x0,[x19, #0x20]
00a73468	bl 0x00c37cd0
00a7346c	cmp w0,#0x390
00a73470	mov w0,wzr
00a73474	b.ne 0x00a734dc
00a73478	ldr x0,[x19, #0x20]
00a7347c	bl 0x00c3d8d0
00a73480	mov x22,x0
00a73484	bl 0x00c3db80
00a73488	cmp w0,#0x8
00a7348c	b.cc 0x00a734d8
00a73490	add x1,sp,#0x50
00a73494	mov x2,sp
00a73498	mov x0,x22
00a7349c	bl 0x00c3db30
00a734a0	cbz w0,0x00a734d8
00a734a4	ldr x8,[sp, #0x88]
00a734a8	cbz x8,0x00a734d8
00a734ac	ldr x9,[x19, #0x30]
00a734b0	mov w0,wzr
00a734b4	ldr w9,[x9, #0x8]
00a734b8	cmp w9,#0x2
00a734bc	b.ne 0x00a734dc
00a734c0	mov w0,w21
00a734c4	mov x1,x20
00a734c8	mov x2,x19
00a734cc	str x8,[x19, #0x20]
00a734d0	bl 0x00a6fd84
00a734d4	b 0x00a734dc
00a734d8	mov w0,wzr
00a734dc	ldp x29,x30,[sp, #0xc0]
00a734e0	ldp x20,x19,[sp, #0xb0]
00a734e4	ldp x22,x21,[sp, #0xa0]
00a734e8	add sp,sp,#0xd0
00a734ec	ret
