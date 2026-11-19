; std::__ndk1::random_device::operator() @ 00bcd868
00bcd868	paciasp
00bcd86c	stp x29,x30,[sp, #-0x30]!
00bcd870	str x21,[sp, #0x10]
00bcd874	stp x20,x19,[sp, #0x20]
00bcd878	mov x29,sp
00bcd87c	mov x19,x0
00bcd880	add x20,x29,#0x1c
00bcd884	mov w21,#0x4
00bcd888	b 0x00bcd8a0
00bcd88c	bl 0x00c30710
00bcd890	ldr w0,[x0]
00bcd894	cmp w0,#0x4
00bcd898	b.ne 0x00bcd8e0
00bcd89c	cbz x21,0x00bcd8c8
00bcd8a0	ldr w0,[x19]
00bcd8a4	mov x1,x20
00bcd8a8	mov x2,x21
00bcd8ac	bl 0x00c31ef0
00bcd8b0	cmn x0,#0x1
00bcd8b4	b.eq 0x00bcd88c
00bcd8b8	cbz x0,0x00bcd8ec
00bcd8bc	sub x21,x21,x0
00bcd8c0	add x20,x20,x0
00bcd8c4	cbnz x21,0x00bcd8a0
00bcd8c8	ldr w0,[x29, #0x1c]
00bcd8cc	ldp x20,x19,[sp, #0x20]
00bcd8d0	ldr x21,[sp, #0x10]
00bcd8d4	ldp x29,x30,[sp], #0x30
00bcd8d8	autiasp
00bcd8dc	ret
00bcd8e0	adrp x1,0x2cc000
00bcd8e4	add x1,x1,#0xa2d
00bcd8e8	bl 0x00c2ffc0
00bcd8ec	adrp x1,0x2b5000
00bcd8f0	add x1,x1,#0x37
00bcd8f4	mov w0,#0x2a
00bcd8f8	bl 0x00c2ffc0
