; std::__ndk1::locale::operator== @ 00bfb780
00bfb780	bti c
00bfb784	ldr x9,[x0]
00bfb788	ldr x8,[x1]
00bfb78c	cmp x9,x8
00bfb790	b.eq 0x00bfb834
00bfb794	ldrb w10,[x9, #0x120]
00bfb798	ldr x11,[x9, #0x128]
00bfb79c	ubfx w12,w10,#0x1,#0x7
00bfb7a0	tst w10,#0x1
00bfb7a4	csel x2,x12,x11,eq
00bfb7a8	cmp x2,#0x1
00bfb7ac	b.ne 0x00bfb7cc
00bfb7b0	ldr x11,[x9, #0x130]
00bfb7b4	add x12,x9,#0x121
00bfb7b8	tst w10,#0x1
00bfb7bc	csel x11,x12,x11,eq
00bfb7c0	ldrb w11,[x11]
00bfb7c4	cmp w11,#0x2a
00bfb7c8	b.eq 0x00bfb82c
00bfb7cc	ldrb w11,[x8, #0x120]
00bfb7d0	ldr x12,[x8, #0x128]
00bfb7d4	lsr x13,x11,#0x1
00bfb7d8	tst w11,#0x1
00bfb7dc	csel x12,x13,x12,eq
00bfb7e0	cmp x2,x12
00bfb7e4	b.ne 0x00bfb82c
00bfb7e8	paciasp
00bfb7ec	stp x29,x30,[sp, #-0x10]!
00bfb7f0	mov x29,sp
00bfb7f4	ldr x12,[x9, #0x130]
00bfb7f8	add x9,x9,#0x121
00bfb7fc	tst w10,#0x1
00bfb800	ldr x10,[x8, #0x130]
00bfb804	add x8,x8,#0x121
00bfb808	csel x0,x9,x12,eq
00bfb80c	tst w11,#0x1
00bfb810	csel x1,x8,x10,eq
00bfb814	bl 0x00c300b0
00bfb818	cmp w0,#0x0
00bfb81c	cset w0,eq
00bfb820	ldp x29,x30,[sp], #0x10
00bfb824	autiasp
00bfb828	ret
00bfb82c	mov w0,wzr
00bfb830	ret
00bfb834	mov w0,#0x1
00bfb838	ret
