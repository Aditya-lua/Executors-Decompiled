; mbedtls_rsa_write_pubkey @ 00ba6408
00ba6408	sub sp,sp,#0x60
00ba640c	stp x24,x23,[sp, #0x20]
00ba6410	stp x22,x21,[sp, #0x30]
00ba6414	stp x20,x19,[sp, #0x40]
00ba6418	stp x29,x30,[sp, #0x50]
00ba641c	add x29,sp,#0x50
00ba6420	mrs x24,tpidr_el0
00ba6424	ldr x8,[x24, #0x28]
00ba6428	mov x23,x0
00ba642c	add x0,sp,#0x8
00ba6430	mov x19,x2
00ba6434	mov x20,x1
00ba6438	str x8,[sp, #0x18]
00ba643c	bl 0x00c41c00
00ba6440	add x5,sp,#0x8
00ba6444	mov x0,x23
00ba6448	mov x1,xzr
00ba644c	mov x2,xzr
00ba6450	mov x3,xzr
00ba6454	mov x4,xzr
00ba6458	bl 0x00c432c0
00ba645c	mov w21,w0
00ba6460	cbz w0,0x00ba64ac
00ba6464	mov x22,xzr
00ba6468	add x0,sp,#0x8
00ba646c	bl 0x00c41bb0
00ba6470	tbnz w21,#0x1f,0x00ba6524
00ba6474	mov x0,x19
00ba6478	mov x1,x20
00ba647c	mov x2,x22
00ba6480	bl 0x00c41ac0
00ba6484	mov w21,w0
00ba6488	tbnz w0,#0x1f,0x00ba6524
00ba648c	orr w2,wzr,#0x30
00ba6490	mov x0,x19
00ba6494	mov x1,x20
00ba6498	bl 0x00c41ae0
00ba649c	tbnz w0,#0x1f,0x00ba6520
00ba64a0	add w8,w21,w22
00ba64a4	add w21,w8,w0
00ba64a8	b 0x00ba6524
00ba64ac	add x2,sp,#0x8
00ba64b0	mov x0,x19
00ba64b4	mov x1,x20
00ba64b8	bl 0x00c41ad0
00ba64bc	mov w21,w0
00ba64c0	tbnz w0,#0x1f,0x00ba6514
00ba64c4	add x1,sp,#0x8
00ba64c8	mov x0,x23
00ba64cc	mov x2,xzr
00ba64d0	mov x3,xzr
00ba64d4	mov x4,xzr
00ba64d8	mov x5,xzr
00ba64dc	sxtw x22,w21
00ba64e0	bl 0x00c432c0
00ba64e4	mov w21,w0
00ba64e8	cbnz w0,0x00ba6468
00ba64ec	add x2,sp,#0x8
00ba64f0	mov x0,x19
00ba64f4	mov x1,x20
00ba64f8	bl 0x00c41ad0
00ba64fc	mov w21,w0
00ba6500	tbnz w0,#0x1f,0x00ba6514
00ba6504	add x0,sp,#0x8
00ba6508	add x22,x22,w21, SXTW 
00ba650c	bl 0x00c41bb0
00ba6510	b 0x00ba6474
00ba6514	add x0,sp,#0x8
00ba6518	bl 0x00c41bb0
00ba651c	b 0x00ba6524
00ba6520	mov w21,w0
00ba6524	ldr x8,[x24, #0x28]
00ba6528	ldr x9,[sp, #0x18]
00ba652c	cmp x8,x9
00ba6530	b.ne 0x00ba6550
00ba6534	mov w0,w21
00ba6538	ldp x29,x30,[sp, #0x50]
00ba653c	ldp x20,x19,[sp, #0x40]
00ba6540	ldp x22,x21,[sp, #0x30]
00ba6544	ldp x24,x23,[sp, #0x20]
00ba6548	add sp,sp,#0x60
00ba654c	ret
00ba6550	bl 0x00c2fec0
