; std::__ndk1::future_error::future_error @ 00bcc044
00bcc044	paciasp
00bcc048	sub sp,sp,#0x50
00bcc04c	stp x29,x30,[sp, #0x30]
00bcc050	str x19,[sp, #0x40]
00bcc054	add x29,sp,#0x30
00bcc058	mov x19,x0
00bcc05c	add x8,sp,#0x8
00bcc060	sub x0,x29,#0x10
00bcc064	stp x1,x2,[x29, #-0x10]
00bcc068	bl 0x00c43dd0
00bcc06c	add x1,sp,#0x8
00bcc070	mov x0,x19
00bcc074	bl 0x00c30d20
00bcc078	ldrb w8,[sp, #0x8]
00bcc07c	tbz w8,#0x0,0x00bcc090
00bcc080	ldr x8,[sp, #0x8]
00bcc084	ldr x0,[sp, #0x18]
00bcc088	and x1,x8,#-0x2
00bcc08c	bl 0x00c2fe80
00bcc090	adrp x8,0xcb4000
00bcc094	ldr x8,[x8, #0xd38]
00bcc098	ldur q0,[x29, #-0x10]
00bcc09c	add x8,x8,#0x10
00bcc0a0	str x8,[x19]
00bcc0a4	str q0,[x19, #0x10]
00bcc0a8	ldp x29,x30,[sp, #0x30]
00bcc0ac	ldr x19,[sp, #0x40]
00bcc0b0	add sp,sp,#0x50
00bcc0b4	autiasp
00bcc0b8	ret
