; std::__ndk1::system_error::system_error @ 00bcb9f8
00bcb9f8	paciasp
00bcb9fc	sub sp,sp,#0x50
00bcba00	stp x29,x30,[sp, #0x20]
00bcba04	str x21,[sp, #0x30]
00bcba08	stp x20,x19,[sp, #0x40]
00bcba0c	add x29,sp,#0x20
00bcba10	mov x19,x2
00bcba14	mov w21,w1
00bcba18	mov x20,x0
00bcba1c	cbz w1,0x00bcba3c
00bcba20	ldr x8,[x19]
00bcba24	mov x0,x19
00bcba28	mov w1,w21
00bcba2c	ldr x9,[x8, #0x30]
00bcba30	add x8,sp,#0x8
00bcba34	blr x9
00bcba38	b 0x00bcba44
00bcba3c	stp xzr,xzr,[sp, #0x8]
00bcba40	str xzr,[sp, #0x18]
00bcba44	add x1,sp,#0x8
00bcba48	mov x0,x20
00bcba4c	bl 0x00c43cf0
00bcba50	ldrb w8,[sp, #0x8]
00bcba54	tbz w8,#0x0,0x00bcba68
00bcba58	ldr x8,[sp, #0x8]
00bcba5c	ldr x0,[sp, #0x18]
00bcba60	and x1,x8,#-0x2
00bcba64	bl 0x00c2fe80
00bcba68	adrp x8,0xcb5000
00bcba6c	ldr x8,[x8, #0xb18]
00bcba70	str w21,[x20, #0x10]
00bcba74	add x8,x8,#0x10
00bcba78	str x8,[x20]
00bcba7c	str x19,[x20, #0x18]
00bcba80	ldp x20,x19,[sp, #0x40]
00bcba84	ldr x21,[sp, #0x30]
00bcba88	ldp x29,x30,[sp, #0x20]
00bcba8c	add sp,sp,#0x50
00bcba90	autiasp
00bcba94	ret
