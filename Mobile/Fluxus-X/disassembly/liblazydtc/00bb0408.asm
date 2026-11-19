; ZSTD_decompressBound @ 00bb0408
00bb0408	sub sp,sp,#0x50
00bb040c	stp x29,x30,[sp, #0x20]
00bb0410	stp x22,x21,[sp, #0x30]
00bb0414	stp x20,x19,[sp, #0x40]
00bb0418	add x29,sp,#0x20
00bb041c	mrs x21,tpidr_el0
00bb0420	mov x19,x1
00bb0424	mov x20,x0
00bb0428	ldr x8,[x21, #0x28]
00bb042c	mov x22,xzr
00bb0430	stur x8,[x29, #-0x8]
00bb0434	cbz x19,0x00bb0478
00bb0438	mov x8,sp
00bb043c	mov x0,x20
00bb0440	mov x1,x19
00bb0444	mov w2,wzr
00bb0448	bl 0x00bb04a4
00bb044c	ldr x8,[sp, #0x8]
00bb0450	mov x0,#-0x2
00bb0454	cmn x8,#0x78
00bb0458	b.hi 0x00bb047c
00bb045c	ldr x9,[sp, #0x10]
00bb0460	add x20,x20,x8
00bb0464	sub x19,x19,x8
00bb0468	cmn x9,#0x2
00bb046c	add x22,x9,x22
00bb0470	b.ne 0x00bb0434
00bb0474	b 0x00bb047c
00bb0478	mov x0,x22
00bb047c	ldr x8,[x21, #0x28]
00bb0480	ldur x9,[x29, #-0x8]
00bb0484	cmp x8,x9
00bb0488	b.ne 0x00bb04a0
00bb048c	ldp x20,x19,[sp, #0x40]
00bb0490	ldp x22,x21,[sp, #0x30]
00bb0494	ldp x29,x30,[sp, #0x20]
00bb0498	add sp,sp,#0x50
00bb049c	ret
00bb04a0	bl 0x00c2fec0
