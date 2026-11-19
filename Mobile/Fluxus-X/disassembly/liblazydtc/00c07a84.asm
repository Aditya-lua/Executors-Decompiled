; std::__ndk1::__time_get_storage<wchar_t>::__time_get_storage @ 00c07a84
00c07a84	paciasp
00c07a88	sub sp,sp,#0x40
00c07a8c	stp x29,x30,[sp, #0x20]
00c07a90	stp x20,x19,[sp, #0x30]
00c07a94	add x29,sp,#0x20
00c07a98	mov x20,x1
00c07a9c	mov x19,x0
00c07aa0	bl 0x00c44660
00c07aa4	add x0,x19,#0x8
00c07aa8	mov w1,wzr
00c07aac	mov w2,#0x420
00c07ab0	bl 0x00c301c0
00c07ab4	add x0,sp,#0x8
00c07ab8	mov x1,x20
00c07abc	mov w2,#0x1
00c07ac0	bl 0x00c44500
00c07ac4	adrp x8,0xcaf000
00c07ac8	add x8,x8,#0xb90
00c07acc	str x8,[sp, #0x8]
00c07ad0	add x1,sp,#0x8
00c07ad4	mov x0,x19
00c07ad8	bl 0x00c446c0
00c07adc	adrp x8,0xcb5000
00c07ae0	ldr x8,[x8, #0xe28]
00c07ae4	ldr x0,[sp, #0x18]
00c07ae8	add x8,x8,#0x10
00c07aec	str x8,[sp, #0x8]
00c07af0	bl 0x00c43980
00c07af4	add x0,sp,#0x8
00c07af8	bl 0x00c44510
00c07afc	ldp x20,x19,[sp, #0x30]
00c07b00	ldp x29,x30,[sp, #0x20]
00c07b04	add sp,sp,#0x40
00c07b08	autiasp
00c07b0c	ret
