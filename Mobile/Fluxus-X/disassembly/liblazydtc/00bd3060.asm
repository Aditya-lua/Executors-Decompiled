; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::flush @ 00bd3060
00bd3060	paciasp
00bd3064	sub sp,sp,#0x30
00bd3068	stp x29,x30,[sp, #0x10]
00bd306c	stp x20,x19,[sp, #0x20]
00bd3070	add x29,sp,#0x10
00bd3074	ldr x8,[x0]
00bd3078	mov x19,x0
00bd307c	ldur x8,[x8, #-0x18]
00bd3080	add x8,x0,x8
00bd3084	ldr x8,[x8, #0x28]
00bd3088	cbz x8,0x00bd30e8
00bd308c	mov x0,sp
00bd3090	mov x1,x19
00bd3094	bl 0x00c44040
00bd3098	ldrb w8,[sp]
00bd309c	cmp w8,#0x1
00bd30a0	b.ne 0x00bd30e0
00bd30a4	ldr x8,[x19]
00bd30a8	ldur x8,[x8, #-0x18]
00bd30ac	add x8,x19,x8
00bd30b0	ldr x0,[x8, #0x28]
00bd30b4	ldr x8,[x0]
00bd30b8	ldr x8,[x8, #0x30]
00bd30bc	blr x8
00bd30c0	cmn w0,#0x1
00bd30c4	b.ne 0x00bd30e0
00bd30c8	ldr x8,[x19]
00bd30cc	ldur x8,[x8, #-0x18]
00bd30d0	add x0,x19,x8
00bd30d4	ldr w8,[x0, #0x20]
00bd30d8	orr w1,w8,#0x1
00bd30dc	bl 0x00c30130
00bd30e0	mov x0,sp
00bd30e4	bl 0x00c44050
00bd30e8	mov x0,x19
00bd30ec	ldp x20,x19,[sp, #0x20]
00bd30f0	ldp x29,x30,[sp, #0x10]
00bd30f4	add sp,sp,#0x30
00bd30f8	autiasp
00bd30fc	ret
