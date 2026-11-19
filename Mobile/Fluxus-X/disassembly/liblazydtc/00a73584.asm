; FUN_00a73584 @ 00a73584
00a73584	sub sp,sp,#0xd0
00a73588	stp x22,x21,[sp, #0xa0]
00a7358c	stp x20,x19,[sp, #0xb0]
00a73590	stp x29,x30,[sp, #0xc0]
00a73594	ldr x8,[x2, #0x20]
00a73598	mov w21,w0
00a7359c	add x29,sp,#0xc0
00a735a0	mov x19,x2
00a735a4	mov x0,x8
00a735a8	mov x20,x1
00a735ac	bl 0x00c37cd0
00a735b0	cmp w0,#0x6
00a735b4	b.eq 0x00a735cc
00a735b8	ldr x0,[x19, #0x20]
00a735bc	bl 0x00c37cd0
00a735c0	cmp w0,#0x390
00a735c4	mov w0,wzr
00a735c8	b.ne 0x00a7362c
00a735cc	ldr x0,[x19, #0x20]
00a735d0	bl 0x00c3d8d0
00a735d4	mov x22,x0
00a735d8	bl 0x00c3db80
00a735dc	cbz w0,0x00a73628
00a735e0	add x1,sp,#0x50
00a735e4	mov x2,sp
00a735e8	mov x0,x22
00a735ec	bl 0x00c3db30
00a735f0	cbz w0,0x00a73628
00a735f4	ldr x8,[sp]
00a735f8	cbz x8,0x00a73628
00a735fc	ldr x9,[x19, #0x30]
00a73600	mov w0,wzr
00a73604	ldr w9,[x9, #0x8]
00a73608	cmp w9,#0x2
00a7360c	b.ne 0x00a7362c
00a73610	mov w0,w21
00a73614	mov x1,x20
00a73618	mov x2,x19
00a7361c	str x8,[x19, #0x20]
00a73620	bl 0x00a6fd84
00a73624	b 0x00a7362c
00a73628	mov w0,wzr
00a7362c	ldp x29,x30,[sp, #0xc0]
00a73630	ldp x20,x19,[sp, #0xb0]
00a73634	ldp x22,x21,[sp, #0xa0]
00a73638	add sp,sp,#0xd0
00a7363c	ret
