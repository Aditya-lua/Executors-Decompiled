; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::codecvt @ 00bfe030
00bfe030	paciasp
00bfe034	sub sp,sp,#0x50
00bfe038	stp x29,x30,[sp, #0x30]
00bfe03c	stp x20,x19,[sp, #0x40]
00bfe040	add x29,sp,#0x30
00bfe044	adrp x8,0xcb5000
00bfe048	mov x20,x1
00bfe04c	mov x19,x0
00bfe050	ldr x8,[x8, #0xe30]
00bfe054	sub x9,x2,#0x1
00bfe058	add x8,x8,#0x10
00bfe05c	stp x8,x9,[x0]
00bfe060	mov w0,#0x1fbf
00bfe064	mov x2,xzr
00bfe068	bl 0x00c43890
00bfe06c	str x0,[x19, #0x10]
00bfe070	cbz x0,0x00bfe088
00bfe074	ldp x20,x19,[sp, #0x40]
00bfe078	ldp x29,x30,[sp, #0x30]
00bfe07c	add sp,sp,#0x50
00bfe080	autiasp
00bfe084	ret
00bfe088	mov x0,sp
00bfe08c	mov x1,x20
00bfe090	bl 0x00852d7c
00bfe094	adrp x0,0x2b5000
00bfe098	add x0,x0,#0x57
00bfe09c	add x8,sp,#0x18
00bfe0a0	mov x1,sp
00bfe0a4	add x20,sp,#0x18
00bfe0a8	bl 0x00bfb964
00bfe0ac	ldrb w8,[sp, #0x18]
00bfe0b0	ldr x9,[sp, #0x28]
00bfe0b4	tst w8,#0x1
00bfe0b8	csinc x0,x9,x20,ne
00bfe0bc	bl 0x00c43d00
00bfe0c0	ldrb w8,[sp, #0x18]
00bfe0c4	mov x20,x0
00bfe0c8	tbz w8,#0x0,0x00bfe0e4
00bfe0cc	ldr x8,[sp, #0x18]
00bfe0d0	ldr x0,[sp, #0x28]
00bfe0d4	and x1,x8,#-0x2
00bfe0d8	bl 0x00c2fe80
00bfe0dc	b 0x00bfe0e4
00bfe0e4	ldrb w8,[sp]
00bfe0e8	tbz w8,#0x0,0x00bfe108
00bfe0ec	ldr x8,[sp]
00bfe0f0	ldr x0,[sp, #0x10]
00bfe0f4	and x1,x8,#-0x2
00bfe0f8	bl 0x00c2fe80
00bfe0fc	b 0x00bfe108
00bfe108	mov x0,x19
00bfe10c	bl 0x00c31530
00bfe110	mov x0,x20
00bfe114	bl 0x00c2c090
