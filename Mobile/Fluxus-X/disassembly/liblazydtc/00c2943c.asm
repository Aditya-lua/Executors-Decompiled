; __cxa_init_primary_exception @ 00c2943c
00c2943c	paciasp
00c29440	stp x29,x30,[sp, #-0x30]!
00c29444	stp x22,x21,[sp, #0x10]
00c29448	stp x20,x19,[sp, #0x20]
00c2944c	mov x29,sp
00c29450	mov x19,x2
00c29454	mov x20,x1
00c29458	mov x21,x0
00c2945c	sub x22,x0,#0x80
00c29460	stur xzr,[x0, #-0x78]
00c29464	bl 0x00c44740
00c29468	stur x0,[x21, #-0x60]
00c2946c	bl 0x00c44750
00c29470	mov x8,#0x2b00
00c29474	nop
00c29478	adr x9,0xc294ac
00c2947c	movk x8,#0x432b, LSL #16
00c29480	stp x20,x19,[x21, #-0x70]
00c29484	movk x8,#0x4e47, LSL #32
00c29488	stur x0,[x21, #-0x58]
00c2948c	movk x8,#0x434c, LSL #48
00c29490	stp x8,x9,[x21, #-0x20]
00c29494	mov x0,x22
00c29498	ldp x20,x19,[sp, #0x20]
00c2949c	ldp x22,x21,[sp, #0x10]
00c294a0	ldp x29,x30,[sp], #0x30
00c294a4	autiasp
00c294a8	ret
