; std::__ndk1::random_device::random_device @ 00bcd798
00bcd798	paciasp
00bcd79c	sub sp,sp,#0x40
00bcd7a0	stp x29,x30,[sp, #0x20]
00bcd7a4	stp x20,x19,[sp, #0x30]
00bcd7a8	add x29,sp,#0x20
00bcd7ac	ldrb w8,[x1]
00bcd7b0	ldr x9,[x1, #0x10]
00bcd7b4	mov x19,x1
00bcd7b8	mov x20,x0
00bcd7bc	tst w8,#0x1
00bcd7c0	csinc x0,x9,x1,ne
00bcd7c4	mov w1,wzr
00bcd7c8	bl 0x00c31d80
00bcd7cc	str w0,[x20]
00bcd7d0	tbnz w0,#0x1f,0x00bcd7e8
00bcd7d4	ldp x20,x19,[sp, #0x30]
00bcd7d8	ldp x29,x30,[sp, #0x20]
00bcd7dc	add sp,sp,#0x40
00bcd7e0	autiasp
00bcd7e4	ret
00bcd7e8	bl 0x00c30710
00bcd7ec	ldr w20,[x0]
00bcd7f0	adrp x0,0x2c4000
00bcd7f4	add x0,x0,#0x97e
00bcd7f8	add x8,sp,#0x8
00bcd7fc	mov x1,x19
00bcd800	add x19,sp,#0x8
00bcd804	bl 0x00c304a0
00bcd808	ldrb w8,[sp, #0x8]
00bcd80c	ldr x9,[sp, #0x18]
00bcd810	tst w8,#0x1
00bcd814	csinc x1,x9,x19,ne
00bcd818	mov w0,w20
00bcd81c	bl 0x00c2ffc0
