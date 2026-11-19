; std::__ndk1::recursive_mutex::recursive_mutex @ 00bccca8
00bccca8	paciasp
00bcccac	sub sp,sp,#0x30
00bcccb0	stp x29,x30,[sp, #0x10]
00bcccb4	stp x20,x19,[sp, #0x20]
00bcccb8	add x29,sp,#0x10
00bcccbc	mov x19,x0
00bcccc0	add x0,sp,#0x8
00bcccc4	bl 0x00c438c0
00bcccc8	cbnz w0,0x00bccd10
00bccccc	add x0,sp,#0x8
00bcccd0	mov w1,#0x1
00bcccd4	bl 0x00c438e0
00bcccd8	cbnz w0,0x00bccd18
00bcccdc	add x1,sp,#0x8
00bccce0	mov x0,x19
00bccce4	bl 0x00c31c90
00bccce8	mov w20,w0
00bcccec	add x0,sp,#0x8
00bcccf0	bl 0x00c438f0
00bcccf4	cbnz w20,0x00bccd28
00bcccf8	cbnz w0,0x00bccd30
00bcccfc	ldp x20,x19,[sp, #0x20]
00bccd00	ldp x29,x30,[sp, #0x10]
00bccd04	add sp,sp,#0x30
00bccd08	autiasp
00bccd0c	ret
00bccd10	str w0,[sp, #0x4]
00bccd14	b 0x00bccd3c
00bccd18	str w0,[sp, #0x4]
00bccd1c	add x0,sp,#0x8
00bccd20	bl 0x00c438f0
00bccd24	b 0x00bccd3c
00bccd28	str w20,[sp, #0x4]
00bccd2c	b 0x00bccd3c
00bccd30	str w0,[sp, #0x4]
00bccd34	mov x0,x19
00bccd38	bl 0x00c31c80
00bccd3c	ldr w0,[sp, #0x4]
00bccd40	adrp x1,0x2ae000
00bccd44	add x1,x1,#0xdac
00bccd48	bl 0x00c2ffc0
