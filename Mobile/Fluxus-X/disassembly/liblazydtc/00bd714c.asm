; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::put @ 00bd714c
00bd714c	paciasp
00bd7150	sub sp,sp,#0x30
00bd7154	stp x29,x30,[sp, #0x10]
00bd7158	stp x20,x19,[sp, #0x20]
00bd715c	add x29,sp,#0x10
00bd7160	mov w20,w1
00bd7164	mov x19,x0
00bd7168	mov x0,sp
00bd716c	mov x1,x19
00bd7170	bl 0x00c44040
00bd7174	ldrb w8,[sp]
00bd7178	cmp w8,#0x1
00bd717c	b.ne 0x00bd71e8
00bd7180	ldr x8,[x19]
00bd7184	ldur x8,[x8, #-0x18]
00bd7188	add x9,x19,x8
00bd718c	ldr x0,[x9, #0x28]
00bd7190	cbz x0,0x00bd71d8
00bd7194	ldp x8,x9,[x0, #0x30]
00bd7198	cmp x8,x9
00bd719c	b.eq 0x00bd71b4
00bd71a0	str w20,[x8], #0x4
00bd71a4	str x8,[x0, #0x30]
00bd71a8	cmn w20,#0x1
00bd71ac	b.ne 0x00bd71e8
00bd71b0	b 0x00bd71d0
00bd71b4	ldr x8,[x0]
00bd71b8	ldr x8,[x8, #0x68]
00bd71bc	mov w1,w20
00bd71c0	blr x8
00bd71c4	mov w20,w0
00bd71c8	cmn w20,#0x1
00bd71cc	b.ne 0x00bd71e8
00bd71d0	ldr x8,[x19]
00bd71d4	ldur x8,[x8, #-0x18]
00bd71d8	add x0,x19,x8
00bd71dc	ldr w8,[x0, #0x20]
00bd71e0	orr w1,w8,#0x1
00bd71e4	bl 0x00c30130
00bd71e8	mov x0,sp
00bd71ec	bl 0x00c44050
00bd71f0	mov x0,x19
00bd71f4	ldp x20,x19,[sp, #0x20]
00bd71f8	ldp x29,x30,[sp, #0x10]
00bd71fc	add sp,sp,#0x30
00bd7200	autiasp
00bd7204	ret
