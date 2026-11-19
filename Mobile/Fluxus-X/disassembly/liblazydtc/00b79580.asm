; mbedtls_md_hmac @ 00b79580
00b79580	sub sp,sp,#0x70
00b79584	str x25,[sp, #0x20]
00b79588	stp x24,x23,[sp, #0x30]
00b7958c	stp x22,x21,[sp, #0x40]
00b79590	stp x20,x19,[sp, #0x50]
00b79594	stp x29,x30,[sp, #0x60]
00b79598	add x29,sp,#0x60
00b7959c	mrs x25,tpidr_el0
00b795a0	ldr x8,[x25, #0x28]
00b795a4	mov x19,x5
00b795a8	mov x20,x4
00b795ac	mov x21,x3
00b795b0	mov x23,x2
00b795b4	mov x24,x1
00b795b8	mov x1,x0
00b795bc	str x8,[sp, #0x18]
00b795c0	cbz x0,0x00b79634
00b795c4	mov x0,sp
00b795c8	mov w2,#0x1
00b795cc	stp xzr,xzr,[sp]
00b795d0	str xzr,[sp, #0x10]
00b795d4	bl 0x00c42850
00b795d8	mov w22,w0
00b795dc	cbnz w0,0x00b79640
00b795e0	mov x0,sp
00b795e4	mov x1,x24
00b795e8	mov x2,x23
00b795ec	bl 0x00c42970
00b795f0	mov w22,w0
00b795f4	cbnz w0,0x00b79640
00b795f8	ldr x8,[sp]
00b795fc	cbz x8,0x00b7963c
00b79600	ldr x8,[sp, #0x10]
00b79604	cbz x8,0x00b7963c
00b79608	mov x0,sp
00b7960c	mov x1,x21
00b79610	mov x2,x20
00b79614	bl 0x00c42870
00b79618	mov w22,w0
00b7961c	cbnz w0,0x00b79640
00b79620	mov x0,sp
00b79624	mov x1,x19
00b79628	bl 0x00c42950
00b7962c	mov w22,w0
00b79630	b 0x00b79640
00b79634	mov w22,#0xffffaf00
00b79638	b 0x00b79648
00b7963c	mov w22,#0xffffaf00
00b79640	mov x0,sp
00b79644	bl 0x00c42830
00b79648	ldr x8,[x25, #0x28]
00b7964c	ldr x9,[sp, #0x18]
00b79650	cmp x8,x9
00b79654	b.ne 0x00b79678
00b79658	mov w0,w22
00b7965c	ldp x29,x30,[sp, #0x60]
00b79660	ldp x20,x19,[sp, #0x50]
00b79664	ldp x22,x21,[sp, #0x40]
00b79668	ldp x24,x23,[sp, #0x30]
00b7966c	ldr x25,[sp, #0x20]
00b79670	add sp,sp,#0x70
00b79674	ret
00b79678	bl 0x00c2fec0
