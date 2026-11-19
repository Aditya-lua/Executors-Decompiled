; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::seekoff @ 0097eaf0
0097eaf0	stp x22,x21,[sp, #-0x30]!
0097eaf4	stp x20,x19,[sp, #0x10]
0097eaf8	stp x29,x30,[sp, #0x20]
0097eafc	add x29,sp,#0x20
0097eb00	mov x19,x0
0097eb04	ldr x0,[x0, #0x80]
0097eb08	mov w20,w2
0097eb0c	mov x21,x1
0097eb10	cbz x0,0x0097ebb4
0097eb14	ldr x8,[x0]
0097eb18	ldr x8,[x8, #0x30]
0097eb1c	blr x8
0097eb20	ldr x8,[x19, #0x78]
0097eb24	mov w22,w0
0097eb28	cbz x8,0x0097eb80
0097eb2c	cbz x21,0x0097eb38
0097eb30	cmp w22,#0x1
0097eb34	b.lt 0x0097eb7c
0097eb38	ldr x8,[x19]
0097eb3c	mov x0,x19
0097eb40	ldr x8,[x8, #0x30]
0097eb44	blr x8
0097eb48	mov x1,#-0x1
0097eb4c	cbnz w0,0x0097eb98
0097eb50	cmp w20,#0x2
0097eb54	mov x8,xzr
0097eb58	b.hi 0x0097eb84
0097eb5c	ldr x0,[x19, #0x78]
0097eb60	sxtw x8,w22
0097eb64	mul x8,x8,x21
0097eb68	cmp w22,#0x0
0097eb6c	csel x1,x8,xzr,gt
0097eb70	mov w2,w20
0097eb74	bl 0x00c31e70
0097eb78	cbz w0,0x0097eba0
0097eb7c	mov x8,xzr
0097eb80	mov x1,#-0x1
0097eb84	ldp x29,x30,[sp, #0x20]
0097eb88	ldp x20,x19,[sp, #0x10]
0097eb8c	mov x0,x8
0097eb90	ldp x22,x21,[sp], #0x30
0097eb94	ret
0097eb98	mov x8,xzr
0097eb9c	b 0x0097eb84
0097eba0	ldr x0,[x19, #0x78]
0097eba4	bl 0x00c33400
0097eba8	ldr x8,[x19, #0x88]
0097ebac	mov x1,x0
0097ebb0	b 0x0097eb84
0097ebb4	mov w0,#0x8
0097ebb8	bl 0x00c30000
0097ebbc	mov x19,x0
0097ebc0	bl 0x00c333c0
0097ebc4	adrp x1,0xcb4000
0097ebc8	adrp x2,0xcb4000
0097ebcc	ldr x1,[x1, #0xf80]
0097ebd0	ldr x2,[x2, #0xf78]
0097ebd4	mov x0,x19
0097ebd8	bl 0x00c30020
