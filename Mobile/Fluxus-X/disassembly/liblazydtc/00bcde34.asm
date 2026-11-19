; std::__ndk1::ios_base::register_callback @ 00bcde34
00bcde34	paciasp
00bcde38	stp x29,x30,[sp, #-0x30]!
00bcde3c	stp x22,x21,[sp, #0x10]
00bcde40	stp x20,x19,[sp, #0x20]
00bcde44	mov x29,sp
00bcde48	ldp x9,x10,[x0, #0x48]
00bcde4c	mov w19,w2
00bcde50	mov x20,x0
00bcde54	mov x21,x1
00bcde58	add x8,x9,#0x1
00bcde5c	cmp x8,x10
00bcde60	b.ls 0x00bcdee0
00bcde64	lsl x9,x10,#0x1
00bcde68	mov x10,#0xfffffffffffffff
00bcde6c	ldr x0,[x20, #0x38]
00bcde70	cmp x9,x8
00bcde74	csel x9,x9,x8,hi
00bcde78	cmp x8,x10
00bcde7c	mov x8,#0x1fffffffffffffff
00bcde80	csel x22,x9,x8,cc
00bcde84	lsl x1,x22,#0x3
00bcde88	bl 0x00c30950
00bcde8c	cbnz x0,0x00bcdea4
00bcde90	ldp w8,w9,[x20, #0x20]
00bcde94	orr w8,w8,#0x1
00bcde98	tst w9,w8
00bcde9c	str w8,[x20, #0x20]
00bcdea0	b.ne 0x00bcdf08
00bcdea4	ldr x8,[x20, #0x40]
00bcdea8	lsl x1,x22,#0x2
00bcdeac	str x0,[x20, #0x38]
00bcdeb0	mov x0,x8
00bcdeb4	bl 0x00c30950
00bcdeb8	cbnz x0,0x00bcded0
00bcdebc	ldp w8,w9,[x20, #0x20]
00bcdec0	orr w8,w8,#0x1
00bcdec4	tst w9,w8
00bcdec8	str w8,[x20, #0x20]
00bcdecc	b.ne 0x00bcdf08
00bcded0	ldr x9,[x20, #0x48]
00bcded4	str x0,[x20, #0x40]
00bcded8	str x22,[x20, #0x50]
00bcdedc	add x8,x9,#0x1
00bcdee0	ldr x10,[x20, #0x38]
00bcdee4	str x21,[x10, x9, LSL #0x3]
00bcdee8	ldr x10,[x20, #0x40]
00bcdeec	str w19,[x10, x9, LSL #0x2]
00bcdef0	str x8,[x20, #0x48]
00bcdef4	ldp x20,x19,[sp, #0x20]
00bcdef8	ldp x22,x21,[sp, #0x10]
00bcdefc	ldp x29,x30,[sp], #0x30
00bcdf00	autiasp
00bcdf04	ret
00bcdf08	adrp x0,0x2ac000
00bcdf0c	add x0,x0,#0xd42
00bcdf10	bl 0x00bce038
