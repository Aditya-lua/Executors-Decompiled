; std::nested_exception::rethrow_nested @ 00bc2714
00bc2714	paciasp
00bc2718	sub sp,sp,#0x30
00bc271c	stp x29,x30,[sp, #0x10]
00bc2720	stp x20,x19,[sp, #0x20]
00bc2724	add x29,sp,#0x10
00bc2728	mov x19,x0
00bc272c	add x0,sp,#0x8
00bc2730	str xzr,[sp, #0x8]
00bc2734	ldr x20,[x19, #0x8]!
00bc2738	bl 0x00c31450
00bc273c	cbnz x20,0x00bc2744
00bc2740	bl 0x00c2fff0
00bc2744	mov x0,sp
00bc2748	mov x1,x19
00bc274c	bl 0x00c31440
00bc2750	mov x0,sp
00bc2754	bl 0x00c43c80
00bc2758	mov x19,x0
00bc275c	mov x0,sp
00bc2760	bl 0x00c31450
00bc2764	mov x0,x19
00bc2768	bl 0x00c2c090
