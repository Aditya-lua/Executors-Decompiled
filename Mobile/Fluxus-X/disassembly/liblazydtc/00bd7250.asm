; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::write @ 00bd7250
00bd7250	paciasp
00bd7254	sub sp,sp,#0x40
00bd7258	stp x29,x30,[sp, #0x10]
00bd725c	str x21,[sp, #0x20]
00bd7260	stp x20,x19,[sp, #0x30]
00bd7264	add x29,sp,#0x10
00bd7268	mov x20,x2
00bd726c	mov x21,x1
00bd7270	mov x19,x0
00bd7274	mov x0,sp
00bd7278	mov x1,x19
00bd727c	bl 0x00c44040
00bd7280	cbz x20,0x00bd72d0
00bd7284	ldrb w8,[sp]
00bd7288	tbz w8,#0x0,0x00bd72d0
00bd728c	ldr x8,[x19]
00bd7290	ldur x8,[x8, #-0x18]
00bd7294	add x8,x19,x8
00bd7298	ldr x0,[x8, #0x28]
00bd729c	ldr x8,[x0]
00bd72a0	ldr x8,[x8, #0x60]
00bd72a4	mov x1,x21
00bd72a8	mov x2,x20
00bd72ac	blr x8
00bd72b0	cmp x0,x20
00bd72b4	b.eq 0x00bd72d0
00bd72b8	ldr x8,[x19]
00bd72bc	ldur x8,[x8, #-0x18]
00bd72c0	add x0,x19,x8
00bd72c4	ldr w8,[x0, #0x20]
00bd72c8	orr w1,w8,#0x1
00bd72cc	bl 0x00c30130
00bd72d0	mov x0,sp
00bd72d4	bl 0x00c44050
00bd72d8	mov x0,x19
00bd72dc	ldp x20,x19,[sp, #0x30]
00bd72e0	ldr x21,[sp, #0x20]
00bd72e4	ldp x29,x30,[sp, #0x10]
00bd72e8	add sp,sp,#0x40
00bd72ec	autiasp
00bd72f0	ret
