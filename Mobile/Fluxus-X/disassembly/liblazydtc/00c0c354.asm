; FUN_00c0c354 @ 00c0c354
00c0c354	paciasp
00c0c358	sub sp,sp,#0x60
00c0c35c	stp x29,x30,[sp, #0x10]
00c0c360	stp x26,x25,[sp, #0x20]
00c0c364	stp x24,x23,[sp, #0x30]
00c0c368	stp x22,x21,[sp, #0x40]
00c0c36c	stp x20,x19,[sp, #0x50]
00c0c370	add x29,sp,#0x10
00c0c374	cmp x0,x1
00c0c378	mov x19,x2
00c0c37c	b.eq 0x00c0c41c
00c0c380	ldrb w24,[x0]
00c0c384	mov w21,w3
00c0c388	mov x20,x1
00c0c38c	mov x22,x0
00c0c390	cmp w24,#0x2d
00c0c394	b.ne 0x00c0c3a4
00c0c398	add x22,x22,#0x1
00c0c39c	cmp x22,x20
00c0c3a0	b.eq 0x00c0c41c
00c0c3a4	bl 0x00c30710
00c0c3a8	ldr w25,[x0]
00c0c3ac	str wzr,[x0]
00c0c3b0	adrp x8,0xd27000
00c0c3b4	add x8,x8,#0xf8
00c0c3b8	mov x23,x0
00c0c3bc	adrp x26,0xd27000
00c0c3c0	ldarb w8,[x8]
00c0c3c4	tbz w8,#0x0,0x00c0c45c
00c0c3c8	ldr x3,[x26, #0xf0]
00c0c3cc	add x1,sp,#0x8
00c0c3d0	mov x0,x22
00c0c3d4	mov w2,w21
00c0c3d8	bl 0x00c43950
00c0c3dc	ldr w8,[x23]
00c0c3e0	cbz w8,0x00c0c40c
00c0c3e4	ldr x9,[sp, #0x8]
00c0c3e8	cmp x9,x20
00c0c3ec	b.ne 0x00c0c41c
00c0c3f0	lsr x9,x0,#0x20
00c0c3f4	cbnz x9,0x00c0c450
00c0c3f8	cmp w8,#0x22
00c0c3fc	b.eq 0x00c0c450
00c0c400	cmp w24,#0x2d
00c0c404	cneg w0,w0,eq
00c0c408	b 0x00c0c428
00c0c40c	ldr x8,[sp, #0x8]
00c0c410	str w25,[x23]
00c0c414	cmp x8,x20
00c0c418	b.eq 0x00c0c448
00c0c41c	mov w0,wzr
00c0c420	mov w8,#0x4
00c0c424	str w8,[x19]
00c0c428	ldp x20,x19,[sp, #0x50]
00c0c42c	ldp x22,x21,[sp, #0x40]
00c0c430	ldp x24,x23,[sp, #0x30]
00c0c434	ldp x26,x25,[sp, #0x20]
00c0c438	ldp x29,x30,[sp, #0x10]
00c0c43c	add sp,sp,#0x60
00c0c440	autiasp
00c0c444	ret
00c0c448	lsr x8,x0,#0x20
00c0c44c	cbz x8,0x00c0c400
00c0c450	mov w8,#0x4
00c0c454	mov w0,#0xffffffff
00c0c458	b 0x00c0c424
00c0c45c	adrp x0,0xd27000
00c0c460	add x0,x0,#0xf8
00c0c464	bl 0x00c2fe90
00c0c468	cbz w0,0x00c0c3c8
00c0c46c	adrp x1,0x2c6000
00c0c470	add x1,x1,#0xbfc
00c0c474	mov w0,#0x1fbf
00c0c478	mov x2,xzr
00c0c47c	bl 0x00c43890
00c0c480	str x0,[x26, #0xf0]
00c0c484	adrp x0,0xd27000
00c0c488	add x0,x0,#0xf8
00c0c48c	bl 0x00c2fea0
00c0c490	b 0x00c0c3c8
