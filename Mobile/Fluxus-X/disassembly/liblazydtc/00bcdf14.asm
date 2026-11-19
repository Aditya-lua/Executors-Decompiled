; std::__ndk1::ios_base::~ios_base @ 00bcdf14
00bcdf14	paciasp
00bcdf18	stp x29,x30,[sp, #-0x30]!
00bcdf1c	str x21,[sp, #0x10]
00bcdf20	stp x20,x19,[sp, #0x20]
00bcdf24	mov x29,sp
00bcdf28	adrp x8,0xcb5000
00bcdf2c	mov x20,x0
00bcdf30	ldr x8,[x8, #0xb48]
00bcdf34	ldr x9,[x20, #0x30]!
00bcdf38	add x8,x8,#0x10
00bcdf3c	str x8,[x0]
00bcdf40	cbz x9,0x00bcdfb0
00bcdf44	ldr x8,[x0, #0x48]
00bcdf48	mov x19,x0
00bcdf4c	cbz x8,0x00bcdf78
00bcdf50	sub x21,x8,#0x1
00bcdf54	ldp x8,x9,[x19, #0x38]
00bcdf58	ldr x8,[x8, x21, LSL #0x3]
00bcdf5c	ldr w2,[x9, x21, LSL #0x2]
00bcdf60	mov w0,wzr
00bcdf64	mov x1,x19
00bcdf68	blr x8
00bcdf6c	sub x21,x21,#0x1
00bcdf70	cmn x21,#0x1
00bcdf74	b.ne 0x00bcdf54
00bcdf78	mov x0,x20
00bcdf7c	bl 0x00c30090
00bcdf80	ldr x0,[x19, #0x38]
00bcdf84	bl 0x00c30960
00bcdf88	ldr x0,[x19, #0x40]
00bcdf8c	bl 0x00c30960
00bcdf90	ldr x0,[x19, #0x58]
00bcdf94	bl 0x00c30960
00bcdf98	ldr x0,[x19, #0x70]
00bcdf9c	ldp x20,x19,[sp, #0x20]
00bcdfa0	ldr x21,[sp, #0x10]
00bcdfa4	ldp x29,x30,[sp], #0x30
00bcdfa8	autiasp
00bcdfac	b 0x00c30960
00bcdfb0	ldp x20,x19,[sp, #0x20]
00bcdfb4	ldr x21,[sp, #0x10]
00bcdfb8	ldp x29,x30,[sp], #0x30
00bcdfbc	autiasp
00bcdfc0	ret
