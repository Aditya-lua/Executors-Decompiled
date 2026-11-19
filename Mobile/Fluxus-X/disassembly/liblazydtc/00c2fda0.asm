; operator.new @ 00c2fda0
00c2fda0	paciasp
00c2fda4	sub sp,sp,#0x30
00c2fda8	stp x29,x30,[sp, #0x10]
00c2fdac	stp x20,x19,[sp, #0x20]
00c2fdb0	add x29,sp,#0x10
00c2fdb4	cmp x0,#0x1
00c2fdb8	mov w8,#0x8
00c2fdbc	csinc x19,x0,xzr,hi
00c2fdc0	cmp x1,#0x8
00c2fdc4	csel x20,x1,x8,hi
00c2fdc8	add x0,sp,#0x8
00c2fdcc	mov x1,x20
00c2fdd0	mov x2,x19
00c2fdd4	str xzr,[sp, #0x8]
00c2fdd8	bl 0x00c437f0
00c2fddc	ldr x0,[sp, #0x8]
00c2fde0	cbnz x0,0x00c2fdf4
00c2fde4	bl 0x00c44760
00c2fde8	cbz x0,0x00c2fe08
00c2fdec	blr x0
00c2fdf0	b 0x00c2fdc8
00c2fdf4	ldp x20,x19,[sp, #0x20]
00c2fdf8	ldp x29,x30,[sp, #0x10]
00c2fdfc	add sp,sp,#0x30
00c2fe00	autiasp
00c2fe04	ret
00c2fe08	mov w0,#0x8
00c2fe0c	bl 0x00c30000
00c2fe10	mov x19,x0
00c2fe14	bl 0x00c43f60
00c2fe18	adrp x1,0xcb5000
00c2fe1c	adrp x2,0xcb5000
00c2fe20	mov x0,x19
00c2fe24	ldr x1,[x1, #0xb58]
00c2fe28	ldr x2,[x2, #0xb60]
00c2fe2c	bl 0x00c30020
