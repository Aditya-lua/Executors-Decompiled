; std::__ndk1::__assoc_sub_state::set_exception @ 00bcc2d8
00bcc2d8	paciasp
00bcc2dc	sub sp,sp,#0x40
00bcc2e0	stp x29,x30,[sp, #0x10]
00bcc2e4	stp x22,x21,[sp, #0x20]
00bcc2e8	stp x20,x19,[sp, #0x30]
00bcc2ec	add x29,sp,#0x10
00bcc2f0	mov x19,x0
00bcc2f4	add x0,x0,#0x18
00bcc2f8	mov x20,x1
00bcc2fc	bl 0x00c2ff10
00bcc300	ldrb w8,[x19, #0x70]
00bcc304	tbnz w8,#0x0,0x00bcc360
00bcc308	mov x21,x19
00bcc30c	add x0,sp,#0x8
00bcc310	str xzr,[sp, #0x8]
00bcc314	ldr x22,[x21, #0x10]!
00bcc318	bl 0x00c31450
00bcc31c	cbnz x22,0x00bcc360
00bcc320	mov x0,x21
00bcc324	mov x1,x20
00bcc328	bl 0x00c43c40
00bcc32c	ldr w8,[x19, #0x70]
00bcc330	add x0,x19,#0x40
00bcc334	orr w8,w8,#0x4
00bcc338	str w8,[x19, #0x70]
00bcc33c	bl 0x00c315e0
00bcc340	add x0,x19,#0x18
00bcc344	bl 0x00c2ff20
00bcc348	ldp x20,x19,[sp, #0x30]
00bcc34c	ldp x22,x21,[sp, #0x20]
00bcc350	ldp x29,x30,[sp, #0x10]
00bcc354	add sp,sp,#0x40
00bcc358	autiasp
00bcc35c	ret
00bcc360	mov w0,#0x2
00bcc364	bl 0x00bcc1b4
