; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get_monthname @ 00be90e8
00be90e8	paciasp
00be90ec	sub sp,sp,#0x70
00be90f0	stp x29,x30,[sp, #0x30]
00be90f4	stp x24,x23,[sp, #0x40]
00be90f8	stp x22,x21,[sp, #0x50]
00be90fc	stp x20,x19,[sp, #0x60]
00be9100	add x29,sp,#0x30
00be9104	mov x22,x0
00be9108	add x8,sp,#0x8
00be910c	mov x0,x3
00be9110	mov x19,x5
00be9114	mov x20,x4
00be9118	mov x21,x2
00be911c	str x1,[sp, #0x10]
00be9120	bl 0x00c30070
00be9124	adrp x24,0xcb4000
00be9128	ldr x24,[x24, #0x998]
00be912c	ldr x23,[sp, #0x8]
00be9130	str x24,[sp, #0x18]
00be9134	ldar x8,[x24]
00be9138	cmn x8,#0x1
00be913c	b.eq 0x00be9164
00be9140	add x8,sp,#0x18
00be9144	sub x9,x29,#0x8
00be9148	stp x9,x8,[x29, #-0x10]
00be914c	adrp x0,0xcb4000
00be9150	nop
00be9154	adr x2,0xc0bab0
00be9158	ldr x0,[x0, #0x998]
00be915c	sub x1,x29,#0x10
00be9160	bl 0x00c305d0
00be9164	ldp x8,x10,[x23, #0x10]
00be9168	ldrsw x9,[x24, #0x8]
00be916c	sub x9,x9,#0x1
00be9170	sub x10,x10,x8
00be9174	cmp x9,x10, ASR #0x3
00be9178	b.cs 0x00be921c
00be917c	ldr x23,[x8, x9, LSL #0x3]
00be9180	cbz x23,0x00be921c
00be9184	add x0,sp,#0x8
00be9188	bl 0x00c30090
00be918c	ldr x8,[x22, #0x10]!
00be9190	mov x0,x22
00be9194	ldr x8,[x8, #0x8]
00be9198	blr x8
00be919c	mov x22,x0
00be91a0	add x0,sp,#0x10
00be91a4	mov x1,x21
00be91a8	add x3,x22,#0x240
00be91ac	mov x2,x22
00be91b0	mov x4,x23
00be91b4	mov x5,x20
00be91b8	mov w6,wzr
00be91bc	bl 0x00bda608
00be91c0	sub x8,x0,x22
00be91c4	cmp x8,#0x23f
00be91c8	b.gt 0x00be91fc
00be91cc	asr x8,x8,#0x3
00be91d0	orr x9,xzr,#-0x5555555555555556
00be91d4	movk x9,#0xaaab
00be91d8	mul x8,x8,x9
00be91dc	orr x9,xzr,#-0x5555555555555556
00be91e0	eor x9,x9,#-0x7fffffffffffffff
00be91e4	smulh x9,x8,x9
00be91e8	lsr x10,x9,#0x3f
00be91ec	add w9,w10,w9, LSR #0x1
00be91f0	mov w10,#0xc
00be91f4	msub w8,w9,w10,w8
00be91f8	str w8,[x19, #0x10]
00be91fc	ldr x0,[sp, #0x10]
00be9200	ldp x20,x19,[sp, #0x60]
00be9204	ldp x22,x21,[sp, #0x50]
00be9208	ldp x24,x23,[sp, #0x40]
00be920c	ldp x29,x30,[sp, #0x30]
00be9210	add sp,sp,#0x70
00be9214	autiasp
00be9218	ret
00be921c	bl 0x00bd8968
