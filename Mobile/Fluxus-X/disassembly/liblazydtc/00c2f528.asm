; FUN_00c2f528 @ 00c2f528
00c2f528	bti c
00c2f52c	ldrh w8,[x0, #0x18]
00c2f530	cbz x8,0x00c2f590
00c2f534	paciasp
00c2f538	sub sp,sp,#0x70
00c2f53c	stp x29,x30,[sp, #0x20]
00c2f540	str x25,[sp, #0x30]
00c2f544	stp x24,x23,[sp, #0x40]
00c2f548	stp x22,x21,[sp, #0x50]
00c2f54c	stp x20,x19,[sp, #0x60]
00c2f550	add x29,sp,#0x20
00c2f554	ldr x9,[x2, #0x10]
00c2f558	ldr x21,[x0]
00c2f55c	mov x20,x0
00c2f560	mov x19,x2
00c2f564	cmp x9,x21
00c2f568	b.cs 0x00c2f598
00c2f56c	mov w0,wzr
00c2f570	ldp x20,x19,[sp, #0x60]
00c2f574	ldr x25,[sp, #0x30]
00c2f578	ldp x22,x21,[sp, #0x50]
00c2f57c	ldp x24,x23,[sp, #0x40]
00c2f580	ldp x29,x30,[sp, #0x20]
00c2f584	add sp,sp,#0x70
00c2f588	autiasp
00c2f58c	ret
00c2f590	mov w0,wzr
00c2f594	ret
00c2f598	ldr x10,[x20, #0x10]
00c2f59c	mov x11,x8
00c2f5a0	b 0x00c2f5b0
00c2f5a4	subs x11,x11,#0x1
00c2f5a8	add x10,x10,#0x38
00c2f5ac	b.eq 0x00c2f56c
00c2f5b0	ldr w12,[x10]
00c2f5b4	cmp w12,#0x1
00c2f5b8	b.ne 0x00c2f5a4
00c2f5bc	ldr x12,[x10, #0x10]
00c2f5c0	add x12,x12,x21
00c2f5c4	cmp x9,x12
00c2f5c8	b.cc 0x00c2f5a4
00c2f5cc	ldr x13,[x10, #0x28]
00c2f5d0	add x14,x13,x12
00c2f5d4	cmp x9,x14
00c2f5d8	b.cs 0x00c2f5a4
00c2f5dc	ldr x9,[x19, #0x8]
00c2f5e0	mov w10,#0xffffffff
00c2f5e4	mov w25,#0xe550
00c2f5e8	add x22,x8,x10
00c2f5ec	sub x23,x8,#0x1
00c2f5f0	mov w24,#0x38
00c2f5f4	movk w25,#0x6474, LSL #16
00c2f5f8	stp x12,x13,[x9]
00c2f5fc	b 0x00c2f610
00c2f600	and x8,x23,#0xffff
00c2f604	sub x22,x22,#0x1
00c2f608	sub x23,x23,#0x1
00c2f60c	cbz x8,0x00c2f56c
00c2f610	ldr x8,[x20, #0x10]
00c2f614	nop
00c2f618	umaddl x8,w22,w24,x8
00c2f61c	ldr w9,[x8]
00c2f620	cmp w9,w25
00c2f624	b.ne 0x00c2f600
00c2f628	ldr x9,[x8, #0x10]
00c2f62c	ldp x0,x10,[x19]
00c2f630	ldr x8,[x8, #0x28]
00c2f634	mov x3,sp
00c2f638	add x1,x9,x21
00c2f63c	add x2,x8,x1
00c2f640	stp x1,x8,[x10, #0x20]
00c2f644	bl 0x00c2f664
00c2f648	tbz w0,#0x0,0x00c2f600
00c2f64c	ldr x8,[sp]
00c2f650	ldr x9,[x19, #0x8]
00c2f654	mov x10,#-0x1
00c2f658	mov w0,#0x1
00c2f65c	stp x8,x10,[x9, #0x10]
00c2f660	b 0x00c2f570
