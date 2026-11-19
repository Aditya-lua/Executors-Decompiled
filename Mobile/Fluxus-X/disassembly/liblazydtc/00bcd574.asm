; std::__ndk1::__thread_struct::notify_all_at_thread_exit @ 00bcd574
00bcd574	paciasp
00bcd578	stp x29,x30,[sp, #-0x40]!
00bcd57c	stp x24,x23,[sp, #0x10]
00bcd580	stp x22,x21,[sp, #0x20]
00bcd584	stp x20,x19,[sp, #0x30]
00bcd588	mov x29,sp
00bcd58c	ldr x23,[x0]
00bcd590	mov x19,x2
00bcd594	mov x20,x1
00bcd598	ldp x9,x8,[x23, #0x20]
00bcd59c	cmp x9,x8
00bcd5a0	b.cs 0x00bcd5b0
00bcd5a4	stp x20,x19,[x9]
00bcd5a8	add x20,x9,#0x10
00bcd5ac	b 0x00bcd630
00bcd5b0	ldr x10,[x23, #0x18]
00bcd5b4	sub x24,x9,x10
00bcd5b8	asr x9,x24,#0x4
00bcd5bc	add x9,x9,#0x1
00bcd5c0	lsr x11,x9,#0x3c
00bcd5c4	cbnz x11,0x00bcd64c
00bcd5c8	sub x8,x8,x10
00bcd5cc	orr x11,xzr,#0x7ffffffffffffff0
00bcd5d0	asr x10,x8,#0x3
00bcd5d4	cmp x10,x9
00bcd5d8	csel x9,x10,x9,hi
00bcd5dc	cmp x8,x11
00bcd5e0	mov x8,#0xfffffffffffffff
00bcd5e4	csel x8,x9,x8,cc
00bcd5e8	lsl x22,x8,#0x4
00bcd5ec	mov x0,x22
00bcd5f0	bl 0x00c2fed0
00bcd5f4	ldp x21,x8,[x23, #0x18]
00bcd5f8	add x9,x0,x24
00bcd5fc	stp x20,x19,[x9]
00bcd600	add x22,x0,x22
00bcd604	add x20,x9,#0x10
00bcd608	sub x2,x8,x21
00bcd60c	mov x1,x21
00bcd610	sub x19,x9,x2
00bcd614	mov x0,x19
00bcd618	bl 0x00c2ffd0
00bcd61c	stp x19,x20,[x23, #0x18]
00bcd620	str x22,[x23, #0x28]
00bcd624	cbz x21,0x00bcd630
00bcd628	mov x0,x21
00bcd62c	bl 0x00c301d0
00bcd630	str x20,[x23, #0x20]
00bcd634	ldp x20,x19,[sp, #0x30]
00bcd638	ldp x22,x21,[sp, #0x20]
00bcd63c	ldp x24,x23,[sp, #0x10]
00bcd640	ldp x29,x30,[sp], #0x40
00bcd644	autiasp
00bcd648	ret
00bcd64c	bl 0x00bcd72c
