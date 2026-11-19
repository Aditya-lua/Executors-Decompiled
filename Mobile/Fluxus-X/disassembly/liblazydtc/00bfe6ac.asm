; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_unshift @ 00bfe6ac
00bfe6ac	paciasp
00bfe6b0	sub sp,sp,#0x40
00bfe6b4	stp x29,x30,[sp, #0x10]
00bfe6b8	stp x22,x21,[sp, #0x20]
00bfe6bc	stp x20,x19,[sp, #0x30]
00bfe6c0	add x29,sp,#0x10
00bfe6c4	ldr x0,[x0, #0x10]
00bfe6c8	mov x19,x4
00bfe6cc	mov x20,x3
00bfe6d0	mov x21,x1
00bfe6d4	str x2,[x4]
00bfe6d8	bl 0x00c43880
00bfe6dc	mov x22,x0
00bfe6e0	str x0,[sp, #0x8]
00bfe6e4	add x0,sp,#0x4
00bfe6e8	mov w1,wzr
00bfe6ec	mov x2,x21
00bfe6f0	bl 0x00c43b80
00bfe6f4	mov x21,x0
00bfe6f8	cbz x22,0x00bfe704
00bfe6fc	mov x0,x22
00bfe700	bl 0x00c43880
00bfe704	add x8,x21,#0x1
00bfe708	cmp x8,#0x2
00bfe70c	b.cs 0x00bfe718
00bfe710	mov w0,#0x2
00bfe714	b 0x00bfe75c
00bfe718	ldr x9,[x19]
00bfe71c	sub x8,x21,#0x1
00bfe720	sub x9,x20,x9
00bfe724	cmp x8,x9
00bfe728	b.ls 0x00bfe734
00bfe72c	mov w0,#0x1
00bfe730	b 0x00bfe75c
00bfe734	cbz x8,0x00bfe758
00bfe738	add x9,sp,#0x4
00bfe73c	ldr x10,[x19]
00bfe740	ldrb w11,[x9], #0x1
00bfe744	subs x8,x8,#0x1
00bfe748	add x12,x10,#0x1
00bfe74c	str x12,[x19]
00bfe750	strb w11,[x10]
00bfe754	b.ne 0x00bfe73c
00bfe758	mov w0,wzr
00bfe75c	ldp x20,x19,[sp, #0x30]
00bfe760	ldp x22,x21,[sp, #0x20]
00bfe764	ldp x29,x30,[sp, #0x10]
00bfe768	add sp,sp,#0x40
00bfe76c	autiasp
00bfe770	ret
