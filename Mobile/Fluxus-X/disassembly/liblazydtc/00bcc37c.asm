; std::__ndk1::__assoc_sub_state::set_exception_at_thread_exit @ 00bcc37c
00bcc37c	paciasp
00bcc380	sub sp,sp,#0x40
00bcc384	stp x29,x30,[sp, #0x10]
00bcc388	stp x22,x21,[sp, #0x20]
00bcc38c	stp x20,x19,[sp, #0x30]
00bcc390	add x29,sp,#0x10
00bcc394	mov x19,x0
00bcc398	add x0,x0,#0x18
00bcc39c	mov x20,x1
00bcc3a0	bl 0x00c2ff10
00bcc3a4	ldrb w8,[x19, #0x70]
00bcc3a8	tbnz w8,#0x0,0x00bcc404
00bcc3ac	mov x21,x19
00bcc3b0	add x0,sp,#0x8
00bcc3b4	str xzr,[sp, #0x8]
00bcc3b8	ldr x22,[x21, #0x10]!
00bcc3bc	bl 0x00c31450
00bcc3c0	cbnz x22,0x00bcc404
00bcc3c4	mov x0,x21
00bcc3c8	mov x1,x20
00bcc3cc	bl 0x00c43c40
00bcc3d0	bl 0x00c30180
00bcc3d4	ldr w0,[x0]
00bcc3d8	bl 0x00c3ece0
00bcc3dc	mov x1,x19
00bcc3e0	bl 0x00c43e80
00bcc3e4	add x0,x19,#0x18
00bcc3e8	bl 0x00c2ff20
00bcc3ec	ldp x20,x19,[sp, #0x30]
00bcc3f0	ldp x22,x21,[sp, #0x20]
00bcc3f4	ldp x29,x30,[sp, #0x10]
00bcc3f8	add sp,sp,#0x40
00bcc3fc	autiasp
00bcc400	ret
00bcc404	mov w0,#0x2
00bcc408	bl 0x00bcc1b4
