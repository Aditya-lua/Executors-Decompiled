; std::__ndk1::__thread_struct::__make_ready_at_thread_exit @ 00bcd650
00bcd650	paciasp
00bcd654	stp x29,x30,[sp, #-0x40]!
00bcd658	stp x24,x23,[sp, #0x10]
00bcd65c	stp x22,x21,[sp, #0x20]
00bcd660	stp x20,x19,[sp, #0x30]
00bcd664	mov x29,sp
00bcd668	ldr x23,[x0]
00bcd66c	mov x19,x1
00bcd670	ldp x24,x8,[x23, #0x8]
00bcd674	cmp x24,x8
00bcd678	b.cs 0x00bcd684
00bcd67c	str x19,[x24], #0x8
00bcd680	b 0x00bcd700
00bcd684	ldr x10,[x23]
00bcd688	sub x22,x24,x10
00bcd68c	asr x9,x22,#0x3
00bcd690	add x9,x9,#0x1
00bcd694	lsr x11,x9,#0x3d
00bcd698	cbnz x11,0x00bcd728
00bcd69c	sub x8,x8,x10
00bcd6a0	orr x11,xzr,#0x7ffffffffffffff8
00bcd6a4	asr x10,x8,#0x2
00bcd6a8	cmp x10,x9
00bcd6ac	csel x9,x10,x9,hi
00bcd6b0	cmp x8,x11
00bcd6b4	mov x8,#0x1fffffffffffffff
00bcd6b8	csel x8,x9,x8,cc
00bcd6bc	lsl x21,x8,#0x3
00bcd6c0	mov x0,x21
00bcd6c4	bl 0x00c2fed0
00bcd6c8	ldp x20,x8,[x23]
00bcd6cc	add x24,x0,x22
00bcd6d0	add x21,x0,x21
00bcd6d4	sub x2,x8,x20
00bcd6d8	mov x1,x20
00bcd6dc	sub x22,x24,x2
00bcd6e0	str x19,[x24], #0x8
00bcd6e4	mov x0,x22
00bcd6e8	bl 0x00c2ffd0
00bcd6ec	stp x22,x24,[x23]
00bcd6f0	str x21,[x23, #0x10]
00bcd6f4	cbz x20,0x00bcd700
00bcd6f8	mov x0,x20
00bcd6fc	bl 0x00c301d0
00bcd700	add x1,x19,#0x8
00bcd704	mov w0,#0x1
00bcd708	str x24,[x23, #0x8]
00bcd70c	bl 0x00c2bce0
00bcd710	ldp x20,x19,[sp, #0x30]
00bcd714	ldp x22,x21,[sp, #0x20]
00bcd718	ldp x24,x23,[sp, #0x10]
00bcd71c	ldp x29,x30,[sp], #0x40
00bcd720	autiasp
00bcd724	ret
00bcd728	bl 0x00bcd744
