; std::__ndk1::__time_put::__time_put @ 00c084f8
00c084f8	paciasp
00c084fc	sub sp,sp,#0x40
00c08500	stp x29,x30,[sp, #0x20]
00c08504	stp x20,x19,[sp, #0x30]
00c08508	add x29,sp,#0x20
00c0850c	ldrb w8,[x1]
00c08510	ldr x9,[x1, #0x10]
00c08514	mov x19,x1
00c08518	mov x20,x0
00c0851c	mov w0,#0x1fbf
00c08520	mov x2,xzr
00c08524	tst w8,#0x1
00c08528	csinc x1,x9,x1,ne
00c0852c	bl 0x00c43890
00c08530	str x0,[x20]
00c08534	cbz x0,0x00c0854c
00c08538	ldp x20,x19,[sp, #0x30]
00c0853c	ldp x29,x30,[sp, #0x20]
00c08540	add sp,sp,#0x40
00c08544	autiasp
00c08548	ret
00c0854c	adrp x0,0x2c0000
00c08550	add x0,x0,#0xc67
00c08554	add x8,sp,#0x8
00c08558	mov x1,x19
00c0855c	add x19,sp,#0x8
00c08560	bl 0x00c304a0
00c08564	ldrb w8,[sp, #0x8]
00c08568	ldr x9,[sp, #0x18]
00c0856c	tst w8,#0x1
00c08570	csinc x0,x9,x19,ne
00c08574	bl 0x00c43d00
00c08578	ldrb w8,[sp, #0x8]
00c0857c	mov x19,x0
00c08580	tbz w8,#0x0,0x00c08594
00c08584	ldr x8,[sp, #0x8]
00c08588	ldr x0,[sp, #0x18]
00c0858c	and x1,x8,#-0x2
00c08590	bl 0x00c2fe80
00c08594	mov x0,x19
00c08598	bl 0x00c2c090
