; std::__ndk1::system_error::system_error @ 00bcb86c
00bcb86c	paciasp
00bcb870	sub sp,sp,#0x90
00bcb874	stp x29,x30,[sp, #0x40]
00bcb878	str x25,[sp, #0x50]
00bcb87c	stp x24,x23,[sp, #0x60]
00bcb880	stp x22,x21,[sp, #0x70]
00bcb884	stp x20,x19,[sp, #0x80]
00bcb888	add x29,sp,#0x40
00bcb88c	mov x20,x0
00bcb890	mov x0,x3
00bcb894	mov x22,x3
00bcb898	mov x19,x2
00bcb89c	mov w21,w1
00bcb8a0	str w1,[sp, #0x18]
00bcb8a4	str x2,[sp, #0x20]
00bcb8a8	bl 0x00c2ff50
00bcb8ac	cmn x0,#0x8
00bcb8b0	b.cs 0x00bcb998
00bcb8b4	mov x23,x0
00bcb8b8	cmp x0,#0x17
00bcb8bc	b.cs 0x00bcb8d8
00bcb8c0	lsl w8,w23,#0x1
00bcb8c4	mov x9,sp
00bcb8c8	orr x24,x9,#0x1
00bcb8cc	strb w8,[sp]
00bcb8d0	cbnz x23,0x00bcb900
00bcb8d4	b 0x00bcb910
00bcb8d8	orr x8,x23,#0x7
00bcb8dc	mov w9,#0x1a
00bcb8e0	cmp x8,#0x17
00bcb8e4	csinc x25,x9,x8,eq
00bcb8e8	mov x0,x25
00bcb8ec	bl 0x00c2fed0
00bcb8f0	orr x8,x25,#0x1
00bcb8f4	mov x24,x0
00bcb8f8	stp x23,x0,[sp, #0x8]
00bcb8fc	str x8,[sp]
00bcb900	mov x0,x24
00bcb904	mov x1,x22
00bcb908	mov x2,x23
00bcb90c	bl 0x00c2ffd0
00bcb910	strb wzr,[x24, x23]
00bcb914	sub x8,x29,#0x18
00bcb918	add x0,sp,#0x18
00bcb91c	mov x1,sp
00bcb920	bl 0x00bcb424
00bcb924	sub x1,x29,#0x18
00bcb928	mov x0,x20
00bcb92c	bl 0x00c43cf0
00bcb930	ldurb w8,[x29, #-0x18]
00bcb934	tbz w8,#0x0,0x00bcb948
00bcb938	ldur x8,[x29, #-0x18]
00bcb93c	ldur x0,[x29, #-0x8]
00bcb940	and x1,x8,#-0x2
00bcb944	bl 0x00c2fe80
00bcb948	ldrb w8,[sp]
00bcb94c	tbz w8,#0x0,0x00bcb960
00bcb950	ldr x8,[sp]
00bcb954	ldr x0,[sp, #0x10]
00bcb958	and x1,x8,#-0x2
00bcb95c	bl 0x00c2fe80
00bcb960	adrp x8,0xcb5000
00bcb964	ldr x8,[x8, #0xb18]
00bcb968	str w21,[x20, #0x10]
00bcb96c	add x8,x8,#0x10
00bcb970	str x8,[x20]
00bcb974	str x19,[x20, #0x18]
00bcb978	ldp x20,x19,[sp, #0x80]
00bcb97c	ldr x25,[sp, #0x50]
00bcb980	ldp x22,x21,[sp, #0x70]
00bcb984	ldp x24,x23,[sp, #0x60]
00bcb988	ldp x29,x30,[sp, #0x40]
00bcb98c	add sp,sp,#0x90
00bcb990	autiasp
00bcb994	ret
00bcb998	bl 0x007fe124
