; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::swap @ 00bceab8
00bceab8	paciasp
00bceabc	sub sp,sp,#0x30
00bceac0	stp x29,x30,[sp, #0x10]
00bceac4	stp x20,x19,[sp, #0x20]
00bceac8	add x29,sp,#0x10
00bceacc	mov x20,x0
00bcead0	mov x19,x1
00bcead4	add x0,sp,#0x8
00bcead8	add x1,x20,#0x8
00bceadc	bl 0x00c30660
00bceae0	add x0,x20,#0x8
00bceae4	add x1,x19,#0x8
00bceae8	bl 0x00c43f00
00bceaec	add x0,x19,#0x8
00bceaf0	add x1,sp,#0x8
00bceaf4	bl 0x00c43f00
00bceaf8	add x0,sp,#0x8
00bceafc	bl 0x00c30090
00bceb00	ldr x8,[x19, #0x10]
00bceb04	ldr x9,[x20, #0x10]
00bceb08	str x8,[x20, #0x10]
00bceb0c	str x9,[x19, #0x10]
00bceb10	ldr x8,[x19, #0x18]
00bceb14	ldr x9,[x20, #0x18]
00bceb18	str x8,[x20, #0x18]
00bceb1c	str x9,[x19, #0x18]
00bceb20	ldr x8,[x19, #0x20]
00bceb24	ldr x9,[x20, #0x20]
00bceb28	str x8,[x20, #0x20]
00bceb2c	str x9,[x19, #0x20]
00bceb30	ldr x8,[x19, #0x28]
00bceb34	ldr x9,[x20, #0x28]
00bceb38	str x8,[x20, #0x28]
00bceb3c	str x9,[x19, #0x28]
00bceb40	ldr x8,[x19, #0x30]
00bceb44	ldr x9,[x20, #0x30]
00bceb48	str x8,[x20, #0x30]
00bceb4c	str x9,[x19, #0x30]
00bceb50	ldr x8,[x19, #0x38]
00bceb54	ldr x9,[x20, #0x38]
00bceb58	str x8,[x20, #0x38]
00bceb5c	str x9,[x19, #0x38]
00bceb60	ldp x20,x19,[sp, #0x20]
00bceb64	ldp x29,x30,[sp, #0x10]
00bceb68	add sp,sp,#0x30
00bceb6c	autiasp
00bceb70	ret
