; std::__ndk1::__assoc_sub_state::__sub_wait @ 00bcc550
00bcc550	paciasp
00bcc554	stp x29,x30,[sp, #-0x20]!
00bcc558	stp x20,x19,[sp, #0x10]
00bcc55c	mov x29,sp
00bcc560	ldr w8,[x0, #0x70]
00bcc564	tbnz w8,#0x2,0x00bcc588
00bcc568	mov x19,x0
00bcc56c	mov x20,x1
00bcc570	tbnz w8,#0x3,0x00bcc598
00bcc574	add x0,x19,#0x40
00bcc578	mov x1,x20
00bcc57c	bl 0x00c33250
00bcc580	ldrb w8,[x19, #0x70]
00bcc584	tbz w8,#0x2,0x00bcc574
00bcc588	ldp x20,x19,[sp, #0x10]
00bcc58c	ldp x29,x30,[sp], #0x20
00bcc590	autiasp
00bcc594	ret
00bcc598	ldrb w9,[x20, #0x8]
00bcc59c	and w8,w8,#0xfffffff3
00bcc5a0	str w8,[x19, #0x70]
00bcc5a4	tbz w9,#0x0,0x00bcc5d0
00bcc5a8	ldr x0,[x20]
00bcc5ac	bl 0x00c2ff20
00bcc5b0	ldr x8,[x19]
00bcc5b4	strb wzr,[x20, #0x8]
00bcc5b8	ldr x16,[x8, #0x18]
00bcc5bc	mov x0,x19
00bcc5c0	ldp x20,x19,[sp, #0x10]
00bcc5c4	ldp x29,x30,[sp], #0x20
00bcc5c8	autiasp
00bcc5cc	br x16
00bcc5d0	adrp x1,0x2d6000
00bcc5d4	add x1,x1,#0xdf8
00bcc5d8	mov w0,#0x1
00bcc5dc	bl 0x00c2ffc0
