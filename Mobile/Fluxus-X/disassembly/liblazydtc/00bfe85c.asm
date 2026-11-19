; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_length @ 00bfe85c
00bfe85c	paciasp
00bfe860	stp x29,x30,[sp, #-0x60]!
00bfe864	str x27,[sp, #0x10]
00bfe868	stp x26,x25,[sp, #0x20]
00bfe86c	stp x24,x23,[sp, #0x30]
00bfe870	stp x22,x21,[sp, #0x40]
00bfe874	stp x20,x19,[sp, #0x50]
00bfe878	mov x29,sp
00bfe87c	mov w19,wzr
00bfe880	cbz x4,0x00bfe918
00bfe884	mov x21,x3
00bfe888	mov x22,x2
00bfe88c	cmp x2,x3
00bfe890	b.eq 0x00bfe918
00bfe894	mov x20,x4
00bfe898	mov x23,x1
00bfe89c	mov x24,x0
00bfe8a0	mov w19,wzr
00bfe8a4	mov w27,#0x1
00bfe8a8	ldr x0,[x24, #0x10]
00bfe8ac	sub x25,x21,x22
00bfe8b0	bl 0x00c43880
00bfe8b4	mov x26,x0
00bfe8b8	str x0,[x29, #0x18]
00bfe8bc	mov x0,x22
00bfe8c0	mov x1,x25
00bfe8c4	mov x2,x23
00bfe8c8	bl 0x00c439c0
00bfe8cc	mov x25,x0
00bfe8d0	cbz x26,0x00bfe8dc
00bfe8d4	mov x0,x26
00bfe8d8	bl 0x00c43880
00bfe8dc	cbz x25,0x00bfe8f4
00bfe8e0	add x8,x25,#0x2
00bfe8e4	cmp x8,#0x2
00bfe8e8	b.cc 0x00bfe918
00bfe8ec	mov w8,w25
00bfe8f0	b 0x00bfe8fc
00bfe8f4	mov w25,#0x1
00bfe8f8	mov w8,#0x1
00bfe8fc	cmp x27,x20
00bfe900	add w19,w8,w19
00bfe904	b.cs 0x00bfe918
00bfe908	add x22,x22,x25
00bfe90c	add x27,x27,#0x1
00bfe910	cmp x22,x21
00bfe914	b.ne 0x00bfe8a8
00bfe918	mov w0,w19
00bfe91c	ldp x20,x19,[sp, #0x50]
00bfe920	ldr x27,[sp, #0x10]
00bfe924	ldp x22,x21,[sp, #0x40]
00bfe928	ldp x24,x23,[sp, #0x30]
00bfe92c	ldp x26,x25,[sp, #0x20]
00bfe930	ldp x29,x30,[sp], #0x60
00bfe934	autiasp
00bfe938	ret
