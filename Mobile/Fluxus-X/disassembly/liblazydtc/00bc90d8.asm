; std::__ndk1::to_string @ 00bc90d8
00bc90d8	paciasp
00bc90dc	sub sp,sp,#0x40
00bc90e0	stp x29,x30,[sp, #0x10]
00bc90e4	stp x22,x21,[sp, #0x20]
00bc90e8	stp x20,x19,[sp, #0x30]
00bc90ec	add x29,sp,#0x10
00bc90f0	mov w1,w0
00bc90f4	add x0,sp,#0x5
00bc90f8	mov x19,x8
00bc90fc	add x20,sp,#0x5
00bc9100	bl 0x00bcac54
00bc9104	sub x20,x0,x20
00bc9108	cmn x20,#0x8
00bc910c	b.cs 0x00bc9188
00bc9110	mov x21,x0
00bc9114	cmp x20,#0x16
00bc9118	b.hi 0x00bc9128
00bc911c	lsl w8,w20,#0x1
00bc9120	strb w8,[x19], #0x1
00bc9124	b 0x00bc9150
00bc9128	orr x8,x20,#0x7
00bc912c	mov w9,#0x1a
00bc9130	cmp x8,#0x17
00bc9134	csinc x22,x9,x8,eq
00bc9138	mov x0,x22
00bc913c	bl 0x00c2fed0
00bc9140	orr x8,x22,#0x1
00bc9144	stp x20,x0,[x19, #0x8]
00bc9148	str x8,[x19]
00bc914c	mov x19,x0
00bc9150	add x8,sp,#0x5
00bc9154	cmp x21,x8
00bc9158	b.eq 0x00bc916c
00bc915c	add x1,sp,#0x5
00bc9160	mov x0,x19
00bc9164	mov x2,x20
00bc9168	bl 0x00c2ffd0
00bc916c	strb wzr,[x19, x20]
00bc9170	ldp x20,x19,[sp, #0x30]
00bc9174	ldp x22,x21,[sp, #0x20]
00bc9178	ldp x29,x30,[sp, #0x10]
00bc917c	add sp,sp,#0x40
00bc9180	autiasp
00bc9184	ret
00bc9188	bl 0x007fe124
