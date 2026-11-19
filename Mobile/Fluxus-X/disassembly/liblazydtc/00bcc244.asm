; std::__ndk1::__assoc_sub_state::set_value_at_thread_exit @ 00bcc244
00bcc244	paciasp
00bcc248	sub sp,sp,#0x30
00bcc24c	stp x29,x30,[sp, #0x10]
00bcc250	stp x20,x19,[sp, #0x20]
00bcc254	add x29,sp,#0x10
00bcc258	mov x19,x0
00bcc25c	add x0,x0,#0x18
00bcc260	bl 0x00c2ff10
00bcc264	ldrb w8,[x19, #0x70]
00bcc268	tbnz w8,#0x0,0x00bcc2bc
00bcc26c	ldr x20,[x19, #0x10]
00bcc270	add x0,sp,#0x8
00bcc274	str xzr,[sp, #0x8]
00bcc278	bl 0x00c31450
00bcc27c	cbnz x20,0x00bcc2bc
00bcc280	ldr w8,[x19, #0x70]
00bcc284	orr w8,w8,#0x1
00bcc288	str w8,[x19, #0x70]
00bcc28c	bl 0x00c30180
00bcc290	ldr w0,[x0]
00bcc294	bl 0x00c3ece0
00bcc298	mov x1,x19
00bcc29c	bl 0x00c43e80
00bcc2a0	add x0,x19,#0x18
00bcc2a4	bl 0x00c2ff20
00bcc2a8	ldp x20,x19,[sp, #0x20]
00bcc2ac	ldp x29,x30,[sp, #0x10]
00bcc2b0	add sp,sp,#0x30
00bcc2b4	autiasp
00bcc2b8	ret
00bcc2bc	mov w0,#0x2
00bcc2c0	bl 0x00bcc1b4
