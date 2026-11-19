; std::__ndk1::ctype_byname<wchar_t>::do_narrow @ 00bfde28
00bfde28	paciasp
00bfde2c	stp x29,x30,[sp, #-0x50]!
00bfde30	str x25,[sp, #0x10]
00bfde34	stp x24,x23,[sp, #0x20]
00bfde38	stp x22,x21,[sp, #0x30]
00bfde3c	stp x20,x19,[sp, #0x40]
00bfde40	mov x29,sp
00bfde44	mov x19,x1
00bfde48	cmp x1,x2
00bfde4c	b.eq 0x00bfdeac
00bfde50	mov x20,x4
00bfde54	mov w21,w3
00bfde58	mov x22,x2
00bfde5c	mov x23,x0
00bfde60	b 0x00bfde7c
00bfde64	cmn w24,#0x1
00bfde68	add x19,x19,#0x4
00bfde6c	csel w8,w21,w24,eq
00bfde70	cmp x19,x22
00bfde74	strb w8,[x20], #0x1
00bfde78	b.eq 0x00bfdeac
00bfde7c	ldr x0,[x23, #0x10]
00bfde80	ldr w24,[x19]
00bfde84	bl 0x00c43880
00bfde88	mov x25,x0
00bfde8c	str x0,[x29, #0x18]
00bfde90	mov w0,w24
00bfde94	bl 0x00c43990
00bfde98	mov w24,w0
00bfde9c	cbz x25,0x00bfde64
00bfdea0	mov x0,x25
00bfdea4	bl 0x00c43880
00bfdea8	b 0x00bfde64
00bfdeac	mov x0,x19
00bfdeb0	ldp x20,x19,[sp, #0x40]
00bfdeb4	ldr x25,[sp, #0x10]
00bfdeb8	ldp x22,x21,[sp, #0x30]
00bfdebc	ldp x24,x23,[sp, #0x20]
00bfdec0	ldp x29,x30,[sp], #0x50
00bfdec4	autiasp
00bfdec8	ret
