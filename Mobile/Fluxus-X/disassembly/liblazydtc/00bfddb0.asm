; std::__ndk1::ctype_byname<wchar_t>::do_narrow @ 00bfddb0
00bfddb0	paciasp
00bfddb4	stp x29,x30,[sp, #-0x30]!
00bfddb8	str x21,[sp, #0x10]
00bfddbc	stp x20,x19,[sp, #0x20]
00bfddc0	mov x29,sp
00bfddc4	ldr x0,[x0, #0x10]
00bfddc8	mov w19,w2
00bfddcc	mov w21,w1
00bfddd0	bl 0x00c43880
00bfddd4	mov x20,x0
00bfddd8	str x0,[x29, #0x18]
00bfdddc	mov w0,w21
00bfdde0	bl 0x00c43990
00bfdde4	mov w21,w0
00bfdde8	cbz x20,0x00bfddf4
00bfddec	mov x0,x20
00bfddf0	bl 0x00c43880
00bfddf4	cmn w21,#0x1
00bfddf8	csel w0,w19,w21,eq
00bfddfc	ldp x20,x19,[sp, #0x20]
00bfde00	ldr x21,[sp, #0x10]
00bfde04	ldp x29,x30,[sp], #0x30
00bfde08	autiasp
00bfde0c	ret
