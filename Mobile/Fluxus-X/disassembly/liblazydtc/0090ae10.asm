; FUN_0090ae10 @ 0090ae10
0090ae10	sub sp,sp,#0x50
0090ae14	str x23,[sp, #0x10]
0090ae18	stp x22,x21,[sp, #0x20]
0090ae1c	stp x20,x19,[sp, #0x30]
0090ae20	stp x29,x30,[sp, #0x40]
0090ae24	add x29,sp,#0x40
0090ae28	mrs x23,tpidr_el0
0090ae2c	ldr x8,[x23, #0x28]
0090ae30	mov x19,x0
0090ae34	mov w0,#0x1
0090ae38	mov w1,#0x28
0090ae3c	str x8,[sp, #0x8]
0090ae40	adrp x8,0xcc4000
0090ae44	add x8,x8,#0x690
0090ae48	str xzr,[sp]
0090ae4c	ldr x8,[x8]
0090ae50	blr x8
0090ae54	mov x20,x0
0090ae58	cbz x0,0x0090aeac
0090ae5c	mov x22,x20
0090ae60	str wzr,[x22], #0x8
0090ae64	mov w1,#0x800
0090ae68	mov x0,x22
0090ae6c	bl 0x00904528
0090ae70	adrp x1,0xcc4000
0090ae74	add x1,x1,#0x830
0090ae78	mov x0,sp
0090ae7c	mov x2,x20
0090ae80	bl 0x00907328
0090ae84	mov w21,w0
0090ae88	cbz w0,0x0090aeb4
0090ae8c	mov x0,x22
0090ae90	bl 0x00904534
0090ae94	adrp x8,0xcc4000
0090ae98	add x8,x8,#0x678
0090ae9c	mov x0,x20
0090aea0	ldr x8,[x8]
0090aea4	blr x8
0090aea8	b 0x0090aec0
0090aeac	mov w21,#0x1b
0090aeb0	b 0x0090aec0
0090aeb4	ldr x1,[sp]
0090aeb8	mov x0,x19
0090aebc	bl 0x009073e8
0090aec0	ldr x8,[x23, #0x28]
0090aec4	ldr x9,[sp, #0x8]
0090aec8	cmp x8,x9
0090aecc	b.ne 0x0090aeec
0090aed0	mov w0,w21
0090aed4	ldp x29,x30,[sp, #0x40]
0090aed8	ldp x20,x19,[sp, #0x30]
0090aedc	ldp x22,x21,[sp, #0x20]
0090aee0	ldr x23,[sp, #0x10]
0090aee4	add sp,sp,#0x50
0090aee8	ret
0090aeec	bl 0x00c2fec0
