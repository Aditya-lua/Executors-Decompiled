; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::__get_minute @ 00beb9f0
00beb9f0	paciasp
00beb9f4	stp x29,x30,[sp, #-0x20]!
00beb9f8	stp x20,x19,[sp, #0x10]
00beb9fc	mov x29,sp
00beba00	mov x19,x4
00beba04	mov x0,x2
00beba08	mov x20,x1
00beba0c	mov x1,x3
00beba10	mov x2,x4
00beba14	mov x3,x5
00beba18	mov w4,#0x2
00beba1c	bl 0x00bec028
00beba20	ldr w8,[x19]
00beba24	cmp w0,#0x3b
00beba28	b.gt 0x00beba38
00beba2c	tbnz w8,#0x2,0x00beba38
00beba30	str w0,[x20]
00beba34	b 0x00beba40
00beba38	orr w8,w8,#0x4
00beba3c	str w8,[x19]
00beba40	ldp x20,x19,[sp, #0x10]
00beba44	ldp x29,x30,[sp], #0x20
00beba48	autiasp
00beba4c	ret
