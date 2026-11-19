; std::__ndk1::__time_put::__time_put @ 00c08420
00c08420	paciasp
00c08424	sub sp,sp,#0x50
00c08428	stp x29,x30,[sp, #0x30]
00c0842c	stp x20,x19,[sp, #0x40]
00c08430	add x29,sp,#0x30
00c08434	mov x20,x0
00c08438	mov w0,#0x1fbf
00c0843c	mov x2,xzr
00c08440	mov x19,x1
00c08444	bl 0x00c43890
00c08448	str x0,[x20]
00c0844c	cbz x0,0x00c08464
00c08450	ldp x20,x19,[sp, #0x40]
00c08454	ldp x29,x30,[sp, #0x30]
00c08458	add sp,sp,#0x50
00c0845c	autiasp
00c08460	ret
00c08464	mov x0,sp
00c08468	mov x1,x19
00c0846c	bl 0x00852d7c
00c08470	adrp x0,0x2c0000
00c08474	add x0,x0,#0xc67
00c08478	add x8,sp,#0x18
00c0847c	mov x1,sp
00c08480	add x19,sp,#0x18
00c08484	bl 0x00bfb964
00c08488	ldrb w8,[sp, #0x18]
00c0848c	ldr x9,[sp, #0x28]
00c08490	tst w8,#0x1
00c08494	csinc x0,x9,x19,ne
00c08498	bl 0x00c43d00
00c0849c	ldrb w8,[sp, #0x18]
00c084a0	mov x19,x0
00c084a4	tbnz w8,#0x0,0x00c084b8
00c084a8	ldrb w8,[sp]
00c084ac	tbnz w8,#0x0,0x00c084e0
00c084b0	mov x0,x19
00c084b4	bl 0x00c2c090
00c084b8	ldr x8,[sp, #0x18]
00c084bc	ldr x0,[sp, #0x28]
00c084c0	and x1,x8,#-0x2
00c084c4	bl 0x00c2fe80
00c084c8	ldrb w8,[sp]
00c084cc	tbz w8,#0x0,0x00c084b0
00c084d0	b 0x00c084e0
00c084e0	ldr x8,[sp]
00c084e4	ldr x0,[sp, #0x10]
00c084e8	and x1,x8,#-0x2
00c084ec	bl 0x00c2fe80
00c084f0	mov x0,x19
00c084f4	bl 0x00c2c090
