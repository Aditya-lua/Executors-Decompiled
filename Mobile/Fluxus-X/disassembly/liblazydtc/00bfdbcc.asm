; std::__ndk1::ctype_byname<wchar_t>::do_toupper @ 00bfdbcc
00bfdbcc	paciasp
00bfdbd0	stp x29,x30,[sp, #-0x30]!
00bfdbd4	str x21,[sp, #0x10]
00bfdbd8	stp x20,x19,[sp, #0x20]
00bfdbdc	mov x29,sp
00bfdbe0	mov x19,x1
00bfdbe4	cmp x1,x2
00bfdbe8	b.eq 0x00bfdc0c
00bfdbec	mov x20,x2
00bfdbf0	mov x21,x0
00bfdbf4	ldr w0,[x19]
00bfdbf8	ldr x1,[x21, #0x10]
00bfdbfc	bl 0x00c438a0
00bfdc00	str w0,[x19], #0x4
00bfdc04	cmp x19,x20
00bfdc08	b.ne 0x00bfdbf4
00bfdc0c	mov x0,x19
00bfdc10	ldp x20,x19,[sp, #0x20]
00bfdc14	ldr x21,[sp, #0x10]
00bfdc18	ldp x29,x30,[sp], #0x30
00bfdc1c	autiasp
00bfdc20	ret
