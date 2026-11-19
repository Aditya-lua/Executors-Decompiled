; std::__ndk1::__time_get::__time_get @ 00c04588
00c04588	paciasp
00c0458c	sub sp,sp,#0x40
00c04590	stp x29,x30,[sp, #0x20]
00c04594	stp x20,x19,[sp, #0x30]
00c04598	add x29,sp,#0x20
00c0459c	ldrb w8,[x1]
00c045a0	ldr x9,[x1, #0x10]
00c045a4	mov x19,x1
00c045a8	mov x20,x0
00c045ac	mov w0,#0x1fbf
00c045b0	mov x2,xzr
00c045b4	tst w8,#0x1
00c045b8	csinc x1,x9,x1,ne
00c045bc	bl 0x00c43890
00c045c0	str x0,[x20]
00c045c4	cbz x0,0x00c045dc
00c045c8	ldp x20,x19,[sp, #0x30]
00c045cc	ldp x29,x30,[sp, #0x20]
00c045d0	add sp,sp,#0x40
00c045d4	autiasp
00c045d8	ret
00c045dc	adrp x0,0x2c8000
00c045e0	add x0,x0,#0x9bd
00c045e4	add x8,sp,#0x8
00c045e8	mov x1,x19
00c045ec	add x19,sp,#0x8
00c045f0	bl 0x00c304a0
00c045f4	ldrb w8,[sp, #0x8]
00c045f8	ldr x9,[sp, #0x18]
00c045fc	tst w8,#0x1
00c04600	csinc x0,x9,x19,ne
00c04604	bl 0x00c43d00
00c04608	ldrb w8,[sp, #0x8]
00c0460c	mov x19,x0
00c04610	tbz w8,#0x0,0x00c04624
00c04614	ldr x8,[sp, #0x8]
00c04618	ldr x0,[sp, #0x18]
00c0461c	and x1,x8,#-0x2
00c04620	bl 0x00c2fe80
00c04624	mov x0,x19
00c04628	bl 0x00c2c090
