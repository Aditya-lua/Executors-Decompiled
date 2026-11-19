; std::__ndk1::__time_get_storage<wchar_t>::__time_get_storage @ 00c07cdc
00c07cdc	paciasp
00c07ce0	sub sp,sp,#0x40
00c07ce4	stp x29,x30,[sp, #0x20]
00c07ce8	stp x20,x19,[sp, #0x30]
00c07cec	add x29,sp,#0x20
00c07cf0	mov x20,x1
00c07cf4	mov x19,x0
00c07cf8	bl 0x00c44670
00c07cfc	add x0,x19,#0x8
00c07d00	mov w1,wzr
00c07d04	mov w2,#0x420
00c07d08	bl 0x00c301c0
00c07d0c	add x0,sp,#0x8
00c07d10	mov x1,x20
00c07d14	mov w2,#0x1
00c07d18	bl 0x00c44520
00c07d1c	adrp x8,0xcaf000
00c07d20	add x8,x8,#0xb90
00c07d24	str x8,[sp, #0x8]
00c07d28	add x1,sp,#0x8
00c07d2c	mov x0,x19
00c07d30	bl 0x00c446c0
00c07d34	adrp x8,0xcb5000
00c07d38	ldr x8,[x8, #0xe28]
00c07d3c	ldr x0,[sp, #0x18]
00c07d40	add x8,x8,#0x10
00c07d44	str x8,[sp, #0x8]
00c07d48	bl 0x00c43980
00c07d4c	add x0,sp,#0x8
00c07d50	bl 0x00c44510
00c07d54	ldp x20,x19,[sp, #0x30]
00c07d58	ldp x29,x30,[sp, #0x20]
00c07d5c	add sp,sp,#0x40
00c07d60	autiasp
00c07d64	ret
