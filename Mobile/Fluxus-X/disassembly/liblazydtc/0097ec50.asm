; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::sync @ 0097ec50
0097ec50	sub sp,sp,#0x50
0097ec54	str x23,[sp, #0x10]
0097ec58	stp x22,x21,[sp, #0x20]
0097ec5c	stp x20,x19,[sp, #0x30]
0097ec60	stp x29,x30,[sp, #0x40]
0097ec64	add x29,sp,#0x40
0097ec68	mrs x23,tpidr_el0
0097ec6c	ldr x8,[x23, #0x28]
0097ec70	mov x19,x0
0097ec74	str x8,[sp, #0x8]
0097ec78	ldr x8,[x0, #0x78]
0097ec7c	cbz x8,0x0097ee08
0097ec80	ldr x0,[x19, #0x80]
0097ec84	cbz x0,0x0097ee3c
0097ec88	ldr w8,[x19, #0x9c]
0097ec8c	tbnz w8,#0x4,0x0097ecb4
0097ec90	tbz w8,#0x3,0x0097ee08
0097ec94	ldr x8,[x19, #0x90]
0097ec98	str x8,[sp]
0097ec9c	ldrb w8,[x19, #0xa2]
0097eca0	cbz w8,0x0097ed50
0097eca4	ldp x8,x9,[x19, #0x18]
0097eca8	mov w21,wzr
0097ecac	sub x20,x9,x8
0097ecb0	b 0x0097edcc
0097ecb4	ldp x8,x9,[x19, #0x28]
0097ecb8	cmp x9,x8
0097ecbc	b.eq 0x0097ece0
0097ecc0	ldr x8,[x19]
0097ecc4	mov w1,#0xffffffff
0097ecc8	mov x0,x19
0097eccc	mov w20,#0xffffffff
0097ecd0	ldr x8,[x8, #0x68]
0097ecd4	blr x8
0097ecd8	cmn w0,#0x1
0097ecdc	b.eq 0x0097ee0c
0097ece0	add x20,x19,#0x88
0097ece4	ldr x0,[x19, #0x80]
0097ece8	ldr x2,[x19, #0x40]
0097ecec	ldr x9,[x19, #0x60]
0097ecf0	mov x4,sp
0097ecf4	ldr x8,[x0]
0097ecf8	mov x1,x20
0097ecfc	add x3,x2,x9
0097ed00	ldr x8,[x8, #0x28]
0097ed04	blr x8
0097ed08	mov w21,w0
0097ed0c	ldr x8,[sp]
0097ed10	ldr x0,[x19, #0x40]
0097ed14	ldr x3,[x19, #0x78]
0097ed18	mov w1,#0x1
0097ed1c	sub x22,x8,x0
0097ed20	mov x2,x22
0097ed24	bl 0x00c308f0
0097ed28	cmp x0,x22
0097ed2c	b.ne 0x0097ede0
0097ed30	cmp w21,#0x1
0097ed34	b.eq 0x0097ece4
0097ed38	cmp w21,#0x2
0097ed3c	b.eq 0x0097ede0
0097ed40	ldr x0,[x19, #0x78]
0097ed44	bl 0x00c30c50
0097ed48	cbnz w0,0x0097ede0
0097ed4c	b 0x0097ee08
0097ed50	ldr x8,[x0]
0097ed54	ldr x8,[x8, #0x30]
0097ed58	blr x8
0097ed5c	ldp x3,x8,[x19, #0x48]
0097ed60	cmp w0,#0x1
0097ed64	sub x20,x8,x3
0097ed68	b.lt 0x0097ed84
0097ed6c	ldp x8,x9,[x19, #0x18]
0097ed70	sxtw x10,w0
0097ed74	mov w21,wzr
0097ed78	sub x8,x9,x8
0097ed7c	madd x20,x8,x10,x20
0097ed80	b 0x0097edcc
0097ed84	ldp x8,x9,[x19, #0x18]
0097ed88	cmp x8,x9
0097ed8c	b.eq 0x0097edc8
0097ed90	ldr x0,[x19, #0x80]
0097ed94	ldr x10,[x19, #0x10]
0097ed98	ldr x2,[x19, #0x40]
0097ed9c	mov x1,sp
0097eda0	ldr x9,[x0]
0097eda4	sub x4,x8,x10
0097eda8	ldr x9,[x9, #0x40]
0097edac	blr x9
0097edb0	ldp x9,x8,[x19, #0x40]
0097edb4	mov w21,#0x1
0097edb8	add x8,x8,x20
0097edbc	sub x8,x8,w0, SXTW 
0097edc0	sub x20,x8,x9
0097edc4	b 0x0097edcc
0097edc8	mov w21,wzr
0097edcc	ldr x0,[x19, #0x78]
0097edd0	neg x1,x20
0097edd4	mov w2,#0x1
0097edd8	bl 0x00c31e70
0097eddc	cbz w0,0x0097ede8
0097ede0	mov w20,#0xffffffff
0097ede4	b 0x0097ee0c
0097ede8	cbz w21,0x0097edf4
0097edec	ldr x8,[sp]
0097edf0	str x8,[x19, #0x88]
0097edf4	ldr x8,[x19, #0x40]
0097edf8	str wzr,[x19, #0x9c]
0097edfc	stp xzr,xzr,[x19, #0x18]
0097ee00	str xzr,[x19, #0x10]
0097ee04	stp x8,x8,[x19, #0x48]
0097ee08	mov w20,wzr
0097ee0c	ldr x8,[x23, #0x28]
0097ee10	ldr x9,[sp, #0x8]
0097ee14	cmp x8,x9
0097ee18	b.ne 0x0097ee38
0097ee1c	mov w0,w20
0097ee20	ldp x29,x30,[sp, #0x40]
0097ee24	ldp x20,x19,[sp, #0x30]
0097ee28	ldp x22,x21,[sp, #0x20]
0097ee2c	ldr x23,[sp, #0x10]
0097ee30	add sp,sp,#0x50
0097ee34	ret
0097ee38	bl 0x00c2fec0
0097ee3c	mov w0,#0x8
0097ee40	bl 0x00c30000
0097ee44	mov x19,x0
0097ee48	bl 0x00c333c0
0097ee4c	adrp x1,0xcb4000
0097ee50	adrp x2,0xcb4000
0097ee54	ldr x1,[x1, #0xf80]
0097ee58	ldr x2,[x2, #0xf78]
0097ee5c	mov x0,x19
0097ee60	bl 0x00c30020
