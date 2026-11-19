; std::__ndk1::locale::locale @ 00bfaf14
00bfaf14	paciasp
00bfaf18	sub sp,sp,#0x60
00bfaf1c	stp x29,x30,[sp, #0x20]
00bfaf20	stp x24,x23,[sp, #0x30]
00bfaf24	stp x22,x21,[sp, #0x40]
00bfaf28	stp x20,x19,[sp, #0x50]
00bfaf2c	add x29,sp,#0x20
00bfaf30	cbz x1,0x00bfb00c
00bfaf34	mov x20,x0
00bfaf38	mov w0,#0x138
00bfaf3c	mov x21,x1
00bfaf40	bl 0x00c2fed0
00bfaf44	mov x19,x0
00bfaf48	mov x0,x21
00bfaf4c	bl 0x00c2ff50
00bfaf50	cmn x0,#0x8
00bfaf54	b.cs 0x00bfb018
00bfaf58	mov x22,x0
00bfaf5c	cmp x0,#0x17
00bfaf60	b.cs 0x00bfaf7c
00bfaf64	lsl w8,w22,#0x1
00bfaf68	add x9,sp,#0x8
00bfaf6c	orr x23,x9,#0x1
00bfaf70	strb w8,[sp, #0x8]
00bfaf74	cbnz x22,0x00bfafa4
00bfaf78	b 0x00bfafb4
00bfaf7c	orr x8,x22,#0x7
00bfaf80	mov w9,#0x1a
00bfaf84	cmp x8,#0x17
00bfaf88	csinc x24,x9,x8,eq
00bfaf8c	mov x0,x24
00bfaf90	bl 0x00c2fed0
00bfaf94	orr x8,x24,#0x1
00bfaf98	mov x23,x0
00bfaf9c	stp x22,x0,[sp, #0x10]
00bfafa0	str x8,[sp, #0x8]
00bfafa4	mov x0,x23
00bfafa8	mov x1,x21
00bfafac	mov x2,x22
00bfafb0	bl 0x00c2ffd0
00bfafb4	strb wzr,[x23, x22]
00bfafb8	add x1,sp,#0x8
00bfafbc	mov x0,x19
00bfafc0	mov x2,xzr
00bfafc4	bl 0x00bf52bc
00bfafc8	ldrb w8,[sp, #0x8]
00bfafcc	tbz w8,#0x0,0x00bfafe0
00bfafd0	ldr x8,[sp, #0x8]
00bfafd4	ldr x0,[sp, #0x18]
00bfafd8	and x1,x8,#-0x2
00bfafdc	bl 0x00c2fe80
00bfafe0	add x1,x19,#0x8
00bfafe4	mov w0,#0x1
00bfafe8	str x19,[x20]
00bfafec	bl 0x00c2bce0
00bfaff0	ldp x20,x19,[sp, #0x50]
00bfaff4	ldp x22,x21,[sp, #0x40]
00bfaff8	ldp x24,x23,[sp, #0x30]
00bfaffc	ldp x29,x30,[sp, #0x20]
00bfb000	add sp,sp,#0x60
00bfb004	autiasp
00bfb008	ret
00bfb00c	adrp x0,0x2c6000
00bfb010	add x0,x0,#0x9b4
00bfb014	bl 0x00c43d00
00bfb018	bl 0x007fe124
