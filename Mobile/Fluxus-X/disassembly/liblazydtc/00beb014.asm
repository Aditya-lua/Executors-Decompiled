; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::do_get_year @ 00beb014
00beb014	paciasp
00beb018	sub sp,sp,#0x60
00beb01c	stp x29,x30,[sp, #0x20]
00beb020	str x23,[sp, #0x30]
00beb024	stp x22,x21,[sp, #0x40]
00beb028	stp x20,x19,[sp, #0x50]
00beb02c	add x29,sp,#0x20
00beb030	mov x0,x3
00beb034	mov x8,sp
00beb038	mov x19,x5
00beb03c	mov x20,x4
00beb040	mov x21,x2
00beb044	str x1,[sp, #0x8]
00beb048	bl 0x00c30070
00beb04c	adrp x23,0xcb5000
00beb050	ldr x23,[x23, #0xb98]
00beb054	ldr x22,[sp]
00beb058	str x23,[sp, #0x10]
00beb05c	ldar x8,[x23]
00beb060	cmn x8,#0x1
00beb064	b.eq 0x00beb090
00beb068	add x8,sp,#0x10
00beb06c	add x9,x29,#0x18
00beb070	str x8,[x29, #0x18]
00beb074	stur x9,[x29, #-0x8]
00beb078	adrp x0,0xcb5000
00beb07c	nop
00beb080	adr x2,0xc0bab0
00beb084	ldr x0,[x0, #0xb98]
00beb088	sub x1,x29,#0x8
00beb08c	bl 0x00c305d0
00beb090	ldp x8,x10,[x22, #0x10]
00beb094	ldrsw x9,[x23, #0x8]
00beb098	sub x9,x9,#0x1
00beb09c	sub x10,x10,x8
00beb0a0	cmp x9,x10, ASR #0x3
00beb0a4	b.cs 0x00beb118
00beb0a8	ldr x22,[x8, x9, LSL #0x3]
00beb0ac	cbz x22,0x00beb118
00beb0b0	mov x0,sp
00beb0b4	bl 0x00c30090
00beb0b8	add x0,sp,#0x8
00beb0bc	mov x1,x21
00beb0c0	mov x2,x20
00beb0c4	mov x3,x22
00beb0c8	mov w4,#0x4
00beb0cc	bl 0x00bec028
00beb0d0	ldrb w8,[x20]
00beb0d4	tbnz w8,#0x2,0x00beb0f8
00beb0d8	add w8,w0,#0x76c
00beb0dc	cmp w0,#0x64
00beb0e0	add w9,w0,#0x7d0
00beb0e4	csel w8,w8,w0,cc
00beb0e8	cmp w0,#0x45
00beb0ec	csel w8,w9,w8,lt
00beb0f0	sub w8,w8,#0x76c
00beb0f4	str w8,[x19, #0x14]
00beb0f8	ldr x0,[sp, #0x8]
00beb0fc	ldp x20,x19,[sp, #0x50]
00beb100	ldr x23,[sp, #0x30]
00beb104	ldp x22,x21,[sp, #0x40]
00beb108	ldp x29,x30,[sp, #0x20]
00beb10c	add sp,sp,#0x60
00beb110	autiasp
00beb114	ret
00beb118	bl 0x00bd8968
