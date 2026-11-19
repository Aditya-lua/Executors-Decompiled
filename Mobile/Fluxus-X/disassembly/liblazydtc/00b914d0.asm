; FUN_00b914d0 @ 00b914d0
00b914d0	sub sp,sp,#0x50
00b914d4	str x21,[sp, #0x20]
00b914d8	stp x20,x19,[sp, #0x30]
00b914dc	stp x29,x30,[sp, #0x40]
00b914e0	add x29,sp,#0x40
00b914e4	mrs x21,tpidr_el0
00b914e8	ldr x8,[x21, #0x28]
00b914ec	lsl x9,x3,#0x3
00b914f0	orr w10,wzr,#0xfff8
00b914f4	cmp x9,x10
00b914f8	str x8,[sp, #0x18]
00b914fc	mov w8,#0x1100
00b91500	strh w8,[sp]
00b91504	mov w8,#0x1400
00b91508	csinv w9,w9,wzr,ls
00b9150c	stur xzr,[sp, #0x4]
00b91510	stur xzr,[sp, #0xc]
00b91514	str wzr,[sp, #0x14]
00b91518	strh w9,[sp, #0x2]
00b9151c	str w8,[sp, #0x8]
00b91520	ldrb w10,[x0, #0x5]
00b91524	and w8,w1,#0xff
00b91528	sub w9,w8,#0x3
00b9152c	mov x19,x0
00b91530	orr w10,w10,#0x1
00b91534	cmp w9,#0xf
00b91538	strb w10,[x0, #0x5]
00b9153c	b.hi 0x00b91580
00b91540	adrp x10,0x780000
00b91544	add x10,x10,#0x8c8
00b91548	ldrsw x9,[x10, x9, LSL #0x2]
00b9154c	add x10,x9,x10
00b91550	mov w9,#0x10
00b91554	br x10
00b91558	orr w9,wzr,#0x1c
00b9155c	b 0x00b91598
00b91560	mov w9,#0x20
00b91564	b 0x00b91598
00b91568	orr w9,wzr,#0x30
00b9156c	b 0x00b91598
00b91570	mov w9,#0x14
00b91574	b 0x00b91598
00b91578	mov w9,#0x40
00b9157c	b 0x00b91598
00b91580	mov w10,#0x13
00b91584	orr w9,w8,#0x2000000
00b91588	movk w10,#0x200, LSL #16
00b9158c	cmp w9,w10
00b91590	cset w9,eq
00b91594	lsl w9,w9,#0x6
00b91598	orr w4,w8,#0x3800000
00b9159c	add x0,x19,#0x8
00b915a0	mov x1,sp
00b915a4	strb w9,[x19, #0x4]
00b915a8	bl 0x00c43070
00b915ac	mov w20,w0
00b915b0	cmn w0,#0x86
00b915b4	b.eq 0x00b915c4
00b915b8	cbnz w20,0x00b915c4
00b915bc	mov w8,#0x1
00b915c0	str w8,[x19]
00b915c4	mov x0,sp
00b915c8	bl 0x00c42ef0
00b915cc	ldr x8,[x21, #0x28]
00b915d0	ldr x9,[sp, #0x18]
00b915d4	cmp x8,x9
00b915d8	b.ne 0x00b915f4
00b915dc	mov w0,w20
00b915e0	ldp x29,x30,[sp, #0x40]
00b915e4	ldp x20,x19,[sp, #0x30]
00b915e8	ldr x21,[sp, #0x20]
00b915ec	add sp,sp,#0x50
00b915f0	ret
00b915f4	bl 0x00c2fec0
