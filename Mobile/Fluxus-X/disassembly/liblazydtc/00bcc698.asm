; std::__ndk1::future<void>::future @ 00bcc698
00bcc698	paciasp
00bcc69c	stp x29,x30,[sp, #-0x20]!
00bcc6a0	stp x20,x19,[sp, #0x10]
00bcc6a4	mov x29,sp
00bcc6a8	str x1,[x0]
00bcc6ac	add x0,x1,#0x18
00bcc6b0	mov x19,x1
00bcc6b4	bl 0x00c2ff10
00bcc6b8	ldr w20,[x19, #0x70]
00bcc6bc	tbnz w20,#0x1,0x00bcc6e8
00bcc6c0	add x1,x19,#0x8
00bcc6c4	mov w0,#0x1
00bcc6c8	bl 0x00c2bce0
00bcc6cc	orr w8,w20,#0x2
00bcc6d0	add x0,x19,#0x18
00bcc6d4	str w8,[x19, #0x70]
00bcc6d8	ldp x20,x19,[sp, #0x10]
00bcc6dc	ldp x29,x30,[sp], #0x20
00bcc6e0	autiasp
00bcc6e4	b 0x00c2ff20
00bcc6e8	mov w0,#0x1
00bcc6ec	bl 0x00bcc1b4
