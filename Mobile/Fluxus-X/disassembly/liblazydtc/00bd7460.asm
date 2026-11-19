; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekp @ 00bd7460
00bd7460	paciasp
00bd7464	sub sp,sp,#0x40
00bd7468	stp x29,x30,[sp, #0x10]
00bd746c	str x21,[sp, #0x20]
00bd7470	stp x20,x19,[sp, #0x30]
00bd7474	add x29,sp,#0x10
00bd7478	mov x19,x0
00bd747c	mov x21,x1
00bd7480	mov x0,sp
00bd7484	mov x1,x19
00bd7488	mov w20,w2
00bd748c	bl 0x00c44040
00bd7490	ldr x8,[x19]
00bd7494	mov w10,#0x5
00bd7498	ldur x8,[x8, #-0x18]
00bd749c	add x8,x19,x8
00bd74a0	ldrb w9,[x8, #0x20]
00bd74a4	tst w9,w10
00bd74a8	b.ne 0x00bd74e8
00bd74ac	ldr x0,[x8, #0x28]
00bd74b0	ldr x8,[x0]
00bd74b4	ldr x8,[x8, #0x20]
00bd74b8	mov x1,x21
00bd74bc	mov w2,w20
00bd74c0	mov w3,#0x10
00bd74c4	blr x8
00bd74c8	cmn x1,#0x1
00bd74cc	b.ne 0x00bd74e8
00bd74d0	ldr x8,[x19]
00bd74d4	ldur x8,[x8, #-0x18]
00bd74d8	add x0,x19,x8
00bd74dc	ldr w8,[x0, #0x20]
00bd74e0	orr w1,w8,#0x4
00bd74e4	bl 0x00c30130
00bd74e8	mov x0,sp
00bd74ec	bl 0x00c44050
00bd74f0	mov x0,x19
00bd74f4	ldp x20,x19,[sp, #0x30]
00bd74f8	ldr x21,[sp, #0x20]
00bd74fc	ldp x29,x30,[sp, #0x10]
00bd7500	add sp,sp,#0x40
00bd7504	autiasp
00bd7508	ret
