; std::__ndk1::chrono::system_clock::now @ 00bc24ac
00bc24ac	paciasp
00bc24b0	sub sp,sp,#0x20
00bc24b4	stp x29,x30,[sp, #0x10]
00bc24b8	add x29,sp,#0x10
00bc24bc	mov x1,sp
00bc24c0	mov w0,wzr
00bc24c4	bl 0x00c308e0
00bc24c8	cbnz w0,0x00bc250c
00bc24cc	mov x9,#0xf7cf
00bc24d0	ldr x8,[sp, #0x8]
00bc24d4	mov w11,#0x4240
00bc24d8	movk x9,#0xe353, LSL #16
00bc24dc	movk w11,#0xf, LSL #16
00bc24e0	movk x9,#0x9ba5, LSL #32
00bc24e4	movk x9,#0x20c4, LSL #48
00bc24e8	smulh x8,x8,x9
00bc24ec	ldr x9,[sp]
00bc24f0	asr x10,x8,#0x7
00bc24f4	add x8,x10,x8, LSR #0x3f
00bc24f8	madd x0,x9,x11,x8
00bc24fc	ldp x29,x30,[sp, #0x10]
00bc2500	add sp,sp,#0x20
00bc2504	autiasp
00bc2508	ret
00bc250c	bl 0x00c30710
00bc2510	ldr w0,[x0]
00bc2514	adrp x1,0x2c4000
00bc2518	add x1,x1,#0x959
00bc251c	bl 0x00c2ffc0
