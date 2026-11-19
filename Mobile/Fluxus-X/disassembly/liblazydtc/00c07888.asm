; std::__ndk1::__time_get_storage<char>::__time_get_storage @ 00c07888
00c07888	paciasp
00c0788c	sub sp,sp,#0x60
00c07890	stp x29,x30,[sp, #0x30]
00c07894	str x21,[sp, #0x40]
00c07898	stp x20,x19,[sp, #0x50]
00c0789c	add x29,sp,#0x30
00c078a0	mov x20,x1
00c078a4	mov x19,x0
00c078a8	bl 0x00c44670
00c078ac	add x0,x19,#0x8
00c078b0	mov w1,wzr
00c078b4	mov w2,#0x420
00c078b8	bl 0x00c301c0
00c078bc	add x0,sp,#0x8
00c078c0	mov x1,x20
00c078c4	mov w2,#0x1
00c078c8	bl 0x00c444e0
00c078cc	adrp x8,0xcaf000
00c078d0	add x8,x8,#0xb10
00c078d4	str x8,[sp, #0x8]
00c078d8	add x1,sp,#0x8
00c078dc	mov x0,x19
00c078e0	bl 0x00c446b0
00c078e4	adrp x8,0xcb5000
00c078e8	ldr x8,[x8, #0xe20]
00c078ec	ldr x0,[sp, #0x28]
00c078f0	add x8,x8,#0x10
00c078f4	str x8,[sp, #0x8]
00c078f8	bl 0x00c43980
00c078fc	adrp x8,0xcb5000
00c07900	ldr x8,[x8, #0xe18]
00c07904	ldr x0,[sp, #0x18]
00c07908	add x8,x8,#0x10
00c0790c	str x8,[sp, #0x8]
00c07910	cbz x0,0x00c07924
00c07914	ldrb w8,[sp, #0x20]
00c07918	cmp w8,#0x1
00c0791c	b.ne 0x00c07924
00c07920	bl 0x00c333e0
00c07924	add x0,sp,#0x8
00c07928	bl 0x00c31530
00c0792c	ldp x20,x19,[sp, #0x50]
00c07930	ldr x21,[sp, #0x40]
00c07934	ldp x29,x30,[sp, #0x30]
00c07938	add sp,sp,#0x60
00c0793c	autiasp
00c07940	ret
