; std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::seekp @ 00bd21bc
00bd21bc	paciasp
00bd21c0	sub sp,sp,#0x40
00bd21c4	stp x29,x30,[sp, #0x10]
00bd21c8	str x21,[sp, #0x20]
00bd21cc	stp x20,x19,[sp, #0x30]
00bd21d0	add x29,sp,#0x10
00bd21d4	mov x19,x0
00bd21d8	mov x21,x1
00bd21dc	mov x0,sp
00bd21e0	mov x1,x19
00bd21e4	mov w20,w2
00bd21e8	bl 0x00c43fa0
00bd21ec	ldr x8,[x19]
00bd21f0	mov w10,#0x5
00bd21f4	ldur x8,[x8, #-0x18]
00bd21f8	add x8,x19,x8
00bd21fc	ldrb w9,[x8, #0x20]
00bd2200	tst w9,w10
00bd2204	b.ne 0x00bd2244
00bd2208	ldr x0,[x8, #0x28]
00bd220c	ldr x8,[x0]
00bd2210	ldr x8,[x8, #0x20]
00bd2214	mov x1,x21
00bd2218	mov w2,w20
00bd221c	mov w3,#0x10
00bd2220	blr x8
00bd2224	cmn x1,#0x1
00bd2228	b.ne 0x00bd2244
00bd222c	ldr x8,[x19]
00bd2230	ldur x8,[x8, #-0x18]
00bd2234	add x0,x19,x8
00bd2238	ldr w8,[x0, #0x20]
00bd223c	orr w1,w8,#0x4
00bd2240	bl 0x00c30130
00bd2244	mov x0,sp
00bd2248	bl 0x00c43fb0
00bd224c	mov x0,x19
00bd2250	ldp x20,x19,[sp, #0x30]
00bd2254	ldr x21,[sp, #0x20]
00bd2258	ldp x29,x30,[sp, #0x10]
00bd225c	add sp,sp,#0x40
00bd2260	autiasp
00bd2264	ret
