; ossl_sa_doall @ 00ac5424
00ac5424	cbz x0,0x00ac551c
00ac5428	sub sp,sp,#0x120
00ac542c	stp x26,x25,[sp, #0xd0]
00ac5430	stp x24,x23,[sp, #0xe0]
00ac5434	stp x22,x21,[sp, #0xf0]
00ac5438	stp x20,x19,[sp, #0x100]
00ac543c	stp x29,x30,[sp, #0x110]
00ac5440	str wzr,[sp, #0x80]
00ac5444	ldr x9,[x0, #0x18]
00ac5448	mov x19,x1
00ac544c	mov x20,x0
00ac5450	mov w26,wzr
00ac5454	mov x21,xzr
00ac5458	mov w8,wzr
00ac545c	mov x22,sp
00ac5460	add x23,sp,#0x80
00ac5464	str x28,[sp, #0xc0]
00ac5468	add x29,sp,#0x110
00ac546c	str x9,[sp]
00ac5470	b 0x00ac5480
00ac5474	sub x8,x24,#0x1
00ac5478	ldr w26,[x23, x8, LSL #0x2]
00ac547c	lsr x21,x21,#0x4
00ac5480	ldr x25,[x22, w8, SXTW #0x3]
00ac5484	sxtw x24,w8
00ac5488	b 0x00ac5498
00ac548c	mov x0,x21
00ac5490	add x26,x8,#0x1
00ac5494	blr x19
00ac5498	sxtw x8,w26
00ac549c	cmp w8,#0x10
00ac54a0	b.lt 0x00ac54b4
00ac54a4	b 0x00ac54f8
00ac54a8	add x8,x8,#0x1
00ac54ac	cmp w8,#0x10
00ac54b0	b.ge 0x00ac54f8
00ac54b4	add w9,w8,#0x1
00ac54b8	str w9,[x23, x24, LSL #0x2]
00ac54bc	cbz x25,0x00ac54a8
00ac54c0	ldr x1,[x25, x8, LSL #0x3]
00ac54c4	cbz x1,0x00ac54a8
00ac54c8	ldr w9,[x20]
00ac54cc	and x10,x21,#-0x10
00ac54d0	orr x21,x10,x8
00ac54d4	sub w9,w9,#0x1
00ac54d8	cmp w24,w9
00ac54dc	b.ge 0x00ac548c
00ac54e0	add x8,x24,#0x1
00ac54e4	mov w26,wzr
00ac54e8	str wzr,[x23, x8, LSL #0x2]
00ac54ec	str x1,[x22, x8, LSL #0x3]
00ac54f0	lsl x21,x21,#0x4
00ac54f4	b 0x00ac5480
00ac54f8	cmp w24,#0x1
00ac54fc	b.ge 0x00ac5474
00ac5500	ldp x29,x30,[sp, #0x110]
00ac5504	ldp x20,x19,[sp, #0x100]
00ac5508	ldp x22,x21,[sp, #0xf0]
00ac550c	ldp x24,x23,[sp, #0xe0]
00ac5510	ldp x26,x25,[sp, #0xd0]
00ac5514	ldr x28,[sp, #0xc0]
00ac5518	add sp,sp,#0x120
00ac551c	ret
