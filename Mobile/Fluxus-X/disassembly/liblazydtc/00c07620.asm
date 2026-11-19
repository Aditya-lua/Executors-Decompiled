; std::__ndk1::__time_get_storage<char>::__time_get_storage @ 00c07620
00c07620	paciasp
00c07624	sub sp,sp,#0x60
00c07628	stp x29,x30,[sp, #0x30]
00c0762c	str x21,[sp, #0x40]
00c07630	stp x20,x19,[sp, #0x50]
00c07634	add x29,sp,#0x30
00c07638	mov x20,x1
00c0763c	mov x19,x0
00c07640	bl 0x00c44660
00c07644	add x0,x19,#0x8
00c07648	mov w1,wzr
00c0764c	mov w2,#0x420
00c07650	bl 0x00c301c0
00c07654	add x0,sp,#0x8
00c07658	mov x1,x20
00c0765c	mov w2,#0x1
00c07660	bl 0x00c444d0
00c07664	adrp x8,0xcaf000
00c07668	add x8,x8,#0xb10
00c0766c	str x8,[sp, #0x8]
00c07670	add x1,sp,#0x8
00c07674	mov x0,x19
00c07678	bl 0x00c446b0
00c0767c	adrp x8,0xcb5000
00c07680	ldr x8,[x8, #0xe20]
00c07684	ldr x0,[sp, #0x28]
00c07688	add x8,x8,#0x10
00c0768c	str x8,[sp, #0x8]
00c07690	bl 0x00c43980
00c07694	adrp x8,0xcb5000
00c07698	ldr x8,[x8, #0xe18]
00c0769c	ldr x0,[sp, #0x18]
00c076a0	add x8,x8,#0x10
00c076a4	str x8,[sp, #0x8]
00c076a8	cbz x0,0x00c076bc
00c076ac	ldrb w8,[sp, #0x20]
00c076b0	cmp w8,#0x1
00c076b4	b.ne 0x00c076bc
00c076b8	bl 0x00c333e0
00c076bc	add x0,sp,#0x8
00c076c0	bl 0x00c31530
00c076c4	ldp x20,x19,[sp, #0x50]
00c076c8	ldr x21,[sp, #0x40]
00c076cc	ldp x29,x30,[sp, #0x30]
00c076d0	add sp,sp,#0x60
00c076d4	autiasp
00c076d8	ret
